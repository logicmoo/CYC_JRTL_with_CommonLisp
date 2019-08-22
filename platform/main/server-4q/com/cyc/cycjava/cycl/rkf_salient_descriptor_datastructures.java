package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class rkf_salient_descriptor_datastructures extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_salient_descriptor_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures";

    public static final String myFingerPrint = "43a066196bbb16ac0144746d8e253122a677a8f4cd3019b6935b6a5f9b3029ec";

    // defconstant
    public static final SubLSymbol $dtp_rkf_salient_descriptor_prompter$ = makeSymbol("*DTP-RKF-SALIENT-DESCRIPTOR-PROMPTER*");

    // defconstant
    public static final SubLSymbol $dtp_rkf_salient_descriptor_prompt$ = makeSymbol("*DTP-RKF-SALIENT-DESCRIPTOR-PROMPT*");

    // defconstant
    public static final SubLSymbol $dtp_rkf_sd_rule_info_score$ = makeSymbol("*DTP-RKF-SD-RULE-INFO-SCORE*");

    // defconstant
    public static final SubLSymbol $dtp_rkf_sd_example$ = makeSymbol("*DTP-RKF-SD-EXAMPLE*");

    // defconstant
    private static final SubLSymbol $rkf_sd_example_types$ = makeSymbol("*RKF-SD-EXAMPLE-TYPES*");

    // Internal Constants
    public static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER");

    public static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P");

    public static final SubLList $list2 = list(makeSymbol("SEED-TERM"), makeSymbol("MT"), makeSymbol("USED-PROMPTS"), makeSymbol("UNUSED-PROMPTS"), makeSymbol("TACTICS"), makeSymbol("ISG"), makeSymbol("PLIST"));

    public static final SubLList $list3 = list(makeKeyword("SEED-TERM"), makeKeyword("MT"), makeKeyword("USED-PROMPTS"), makeKeyword("UNUSED-PROMPTS"), makeKeyword("TACTICS"), makeKeyword("ISG"), makeKeyword("PLIST"));

    public static final SubLList $list4 = list(makeSymbol("RKF-SD-PROMPTER-SEED-TERM"), makeSymbol("RKF-SD-PROMPTER-MT"), makeSymbol("RKF-SD-PROMPTER-USED-PROMPTS"), makeSymbol("RKF-SD-PROMPTER-UNUSED-PROMPTS"), makeSymbol("RKF-SD-PROMPTER-TACTICS"), makeSymbol("RKF-SD-PROMPTER-ISG"), makeSymbol("RKF-SD-PROMPTER-PLIST"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RKF-SD-PROMPTER-SEED-TERM"), makeSymbol("_CSETF-RKF-SD-PROMPTER-MT"), makeSymbol("_CSETF-RKF-SD-PROMPTER-USED-PROMPTS"), makeSymbol("_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS"), makeSymbol("_CSETF-RKF-SD-PROMPTER-TACTICS"), makeSymbol("_CSETF-RKF-SD-PROMPTER-ISG"), makeSymbol("_CSETF-RKF-SD-PROMPTER-PLIST"));

    public static final SubLSymbol PRINT_RKF_SD_PROMPTER = makeSymbol("PRINT-RKF-SD-PROMPTER");

    public static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P"));

    private static final SubLSymbol RKF_SD_PROMPTER_SEED_TERM = makeSymbol("RKF-SD-PROMPTER-SEED-TERM");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_SEED_TERM = makeSymbol("_CSETF-RKF-SD-PROMPTER-SEED-TERM");

    private static final SubLSymbol RKF_SD_PROMPTER_MT = makeSymbol("RKF-SD-PROMPTER-MT");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_MT = makeSymbol("_CSETF-RKF-SD-PROMPTER-MT");

    private static final SubLSymbol RKF_SD_PROMPTER_USED_PROMPTS = makeSymbol("RKF-SD-PROMPTER-USED-PROMPTS");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_USED_PROMPTS = makeSymbol("_CSETF-RKF-SD-PROMPTER-USED-PROMPTS");

    private static final SubLSymbol RKF_SD_PROMPTER_UNUSED_PROMPTS = makeSymbol("RKF-SD-PROMPTER-UNUSED-PROMPTS");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS = makeSymbol("_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS");

    private static final SubLSymbol RKF_SD_PROMPTER_TACTICS = makeSymbol("RKF-SD-PROMPTER-TACTICS");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_TACTICS = makeSymbol("_CSETF-RKF-SD-PROMPTER-TACTICS");

    private static final SubLSymbol RKF_SD_PROMPTER_ISG = makeSymbol("RKF-SD-PROMPTER-ISG");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_ISG = makeSymbol("_CSETF-RKF-SD-PROMPTER-ISG");

    private static final SubLSymbol RKF_SD_PROMPTER_PLIST = makeSymbol("RKF-SD-PROMPTER-PLIST");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPTER_PLIST = makeSymbol("_CSETF-RKF-SD-PROMPTER-PLIST");















    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol("MAKE-RKF-SALIENT-DESCRIPTOR-PROMPTER");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD");

    private static final SubLString $str36$_RKF_SD_PROMPTER__S__S___D_prompt = makeString("<RKF-SD-PROMPTER ~S ~S (~D prompts)>");



    private static final SubLString $$$Salient_Descriptor_Prompter_Lock = makeString("Salient Descriptor Prompter Lock");







    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");

    private static final SubLList $list44 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("SUBPROMPTS"), makeSymbol("FORMULA"), makeSymbol("JUSTIFICATION"), makeSymbol("DEDUCIBLE-CNFS"), makeSymbol("EXAMPLES"), makeSymbol("SALIENT-PROPERTY-SENTENCE"), makeSymbol("PROMPTER"), makeSymbol("TACTIC") });

    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("SUBPROMPTS"), makeKeyword("FORMULA"), makeKeyword("JUSTIFICATION"), makeKeyword("DEDUCIBLE-CNFS"), makeKeyword("EXAMPLES"), makeKeyword("SALIENT-PROPERTY-SENTENCE"), makeKeyword("PROMPTER"), makeKeyword("TACTIC") });

    private static final SubLList $list46 = list(new SubLObject[]{ makeSymbol("RKF-SD-PROMPT-ID"), makeSymbol("RKF-SD-PROMPT-SUBPROMPTS"), makeSymbol("RKF-SD-PROMPT-FORMULA"), makeSymbol("RKF-SD-PROMPT-JUSTIFICATION"), makeSymbol("RKF-SD-PROMPT-DEDUCIBLE-CNFS"), makeSymbol("RKF-SD-PROMPT-EXAMPLES"), makeSymbol("RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE"), makeSymbol("RKF-SD-PROMPT-PROMPTER"), makeSymbol("RKF-SD-PROMPT-TACTIC") });

    private static final SubLList $list47 = list(new SubLObject[]{ makeSymbol("_CSETF-RKF-SD-PROMPT-ID"), makeSymbol("_CSETF-RKF-SD-PROMPT-SUBPROMPTS"), makeSymbol("_CSETF-RKF-SD-PROMPT-FORMULA"), makeSymbol("_CSETF-RKF-SD-PROMPT-JUSTIFICATION"), makeSymbol("_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS"), makeSymbol("_CSETF-RKF-SD-PROMPT-EXAMPLES"), makeSymbol("_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE"), makeSymbol("_CSETF-RKF-SD-PROMPT-PROMPTER"), makeSymbol("_CSETF-RKF-SD-PROMPT-TACTIC") });

    private static final SubLSymbol PRINT_RKF_SD_PROMPT = makeSymbol("PRINT-RKF-SD-PROMPT");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list50 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P"));

    private static final SubLSymbol RKF_SD_PROMPT_ID = makeSymbol("RKF-SD-PROMPT-ID");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_ID = makeSymbol("_CSETF-RKF-SD-PROMPT-ID");

    private static final SubLSymbol RKF_SD_PROMPT_SUBPROMPTS = makeSymbol("RKF-SD-PROMPT-SUBPROMPTS");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_SUBPROMPTS = makeSymbol("_CSETF-RKF-SD-PROMPT-SUBPROMPTS");

    private static final SubLSymbol RKF_SD_PROMPT_FORMULA = makeSymbol("RKF-SD-PROMPT-FORMULA");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_FORMULA = makeSymbol("_CSETF-RKF-SD-PROMPT-FORMULA");

    private static final SubLSymbol RKF_SD_PROMPT_JUSTIFICATION = makeSymbol("RKF-SD-PROMPT-JUSTIFICATION");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_JUSTIFICATION = makeSymbol("_CSETF-RKF-SD-PROMPT-JUSTIFICATION");

    private static final SubLSymbol RKF_SD_PROMPT_DEDUCIBLE_CNFS = makeSymbol("RKF-SD-PROMPT-DEDUCIBLE-CNFS");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS = makeSymbol("_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS");

    private static final SubLSymbol RKF_SD_PROMPT_EXAMPLES = makeSymbol("RKF-SD-PROMPT-EXAMPLES");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_EXAMPLES = makeSymbol("_CSETF-RKF-SD-PROMPT-EXAMPLES");

    private static final SubLSymbol RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE = makeSymbol("RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE = makeSymbol("_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE");

    private static final SubLSymbol RKF_SD_PROMPT_PROMPTER = makeSymbol("RKF-SD-PROMPT-PROMPTER");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_PROMPTER = makeSymbol("_CSETF-RKF-SD-PROMPT-PROMPTER");

    private static final SubLSymbol RKF_SD_PROMPT_TACTIC = makeSymbol("RKF-SD-PROMPT-TACTIC");

    private static final SubLSymbol _CSETF_RKF_SD_PROMPT_TACTIC = makeSymbol("_CSETF-RKF-SD-PROMPT-TACTIC");













    private static final SubLSymbol $SALIENT_PROPERTY_SENTENCE = makeKeyword("SALIENT-PROPERTY-SENTENCE");





    private static final SubLSymbol MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT = makeSymbol("MAKE-RKF-SALIENT-DESCRIPTOR-PROMPT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD");

    private static final SubLString $str80$_RKF_SD_PROMPT_Subprompts___S_ = makeString("<RKF-SD-PROMPT Subprompts: ~S ");

    private static final SubLString $str81$Formula___S_ = makeString("Formula: ~S ");

    private static final SubLString $str82$Deducible_CNFs___S_ = makeString("Deducible CNFs: ~S>");







    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE = makeSymbol("RKF-SD-RULE-INFO-SCORE");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_P = makeSymbol("RKF-SD-RULE-INFO-SCORE-P");

    private static final SubLList $list88 = list(makeSymbol("SEED-TERM-IN-POS-LITS?"), makeSymbol("SEED-TERM-IN-NEG-LITS?"), makeSymbol("VAR-COUNT"), makeSymbol("NEG-LIT-COUNT"), makeSymbol("POS-LIT-COUNT"), makeSymbol("POS-LIT-QUALITY-SCORE"), makeSymbol("MT-GENERALITY-SCORE"), makeSymbol("PLIST"));

    private static final SubLList $list89 = list(makeKeyword("SEED-TERM-IN-POS-LITS?"), makeKeyword("SEED-TERM-IN-NEG-LITS?"), makeKeyword("VAR-COUNT"), makeKeyword("NEG-LIT-COUNT"), makeKeyword("POS-LIT-COUNT"), makeKeyword("POS-LIT-QUALITY-SCORE"), makeKeyword("MT-GENERALITY-SCORE"), makeKeyword("PLIST"));

    private static final SubLList $list90 = list(makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?"), makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?"), makeSymbol("RKF-SD-RULE-INFO-SCORE-VAR-COUNT"), makeSymbol("RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT"), makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT"), makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE"), makeSymbol("RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE"), makeSymbol("RKF-SD-RULE-INFO-SCORE-PLIST"));

    private static final SubLList $list91 = list(makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE"), makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST"));

    private static final SubLSymbol PRINT_RKF_SD_RULE_INFO_SCORE = makeSymbol("PRINT-RKF-SD-RULE-INFO-SCORE");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-SD-RULE-INFO-SCORE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list94 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-SD-RULE-INFO-SCORE-P"));

    private static final SubLSymbol $sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ = makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?");

    private static final SubLSymbol $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?");

    private static final SubLSymbol $sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ = makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?");

    private static final SubLSymbol $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_VAR_COUNT = makeSymbol("RKF-SD-RULE-INFO-SCORE-VAR-COUNT");

    private static final SubLSymbol _CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT = makeSymbol("RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT");

    private static final SubLSymbol _CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT = makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT");

    private static final SubLSymbol _CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE = makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE");

    private static final SubLSymbol _CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE = makeSymbol("RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE");

    private static final SubLSymbol _CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE");

    private static final SubLSymbol RKF_SD_RULE_INFO_SCORE_PLIST = makeSymbol("RKF-SD-RULE-INFO-SCORE-PLIST");

    private static final SubLSymbol _CSETF_RKF_SD_RULE_INFO_SCORE_PLIST = makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST");

    private static final SubLSymbol $kw111$SEED_TERM_IN_POS_LITS_ = makeKeyword("SEED-TERM-IN-POS-LITS?");

    private static final SubLSymbol $kw112$SEED_TERM_IN_NEG_LITS_ = makeKeyword("SEED-TERM-IN-NEG-LITS?");



    private static final SubLSymbol $NEG_LIT_COUNT = makeKeyword("NEG-LIT-COUNT");

    private static final SubLSymbol $POS_LIT_COUNT = makeKeyword("POS-LIT-COUNT");

    private static final SubLSymbol $POS_LIT_QUALITY_SCORE = makeKeyword("POS-LIT-QUALITY-SCORE");

    private static final SubLSymbol $MT_GENERALITY_SCORE = makeKeyword("MT-GENERALITY-SCORE");

    private static final SubLSymbol MAKE_RKF_SD_RULE_INFO_SCORE = makeSymbol("MAKE-RKF-SD-RULE-INFO-SCORE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SD-RULE-INFO-SCORE-METHOD");

    private static final SubLString $str120$_RKF_SD_SCORE = makeString("<RKF-SD-SCORE");

    private static final SubLString $str121$_neg__S = makeString(" neg:~S");

    private static final SubLString $str122$_pos__S = makeString(" pos:~S");

    private static final SubLString $str123$_vars__S = makeString(" vars:~S");

    private static final SubLString $str124$_nlc__S = makeString(" nlc:~S");

    private static final SubLString $str125$_plc__S = makeString(" plc:~S");

    private static final SubLString $str126$_plq__S = makeString(" plq:~S");

    private static final SubLString $str127$_mtg__S = makeString(" mtg:~S");

    private static final SubLString $str128$_ = makeString(">");

    private static final SubLSymbol RKF_SD_EXAMPLE = makeSymbol("RKF-SD-EXAMPLE");

    private static final SubLSymbol RKF_SD_EXAMPLE_P = makeSymbol("RKF-SD-EXAMPLE-P");

    private static final SubLList $list131 = list(makeSymbol("TYPE"), makeSymbol("TERM"), makeSymbol("SUPPORTS"), makeSymbol("FOCUS-TERM-ANALOG"));

    private static final SubLList $list132 = list(makeKeyword("TYPE"), makeKeyword("TERM"), makeKeyword("SUPPORTS"), makeKeyword("FOCUS-TERM-ANALOG"));

    private static final SubLList $list133 = list(makeSymbol("RKF-SD-EXAMPLE-TYPE"), makeSymbol("RKF-SD-EXAMPLE-TERM"), makeSymbol("RKF-SD-EXAMPLE-SUPPORTS"), makeSymbol("RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG"));

    private static final SubLList $list134 = list(makeSymbol("_CSETF-RKF-SD-EXAMPLE-TYPE"), makeSymbol("_CSETF-RKF-SD-EXAMPLE-TERM"), makeSymbol("_CSETF-RKF-SD-EXAMPLE-SUPPORTS"), makeSymbol("_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG"));

    private static final SubLSymbol PRINT_RKF_SD_EXAMPLE = makeSymbol("PRINT-RKF-SD-EXAMPLE");

    private static final SubLSymbol RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-SD-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list137 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-SD-EXAMPLE-P"));

    private static final SubLSymbol RKF_SD_EXAMPLE_TYPE = makeSymbol("RKF-SD-EXAMPLE-TYPE");

    private static final SubLSymbol _CSETF_RKF_SD_EXAMPLE_TYPE = makeSymbol("_CSETF-RKF-SD-EXAMPLE-TYPE");

    private static final SubLSymbol RKF_SD_EXAMPLE_TERM = makeSymbol("RKF-SD-EXAMPLE-TERM");

    private static final SubLSymbol _CSETF_RKF_SD_EXAMPLE_TERM = makeSymbol("_CSETF-RKF-SD-EXAMPLE-TERM");

    private static final SubLSymbol RKF_SD_EXAMPLE_SUPPORTS = makeSymbol("RKF-SD-EXAMPLE-SUPPORTS");

    private static final SubLSymbol _CSETF_RKF_SD_EXAMPLE_SUPPORTS = makeSymbol("_CSETF-RKF-SD-EXAMPLE-SUPPORTS");

    private static final SubLSymbol RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG = makeSymbol("RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG");

    private static final SubLSymbol _CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG = makeSymbol("_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG");







    private static final SubLSymbol $FOCUS_TERM_ANALOG = makeKeyword("FOCUS-TERM-ANALOG");

    private static final SubLSymbol MAKE_RKF_SD_EXAMPLE = makeSymbol("MAKE-RKF-SD-EXAMPLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SD-EXAMPLE-METHOD");

    private static final SubLList $list152 = list(makeKeyword("PRECEDENT"), makeKeyword("CONSTRAINT-MATCHER"));

    private static final SubLSymbol RKF_SD_EXAMPLE_TYPE_P = makeSymbol("RKF-SD-EXAMPLE-TYPE-P");

    private static final SubLList $list154 = list(list(makeSymbol("TYPE"), makeSymbol("TERM"), makeSymbol("SUPPORTS"), makeSymbol("FOCUS-TERM-ANALOG")), makeSymbol("EXAMPLE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLString $str156$_RKF_SD__A_EXAMPLE__S = makeString("<RKF-SD-~A-EXAMPLE ~S");



    private static final SubLString $str158$__S = makeString(" ~S");

    public static SubLObject rkf_salient_descriptor_prompter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_prompter(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_prompter_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rkf_salient_descriptor_prompter_native.class ? T : NIL;
    }

    public static SubLObject rkf_sd_prompter_seed_term(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rkf_sd_prompter_mt(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rkf_sd_prompter_used_prompts(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rkf_sd_prompter_unused_prompts(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rkf_sd_prompter_tactics(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rkf_sd_prompter_isg(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rkf_sd_prompter_plist(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_rkf_sd_prompter_seed_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_sd_prompter_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_sd_prompter_used_prompts(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_sd_prompter_unused_prompts(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rkf_sd_prompter_tactics(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rkf_sd_prompter_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rkf_sd_prompter_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompter_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_rkf_salient_descriptor_prompter(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rkf_salient_descriptor_prompter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SEED_TERM)) {
                _csetf_rkf_sd_prompter_seed_term(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_rkf_sd_prompter_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($USED_PROMPTS)) {
                        _csetf_rkf_sd_prompter_used_prompts(v_new, current_value);
                    } else
                        if (pcase_var.eql($UNUSED_PROMPTS)) {
                            _csetf_rkf_sd_prompter_unused_prompts(v_new, current_value);
                        } else
                            if (pcase_var.eql($TACTICS)) {
                                _csetf_rkf_sd_prompter_tactics(v_new, current_value);
                            } else
                                if (pcase_var.eql($ISG)) {
                                    _csetf_rkf_sd_prompter_isg(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PLIST)) {
                                        _csetf_rkf_sd_prompter_plist(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_salient_descriptor_prompter(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SEED_TERM, rkf_sd_prompter_seed_term(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, rkf_sd_prompter_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $USED_PROMPTS, rkf_sd_prompter_used_prompts(obj));
        funcall(visitor_fn, obj, $SLOT, $UNUSED_PROMPTS, rkf_sd_prompter_unused_prompts(obj));
        funcall(visitor_fn, obj, $SLOT, $TACTICS, rkf_sd_prompter_tactics(obj));
        funcall(visitor_fn, obj, $SLOT, $ISG, rkf_sd_prompter_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, rkf_sd_prompter_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_salient_descriptor_prompter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_salient_descriptor_prompter(obj, visitor_fn);
    }

    public static SubLObject print_rkf_sd_prompter(final SubLObject prompter, final SubLObject stream, final SubLObject depth) {
        format(stream, $str36$_RKF_SD_PROMPTER__S__S___D_prompt, new SubLObject[]{ rkf_sd_prompter_seed_term(prompter), rkf_sd_prompter_mt(prompter), set.set_size(rkf_sd_prompter_unused_prompts(prompter)) });
        return prompter;
    }

    public static SubLObject new_rkf_salient_descriptor_prompter(final SubLObject seed_term, final SubLObject mt) {
        final SubLObject seed_term_type = rkf_salient_descriptor_prompter.rkf_sd_prompter_compute_seed_term_type(seed_term);
        final SubLObject tactics = rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_for_seed_term_type(seed_term_type);
        final SubLObject prompter = make_rkf_salient_descriptor_prompter(list($SEED_TERM, seed_term, $MT, mt));
        if (NIL != tactics) {
            _csetf_rkf_sd_prompter_tactics(prompter, tactics);
        }
        _csetf_rkf_sd_prompter_used_prompts(prompter, set.new_set(UNPROVIDED, UNPROVIDED));
        _csetf_rkf_sd_prompter_unused_prompts(prompter, set.new_set(UNPROVIDED, UNPROVIDED));
        _csetf_rkf_sd_prompter_isg(prompter, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        rkf_salient_descriptor_prompter_set(prompter, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject lock = make_lock($$$Salient_Descriptor_Prompter_Lock);
        rkf_salient_descriptor_prompter_set(prompter, $LOCK, lock);
        return prompter;
    }

    public static SubLObject rkf_salient_descriptor_prompter_lookup(final SubLObject prompter, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNKNOWN;
        }
        SubLObject ans = getf(rkf_sd_prompter_plist(prompter), property, $NOT_FOUND);
        if ($NOT_FOUND == ans) {
            rkf_salient_descriptor_prompter_set(prompter, property, v_default);
            ans = v_default;
        }
        return ans;
    }

    public static SubLObject rkf_salient_descriptor_prompter_set(final SubLObject prompter, final SubLObject property, final SubLObject value) {
        _csetf_rkf_sd_prompter_plist(prompter, putf(rkf_sd_prompter_plist(prompter), property, value));
        return value;
    }

    public static SubLObject rkf_salient_descriptor_prompter_clear(final SubLObject prompter, final SubLObject property) {
        return rkf_salient_descriptor_prompter_set(prompter, property, NIL);
    }

    public static SubLObject rkf_salient_descriptor_prompter_unused_prompts(final SubLObject prompter) {
        final SubLObject prompts = rkf_sd_prompter_unused_prompts(prompter);
        return NIL != set.set_p(prompts) ? prompts : set.new_set(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_salient_descriptor_prompt_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_prompt(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_prompt_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rkf_salient_descriptor_prompt_native.class ? T : NIL;
    }

    public static SubLObject rkf_sd_prompt_id(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rkf_sd_prompt_subprompts(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rkf_sd_prompt_formula(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rkf_sd_prompt_justification(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rkf_sd_prompt_deducible_cnfs(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rkf_sd_prompt_examples(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rkf_sd_prompt_salient_property_sentence(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rkf_sd_prompt_prompter(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject rkf_sd_prompt_tactic(final SubLObject v_object) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_rkf_sd_prompt_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_subprompts(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_justification(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_deducible_cnfs(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_examples(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_salient_property_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_prompter(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rkf_sd_prompt_tactic(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_salient_descriptor_prompt_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_rkf_salient_descriptor_prompt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rkf_salient_descriptor_prompt_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_rkf_sd_prompt_id(v_new, current_value);
            } else
                if (pcase_var.eql($SUBPROMPTS)) {
                    _csetf_rkf_sd_prompt_subprompts(v_new, current_value);
                } else
                    if (pcase_var.eql($FORMULA)) {
                        _csetf_rkf_sd_prompt_formula(v_new, current_value);
                    } else
                        if (pcase_var.eql($JUSTIFICATION)) {
                            _csetf_rkf_sd_prompt_justification(v_new, current_value);
                        } else
                            if (pcase_var.eql($DEDUCIBLE_CNFS)) {
                                _csetf_rkf_sd_prompt_deducible_cnfs(v_new, current_value);
                            } else
                                if (pcase_var.eql($EXAMPLES)) {
                                    _csetf_rkf_sd_prompt_examples(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SALIENT_PROPERTY_SENTENCE)) {
                                        _csetf_rkf_sd_prompt_salient_property_sentence(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PROMPTER)) {
                                            _csetf_rkf_sd_prompt_prompter(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($TACTIC)) {
                                                _csetf_rkf_sd_prompt_tactic(v_new, current_value);
                                            } else {
                                                Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_salient_descriptor_prompt(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, rkf_sd_prompt_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBPROMPTS, rkf_sd_prompt_subprompts(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, rkf_sd_prompt_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $JUSTIFICATION, rkf_sd_prompt_justification(obj));
        funcall(visitor_fn, obj, $SLOT, $DEDUCIBLE_CNFS, rkf_sd_prompt_deducible_cnfs(obj));
        funcall(visitor_fn, obj, $SLOT, $EXAMPLES, rkf_sd_prompt_examples(obj));
        funcall(visitor_fn, obj, $SLOT, $SALIENT_PROPERTY_SENTENCE, rkf_sd_prompt_salient_property_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $PROMPTER, rkf_sd_prompt_prompter(obj));
        funcall(visitor_fn, obj, $SLOT, $TACTIC, rkf_sd_prompt_tactic(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_salient_descriptor_prompt_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_salient_descriptor_prompt(obj, visitor_fn);
    }

    public static SubLObject print_rkf_sd_prompt(final SubLObject prompt, final SubLObject stream, final SubLObject depth) {
        final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
        final SubLObject formula = rkf_sd_prompt_formula(prompt);
        final SubLObject deducible_cnfs = rkf_sd_prompt_deducible_cnfs(prompt);
        format(stream, $str80$_RKF_SD_PROMPT_Subprompts___S_, subprompts);
        if (NIL == subprompts) {
            format(stream, $str81$Formula___S_, formula);
        }
        format(stream, $str82$Deducible_CNFs___S_, deducible_cnfs);
        return prompt;
    }

    public static SubLObject new_rkf_sd_prompt() {
        return make_rkf_salient_descriptor_prompt(UNPROVIDED);
    }

    public static SubLObject rkf_sd_prompt_set_formula(final SubLObject prompt, final SubLObject formula) {
        _csetf_rkf_sd_prompt_formula(prompt, formula);
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_set_tactic(final SubLObject prompt, final SubLObject tactic) {
        _csetf_rkf_sd_prompt_tactic(prompt, tactic);
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_set_justification(final SubLObject prompt, final SubLObject justification) {
        _csetf_rkf_sd_prompt_justification(prompt, justification);
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_set_salient_property_sentence(final SubLObject prompt, final SubLObject sentence) {
        _csetf_rkf_sd_prompt_salient_property_sentence(prompt, sentence);
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_set_subprompts(final SubLObject prompt, final SubLObject subprompts) {
        _csetf_rkf_sd_prompt_subprompts(prompt, subprompts);
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_set_id(final SubLObject prompt, final SubLObject id) {
        _csetf_rkf_sd_prompt_id(prompt, id);
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_set_prompter(final SubLObject prompt, final SubLObject prompter) {
        _csetf_rkf_sd_prompt_prompter(prompt, prompter);
        return prompt;
    }

    public static SubLObject rkf_salient_descriptor_prompt_id(final SubLObject prompt) {
        return rkf_sd_prompt_id(prompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_formula(final SubLObject prompt) {
        return rkf_sd_prompt_formula(prompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_choices(final SubLObject prompt) {
        SubLObject choices = NIL;
        if ($CHOICE == rkf_salient_descriptor_prompt_type(prompt)) {
            final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
            final SubLObject subprompt = subprompts.first();
            choices = third(subprompt);
        }
        return choices;
    }

    public static SubLObject rkf_salient_descriptor_prompt_term_count(final SubLObject prompt) {
        SubLObject count = NIL;
        final SubLObject pcase_var = rkf_salient_descriptor_prompt_type(prompt);
        if (pcase_var.eql($SPECIFY) || pcase_var.eql($CONFIRM)) {
            final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
            count = length(subprompts);
        } else
            if (pcase_var.eql($CHOICE)) {
                return ONE_INTEGER;
            }

        return count;
    }

    public static SubLObject rkf_salient_descriptor_prompt_type(final SubLObject prompt) {
        final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
        final SubLObject subprompt = subprompts.first();
        return rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_prompter(final SubLObject prompt) {
        return rkf_sd_prompt_prompter(prompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_justification(final SubLObject prompt) {
        return rkf_sd_prompt_justification(prompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_subprompts(final SubLObject prompt) {
        rkf_salient_descriptor_prompter.rkf_sd_prompt_maybe_compute_subprompts(prompt);
        return rkf_sd_prompt_subprompts(prompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_salient_property_sentence(final SubLObject prompt) {
        return rkf_sd_prompt_salient_property_sentence(prompt);
    }

    public static SubLObject rkf_salient_descriptor_prompt_deducible_cnfs(final SubLObject prompt) {
        return rkf_sd_prompt_deducible_cnfs(prompt);
    }

    public static SubLObject rkf_sd_rule_info_score_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_rule_info_score(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_sd_rule_info_score_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rkf_sd_rule_info_score_native.class ? T : NIL;
    }

    public static SubLObject rkf_sd_rule_info_score_seed_term_in_pos_litsP(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rkf_sd_rule_info_score_seed_term_in_neg_litsP(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rkf_sd_rule_info_score_var_count(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rkf_sd_rule_info_score_neg_lit_count(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rkf_sd_rule_info_score_pos_lit_count(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rkf_sd_rule_info_score_pos_lit_quality_score(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rkf_sd_rule_info_score_mt_generality_score(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rkf_sd_rule_info_score_plist(final SubLObject v_object) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_var_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_neg_lit_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_pos_lit_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_pos_lit_quality_score(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_mt_generality_score(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rkf_sd_rule_info_score_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_rule_info_score_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_rkf_sd_rule_info_score(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rkf_sd_rule_info_score_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($kw111$SEED_TERM_IN_POS_LITS_)) {
                _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(v_new, current_value);
            } else
                if (pcase_var.eql($kw112$SEED_TERM_IN_NEG_LITS_)) {
                    _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(v_new, current_value);
                } else
                    if (pcase_var.eql($VAR_COUNT)) {
                        _csetf_rkf_sd_rule_info_score_var_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($NEG_LIT_COUNT)) {
                            _csetf_rkf_sd_rule_info_score_neg_lit_count(v_new, current_value);
                        } else
                            if (pcase_var.eql($POS_LIT_COUNT)) {
                                _csetf_rkf_sd_rule_info_score_pos_lit_count(v_new, current_value);
                            } else
                                if (pcase_var.eql($POS_LIT_QUALITY_SCORE)) {
                                    _csetf_rkf_sd_rule_info_score_pos_lit_quality_score(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MT_GENERALITY_SCORE)) {
                                        _csetf_rkf_sd_rule_info_score_mt_generality_score(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PLIST)) {
                                            _csetf_rkf_sd_rule_info_score_plist(v_new, current_value);
                                        } else {
                                            Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_sd_rule_info_score(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_SD_RULE_INFO_SCORE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $kw111$SEED_TERM_IN_POS_LITS_, rkf_sd_rule_info_score_seed_term_in_pos_litsP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw112$SEED_TERM_IN_NEG_LITS_, rkf_sd_rule_info_score_seed_term_in_neg_litsP(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_COUNT, rkf_sd_rule_info_score_var_count(obj));
        funcall(visitor_fn, obj, $SLOT, $NEG_LIT_COUNT, rkf_sd_rule_info_score_neg_lit_count(obj));
        funcall(visitor_fn, obj, $SLOT, $POS_LIT_COUNT, rkf_sd_rule_info_score_pos_lit_count(obj));
        funcall(visitor_fn, obj, $SLOT, $POS_LIT_QUALITY_SCORE, rkf_sd_rule_info_score_pos_lit_quality_score(obj));
        funcall(visitor_fn, obj, $SLOT, $MT_GENERALITY_SCORE, rkf_sd_rule_info_score_mt_generality_score(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, rkf_sd_rule_info_score_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_SD_RULE_INFO_SCORE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_sd_rule_info_score_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_sd_rule_info_score(obj, visitor_fn);
    }

    public static SubLObject new_rkf_sd_rule_info_score() {
        return make_rkf_sd_rule_info_score(UNPROVIDED);
    }

    public static SubLObject print_rkf_sd_rule_info_score(final SubLObject score, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        princ($str120$_RKF_SD_SCORE, stream);
        format(stream, $str121$_neg__S, rkf_sd_rule_info_score_seed_term_in_neg_litsP(score));
        format(stream, $str122$_pos__S, rkf_sd_rule_info_score_seed_term_in_pos_litsP(score));
        format(stream, $str123$_vars__S, rkf_sd_rule_info_score_var_count(score));
        format(stream, $str124$_nlc__S, rkf_sd_rule_info_score_neg_lit_count(score));
        format(stream, $str125$_plc__S, rkf_sd_rule_info_score_pos_lit_count(score));
        format(stream, $str126$_plq__S, rkf_sd_rule_info_score_pos_lit_quality_score(score));
        format(stream, $str127$_mtg__S, rkf_sd_rule_info_score_mt_generality_score(score));
        princ($str128$_, stream);
        return score;
    }

    public static SubLObject rkf_sd_example_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_example(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_sd_example_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rkf_sd_example_native.class ? T : NIL;
    }

    public static SubLObject rkf_sd_example_type(final SubLObject v_object) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rkf_sd_example_term(final SubLObject v_object) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rkf_sd_example_supports(final SubLObject v_object) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rkf_sd_example_focus_term_analog(final SubLObject v_object) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_rkf_sd_example_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_sd_example_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_sd_example_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_sd_example_focus_term_analog(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_sd_example_p(v_object) : "rkf_salient_descriptor_datastructures.rkf_sd_example_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_rkf_sd_example(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rkf_sd_example_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_rkf_sd_example_type(v_new, current_value);
            } else
                if (pcase_var.eql($TERM)) {
                    _csetf_rkf_sd_example_term(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPPORTS)) {
                        _csetf_rkf_sd_example_supports(v_new, current_value);
                    } else
                        if (pcase_var.eql($FOCUS_TERM_ANALOG)) {
                            _csetf_rkf_sd_example_focus_term_analog(v_new, current_value);
                        } else {
                            Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_sd_example(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_SD_EXAMPLE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, rkf_sd_example_type(obj));
        funcall(visitor_fn, obj, $SLOT, $TERM, rkf_sd_example_term(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, rkf_sd_example_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCUS_TERM_ANALOG, rkf_sd_example_focus_term_analog(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_SD_EXAMPLE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_sd_example_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_sd_example(obj, visitor_fn);
    }

    public static SubLObject rkf_sd_example_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rkf_sd_example_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_rkf_sd_example(SubLObject type, SubLObject v_term, SubLObject supports, SubLObject focus_term_analog) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (supports == UNPROVIDED) {
            supports = NIL;
        }
        if (focus_term_analog == UNPROVIDED) {
            focus_term_analog = NIL;
        }
        assert NIL != rkf_sd_example_type_p(type) : "rkf_salient_descriptor_datastructures.rkf_sd_example_type_p(type) " + "CommonSymbols.NIL != rkf_salient_descriptor_datastructures.rkf_sd_example_type_p(type) " + type;
        return make_rkf_sd_example(list($TYPE, type, $TERM, v_term, $SUPPORTS, supports, $FOCUS_TERM_ANALOG, focus_term_analog));
    }

    public static SubLObject destructure_rkf_sd_example(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = NIL;
        SubLObject v_term = NIL;
        SubLObject supports = NIL;
        SubLObject focus_term_analog = NIL;
        destructuring_bind_must_consp(current, datum, $list154);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        supports = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        focus_term_analog = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject example = NIL;
            destructuring_bind_must_consp(current, datum, $list154);
            example = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(list(type, list(RKF_SD_EXAMPLE_TYPE, example)), list(v_term, list(RKF_SD_EXAMPLE_TERM, example)), list(supports, list(RKF_SD_EXAMPLE_SUPPORTS, example)), list(focus_term_analog, list(RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG, example))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list154);
        return NIL;
    }

    public static SubLObject print_rkf_sd_example(final SubLObject example, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject type = rkf_sd_example_type(example);
        final SubLObject v_term = rkf_sd_example_term(example);
        final SubLObject supports = rkf_sd_example_supports(example);
        final SubLObject focus_term_analog = rkf_sd_example_focus_term_analog(example);
        format(stream, $str156$_RKF_SD__A_EXAMPLE__S, type, v_term);
        if ($PRECEDENT == type) {
            format(stream, $str158$__S, focus_term_analog);
        }
        princ($str128$_, stream);
        return example;
    }

    public static SubLObject rkf_sd_precedent_example_p(final SubLObject v_object) {
        return makeBoolean((NIL != rkf_sd_example_p(v_object)) && (rkf_sd_example_type(v_object) == $PRECEDENT));
    }

    public static SubLObject declare_rkf_salient_descriptor_datastructures_file() {
        declareFunction(me, "rkf_salient_descriptor_prompter_print_function_trampoline", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompter_p", "RKF-SALIENT-DESCRIPTOR-PROMPTER-P", 1, 0, false);
        new rkf_salient_descriptor_datastructures.$rkf_salient_descriptor_prompter_p$UnaryFunction();
        declareFunction(me, "rkf_sd_prompter_seed_term", "RKF-SD-PROMPTER-SEED-TERM", 1, 0, false);
        declareFunction(me, "rkf_sd_prompter_mt", "RKF-SD-PROMPTER-MT", 1, 0, false);
        declareFunction(me, "rkf_sd_prompter_used_prompts", "RKF-SD-PROMPTER-USED-PROMPTS", 1, 0, false);
        declareFunction(me, "rkf_sd_prompter_unused_prompts", "RKF-SD-PROMPTER-UNUSED-PROMPTS", 1, 0, false);
        declareFunction(me, "rkf_sd_prompter_tactics", "RKF-SD-PROMPTER-TACTICS", 1, 0, false);
        declareFunction(me, "rkf_sd_prompter_isg", "RKF-SD-PROMPTER-ISG", 1, 0, false);
        declareFunction(me, "rkf_sd_prompter_plist", "RKF-SD-PROMPTER-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_seed_term", "_CSETF-RKF-SD-PROMPTER-SEED-TERM", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_mt", "_CSETF-RKF-SD-PROMPTER-MT", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_used_prompts", "_CSETF-RKF-SD-PROMPTER-USED-PROMPTS", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_unused_prompts", "_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_tactics", "_CSETF-RKF-SD-PROMPTER-TACTICS", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_isg", "_CSETF-RKF-SD-PROMPTER-ISG", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompter_plist", "_CSETF-RKF-SD-PROMPTER-PLIST", 2, 0, false);
        declareFunction(me, "make_rkf_salient_descriptor_prompter", "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPTER", 0, 1, false);
        declareFunction(me, "visit_defstruct_rkf_salient_descriptor_prompter", "VISIT-DEFSTRUCT-RKF-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rkf_salient_descriptor_prompter_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD", 2, 0, false);
        declareFunction(me, "print_rkf_sd_prompter", "PRINT-RKF-SD-PROMPTER", 3, 0, false);
        declareFunction(me, "new_rkf_salient_descriptor_prompter", "NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompter_lookup", "RKF-SALIENT-DESCRIPTOR-PROMPTER-LOOKUP", 2, 1, false);
        declareFunction(me, "rkf_salient_descriptor_prompter_set", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SET", 3, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompter_clear", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CLEAR", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompter_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-UNUSED-PROMPTS", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_print_function_trampoline", "RKF-SALIENT-DESCRIPTOR-PROMPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_p", "RKF-SALIENT-DESCRIPTOR-PROMPT-P", 1, 0, false);
        new rkf_salient_descriptor_datastructures.$rkf_salient_descriptor_prompt_p$UnaryFunction();
        declareFunction(me, "rkf_sd_prompt_id", "RKF-SD-PROMPT-ID", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_subprompts", "RKF-SD-PROMPT-SUBPROMPTS", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_formula", "RKF-SD-PROMPT-FORMULA", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_justification", "RKF-SD-PROMPT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_deducible_cnfs", "RKF-SD-PROMPT-DEDUCIBLE-CNFS", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_examples", "RKF-SD-PROMPT-EXAMPLES", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_salient_property_sentence", "RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_prompter", "RKF-SD-PROMPT-PROMPTER", 1, 0, false);
        declareFunction(me, "rkf_sd_prompt_tactic", "RKF-SD-PROMPT-TACTIC", 1, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_id", "_CSETF-RKF-SD-PROMPT-ID", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_subprompts", "_CSETF-RKF-SD-PROMPT-SUBPROMPTS", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_formula", "_CSETF-RKF-SD-PROMPT-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_justification", "_CSETF-RKF-SD-PROMPT-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_deducible_cnfs", "_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_examples", "_CSETF-RKF-SD-PROMPT-EXAMPLES", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_salient_property_sentence", "_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_prompter", "_CSETF-RKF-SD-PROMPT-PROMPTER", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_prompt_tactic", "_CSETF-RKF-SD-PROMPT-TACTIC", 2, 0, false);
        declareFunction(me, "make_rkf_salient_descriptor_prompt", "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPT", 0, 1, false);
        declareFunction(me, "visit_defstruct_rkf_salient_descriptor_prompt", "VISIT-DEFSTRUCT-RKF-SALIENT-DESCRIPTOR-PROMPT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rkf_salient_descriptor_prompt_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD", 2, 0, false);
        declareFunction(me, "print_rkf_sd_prompt", "PRINT-RKF-SD-PROMPT", 3, 0, false);
        declareFunction(me, "new_rkf_sd_prompt", "NEW-RKF-SD-PROMPT", 0, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_formula", "RKF-SD-PROMPT-SET-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_tactic", "RKF-SD-PROMPT-SET-TACTIC", 2, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_justification", "RKF-SD-PROMPT-SET-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_salient_property_sentence", "RKF-SD-PROMPT-SET-SALIENT-PROPERTY-SENTENCE", 2, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_subprompts", "RKF-SD-PROMPT-SET-SUBPROMPTS", 2, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_id", "RKF-SD-PROMPT-SET-ID", 2, 0, false);
        declareFunction(me, "rkf_sd_prompt_set_prompter", "RKF-SD-PROMPT-SET-PROMPTER", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_id", "RKF-SALIENT-DESCRIPTOR-PROMPT-ID", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_formula", "RKF-SALIENT-DESCRIPTOR-PROMPT-FORMULA", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_choices", "RKF-SALIENT-DESCRIPTOR-PROMPT-CHOICES", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_term_count", "RKF-SALIENT-DESCRIPTOR-PROMPT-TERM-COUNT", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_type", "RKF-SALIENT-DESCRIPTOR-PROMPT-TYPE", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_prompter", "RKF-SALIENT-DESCRIPTOR-PROMPT-PROMPTER", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_justification", "RKF-SALIENT-DESCRIPTOR-PROMPT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_subprompts", "RKF-SALIENT-DESCRIPTOR-PROMPT-SUBPROMPTS", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_salient_property_sentence", "RKF-SALIENT-DESCRIPTOR-PROMPT-SALIENT-PROPERTY-SENTENCE", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_prompt_deducible_cnfs", "RKF-SALIENT-DESCRIPTOR-PROMPT-DEDUCIBLE-CNFS", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_print_function_trampoline", "RKF-SD-RULE-INFO-SCORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_p", "RKF-SD-RULE-INFO-SCORE-P", 1, 0, false);
        new rkf_salient_descriptor_datastructures.$rkf_sd_rule_info_score_p$UnaryFunction();
        declareFunction(me, "rkf_sd_rule_info_score_seed_term_in_pos_litsP", "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_seed_term_in_neg_litsP", "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_var_count", "RKF-SD-RULE-INFO-SCORE-VAR-COUNT", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_neg_lit_count", "RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_pos_lit_count", "RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_pos_lit_quality_score", "RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_mt_generality_score", "RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE", 1, 0, false);
        declareFunction(me, "rkf_sd_rule_info_score_plist", "RKF-SD-RULE-INFO-SCORE-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP", "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP", "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_var_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_neg_lit_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_pos_lit_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_pos_lit_quality_score", "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_mt_generality_score", "_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_rule_info_score_plist", "_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST", 2, 0, false);
        declareFunction(me, "make_rkf_sd_rule_info_score", "MAKE-RKF-SD-RULE-INFO-SCORE", 0, 1, false);
        declareFunction(me, "visit_defstruct_rkf_sd_rule_info_score", "VISIT-DEFSTRUCT-RKF-SD-RULE-INFO-SCORE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rkf_sd_rule_info_score_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SD-RULE-INFO-SCORE-METHOD", 2, 0, false);
        declareFunction(me, "new_rkf_sd_rule_info_score", "NEW-RKF-SD-RULE-INFO-SCORE", 0, 0, false);
        declareFunction(me, "print_rkf_sd_rule_info_score", "PRINT-RKF-SD-RULE-INFO-SCORE", 1, 2, false);
        declareFunction(me, "rkf_sd_example_print_function_trampoline", "RKF-SD-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rkf_sd_example_p", "RKF-SD-EXAMPLE-P", 1, 0, false);
        new rkf_salient_descriptor_datastructures.$rkf_sd_example_p$UnaryFunction();
        declareFunction(me, "rkf_sd_example_type", "RKF-SD-EXAMPLE-TYPE", 1, 0, false);
        declareFunction(me, "rkf_sd_example_term", "RKF-SD-EXAMPLE-TERM", 1, 0, false);
        declareFunction(me, "rkf_sd_example_supports", "RKF-SD-EXAMPLE-SUPPORTS", 1, 0, false);
        declareFunction(me, "rkf_sd_example_focus_term_analog", "RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG", 1, 0, false);
        declareFunction(me, "_csetf_rkf_sd_example_type", "_CSETF-RKF-SD-EXAMPLE-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_example_term", "_CSETF-RKF-SD-EXAMPLE-TERM", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_example_supports", "_CSETF-RKF-SD-EXAMPLE-SUPPORTS", 2, 0, false);
        declareFunction(me, "_csetf_rkf_sd_example_focus_term_analog", "_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG", 2, 0, false);
        declareFunction(me, "make_rkf_sd_example", "MAKE-RKF-SD-EXAMPLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_rkf_sd_example", "VISIT-DEFSTRUCT-RKF-SD-EXAMPLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rkf_sd_example_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SD-EXAMPLE-METHOD", 2, 0, false);
        declareFunction(me, "rkf_sd_example_type_p", "RKF-SD-EXAMPLE-TYPE-P", 1, 0, false);
        declareFunction(me, "new_rkf_sd_example", "NEW-RKF-SD-EXAMPLE", 0, 4, false);
        declareMacro(me, "destructure_rkf_sd_example", "DESTRUCTURE-RKF-SD-EXAMPLE");
        declareFunction(me, "print_rkf_sd_example", "PRINT-RKF-SD-EXAMPLE", 1, 2, false);
        declareFunction(me, "rkf_sd_precedent_example_p", "RKF-SD-PRECEDENT-EXAMPLE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_salient_descriptor_datastructures_file() {
        defconstant("*DTP-RKF-SALIENT-DESCRIPTOR-PROMPTER*", RKF_SALIENT_DESCRIPTOR_PROMPTER);
        defconstant("*DTP-RKF-SALIENT-DESCRIPTOR-PROMPT*", RKF_SALIENT_DESCRIPTOR_PROMPT);
        defconstant("*DTP-RKF-SD-RULE-INFO-SCORE*", RKF_SD_RULE_INFO_SCORE);
        defconstant("*DTP-RKF-SD-EXAMPLE*", RKF_SD_EXAMPLE);
        defconstant("*RKF-SD-EXAMPLE-TYPES*", $list152);
        return NIL;
    }

    public static SubLObject setup_rkf_salient_descriptor_datastructures_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), symbol_function(RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RKF_SD_PROMPTER_SEED_TERM, _CSETF_RKF_SD_PROMPTER_SEED_TERM);
        def_csetf(RKF_SD_PROMPTER_MT, _CSETF_RKF_SD_PROMPTER_MT);
        def_csetf(RKF_SD_PROMPTER_USED_PROMPTS, _CSETF_RKF_SD_PROMPTER_USED_PROMPTS);
        def_csetf(RKF_SD_PROMPTER_UNUSED_PROMPTS, _CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS);
        def_csetf(RKF_SD_PROMPTER_TACTICS, _CSETF_RKF_SD_PROMPTER_TACTICS);
        def_csetf(RKF_SD_PROMPTER_ISG, _CSETF_RKF_SD_PROMPTER_ISG);
        def_csetf(RKF_SD_PROMPTER_PLIST, _CSETF_RKF_SD_PROMPTER_PLIST);
        identity(RKF_SALIENT_DESCRIPTOR_PROMPTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), symbol_function(RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list50);
        def_csetf(RKF_SD_PROMPT_ID, _CSETF_RKF_SD_PROMPT_ID);
        def_csetf(RKF_SD_PROMPT_SUBPROMPTS, _CSETF_RKF_SD_PROMPT_SUBPROMPTS);
        def_csetf(RKF_SD_PROMPT_FORMULA, _CSETF_RKF_SD_PROMPT_FORMULA);
        def_csetf(RKF_SD_PROMPT_JUSTIFICATION, _CSETF_RKF_SD_PROMPT_JUSTIFICATION);
        def_csetf(RKF_SD_PROMPT_DEDUCIBLE_CNFS, _CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS);
        def_csetf(RKF_SD_PROMPT_EXAMPLES, _CSETF_RKF_SD_PROMPT_EXAMPLES);
        def_csetf(RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE, _CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE);
        def_csetf(RKF_SD_PROMPT_PROMPTER, _CSETF_RKF_SD_PROMPT_PROMPTER);
        def_csetf(RKF_SD_PROMPT_TACTIC, _CSETF_RKF_SD_PROMPT_TACTIC);
        identity(RKF_SALIENT_DESCRIPTOR_PROMPT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_sd_rule_info_score$.getGlobalValue(), symbol_function(RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list94);
        def_csetf($sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_, $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_);
        def_csetf($sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_, $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_);
        def_csetf(RKF_SD_RULE_INFO_SCORE_VAR_COUNT, _CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT);
        def_csetf(RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT, _CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT);
        def_csetf(RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT, _CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT);
        def_csetf(RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE, _CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE);
        def_csetf(RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE, _CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE);
        def_csetf(RKF_SD_RULE_INFO_SCORE_PLIST, _CSETF_RKF_SD_RULE_INFO_SCORE_PLIST);
        identity(RKF_SD_RULE_INFO_SCORE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_sd_rule_info_score$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_sd_example$.getGlobalValue(), symbol_function(RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list137);
        def_csetf(RKF_SD_EXAMPLE_TYPE, _CSETF_RKF_SD_EXAMPLE_TYPE);
        def_csetf(RKF_SD_EXAMPLE_TERM, _CSETF_RKF_SD_EXAMPLE_TERM);
        def_csetf(RKF_SD_EXAMPLE_SUPPORTS, _CSETF_RKF_SD_EXAMPLE_SUPPORTS);
        def_csetf(RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG, _CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG);
        identity(RKF_SD_EXAMPLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_sd_example$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_salient_descriptor_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_salient_descriptor_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_salient_descriptor_datastructures_file();
    }

    

    public static final class $rkf_salient_descriptor_prompter_native extends SubLStructNative {
        public SubLObject $seed_term;

        public SubLObject $mt;

        public SubLObject $used_prompts;

        public SubLObject $unused_prompts;

        public SubLObject $tactics;

        public SubLObject $isg;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        private $rkf_salient_descriptor_prompter_native() {
            this.$seed_term = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$used_prompts = Lisp.NIL;
            this.$unused_prompts = Lisp.NIL;
            this.$tactics = Lisp.NIL;
            this.$isg = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$seed_term;
        }

        @Override
        public SubLObject getField3() {
            return this.$mt;
        }

        @Override
        public SubLObject getField4() {
            return this.$used_prompts;
        }

        @Override
        public SubLObject getField5() {
            return this.$unused_prompts;
        }

        @Override
        public SubLObject getField6() {
            return this.$tactics;
        }

        @Override
        public SubLObject getField7() {
            return this.$isg;
        }

        @Override
        public SubLObject getField8() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$seed_term = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$used_prompts = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$unused_prompts = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$tactics = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$isg = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative($rkf_salient_descriptor_prompter_native.class, RKF_SALIENT_DESCRIPTOR_PROMPTER, RKF_SALIENT_DESCRIPTOR_PROMPTER_P, $list2, $list3, new String[]{ "$seed_term", "$mt", "$used_prompts", "$unused_prompts", "$tactics", "$isg", "$plist" }, $list4, $list5, PRINT_RKF_SD_PROMPTER);
        }
    }

    public static final class $rkf_salient_descriptor_prompter_p$UnaryFunction extends UnaryFunction {
        public $rkf_salient_descriptor_prompter_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-SALIENT-DESCRIPTOR-PROMPTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_salient_descriptor_prompter_p(arg1);
        }
    }

    public static final class $rkf_salient_descriptor_prompt_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $subprompts;

        public SubLObject $formula;

        public SubLObject $justification;

        public SubLObject $deducible_cnfs;

        public SubLObject $examples;

        public SubLObject $salient_property_sentence;

        public SubLObject $prompter;

        public SubLObject $tactic;

        private static final SubLStructDeclNative structDecl;

        private $rkf_salient_descriptor_prompt_native() {
            this.$id = Lisp.NIL;
            this.$subprompts = Lisp.NIL;
            this.$formula = Lisp.NIL;
            this.$justification = Lisp.NIL;
            this.$deducible_cnfs = Lisp.NIL;
            this.$examples = Lisp.NIL;
            this.$salient_property_sentence = Lisp.NIL;
            this.$prompter = Lisp.NIL;
            this.$tactic = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$subprompts;
        }

        @Override
        public SubLObject getField4() {
            return this.$formula;
        }

        @Override
        public SubLObject getField5() {
            return this.$justification;
        }

        @Override
        public SubLObject getField6() {
            return this.$deducible_cnfs;
        }

        @Override
        public SubLObject getField7() {
            return this.$examples;
        }

        @Override
        public SubLObject getField8() {
            return this.$salient_property_sentence;
        }

        @Override
        public SubLObject getField9() {
            return this.$prompter;
        }

        @Override
        public SubLObject getField10() {
            return this.$tactic;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$subprompts = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$justification = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$deducible_cnfs = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$examples = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$salient_property_sentence = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$prompter = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$tactic = value;
        }

        static {
            structDecl = makeStructDeclNative($rkf_salient_descriptor_prompt_native.class, RKF_SALIENT_DESCRIPTOR_PROMPT, RKF_SALIENT_DESCRIPTOR_PROMPT_P, $list44, $list45, new String[]{ "$id", "$subprompts", "$formula", "$justification", "$deducible_cnfs", "$examples", "$salient_property_sentence", "$prompter", "$tactic" }, $list46, $list47, PRINT_RKF_SD_PROMPT);
        }
    }

    public static final class $rkf_salient_descriptor_prompt_p$UnaryFunction extends UnaryFunction {
        public $rkf_salient_descriptor_prompt_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-SALIENT-DESCRIPTOR-PROMPT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_salient_descriptor_prompt_p(arg1);
        }
    }

    public static final class $rkf_sd_rule_info_score_native extends SubLStructNative {
        public SubLObject $seed_term_in_pos_litsP;

        public SubLObject $seed_term_in_neg_litsP;

        public SubLObject $var_count;

        public SubLObject $neg_lit_count;

        public SubLObject $pos_lit_count;

        public SubLObject $pos_lit_quality_score;

        public SubLObject $mt_generality_score;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        private $rkf_sd_rule_info_score_native() {
            this.$seed_term_in_pos_litsP = Lisp.NIL;
            this.$seed_term_in_neg_litsP = Lisp.NIL;
            this.$var_count = Lisp.NIL;
            this.$neg_lit_count = Lisp.NIL;
            this.$pos_lit_count = Lisp.NIL;
            this.$pos_lit_quality_score = Lisp.NIL;
            this.$mt_generality_score = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$seed_term_in_pos_litsP;
        }

        @Override
        public SubLObject getField3() {
            return this.$seed_term_in_neg_litsP;
        }

        @Override
        public SubLObject getField4() {
            return this.$var_count;
        }

        @Override
        public SubLObject getField5() {
            return this.$neg_lit_count;
        }

        @Override
        public SubLObject getField6() {
            return this.$pos_lit_count;
        }

        @Override
        public SubLObject getField7() {
            return this.$pos_lit_quality_score;
        }

        @Override
        public SubLObject getField8() {
            return this.$mt_generality_score;
        }

        @Override
        public SubLObject getField9() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$seed_term_in_pos_litsP = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$seed_term_in_neg_litsP = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$var_count = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$neg_lit_count = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$pos_lit_count = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$pos_lit_quality_score = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$mt_generality_score = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative($rkf_sd_rule_info_score_native.class, RKF_SD_RULE_INFO_SCORE, RKF_SD_RULE_INFO_SCORE_P, $list88, $list89, new String[]{ "$seed_term_in_pos_litsP", "$seed_term_in_neg_litsP", "$var_count", "$neg_lit_count", "$pos_lit_count", "$pos_lit_quality_score", "$mt_generality_score", "$plist" }, $list90, $list91, PRINT_RKF_SD_RULE_INFO_SCORE);
        }
    }

    public static final class $rkf_sd_rule_info_score_p$UnaryFunction extends UnaryFunction {
        public $rkf_sd_rule_info_score_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-SD-RULE-INFO-SCORE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_sd_rule_info_score_p(arg1);
        }
    }

    public static final class $rkf_sd_example_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $term;

        public SubLObject $supports;

        public SubLObject $focus_term_analog;

        private static final SubLStructDeclNative structDecl;

        private $rkf_sd_example_native() {
            this.$type = Lisp.NIL;
            this.$term = Lisp.NIL;
            this.$supports = Lisp.NIL;
            this.$focus_term_analog = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$term;
        }

        @Override
        public SubLObject getField4() {
            return this.$supports;
        }

        @Override
        public SubLObject getField5() {
            return this.$focus_term_analog;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$term = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$focus_term_analog = value;
        }

        static {
            structDecl = makeStructDeclNative($rkf_sd_example_native.class, RKF_SD_EXAMPLE, RKF_SD_EXAMPLE_P, $list131, $list132, new String[]{ "$type", "$term", "$supports", "$focus_term_analog" }, $list133, $list134, PRINT_RKF_SD_EXAMPLE);
        }
    }

    public static final class $rkf_sd_example_p$UnaryFunction extends UnaryFunction {
        public $rkf_sd_example_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-SD-EXAMPLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_sd_example_p(arg1);
        }
    }
}

/**
 * Total time: 295 ms
 */
