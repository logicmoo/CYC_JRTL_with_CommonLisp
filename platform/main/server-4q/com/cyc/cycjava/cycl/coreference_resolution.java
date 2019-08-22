package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class coreference_resolution extends SubLTranslatedFile {
    public static final SubLFile me = new coreference_resolution();

    public static final String myName = "com.cyc.cycjava.cycl.coreference_resolution";

    public static final String myFingerPrint = "9d9b365d35455cbc84ad80e6f5e93d5a4a06039ea2c05523677227f3866929e3";

    // defconstant
    public static final SubLSymbol $dtp_coreference_resolution_discourse_struct$ = makeSymbol("*DTP-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT*");

    // defconstant
    public static final SubLSymbol $dtp_reference_info$ = makeSymbol("*DTP-REFERENCE-INFO*");

    // deflexical
    private static final SubLSymbol $cr_non_person$ = makeSymbol("*CR-NON-PERSON*");

    // defconstant
    public static final SubLSymbol $dtp_referent_struct$ = makeSymbol("*DTP-REFERENT-STRUCT*");

    // defconstant
    /**
     * We ought to be able to be able to get these from the KB, but, alas, can't.
     */
    private static final SubLSymbol $cr_courtesy_titles$ = makeSymbol("*CR-COURTESY-TITLES*");

    // defconstant
    private static final SubLSymbol $cr_sentence_switch_id_base$ = makeSymbol("*CR-SENTENCE-SWITCH-ID-BASE*");

    // defconstant
    private static final SubLSymbol $cr_parses_switch_id_base$ = makeSymbol("*CR-PARSES-SWITCH-ID-BASE*");

    // defconstant
    private static final SubLSymbol $cr_more_info_switch_id_base$ = makeSymbol("*CR-MORE-INFO-SWITCH-ID-BASE*");

    // Internal Constants
    public static final SubLSymbol COREFERENCE_RESOLUTION_DISCOURSE_STRUCT = makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT");

    public static final SubLSymbol COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_P = makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("IMPLEMENTATION"), makeSymbol("PARSER"), makeSymbol("USE-PSP?"), makeSymbol("MAX-SUFFICIENT-RECENTNESS"), makeSymbol("MAX-POSSIBLE-ANTECEDENTS"), makeSymbol("MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), makeSymbol("MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), makeSymbol("REFERENCE-NOTE-HASH"), makeSymbol("RECENT-REFERENCES"), makeSymbol("SENTENCES") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("IMPLEMENTATION"), makeKeyword("PARSER"), makeKeyword("USE-PSP?"), makeKeyword("MAX-SUFFICIENT-RECENTNESS"), makeKeyword("MAX-POSSIBLE-ANTECEDENTS"), makeKeyword("MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), makeKeyword("MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), makeKeyword("REFERENCE-NOTE-HASH"), makeKeyword("RECENT-REFERENCES"), makeKeyword("SENTENCES") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("CRD-IMPLEMENTATION"), makeSymbol("CRD-PARSER"), makeSymbol("CRD-USE-PSP?"), makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS"), makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS"), makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), makeSymbol("CRD-REFERENCE-NOTE-HASH"), makeSymbol("CRD-RECENT-REFERENCES"), makeSymbol("CRD-SENTENCES") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-CRD-IMPLEMENTATION"), makeSymbol("_CSETF-CRD-PARSER"), makeSymbol("_CSETF-CRD-USE-PSP?"), makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS"), makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS"), makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), makeSymbol("_CSETF-CRD-REFERENCE-NOTE-HASH"), makeSymbol("_CSETF-CRD-RECENT-REFERENCES"), makeSymbol("_CSETF-CRD-SENTENCES") });



    public static final SubLSymbol COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P"));

    private static final SubLSymbol CRD_IMPLEMENTATION = makeSymbol("CRD-IMPLEMENTATION");

    private static final SubLSymbol _CSETF_CRD_IMPLEMENTATION = makeSymbol("_CSETF-CRD-IMPLEMENTATION");

    private static final SubLSymbol CRD_PARSER = makeSymbol("CRD-PARSER");

    private static final SubLSymbol _CSETF_CRD_PARSER = makeSymbol("_CSETF-CRD-PARSER");

    private static final SubLSymbol $sym13$CRD_USE_PSP_ = makeSymbol("CRD-USE-PSP?");

    private static final SubLSymbol $sym14$_CSETF_CRD_USE_PSP_ = makeSymbol("_CSETF-CRD-USE-PSP?");

    private static final SubLSymbol CRD_MAX_SUFFICIENT_RECENTNESS = makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS");

    private static final SubLSymbol _CSETF_CRD_MAX_SUFFICIENT_RECENTNESS = makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS");

    private static final SubLSymbol CRD_MAX_POSSIBLE_ANTECEDENTS = makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol _CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS = makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN = makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN");

    private static final SubLSymbol _CSETF_CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN = makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN");

    private static final SubLSymbol CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN = makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN");

    private static final SubLSymbol _CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN = makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN");

    private static final SubLSymbol CRD_REFERENCE_NOTE_HASH = makeSymbol("CRD-REFERENCE-NOTE-HASH");

    private static final SubLSymbol _CSETF_CRD_REFERENCE_NOTE_HASH = makeSymbol("_CSETF-CRD-REFERENCE-NOTE-HASH");

    private static final SubLSymbol CRD_RECENT_REFERENCES = makeSymbol("CRD-RECENT-REFERENCES");

    private static final SubLSymbol _CSETF_CRD_RECENT_REFERENCES = makeSymbol("_CSETF-CRD-RECENT-REFERENCES");

    private static final SubLSymbol CRD_SENTENCES = makeSymbol("CRD-SENTENCES");

    private static final SubLSymbol _CSETF_CRD_SENTENCES = makeSymbol("_CSETF-CRD-SENTENCES");





    private static final SubLSymbol $kw31$USE_PSP_ = makeKeyword("USE-PSP?");

    private static final SubLSymbol $MAX_SUFFICIENT_RECENTNESS = makeKeyword("MAX-SUFFICIENT-RECENTNESS");

    private static final SubLSymbol $MAX_POSSIBLE_ANTECEDENTS = makeKeyword("MAX-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol $MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN = makeKeyword("MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN");

    private static final SubLSymbol $MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN = makeKeyword("MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN");

    private static final SubLSymbol $REFERENCE_NOTE_HASH = makeKeyword("REFERENCE-NOTE-HASH");





    private static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT = makeSymbol("MAKE-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT");





    private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_ME = makeSymbol("VISIT-DEFSTRUCT-OBJECT-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-METHOD");

    private static final SubLSymbol STANFORD_PARSER = makeSymbol("STANFORD-PARSER");



    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLList $list48 = list(makeSymbol("COREF-DISCOURSE"), makeSymbol("PARSE-TREE"), makeSymbol("SENTENCE-REFERENCES-VAR"));

    private static final SubLSymbol $sym49$COREF_DISCOURSE_VAR = makeUninternedSymbol("COREF-DISCOURSE-VAR");

    private static final SubLSymbol $sym50$REFERENCE_VAR = makeUninternedSymbol("REFERENCE-VAR");

    private static final SubLSymbol $sym51$RECENT_REFERENCES_VAR = makeUninternedSymbol("RECENT-REFERENCES-VAR");



    private static final SubLSymbol DO_PARSE_TREE_SUBTREES = makeSymbol("DO-PARSE-TREE-SUBTREES");

    private static final SubLList $list54 = list(NIL, list(makeSymbol("QUOTE"), list(makeKeyword("NP"), makeKeyword("PRP$"))), makeKeyword("DFL2R"));





    private static final SubLSymbol NP_TREE_P = makeSymbol("NP-TREE-P");

    private static final SubLSymbol $sym58$IS_THE_ONLY_HEAD_DAUGHTER_OF_AN_NP_ = makeSymbol("IS-THE-ONLY-HEAD-DAUGHTER-OF-AN-NP?");

    private static final SubLSymbol RESOLVE_REFERENCE = makeSymbol("RESOLVE-REFERENCE");





    private static final SubLString $str62$_S_is_not_valid_input_for_the_cor = makeString("~S is not valid input for the coreference resolution module.");



    private static final SubLString $str64$Unable_to_open__S = makeString("Unable to open ~S");





    private static final SubLString $str67$Got_invalid_parse_result_for__S__ = makeString("Got invalid parse result for ~S: ~S");

    private static final SubLList $list68 = list(makeKeyword("NP"), makeKeyword("PRP$"));





    private static final SubLString $str71$_S_is_not_one_of__S = makeString("~S is not one of ~S");







    private static final SubLSymbol REFERENT_STRUCT_REFERENCES = makeSymbol("REFERENT-STRUCT-REFERENCES");







    private static final SubLSymbol $kw79$POSSIBLE_ANAPHOR_ = makeKeyword("POSSIBLE-ANAPHOR?");

    private static final SubLSymbol $kw80$POSSIBLE_ANTECEDENT_ = makeKeyword("POSSIBLE-ANTECEDENT?");













    private static final SubLSymbol $ANAPHOR_WITH_POSSIBLE_ANTECEDENTS = makeKeyword("ANAPHOR-WITH-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol $ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS = makeKeyword("ANAPHOR-WITH-NO-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol $NON_ANAPHOR_POSSIBLE_ANTECEDENT = makeKeyword("NON-ANAPHOR-POSSIBLE-ANTECEDENT");

    private static final SubLSymbol $NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT = makeKeyword("NON-ANAPHOR-IMPOSSIBLE-ANTECEDENT");



    private static final SubLString $str92$The__KB_implementation_of_corefer = makeString("The :KB implementation of coreference resolution doesn't exist yet");

    private static final SubLString $str93$Don_t_know_about__S_implementatio = makeString("Don't know about ~S implementation of coreference resolution.");

    private static final SubLSymbol $DONT_KNOW_YET = makeKeyword("DONT-KNOW-YET");

    private static final SubLSymbol $sym95$REFERENCE_POSSIBLE_ANAPHOR__CALCULATE = makeSymbol("REFERENCE-POSSIBLE-ANAPHOR?-CALCULATE");

    private static final SubLSymbol $sym96$REFERENCE_POSSIBLE_ANTECEDENT__CALCULATE = makeSymbol("REFERENCE-POSSIBLE-ANTECEDENT?-CALCULATE");

    private static final SubLSymbol REFERENCE_POSSIBLE_ANTECEDENTS_CALCULATE = makeSymbol("REFERENCE-POSSIBLE-ANTECEDENTS-CALCULATE");

    private static final SubLSymbol REFERENCE_LIKELY_ANTECEDENTS_CALCULATE = makeSymbol("REFERENCE-LIKELY-ANTECEDENTS-CALCULATE");

    private static final SubLSymbol REFERENCE_BEST_ANTECEDENT_CALCULATE = makeSymbol("REFERENCE-BEST-ANTECEDENT-CALCULATE");

    private static final SubLSymbol REFERENCE_FUNCTIONAL_DEPENDENCY_CALCULATE = makeSymbol("REFERENCE-FUNCTIONAL-DEPENDENCY-CALCULATE");

    private static final SubLString $str101$Don_t_know_how_to_calculate_refer = makeString("Don't know how to calculate reference slot: ~S");

    private static final SubLString $str102$Don_t_know_how_to_get_reference_s = makeString("Don't know how to get reference slot: ~S");

    private static final SubLString $str103$Don_t_know_how_to_set_reference_s = makeString("Don't know how to set reference slot: ~S");

    private static final SubLSymbol REFERENCE_INFO = makeSymbol("REFERENCE-INFO");

    private static final SubLSymbol REFERENCE_INFO_P = makeSymbol("REFERENCE-INFO-P");

    private static final SubLList $list106 = list(new SubLObject[]{ makeSymbol("INDEX-NUMBER"), makeSymbol("TREE"), makeSymbol("CYCLS"), makeSymbol("POSSIBLE-ANTECEDENT?"), makeSymbol("POSSIBLE-ANAPHOR?"), makeSymbol("POSSIBLE-ANTECEDENTS"), makeSymbol("LIKELY-ANTECEDENTS"), makeSymbol("BEST-ANTECEDENT"), makeSymbol("FUNCTIONAL-DEPENDENCY"), makeSymbol("REFERENT") });

    private static final SubLList $list107 = list(new SubLObject[]{ makeKeyword("INDEX-NUMBER"), makeKeyword("TREE"), makeKeyword("CYCLS"), makeKeyword("POSSIBLE-ANTECEDENT?"), makeKeyword("POSSIBLE-ANAPHOR?"), makeKeyword("POSSIBLE-ANTECEDENTS"), makeKeyword("LIKELY-ANTECEDENTS"), makeKeyword("BEST-ANTECEDENT"), makeKeyword("FUNCTIONAL-DEPENDENCY"), makeKeyword("REFERENT") });

    private static final SubLList $list108 = list(new SubLObject[]{ makeSymbol("REFERENCE-INFO-INDEX-NUMBER"), makeSymbol("REFERENCE-INFO-TREE"), makeSymbol("REFERENCE-INFO-CYCLS"), makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENT?"), makeSymbol("REFERENCE-INFO-POSSIBLE-ANAPHOR?"), makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENTS"), makeSymbol("REFERENCE-INFO-LIKELY-ANTECEDENTS"), makeSymbol("REFERENCE-INFO-BEST-ANTECEDENT"), makeSymbol("REFERENCE-INFO-FUNCTIONAL-DEPENDENCY"), makeSymbol("REFERENCE-INFO-REFERENT") });

    private static final SubLList $list109 = list(new SubLObject[]{ makeSymbol("_CSETF-REFERENCE-INFO-INDEX-NUMBER"), makeSymbol("_CSETF-REFERENCE-INFO-TREE"), makeSymbol("_CSETF-REFERENCE-INFO-CYCLS"), makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENT?"), makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANAPHOR?"), makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENTS"), makeSymbol("_CSETF-REFERENCE-INFO-LIKELY-ANTECEDENTS"), makeSymbol("_CSETF-REFERENCE-INFO-BEST-ANTECEDENT"), makeSymbol("_CSETF-REFERENCE-INFO-FUNCTIONAL-DEPENDENCY"), makeSymbol("_CSETF-REFERENCE-INFO-REFERENT") });

    private static final SubLSymbol PRINT_REFERENCE_INFO = makeSymbol("PRINT-REFERENCE-INFO");

    private static final SubLSymbol REFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list112 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REFERENCE-INFO-P"));

    private static final SubLSymbol REFERENCE_INFO_INDEX_NUMBER = makeSymbol("REFERENCE-INFO-INDEX-NUMBER");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_INDEX_NUMBER = makeSymbol("_CSETF-REFERENCE-INFO-INDEX-NUMBER");

    private static final SubLSymbol REFERENCE_INFO_TREE = makeSymbol("REFERENCE-INFO-TREE");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_TREE = makeSymbol("_CSETF-REFERENCE-INFO-TREE");

    private static final SubLSymbol REFERENCE_INFO_CYCLS = makeSymbol("REFERENCE-INFO-CYCLS");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_CYCLS = makeSymbol("_CSETF-REFERENCE-INFO-CYCLS");

    private static final SubLSymbol $sym119$REFERENCE_INFO_POSSIBLE_ANTECEDENT_ = makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENT?");

    private static final SubLSymbol $sym120$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENT_ = makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENT?");

    private static final SubLSymbol $sym121$REFERENCE_INFO_POSSIBLE_ANAPHOR_ = makeSymbol("REFERENCE-INFO-POSSIBLE-ANAPHOR?");

    private static final SubLSymbol $sym122$_CSETF_REFERENCE_INFO_POSSIBLE_ANAPHOR_ = makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANAPHOR?");

    private static final SubLSymbol REFERENCE_INFO_POSSIBLE_ANTECEDENTS = makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENTS = makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENTS");

    private static final SubLSymbol REFERENCE_INFO_LIKELY_ANTECEDENTS = makeSymbol("REFERENCE-INFO-LIKELY-ANTECEDENTS");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_LIKELY_ANTECEDENTS = makeSymbol("_CSETF-REFERENCE-INFO-LIKELY-ANTECEDENTS");

    private static final SubLSymbol REFERENCE_INFO_BEST_ANTECEDENT = makeSymbol("REFERENCE-INFO-BEST-ANTECEDENT");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_BEST_ANTECEDENT = makeSymbol("_CSETF-REFERENCE-INFO-BEST-ANTECEDENT");

    private static final SubLSymbol REFERENCE_INFO_FUNCTIONAL_DEPENDENCY = makeSymbol("REFERENCE-INFO-FUNCTIONAL-DEPENDENCY");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_FUNCTIONAL_DEPENDENCY = makeSymbol("_CSETF-REFERENCE-INFO-FUNCTIONAL-DEPENDENCY");

    private static final SubLSymbol REFERENCE_INFO_REFERENT = makeSymbol("REFERENCE-INFO-REFERENT");

    private static final SubLSymbol _CSETF_REFERENCE_INFO_REFERENT = makeSymbol("_CSETF-REFERENCE-INFO-REFERENT");









    private static final SubLSymbol MAKE_REFERENCE_INFO = makeSymbol("MAKE-REFERENCE-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REFERENCE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REFERENCE-INFO-METHOD");

    private static final SubLString $str139$_S = makeString("~S");



    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));



    private static final SubLObject $$Ungendered_NLAttr = reader_make_constant_shell(makeString("Ungendered-NLAttr"));

    private static final SubLObject $$Neuter_NLAttr = reader_make_constant_shell(makeString("Neuter-NLAttr"));

    private static final SubLObject $$Masculine_NLAttr = reader_make_constant_shell(makeString("Masculine-NLAttr"));

    private static final SubLObject $$MaleHuman = reader_make_constant_shell(makeString("MaleHuman"));

    private static final SubLObject $$Feminine_NLAttr = reader_make_constant_shell(makeString("Feminine-NLAttr"));

    private static final SubLObject $$FemaleHuman = reader_make_constant_shell(makeString("FemaleHuman"));

    private static final SubLString $str149$Didn_t_know_there_was_such_a_gend = makeString("Didn't know there was such a gender as ~S!");



    private static final SubLSymbol $sym151$_REFERENT = makeSymbol("?REFERENT");

    private static final SubLSymbol POSSIBLY_CYCLIFIER_REFERENT_STAND_IN = makeSymbol("POSSIBLY-CYCLIFIER-REFERENT-STAND-IN");

    private static final SubLObject $$InstanceFn = reader_make_constant_shell(makeString("InstanceFn"));

    private static final SubLObject $$CollectionDifferenceFn = reader_make_constant_shell(makeString("CollectionDifferenceFn"));

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    private static final SubLObject $$UnmarkedNumber_NLAttr = reader_make_constant_shell(makeString("UnmarkedNumber-NLAttr"));

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell(makeString("Singular-NLAttr"));

    private static final SubLObject $$Group = reader_make_constant_shell(makeString("Group"));







    private static final SubLObject $$Plural_NLAttr = reader_make_constant_shell(makeString("Plural-NLAttr"));

    private static final SubLString $str163$Don_t_know_about_the_number__S = makeString("Don't know about the number ~S");









    private static final SubLString $str168$Don_t_know_about_the_gender__S = makeString("Don't know about the gender ~S");

    private static final SubLSymbol REFERENT_STRUCT = makeSymbol("REFERENT-STRUCT");

    private static final SubLSymbol REFERENT_STRUCT_P = makeSymbol("REFERENT-STRUCT-P");

    private static final SubLList $list171 = list(makeSymbol("REFERENCES"), makeSymbol("EQUALS"), makeSymbol("TYPES"), makeSymbol("FACTS"), makeSymbol("GENDER"), makeSymbol("NUMBER"));

    private static final SubLList $list172 = list(makeKeyword("REFERENCES"), makeKeyword("EQUALS"), makeKeyword("TYPES"), makeKeyword("FACTS"), makeKeyword("GENDER"), makeKeyword("NUMBER"));

    private static final SubLList $list173 = list(makeSymbol("REFERENT-STRUCT-REFERENCES"), makeSymbol("REFERENT-STRUCT-EQUALS"), makeSymbol("REFERENT-STRUCT-TYPES"), makeSymbol("REFERENT-STRUCT-FACTS"), makeSymbol("REFERENT-STRUCT-GENDER"), makeSymbol("REFERENT-STRUCT-NUMBER"));

    private static final SubLList $list174 = list(makeSymbol("_CSETF-REFERENT-STRUCT-REFERENCES"), makeSymbol("_CSETF-REFERENT-STRUCT-EQUALS"), makeSymbol("_CSETF-REFERENT-STRUCT-TYPES"), makeSymbol("_CSETF-REFERENT-STRUCT-FACTS"), makeSymbol("_CSETF-REFERENT-STRUCT-GENDER"), makeSymbol("_CSETF-REFERENT-STRUCT-NUMBER"));

    private static final SubLSymbol PRINT_REFERENT_STRUCT = makeSymbol("PRINT-REFERENT-STRUCT");

    private static final SubLSymbol REFERENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REFERENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list177 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REFERENT-STRUCT-P"));

    private static final SubLSymbol _CSETF_REFERENT_STRUCT_REFERENCES = makeSymbol("_CSETF-REFERENT-STRUCT-REFERENCES");

    private static final SubLSymbol REFERENT_STRUCT_EQUALS = makeSymbol("REFERENT-STRUCT-EQUALS");

    private static final SubLSymbol _CSETF_REFERENT_STRUCT_EQUALS = makeSymbol("_CSETF-REFERENT-STRUCT-EQUALS");

    private static final SubLSymbol REFERENT_STRUCT_TYPES = makeSymbol("REFERENT-STRUCT-TYPES");

    private static final SubLSymbol _CSETF_REFERENT_STRUCT_TYPES = makeSymbol("_CSETF-REFERENT-STRUCT-TYPES");

    private static final SubLSymbol REFERENT_STRUCT_FACTS = makeSymbol("REFERENT-STRUCT-FACTS");

    private static final SubLSymbol _CSETF_REFERENT_STRUCT_FACTS = makeSymbol("_CSETF-REFERENT-STRUCT-FACTS");

    private static final SubLSymbol REFERENT_STRUCT_GENDER = makeSymbol("REFERENT-STRUCT-GENDER");

    private static final SubLSymbol _CSETF_REFERENT_STRUCT_GENDER = makeSymbol("_CSETF-REFERENT-STRUCT-GENDER");

    private static final SubLSymbol REFERENT_STRUCT_NUMBER = makeSymbol("REFERENT-STRUCT-NUMBER");

    private static final SubLSymbol _CSETF_REFERENT_STRUCT_NUMBER = makeSymbol("_CSETF-REFERENT-STRUCT-NUMBER");













    private static final SubLSymbol MAKE_REFERENT_STRUCT = makeSymbol("MAKE-REFERENT-STRUCT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REFERENT_STRUCT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REFERENT-STRUCT-METHOD");

    private static final SubLString $str197$Equals___S__ = makeString("Equals: ~S~%");

    private static final SubLString $str198$Types___S__ = makeString("Types: ~S~%");

    private static final SubLString $str199$Facts___S__ = makeString("Facts: ~S~%");

    private static final SubLString $str200$Gender___S__ = makeString("Gender: ~S~%");

    private static final SubLString $str201$Number___S__ = makeString("Number: ~S~%");

    private static final SubLString $str202$References___ = makeString("References: (");

    private static final SubLString $str203$_S_ = makeString("~S ");

    private static final SubLString $str204$_ = makeString(")");

    private static final SubLObject $$Generic_NLAttr = reader_make_constant_shell(makeString("Generic-NLAttr"));



    private static final SubLSymbol $ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE = makeKeyword("ANAPHOR-RESOLVING-TO-BACKGROUND-KNOWLEDGE");

    private static final SubLSymbol $LIKELY_ACCOMODATABLE_ANAPHOR = makeKeyword("LIKELY-ACCOMODATABLE-ANAPHOR");

    private static final SubLSymbol RESTRICTIVE_CLAUSE_TREE_P = makeSymbol("RESTRICTIVE-CLAUSE-TREE-P");

    private static final SubLString $$$that = makeString("that");



    private static final SubLSymbol OF_PP_TREE_P = makeSymbol("OF-PP-TREE-P");

    private static final SubLString $$$of = makeString("of");





    private static final SubLSymbol POSSESSIVE_P = makeSymbol("POSSESSIVE-P");



    private static final SubLSymbol KB_DEMONSTRATIVE_NL_ATTR_P = makeSymbol("KB-DEMONSTRATIVE-NL-ATTR-P");

    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLObject $$Demonstrative_NLAttrType = reader_make_constant_shell(makeString("Demonstrative-NLAttrType"));

    private static final SubLObject $$Definite_NLAttr = reader_make_constant_shell(makeString("Definite-NLAttr"));





    private static final SubLObject $$FirstPerson_NLAttr = reader_make_constant_shell(makeString("FirstPerson-NLAttr"));

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell(makeString("SecondPerson-NLAttr"));



    private static final SubLSymbol $sym227$REFERENCE_POSSIBLY_REFERS_TO__CODE = makeSymbol("REFERENCE-POSSIBLY-REFERS-TO?-CODE");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$fewIfAny = reader_make_constant_shell(makeString("fewIfAny"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $const236$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

    private static final SubLSymbol $sym237$REFERENCE_LIKELY_REFERS_TO__CODE = makeSymbol("REFERENCE-LIKELY-REFERS-TO?-CODE");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol $sym239$_PRED = makeSymbol("?PRED");

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLObject $$relationExistsAll = reader_make_constant_shell(makeString("relationExistsAll"));

    private static final SubLList $list243 = list(makeKeyword("MAX-TIME"), TEN_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLString $str246$Don_t_know_what_category_of_refer = makeString("Don't know what category of reference ~S is");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLObject $$CycNounLearnerLexicalMt = reader_make_constant_shell(makeString("CycNounLearnerLexicalMt"));

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));





    private static final SubLInteger $int$5000 = makeInteger(5000);



    private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));













    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));









    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));







    private static final SubLObject $$There_Existential = reader_make_constant_shell(makeString("There-Existential"));





    private static final SubLString $str274$Don_t_know_the_POS_category_for__ = makeString("Don't know the POS category for ~S");

    private static final SubLList $list275 = list(new SubLObject[]{ makeString("mr"), makeString("mrs"), makeString("miss"), makeString("ms"), makeString("dr"), makeString("prof"), makeString("cpt"), makeString("pfc"), makeString("sgt"), makeString("rev"), makeString("lt"), makeString("sir"), makeString("adm"), makeString("col"), makeString("cpl"), makeString("gen"), makeString("brig") });

    private static final SubLObject $$InstanceNamedFn = reader_make_constant_shell(makeString("InstanceNamedFn"));

    private static final SubLList $list277 = list(reader_make_constant_shell(makeString("Person")));





    private static final SubLObject $$NLDefinitenessFn = reader_make_constant_shell(makeString("NLDefinitenessFn"));

    private static final SubLObject $$NLNumberFn = reader_make_constant_shell(makeString("NLNumberFn"));

    private static final SubLSymbol KB_NL_DEFINITENESS_ATTRIBUTE_P = makeSymbol("KB-NL-DEFINITENESS-ATTRIBUTE-P");



    private static final SubLString $str284$_cyc_top_data_nl_coreference_test = makeString("/cyc/top/data/nl/coreference-test-cases/nachos.txt");

    private static final SubLString $str285$____Sentence____S__ = makeString("~%~%Sentence:  ~S~%");

    private static final SubLString $str286$____Not_parsed_ = makeString("~%~%Not parsed.");

    private static final SubLString $str287$____Reference___S____Cycls___S___ = makeString("~%~%Reference: ~S~%~%Cycls: ~S~%~%");

    private static final SubLString $str288$Best_antecedent__ = makeString("Best antecedent: ");

    private static final SubLString $str289$__Likely_antecedents__ = makeString("~%Likely antecedents: ");

    private static final SubLString $str290$None___ = makeString("None.~%");

    private static final SubLString $$$____________________ = makeString("                    ");

    private static final SubLString $str292$__Possible_antecedents__ = makeString("~%Possible antecedents: ");

    private static final SubLString $$$______________________ = makeString("                      ");

    private static final SubLString $str294$Anaphor_with_no_possible_antecede = makeString("Anaphor with no possible antecedents.~%~%Functional dependency: ~S~%");

    private static final SubLString $str295$Not_an_anaphor___ = makeString("Not an anaphor.~%");

    private static final SubLString $str296$Anaphor_resolving_to_background_k = makeString("Anaphor resolving to background knowledge.~%");

    private static final SubLString $str297$Likely_accomodatable_anaphor___ = makeString("Likely accomodatable anaphor.~%");

    private static final SubLString $str298$Got_unexpected_value_from_REFEREN = makeString("Got unexpected value from REFERENCE-INFO-POSSIBLE-ANAPHOR?: ~S~%");

    private static final SubLString $str299$_ = makeString("{");

    private static final SubLString $str300$____ = makeString(" }~%");

    private static final SubLString $str301$__S = makeString(" ~S");

    private static final SubLString $str302$100_ = makeString("100%");

    private static final SubLString $$$sent = makeString("sent");

    private static final SubLString $str304$Sentence___ = makeString("Sentence:  ");

    private static final SubLString $$$Show = makeString("Show");

    private static final SubLString $$$Hide = makeString("Hide");





    private static final SubLString $str309$Not_parsed_ = makeString("Not parsed.");

    private static final SubLString $$$parses = makeString("parses");

    private static final SubLString $$$more = makeString("more");

    private static final SubLString $str312$Reference___S = makeString("Reference: ~S");

    private static final SubLString $str313$Parses_ = makeString("Parses:");



    private static final SubLString $$$Show_more = makeString("Show more");

    private static final SubLString $str316$Likely_antecedents__ = makeString("Likely antecedents: ");

    private static final SubLString $str317$None_ = makeString("None.");

    private static final SubLString $str318$Possible_antecedents__ = makeString("Possible antecedents: ");

    private static final SubLString $str319$Anaphor_with_no_possible_antecede = makeString("Anaphor with no possible antecedents.");

    private static final SubLString $str320$Functional_dependency__ = makeString("Functional dependency: ");

    private static final SubLString $str321$Not_an_anaphor_ = makeString("Not an anaphor.");

    private static final SubLString $str322$Anaphor_resolving_to_background_k = makeString("Anaphor resolving to background knowledge.");

    private static final SubLString $str323$Likely_accomodatable_anaphor_ = makeString("Likely accomodatable anaphor.");

    private static final SubLString $str324$Got_unexpected_value_from_REFEREN = makeString("Got unexpected value from REFERENCE-INFO-POSSIBLE-ANAPHOR?: ~S");

    private static final SubLString $str325$__ = makeString(" }");

    private static final SubLList $list326 = list(makeSymbol("RELATION"), makeSymbol("ANTECEDENT"));

    private static final SubLString $str327$Related_to__S_via_ = makeString("Related to ~S via ");

    private static final SubLString $str328$Don_t_recognize__S_as_a_functiona = makeString("Don't recognize ~S as a functional dependency");

    public static SubLObject coreference_resolution_discourse_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject coreference_resolution_discourse_struct_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$coreference_resolution_discourse_struct_native.class ? T : NIL;
    }

    public static SubLObject crd_implementation(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject crd_parser(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject crd_use_pspP(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject crd_max_sufficient_recentness(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject crd_max_possible_antecedents(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject crd_max_sufficient_recentness_for_gendered_pronoun(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject crd_max_possible_antecedents_for_gendered_pronoun(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject crd_reference_note_hash(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject crd_recent_references(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject crd_sentences(final SubLObject v_object) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_crd_implementation(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_crd_parser(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_crd_use_pspP(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_crd_max_sufficient_recentness(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_crd_max_possible_antecedents(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_crd_max_sufficient_recentness_for_gendered_pronoun(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_crd_max_possible_antecedents_for_gendered_pronoun(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_crd_reference_note_hash(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_crd_recent_references(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_crd_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != coreference_resolution_discourse_struct_p(v_object) : "coreference_resolution.coreference_resolution_discourse_struct_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_coreference_resolution_discourse_struct(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $coreference_resolution_discourse_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($IMPLEMENTATION)) {
                _csetf_crd_implementation(v_new, current_value);
            } else
                if (pcase_var.eql($PARSER)) {
                    _csetf_crd_parser(v_new, current_value);
                } else
                    if (pcase_var.eql($kw31$USE_PSP_)) {
                        _csetf_crd_use_pspP(v_new, current_value);
                    } else
                        if (pcase_var.eql($MAX_SUFFICIENT_RECENTNESS)) {
                            _csetf_crd_max_sufficient_recentness(v_new, current_value);
                        } else
                            if (pcase_var.eql($MAX_POSSIBLE_ANTECEDENTS)) {
                                _csetf_crd_max_possible_antecedents(v_new, current_value);
                            } else
                                if (pcase_var.eql($MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN)) {
                                    _csetf_crd_max_sufficient_recentness_for_gendered_pronoun(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN)) {
                                        _csetf_crd_max_possible_antecedents_for_gendered_pronoun(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($REFERENCE_NOTE_HASH)) {
                                            _csetf_crd_reference_note_hash(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RECENT_REFERENCES)) {
                                                _csetf_crd_recent_references(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SENTENCES)) {
                                                    _csetf_crd_sentences(v_new, current_value);
                                                } else {
                                                    Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_coreference_resolution_discourse_struct(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $IMPLEMENTATION, crd_implementation(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSER, crd_parser(obj));
        funcall(visitor_fn, obj, $SLOT, $kw31$USE_PSP_, crd_use_pspP(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_SUFFICIENT_RECENTNESS, crd_max_sufficient_recentness(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_POSSIBLE_ANTECEDENTS, crd_max_possible_antecedents(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN, crd_max_sufficient_recentness_for_gendered_pronoun(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN, crd_max_possible_antecedents_for_gendered_pronoun(obj));
        funcall(visitor_fn, obj, $SLOT, $REFERENCE_NOTE_HASH, crd_reference_note_hash(obj));
        funcall(visitor_fn, obj, $SLOT, $RECENT_REFERENCES, crd_recent_references(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, crd_sentences(obj));
        funcall(visitor_fn, obj, $END, MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_coreference_resolution_discourse_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_coreference_resolution_discourse_struct(obj, visitor_fn);
    }

    public static SubLObject new_coref_discourse(SubLObject max_sufficient_recentness, SubLObject max_possible_antecedents, SubLObject max_sufficient_recentness_for_gendered_pronoun, SubLObject max_possible_antecedents_for_gendered_pronoun, SubLObject use_pspP, SubLObject v_parser, SubLObject implementation) {
        if (max_sufficient_recentness == UNPROVIDED) {
            max_sufficient_recentness = FIVE_INTEGER;
        }
        if (max_possible_antecedents == UNPROVIDED) {
            max_possible_antecedents = FIVE_INTEGER;
        }
        if (max_sufficient_recentness_for_gendered_pronoun == UNPROVIDED) {
            max_sufficient_recentness_for_gendered_pronoun = TWO_INTEGER;
        }
        if (max_possible_antecedents_for_gendered_pronoun == UNPROVIDED) {
            max_possible_antecedents_for_gendered_pronoun = TWO_INTEGER;
        }
        if (use_pspP == UNPROVIDED) {
            use_pspP = T;
        }
        if (v_parser == UNPROVIDED) {
            v_parser = object.new_class_instance(STANFORD_PARSER);
        }
        if (implementation == UNPROVIDED) {
            implementation = $CODE;
        }
        return make_coreference_resolution_discourse_struct(list(new SubLObject[]{ $MAX_SUFFICIENT_RECENTNESS, max_sufficient_recentness, $MAX_POSSIBLE_ANTECEDENTS, max_possible_antecedents, $MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN, max_sufficient_recentness_for_gendered_pronoun, $MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN, max_possible_antecedents_for_gendered_pronoun, $kw31$USE_PSP_, use_pspP, $PARSER, v_parser, $IMPLEMENTATION, implementation, $REFERENCE_NOTE_HASH, make_hash_table($int$50, symbol_function(EQ), UNPROVIDED), $RECENT_REFERENCES, NIL, $SENTENCES, NIL }));
    }

    public static SubLObject coref_discourse_p(final SubLObject v_object) {
        return coreference_resolution_discourse_struct_p(v_object);
    }

    public static SubLObject coreference_resolution_referenceP(final SubLObject v_object, final SubLObject coref_discourse) {
        return reference_note_p(reference_note(v_object, coref_discourse));
    }

    public static SubLObject reference_note_p(final SubLObject v_object) {
        return reference_info_p(v_object);
    }

    public static SubLObject reference_note(final SubLObject reference, final SubLObject coref_discourse) {
        return gethash(reference, crd_reference_note_hash(coref_discourse), UNPROVIDED);
    }

    public static SubLObject set_reference_note(final SubLObject reference, final SubLObject note, final SubLObject coref_discourse) {
        return sethash(reference, crd_reference_note_hash(coref_discourse), note);
    }

    public static SubLObject resolve_coreferences_in_parse_tree(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject coref_discourse = NIL;
        SubLObject v_parse_tree = NIL;
        SubLObject sentence_references_var = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        coref_discourse = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        v_parse_tree = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        sentence_references_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject coref_discourse_var = $sym49$COREF_DISCOURSE_VAR;
            final SubLObject reference_var = $sym50$REFERENCE_VAR;
            final SubLObject recent_references_var = $sym51$RECENT_REFERENCES_VAR;
            return list(CLET, list(list(coref_discourse_var, coref_discourse), list(recent_references_var, list(CRD_RECENT_REFERENCES, coref_discourse_var))), list(DO_PARSE_TREE_SUBTREES, listS(reference_var, v_parse_tree, $list54), list(PUNLESS, list(CAND, list(NP_TREE_P, reference_var), list($sym58$IS_THE_ONLY_HEAD_DAUGHTER_OF_AN_NP_, reference_var)), list(RESOLVE_REFERENCE, coref_discourse_var, reference_var, sentence_references_var, recent_references_var), list(CPUSH, reference_var, sentence_references_var))));
        }
        cdestructuring_bind_error(datum, $list48);
        return NIL;
    }

    public static SubLObject resolve_coreferences(final SubLObject input, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        if (NIL != list_utilities.list_of_type_p(symbol_function(PARSE_TREE_P), input)) {
            return resolve_coreferences_in_list_of_parse_trees(input, coref_discourse);
        }
        if (NIL != document.document_p(input)) {
            return resolve_coreferences_in_document(input, coref_discourse);
        }
        if (input.isStream() && (NIL != input_stream_p(input))) {
            return resolve_coreferences_in_stream(input, coref_discourse);
        }
        if ((NIL != file_utilities.pathname_designator_p(input)) && (NIL != Filesys.probe_file(input))) {
            return resolve_coreferences_in_text_file(input, coref_discourse);
        }
        if (input.isString()) {
            return resolve_coreferences_in_string(input, coref_discourse);
        }
        Errors.error($str62$_S_is_not_valid_input_for_the_cor, input);
        return NIL;
    }

    public static SubLObject resolve_coreferences_in_text_file(final SubLObject text_file, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(text_file, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, text_file);
            }
            final SubLObject stream_$1 = stream;
            coref_discourse = resolve_coreferences_in_stream(stream_$1, coref_discourse);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return coref_discourse;
    }

    public static SubLObject resolve_coreferences_in_stream(final SubLObject stream, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        assert NIL != input_stream_p(stream) : "streams_high.input_stream_p(stream) " + "CommonSymbols.NIL != streams_high.input_stream_p(stream) " + stream;
        return resolve_coreferences_in_document(document.new_document(stream, UNPROVIDED, UNPROVIDED), coref_discourse);
    }

    public static SubLObject resolve_coreferences_in_string(final SubLObject string, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return resolve_coreferences_in_document(document.new_document(string, UNPROVIDED, UNPROVIDED), coref_discourse);
    }

    public static SubLObject resolve_coreferences_in_document(final SubLObject v_document, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == coref_discourse) {
            coref_discourse = new_coref_discourse(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = parsing_vars.$use_ternary_np_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$use_ternary_np_tagsP$.bind(NIL, thread);
            final SubLObject vector_var = document.document_paragraphs(v_document);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject paragraph;
            SubLObject vector_var_$2;
            SubLObject backwardP_var_$3;
            SubLObject length_$4;
            SubLObject v_iteration_$5;
            SubLObject element_num_$6;
            SubLObject sentence;
            SubLObject sentence_string;
            SubLObject v_parse_tree;
            SubLObject sentence_references;
            SubLObject coref_discourse_var;
            SubLObject recent_references_var;
            SubLObject categories_var;
            SubLObject stack;
            SubLObject order_var;
            SubLObject possible_orders;
            SubLObject reference_var;
            SubLObject vector_var_$3;
            SubLObject backwardP_var_$4;
            SubLObject length_$5;
            SubLObject v_iteration_$6;
            SubLObject element_num_$7;
            SubLObject daughter;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                paragraph = aref(vector_var, element_num);
                vector_var_$2 = document.paragraph_sentences(paragraph);
                backwardP_var_$3 = NIL;
                for (length_$4 = length(vector_var_$2), v_iteration_$5 = NIL, v_iteration_$5 = ZERO_INTEGER; v_iteration_$5.numL(length_$4); v_iteration_$5 = add(v_iteration_$5, ONE_INTEGER)) {
                    element_num_$6 = (NIL != backwardP_var_$3) ? subtract(length_$4, v_iteration_$5, ONE_INTEGER) : v_iteration_$5;
                    sentence = aref(vector_var_$2, element_num_$6);
                    sentence_string = document.sentence_string(sentence);
                    v_parse_tree = crd_parse(coref_discourse, sentence_string);
                    sentence_references = NIL;
                    if (NIL == parse_tree.parse_tree_p(v_parse_tree)) {
                        Errors.warn($str67$Got_invalid_parse_result_for__S__, sentence_string, v_parse_tree);
                        crd_add_sentence(coref_discourse, sentence_string);
                    } else {
                        crd_add_sentence(coref_discourse, v_parse_tree);
                        coref_discourse_var = coref_discourse;
                        recent_references_var = crd_recent_references(coref_discourse_var);
                        categories_var = $list68;
                        stack = stacks.create_stack();
                        order_var = $DFL2R;
                        possible_orders = list($DFL2R, $DFR2L);
                        reference_var = NIL;
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
                            Errors.error($str71$_S_is_not_one_of__S, order_var, possible_orders);
                        }
                        stacks.stack_push(v_parse_tree, stack);
                        while (NIL == stacks.stack_empty_p(stack)) {
                            reference_var = stacks.stack_pop(stack);
                            if (((categories_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(reference_var, GET_CATEGORY), categories_var, UNPROVIDED, UNPROVIDED))) && ((NIL == parse_tree.np_tree_p(reference_var)) || (NIL == is_the_only_head_daughter_of_an_npP(reference_var)))) {
                                resolve_reference(coref_discourse_var, reference_var, sentence_references, recent_references_var);
                                sentence_references = cons(reference_var, sentence_references);
                            }
                            if (NIL != parse_tree.phrase_tree_p(reference_var)) {
                                vector_var_$3 = parse_tree.get_phrase_tree_daughters(reference_var);
                                backwardP_var_$4 = eq(order_var, $DFL2R);
                                for (length_$5 = length(vector_var_$3), v_iteration_$6 = NIL, v_iteration_$6 = ZERO_INTEGER; v_iteration_$6.numL(length_$5); v_iteration_$6 = add(v_iteration_$6, ONE_INTEGER)) {
                                    element_num_$7 = (NIL != backwardP_var_$4) ? subtract(length_$5, v_iteration_$6, ONE_INTEGER) : v_iteration_$6;
                                    daughter = aref(vector_var_$3, element_num_$7);
                                    stacks.stack_push(daughter, stack);
                                }
                            }
                        } 
                    }
                    note_latest_sentence_references(coref_discourse, sentence_references);
                }
            }
        } finally {
            parsing_vars.$use_ternary_np_tagsP$.rebind(_prev_bind_0, thread);
        }
        return coref_discourse;
    }

    public static SubLObject resolve_coreferences_in_list_of_parse_trees(final SubLObject parse_trees, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(parse_trees) : "list_utilities.non_dotted_list_p(parse_trees) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(parse_trees) " + parse_trees;
        SubLObject cdolist_list_var = parse_trees;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != parse_tree.parse_tree_p(elem) : "parse_tree.parse_tree_p(elem) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == coref_discourse) {
            coref_discourse = new_coref_discourse(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        crd_add_sentences(coref_discourse, parse_trees);
        final SubLObject _prev_bind_0 = parsing_vars.$use_ternary_np_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$use_ternary_np_tagsP$.bind(NIL, thread);
            cdolist_list_var = parse_trees;
            SubLObject v_parse_tree = NIL;
            v_parse_tree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sentence_references = NIL;
                final SubLObject coref_discourse_var = coref_discourse;
                final SubLObject recent_references_var = crd_recent_references(coref_discourse_var);
                final SubLObject categories_var = $list68;
                final SubLObject stack = stacks.create_stack();
                final SubLObject order_var = $DFL2R;
                final SubLObject possible_orders = list($DFL2R, $DFR2L);
                SubLObject reference_var = NIL;
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
                    Errors.error($str71$_S_is_not_one_of__S, order_var, possible_orders);
                }
                stacks.stack_push(v_parse_tree, stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    reference_var = stacks.stack_pop(stack);
                    if (((categories_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(reference_var, GET_CATEGORY), categories_var, UNPROVIDED, UNPROVIDED))) && ((NIL == parse_tree.np_tree_p(reference_var)) || (NIL == is_the_only_head_daughter_of_an_npP(reference_var)))) {
                        resolve_reference(coref_discourse_var, reference_var, sentence_references, recent_references_var);
                        sentence_references = cons(reference_var, sentence_references);
                    }
                    if (NIL != parse_tree.phrase_tree_p(reference_var)) {
                        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(reference_var);
                        final SubLObject backwardP_var = eq(order_var, $DFL2R);
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject daughter;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            daughter = aref(vector_var, element_num);
                            stacks.stack_push(daughter, stack);
                        }
                    }
                } 
                note_latest_sentence_references(coref_discourse, sentence_references);
                cdolist_list_var = cdolist_list_var.rest();
                v_parse_tree = cdolist_list_var.first();
            } 
        } finally {
            parsing_vars.$use_ternary_np_tagsP$.rebind(_prev_bind_0, thread);
        }
        return coref_discourse;
    }

    public static SubLObject coref_discourse_coreferring_expressions(final SubLObject coref_discourse) {
        SubLObject referents = NIL;
        final SubLObject cdohash_table = crd_reference_note_hash(coref_discourse);
        SubLObject reference = NIL;
        SubLObject reference_note = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                reference = getEntryKey(cdohash_entry);
                reference_note = getEntryValue(cdohash_entry);
                final SubLObject referent = reference_referent(reference, coref_discourse);
                if (NIL != referent) {
                    final SubLObject item_var = referent;
                    if (NIL != member(item_var, referents, symbol_function(EQ), symbol_function(IDENTITY))) {
                        continue;
                    }
                    referents = cons(item_var, referents);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Mapping.mapcar(symbol_function(REFERENT_STRUCT_REFERENCES), referents);
    }

    public static SubLObject crd_parse(final SubLObject coref_discourse, final SubLObject sentence_string) {
        final SubLObject v_parser = crd_parser(coref_discourse);
        return methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
    }

    public static SubLObject crd_add_sentences(final SubLObject coref_discourse, final SubLObject sentences) {
        _csetf_crd_sentences(coref_discourse, append(crd_sentences(coref_discourse), sentences));
        return NIL;
    }

    public static SubLObject crd_add_sentence(final SubLObject coref_discourse, final SubLObject sentence) {
        _csetf_crd_sentences(coref_discourse, list_utilities.snoc(sentence, crd_sentences(coref_discourse)));
        return NIL;
    }

    public static SubLObject crd_sentence_string(final SubLObject sentence) {
        if (NIL != parse_tree.parse_tree_p(sentence)) {
            return parse_tree_utilities.parse_tree_string(sentence);
        }
        if (sentence.isString()) {
            return sentence;
        }
        return NIL;
    }

    public static SubLObject note_latest_sentence_references(final SubLObject coref_discourse, final SubLObject sentence_references) {
        SubLObject recent_references = crd_recent_references(coref_discourse);
        final SubLObject max_sufficient_recentness = crd_max_sufficient_recentness(coref_discourse);
        recent_references = cons(sentence_references, list_utilities.first_n(subtract(max_sufficient_recentness, ONE_INTEGER), recent_references));
        _csetf_crd_recent_references(coref_discourse, recent_references);
        return coref_discourse;
    }

    public static SubLObject is_the_only_head_daughter_of_an_npP(final SubLObject reference) {
        final SubLObject mother = methods.funcall_instance_method_with_0_args(reference, GET_MOTHER);
        if (NIL != parse_tree.np_tree_p(mother)) {
            final SubLObject head_daughters_of_mother = methods.funcall_instance_method_with_0_args(mother, GET_HEAD_DAUGHTERS);
            return makeBoolean((NIL != list_utilities.singletonP(head_daughters_of_mother)) && reference.eql(head_daughters_of_mother.first()));
        }
        return NIL;
    }

    public static SubLObject resolve_reference(final SubLObject coref_discourse, final SubLObject reference, final SubLObject sentence_references, final SubLObject recent_references) {
        final SubLObject reference_note = new_reference_note(coref_discourse, reference);
        set_reference_note(reference, reference_note, coref_discourse);
        final SubLObject possible_anaphorP = reference_calculate_and_set(reference, $kw79$POSSIBLE_ANAPHOR_, coref_discourse, UNPROVIDED);
        final SubLObject possible_antecedentP = reference_calculate_and_set(reference, $kw80$POSSIBLE_ANTECEDENT_, coref_discourse, UNPROVIDED);
        if (possible_anaphorP == $STANDARD_ANAPHOR) {
            SubLObject preceding_references_in_sentence = NIL;
            final SubLObject ancestors = methods.funcall_instance_method_with_0_args(reference, GET_ANCESTORS);
            SubLObject cdolist_list_var = sentence_references;
            SubLObject sentence_reference = NIL;
            sentence_reference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.memberP(sentence_reference, ancestors, symbol_function(EQ), UNPROVIDED)) {
                    preceding_references_in_sentence = cons(sentence_reference, preceding_references_in_sentence);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence_reference = cdolist_list_var.first();
            } 
            preceding_references_in_sentence = nreverse(preceding_references_in_sentence);
            final SubLObject max_recentness = max_sufficient_recentness_for_reference(coref_discourse, reference);
            final SubLObject antecedent_candidates = append(preceding_references_in_sentence, list_utilities.flatten(list_utilities.first_n(max_recentness, recent_references)));
            final SubLObject possible_antecedents = reference_calculate_and_set(reference, $POSSIBLE_ANTECEDENTS, coref_discourse, list(antecedent_candidates));
            if (NIL != list_utilities.non_empty_list_p(possible_antecedents)) {
                final SubLObject likely_antecedents = reference_calculate_and_set(reference, $LIKELY_ANTECEDENTS, coref_discourse, list(possible_antecedents));
                reference_calculate_and_set(reference, $BEST_ANTECEDENT, coref_discourse, list(likely_antecedents, possible_antecedents));
                reference_set(reference, $FUNCTIONAL_DEPENDENCY, NIL, coref_discourse);
                reference_do_implementation_specific_processing(coref_discourse, reference, $ANAPHOR_WITH_POSSIBLE_ANTECEDENTS);
            } else {
                reference_set(reference, $LIKELY_ANTECEDENTS, NIL, coref_discourse);
                reference_set(reference, $BEST_ANTECEDENT, NIL, coref_discourse);
                reference_calculate_and_set(reference, $FUNCTIONAL_DEPENDENCY, coref_discourse, list(antecedent_candidates));
                reference_do_implementation_specific_processing(coref_discourse, reference, $ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS);
            }
        } else {
            reference_set(reference, $POSSIBLE_ANTECEDENTS, NIL, coref_discourse);
            reference_set(reference, $LIKELY_ANTECEDENTS, NIL, coref_discourse);
            reference_set(reference, $BEST_ANTECEDENT, NIL, coref_discourse);
            reference_set(reference, $FUNCTIONAL_DEPENDENCY, NIL, coref_discourse);
            reference_do_implementation_specific_processing(coref_discourse, reference, NIL != possible_antecedentP ? $NON_ANAPHOR_POSSIBLE_ANTECEDENT : $NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT);
        }
        return reference;
    }

    public static SubLObject max_sufficient_recentness_for_reference(final SubLObject coref_discourse, final SubLObject reference) {
        return NIL != reference_gendered_pronounP(coref_discourse, reference) ? crd_max_sufficient_recentness_for_gendered_pronoun(coref_discourse) : crd_max_sufficient_recentness(coref_discourse);
    }

    public static SubLObject max_possible_antecedents_for_reference(final SubLObject coref_discourse, final SubLObject reference) {
        return NIL != reference_gendered_pronounP(coref_discourse, reference) ? crd_max_possible_antecedents_for_gendered_pronoun(coref_discourse) : crd_max_possible_antecedents(coref_discourse);
    }

    public static SubLObject reference_gendered_pronounP(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_gendered_pronounP_code(coref_discourse, reference);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_calculate_and_set(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject value = reference_calculate(reference, slot, coref_discourse, args);
        reference_set(reference, slot, value, coref_discourse);
        return value;
    }

    public static SubLObject reference_possibly_calculate(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject value = reference_get(reference, slot, coref_discourse);
        if (value == $DONT_KNOW_YET) {
            value = reference_calculate_and_set(reference, slot, coref_discourse, args);
        }
        return value;
    }

    public static SubLObject reference_calculate(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse, final SubLObject args) {
        if (slot.eql($kw79$POSSIBLE_ANAPHOR_)) {
            return apply($sym95$REFERENCE_POSSIBLE_ANAPHOR__CALCULATE, reference, new SubLObject[]{ coref_discourse, args });
        }
        if (slot.eql($kw80$POSSIBLE_ANTECEDENT_)) {
            return apply($sym96$REFERENCE_POSSIBLE_ANTECEDENT__CALCULATE, reference, new SubLObject[]{ coref_discourse, args });
        }
        if (slot.eql($POSSIBLE_ANTECEDENTS)) {
            return apply(REFERENCE_POSSIBLE_ANTECEDENTS_CALCULATE, reference, new SubLObject[]{ coref_discourse, args });
        }
        if (slot.eql($LIKELY_ANTECEDENTS)) {
            return apply(REFERENCE_LIKELY_ANTECEDENTS_CALCULATE, reference, new SubLObject[]{ coref_discourse, args });
        }
        if (slot.eql($BEST_ANTECEDENT)) {
            return apply(REFERENCE_BEST_ANTECEDENT_CALCULATE, reference, new SubLObject[]{ coref_discourse, args });
        }
        if (slot.eql($FUNCTIONAL_DEPENDENCY)) {
            return apply(REFERENCE_FUNCTIONAL_DEPENDENCY_CALCULATE, reference, new SubLObject[]{ coref_discourse, args });
        }
        Errors.error($str101$Don_t_know_how_to_calculate_refer, slot);
        return NIL;
    }

    public static SubLObject reference_possible_anaphorP_calculate(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_possible_anaphorP_calculate_code(coref_discourse, reference);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_possible_antecedentP_calculate(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_possible_antecedentP_calculate_code(coref_discourse, reference);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_possible_antecedents_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject candidates) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_possible_antecedents_calculate_code(coref_discourse, reference, candidates);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_likely_antecedents_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject candidates) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_likely_antecedents_calculate_code(coref_discourse, reference, candidates);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_best_antecedent_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject likely_antecedents, final SubLObject possible_antecedents) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_best_antecedent_calculate_code(reference, likely_antecedents, possible_antecedents);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_functional_dependency_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject candidates) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_functional_dependency_calculate_code(coref_discourse, reference, candidates);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_get(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse) {
        final SubLObject reference_note = reference_note(reference, coref_discourse);
        if (slot.eql($kw79$POSSIBLE_ANAPHOR_)) {
            return reference_note_possible_anaphorP_get(coref_discourse, reference_note);
        }
        if (slot.eql($kw80$POSSIBLE_ANTECEDENT_)) {
            return reference_note_possible_antecedentP_get(coref_discourse, reference_note);
        }
        if (slot.eql($POSSIBLE_ANTECEDENTS)) {
            return reference_note_possible_antecedents_get(coref_discourse, reference_note);
        }
        if (slot.eql($LIKELY_ANTECEDENTS)) {
            return reference_note_likely_antecedents_get(coref_discourse, reference_note);
        }
        if (slot.eql($BEST_ANTECEDENT)) {
            return reference_note_best_antecedent_get(coref_discourse, reference_note);
        }
        if (slot.eql($FUNCTIONAL_DEPENDENCY)) {
            return reference_note_functional_dependency_get(coref_discourse, reference_note);
        }
        Errors.error($str102$Don_t_know_how_to_get_reference_s, slot);
        return NIL;
    }

    public static SubLObject reference_note_possible_anaphorP_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_possible_anaphorP_get(reference_note);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_possible_antecedentP_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_possible_antecedentP_get(reference_note);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_possible_antecedents_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_possible_antecedents_get(reference_note);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_likely_antecedents_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_likely_antecedents_get(reference_note);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_best_antecedent_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_best_antecedent_get(reference_note);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_functional_dependency_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_functional_dependency_get(reference_note);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_set(final SubLObject reference, final SubLObject slot, final SubLObject value, final SubLObject coref_discourse) {
        final SubLObject reference_note = reference_note(reference, coref_discourse);
        if (slot.eql($kw79$POSSIBLE_ANAPHOR_)) {
            return reference_note_possible_anaphorP_set(coref_discourse, reference_note, value);
        }
        if (slot.eql($kw80$POSSIBLE_ANTECEDENT_)) {
            return reference_note_possible_antecedentP_set(coref_discourse, reference_note, value);
        }
        if (slot.eql($POSSIBLE_ANTECEDENTS)) {
            return reference_note_possible_antecedents_set(coref_discourse, reference_note, value);
        }
        if (slot.eql($LIKELY_ANTECEDENTS)) {
            return reference_note_likely_antecedents_set(coref_discourse, reference_note, value);
        }
        if (slot.eql($BEST_ANTECEDENT)) {
            return reference_note_best_antecedent_set(coref_discourse, reference_note, value);
        }
        if (slot.eql($FUNCTIONAL_DEPENDENCY)) {
            return reference_note_functional_dependency_set(coref_discourse, reference_note, value);
        }
        Errors.error($str103$Don_t_know_how_to_set_reference_s, slot);
        return NIL;
    }

    public static SubLObject reference_note_possible_anaphorP_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_possible_anaphorP_set(reference_note, value);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_possible_antecedentP_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_possible_antecedentP_set(reference_note, value);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_possible_antecedents_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_possible_antecedents_set(reference_note, value);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_likely_antecedents_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_likely_antecedents_set(reference_note, value);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_best_antecedent_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_best_antecedent_set(reference_note, value);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_note_functional_dependency_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_info_functional_dependency_set(reference_note, value);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject new_reference_note(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return new_reference_info(coref_discourse, reference);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_do_implementation_specific_processing(final SubLObject coref_discourse, final SubLObject reference, final SubLObject reason) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql($KB)) {
            Errors.error($str92$The__KB_implementation_of_corefer);
        } else {
            if (pcase_var.eql($CODE)) {
                return reference_do_implementation_specific_processing_code(coref_discourse, reference, reason);
            }
            Errors.error($str93$Don_t_know_about__S_implementatio, implementation);
        }
        return NIL;
    }

    public static SubLObject reference_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_reference_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject reference_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$reference_info_native.class ? T : NIL;
    }

    public static SubLObject reference_info_index_number(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject reference_info_tree(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject reference_info_cycls(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject reference_info_possible_antecedentP(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject reference_info_possible_anaphorP(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject reference_info_possible_antecedents(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject reference_info_likely_antecedents(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject reference_info_best_antecedent(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject reference_info_functional_dependency(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject reference_info_referent(final SubLObject v_object) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_reference_info_index_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_reference_info_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_reference_info_cycls(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_reference_info_possible_antecedentP(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_reference_info_possible_anaphorP(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_reference_info_possible_antecedents(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_reference_info_likely_antecedents(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_reference_info_best_antecedent(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_reference_info_functional_dependency(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_reference_info_referent(final SubLObject v_object, final SubLObject value) {
        assert NIL != reference_info_p(v_object) : "coreference_resolution.reference_info_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_reference_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $reference_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INDEX_NUMBER)) {
                _csetf_reference_info_index_number(v_new, current_value);
            } else
                if (pcase_var.eql($TREE)) {
                    _csetf_reference_info_tree(v_new, current_value);
                } else
                    if (pcase_var.eql($CYCLS)) {
                        _csetf_reference_info_cycls(v_new, current_value);
                    } else
                        if (pcase_var.eql($kw80$POSSIBLE_ANTECEDENT_)) {
                            _csetf_reference_info_possible_antecedentP(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw79$POSSIBLE_ANAPHOR_)) {
                                _csetf_reference_info_possible_anaphorP(v_new, current_value);
                            } else
                                if (pcase_var.eql($POSSIBLE_ANTECEDENTS)) {
                                    _csetf_reference_info_possible_antecedents(v_new, current_value);
                                } else
                                    if (pcase_var.eql($LIKELY_ANTECEDENTS)) {
                                        _csetf_reference_info_likely_antecedents(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($BEST_ANTECEDENT)) {
                                            _csetf_reference_info_best_antecedent(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FUNCTIONAL_DEPENDENCY)) {
                                                _csetf_reference_info_functional_dependency(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($REFERENT)) {
                                                    _csetf_reference_info_referent(v_new, current_value);
                                                } else {
                                                    Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_reference_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REFERENCE_INFO, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INDEX_NUMBER, reference_info_index_number(obj));
        funcall(visitor_fn, obj, $SLOT, $TREE, reference_info_tree(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLS, reference_info_cycls(obj));
        funcall(visitor_fn, obj, $SLOT, $kw80$POSSIBLE_ANTECEDENT_, reference_info_possible_antecedentP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw79$POSSIBLE_ANAPHOR_, reference_info_possible_anaphorP(obj));
        funcall(visitor_fn, obj, $SLOT, $POSSIBLE_ANTECEDENTS, reference_info_possible_antecedents(obj));
        funcall(visitor_fn, obj, $SLOT, $LIKELY_ANTECEDENTS, reference_info_likely_antecedents(obj));
        funcall(visitor_fn, obj, $SLOT, $BEST_ANTECEDENT, reference_info_best_antecedent(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTIONAL_DEPENDENCY, reference_info_functional_dependency(obj));
        funcall(visitor_fn, obj, $SLOT, $REFERENT, reference_info_referent(obj));
        funcall(visitor_fn, obj, $END, MAKE_REFERENCE_INFO, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_reference_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_reference_info(obj, visitor_fn);
    }

    public static SubLObject print_reference_info(final SubLObject reference_info, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(reference_info, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, reference_info, T, T);
            format(stream, $str139$_S, reference_info_string(reference_info));
            print_macros.print_unreadable_object_postamble(stream, reference_info, NIL, NIL);
        }
        return NIL;
    }

    public static SubLObject reference_info_string(final SubLObject reference_info) {
        final SubLObject tree = reference_info_tree(reference_info);
        if (NIL != parse_tree.parse_tree_p(tree)) {
            return methods.funcall_instance_method_with_0_args(tree, GET_STRING);
        }
        return NIL;
    }

    public static SubLObject reference_info_cycl(final SubLObject reference_info) {
        final SubLObject cycls = reference_info_cycls(reference_info);
        if (NIL != cycls) {
            return cycls.first();
        }
        return NIL;
    }

    public static SubLObject reference_cycl(final SubLObject reference, final SubLObject coref_discourse) {
        return reference_info_cycl(reference_note(reference, coref_discourse));
    }

    public static SubLObject reference_cycl_stripped(final SubLObject reference, final SubLObject coref_discourse) {
        return parsing_utilities.strip_nl_tags(reference_cycl(reference, coref_discourse), UNPROVIDED);
    }

    public static SubLObject reference_semantics(final SubLObject reference, final SubLObject coref_discourse) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_psp_semantics(reference, coref_discourse) : reference_cyclifier_semantics(reference);
    }

    public static SubLObject reference_psp_semantics(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject semantics = reference_cycl_stripped(reference, coref_discourse);
        if ((NIL == semantics) || semantics.eql($$Thing)) {
            return $UNKNOWN;
        }
        if (NIL == parsing_utilities.cycl_pronoun_p(semantics)) {
            return semantics;
        }
        final SubLObject pcase_var = parsing_utilities.nl_gender_attr_for_cycl(semantics);
        if (pcase_var.eql($$Ungendered_NLAttr)) {
            return NIL;
        }
        if (pcase_var.eql($$Neuter_NLAttr)) {
            return cr_non_person();
        }
        if (pcase_var.eql($$Masculine_NLAttr)) {
            return $$MaleHuman;
        }
        if (pcase_var.eql($$Feminine_NLAttr)) {
            return $$FemaleHuman;
        }
        Errors.warn($str149$Didn_t_know_there_was_such_a_gend, parsing_utilities.nl_gender_attr_for_cycl(semantics));
        return NIL;
    }

    public static SubLObject reference_cyclifier_semantics(final SubLObject reference) {
        final SubLObject cyclifications = methods.funcall_instance_method_with_0_args(reference, CYCLIFY);
        if (NIL != cyclifications) {
            final SubLObject stand_in_term = guess_referent_stand_in_in_cyclifications(reference, cyclifications);
            SubLObject semantics = cr_existentially_unbind(cyclifications.first());
            if (NIL != stand_in_term) {
                semantics = cycl_utilities.expression_subst($sym151$_REFERENT, stand_in_term, semantics, symbol_function(EQUAL), UNPROVIDED);
            }
            return cr_split_conjunctions(semantics);
        }
        return NIL;
    }

    public static SubLObject cr_existentially_unbind(SubLObject sentence) {
        while (NIL != el_existential_p(sentence)) {
            sentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        } 
        return sentence;
    }

    public static SubLObject guess_referent_stand_in_in_cyclifications(final SubLObject reference, final SubLObject cyclifications) {
        return cycl_utilities.formula_find_if(symbol_function(POSSIBLY_CYCLIFIER_REFERENT_STAND_IN), cyclifications.first(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject possibly_cyclifier_referent_stand_in(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.el_variable_p(v_object)) || (NIL != instance_fn_nat_p(v_object)));
    }

    public static SubLObject instance_fn_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && $$InstanceFn.eql(cycl_utilities.formula_operator(v_object)));
    }

    public static SubLObject cr_non_person() {
        if (NIL == $cr_non_person$.getGlobalValue()) {
            $cr_non_person$.setGlobalValue(make_binary_formula($$CollectionDifferenceFn, $$Thing, $$Person));
        }
        return $cr_non_person$.getGlobalValue();
    }

    public static SubLObject reference_number(final SubLObject reference, final SubLObject coref_discourse) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_psp_number(reference, coref_discourse) : reference_cyclifier_number(reference);
    }

    public static SubLObject reference_psp_number(final SubLObject reference, final SubLObject coref_discourse) {
        SubLObject number = parsing_utilities.nl_number_attr_for_cycl(reference_cycl(reference, coref_discourse));
        final SubLObject reference_semantics = reference_psp_semantics(reference, coref_discourse);
        if (number.eql($$UnmarkedNumber_NLAttr) && (NIL != kb_accessors.kb_individual_p(reference_semantics))) {
            number = $$Singular_NLAttr;
        }
        if ((number.eql($$Singular_NLAttr) && (NIL != term.el_fort_p(reference_semantics))) && ((NIL != isa.isa_in_any_mtP(reference_semantics, $$Group)) || (NIL != genls.genl_in_any_mtP(reference_semantics, $$Group)))) {
            number = $$UnmarkedNumber_NLAttr;
        }
        return number;
    }

    public static SubLObject reference_cyclifier_number(final SubLObject reference) {
        return cr_parse_tree_number_attribute(reference);
    }

    public static SubLObject cr_parse_tree_number_attribute(final SubLObject tree) {
        final SubLObject parse_tree_number = methods.funcall_instance_method_with_0_args(tree, GET_NUMBER);
        return parse_tree_number_to_nl_number_attribute(parse_tree_number);
    }

    public static SubLObject parse_tree_number_to_nl_number_attribute(final SubLObject parse_tree_number) {
        if (NIL == list_utilities.singletonP(parse_tree_number)) {
            return $$UnmarkedNumber_NLAttr;
        }
        final SubLObject pcase_var;
        final SubLObject number_keyword = pcase_var = parse_tree_number.first();
        if (pcase_var.eql($SINGULAR)) {
            return $$Singular_NLAttr;
        }
        if (pcase_var.eql($PLURAL)) {
            return $$Plural_NLAttr;
        }
        Errors.warn($str163$Don_t_know_about_the_number__S, number_keyword);
        return $$UnmarkedNumber_NLAttr;
    }

    public static SubLObject reference_gender(final SubLObject reference, final SubLObject coref_discourse) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_psp_gender(reference, coref_discourse) : reference_cyclifier_gender(reference);
    }

    public static SubLObject reference_psp_gender(final SubLObject reference, final SubLObject coref_discourse) {
        return parsing_utilities.nl_gender_attr_for_cycl(reference_cycl(reference, coref_discourse));
    }

    public static SubLObject reference_cyclifier_gender(final SubLObject reference) {
        return cr_parse_tree_gender_attribute(reference);
    }

    public static SubLObject cr_parse_tree_gender_attribute(final SubLObject tree) {
        final SubLObject parse_tree_gender = methods.funcall_instance_method_with_0_args(tree, GET_GENDER);
        return parse_tree_gender_to_nl_gender_attribute(parse_tree_gender);
    }

    public static SubLObject parse_tree_gender_to_nl_gender_attribute(final SubLObject parse_tree_gender) {
        if (NIL == list_utilities.singletonP(parse_tree_gender)) {
            return $$Ungendered_NLAttr;
        }
        final SubLObject pcase_var;
        final SubLObject gender_keyword = pcase_var = parse_tree_gender.first();
        if (pcase_var.eql($MASCULINE)) {
            return $$Masculine_NLAttr;
        }
        if (pcase_var.eql($FEMININE)) {
            return $$Feminine_NLAttr;
        }
        if (pcase_var.eql($NEUTER)) {
            return $$Neuter_NLAttr;
        }
        Errors.warn($str168$Don_t_know_about_the_gender__S, gender_keyword);
        return $$Ungendered_NLAttr;
    }

    public static SubLObject reference_referent(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject reference_info = reference_note(reference, coref_discourse);
        final SubLObject referent = reference_info_referent(reference_info);
        if (NIL != referent) {
            return referent;
        }
        final SubLObject best_antecedent = reference_info_best_antecedent(reference_info);
        if (NIL != best_antecedent) {
            return reference_referent(best_antecedent, coref_discourse);
        }
        return NIL;
    }

    public static SubLObject new_reference_info(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject cycls = (NIL != crd_use_pspP(coref_discourse)) ? cr_get_cycls_for_reference(reference) : NIL;
        return make_reference_info(list(new SubLObject[]{ $TREE, reference, $CYCLS, cycls, $kw80$POSSIBLE_ANTECEDENT_, $DONT_KNOW_YET, $kw79$POSSIBLE_ANAPHOR_, $DONT_KNOW_YET, $POSSIBLE_ANTECEDENTS, $DONT_KNOW_YET, $LIKELY_ANTECEDENTS, $DONT_KNOW_YET, $BEST_ANTECEDENT, $DONT_KNOW_YET, $REFERENT, $DONT_KNOW_YET }));
    }

    public static SubLObject referent_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_referent_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject referent_struct_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$referent_struct_native.class ? T : NIL;
    }

    public static SubLObject referent_struct_references(final SubLObject v_object) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject referent_struct_equals(final SubLObject v_object) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject referent_struct_types(final SubLObject v_object) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject referent_struct_facts(final SubLObject v_object) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject referent_struct_gender(final SubLObject v_object) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject referent_struct_number(final SubLObject v_object) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_referent_struct_references(final SubLObject v_object, final SubLObject value) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_referent_struct_equals(final SubLObject v_object, final SubLObject value) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_referent_struct_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_referent_struct_facts(final SubLObject v_object, final SubLObject value) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_referent_struct_gender(final SubLObject v_object, final SubLObject value) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_referent_struct_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != referent_struct_p(v_object) : "coreference_resolution.referent_struct_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_referent_struct(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $referent_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($REFERENCES)) {
                _csetf_referent_struct_references(v_new, current_value);
            } else
                if (pcase_var.eql($EQUALS)) {
                    _csetf_referent_struct_equals(v_new, current_value);
                } else
                    if (pcase_var.eql($TYPES)) {
                        _csetf_referent_struct_types(v_new, current_value);
                    } else
                        if (pcase_var.eql($FACTS)) {
                            _csetf_referent_struct_facts(v_new, current_value);
                        } else
                            if (pcase_var.eql($GENDER)) {
                                _csetf_referent_struct_gender(v_new, current_value);
                            } else
                                if (pcase_var.eql($NUMBER)) {
                                    _csetf_referent_struct_number(v_new, current_value);
                                } else {
                                    Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_referent_struct(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REFERENT_STRUCT, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $REFERENCES, referent_struct_references(obj));
        funcall(visitor_fn, obj, $SLOT, $EQUALS, referent_struct_equals(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPES, referent_struct_types(obj));
        funcall(visitor_fn, obj, $SLOT, $FACTS, referent_struct_facts(obj));
        funcall(visitor_fn, obj, $SLOT, $GENDER, referent_struct_gender(obj));
        funcall(visitor_fn, obj, $SLOT, $NUMBER, referent_struct_number(obj));
        funcall(visitor_fn, obj, $END, MAKE_REFERENT_STRUCT, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_referent_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_referent_struct(obj, visitor_fn);
    }

    public static SubLObject print_referent_struct(final SubLObject referent_struct, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(referent_struct, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, referent_struct, T, T);
            if (NIL != referent_struct_equals(referent_struct)) {
                format(stream, $str197$Equals___S__, referent_struct_equals(referent_struct));
            }
            format(stream, $str198$Types___S__, referent_struct_types(referent_struct));
            if (NIL != referent_struct_facts(referent_struct)) {
                format(stream, $str199$Facts___S__, referent_struct_facts(referent_struct));
            }
            format(stream, $str200$Gender___S__, referent_struct_gender(referent_struct));
            format(stream, $str201$Number___S__, referent_struct_number(referent_struct));
            format(stream, $str202$References___);
            SubLObject cdolist_list_var = referent_struct_references(referent_struct);
            SubLObject reference = NIL;
            reference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str203$_S_, methods.funcall_instance_method_with_0_args(reference, GET_STRING));
                cdolist_list_var = cdolist_list_var.rest();
                reference = cdolist_list_var.first();
            } 
            format(stream, $str204$_);
            print_macros.print_unreadable_object_postamble(stream, referent_struct, NIL, NIL);
        }
        return NIL;
    }

    public static SubLObject new_referent_struct_for_first_mention(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject referent = make_referent_struct(list($GENDER, $$Ungendered_NLAttr, $NUMBER, $$UnmarkedNumber_NLAttr));
        add_reference_to_referent(coref_discourse, reference, referent);
        return referent;
    }

    public static SubLObject add_reference_to_referent(final SubLObject coref_discourse, final SubLObject reference, final SubLObject referent) {
        _csetf_referent_struct_references(referent, cons(reference, referent_struct_references(referent)));
        final SubLObject gender = reference_gender(reference, coref_discourse);
        final SubLObject number = reference_number(reference, coref_discourse);
        final SubLObject semantics = reference_semantics(reference, coref_discourse);
        _csetf_referent_struct_gender(referent, cr_stronger_gender(gender, referent_struct_gender(referent)));
        _csetf_referent_struct_number(referent, cr_stronger_number(number, referent_struct_number(referent)));
        add_semantics_to_referent(coref_discourse, semantics, referent);
        return NIL;
    }

    public static SubLObject add_semantics_to_referent(final SubLObject coref_discourse, final SubLObject semantics, final SubLObject referent) {
        return NIL != crd_use_pspP(coref_discourse) ? add_psp_semantics_to_referent(semantics, referent) : add_cyclifier_semantics_to_referent(semantics, referent);
    }

    public static SubLObject add_psp_semantics_to_referent(final SubLObject semantics, final SubLObject referent) {
        if (NIL != semantics) {
            if (NIL != kb_accessors.kb_individual_p(semantics)) {
                _csetf_referent_struct_equals(referent, semantics);
            } else
                if (NIL == member(semantics, referent_struct_types(referent), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    _csetf_referent_struct_types(referent, cons(semantics, referent_struct_types(referent)));
                }

        }
        return NIL;
    }

    public static SubLObject add_cyclifier_semantics_to_referent(final SubLObject semantics, final SubLObject referent) {
        _csetf_referent_struct_facts(referent, append(referent_struct_facts(referent), semantics));
        return NIL;
    }

    public static SubLObject cr_split_conjunctions(final SubLObject sentence) {
        SubLObject subsentences = list(sentence);
        SubLObject any_conjunctionP = T;
        while (NIL != any_conjunctionP) {
            any_conjunctionP = NIL;
            SubLObject new_subsentences = NIL;
            SubLObject cdolist_list_var = subsentences;
            SubLObject subsentence = NIL;
            subsentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_conjunction_p(subsentence)) {
                    any_conjunctionP = T;
                    new_subsentences = append(reverse(cycl_utilities.formula_args(subsentence, UNPROVIDED)), new_subsentences);
                } else {
                    new_subsentences = cons(subsentence, new_subsentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subsentence = cdolist_list_var.first();
            } 
            subsentences = nreverse(new_subsentences);
        } 
        return subsentences;
    }

    public static SubLObject cr_stronger_gender(final SubLObject gender1, final SubLObject gender2) {
        if (gender1.eql($$Ungendered_NLAttr)) {
            return gender2;
        }
        if (gender2.eql($$Ungendered_NLAttr)) {
            return gender1;
        }
        return gender1;
    }

    public static SubLObject cr_stronger_number(final SubLObject number1, final SubLObject number2) {
        if (number1.eql($$UnmarkedNumber_NLAttr)) {
            return number2;
        }
        if (number2.eql($$UnmarkedNumber_NLAttr)) {
            return number1;
        }
        if (number1.eql($$Generic_NLAttr)) {
            return number2;
        }
        if (number2.eql($$Generic_NLAttr)) {
            return number1;
        }
        return number1;
    }

    public static SubLObject reference_possible_anaphorP_calculate_code(final SubLObject coref_discourse, final SubLObject reference) {
        if (NIL == reference_definite_expressionP_code(coref_discourse, reference)) {
            return $NON_ANAPHOR;
        }
        if (NIL != reference_is_first_or_second_person_pronounP(coref_discourse, reference)) {
            return $ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE;
        }
        if ((NIL != parse_tree.np_tree_p(reference)) && (((NIL != np_reference_has_possessive_determinerP(reference)) || (NIL != np_reference_has_of_prepositional_phraseP(reference))) || (NIL != np_reference_has_restrictive_clauseP(reference)))) {
            return $LIKELY_ACCOMODATABLE_ANAPHOR;
        }
        return $STANDARD_ANAPHOR;
    }

    public static SubLObject np_reference_has_restrictive_clauseP(final SubLObject reference) {
        return list_utilities.sublisp_boolean(find_if(symbol_function(RESTRICTIVE_CLAUSE_TREE_P), parse_tree.get_phrase_tree_daughters(reference), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject restrictive_clause_tree_p(final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.sbar_tree_p(tree)) && $$$that.equalp(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING)));
    }

    public static SubLObject np_reference_has_of_prepositional_phraseP(final SubLObject reference) {
        return list_utilities.sublisp_boolean(find_if(symbol_function(OF_PP_TREE_P), parse_tree.get_phrase_tree_daughters(reference), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject of_pp_tree_p(final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.pp_tree_p(tree)) && $$$of.equalp(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_HEAD_DAUGHTER), GET_STRING)));
    }

    public static SubLObject np_reference_has_possessive_determinerP(final SubLObject reference) {
        assert NIL != parse_tree.np_tree_p(reference) : "parse_tree.np_tree_p(reference) " + "CommonSymbols.NIL != parse_tree.np_tree_p(reference) " + reference;
        final SubLObject head_phrase = phrasal_reference_head_phrase(reference);
        final SubLObject left_daughter = methods.funcall_instance_method_with_1_args(head_phrase, GET_DAUGHTER, ZERO_INTEGER);
        return cr_possessive_determiner_p(left_daughter);
    }

    public static SubLObject cr_possessive_determiner_p(final SubLObject tree) {
        return makeBoolean(($PRP_ == methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY)) || ((NIL != parse_tree.phrase_tree_p(tree)) && (NIL != methods.funcall_instance_method_with_0_args(tree, POSSESSIVE_P))));
    }

    public static SubLObject cr_demonstrative_determiner_p(final SubLObject tree) {
        return makeBoolean(($DT == methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY)) && (NIL != find_if(symbol_function(KB_DEMONSTRATIVE_NL_ATTR_P), cr_ps_get_cycls_for_phrase_with_timeout(methods.funcall_instance_method_with_0_args(tree, GET_STRING), $$Determiner, SEVEN_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject kb_demonstrative_nl_attr_p(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, $$Demonstrative_NLAttrType);
    }

    public static SubLObject reference_gendered_pronounP_code(final SubLObject coref_discourse, final SubLObject reference) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_gendered_pronounP_psp(reference, coref_discourse) : reference_gendered_pronounP_cyclifier(reference);
    }

    public static SubLObject reference_gendered_pronounP_psp(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject cycl = reference_cycl(reference, coref_discourse);
        if ((NIL != cycl) && (NIL != parsing_utilities.cycl_pronoun_p(cycl))) {
            final SubLObject gender = parsing_utilities.nl_gender_attr_for_cycl(cycl);
            return makeBoolean(gender.eql($$Masculine_NLAttr) || gender.eql($$Feminine_NLAttr));
        }
        return NIL;
    }

    public static SubLObject reference_gendered_pronounP_cyclifier(final SubLObject reference) {
        if (NIL != reference_is_pronounP_cyclifier(reference)) {
            final SubLObject gender = reference_cyclifier_gender(reference);
            return makeBoolean(gender.eql($$Masculine_NLAttr) || gender.eql($$Feminine_NLAttr));
        }
        return NIL;
    }

    public static SubLObject reference_definite_expressionP_code(final SubLObject coref_discourse, final SubLObject reference) {
        return makeBoolean((NIL != reference_is_pronounP(coref_discourse, reference)) || (NIL != reference_is_definite_descriptionP(coref_discourse, reference)));
    }

    public static SubLObject reference_is_definite_descriptionP(final SubLObject coref_discourse, final SubLObject reference) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_is_definite_descriptionP_psp(coref_discourse, reference) : reference_is_definite_descriptionP_cyclifier(reference);
    }

    public static SubLObject reference_is_definite_descriptionP_psp(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject cycl = reference_cycl(reference, coref_discourse);
        final SubLObject definiteness = (NIL != cycl) ? parsing_utilities.nl_definiteness_attr_for_cycl(cycl) : NIL;
        return eq(definiteness, $$Definite_NLAttr);
    }

    public static SubLObject reference_is_definite_descriptionP_cyclifier(final SubLObject reference) {
        return makeBoolean((NIL != methods.funcall_instance_method_with_0_args(reference, DEFINITE_DESCRIPTION_P)) && (NIL == cyclifier_interface.name_word_p(methods.funcall_instance_method_with_0_args(reference, GET_HEAD))));
    }

    public static SubLObject reference_is_pronounP(final SubLObject coref_discourse, final SubLObject reference) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_is_pronounP_psp(coref_discourse, reference) : reference_is_pronounP_cyclifier(reference);
    }

    public static SubLObject reference_is_pronounP_psp(final SubLObject coref_discourse, final SubLObject reference) {
        return parsing_utilities.cycl_pronoun_p(reference_cycl(reference, coref_discourse));
    }

    public static SubLObject reference_is_pronounP_cyclifier(final SubLObject reference) {
        return parse_tree.pronoun_tree_p(methods.funcall_instance_method_with_0_args(reference, GET_HEAD));
    }

    public static SubLObject reference_is_first_or_second_person_pronounP(final SubLObject coref_discourse, final SubLObject reference) {
        return NIL != crd_use_pspP(coref_discourse) ? reference_is_first_or_second_person_pronounP_psp(coref_discourse, reference) : reference_is_first_or_second_person_pronounP_cyclifier(reference);
    }

    public static SubLObject reference_is_first_or_second_person_pronounP_psp(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject cycl = reference_cycl(reference, coref_discourse);
        if (NIL != parsing_utilities.cycl_pronoun_p(cycl)) {
            final SubLObject person = parsing_utilities.nl_person_attr_for_cycl_pronoun(cycl);
            return makeBoolean(person.eql($$FirstPerson_NLAttr) || person.eql($$SecondPerson_NLAttr));
        }
        return NIL;
    }

    public static SubLObject reference_is_first_or_second_person_pronounP_cyclifier(final SubLObject reference) {
        if (NIL != reference_is_pronounP_cyclifier(reference)) {
            final SubLObject person = methods.funcall_instance_method_with_0_args(reference, GET_PERSON);
            return makeBoolean(person.eql(ONE_INTEGER) || person.eql(TWO_INTEGER));
        }
        return NIL;
    }

    public static SubLObject reference_possible_antecedentP_calculate_code(final SubLObject coref_discourse, final SubLObject reference) {
        return makeBoolean(NIL == reference_is_first_or_second_person_pronounP(coref_discourse, reference));
    }

    public static SubLObject reference_possible_antecedents_calculate_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates) {
        return filter_antecedent_candidates(coref_discourse, reference, candidates, symbol_function($sym227$REFERENCE_POSSIBLY_REFERS_TO__CODE));
    }

    public static SubLObject filter_antecedent_candidates(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates, final SubLObject referent_filter_function) {
        SubLObject result = NIL;
        SubLObject referents_seen = NIL;
        SubLObject max_possible_antecedents;
        SubLObject rest;
        SubLObject candidate;
        SubLObject candidate_referent;
        for (max_possible_antecedents = max_possible_antecedents_for_reference(coref_discourse, reference), rest = NIL, rest = candidates; (NIL == list_utilities.lengthGE(result, max_possible_antecedents, UNPROVIDED)) && (NIL != rest); rest = rest.rest()) {
            candidate = rest.first();
            candidate_referent = reference_referent(candidate, coref_discourse);
            if ((NIL != candidate_referent) && (NIL == subl_promotions.memberP(candidate_referent, referents_seen, symbol_function(EQ), UNPROVIDED))) {
                referents_seen = cons(candidate_referent, referents_seen);
                if (NIL != funcall(referent_filter_function, coref_discourse, reference, candidate_referent)) {
                    result = cons(candidate, result);
                }
            }
        }
        return nreverse(result);
    }

    public static SubLObject reference_possibly_refers_toP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        return makeBoolean((NIL != reference_syntactically_possible_referent_forP_code(coref_discourse, reference, candidate_referent)) && (NIL != reference_semantically_possible_referent_forP_code(coref_discourse, reference, candidate_referent)));
    }

    public static SubLObject reference_syntactically_possible_referent_forP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        if (NIL != reference_and_referent_disagree_in_numberP(coref_discourse, reference, candidate_referent)) {
            return NIL;
        }
        if (NIL != reference_and_referent_disagree_in_genderP(coref_discourse, reference, candidate_referent)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject reference_and_referent_disagree_in_numberP(final SubLObject coref_discourse, final SubLObject reference, final SubLObject referent) {
        final SubLObject reference_number = reference_number(reference, coref_discourse);
        final SubLObject referent_number = referent_struct_number(referent);
        return parsing_utilities.nl_number_attributes_disagreeP(reference_number, referent_number);
    }

    public static SubLObject reference_and_referent_disagree_in_genderP(final SubLObject coref_discourse, final SubLObject reference, final SubLObject referent) {
        final SubLObject reference_gender = reference_gender(reference, coref_discourse);
        final SubLObject referent_gender = referent_struct_gender(referent);
        return parsing_utilities.nl_gender_attributes_disagreeP(reference_gender, referent_gender);
    }

    public static SubLObject reference_semantically_possible_referent_forP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        final SubLObject reference_semantics = reference_semantics(reference, coref_discourse);
        if (NIL != crd_use_pspP(coref_discourse)) {
            final SubLObject referent_types = referent_struct_types(candidate_referent);
            final SubLObject referent_term = referent_struct_equals(candidate_referent);
            return makeBoolean((NIL != reference_semantics_compatible_with_referent_typesP(reference_semantics, referent_types)) && (NIL != reference_semantics_compatible_with_referent_termP(reference_semantics, referent_term)));
        }
        final SubLObject referent_facts = referent_struct_facts(candidate_referent);
        return reference_semantics_compatible_with_referent_factsP(reference_semantics, referent_facts);
    }

    public static SubLObject reference_semantics_compatible_with_referent_typesP(final SubLObject reference_semantics, final SubLObject referent_types) {
        if ((NIL == reference_semantics) || reference_semantics.equal(cr_non_person())) {
            return T;
        }
        if (reference_semantics == $UNKNOWN) {
            return makeBoolean((NIL != list_utilities.empty_list_p(referent_types)) || ((NIL != list_utilities.singletonP(referent_types)) && cr_non_person().equal(referent_types.first())));
        }
        if (NIL != subl_promotions.memberP($UNKNOWN, referent_types, symbol_function(EQ), UNPROVIDED)) {
            return NIL;
        }
        SubLObject incompatibleP;
        SubLObject rest;
        SubLObject type;
        for (incompatibleP = NIL, rest = NIL, rest = referent_types; (NIL == incompatibleP) && (NIL != rest); rest = rest.rest()) {
            type = rest.first();
            if (NIL == reference_semantics_compatible_with_referent_typeP(reference_semantics, type)) {
                incompatibleP = T;
            }
        }
        return makeBoolean(NIL == incompatibleP);
    }

    public static SubLObject reference_semantics_compatible_with_referent_typeP(final SubLObject reference_semantics, final SubLObject referent_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject incompatibleP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            incompatibleP = (NIL != fort_types_interface.isa_collectionP(reference_semantics, UNPROVIDED)) ? makeBoolean(((NIL != cr_few_if_anyP(referent_type, reference_semantics)) || (NIL != cr_disjoint_withP(referent_type, reference_semantics))) && (NIL != isa.not_isaP(referent_type, reference_semantics, UNPROVIDED, UNPROVIDED))) : cr_not_isaP(reference_semantics, referent_type);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == incompatibleP);
    }

    public static SubLObject reference_semantics_compatible_with_referent_termP(final SubLObject reference_semantics, final SubLObject referent_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == referent_term) {
            return T;
        }
        if (reference_semantics == $UNKNOWN) {
            return NIL;
        }
        if (NIL == reference_semantics) {
            return T;
        }
        SubLObject incompatibleP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            incompatibleP = (NIL != fort_types_interface.isa_collectionP(reference_semantics, UNPROVIDED)) ? cr_not_isaP(referent_term, reference_semantics) : disjoint_with.instances_of_disjoint_collectionsP(reference_semantics, referent_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == incompatibleP);
    }

    public static SubLObject cr_not_isaP(final SubLObject v_term, final SubLObject collection) {
        if (collection.equal(cr_non_person())) {
            return isa.isaP(v_term, $$Person, UNPROVIDED, UNPROVIDED);
        }
        return isa.not_isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cr_few_if_anyP(final SubLObject c1, final SubLObject c2) {
        if (c1.equal(cr_non_person())) {
            return genls.genlP(c2, $$Person, UNPROVIDED, UNPROVIDED);
        }
        if (c2.equal(cr_non_person())) {
            return genls.genlP(c1, $$Person, UNPROVIDED, UNPROVIDED);
        }
        return few_if_anyP(c1, c2);
    }

    public static SubLObject few_if_anyP(final SubLObject c1, final SubLObject c2) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(make_binary_formula($$fewIfAny, c1, c2), $$InferencePSC, list($MAX_TIME, FOUR_INTEGER)));
    }

    public static SubLObject cr_disjoint_withP(final SubLObject c1, final SubLObject c2) {
        if (c1.equal(cr_non_person())) {
            return genls.genlP(c2, $$Person, UNPROVIDED, UNPROVIDED);
        }
        if (c2.equal(cr_non_person())) {
            return genls.genlP(c1, $$Person, UNPROVIDED, UNPROVIDED);
        }
        return disjoint_with.disjoint_withP(c1, c2, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject reference_semantics_compatible_with_referent_factsP(final SubLObject reference_semantics, final SubLObject referent_facts) {
        if ((NIL == reference_semantics) || (NIL == referent_facts)) {
            return T;
        }
        return makeBoolean(NIL == inference_kernel.new_cyc_query(make_unary_formula($$not, make_binary_formula($$thereExists, $sym151$_REFERENT, make_el_formula($$and, append(reference_semantics, referent_facts), UNPROVIDED))), $const236$CurrentWorldDataCollectorMt_NonHo, UNPROVIDED));
    }

    public static SubLObject reference_likely_antecedents_calculate_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates) {
        return filter_antecedent_candidates(coref_discourse, reference, candidates, symbol_function($sym237$REFERENCE_LIKELY_REFERS_TO__CODE));
    }

    public static SubLObject reference_likely_refers_toP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        return reference_semantically_likely_referent_forP_code(coref_discourse, reference, candidate_referent);
    }

    public static SubLObject reference_semantically_likely_referent_forP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        if (NIL == crd_use_pspP(coref_discourse)) {
            return NIL;
        }
        final SubLObject reference_semantics = reference_semantics(reference, coref_discourse);
        if (NIL != isa.isa_in_any_mtP(reference_semantics, $$Collection)) {
            final SubLObject referent_types = referent_struct_types(candidate_referent);
            final SubLObject referent_term = referent_struct_equals(candidate_referent);
            return makeBoolean((NIL != reference_semantics_overlap_with_referent_typesP(reference_semantics, referent_types)) || (NIL != reference_semantics_overlap_with_referent_termP(reference_semantics, referent_term)));
        }
        return NIL;
    }

    public static SubLObject reference_semantics_overlap_with_referent_typesP(final SubLObject reference_semantics, final SubLObject referent_types) {
        SubLObject cdolist_list_var = referent_types;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != reference_semantics_overlap_with_referent_typeP(reference_semantics, type)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reference_semantics_overlap_with_referent_typeP(final SubLObject reference_semantics, final SubLObject referent_type) {
        return makeBoolean((NIL != isa.isa_in_any_mtP(referent_type, $$Collection)) && ((NIL != cr_genl_in_any_mtP(referent_type, reference_semantics)) || (NIL != cr_isa_in_any_mtP(referent_type, reference_semantics))));
    }

    public static SubLObject reference_semantics_overlap_with_referent_termP(final SubLObject reference_semantics, final SubLObject referent_term) {
        return makeBoolean((NIL != kb_accessors.kb_individual_p(referent_term)) && (NIL != isa.isa_in_any_mtP(referent_term, reference_semantics)));
    }

    public static SubLObject reference_best_antecedent_calculate_code(final SubLObject reference, final SubLObject likely_antecedents, final SubLObject possible_antecedents) {
        return (NIL != likely_antecedents ? likely_antecedents : possible_antecedents).first();
    }

    public static SubLObject reference_functional_dependency_calculate_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates) {
        final SubLObject reference_semantics = reference_semantics(reference, coref_discourse);
        SubLObject dependency = NIL;
        if (NIL != cycl_grammar.cycl_denotational_term_p(reference_semantics)) {
            SubLObject referents_seen = NIL;
            SubLObject rest;
            SubLObject candidate;
            SubLObject candidate_referent;
            SubLObject relation;
            for (rest = NIL, rest = candidates; (NIL == dependency) && (NIL != rest); rest = rest.rest()) {
                candidate = rest.first();
                candidate_referent = reference_referent(candidate, coref_discourse);
                if ((NIL != candidate_referent) && (NIL == subl_promotions.memberP(candidate_referent, referents_seen, symbol_function(EQ), UNPROVIDED))) {
                    referents_seen = cons(candidate_referent, referents_seen);
                    relation = reference_find_functional_dependency_with(reference_semantics, candidate_referent);
                    if (NIL != relation) {
                        dependency = list(relation, candidate);
                    }
                }
            }
        }
        return dependency;
    }

    public static SubLObject reference_find_functional_dependency_with(final SubLObject anaphor_semantics, final SubLObject preceding_referent) {
        final SubLObject referent_types = referent_struct_types(preceding_referent);
        final SubLObject referent_term = referent_struct_equals(preceding_referent);
        SubLObject relation;
        SubLObject rest;
        SubLObject type;
        SubLObject relations;
        for (relation = NIL, rest = NIL, rest = referent_types; (NIL == relation) && (NIL != rest); rest = rest.rest()) {
            type = rest.first();
            if (type != $UNKNOWN) {
                relations = ask_utilities.query_variable($sym239$_PRED, make_binary_formula($$or, make_ternary_formula($$relationAllExists, $sym239$_PRED, type, anaphor_semantics), make_ternary_formula($$relationExistsAll, $sym239$_PRED, anaphor_semantics, type)), $const236$CurrentWorldDataCollectorMt_NonHo, $list243);
                if (NIL != relations) {
                    relation = relations.first();
                }
            }
        }
        return relation;
    }

    public static SubLObject reference_info_possible_anaphorP_get(final SubLObject reference_info) {
        return reference_info_possible_anaphorP(reference_info);
    }

    public static SubLObject reference_info_possible_antecedentP_get(final SubLObject reference_info) {
        return reference_info_possible_antecedentP(reference_info);
    }

    public static SubLObject reference_info_possible_antecedents_get(final SubLObject reference_info) {
        return reference_info_possible_antecedents(reference_info);
    }

    public static SubLObject reference_info_likely_antecedents_get(final SubLObject reference_info) {
        return reference_info_likely_antecedents(reference_info);
    }

    public static SubLObject reference_info_best_antecedent_get(final SubLObject reference_info) {
        return reference_info_best_antecedent(reference_info);
    }

    public static SubLObject reference_info_functional_dependency_get(final SubLObject reference_info) {
        return reference_info_functional_dependency(reference_info);
    }

    public static SubLObject reference_info_possible_anaphorP_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_possible_anaphorP(reference_info, value);
        return NIL;
    }

    public static SubLObject reference_info_possible_antecedentP_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_possible_antecedentP(reference_info, value);
        return NIL;
    }

    public static SubLObject reference_info_possible_antecedents_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_possible_antecedents(reference_info, value);
        return NIL;
    }

    public static SubLObject reference_info_likely_antecedents_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_likely_antecedents(reference_info, value);
        return NIL;
    }

    public static SubLObject reference_info_best_antecedent_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_best_antecedent(reference_info, value);
        return NIL;
    }

    public static SubLObject reference_info_functional_dependency_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_functional_dependency(reference_info, value);
        return NIL;
    }

    public static SubLObject reference_do_implementation_specific_processing_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject reason) {
        final SubLObject reference_info = reference_note(reference, coref_discourse);
        if (reason.eql($ANAPHOR_WITH_POSSIBLE_ANTECEDENTS)) {
            _csetf_reference_info_referent(reference_info, NIL);
            add_reference_to_referent(coref_discourse, reference, reference_referent(reference, coref_discourse));
        } else
            if (reason.eql($NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT)) {
                _csetf_reference_info_referent(reference_info, NIL);
            } else
                if (reason.eql($ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS) || reason.eql($NON_ANAPHOR_POSSIBLE_ANTECEDENT)) {
                    _csetf_reference_info_referent(reference_info, new_referent_struct_for_first_mention(coref_discourse, reference));
                }


        return NIL;
    }

    public static SubLObject cr_genl_in_any_mtP(final SubLObject spec, final SubLObject genl) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(make_binary_formula($$genls, spec, genl), $$InferencePSC, list($MAX_TIME, FOUR_INTEGER)));
    }

    public static SubLObject cr_isa_in_any_mtP(final SubLObject v_term, final SubLObject collection) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(make_binary_formula($$isa, v_term, collection), $$InferencePSC, list($MAX_TIME, FOUR_INTEGER)));
    }

    public static SubLObject cr_get_cycls_for_reference(final SubLObject reference) {
        if (NIL != parse_tree.np_tree_p(reference)) {
            return cr_get_cycls_for_np_reference(reference);
        }
        if ($PRP_ == methods.funcall_instance_method_with_0_args(reference, GET_CATEGORY)) {
            return cr_get_cycls_for_prpX_reference(reference);
        }
        Errors.warn($str246$Don_t_know_what_category_of_refer, reference);
        return NIL;
    }

    public static SubLObject cr_get_cycls_for_np_reference(final SubLObject reference) {
        SubLObject result;
        SubLObject partial_reference;
        SubLObject phrase;
        SubLObject category;
        for (result = NIL, partial_reference = NIL, partial_reference = reference; ((NIL == result) && (NIL == word_tree.word_tree_p(partial_reference))) && (NIL != partial_reference); result = cr_ps_get_cycls_for_phrase_with_timeout(phrase, category, $int$30, $$CycNounLearnerLexicalMt) , partial_reference = methods.funcall_instance_method_with_0_args(partial_reference, GET_HEAD_DAUGHTER)) {
            phrase = methods.funcall_instance_method_with_0_args(partial_reference, GET_STRING);
            category = cr_pos_category_for_phrase(partial_reference);
        }
        if (NIL != list_utilities.empty_list_p(result)) {
            phrase = methods.funcall_instance_method_with_0_args(reference, GET_STRING);
            final SubLObject possible_name_semantics = cr_possible_name_phrase_semantics(phrase);
            if (NIL != possible_name_semantics) {
                result = list(possible_name_semantics);
            }
        }
        if (NIL != list_utilities.empty_list_p(result)) {
            result = cr_get_cycls_for_parts_of_reference(reference);
        }
        return cr_filter_subl_from_cycls(result);
    }

    public static SubLObject cr_get_cycls_for_prpX_reference(final SubLObject reference) {
        final SubLObject phrase = methods.funcall_instance_method_with_0_args(reference, GET_STRING);
        final SubLObject category = $$Pronoun;
        return cr_ps_get_cycls_for_phrase_with_timeout(phrase, category, SEVEN_INTEGER, UNPROVIDED);
    }

    public static SubLObject cr_filter_subl_from_cycls(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject stripped_cycl = parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
            final SubLObject nl_tags = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (stripped_cycl.isInteger()) {
                if (NIL != cr_plausible_year_integerP(stripped_cycl)) {
                    result = cons(make_unary_formula($$YearFn, stripped_cycl), result);
                }
            } else
                if ((!stripped_cycl.isNumber()) && (!stripped_cycl.isString())) {
                    if (!stripped_cycl.isKeyword()) {
                        result = cons(cycl, result);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject cr_plausible_year_integerP(final SubLObject integer) {
        assert NIL != integerp(integer) : "Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) " + integer;
        return makeBoolean(integer.numG($int$100) && integer.numL($int$5000));
    }

    public static SubLObject cr_pos_category_for_phrase(final SubLObject reference) {
        final SubLObject pcase_var;
        final SubLObject penn_tag = pcase_var = reference_penn_tag(reference);
        if (pcase_var.eql($NP)) {
            return $$NounPhrase;
        }
        if (((((pcase_var.eql($VB) || pcase_var.eql($VBD)) || pcase_var.eql($VBG)) || pcase_var.eql($VBN)) || pcase_var.eql($VBP)) || pcase_var.eql($VBZ)) {
            return $$Verb;
        }
        if (((pcase_var.eql($NN) || pcase_var.eql($NNS)) || pcase_var.eql($NNP)) || pcase_var.eql($NNPS)) {
            return $$Noun;
        }
        if (pcase_var.eql($PRP) || pcase_var.eql($PRP_)) {
            return $$Pronoun;
        }
        if (pcase_var.eql($DT) || pcase_var.eql($PDT)) {
            return $$Determiner;
        }
        if (pcase_var.eql($EX)) {
            return $$There_Existential;
        }
        if (pcase_var.eql($QP)) {
            return $ANY;
        }
        Errors.warn($str274$Don_t_know_the_POS_category_for__, penn_tag);
        return $ANY;
    }

    public static SubLObject reference_penn_tag(final SubLObject reference) {
        return methods.funcall_instance_method_with_0_args(reference, GET_CATEGORY);
    }

    public static SubLObject strip_final_period(final SubLObject string) {
        if (string_utilities.last_char(string).eql(CHAR_period)) {
            return string_utilities.string_butlast(string);
        }
        return string;
    }

    public static SubLObject cr_courtesy_title_p(final SubLObject word) {
        return subl_promotions.memberP(strip_final_period(word), $cr_courtesy_titles$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject cr_possible_name_phrase_semantics(final SubLObject phrase) {
        final SubLObject first_word = string_utilities.first_word(phrase, UNPROVIDED);
        if ((!first_word.equal(phrase)) && (NIL != cr_courtesy_title_p(first_word))) {
            return listS($$InstanceNamedFn, phrase, $list277);
        }
        if (NIL != upper_case_p(string_utilities.first_char(phrase))) {
            final SubLObject gender = lexicon_utilities.first_name_gender(first_word);
            SubLObject coll = NIL;
            final SubLObject pcase_var = gender;
            if (pcase_var.eql(NIL)) {
                coll = NIL;
            } else
                if (pcase_var.eql($MASC)) {
                    coll = $$MaleHuman;
                } else
                    if (pcase_var.eql($FEM)) {
                        coll = $$FemaleHuman;
                    } else {
                        coll = $$Person;
                    }


            if (NIL != coll) {
                return list($$InstanceNamedFn, phrase, coll);
            }
        }
        return NIL;
    }

    public static SubLObject phrasal_reference_head_phrase(final SubLObject reference) {
        SubLObject head_phrase = reference;
        for (SubLObject head_daughter = methods.funcall_instance_method_with_0_args(head_phrase, GET_HEAD_DAUGHTER); NIL != parse_tree.phrase_tree_p(head_daughter); head_daughter = methods.funcall_instance_method_with_0_args(head_phrase, GET_HEAD_DAUGHTER)) {
            head_phrase = head_daughter;
        }
        return head_phrase;
    }

    public static SubLObject cr_get_cycls_for_parts_of_reference(final SubLObject reference) {
        if (NIL == parse_tree.np_tree_p(reference)) {
            return NIL;
        }
        final SubLObject head_phrase = phrasal_reference_head_phrase(reference);
        final SubLObject definiteness = cr_discern_definiteness_attribute_of_preterminal_np_phrase(head_phrase);
        final SubLObject number = cr_discern_number_attribute_of_preterminal_np_phrase(head_phrase);
        SubLObject head_cycls = cr_get_cycls_for_head_of_np_phrase(head_phrase);
        if (((NIL == definiteness) && (NIL == number)) && (NIL == head_cycls)) {
            return NIL;
        }
        SubLObject with_definiteness = NIL;
        SubLObject with_number = NIL;
        if (NIL == head_cycls) {
            head_cycls = list($$Thing);
        }
        if (NIL == definiteness) {
            with_definiteness = head_cycls;
        } else {
            SubLObject cdolist_list_var = head_cycls;
            SubLObject cycl = NIL;
            cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                with_definiteness = cons(make_binary_formula($$NLDefinitenessFn, definiteness, cycl), with_definiteness);
                cdolist_list_var = cdolist_list_var.rest();
                cycl = cdolist_list_var.first();
            } 
            with_definiteness = nreverse(with_definiteness);
        }
        if (NIL == number) {
            with_number = with_definiteness;
        } else {
            SubLObject cdolist_list_var = with_definiteness;
            SubLObject cycl = NIL;
            cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                with_number = cons(make_binary_formula($$NLNumberFn, number, cycl), with_number);
                cdolist_list_var = cdolist_list_var.rest();
                cycl = cdolist_list_var.first();
            } 
            with_number = nreverse(with_number);
        }
        return with_number;
    }

    public static SubLObject cr_discern_definiteness_attribute_of_preterminal_np_phrase(final SubLObject phrase) {
        final SubLObject left_leaf = methods.funcall_instance_method_with_1_args(phrase, GET_DAUGHTER, ZERO_INTEGER);
        if (NIL != word_tree.determiner_word_tree_p(left_leaf)) {
            final SubLObject leaf_string = methods.funcall_instance_method_with_0_args(left_leaf, GET_STRING);
            final SubLObject leaf_category = cr_pos_category_for_phrase(left_leaf);
            final SubLObject leaf_cycls = cr_ps_get_cycls_for_phrase_with_timeout(leaf_string, leaf_category, TEN_INTEGER, UNPROVIDED);
            return find_if(symbol_function(KB_NL_DEFINITENESS_ATTRIBUTE_P), leaf_cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cr_discern_number_attribute_of_preterminal_np_phrase(final SubLObject phrase) {
        final SubLObject head_word = methods.funcall_instance_method_with_0_args(phrase, GET_HEAD);
        final SubLObject pcase_var;
        final SubLObject head_penn_tag = pcase_var = (NIL != head_word) ? methods.funcall_instance_method_with_0_args(head_word, GET_CATEGORY) : NIL;
        if (pcase_var.eql($NN) || pcase_var.eql($NNP)) {
            return $$Singular_NLAttr;
        }
        if (pcase_var.eql($NNS) || pcase_var.eql($NNPS)) {
            return $$Plural_NLAttr;
        }
        return NIL;
    }

    public static SubLObject cr_get_cycls_for_head_of_np_phrase(final SubLObject phrase) {
        final SubLObject head_word = methods.funcall_instance_method_with_0_args(phrase, GET_HEAD);
        if (NIL != head_word) {
            final SubLObject head_category = cr_pos_category_for_phrase(head_word);
            final SubLObject head_string = methods.funcall_instance_method_with_0_args(head_word, GET_STRING);
            return cr_ps_get_cycls_for_phrase_with_timeout(head_string, head_category, FIFTEEN_INTEGER, $$CycNounLearnerLexicalMt);
        }
        return NIL;
    }

    public static SubLObject cr_ps_get_cycls_for_phrase_with_timeout(final SubLObject string, final SubLObject category, final SubLObject timeout, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject timed_outP_inner = NIL;
        SubLObject timed_outP_outer = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$12 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(add(timeout, TEN_INTEGER), tag);
                        final SubLObject _prev_bind_0_$13 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                        try {
                            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                result = psp_main.ps_get_cycls_for_phrase(string, category, $ANY, NIL, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            }
                            timed_outP_inner = parsing_macros.parsing_timeout_time_reachedP();
                        } finally {
                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$13, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP_outer = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        return values(result, timed_outP_inner, timed_outP_outer);
    }

    public static SubLObject resolve_coreferences_and_print_to_html_file(final SubLObject input, final SubLObject output_file, SubLObject coref_discourse) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        coref_discourse = resolve_coreferences(input, coref_discourse);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(output_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, output_file);
            }
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_print_coreferences(coref_discourse);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return coref_discourse;
    }

    public static SubLObject resolve_coreferences_and_print_to_file(final SubLObject input, final SubLObject output_file, SubLObject coref_discourse, SubLObject sentences_to_view) {
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        if (sentences_to_view == UNPROVIDED) {
            sentences_to_view = $ALL;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(output_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, output_file);
            }
            final SubLObject stream_$15 = stream;
            coref_discourse = resolve_coreferences_and_print(input, stream_$15, coref_discourse, sentences_to_view);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return coref_discourse;
    }

    public static SubLObject resolve_coreferences_and_print(SubLObject input, SubLObject stream, SubLObject coref_discourse, SubLObject sentences_to_view) {
        if (input == UNPROVIDED) {
            input = $str284$_cyc_top_data_nl_coreference_test;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (coref_discourse == UNPROVIDED) {
            coref_discourse = NIL;
        }
        if (sentences_to_view == UNPROVIDED) {
            sentences_to_view = $ALL;
        }
        coref_discourse = resolve_coreferences(input, coref_discourse);
        print_coreferences(coref_discourse, stream, sentences_to_view);
        return coref_discourse;
    }

    public static SubLObject html_print_coreferences_to_file(final SubLObject coref_discourse, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, filename);
            }
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_print_coreferences(coref_discourse);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }

    public static SubLObject print_coreferences(final SubLObject coref_discourse, SubLObject stream, SubLObject sentences_to_view) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (sentences_to_view == UNPROVIDED) {
            sentences_to_view = $ALL;
        }
        if (sentences_to_view == $ALL) {
            SubLObject cdolist_list_var = crd_sentences(coref_discourse);
            SubLObject string_or_parse_tree = NIL;
            string_or_parse_tree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                print_sentence_coreferences(coref_discourse, string_or_parse_tree, stream);
                cdolist_list_var = cdolist_list_var.rest();
                string_or_parse_tree = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = sentences_to_view;
            SubLObject sentence_number = NIL;
            sentence_number = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                print_sentence_number_coreferences(coref_discourse, sentence_number, stream);
                cdolist_list_var = cdolist_list_var.rest();
                sentence_number = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject print_sentence_number_coreferences(final SubLObject coref_discourse, final SubLObject sentence_number, final SubLObject stream) {
        return print_sentence_coreferences(coref_discourse, nth(sentence_number, crd_sentences(coref_discourse)), stream);
    }

    public static SubLObject print_sentence_coreferences(final SubLObject coref_discourse, final SubLObject sentence, final SubLObject stream) {
        format(stream, $str285$____Sentence____S__, crd_sentence_string(sentence));
        if (NIL != parse_tree.parse_tree_p(sentence)) {
            return print_tree_coreferences(coref_discourse, sentence, stream);
        }
        if (sentence.isString()) {
            return format(stream, $str286$____Not_parsed_);
        }
        return NIL;
    }

    public static SubLObject print_tree_coreferences(final SubLObject coref_discourse, final SubLObject tree, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = $DFL2R;
        final SubLObject possible_orders = list($DFL2R, $DFR2L);
        SubLObject sub = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
            Errors.error($str71$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(tree, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            if (NIL != coreference_resolution_referenceP(sub, coref_discourse)) {
                final SubLObject ref_info = reference_note(sub, coref_discourse);
                format(stream, $str287$____Reference___S____Cycls___S___, methods.funcall_instance_method_with_0_args(sub, GET_STRING), reference_info_cycls(ref_info));
                final SubLObject pcase_var = reference_info_possible_anaphorP(ref_info);
                if (pcase_var.eql($STANDARD_ANAPHOR)) {
                    final SubLObject best = reference_info_best_antecedent(ref_info);
                    final SubLObject likelies = reference_info_likely_antecedents(ref_info);
                    final SubLObject possibles = reference_info_possible_antecedents(ref_info);
                    if (NIL != list_utilities.non_empty_list_p(possibles)) {
                        format(stream, $str288$Best_antecedent__);
                        print_strings_of_reference_and_antecedents(coref_discourse, best, stream);
                        format(stream, $str289$__Likely_antecedents__);
                        if (NIL != list_utilities.empty_list_p(likelies)) {
                            format(stream, $str290$None___);
                        } else {
                            print_strings_of_reference_and_antecedents(coref_discourse, likelies.first(), stream);
                            SubLObject cdolist_list_var = likelies.rest();
                            SubLObject likely = NIL;
                            likely = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                format(stream, $$$____________________);
                                print_strings_of_reference_and_antecedents(coref_discourse, likely, stream);
                                cdolist_list_var = cdolist_list_var.rest();
                                likely = cdolist_list_var.first();
                            } 
                        }
                        format(stream, $str292$__Possible_antecedents__);
                        print_strings_of_reference_and_antecedents(coref_discourse, possibles.first(), stream);
                        SubLObject cdolist_list_var = possibles.rest();
                        SubLObject possible = NIL;
                        possible = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            format(stream, $$$______________________);
                            print_strings_of_reference_and_antecedents(coref_discourse, possible, stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            possible = cdolist_list_var.first();
                        } 
                    } else {
                        format(stream, $str294$Anaphor_with_no_possible_antecede, reference_info_functional_dependency(ref_info));
                    }
                } else
                    if (pcase_var.eql($NON_ANAPHOR)) {
                        format(stream, $str295$Not_an_anaphor___);
                    } else
                        if (pcase_var.eql($ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE)) {
                            format(stream, $str296$Anaphor_resolving_to_background_k);
                        } else
                            if (pcase_var.eql($LIKELY_ACCOMODATABLE_ANAPHOR)) {
                                format(stream, $str297$Likely_accomodatable_anaphor___);
                            } else {
                                format(stream, $str298$Got_unexpected_value_from_REFEREN, reference_info_possible_anaphorP(ref_info));
                            }



            }
            if (NIL != parse_tree.phrase_tree_p(sub)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = eq(order_var, $DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        } 
        return NIL;
    }

    public static SubLObject print_strings_of_reference_and_antecedents(final SubLObject coref_discourse, final SubLObject reference, final SubLObject stream) {
        format(stream, $str299$_);
        print_strings_of_reference_and_antecedents_int(coref_discourse, reference, stream);
        format(stream, $str300$____);
        return NIL;
    }

    public static SubLObject print_strings_of_reference_and_antecedents_int(final SubLObject coref_discourse, final SubLObject reference, final SubLObject stream) {
        format(stream, $str301$__S, methods.funcall_instance_method_with_0_args(reference, GET_STRING));
        final SubLObject best = reference_get(reference, $BEST_ANTECEDENT, coref_discourse);
        if (NIL != best) {
            print_strings_of_reference_and_antecedents_int(coref_discourse, best, stream);
        }
        return NIL;
    }

    public static SubLObject html_print_coreferences(final SubLObject coref_discourse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str302$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject sentences = crd_sentences(coref_discourse);
            SubLObject color = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                color = (color.eql(html_macros.$html_color_white$.getGlobalValue())) ? html_macros.$html_color_lighter_grey$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != color) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(color);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_print_sentence_coreferences(coref_discourse, sentence);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_print_sentence_coreferences(final SubLObject coref_discourse, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str304$Sentence___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), crd_sentence_string(sentence));
        if (NIL != parse_tree.parse_tree_p(sentence)) {
            final SubLObject switch_id = cconcatenate($cr_sentence_switch_id_base$.getGlobalValue(), string_utilities.to_string(object.get_object_instance_number(sentence)));
            dhtml_macros.dhtml_switch_visibility_links(switch_id, $$$Show, $$$Hide);
            dhtml_macros.dhtml_set_switched_visibility(switch_id, $VISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != switch_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(switch_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_print_tree_coreferences(coref_discourse, sentence);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } else {
            html_newline(TWO_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str309$Not_parsed_);
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_print_tree_coreferences(final SubLObject coref_discourse, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = $DFL2R;
        final SubLObject possible_orders = list($DFL2R, $DFR2L);
        SubLObject sub = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
            Errors.error($str71$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(tree, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            if (NIL != coreference_resolution_referenceP(sub, coref_discourse)) {
                final SubLObject ref_info = reference_note(sub, coref_discourse);
                final SubLObject switch_id_suffix = string_utilities.to_string(object.get_object_instance_number(sub));
                final SubLObject parses_switch_id = cconcatenate($cr_parses_switch_id_base$.getGlobalValue(), switch_id_suffix);
                html_newline(TWO_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str312$Reference___S, methods.funcall_instance_method_with_0_args(sub, GET_STRING));
                html_newline(UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str313$Parses_);
                dhtml_macros.dhtml_switch_visibility_links(parses_switch_id, $$$Show, $$$Hide);
                dhtml_macros.dhtml_set_switched_visibility(parses_switch_id, $INVISIBLE, $TEXT);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != parses_switch_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(parses_switch_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject parses = cdolist_list_var = (NIL != crd_use_pspP(coref_discourse)) ? reference_info_cycls(ref_info) : reference_cyclifier_semantics(sub);
                    SubLObject parse = NIL;
                    parse = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_form(parse, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        parse = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_newline(UNPROVIDED);
                final SubLObject pcase_var = reference_info_possible_anaphorP(ref_info);
                if (pcase_var.eql($STANDARD_ANAPHOR)) {
                    final SubLObject best = reference_info_best_antecedent(ref_info);
                    final SubLObject likelies = reference_info_likely_antecedents(ref_info);
                    final SubLObject possibles = reference_info_possible_antecedents(ref_info);
                    if (NIL != list_utilities.non_empty_list_p(possibles)) {
                        final SubLObject more_info_switch_id = cconcatenate($cr_more_info_switch_id_base$.getGlobalValue(), switch_id_suffix);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str288$Best_antecedent__);
                        html_print_strings_of_reference_and_antecedents(coref_discourse, best);
                        dhtml_macros.dhtml_switch_visibility_links(more_info_switch_id, $$$Show_more, $$$Hide);
                        dhtml_macros.dhtml_set_switched_visibility(more_info_switch_id, $INVISIBLE, $TEXT);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (NIL != more_info_switch_id) {
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(more_info_switch_id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str316$Likely_antecedents__);
                            if (NIL != list_utilities.empty_list_p(likelies)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str317$None_);
                                html_newline(UNPROVIDED);
                            } else {
                                html_print_strings_of_reference_and_antecedents(coref_discourse, likelies.first());
                                SubLObject cdolist_list_var2 = likelies.rest();
                                SubLObject likely = NIL;
                                likely = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$____________________);
                                    html_print_strings_of_reference_and_antecedents(coref_discourse, likely);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    likely = cdolist_list_var2.first();
                                } 
                            }
                            html_newline(UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str318$Possible_antecedents__);
                            html_print_strings_of_reference_and_antecedents(coref_discourse, possibles.first());
                            SubLObject cdolist_list_var2 = possibles.rest();
                            SubLObject possible = NIL;
                            possible = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $$$______________________);
                                html_print_strings_of_reference_and_antecedents(coref_discourse, possible);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                possible = cdolist_list_var2.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str319$Anaphor_with_no_possible_antecede);
                        html_newline(TWO_INTEGER);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str320$Functional_dependency__);
                        html_print_functional_dependency(reference_info_functional_dependency(ref_info));
                        html_newline(UNPROVIDED);
                    }
                } else
                    if (pcase_var.eql($NON_ANAPHOR)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str321$Not_an_anaphor_);
                        html_newline(UNPROVIDED);
                    } else
                        if (pcase_var.eql($ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str322$Anaphor_resolving_to_background_k);
                            html_newline(UNPROVIDED);
                        } else
                            if (pcase_var.eql($LIKELY_ACCOMODATABLE_ANAPHOR)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str323$Likely_accomodatable_anaphor_);
                                html_newline(UNPROVIDED);
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str324$Got_unexpected_value_from_REFEREN, reference_info_possible_anaphorP(ref_info));
                                html_newline(UNPROVIDED);
                            }



            }
            if (NIL != parse_tree.phrase_tree_p(sub)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = eq(order_var, $DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        } 
        return NIL;
    }

    public static SubLObject html_print_strings_of_reference_and_antecedents(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str299$_);
        html_print_strings_of_reference_and_antecedents_int(coref_discourse, reference);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str325$__);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_print_strings_of_reference_and_antecedents_int(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str301$__S, methods.funcall_instance_method_with_0_args(reference, GET_STRING));
        final SubLObject best = reference_get(reference, $BEST_ANTECEDENT, coref_discourse);
        if (NIL != best) {
            html_print_strings_of_reference_and_antecedents_int(coref_discourse, best);
        }
        return NIL;
    }

    public static SubLObject html_print_functional_dependency(final SubLObject func_dep) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.doubletonP(func_dep)) {
            SubLObject relation = NIL;
            SubLObject antecedent = NIL;
            destructuring_bind_must_consp(func_dep, func_dep, $list326);
            relation = func_dep.first();
            SubLObject current = func_dep.rest();
            destructuring_bind_must_consp(current, func_dep, $list326);
            antecedent = current.first();
            current = current.rest();
            if (NIL == current) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str327$Related_to__S_via_, methods.funcall_instance_method_with_0_args(antecedent, GET_STRING));
                cb_form(relation, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(func_dep, $list326);
            }
        } else
            if (NIL == func_dep) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str317$None_);
            } else {
                Errors.warn($str328$Don_t_recognize__S_as_a_functiona);
                format(html_macros.$html_stream$.getDynamicValue(thread), func_dep);
            }

        return NIL;
    }

    public static SubLObject declare_coreference_resolution_file() {
        declareFunction(me, "coreference_resolution_discourse_struct_print_function_trampoline", "COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "coreference_resolution_discourse_struct_p", "COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P", 1, 0, false);
        new coreference_resolution.$coreference_resolution_discourse_struct_p$UnaryFunction();
        declareFunction(me, "crd_implementation", "CRD-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "crd_parser", "CRD-PARSER", 1, 0, false);
        declareFunction(me, "crd_use_pspP", "CRD-USE-PSP?", 1, 0, false);
        declareFunction(me, "crd_max_sufficient_recentness", "CRD-MAX-SUFFICIENT-RECENTNESS", 1, 0, false);
        declareFunction(me, "crd_max_possible_antecedents", "CRD-MAX-POSSIBLE-ANTECEDENTS", 1, 0, false);
        declareFunction(me, "crd_max_sufficient_recentness_for_gendered_pronoun", "CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN", 1, 0, false);
        declareFunction(me, "crd_max_possible_antecedents_for_gendered_pronoun", "CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN", 1, 0, false);
        declareFunction(me, "crd_reference_note_hash", "CRD-REFERENCE-NOTE-HASH", 1, 0, false);
        declareFunction(me, "crd_recent_references", "CRD-RECENT-REFERENCES", 1, 0, false);
        declareFunction(me, "crd_sentences", "CRD-SENTENCES", 1, 0, false);
        declareFunction(me, "_csetf_crd_implementation", "_CSETF-CRD-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "_csetf_crd_parser", "_CSETF-CRD-PARSER", 2, 0, false);
        declareFunction(me, "_csetf_crd_use_pspP", "_CSETF-CRD-USE-PSP?", 2, 0, false);
        declareFunction(me, "_csetf_crd_max_sufficient_recentness", "_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS", 2, 0, false);
        declareFunction(me, "_csetf_crd_max_possible_antecedents", "_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS", 2, 0, false);
        declareFunction(me, "_csetf_crd_max_sufficient_recentness_for_gendered_pronoun", "_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN", 2, 0, false);
        declareFunction(me, "_csetf_crd_max_possible_antecedents_for_gendered_pronoun", "_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN", 2, 0, false);
        declareFunction(me, "_csetf_crd_reference_note_hash", "_CSETF-CRD-REFERENCE-NOTE-HASH", 2, 0, false);
        declareFunction(me, "_csetf_crd_recent_references", "_CSETF-CRD-RECENT-REFERENCES", 2, 0, false);
        declareFunction(me, "_csetf_crd_sentences", "_CSETF-CRD-SENTENCES", 2, 0, false);
        declareFunction(me, "make_coreference_resolution_discourse_struct", "MAKE-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT", 0, 1, false);
        declareFunction(me, "visit_defstruct_coreference_resolution_discourse_struct", "VISIT-DEFSTRUCT-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_coreference_resolution_discourse_struct_method", "VISIT-DEFSTRUCT-OBJECT-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-METHOD", 2, 0, false);
        declareFunction(me, "new_coref_discourse", "NEW-COREF-DISCOURSE", 0, 7, false);
        declareFunction(me, "coref_discourse_p", "COREF-DISCOURSE-P", 1, 0, false);
        declareFunction(me, "coreference_resolution_referenceP", "COREFERENCE-RESOLUTION-REFERENCE?", 2, 0, false);
        declareFunction(me, "reference_note_p", "REFERENCE-NOTE-P", 1, 0, false);
        declareFunction(me, "reference_note", "REFERENCE-NOTE", 2, 0, false);
        declareFunction(me, "set_reference_note", "SET-REFERENCE-NOTE", 3, 0, false);
        declareMacro(me, "resolve_coreferences_in_parse_tree", "RESOLVE-COREFERENCES-IN-PARSE-TREE");
        declareFunction(me, "resolve_coreferences", "RESOLVE-COREFERENCES", 1, 1, false);
        declareFunction(me, "resolve_coreferences_in_text_file", "RESOLVE-COREFERENCES-IN-TEXT-FILE", 1, 1, false);
        declareFunction(me, "resolve_coreferences_in_stream", "RESOLVE-COREFERENCES-IN-STREAM", 1, 1, false);
        declareFunction(me, "resolve_coreferences_in_string", "RESOLVE-COREFERENCES-IN-STRING", 1, 1, false);
        declareFunction(me, "resolve_coreferences_in_document", "RESOLVE-COREFERENCES-IN-DOCUMENT", 1, 1, false);
        declareFunction(me, "resolve_coreferences_in_list_of_parse_trees", "RESOLVE-COREFERENCES-IN-LIST-OF-PARSE-TREES", 1, 1, false);
        declareFunction(me, "coref_discourse_coreferring_expressions", "COREF-DISCOURSE-COREFERRING-EXPRESSIONS", 1, 0, false);
        declareFunction(me, "crd_parse", "CRD-PARSE", 2, 0, false);
        declareFunction(me, "crd_add_sentences", "CRD-ADD-SENTENCES", 2, 0, false);
        declareFunction(me, "crd_add_sentence", "CRD-ADD-SENTENCE", 2, 0, false);
        declareFunction(me, "crd_sentence_string", "CRD-SENTENCE-STRING", 1, 0, false);
        declareFunction(me, "note_latest_sentence_references", "NOTE-LATEST-SENTENCE-REFERENCES", 2, 0, false);
        declareFunction(me, "is_the_only_head_daughter_of_an_npP", "IS-THE-ONLY-HEAD-DAUGHTER-OF-AN-NP?", 1, 0, false);
        declareFunction(me, "resolve_reference", "RESOLVE-REFERENCE", 4, 0, false);
        declareFunction(me, "max_sufficient_recentness_for_reference", "MAX-SUFFICIENT-RECENTNESS-FOR-REFERENCE", 2, 0, false);
        declareFunction(me, "max_possible_antecedents_for_reference", "MAX-POSSIBLE-ANTECEDENTS-FOR-REFERENCE", 2, 0, false);
        declareFunction(me, "reference_gendered_pronounP", "REFERENCE-GENDERED-PRONOUN?", 2, 0, false);
        declareFunction(me, "reference_calculate_and_set", "REFERENCE-CALCULATE-AND-SET", 3, 1, false);
        declareFunction(me, "reference_possibly_calculate", "REFERENCE-POSSIBLY-CALCULATE", 3, 1, false);
        declareFunction(me, "reference_calculate", "REFERENCE-CALCULATE", 4, 0, false);
        declareFunction(me, "reference_possible_anaphorP_calculate", "REFERENCE-POSSIBLE-ANAPHOR?-CALCULATE", 2, 0, false);
        declareFunction(me, "reference_possible_antecedentP_calculate", "REFERENCE-POSSIBLE-ANTECEDENT?-CALCULATE", 2, 0, false);
        declareFunction(me, "reference_possible_antecedents_calculate", "REFERENCE-POSSIBLE-ANTECEDENTS-CALCULATE", 3, 0, false);
        declareFunction(me, "reference_likely_antecedents_calculate", "REFERENCE-LIKELY-ANTECEDENTS-CALCULATE", 3, 0, false);
        declareFunction(me, "reference_best_antecedent_calculate", "REFERENCE-BEST-ANTECEDENT-CALCULATE", 4, 0, false);
        declareFunction(me, "reference_functional_dependency_calculate", "REFERENCE-FUNCTIONAL-DEPENDENCY-CALCULATE", 3, 0, false);
        declareFunction(me, "reference_get", "REFERENCE-GET", 3, 0, false);
        declareFunction(me, "reference_note_possible_anaphorP_get", "REFERENCE-NOTE-POSSIBLE-ANAPHOR?-GET", 2, 0, false);
        declareFunction(me, "reference_note_possible_antecedentP_get", "REFERENCE-NOTE-POSSIBLE-ANTECEDENT?-GET", 2, 0, false);
        declareFunction(me, "reference_note_possible_antecedents_get", "REFERENCE-NOTE-POSSIBLE-ANTECEDENTS-GET", 2, 0, false);
        declareFunction(me, "reference_note_likely_antecedents_get", "REFERENCE-NOTE-LIKELY-ANTECEDENTS-GET", 2, 0, false);
        declareFunction(me, "reference_note_best_antecedent_get", "REFERENCE-NOTE-BEST-ANTECEDENT-GET", 2, 0, false);
        declareFunction(me, "reference_note_functional_dependency_get", "REFERENCE-NOTE-FUNCTIONAL-DEPENDENCY-GET", 2, 0, false);
        declareFunction(me, "reference_set", "REFERENCE-SET", 4, 0, false);
        declareFunction(me, "reference_note_possible_anaphorP_set", "REFERENCE-NOTE-POSSIBLE-ANAPHOR?-SET", 3, 0, false);
        declareFunction(me, "reference_note_possible_antecedentP_set", "REFERENCE-NOTE-POSSIBLE-ANTECEDENT?-SET", 3, 0, false);
        declareFunction(me, "reference_note_possible_antecedents_set", "REFERENCE-NOTE-POSSIBLE-ANTECEDENTS-SET", 3, 0, false);
        declareFunction(me, "reference_note_likely_antecedents_set", "REFERENCE-NOTE-LIKELY-ANTECEDENTS-SET", 3, 0, false);
        declareFunction(me, "reference_note_best_antecedent_set", "REFERENCE-NOTE-BEST-ANTECEDENT-SET", 3, 0, false);
        declareFunction(me, "reference_note_functional_dependency_set", "REFERENCE-NOTE-FUNCTIONAL-DEPENDENCY-SET", 3, 0, false);
        declareFunction(me, "new_reference_note", "NEW-REFERENCE-NOTE", 2, 0, false);
        declareFunction(me, "reference_do_implementation_specific_processing", "REFERENCE-DO-IMPLEMENTATION-SPECIFIC-PROCESSING", 3, 0, false);
        declareFunction(me, "reference_info_print_function_trampoline", "REFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "reference_info_p", "REFERENCE-INFO-P", 1, 0, false);
        new coreference_resolution.$reference_info_p$UnaryFunction();
        declareFunction(me, "reference_info_index_number", "REFERENCE-INFO-INDEX-NUMBER", 1, 0, false);
        declareFunction(me, "reference_info_tree", "REFERENCE-INFO-TREE", 1, 0, false);
        declareFunction(me, "reference_info_cycls", "REFERENCE-INFO-CYCLS", 1, 0, false);
        declareFunction(me, "reference_info_possible_antecedentP", "REFERENCE-INFO-POSSIBLE-ANTECEDENT?", 1, 0, false);
        declareFunction(me, "reference_info_possible_anaphorP", "REFERENCE-INFO-POSSIBLE-ANAPHOR?", 1, 0, false);
        declareFunction(me, "reference_info_possible_antecedents", "REFERENCE-INFO-POSSIBLE-ANTECEDENTS", 1, 0, false);
        declareFunction(me, "reference_info_likely_antecedents", "REFERENCE-INFO-LIKELY-ANTECEDENTS", 1, 0, false);
        declareFunction(me, "reference_info_best_antecedent", "REFERENCE-INFO-BEST-ANTECEDENT", 1, 0, false);
        declareFunction(me, "reference_info_functional_dependency", "REFERENCE-INFO-FUNCTIONAL-DEPENDENCY", 1, 0, false);
        declareFunction(me, "reference_info_referent", "REFERENCE-INFO-REFERENT", 1, 0, false);
        declareFunction(me, "_csetf_reference_info_index_number", "_CSETF-REFERENCE-INFO-INDEX-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_tree", "_CSETF-REFERENCE-INFO-TREE", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_cycls", "_CSETF-REFERENCE-INFO-CYCLS", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_possible_antecedentP", "_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENT?", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_possible_anaphorP", "_CSETF-REFERENCE-INFO-POSSIBLE-ANAPHOR?", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_possible_antecedents", "_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENTS", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_likely_antecedents", "_CSETF-REFERENCE-INFO-LIKELY-ANTECEDENTS", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_best_antecedent", "_CSETF-REFERENCE-INFO-BEST-ANTECEDENT", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_functional_dependency", "_CSETF-REFERENCE-INFO-FUNCTIONAL-DEPENDENCY", 2, 0, false);
        declareFunction(me, "_csetf_reference_info_referent", "_CSETF-REFERENCE-INFO-REFERENT", 2, 0, false);
        declareFunction(me, "make_reference_info", "MAKE-REFERENCE-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_reference_info", "VISIT-DEFSTRUCT-REFERENCE-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_reference_info_method", "VISIT-DEFSTRUCT-OBJECT-REFERENCE-INFO-METHOD", 2, 0, false);
        declareFunction(me, "print_reference_info", "PRINT-REFERENCE-INFO", 3, 0, false);
        declareFunction(me, "reference_info_string", "REFERENCE-INFO-STRING", 1, 0, false);
        declareFunction(me, "reference_info_cycl", "REFERENCE-INFO-CYCL", 1, 0, false);
        declareFunction(me, "reference_cycl", "REFERENCE-CYCL", 2, 0, false);
        declareFunction(me, "reference_cycl_stripped", "REFERENCE-CYCL-STRIPPED", 2, 0, false);
        declareFunction(me, "reference_semantics", "REFERENCE-SEMANTICS", 2, 0, false);
        declareFunction(me, "reference_psp_semantics", "REFERENCE-PSP-SEMANTICS", 2, 0, false);
        declareFunction(me, "reference_cyclifier_semantics", "REFERENCE-CYCLIFIER-SEMANTICS", 1, 0, false);
        declareFunction(me, "cr_existentially_unbind", "CR-EXISTENTIALLY-UNBIND", 1, 0, false);
        declareFunction(me, "guess_referent_stand_in_in_cyclifications", "GUESS-REFERENT-STAND-IN-IN-CYCLIFICATIONS", 2, 0, false);
        declareFunction(me, "possibly_cyclifier_referent_stand_in", "POSSIBLY-CYCLIFIER-REFERENT-STAND-IN", 1, 0, false);
        declareFunction(me, "instance_fn_nat_p", "INSTANCE-FN-NAT-P", 1, 0, false);
        declareFunction(me, "cr_non_person", "CR-NON-PERSON", 0, 0, false);
        declareFunction(me, "reference_number", "REFERENCE-NUMBER", 2, 0, false);
        declareFunction(me, "reference_psp_number", "REFERENCE-PSP-NUMBER", 2, 0, false);
        declareFunction(me, "reference_cyclifier_number", "REFERENCE-CYCLIFIER-NUMBER", 1, 0, false);
        declareFunction(me, "cr_parse_tree_number_attribute", "CR-PARSE-TREE-NUMBER-ATTRIBUTE", 1, 0, false);
        declareFunction(me, "parse_tree_number_to_nl_number_attribute", "PARSE-TREE-NUMBER-TO-NL-NUMBER-ATTRIBUTE", 1, 0, false);
        declareFunction(me, "reference_gender", "REFERENCE-GENDER", 2, 0, false);
        declareFunction(me, "reference_psp_gender", "REFERENCE-PSP-GENDER", 2, 0, false);
        declareFunction(me, "reference_cyclifier_gender", "REFERENCE-CYCLIFIER-GENDER", 1, 0, false);
        declareFunction(me, "cr_parse_tree_gender_attribute", "CR-PARSE-TREE-GENDER-ATTRIBUTE", 1, 0, false);
        declareFunction(me, "parse_tree_gender_to_nl_gender_attribute", "PARSE-TREE-GENDER-TO-NL-GENDER-ATTRIBUTE", 1, 0, false);
        declareFunction(me, "reference_referent", "REFERENCE-REFERENT", 2, 0, false);
        declareFunction(me, "new_reference_info", "NEW-REFERENCE-INFO", 2, 0, false);
        declareFunction(me, "referent_struct_print_function_trampoline", "REFERENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "referent_struct_p", "REFERENT-STRUCT-P", 1, 0, false);
        new coreference_resolution.$referent_struct_p$UnaryFunction();
        declareFunction(me, "referent_struct_references", "REFERENT-STRUCT-REFERENCES", 1, 0, false);
        declareFunction(me, "referent_struct_equals", "REFERENT-STRUCT-EQUALS", 1, 0, false);
        declareFunction(me, "referent_struct_types", "REFERENT-STRUCT-TYPES", 1, 0, false);
        declareFunction(me, "referent_struct_facts", "REFERENT-STRUCT-FACTS", 1, 0, false);
        declareFunction(me, "referent_struct_gender", "REFERENT-STRUCT-GENDER", 1, 0, false);
        declareFunction(me, "referent_struct_number", "REFERENT-STRUCT-NUMBER", 1, 0, false);
        declareFunction(me, "_csetf_referent_struct_references", "_CSETF-REFERENT-STRUCT-REFERENCES", 2, 0, false);
        declareFunction(me, "_csetf_referent_struct_equals", "_CSETF-REFERENT-STRUCT-EQUALS", 2, 0, false);
        declareFunction(me, "_csetf_referent_struct_types", "_CSETF-REFERENT-STRUCT-TYPES", 2, 0, false);
        declareFunction(me, "_csetf_referent_struct_facts", "_CSETF-REFERENT-STRUCT-FACTS", 2, 0, false);
        declareFunction(me, "_csetf_referent_struct_gender", "_CSETF-REFERENT-STRUCT-GENDER", 2, 0, false);
        declareFunction(me, "_csetf_referent_struct_number", "_CSETF-REFERENT-STRUCT-NUMBER", 2, 0, false);
        declareFunction(me, "make_referent_struct", "MAKE-REFERENT-STRUCT", 0, 1, false);
        declareFunction(me, "visit_defstruct_referent_struct", "VISIT-DEFSTRUCT-REFERENT-STRUCT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_referent_struct_method", "VISIT-DEFSTRUCT-OBJECT-REFERENT-STRUCT-METHOD", 2, 0, false);
        declareFunction(me, "print_referent_struct", "PRINT-REFERENT-STRUCT", 3, 0, false);
        declareFunction(me, "new_referent_struct_for_first_mention", "NEW-REFERENT-STRUCT-FOR-FIRST-MENTION", 2, 0, false);
        declareFunction(me, "add_reference_to_referent", "ADD-REFERENCE-TO-REFERENT", 3, 0, false);
        declareFunction(me, "add_semantics_to_referent", "ADD-SEMANTICS-TO-REFERENT", 3, 0, false);
        declareFunction(me, "add_psp_semantics_to_referent", "ADD-PSP-SEMANTICS-TO-REFERENT", 2, 0, false);
        declareFunction(me, "add_cyclifier_semantics_to_referent", "ADD-CYCLIFIER-SEMANTICS-TO-REFERENT", 2, 0, false);
        declareFunction(me, "cr_split_conjunctions", "CR-SPLIT-CONJUNCTIONS", 1, 0, false);
        declareFunction(me, "cr_stronger_gender", "CR-STRONGER-GENDER", 2, 0, false);
        declareFunction(me, "cr_stronger_number", "CR-STRONGER-NUMBER", 2, 0, false);
        declareFunction(me, "reference_possible_anaphorP_calculate_code", "REFERENCE-POSSIBLE-ANAPHOR?-CALCULATE-CODE", 2, 0, false);
        declareFunction(me, "np_reference_has_restrictive_clauseP", "NP-REFERENCE-HAS-RESTRICTIVE-CLAUSE?", 1, 0, false);
        declareFunction(me, "restrictive_clause_tree_p", "RESTRICTIVE-CLAUSE-TREE-P", 1, 0, false);
        declareFunction(me, "np_reference_has_of_prepositional_phraseP", "NP-REFERENCE-HAS-OF-PREPOSITIONAL-PHRASE?", 1, 0, false);
        declareFunction(me, "of_pp_tree_p", "OF-PP-TREE-P", 1, 0, false);
        declareFunction(me, "np_reference_has_possessive_determinerP", "NP-REFERENCE-HAS-POSSESSIVE-DETERMINER?", 1, 0, false);
        declareFunction(me, "cr_possessive_determiner_p", "CR-POSSESSIVE-DETERMINER-P", 1, 0, false);
        declareFunction(me, "cr_demonstrative_determiner_p", "CR-DEMONSTRATIVE-DETERMINER-P", 1, 0, false);
        declareFunction(me, "kb_demonstrative_nl_attr_p", "KB-DEMONSTRATIVE-NL-ATTR-P", 1, 0, false);
        declareFunction(me, "reference_gendered_pronounP_code", "REFERENCE-GENDERED-PRONOUN?-CODE", 2, 0, false);
        declareFunction(me, "reference_gendered_pronounP_psp", "REFERENCE-GENDERED-PRONOUN?-PSP", 2, 0, false);
        declareFunction(me, "reference_gendered_pronounP_cyclifier", "REFERENCE-GENDERED-PRONOUN?-CYCLIFIER", 1, 0, false);
        declareFunction(me, "reference_definite_expressionP_code", "REFERENCE-DEFINITE-EXPRESSION?-CODE", 2, 0, false);
        declareFunction(me, "reference_is_definite_descriptionP", "REFERENCE-IS-DEFINITE-DESCRIPTION?", 2, 0, false);
        declareFunction(me, "reference_is_definite_descriptionP_psp", "REFERENCE-IS-DEFINITE-DESCRIPTION?-PSP", 2, 0, false);
        declareFunction(me, "reference_is_definite_descriptionP_cyclifier", "REFERENCE-IS-DEFINITE-DESCRIPTION?-CYCLIFIER", 1, 0, false);
        declareFunction(me, "reference_is_pronounP", "REFERENCE-IS-PRONOUN?", 2, 0, false);
        declareFunction(me, "reference_is_pronounP_psp", "REFERENCE-IS-PRONOUN?-PSP", 2, 0, false);
        declareFunction(me, "reference_is_pronounP_cyclifier", "REFERENCE-IS-PRONOUN?-CYCLIFIER", 1, 0, false);
        declareFunction(me, "reference_is_first_or_second_person_pronounP", "REFERENCE-IS-FIRST-OR-SECOND-PERSON-PRONOUN?", 2, 0, false);
        declareFunction(me, "reference_is_first_or_second_person_pronounP_psp", "REFERENCE-IS-FIRST-OR-SECOND-PERSON-PRONOUN?-PSP", 2, 0, false);
        declareFunction(me, "reference_is_first_or_second_person_pronounP_cyclifier", "REFERENCE-IS-FIRST-OR-SECOND-PERSON-PRONOUN?-CYCLIFIER", 1, 0, false);
        declareFunction(me, "reference_possible_antecedentP_calculate_code", "REFERENCE-POSSIBLE-ANTECEDENT?-CALCULATE-CODE", 2, 0, false);
        declareFunction(me, "reference_possible_antecedents_calculate_code", "REFERENCE-POSSIBLE-ANTECEDENTS-CALCULATE-CODE", 3, 0, false);
        declareFunction(me, "filter_antecedent_candidates", "FILTER-ANTECEDENT-CANDIDATES", 4, 0, false);
        declareFunction(me, "reference_possibly_refers_toP_code", "REFERENCE-POSSIBLY-REFERS-TO?-CODE", 3, 0, false);
        declareFunction(me, "reference_syntactically_possible_referent_forP_code", "REFERENCE-SYNTACTICALLY-POSSIBLE-REFERENT-FOR?-CODE", 3, 0, false);
        declareFunction(me, "reference_and_referent_disagree_in_numberP", "REFERENCE-AND-REFERENT-DISAGREE-IN-NUMBER?", 3, 0, false);
        declareFunction(me, "reference_and_referent_disagree_in_genderP", "REFERENCE-AND-REFERENT-DISAGREE-IN-GENDER?", 3, 0, false);
        declareFunction(me, "reference_semantically_possible_referent_forP_code", "REFERENCE-SEMANTICALLY-POSSIBLE-REFERENT-FOR?-CODE", 3, 0, false);
        declareFunction(me, "reference_semantics_compatible_with_referent_typesP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-TYPES?", 2, 0, false);
        declareFunction(me, "reference_semantics_compatible_with_referent_typeP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-TYPE?", 2, 0, false);
        declareFunction(me, "reference_semantics_compatible_with_referent_termP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-TERM?", 2, 0, false);
        declareFunction(me, "cr_not_isaP", "CR-NOT-ISA?", 2, 0, false);
        declareFunction(me, "cr_few_if_anyP", "CR-FEW-IF-ANY?", 2, 0, false);
        declareFunction(me, "few_if_anyP", "FEW-IF-ANY?", 2, 0, false);
        declareFunction(me, "cr_disjoint_withP", "CR-DISJOINT-WITH?", 2, 0, false);
        declareFunction(me, "reference_semantics_compatible_with_referent_factsP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-FACTS?", 2, 0, false);
        declareFunction(me, "reference_likely_antecedents_calculate_code", "REFERENCE-LIKELY-ANTECEDENTS-CALCULATE-CODE", 3, 0, false);
        declareFunction(me, "reference_likely_refers_toP_code", "REFERENCE-LIKELY-REFERS-TO?-CODE", 3, 0, false);
        declareFunction(me, "reference_semantically_likely_referent_forP_code", "REFERENCE-SEMANTICALLY-LIKELY-REFERENT-FOR?-CODE", 3, 0, false);
        declareFunction(me, "reference_semantics_overlap_with_referent_typesP", "REFERENCE-SEMANTICS-OVERLAP-WITH-REFERENT-TYPES?", 2, 0, false);
        declareFunction(me, "reference_semantics_overlap_with_referent_typeP", "REFERENCE-SEMANTICS-OVERLAP-WITH-REFERENT-TYPE?", 2, 0, false);
        declareFunction(me, "reference_semantics_overlap_with_referent_termP", "REFERENCE-SEMANTICS-OVERLAP-WITH-REFERENT-TERM?", 2, 0, false);
        declareFunction(me, "reference_best_antecedent_calculate_code", "REFERENCE-BEST-ANTECEDENT-CALCULATE-CODE", 3, 0, false);
        declareFunction(me, "reference_functional_dependency_calculate_code", "REFERENCE-FUNCTIONAL-DEPENDENCY-CALCULATE-CODE", 3, 0, false);
        declareFunction(me, "reference_find_functional_dependency_with", "REFERENCE-FIND-FUNCTIONAL-DEPENDENCY-WITH", 2, 0, false);
        declareFunction(me, "reference_info_possible_anaphorP_get", "REFERENCE-INFO-POSSIBLE-ANAPHOR?-GET", 1, 0, false);
        declareFunction(me, "reference_info_possible_antecedentP_get", "REFERENCE-INFO-POSSIBLE-ANTECEDENT?-GET", 1, 0, false);
        declareFunction(me, "reference_info_possible_antecedents_get", "REFERENCE-INFO-POSSIBLE-ANTECEDENTS-GET", 1, 0, false);
        declareFunction(me, "reference_info_likely_antecedents_get", "REFERENCE-INFO-LIKELY-ANTECEDENTS-GET", 1, 0, false);
        declareFunction(me, "reference_info_best_antecedent_get", "REFERENCE-INFO-BEST-ANTECEDENT-GET", 1, 0, false);
        declareFunction(me, "reference_info_functional_dependency_get", "REFERENCE-INFO-FUNCTIONAL-DEPENDENCY-GET", 1, 0, false);
        declareFunction(me, "reference_info_possible_anaphorP_set", "REFERENCE-INFO-POSSIBLE-ANAPHOR?-SET", 2, 0, false);
        declareFunction(me, "reference_info_possible_antecedentP_set", "REFERENCE-INFO-POSSIBLE-ANTECEDENT?-SET", 2, 0, false);
        declareFunction(me, "reference_info_possible_antecedents_set", "REFERENCE-INFO-POSSIBLE-ANTECEDENTS-SET", 2, 0, false);
        declareFunction(me, "reference_info_likely_antecedents_set", "REFERENCE-INFO-LIKELY-ANTECEDENTS-SET", 2, 0, false);
        declareFunction(me, "reference_info_best_antecedent_set", "REFERENCE-INFO-BEST-ANTECEDENT-SET", 2, 0, false);
        declareFunction(me, "reference_info_functional_dependency_set", "REFERENCE-INFO-FUNCTIONAL-DEPENDENCY-SET", 2, 0, false);
        declareFunction(me, "reference_do_implementation_specific_processing_code", "REFERENCE-DO-IMPLEMENTATION-SPECIFIC-PROCESSING-CODE", 3, 0, false);
        declareFunction(me, "cr_genl_in_any_mtP", "CR-GENL-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "cr_isa_in_any_mtP", "CR-ISA-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "cr_get_cycls_for_reference", "CR-GET-CYCLS-FOR-REFERENCE", 1, 0, false);
        declareFunction(me, "cr_get_cycls_for_np_reference", "CR-GET-CYCLS-FOR-NP-REFERENCE", 1, 0, false);
        declareFunction(me, "cr_get_cycls_for_prpX_reference", "CR-GET-CYCLS-FOR-PRP$-REFERENCE", 1, 0, false);
        declareFunction(me, "cr_filter_subl_from_cycls", "CR-FILTER-SUBL-FROM-CYCLS", 1, 0, false);
        declareFunction(me, "cr_plausible_year_integerP", "CR-PLAUSIBLE-YEAR-INTEGER?", 1, 0, false);
        declareFunction(me, "cr_pos_category_for_phrase", "CR-POS-CATEGORY-FOR-PHRASE", 1, 0, false);
        declareFunction(me, "reference_penn_tag", "REFERENCE-PENN-TAG", 1, 0, false);
        declareFunction(me, "strip_final_period", "STRIP-FINAL-PERIOD", 1, 0, false);
        declareFunction(me, "cr_courtesy_title_p", "CR-COURTESY-TITLE-P", 1, 0, false);
        declareFunction(me, "cr_possible_name_phrase_semantics", "CR-POSSIBLE-NAME-PHRASE-SEMANTICS", 1, 0, false);
        declareFunction(me, "phrasal_reference_head_phrase", "PHRASAL-REFERENCE-HEAD-PHRASE", 1, 0, false);
        declareFunction(me, "cr_get_cycls_for_parts_of_reference", "CR-GET-CYCLS-FOR-PARTS-OF-REFERENCE", 1, 0, false);
        declareFunction(me, "cr_discern_definiteness_attribute_of_preterminal_np_phrase", "CR-DISCERN-DEFINITENESS-ATTRIBUTE-OF-PRETERMINAL-NP-PHRASE", 1, 0, false);
        declareFunction(me, "cr_discern_number_attribute_of_preterminal_np_phrase", "CR-DISCERN-NUMBER-ATTRIBUTE-OF-PRETERMINAL-NP-PHRASE", 1, 0, false);
        declareFunction(me, "cr_get_cycls_for_head_of_np_phrase", "CR-GET-CYCLS-FOR-HEAD-OF-NP-PHRASE", 1, 0, false);
        declareFunction(me, "cr_ps_get_cycls_for_phrase_with_timeout", "CR-PS-GET-CYCLS-FOR-PHRASE-WITH-TIMEOUT", 3, 1, false);
        declareFunction(me, "resolve_coreferences_and_print_to_html_file", "RESOLVE-COREFERENCES-AND-PRINT-TO-HTML-FILE", 2, 1, false);
        declareFunction(me, "resolve_coreferences_and_print_to_file", "RESOLVE-COREFERENCES-AND-PRINT-TO-FILE", 2, 2, false);
        declareFunction(me, "resolve_coreferences_and_print", "RESOLVE-COREFERENCES-AND-PRINT", 0, 4, false);
        declareFunction(me, "html_print_coreferences_to_file", "HTML-PRINT-COREFERENCES-TO-FILE", 2, 0, false);
        declareFunction(me, "print_coreferences", "PRINT-COREFERENCES", 1, 2, false);
        declareFunction(me, "print_sentence_number_coreferences", "PRINT-SENTENCE-NUMBER-COREFERENCES", 3, 0, false);
        declareFunction(me, "print_sentence_coreferences", "PRINT-SENTENCE-COREFERENCES", 3, 0, false);
        declareFunction(me, "print_tree_coreferences", "PRINT-TREE-COREFERENCES", 3, 0, false);
        declareFunction(me, "print_strings_of_reference_and_antecedents", "PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS", 3, 0, false);
        declareFunction(me, "print_strings_of_reference_and_antecedents_int", "PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS-INT", 3, 0, false);
        declareFunction(me, "html_print_coreferences", "HTML-PRINT-COREFERENCES", 1, 0, false);
        declareFunction(me, "html_print_sentence_coreferences", "HTML-PRINT-SENTENCE-COREFERENCES", 2, 0, false);
        declareFunction(me, "html_print_tree_coreferences", "HTML-PRINT-TREE-COREFERENCES", 2, 0, false);
        declareFunction(me, "html_print_strings_of_reference_and_antecedents", "HTML-PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS", 2, 0, false);
        declareFunction(me, "html_print_strings_of_reference_and_antecedents_int", "HTML-PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS-INT", 2, 0, false);
        declareFunction(me, "html_print_functional_dependency", "HTML-PRINT-FUNCTIONAL-DEPENDENCY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_coreference_resolution_file() {
        defconstant("*DTP-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT*", COREFERENCE_RESOLUTION_DISCOURSE_STRUCT);
        defconstant("*DTP-REFERENCE-INFO*", REFERENCE_INFO);
        deflexical("*CR-NON-PERSON*", NIL);
        defconstant("*DTP-REFERENT-STRUCT*", REFERENT_STRUCT);
        defconstant("*CR-COURTESY-TITLES*", $list275);
        defconstant("*CR-SENTENCE-SWITCH-ID-BASE*", $$$sent);
        defconstant("*CR-PARSES-SWITCH-ID-BASE*", $$$parses);
        defconstant("*CR-MORE-INFO-SWITCH-ID-BASE*", $$$more);
        return NIL;
    }

    public static SubLObject setup_coreference_resolution_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_coreference_resolution_discourse_struct$.getGlobalValue(), symbol_function(COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(CRD_IMPLEMENTATION, _CSETF_CRD_IMPLEMENTATION);
        def_csetf(CRD_PARSER, _CSETF_CRD_PARSER);
        def_csetf($sym13$CRD_USE_PSP_, $sym14$_CSETF_CRD_USE_PSP_);
        def_csetf(CRD_MAX_SUFFICIENT_RECENTNESS, _CSETF_CRD_MAX_SUFFICIENT_RECENTNESS);
        def_csetf(CRD_MAX_POSSIBLE_ANTECEDENTS, _CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS);
        def_csetf(CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN, _CSETF_CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN);
        def_csetf(CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN, _CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN);
        def_csetf(CRD_REFERENCE_NOTE_HASH, _CSETF_CRD_REFERENCE_NOTE_HASH);
        def_csetf(CRD_RECENT_REFERENCES, _CSETF_CRD_RECENT_REFERENCES);
        def_csetf(CRD_SENTENCES, _CSETF_CRD_SENTENCES);
        identity(COREFERENCE_RESOLUTION_DISCOURSE_STRUCT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_coreference_resolution_discourse_struct$.getGlobalValue(), symbol_function($sym44$VISIT_DEFSTRUCT_OBJECT_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_ME));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_reference_info$.getGlobalValue(), symbol_function(REFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list112);
        def_csetf(REFERENCE_INFO_INDEX_NUMBER, _CSETF_REFERENCE_INFO_INDEX_NUMBER);
        def_csetf(REFERENCE_INFO_TREE, _CSETF_REFERENCE_INFO_TREE);
        def_csetf(REFERENCE_INFO_CYCLS, _CSETF_REFERENCE_INFO_CYCLS);
        def_csetf($sym119$REFERENCE_INFO_POSSIBLE_ANTECEDENT_, $sym120$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENT_);
        def_csetf($sym121$REFERENCE_INFO_POSSIBLE_ANAPHOR_, $sym122$_CSETF_REFERENCE_INFO_POSSIBLE_ANAPHOR_);
        def_csetf(REFERENCE_INFO_POSSIBLE_ANTECEDENTS, _CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENTS);
        def_csetf(REFERENCE_INFO_LIKELY_ANTECEDENTS, _CSETF_REFERENCE_INFO_LIKELY_ANTECEDENTS);
        def_csetf(REFERENCE_INFO_BEST_ANTECEDENT, _CSETF_REFERENCE_INFO_BEST_ANTECEDENT);
        def_csetf(REFERENCE_INFO_FUNCTIONAL_DEPENDENCY, _CSETF_REFERENCE_INFO_FUNCTIONAL_DEPENDENCY);
        def_csetf(REFERENCE_INFO_REFERENT, _CSETF_REFERENCE_INFO_REFERENT);
        identity(REFERENCE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_reference_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REFERENCE_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_referent_struct$.getGlobalValue(), symbol_function(REFERENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list177);
        def_csetf(REFERENT_STRUCT_REFERENCES, _CSETF_REFERENT_STRUCT_REFERENCES);
        def_csetf(REFERENT_STRUCT_EQUALS, _CSETF_REFERENT_STRUCT_EQUALS);
        def_csetf(REFERENT_STRUCT_TYPES, _CSETF_REFERENT_STRUCT_TYPES);
        def_csetf(REFERENT_STRUCT_FACTS, _CSETF_REFERENT_STRUCT_FACTS);
        def_csetf(REFERENT_STRUCT_GENDER, _CSETF_REFERENT_STRUCT_GENDER);
        def_csetf(REFERENT_STRUCT_NUMBER, _CSETF_REFERENT_STRUCT_NUMBER);
        identity(REFERENT_STRUCT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_referent_struct$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REFERENT_STRUCT_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_coreference_resolution_file();
    }

    @Override
    public void initializeVariables() {
        init_coreference_resolution_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_coreference_resolution_file();
    }

    

    public static final class $coreference_resolution_discourse_struct_native extends SubLStructNative {
        public SubLObject $implementation;

        public SubLObject $parser;

        public SubLObject $use_pspP;

        public SubLObject $max_sufficient_recentness;

        public SubLObject $max_possible_antecedents;

        public SubLObject $max_sufficient_recentness_for_gendered_pronoun;

        public SubLObject $max_possible_antecedents_for_gendered_pronoun;

        public SubLObject $reference_note_hash;

        public SubLObject $recent_references;

        public SubLObject $sentences;

        private static final SubLStructDeclNative structDecl;

        private $coreference_resolution_discourse_struct_native() {
            this.$implementation = Lisp.NIL;
            this.$parser = Lisp.NIL;
            this.$use_pspP = Lisp.NIL;
            this.$max_sufficient_recentness = Lisp.NIL;
            this.$max_possible_antecedents = Lisp.NIL;
            this.$max_sufficient_recentness_for_gendered_pronoun = Lisp.NIL;
            this.$max_possible_antecedents_for_gendered_pronoun = Lisp.NIL;
            this.$reference_note_hash = Lisp.NIL;
            this.$recent_references = Lisp.NIL;
            this.$sentences = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$implementation;
        }

        @Override
        public SubLObject getField3() {
            return this.$parser;
        }

        @Override
        public SubLObject getField4() {
            return this.$use_pspP;
        }

        @Override
        public SubLObject getField5() {
            return this.$max_sufficient_recentness;
        }

        @Override
        public SubLObject getField6() {
            return this.$max_possible_antecedents;
        }

        @Override
        public SubLObject getField7() {
            return this.$max_sufficient_recentness_for_gendered_pronoun;
        }

        @Override
        public SubLObject getField8() {
            return this.$max_possible_antecedents_for_gendered_pronoun;
        }

        @Override
        public SubLObject getField9() {
            return this.$reference_note_hash;
        }

        @Override
        public SubLObject getField10() {
            return this.$recent_references;
        }

        @Override
        public SubLObject getField11() {
            return this.$sentences;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$implementation = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$parser = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$use_pspP = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$max_sufficient_recentness = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$max_possible_antecedents = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$max_sufficient_recentness_for_gendered_pronoun = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$max_possible_antecedents_for_gendered_pronoun = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$reference_note_hash = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$recent_references = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$sentences = value;
        }

        static {
            structDecl = makeStructDeclNative($coreference_resolution_discourse_struct_native.class, COREFERENCE_RESOLUTION_DISCOURSE_STRUCT, COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_P, $list2, $list3, new String[]{ "$implementation", "$parser", "$use_pspP", "$max_sufficient_recentness", "$max_possible_antecedents", "$max_sufficient_recentness_for_gendered_pronoun", "$max_possible_antecedents_for_gendered_pronoun", "$reference_note_hash", "$recent_references", "$sentences" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $coreference_resolution_discourse_struct_p$UnaryFunction extends UnaryFunction {
        public $coreference_resolution_discourse_struct_p$UnaryFunction() {
            super(extractFunctionNamed("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return coreference_resolution_discourse_struct_p(arg1);
        }
    }

    public static final class $reference_info_native extends SubLStructNative {
        public SubLObject $index_number;

        public SubLObject $tree;

        public SubLObject $cycls;

        public SubLObject $possible_antecedentP;

        public SubLObject $possible_anaphorP;

        public SubLObject $possible_antecedents;

        public SubLObject $likely_antecedents;

        public SubLObject $best_antecedent;

        public SubLObject $functional_dependency;

        public SubLObject $referent;

        private static final SubLStructDeclNative structDecl;

        private $reference_info_native() {
            this.$index_number = Lisp.NIL;
            this.$tree = Lisp.NIL;
            this.$cycls = Lisp.NIL;
            this.$possible_antecedentP = Lisp.NIL;
            this.$possible_anaphorP = Lisp.NIL;
            this.$possible_antecedents = Lisp.NIL;
            this.$likely_antecedents = Lisp.NIL;
            this.$best_antecedent = Lisp.NIL;
            this.$functional_dependency = Lisp.NIL;
            this.$referent = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$index_number;
        }

        @Override
        public SubLObject getField3() {
            return this.$tree;
        }

        @Override
        public SubLObject getField4() {
            return this.$cycls;
        }

        @Override
        public SubLObject getField5() {
            return this.$possible_antecedentP;
        }

        @Override
        public SubLObject getField6() {
            return this.$possible_anaphorP;
        }

        @Override
        public SubLObject getField7() {
            return this.$possible_antecedents;
        }

        @Override
        public SubLObject getField8() {
            return this.$likely_antecedents;
        }

        @Override
        public SubLObject getField9() {
            return this.$best_antecedent;
        }

        @Override
        public SubLObject getField10() {
            return this.$functional_dependency;
        }

        @Override
        public SubLObject getField11() {
            return this.$referent;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$index_number = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$tree = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$cycls = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$possible_antecedentP = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$possible_anaphorP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$possible_antecedents = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$likely_antecedents = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$best_antecedent = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$functional_dependency = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$referent = value;
        }

        static {
            structDecl = makeStructDeclNative($reference_info_native.class, REFERENCE_INFO, REFERENCE_INFO_P, $list106, $list107, new String[]{ "$index_number", "$tree", "$cycls", "$possible_antecedentP", "$possible_anaphorP", "$possible_antecedents", "$likely_antecedents", "$best_antecedent", "$functional_dependency", "$referent" }, $list108, $list109, PRINT_REFERENCE_INFO);
        }
    }

    public static final class $reference_info_p$UnaryFunction extends UnaryFunction {
        public $reference_info_p$UnaryFunction() {
            super(extractFunctionNamed("REFERENCE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reference_info_p(arg1);
        }
    }

    public static final class $referent_struct_native extends SubLStructNative {
        public SubLObject $references;

        public SubLObject $equals;

        public SubLObject $types;

        public SubLObject $facts;

        public SubLObject $gender;

        public SubLObject $number;

        private static final SubLStructDeclNative structDecl;

        private $referent_struct_native() {
            this.$references = Lisp.NIL;
            this.$equals = Lisp.NIL;
            this.$types = Lisp.NIL;
            this.$facts = Lisp.NIL;
            this.$gender = Lisp.NIL;
            this.$number = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$references;
        }

        @Override
        public SubLObject getField3() {
            return this.$equals;
        }

        @Override
        public SubLObject getField4() {
            return this.$types;
        }

        @Override
        public SubLObject getField5() {
            return this.$facts;
        }

        @Override
        public SubLObject getField6() {
            return this.$gender;
        }

        @Override
        public SubLObject getField7() {
            return this.$number;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$references = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$equals = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$types = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$facts = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$gender = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$number = value;
        }

        static {
            structDecl = makeStructDeclNative($referent_struct_native.class, REFERENT_STRUCT, REFERENT_STRUCT_P, $list171, $list172, new String[]{ "$references", "$equals", "$types", "$facts", "$gender", "$number" }, $list173, $list174, PRINT_REFERENT_STRUCT);
        }
    }

    public static final class $referent_struct_p$UnaryFunction extends UnaryFunction {
        public $referent_struct_p$UnaryFunction() {
            super(extractFunctionNamed("REFERENT-STRUCT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return referent_struct_p(arg1);
        }
    }
}

/**
 * Total time: 1165 ms
 */
