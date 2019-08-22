package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class form_translation extends SubLTranslatedFile {
    public static final SubLFile me = new form_translation();

    public static final String myName = "com.cyc.cycjava.cycl.form_translation";

    public static final String myFingerPrint = "829fbca44c1183cb0d4eaea0e5f78ca054c996b847b972ddac89821644063b53";

    // defparameter
    private static final SubLSymbol $translator_within_binding_constructP$ = makeSymbol("*TRANSLATOR-WITHIN-BINDING-CONSTRUCT?*");

    // defvar
    /**
     * When non-nil, the expansion factor of forms is analyzed during translation.
     * When a vector, it must be a vector of length 4 where stats are accumulated.
     * Otherwise, we simply warn when we encounter methods with unusually large
     * expansions.
     */
    private static final SubLSymbol $consider_translator_expansion_factor$ = makeSymbol("*CONSIDER-TRANSLATOR-EXPANSION-FACTOR*");

    // deflexical
    private static final SubLSymbol $operator_translators$ = makeSymbol("*OPERATOR-TRANSLATORS*");

    // defparameter
    // When non-NIL the current DEFINE / DEFMACRO etc method being translated.
    private static final SubLSymbol $translator_current_method$ = makeSymbol("*TRANSLATOR-CURRENT-METHOD*");

    // deflexical
    // A table mapping implementation symbols to the SubL symbols to use.
    private static final SubLSymbol $translator_implementation_symbols$ = makeSymbol("*TRANSLATOR-IMPLEMENTATION-SYMBOLS*");



    public static final SubLString $str1$unexpected_form____S = makeString("unexpected form : ~S");







    public static final SubLSymbol $sym5$_DYN = makeSymbol("%DYN");



    public static final SubLSymbol $sym7$_LEX = makeSymbol("%LEX");



    public static final SubLString $str9$Unexpected_binding_type__S_for_va = makeString("Unexpected binding type ~S for variable ~S");

    public static final SubLString $str10$time_to_implement__S = makeString("time to implement ~S");

    public static final SubLList $list11 = list(makeSymbol("MACRO"), makeSymbol("&REST"), makeSymbol("ARGS"));

    public static final SubLList $list12 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    public static final SubLSymbol VACCESS = makeSymbol("VACCESS");







    public static final SubLList $list17 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("PROVIDED?"));

    public static final SubLList $list18 = list(makeSymbol("PROGN"));

    public static final SubLList $list19 = list(makeKeyword("DYNAMIC"), makeKeyword("LEXICAL"), makeKeyword("CONSTANT"));





    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLString $str23$Method__S_undergoes_a__Sx_expansi = makeString("Method ~S undergoes a ~Sx expansion when translated");

    public static final SubLSymbol $sym24$_ = makeSymbol(">");



    public static final SubLString $str26$__Total_forms______________S = makeString("~%Total forms :           ~S");

    public static final SubLString $str27$__Mean_form_size___________S = makeString("~%Mean form size :        ~S");

    public static final SubLString $str28$__Mean_expansion_factor____Sx = makeString("~%Mean expansion factor : ~Sx");

    public static final SubLString $str29$__Largest_expansions__ = makeString("~%Largest expansions :");

    public static final SubLList $list30 = list(makeSymbol("METHOD"), makeSymbol("EXPANSION-FACTOR"));

    public static final SubLString $str31$___4___Dx___S = makeString("~%~4,' Dx  ~S");

    public static final SubLList $list32 = list(new SubLObject[]{ cons(makeSymbol("CAND"), makeSymbol("TRANSLATE-CAND")), cons(makeSymbol("CCATCH"), makeSymbol("TRANSLATE-CCATCH")), cons(makeSymbol("CDEC"), makeSymbol("TRANSLATE-CDEC")), cons(makeSymbol("CDO"), makeSymbol("TRANSLATE-CDO")), cons(makeSymbol("CDO-ALL-SYMBOLS"), makeSymbol("TRANSLATE-CDO-ALL-SYMBOLS")), cons(makeSymbol("CDO-EXTERNAL-SYMBOLS"), makeSymbol("TRANSLATE-CDO-EXTERNAL-SYMBOLS")), cons(makeSymbol("%CDO-SYMBOLS"), makeSymbol("TRANSLATE-%CDO-SYMBOLS")), cons(makeSymbol("CDO-SYMBOLS"), makeSymbol("TRANSLATE-CDO-SYMBOLS")), cons(makeSymbol("%CDOHASH"), makeSymbol("TRANSLATE-%CDOHASH")), cons(makeSymbol("CDOHASH"), makeSymbol("TRANSLATE-CDOHASH")), cons(makeSymbol("CDOLIST"), makeSymbol("TRANSLATE-CDOLIST")), cons(makeSymbol("CDOTIMES"), makeSymbol("TRANSLATE-CDOTIMES")), cons(makeSymbol("CHECK-TYPE"), makeSymbol("TRANSLATE-CHECK-TYPE")), cons(makeSymbol("CINC"), makeSymbol("TRANSLATE-CINC")), cons(makeSymbol("CLET"), makeSymbol("TRANSLATE-CLET")), cons(makeSymbol("CMULTIPLE-VALUE-BIND"), makeSymbol("TRANSLATE-CMULTIPLE-VALUE-BIND")), cons(makeSymbol("CNOT"), makeSymbol("TRANSLATE-CNOT")), cons(makeSymbol("COR"), makeSymbol("TRANSLATE-COR")), cons(makeSymbol("CPOP"), makeSymbol("TRANSLATE-CPOP")), cons(makeSymbol("CPROGV"), makeSymbol("TRANSLATE-CPROGV")), cons(makeSymbol("CPUSH"), makeSymbol("TRANSLATE-CPUSH")), cons(makeSymbol("CPUSHNEW"), makeSymbol("TRANSLATE-CPUSHNEW")), cons(makeSymbol("CSETF"), makeSymbol("TRANSLATE-CSETF")), cons(makeSymbol("CSETQ"), makeSymbol("TRANSLATE-CSETQ")), cons(makeSymbol("CSOME"), makeSymbol("TRANSLATE-CSOME")), cons(makeSymbol("CTIME"), makeSymbol("TRANSLATE-CTIME")), cons(makeSymbol("CUNWIND-PROTECT"), makeSymbol("TRANSLATE-CUNWIND-PROTECT")), cons(makeSymbol("CVS-ID"), makeSymbol("TRANSLATE-CVS-ID")), cons(makeSymbol("DECLAIM"), makeSymbol("TRANSLATE-DECLAIM")), cons(makeSymbol("DECLARE"), makeSymbol("TRANSLATE-DECLARE")), cons(makeSymbol("DEFCONSTANT"), makeSymbol("TRANSLATE-DEFCONSTANT")), cons(makeSymbol("DEFINE"), makeSymbol("TRANSLATE-DEFINE")), cons(makeSymbol("DEFLEXICAL"), makeSymbol("TRANSLATE-DEFLEXICAL")), cons(makeSymbol("DEFMACRO"), makeSymbol("TRANSLATE-DEFMACRO")), cons(makeSymbol("DEFPARAMETER"), makeSymbol("TRANSLATE-DEFPARAMETER")), cons(makeSymbol("DEFSTRUCT"), makeSymbol("TRANSLATE-DEFSTRUCT")), cons(makeSymbol("DEFVAR"), makeSymbol("TRANSLATE-DEFVAR")), cons(makeSymbol("%DTB"), makeSymbol("TRANSLATE-%DTB")), cons(makeSymbol("ENFORCE-TYPE"), makeSymbol("TRANSLATE-ENFORCE-TYPE")), cons(makeSymbol("ENFORCE-MUST"), makeSymbol("TRANSLATE-ENFORCE-MUST")), cons(makeSymbol("FIF"), makeSymbol("TRANSLATE-FIF")), cons(makeSymbol("FUNCTION"), makeSymbol("TRANSLATE-FUNCTION")), cons(makeSymbol("FUNLESS"), makeSymbol("TRANSLATE-FUNLESS")), cons(makeSymbol("FWHEN"), makeSymbol("TRANSLATE-FWHEN")), cons(makeSymbol("IGNORE"), makeSymbol("TRANSLATE-IGNORE")), cons(makeSymbol("MULTIPLE-VALUE-LIST"), makeSymbol("TRANSLATE-MULTIPLE-VALUE-LIST")), cons(makeSymbol("MUST"), makeSymbol("TRANSLATE-MUST")), cons(makeSymbol("NTH-VALUE"), makeSymbol("TRANSLATE-NTH-VALUE")), cons(makeSymbol("PCASE"), makeSymbol("TRANSLATE-PCASE")), cons(makeSymbol("PCOND"), makeSymbol("TRANSLATE-PCOND")), cons(makeSymbol("PIF"), makeSymbol("TRANSLATE-PIF")), cons(makeSymbol("PROCLAIM"), makeSymbol("TRANSLATE-PROCLAIM")), cons(makeSymbol("PROGN"), makeSymbol("TRANSLATE-PROGN")), cons(makeSymbol("PUNLESS"), makeSymbol("TRANSLATE-PUNLESS")), cons(makeSymbol("PWHEN"), makeSymbol("TRANSLATE-PWHEN")), cons(makeSymbol("QUOTE"), makeSymbol("TRANSLATE-QUOTE")), cons(makeSymbol("RET"), makeSymbol("TRANSLATE-RET")), cons(makeSymbol("WITH-ERROR-HANDLER"), makeSymbol("TRANSLATE-WITH-ERROR-HANDLER")), cons(makeSymbol("WITH-PROCESS-RESOURCE-TRACKING"), makeSymbol("TRANSLATE-WITH-PROCESS-RESOURCE-TRACKING")), cons(makeSymbol("WITH-STATIC-AREA"), makeSymbol("TRANSLATE-WITH-STATIC-AREA")), cons(makeSymbol("WITH-THREAD-PRIVATE-AREA"), makeSymbol("TRANSLATE-WITH-THREAD-PRIVATE-AREA")), cons(makeSymbol("WITH-WORKING-AREA"), makeSymbol("TRANSLATE-WITH-WORKING-AREA")), cons(makeSymbol("VOLATILE"), makeSymbol("TRANSLATE-VOLATILE")), cons(makeSymbol("CLET-BIND"), makeSymbol("TRANSLATE-CLET-BIND")), cons(makeSymbol("CLET-LOCAL"), makeSymbol("TRANSLATE-CLET-LOCAL")), cons(makeSymbol("CODE-COMMENT"), makeSymbol("TRANSLATE-CODE-COMMENT")), cons(makeSymbol("CSETQ-DYNAMIC"), makeSymbol("TRANSLATE-CSETQ-DYNAMIC")), cons(makeSymbol("CSETQ-LEXICAL"), makeSymbol("TRANSLATE-CSETQ-LEXICAL")), cons(makeSymbol("CSETQ-LOCAL"), makeSymbol("TRANSLATE-CSETQ-LOCAL")), cons(makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), makeSymbol("TRANSLATE-DEFSTRUCT-CONSTRUCT")), cons(makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), makeSymbol("TRANSLATE-DEFSTRUCT-GET-SLOT")), cons(makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), makeSymbol("TRANSLATE-DEFSTRUCT-OBJECT-P")), cons(makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), makeSymbol("TRANSLATE-DEFSTRUCT-SET-SLOT")), cons(makeSymbol("%FOR"), makeSymbol("TRANSLATE-%FOR")), cons(makeSymbol("FOR"), makeSymbol("TRANSLATE-FOR")), cons(makeSymbol("IN-PACKAGE"), makeSymbol("TRANSLATE-IN-PACKAGE")), cons(makeSymbol("%MVAL"), makeSymbol("TRANSLATE-%MVAL")), cons(makeSymbol("%RESET-MVAL"), makeSymbol("TRANSLATE-%RESET-MVAL")), cons(makeSymbol("UNTIL"), makeSymbol("TRANSLATE-UNTIL")), cons(makeSymbol("WHILE"), makeSymbol("TRANSLATE-WHILE")) });

    public static final SubLList $list33 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("EXPRESSIONS"));



    public static final SubLSymbol $sym35$_DTB = makeSymbol("%DTB");

    public static final SubLSymbol $sym36$_BTD = makeSymbol("%BTD");

    public static final SubLSymbol $sym37$_AND = makeSymbol("%AND");

    public static final SubLList $list38 = list(makeSymbol("OPERATOR"), makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym40$CCATCH_ENV_VAR = makeUninternedSymbol("CCATCH-ENV-VAR");

    public static final SubLSymbol $sym41$_CCATCH = makeSymbol("%CCATCH");

    public static final SubLList $list42 = list(makeSymbol("OPERATOR"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DELTA"), ONE_INTEGER));





    public static final SubLSymbol $sym45$_ = makeSymbol("-");

    public static final SubLList $list46 = list(makeSymbol("OPERATOR"), makeSymbol("VARS"), makeSymbol("ENDTEST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list48 = list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), list(makeSymbol("UPDATE"), NIL, makeSymbol("UPDATE?")));



    public static final SubLList $list50 = list(makeSymbol("TEST"), makeSymbol("&REST"), makeSymbol("RESULT"));





    public static final SubLSymbol $sym53$_FOR = makeSymbol("%FOR");

    public static final SubLList $list54 = list(makeSymbol("OPERATOR"), list(makeSymbol("SYM"), makeSymbol("PACKAGE"), makeSymbol("ITERATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym55$_CDO_SYMBOLS = makeSymbol("%CDO-SYMBOLS");

    public static final SubLList $list56 = list(makeSymbol("OPERATOR"), list(makeSymbol("SYM"), makeSymbol("PACKAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym58$CDO_SYMBOLS_PACKAGE = makeUninternedSymbol("CDO-SYMBOLS-PACKAGE");

    public static final SubLSymbol $sym59$CDO_SYMBOLS_ITERATOR = makeUninternedSymbol("CDO-SYMBOLS-ITERATOR");

    public static final SubLList $list60 = list(makeSymbol("OPERATOR"), list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE"), makeSymbol("ITERATOR"), makeSymbol("ENTRY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym61$_CDOHASH = makeSymbol("%CDOHASH");

    public static final SubLList $list62 = list(makeSymbol("OPERATOR"), list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym64$CDOHASH_TABLE = makeUninternedSymbol("CDOHASH-TABLE");

    public static final SubLSymbol $sym65$CDOHASH_ITERATOR = makeUninternedSymbol("CDOHASH-ITERATOR");

    public static final SubLSymbol $sym66$CDOHASH_ENTRY = makeUninternedSymbol("CDOHASH-ENTRY");

    public static final SubLList $list67 = list(makeSymbol("OPERATOR"), list(makeSymbol("VAR"), makeSymbol("LISTFORM")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym69$CDOLIST_LIST_VAR = makeUninternedSymbol("CDOLIST-LIST-VAR");

    public static final SubLSymbol CLET_LOCAL = makeSymbol("CLET-LOCAL");

    public static final SubLSymbol FOR = makeSymbol("FOR");







    public static final SubLList $list75 = list(makeSymbol("OPERATOR"), list(makeSymbol("VAR"), makeSymbol("INTEGER")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym77$CDOTIMES_END_VAR = makeUninternedSymbol("CDOTIMES-END-VAR");

    public static final SubLList $list78 = list(ZERO_INTEGER);

    public static final SubLSymbol $sym79$_ = makeSymbol("<");



    public static final SubLList $list81 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("PRED"));





    public static final SubLSymbol $sym84$_DP_CHECK_TYPE = makeSymbol("%DP-CHECK-TYPE");

    public static final SubLSymbol $sym85$_ = makeSymbol("+");

    public static final SubLList $list86 = list(makeSymbol("OPERATOR"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list87 = list(makeSymbol("FIRST-BINDING"), makeSymbol("&REST"), makeSymbol("REST-BINDINGS"));



    public static final SubLList $list89 = list(makeSymbol("BINDING-VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-INITIALIZATION"));



    public static final SubLString $str91$CLET_of_lexical_variable__S_being = makeString("CLET of lexical variable ~S being converted to CUNWIND-PROTECT CSETQ idiom");

    public static final SubLString $str92$CLET_of_constant__S_is_not_allowe = makeString("CLET of constant ~S is not allowed");

    public static final SubLString $str93$Unexpected_variable__S = makeString("Unexpected variable ~S");



    public static final SubLList $list95 = list(makeSymbol("OPERATOR"), makeSymbol("VARS"), makeSymbol("VALUE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list97 = list(makeSymbol("%RESET-MVAL"));

    public static final SubLList $list98 = list(makeSymbol("FIRST-VAR"), makeSymbol("&REST"), makeSymbol("REST-VARS"));

    public static final SubLSymbol $sym99$_MVAL = makeSymbol("%MVAL");

    public static final SubLList $list100 = list(makeSymbol("OPERATOR"), makeSymbol("EXPRESSION"));

    public static final SubLSymbol $sym101$_NOT = makeSymbol("%NOT");



    public static final SubLSymbol $sym103$_OR = makeSymbol("%OR");

    public static final SubLList $list104 = list(makeSymbol("OPERATOR"), makeSymbol("PLACE"));





    public static final SubLList $list107 = list(makeSymbol("OPERATOR"), makeSymbol("SPECIAL-VARS"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym109$CPROGV_VAR = makeUninternedSymbol("CPROGV-VAR");

    public static final SubLSymbol $sym110$_CPROGV = makeSymbol("%CPROGV");

    public static final SubLList $list111 = list(makeSymbol("OPERATOR"), makeSymbol("ITEM"), makeSymbol("PLACE"));





    public static final SubLList $list114 = list(makeSymbol("OPERATOR"), makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("KEY"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), IDENTITY))));

    public static final SubLList $list115 = list(makeSymbol("FUNCTION"), EQL);

    public static final SubLList $list116 = list(makeSymbol("FUNCTION"), IDENTITY);



    public static final SubLSymbol $sym118$ITEM_VAR = makeUninternedSymbol("ITEM-VAR");





    public static final SubLList $list121 = list(makeSymbol("OPERATOR"), makeSymbol("PLACE"), makeSymbol("VALUE"));



















    public static final SubLSymbol SET_CHAR = makeSymbol("SET-CHAR");







    public static final SubLSymbol PUT = makeSymbol("PUT");





    public static final SubLList $list138 = list(makeSymbol("ACCESSOR"), makeSymbol("EXPRESSION"));

    public static final SubLSymbol SETTER_FROM_ACCESSOR = makeSymbol("SETTER-FROM-ACCESSOR", "SUBLISP");

    public static final SubLList $list140 = list(makeSymbol("OPERATOR"), makeSymbol("VAR"), makeSymbol("VALUE"), makeSymbol("&REST"), makeSymbol("VAR-VAL-PAIRS"));

    public static final SubLList $list141 = list(makeSymbol("VAR"), makeSymbol("VALUE"), makeSymbol("&REST"), makeSymbol("MORE-VAR-VAL-PAIRS"));

    public static final SubLList $list142 = list(makeSymbol("OPERATOR"), list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym144$CSOME_LIST_VAR = makeUninternedSymbol("CSOME-LIST-VAR");

    public static final SubLList $list145 = list(makeSymbol("OPERATOR"), makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym147$TIME_VAR = makeUninternedSymbol("TIME-VAR");

    public static final SubLList $list148 = list(list(makeSymbol("GET-INTERNAL-REAL-TIME")));

    public static final SubLSymbol $sym149$_ = makeSymbol("/");

    public static final SubLList $list150 = list(makeSymbol("GET-INTERNAL-REAL-TIME"));

    public static final SubLList $list151 = list(makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"));

    public static final SubLList $list152 = list(makeSymbol("OPERATOR"), makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym154$CUNWIND_PROTECT_ENV_VAR = makeUninternedSymbol("CUNWIND-PROTECT-ENV-VAR");

    public static final SubLSymbol $sym155$_CUNWIND_PROTECT = makeSymbol("%CUNWIND-PROTECT");

    public static final SubLList $list156 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("DECLARATION-SPECIFIERS"));





    public static final SubLList $list159 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("DECLARATIONS"));



    public static final SubLList $list161 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));





    public static final SubLList $list164 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list166 = list(makeSymbol("DOCUMENTATION"), makeSymbol("&BODY"), makeSymbol("REAL-BODY"));

    public static final SubLList $list167 = list(list(makeSymbol("RET"), NIL));



    public static final SubLSymbol POSSIBLY_NOTE_FUNCTION_ENTRY = makeSymbol("POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP");

    public static final SubLSymbol $sym170$THREAD = makeUninternedSymbol("THREAD");

    public static final SubLSymbol $sym171$_WITH_CURRENT_THREAD = makeSymbol("%WITH-CURRENT-THREAD");

    public static final SubLSymbol TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P = makeSymbol("TRANSLATOR-CURRENT-THREAD-ACCESS-CONSTRUCT-P");

    public static final SubLList $list173 = list(makeSymbol("%RESET-MVAL"), makeSymbol("%MVAL"), makeSymbol("CLET-BIND"), makeSymbol("%DYN"), makeSymbol("%CCATCH"));



    public static final SubLList $list175 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list177 = list(makeSymbol("MACROFORM"), makeSymbol("ENVIRONMENT"));



    public static final SubLList $list179 = list(makeSymbol("CDR"), makeSymbol("MACROFORM"));

    public static final SubLSymbol DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");



    public static final SubLList $list182 = list(makeSymbol("OPERATOR"), list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("SLOTS"));

    public static final SubLSymbol DEFSTRUCT = makeSymbol("DEFSTRUCT");

    public static final SubLSymbol $sym184$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");

    public static final SubLList $list185 = list(makeSymbol("OPERATOR"), makeSymbol("&BODY"), makeSymbol("TRANSLATED-BODY"));



    private static final SubLSymbol $C_STRUCTURE_TAG = makeKeyword("C-STRUCTURE-TAG");















    public static final SubLList $list195 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));



    public static final SubLList $list197 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"));



    public static final SubLSymbol $sym199$_DP_ENFORCE_TYPE = makeSymbol("%DP-ENFORCE-TYPE");

    public static final SubLList $list200 = list(makeSymbol("OPERATOR"), makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));





    public static final SubLList $list203 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("TRUE-VALUE"), makeSymbol("FALSE-VALUE"));



    public static final SubLList $list205 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"));





    public static final SubLList $list208 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("FALSE-VALUE"));



    public static final SubLList $list210 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("TRUE-VALUE"));



    public static final SubLList $list212 = list(NIL);

    public static final SubLList $list213 = list(makeSymbol("OPERATOR"), makeSymbol("SUBFORM"));





    public static final SubLSymbol $sym216$_IGNORE_MUSTS__ = makeSymbol("*IGNORE-MUSTS?*");

    public static final SubLList $list217 = list(makeSymbol("OPERATOR"), makeSymbol("N"), makeSymbol("SUBFORM"));



    public static final SubLList $list219 = list(makeSymbol("OPERATOR"), makeSymbol("TEST-OBJECT"), makeSymbol("&REST"), makeSymbol("CLAUSES"));



    public static final SubLSymbol $sym221$PCASE_VAR = makeUninternedSymbol("PCASE-VAR");



    public static final SubLList $list223 = list(makeSymbol("KEY"), makeSymbol("&BODY"), makeSymbol("CLAUSE-BODY"));



    public static final SubLString $str225$_AEncountered_a_PCASE_that_uses_T = makeString("~AEncountered a PCASE that uses T rather than OTHERWISE");

    public static final SubLString $$$Within_ = makeString("Within ");

    public static final SubLString $str227$___ = makeString(" : ");

    public static final SubLString $str228$ = makeString("");

    public static final SubLList $list229 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("CLAUSES"));

    public static final SubLList $list230 = list(makeSymbol("CONDITION"), makeSymbol("&BODY"), makeSymbol("CLAUSE-BODY"));

    public static final SubLList $list231 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));



    public static final SubLList $list233 = list(makeSymbol("OPERATOR"), makeSymbol("DECLARATION-SPECIFIER"));

    public static final SubLList $list234 = list(makeSymbol("DECLARATION-IDENTIFIER"), makeSymbol("&REST"), makeSymbol("ARGS"));

    public static final SubLList $list235 = list(makeSymbol("VISIBILITY"), makeSymbol("&REST"), makeSymbol("METHODS"));

    public static final SubLList $list236 = list(makeSymbol("PRIVATE"), makeSymbol("PROTECTED"), makeSymbol("PUBLIC"));

    public static final SubLList $list237 = list(makeSymbol("VISIBILITY"), makeSymbol("&REST"), makeSymbol("GLOBALS"));

    private static final SubLSymbol INLINE = makeSymbol("INLINE");

    private static final SubLSymbol NOTINLINE = makeSymbol("NOTINLINE");

    private static final SubLSymbol $sym240$_PROCLAIM = makeSymbol("%PROCLAIM");

    private static final SubLList $list241 = list(makeSymbol("OPERATOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list242 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list243 = list(list(T));



    private static final SubLList $list245 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"));

    private static final SubLList $list246 = list(makeSymbol("QUOTE"), makeSymbol("%EXIT"));

    private static final SubLList $list247 = list(makeSymbol("OPERATOR"), makeSymbol("HANDLER"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym249$CATCH_VAR = makeUninternedSymbol("CATCH-VAR");

    private static final SubLSymbol $sym250$ERROR_VAR = makeUninternedSymbol("ERROR-VAR");

    private static final SubLSymbol $sym251$_WITH_ERROR_HANDLER = makeSymbol("%WITH-ERROR-HANDLER");

    private static final SubLSymbol WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");

    private static final SubLSymbol $sym253$RESOURCE_TRACKING_ENV_VAR = makeUninternedSymbol("RESOURCE-TRACKING-ENV-VAR");

    private static final SubLSymbol $sym254$_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING");



    private static final SubLList $list256 = list(list(makeSymbol("*CURRENT-AREA*"), list(makeSymbol("GET-STATIC-AREA"))));



    public static final SubLList $list258 = list(list(makeSymbol("*CURRENT-AREA*"), list(makeSymbol("GET-THREAD-PRIVATE-AREA"))));



    public static final SubLList $list260 = list(list(makeSymbol("*CURRENT-AREA*"), list(makeSymbol("GET-WORKING-AREA"))));

    public static final SubLList $list261 = list(makeSymbol("OPERATOR"), makeSymbol("DYNAMIC-BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list262 = list(makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"));

    private static final SubLList $list263 = list(makeSymbol("OPERATOR"), makeSymbol("LOCAL-BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list264 = list(makeSymbol("OPERATOR"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("SIZE"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

    private static final SubLSymbol _DEFSTRUCT_CONSTRUCT = makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");



    private static final SubLList $list267 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("SLOT"));

    private static final SubLSymbol _DEFSTRUCT_GET_SLOT = makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");

    private static final SubLList $list269 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

    private static final SubLSymbol _DEFSTRUCT_OBJECT_P = makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");

    public static final SubLList $list271 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("VALUE"), makeSymbol("TYPE"), makeSymbol("SLOT"));

    private static final SubLSymbol _DEFSTRUCT_SET_SLOT = makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP");

    public static final SubLList $list273 = list(makeSymbol("OPERATOR"), list(makeSymbol("INITIALIZATIONS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list274 = list(makeSymbol("OPERATOR"), list(makeSymbol("BINDINGS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list275 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"));

    private static final SubLList $list276 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"));



    private static final SubLSymbol $package$ = makeSymbol("*PACKAGE*");



    private static final SubLList $list280 = list(makeSymbol("OPERATOR"), makeSymbol("N"));

    public static final SubLList $list281 = list(makeSymbol("OPERATOR"), makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLList $list284 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    public static final SubLList $list285 = list(makeSymbol("DYNAMIC-BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list286 = list(makeSymbol("LOCAL-BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list287 = list(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    public static final SubLList $list288 = list(list(makeSymbol("BINDINGS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list289 = list(list(makeSymbol("INITIALIZATIONS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list290 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE"), makeSymbol("TABLE-VAR"), makeSymbol("ITERATOR-VAR"), makeSymbol("ENTRY-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list291 = list(list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("ENV-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list292 = list(makeSymbol("ENV-VAR"), makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list293 = list(list(makeSymbol("SPECIAL-VARS"), makeSymbol("BINDINGS"), makeSymbol("INTERNAL-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list294 = list(list(makeSymbol("SYM"), makeSymbol("PACKAGE"), makeSymbol("PACKAGE-VAR"), makeSymbol("ITERATOR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list295 = list(list(makeSymbol("HANDLER"), makeSymbol("CATCH-VAR"), makeSymbol("ERROR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list296 = list(makeSymbol("RESOURCE-VAR"), makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list297 = list(makeSymbol("THREAD-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list298 = list(list(makeSymbol("CURRENT-PROCESS")));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject translator_within_binding_constructP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $translator_within_binding_constructP$.getDynamicValue(thread);
    }

    public static SubLObject translate_form(SubLObject form) {
        if (form.isAtom()) {
            return translate_atom(form);
        }
        form = possibly_translate_implementation_symbols(form);
        final SubLObject operator = form.first();
        final SubLObject translator = operator_translator(operator);
        if (NIL != translator) {
            return translate_form_via_translator(translator, form);
        }
        if (operator.isMacroOperator()) {
            return translate_form_via_macroexpansion(form);
        }
        return translate_form_as_function_call(form);
    }

    public static SubLObject test_translate_form(final SubLObject form, SubLObject backend, SubLObject translation_features) {
        if (backend == UNPROVIDED) {
            backend = $SL2C;
        }
        if (translation_features == UNPROVIDED) {
            translation_features = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $features$.currentBinding(thread);
        try {
            $features$.bind(adjoin(backend, translation_features, UNPROVIDED, UNPROVIDED), thread);
            result = translate_form(form);
        } finally {
            $features$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject translate_atom(final SubLObject form) {
        if (form.isKeyword()) {
            return translate_constant_atom(form);
        }
        if ((form == NIL) || (form == T)) {
            return translate_constant_atom(form);
        }
        if (form.isSymbol()) {
            return translate_variable_reference(form);
        }
        if (NIL != constantp(form, UNPROVIDED)) {
            return translate_constant_atom(form);
        }
        return Errors.error($str1$unexpected_form____S, form);
    }

    public static SubLObject translate_constant_atom(final SubLObject form) {
        return file_translation.tsf_possibly_convert_internal_constant(form);
    }

    public static SubLObject translator_variable_binding_type(final SubLObject variable) {
        SubLObject binding_type = xref_database.xref_global_binding_type(variable);
        if (binding_type != $UNSPECIFIED) {
            return binding_type;
        }
        binding_type = file_translation.current_ts_file_global_binding_type(variable);
        if (binding_type != $UNSPECIFIED) {
            return binding_type;
        }
        return $LOCAL;
    }

    public static SubLObject translate_variable_reference(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject binding_type = translator_variable_binding_type(variable);
        if (binding_type != $LOCAL) {
            xref_database.xref_note_global_reference(variable);
        }
        final SubLObject pcase_var = binding_type;
        if (pcase_var.eql($LOCAL)) {
            return translate_variable(variable);
        }
        if (pcase_var.eql($DYNAMIC)) {
            return list($sym5$_DYN, translate_variable(variable));
        }
        if (pcase_var.eql($LEXICAL)) {
            return list($sym7$_LEX, translate_variable(variable));
        }
        if (pcase_var.eql($CONSTANT)) {
            return list($sym7$_LEX, translate_variable(variable));
        }
        return Errors.error($str9$Unexpected_binding_type__S_for_va, binding_type, variable);
    }

    public static SubLObject translate_variable(final SubLObject variable) {
        final SubLObject binding_type = translator_variable_binding_type(variable);
        if (binding_type != $LOCAL) {
            file_translation.tsf_possibly_note_referenced_global(variable);
        }
        return variable;
    }

    public static SubLObject translate_form_via_translator(final SubLObject translator, final SubLObject form) {
        if (NIL == subl_promotions.function_symbol_p(translator)) {
            return Errors.error($str10$time_to_implement__S, translator);
        }
        return funcall(translator, form);
    }

    public static SubLObject translate_form_via_macroexpansion(final SubLObject form) {
        SubLObject macro = NIL;
        destructuring_bind_must_consp(form, form, $list11);
        macro = form.first();
        final SubLObject args;
        final SubLObject current = args = form.rest();
        xref_database.xref_note_macro_use(macro);
        return translate_form(macroexpand_1(form, UNPROVIDED));
    }

    public static SubLObject translate_form_as_function_call(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list12);
        operator = form.first();
        final SubLObject args;
        final SubLObject current = args = form.rest();
        xref_database.xref_note_function_call(operator);
        final SubLObject translated_operator = translate_function_symbol(operator);
        SubLObject translated_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            translated_args = cons(translate_form(arg), translated_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return bq_cons(translated_operator, append(nreverse(translated_args), NIL));
    }

    public static SubLObject translate_function_symbol(final SubLObject form) {
        file_translation.tsf_possibly_note_referenced_function(form);
        return form;
    }

    public static SubLObject vaccess_level(final SubLObject symbol) {
        return get(symbol, VACCESS, PROTECTED);
    }

    public static SubLObject faccess_level(final SubLObject symbol) {
        return get(symbol, FACCESS, PROTECTED);
    }

    public static SubLObject private_global_p(final SubLObject symbol) {
        return makeBoolean(symbol.isSymbol() && (PRIVATE == vaccess_level(symbol)));
    }

    public static SubLObject private_method_p(final SubLObject symbol) {
        return makeBoolean(symbol.isSymbol() && (PRIVATE == faccess_level(symbol)));
    }

    public static SubLObject translate_body(final SubLObject body) {
        SubLObject translated_body = NIL;
        SubLObject cdolist_list_var = body;
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject translated_form = translate_form(form);
            translated_body = cons(translated_form, translated_body);
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        } 
        return common_optimization.translator_optimize_body(nreverse(translated_body));
    }

    public static SubLObject translate_arglist(final SubLObject arglist) {
        SubLObject translated_arglist = NIL;
        SubLObject cdolist_list_var = arglist;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject variable = NIL;
                destructuring_bind_must_consp(current, datum, $list17);
                variable = current.first();
                current = current.rest();
                final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list17);
                current = current.rest();
                final SubLObject providedP = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list17);
                current = current.rest();
                if (NIL == current) {
                    translated_arglist = cons(listS(variable, translate_form(initialization), append(NIL != providedP ? list(providedP) : NIL, NIL)), translated_arglist);
                } else {
                    cdestructuring_bind_error(datum, $list17);
                }
            } else {
                translated_arglist = cons(arg, translated_arglist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(translated_arglist);
    }

    public static SubLObject translate_empty_progn(SubLObject form) {
        if (form == UNPROVIDED) {
            form = NIL;
        }
        return $list18;
    }

    public static SubLObject binding_type_p(final SubLObject obj) {
        return list_utilities.member_eqP(obj, $list19);
    }

    public static SubLObject dynamic_global_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && ($DYNAMIC == get(v_object, $BINDING_TYPE, UNPROVIDED)));
    }

    public static SubLObject lexical_global_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && ($LEXICAL == get(v_object, $BINDING_TYPE, UNPROVIDED)));
    }

    public static SubLObject constant_global_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && ($CONSTANT == get(v_object, $BINDING_TYPE, UNPROVIDED)));
    }

    public static SubLObject global_binding_type(final SubLObject global) {
        if (NIL != dynamic_global_p(global)) {
            return $DYNAMIC;
        }
        if (NIL != lexical_global_p(global)) {
            return $LEXICAL;
        }
        if (NIL != constant_global_p(global)) {
            return $CONSTANT;
        }
        return $UNSPECIFIED;
    }

    public static SubLObject optimize_funcall_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL != get(v_object, OPTIMIZE_FUNCALL, UNPROVIDED)));
    }

    public static SubLObject translator_consider_expansion_factor(final SubLObject method, final SubLObject form, final SubLObject translated_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $consider_translator_expansion_factor$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject form_size = list_utilities.cons_count(form);
        final SubLObject translated_form_size = list_utilities.cons_count(translated_form);
        final SubLObject expansion_factor = translate_form_expansion_factor_int(form_size, translated_form_size);
        final SubLObject expansion_cutoff = $int$50;
        SubLObject stats = NIL;
        if ($consider_translator_expansion_factor$.getDynamicValue(thread).isVector()) {
            stats = $consider_translator_expansion_factor$.getDynamicValue(thread);
            set_aref(stats, ZERO_INTEGER, add(aref(stats, ZERO_INTEGER), ONE_INTEGER));
            set_aref(stats, ONE_INTEGER, add(aref(stats, ONE_INTEGER), form_size));
            set_aref(stats, TWO_INTEGER, add(aref(stats, TWO_INTEGER), translated_form_size));
            set_aref(stats, THREE_INTEGER, add(aref(stats, THREE_INTEGER), expansion_factor));
        }
        if (expansion_factor.numG(expansion_cutoff)) {
            if ($consider_translator_expansion_factor$.getDynamicValue(thread).isVector()) {
                set_aref(stats, FOUR_INTEGER, cons(list(method, expansion_factor), aref(stats, FOUR_INTEGER)));
            } else {
                Errors.warn($str23$Method__S_undergoes_a__Sx_expansi, method, round(number_utilities.significant_digits(expansion_factor, TWO_INTEGER), UNPROVIDED));
            }
        }
        return expansion_factor;
    }

    public static SubLObject translate_form_expansion_factor(final SubLObject form, final SubLObject backend, final SubLObject features) {
        final SubLObject translated_form = test_translate_form(form, backend, features);
        final SubLObject form_size = list_utilities.cons_count(form);
        final SubLObject translated_form_size = list_utilities.cons_count(translated_form);
        return translate_form_expansion_factor_int(form_size, translated_form_size);
    }

    public static SubLObject translate_form_expansion_factor_int(final SubLObject form_size, final SubLObject translated_form_size) {
        return form_size.isZero() ? ZERO_INTEGER : divide(translated_form_size, form_size);
    }

    public static SubLObject show_translation_expansion_factor_stats(SubLObject stats, SubLObject stream) {
        if (stats == UNPROVIDED) {
            stats = $consider_translator_expansion_factor$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject total_forms = aref(stats, ZERO_INTEGER);
        final SubLObject total_form_size = aref(stats, ONE_INTEGER);
        final SubLObject total_translated_form_size = aref(stats, TWO_INTEGER);
        final SubLObject largest_expansions = Sort.sort(copy_list(aref(stats, FOUR_INTEGER)), symbol_function($sym24$_), symbol_function(SECOND));
        format(stream, $str26$__Total_forms______________S, total_forms);
        format(stream, $str27$__Mean_form_size___________S, number_utilities.significant_digits(divide(total_form_size, total_forms), THREE_INTEGER));
        format(stream, $str28$__Mean_expansion_factor____Sx, number_utilities.significant_digits(divide(total_translated_form_size, total_form_size), THREE_INTEGER));
        format(stream, $str29$__Largest_expansions__);
        SubLObject cdolist_list_var = largest_expansions;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$1 = current = datum;
            SubLObject method = NIL;
            SubLObject expansion_factor = NIL;
            destructuring_bind_must_consp(current, datum_$1, $list30);
            method = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum_$1, $list30);
            expansion_factor = current.first();
            current = current.rest();
            if (NIL == current) {
                format(stream, $str31$___4___Dx___S, round(number_utilities.significant_digits(expansion_factor, THREE_INTEGER), UNPROVIDED), method);
            } else {
                cdestructuring_bind_error(datum_$1, $list30);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject operator_translator(final SubLObject operator) {
        return list_utilities.alist_lookup_without_values($operator_translators$.getGlobalValue(), operator, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject translate_cand(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list33);
        operator = form.first();
        final SubLObject expressions;
        final SubLObject current = expressions = form.rest();
        list_utilities.verify_operator(operator, CAND);
        SubLObject translated_expressions = NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject translated_expression = translate_Xdtb(list($sym35$_DTB, expression));
            translated_expressions = cons(translated_expression, translated_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return common_optimization.translator_optimize_Xbtd(list($sym36$_BTD, common_optimization.translator_optimize_Xand(bq_cons($sym37$_AND, append(nreverse(translated_expressions), NIL)))));
    }

    public static SubLObject translate_ccatch(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject tag = NIL;
        SubLObject ans_var = NIL;
        destructuring_bind_must_consp(form, form, $list38);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list38);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list38);
        ans_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CCATCH);
        final SubLObject translated_tag = translate_form(tag);
        final SubLObject translated_body = translate_binding_construct_body(body);
        final SubLObject ccatch_env_var = $sym40$CCATCH_ENV_VAR;
        return listS($sym41$_CCATCH, list(translated_tag, ans_var, ccatch_env_var), append(translated_body, NIL));
    }

    public static SubLObject translate_binding_construct_body(final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $translator_within_binding_constructP$.currentBinding(thread);
        try {
            $translator_within_binding_constructP$.bind(T, thread);
            result = translate_body(body);
        } finally {
            $translator_within_binding_constructP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject translate_binding_construct_form(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $translator_within_binding_constructP$.currentBinding(thread);
        try {
            $translator_within_binding_constructP$.bind(T, thread);
            result = translate_form(form);
        } finally {
            $translator_within_binding_constructP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject translate_cdec(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(form, form, $list42);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list42);
        place = current.first();
        current = current.rest();
        final SubLObject delta = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, form, $list42);
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CDEC);
            return translate_csetf(list(CSETF, place, list($sym45$_, place, delta)));
        }
        cdestructuring_bind_error(form, $list42);
        return NIL;
    }

    public static SubLObject translate_cdo(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject vars = NIL;
        SubLObject endtest = NIL;
        destructuring_bind_must_consp(form, form, $list46);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list46);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list46);
        endtest = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CDO);
        SubLObject clet_vars = NIL;
        SubLObject for_initializations = NIL;
        SubLObject for_test = NIL;
        SubLObject for_updates = NIL;
        SubLObject result_body = NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var_form = NIL;
        var_form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$3;
            final SubLObject datum_$2 = current_$3 = var_form;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current_$3, datum_$2, $list48);
            var = current_$3.first();
            current_$3 = current_$3.rest();
            final SubLObject initialization = (current_$3.isCons()) ? current_$3.first() : NIL;
            destructuring_bind_must_listp(current_$3, datum_$2, $list48);
            current_$3 = current_$3.rest();
            final SubLObject update = (current_$3.isCons()) ? current_$3.first() : NIL;
            final SubLObject updateP = consp(current_$3);
            destructuring_bind_must_listp(current_$3, datum_$2, $list48);
            current_$3 = current_$3.rest();
            if (NIL == current_$3) {
                clet_vars = cons(var, clet_vars);
                for_initializations = cons(list(CSETQ, var, initialization), for_initializations);
                if (NIL != updateP) {
                    for_updates = cons(list(CSETQ, var, update), for_updates);
                }
            } else {
                cdestructuring_bind_error(datum_$2, $list48);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_form = cdolist_list_var.first();
        } 
        clet_vars = nreverse(clet_vars);
        for_initializations = nreverse(for_initializations);
        for_updates = nreverse(for_updates);
        SubLObject current_$4;
        final SubLObject datum_$3 = current_$4 = endtest;
        SubLObject test = NIL;
        destructuring_bind_must_consp(current_$4, datum_$3, $list50);
        test = current_$4.first();
        final SubLObject result;
        current_$4 = result = current_$4.rest();
        for_test = list(CNOT, test);
        result_body = result;
        return translate_clet(listS(CLET, clet_vars, listS($sym53$_FOR, list(for_initializations, for_test, for_updates), append(body, NIL)), append(result_body, NIL)));
    }

    public static SubLObject translate_Xcdo_symbols(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list54);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sym = NIL;
        SubLObject v_package = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, form, $list54);
        sym = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list54);
        v_package = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list54);
        iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, $sym55$_CDO_SYMBOLS);
            final SubLObject translated_body = translate_body(body);
            return listS($sym55$_CDO_SYMBOLS, list(sym, v_package, iterator), append(translated_body, NIL));
        }
        cdestructuring_bind_error(form, $list54);
        return NIL;
    }

    public static SubLObject translate_cdo_symbols(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list56);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sym = NIL;
        SubLObject v_package = NIL;
        destructuring_bind_must_consp(current, form, $list56);
        sym = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list56);
        v_package = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, CDO_SYMBOLS);
            final SubLObject cdo_symbols_package = $sym58$CDO_SYMBOLS_PACKAGE;
            final SubLObject cdo_symbols_iterator = $sym59$CDO_SYMBOLS_ITERATOR;
            return translate_clet(list(CLET, list(list(cdo_symbols_package, v_package), cdo_symbols_iterator, sym), listS($sym55$_CDO_SYMBOLS, list(sym, cdo_symbols_package, cdo_symbols_iterator), append(body, NIL))));
        }
        cdestructuring_bind_error(form, $list56);
        return NIL;
    }

    public static SubLObject translate_Xcdohash(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list60);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject table = NIL;
        SubLObject iterator = NIL;
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, form, $list60);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list60);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list60);
        table = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list60);
        iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list60);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, $sym61$_CDOHASH);
            final SubLObject translated_body = translate_body(body);
            final SubLObject translated_table = translate_form(table);
            return listS($sym61$_CDOHASH, list(key, val, translated_table, iterator, entry), append(translated_body, NIL));
        }
        cdestructuring_bind_error(form, $list60);
        return NIL;
    }

    public static SubLObject translate_cdohash(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list62);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, form, $list62);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list62);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list62);
        table = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list62);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        list_utilities.verify_operator(operator, CDOHASH);
        if ((!table.isAtom()) || (NIL != dynamic_global_p(table))) {
            final SubLObject cdohash_table = $sym64$CDOHASH_TABLE;
            return translate_clet(list(CLET, list(list(cdohash_table, table)), listS(CDOHASH, list(key, val, cdohash_table), append(body, NIL))));
        }
        final SubLObject cdohash_iterator = $sym65$CDOHASH_ITERATOR;
        final SubLObject cdohash_entry = $sym66$CDOHASH_ENTRY;
        return translate_clet(list(CLET, list(key, val), listS($sym61$_CDOHASH, list(key, val, table, cdohash_iterator, cdohash_entry), append(body, NIL))));
    }

    public static SubLObject translate_cdolist(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list67);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        destructuring_bind_must_consp(current, form, $list67);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list67);
        listform = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, CDOLIST);
            final SubLObject cdolist_list_var = $sym69$CDOLIST_LIST_VAR;
            return translate_clet_local(list(CLET_LOCAL, list(list(cdolist_list_var, listform)), listS(FOR, list(list(list(var, list(FIRST, cdolist_list_var))), list(CNOT, list(NULL, cdolist_list_var)), list(list(CSETQ, cdolist_list_var, list(REST, cdolist_list_var)), list(CSETQ, var, list(FIRST, cdolist_list_var)))), append(body, NIL))));
        }
        cdestructuring_bind_error(form, $list67);
        return NIL;
    }

    public static SubLObject translate_cdotimes(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list75);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject integer = NIL;
        destructuring_bind_must_consp(current, form, $list75);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list75);
        integer = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list75);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        list_utilities.verify_operator(operator, CDOTIMES);
        if (!integer.isAtom()) {
            final SubLObject cdotimes_end_var = $sym77$CDOTIMES_END_VAR;
            return translate_clet_local(list(CLET_LOCAL, list(list(cdotimes_end_var, integer)), listS(CDOTIMES, list(var, cdotimes_end_var), append(body, NIL))));
        }
        return translate_for(listS(FOR, list(list(bq_cons(var, $list78)), list($sym79$_, var, integer), list(list(CINC, var))), append(body, NIL)));
    }

    public static SubLObject translate_check_type(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(form, form, $list81);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list81);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list81);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CHECK_TYPE);
            xref_database.xref_note_function_call(pred);
            final SubLObject translated_object = translate_form(v_object);
            final SubLObject translated_pred = translate_function_symbol(pred);
            translate_form(list(QUOTE, pred));
            return list($sym84$_DP_CHECK_TYPE, translated_object, translated_pred);
        }
        cdestructuring_bind_error(form, $list81);
        return NIL;
    }

    public static SubLObject translate_cinc(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(form, form, $list42);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list42);
        place = current.first();
        current = current.rest();
        final SubLObject delta = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, form, $list42);
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CINC);
            return translate_csetf(list(CSETF, place, list($sym85$_, place, delta)));
        }
        cdestructuring_bind_error(form, $list42);
        return NIL;
    }

    public static SubLObject translate_clet(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_bindings = NIL;
        destructuring_bind_must_consp(form, form, $list86);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list86);
        v_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CLET);
        return translate_clet_int(NIL, v_bindings, body);
    }

    public static SubLObject translate_clet_int(final SubLObject some_globalP, final SubLObject v_bindings, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == v_bindings) {
            return translate_final_clet_body(some_globalP, body);
        }
        SubLObject first_binding = NIL;
        destructuring_bind_must_consp(v_bindings, v_bindings, $list87);
        first_binding = v_bindings.first();
        final SubLObject rest_bindings;
        final SubLObject current = rest_bindings = v_bindings.rest();
        SubLObject variable = $UNSET;
        SubLObject initialization = NIL;
        if (first_binding.isCons()) {
            SubLObject current_$7;
            final SubLObject datum_$6 = current_$7 = first_binding;
            SubLObject binding_variable = NIL;
            destructuring_bind_must_consp(current_$7, datum_$6, $list89);
            binding_variable = current_$7.first();
            current_$7 = current_$7.rest();
            final SubLObject binding_initialization = (current_$7.isCons()) ? current_$7.first() : NIL;
            destructuring_bind_must_listp(current_$7, datum_$6, $list89);
            current_$7 = current_$7.rest();
            if (NIL == current_$7) {
                variable = binding_variable;
                initialization = binding_initialization;
            } else {
                cdestructuring_bind_error(datum_$6, $list89);
            }
        } else {
            variable = first_binding;
        }
        final SubLObject binding_type = translator_variable_binding_type(variable);
        final SubLObject translated_variable = translate_variable(variable);
        final SubLObject translated_initialization = translate_form(initialization);
        final SubLObject translated_sub_body = translate_clet_int(makeBoolean((NIL != some_globalP) || (binding_type == $DYNAMIC)), rest_bindings, body);
        final SubLObject pcase_var = binding_type;
        if (pcase_var.eql($LOCAL)) {
            return common_optimization.translator_optimize_clet_local(list(CLET_LOCAL, list(list(translated_variable, translated_initialization)), translated_sub_body));
        }
        if (pcase_var.eql($DYNAMIC)) {
            xref_database.xref_note_global_binding(variable);
            return common_optimization.translator_optimize_clet_bind(list(CLET_BIND, list(list(translated_variable, translated_initialization)), translated_sub_body));
        }
        if (pcase_var.eql($LEXICAL)) {
            return Errors.error($str91$CLET_of_lexical_variable__S_being, variable);
        }
        if (pcase_var.eql($CONSTANT)) {
            return Errors.error($str92$CLET_of_constant__S_is_not_allowe, variable);
        }
        return Errors.error($str93$Unexpected_variable__S, variable);
    }

    public static SubLObject translate_final_clet_body(final SubLObject some_globalP, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != some_globalP) {
            final SubLObject _prev_bind_0 = $translator_within_binding_constructP$.currentBinding(thread);
            try {
                $translator_within_binding_constructP$.bind(T, thread);
                result = translate_final_clet_body(NIL, body);
            } finally {
                $translator_within_binding_constructP$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = translate_progn(bq_cons(PROGN, append(body, NIL)));
        }
        return result;
    }

    public static SubLObject translate_cmultiple_value_bind(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject vars = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(form, form, $list95);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list95);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list95);
        value = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CMULTIPLE_VALUE_BIND);
        final SubLObject v_bindings = translate_cmultiple_value_bind_bindings(vars, value);
        return translate_progn(list(PROGN, $list97, listS(CLET, v_bindings, $list97, append(body, NIL))));
    }

    public static SubLObject translate_cmultiple_value_bind_bindings(final SubLObject vars, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_var = NIL;
        destructuring_bind_must_consp(vars, vars, $list98);
        first_var = vars.first();
        final SubLObject rest_vars;
        final SubLObject current = rest_vars = vars.rest();
        SubLObject v_bindings = list(list(first_var, value));
        SubLObject list_var = NIL;
        SubLObject var = NIL;
        SubLObject num = NIL;
        list_var = rest_vars;
        var = list_var.first();
        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , num = add(ONE_INTEGER, num)) {
            v_bindings = cons(list(var, list($sym99$_MVAL, number_utilities.f_1X(num))), v_bindings);
        }
        return nreverse(v_bindings);
    }

    public static SubLObject translate_cnot(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject expression = NIL;
        destructuring_bind_must_consp(form, form, $list100);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list100);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CNOT);
            final SubLObject translated_expression = translate_Xdtb(list($sym35$_DTB, expression));
            return common_optimization.translator_optimize_Xbtd(list($sym36$_BTD, common_optimization.translator_optimize_Xnot(list($sym101$_NOT, translated_expression))));
        }
        cdestructuring_bind_error(form, $list100);
        return NIL;
    }

    public static SubLObject translate_cor(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list33);
        operator = form.first();
        final SubLObject expressions;
        final SubLObject current = expressions = form.rest();
        list_utilities.verify_operator(operator, COR);
        SubLObject translated_expressions = NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject translated_expression = translate_Xdtb(list($sym35$_DTB, expression));
            translated_expressions = cons(translated_expression, translated_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return common_optimization.translator_optimize_Xbtd(list($sym36$_BTD, common_optimization.translator_optimize_Xor(bq_cons($sym103$_OR, append(nreverse(translated_expressions), NIL)))));
    }

    public static SubLObject translate_cpop(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(form, form, $list104);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list104);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CPOP);
            return translate_csetf(list(CSETF, place, list(CDR, place)));
        }
        cdestructuring_bind_error(form, $list104);
        return NIL;
    }

    public static SubLObject translate_cprogv(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject special_vars = NIL;
        SubLObject v_bindings = NIL;
        destructuring_bind_must_consp(form, form, $list107);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list107);
        special_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list107);
        v_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CPROGV);
        final SubLObject translated_special_vars = translate_form(special_vars);
        final SubLObject translated_bindings = translate_form(v_bindings);
        final SubLObject translated_body = translate_body(body);
        final SubLObject cprogv_var = $sym109$CPROGV_VAR;
        return listS($sym110$_CPROGV, list(translated_special_vars, translated_bindings, cprogv_var), append(translated_body, NIL));
    }

    public static SubLObject translate_cpush(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(form, form, $list111);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list111);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list111);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CPUSH);
            return translate_csetf(list(CSETF, place, list(CONS, item, place)));
        }
        cdestructuring_bind_error(form, $list111);
        return NIL;
    }

    public static SubLObject translate_cpushnew(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(form, form, $list114);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list114);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list114);
        place = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : $list115;
        destructuring_bind_must_listp(current, form, $list114);
        current = current.rest();
        final SubLObject key = (current.isCons()) ? current.first() : $list116;
        destructuring_bind_must_listp(current, form, $list114);
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, CPUSHNEW);
            final SubLObject item_var = $sym118$ITEM_VAR;
            return translate_clet(list(CLET, list(list(item_var, item)), list(PUNLESS, list(MEMBER, item_var, place, test, key), list(CPUSH, item_var, place))));
        }
        cdestructuring_bind_error(form, $list114);
        return NIL;
    }

    public static SubLObject translate_csetf(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject place = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(form, form, $list121);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list121);
        place = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list121);
        value = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list121);
            return NIL;
        }
        list_utilities.verify_operator(operator, CSETF);
        if (place.isAtom()) {
            return translate_csetq(list(CSETQ, place, value));
        }
        final SubLObject accessor = place.first();
        SubLObject expansion = NIL;
        final SubLObject pcase_var = accessor;
        if (pcase_var.eql(CAR)) {
            expansion = list(RPLACA, second(place), value);
        } else
            if (pcase_var.eql(CDR)) {
                expansion = list(RPLACD, second(place), value);
            } else
                if (pcase_var.eql(NTH)) {
                    expansion = list(SET_NTH, second(place), third(place), value);
                } else
                    if (pcase_var.eql(GETHASH)) {
                        expansion = list(SETHASH, second(place), third(place), value);
                    } else
                        if (pcase_var.eql(GETHASH_WITHOUT_VALUES)) {
                            expansion = list(SETHASH, second(place), third(place), value);
                        } else
                            if (pcase_var.eql(CHAR)) {
                                expansion = list(SET_CHAR, second(place), third(place), value);
                            } else
                                if (pcase_var.eql(AREF)) {
                                    expansion = list(SET_AREF, second(place), third(place), value);
                                } else
                                    if (pcase_var.eql(GET)) {
                                        expansion = list(PUT, second(place), third(place), value);
                                    } else
                                        if (pcase_var.eql(SYMBOL_VALUE)) {
                                            expansion = list(SET, second(place), value);
                                        } else {
                                            SubLObject current_$9;
                                            final SubLObject datum_$8 = current_$9 = place;
                                            SubLObject accessor_$10 = NIL;
                                            SubLObject expression = NIL;
                                            destructuring_bind_must_consp(current_$9, datum_$8, $list138);
                                            accessor_$10 = current_$9.first();
                                            current_$9 = current_$9.rest();
                                            destructuring_bind_must_consp(current_$9, datum_$8, $list138);
                                            expression = current_$9.first();
                                            current_$9 = current_$9.rest();
                                            if (NIL == current_$9) {
                                                final SubLObject setter = translator_setter_from_accessor(accessor_$10);
                                                expansion = list(setter, expression, value);
                                            } else {
                                                cdestructuring_bind_error(datum_$8, $list138);
                                            }
                                        }








        return translate_form(expansion);
    }

    public static SubLObject translator_setter_from_accessor(final SubLObject accessor) {
        return funcall(SETTER_FROM_ACCESSOR, accessor);
    }

    public static SubLObject translate_csetq(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject var = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(form, form, $list140);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list140);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list140);
        value = current.first();
        final SubLObject var_val_pairs;
        current = var_val_pairs = current.rest();
        list_utilities.verify_operator(operator, CSETQ);
        translate_possibly_note_global_modification(var);
        final SubLObject translated_variable = translate_variable(var);
        final SubLObject translated_value = translate_form(value);
        if (NIL == var_val_pairs) {
            return list(CSETQ, translated_variable, translated_value);
        }
        final SubLObject more_forms = translate_csetq_int(var_val_pairs);
        return listS(PROGN, list(CSETQ, translated_variable, translated_value), append(more_forms, NIL));
    }

    public static SubLObject translate_csetq_int(final SubLObject var_val_pairs) {
        if (NIL == var_val_pairs) {
            return NIL;
        }
        SubLObject var = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(var_val_pairs, var_val_pairs, $list141);
        var = var_val_pairs.first();
        SubLObject current = var_val_pairs.rest();
        destructuring_bind_must_consp(current, var_val_pairs, $list141);
        value = current.first();
        final SubLObject more_var_val_pairs;
        current = more_var_val_pairs = current.rest();
        translate_possibly_note_global_modification(var);
        final SubLObject translated_variable = translate_variable(var);
        final SubLObject translated_value = translate_form(value);
        final SubLObject more_forms = translate_csetq_int(more_var_val_pairs);
        return bq_cons(list(CSETQ, translated_variable, translated_value), append(more_forms, NIL));
    }

    public static SubLObject translate_possibly_note_global_modification(final SubLObject variable) {
        final SubLObject pcase_var;
        final SubLObject binding_type = pcase_var = translator_variable_binding_type(variable);
        if (pcase_var.eql($LEXICAL) || pcase_var.eql($DYNAMIC)) {
            xref_database.xref_note_global_modification(variable);
            return T;
        }
        return NIL;
    }

    public static SubLObject translate_csome(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list142);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list142);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        SubLObject endvar = NIL;
        destructuring_bind_must_consp(current, form, $list142);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list142);
        listform = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list142);
        endvar = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, CSOME);
            final SubLObject csome_list_var = $sym144$CSOME_LIST_VAR;
            return translate_punless(list(PUNLESS, endvar, list(CLET_LOCAL, list(list(csome_list_var, listform)), listS(FOR, list(list(list(var, list(FIRST, csome_list_var))), list(CNOT, list(COR, endvar, list(NULL, csome_list_var))), list(list(CSETQ, csome_list_var, list(REST, csome_list_var)), list(CSETQ, var, list(FIRST, csome_list_var)))), append(body, NIL)))));
        }
        cdestructuring_bind_error(form, $list142);
        return NIL;
    }

    public static SubLObject translate_ctime(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject var = NIL;
        destructuring_bind_must_consp(form, form, $list145);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list145);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CTIME);
        final SubLObject time_var = $sym147$TIME_VAR;
        return translate_clet_local(listS(CLET_LOCAL, list(bq_cons(time_var, $list148)), append(body, list(list(CSETQ, var, listS($sym149$_, list($sym45$_, $list150, time_var), $list151))))));
    }

    public static SubLObject translate_cunwind_protect(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject protected_form = NIL;
        destructuring_bind_must_consp(form, form, $list152);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list152);
        protected_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CUNWIND_PROTECT);
        final SubLObject translated_protected_form = translate_binding_construct_form(protected_form);
        final SubLObject translated_body = translate_body(body);
        final SubLObject cunwind_protect_env_var = $sym154$CUNWIND_PROTECT_ENV_VAR;
        return common_optimization.translator_optimize_Xcunwind_protect(listS($sym155$_CUNWIND_PROTECT, cunwind_protect_env_var, translated_protected_form, append(translated_body, NIL)));
    }

    public static SubLObject translate_cvs_id(final SubLObject form) {
        return form;
    }

    public static SubLObject translate_declaim(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list156);
        operator = form.first();
        final SubLObject declaration_specifiers;
        final SubLObject current = declaration_specifiers = form.rest();
        list_utilities.verify_operator(operator, DECLAIM);
        SubLObject result_forms = NIL;
        SubLObject cdolist_list_var = declaration_specifiers;
        SubLObject declaration_specifier = NIL;
        declaration_specifier = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_forms = cons(list(PROCLAIM, list_utilities.quotify(declaration_specifier)), result_forms);
            cdolist_list_var = cdolist_list_var.rest();
            declaration_specifier = cdolist_list_var.first();
        } 
        return translate_progn(bq_cons(PROGN, append(nreverse(result_forms), NIL)));
    }

    public static SubLObject translate_declare(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list159);
        operator = form.first();
        final SubLObject declarations;
        final SubLObject current = declarations = form.rest();
        list_utilities.verify_operator(operator, DECLARE);
        return translate_empty_progn(form);
    }

    public static SubLObject translate_defconstant(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(form, form, $list161);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list161);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list161);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, form, $list161);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list161);
            return NIL;
        }
        list_utilities.verify_operator(operator, DEFCONSTANT);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, $CONSTANT);
        SubLObject translated_form = NIL;
        final SubLObject global_var = variable;
        assert NIL != symbolp(global_var) : "Types.symbolp(global_var) " + "CommonSymbols.NIL != Types.symbolp(global_var) " + global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, $CONSTANT);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = listS(DEFCONSTANT, variable, translated_initialization, append(NIL != documentation ? list(documentation) : NIL, NIL));
        } finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }

    public static SubLObject translate_define(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(form, form, $list164);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list164);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list164);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, DEFINE);
        file_translation.tsf_possibly_note_defined_function_arglist(name, arglist);
        SubLObject current_$12;
        final SubLObject datum_$11 = current_$12 = body;
        SubLObject documentation = NIL;
        destructuring_bind_must_consp(current_$12, datum_$11, $list166);
        documentation = current_$12.first();
        SubLObject real_body;
        current_$12 = real_body = current_$12.rest();
        if (!documentation.isString()) {
            documentation = NIL;
            real_body = body;
        }
        SubLObject translated_form = NIL;
        final SubLObject method_var = name;
        assert NIL != symbolp(method_var) : "Types.symbolp(method_var) " + "CommonSymbols.NIL != Types.symbolp(method_var) " + method_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_method_scope$.currentBinding(thread);
        try {
            xref_database.$xref_method_scope$.bind(method_var, thread);
            xref_database.xref_note_function_definition(name);
            xref_database.xref_note_method_formal_arglist(name, arglist);
            final SubLObject translated_arglist = translate_arglist(arglist);
            final SubLObject translated_real_body = translate_method_body(name, real_body);
            translated_form = listS(DEFINE, name, translated_arglist, append(NIL != documentation ? list(documentation) : NIL, translated_real_body, NIL));
        } finally {
            xref_database.$xref_method_scope$.rebind(_prev_bind_0, thread);
        }
        translator_consider_expansion_factor(name, form, translated_form);
        return translated_form;
    }

    public static SubLObject translator_current_method() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $translator_current_method$.getDynamicValue(thread);
    }

    public static SubLObject translate_method_body(final SubLObject name, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translated_body = NIL;
        final SubLObject _prev_bind_0 = $translator_current_method$.currentBinding(thread);
        try {
            $translator_current_method$.bind(name, thread);
            translated_body = translate_method_possibly_add_final_ret(body);
            translated_body = translate_method_possibly_add_entry(name, body);
            translated_body = translate_body(translated_body);
            translated_body = translate_method_possibly_add_with_current_thread(translated_body);
        } finally {
            $translator_current_method$.rebind(_prev_bind_0, thread);
        }
        return translated_body;
    }

    public static SubLObject translate_method_possibly_add_final_ret(final SubLObject body) {
        if (NIL == body) {
            return copy_tree($list167);
        }
        final SubLObject last_cons = last(body, UNPROVIDED);
        final SubLObject last_form = last_cons.first();
        if (last_form.isCons()) {
            SubLObject current;
            final SubLObject datum = current = last_form;
            SubLObject operator = NIL;
            destructuring_bind_must_consp(current, datum, $list12);
            operator = current.first();
            final SubLObject args;
            current = args = current.rest();
            if (RET == operator) {
                return body;
            }
        }
        final SubLObject final_ret_forms = copy_tree($list167);
        rplacd(last_cons, final_ret_forms);
        return body;
    }

    public static SubLObject translate_method_possibly_add_entry(final SubLObject name, SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue(thread)) {
            body = bq_cons(list(POSSIBLY_NOTE_FUNCTION_ENTRY, list(QUOTE, name)), append(body, NIL));
        }
        return body;
    }

    public static SubLObject translate_method_possibly_add_with_current_thread(SubLObject translated_body) {
        if (NIL != translator_body_accesses_current_thread_p(translated_body)) {
            final SubLObject thread = $sym170$THREAD;
            translated_body = list(listS($sym171$_WITH_CURRENT_THREAD, thread, append(translated_body, NIL)));
        }
        return translated_body;
    }

    public static SubLObject translator_body_accesses_current_thread_p(final SubLObject body) {
        return list_utilities.tree_find_if(TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P, body, UNPROVIDED);
    }

    public static SubLObject translator_current_thread_access_construct_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(v_object.isSymbol() && (NIL != list_utilities.member_eqP(v_object, $list173)));
    }

    public static SubLObject translate_deflexical(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(form, form, $list161);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list161);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list161);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, form, $list161);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list161);
            return NIL;
        }
        list_utilities.verify_operator(operator, DEFLEXICAL);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, $LEXICAL);
        SubLObject translated_form = NIL;
        final SubLObject global_var = variable;
        assert NIL != symbolp(global_var) : "Types.symbolp(global_var) " + "CommonSymbols.NIL != Types.symbolp(global_var) " + global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, $LEXICAL);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = listS(DEFLEXICAL, variable, translated_initialization, append(NIL != documentation ? list(documentation) : NIL, NIL));
        } finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }

    public static SubLObject translate_defmacro(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject name = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(form, form, $list175);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list175);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list175);
        pattern = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, DEFMACRO);
        SubLObject current_$14;
        final SubLObject datum_$13 = current_$14 = body;
        SubLObject documentation = NIL;
        destructuring_bind_must_consp(current_$14, datum_$13, $list166);
        documentation = current_$14.first();
        SubLObject real_body;
        current_$14 = real_body = current_$14.rest();
        if (!documentation.isString()) {
            documentation = NIL;
            real_body = body;
        }
        final SubLObject macroexpander_arglist = $list177;
        final SubLObject macroexpander_body = list(listS(CDESTRUCTURING_BIND, pattern, $list179, append(real_body, NIL)));
        SubLObject translated_form = NIL;
        final SubLObject method_var = name;
        assert NIL != symbolp(method_var) : "Types.symbolp(method_var) " + "CommonSymbols.NIL != Types.symbolp(method_var) " + method_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_method_scope$.currentBinding(thread);
        try {
            xref_database.$xref_method_scope$.bind(method_var, thread);
            xref_database.xref_note_macro_definition(name);
            xref_database.xref_note_method_formal_arglist(name, pattern);
            final SubLObject translated_arglist = macroexpander_arglist;
            final SubLObject translated_body = translate_method_body(name, macroexpander_body);
            translated_form = listS(DEFINE_MACROEXPANDER, name, translated_arglist, append(NIL != documentation ? list(documentation) : NIL, translated_body, NIL));
        } finally {
            xref_database.$xref_method_scope$.rebind(_prev_bind_0, thread);
        }
        translator_consider_expansion_factor(name, form, translated_form);
        return translated_form;
    }

    public static SubLObject translate_defparameter(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(form, form, $list161);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list161);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list161);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, form, $list161);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list161);
            return NIL;
        }
        list_utilities.verify_operator(operator, DEFPARAMETER);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, $DYNAMIC);
        SubLObject translated_form = NIL;
        final SubLObject global_var = variable;
        assert NIL != symbolp(global_var) : "Types.symbolp(global_var) " + "CommonSymbols.NIL != Types.symbolp(global_var) " + global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, $DYNAMIC);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = listS(DEFPARAMETER, variable, translated_initialization, append(NIL != documentation ? list(documentation) : NIL, NIL));
        } finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }

    public static SubLObject translate_defstruct(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list182);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list182);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, form, $list182);
        name = current.first();
        final SubLObject options;
        current = options = current.rest();
        final SubLObject v_slots;
        current = v_slots = temp;
        list_utilities.verify_operator(operator, DEFSTRUCT);
        final SubLObject analysis = complex_special_forms.defstruct_analyze(name, options, v_slots);
        translate_defstruct_ensure_translated_constants(analysis);
        final SubLObject class_form = bq_cons($sym184$_DEFSTRUCT_CLASS, append(analysis, NIL));
        final SubLObject translated_form = translate_form_via_macroexpansion(form);
        SubLObject current_$16;
        final SubLObject datum_$15 = current_$16 = translated_form;
        SubLObject operator_$17 = NIL;
        destructuring_bind_must_consp(current_$16, datum_$15, $list185);
        operator_$17 = current_$16.first();
        final SubLObject translated_body;
        current_$16 = translated_body = current_$16.rest();
        list_utilities.verify_operator(operator_$17, PROGN);
        final SubLObject final_translated_form = listS(PROGN, class_form, append(translated_body, NIL));
        return final_translated_form;
    }

    public static SubLObject translate_defstruct_ensure_translated_constants(final SubLObject analysis) {
        final SubLObject name_tail = property_list_member($NAME, analysis);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject c_structure_tag_tail = property_list_member($C_STRUCTURE_TAG, analysis);
        final SubLObject c_structure_tag = (NIL != c_structure_tag_tail) ? cadr(c_structure_tag_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, analysis);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject slots_tail = property_list_member($SLOTS, analysis);
        final SubLObject v_slots = (NIL != slots_tail) ? cadr(slots_tail) : NIL;
        final SubLObject slot_keywords_tail = property_list_member($SLOT_KEYWORDS, analysis);
        final SubLObject slot_keywords = (NIL != slot_keywords_tail) ? cadr(slot_keywords_tail) : NIL;
        final SubLObject getters_tail = property_list_member($GETTERS, analysis);
        final SubLObject getters = (NIL != getters_tail) ? cadr(getters_tail) : NIL;
        final SubLObject setters_tail = property_list_member($SETTERS, analysis);
        final SubLObject setters = (NIL != setters_tail) ? cadr(setters_tail) : NIL;
        final SubLObject print_function_tail = property_list_member($PRINT_FUNCTION, analysis);
        SubLObject print_function = (NIL != print_function_tail) ? cadr(print_function_tail) : NIL;
        if (NIL == print_function) {
            print_function = DEFAULT_STRUCT_PRINT_FUNCTION;
        }
        translate_form(list(QUOTE, name));
        translate_form(list(QUOTE, predicate));
        translate_form(list(QUOTE, c_structure_tag));
        translate_form(list(QUOTE, v_slots));
        translate_form(list(QUOTE, slot_keywords));
        translate_form(list(QUOTE, getters));
        translate_form(list(QUOTE, setters));
        translate_form(list(QUOTE, print_function));
        SubLObject end_var;
        SubLObject index;
        for (end_var = add(TWO_INTEGER, length(v_slots)), index = NIL, index = TWO_INTEGER; !index.numGE(end_var); index = number_utilities.f_1X(index)) {
            translate_form(list(QUOTE, index));
        }
        return NIL;
    }

    public static SubLObject translate_defvar(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject variable = NIL;
        destructuring_bind_must_consp(form, form, $list195);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list195);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, form, $list195);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, form, $list195);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list195);
            return NIL;
        }
        list_utilities.verify_operator(operator, DEFVAR);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, $DYNAMIC);
        SubLObject translated_form = NIL;
        final SubLObject global_var = variable;
        assert NIL != symbolp(global_var) : "Types.symbolp(global_var) " + "CommonSymbols.NIL != Types.symbolp(global_var) " + global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, $DYNAMIC);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = listS(DEFVAR, variable, translated_initialization, append(NIL != documentation ? list(documentation) : NIL, NIL));
        } finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }

    public static SubLObject translate_Xdtb(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        destructuring_bind_must_consp(form, form, $list197);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list197);
        condition = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, $sym35$_DTB);
            final SubLObject translated_condition = translate_form(condition);
            return common_optimization.translator_optimize_Xdtb(list($sym35$_DTB, translated_condition));
        }
        cdestructuring_bind_error(form, $list197);
        return NIL;
    }

    public static SubLObject translate_enforce_type(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(form, form, $list81);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list81);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list81);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, ENFORCE_TYPE);
            xref_database.xref_note_function_call(pred);
            final SubLObject translated_object = translate_form(v_object);
            final SubLObject translated_pred = translate_function_symbol(pred);
            translate_form(list(QUOTE, pred));
            return list($sym199$_DP_ENFORCE_TYPE, translated_object, translated_pred);
        }
        cdestructuring_bind_error(form, $list81);
        return NIL;
    }

    public static SubLObject translate_enforce_must(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject form_$18 = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(form, form, $list200);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list200);
        form_$18 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list200);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        list_utilities.verify_operator(operator, ENFORCE_MUST);
        return translate_punless(list(PUNLESS, form_$18, listS(ERROR, format_string, append(v_arguments, NIL))));
    }

    public static SubLObject translate_fif(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        SubLObject true_value = NIL;
        SubLObject false_value = NIL;
        destructuring_bind_must_consp(form, form, $list203);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list203);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list203);
        true_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list203);
        false_value = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, FIF);
            final SubLObject translated_condition = translate_Xdtb(list($sym35$_DTB, condition));
            final SubLObject translated_true_value = translate_form(true_value);
            final SubLObject translated_false_value = translate_form(false_value);
            return common_optimization.translator_optimize_fif(list(FIF, translated_condition, translated_true_value, translated_false_value));
        }
        cdestructuring_bind_error(form, $list203);
        return NIL;
    }

    public static SubLObject translate_function(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject symbol = NIL;
        destructuring_bind_must_consp(form, form, $list205);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list205);
        symbol = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, FUNCTION);
            return translate_form(list(SYMBOL_FUNCTION, list(QUOTE, symbol)));
        }
        cdestructuring_bind_error(form, $list205);
        return NIL;
    }

    public static SubLObject translate_funless(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        SubLObject false_value = NIL;
        destructuring_bind_must_consp(form, form, $list208);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list208);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list208);
        false_value = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, FUNLESS);
            return translate_fif(list(FIF, condition, NIL, false_value));
        }
        cdestructuring_bind_error(form, $list208);
        return NIL;
    }

    public static SubLObject translate_fwhen(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        SubLObject true_value = NIL;
        destructuring_bind_must_consp(form, form, $list210);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list210);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list210);
        true_value = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, FWHEN);
            return translate_fif(listS(FIF, condition, true_value, $list212));
        }
        cdestructuring_bind_error(form, $list210);
        return NIL;
    }

    public static SubLObject translate_ignore(final SubLObject form) {
        return translate_empty_progn(form);
    }

    public static SubLObject translate_multiple_value_list(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject subform = NIL;
        destructuring_bind_must_consp(form, form, $list213);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list213);
        subform = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, MULTIPLE_VALUE_LIST);
            final SubLObject translated_subform = translate_form(subform);
            return list(MULTIPLE_VALUE_LIST, translated_subform);
        }
        cdestructuring_bind_error(form, $list213);
        return NIL;
    }

    public static SubLObject translate_must(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject form_$19 = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(form, form, $list200);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list200);
        form_$19 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list200);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        list_utilities.verify_operator(operator, MUST);
        return translate_punless(list(PUNLESS, $sym216$_IGNORE_MUSTS__, listS(ENFORCE_MUST, form_$19, format_string, append(v_arguments, NIL))));
    }

    public static SubLObject translate_nth_value(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject n = NIL;
        SubLObject subform = NIL;
        destructuring_bind_must_consp(form, form, $list217);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list217);
        n = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list217);
        subform = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, NTH_VALUE);
            final SubLObject translated_n = translate_form(n);
            final SubLObject translated_subform = translate_form(subform);
            return list(NTH_VALUE, translated_n, translated_subform);
        }
        cdestructuring_bind_error(form, $list217);
        return NIL;
    }

    public static SubLObject translate_pcase(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject test_object = NIL;
        destructuring_bind_must_consp(form, form, $list219);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list219);
        test_object = current.first();
        final SubLObject v_clauses;
        current = v_clauses = current.rest();
        list_utilities.verify_operator(operator, PCASE);
        final SubLObject pcase_var = $sym221$PCASE_VAR;
        SubLObject pcond_clauses = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pcond_clauses = cons(translate_pcase_clause(pcase_var, clause), pcond_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return translate_clet_local(list(CLET_LOCAL, list(list(pcase_var, test_object)), bq_cons(PCOND, append(nreverse(pcond_clauses), NIL))));
    }

    public static SubLObject translate_pcase_clause(final SubLObject test_object, final SubLObject clause) {
        SubLObject key = NIL;
        destructuring_bind_must_consp(clause, clause, $list223);
        key = clause.first();
        final SubLObject clause_body;
        final SubLObject current = clause_body = clause.rest();
        SubLObject pcond_test = NIL;
        if (key == OTHERWISE) {
            pcond_test = T;
        } else
            if (key == T) {
                Errors.warn($str225$_AEncountered_a_PCASE_that_uses_T, NIL != translator_current_method() ? cconcatenate($$$Within_, new SubLObject[]{ format_nil.format_nil_s_no_copy(translator_current_method()), $str227$___ }) : $str228$);
                pcond_test = T;
            } else
                if (key.isCons()) {
                    SubLObject disjuncts = NIL;
                    SubLObject cdolist_list_var = key;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        disjuncts = cons(list(EQL, test_object, list_utilities.quotify(item)), disjuncts);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                    pcond_test = bq_cons(COR, append(nreverse(disjuncts), NIL));
                } else {
                    pcond_test = list(EQL, test_object, list_utilities.quotify(key));
                }


        return bq_cons(pcond_test, append(clause_body, NIL));
    }

    public static SubLObject translate_pcond(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list229);
        operator = form.first();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = form.rest();
        list_utilities.verify_operator(operator, PCOND);
        SubLObject translated_clauses = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$21;
            final SubLObject datum_$20 = current_$21 = clause;
            SubLObject condition = NIL;
            destructuring_bind_must_consp(current_$21, datum_$20, $list230);
            condition = current_$21.first();
            final SubLObject clause_body;
            current_$21 = clause_body = current_$21.rest();
            final SubLObject translated_condition = translate_Xdtb(list($sym35$_DTB, condition));
            final SubLObject translated_clause_body = translate_body(clause_body);
            translated_clauses = cons(bq_cons(translated_condition, append(translated_clause_body, NIL)), translated_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return common_optimization.translator_optimize_pcond(bq_cons(PCOND, append(nreverse(translated_clauses), NIL)));
    }

    public static SubLObject translate_pif(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(form, form, $list231);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list231);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list231);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list231);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, PIF);
            return translate_pcond(list(PCOND, list(condition, action), list(T, else_action)));
        }
        cdestructuring_bind_error(form, $list231);
        return NIL;
    }

    public static SubLObject translate_proclaim(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject declaration_specifier = NIL;
        destructuring_bind_must_consp(form, form, $list233);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list233);
        declaration_specifier = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, PROCLAIM);
            final SubLObject evaluated_declaration_specifier = eval(declaration_specifier);
            SubLObject result_forms = NIL;
            if (declaration_specifier.isCons()) {
                SubLObject current_$23;
                final SubLObject datum_$22 = current_$23 = evaluated_declaration_specifier;
                SubLObject declaration_identifier = NIL;
                destructuring_bind_must_consp(current_$23, datum_$22, $list234);
                declaration_identifier = current_$23.first();
                final SubLObject args;
                current_$23 = args = current_$23.rest();
                if (FACCESS == declaration_identifier) {
                    SubLObject current_$24;
                    final SubLObject datum_$23 = current_$24 = args;
                    SubLObject visibility = NIL;
                    destructuring_bind_must_consp(current_$24, datum_$23, $list235);
                    visibility = current_$24.first();
                    final SubLObject v_methods;
                    current_$24 = v_methods = current_$24.rest();
                    if (NIL != list_utilities.member_eqP(visibility, $list236)) {
                        SubLObject cdolist_list_var = v_methods;
                        SubLObject method = NIL;
                        method = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            file_translation.tsf_possibly_note_defined_method_visibility(method, visibility);
                            cdolist_list_var = cdolist_list_var.rest();
                            method = cdolist_list_var.first();
                        } 
                    }
                } else
                    if (VACCESS == declaration_identifier) {
                        SubLObject current_$25;
                        final SubLObject datum_$24 = current_$25 = args;
                        SubLObject visibility = NIL;
                        destructuring_bind_must_consp(current_$25, datum_$24, $list237);
                        visibility = current_$25.first();
                        final SubLObject globals;
                        current_$25 = globals = current_$25.rest();
                        if (NIL != list_utilities.member_eqP(visibility, $list236)) {
                            SubLObject cdolist_list_var = globals;
                            SubLObject global = NIL;
                            global = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                file_translation.tsf_possibly_note_defined_global_visibility(global, visibility);
                                cdolist_list_var = cdolist_list_var.rest();
                                global = cdolist_list_var.first();
                            } 
                        }
                    } else
                        if (((OPTIMIZE_FUNCALL == declaration_identifier) || (INLINE == declaration_identifier)) || (NOTINLINE == declaration_identifier)) {
                            result_forms = cons(list($sym240$_PROCLAIM, list_utilities.quotify(evaluated_declaration_specifier)), result_forms);
                        }


            }
            return translate_progn(bq_cons(PROGN, append(nreverse(result_forms), NIL)));
        }
        cdestructuring_bind_error(form, $list233);
        return NIL;
    }

    public static SubLObject translate_progn(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, PROGN);
        final SubLObject translated_body = translate_body(body);
        return common_optimization.translator_optimize_progn(bq_cons(PROGN, append(translated_body, NIL)));
    }

    public static SubLObject translate_punless(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        destructuring_bind_must_consp(form, form, $list242);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list242);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, PUNLESS);
        return translate_pcond(listS(PCOND, bq_cons(list(CNOT, condition), append(body, NIL)), $list243));
    }

    public static SubLObject translate_pwhen(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject condition = NIL;
        destructuring_bind_must_consp(form, form, $list242);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list242);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, PWHEN);
        return translate_pcond(listS(PCOND, bq_cons(condition, append(body, NIL)), $list243));
    }

    public static SubLObject translate_quote(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(form, form, $list245);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list245);
        v_object = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list245);
            return NIL;
        }
        list_utilities.verify_operator(operator, QUOTE);
        final SubLObject object_to_use = file_translation.tsf_possibly_convert_internal_constant(v_object);
        if (object_to_use.eql(v_object)) {
            return form;
        }
        return object_to_use;
    }

    public static SubLObject translate_ret(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject expression = NIL;
        destructuring_bind_must_consp(form, form, $list100);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list100);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, RET);
            if (NIL != translator_within_binding_constructP()) {
                file_translation.tsf_possibly_note_method_returns_within_binding_construct(translator_current_method());
                translate_form($list246);
            }
            final SubLObject translated_expression = translate_form(expression);
            return list(RET, translated_expression);
        }
        cdestructuring_bind_error(form, $list100);
        return NIL;
    }

    public static SubLObject translate_with_error_handler(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject handler = NIL;
        destructuring_bind_must_consp(form, form, $list247);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list247);
        handler = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, WITH_ERROR_HANDLER);
        final SubLObject translated_handler = translate_form(handler);
        final SubLObject translated_body = translate_binding_construct_body(body);
        final SubLObject catch_var = $sym249$CATCH_VAR;
        final SubLObject error_var = $sym250$ERROR_VAR;
        return listS($sym251$_WITH_ERROR_HANDLER, list(translated_handler, catch_var, error_var), append(translated_body, NIL));
    }

    public static SubLObject translate_with_process_resource_tracking(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject var = NIL;
        destructuring_bind_must_consp(form, form, $list145);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list145);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, WITH_PROCESS_RESOURCE_TRACKING);
        final SubLObject resource_tracking_env_var = $sym253$RESOURCE_TRACKING_ENV_VAR;
        final SubLObject translated_body = translate_binding_construct_body(body);
        return listS($sym254$_WITH_PROCESS_RESOURCE_TRACKING, resource_tracking_env_var, var, append(translated_body, NIL));
    }

    public static SubLObject translate_with_static_area(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, WITH_STATIC_AREA);
        return translate_clet(listS(CLET, $list256, append(body, NIL)));
    }

    public static SubLObject translate_with_thread_private_area(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, WITH_THREAD_PRIVATE_AREA);
        return translate_clet(listS(CLET, $list258, append(body, NIL)));
    }

    public static SubLObject translate_with_working_area(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, WITH_WORKING_AREA);
        return translate_clet(listS(CLET, $list260, append(body, NIL)));
    }

    public static SubLObject translate_clet_bind(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject dynamic_bindings = NIL;
        destructuring_bind_must_consp(form, form, $list261);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list261);
        dynamic_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CLET_BIND);
        if (NIL == dynamic_bindings) {
            return translate_progn(bq_cons(PROGN, append(body, NIL)));
        }
        SubLObject translated_bindings = NIL;
        final SubLObject translated_body = translate_binding_construct_body(body);
        SubLObject cdolist_list_var = dynamic_bindings;
        SubLObject dynamic_binding = NIL;
        dynamic_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$29;
            final SubLObject datum_$28 = current_$29 = dynamic_binding;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current_$29, datum_$28, $list262);
            variable = current_$29.first();
            current_$29 = current_$29.rest();
            destructuring_bind_must_consp(current_$29, datum_$28, $list262);
            initialization = current_$29.first();
            current_$29 = current_$29.rest();
            if (NIL == current_$29) {
                xref_database.xref_note_global_binding(variable);
                final SubLObject translated_variable = translate_variable(variable);
                final SubLObject translated_initialization = translate_form(initialization);
                translated_bindings = cons(list(translated_variable, translated_initialization), translated_bindings);
            } else {
                cdestructuring_bind_error(datum_$28, $list262);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dynamic_binding = cdolist_list_var.first();
        } 
        return common_optimization.translator_optimize_clet_bind(listS(CLET_BIND, nreverse(translated_bindings), append(translated_body, NIL)));
    }

    public static SubLObject translate_clet_local(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject local_bindings = NIL;
        destructuring_bind_must_consp(form, form, $list263);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list263);
        local_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, CLET_LOCAL);
        if (NIL == local_bindings) {
            return translate_progn(bq_cons(PROGN, append(body, NIL)));
        }
        SubLObject translated_bindings = NIL;
        final SubLObject translated_body = translate_body(body);
        SubLObject cdolist_list_var = local_bindings;
        SubLObject local_binding = NIL;
        local_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$31;
            final SubLObject datum_$30 = current_$31 = local_binding;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current_$31, datum_$30, $list262);
            variable = current_$31.first();
            current_$31 = current_$31.rest();
            destructuring_bind_must_consp(current_$31, datum_$30, $list262);
            initialization = current_$31.first();
            current_$31 = current_$31.rest();
            if (NIL == current_$31) {
                final SubLObject translated_variable = translate_variable(variable);
                final SubLObject translated_initialization = translate_form(initialization);
                translated_bindings = cons(list(translated_variable, translated_initialization), translated_bindings);
            } else {
                cdestructuring_bind_error(datum_$30, $list262);
            }
            cdolist_list_var = cdolist_list_var.rest();
            local_binding = cdolist_list_var.first();
        } 
        return common_optimization.translator_optimize_clet_local(listS(CLET_LOCAL, nreverse(translated_bindings), append(translated_body, NIL)));
    }

    public static SubLObject translate_code_comment(final SubLObject form) {
        return form;
    }

    public static SubLObject translate_defstruct_construct(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject c_structure_tag = NIL;
        SubLObject size = NIL;
        SubLObject type_var = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(form, form, $list264);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list264);
        c_structure_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list264);
        size = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list264);
        type_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list264);
        type = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list264);
            return NIL;
        }
        list_utilities.verify_operator(operator, _DEFSTRUCT_CONSTRUCT);
        if (((NIL != c_structure_tag) && (!assertionsDisabledSynth)) && (NIL == integerp(c_structure_tag))) {
            throw new AssertionError(c_structure_tag);
        }
        assert NIL != integerp(size) : "Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) " + size;
        assert NIL != symbolp(type_var) : "Types.symbolp(type_var) " + "CommonSymbols.NIL != Types.symbolp(type_var) " + type_var;
        assert NIL != symbolp(type) : "Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) " + type;
        final SubLObject translated_type_var = translate_variable(type_var);
        return list(_DEFSTRUCT_CONSTRUCT, c_structure_tag, size, translated_type_var, type);
    }

    public static SubLObject translate_defstruct_get_slot(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_object = NIL;
        SubLObject index = NIL;
        SubLObject type = NIL;
        SubLObject slot = NIL;
        destructuring_bind_must_consp(form, form, $list267);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list267);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list267);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list267);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list267);
        slot = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list267);
            return NIL;
        }
        list_utilities.verify_operator(operator, _DEFSTRUCT_GET_SLOT);
        assert NIL != symbolp(type) : "Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) " + type;
        assert NIL != symbolp(slot) : "Types.symbolp(slot) " + "CommonSymbols.NIL != Types.symbolp(slot) " + slot;
        final SubLObject translated_object = translate_form(v_object);
        return list(_DEFSTRUCT_GET_SLOT, translated_object, index, type, slot);
    }

    public static SubLObject translate_defstruct_object_p(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_object = NIL;
        SubLObject c_structure_tag = NIL;
        SubLObject type_var = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(form, form, $list269);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list269);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list269);
        c_structure_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list269);
        type_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list269);
        type = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list269);
            return NIL;
        }
        list_utilities.verify_operator(operator, _DEFSTRUCT_OBJECT_P);
        if (((NIL != c_structure_tag) && (!assertionsDisabledSynth)) && (NIL == integerp(c_structure_tag))) {
            throw new AssertionError(c_structure_tag);
        }
        assert NIL != symbolp(type_var) : "Types.symbolp(type_var) " + "CommonSymbols.NIL != Types.symbolp(type_var) " + type_var;
        assert NIL != symbolp(type) : "Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) " + type;
        final SubLObject translated_object = translate_form(v_object);
        final SubLObject translated_type_var = translate_variable(type_var);
        return list(_DEFSTRUCT_OBJECT_P, translated_object, c_structure_tag, translated_type_var, type);
    }

    public static SubLObject translate_defstruct_set_slot(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject v_object = NIL;
        SubLObject index = NIL;
        SubLObject value = NIL;
        SubLObject type = NIL;
        SubLObject slot = NIL;
        destructuring_bind_must_consp(form, form, $list271);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list271);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list271);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list271);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list271);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list271);
        slot = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list271);
            return NIL;
        }
        list_utilities.verify_operator(operator, _DEFSTRUCT_SET_SLOT);
        assert NIL != symbolp(type) : "Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) " + type;
        assert NIL != symbolp(slot) : "Types.symbolp(slot) " + "CommonSymbols.NIL != Types.symbolp(slot) " + slot;
        final SubLObject translated_object = translate_form(v_object);
        final SubLObject translated_value = translate_form(value);
        return list(_DEFSTRUCT_SET_SLOT, translated_object, index, translated_value, type, slot);
    }

    public static SubLObject translate_Xfor(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list273);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list273);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject initializations = NIL;
        SubLObject test = NIL;
        SubLObject updates = NIL;
        destructuring_bind_must_consp(current, form, $list273);
        initializations = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list273);
        test = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list273);
        updates = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, $sym53$_FOR);
            final SubLObject translated_initializations = translate_body(initializations);
            final SubLObject translated_test = translate_form(test);
            final SubLObject translated_updates = translate_body(updates);
            final SubLObject translated_body = translate_body(body);
            return common_optimization.translator_optimize_Xfor(listS($sym53$_FOR, list(translated_initializations, list($sym35$_DTB, translated_test), translated_updates), append(translated_body, NIL)));
        }
        cdestructuring_bind_error(form, $list273);
        return NIL;
    }

    public static SubLObject translate_for(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list274);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list274);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_bindings = NIL;
        SubLObject test = NIL;
        SubLObject updates = NIL;
        destructuring_bind_must_consp(current, form, $list274);
        v_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list274);
        test = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, form, $list274);
        updates = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            list_utilities.verify_operator(operator, FOR);
            thread.resetMultipleValues();
            final SubLObject clet_vars = translate_for_bindings(v_bindings);
            final SubLObject initializations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return translate_clet(list(CLET, clet_vars, listS($sym53$_FOR, list(initializations, test, updates), append(body, NIL))));
        }
        cdestructuring_bind_error(form, $list274);
        return NIL;
    }

    public static SubLObject translate_for_bindings(final SubLObject v_bindings) {
        SubLObject clet_vars = NIL;
        SubLObject initializations = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list275);
            variable = current.first();
            current = current.rest();
            final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list275);
            current = current.rest();
            if (NIL == current) {
                clet_vars = cons(variable, clet_vars);
                initializations = cons(list(CSETQ, variable, initialization), initializations);
            } else {
                cdestructuring_bind_error(datum, $list275);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return values(nreverse(clet_vars), nreverse(initializations));
    }

    public static SubLObject translate_in_package(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject name = NIL;
        destructuring_bind_must_consp(form, form, $list276);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list276);
        name = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(form, $list276);
            return NIL;
        }
        list_utilities.verify_operator(operator, IN_PACKAGE);
        if (NIL != translator_current_method()) {
            return translate_csetq(list(CSETQ, $package$, list(FIND_PACKAGE, list(QUOTE, name))));
        }
        return form;
    }

    public static SubLObject translate_Xmval(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject n = NIL;
        destructuring_bind_must_consp(form, form, $list280);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list280);
        n = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(operator, $sym99$_MVAL);
            final SubLObject translated_n = translate_form(n);
            return list($sym99$_MVAL, translated_n);
        }
        cdestructuring_bind_error(form, $list280);
        return NIL;
    }

    public static SubLObject translate_Xreset_mval(final SubLObject form) {
        return form;
    }

    public static SubLObject translate_until(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject test = NIL;
        destructuring_bind_must_consp(form, form, $list281);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list281);
        test = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, UNTIL);
        final SubLObject negated_test = list(CNOT, test);
        return translate_while(listS(WHILE, negated_test, append(body, NIL)));
    }

    public static SubLObject translate_while(final SubLObject form) {
        SubLObject operator = NIL;
        SubLObject test = NIL;
        destructuring_bind_must_consp(form, form, $list281);
        operator = form.first();
        SubLObject current = form.rest();
        destructuring_bind_must_consp(current, form, $list281);
        test = current.first();
        final SubLObject body;
        current = body = current.rest();
        list_utilities.verify_operator(operator, WHILE);
        final SubLObject translated_test = translate_form(test);
        final SubLObject translated_body = translate_body(body);
        return listS(WHILE, list($sym35$_DTB, translated_test), append(translated_body, NIL));
    }

    public static SubLObject translator_implementation_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL != list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values($translator_implementation_symbols$.getGlobalValue(), v_object, symbol_function(EQ), UNPROVIDED))));
    }

    public static SubLObject translate_implementation_symbol(final SubLObject symbol) {
        return list_utilities.alist_lookup_without_values($translator_implementation_symbols$.getGlobalValue(), symbol, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject possibly_translate_implementation_symbols(SubLObject form) {
        if (NIL != translator_implementation_symbol_p(form)) {
            form = translate_implementation_symbol(form);
        } else
            if (form.isCons()) {
                SubLObject current;
                final SubLObject datum = current = form;
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list284);
                operator = current.first();
                current = args = current.rest();
                if (NIL != translator_implementation_symbol_p(operator)) {
                    operator = translate_implementation_symbol(operator);
                    form = bq_cons(operator, append(args, NIL));
                }
            }

        return form;
    }

    public static SubLObject clet_bind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject dynamic_bindings = NIL;
        destructuring_bind_must_consp(current, datum, $list285);
        dynamic_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == dynamic_bindings) {
            return bq_cons(PROGN, append(body, NIL));
        }
        return listS(CLET, dynamic_bindings, append(body, NIL));
    }

    public static SubLObject clet_local(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject local_bindings = NIL;
        destructuring_bind_must_consp(current, datum, $list286);
        local_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == local_bindings) {
            return bq_cons(PROGN, append(body, NIL));
        }
        return listS(CLET, local_bindings, append(body, NIL));
    }

    public static SubLObject csetq_dynamic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, variable, value);
        }
        cdestructuring_bind_error(datum, $list287);
        return NIL;
    }

    public static SubLObject csetq_lexical(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, variable, value);
        }
        cdestructuring_bind_error(datum, $list287);
        return NIL;
    }

    public static SubLObject csetq_local(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, variable, value);
        }
        cdestructuring_bind_error(datum, $list287);
        return NIL;
    }

    public static SubLObject sublisp_for(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list288);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_bindings = NIL;
        SubLObject test = NIL;
        SubLObject updates = NIL;
        destructuring_bind_must_consp(current, datum, $list288);
        v_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list288);
        test = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list288);
        updates = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, v_bindings, listS(WHILE, list(CNOT, test), append(body, updates, NIL)));
        }
        cdestructuring_bind_error(datum, $list288);
        return NIL;
    }

    public static SubLObject Xfor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list289);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject initializations = NIL;
        SubLObject test = NIL;
        SubLObject updates = NIL;
        destructuring_bind_must_consp(current, datum, $list289);
        initializations = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list289);
        test = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list289);
        updates = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return bq_cons(PROGN, append(initializations, list(listS(WHILE, list(CNOT, test), append(body, updates, NIL)))));
        }
        cdestructuring_bind_error(datum, $list289);
        return NIL;
    }

    public static SubLObject Xcdohash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject table = NIL;
        SubLObject table_var = NIL;
        SubLObject iterator_var = NIL;
        SubLObject entry_var = NIL;
        destructuring_bind_must_consp(current, datum, $list290);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        table = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        table_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        iterator_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        entry_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list290);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(iterator_var) : "Types.symbolp(iterator_var) " + "CommonSymbols.NIL != Types.symbolp(iterator_var) " + iterator_var;
        assert NIL != symbolp(entry_var) : "Types.symbolp(entry_var) " + "CommonSymbols.NIL != Types.symbolp(entry_var) " + entry_var;
        return list(CLET, list(list(table_var, table)), listS(CDOHASH, list(key, val, table_var), append(body, NIL)));
    }

    public static SubLObject Xccatch(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tag = NIL;
        SubLObject ans_var = NIL;
        SubLObject env_var = NIL;
        destructuring_bind_must_consp(current, datum, $list291);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        ans_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        env_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list291);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(env_var) : "Types.symbolp(env_var) " + "CommonSymbols.NIL != Types.symbolp(env_var) " + env_var;
        return listS(CCATCH, tag, ans_var, append(body, NIL));
    }

    public static SubLObject Xcunwind_protect(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject env_var = NIL;
        SubLObject protected_form = NIL;
        destructuring_bind_must_consp(current, datum, $list292);
        env_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list292);
        protected_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        assert NIL != symbolp(env_var) : "Types.symbolp(env_var) " + "CommonSymbols.NIL != Types.symbolp(env_var) " + env_var;
        return listS(CUNWIND_PROTECT, protected_form, append(body, NIL));
    }

    public static SubLObject Xcprogv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list293);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject special_vars = NIL;
        SubLObject v_bindings = NIL;
        SubLObject internal_var = NIL;
        destructuring_bind_must_consp(current, datum, $list293);
        special_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list293);
        v_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list293);
        internal_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list293);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(internal_var) : "Types.symbolp(internal_var) " + "CommonSymbols.NIL != Types.symbolp(internal_var) " + internal_var;
        return listS(CPROGV, special_vars, v_bindings, append(body, NIL));
    }

    public static SubLObject Xcdo_symbols(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list294);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sym = NIL;
        SubLObject v_package = NIL;
        SubLObject package_var = NIL;
        SubLObject iterator_var = NIL;
        destructuring_bind_must_consp(current, datum, $list294);
        sym = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list294);
        v_package = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list294);
        package_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list294);
        iterator_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list294);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(package_var) : "Types.symbolp(package_var) " + "CommonSymbols.NIL != Types.symbolp(package_var) " + package_var;
        assert NIL != symbolp(iterator_var) : "Types.symbolp(iterator_var) " + "CommonSymbols.NIL != Types.symbolp(iterator_var) " + iterator_var;
        return listS(CDO_SYMBOLS, list(sym, v_package), append(body, NIL));
    }

    public static SubLObject Xwith_error_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list295);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler = NIL;
        SubLObject catch_var = NIL;
        SubLObject error_var = NIL;
        destructuring_bind_must_consp(current, datum, $list295);
        handler = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list295);
        catch_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list295);
        error_var = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list295);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(catch_var) : "Types.symbolp(catch_var) " + "CommonSymbols.NIL != Types.symbolp(catch_var) " + catch_var;
        assert NIL != symbolp(error_var) : "Types.symbolp(error_var) " + "CommonSymbols.NIL != Types.symbolp(error_var) " + error_var;
        return listS(WITH_ERROR_HANDLER, handler, append(body, NIL));
    }

    public static SubLObject Xwith_process_resource_tracking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject resource_var = NIL;
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list296);
        resource_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        result_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        assert NIL != symbolp(resource_var) : "Types.symbolp(resource_var) " + "CommonSymbols.NIL != Types.symbolp(resource_var) " + resource_var;
        assert NIL != symbolp(result_var) : "Types.symbolp(result_var) " + "CommonSymbols.NIL != Types.symbolp(result_var) " + result_var;
        return listS(WITH_PROCESS_RESOURCE_TRACKING, result_var, append(body, NIL));
    }

    public static SubLObject Xwith_current_thread(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject thread_var = NIL;
        destructuring_bind_must_consp(current, datum, $list297);
        thread_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        assert NIL != symbolp(thread_var) : "Types.symbolp(thread_var) " + "CommonSymbols.NIL != Types.symbolp(thread_var) " + thread_var;
        return listS(CLET, list(bq_cons(thread_var, $list298)), append(body, NIL));
    }

    public static SubLObject declare_form_translation_file() {
        declareFunction(me, "translator_within_binding_constructP", "TRANSLATOR-WITHIN-BINDING-CONSTRUCT?", 0, 0, false);
        declareFunction(me, "translate_form", "TRANSLATE-FORM", 1, 0, false);
        declareFunction(me, "test_translate_form", "TEST-TRANSLATE-FORM", 1, 2, false);
        declareFunction(me, "translate_atom", "TRANSLATE-ATOM", 1, 0, false);
        declareFunction(me, "translate_constant_atom", "TRANSLATE-CONSTANT-ATOM", 1, 0, false);
        declareFunction(me, "translator_variable_binding_type", "TRANSLATOR-VARIABLE-BINDING-TYPE", 1, 0, false);
        declareFunction(me, "translate_variable_reference", "TRANSLATE-VARIABLE-REFERENCE", 1, 0, false);
        declareFunction(me, "translate_variable", "TRANSLATE-VARIABLE", 1, 0, false);
        declareFunction(me, "translate_form_via_translator", "TRANSLATE-FORM-VIA-TRANSLATOR", 2, 0, false);
        declareFunction(me, "translate_form_via_macroexpansion", "TRANSLATE-FORM-VIA-MACROEXPANSION", 1, 0, false);
        declareFunction(me, "translate_form_as_function_call", "TRANSLATE-FORM-AS-FUNCTION-CALL", 1, 0, false);
        declareFunction(me, "translate_function_symbol", "TRANSLATE-FUNCTION-SYMBOL", 1, 0, false);
        declareFunction(me, "vaccess_level", "VACCESS-LEVEL", 1, 0, false);
        declareFunction(me, "faccess_level", "FACCESS-LEVEL", 1, 0, false);
        declareFunction(me, "private_global_p", "PRIVATE-GLOBAL-P", 1, 0, false);
        declareFunction(me, "private_method_p", "PRIVATE-METHOD-P", 1, 0, false);
        declareFunction(me, "translate_body", "TRANSLATE-BODY", 1, 0, false);
        declareFunction(me, "translate_arglist", "TRANSLATE-ARGLIST", 1, 0, false);
        declareFunction(me, "translate_empty_progn", "TRANSLATE-EMPTY-PROGN", 0, 1, false);
        declareFunction(me, "binding_type_p", "BINDING-TYPE-P", 1, 0, false);
        declareFunction(me, "dynamic_global_p", "DYNAMIC-GLOBAL-P", 1, 0, false);
        declareFunction(me, "lexical_global_p", "LEXICAL-GLOBAL-P", 1, 0, false);
        declareFunction(me, "constant_global_p", "CONSTANT-GLOBAL-P", 1, 0, false);
        declareFunction(me, "global_binding_type", "GLOBAL-BINDING-TYPE", 1, 0, false);
        declareFunction(me, "optimize_funcall_p", "OPTIMIZE-FUNCALL-P", 1, 0, false);
        declareFunction(me, "translator_consider_expansion_factor", "TRANSLATOR-CONSIDER-EXPANSION-FACTOR", 3, 0, false);
        declareFunction(me, "translate_form_expansion_factor", "TRANSLATE-FORM-EXPANSION-FACTOR", 3, 0, false);
        declareFunction(me, "translate_form_expansion_factor_int", "TRANSLATE-FORM-EXPANSION-FACTOR-INT", 2, 0, false);
        declareFunction(me, "show_translation_expansion_factor_stats", "SHOW-TRANSLATION-EXPANSION-FACTOR-STATS", 0, 2, false);
        declareFunction(me, "operator_translator", "OPERATOR-TRANSLATOR", 1, 0, false);
        declareFunction(me, "translate_cand", "TRANSLATE-CAND", 1, 0, false);
        declareFunction(me, "translate_ccatch", "TRANSLATE-CCATCH", 1, 0, false);
        declareFunction(me, "translate_binding_construct_body", "TRANSLATE-BINDING-CONSTRUCT-BODY", 1, 0, false);
        declareFunction(me, "translate_binding_construct_form", "TRANSLATE-BINDING-CONSTRUCT-FORM", 1, 0, false);
        declareFunction(me, "translate_cdec", "TRANSLATE-CDEC", 1, 0, false);
        declareFunction(me, "translate_cdo", "TRANSLATE-CDO", 1, 0, false);
        declareFunction(me, "translate_Xcdo_symbols", "TRANSLATE-%CDO-SYMBOLS", 1, 0, false);
        declareFunction(me, "translate_cdo_symbols", "TRANSLATE-CDO-SYMBOLS", 1, 0, false);
        declareFunction(me, "translate_Xcdohash", "TRANSLATE-%CDOHASH", 1, 0, false);
        declareFunction(me, "translate_cdohash", "TRANSLATE-CDOHASH", 1, 0, false);
        declareFunction(me, "translate_cdolist", "TRANSLATE-CDOLIST", 1, 0, false);
        declareFunction(me, "translate_cdotimes", "TRANSLATE-CDOTIMES", 1, 0, false);
        declareFunction(me, "translate_check_type", "TRANSLATE-CHECK-TYPE", 1, 0, false);
        declareFunction(me, "translate_cinc", "TRANSLATE-CINC", 1, 0, false);
        declareFunction(me, "translate_clet", "TRANSLATE-CLET", 1, 0, false);
        declareFunction(me, "translate_clet_int", "TRANSLATE-CLET-INT", 3, 0, false);
        declareFunction(me, "translate_final_clet_body", "TRANSLATE-FINAL-CLET-BODY", 2, 0, false);
        declareFunction(me, "translate_cmultiple_value_bind", "TRANSLATE-CMULTIPLE-VALUE-BIND", 1, 0, false);
        declareFunction(me, "translate_cmultiple_value_bind_bindings", "TRANSLATE-CMULTIPLE-VALUE-BIND-BINDINGS", 2, 0, false);
        declareFunction(me, "translate_cnot", "TRANSLATE-CNOT", 1, 0, false);
        declareFunction(me, "translate_cor", "TRANSLATE-COR", 1, 0, false);
        declareFunction(me, "translate_cpop", "TRANSLATE-CPOP", 1, 0, false);
        declareFunction(me, "translate_cprogv", "TRANSLATE-CPROGV", 1, 0, false);
        declareFunction(me, "translate_cpush", "TRANSLATE-CPUSH", 1, 0, false);
        declareFunction(me, "translate_cpushnew", "TRANSLATE-CPUSHNEW", 1, 0, false);
        declareFunction(me, "translate_csetf", "TRANSLATE-CSETF", 1, 0, false);
        declareFunction(me, "translator_setter_from_accessor", "TRANSLATOR-SETTER-FROM-ACCESSOR", 1, 0, false);
        declareFunction(me, "translate_csetq", "TRANSLATE-CSETQ", 1, 0, false);
        declareFunction(me, "translate_csetq_int", "TRANSLATE-CSETQ-INT", 1, 0, false);
        declareFunction(me, "translate_possibly_note_global_modification", "TRANSLATE-POSSIBLY-NOTE-GLOBAL-MODIFICATION", 1, 0, false);
        declareFunction(me, "translate_csome", "TRANSLATE-CSOME", 1, 0, false);
        declareFunction(me, "translate_ctime", "TRANSLATE-CTIME", 1, 0, false);
        declareFunction(me, "translate_cunwind_protect", "TRANSLATE-CUNWIND-PROTECT", 1, 0, false);
        declareFunction(me, "translate_cvs_id", "TRANSLATE-CVS-ID", 1, 0, false);
        declareFunction(me, "translate_declaim", "TRANSLATE-DECLAIM", 1, 0, false);
        declareFunction(me, "translate_declare", "TRANSLATE-DECLARE", 1, 0, false);
        declareFunction(me, "translate_defconstant", "TRANSLATE-DEFCONSTANT", 1, 0, false);
        declareFunction(me, "translate_define", "TRANSLATE-DEFINE", 1, 0, false);
        declareFunction(me, "translator_current_method", "TRANSLATOR-CURRENT-METHOD", 0, 0, false);
        declareFunction(me, "translate_method_body", "TRANSLATE-METHOD-BODY", 2, 0, false);
        declareFunction(me, "translate_method_possibly_add_final_ret", "TRANSLATE-METHOD-POSSIBLY-ADD-FINAL-RET", 1, 0, false);
        declareFunction(me, "translate_method_possibly_add_entry", "TRANSLATE-METHOD-POSSIBLY-ADD-ENTRY", 2, 0, false);
        declareFunction(me, "translate_method_possibly_add_with_current_thread", "TRANSLATE-METHOD-POSSIBLY-ADD-WITH-CURRENT-THREAD", 1, 0, false);
        declareFunction(me, "translator_body_accesses_current_thread_p", "TRANSLATOR-BODY-ACCESSES-CURRENT-THREAD-P", 1, 0, false);
        declareFunction(me, "translator_current_thread_access_construct_p", "TRANSLATOR-CURRENT-THREAD-ACCESS-CONSTRUCT-P", 1, 0, false);
        declareFunction(me, "translate_deflexical", "TRANSLATE-DEFLEXICAL", 1, 0, false);
        declareFunction(me, "translate_defmacro", "TRANSLATE-DEFMACRO", 1, 0, false);
        declareFunction(me, "translate_defparameter", "TRANSLATE-DEFPARAMETER", 1, 0, false);
        declareFunction(me, "translate_defstruct", "TRANSLATE-DEFSTRUCT", 1, 0, false);
        declareFunction(me, "translate_defstruct_ensure_translated_constants", "TRANSLATE-DEFSTRUCT-ENSURE-TRANSLATED-CONSTANTS", 1, 0, false);
        declareFunction(me, "translate_defvar", "TRANSLATE-DEFVAR", 1, 0, false);
        declareFunction(me, "translate_Xdtb", "TRANSLATE-%DTB", 1, 0, false);
        declareFunction(me, "translate_enforce_type", "TRANSLATE-ENFORCE-TYPE", 1, 0, false);
        declareFunction(me, "translate_enforce_must", "TRANSLATE-ENFORCE-MUST", 1, 0, false);
        declareFunction(me, "translate_fif", "TRANSLATE-FIF", 1, 0, false);
        declareFunction(me, "translate_function", "TRANSLATE-FUNCTION", 1, 0, false);
        declareFunction(me, "translate_funless", "TRANSLATE-FUNLESS", 1, 0, false);
        declareFunction(me, "translate_fwhen", "TRANSLATE-FWHEN", 1, 0, false);
        declareFunction(me, "translate_ignore", "TRANSLATE-IGNORE", 1, 0, false);
        declareFunction(me, "translate_multiple_value_list", "TRANSLATE-MULTIPLE-VALUE-LIST", 1, 0, false);
        declareFunction(me, "translate_must", "TRANSLATE-MUST", 1, 0, false);
        declareFunction(me, "translate_nth_value", "TRANSLATE-NTH-VALUE", 1, 0, false);
        declareFunction(me, "translate_pcase", "TRANSLATE-PCASE", 1, 0, false);
        declareFunction(me, "translate_pcase_clause", "TRANSLATE-PCASE-CLAUSE", 2, 0, false);
        declareFunction(me, "translate_pcond", "TRANSLATE-PCOND", 1, 0, false);
        declareFunction(me, "translate_pif", "TRANSLATE-PIF", 1, 0, false);
        declareFunction(me, "translate_proclaim", "TRANSLATE-PROCLAIM", 1, 0, false);
        declareFunction(me, "translate_progn", "TRANSLATE-PROGN", 1, 0, false);
        declareFunction(me, "translate_punless", "TRANSLATE-PUNLESS", 1, 0, false);
        declareFunction(me, "translate_pwhen", "TRANSLATE-PWHEN", 1, 0, false);
        declareFunction(me, "translate_quote", "TRANSLATE-QUOTE", 1, 0, false);
        declareFunction(me, "translate_ret", "TRANSLATE-RET", 1, 0, false);
        declareFunction(me, "translate_with_error_handler", "TRANSLATE-WITH-ERROR-HANDLER", 1, 0, false);
        declareFunction(me, "translate_with_process_resource_tracking", "TRANSLATE-WITH-PROCESS-RESOURCE-TRACKING", 1, 0, false);
        declareFunction(me, "translate_with_static_area", "TRANSLATE-WITH-STATIC-AREA", 1, 0, false);
        declareFunction(me, "translate_with_thread_private_area", "TRANSLATE-WITH-THREAD-PRIVATE-AREA", 1, 0, false);
        declareFunction(me, "translate_with_working_area", "TRANSLATE-WITH-WORKING-AREA", 1, 0, false);
        declareFunction(me, "translate_clet_bind", "TRANSLATE-CLET-BIND", 1, 0, false);
        declareFunction(me, "translate_clet_local", "TRANSLATE-CLET-LOCAL", 1, 0, false);
        declareFunction(me, "translate_code_comment", "TRANSLATE-CODE-COMMENT", 1, 0, false);
        declareFunction(me, "translate_defstruct_construct", "TRANSLATE-DEFSTRUCT-CONSTRUCT", 1, 0, false);
        declareFunction(me, "translate_defstruct_get_slot", "TRANSLATE-DEFSTRUCT-GET-SLOT", 1, 0, false);
        declareFunction(me, "translate_defstruct_object_p", "TRANSLATE-DEFSTRUCT-OBJECT-P", 1, 0, false);
        declareFunction(me, "translate_defstruct_set_slot", "TRANSLATE-DEFSTRUCT-SET-SLOT", 1, 0, false);
        declareFunction(me, "translate_Xfor", "TRANSLATE-%FOR", 1, 0, false);
        declareFunction(me, "translate_for", "TRANSLATE-FOR", 1, 0, false);
        declareFunction(me, "translate_for_bindings", "TRANSLATE-FOR-BINDINGS", 1, 0, false);
        declareFunction(me, "translate_in_package", "TRANSLATE-IN-PACKAGE", 1, 0, false);
        declareFunction(me, "translate_Xmval", "TRANSLATE-%MVAL", 1, 0, false);
        declareFunction(me, "translate_Xreset_mval", "TRANSLATE-%RESET-MVAL", 1, 0, false);
        declareFunction(me, "translate_until", "TRANSLATE-UNTIL", 1, 0, false);
        declareFunction(me, "translate_while", "TRANSLATE-WHILE", 1, 0, false);
        declareFunction(me, "translator_implementation_symbol_p", "TRANSLATOR-IMPLEMENTATION-SYMBOL-P", 1, 0, false);
        declareFunction(me, "translate_implementation_symbol", "TRANSLATE-IMPLEMENTATION-SYMBOL", 1, 0, false);
        declareFunction(me, "possibly_translate_implementation_symbols", "POSSIBLY-TRANSLATE-IMPLEMENTATION-SYMBOLS", 1, 0, false);
        declareMacro(me, "clet_bind", "CLET-BIND");
        declareMacro(me, "clet_local", "CLET-LOCAL");
        declareMacro(me, "csetq_dynamic", "CSETQ-DYNAMIC");
        declareMacro(me, "csetq_lexical", "CSETQ-LEXICAL");
        declareMacro(me, "csetq_local", "CSETQ-LOCAL");
        declareMacro(me, "sublisp_for", "FOR");
        declareMacro(me, "Xfor", "%FOR");
        declareMacro(me, "Xcdohash", "%CDOHASH");
        declareMacro(me, "Xccatch", "%CCATCH");
        declareMacro(me, "Xcunwind_protect", "%CUNWIND-PROTECT");
        declareMacro(me, "Xcprogv", "%CPROGV");
        declareMacro(me, "Xcdo_symbols", "%CDO-SYMBOLS");
        declareMacro(me, "Xwith_error_handler", "%WITH-ERROR-HANDLER");
        declareMacro(me, "Xwith_process_resource_tracking", "%WITH-PROCESS-RESOURCE-TRACKING");
        declareMacro(me, "Xwith_current_thread", "%WITH-CURRENT-THREAD");
        return NIL;
    }

    public static SubLObject init_form_translation_file() {
        defparameter("*TRANSLATOR-WITHIN-BINDING-CONSTRUCT?*", NIL);
        defvar("*CONSIDER-TRANSLATOR-EXPANSION-FACTOR*", NIL);
        deflexical("*OPERATOR-TRANSLATORS*", $list32);
        defparameter("*TRANSLATOR-CURRENT-METHOD*", NIL);
        deflexical("*TRANSLATOR-IMPLEMENTATION-SYMBOLS*", NIL);
        return NIL;
    }

    public static SubLObject setup_form_translation_file() {
        note_funcall_helper_function(TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_form_translation_file();
    }

    @Override
    public void initializeVariables() {
        init_form_translation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_form_translation_file();
    }

    
}

/**
 * Total time: 897 ms synthetic
 */
