package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.fi.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class fi extends SubLTranslatedFile {
    public static final SubLFile me = new fi();

    public static final String myName = "com.cyc.cycjava.cycl.fi";

    public static final String myFingerPrint = "3911f3639c2476c1d205d929241e942033b828c37246093539cc10c970c367f3";

    // deflexical
    private static final SubLSymbol $fi_dispatch_table$ = makeSymbol("*FI-DISPATCH-TABLE*");







    // defparameter
    private static final SubLSymbol $within_fi_operationP$ = makeSymbol("*WITHIN-FI-OPERATION?*");

    // defparameter
    public static final SubLSymbol $current_fi_op$ = makeSymbol("*CURRENT-FI-OP*");

    // defparameter
    private static final SubLSymbol $merge_fort_assertion_map$ = makeSymbol("*MERGE-FORT-ASSERTION-MAP*");

    // defparameter
    // To be used only by cyc-assert-wff
    public static final SubLSymbol $assume_assert_sentence_is_wfP$ = makeSymbol("*ASSUME-ASSERT-SENTENCE-IS-WF?*");

    // defparameter
    /**
     * Whether to generate precise WFF errors when FI operations fail. These precise
     * explanations will explain why the operation failed. If NIL, the error will
     * simply state that the operation was ill-formed, but will not say why. Can be
     * bound to NIL by callers that do not care about the reason.
     */
    public static final SubLSymbol $generate_precise_fi_wff_errorsP$ = makeSymbol("*GENERATE-PRECISE-FI-WFF-ERRORS?*");

    // defparameter
    /**
     * When non-nil, this variable contains the date to be used for asserting
     * formulas to the system. NIL means that the current date is to be used.
     */
    public static final SubLSymbol $the_date$ = makeSymbol("*THE-DATE*");

    // defparameter
    /**
     * When non-nil, this variable contains the second to be used for asserting
     * formulas to the system. NIL means that the current second is to be used.
     */
    public static final SubLSymbol $the_second$ = makeSymbol("*THE-SECOND*");



    // defparameter
    private static final SubLSymbol $assertion_fi_formula_mt_scope$ = makeSymbol("*ASSERTION-FI-FORMULA-MT-SCOPE*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ list(makeKeyword("GET-WARNING"), makeSymbol("FI-GET-WARNING"), makeSymbol("FI-GET-WARNING-INT"), NIL), list(makeKeyword("GET-ERROR"), makeSymbol("FI-GET-ERROR"), makeSymbol("FI-GET-ERROR-INT"), NIL), list(makeKeyword("FIND"), makeSymbol("FI-FIND"), makeSymbol("FI-FIND-INT"), NIL), list(makeKeyword("COMPLETE"), makeSymbol("FI-COMPLETE"), makeSymbol("FI-COMPLETE-INT"), NIL), list(makeKeyword("CREATE"), makeSymbol("FI-CREATE"), makeSymbol("FI-CREATE-INT"), T), list(makeKeyword("FIND-OR-CREATE"), makeSymbol("FI-FIND-OR-CREATE"), makeSymbol("FI-FIND-OR-CREATE-INT"), T), list(makeKeyword("CREATE-SKOLEM"), makeSymbol("FI-CREATE-SKOLEM"), makeSymbol("FI-CREATE-SKOLEM-INT"), T), list(makeKeyword("MERGE"), makeSymbol("FI-MERGE"), makeSymbol("FI-MERGE-INT"), T), list(makeKeyword("KILL"), makeSymbol("FI-KILL"), makeSymbol("FI-KILL-INT"), T), list(makeKeyword("RENAME"), makeSymbol("FI-RENAME"), makeSymbol("FI-RENAME-INT"), T), list(makeKeyword("LOOKUP"), makeSymbol("FI-LOOKUP"), makeSymbol("FI-LOOKUP-INT"), NIL), list(makeKeyword("ASSERT"), makeSymbol("FI-ASSERT"), makeSymbol("FI-ASSERT-INT"), T), list(makeKeyword("REASSERT"), makeSymbol("FI-REASSERT"), makeSymbol("FI-REASSERT-INT"), T), list(makeKeyword("DENY"), makeSymbol("FI-DENY"), makeSymbol("FI-DENY-INT"), T), list(makeKeyword("UNASSERT"), makeSymbol("FI-UNASSERT"), makeSymbol("FI-UNASSERT-INT"), T), list(makeKeyword("EDIT"), makeSymbol("FI-EDIT"), makeSymbol("FI-EDIT-INT"), T), list(makeKeyword("RENAME-VARIABLES"), makeSymbol("FI-RENAME-VARIABLES"), makeSymbol("FI-RENAME-VARIABLES-INT"), T), list(makeKeyword("JUSTIFY"), makeSymbol("FI-JUSTIFY"), makeSymbol("FI-JUSTIFY-INT"), NIL), list(makeKeyword("ADD-ARGUMENT"), makeSymbol("FI-ADD-ARGUMENT"), makeSymbol("FI-ADD-ARGUMENT-INT"), T), list(makeKeyword("REMOVE-ARGUMENT"), makeSymbol("FI-REMOVE-ARGUMENT"), makeSymbol("FI-REMOVE-ARGUMENT-INT"), T), list(makeKeyword("BLAST"), makeSymbol("FI-BLAST"), makeSymbol("FI-BLAST-INT"), T), list(makeKeyword("ASK"), makeSymbol("FI-ASK"), makeSymbol("FI-ASK-INT"), T), list(makeKeyword("CONTINUE-LAST-ASK"), makeSymbol("FI-CONTINUE-LAST-ASK"), makeSymbol("FI-CONTINUE-LAST-ASK-INT"), T), list(makeKeyword("ASK-STATUS"), makeSymbol("FI-ASK-STATUS"), makeSymbol("FI-ASK-STATUS-INT"), NIL), list(makeKeyword("TMS-RECONSIDER-FORMULA"), makeSymbol("FI-TMS-RECONSIDER-FORMULA"), makeSymbol("FI-TMS-RECONSIDER-FORMULA-INT"), T), list(makeKeyword("TMS-RECONSIDER-MT"), makeSymbol("FI-TMS-RECONSIDER-MT"), makeSymbol("FI-TMS-RECONSIDER-MT-INT"), T), list(makeKeyword("TMS-RECONSIDER-GAFS"), makeSymbol("FI-TMS-RECONSIDER-GAFS"), makeSymbol("FI-TMS-RECONSIDER-GAFS-INT"), T), list(makeKeyword("TMS-RECONSIDER-TERM"), makeSymbol("FI-TMS-RECONSIDER-TERM"), makeSymbol("FI-TMS-RECONSIDER-TERM-INT"), T), list(makeKeyword("HYPOTHESIZE"), makeSymbol("FI-HYPOTHESIZE"), makeSymbol("FI-HYPOTHESIZE-INT"), T), list(makeKeyword("PROVE"), makeSymbol("FI-PROVE"), makeSymbol("FI-PROVE-INT"), T), list(makeKeyword("DENOTATION"), makeSymbol("FI-DENOTATION"), makeSymbol("FI-DENOTATION-INT"), T), list(makeKeyword("TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-CONSTANT-INT"), T), list(makeKeyword("TIMESTAMP-ASSERTION"), makeSymbol("FI-TIMESTAMP-ASSERTION"), makeSymbol("FI-TIMESTAMP-ASSERTION-INT"), T), list(makeKeyword("REMOVE-TIMESTAMP"), makeSymbol("FI-REMOVE-TIMESTAMP"), makeSymbol("FI-REMOVE-TIMESTAMP-INT"), T), list(makeKeyword("GET-PARAMETER"), makeSymbol("FI-GET-PARAMETER"), makeSymbol("FI-GET-PARAMETER-INT"), NIL), list(makeKeyword("SET-PARAMETER"), makeSymbol("FI-SET-PARAMETER"), makeSymbol("FI-SET-PARAMETER-INT"), T), list(makeKeyword("EVAL"), makeSymbol("FI-EVAL"), makeSymbol("FI-EVAL-INT"), T), list(makeKeyword("LOCAL-EVAL"), makeSymbol("FI-LOCAL-EVAL"), makeSymbol("FI-LOCAL-EVAL-INT"), NIL) });



    public static final SubLList $list2 = list(list(makeSymbol("*FI-ERROR*"), NIL), list(makeSymbol("*FI-WARNING*"), NIL));

    public static final SubLSymbol $fi_warning$ = makeSymbol("*FI-WARNING*");

    public static final SubLSymbol $fi_error$ = makeSymbol("*FI-ERROR*");



    public static final SubLString $str6$_S = makeString("~S");

    public static final SubLSymbol $fi_last_constant$ = makeSymbol("*FI-LAST-CONSTANT*");

    private static final SubLList $list8 = list(list(makeSymbol("*WITHIN-FI-OPERATION?*"), T));

    public static final SubLList $list9 = list(makeSymbol("FUN"), makeSymbol("INT-FUN"), makeSymbol("MODIFIES-KB?"));

    private static final SubLString $str10$Bad_function_call_____FI__s__s__s = makeString("Bad function call -> (FI ~s ~s ~s ~s ~s ~s ~s ~s ~s)\n~%A function for ~s is missing from *fi-dispatch-table*");





    private static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");

    private static final SubLSymbol FI_FIND_OR_CREATE = makeSymbol("FI-FIND-OR-CREATE");

    private static final SubLList $list15 = list(makeSymbol("FUNC"), makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    public static final SubLList $list16 = list(makeSymbol("QUOTE"), NIL);

    private static final SubLSymbol FI_HYPOTHESIZE = makeSymbol("FI-HYPOTHESIZE");

    private static final SubLList $list18 = list(makeSymbol("FUNC"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NAME-PREFIX"), makeString("HYP")), makeSymbol("TERM-EXTERNAL-IDS"));

    private static final SubLString $$$HYP = makeString("HYP");



    private static final SubLSymbol FI_GET_WARNING = makeSymbol("FI-GET-WARNING");

    private static final SubLString $str22$Return_a_description_of_the_warni = makeString("Return a description of the warning resulting from the last FI operation.");

    private static final SubLList $list23 = list(list(makeSymbol("NIL-OR"), makeSymbol("ATOM")));



    private static final SubLSymbol FI_GET_ERROR = makeSymbol("FI-GET-ERROR");

    private static final SubLString $str26$Return_a_description_of_the_error = makeString("Return a description of the error resulting from the last FI operation.");



    private static final SubLSymbol FI_FIND = makeSymbol("FI-FIND");

    private static final SubLList $list29 = list(makeSymbol("NAME"));

    private static final SubLString $str30$Return_the_constant_indentified_b = makeString("Return the constant indentified by the string NAME.");

    private static final SubLList $list31 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));



    private static final SubLString $str33$Expected_a_string__got__S = makeString("Expected a string, got ~S");



    private static final SubLString $str35$_S_is_not_a_valid_name_for_a_cons = makeString("~S is not a valid name for a constant");



    private static final SubLSymbol FI_COMPLETE = makeSymbol("FI-COMPLETE");

    private static final SubLList $list38 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"));

    private static final SubLString $str39$Return_a_list_of_constants_whose_ = makeString("Return a list of constants whose name begins with PREFIX. The comparison is\nperformed in a case-insensitive mode unless CASE-SENSITIVE? is non-nil.");

    private static final SubLList $list40 = list(list(makeSymbol("LIST"), makeSymbol("CONSTANT-P")));



    private static final SubLList $list42 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    private static final SubLString $str43$Create_a_new_constant_with_NAME__ = makeString("Create a new constant with NAME.\nIf EXTERNAL-ID is non-null it is used, otherwise a unique identifier is generated.");

    private static final SubLList $list44 = list(makeSymbol("CONSTANT-P"));





    private static final SubLString $str47$NAME_clash_for__S___renaming_to__ = makeString("NAME clash for ~S ; renaming to ~S");

    private static final SubLString $str48$Expected_an_external_ID__got__S = makeString("Expected an external ID, got ~S");



    private static final SubLString $str50$Already_a_constant_with_id__A = makeString("Already a constant with id ~A");

    private static final SubLSymbol $FIND_OR_CREATE = makeKeyword("FIND-OR-CREATE");

    private static final SubLString $str52$Return_constant_with_NAME_if_it_i = makeString("Return constant with NAME if it is present.  \nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant.");





    private static final SubLSymbol $sym55$TL_FUNCTION_TERM_ = makeSymbol("TL-FUNCTION-TERM?");

    private static final SubLString $str56$Found_a_TL_term_in_skolem__a_defi = makeString("Found a TL term in skolem ~a defining CNFs ~a");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$arityMin = reader_make_constant_shell(makeString("arityMin"));

    private static final SubLObject $$arity = reader_make_constant_shell(makeString("arity"));

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLObject $$arg3Isa = reader_make_constant_shell(makeString("arg3Isa"));

    private static final SubLObject $$arg4Isa = reader_make_constant_shell(makeString("arg4Isa"));

    private static final SubLObject $$arg5Isa = reader_make_constant_shell(makeString("arg5Isa"));

    private static final SubLObject $$resultIsa = reader_make_constant_shell(makeString("resultIsa"));

    private static final SubLObject $$resultIsaArg = reader_make_constant_shell(makeString("resultIsaArg"));

    private static final SubLObject $$CollectionDenotingFunction = reader_make_constant_shell(makeString("CollectionDenotingFunction"));

    private static final SubLList $list69 = list(reader_make_constant_shell(makeString("CollectionDenotingFunction")));

    private static final SubLObject $$resultGenl = reader_make_constant_shell(makeString("resultGenl"));

    private static final SubLObject $$SubcollectionDenotingFunction = reader_make_constant_shell(makeString("SubcollectionDenotingFunction"));

    private static final SubLList $list72 = list(reader_make_constant_shell(makeString("SubcollectionDenotingFunction")));

    private static final SubLObject $$resultGenlArg = reader_make_constant_shell(makeString("resultGenlArg"));

    private static final SubLString $str74$SKF__a = makeString("SKF-~a");

    private static final SubLString $$$0123456789 = makeString("0123456789");



    private static final SubLList $list77 = list(makeKeyword("SELF-MERGE"), makeString("Merging ~S onto itself is a no-op"), makeSymbol("KEEP-TERM"));





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLSymbol $sym83$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");



    private static final SubLSymbol $sym85$SKOLEM_TERM_ = makeSymbol("SKOLEM-TERM?");

    private static final SubLString $str86$Could_not_merge_assertion_onto_te = makeString("Could not merge assertion onto term ~S due to uncanonicalization problem:~%  ~S");

    private static final SubLSymbol CONVERT_HL_SUPPORT_TO_FI_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-FI-SUPPORT");



    private static final SubLSymbol FI_KILL = makeSymbol("FI-KILL");

    private static final SubLList $list90 = list(makeSymbol("FORT"));

    private static final SubLString $str91$Kill_FORT_and_all_its_uses_from_t = makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed.");

    private static final SubLList $list92 = list(makeSymbol("BOOLEANP"));

    private static final SubLString $str93$Constant__S_is_merely_an_empty_sh = makeString("Constant ~S is merely an empty shell, not part of the Knowledge Base");

    private static final SubLString $str94$Cannot_kill_core_constant__a___To = makeString("Cannot kill core constant ~a.  To kill it, first unassert that it is an instance of #$CoreUnionConstant.");



    private static final SubLSymbol FI_RENAME = makeSymbol("FI-RENAME");

    private static final SubLList $list97 = list(makeSymbol("CONSTANT"), makeSymbol("NAME"));

    private static final SubLString $str98$Change_name_of_CONSTANT_to_NAME__ = makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");

    private static final SubLString $str99$Expected_a_constant__got__S = makeString("Expected a constant, got ~S");

    private static final SubLSymbol $ALREADY_HAS_NAME = makeKeyword("ALREADY-HAS-NAME");

    private static final SubLString $str101$Constant__S_is_already_named__A = makeString("Constant ~S is already named ~A");



    private static final SubLSymbol FI_LOOKUP = makeSymbol("FI-LOOKUP");

    public static final SubLList $list104 = list(makeSymbol("FORMULA"), makeSymbol("MT"));

    private static final SubLString $str105$Returns_two_values_when_looking_u = makeString("Returns two values when looking up the EL FORMULA in the microtheory MT.  The\nfirst value returned is a list of HL formulas resulting from the canonicalization\nof the EL FORMULA.  The second value is T iff all the HL assertions were properly \nput into the KB.");

    private static final SubLList $list106 = list(list(makeSymbol("LIST"), makeSymbol("CONSP")), makeSymbol("BOOLEANP"));

    private static final SubLString $str107$Expected_a_cons__got__S = makeString("Expected a cons, got ~S");

    private static final SubLSymbol ASSERTION_FI_FORMULA = makeSymbol("ASSERTION-FI-FORMULA");







    private static final SubLList $list112 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLString $str113$Assert_the_FORMULA_in_the_specifi = makeString("Assert the FORMULA in the specified MT.  STRENGTH is :default or :monotonic.\nDIRECTION is :forward or :backward.  GAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward. Return T if there was no error.");

    private static final SubLString $str114$Expected__default_or__monotonic__ = makeString("Expected :default or :monotonic, got ~S");

    private static final SubLString $str115$Expected_a_direction__got__S = makeString("Expected a direction, got ~S");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));



    private static final SubLString $str118$Formula______S___in__S_was_a_taut = makeString("Formula ~%  ~S ~%in ~S was a tautology.");

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));



    private static final SubLString $str121$Formula______S___in__S_was_a_cont = makeString("Formula ~%  ~S ~%in ~S was a contradiction.");

    private static final SubLList $list122 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), makeSymbol("VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));

    private static final SubLSymbol $COULD_NOT_ASSERT = makeKeyword("COULD-NOT-ASSERT");

    private static final SubLString $str124$Unable_to_assert_formula__S__in__ = makeString("Unable to assert formula ~S~%in ~S.");

    private static final SubLSymbol $sym125$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLSymbol $sym126$FAST_SKOLEM_NAT_ = makeSymbol("FAST-SKOLEM-NAT?");

    private static final SubLSymbol $sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?");

    private static final SubLObject $$skolem = reader_make_constant_shell(makeString("skolem"));

    private static final SubLString $str129$Found_a___skolem_assertion_with_m = makeString("Found a #$skolem assertion with more than one argument: ~s");

    private static final SubLString $str130$Found_a___skolem_assertion_with_a = makeString("Found a #$skolem assertion with a non-deduced argument: ~s");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLString $str132$Defining_assertions_for__s___s__w = makeString("Defining assertions for ~s~%~s~%were not all included in existing supports~%~s");

    private static final SubLList $list133 = list(makeKeyword("DIRECTION"), makeKeyword("FORWARD"));







    private static final SubLSymbol $FORMULA_NOT_WELL_FORMED = makeKeyword("FORMULA-NOT-WELL-FORMED");

    private static final SubLString $str138$Formula______S___was_not_well_for = makeString("Formula ~%  ~S ~%was not well formed because: ~%~a");

    private static final SubLString $str139$Formula______S___was_not_well_for = makeString("Formula ~%  ~S ~%was not well formed");





    private static final SubLList $list142 = list(makeKeyword("REDUNDANT-LOCAL-ASSERTION"));







    private static final SubLList $list146 = list(makeKeyword("INVALID-STRENGTH-CHANGE"), makeString("Attempt to change the strength of a deduced assertion from ~S to ~S"), makeSymbol("CURRENT-STRENGTH"), makeSymbol("STRENGTH"));

    private static final SubLSymbol $ASSERTION_NOT_PRESENT = makeKeyword("ASSERTION-NOT-PRESENT");

    private static final SubLString $str148$Formula__S_in_mt__S_is_not_in_the = makeString("Formula ~S in mt ~S is not in the KB");









    private static final SubLString $str153$Remove_the_assertions_canonicaliz = makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL.");

    private static final SubLString $str154$Sentence______S___in__S_was_a_tau = makeString("Sentence ~%  ~S ~%in ~S was a tautology.");

    private static final SubLString $str155$Sentence______S___in__S_was_a_con = makeString("Sentence ~%  ~S ~%in ~S was a contradiction.");

    private static final SubLString $str156$Sentence__S_in_mt__S_is_not_in_th = makeString("Sentence ~S in mt ~S is not in the KB");

    private static final SubLSymbol $ASSERTION_NOT_LOCAL = makeKeyword("ASSERTION-NOT-LOCAL");

    private static final SubLString $str158$Sentence__S_in_mt__S_is_not_local = makeString("Sentence ~S in mt ~S is not locally in the KB");



    private static final SubLSymbol FI_EDIT = makeSymbol("FI-EDIT");

    public static final SubLList $list161 = list(makeSymbol("OLD-FORMULA"), makeSymbol("NEW-FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("OLD-MT"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLString $str162$Unassert_the_assertions_canonical = makeString("Unassert the assertions canonicalized from OLD-FORMULA in the microtheory OLD-MT.\n   Assert NEW-FORMULA in the specified NEW-MT.  \n   STRENGTH is :default or :monotonic.\n   DIRECTION is :forward or :backward.  \n    GAF assertion direction defaults to :forward.\n    Rule assertion direction defaults to :backward.\n   Return T if there was no error.");



    private static final SubLList $list164 = list(makeSymbol("HL-MODULE"), makeSymbol("JUST-FORMULA"), makeSymbol("JUST-MT"));

    private static final SubLSymbol ARGUMENT_TV = makeSymbol("ARGUMENT-TV");



    private static final SubLString $str167$Expected_a_support__got__S = makeString("Expected a support, got ~S");

    private static final SubLList $list168 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"));

    private static final SubLString $str169$Expected__forward_or__backward__g = makeString("Expected :forward or :backward, got ~S");

    private static final SubLSymbol DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");



    private static final SubLList $list172 = list(makeSymbol("HL-MODULE"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("STRENGTH"));



    private static final SubLString $str174$Support__S_was_malformed = makeString("Support ~S was malformed");





    private static final SubLString $str177$Support__S_is_not_currently_valid = makeString("Support ~S is not currently valid");









    private static final SubLString $str182$Remove_all_arguments_for_the_FORM = makeString("Remove all arguments for the FORMULA within MT, including both those \narguments resulting the direct assertion of the FORMULA, and \nthose arguments supporting the FORMULA which were derived through inference.\nReturn T if successful, otherwise return NIL.");



    private static final SubLSymbol FI_ASK = makeSymbol("FI-ASK");

    private static final SubLList $list185 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    private static final SubLString $str186$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy FORMULA within MT.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");

    private static final SubLList $list187 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));

    private static final SubLString $str188$Expected_a_formula__got__S = makeString("Expected a formula, got ~S");

    private static final SubLList $list189 = list(makeSymbol("IST"), makeSymbol("IST-MT"), makeSymbol("IST-FORMULA"));

    private static final SubLString $str190$Expected_an_integer__got__S = makeString("Expected an integer, got ~S");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol $CONTINUE_LAST_ASK = makeKeyword("CONTINUE-LAST-ASK");

    private static final SubLSymbol FI_CONTINUE_LAST_ASK = makeSymbol("FI-CONTINUE-LAST-ASK");

    private static final SubLList $list194 = list(makeSymbol("CONTINUE-INFERENCE"));

    private static final SubLList $list195 = list(makeSymbol("&OPTIONAL"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"), makeSymbol("RECONSIDER-DEEP"));

    private static final SubLString $str196$Continue_the_last_ask_that_was_pe = makeString("Continue the last ask that was performed with more resources.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");

    private static final SubLSymbol FI_CONTINUE_LAST_ASK_INT = makeSymbol("FI-CONTINUE-LAST-ASK-INT");

    private static final SubLString $str198$fi_continue_last_ask_int_is_depre = makeString("fi-continue-last-ask-int is deprecated; use CONTINUE-INFERENCE instead.");

    private static final SubLString $str199$fi_ask_status_is_deprecated__use_ = makeString("fi-ask-status is deprecated: use INFERENCE-SUSPEND-STATUS");

    private static final SubLSymbol FI_ASK_STATUS = makeSymbol("FI-ASK-STATUS");

    private static final SubLList $list201 = list(makeSymbol("INFERENCE-SUSPEND-STATUS"));

    private static final SubLString $str202$Return_a_status_as_to_how_the_las = makeString("Return a status as to how the last ask successfully completed regarding\nresource limits.  \n:EXHAUST if the search spaces was exhausted.\n:DEPTH if the search space was limited because some nodes were too deep.\n:NUMBER if the requested number of bindings was found without exceeding other limits.\n:TIME if the time alloted expired prior to exhausting the search space.\nReturn NIL if there was no prior successful ask.");

    private static final SubLSymbol FI_ASK_STATUS_INT = makeSymbol("FI-ASK-STATUS-INT");

    private static final SubLString $str204$fi_ask_status_int_is_deprecated__ = makeString("fi-ask-status-int is deprecated: use INFERENCE-SUSPEND-STATUS");

    private static final SubLSymbol $TMS_RECONSIDER_FORMULA = makeKeyword("TMS-RECONSIDER-FORMULA");

    private static final SubLSymbol FI_TMS_RECONSIDER_FORMULA = makeSymbol("FI-TMS-RECONSIDER-FORMULA");

    private static final SubLString $str207$Reconsider_all_arguments_for_FORM = makeString("Reconsider all arguments for FORMULA within MT.  Return T if the\noperation succeeded, NIL if there was an error.");

    private static final SubLSymbol $TMS_RECONSIDER_MT = makeKeyword("TMS-RECONSIDER-MT");

    private static final SubLSymbol FI_TMS_RECONSIDER_MT = makeSymbol("FI-TMS-RECONSIDER-MT");

    private static final SubLList $list210 = list(makeSymbol("MT"));

    private static final SubLString $str211$Reconsider_all_arguments_for_all_ = makeString("Reconsider all arguments for all formulas within MT.  Return T if the\noperation succeeded, NIL if there was an error.");

    private static final SubLSymbol $TMS_RECONSIDER_GAFS = makeKeyword("TMS-RECONSIDER-GAFS");

    private static final SubLSymbol FI_TMS_RECONSIDER_GAFS = makeSymbol("FI-TMS-RECONSIDER-GAFS");

    public static final SubLList $list214 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("ARG"), makeSymbol("PREDICATE"), makeSymbol("MT"));

    private static final SubLString $str215$Reconsider_all_arguments_for_all_ = makeString("Reconsider all arguments for all gaf formulas involving TERM.\nARG optionally constrains gafs such that the TERM occupies a specific arg position.\nPREDICATE optionally constrains gafs such that the specifed PREDICATE\noccupies the arg0 position.\nMT optionally constrains gafs such that they must be included in the specific\nmicrotheory. \nReturn T if the operation succeeded, NIL if there was an error.");

    private static final SubLString $str216$Expected_an_integer_0_5__got__S = makeString("Expected an integer 0-5, got ~S");

    private static final SubLSymbol $TMS_RECONSIDER_TERM = makeKeyword("TMS-RECONSIDER-TERM");

    private static final SubLSymbol FI_TMS_RECONSIDER_TERM = makeSymbol("FI-TMS-RECONSIDER-TERM");

    private static final SubLList $list219 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str220$Reconsider_all_arguments_involvin = makeString("Reconsider all arguments involving TERM.  \nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error.");



    private static final SubLList $list222 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));



    private static final SubLList $list224 = list(makeKeyword("INVALID-CYCLIST"));

    private static final SubLList $list225 = list(makeKeyword("INVALID-TIME"));

    private static final SubLList $list226 = list(makeKeyword("INVALID-PURPOSE"));

    private static final SubLList $list227 = list(makeKeyword("INVALID-SECOND"));

    public static final SubLList $list228 = list(makeKeyword("NO-CONSTANT"));

    private static final SubLList $list229 = list(makeKeyword("ALREADY-TIMESTAMPED"));



    private static final SubLObject $$myCreator = reader_make_constant_shell(makeString("myCreator"));

    private static final SubLObject $$myCreationTime = reader_make_constant_shell(makeString("myCreationTime"));

    private static final SubLObject $$myCreationPurpose = reader_make_constant_shell(makeString("myCreationPurpose"));

    private static final SubLObject $$myCreationSecond = reader_make_constant_shell(makeString("myCreationSecond"));





    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));



    private static final SubLList $list239 = list(makeKeyword("NO-ASSERTIONS"));





    private static final SubLList $list242 = list(makeKeyword("SIMPLE-VARIABLE-RENAME-IMPOSSIBLE"));



    private static final SubLString $str244$Expected_a_symbol__got__S = makeString("Expected a symbol, got ~S");



    private static final SubLString $str246$Parameter__S_is_not_bound = makeString("Parameter ~S is not bound");







    private static final SubLSymbol $HLMT_NOT_WELL_FORMED = makeKeyword("HLMT-NOT-WELL-FORMED");

    private static final SubLString $str251$Microtheory__S____was_not_well_fo = makeString("Microtheory ~S~%  was not well formed because: ~%~S");

    private static final SubLString $str252$Expected_a_microtheory__got__S = makeString("Expected a microtheory, got ~S");

    private static final SubLString $str253$Expected_a_term__got__S = makeString("Expected a term, got ~S");





    private static final SubLSymbol $sym256$KB_VAR_LIST_ = makeSymbol("KB-VAR-LIST?");









    private static final SubLSymbol CACHED_FI_CANONICALIZE_GAF = makeSymbol("CACHED-FI-CANONICALIZE-GAF");

    private static final SubLSymbol $cached_fi_canonicalize_gaf_caching_state$ = makeSymbol("*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*");



    private static final SubLList $list264 = list(makeSymbol("DNF"), makeSymbol("VARIABLES"), makeSymbol("FREE-VARIABLES"));





    private static final SubLSymbol DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");

    private static final SubLSymbol ASSERTION_FI_IST_FORMULA = makeSymbol("ASSERTION-FI-IST-FORMULA");

    static final boolean assertionsDisabledSync = true;

    public static SubLObject reset_fi_error_state() {
        reset_fi_error();
        reset_fi_warning();
        return NIL;
    }

    public static SubLObject with_clean_fi_error_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static SubLObject reset_fi_warning() {
        $fi_warning$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject signal_fi_warning(final SubLObject fi_warning) {
        $fi_warning$.setDynamicValue(fi_warning);
        return NIL;
    }

    public static SubLObject fi_warning_signaledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($fi_warning$.getDynamicValue(thread));
    }

    public static SubLObject fi_get_warning_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $fi_warning$.getDynamicValue(thread);
    }

    public static SubLObject reset_fi_error() {
        $fi_error$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject signal_fi_error(final SubLObject fi_error) {
        $fi_error$.setDynamicValue(fi_error);
        return NIL;
    }

    public static SubLObject fi_error_signaledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($fi_error$.getDynamicValue(thread));
    }

    public static SubLObject fi_get_error_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $fi_error$.getDynamicValue(thread);
    }

    public static SubLObject fi_error_string(final SubLObject fi_error) {
        SubLObject error_string = NIL;
        if (second(fi_error).isString()) {
            error_string = apply(symbol_function(FORMAT), NIL, new SubLObject[]{ second(fi_error), nthcdr(TWO_INTEGER, fi_error) });
        } else {
            error_string = format(NIL, $str6$_S, fi_error.first());
        }
        return error_string;
    }

    public static SubLObject fi_get_error_string_int() {
        return fi_error_string(fi_get_error_int());
    }

    public static SubLObject set_fi_last_assertions_asserted(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$fi_last_assertions_asserted$.setDynamicValue(assertions, thread);
        return czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
    }

    public static SubLObject push_fi_last_assertions_asserted(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$fi_last_assertions_asserted$.setDynamicValue(cons(assertion, czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread)), thread);
        return czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
    }

    public static SubLObject within_fi_operation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list8, append(body, NIL));
    }

    public static SubLObject already_within_fi_operationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_fi_operationP$.getDynamicValue(thread);
    }

    public static SubLObject fi(final SubLObject keyword, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        if (arg6 == UNPROVIDED) {
            arg6 = $unprovided$.getGlobalValue();
        }
        if (arg7 == UNPROVIDED) {
            arg7 = $unprovided$.getGlobalValue();
        }
        if (arg8 == UNPROVIDED) {
            arg8 = $unprovided$.getGlobalValue();
        }
        final SubLObject dispatch_info = assoc(keyword, $fi_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = dispatch_info.rest();
        SubLObject fun = NIL;
        SubLObject int_fun = NIL;
        SubLObject modifies_kbP = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        int_fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        modifies_kbP = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject form_to_enqueue = NIL;
            SubLObject form_to_eval = NIL;
            if ((NIL != fun) && (NIL != int_fun)) {
                form_to_enqueue = fi_construct_form_to_enqueue(fun, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                form_to_eval = list_utilities.replace_nth(ZERO_INTEGER, int_fun, form_to_enqueue);
            } else {
                Errors.error($str10$Bad_function_call_____FI__s__s__s, new SubLObject[]{ keyword, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, keyword });
            }
            return fi_1(form_to_enqueue, form_to_eval, modifies_kbP);
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject fi_construct_form_to_enqueue(final SubLObject fun, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        if (arg6 == UNPROVIDED) {
            arg6 = $unprovided$.getGlobalValue();
        }
        if (arg7 == UNPROVIDED) {
            arg7 = $unprovided$.getGlobalValue();
        }
        if (arg8 == UNPROVIDED) {
            arg8 = $unprovided$.getGlobalValue();
        }
        SubLObject form_to_enqueue = NIL;
        if (NIL != unprovided_argumentP(arg1)) {
            form_to_enqueue = list(fun);
        } else
            if (NIL != unprovided_argumentP(arg2)) {
                form_to_enqueue = list(fun, fi_quotify(arg1));
            } else
                if (NIL != unprovided_argumentP(arg3)) {
                    form_to_enqueue = list(fun, fi_quotify(arg1), fi_quotify(arg2));
                } else
                    if (NIL != unprovided_argumentP(arg4)) {
                        form_to_enqueue = list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3));
                    } else
                        if (NIL != unprovided_argumentP(arg5)) {
                            form_to_enqueue = list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4));
                        } else
                            if (NIL != unprovided_argumentP(arg6)) {
                                form_to_enqueue = list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5));
                            } else
                                if (NIL != unprovided_argumentP(arg7)) {
                                    form_to_enqueue = list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5), fi_quotify(arg6));
                                } else
                                    if (NIL != unprovided_argumentP(arg8)) {
                                        form_to_enqueue = list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5), fi_quotify(arg6), fi_quotify(arg7));
                                    } else {
                                        form_to_enqueue = list(new SubLObject[]{ fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5), fi_quotify(arg6), fi_quotify(arg7), fi_quotify(arg8) });
                                    }







        form_to_enqueue = precanonicalizer.immediate_precanonicalizations(form_to_enqueue);
        return form_to_enqueue;
    }

    public static SubLObject fi_quotify(final SubLObject v_object) {
        if ((((v_object.isKeyword() || (v_object == NIL)) || (v_object == T)) || v_object.isNumber()) || v_object.isString()) {
            return v_object;
        }
        return list(QUOTE, v_object);
    }

    public static SubLObject fi_1(final SubLObject form_to_enqueue, final SubLObject form_to_eval, final SubLObject modifies_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
            operation_queues.add_to_local_queue(form_to_enqueue, T);
            return $QUEUED;
        }
        SubLObject ans1 = NIL;
        SubLObject ans2 = NIL;
        SubLObject ans3 = NIL;
        SubLObject ans4 = NIL;
        SubLObject encapsulated_form_to_enqueue = NIL;
        if ((NIL != modifies_kbP) && (NIL != $use_transcriptP$.getDynamicValue(thread))) {
            encapsulated_form_to_enqueue = canon_tl.tl_encapsulate(form_to_enqueue);
        }
        final SubLObject _prev_bind_0 = kb_control_vars.$recording_hl_transcript_operationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$hl_transcript_operations$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $current_fi_op$.currentBinding(thread);
        try {
            kb_control_vars.$recording_hl_transcript_operationsP$.bind(makeBoolean(((NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread)) && (NIL != modifies_kbP)) && (NIL != $use_transcriptP$.getDynamicValue(thread))), thread);
            kb_control_vars.$hl_transcript_operations$.bind(NIL, thread);
            $current_fi_op$.bind(NIL != $current_fi_op$.getDynamicValue(thread) ? $current_fi_op$.getDynamicValue(thread) : form_to_eval.first(), thread);
            thread.resetMultipleValues();
            final SubLObject eval_ans1 = eval(form_to_eval);
            final SubLObject eval_ans2 = thread.secondMultipleValue();
            final SubLObject eval_ans3 = thread.thirdMultipleValue();
            final SubLObject eval_ans4 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            ans1 = eval_ans1;
            ans2 = eval_ans2;
            ans3 = eval_ans3;
            ans4 = eval_ans4;
            if ((((NIL == fi_error_signaledP()) && (NIL != modifies_kbP)) && (NIL != $use_transcriptP$.getDynamicValue(thread))) && (NIL != encapsulated_form_to_enqueue)) {
                final SubLObject pcase_var = encapsulated_form_to_enqueue.first();
                if (pcase_var.eql(FI_CREATE) || pcase_var.eql(FI_FIND_OR_CREATE)) {
                    SubLObject current;
                    final SubLObject datum = current = encapsulated_form_to_enqueue;
                    SubLObject func = NIL;
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list15);
                    func = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list15);
                    name = current.first();
                    current = current.rest();
                    final SubLObject external_id = (current.isCons()) ? current.first() : NIL;
                    destructuring_bind_must_listp(current, datum, $list15);
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL == external_id) || external_id.equal($list16)) {
                            final SubLObject constant = ans1;
                            encapsulated_form_to_enqueue = list(func, name, constants_high.constant_external_id(constant));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list15);
                    }
                } else
                    if (pcase_var.eql(FI_HYPOTHESIZE)) {
                        SubLObject current;
                        final SubLObject datum = current = encapsulated_form_to_enqueue;
                        SubLObject func = NIL;
                        SubLObject formula = NIL;
                        SubLObject mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list18);
                        func = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list18);
                        formula = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list18);
                        mt = current.first();
                        current = current.rest();
                        final SubLObject name_prefix = (current.isCons()) ? current.first() : $$$HYP;
                        destructuring_bind_must_listp(current, datum, $list18);
                        current = current.rest();
                        final SubLObject term_external_ids = (current.isCons()) ? current.first() : NIL;
                        destructuring_bind_must_listp(current, datum, $list18);
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL == term_external_ids) || term_external_ids.equal($list16)) {
                                SubLObject v_bindings = ans1;
                                if ((NIL != v_bindings) && (NIL == bindings.unification_success_token_p(v_bindings))) {
                                    SubLObject cdolist_list_var;
                                    v_bindings = cdolist_list_var = copy_tree(v_bindings);
                                    SubLObject binding = NIL;
                                    binding = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        rplacd(binding, constants_high.constant_external_id(binding.rest()));
                                        cdolist_list_var = cdolist_list_var.rest();
                                        binding = cdolist_list_var.first();
                                    } 
                                    encapsulated_form_to_enqueue = list(func, formula, mt, name_prefix, list(QUOTE, v_bindings));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list18);
                        }
                    }

                possibly_add_to_transcript_queues(encapsulated_form_to_enqueue);
            }
        } finally {
            $current_fi_op$.rebind(_prev_bind_3, thread);
            kb_control_vars.$hl_transcript_operations$.rebind(_prev_bind_2, thread);
            kb_control_vars.$recording_hl_transcript_operationsP$.rebind(_prev_bind_0, thread);
        }
        return values(ans1, ans2, ans3, ans4);
    }

    public static SubLObject possibly_add_to_transcript_queues(final SubLObject encapsulated_form_to_enqueue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_queues.add_to_transcript_queue(encapsulated_form_to_enqueue);
        if (NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread)) {
            if (NIL != operation_queues.hl_transcript_formP(encapsulated_form_to_enqueue)) {
                operation_queues.add_to_hl_transcript_queue(encapsulated_form_to_enqueue);
            } else {
                SubLObject cdolist_list_var = nreverse(kb_control_vars.$hl_transcript_operations$.getDynamicValue(thread));
                SubLObject hlop = NIL;
                hlop = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    hlop = encapsulation.encapsulate(canon_tl.transform_hl_terms_to_tl(encapsulation.encapsulate(hlop)));
                    operation_queues.add_to_hl_transcript_queue(hlop);
                    cdolist_list_var = cdolist_list_var.rest();
                    hlop = cdolist_list_var.first();
                } 
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject safe_fi(final SubLObject keyword, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        if (arg6 == UNPROVIDED) {
            arg6 = $unprovided$.getGlobalValue();
        }
        if (arg7 == UNPROVIDED) {
            arg7 = $unprovided$.getGlobalValue();
        }
        if (arg8 == UNPROVIDED) {
            arg8 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans1 = NIL;
        SubLObject ans2 = NIL;
        SubLObject ans3 = NIL;
        SubLObject ans4 = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject fi_ans1 = fi(keyword, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            final SubLObject fi_ans2 = thread.secondMultipleValue();
            final SubLObject fi_ans3 = thread.thirdMultipleValue();
            final SubLObject fi_ans4 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            ans1 = fi_ans1;
            ans2 = fi_ans2;
            ans3 = fi_ans3;
            ans4 = fi_ans4;
        } finally {
            $use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return values(ans1, ans2, ans3, ans4);
    }

    public static SubLObject fi_get_warning() {
        return fi($GET_WARNING, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_get_error() {
        return fi($GET_ERROR, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_find(final SubLObject name) {
        return fi($FIND, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_find_int(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!name.isString()) {
            signal_fi_error(list($ARG_ERROR, $str33$Expected_a_string__got__S, name));
            return NIL;
        }
        if (NIL == constant_completion_high.valid_constant_name_p(name)) {
            signal_fi_error(list($INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            final SubLObject constant = constants_high.find_constant(name);
            ans = (NIL != valid_constantP(constant, UNPROVIDED)) ? constant : NIL;
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_complete(final SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        return fi($COMPLETE, prefix, case_sensitiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_complete_int(final SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!prefix.isString()) {
            signal_fi_error(list($ARG_ERROR, $str33$Expected_a_string__got__S, prefix));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            final SubLObject constants = ans = constant_completion_high.constant_complete(prefix, case_sensitiveP, NIL, UNPROVIDED, UNPROVIDED);
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_create(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        return fi($CREATE, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_create_int(SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (name != $UNNAMED) {
            if (!name.isString()) {
                signal_fi_error(list($ARG_ERROR, $str33$Expected_a_string__got__S, name));
                return NIL;
            }
            if (NIL == constant_completion_high.valid_constant_name_p(name)) {
                signal_fi_error(list($INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name));
                return NIL;
            }
            if (NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
                final SubLObject name_collision = constant_completion_high.constant_name_case_collision(name);
                if (NIL != name_collision) {
                    final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
                    signal_fi_warning(list($NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name));
                    name = new_name;
                }
            }
        }
        if ((NIL != external_id) && (NIL == constants_high.constant_external_id_p(external_id))) {
            signal_fi_error(list($ARG_ERROR, $str48$Expected_an_external_ID__got__S, external_id));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $janus_within_somethingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_fi_operationP$.currentBinding(thread);
        try {
            $janus_within_somethingP$.bind(T, thread);
            $within_fi_operationP$.bind(T, thread);
            final SubLObject existing_by_name = (name.isString()) ? constants_high.find_constant(name) : NIL;
            final SubLObject existing_by_id = (NIL != external_id) ? constants_high.find_constant_by_external_id(external_id) : NIL;
            if ((NIL == existing_by_name) && (NIL == external_id)) {
                final SubLObject new_external_id = constants_high.make_constant_external_id();
                ans = constants_high.create_constant(name, new_external_id);
                $fi_last_constant$.setDynamicValue(ans, thread);
            } else
                if (((NIL == existing_by_name) && (NIL != external_id)) && (NIL == existing_by_id)) {
                    ans = constants_high.create_constant(name, external_id);
                    $fi_last_constant$.setDynamicValue(ans, thread);
                } else
                    if ((NIL == existing_by_name) && (NIL != existing_by_id)) {
                        ans = handle_id_clash(name, external_id);
                    } else
                        if (((NIL != existing_by_name) && (NIL != existing_by_id)) && (NIL == kb_utilities.kbeq(existing_by_name, existing_by_id))) {
                            ans = handle_id_clash(name, external_id);
                        } else
                            if (((NIL != existing_by_name) && (NIL != existing_by_id)) && (NIL != kb_utilities.kbeq(existing_by_name, existing_by_id))) {
                                ans = existing_by_name;
                            } else
                                if (((NIL != existing_by_name) && (NIL == existing_by_id)) && (NIL != constants_high.uninstalled_constant_p(existing_by_name))) {
                                    final SubLObject external_id_to_install = (NIL != external_id) ? external_id : constants_high.make_constant_external_id();
                                    ans = constants_high.create_constant(name, external_id_to_install);
                                    $fi_last_constant$.setDynamicValue(ans, thread);
                                } else
                                    if ((NIL != existing_by_name) && (NIL == existing_by_id)) {
                                        final SubLObject new_name2 = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
                                        ans = constants_high.create_constant(new_name2, external_id);
                                        $fi_last_constant$.setDynamicValue(ans, thread);
                                        signal_fi_warning(list($NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name2));
                                    }






        } finally {
            $within_fi_operationP$.rebind(_prev_bind_2, thread);
            $janus_within_somethingP$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_create_finished(ans);
        return ans;
    }

    public static SubLObject handle_id_clash(final SubLObject new_name, final SubLObject common_id) {
        signal_fi_error(list($ID_CLASH, $str50$Already_a_constant_with_id__A, common_id));
        return NIL;
    }

    public static SubLObject fi_find_or_create(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        return fi($FIND_OR_CREATE, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_find_or_create_int(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!name.isString()) {
            signal_fi_error(list($ARG_ERROR, $str33$Expected_a_string__got__S, name));
            return NIL;
        }
        if (NIL == constant_completion_high.valid_constant_name_p(name)) {
            signal_fi_error(list($INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name));
            return NIL;
        }
        if ((NIL != external_id) && (NIL == constants_high.constant_external_id_p(external_id))) {
            signal_fi_error(list($ARG_ERROR, $str48$Expected_an_external_ID__got__S, external_id));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            ans = fi_find_int(name);
            if (NIL != fi_error_signaledP()) {
                ans = NIL;
            } else
                if (NIL == ans) {
                    ans = fi_create_int(name, external_id);
                }

        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_create_skolem(final SubLObject external_id, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types) {
        return fi($CREATE_SKOLEM, external_id, unreified_sk_term, hlmt_czer.canonicalize_hlmt(mt), cnfs, arg_types, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_create_skolem_int(final SubLObject external_id, final SubLObject unreified_sk_term, SubLObject mt, SubLObject cnfs, SubLObject arg_types) {
        if (arg_types == UNPROVIDED) {
            arg_types = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == constants_high.constant_external_id_p(external_id)) {
            signal_fi_error(list($ARG_ERROR, $str48$Expected_an_external_ID__got__S, external_id));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt_if_wft(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject sk_constant = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$1 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                sk_constant = fi_create_int(new_skolem_name(external_id), external_id);
                if (NIL != constant_p(sk_constant)) {
                    SubLObject cdolist_list_var;
                    final SubLObject tl_nats = cdolist_list_var = list_utilities.tree_gather(cnfs, $sym55$TL_FUNCTION_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject tl_nat = NIL;
                    tl_nat = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        czer_main.canonicalize_term_assert(tl_nat, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        tl_nat = cdolist_list_var.first();
                    } 
                    cnfs = canon_tl.transform_tl_terms_to_hl(cnfs);
                    if (NIL != list_utilities.tree_find_if($sym55$TL_FUNCTION_TERM_, cnfs, UNPROVIDED)) {
                        Errors.warn($str56$Found_a_TL_term_in_skolem__a_defi, external_id, cnfs);
                    }
                    final SubLObject args = second(unreified_sk_term);
                    final SubLObject seqvar = skolems.skolem_seqvar(unreified_sk_term);
                    final SubLObject arity_min = length(args);
                    final SubLObject key = skolems.skolem_hash_key(arity_min, cnfs);
                    final SubLObject sk_defn = skolems.make_sk_defn(sk_constant, unreified_sk_term, mt, cnfs);
                    final SubLObject sk_col = skolems.skolem_collection(unreified_sk_term);
                    fi_assert_int(list($$isa, sk_constant, sk_col), mt, $MONOTONIC, UNPROVIDED);
                    if (NIL != seqvar) {
                        fi_assert_int(list($$arityMin, sk_constant, arity_min), mt, $MONOTONIC, UNPROVIDED);
                    } else {
                        fi_assert_int(list($$arity, sk_constant, arity_min), mt, $MONOTONIC, UNPROVIDED);
                    }
                    fi_skolem_assert_arg_isas(sk_constant, args, arg_types, mt);
                    fi_skolem_assert_result_types(sk_constant, cnfs, mt);
                    skolems.add_skolem_defn(sk_defn, key);
                } else {
                    signal_fi_error(list($ID_CLASH, $str50$Already_a_constant_with_id__A, external_id));
                }
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$1, thread);
            }
            if (NIL != fi_error_signaledP()) {
                sk_constant = NIL;
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return sk_constant;
    }

    public static SubLObject fi_skolem_assert_arg_isas(final SubLObject sk_constant, final SubLObject args, final SubLObject arg_types, final SubLObject mt) {
        final SubLObject arg1_isa = assoc(args.first(), arg_types, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg2_isa = assoc(second(args), arg_types, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg3_isa = assoc(third(args), arg_types, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg4_isa = assoc(fourth(args), arg_types, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg5_isa = assoc(fifth(args), arg_types, UNPROVIDED, UNPROVIDED).rest();
        SubLObject cdolist_list_var = arg1_isa;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$arg1Isa, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cdolist_list_var = arg2_isa;
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$arg2Isa, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cdolist_list_var = arg3_isa;
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$arg3Isa, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cdolist_list_var = arg4_isa;
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$arg4Isa, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cdolist_list_var = arg5_isa;
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$arg5Isa, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject fi_skolem_assert_result_types(final SubLObject sk_constant, final SubLObject cnfs, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = skolems.skolem_result_types_from_cnfs(skolems.sk_defn_var(), cnfs, mt, UNPROVIDED);
        final SubLObject result_isa_args = thread.secondMultipleValue();
        final SubLObject result_genls = thread.thirdMultipleValue();
        final SubLObject result_genl_args = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = result_isas;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$resultIsa, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cdolist_list_var = result_isa_args;
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$resultIsaArg, sk_constant, argnum), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        if ((NIL != result_genls) && (NIL == isa.isaP(sk_constant, $$CollectionDenotingFunction, mt, UNPROVIDED))) {
            fi_assert_int(listS($$isa, sk_constant, $list69), mt, UNPROVIDED, UNPROVIDED);
        }
        cdolist_list_var = result_genls;
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$resultGenl, sk_constant, col), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        if ((NIL != result_genl_args) && (NIL == isa.isaP(sk_constant, $$SubcollectionDenotingFunction, mt, UNPROVIDED))) {
            fi_assert_int(listS($$isa, sk_constant, $list72), mt, UNPROVIDED, UNPROVIDED);
        }
        cdolist_list_var = result_genl_args;
        argnum = NIL;
        argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fi_assert_int(list($$resultGenlArg, sk_constant, argnum), mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject new_skolem_name(final SubLObject basis) {
        if (basis.isString()) {
            return format(NIL, $str74$SKF__a, basis);
        }
        if (basis.isInteger()) {
            return format(NIL, $str74$SKF__a, basis);
        }
        return new_skolem_name(next_random_basis_for_skolem_name());
    }

    public static SubLObject next_random_basis_for_skolem_name() {
        return new_random_basis_for_skolem_name();
    }

    public static SubLObject new_random_basis_for_skolem_name() {
        final SubLObject random_string = Strings.make_string(TEN_INTEGER, CHAR_0);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(TEN_INTEGER); i = add(i, ONE_INTEGER)) {
            Strings.set_char(random_string, i, Strings.sublisp_char($$$0123456789, random.random(TEN_INTEGER)));
        }
        return random_string;
    }

    public static SubLObject fi_merge(final SubLObject kill_term, final SubLObject keep_term) {
        return fi($MERGE, kill_term, keep_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_merge_int(SubLObject kill_term, SubLObject keep_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        kill_term = fi_convert_to_fort(kill_term);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        keep_term = fi_convert_to_fort(keep_term);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(keep_term, kill_term)) {
            signal_fi_warning($list77);
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_fi_operationP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            $within_fi_operationP$.bind(T, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            ans = merge_fort_recursive(kill_term, keep_term);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_14, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_13, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_11, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_9, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_7, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_5, thread);
            $within_assert$.rebind(_prev_bind_4, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_3, thread);
            $within_fi_operationP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject merge_fort_recursive(final SubLObject kill_term, final SubLObject keep_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(kill_term) : "forts.fort_p(kill_term) " + "CommonSymbols.NIL != forts.fort_p(kill_term) " + kill_term;
        assert NIL != forts.fort_p(keep_term) : "forts.fort_p(keep_term) " + "CommonSymbols.NIL != forts.fort_p(keep_term) " + keep_term;
        SubLObject cdolist_list_var = czer_utilities.all_term_opaque_deductions(kill_term);
        SubLObject opaque_deduction = NIL;
        opaque_deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.valid_deductionP(opaque_deduction, UNPROVIDED)) {
                final SubLObject assertion = deductions_high.deduction_assertion(opaque_deduction);
                final SubLObject cnf = assertions_high.assertion_cnf(assertion);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject supports = deductions_high.deduction_supports(opaque_deduction);
                hl_storage_modules.hl_remove_deduction(cnf, mt, supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            opaque_deduction = cdolist_list_var.first();
        } 
        cdolist_list_var = czer_utilities.all_term_opaque_assertions(kill_term);
        SubLObject opaque_assertion = NIL;
        opaque_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.valid_assertionP(opaque_assertion, UNPROVIDED)) && (NIL == assertions_high.meta_assertionP(opaque_assertion))) {
                final SubLObject cnf2 = assertions_high.assertion_cnf(opaque_assertion);
                final SubLObject mt2 = assertions_high.assertion_mt(opaque_assertion);
                hl_storage_modules.hl_remove_all_arguments(cnf2, mt2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            opaque_assertion = cdolist_list_var.first();
        } 
        merge_dependent_narts(kill_term, keep_term);
        merge_dependent_kb_hl_supports(kill_term, keep_term);
        final SubLObject _prev_bind_0 = $merge_fort_assertion_map$.currentBinding(thread);
        try {
            $merge_fort_assertion_map$.bind(make_merge_fort_assertion_map(kb_indexing.num_index(kill_term)), thread);
            SubLObject isa_assertions = NIL;
            SubLObject genls_assertions = NIL;
            SubLObject tou_assertions = NIL;
            SubLObject arg1_assertions = NIL;
            SubLObject all_term_assertions = NIL;
            SubLObject skolem_assertions = NIL;
            final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                isa_assertions = kb_mapping.gather_gaf_arg_index(kill_term, ONE_INTEGER, $$isa, UNPROVIDED, UNPROVIDED);
                genls_assertions = kb_mapping.gather_gaf_arg_index(kill_term, ONE_INTEGER, $$genls, UNPROVIDED, UNPROVIDED);
                tou_assertions = kb_mapping.gather_gaf_arg_index(kill_term, ONE_INTEGER, $$termOfUnit, UNPROVIDED, UNPROVIDED);
                arg1_assertions = kb_mapping.gather_gaf_arg_index(kill_term, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var2;
                all_term_assertions = cdolist_list_var2 = kb_accessors.all_term_assertions(kill_term, T);
                SubLObject assertion2 = NIL;
                assertion2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != list_utilities.tree_find_if($sym83$SKOLEM_NART_, assertions_high.assertion_formula(assertion2), UNPROVIDED)) {
                        skolem_assertions = cons(assertion2, skolem_assertions);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    assertion2 = cdolist_list_var2.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$2, thread);
            }
            all_term_assertions = nset_difference(all_term_assertions, arg1_assertions, UNPROVIDED, UNPROVIDED);
            all_term_assertions = nset_difference(all_term_assertions, skolem_assertions, UNPROVIDED, UNPROVIDED);
            arg1_assertions = nset_difference(arg1_assertions, tou_assertions, UNPROVIDED, UNPROVIDED);
            arg1_assertions = nset_difference(arg1_assertions, genls_assertions, UNPROVIDED, UNPROVIDED);
            arg1_assertions = nset_difference(arg1_assertions, isa_assertions, UNPROVIDED, UNPROVIDED);
            arg1_assertions = nset_difference(arg1_assertions, skolem_assertions, UNPROVIDED, UNPROVIDED);
            SubLObject processed_el_formula_mt_pairs = NIL;
            final SubLObject kill_term_el_formula = (NIL != nart_handles.nart_p(kill_term)) ? narts_high.nart_el_formula(kill_term) : kill_term;
            SubLObject cdolist_list_var2 = skolem_assertions;
            SubLObject assertion2 = NIL;
            assertion2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion2);
                final SubLObject assertion_el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject assertion_el_formula_mt_pair = list(assertion_el_formula, assertion_el_mt);
                if ((NIL == subl_promotions.memberP(assertion_el_formula_mt_pair, processed_el_formula_mt_pairs, symbol_function(EQUAL), UNPROVIDED)) && (NIL != skolems.skolem_defining_assertionP(assertion2))) {
                    processed_el_formula_mt_pairs = cons(assertion_el_formula_mt_pair, processed_el_formula_mt_pairs);
                    final SubLObject new_formula = list_utilities.tree_substitute(assertion_el_formula, kill_term_el_formula, keep_term);
                    final SubLObject new_mt = cycl_utilities.expression_subst(keep_term, kill_term_el_formula, assertion_el_mt, symbol_function(EQUAL), UNPROVIDED);
                    final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion2);
                    substitute_asserted_argument(new_formula, new_mt, asserted_argument, assertion2);
                    add_merge_fort_assertion_mapping(new_formula, new_mt, assertion2);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                assertion2 = cdolist_list_var2.first();
            } 
            SubLObject cdolist_list_var3 = isa_assertions;
            SubLObject assertion3 = NIL;
            assertion3 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                substitute_assertion(keep_term, kill_term, assertion3, NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            } 
            cdolist_list_var3 = genls_assertions;
            assertion3 = NIL;
            assertion3 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                substitute_assertion(keep_term, kill_term, assertion3, NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            } 
            cdolist_list_var3 = arg1_assertions;
            assertion3 = NIL;
            assertion3 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                substitute_assertion(keep_term, kill_term, assertion3, NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            } 
            SubLObject max_term_order = ZERO_INTEGER;
            final SubLObject term_order_map = make_hash_table(length(all_term_assertions), UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = all_term_assertions;
            assertion2 = NIL;
            assertion2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject term_order = kb_utilities.term_order(assertion2);
                sethash(assertion2, term_order_map, term_order);
                if (term_order.numG(max_term_order)) {
                    max_term_order = term_order;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                assertion2 = cdolist_list_var2.first();
            } 
            SubLObject cur_term_order_1;
            SubLObject cur_term_order;
            SubLObject cdolist_list_var4;
            SubLObject assertion4;
            for (cur_term_order_1 = NIL, cur_term_order_1 = ZERO_INTEGER; cur_term_order_1.numL(max_term_order); cur_term_order_1 = add(cur_term_order_1, ONE_INTEGER)) {
                cur_term_order = add(ONE_INTEGER, cur_term_order_1);
                cdolist_list_var4 = all_term_assertions;
                assertion4 = NIL;
                assertion4 = cdolist_list_var4.first();
                while (NIL != cdolist_list_var4) {
                    if (cur_term_order.eql(gethash(assertion4, term_order_map, UNPROVIDED))) {
                        substitute_assertion(keep_term, kill_term, assertion4, NIL);
                    }
                    cdolist_list_var4 = cdolist_list_var4.rest();
                    assertion4 = cdolist_list_var4.first();
                } 
            }
            cdolist_list_var3 = tou_assertions;
            assertion3 = NIL;
            assertion3 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                substitute_termofunit_assertion(keep_term, kill_term, assertion3, NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            } 
        } finally {
            $merge_fort_assertion_map$.rebind(_prev_bind_0, thread);
        }
        fi_kill_int(kill_term);
        forward.perform_forward_inference();
        return keep_term;
    }

    public static SubLObject merge_dependent_narts(final SubLObject kill_term, final SubLObject keep_term) {
        SubLObject cdolist_list_var;
        final SubLObject kill_nats = cdolist_list_var = indexing_utilities.dependent_narts(kill_term);
        SubLObject kill_nat = NIL;
        kill_nat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == term.skolem_nartP(kill_nat)) {
                final SubLObject kill_nart_el_formula = narts_high.nart_el_formula(kill_nat);
                if (NIL != kill_nart_el_formula) {
                    final SubLObject keep_nart_el_formula = subst(keep_term, kill_term, kill_nart_el_formula, UNPROVIDED, UNPROVIDED);
                    final SubLObject keep_nat = czer_main.cyc_find_or_create_nart(keep_nart_el_formula, UNPROVIDED);
                    if (NIL != nart_handles.nart_p(keep_nat)) {
                        merge_fort_recursive(kill_nat, keep_nat);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            kill_nat = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject merge_dependent_kb_hl_supports(final SubLObject kill_term, final SubLObject keep_term) {
        SubLObject cdolist_list_var;
        final SubLObject kb_hl_supports = cdolist_list_var = kb_hl_supports_high.find_kb_hl_supports_mentioning_term(kill_term);
        SubLObject kb_hl_support = NIL;
        kb_hl_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject kill_hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
            final SubLObject keep_hl_support = subst(keep_term, kill_term, kill_hl_support, UNPROVIDED, UNPROVIDED);
            final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
            kb_hl_supports_high.find_or_create_kb_hl_support(keep_hl_support, justification);
            cdolist_list_var = cdolist_list_var.rest();
            kb_hl_support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject substitute_assertion(final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion, final SubLObject remove_source_argumentsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(keep_term) : "forts.fort_p(keep_term) " + "CommonSymbols.NIL != forts.fort_p(keep_term) " + keep_term;
        assert NIL != forts.fort_p(kill_term) : "forts.fort_p(kill_term) " + "CommonSymbols.NIL != forts.fort_p(kill_term) " + kill_term;
        assert NIL != assertion_handles.assertion_p(source_assertion) : "assertion_handles.assertion_p(source_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(source_assertion) " + source_assertion;
        if (NIL != assertions_high.valid_assertion(source_assertion, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject old_el_formula = uncanonicalizer.assertion_el_formula(source_assertion);
            final SubLObject old_el_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject kill_term_el_formula = (NIL != nart_handles.nart_p(kill_term)) ? narts_high.nart_el_formula(kill_term) : kill_term;
            SubLObject new_el_formula = cycl_utilities.expression_subst(keep_term, kill_term_el_formula, old_el_formula, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject new_el_mt = cycl_utilities.expression_subst(keep_term, kill_term_el_formula, old_el_mt, symbol_function(EQUAL), UNPROVIDED);
            if ((NIL != assertion_utilities.meta_assertion_p(source_assertion)) && (NIL != merge_fort_assertion_map_validP())) {
                final SubLObject old_hl_formula = assertion_hl_formula(source_assertion, UNPROVIDED);
                SubLObject cdolist_list_var = list_utilities.find_all_if(ASSERTION_P, old_hl_formula, UNPROVIDED);
                SubLObject sub_assertion = NIL;
                sub_assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject new_sub_assertion = get_merge_fort_assertion_mapping(sub_assertion);
                    if (NIL != assertion_handles.assertion_p(new_sub_assertion)) {
                        final SubLObject sub_assertion_el_formula = uncanonicalizer.assertion_el_formula(sub_assertion);
                        final SubLObject new_sub_assertion_el_formula = uncanonicalizer.assertion_el_formula(new_sub_assertion);
                        new_el_formula = subst(new_sub_assertion_el_formula, sub_assertion_el_formula, new_el_formula, symbol_function(EQUAL), UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_assertion = cdolist_list_var.first();
                } 
            }
            if ((NIL != list_utilities.tree_find_if($sym85$SKOLEM_TERM_, new_el_formula, UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym85$SKOLEM_TERM_, new_el_mt, UNPROVIDED))) {
                Errors.warn($str86$Could_not_merge_assertion_onto_te, keep_term, source_assertion);
                return NIL;
            }
            SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
            SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                $within_assert$.bind(NIL, thread);
                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                wff_vars.$validate_constantsP$.bind(NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(source_assertion);
                SubLObject source_argument = NIL;
                source_argument = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != arguments.asserted_argument_p(source_argument)) {
                        substitute_asserted_argument(new_el_formula, new_el_mt, source_argument, source_assertion);
                    } else
                        if (NIL != deduction_handles.deduction_p(source_argument)) {
                            substitute_deduction(new_el_formula, new_el_mt, keep_term, kill_term, source_argument, source_assertion);
                        }

                    cdolist_list_var2 = cdolist_list_var2.rest();
                    source_argument = cdolist_list_var2.first();
                } 
                substitute_dependents(new_el_formula, new_el_mt, keep_term, kill_term, source_assertion);
            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                $within_assert$.rebind(_prev_bind_0, thread);
            }
            add_merge_fort_assertion_mapping(new_el_formula, new_el_mt, source_assertion);
            _prev_bind_0 = $within_assert$.currentBinding(thread);
            _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                $within_assert$.bind(NIL, thread);
                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                wff_vars.$validate_constantsP$.bind(NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                if (NIL != remove_source_argumentsP) {
                    SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(source_assertion);
                    SubLObject source_argument = NIL;
                    source_argument = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        tms.tms_remove_argument(source_argument, source_assertion, UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        source_argument = cdolist_list_var2.first();
                    } 
                }
            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                $within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject substitute_asserted_argument(final SubLObject new_formula, final SubLObject new_mt, final SubLObject source_argument, final SubLObject source_assertion) {
        final SubLObject strength = arguments.argument_strength(source_argument);
        final SubLObject direction = assertions_high.assertion_direction(source_assertion);
        final SubLObject timestampedP = assertions_low.asserted_assertion_timestampedP(source_assertion);
        SubLObject who = NIL;
        SubLObject when = NIL;
        SubLObject why = NIL;
        SubLObject second = NIL;
        if (NIL != timestampedP) {
            who = assertions_high.asserted_by(source_assertion);
            when = assertions_high.asserted_when(source_assertion);
            why = assertions_high.asserted_why(source_assertion);
            second = assertions_high.asserted_second(source_assertion);
        }
        fi_assert_int(new_formula, new_mt, strength, direction);
        if (NIL != timestampedP) {
            fi_timestamp_assertion_int(who, when, why, second);
        }
        return NIL;
    }

    public static SubLObject substitute_deduction(final SubLObject new_formula, final SubLObject new_mt, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_deduction, final SubLObject source_assertion) {
        if (NIL != deduction_handles.valid_deduction(source_deduction, UNPROVIDED)) {
            final SubLObject direction = assertions_high.assertion_direction(source_assertion);
            final SubLObject old_supports = deductions_high.deduction_supports(source_deduction);
            final SubLObject new_supports = subst(keep_term, kill_term, old_supports, UNPROVIDED, UNPROVIDED);
            final SubLObject new_el_supports = Mapping.mapcar(symbol_function(CONVERT_HL_SUPPORT_TO_FI_SUPPORT), new_supports);
            fi_add_argument_int(new_formula, new_mt, new_el_supports, direction, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject substitute_dependents(final SubLObject new_formula, final SubLObject new_mt, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion) {
        final SubLObject new_assertion = sentence_assertions(new_formula, new_mt).first();
        if (NIL != assertion_handles.assertion_p(new_assertion)) {
            substitute_dependent_assertion(new_assertion, keep_term, kill_term, source_assertion);
        }
        return NIL;
    }

    public static SubLObject substitute_dependent_assertion(final SubLObject new_assertion, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion) {
        SubLObject cdolist_list_var = assertions_high.assertion_dependent_list(source_assertion);
        SubLObject dependent = NIL;
        dependent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.valid_deductionP(dependent, UNPROVIDED)) {
                final SubLObject supported_object = deductions_high.deduction_supported_object(dependent);
                final SubLObject old_supports = deductions_high.deduction_supports(dependent);
                final SubLObject new_supports = substitute(new_assertion, source_assertion, subst(keep_term, kill_term, old_supports, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != assertion_handles.assertion_p(supported_object)) {
                    final SubLObject supported_formula = assertion_hl_formula(supported_object, UNPROVIDED);
                    final SubLObject supported_mt = assertions_high.assertion_mt(supported_object);
                    final SubLObject direction = assertions_high.assertion_direction(supported_object);
                    final SubLObject new_el_supports = Mapping.mapcar(symbol_function(CONVERT_HL_SUPPORT_TO_FI_SUPPORT), new_supports);
                    fi_add_argument_int(supported_formula, supported_mt, new_el_supports, direction, UNPROVIDED);
                } else {
                    final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(supported_object);
                    kb_hl_supports_low.kb_hl_support_reset_justification(kb_hl_support, new_supports);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject substitute_termofunit_assertion(final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion, final SubLObject remove_source_argumentsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(keep_term) : "forts.fort_p(keep_term) " + "CommonSymbols.NIL != forts.fort_p(keep_term) " + keep_term;
        assert NIL != forts.fort_p(kill_term) : "forts.fort_p(kill_term) " + "CommonSymbols.NIL != forts.fort_p(kill_term) " + kill_term;
        assert NIL != assertion_handles.assertion_p(source_assertion) : "assertion_handles.assertion_p(source_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(source_assertion) " + source_assertion;
        if (NIL != assertions_high.valid_assertion(source_assertion, UNPROVIDED)) {
            if (NIL != nart_handles.nart_p(keep_term)) {
                final SubLObject new_assertion = function_terms.term_of_unit_assertion(keep_term);
                final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    substitute_dependent_assertion(new_assertion, keep_term, kill_term, source_assertion);
                } finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    $within_assert$.rebind(_prev_bind_0, thread);
                }
                add_merge_fort_assertion_mapping(assertions_high.assertion_formula(new_assertion), assertions_high.assertion_mt(new_assertion), source_assertion);
            }
            if (NIL != remove_source_argumentsP) {
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(source_assertion);
                SubLObject source_argument = NIL;
                source_argument = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    tms.tms_remove_argument(source_argument, source_assertion, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    source_argument = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject make_merge_fort_assertion_map(final SubLObject size) {
        return make_hash_table(size, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject merge_fort_assertion_map_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_p($merge_fort_assertion_map$.getDynamicValue(thread));
    }

    public static SubLObject add_merge_fort_assertion_mapping(final SubLObject new_formula, final SubLObject new_mt, final SubLObject source_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($merge_fort_assertion_map$.getDynamicValue(thread).isHashtable()) {
            sethash(source_assertion, $merge_fort_assertion_map$.getDynamicValue(thread), make_ist_sentence(new_formula, new_mt));
        }
        return NIL;
    }

    public static SubLObject get_merge_fort_assertion_mapping(final SubLObject source_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(source_assertion, $merge_fort_assertion_map$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject fi_kill(final SubLObject fort) {
        return fi($KILL, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_kill_int(SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        fort = fi_convert_to_fort(fort);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if (NIL != constants_high.uninstalled_constant_p(fort)) {
            signal_fi_error(list($ARG_ERROR, $str93$Constant__S_is_merely_an_empty_sh, fort));
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != kb_utilities.core_union_constantP(fort))) {
            Errors.error($str94$Cannot_kill_core_constant__a___To, fort);
        }
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            $within_fi_operationP$.bind(T, thread);
            forts.remove_fort(fort);
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_12, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == fi_error_signaledP());
    }

    public static SubLObject fi_rename(final SubLObject constant, final SubLObject name) {
        return fi($RENAME, constant, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_rename_int(final SubLObject constant, SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == constant_p(constant)) {
            signal_fi_error(list($ARG_ERROR, $str99$Expected_a_constant__got__S, constant));
            return NIL;
        }
        if (!name.isString()) {
            signal_fi_error(list($ARG_ERROR, $str33$Expected_a_string__got__S, name));
            return NIL;
        }
        if (NIL == constant_completion_high.valid_constant_name_p(name)) {
            signal_fi_error(list($INVALID_NAME, $str35$_S_is_not_a_valid_name_for_a_cons, name));
            return NIL;
        }
        if (NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
            SubLObject name_collisions = constant_completion_high.constant_name_case_collisions(name);
            name_collisions = delete(constant, name_collisions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != name_collisions) {
                final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
                signal_fi_warning(list($NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name));
                name = new_name;
            }
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            if (constants_high.constant_name(constant).equal(name)) {
                signal_fi_warning(list($ALREADY_HAS_NAME, $str101$Constant__S_is_already_named__A, constant, name));
            } else {
                final SubLObject existing_constant = constants_high.find_constant(name);
                if (NIL != valid_constantP(existing_constant, UNPROVIDED)) {
                    final SubLObject new_name2 = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
                    ans = constants_high.rename_constant(constant, new_name2);
                    signal_fi_warning(list($NAME_CLASH, $str47$NAME_clash_for__S___renaming_to__, name, new_name2));
                } else {
                    if (NIL != constant_p(existing_constant)) {
                        constants_high.remove_constant(existing_constant);
                    }
                    ans = constants_high.rename_constant(constant, name);
                }
            }
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_lookup(final SubLObject formula, final SubLObject mt) {
        return fi($LOOKUP, formula, hlmt_czer.canonicalize_hlmt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_lookup_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject assertions = NIL;
        SubLObject everything_thereP = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject ass_ans = sentence_assertions(formula, mt);
            final SubLObject every_ans = thread.secondMultipleValue();
            final SubLObject canon_error = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            signal_fi_error(canon_error);
            assertions = ass_ans;
            everything_thereP = every_ans;
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return values(Mapping.mapcar(symbol_function(ASSERTION_FI_FORMULA), assertions), everything_thereP);
    }

    public static SubLObject sentence_assertions_in_mt(final SubLObject sentence, final SubLObject mt, final SubLObject use_genl_mtsP) {
        if (NIL != use_genl_mtsP) {
            return sentence_visible_assertions(sentence, mt);
        }
        return sentence_assertions(sentence, mt);
    }

    public static SubLObject sentence_assertions(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == wff.el_wffP(sentence, mt, UNPROVIDED)) {
            final SubLObject error = fi_not_wff_error(sentence, mt);
            return values(NIL, T, error);
        }
        thread.resetMultipleValues();
        final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, mt);
        final SubLObject missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(assertions, makeBoolean(NIL == missingP), NIL);
    }

    public static SubLObject sentence_visible_assertions(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == wff.el_wffP(sentence, mt, UNPROVIDED)) {
            final SubLObject error = fi_not_wff_error(sentence, mt);
            return values(NIL, T, error);
        }
        thread.resetMultipleValues();
        final SubLObject assertions = czer_meta.find_visible_assertions_cycl(sentence, mt);
        final SubLObject missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(assertions, makeBoolean(NIL == missingP), NIL);
    }

    public static SubLObject sentence_assertions_in_any_mt(final SubLObject sentence) {
        return sentence_visible_assertions(sentence, $$EverythingPSC);
    }

    public static SubLObject sentence_assertion(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertions = sentence_assertions(sentence, mt);
        final SubLObject all_present = thread.secondMultipleValue();
        final SubLObject canon_error = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((((NIL != assertions) && (NIL != list_utilities.singletonP(assertions))) && (NIL != all_present)) && (NIL == canon_error)) {
            return assertions.first();
        }
        return NIL;
    }

    public static SubLObject gaf_sentence_assertion(final SubLObject gaf, final SubLObject mt) {
        final SubLObject assertion = sentence_assertion(gaf, mt);
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return assertion;
        }
        return NIL;
    }

    public static SubLObject fi_assert(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return fi($ASSERT, formula, hlmt_czer.canonicalize_hlmt(mt), strength, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_assert_int(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        formula = canon_tl.transform_tl_terms_to_hl(formula);
        mt = canon_tl.transform_tl_terms_to_hl(mt);
        mt = fi_convert_to_assert_hlmt_if_wft(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if (NIL == enumeration_types.el_strength_p(strength)) {
            signal_fi_error(list($ARG_ERROR, $str114$Expected__default_or__monotonic__, strength));
            return NIL;
        }
        if ((NIL != direction) && (NIL == enumeration_types.direction_p(direction))) {
            signal_fi_error(list($ARG_ERROR, $str115$Expected_a_direction__got__S, direction));
            return NIL;
        }
        SubLObject assertions_found_or_created = NIL;
        SubLObject ans = NIL;
        SubLObject janus_deduce_specs = NIL;
        final SubLObject environment = possibly_get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $janus_within_somethingP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $janus_extraction_deduce_specs$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            $janus_within_somethingP$.bind(T, thread);
            $janus_extraction_deduce_specs$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject canon_versions = (NIL != $assume_assert_sentence_is_wfP$.getDynamicValue(thread)) ? czer_main.canonicalize_wf_assert_sentence(formula, mt) : czer_main.canonicalize_assert_sentence(formula, mt);
            final SubLObject canon_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canon_mt);
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_fi_operationP$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                $within_fi_operationP$.bind(T, thread);
                if (NIL == canon_versions) {
                    signal_fi_error(fi_not_wff_assert_error(formula, canon_mt));
                } else
                    if (NIL != kb_utilities.kbeq(canon_versions, $$True)) {
                        signal_fi_error(list($TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, canon_mt));
                    } else
                        if (NIL != kb_utilities.kbeq(canon_versions, $$False)) {
                            signal_fi_error(list($CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, canon_mt));
                        } else {
                            set_fi_last_assertions_asserted(NIL);
                            SubLObject cdolist_list_var = canon_versions;
                            SubLObject canon_version = NIL;
                            canon_version = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (NIL == fi_error_signaledP()) {
                                    SubLObject current;
                                    final SubLObject datum = current = canon_version;
                                    SubLObject cnf = NIL;
                                    destructuring_bind_must_consp(current, datum, $list122);
                                    cnf = current.first();
                                    current = current.rest();
                                    final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
                                    destructuring_bind_must_listp(current, datum, $list122);
                                    current = current.rest();
                                    final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
                                    destructuring_bind_must_listp(current, datum, $list122);
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == direction) {
                                            direction = fi_cnf_default_direction(cnf);
                                        }
                                        final SubLObject assertion = hl_storage_modules.hl_assert(cnf, canon_mt, strength, direction, variable_map);
                                        if (NIL != assertion_handles.assertion_p(assertion)) {
                                            assertions_found_or_created = cons(assertion, assertions_found_or_created);
                                        } else
                                            if (NIL == assertion) {
                                                signal_fi_error(list($COULD_NOT_ASSERT, $str124$Unable_to_assert_formula__S__in__, formula, canon_mt));
                                            }

                                    } else {
                                        cdestructuring_bind_error(datum, $list122);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                canon_version = cdolist_list_var.first();
                            } 
                            assertions_found_or_created = nreverse(assertions_found_or_created);
                        }


                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
            }
            if (NIL == fi_error_signaledP()) {
                SubLObject deductions_found_or_created = NIL;
                final SubLObject _prev_bind_0_$4 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_allowed_rules$.bind(hl_prototypes.hl_prototype_allowed_forward_rules(assertions_found_or_created), thread);
                    kb_control_vars.$forward_inference_forbidden_rules$.bind(hl_prototypes.hl_prototype_forbidden_forward_rules(assertions_found_or_created), thread);
                    deductions_found_or_created = forward.perform_forward_inference();
                } finally {
                    kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_1_$5, thread);
                    kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$4, thread);
                }
                perform_assert_post_processing(assertions_found_or_created, deductions_found_or_created);
            }
            janus_deduce_specs = $janus_extraction_deduce_specs$.getDynamicValue(thread);
        } finally {
            $janus_extraction_deduce_specs$.rebind(_prev_bind_3, thread);
            $janus_within_somethingP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_assert_finished(formula, mt, strength, direction, janus_deduce_specs);
        return ans;
    }

    public static SubLObject perform_assert_post_processing(final SubLObject assertions_found_or_created, final SubLObject deductions_found_or_created) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.every_in_list($sym125$ASSERTED_ASSERTION_, assertions_found_or_created, UNPROVIDED)) {
            SubLObject skolem_functions = NIL;
            SubLObject cdolist_list_var = assertions_found_or_created;
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == function_terms.tou_assertionP(ass)) {
                    SubLObject skolem_narts = NIL;
                    if (NIL != cycl_utilities.assertion_find_if($sym126$FAST_SKOLEM_NAT_, ass, NIL, UNPROVIDED)) {
                        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                        try {
                            cycl_utilities.$opaque_arg_function$.bind($sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_, thread);
                            skolem_narts = cycl_utilities.assertion_gather($sym126$FAST_SKOLEM_NAT_, ass, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != skolem_narts) {
                        SubLObject cdolist_list_var_$8 = skolem_narts;
                        SubLObject skolem_nart = NIL;
                        skolem_nart = cdolist_list_var_$8.first();
                        while (NIL != cdolist_list_var_$8) {
                            final SubLObject item_var = cycl_utilities.nat_functor(skolem_nart);
                            if (NIL == member(item_var, skolem_functions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                skolem_functions = cons(item_var, skolem_functions);
                            }
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            skolem_nart = cdolist_list_var_$8.first();
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            if (NIL != skolem_functions) {
                cdolist_list_var = skolem_functions;
                SubLObject skolem_function = NIL;
                skolem_function = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    perform_assert_post_processing_for_skolem(assertions_found_or_created, skolem_function);
                    cdolist_list_var = cdolist_list_var.rest();
                    skolem_function = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject perform_assert_post_processing_for_skolem(final SubLObject defining_assertions, final SubLObject skolem_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject skolem_defining_assertions_bookkeeping_sentence = list($$skolem, skolem_function);
        final SubLObject skolem_defining_assertions_bookkeeping_assertion = czer_meta.find_assertion_cycl(skolem_defining_assertions_bookkeeping_sentence, mt_vars.$skolem_mt$.getGlobalValue());
        if (NIL != skolem_defining_assertions_bookkeeping_assertion) {
            final SubLObject v_arguments = assertions_high.assertion_arguments(skolem_defining_assertions_bookkeeping_assertion);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(v_arguments, ONE_INTEGER, UNPROVIDED))) {
                Errors.error($str129$Found_a___skolem_assertion_with_m, skolem_defining_assertions_bookkeeping_assertion);
            }
            final SubLObject argument = v_arguments.first();
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == deduction_handles.deduction_p(argument))) {
                Errors.error($str130$Found_a___skolem_assertion_with_a, skolem_defining_assertions_bookkeeping_assertion);
            }
            final SubLObject existing_supports = deductions_high.deduction_supports(argument);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subsetp(defining_assertions, existing_supports, symbol_function(KBEQ), UNPROVIDED))) {
                Errors.error($str132$Defining_assertions_for__s___s__w, skolem_function, defining_assertions, existing_supports);
            }
        } else {
            cyc_kernel.cyc_add_argument(skolem_defining_assertions_bookkeeping_sentence, defining_assertions, mt_vars.$skolem_mt$.getGlobalValue(), $list133, NIL);
        }
        return NIL;
    }

    public static SubLObject fi_perform_assert_post_processing_for_skolem(final SubLObject tl_defining_assertions, SubLObject skolem) {
        SubLObject defining_assertions = NIL;
        SubLObject cdolist_list_var = tl_defining_assertions;
        SubLObject tl_defining_assertion = NIL;
        tl_defining_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject found_defining_assertions = ke.find_assertions_via_tl(tl_defining_assertion, NIL);
            if (NIL != found_defining_assertions) {
                defining_assertions = append(found_defining_assertions, defining_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tl_defining_assertion = cdolist_list_var.first();
        } 
        skolem = canon_tl.transform_tl_terms_to_hl(skolem);
        perform_assert_post_processing_for_skolem(defining_assertions, skolem);
        return NIL;
    }

    public static SubLObject fi_cnf_default_direction(final SubLObject cnf) {
        assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
        if (NIL != clause_utilities.pos_atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
            if (NIL != ist_sentence_p(asent, UNPROVIDED)) {
                final SubLObject sub_mt = designated_mt(asent);
                final SubLObject subsentence = designated_sentence(asent);
                SubLObject cdolist_list_var;
                final SubLObject sub_cnfs = cdolist_list_var = czer_utilities.extract_el_clauses(czer_main.canonicalize_wf_assert_sentence(subsentence, sub_mt));
                SubLObject sub_cnf = NIL;
                sub_cnf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ($BACKWARD == fi_cnf_default_direction(sub_cnf)) {
                        return $BACKWARD;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_cnf = cdolist_list_var.first();
                } 
                return $FORWARD;
            }
        }
        if ((NIL != clauses.atomic_clause_p(cnf)) && (NIL != clauses.ground_clause_p(cnf))) {
            return $FORWARD;
        }
        return $BACKWARD;
    }

    public static SubLObject fi_not_wff_error(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $generate_precise_fi_wff_errorsP$.getDynamicValue(thread)) {
            return list($FORMULA_NOT_WELL_FORMED, $str138$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff(formula, mt, UNPROVIDED));
        }
        return list($FORMULA_NOT_WELL_FORMED, $str139$Formula______S___was_not_well_for, formula);
    }

    public static SubLObject fi_not_wff_assert_error(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $generate_precise_fi_wff_errorsP$.getDynamicValue(thread)) {
            return list($FORMULA_NOT_WELL_FORMED, $str138$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff_assert(formula, mt, UNPROVIDED));
        }
        return list($FORMULA_NOT_WELL_FORMED, $str139$Formula______S___was_not_well_for, formula);
    }

    public static SubLObject fi_assert_update_asserted_argument(final SubLObject assertion, final SubLObject hl_tv, final SubLObject direction, SubLObject pre_existing_assertionP) {
        if (pre_existing_assertionP == UNPROVIDED) {
            pre_existing_assertionP = T;
        }
        final SubLObject current_direction = assertions_high.assertion_direction(assertion);
        final SubLObject existing_asserted_argument = assertions_high.get_asserted_argument(assertion);
        SubLObject truth_status = $UNINITIALIZED;
        SubLObject strength_status = $UNINITIALIZED;
        push_fi_last_assertions_asserted(assertion);
        if ((NIL != pre_existing_assertionP) && (NIL != existing_asserted_argument)) {
            final SubLObject existing_tv = arguments.argument_tv(existing_asserted_argument);
            if (hl_tv.eql(existing_tv)) {
                truth_status = $UNCHANGED;
                strength_status = $UNCHANGED;
                if (direction.eql(current_direction)) {
                    signal_fi_warning($list142);
                }
            } else {
                if (enumeration_types.tv_truth(existing_tv).eql(enumeration_types.tv_truth(hl_tv))) {
                    truth_status = $UNCHANGED;
                } else {
                    truth_status = $FLIPPED;
                }
                if (enumeration_types.tv_strength(existing_tv).eql(enumeration_types.tv_strength(hl_tv))) {
                    strength_status = $UNCHANGED;
                } else {
                    strength_status = $FLIPPED;
                }
                tms.tms_change_asserted_argument_tv(existing_asserted_argument, assertion, hl_tv);
            }
        } else {
            truth_status = $NEW;
            strength_status = $NEW;
            tms.tms_create_asserted_argument_with_tv(assertion, hl_tv, pre_existing_assertionP);
        }
        if (!direction.eql(current_direction)) {
            tms.tms_change_direction(assertion, direction);
        }
        return values(assertion, truth_status, strength_status);
    }

    public static SubLObject hl_assert_update_asserted_argument(final SubLObject assertion, final SubLObject hl_tv, final SubLObject direction, SubLObject pre_existing_assertionP) {
        if (pre_existing_assertionP == UNPROVIDED) {
            pre_existing_assertionP = T;
        }
        return fi_assert_update_asserted_argument(assertion, hl_tv, direction, pre_existing_assertionP);
    }

    public static SubLObject fi_reassert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction) {
        return fi($REASSERT, formula, hlmt_czer.canonicalize_hlmt(mt), strength, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_reassert_int(final SubLObject formula, SubLObject mt, final SubLObject strength, final SubLObject direction) {
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if (NIL == enumeration_types.el_strength_p(strength)) {
            signal_fi_error(list($ARG_ERROR, $str114$Expected__default_or__monotonic__, strength));
            return NIL;
        }
        if (NIL == enumeration_types.direction_p(direction)) {
            signal_fi_error(list($ARG_ERROR, $str115$Expected_a_direction__got__S, direction));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
        if (NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertions_high.asserted_assertionP(assertion)) {
                    final SubLObject hl_tv = fi_reassert_hl_tv(assertion, strength);
                    fi_assert_update_asserted_argument(assertion, hl_tv, direction, UNPROVIDED);
                } else {
                    final SubLObject current_strength = assertions_high.assertion_strength(assertion);
                    fi_rededuce_deduction_assertion(assertion, direction);
                    if (!strength.eql(current_strength)) {
                        signal_fi_warning($list146);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } else {
            signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        ans = makeBoolean(NIL == fi_error_signaledP());
        if (NIL == fi_error_signaledP()) {
            forward.perform_forward_inference();
        }
        return ans;
    }

    public static SubLObject fi_reassert_hl_tv(final SubLObject existing_assertion, final SubLObject new_strength) {
        return enumeration_types.tv_from_truth_strength(assertions_high.assertion_truth(existing_assertion), new_strength);
    }

    public static SubLObject fi_rededuce_deduction_assertion(final SubLObject assertion, final SubLObject direction) {
        tms.tms_recompute_dependents(assertion);
        if (!direction.eql(assertions_high.assertion_direction(assertion))) {
            tms.tms_change_direction(assertion, direction);
        }
        return assertion;
    }

    public static SubLObject fi_deny(final SubLObject formula, final SubLObject mt, final SubLObject direction) {
        return fi($DENY, formula, hlmt_czer.canonicalize_hlmt(mt), direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_deny_int(final SubLObject formula, SubLObject mt, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if ((NIL != direction) && (NIL == enumeration_types.direction_p(direction))) {
            signal_fi_error(list($ARG_ERROR, $str115$Expected_a_direction__got__S, direction));
            return NIL;
        }
        fi_assert_int(formula, mt, $DEFAULT, $BACKWARD);
        SubLObject ans = NIL;
        SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
        if (NIL == assertions) {
            assertions = czer_meta.find_assertions_cycl(formula, mt);
        }
        if (NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == direction) {
                    direction = fi_cnf_default_direction(assertions_high.assertion_cnf(assertion));
                }
                fi_assert_update_asserted_argument(assertion, $UNKNOWN, direction, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } else {
            signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        ans = makeBoolean(NIL == fi_error_signaledP());
        if (NIL == fi_error_signaledP()) {
            forward.perform_forward_inference();
        }
        return ans;
    }

    public static SubLObject fi_unassert(final SubLObject formula, final SubLObject mt) {
        return fi($UNASSERT, formula, hlmt_czer.canonicalize_hlmt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_unassert_int(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(sentence)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, sentence));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$9 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                SubLObject canon_versions = NIL;
                SubLObject deduced_argumentP = NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$10 = canonicalize_fi_unassert_sentence(sentence, mt);
                final SubLObject mt_$11 = thread.secondMultipleValue();
                final SubLObject deduced_argumentP_$12 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$10;
                mt = mt_$11;
                deduced_argumentP = deduced_argumentP_$12;
                final SubLObject canonical_mt = fi_convert_to_assert_hlmt(mt);
                if (NIL == fi_error_signaledP()) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canonical_mt);
                    final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ((NIL == deduced_argumentP) || (NIL != canon_versions)) {
                            if (NIL == canon_versions) {
                                signal_fi_error(fi_not_wff_error(sentence, mt));
                            } else
                                if (NIL != kb_utilities.kbeq(canon_versions, $$True)) {
                                    signal_fi_error(list($TAUTOLOGY, $str154$Sentence______S___in__S_was_a_tau, sentence, mt));
                                } else
                                    if (NIL != kb_utilities.kbeq(canon_versions, $$False)) {
                                        signal_fi_error(list($CONTRADICTION, $str155$Sentence______S___in__S_was_a_con, sentence, mt));
                                    } else {
                                        SubLObject cdolist_list_var = canon_versions;
                                        SubLObject canon_version = NIL;
                                        canon_version = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if (NIL == fi_error_signaledP()) {
                                                SubLObject current;
                                                final SubLObject datum = current = canon_version;
                                                SubLObject cnf = NIL;
                                                destructuring_bind_must_consp(current, datum, $list122);
                                                cnf = current.first();
                                                current = current.rest();
                                                final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list122);
                                                current = current.rest();
                                                final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list122);
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL == hl_storage_modules.hl_unassert(cnf, mt)) {
                                                        signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str156$Sentence__S_in_mt__S_is_not_in_th, sentence, mt));
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list122);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            canon_version = cdolist_list_var.first();
                                        } 
                                    }


                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$9, thread);
            }
            if (NIL != ans) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject canonicalize_fi_unassert_sentence(final SubLObject sentence, final SubLObject mt) {
        return canonicalize_fi_remove_sentence(sentence, mt, T);
    }

    public static SubLObject canonicalize_fi_blast_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canon_versions = canonicalize_fi_remove_sentence(sentence, mt, NIL);
        final SubLObject mt_$14 = thread.secondMultipleValue();
        final SubLObject deduced_argumentP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(canon_versions, mt_$14);
    }

    public static SubLObject canonicalize_fi_remove_sentence(final SubLObject sentence, SubLObject mt, final SubLObject check_for_asserted_argumentP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_sentence = canon_tl.transform_tl_terms_to_hl(sentence);
        thread.resetMultipleValues();
        final SubLObject el_sentence_$15 = czer_utilities.unwrap_if_ist(el_sentence, mt, UNPROVIDED);
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        el_sentence = el_sentence_$15;
        mt = mt_$16;
        mt = canonicalize_unassert_hlmt(mt);
        SubLObject canon_versions = NIL;
        SubLObject deduced_argumentP = NIL;
        SubLObject assertions = ke.find_assertions_via_tl(sentence, mt);
        if ((NIL == assertions) && (NIL != hlmt.hlmt_p(mt))) {
            assertions = czer_meta.find_assertions_cycl(el_sentence, mt);
        }
        if (NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != check_for_asserted_argumentP) && (NIL == assertions_high.get_asserted_argument(assertion))) {
                    signal_fi_warning(list($ASSERTION_NOT_LOCAL, $str158$Sentence__S_in_mt__S_is_not_local, el_sentence, mt));
                    deduced_argumentP = T;
                } else {
                    final SubLObject cnf = assertions_high.assertion_cnf(assertion);
                    final SubLObject variable_map = NIL;
                    final SubLObject query_free_vars = NIL;
                    final SubLObject canon_version = list(cnf, variable_map, query_free_vars);
                    final SubLObject ass_mt = assertions_high.assertion_mt(assertion);
                    canon_versions = cons(canon_version, canon_versions);
                    mt = ass_mt;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                thread.resetMultipleValues();
                final SubLObject canon_versions_$17 = czer_main.canonicalize_unassert_sentence(el_sentence, mt);
                final SubLObject mt_$17 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$17;
                mt = mt_$17;
            }

        return values(canon_versions, mt, deduced_argumentP);
    }

    public static SubLObject canonicalize_unassert_hlmt(SubLObject mt) {
        mt = canon_tl.tlmt_to_hlmt(mt);
        mt = narts_high.nart_substitute(mt);
        return mt;
    }

    public static SubLObject fi_edit(final SubLObject old_formula, final SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (old_mt == UNPROVIDED) {
            old_mt = NIL;
        }
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return fi($EDIT, old_formula, new_formula, hlmt_czer.canonicalize_hlmt(old_mt), hlmt_czer.canonicalize_hlmt(new_mt), strength, direction, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_edit_int(final SubLObject old_formula, final SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (old_mt == UNPROVIDED) {
            old_mt = NIL;
        }
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        fi_edit.new_fi_edit_int(old_formula, new_formula, old_mt, new_mt, strength, direction);
        return makeBoolean(NIL == fi_error_signaledP());
    }

    public static SubLObject fi_justify(final SubLObject formula, final SubLObject mt, SubLObject fullP) {
        if (fullP == UNPROVIDED) {
            fullP = NIL;
        }
        return fi($JUSTIFY, formula, hlmt_czer.canonicalize_hlmt(mt), fullP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_justify_int(final SubLObject formula, SubLObject mt, SubLObject fullP) {
        if (fullP == UNPROVIDED) {
            fullP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            ans = formula_justify(formula, mt, fullP);
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject formula_justify(final SubLObject formula, SubLObject mt, SubLObject fullP) {
        if (fullP == UNPROVIDED) {
            fullP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$19 = czer_main.canonicalize_query_sentence(formula, mt);
        final SubLObject mt_$20 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$19;
        mt = mt_$20;
        if (NIL == canon_versions) {
            signal_fi_error(fi_not_wff_error(formula, mt));
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(canon_versions, $$True)) {
            signal_fi_warning(list($TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, mt));
        } else
            if (NIL != kb_utilities.kbeq(canon_versions, $$False)) {
                signal_fi_warning(list($CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, mt));
            } else {
                SubLObject cdolist_list_var = canon_versions;
                SubLObject canon_version = NIL;
                canon_version = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject dnf = canon_version.first();
                    final SubLObject neg_lits = clauses.neg_lits(dnf);
                    final SubLObject pos_lits = clauses.pos_lits(dnf);
                    SubLObject cdolist_list_var_$21 = neg_lits;
                    SubLObject neg_lit = NIL;
                    neg_lit = cdolist_list_var_$21.first();
                    while (NIL != cdolist_list_var_$21) {
                        neg_lit = cycl_utilities.negate(neg_lit);
                        final SubLObject justs = gaf_justify(neg_lit, mt, fullP);
                        if (NIL == justs) {
                            signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, neg_lit, mt));
                            return NIL;
                        }
                        SubLObject cdolist_list_var_$22 = justs;
                        SubLObject just = NIL;
                        just = cdolist_list_var_$22.first();
                        while (NIL != cdolist_list_var_$22) {
                            final SubLObject item_var = just;
                            if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                            just = cdolist_list_var_$22.first();
                        } 
                        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                        neg_lit = cdolist_list_var_$21.first();
                    } 
                    SubLObject cdolist_list_var_$23 = pos_lits;
                    SubLObject pos_lit = NIL;
                    pos_lit = cdolist_list_var_$23.first();
                    while (NIL != cdolist_list_var_$23) {
                        final SubLObject justs = gaf_justify(pos_lit, mt, fullP);
                        if (NIL == justs) {
                            signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, pos_lit, mt));
                            return NIL;
                        }
                        SubLObject cdolist_list_var_$24 = justs;
                        SubLObject just = NIL;
                        just = cdolist_list_var_$24.first();
                        while (NIL != cdolist_list_var_$24) {
                            final SubLObject item_var = just;
                            if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                            cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                            just = cdolist_list_var_$24.first();
                        } 
                        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                        pos_lit = cdolist_list_var_$23.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    canon_version = cdolist_list_var.first();
                } 
            }

        return nreverse(result);
    }

    public static SubLObject gaf_justify(final SubLObject formula, final SubLObject mt, final SubLObject fullP) {
        final SubLObject justs = one_step_gaf_justify(formula, mt);
        if (NIL == justs) {
            return NIL;
        }
        if (length(justs).numE(ONE_INTEGER)) {
            return justs;
        }
        if (NIL == fullP) {
            return justs;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = justs;
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = just;
            SubLObject hl_module = NIL;
            SubLObject just_formula = NIL;
            SubLObject just_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list164);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list164);
            just_formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list164);
            just_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                if (hl_module.eql(arguments.$assertion_support_module$.getGlobalValue())) {
                    final SubLObject recursive_justs = gaf_justify(just_formula, just_mt, T);
                    if (NIL == recursive_justs) {
                        return NIL;
                    }
                    SubLObject cdolist_list_var_$25 = recursive_justs;
                    SubLObject recursive_just = NIL;
                    recursive_just = cdolist_list_var_$25.first();
                    while (NIL != cdolist_list_var_$25) {
                        final SubLObject item_var = recursive_just;
                        if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                        cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                        recursive_just = cdolist_list_var_$25.first();
                    } 
                } else {
                    final SubLObject item_var2 = just;
                    if (NIL == member(item_var2, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        result = cons(item_var2, result);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list164);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject one_step_gaf_justify(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$26 = czer_main.canonicalize_cycl_sentence(formula, mt);
        final SubLObject mt_$27 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$26;
        mt = mt_$27;
        if (NIL == canon_versions) {
            signal_fi_error(fi_not_wff_error(formula, mt));
            return NIL;
        }
        if (canon_versions.isCons()) {
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = NIL;
            canon_version = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == fi_error_signaledP()) {
                    thread.resetMultipleValues();
                    final SubLObject cnf = fi_canonicalize(canon_version, T, UNPROVIDED);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    final SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
                    if (NIL == assertion) {
                        signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                    } else {
                        final SubLObject matching_argument = find(assertions_high.cyc_assertion_tv(assertion), assertions_high.assertion_arguments(assertion), symbol_function(EQL), symbol_function(ARGUMENT_TV), UNPROVIDED, UNPROVIDED);
                        if (NIL != matching_argument) {
                            if (NIL != arguments.belief_p(matching_argument)) {
                                final SubLObject item_var = justify_support(assertion);
                                if (NIL == member(item_var, v_answer, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    v_answer = cons(item_var, v_answer);
                                }
                            } else {
                                SubLObject cdolist_list_var_$28 = deductions_high.deduction_supports(matching_argument);
                                SubLObject support = NIL;
                                support = cdolist_list_var_$28.first();
                                while (NIL != cdolist_list_var_$28) {
                                    final SubLObject item_var2 = justify_support(support);
                                    if (NIL == member(item_var2, v_answer, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        v_answer = cons(item_var2, v_answer);
                                    }
                                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                    support = cdolist_list_var_$28.first();
                                } 
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                canon_version = cdolist_list_var.first();
            } 
        }
        return nreverse(v_answer);
    }

    public static SubLObject justify_support(final SubLObject support) {
        return list(arguments.support_module(support), arguments.support_formula(support), arguments.support_mt(support));
    }

    public static SubLObject fi_add_argument(final SubLObject formula, final SubLObject mt, final SubLObject supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        return fi($ADD_ARGUMENT, formula, hlmt_czer.canonicalize_hlmt(mt), supports, direction, verify_supportsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_add_argument_int(SubLObject formula, SubLObject mt, SubLObject supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        if (!supports.isCons()) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, supports));
            return NIL;
        }
        formula = canon_tl.transform_tl_terms_to_hl(formula);
        mt = canon_tl.transform_tl_terms_to_hl(mt);
        supports = canon_tl.transform_tl_terms_to_hl(supports);
        mt = fi_convert_to_assert_hlmt_if_wft(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == arguments.support_p(support)) {
                signal_fi_error(list($ARG_ERROR, $str167$Expected_a_support__got__S, support));
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        if ((NIL != direction) && (NIL == member(direction, $list168, UNPROVIDED, UNPROVIDED))) {
            signal_fi_error(list($ARG_ERROR, $str169$Expected__forward_or__backward__g, direction));
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject v_hl_supports = fi_canonicalize_el_supports(supports, verify_supportsP);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            signal_fi_error(error);
            return NIL;
        }
        supports = v_hl_supports;
        SubLObject local_deductions_found_or_created = NIL;
        SubLObject ans = NIL;
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$29 = (NIL != $assume_assert_sentence_is_wfP$.getDynamicValue(thread)) ? czer_main.canonicalize_wf_assert_sentence(formula, mt) : czer_main.canonicalize_assert_sentence(formula, mt);
        final SubLObject mt_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$29;
        mt = mt_$30;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $within_fi_operationP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            $within_fi_operationP$.bind(T, thread);
            if (NIL == canon_versions) {
                signal_fi_error(fi_not_wff_assert_error(formula, mt));
            } else
                if (NIL != kb_utilities.kbeq(canon_versions, $$True)) {
                    signal_fi_error(list($TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, mt));
                } else
                    if (NIL != kb_utilities.kbeq(canon_versions, $$False)) {
                        signal_fi_error(list($CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, mt));
                    } else {
                        SubLObject cdolist_list_var2 = canon_versions;
                        SubLObject canon_version = NIL;
                        canon_version = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL == fi_error_signaledP()) {
                                SubLObject current;
                                final SubLObject datum = current = canon_version;
                                SubLObject cnf = NIL;
                                destructuring_bind_must_consp(current, datum, $list122);
                                cnf = current.first();
                                current = current.rest();
                                final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
                                destructuring_bind_must_listp(current, datum, $list122);
                                current = current.rest();
                                final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
                                destructuring_bind_must_listp(current, datum, $list122);
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == direction) {
                                        direction = fi_cnf_default_direction(cnf);
                                    }
                                    local_deductions_found_or_created = cons(hl_storage_modules.hl_add_deduction(cnf, mt, supports, direction, variable_map, UNPROVIDED, UNPROVIDED), local_deductions_found_or_created);
                                } else {
                                    cdestructuring_bind_error(datum, $list122);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            canon_version = cdolist_list_var2.first();
                        } 
                    }


            ans = makeBoolean(NIL == fi_error_signaledP());
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == fi_error_signaledP()) {
            final SubLObject forward_deductions_found_or_created = forward.perform_forward_inference();
            perform_deduce_post_processing(local_deductions_found_or_created, forward_deductions_found_or_created);
        }
        return ans;
    }

    public static SubLObject perform_deduce_post_processing(final SubLObject local_deductions_found_or_created, final SubLObject forward_deductions_found_or_created) {
        return perform_assert_post_processing(Mapping.mapcar(DEDUCTION_ASSERTION, local_deductions_found_or_created), forward_deductions_found_or_created);
    }

    public static SubLObject convert_hl_support_to_el_support(final SubLObject hl_support) {
        return convert_hl_support_to_fi_support(hl_support);
    }

    public static SubLObject convert_hl_support_to_fi_support(final SubLObject hl_support) {
        if (NIL != assertion_handles.assertion_p(hl_support)) {
            return hl_support;
        }
        final SubLObject module = arguments.support_module(hl_support);
        SubLObject formula = copy_tree(arguments.support_formula(hl_support));
        final SubLObject mt = arguments.support_mt(hl_support);
        final SubLObject truth = arguments.support_truth(hl_support);
        final SubLObject strength = arguments.support_strength(hl_support);
        if (truth == $FALSE) {
            formula = cycl_utilities.negate(formula);
        }
        final SubLObject el_support = make_el_support(module, formula, mt, strength);
        return el_support;
    }

    public static SubLObject convert_hl_support_to_tl_support(final SubLObject hl_support) {
        final SubLObject module = arguments.support_module(hl_support);
        SubLObject formula = arguments.support_formula(hl_support);
        final SubLObject mt = arguments.support_mt(hl_support);
        final SubLObject truth = arguments.support_truth(hl_support);
        final SubLObject strength = arguments.support_strength(hl_support);
        if (NIL != assertion_handles.assertion_p(hl_support)) {
            formula = canon_tl.assertion_tl_formula(hl_support);
        }
        formula = copy_tree(formula);
        if (truth == $FALSE) {
            formula = cycl_utilities.negate(formula);
        }
        final SubLObject el_support = make_el_support(module, formula, mt, strength);
        return el_support;
    }

    public static SubLObject make_el_support(final SubLObject module, final SubLObject formula, SubLObject mt, SubLObject strength) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        return list(module, formula, mt, strength);
    }

    public static SubLObject fi_canonicalize_el_supports(final SubLObject el_supports, SubLObject verify_supportsP) {
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_hl_supports = NIL;
        SubLObject cdolist_list_var = el_supports;
        SubLObject el_support = NIL;
        el_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(el_support)) {
                v_hl_supports = cons(el_support, v_hl_supports);
            } else {
                SubLObject current;
                final SubLObject datum = current = el_support;
                SubLObject hl_module = NIL;
                SubLObject formula = NIL;
                SubLObject mt = NIL;
                SubLObject strength = NIL;
                destructuring_bind_must_consp(current, datum, $list172);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list172);
                formula = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list172);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list172);
                strength = current.first();
                current = current.rest();
                if (NIL == current) {
                    mt = fi_convert_to_assert_hlmt(mt);
                    if (NIL != fi_error_signaledP()) {
                        return values(NIL, fi_get_error_int());
                    }
                    if (hl_module.eql(arguments.$assertion_support_module$.getGlobalValue())) {
                        thread.resetMultipleValues();
                        final SubLObject assertions = el_support_assertions(formula, mt);
                        final SubLObject all_thereP = thread.secondMultipleValue();
                        final SubLObject malformedP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != malformedP) {
                            return values(NIL, list($SUPPORT_MALFORMED, $str174$Support__S_was_malformed, el_support));
                        }
                        if (NIL == all_thereP) {
                            return values(NIL, list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                        }
                        if (NIL == assertions) {
                            return values(NIL, list($SUPPORT_MALFORMED, $str174$Support__S_was_malformed, el_support));
                        }
                        SubLObject cdolist_list_var_$31 = assertions;
                        SubLObject assertion = NIL;
                        assertion = cdolist_list_var_$31.first();
                        while (NIL != cdolist_list_var_$31) {
                            if (NIL == assertion_handles.assertion_p(assertion)) {
                                return values(NIL, list($SUPPORT_MALFORMED, $str174$Support__S_was_malformed, el_support));
                            }
                            v_hl_supports = cons(assertion, v_hl_supports);
                            cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                            assertion = cdolist_list_var_$31.first();
                        } 
                    } else {
                        final SubLObject tv = enumeration_types.tv_from_truth_strength($TRUE, strength);
                        final SubLObject hl_support = arguments.make_hl_support(hl_module, formula, mt, tv);
                        if ((NIL != verify_supportsP) && (NIL != tms.stale_support(hl_support))) {
                            return values(NIL, list($SUPPORT_INVALID, $str177$Support__S_is_not_currently_valid, el_support));
                        }
                        v_hl_supports = cons(hl_support, v_hl_supports);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list172);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            el_support = cdolist_list_var.first();
        } 
        return values(nreverse(v_hl_supports), NIL);
    }

    public static SubLObject el_support_assertions(final SubLObject sentence, final SubLObject mt) {
        final SubLObject assertions = ke.find_assertions_via_tl(sentence, mt);
        if (NIL != assertions) {
            return values(assertions, T, NIL);
        }
        return sentence_assertions(sentence, mt);
    }

    public static SubLObject fi_remove_argument(final SubLObject sentence, final SubLObject mt, final SubLObject supports, SubLObject verify_supportsP) {
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        return fi($REMOVE_ARGUMENT, sentence, hlmt_czer.canonicalize_hlmt(mt), supports, verify_supportsP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_remove_argument_int(final SubLObject sentence, SubLObject mt, SubLObject supports, SubLObject verify_supportsP) {
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(sentence)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, sentence));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if (!supports.isCons()) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, supports));
            return NIL;
        }
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == arguments.support_p(support)) {
                signal_fi_error(list($ARG_ERROR, $str167$Expected_a_support__got__S, support));
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        thread.resetMultipleValues();
        final SubLObject v_hl_supports = fi_canonicalize_el_supports(supports, verify_supportsP);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            signal_fi_error(error);
            return NIL;
        }
        supports = v_hl_supports;
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$32 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    SubLObject canon_versions = NIL;
                    thread.resetMultipleValues();
                    final SubLObject canon_versions_$34 = czer_main.canonicalize_unassert_sentence(sentence, mt);
                    final SubLObject mt_$35 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    canon_versions = canon_versions_$34;
                    mt = mt_$35;
                    if (NIL == canon_versions) {
                        signal_fi_error(fi_not_wff_error(sentence, mt));
                    } else
                        if (NIL != kb_utilities.kbeq(canon_versions, $$True)) {
                            signal_fi_error(list($TAUTOLOGY, $str154$Sentence______S___in__S_was_a_tau, sentence, mt));
                        } else
                            if (NIL != kb_utilities.kbeq(canon_versions, $$False)) {
                                signal_fi_error(list($CONTRADICTION, $str155$Sentence______S___in__S_was_a_con, sentence, mt));
                            } else {
                                SubLObject cdolist_list_var2 = canon_versions;
                                SubLObject canon_version = NIL;
                                canon_version = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL == fi_error_signaledP()) {
                                        SubLObject current;
                                        final SubLObject datum = current = canon_version;
                                        SubLObject cnf = NIL;
                                        destructuring_bind_must_consp(current, datum, $list122);
                                        cnf = current.first();
                                        current = current.rest();
                                        final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
                                        destructuring_bind_must_listp(current, datum, $list122);
                                        current = current.rest();
                                        final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
                                        destructuring_bind_must_listp(current, datum, $list122);
                                        current = current.rest();
                                        if (NIL == current) {
                                            hl_storage_modules.hl_remove_deduction(cnf, mt, supports);
                                        } else {
                                            cdestructuring_bind_error(datum, $list122);
                                        }
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    canon_version = cdolist_list_var2.first();
                                } 
                            }


                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$33, thread);
                }
                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$32, thread);
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_blast(final SubLObject formula, final SubLObject mt) {
        return fi($BLAST, formula, hlmt_czer.canonicalize_hlmt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_blast_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$36 = $within_fi_operationP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                SubLObject canon_versions = NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$37 = canonicalize_fi_blast_sentence(formula, mt);
                final SubLObject mt_$38 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$37;
                mt = mt_$38;
                final SubLObject canonical_mt = fi_convert_to_assert_hlmt(mt);
                if (NIL == fi_error_signaledP()) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canonical_mt);
                    final SubLObject _prev_bind_0_$37 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$40 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == canon_versions) {
                            signal_fi_error(fi_not_wff_error(formula, mt));
                        } else
                            if (NIL != kb_utilities.kbeq(canon_versions, $$True)) {
                                signal_fi_error(list($TAUTOLOGY, $str118$Formula______S___in__S_was_a_taut, formula, mt));
                            } else
                                if (NIL != kb_utilities.kbeq(canon_versions, $$False)) {
                                    signal_fi_error(list($CONTRADICTION, $str121$Formula______S___in__S_was_a_cont, formula, mt));
                                } else {
                                    SubLObject cdolist_list_var = canon_versions;
                                    SubLObject canon_version = NIL;
                                    canon_version = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL == fi_error_signaledP()) {
                                            SubLObject current;
                                            final SubLObject datum = current = canon_version;
                                            SubLObject cnf = NIL;
                                            destructuring_bind_must_consp(current, datum, $list122);
                                            cnf = current.first();
                                            current = current.rest();
                                            final SubLObject variable_map = (current.isCons()) ? current.first() : NIL;
                                            destructuring_bind_must_listp(current, datum, $list122);
                                            current = current.rest();
                                            final SubLObject query_free_vars = (current.isCons()) ? current.first() : NIL;
                                            destructuring_bind_must_listp(current, datum, $list122);
                                            current = current.rest();
                                            if (NIL == current) {
                                                hl_storage_modules.hl_remove_all_arguments(cnf, mt);
                                            } else {
                                                cdestructuring_bind_error(datum, $list122);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        canon_version = cdolist_list_var.first();
                                    } 
                                }


                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$40, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
                $within_fi_operationP$.rebind(_prev_bind_0_$36, thread);
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return fi($ASK, formula, hlmt_czer.canonicalize_hlmt(mt), backchain, number, time, depth, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_ask_int(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if ((NIL == el_formula_p(formula)) && (NIL == cycl_grammar.cycl_truth_value_p(formula))) {
            signal_fi_error(list($ARG_ERROR, $str188$Expected_a_formula__got__S, formula));
            return NIL;
        }
        if (NIL != fi_ask_ist_query_p(formula)) {
            SubLObject ist = NIL;
            SubLObject ist_mt = NIL;
            SubLObject ist_formula = NIL;
            destructuring_bind_must_consp(formula, formula, $list189);
            ist = formula.first();
            SubLObject current = formula.rest();
            destructuring_bind_must_consp(current, formula, $list189);
            ist_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, formula, $list189);
            ist_formula = current.first();
            current = current.rest();
            if (NIL == current) {
                return fi_ask_int(ist_formula, ist_mt, backchain, number, time, depth);
            }
            cdestructuring_bind_error(formula, $list189);
            return NIL;
        } else {
            if (NIL == mt) {
                mt = mt_vars.$default_ask_mt$.getGlobalValue();
            }
            mt = fi_convert_to_ask_hlmt(mt);
            if (NIL != fi_error_signaledP()) {
                return NIL;
            }
            if (((NIL != backchain) && (backchain != T)) && (!backchain.isInteger())) {
                signal_fi_error(list($ARG_ERROR, $str190$Expected_an_integer__got__S, backchain));
                return NIL;
            }
            if ((NIL != number) && (!number.isInteger())) {
                signal_fi_error(list($ARG_ERROR, $str190$Expected_an_integer__got__S, number));
                return NIL;
            }
            if ((NIL != time) && (!time.isInteger())) {
                signal_fi_error(list($ARG_ERROR, $str190$Expected_an_integer__got__S, time));
                return NIL;
            }
            if ((NIL != depth) && (!depth.isInteger())) {
                signal_fi_error(list($ARG_ERROR, $str190$Expected_an_integer__got__S, depth));
                return NIL;
            }
            SubLObject v_answer = NIL;
            SubLObject reason = NIL;
            final SubLObject environment = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                final SubLObject _prev_bind_0_$41 = $within_fi_operationP$.currentBinding(thread);
                try {
                    $within_fi_operationP$.bind(T, thread);
                    thread.resetMultipleValues();
                    final SubLObject v_answer_$42 = fi_ask_int_new_cyc_query_trampoline(formula, mt, backchain, number, time, depth);
                    final SubLObject reason_$43 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_answer = v_answer_$42;
                    reason = reason_$43;
                } finally {
                    $within_fi_operationP$.rebind(_prev_bind_0_$41, thread);
                }
                if (NIL == fi_error_signaledP()) {
                    forward.perform_forward_inference();
                }
            } finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
            }
            return values(v_answer, reason);
        }
    }

    public static SubLObject fi_ask_ist_query_p(final SubLObject formula) {
        return makeBoolean((((NIL != el_formula_with_operator_p(formula, $$ist)) && length(formula).numE(THREE_INTEGER)) && (NIL != forts.fort_p(second(formula)))) && third(formula).isCons());
    }

    public static SubLObject fi_ask_int_new_cyc_query_trampoline(final SubLObject sentence, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject fi_continue_last_ask(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deep) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (reconsider_deep == UNPROVIDED) {
            reconsider_deep = NIL;
        }
        return fi($CONTINUE_LAST_ASK, backchain, number, time, depth, reconsider_deep, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_continue_last_ask_int(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deep) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (reconsider_deep == UNPROVIDED) {
            reconsider_deep = NIL;
        }
        Errors.error($str198$fi_continue_last_ask_int_is_depre);
        return NIL;
    }

    public static SubLObject fi_ask_status() {
        Errors.error($str199$fi_ask_status_is_deprecated__use_);
        return NIL;
    }

    public static SubLObject fi_ask_status_int() {
        Errors.error($str204$fi_ask_status_int_is_deprecated__);
        return NIL;
    }

    public static SubLObject fi_tms_reconsider_formula(final SubLObject formula, final SubLObject mt) {
        return fi($TMS_RECONSIDER_FORMULA, formula, hlmt_czer.canonicalize_hlmt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_tms_reconsider_formula_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$44 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                final SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
                if (NIL != assertions) {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        tms.tms_reconsider_assertion(assertion);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                } else {
                    SubLObject canon_versions = NIL;
                    thread.resetMultipleValues();
                    final SubLObject canon_versions_$45 = czer_main.canonicalize_cycl_sentence(formula, mt);
                    final SubLObject mt_$46 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    canon_versions = canon_versions_$45;
                    mt = mt_$46;
                    if (NIL == canon_versions) {
                        signal_fi_error(fi_not_wff_error(formula, mt));
                    } else
                        if (NIL == cycl_grammar.cycl_truth_value_p(canon_versions)) {
                            SubLObject cdolist_list_var2 = canon_versions;
                            SubLObject canon_version = NIL;
                            canon_version = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                thread.resetMultipleValues();
                                final SubLObject cnf = fi_canonicalize(canon_version, T, UNPROVIDED);
                                final SubLObject v_variables = thread.secondMultipleValue();
                                final SubLObject hl_tv = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject assertion2 = kb_indexing.find_assertion(cnf, mt);
                                if (NIL == assertion2) {
                                    signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                                } else {
                                    tms.tms_reconsider_assertion(assertion2);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                canon_version = cdolist_list_var2.first();
                            } 
                        }

                }
                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$44, thread);
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_tms_reconsider_mt(final SubLObject mt) {
        return fi($TMS_RECONSIDER_MT, hlmt_czer.canonicalize_hlmt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_tms_reconsider_mt_int(SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$47 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                tms.tms_reconsider_mt(mt);
                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$47, thread);
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_tms_reconsider_gafs(final SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi($TMS_RECONSIDER_GAFS, v_term, arg, predicate, hlmt_czer.canonicalize_hlmt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_tms_reconsider_gafs_int(SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        v_term = fi_convert_to_fort(v_term);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if ((NIL != arg) && ((!arg.isFixnum()) || (NIL == enumeration_types.term_arg_p(arg)))) {
            signal_fi_error(list($ARG_ERROR, $str216$Expected_an_integer_0_5__got__S, arg));
            return NIL;
        }
        if (NIL != predicate) {
            predicate = fi_convert_to_fort(predicate);
            if (NIL != fi_error_signaledP()) {
                return NIL;
            }
        }
        if (NIL != mt) {
            mt = fi_convert_to_assert_hlmt(mt);
            if (NIL != fi_error_signaledP()) {
                return NIL;
            }
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$48 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                if (NIL == arg) {
                    tms.tms_reconsider_term_gafs(v_term, mt);
                } else
                    if (arg.isZero()) {
                        tms.tms_reconsider_predicate_extent(v_term, mt);
                    } else {
                        tms.tms_reconsider_gaf_args(v_term, arg, predicate, mt);
                    }

                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$48, thread);
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_tms_reconsider_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi($TMS_RECONSIDER_TERM, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_tms_reconsider_term_int(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        v_term = fi_convert_to_fort(v_term);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        if (NIL != mt) {
            mt = fi_convert_to_assert_hlmt(mt);
            if (NIL != fi_error_signaledP()) {
                return NIL;
            }
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$49 = $within_fi_operationP$.currentBinding(thread);
            try {
                $within_fi_operationP$.bind(T, thread);
                tms.tms_reconsider_term(v_term, mt);
                ans = makeBoolean(NIL == fi_error_signaledP());
            } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_$49, thread);
            }
            if (NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_denotation(final SubLObject string) {
        return fi($DENOTATION, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_denotation_int(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!string.isString()) {
            signal_fi_error(list($ARG_ERROR, $str33$Expected_a_string__got__S, string));
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            ans = lexicon_accessors.denots_of_string(string, $list222, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_timestamp_constant(final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        return fi($TIMESTAMP_CONSTANT, cyclist, time, why, second, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_timestamp_constant_int(SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyclist = canon_tl.transform_tl_terms_to_hl(cyclist);
        if (NIL != why) {
            why = canon_tl.transform_tl_terms_to_hl(why);
        }
        reset_fi_error_state();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            if (NIL == forts.fort_p(cyclist)) {
                signal_fi_warning($list224);
            } else
                if (!time.isInteger()) {
                    signal_fi_warning($list225);
                } else
                    if ((NIL != why) && (NIL == constant_p(why))) {
                        signal_fi_warning($list226);
                    } else
                        if ((NIL != second) && (NIL == numeric_date_utilities.universal_second_p(second))) {
                            signal_fi_warning($list227);
                        } else
                            if (NIL == constant_p($fi_last_constant$.getDynamicValue(thread))) {
                                signal_fi_warning($list228);
                            } else
                                if (NIL != constant_timestampedP($fi_last_constant$.getDynamicValue(thread))) {
                                    signal_fi_warning($list229);
                                } else {
                                    timestamp_constant($fi_last_constant$.getDynamicValue(thread), cyclist, time, why, second);
                                }





            ans = makeBoolean(NIL == fi_error_signaledP());
            $fi_last_constant$.setDynamicValue(NIL, thread);
            set_fi_last_assertions_asserted(NIL);
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject constant_timestampedP(final SubLObject constant) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return makeBoolean((((NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $$myCreator, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $$myCreationTime, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $$myCreationPurpose, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $$myCreationSecond, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject timestamp_constant(final SubLObject constant, final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        final SubLObject v_properties = list($STRENGTH, $MONOTONIC, $DIRECTION, $BACKWARD);
        cyc_kernel.cyc_assert_wff(list($$myCreator, constant, cyclist), $$BookkeepingMt, v_properties);
        cyc_kernel.cyc_assert_wff(list($$myCreationTime, constant, time), $$BookkeepingMt, v_properties);
        if (NIL != constant_p(why)) {
            cyc_kernel.cyc_assert_wff(list($$myCreationPurpose, constant, why), $$BookkeepingMt, v_properties);
        }
        if (NIL != numeric_date_utilities.universal_second_p(second)) {
            cyc_kernel.cyc_assert_wff(list($$myCreationSecond, constant, second), $$BookkeepingMt, v_properties);
        }
        return constant;
    }

    public static SubLObject untimestamp_constant(final SubLObject constant) {
        final SubLObject cyclist = kb_mapping_utilities.fpred_value_in_mt(constant, $$myCreator, $$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != cyclist) {
            fi_unassert_int(list($$myCreator, constant, cyclist), $$BookkeepingMt);
        }
        final SubLObject time = kb_mapping_utilities.fpred_value_in_mt(constant, $$myCreationTime, $$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != time) {
            fi_unassert_int(list($$myCreationTime, constant, time), $$BookkeepingMt);
        }
        final SubLObject why = kb_mapping_utilities.fpred_value_in_mt(constant, $$myCreationPurpose, $$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != why) {
            fi_unassert_int(list($$myCreationPurpose, constant, why), $$BookkeepingMt);
        }
        final SubLObject second = kb_mapping_utilities.fpred_value_in_mt(constant, $$myCreationSecond, $$BookkeepingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != second) {
            fi_unassert_int(list($$myCreationSecond, constant, second), $$BookkeepingMt);
        }
        return constant;
    }

    public static SubLObject retimestamp_constant(final SubLObject constant, final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        if ((((NIL != forts.fort_p(cyclist)) && time.isInteger()) && ((NIL == why) || (NIL != constant_p(why)))) && ((NIL == second) || (NIL != numeric_date_utilities.universal_second_p(second)))) {
            untimestamp_constant(constant);
            timestamp_constant(constant, cyclist, time, why, second);
        }
        return constant;
    }

    public static SubLObject fi_timestamp_assertion(final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        return fi($TIMESTAMP_ASSERTION, cyclist, time, why, second, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_timestamp_assertion_int(SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyclist = canon_tl.transform_tl_terms_to_hl(cyclist);
        if (NIL != why) {
            why = canon_tl.transform_tl_terms_to_hl(why);
        }
        reset_fi_error_state();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
        try {
            $within_fi_operationP$.bind(T, thread);
            if (NIL == forts.fort_p(cyclist)) {
                signal_fi_warning($list224);
            } else
                if (!time.isInteger()) {
                    signal_fi_warning($list225);
                } else
                    if ((NIL != why) && (NIL == constant_p(why))) {
                        signal_fi_warning($list226);
                    } else
                        if ((NIL != second) && (NIL == numeric_date_utilities.universal_second_p(second))) {
                            signal_fi_warning($list227);
                        } else
                            if (!czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread).isCons()) {
                                signal_fi_warning($list239);
                            } else {
                                SubLObject cdolist_list_var;
                                final SubLObject assertions = cdolist_list_var = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                                SubLObject assertion = NIL;
                                assertion = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                        if (NIL != assertions_low.asserted_assertion_timestampedP(assertion)) {
                                            signal_fi_warning($list229);
                                        } else {
                                            assertions_high.timestamp_asserted_assertion(assertion, cyclist, time, why, second);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    assertion = cdolist_list_var.first();
                                } 
                            }




            ans = makeBoolean(NIL == fi_error_signaledP());
            set_fi_last_assertions_asserted(NIL);
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_remove_timestamp(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi($REMOVE_TIMESTAMP, sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_remove_timestamp_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_fi_operationP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            $within_fi_operationP$.bind(T, thread);
            final SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
            if (NIL != assertions) {
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assertions_high.remove_asserted_assertion_timestamp(assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } else {
                SubLObject canon_versions = NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$50 = czer_main.canonicalize_cycl_sentence(formula, mt);
                final SubLObject mt_$51 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$50;
                mt = mt_$51;
                if (NIL == canon_versions) {
                    signal_fi_error(fi_not_wff_error(formula, mt));
                } else
                    if (NIL == cycl_grammar.cycl_truth_value_p(canon_versions)) {
                        SubLObject cdolist_list_var2 = canon_versions;
                        SubLObject canon_version = NIL;
                        canon_version = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            thread.resetMultipleValues();
                            final SubLObject cnf = fi_canonicalize(canon_version, T, UNPROVIDED);
                            final SubLObject v_variables = thread.secondMultipleValue();
                            final SubLObject hl_tv = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject assertion2 = kb_indexing.find_assertion(cnf, mt);
                            if (NIL == assertion2) {
                                signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                            } else {
                                assertions_high.remove_asserted_assertion_timestamp(assertion2);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            canon_version = cdolist_list_var2.first();
                        } 
                    }

            }
            ans = makeBoolean(NIL == fi_error_signaledP());
        } finally {
            $within_fi_operationP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject fi_rename_variables(final SubLObject sentence, final SubLObject rename_variable_alist, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi($RENAME_VARIABLES, sentence, rename_variable_alist, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_rename_variables_int(SubLObject formula, final SubLObject rename_variable_alist, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        reset_fi_error_state();
        if (NIL == el_formula_p(formula)) {
            signal_fi_error(list($ARG_ERROR, $str107$Expected_a_cons__got__S, formula));
            return NIL;
        }
        if (NIL != ist_sentence_p(formula, UNPROVIDED)) {
            mt = designated_mt(formula);
            formula = designated_sentence(formula);
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (NIL != fi_error_signaledP()) {
            return NIL;
        }
        final SubLObject assertions = czer_meta.find_assertions_cycl(formula, mt);
        if (NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != simple_variable_rename_impossibleP(assertion, rename_variable_alist)) {
                    signal_fi_error($list242);
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            cdolist_list_var = assertions;
            assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assertion_utilities.rename_assertion_variables(assertion, rename_variable_alist);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } else {
            signal_fi_warning($list239);
        }
        return makeBoolean(NIL == fi_error_signaledP());
    }

    public static SubLObject fi_get_parameter(final SubLObject symbol) {
        return fi($GET_PARAMETER, symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_get_parameter_int(final SubLObject symbol) {
        reset_fi_error_state();
        if (!symbol.isSymbol()) {
            signal_fi_error(list($ARG_ERROR, $str244$Expected_a_symbol__got__S, symbol));
            return NIL;
        }
        if (NIL == boundp(symbol)) {
            signal_fi_error(list($UNBOUND, $str246$Parameter__S_is_not_bound, symbol));
            return NIL;
        }
        return symbol_value(symbol);
    }

    public static SubLObject fi_set_parameter(final SubLObject symbol, final SubLObject value) {
        return fi($SET_PARAMETER, symbol, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_set_parameter_int(final SubLObject symbol, final SubLObject value) {
        reset_fi_error_state();
        if (!symbol.isSymbol()) {
            signal_fi_error(list($ARG_ERROR, $str244$Expected_a_symbol__got__S, symbol));
            return NIL;
        }
        set(symbol, value);
        return makeBoolean(NIL == fi_error_signaledP());
    }

    public static SubLObject fi_eval(final SubLObject form) {
        return fi($EVAL, form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_eval_int(final SubLObject form) {
        reset_fi_error_state();
        return eval(form);
    }

    public static SubLObject fi_local_eval(final SubLObject form) {
        return fi($LOCAL_EVAL, form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fi_local_eval_int(final SubLObject form) {
        reset_fi_error_state();
        return eval(form);
    }

    public static SubLObject ke_purpose() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return api_control_vars.$ke_purpose$.getDynamicValue(thread);
    }

    public static SubLObject set_ke_purpose(final SubLObject purpose) {
        if (((NIL != purpose) && (!assertionsDisabledSync)) && (NIL == forts.fort_p(purpose))) {
            throw new AssertionError(purpose);
        }
        api_control_vars.$ke_purpose$.setDynamicValue(purpose);
        return purpose;
    }

    public static SubLObject the_date() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($the_date$.getDynamicValue(thread).isInteger()) {
            return $the_date$.getDynamicValue(thread);
        }
        return numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject the_second() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($the_second$.getDynamicValue(thread).isInteger()) {
            return $the_second$.getDynamicValue(thread);
        }
        return numeric_date_utilities.get_universal_second(UNPROVIDED);
    }

    public static SubLObject fi_convert_to_assert_hlmt_if_wft(final SubLObject el_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == $assume_assert_sentence_is_wfP$.getDynamicValue(thread)) && (NIL != cycl_grammar.cycl_nat_p(el_term))) && (NIL == wff.el_wftP(el_term, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED))) {
            signal_fi_error(list($HLMT_NOT_WELL_FORMED, $str251$Microtheory__S____was_not_well_fo, el_term, wff.explanation_of_why_not_wft(el_term, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED)));
            return NIL;
        }
        return fi_convert_to_assert_hlmt(el_term);
    }

    public static SubLObject fi_convert_to_assert_hlmt(final SubLObject el_term) {
        final SubLObject v_hlmt = czer_main.canonicalize_assert_mt(el_term);
        if (NIL == hlmt.hlmt_p(v_hlmt)) {
            signal_fi_error(list($ARG_ERROR, $str252$Expected_a_microtheory__got__S, el_term));
            return NIL;
        }
        return v_hlmt;
    }

    public static SubLObject fi_convert_to_ask_hlmt(final SubLObject el_term) {
        final SubLObject v_hlmt = czer_main.canonicalize_ask_mt(el_term);
        if (NIL == hlmt.hlmt_p(v_hlmt)) {
            signal_fi_error(list($ARG_ERROR, $str252$Expected_a_microtheory__got__S, el_term));
            return NIL;
        }
        return v_hlmt;
    }

    public static SubLObject fi_convert_to_fort(final SubLObject el_term) {
        final SubLObject fort = fi_canonicalize_el_term(el_term);
        if (NIL == forts.fort_p(fort)) {
            signal_fi_error(list($ARG_ERROR, $str253$Expected_a_term__got__S, el_term));
            return NIL;
        }
        return fort;
    }

    public static SubLObject fi_canonicalize_el_term(SubLObject el_term) {
        el_term = canon_tl.transform_tl_terms_to_hl(el_term);
        if (NIL != hlmt.fort_or_chlmt_p(el_term)) {
            return el_term;
        }
        if (NIL != possibly_naut_p(el_term)) {
            return narts_high.find_nart(el_term);
        }
        return NIL;
    }

    public static SubLObject fi_canonicalize(final SubLObject canon_info, SubLObject canon_gaf, SubLObject strength) {
        if (canon_gaf == UNPROVIDED) {
            canon_gaf = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = canon_info.first();
        final SubLObject v_variables = Mapping.mapcar(symbol_function(CAR), second(canon_info));
        SubLObject hl_tv = NIL;
        if (((NIL != $within_assert$.getDynamicValue(thread)) && (!assertionsDisabledSync)) && (NIL == kb_var_listP(Mapping.mapcar(symbol_function(CDR), second(canon_info))))) {
            throw new AssertionError(Mapping.mapcar(symbol_function(CDR), second(canon_info)));
        }
        if (((NIL != canon_gaf) && (NIL != clauses.atomic_clause_p(cnf))) && (NIL == v_variables)) {
            if (NIL == clauses.neg_lits(cnf)) {
                hl_tv = (strength == $MONOTONIC) ? $TRUE_MON : $TRUE_DEF;
            } else {
                rplaca(cnf.rest(), clauses.neg_lits(cnf));
                rplaca(cnf, NIL);
                hl_tv = (strength == $MONOTONIC) ? $FALSE_MON : $FALSE_DEF;
            }
        } else {
            hl_tv = (strength == $MONOTONIC) ? $TRUE_MON : $TRUE_DEF;
        }
        return values(cnf, v_variables, hl_tv);
    }

    public static SubLObject fi_canonicalize_gaf(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$52 = czer_main.canonicalize_assert_sentence(formula, mt);
        final SubLObject mt_$53 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$52;
        mt = mt_$53;
        if (canon_versions.isCons() && length(canon_versions).numE(ONE_INTEGER)) {
            return fi_canonicalize(canon_versions.first(), T, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject clear_cached_fi_canonicalize_gaf() {
        final SubLObject cs = $cached_fi_canonicalize_gaf_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_fi_canonicalize_gaf(final SubLObject formula, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_fi_canonicalize_gaf_caching_state$.getGlobalValue(), list(formula, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_fi_canonicalize_gaf_internal(final SubLObject formula, final SubLObject mt) {
        return fi_canonicalize_gaf(formula, mt);
    }

    public static SubLObject cached_fi_canonicalize_gaf(final SubLObject formula, final SubLObject mt) {
        SubLObject caching_state = $cached_fi_canonicalize_gaf_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_FI_CANONICALIZE_GAF, $cached_fi_canonicalize_gaf_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_fi_canonicalize_gaf_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject fi_canonicalize_literal(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnf = fi_canonicalize_gaf(literal, mt);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject atomic_sentence = clauses.pos_lits(cnf).first();
        if (enumeration_types.tv_truth(hl_tv) == $FALSE) {
            return cycl_utilities.negate(atomic_sentence);
        }
        return atomic_sentence;
    }

    public static SubLObject fi_canonicalize_ask(final SubLObject canon_info) {
        SubLObject dnf = NIL;
        SubLObject v_variables = NIL;
        SubLObject free_variables = NIL;
        destructuring_bind_must_consp(canon_info, canon_info, $list264);
        dnf = canon_info.first();
        SubLObject current = canon_info.rest();
        destructuring_bind_must_consp(current, canon_info, $list264);
        v_variables = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, canon_info, $list264);
        free_variables = current.first();
        current = current.rest();
        if (NIL == current) {
            return values(dnf, Mapping.mapcar(symbol_function(FIRST), v_variables), free_variables);
        }
        cdestructuring_bind_error(canon_info, $list264);
        return NIL;
    }

    public static SubLObject kb_var_listP(final SubLObject list) {
        if (list.isList()) {
            SubLObject not_kb_var_listP = NIL;
            if (NIL == not_kb_var_listP) {
                SubLObject csome_list_var = list;
                SubLObject element = NIL;
                element = csome_list_var.first();
                while ((NIL == not_kb_var_listP) && (NIL != csome_list_var)) {
                    if (NIL == variables.variable_p(element)) {
                        not_kb_var_listP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    element = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == not_kb_var_listP);
        }
        return NIL;
    }

    public static SubLObject assertion_fi_formula(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == UNPROVIDED) {
            substitute_varsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject scope_mt = $assertion_fi_formula_mt_scope$.getDynamicValue(thread);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject formula = NIL;
        if ((NIL != scope_mt) && (NIL == hlmt.hlmt_equal(mt, scope_mt))) {
            formula = assertions_high.assertion_ist_formula(assertion);
        } else {
            formula = assertions_high.assertion_formula(assertion);
        }
        formula = copy_tree(formula);
        final SubLObject _prev_bind_0 = $assertion_fi_formula_mt_scope$.currentBinding(thread);
        try {
            $assertion_fi_formula_mt_scope$.bind(mt, thread);
            formula = perform_fi_substitutions(formula, NIL != substitute_varsP ? assertions_high.assertion_el_variables(assertion) : NIL);
        } finally {
            $assertion_fi_formula_mt_scope$.rebind(_prev_bind_0, thread);
        }
        return formula;
    }

    public static SubLObject assertion_hl_formula(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == UNPROVIDED) {
            substitute_varsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        SubLObject formula = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            formula = assertion_fi_formula(assertion, substitute_varsP);
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return formula;
    }

    public static SubLObject assertion_fi_ist_formula(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == UNPROVIDED) {
            substitute_varsP = T;
        }
        return list($$ist, assertions_high.assertion_mt(assertion), assertion_fi_formula(assertion, substitute_varsP));
    }

    public static SubLObject assertion_fi_cnf(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == UNPROVIDED) {
            substitute_varsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject cnf = copy_tree(assertions_high.assertion_cnf(assertion));
        final SubLObject _prev_bind_0 = $assertion_fi_formula_mt_scope$.currentBinding(thread);
        try {
            $assertion_fi_formula_mt_scope$.bind(mt, thread);
            cnf = perform_fi_substitutions(cnf, NIL != substitute_varsP ? assertions_high.assertion_el_variables(assertion) : NIL);
        } finally {
            $assertion_fi_formula_mt_scope$.rebind(_prev_bind_0, thread);
        }
        return cnf;
    }

    public static SubLObject assertion_cnf_with_el_vars(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            result = perform_fi_substitutions(copy_tree(assertions_high.assertion_cnf(assertion)), assertions_high.assertion_el_variables(assertion));
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject perform_fi_substitutions(SubLObject v_object, SubLObject symbol_variables) {
        if (symbol_variables == UNPROVIDED) {
            symbol_variables = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = symbol_variables;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variable = variables.find_variable_by_id(position(symbol, symbol_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            v_object = nsubst(symbol, variable, v_object, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        v_object = transform_list_utilities.ntransform(v_object, symbol_function(VARIABLE_P), symbol_function(DEFAULT_EL_VAR_FOR_HL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue(thread)) {
            v_object = assertion_expand(v_object);
            v_object = narts_high.nart_expand(v_object);
        }
        return v_object;
    }

    public static SubLObject assertion_expand(SubLObject v_object) {
        if (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), v_object, UNPROVIDED)) {
            v_object = transform_list_utilities.transform(v_object, symbol_function(ASSERTION_P), symbol_function(ASSERTION_FI_FORMULA), UNPROVIDED);
        }
        return v_object;
    }

    public static SubLObject assertion_ist_expand(SubLObject v_object) {
        if (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), v_object, UNPROVIDED)) {
            v_object = transform_list_utilities.transform(v_object, symbol_function(ASSERTION_P), symbol_function(ASSERTION_FI_IST_FORMULA), UNPROVIDED);
        }
        return v_object;
    }

    public static SubLObject declare_fi_file() {
        declareFunction(me, "reset_fi_error_state", "RESET-FI-ERROR-STATE", 0, 0, false);
        declareMacro(me, "with_clean_fi_error_state", "WITH-CLEAN-FI-ERROR-STATE");
        declareFunction(me, "reset_fi_warning", "RESET-FI-WARNING", 0, 0, false);
        declareFunction(me, "signal_fi_warning", "SIGNAL-FI-WARNING", 1, 0, false);
        declareFunction(me, "fi_warning_signaledP", "FI-WARNING-SIGNALED?", 0, 0, false);
        declareFunction(me, "fi_get_warning_int", "FI-GET-WARNING-INT", 0, 0, false);
        declareFunction(me, "reset_fi_error", "RESET-FI-ERROR", 0, 0, false);
        declareFunction(me, "signal_fi_error", "SIGNAL-FI-ERROR", 1, 0, false);
        declareFunction(me, "fi_error_signaledP", "FI-ERROR-SIGNALED?", 0, 0, false);
        declareFunction(me, "fi_get_error_int", "FI-GET-ERROR-INT", 0, 0, false);
        declareFunction(me, "fi_error_string", "FI-ERROR-STRING", 1, 0, false);
        declareFunction(me, "fi_get_error_string_int", "FI-GET-ERROR-STRING-INT", 0, 0, false);
        declareFunction(me, "set_fi_last_assertions_asserted", "SET-FI-LAST-ASSERTIONS-ASSERTED", 1, 0, false);
        declareFunction(me, "push_fi_last_assertions_asserted", "PUSH-FI-LAST-ASSERTIONS-ASSERTED", 1, 0, false);
        declareMacro(me, "within_fi_operation", "WITHIN-FI-OPERATION");
        declareFunction(me, "already_within_fi_operationP", "ALREADY-WITHIN-FI-OPERATION?", 0, 0, false);
        declareFunction(me, "fi", "FI", 1, 8, false);
        declareFunction(me, "fi_construct_form_to_enqueue", "FI-CONSTRUCT-FORM-TO-ENQUEUE", 1, 8, false);
        declareFunction(me, "fi_quotify", "FI-QUOTIFY", 1, 0, false);
        declareFunction(me, "fi_1", "FI-1", 3, 0, false);
        declareFunction(me, "possibly_add_to_transcript_queues", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUES", 1, 0, false);
        declareFunction(me, "safe_fi", "SAFE-FI", 1, 8, false);
        declareFunction(me, "fi_get_warning", "FI-GET-WARNING", 0, 0, false);
        declareFunction(me, "fi_get_error", "FI-GET-ERROR", 0, 0, false);
        declareFunction(me, "fi_find", "FI-FIND", 1, 0, false);
        declareFunction(me, "fi_find_int", "FI-FIND-INT", 1, 0, false);
        declareFunction(me, "fi_complete", "FI-COMPLETE", 1, 1, false);
        declareFunction(me, "fi_complete_int", "FI-COMPLETE-INT", 1, 1, false);
        declareFunction(me, "fi_create", "FI-CREATE", 1, 1, false);
        declareFunction(me, "fi_create_int", "FI-CREATE-INT", 1, 1, false);
        declareFunction(me, "handle_id_clash", "HANDLE-ID-CLASH", 2, 0, false);
        declareFunction(me, "fi_find_or_create", "FI-FIND-OR-CREATE", 1, 1, false);
        declareFunction(me, "fi_find_or_create_int", "FI-FIND-OR-CREATE-INT", 1, 1, false);
        declareFunction(me, "fi_create_skolem", "FI-CREATE-SKOLEM", 5, 0, false);
        declareFunction(me, "fi_create_skolem_int", "FI-CREATE-SKOLEM-INT", 4, 1, false);
        declareFunction(me, "fi_skolem_assert_arg_isas", "FI-SKOLEM-ASSERT-ARG-ISAS", 4, 0, false);
        declareFunction(me, "fi_skolem_assert_result_types", "FI-SKOLEM-ASSERT-RESULT-TYPES", 3, 0, false);
        declareFunction(me, "new_skolem_name", "NEW-SKOLEM-NAME", 1, 0, false);
        declareFunction(me, "next_random_basis_for_skolem_name", "NEXT-RANDOM-BASIS-FOR-SKOLEM-NAME", 0, 0, false);
        declareFunction(me, "new_random_basis_for_skolem_name", "NEW-RANDOM-BASIS-FOR-SKOLEM-NAME", 0, 0, false);
        declareFunction(me, "fi_merge", "FI-MERGE", 2, 0, false);
        declareFunction(me, "fi_merge_int", "FI-MERGE-INT", 2, 0, false);
        declareFunction(me, "merge_fort_recursive", "MERGE-FORT-RECURSIVE", 2, 0, false);
        declareFunction(me, "merge_dependent_narts", "MERGE-DEPENDENT-NARTS", 2, 0, false);
        declareFunction(me, "merge_dependent_kb_hl_supports", "MERGE-DEPENDENT-KB-HL-SUPPORTS", 2, 0, false);
        declareFunction(me, "substitute_assertion", "SUBSTITUTE-ASSERTION", 4, 0, false);
        declareFunction(me, "substitute_asserted_argument", "SUBSTITUTE-ASSERTED-ARGUMENT", 4, 0, false);
        declareFunction(me, "substitute_deduction", "SUBSTITUTE-DEDUCTION", 6, 0, false);
        declareFunction(me, "substitute_dependents", "SUBSTITUTE-DEPENDENTS", 5, 0, false);
        declareFunction(me, "substitute_dependent_assertion", "SUBSTITUTE-DEPENDENT-ASSERTION", 4, 0, false);
        declareFunction(me, "substitute_termofunit_assertion", "SUBSTITUTE-TERMOFUNIT-ASSERTION", 4, 0, false);
        declareFunction(me, "make_merge_fort_assertion_map", "MAKE-MERGE-FORT-ASSERTION-MAP", 1, 0, false);
        declareFunction(me, "merge_fort_assertion_map_validP", "MERGE-FORT-ASSERTION-MAP-VALID?", 0, 0, false);
        declareFunction(me, "add_merge_fort_assertion_mapping", "ADD-MERGE-FORT-ASSERTION-MAPPING", 3, 0, false);
        declareFunction(me, "get_merge_fort_assertion_mapping", "GET-MERGE-FORT-ASSERTION-MAPPING", 1, 0, false);
        declareFunction(me, "fi_kill", "FI-KILL", 1, 0, false);
        declareFunction(me, "fi_kill_int", "FI-KILL-INT", 1, 0, false);
        declareFunction(me, "fi_rename", "FI-RENAME", 2, 0, false);
        declareFunction(me, "fi_rename_int", "FI-RENAME-INT", 2, 0, false);
        declareFunction(me, "fi_lookup", "FI-LOOKUP", 2, 0, false);
        declareFunction(me, "fi_lookup_int", "FI-LOOKUP-INT", 2, 0, false);
        declareFunction(me, "sentence_assertions_in_mt", "SENTENCE-ASSERTIONS-IN-MT", 3, 0, false);
        declareFunction(me, "sentence_assertions", "SENTENCE-ASSERTIONS", 2, 0, false);
        declareFunction(me, "sentence_visible_assertions", "SENTENCE-VISIBLE-ASSERTIONS", 2, 0, false);
        declareFunction(me, "sentence_assertions_in_any_mt", "SENTENCE-ASSERTIONS-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "sentence_assertion", "SENTENCE-ASSERTION", 2, 0, false);
        declareFunction(me, "gaf_sentence_assertion", "GAF-SENTENCE-ASSERTION", 2, 0, false);
        declareFunction(me, "fi_assert", "FI-ASSERT", 2, 2, false);
        declareFunction(me, "fi_assert_int", "FI-ASSERT-INT", 2, 2, false);
        declareFunction(me, "perform_assert_post_processing", "PERFORM-ASSERT-POST-PROCESSING", 2, 0, false);
        declareFunction(me, "perform_assert_post_processing_for_skolem", "PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false);
        declareFunction(me, "fi_perform_assert_post_processing_for_skolem", "FI-PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false);
        declareFunction(me, "fi_cnf_default_direction", "FI-CNF-DEFAULT-DIRECTION", 1, 0, false);
        declareFunction(me, "fi_not_wff_error", "FI-NOT-WFF-ERROR", 2, 0, false);
        declareFunction(me, "fi_not_wff_assert_error", "FI-NOT-WFF-ASSERT-ERROR", 2, 0, false);
        declareFunction(me, "fi_assert_update_asserted_argument", "FI-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 1, false);
        declareFunction(me, "hl_assert_update_asserted_argument", "HL-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 1, false);
        declareFunction(me, "fi_reassert", "FI-REASSERT", 4, 0, false);
        declareFunction(me, "fi_reassert_int", "FI-REASSERT-INT", 4, 0, false);
        declareFunction(me, "fi_reassert_hl_tv", "FI-REASSERT-HL-TV", 2, 0, false);
        declareFunction(me, "fi_rededuce_deduction_assertion", "FI-REDEDUCE-DEDUCTION-ASSERTION", 2, 0, false);
        declareFunction(me, "fi_deny", "FI-DENY", 3, 0, false);
        declareFunction(me, "fi_deny_int", "FI-DENY-INT", 2, 1, false);
        declareFunction(me, "fi_unassert", "FI-UNASSERT", 2, 0, false);
        declareFunction(me, "fi_unassert_int", "FI-UNASSERT-INT", 2, 0, false);
        declareFunction(me, "canonicalize_fi_unassert_sentence", "CANONICALIZE-FI-UNASSERT-SENTENCE", 2, 0, false);
        declareFunction(me, "canonicalize_fi_blast_sentence", "CANONICALIZE-FI-BLAST-SENTENCE", 2, 0, false);
        declareFunction(me, "canonicalize_fi_remove_sentence", "CANONICALIZE-FI-REMOVE-SENTENCE", 3, 0, false);
        declareFunction(me, "canonicalize_unassert_hlmt", "CANONICALIZE-UNASSERT-HLMT", 1, 0, false);
        declareFunction(me, "fi_edit", "FI-EDIT", 2, 4, false);
        declareFunction(me, "fi_edit_int", "FI-EDIT-INT", 2, 4, false);
        declareFunction(me, "fi_justify", "FI-JUSTIFY", 2, 1, false);
        declareFunction(me, "fi_justify_int", "FI-JUSTIFY-INT", 2, 1, false);
        declareFunction(me, "formula_justify", "FORMULA-JUSTIFY", 2, 1, false);
        declareFunction(me, "gaf_justify", "GAF-JUSTIFY", 3, 0, false);
        declareFunction(me, "one_step_gaf_justify", "ONE-STEP-GAF-JUSTIFY", 2, 0, false);
        declareFunction(me, "justify_support", "JUSTIFY-SUPPORT", 1, 0, false);
        declareFunction(me, "fi_add_argument", "FI-ADD-ARGUMENT", 3, 2, false);
        declareFunction(me, "fi_add_argument_int", "FI-ADD-ARGUMENT-INT", 3, 2, false);
        declareFunction(me, "perform_deduce_post_processing", "PERFORM-DEDUCE-POST-PROCESSING", 2, 0, false);
        declareFunction(me, "convert_hl_support_to_el_support", "CONVERT-HL-SUPPORT-TO-EL-SUPPORT", 1, 0, false);
        declareFunction(me, "convert_hl_support_to_fi_support", "CONVERT-HL-SUPPORT-TO-FI-SUPPORT", 1, 0, false);
        declareFunction(me, "convert_hl_support_to_tl_support", "CONVERT-HL-SUPPORT-TO-TL-SUPPORT", 1, 0, false);
        declareFunction(me, "make_el_support", "MAKE-EL-SUPPORT", 2, 2, false);
        declareFunction(me, "fi_canonicalize_el_supports", "FI-CANONICALIZE-EL-SUPPORTS", 1, 1, false);
        declareFunction(me, "el_support_assertions", "EL-SUPPORT-ASSERTIONS", 2, 0, false);
        declareFunction(me, "fi_remove_argument", "FI-REMOVE-ARGUMENT", 3, 1, false);
        declareFunction(me, "fi_remove_argument_int", "FI-REMOVE-ARGUMENT-INT", 3, 1, false);
        declareFunction(me, "fi_blast", "FI-BLAST", 2, 0, false);
        declareFunction(me, "fi_blast_int", "FI-BLAST-INT", 2, 0, false);
        declareFunction(me, "fi_ask", "FI-ASK", 1, 5, false);
        declareFunction(me, "fi_ask_int", "FI-ASK-INT", 1, 5, false);
        declareFunction(me, "fi_ask_ist_query_p", "FI-ASK-IST-QUERY-P", 1, 0, false);
        declareFunction(me, "fi_ask_int_new_cyc_query_trampoline", "FI-ASK-INT-NEW-CYC-QUERY-TRAMPOLINE", 6, 0, false);
        declareFunction(me, "fi_continue_last_ask", "FI-CONTINUE-LAST-ASK", 0, 5, false);
        declareFunction(me, "fi_continue_last_ask_int", "FI-CONTINUE-LAST-ASK-INT", 0, 5, false);
        declareFunction(me, "fi_ask_status", "FI-ASK-STATUS", 0, 0, false);
        declareFunction(me, "fi_ask_status_int", "FI-ASK-STATUS-INT", 0, 0, false);
        declareFunction(me, "fi_tms_reconsider_formula", "FI-TMS-RECONSIDER-FORMULA", 2, 0, false);
        declareFunction(me, "fi_tms_reconsider_formula_int", "FI-TMS-RECONSIDER-FORMULA-INT", 2, 0, false);
        declareFunction(me, "fi_tms_reconsider_mt", "FI-TMS-RECONSIDER-MT", 1, 0, false);
        declareFunction(me, "fi_tms_reconsider_mt_int", "FI-TMS-RECONSIDER-MT-INT", 1, 0, false);
        declareFunction(me, "fi_tms_reconsider_gafs", "FI-TMS-RECONSIDER-GAFS", 1, 3, false);
        declareFunction(me, "fi_tms_reconsider_gafs_int", "FI-TMS-RECONSIDER-GAFS-INT", 1, 3, false);
        declareFunction(me, "fi_tms_reconsider_term", "FI-TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction(me, "fi_tms_reconsider_term_int", "FI-TMS-RECONSIDER-TERM-INT", 1, 1, false);
        declareFunction(me, "fi_denotation", "FI-DENOTATION", 1, 0, false);
        declareFunction(me, "fi_denotation_int", "FI-DENOTATION-INT", 1, 0, false);
        declareFunction(me, "fi_timestamp_constant", "FI-TIMESTAMP-CONSTANT", 2, 2, false);
        declareFunction(me, "fi_timestamp_constant_int", "FI-TIMESTAMP-CONSTANT-INT", 2, 2, false);
        declareFunction(me, "constant_timestampedP", "CONSTANT-TIMESTAMPED?", 1, 0, false);
        declareFunction(me, "timestamp_constant", "TIMESTAMP-CONSTANT", 3, 2, false);
        declareFunction(me, "untimestamp_constant", "UNTIMESTAMP-CONSTANT", 1, 0, false);
        declareFunction(me, "retimestamp_constant", "RETIMESTAMP-CONSTANT", 3, 2, false);
        declareFunction(me, "fi_timestamp_assertion", "FI-TIMESTAMP-ASSERTION", 2, 2, false);
        declareFunction(me, "fi_timestamp_assertion_int", "FI-TIMESTAMP-ASSERTION-INT", 2, 2, false);
        declareFunction(me, "fi_remove_timestamp", "FI-REMOVE-TIMESTAMP", 1, 1, false);
        declareFunction(me, "fi_remove_timestamp_int", "FI-REMOVE-TIMESTAMP-INT", 2, 0, false);
        declareFunction(me, "fi_rename_variables", "FI-RENAME-VARIABLES", 2, 1, false);
        declareFunction(me, "fi_rename_variables_int", "FI-RENAME-VARIABLES-INT", 2, 1, false);
        declareFunction(me, "fi_get_parameter", "FI-GET-PARAMETER", 1, 0, false);
        declareFunction(me, "fi_get_parameter_int", "FI-GET-PARAMETER-INT", 1, 0, false);
        declareFunction(me, "fi_set_parameter", "FI-SET-PARAMETER", 2, 0, false);
        declareFunction(me, "fi_set_parameter_int", "FI-SET-PARAMETER-INT", 2, 0, false);
        declareFunction(me, "fi_eval", "FI-EVAL", 1, 0, false);
        declareFunction(me, "fi_eval_int", "FI-EVAL-INT", 1, 0, false);
        declareFunction(me, "fi_local_eval", "FI-LOCAL-EVAL", 1, 0, false);
        declareFunction(me, "fi_local_eval_int", "FI-LOCAL-EVAL-INT", 1, 0, false);
        declareFunction(me, "ke_purpose", "KE-PURPOSE", 0, 0, false);
        declareFunction(me, "set_ke_purpose", "SET-KE-PURPOSE", 1, 0, false);
        declareFunction(me, "the_date", "THE-DATE", 0, 0, false);
        declareFunction(me, "the_second", "THE-SECOND", 0, 0, false);
        declareFunction(me, "fi_convert_to_assert_hlmt_if_wft", "FI-CONVERT-TO-ASSERT-HLMT-IF-WFT", 1, 0, false);
        declareFunction(me, "fi_convert_to_assert_hlmt", "FI-CONVERT-TO-ASSERT-HLMT", 1, 0, false);
        declareFunction(me, "fi_convert_to_ask_hlmt", "FI-CONVERT-TO-ASK-HLMT", 1, 0, false);
        declareFunction(me, "fi_convert_to_fort", "FI-CONVERT-TO-FORT", 1, 0, false);
        declareFunction(me, "fi_canonicalize_el_term", "FI-CANONICALIZE-EL-TERM", 1, 0, false);
        declareFunction(me, "fi_canonicalize", "FI-CANONICALIZE", 1, 2, false);
        declareFunction(me, "fi_canonicalize_gaf", "FI-CANONICALIZE-GAF", 2, 0, false);
        declareFunction(me, "clear_cached_fi_canonicalize_gaf", "CLEAR-CACHED-FI-CANONICALIZE-GAF", 0, 0, false);
        declareFunction(me, "remove_cached_fi_canonicalize_gaf", "REMOVE-CACHED-FI-CANONICALIZE-GAF", 2, 0, false);
        declareFunction(me, "cached_fi_canonicalize_gaf_internal", "CACHED-FI-CANONICALIZE-GAF-INTERNAL", 2, 0, false);
        declareFunction(me, "cached_fi_canonicalize_gaf", "CACHED-FI-CANONICALIZE-GAF", 2, 0, false);
        declareFunction(me, "fi_canonicalize_literal", "FI-CANONICALIZE-LITERAL", 2, 0, false);
        declareFunction(me, "fi_canonicalize_ask", "FI-CANONICALIZE-ASK", 1, 0, false);
        declareFunction(me, "kb_var_listP", "KB-VAR-LIST?", 1, 0, false);
        declareFunction(me, "assertion_fi_formula", "ASSERTION-FI-FORMULA", 1, 1, false);
        declareFunction(me, "assertion_hl_formula", "ASSERTION-HL-FORMULA", 1, 1, false);
        declareFunction(me, "assertion_fi_ist_formula", "ASSERTION-FI-IST-FORMULA", 1, 1, false);
        declareFunction(me, "assertion_fi_cnf", "ASSERTION-FI-CNF", 1, 1, false);
        declareFunction(me, "assertion_cnf_with_el_vars", "ASSERTION-CNF-WITH-EL-VARS", 1, 0, false);
        declareFunction(me, "perform_fi_substitutions", "PERFORM-FI-SUBSTITUTIONS", 1, 1, false);
        declareFunction(me, "assertion_expand", "ASSERTION-EXPAND", 1, 0, false);
        declareFunction(me, "assertion_ist_expand", "ASSERTION-IST-EXPAND", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_fi_file() {
        deflexical("*FI-DISPATCH-TABLE*", $list0);
        defparameter("*FI-WARNING*", NIL);
        defparameter("*FI-ERROR*", NIL);
        defparameter("*FI-LAST-CONSTANT*", NIL);
        defparameter("*WITHIN-FI-OPERATION?*", NIL);
        defparameter("*CURRENT-FI-OP*", NIL);
        defparameter("*MERGE-FORT-ASSERTION-MAP*", NIL);
        defparameter("*ASSUME-ASSERT-SENTENCE-IS-WF?*", NIL);
        defparameter("*GENERATE-PRECISE-FI-WFF-ERRORS?*", T);
        defparameter("*THE-DATE*", NIL);
        defparameter("*THE-SECOND*", NIL);
        deflexical("*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*", NIL);
        defparameter("*ASSERTION-FI-FORMULA-MT-SCOPE*", NIL);
        return NIL;
    }

    public static SubLObject setup_fi_file() {
        register_html_state_variable($fi_warning$);
        SubLObject item_var = $fi_warning$;
        if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
        }
        register_html_state_variable($fi_error$);
        item_var = $fi_error$;
        if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
        }
        register_html_state_variable($fi_last_constant$);
        item_var = $fi_last_constant$;
        if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
        }
        register_cyc_api_function(FI_GET_WARNING, NIL, $str22$Return_a_description_of_the_warni, NIL, $list23);
        register_cyc_api_function(FI_GET_ERROR, NIL, $str26$Return_a_description_of_the_error, NIL, $list23);
        register_cyc_api_function(FI_FIND, $list29, $str30$Return_the_constant_indentified_b, NIL, $list31);
        register_cyc_api_function(FI_COMPLETE, $list38, $str39$Return_a_list_of_constants_whose_, NIL, $list40);
        register_cyc_api_function(FI_CREATE, $list42, $str43$Create_a_new_constant_with_NAME__, NIL, $list44);
        register_cyc_api_function(FI_FIND_OR_CREATE, $list42, $str52$Return_constant_with_NAME_if_it_i, NIL, $list44);
        register_cyc_api_function(FI_KILL, $list90, $str91$Kill_FORT_and_all_its_uses_from_t, NIL, $list92);
        register_cyc_api_function(FI_RENAME, $list97, $str98$Change_name_of_CONSTANT_to_NAME__, NIL, $list31);
        register_cyc_api_function(FI_LOOKUP, $list104, $str105$Returns_two_values_when_looking_u, NIL, $list106);
        register_cyc_api_function(FI_ASSERT, $list112, $str113$Assert_the_FORMULA_in_the_specifi, NIL, $list92);
        register_cyc_api_function(FI_UNASSERT, $list104, $str153$Remove_the_assertions_canonicaliz, NIL, $list92);
        register_cyc_api_function(FI_EDIT, $list161, $str162$Unassert_the_assertions_canonical, NIL, $list92);
        register_cyc_api_function(FI_BLAST, $list104, $str182$Remove_all_arguments_for_the_FORM, NIL, $list92);
        register_cyc_api_function(FI_ASK, $list185, $str186$Ask_for_bindings_for_free_variabl, NIL, $list187);
        register_obsolete_cyc_api_function(FI_CONTINUE_LAST_ASK, $list194, $list195, $str196$Continue_the_last_ask_that_was_pe, NIL, $list187);
        define_obsolete_register(FI_CONTINUE_LAST_ASK_INT, $list194);
        register_obsolete_cyc_api_function(FI_ASK_STATUS, $list201, NIL, $str202$Return_a_status_as_to_how_the_las, NIL, $list23);
        define_obsolete_register(FI_ASK_STATUS_INT, $list201);
        register_cyc_api_function(FI_TMS_RECONSIDER_FORMULA, $list104, $str207$Reconsider_all_arguments_for_FORM, NIL, $list92);
        register_cyc_api_function(FI_TMS_RECONSIDER_MT, $list210, $str211$Reconsider_all_arguments_for_all_, NIL, $list92);
        register_cyc_api_function(FI_TMS_RECONSIDER_GAFS, $list214, $str215$Reconsider_all_arguments_for_all_, NIL, $list92);
        register_cyc_api_function(FI_TMS_RECONSIDER_TERM, $list219, $str220$Reconsider_all_arguments_involvin, NIL, $list92);
        memoization_state.note_globally_cached_function(CACHED_FI_CANONICALIZE_GAF);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_fi_file();
    }

    @Override
    public void initializeVariables() {
        init_fi_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_fi_file();
    }

    static {



























































































































































































































































































    }
}

/**
 * Total time: 3851 ms synthetic
 */
