package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class pph_data_structures extends SubLTranslatedFile {
    public static final SubLFile me = new pph_data_structures();

    public static final String myName = "com.cyc.cycjava.cycl.pph_data_structures";

    public static final String myFingerPrint = "552c5dec1262513de9c5f4ff1ea709771aa07d303ff0bd3fb364c48a43acb20e";

    // deflexical
    private static final SubLSymbol $relation_cardinality$ = makeSymbol("*RELATION-CARDINALITY*");



    // deflexical
    private static final SubLSymbol $gen_template_store_initializedP$ = makeSymbol("*GEN-TEMPLATE-STORE-INITIALIZED?*");

    // defconstant
    public static final SubLSymbol $dtp_generation_template$ = makeSymbol("*DTP-GENERATION-TEMPLATE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_generation_template$ = makeSymbol("*CFASL-OPCODE-GENERATION-TEMPLATE*");

    // defconstant
    public static final SubLSymbol $dtp_pph_phrase_agr$ = makeSymbol("*DTP-PPH-PHRASE-AGR*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_pph_phrase_agr$ = makeSymbol("*CFASL-OPCODE-PPH-PHRASE-AGR*");

    // defconstant
    public static final SubLSymbol $dtp_paraphrase_phrase_info_bundle$ = makeSymbol("*DTP-PARAPHRASE-PHRASE-INFO-BUNDLE*");

    // deflexical
    private static final SubLSymbol $pph_empty_info_vector$ = makeSymbol("*PPH-EMPTY-INFO-VECTOR*");

    // defconstant
    public static final SubLSymbol $dtp_pph_phrase_output_item$ = makeSymbol("*DTP-PPH-PHRASE-OUTPUT-ITEM*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_pph_oi$ = makeSymbol("*CFASL-OPCODE-PPH-OI*");

    // deflexical
    public static final SubLSymbol $a_lot_of_new_pph_phrases$ = makeSymbol("*A-LOT-OF-NEW-PPH-PHRASES*");

    // deflexical
    public static final SubLSymbol $a_whole_lot_of_new_pph_phrases$ = makeSymbol("*A-WHOLE-LOT-OF-NEW-PPH-PHRASES*");

    // deflexical
    public static final SubLSymbol $a_shitload_of_new_pph_phrases$ = makeSymbol("*A-SHITLOAD-OF-NEW-PPH-PHRASES*");

    // deflexical
    private static final SubLSymbol $pph_info_vector_slots$ = makeSymbol("*PPH-INFO-VECTOR-SLOTS*");

    // deflexical
    public static final SubLSymbol $pph_info_vector_unspecified_value$ = makeSymbol("*PPH-INFO-VECTOR-UNSPECIFIED-VALUE*");



    // deflexical
    public static final SubLSymbol $pph_phrase_id_index_lock$ = makeSymbol("*PPH-PHRASE-ID-INDEX-LOCK*");

    // deflexical
    private static final SubLSymbol $pph_listified_vector_marker$ = makeSymbol("*PPH-LISTIFIED-VECTOR-MARKER*");

    // deflexical
    private static final SubLSymbol $pph_phrase_shell_marker$ = makeSymbol("*PPH-PHRASE-SHELL-MARKER*");

    // defconstant
    public static final SubLSymbol $dtp_pph_phrase_template_generator$ = makeSymbol("*DTP-PPH-PHRASE-TEMPLATE-GENERATOR*");



    // defconstant
    public static final SubLSymbol $dtp_pph_phrase_output_list_iterator$ = makeSymbol("*DTP-PPH-PHRASE-OUTPUT-LIST-ITERATOR*");

    private static final SubLString $str0$_Revision__148135__ = makeString("$Revision: 148135 $");

    private static final SubLInteger $int$12000 = makeInteger(12000);

    public static final SubLSymbol $gen_template_store$ = makeSymbol("*GEN-TEMPLATE-STORE*");

    public static final SubLSymbol $sym3$_GEN_TEMPLATE_STORE_INITIALIZED__ = makeSymbol("*GEN-TEMPLATE-STORE-INITIALIZED?*");

    private static final SubLString $str4$Gen_Template_Store_not_initialize = makeString("Gen-Template Store not initialized! Initializing now.");

    private static final SubLString $str5$Gen_Template_Store_unacceptably_s = makeString("Gen-Template Store unacceptably stale! Initializing now.");







    private static final SubLSymbol GENERATION_TEMPLATE = makeSymbol("GENERATION-TEMPLATE");

    private static final SubLSymbol GENERATION_TEMPLATE_P = makeSymbol("GENERATION-TEMPLATE-P");

    public static final SubLList $list11 = list(makeSymbol("PHRASE"), makeSymbol("CONSTRAINT"), makeSymbol("ASSERTION"));

    public static final SubLList $list12 = list(makeKeyword("PHRASE"), makeKeyword("CONSTRAINT"), makeKeyword("ASSERTION"));

    private static final SubLList $list13 = list(makeSymbol("GEN-TEMPLATE-PHRASE"), makeSymbol("GEN-TEMPLATE-CONSTRAINT"), makeSymbol("GEN-TEMPLATE-ASSERTION"));

    private static final SubLList $list14 = list(makeSymbol("_CSETF-GEN-TEMPLATE-PHRASE"), makeSymbol("_CSETF-GEN-TEMPLATE-CONSTRAINT"), makeSymbol("_CSETF-GEN-TEMPLATE-ASSERTION"));

    private static final SubLSymbol PPRINT_GEN_TEMPLATE = makeSymbol("PPRINT-GEN-TEMPLATE");

    private static final SubLSymbol GENERATION_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GENERATION-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GENERATION-TEMPLATE-P"));

    private static final SubLSymbol GEN_TEMPLATE_PHRASE = makeSymbol("GEN-TEMPLATE-PHRASE");

    private static final SubLSymbol _CSETF_GEN_TEMPLATE_PHRASE = makeSymbol("_CSETF-GEN-TEMPLATE-PHRASE");

    private static final SubLSymbol GEN_TEMPLATE_CONSTRAINT = makeSymbol("GEN-TEMPLATE-CONSTRAINT");

    private static final SubLSymbol _CSETF_GEN_TEMPLATE_CONSTRAINT = makeSymbol("_CSETF-GEN-TEMPLATE-CONSTRAINT");

    private static final SubLSymbol GEN_TEMPLATE_ASSERTION = makeSymbol("GEN-TEMPLATE-ASSERTION");

    private static final SubLSymbol _CSETF_GEN_TEMPLATE_ASSERTION = makeSymbol("_CSETF-GEN-TEMPLATE-ASSERTION");







    private static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_GENERATION_TEMPLATE = makeSymbol("MAKE-GENERATION-TEMPLATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GENERATION_TEMPLATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GENERATION-TEMPLATE-METHOD");

    private static final SubLSymbol SXHASH_GENERATION_TEMPLATE_METHOD = makeSymbol("SXHASH-GENERATION-TEMPLATE-METHOD");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");



    private static final SubLString $str36$__GEN_TEMPLATE__S_ = makeString("#<GEN-TEMPLATE ~S>");

    private static final SubLString $str37$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str38$__ = makeString(") ");

    private static final SubLString $str39$Can_t_get_assertion_from__S___Fou = makeString("Can't get assertion from ~S~% Found ~S");

    private static final SubLObject $$ParaphraseMt = reader_make_constant_shell(makeString("ParaphraseMt"));

    private static final SubLString $str41$Can_t_get_mt_from__S___Found__S = makeString("Can't get mt from ~S~% Found ~S");

    private static final SubLInteger $int$72 = makeInteger(72);

    private static final SubLSymbol CFASL_INPUT_GENERATION_TEMPLATE = makeSymbol("CFASL-INPUT-GENERATION-TEMPLATE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_GENERATION_TEMPLATE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-GENERATION-TEMPLATE-METHOD");

    private static final SubLSymbol PPH_PHRASE_AGR = makeSymbol("PPH-PHRASE-AGR");

    private static final SubLSymbol PPH_PHRASE_AGR_P = makeSymbol("PPH-PHRASE-AGR-P");

    private static final SubLList $list47 = list(makeSymbol("ABSOLUTE-CONSTRAINT"), makeSymbol("RELATIVE-CONSTRAINT"));

    private static final SubLList $list48 = list(makeKeyword("ABSOLUTE-CONSTRAINT"), makeKeyword("RELATIVE-CONSTRAINT"));

    private static final SubLList $list49 = list(makeSymbol("PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT"), makeSymbol("PPH-PHRASE-AGR-RELATIVE-CONSTRAINT"));

    private static final SubLList $list50 = list(makeSymbol("_CSETF-PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT"), makeSymbol("_CSETF-PPH-PHRASE-AGR-RELATIVE-CONSTRAINT"));

    private static final SubLSymbol PPRINT_PPH_PHRASE_AGR = makeSymbol("PPRINT-PPH-PHRASE-AGR");

    private static final SubLSymbol PPH_PHRASE_AGR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-PHRASE-AGR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list53 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-PHRASE-AGR-P"));

    private static final SubLSymbol PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT = makeSymbol("PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT");

    private static final SubLSymbol _CSETF_PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT = makeSymbol("_CSETF-PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT");

    private static final SubLSymbol PPH_PHRASE_AGR_RELATIVE_CONSTRAINT = makeSymbol("PPH-PHRASE-AGR-RELATIVE-CONSTRAINT");

    private static final SubLSymbol _CSETF_PPH_PHRASE_AGR_RELATIVE_CONSTRAINT = makeSymbol("_CSETF-PPH-PHRASE-AGR-RELATIVE-CONSTRAINT");





    private static final SubLSymbol MAKE_PPH_PHRASE_AGR = makeSymbol("MAKE-PPH-PHRASE-AGR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_AGR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-AGR-METHOD");

    private static final SubLString $str62$_AGR = makeString("<AGR");

    private static final SubLString $str63$___S_ = makeString(" (~S ");

    private static final SubLString $str64$_PPH_PHRASE__A_______ = makeString("<PPH-PHRASE ~A [...]>");

    private static final SubLString $str65$_A = makeString("~A");

    private static final SubLString $str66$_ = makeString(")");

    private static final SubLString $str67$_ = makeString(">");

    private static final SubLInteger $int$73 = makeInteger(73);

    private static final SubLSymbol CFASL_INPUT_PPH_PHRASE_AGR = makeSymbol("CFASL-INPUT-PPH-PHRASE-AGR");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PPH_PHRASE_AGR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PPH-PHRASE-AGR-METHOD");

    private static final SubLString $str71$Could_not_find_pph_phrase_with_su = makeString("Could not find pph-phrase with suid ~A");

    private static final SubLSymbol PARAPHRASE_PHRASE_INFO_BUNDLE = makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE");

    private static final SubLSymbol PARAPHRASE_PHRASE_INFO_BUNDLE_P = makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE-P");

    private static final SubLList $list74 = list(makeSymbol("CYCL"), makeSymbol("AGR"), makeSymbol("JUSTIFICATION"), makeSymbol("OUTPUT-LIST"), makeSymbol("ARG-POSITION-MAP"), makeSymbol("OTHER"));

    private static final SubLList $list75 = list(makeKeyword("CYCL"), makeKeyword("AGR"), makeKeyword("JUSTIFICATION"), makeKeyword("OUTPUT-LIST"), makeKeyword("ARG-POSITION-MAP"), makeKeyword("OTHER"));

    private static final SubLList $list76 = list(makeSymbol("PPH-PHRASE-INFO-CYCL"), makeSymbol("PPH-PHRASE-INFO-AGR"), makeSymbol("PPH-PHRASE-INFO-JUSTIFICATION"), makeSymbol("PPH-PHRASE-INFO-OUTPUT-LIST"), makeSymbol("PPH-PHRASE-INFO-ARG-POSITION-MAP"), makeSymbol("PPH-PHRASE-INFO-OTHER"));

    private static final SubLList $list77 = list(makeSymbol("_CSETF-PPH-PHRASE-INFO-CYCL"), makeSymbol("_CSETF-PPH-PHRASE-INFO-AGR"), makeSymbol("_CSETF-PPH-PHRASE-INFO-JUSTIFICATION"), makeSymbol("_CSETF-PPH-PHRASE-INFO-OUTPUT-LIST"), makeSymbol("_CSETF-PPH-PHRASE-INFO-ARG-POSITION-MAP"), makeSymbol("_CSETF-PPH-PHRASE-INFO-OTHER"));

    private static final SubLSymbol PPRINT_PPH_PHRASE_INFO_BUNDLE = makeSymbol("PPRINT-PPH-PHRASE-INFO-BUNDLE");

    private static final SubLSymbol PARAPHRASE_PHRASE_INFO_BUNDLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list80 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARAPHRASE-PHRASE-INFO-BUNDLE-P"));

    private static final SubLSymbol PPH_PHRASE_INFO_CYCL = makeSymbol("PPH-PHRASE-INFO-CYCL");

    private static final SubLSymbol _CSETF_PPH_PHRASE_INFO_CYCL = makeSymbol("_CSETF-PPH-PHRASE-INFO-CYCL");

    private static final SubLSymbol PPH_PHRASE_INFO_AGR = makeSymbol("PPH-PHRASE-INFO-AGR");

    private static final SubLSymbol _CSETF_PPH_PHRASE_INFO_AGR = makeSymbol("_CSETF-PPH-PHRASE-INFO-AGR");

    private static final SubLSymbol PPH_PHRASE_INFO_JUSTIFICATION = makeSymbol("PPH-PHRASE-INFO-JUSTIFICATION");

    private static final SubLSymbol _CSETF_PPH_PHRASE_INFO_JUSTIFICATION = makeSymbol("_CSETF-PPH-PHRASE-INFO-JUSTIFICATION");

    private static final SubLSymbol PPH_PHRASE_INFO_OUTPUT_LIST = makeSymbol("PPH-PHRASE-INFO-OUTPUT-LIST");

    private static final SubLSymbol _CSETF_PPH_PHRASE_INFO_OUTPUT_LIST = makeSymbol("_CSETF-PPH-PHRASE-INFO-OUTPUT-LIST");

    private static final SubLSymbol PPH_PHRASE_INFO_ARG_POSITION_MAP = makeSymbol("PPH-PHRASE-INFO-ARG-POSITION-MAP");

    private static final SubLSymbol _CSETF_PPH_PHRASE_INFO_ARG_POSITION_MAP = makeSymbol("_CSETF-PPH-PHRASE-INFO-ARG-POSITION-MAP");

    private static final SubLSymbol PPH_PHRASE_INFO_OTHER = makeSymbol("PPH-PHRASE-INFO-OTHER");

    private static final SubLSymbol _CSETF_PPH_PHRASE_INFO_OTHER = makeSymbol("_CSETF-PPH-PHRASE-INFO-OTHER");









    private static final SubLSymbol $ARG_POSITION_MAP = makeKeyword("ARG-POSITION-MAP");



    private static final SubLSymbol MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE = makeSymbol("MAKE-PARAPHRASE-PHRASE-INFO-BUNDLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARAPHRASE_PHRASE_INFO_BUNDLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARAPHRASE-PHRASE-INFO-BUNDLE-METHOD");

    private static final SubLSymbol $PPH_EMPTY_INFO_VECTOR = makeKeyword("PPH-EMPTY-INFO-VECTOR");

    private static final SubLList $list102 = list(list(makeSymbol("PROPERTY"), makeSymbol("VALUE"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym103$PLIST = makeUninternedSymbol("PLIST");



    private static final SubLSymbol PPH_PHRASE_PLIST = makeSymbol("PPH-PHRASE-PLIST");

    private static final SubLSymbol DO_PLIST = makeSymbol("DO-PLIST");

    private static final SubLString $str107$_S_should_be__S__not__S = makeString("~S should be ~S, not ~S");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM = makeSymbol("PPH-PHRASE-OUTPUT-ITEM");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_P = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-P");

    private static final SubLList $list110 = list(makeSymbol("STRING"), makeSymbol("ARG-POSITION"), makeSymbol("CYCL"), makeSymbol("HTML-OPEN-TAG"), makeSymbol("HTML-CLOSE-TAG"), makeSymbol("AGR"));

    private static final SubLList $list111 = list(makeKeyword("STRING"), makeKeyword("ARG-POSITION"), makeKeyword("CYCL"), makeKeyword("HTML-OPEN-TAG"), makeKeyword("HTML-CLOSE-TAG"), makeKeyword("AGR"));

    private static final SubLList $list112 = list(makeSymbol("PPH-OI-STRING"), makeSymbol("PPH-OI-ARG-POSITION"), makeSymbol("PPH-OI-CYCL"), makeSymbol("PPH-OI-HTML-OPEN-TAG"), makeSymbol("PPH-OI-HTML-CLOSE-TAG"), makeSymbol("PPH-OI-AGR"));

    private static final SubLList $list113 = list(makeSymbol("_CSETF-PPH-OI-STRING"), makeSymbol("_CSETF-PPH-OI-ARG-POSITION"), makeSymbol("_CSETF-PPH-OI-CYCL"), makeSymbol("_CSETF-PPH-OI-HTML-OPEN-TAG"), makeSymbol("_CSETF-PPH-OI-HTML-CLOSE-TAG"), makeSymbol("_CSETF-PPH-OI-AGR"));

    private static final SubLSymbol PPRINT_PPH_PHRASE_OUTPUT_ITEM = makeSymbol("PPRINT-PPH-PHRASE-OUTPUT-ITEM");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list116 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-PHRASE-OUTPUT-ITEM-P"));

    private static final SubLSymbol PPH_OI_STRING = makeSymbol("PPH-OI-STRING");

    private static final SubLSymbol _CSETF_PPH_OI_STRING = makeSymbol("_CSETF-PPH-OI-STRING");

    private static final SubLSymbol PPH_OI_ARG_POSITION = makeSymbol("PPH-OI-ARG-POSITION");

    private static final SubLSymbol _CSETF_PPH_OI_ARG_POSITION = makeSymbol("_CSETF-PPH-OI-ARG-POSITION");

    private static final SubLSymbol PPH_OI_CYCL = makeSymbol("PPH-OI-CYCL");

    private static final SubLSymbol _CSETF_PPH_OI_CYCL = makeSymbol("_CSETF-PPH-OI-CYCL");

    private static final SubLSymbol PPH_OI_HTML_OPEN_TAG = makeSymbol("PPH-OI-HTML-OPEN-TAG");

    private static final SubLSymbol _CSETF_PPH_OI_HTML_OPEN_TAG = makeSymbol("_CSETF-PPH-OI-HTML-OPEN-TAG");

    private static final SubLSymbol PPH_OI_HTML_CLOSE_TAG = makeSymbol("PPH-OI-HTML-CLOSE-TAG");

    private static final SubLSymbol _CSETF_PPH_OI_HTML_CLOSE_TAG = makeSymbol("_CSETF-PPH-OI-HTML-CLOSE-TAG");

    private static final SubLSymbol PPH_OI_AGR = makeSymbol("PPH-OI-AGR");

    private static final SubLSymbol _CSETF_PPH_OI_AGR = makeSymbol("_CSETF-PPH-OI-AGR");





    private static final SubLSymbol $HTML_OPEN_TAG = makeKeyword("HTML-OPEN-TAG");

    private static final SubLSymbol $HTML_CLOSE_TAG = makeKeyword("HTML-CLOSE-TAG");

    private static final SubLSymbol MAKE_PPH_PHRASE_OUTPUT_ITEM = makeSymbol("MAKE-PPH-PHRASE-OUTPUT-ITEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD");

    private static final SubLSymbol PPH_STRING_P = makeSymbol("PPH-STRING-P");

    private static final SubLString $str136$_PPH_OI__S__S__S__S__S__S___ = makeString("<PPH-OI ~S ~S ~S ~S ~S ~S>~%");

    private static final SubLString $str137$_S_is_a_forbidden_paraphrase_for_ = makeString("~S is a forbidden paraphrase for ~S");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_LOOSE_P = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P");







    private static final SubLString $str142$ = makeString("");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_COPY = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-COPY");





    private static final SubLString $str146$Can_t_make_nested_enhanced_output = makeString("Can't make nested enhanced output item.");

    private static final SubLSymbol ENHANCED_PPH_OUTPUT_ITEM_P = makeSymbol("ENHANCED-PPH-OUTPUT-ITEM-P");

    private static final SubLInteger $int$74 = makeInteger(74);

    private static final SubLSymbol CFASL_INPUT_PPH_OI = makeSymbol("CFASL-INPUT-PPH-OI");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD");

    private static final SubLString $str151$_S__S = makeString("~S ~S");

    private static final SubLInteger $int$50000 = makeInteger(50000);

    private static final SubLInteger $int$200000 = makeInteger(200000);

    private static final SubLInteger $int$500000 = makeInteger(500000);

    private static final SubLString $str155$new_PPH_phrase_limit_of__S_exceed = makeString("new PPH phrase limit of ~S exceeded.");

    private static final SubLString $str156$New_PPH_phrase_not_expected_to_be = makeString("New PPH phrase not expected to be destroyed: ~S");

    public static final SubLList $list157 = list(new SubLObject[]{ makeKeyword("CASE"), makeKeyword("RESERVED-FOR-MATRIX-ARG0"), makeKeyword("ALTERNATIVES"), makeKeyword("LINK-CYCL"), makeKeyword("WU"), makeKeyword("HEAD-DTR-NUM"), makeKeyword("NON-LOCAL-FEATURES-IGNORED?"), makeKeyword("DONE?"), makeKeyword("QUERY-EL-FORMULA"), makeKeyword("SPECIAL-TYPE"), makeKeyword("DEMERITS"), makeKeyword("DEMERITS-REASON") });

    private static final SubLSymbol PPH_INFO_VECTOR_P = makeSymbol("PPH-INFO-VECTOR-P");

    private static final SubLSymbol $pph_phrase_id_index$ = makeSymbol("*PPH-PHRASE-ID-INDEX*");

    private static final SubLString $$$PPH_phrase_ID_index = makeString("PPH phrase ID index");

    private static final SubLSymbol PPH_PHRASE_SET_SUID = makeSymbol("PPH-PHRASE-SET-SUID");

    private static final SubLString $$$Removing_invalid_PPH_phrases = makeString("Removing invalid PPH phrases");





    private static final SubLString $str165$Removed__S_items_from__PPH_PHRASE = makeString("Removed ~S items from *PPH-PHRASE-ID-INDEX* that failed VALID-PPH-PHRASE-P test.");

    private static final SubLString $str166$Found_no_invalid_PPH_phrases_ = makeString("Found no invalid PPH phrases.");





    private static final SubLString $str169$__Dumping__S__ = makeString("~&Dumping ~S~%");

    private static final SubLString $str170$__Dumping_CycL___S__ = makeString("~&Dumping CycL: ~S~%");

    private static final SubLString $str171$__Dumping_Agr___S__ = makeString("~&Dumping Agr: ~S~%");

    private static final SubLString $str172$__Dumping_Justification___S__ = makeString("~&Dumping Justification: ~S~%");

    private static final SubLString $str173$__Dumping_Output_List___S__ = makeString("~&Dumping Output-List: ~S~%");

    private static final SubLString $str174$__Dumping_Arg_Position_Map___S__ = makeString("~&Dumping Arg-Position-Map: ~S~%");

    private static final SubLString $str175$__Dumping_Other___S__ = makeString("~&Dumping Other: ~S~%");

    private static final SubLString $str176$_________________________________ = makeString("~&=====================================================~%");

    private static final SubLSymbol $LISTIFIED_PPH_VECTOR = makeKeyword("LISTIFIED-PPH-VECTOR");



    private static final SubLSymbol LISTIFY_PPH_VECTOR = makeSymbol("LISTIFY-PPH-VECTOR");

    private static final SubLSymbol PPH_LISTIFIED_VECTOR_P = makeSymbol("PPH-LISTIFIED-VECTOR-P");

    private static final SubLSymbol DELISTIFY_PPH_VECTOR = makeSymbol("DELISTIFY-PPH-VECTOR");

    private static final SubLSymbol $PPH_PHRASE_SHELL = makeKeyword("PPH-PHRASE-SHELL");

    private static final SubLSymbol SHELLIFY_PPH_PHRASE = makeSymbol("SHELLIFY-PPH-PHRASE");

    private static final SubLSymbol SHELLIFIED_PPH_PHRASE_P = makeSymbol("SHELLIFIED-PPH-PHRASE-P");

    private static final SubLSymbol DESHELLIFY_PPH_PHRASE = makeSymbol("DESHELLIFY-PPH-PHRASE");

    private static final SubLString $str186$Couldn_t_find_PPH_phrase__D = makeString("Couldn't find PPH phrase ~D");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_P = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-P");

    private static final SubLList $list189 = list(new SubLObject[]{ makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("FOCUS-ARG"), makeSymbol("SPECIFIED-RELN"), makeSymbol("NL-PREDS"), makeSymbol("DONE?"), makeSymbol("SEARCH-LIMIT"), makeSymbol("SEARCH-LEVEL"), makeSymbol("RELNS-TO-USE"), makeSymbol("GEN-TEMPLATE-SETS"), makeSymbol("GEN-TEMPLATES"), makeSymbol("ARG-POSITION-MAP") });

    private static final SubLList $list190 = list(new SubLObject[]{ makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("FOCUS-ARG"), makeKeyword("SPECIFIED-RELN"), makeKeyword("NL-PREDS"), makeKeyword("DONE?"), makeKeyword("SEARCH-LIMIT"), makeKeyword("SEARCH-LEVEL"), makeKeyword("RELNS-TO-USE"), makeKeyword("GEN-TEMPLATE-SETS"), makeKeyword("GEN-TEMPLATES"), makeKeyword("ARG-POSITION-MAP") });

    private static final SubLList $list191 = list(new SubLObject[]{ makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-MT"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-DONE?"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP") });

    private static final SubLList $list192 = list(new SubLObject[]{ makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-MT"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-DONE?"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES"), makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP") });

    private static final SubLSymbol PPRINT_PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol("PPRINT-PPH-PHRASE-TEMPLATE-GENERATOR");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list195 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-P"));

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_MT = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-MT");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_MT = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-MT");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS");

    private static final SubLSymbol $sym206$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_ = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-DONE?");

    private static final SubLSymbol $sym207$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_DONE_ = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-DONE?");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP");

    private static final SubLSymbol _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP = makeSymbol("_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP");

















    private static final SubLSymbol $RELNS_TO_USE = makeKeyword("RELNS-TO-USE");

    private static final SubLSymbol $GEN_TEMPLATE_SETS = makeKeyword("GEN-TEMPLATE-SETS");



    private static final SubLSymbol MAKE_PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol("MAKE-PPH-PHRASE-TEMPLATE-GENERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_TEMPLATE_GENERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-TEMPLATE-GENERATOR-METHOD");

    private static final SubLString $str233$_PPH_Phrase_Template_Generator___ = makeString("<PPH-Phrase-Template-Generator: ~S>");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $free_pph_phrase_template_generators$ = makeSymbol("*FREE-PPH-PHRASE-TEMPLATE-GENERATORS*");





    private static final SubLString $str239$Making_new_PPH_phrase_template_ge = makeString("Making new PPH phrase template generator.");

    private static final SubLString $str240$Freeing_PPH_phrase_template_gener = makeString("Freeing PPH phrase template generator (~S total).");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_ITERATOR = makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_ITERATOR_P = makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-P");

    private static final SubLList $list243 = list(makeSymbol("ITEM-QUEUE"));

    private static final SubLList $list244 = list(makeKeyword("ITEM-QUEUE"));

    private static final SubLList $list245 = list(makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE"));

    private static final SubLList $list246 = list(makeSymbol("_CSETF-PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE"));

    private static final SubLSymbol PPRINT_PPH_PHRASE_OUTPUT_LIST_ITERATOR = makeSymbol("PPRINT-PPH-PHRASE-OUTPUT-LIST-ITERATOR");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list249 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-P"));

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE = makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE");

    private static final SubLSymbol _CSETF_PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE = makeSymbol("_CSETF-PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE");



    private static final SubLSymbol MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR = makeSymbol("MAKE-PPH-PHRASE-OUTPUT-LIST-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_LIST_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-LIST-ITERATOR-METHOD");

    private static final SubLString $str255$_PPH_OL_Iterator_ = makeString("<PPH-OL-Iterator>");

    private static final SubLString $str256$___Iterator_empty___S__ = makeString("~& Iterator empty: ~S~%");

    private static final SubLString $str257$___Can_t_get_next_item_from__S = makeString("~& Can't get next item from ~S");

    public static SubLObject gen_template_store_present_p() {
        return dictionary.dictionary_p($gen_template_store$.getGlobalValue());
    }

    public static SubLObject note_gen_template_store_initialized() {
        $gen_template_store_initializedP$.setGlobalValue(T);
        pph_staleness_test.gen_template_store_note_revisions();
        pph_staleness_test.declare_gen_template_store_not_known_stale();
        return $gen_template_store$.getGlobalValue();
    }

    public static SubLObject clear_gen_template_store() {
        SubLObject release = NIL;
        try {
            release = seize_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            dictionary.clear_dictionary($gen_template_store$.getGlobalValue());
            $gen_template_store_initializedP$.setGlobalValue(NIL);
            pph_phrase.destroy_all_pph_phrases();
            pph_templates.clear_gen_template_verbosity();
        } finally {
            if (NIL != release) {
                release_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            }
        }
        return $gen_template_store$.getGlobalValue();
    }

    public static SubLObject gen_template_store_initializedP() {
        return $gen_template_store_initializedP$.getGlobalValue();
    }

    public static SubLObject check_gen_template_store_initialization() {
        if ((NIL == gen_template_store_initializedP()) || ((NIL == pph_staleness_test.gen_template_store_staleness_acceptableP()) && (NIL != pph_staleness_test.gen_template_store_staleP()))) {
            if (NIL == gen_template_store_initializedP()) {
                Errors.warn($str4$Gen_Template_Store_not_initialize);
            }
            if ((NIL == pph_staleness_test.gen_template_store_staleness_acceptableP()) && (NIL != pph_staleness_test.gen_template_store_staleP())) {
                Errors.warn($str5$Gen_Template_Store_unacceptably_s);
            }
            pph_templates.initialize_gen_template_store();
        }
        return $INITIALIZED;
    }

    public static SubLObject gen_template_store_length() {
        return dictionary.dictionary_length($gen_template_store$.getGlobalValue());
    }

    public static SubLObject new_gen_template_store_iterator() {
        return dictionary.new_dictionary_iterator($gen_template_store$.getGlobalValue());
    }

    public static SubLObject gen_template_sets_for_reln_from_store(final SubLObject reln, SubLObject check_initializedP) {
        if (check_initializedP == UNPROVIDED) {
            check_initializedP = T;
        }
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            if (NIL != check_initializedP) {
                check_gen_template_store_initialization();
            }
            ans = dictionary.dictionary_lookup($gen_template_store$.getGlobalValue(), reln, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(pph_vars.$gen_template_store_lock$.getGlobalValue());
            }
        }
        return ans;
    }

    public static SubLObject set_gen_template_store_value(final SubLObject reln, final SubLObject sets) {
        dictionary.dictionary_enter($gen_template_store$.getGlobalValue(), reln, sets);
        return $ENTERED;
    }

    public static SubLObject clear_gen_template_store_value(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
        try {
            pph_vars.$bypass_pph_phrase_destroyerP$.bind(T, thread);
            destroy_gen_templates_for_reln(reln);
            dictionary.dictionary_remove($gen_template_store$.getGlobalValue(), reln);
        } finally {
            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0, thread);
        }
        return $CLEARED;
    }

    public static SubLObject destroy_gen_templates_for_reln(final SubLObject reln) {
        SubLObject cdolist_list_var = pph_templates.gen_template_sets_for_reln(reln, NIL);
        SubLObject v_set = NIL;
        v_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject gen_template;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                gen_template = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, gen_template)) {
                    destroy_gen_template(gen_template);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        } 
        return reln;
    }

    public static SubLObject destroy_gen_template(final SubLObject gen_template) {
        final SubLObject phrase = get_gen_template_phrase(gen_template);
        if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
            pph_phrase.destroy_pph_phrase(phrase, UNPROVIDED);
        }
        return gen_template;
    }

    public static SubLObject generation_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_gen_template(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject generation_template_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$generation_template_native.class ? T : NIL;
    }

    public static SubLObject gen_template_phrase(final SubLObject v_object) {
        assert NIL != generation_template_p(v_object) : "pph_data_structures.generation_template_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject gen_template_constraint(final SubLObject v_object) {
        assert NIL != generation_template_p(v_object) : "pph_data_structures.generation_template_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject gen_template_assertion(final SubLObject v_object) {
        assert NIL != generation_template_p(v_object) : "pph_data_structures.generation_template_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_gen_template_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != generation_template_p(v_object) : "pph_data_structures.generation_template_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_gen_template_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != generation_template_p(v_object) : "pph_data_structures.generation_template_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_gen_template_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != generation_template_p(v_object) : "pph_data_structures.generation_template_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_generation_template(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $generation_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PHRASE)) {
                _csetf_gen_template_phrase(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTRAINT)) {
                    _csetf_gen_template_constraint(v_new, current_value);
                } else
                    if (pcase_var.eql($ASSERTION)) {
                        _csetf_gen_template_assertion(v_new, current_value);
                    } else {
                        Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_generation_template(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GENERATION_TEMPLATE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PHRASE, gen_template_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT, gen_template_constraint(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION, gen_template_assertion(obj));
        funcall(visitor_fn, obj, $END, MAKE_GENERATION_TEMPLATE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_generation_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_generation_template(obj, visitor_fn);
    }

    public static SubLObject sxhash_generation_template_method(final SubLObject v_object) {
        return Sxhash.sxhash(gen_template_assertion(v_object));
    }

    public static SubLObject new_gen_template(SubLObject phrase, SubLObject constraint, SubLObject assertion) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (constraint == UNPROVIDED) {
            constraint = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (((NIL != phrase) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == pph_phrase.pph_phrase_p(phrase, UNPROVIDED))) {
            throw new AssertionError(phrase);
        }
        if (((NIL != assertion) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == assertion_handles.assertion_p(assertion))) {
            throw new AssertionError(assertion);
        }
        final SubLObject gen_template = make_generation_template(UNPROVIDED);
        _csetf_gen_template_phrase(gen_template, phrase);
        _csetf_gen_template_constraint(gen_template, constraint);
        _csetf_gen_template_assertion(gen_template, assertion);
        return gen_template;
    }

    public static SubLObject pprint_gen_template(final SubLObject template, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str36$__GEN_TEMPLATE__S_, gen_template_phrase(template));
        return NIL;
    }

    public static SubLObject gen_template_el_constraint(final SubLObject gen_template) {
        final SubLObject constraint = gen_template_constraint(gen_template);
        if (NIL == constraint) {
            return NIL;
        }
        if (NIL != clauses.clauses_p(constraint)) {
            return clauses.dnf_formula_from_clauses(constraint);
        }
        if (NIL != el_formula_p(constraint)) {
            return constraint;
        }
        return NIL;
    }

    public static SubLObject gen_template_set_constraint(final SubLObject gen_template, final SubLObject constraint) {
        _csetf_gen_template_constraint(gen_template, constraint);
        return gen_template;
    }

    public static SubLObject get_gen_template_phrase(final SubLObject gen_template) {
        return gen_template_phrase(gen_template);
    }

    public static SubLObject get_gen_template_constraint(final SubLObject gen_template) {
        return gen_template_constraint(gen_template);
    }

    public static SubLObject get_gen_template_assertion(final SubLObject gen_template) {
        final SubLObject maybe_assertion = gen_template_assertion(gen_template);
        if (NIL != assertion_handles.assertion_p(maybe_assertion)) {
            return maybe_assertion;
        }
        if (NIL != hlmt.possibly_mt_p(maybe_assertion)) {
            return find_if(ASSERTION_P, pph_phrase.pph_phrase_justification(get_gen_template_phrase(gen_template)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_templates.rephrase_gen_template_for_kappa_predP(gen_template)) {
            return NIL;
        }
        final SubLObject new_format_string = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str39$Can_t_get_assertion_from__S___Fou) });
        pph_error.pph_handle_error(new_format_string, list(gen_template, maybe_assertion));
        return NIL;
    }

    public static SubLObject get_gen_template_mt(final SubLObject gen_template) {
        final SubLObject maybe_assertion = gen_template_assertion(gen_template);
        if (NIL != assertion_handles.assertion_p(maybe_assertion)) {
            return assertions_high.assertion_mt(maybe_assertion);
        }
        if (NIL != hlmt.possibly_mt_p(maybe_assertion)) {
            return maybe_assertion;
        }
        if (NIL != pph_templates.rephrase_gen_template_for_kappa_predP(gen_template)) {
            return $$ParaphraseMt;
        }
        final SubLObject new_format_string = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str41$Can_t_get_mt_from__S___Found__S) });
        pph_error.pph_handle_error(new_format_string, list(gen_template, maybe_assertion));
        return NIL;
    }

    public static SubLObject cfasl_output_object_generation_template_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_generation_template(v_object, stream);
    }

    public static SubLObject cfasl_output_generation_template(final SubLObject generation_template, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_generation_template$.getGlobalValue(), stream);
        cfasl_output(pph_phrase.pph_phrase_suid(gen_template_phrase(generation_template)), stream);
        cfasl_output(gen_template_constraint(generation_template), stream);
        cfasl_output(gen_template_assertion(generation_template), stream);
        return generation_template;
    }

    public static SubLObject cfasl_input_generation_template(final SubLObject stream) {
        SubLObject generation_template = NIL;
        generation_template = make_generation_template(UNPROVIDED);
        _csetf_gen_template_phrase(generation_template, find_pph_phrase_by_id(cfasl_input(stream, UNPROVIDED, UNPROVIDED)));
        _csetf_gen_template_constraint(generation_template, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_gen_template_assertion(generation_template, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return generation_template;
    }

    public static SubLObject pph_phrase_agr_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_agr(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_phrase_agr_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$pph_phrase_agr_native.class ? T : NIL;
    }

    public static SubLObject pph_phrase_agr_absolute_constraint(final SubLObject v_object) {
        assert NIL != pph_phrase_agr_p(v_object) : "pph_data_structures.pph_phrase_agr_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pph_phrase_agr_relative_constraint(final SubLObject v_object) {
        assert NIL != pph_phrase_agr_p(v_object) : "pph_data_structures.pph_phrase_agr_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_pph_phrase_agr_absolute_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_agr_p(v_object) : "pph_data_structures.pph_phrase_agr_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_phrase_agr_relative_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_agr_p(v_object) : "pph_data_structures.pph_phrase_agr_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_pph_phrase_agr(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $pph_phrase_agr_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ABSOLUTE_CONSTRAINT)) {
                _csetf_pph_phrase_agr_absolute_constraint(v_new, current_value);
            } else
                if (pcase_var.eql($RELATIVE_CONSTRAINT)) {
                    _csetf_pph_phrase_agr_relative_constraint(v_new, current_value);
                } else {
                    Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_phrase_agr(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_PHRASE_AGR, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ABSOLUTE_CONSTRAINT, pph_phrase_agr_absolute_constraint(obj));
        funcall(visitor_fn, obj, $SLOT, $RELATIVE_CONSTRAINT, pph_phrase_agr_relative_constraint(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_PHRASE_AGR, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_phrase_agr_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_agr(obj, visitor_fn);
    }

    public static SubLObject pprint_pph_phrase_agr(final SubLObject agr, final SubLObject stream, final SubLObject depth) {
        final SubLObject abcon = pph_phrase_agr_absolute_constraint(agr);
        final SubLObject relcon = pph_phrase_agr_relative_constraint(agr);
        format(stream, $str62$_AGR);
        if (NIL != pph_utilities.pph_agr_constraint_p(abcon)) {
            final SubLObject target = pph_utilities.pph_agr_constraint_target(abcon);
            format(stream, $str63$___S_, pph_utilities.pph_agr_constraint_type(abcon));
            if (NIL != pph_phrase.pph_phrase_p(target, UNPROVIDED)) {
                format(stream, $str64$_PPH_PHRASE__A_______, pph_phrase.pph_phrase_suid(target));
            } else {
                format(stream, $str65$_A, target);
            }
            princ($str66$_, stream);
        }
        if (NIL != pph_utilities.pph_agr_constraint_p(relcon)) {
            final SubLObject target = pph_utilities.pph_agr_constraint_target(relcon);
            format(stream, $str63$___S_, pph_utilities.pph_agr_constraint_type(relcon));
            if (NIL != pph_phrase.pph_phrase_p(target, UNPROVIDED)) {
                format(stream, $str64$_PPH_PHRASE__A_______, pph_phrase.pph_phrase_suid(target));
            } else {
                format(stream, $str65$_A, target);
            }
            princ($str66$_, stream);
        }
        princ($str67$_, stream);
        return agr;
    }

    public static SubLObject new_pph_phrase_agr(SubLObject absolute_constraint, SubLObject relative_constraint) {
        if (absolute_constraint == UNPROVIDED) {
            absolute_constraint = pph_utilities.new_pph_dont_care_agr_constraint();
        }
        if (relative_constraint == UNPROVIDED) {
            relative_constraint = NIL;
        }
        return new_pph_phrase_agr_low(absolute_constraint, relative_constraint);
    }

    public static SubLObject new_pph_phrase_agr_low(final SubLObject absolute_constraint, final SubLObject relative_constraint) {
        final SubLObject agr = make_pph_phrase_agr(UNPROVIDED);
        _csetf_pph_phrase_agr_absolute_constraint(agr, absolute_constraint);
        _csetf_pph_phrase_agr_relative_constraint(agr, relative_constraint);
        return agr;
    }

    public static SubLObject new_dont_care_pph_phrase_agr() {
        return new_pph_phrase_agr_low(pph_utilities.new_pph_dont_care_agr_constraint(), NIL);
    }

    public static SubLObject dont_care_pph_phrase_agr_p(final SubLObject obj) {
        return makeBoolean(((NIL != pph_phrase_agr_p(obj)) && (NIL != pph_utilities.pph_dont_care_agr_constraint_p(pph_phrase_agr_absolute_constraint(obj)))) && (NIL == pph_phrase_agr_relative_constraint(obj)));
    }

    public static SubLObject pph_phrase_agr_set_absolute_constraint(final SubLObject phrase_agr, final SubLObject constraint) {
        _csetf_pph_phrase_agr_absolute_constraint(phrase_agr, constraint);
        return phrase_agr;
    }

    public static SubLObject pph_phrase_agr_set_relative_constraint(final SubLObject phrase_agr, final SubLObject constraint) {
        _csetf_pph_phrase_agr_relative_constraint(phrase_agr, constraint);
        return phrase_agr;
    }

    public static SubLObject pph_phrase_agr_copy(final SubLObject phrase_agr, SubLObject copied_phrases) {
        if (copied_phrases == UNPROVIDED) {
            copied_phrases = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        final SubLObject absolute_constraint = pph_phrase_agr_absolute_constraint(phrase_agr);
        final SubLObject old_relative_constraint = pph_phrase_agr_relative_constraint(phrase_agr);
        final SubLObject new_relative_constraint = pph_phrase_agr_relative_constraint_copy(old_relative_constraint, copied_phrases);
        return new_pph_phrase_agr(absolute_constraint, new_relative_constraint);
    }

    public static SubLObject pph_phrase_agr_relative_constraint_copy(final SubLObject constraint, final SubLObject copied_phrases) {
        if (NIL == pph_utilities.pph_agr_constraint_p(constraint)) {
            return NIL;
        }
        final SubLObject constraint_type = pph_utilities.pph_agr_constraint_type(constraint);
        final SubLObject old_target = pph_utilities.pph_agr_constraint_target(constraint);
        final SubLObject new_target = find_new_pph_relative_agr_target(old_target, copied_phrases);
        if (NIL != pph_phrase.pph_phrase_p(new_target, UNPROVIDED)) {
            dictionary.dictionary_enter(copied_phrases, old_target, new_target);
        }
        return pph_utilities.new_pph_agr_constraint(constraint_type, new_target);
    }

    public static SubLObject find_new_pph_relative_agr_target(final SubLObject old_target, final SubLObject copied_phrases) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_phrase.pph_phrase_p(old_target, UNPROVIDED)) {
            return old_target;
        }
        final SubLObject done_copy = dictionary.dictionary_lookup(copied_phrases, old_target, UNPROVIDED);
        if (NIL != done_copy) {
            return done_copy;
        }
        if (NIL != pph_vars.$pph_retain_original_relative_targetsP$.getDynamicValue(thread)) {
            return old_target;
        }
        return pph_phrase.pph_phrase_copy_int(old_target, copied_phrases, NIL, NIL, UNPROVIDED);
    }

    public static SubLObject cfasl_output_object_pph_phrase_agr_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_pph_phrase_agr(v_object, stream);
    }

    public static SubLObject cfasl_output_pph_phrase_agr(final SubLObject pph_phrase_agr, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_pph_phrase_agr$.getGlobalValue(), stream);
        cfasl_output(pph_phrase_agr_absolute_constraint(pph_phrase_agr), stream);
        final SubLObject relcon = pph_phrase_agr_relative_constraint(pph_phrase_agr);
        if (NIL != pph_utilities.pph_agr_constraint_p(relcon)) {
            final SubLObject type = pph_utilities.pph_agr_constraint_type(relcon);
            final SubLObject target = pph_utilities.pph_agr_constraint_target(relcon);
            if (NIL != pph_phrase.pph_phrase_p(target, UNPROVIDED)) {
                cfasl_output(cons(type, pph_phrase.pph_phrase_suid(target)), stream);
            } else {
                cfasl_output(relcon, stream);
            }
        } else {
            cfasl_output(relcon, stream);
        }
        return pph_phrase_agr;
    }

    public static SubLObject cfasl_input_pph_phrase_agr(final SubLObject stream) {
        SubLObject pph_phrase_agr = NIL;
        pph_phrase_agr = make_pph_phrase_agr(UNPROVIDED);
        _csetf_pph_phrase_agr_absolute_constraint(pph_phrase_agr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        final SubLObject relcon = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject type = pph_utilities.pph_agr_constraint_type(relcon);
        SubLObject target = pph_utilities.pph_agr_constraint_target(relcon);
        if (target.isInteger()) {
            final SubLObject v_pph_phrase = find_pph_phrase_by_id(target);
            if (NIL != pph_phrase.pph_phrase_p(v_pph_phrase, UNPROVIDED)) {
                target = v_pph_phrase;
            } else {
                Errors.warn($str71$Could_not_find_pph_phrase_with_su);
            }
        }
        _csetf_pph_phrase_agr_relative_constraint(pph_phrase_agr, pph_utilities.new_pph_agr_constraint(type, target));
        return pph_phrase_agr;
    }

    public static SubLObject paraphrase_phrase_info_bundle_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_info_bundle(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject paraphrase_phrase_info_bundle_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$paraphrase_phrase_info_bundle_native.class ? T : NIL;
    }

    public static SubLObject pph_phrase_info_cycl(final SubLObject v_object) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pph_phrase_info_agr(final SubLObject v_object) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject pph_phrase_info_justification(final SubLObject v_object) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject pph_phrase_info_output_list(final SubLObject v_object) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject pph_phrase_info_arg_position_map(final SubLObject v_object) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject pph_phrase_info_other(final SubLObject v_object) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_pph_phrase_info_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_phrase_info_agr(final SubLObject v_object, final SubLObject value) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_phrase_info_justification(final SubLObject v_object, final SubLObject value) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pph_phrase_info_output_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pph_phrase_info_arg_position_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pph_phrase_info_other(final SubLObject v_object, final SubLObject value) {
        assert NIL != paraphrase_phrase_info_bundle_p(v_object) : "pph_data_structures.paraphrase_phrase_info_bundle_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_paraphrase_phrase_info_bundle(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $paraphrase_phrase_info_bundle_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_pph_phrase_info_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($AGR)) {
                    _csetf_pph_phrase_info_agr(v_new, current_value);
                } else
                    if (pcase_var.eql($JUSTIFICATION)) {
                        _csetf_pph_phrase_info_justification(v_new, current_value);
                    } else
                        if (pcase_var.eql($OUTPUT_LIST)) {
                            _csetf_pph_phrase_info_output_list(v_new, current_value);
                        } else
                            if (pcase_var.eql($ARG_POSITION_MAP)) {
                                _csetf_pph_phrase_info_arg_position_map(v_new, current_value);
                            } else
                                if (pcase_var.eql($OTHER)) {
                                    _csetf_pph_phrase_info_other(v_new, current_value);
                                } else {
                                    Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_paraphrase_phrase_info_bundle(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, pph_phrase_info_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $AGR, pph_phrase_info_agr(obj));
        funcall(visitor_fn, obj, $SLOT, $JUSTIFICATION, pph_phrase_info_justification(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_LIST, pph_phrase_info_output_list(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_POSITION_MAP, pph_phrase_info_arg_position_map(obj));
        funcall(visitor_fn, obj, $SLOT, $OTHER, pph_phrase_info_other(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARAPHRASE_PHRASE_INFO_BUNDLE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_paraphrase_phrase_info_bundle_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_paraphrase_phrase_info_bundle(obj, visitor_fn);
    }

    public static SubLObject pph_phrase_has_info_vector_p(final SubLObject phrase) {
        final SubLObject vector = pph_phrase_info_vector(phrase);
        return pph_info_vector_p(vector);
    }

    public static SubLObject pph_empty_info_vector_p(final SubLObject v_object) {
        return eq(v_object, $pph_empty_info_vector$.getGlobalValue());
    }

    public static SubLObject pph_info_vector_p(final SubLObject v_object) {
        return makeBoolean(v_object.isVector() || (NIL != pph_empty_info_vector_p(v_object)));
    }

    public static SubLObject pph_phrase_plist(final SubLObject phrase) {
        final SubLObject other = pph_phrase_info_other(document.sign_info(phrase));
        return NIL != pph_phrase_has_info_vector_p(phrase) ? other.rest() : other;
    }

    public static SubLObject pph_phrase_do_plist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property = NIL;
        SubLObject value = NIL;
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject plist = $sym103$PLIST;
            return list(CLET, list(list(plist, list(PPH_PHRASE_PLIST, phrase))), listS(DO_PLIST, list(property, value, plist), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    public static SubLObject pph_phrase_info_lookup(final SubLObject phrase, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != subl_promotions.non_negative_integer_p(property)) {
            return pph_phrase_info_vector_lookup(phrase, property, v_default);
        }
        final SubLObject plist = pph_phrase_plist(phrase);
        return getf(plist, property, v_default);
    }

    public static SubLObject pph_phrase_info_lookup_by_keyword_or_integer(final SubLObject phrase, final SubLObject keyword, final SubLObject integer, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return NIL != pph_phrase_has_info_vector_p(phrase) ? pph_phrase_info_lookup(phrase, integer, v_default) : pph_phrase_info_lookup(phrase, keyword, v_default);
    }

    public static SubLObject pph_phrase_info_property_set_p(final SubLObject phrase, final SubLObject property, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!n.eql(position(property, pph_info_vector_slots(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            Errors.error($str107$_S_should_be__S__not__S, property, position(property, pph_info_vector_slots(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), n);
        }
        return NIL != pph_phrase_has_info_vector_p(phrase) ? makeBoolean(!$pph_info_vector_unspecified_value$.getGlobalValue().eql(pph_phrase_info_vector_lookup_no_default(phrase, n))) : list_utilities.plist_has_keyP(pph_phrase_plist(phrase), property);
    }

    public static SubLObject pph_phrase_info_set(final SubLObject phrase, final SubLObject property, final SubLObject value) {
        if (NIL != subl_promotions.non_negative_integer_p(property)) {
            pph_phrase_info_vector_set(phrase, property, value);
        } else
            if (NIL != pph_phrase_has_info_vector_p(phrase)) {
                rplacd(pph_phrase_info_other(document.sign_info(phrase)), putf(pph_phrase_plist(phrase), property, value));
            } else {
                _csetf_pph_phrase_info_other(document.sign_info(phrase), putf(pph_phrase_plist(phrase), property, value));
            }

        return value;
    }

    public static SubLObject pph_phrase_info_set_by_keyword_or_integer(final SubLObject phrase, final SubLObject keyword, final SubLObject integer, final SubLObject value) {
        return NIL != pph_phrase_has_info_vector_p(phrase) ? pph_phrase_info_set(phrase, integer, value) : pph_phrase_info_set(phrase, keyword, value);
    }

    public static SubLObject pph_phrase_info_clear(final SubLObject phrase, final SubLObject property) {
        if (NIL != pph_phrase_has_info_vector_p(phrase)) {
            rplacd(pph_phrase_info_other(document.sign_info(phrase)), remf(pph_phrase_plist(phrase), property));
        } else {
            _csetf_pph_phrase_info_other(document.sign_info(phrase), remf(pph_phrase_plist(phrase), property));
        }
        return pph_phrase_info_lookup(phrase, property, UNPROVIDED);
    }

    public static SubLObject pph_phrase_output_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_output_item(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$pph_phrase_output_item_native.class ? T : NIL;
    }

    public static SubLObject pph_oi_string(final SubLObject v_object) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pph_oi_arg_position(final SubLObject v_object) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject pph_oi_cycl(final SubLObject v_object) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject pph_oi_html_open_tag(final SubLObject v_object) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject pph_oi_html_close_tag(final SubLObject v_object) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject pph_oi_agr(final SubLObject v_object) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_pph_oi_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_oi_arg_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_oi_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pph_oi_html_open_tag(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pph_oi_html_close_tag(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pph_oi_agr(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_item_p(v_object) : "pph_data_structures.pph_phrase_output_item_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_pph_phrase_output_item(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $pph_phrase_output_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                _csetf_pph_oi_string(v_new, current_value);
            } else
                if (pcase_var.eql($ARG_POSITION)) {
                    _csetf_pph_oi_arg_position(v_new, current_value);
                } else
                    if (pcase_var.eql($CYCL)) {
                        _csetf_pph_oi_cycl(v_new, current_value);
                    } else
                        if (pcase_var.eql($HTML_OPEN_TAG)) {
                            _csetf_pph_oi_html_open_tag(v_new, current_value);
                        } else
                            if (pcase_var.eql($HTML_CLOSE_TAG)) {
                                _csetf_pph_oi_html_close_tag(v_new, current_value);
                            } else
                                if (pcase_var.eql($AGR)) {
                                    _csetf_pph_oi_agr(v_new, current_value);
                                } else {
                                    Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_phrase_output_item(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_PHRASE_OUTPUT_ITEM, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, pph_oi_string(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_POSITION, pph_oi_arg_position(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, pph_oi_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $HTML_OPEN_TAG, pph_oi_html_open_tag(obj));
        funcall(visitor_fn, obj, $SLOT, $HTML_CLOSE_TAG, pph_oi_html_close_tag(obj));
        funcall(visitor_fn, obj, $SLOT, $AGR, pph_oi_agr(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_PHRASE_OUTPUT_ITEM, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_phrase_output_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_output_item(obj, visitor_fn);
    }

    public static SubLObject new_pph_phrase_output_item(SubLObject string, SubLObject arg_position, SubLObject cycl, SubLObject html_open_tag, SubLObject html_close_tag, SubLObject agr) {
        if (string == UNPROVIDED) {
            string = string_utilities.$empty_string$.getGlobalValue();
        }
        if (arg_position == UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (html_open_tag == UNPROVIDED) {
            html_open_tag = NIL;
        }
        if (html_close_tag == UNPROVIDED) {
            html_close_tag = NIL;
        }
        if (agr == UNPROVIDED) {
            agr = NIL;
        }
        assert NIL != pph_string.pph_string_p(string) : "pph_string.pph_string_p(string) " + "CommonSymbols.NIL != pph_string.pph_string_p(string) " + string;
        final SubLObject item = make_pph_phrase_output_item(UNPROVIDED);
        _csetf_pph_oi_string(item, string);
        _csetf_pph_oi_arg_position(item, arg_position);
        _csetf_pph_oi_cycl(item, cycl);
        _csetf_pph_oi_html_open_tag(item, html_open_tag);
        _csetf_pph_oi_html_close_tag(item, html_close_tag);
        _csetf_pph_oi_agr(item, agr);
        return item;
    }

    public static SubLObject pph_phrase_output_item_copy(final SubLObject original) {
        if (NIL != pph_phrase_output_item_p(original)) {
            final SubLObject string = pph_oi_string(original);
            final SubLObject arg_position = pph_oi_arg_position(original);
            final SubLObject cycl = pph_oi_cycl(original);
            final SubLObject html_open_tag = pph_oi_html_open_tag(original);
            final SubLObject html_close_tag = pph_oi_html_close_tag(original);
            final SubLObject agr = pph_oi_agr(original);
            return new_pph_phrase_output_item(string, arg_position, cycl, html_open_tag, html_close_tag, agr);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(original)) {
            return pph_phrase_output_item_nospace_group_copy(original);
        }
        if (NIL != enhanced_pph_output_item_p(original)) {
            return new_enhanced_pph_output_item(pph_phrase_output_item_copy(enhanced_pph_output_item_item(original)), enhanced_pph_output_item_demerits(original), copy_list(enhanced_pph_output_item_justification(original)));
        }
        return NIL;
    }

    public static SubLObject pprint_pph_phrase_output_item(final SubLObject item, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str136$_PPH_OI__S__S__S__S__S__S___, new SubLObject[]{ pph_oi_string(item), pph_oi_arg_position(item), pph_oi_cycl(item), pph_oi_html_open_tag(item), pph_oi_html_close_tag(item), pph_oi_agr(item) });
        return item;
    }

    public static SubLObject pph_phrase_output_item_string(final SubLObject item) {
        if (NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_string(item);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_string(item);
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_string(enhanced_pph_output_item_item(item));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_set_string(final SubLObject item, final SubLObject string) {
        assert NIL != pph_string.pph_string_p(string) : "pph_string.pph_string_p(string) " + "CommonSymbols.NIL != pph_string.pph_string_p(string) " + string;
        if (NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_string(item, string);
        } else
            if (NIL != enhanced_pph_output_item_p(item)) {
                pph_phrase_output_item_set_string(enhanced_pph_output_item_item(item), string);
            }

        return item;
    }

    public static SubLObject pph_phrase_output_item_prefix_string(final SubLObject item, final SubLObject prefix) {
        if (NIL != pph_phrase_output_item_p(item)) {
            final SubLObject existing_string = pph_phrase_output_item_string(item);
            final SubLObject new_string = (NIL != pph_string.pph_string_p(existing_string)) ? pph_string.pph_string_concatenate(prefix, existing_string) : prefix;
            return pph_phrase_output_item_set_string(item, new_string);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            final SubLObject old_items = pph_phrase_output_item_nospace_group_items(item);
            final SubLObject new_items = list(new_pph_phrase_output_item(prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject combined = cons(new_items, old_items);
            pph_phrase_output_item_nospace_group_set_items(item, combined);
            return item;
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_prefix_string(enhanced_pph_output_item_item(item), prefix);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_suffix_string(final SubLObject item, final SubLObject suffix) {
        if (NIL != pph_phrase_output_item_p(item)) {
            final SubLObject existing_string = pph_phrase_output_item_string(item);
            final SubLObject new_string = (NIL != pph_string.pph_string_p(existing_string)) ? pph_string.pph_string_concatenate(existing_string, suffix) : suffix;
            return pph_phrase_output_item_set_string(item, new_string);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            final SubLObject old_items = pph_phrase_output_item_nospace_group_items(item);
            final SubLObject new_items = list(new_pph_phrase_output_item(suffix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject combined = list_utilities.snoc(new_items, old_items);
            pph_phrase_output_item_nospace_group_set_items(item, combined);
            return item;
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_suffix_string(enhanced_pph_output_item_item(item), suffix);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_arg_position(final SubLObject item) {
        if (NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_arg_position(item);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_arg_position(item);
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_arg_position(enhanced_pph_output_item_item(item));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_set_arg_position(final SubLObject item, final SubLObject arg_position) {
        if (NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_arg_position(item, arg_position);
        } else {
            if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_arg_position(item, arg_position);
            }
            if (NIL != enhanced_pph_output_item_p(item)) {
                return pph_phrase_output_item_set_arg_position(enhanced_pph_output_item_item(item), arg_position);
            }
        }
        return item;
    }

    public static SubLObject pph_phrase_output_item_cycl(final SubLObject item) {
        if (NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_cycl(item);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_cycl(item);
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_cycl(enhanced_pph_output_item_item(item));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_set_cycl(final SubLObject item, final SubLObject cycl) {
        if ((NIL != pph_phrase.pph_known_cycl_p(cycl)) && (NIL != pph_vars.pph_forbidden_string_for_termP(cycl, pph_phrase_output_item_string(item)))) {
            final SubLObject new_format_string = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str137$_S_is_a_forbidden_paraphrase_for_) });
            pph_error.pph_handle_error(new_format_string, list(pph_phrase_output_item_string(item), cycl));
        } else
            if (NIL != pph_phrase_output_item_p(item)) {
                _csetf_pph_oi_cycl(item, cycl);
            } else {
                if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
                    return pph_phrase_output_item_nospace_group_set_cycl(item, cycl);
                }
                if (NIL != enhanced_pph_output_item_p(item)) {
                    return pph_phrase_output_item_set_cycl(enhanced_pph_output_item_item(item), cycl);
                }
            }

        return item;
    }

    public static SubLObject pph_phrase_output_item_agr_pred(final SubLObject item) {
        if (NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_agr(item);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_agr_pred(item);
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_agr_pred(enhanced_pph_output_item_item(item));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_set_agr_pred(final SubLObject item, final SubLObject agr_pred) {
        if (NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_agr(item, agr_pred);
        } else {
            if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_agr_pred(item, agr_pred);
            }
            if (NIL != enhanced_pph_output_item_p(item)) {
                return pph_phrase_output_item_set_agr_pred(enhanced_pph_output_item_item(item), agr_pred);
            }
        }
        return item;
    }

    public static SubLObject pph_phrase_output_item_html_open_tag(final SubLObject item) {
        if (NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_html_open_tag(item);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_html_open_tag(item);
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_html_open_tag(enhanced_pph_output_item_item(item));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_html_close_tag(final SubLObject item) {
        if (NIL != pph_phrase_output_item_p(item)) {
            return pph_oi_html_close_tag(item);
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
            return pph_phrase_output_item_nospace_group_html_close_tag(item);
        }
        if (NIL != enhanced_pph_output_item_p(item)) {
            return pph_phrase_output_item_html_close_tag(enhanced_pph_output_item_item(item));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_html_tags(final SubLObject item) {
        return list(pph_phrase_output_item_html_open_tag(item), pph_phrase_output_item_html_close_tag(item));
    }

    public static SubLObject pph_phrase_output_item_set_html_tags(final SubLObject item, final SubLObject open_tag, final SubLObject close_tag) {
        if (NIL != pph_phrase_output_item_p(item)) {
            _csetf_pph_oi_html_open_tag(item, open_tag);
            _csetf_pph_oi_html_close_tag(item, close_tag);
        } else {
            if (NIL != pph_phrase_output_item_nospace_group_p(item)) {
                return pph_phrase_output_item_nospace_group_set_html_tags(item, open_tag, close_tag);
            }
            if (NIL != enhanced_pph_output_item_p(item)) {
                pph_phrase_output_item_set_html_tags(enhanced_pph_output_item_item(item), open_tag, close_tag);
            }
        }
        return item;
    }

    public static SubLObject pph_phrase_output_item_demerits(final SubLObject item) {
        assert NIL != pph_phrase_output_item_loose_p(item) : "pph_data_structures.pph_phrase_output_item_loose_p(item) " + "CommonSymbols.NIL != pph_data_structures.pph_phrase_output_item_loose_p(item) " + item;
        if (NIL != enhanced_pph_output_item_p(item)) {
            return enhanced_pph_output_item_demerits(item);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject pph_phrase_output_item_justification(final SubLObject item) {
        assert NIL != pph_phrase_output_item_loose_p(item) : "pph_data_structures.pph_phrase_output_item_loose_p(item) " + "CommonSymbols.NIL != pph_data_structures.pph_phrase_output_item_loose_p(item) " + item;
        if (NIL != enhanced_pph_output_item_p(item)) {
            return enhanced_pph_output_item_justification(item);
        }
        return NIL;
    }

    public static SubLObject new_pph_phrase_output_item_nospace_group(final SubLObject items) {
        return new_pph_phrase_output_item_nospace_group_from_olists(Mapping.mapcar(LIST, list_utilities.remove_if_not(PPH_PHRASE_OUTPUT_ITEM_LOOSE_P, items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject new_pph_phrase_output_item_nospace_group_from_olists(final SubLObject olists) {
        return cons($NOSPACE, cons(new_pph_phrase_output_item(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), olists));
    }

    public static SubLObject pph_phrase_output_item_nospace_group_p(final SubLObject obj) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(obj)) && ($NOSPACE == obj.first())) && (NIL != pph_phrase_output_item_p(second(obj)))) && (NIL != list_utilities.every_in_list(PPH_PHRASE_OUTPUT_LIST_P, pph_phrase_output_item_nospace_group_items(obj), UNPROVIDED)));
    }

    public static SubLObject pph_phrase_output_item_nospace_group_items(final SubLObject obj) {
        return obj.rest().rest();
    }

    public static SubLObject pph_phrase_output_item_nospace_group_set_items(final SubLObject obj, final SubLObject items) {
        rplacd(obj.rest(), items);
        return obj;
    }

    public static SubLObject pph_phrase_output_item_nospace_group_string(final SubLObject obj) {
        SubLObject ans = $str142$;
        SubLObject cdolist_list_var = pph_phrase_output_item_nospace_group_items(obj);
        SubLObject olist = NIL;
        olist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = pph_string.pph_string_concatenate(ans, pph_phrase.pph_phrase_output_list_string(olist, NIL));
            cdolist_list_var = cdolist_list_var.rest();
            olist = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject pph_phrase_output_item_nospace_group_get_string(final SubLObject item, final SubLObject add_tagsP) {
        final SubLObject open_tag_slot_value = pph_phrase_output_item_html_open_tag(item);
        final SubLObject open_tag = (NIL != open_tag_slot_value) ? open_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
        final SubLObject close_tag_slot_value = pph_phrase_output_item_html_close_tag(item);
        final SubLObject close_tag = (NIL != close_tag_slot_value) ? close_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
        SubLObject item_string = $str142$;
        if ((NIL != add_tagsP) && (NIL != string_utilities.non_empty_stringP(open_tag))) {
            item_string = pph_string.pph_string_concatenate(item_string, open_tag);
        }
        SubLObject cdolist_list_var = pph_phrase_output_item_nospace_group_items(item);
        SubLObject sub_olist = NIL;
        sub_olist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = pph_phrase.pph_phrase_output_list_string(sub_olist, add_tagsP);
            if (NIL != pph_string.pph_string_p(string)) {
                item_string = pph_string.pph_string_concatenate(item_string, string);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_olist = cdolist_list_var.first();
        } 
        if ((NIL != add_tagsP) && close_tag.isString()) {
            item_string = pph_string.pph_string_concatenate(item_string, close_tag);
        }
        return item_string;
    }

    public static SubLObject pph_phrase_output_item_nospace_group_copy(final SubLObject obj) {
        SubLObject olist_copies = NIL;
        SubLObject cdolist_list_var = pph_phrase_output_item_nospace_group_items(obj);
        SubLObject olist = NIL;
        olist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject olist_copy = Mapping.mapcar(PPH_PHRASE_OUTPUT_ITEM_COPY, olist);
            olist_copies = cons(olist_copy, olist_copies);
            cdolist_list_var = cdolist_list_var.rest();
            olist = cdolist_list_var.first();
        } 
        final SubLObject new_group = new_pph_phrase_output_item_nospace_group_from_olists(nreverse(olist_copies));
        set_nth(ONE_INTEGER, new_group, pph_phrase_output_item_copy(second(obj)));
        return new_group;
    }

    public static SubLObject pph_phrase_output_item_nospace_group_arg_position(final SubLObject obj) {
        return pph_phrase_output_item_arg_position(second(obj));
    }

    public static SubLObject pph_phrase_output_item_nospace_group_set_arg_position(final SubLObject obj, final SubLObject arg_position) {
        return pph_phrase_output_item_set_arg_position(second(obj), arg_position);
    }

    public static SubLObject pph_phrase_output_item_nospace_group_cycl(final SubLObject obj) {
        return pph_phrase_output_item_cycl(second(obj));
    }

    public static SubLObject pph_phrase_output_item_nospace_group_set_cycl(final SubLObject obj, final SubLObject cycl) {
        return pph_phrase_output_item_set_cycl(second(obj), cycl);
    }

    public static SubLObject pph_phrase_output_item_nospace_group_agr_pred(final SubLObject obj) {
        return pph_phrase_output_item_agr_pred(second(obj));
    }

    public static SubLObject pph_phrase_output_item_nospace_group_set_agr_pred(final SubLObject obj, final SubLObject agr) {
        return pph_phrase_output_item_set_agr_pred(second(obj), agr);
    }

    public static SubLObject pph_phrase_output_item_nospace_group_set_html_tags(final SubLObject obj, final SubLObject open_tag, final SubLObject close_tag) {
        return pph_phrase_output_item_set_html_tags(second(obj), open_tag, close_tag);
    }

    public static SubLObject pph_phrase_output_item_nospace_group_html_open_tag(final SubLObject obj) {
        return pph_phrase_output_item_html_open_tag(second(obj));
    }

    public static SubLObject pph_phrase_output_item_nospace_group_html_close_tag(final SubLObject obj) {
        return pph_phrase_output_item_html_close_tag(second(obj));
    }

    public static SubLObject pph_phrase_output_item_loose_p(final SubLObject obj) {
        return makeBoolean(((NIL != pph_phrase_output_item_p(obj)) || (NIL != pph_phrase_output_item_nospace_group_p(obj))) || (NIL != enhanced_pph_output_item_p(obj)));
    }

    public static SubLObject enhanced_pph_output_item_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isVector() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != subl_promotions.non_negative_integer_p(aref(v_object, ONE_INTEGER)))) && aref(v_object, TWO_INTEGER).isList()) && (NIL != pph_phrase_output_item_loose_p(aref(v_object, ZERO_INTEGER)))) && (NIL == enhanced_pph_output_item_p(aref(v_object, ZERO_INTEGER))));
    }

    public static SubLObject new_enhanced_pph_output_item(final SubLObject output_item, final SubLObject demerits, final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_phrase_output_item_loose_p(output_item) : "pph_data_structures.pph_phrase_output_item_loose_p(output_item) " + "CommonSymbols.NIL != pph_data_structures.pph_phrase_output_item_loose_p(output_item) " + output_item;
        assert NIL != subl_promotions.non_negative_integer_p(demerits) : "subl_promotions.non_negative_integer_p(demerits) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(demerits) " + demerits;
        assert NIL != listp(justification) : "Types.listp(justification) " + "CommonSymbols.NIL != Types.listp(justification) " + justification;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != enhanced_pph_output_item_p(output_item))) {
            Errors.error($str146$Can_t_make_nested_enhanced_output);
        }
        final SubLObject item = make_vector(THREE_INTEGER, UNPROVIDED);
        set_aref(item, ZERO_INTEGER, output_item);
        set_aref(item, ONE_INTEGER, demerits);
        set_aref(item, TWO_INTEGER, justification);
        return item;
    }

    public static SubLObject enhanced_pph_output_item_item(final SubLObject enhanced_pph_output_item) {
        assert NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : "pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + "CommonSymbols.NIL != pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + enhanced_pph_output_item;
        return aref(enhanced_pph_output_item, ZERO_INTEGER);
    }

    public static SubLObject enhanced_pph_output_item_demerits(final SubLObject enhanced_pph_output_item) {
        assert NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : "pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + "CommonSymbols.NIL != pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + enhanced_pph_output_item;
        return aref(enhanced_pph_output_item, ONE_INTEGER);
    }

    public static SubLObject enhanced_pph_output_item_justification(final SubLObject enhanced_pph_output_item) {
        assert NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : "pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + "CommonSymbols.NIL != pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + enhanced_pph_output_item;
        return aref(enhanced_pph_output_item, TWO_INTEGER);
    }

    public static SubLObject enhanced_pph_output_item_set_demerits(final SubLObject enhanced_pph_output_item, final SubLObject demerits) {
        assert NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : "pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + "CommonSymbols.NIL != pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + enhanced_pph_output_item;
        assert NIL != subl_promotions.non_negative_integer_p(demerits) : "subl_promotions.non_negative_integer_p(demerits) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(demerits) " + demerits;
        set_aref(enhanced_pph_output_item, ONE_INTEGER, demerits);
        return enhanced_pph_output_item;
    }

    public static SubLObject enhanced_pph_output_item_set_justification(final SubLObject enhanced_pph_output_item, final SubLObject justification) {
        assert NIL != enhanced_pph_output_item_p(enhanced_pph_output_item) : "pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + "CommonSymbols.NIL != pph_data_structures.enhanced_pph_output_item_p(enhanced_pph_output_item) " + enhanced_pph_output_item;
        assert NIL != listp(justification) : "Types.listp(justification) " + "CommonSymbols.NIL != Types.listp(justification) " + justification;
        set_aref(enhanced_pph_output_item, TWO_INTEGER, justification);
        return enhanced_pph_output_item;
    }

    public static SubLObject cfasl_output_object_pph_phrase_output_item_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_pph_oi(v_object, stream);
    }

    public static SubLObject cfasl_output_pph_oi(final SubLObject pph_oi, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_pph_oi$.getGlobalValue(), stream);
        cfasl_output(pph_oi_string(pph_oi), stream);
        cfasl_output(pph_oi_arg_position(pph_oi), stream);
        cfasl_output(pph_oi_cycl(pph_oi), stream);
        cfasl_output(pph_oi_html_open_tag(pph_oi), stream);
        cfasl_output(pph_oi_html_close_tag(pph_oi), stream);
        cfasl_output(pph_oi_agr(pph_oi), stream);
        return pph_oi;
    }

    public static SubLObject cfasl_input_pph_oi(final SubLObject stream) {
        SubLObject pph_oi = NIL;
        pph_oi = make_pph_phrase_output_item(UNPROVIDED);
        _csetf_pph_oi_string(pph_oi, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_pph_oi_arg_position(pph_oi, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_pph_oi_cycl(pph_oi, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_pph_oi_html_open_tag(pph_oi, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_pph_oi_html_close_tag(pph_oi, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_pph_oi_agr(pph_oi, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return pph_oi;
    }

    public static SubLObject pprint_pph_phrase_info_bundle(final SubLObject bundle, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject cycl_slot_value = pph_phrase_info_cycl(bundle);
        format(stream, $str151$_S__S, pph_phrase_info_agr(bundle), cycl_slot_value);
        return bundle;
    }

    public static SubLObject new_pph_phrase_limit() {
        return NIL != pph_vars.pph_generate_alternative_phrasesP() ? NIL != pph_vars.pph_generate_morphological_alternativesP() ? $a_shitload_of_new_pph_phrases$.getGlobalValue() : $a_whole_lot_of_new_pph_phrases$.getGlobalValue() : $a_lot_of_new_pph_phrases$.getGlobalValue();
    }

    public static SubLObject make_pph_phrase_shell(final SubLObject suid) {
        final SubLObject v_pph_phrase = document.new_sign();
        pph_phrase.pph_phrase_set_suid(v_pph_phrase, suid);
        document._csetf_sign_info(v_pph_phrase, make_paraphrase_phrase_info_bundle(UNPROVIDED));
        return v_pph_phrase;
    }

    public static SubLObject new_pph_phrase(SubLObject string, SubLObject cycl, SubLObject agr) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = pph_phrase.pph_unknown_cycl();
        }
        if (agr == UNPROVIDED) {
            agr = new_dont_care_pph_phrase_agr();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_macros.$creating_permanent_pph_phraseP$.getDynamicValue(thread)) {
            final SubLObject limit = new_pph_phrase_limit();
            if (pph_macros.new_pph_phrase_count().numG(limit)) {
                final SubLObject new_format_string = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str155$new_PPH_phrase_limit_of__S_exceed) });
                pph_error.pph_handle_error(new_format_string, list(limit));
            }
        }
        final SubLObject phrase = document.new_sign();
        final SubLObject info_bundle = make_paraphrase_phrase_info_bundle(UNPROVIDED);
        _csetf_pph_phrase_info_cycl(info_bundle, cycl);
        _csetf_pph_phrase_info_agr(info_bundle, agr);
        _csetf_pph_phrase_info_other(info_bundle, cons($pph_empty_info_vector$.getGlobalValue(), NIL));
        document._csetf_sign_info(phrase, info_bundle);
        pph_phrase.pph_phrase_set_suid(phrase, get_next_pph_phrase_id());
        if (NIL == string) {
            document._csetf_sign_string(phrase, NIL);
        } else {
            pph_phrase.pph_phrase_set_string(phrase, string);
        }
        pph_phrase.pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_identity_map());
        if (NIL == pph_macros.$creating_permanent_pph_phraseP$.getDynamicValue(thread)) {
            if (NIL != misc_utilities.initialized_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread))) {
                pph_macros.note_new_pph_phrase(phrase);
            } else {
                final SubLObject new_format_string2 = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str156$New_PPH_phrase_not_expected_to_be) });
                pph_error.pph_handle_error(new_format_string2, list(phrase));
            }
        }
        return phrase;
    }

    public static SubLObject populate_pph_phrase(final SubLObject v_pph_phrase, final SubLObject cycl, final SubLObject agr, SubLObject justification, SubLObject output_list, SubLObject arg_position_map, SubLObject info_other) {
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        if (output_list == UNPROVIDED) {
            output_list = NIL;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (info_other == UNPROVIDED) {
            info_other = cons($pph_empty_info_vector$.getGlobalValue(), NIL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info_bundle = document.sign_info(v_pph_phrase);
        _csetf_pph_phrase_info_cycl(info_bundle, cycl);
        _csetf_pph_phrase_info_agr(info_bundle, agr);
        _csetf_pph_phrase_info_justification(info_bundle, justification);
        _csetf_pph_phrase_info_output_list(info_bundle, output_list);
        _csetf_pph_phrase_info_other(info_bundle, info_other);
        pph_phrase.pph_phrase_set_arg_position_map(v_pph_phrase, arg_position_map);
        if (NIL == pph_macros.$creating_permanent_pph_phraseP$.getDynamicValue(thread)) {
            if (NIL == pph_macros.$destroy_new_pph_phrasesP$.getDynamicValue(thread)) {
                final SubLObject new_format_string = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str156$New_PPH_phrase_not_expected_to_be) });
                pph_error.pph_handle_error(new_format_string, list(v_pph_phrase));
            }
            pph_macros.note_new_pph_phrase(v_pph_phrase);
        }
        return v_pph_phrase;
    }

    public static SubLObject pph_info_vector_slots() {
        return $pph_info_vector_slots$.getGlobalValue();
    }

    public static SubLObject make_pph_info_vector() {
        final SubLObject length = length($pph_info_vector_slots$.getGlobalValue());
        final SubLObject v_default = $pph_info_vector_unspecified_value$.getGlobalValue();
        return make_vector(length, v_default);
    }

    public static SubLObject pph_phrase_info_vector(final SubLObject phrase) {
        return pph_phrase_info_other(document.sign_info(phrase)).first();
    }

    public static SubLObject pph_phrase_info_vector_lookup(final SubLObject phrase, final SubLObject index, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject vector = pph_phrase_info_vector(phrase);
        return pph_info_vector_lookup(vector, index, v_default);
    }

    public static SubLObject pph_phrase_info_vector_lookup_no_default(final SubLObject phrase, final SubLObject index) {
        final SubLObject vector = pph_phrase_info_vector(phrase);
        return pph_info_vector_straight_lookup(vector, index);
    }

    public static SubLObject pph_phrase_info_vector_clear(final SubLObject phrase, final SubLObject index) {
        pph_phrase_info_vector_set(phrase, index, $pph_info_vector_unspecified_value$.getGlobalValue());
        return index;
    }

    public static SubLObject pph_info_vector_lookup(final SubLObject vector, final SubLObject index, final SubLObject v_default) {
        final SubLObject value = pph_info_vector_straight_lookup(vector, index);
        return value.eql($pph_info_vector_unspecified_value$.getGlobalValue()) ? v_default : value;
    }

    public static SubLObject pph_info_vector_straight_lookup(final SubLObject vector, final SubLObject index) {
        assert NIL != pph_info_vector_p(vector) : "pph_data_structures.pph_info_vector_p(vector) " + "CommonSymbols.NIL != pph_data_structures.pph_info_vector_p(vector) " + vector;
        return vector.isVector() && (NIL != list_utilities.lengthG(vector, index, UNPROVIDED)) ? aref(vector, index) : $pph_info_vector_unspecified_value$.getGlobalValue();
    }

    public static SubLObject pph_phrase_info_vector_set(final SubLObject phrase, final SubLObject index, final SubLObject value) {
        SubLObject vector = pph_phrase_info_vector(phrase);
        if ((!vector.isVector()) && (!value.eql($pph_info_vector_unspecified_value$.getGlobalValue()))) {
            vector = make_pph_info_vector();
            rplaca(pph_phrase_info_other(document.sign_info(phrase)), vector);
        }
        if (vector.isVector()) {
            set_aref(vector, index, value);
        }
        return value;
    }

    public static SubLObject pph_phrase_id_index() {
        return $pph_phrase_id_index$.getGlobalValue();
    }

    public static SubLObject pph_phrase_id_index_new_objects_size() {
        return hash_table_size(id_index_sparse_objects($pph_phrase_id_index$.getGlobalValue()));
    }

    public static SubLObject pph_phrase_id_index_new_objects_count() {
        return id_index_sparse_object_count($pph_phrase_id_index$.getGlobalValue());
    }

    public static SubLObject clear_pph_phrase_id_index(SubLObject initial_old_object_count) {
        if (initial_old_object_count == UNPROVIDED) {
            initial_old_object_count = ZERO_INTEGER;
        }
        $pph_phrase_id_index$.setGlobalValue(new_id_index(initial_old_object_count, UNPROVIDED));
        return NIL;
    }

    public static SubLObject pph_phrase_id_index_enter(final SubLObject v_pph_phrase, final SubLObject suid) {
        SubLObject release = NIL;
        try {
            release = seize_lock($pph_phrase_id_index_lock$.getGlobalValue());
            id_index_enter(pph_phrase_id_index(), suid, v_pph_phrase);
        } finally {
            if (NIL != release) {
                release_lock($pph_phrase_id_index_lock$.getGlobalValue());
            }
        }
        return suid;
    }

    public static SubLObject pph_phrase_id_index_remove(final SubLObject suid) {
        SubLObject release = NIL;
        try {
            release = seize_lock($pph_phrase_id_index_lock$.getGlobalValue());
            id_index_remove(pph_phrase_id_index(), suid);
        } finally {
            if (NIL != release) {
                release_lock($pph_phrase_id_index_lock$.getGlobalValue());
            }
        }
        return suid;
    }

    public static SubLObject optimize_pph_phrase_id_index(SubLObject remove_invalid_pph_phrasesP) {
        if (remove_invalid_pph_phrasesP == UNPROVIDED) {
            remove_invalid_pph_phrasesP = T;
        }
        final SubLObject v_id_index = pph_phrase_id_index();
        if (NIL != remove_invalid_pph_phrasesP) {
            remove_invalid_pph_phrases();
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($pph_phrase_id_index_lock$.getGlobalValue());
            optimize_id_index(compact_id_index(v_id_index, PPH_PHRASE_SET_SUID), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($pph_phrase_id_index_lock$.getGlobalValue());
            }
        }
        return v_id_index;
    }

    public static SubLObject remove_invalid_pph_phrases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = pph_phrase_id_index();
        SubLObject count = ZERO_INTEGER;
        SubLObject bad_pph_phrases = misc_utilities.uninitialized();
        while ((NIL != misc_utilities.uninitialized_p(bad_pph_phrases)) || (NIL != list_utilities.non_empty_list_p(bad_pph_phrases))) {
            SubLObject release = NIL;
            try {
                release = seize_lock($pph_phrase_id_index_lock$.getGlobalValue());
                bad_pph_phrases = NIL;
                final SubLObject idx = v_id_index;
                final SubLObject mess = $$$Removing_invalid_PPH_phrases;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$1 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                            final SubLObject idx_$2 = idx_$1;
                            if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$2);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject suid;
                                SubLObject phrase;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    suid = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    phrase = aref(vector_var, suid);
                                    if ((NIL == id_index_tombstone_p(phrase)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(phrase)) {
                                            phrase = $SKIP;
                                        }
                                        if (NIL == valid_pph_phrase_p(phrase)) {
                                            bad_pph_phrases = cons(suid, bad_pph_phrases);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$3 = idx_$1;
                            if (NIL == id_index_sparse_objects_empty_p(idx_$3)) {
                                final SubLObject cdohash_table = id_index_sparse_objects(idx_$3);
                                SubLObject suid2 = NIL;
                                SubLObject phrase2 = NIL;
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        suid2 = getEntryKey(cdohash_entry);
                                        phrase2 = getEntryValue(cdohash_entry);
                                        if (NIL == valid_pph_phrase_p(phrase2)) {
                                            bad_pph_phrases = cons(suid2, bad_pph_phrases);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
                SubLObject cdolist_list_var = bad_pph_phrases;
                SubLObject bad_pph_phrase = NIL;
                bad_pph_phrase = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    id_index_remove(v_id_index, bad_pph_phrase);
                    count = add(count, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    bad_pph_phrase = cdolist_list_var.first();
                } 
            } finally {
                if (NIL != release) {
                    release_lock($pph_phrase_id_index_lock$.getGlobalValue());
                }
            }
        } 
        if (count.isPositive()) {
            Errors.warn($str165$Removed__S_items_from__PPH_PHRASE, count);
        } else {
            princ($str166$Found_no_invalid_PPH_phrases_, UNPROVIDED);
        }
        return count;
    }

    public static SubLObject valid_pph_phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_phrase.pph_phrase_p(v_object, UNPROVIDED)) && ($FREE != pph_phrase.pph_phrase_mother(v_object)));
    }

    public static SubLObject pph_phrase_set_suid_if_valid(final SubLObject phrase, final SubLObject suid) {
        if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
            pph_phrase.pph_phrase_set_suid(phrase, suid);
        }
        return phrase;
    }

    public static SubLObject get_next_pph_phrase_id() {
        final SubLObject v_id_index = pph_phrase_id_index();
        return id_index_reserve(v_id_index);
    }

    public static SubLObject find_pph_phrase_by_id(final SubLObject pph_phrase_id) {
        assert NIL != integerp(pph_phrase_id) : "Types.integerp(pph_phrase_id) " + "CommonSymbols.NIL != Types.integerp(pph_phrase_id) " + pph_phrase_id;
        return id_index_lookup(pph_phrase_id_index(), pph_phrase_id, UNPROVIDED);
    }

    public static SubLObject pph_phrase_count() {
        return id_index_count(pph_phrase_id_index());
    }

    public static SubLObject pph_phrase_constituents_vector_to_id_list(final SubLObject v_pph_phrase) {
        SubLObject result = NIL;
        final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject this_pph_phrase;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            this_pph_phrase = aref(vector_var, element_num);
            result = cons(pph_phrase.pph_phrase_suid(this_pph_phrase), result);
        }
        return nreverse(result);
    }

    public static SubLObject pph_phrase_constituents_id_list_to_vector(final SubLObject pph_phrase_suid_list) {
        final SubLObject result = make_vector(length(pph_phrase_suid_list), UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = pph_phrase_suid_list;
        SubLObject this_pph_phrase_suid = NIL;
        this_pph_phrase_suid = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_aref(result, index, find_pph_phrase_by_id(this_pph_phrase_suid));
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            this_pph_phrase_suid = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject dump_pph_phrase_content(final SubLObject v_pph_phrase, final SubLObject stream) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str169$__Dumping__S__, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(document.sign_string(v_pph_phrase), stream);
        cfasl_output(document.sign_type(v_pph_phrase), stream);
        cfasl_output(document.sign_category(v_pph_phrase), stream);
        cfasl_output(pph_phrase_constituents_vector_to_id_list(v_pph_phrase), stream);
        cfasl_output(document.sign_offset(v_pph_phrase), stream);
        cfasl_output(NIL != pph_phrase.pph_phrase_p(document.sign_mother(v_pph_phrase), UNPROVIDED) ? pph_phrase.pph_phrase_suid(document.sign_mother(v_pph_phrase)) : NIL, stream);
        final SubLObject pph_phrase_info = document.sign_info(v_pph_phrase);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str170$__Dumping_CycL___S__, pph_phrase_info_cycl(pph_phrase_info), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(pph_phrase_info_cycl(pph_phrase_info), stream);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str171$__Dumping_Agr___S__, pph_phrase_info_agr(pph_phrase_info), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(pph_phrase_info_agr(pph_phrase_info), stream);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str172$__Dumping_Justification___S__, pph_phrase_info_justification(pph_phrase_info), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(pph_phrase_info_justification(pph_phrase_info), stream);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str173$__Dumping_Output_List___S__, pph_phrase_info_output_list(pph_phrase_info), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(pph_phrase_info_output_list(pph_phrase_info), stream);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str174$__Dumping_Arg_Position_Map___S__, pph_phrase_info_arg_position_map(pph_phrase_info), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(pph_phrase_info_arg_position_map(pph_phrase_info), stream);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str175$__Dumping_Other___S__, pph_phrase_info_other(pph_phrase_info), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_output(prepare_pph_phrase_info_other_for_dump(pph_phrase_info_other(pph_phrase_info)), stream);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str176$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject load_pph_phrase_content(final SubLObject v_pph_phrase, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject category = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject constituents = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject offset = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject mother = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject cycl = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject agr = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject justification = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject output_list = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_position_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject other = recover_pph_phrase_info_other(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$creating_permanent_pph_phraseP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(ZERO_INTEGER, thread);
            pph_macros.$creating_permanent_pph_phraseP$.bind(T, thread);
            if (mother.isInteger()) {
                mother = find_pph_phrase_by_id(mother);
            }
            if (constituents.isCons() && (NIL != list_utilities.list_of_type_p(INTEGERP, constituents))) {
                constituents = pph_phrase_constituents_id_list_to_vector(constituents);
            }
            document._csetf_sign_string(v_pph_phrase, string);
            document._csetf_sign_type(v_pph_phrase, type);
            document._csetf_sign_category(v_pph_phrase, category);
            document._csetf_sign_constituents(v_pph_phrase, constituents);
            document._csetf_sign_offset(v_pph_phrase, offset);
            document._csetf_sign_mother(v_pph_phrase, mother);
            populate_pph_phrase(v_pph_phrase, cycl, agr, justification, output_list, arg_position_map, other);
        } finally {
            pph_macros.$creating_permanent_pph_phraseP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return v_pph_phrase;
    }

    public static SubLObject prepare_pph_phrase_info_other_for_dump(final SubLObject info_other) {
        return shellify_pph_phrases(listify_pph_vectors(info_other));
    }

    public static SubLObject recover_pph_phrase_info_other(final SubLObject input_value) {
        return delistify_pph_vectors(deshellify_pph_phrases(input_value));
    }

    public static SubLObject pph_listified_vector_p(final SubLObject obj) {
        return makeBoolean(obj.isCons() && obj.first().eql($pph_listified_vector_marker$.getGlobalValue()));
    }

    public static SubLObject listify_pph_vectors(final SubLObject tree) {
        return transform_list_utilities.transform(tree, VECTORP, LISTIFY_PPH_VECTOR, UNPROVIDED);
    }

    public static SubLObject listify_pph_vector(final SubLObject vector) {
        return list_utilities.vector2list_reversible(vector, $pph_listified_vector_marker$.getGlobalValue());
    }

    public static SubLObject delistify_pph_vectors(final SubLObject tree) {
        return transform_list_utilities.transform(tree, PPH_LISTIFIED_VECTOR_P, DELISTIFY_PPH_VECTOR, UNPROVIDED);
    }

    public static SubLObject delistify_pph_vector(final SubLObject listified_vector) {
        return list_utilities.listified_vector2vector(listified_vector, $pph_listified_vector_marker$.getGlobalValue());
    }

    public static SubLObject shellify_pph_phrases(final SubLObject tree) {
        return transform_list_utilities.transform(tree, PPH_PHRASE_P, SHELLIFY_PPH_PHRASE, UNPROVIDED);
    }

    public static SubLObject shellify_pph_phrase(final SubLObject phrase) {
        return cons($pph_phrase_shell_marker$.getGlobalValue(), pph_phrase.pph_phrase_suid(phrase));
    }

    public static SubLObject shellified_pph_phrase_p(final SubLObject obj) {
        return makeBoolean((obj.isCons() && obj.first().eql($pph_phrase_shell_marker$.getGlobalValue())) && obj.rest().isInteger());
    }

    public static SubLObject deshellify_pph_phrases(final SubLObject tree) {
        return transform_list_utilities.transform(tree, SHELLIFIED_PPH_PHRASE_P, DESHELLIFY_PPH_PHRASE, UNPROVIDED);
    }

    public static SubLObject deshellify_pph_phrase(final SubLObject shellified_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suid = shellified_phrase.rest();
        final SubLObject phrase = find_pph_phrase_by_id(suid);
        if (((NIL == phrase) && (NIL != pph_error.pph_trace_level_exceeds_minimumP($str186$Couldn_t_find_PPH_phrase__D))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn(suid);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return phrase;
    }

    public static SubLObject paraphrase_cycl_caches_unbuiltP() {
        return makeBoolean((NIL == gen_template_store_initializedP()) || (NIL == pph_main.pph_initializedP()));
    }

    public static SubLObject rebuild_paraphrase_cycl_caches() {
        return pph_main.initialize_paraphrase_cycl();
    }

    public static SubLObject dump_gen_template_store_to_stream(final SubLObject stream) {
        cfasl_output($gen_template_store$.getGlobalValue(), stream);
        return NIL;
    }

    public static SubLObject load_gen_template_store_from_stream(final SubLObject stream) {
        $gen_template_store$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject pph_phrase_template_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_template_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_phrase_template_generator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$pph_phrase_template_generator_native.class ? T : NIL;
    }

    public static SubLObject pph_phrase_template_generator_formula(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pph_phrase_template_generator_mt(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject pph_phrase_template_generator_focus_arg(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject pph_phrase_template_generator_specified_reln(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject pph_phrase_template_generator_nl_preds(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject pph_phrase_template_generator_doneP(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject pph_phrase_template_generator_search_limit(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject pph_phrase_template_generator_search_level(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject pph_phrase_template_generator_relns_to_use(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject pph_phrase_template_generator_gen_template_sets(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject pph_phrase_template_generator_gen_templates(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject pph_phrase_template_generator_arg_position_map(final SubLObject v_object) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_pph_phrase_template_generator_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_focus_arg(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_specified_reln(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_nl_preds(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_doneP(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_search_limit(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_search_level(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_relns_to_use(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_gen_template_sets(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_gen_templates(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_pph_phrase_template_generator_arg_position_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_template_generator_p(v_object) : "pph_data_structures.pph_phrase_template_generator_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_pph_phrase_template_generator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $pph_phrase_template_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FORMULA)) {
                _csetf_pph_phrase_template_generator_formula(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_pph_phrase_template_generator_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($FOCUS_ARG)) {
                        _csetf_pph_phrase_template_generator_focus_arg(v_new, current_value);
                    } else
                        if (pcase_var.eql($SPECIFIED_RELN)) {
                            _csetf_pph_phrase_template_generator_specified_reln(v_new, current_value);
                        } else
                            if (pcase_var.eql($NL_PREDS)) {
                                _csetf_pph_phrase_template_generator_nl_preds(v_new, current_value);
                            } else
                                if (pcase_var.eql($DONE_)) {
                                    _csetf_pph_phrase_template_generator_doneP(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SEARCH_LIMIT)) {
                                        _csetf_pph_phrase_template_generator_search_limit(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SEARCH_LEVEL)) {
                                            _csetf_pph_phrase_template_generator_search_level(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RELNS_TO_USE)) {
                                                _csetf_pph_phrase_template_generator_relns_to_use(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($GEN_TEMPLATE_SETS)) {
                                                    _csetf_pph_phrase_template_generator_gen_template_sets(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($GEN_TEMPLATES)) {
                                                        _csetf_pph_phrase_template_generator_gen_templates(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($ARG_POSITION_MAP)) {
                                                            _csetf_pph_phrase_template_generator_arg_position_map(v_new, current_value);
                                                        } else {
                                                            Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_phrase_template_generator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_PHRASE_TEMPLATE_GENERATOR, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FORMULA, pph_phrase_template_generator_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, pph_phrase_template_generator_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCUS_ARG, pph_phrase_template_generator_focus_arg(obj));
        funcall(visitor_fn, obj, $SLOT, $SPECIFIED_RELN, pph_phrase_template_generator_specified_reln(obj));
        funcall(visitor_fn, obj, $SLOT, $NL_PREDS, pph_phrase_template_generator_nl_preds(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_, pph_phrase_template_generator_doneP(obj));
        funcall(visitor_fn, obj, $SLOT, $SEARCH_LIMIT, pph_phrase_template_generator_search_limit(obj));
        funcall(visitor_fn, obj, $SLOT, $SEARCH_LEVEL, pph_phrase_template_generator_search_level(obj));
        funcall(visitor_fn, obj, $SLOT, $RELNS_TO_USE, pph_phrase_template_generator_relns_to_use(obj));
        funcall(visitor_fn, obj, $SLOT, $GEN_TEMPLATE_SETS, pph_phrase_template_generator_gen_template_sets(obj));
        funcall(visitor_fn, obj, $SLOT, $GEN_TEMPLATES, pph_phrase_template_generator_gen_templates(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_POSITION_MAP, pph_phrase_template_generator_arg_position_map(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_PHRASE_TEMPLATE_GENERATOR, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_phrase_template_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_template_generator(obj, visitor_fn);
    }

    public static SubLObject pprint_pph_phrase_template_generator(final SubLObject generator, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str233$_PPH_Phrase_Template_Generator___, pph_phrase_template_generator_formula(generator));
        return generator;
    }

    public static SubLObject initialize_pph_phrase_template_generator(final SubLObject generator, final SubLObject formula, final SubLObject focus_arg, final SubLObject specified_reln, final SubLObject nl_preds, final SubLObject mt, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_pph_phrase_template_generator_formula(generator, formula);
        _csetf_pph_phrase_template_generator_mt(generator, mt);
        _csetf_pph_phrase_template_generator_focus_arg(generator, focus_arg);
        _csetf_pph_phrase_template_generator_specified_reln(generator, specified_reln);
        _csetf_pph_phrase_template_generator_nl_preds(generator, nl_preds);
        _csetf_pph_phrase_template_generator_doneP(generator, NIL);
        _csetf_pph_phrase_template_generator_search_limit(generator, pph_utilities.pph_search_limit());
        _csetf_pph_phrase_template_generator_search_level(generator, ZERO_INTEGER);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    _csetf_pph_phrase_template_generator_arg_position_map(generator, arg_position_map);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        queues.clear_queue(pph_phrase_template_generator_relns_to_use(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_template_sets(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_templates(generator));
        pph_templates.pph_phrase_template_generator_initialize_queues(generator);
        return generator;
    }

    public static SubLObject pph_phrase_template_generator_done_p(final SubLObject generator) {
        return pph_phrase_template_generator_doneP(generator);
    }

    public static SubLObject get_pph_phrase_template_generator(final SubLObject formula, SubLObject focus_arg, SubLObject specified_reln, SubLObject nl_preds, SubLObject arg_position_map, SubLObject mt) {
        if (focus_arg == UNPROVIDED) {
            focus_arg = NIL;
        }
        if (specified_reln == UNPROVIDED) {
            specified_reln = NIL;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        SubLObject generator = queues.dequeue($free_pph_phrase_template_generators$.getGlobalValue());
        if (NIL == pph_phrase_template_generator_p(generator)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str239$Making_new_PPH_phrase_template_ge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            generator = make_pph_phrase_template_generator(list($RELNS_TO_USE, queues.create_queue(UNPROVIDED), $GEN_TEMPLATE_SETS, queues.create_queue(UNPROVIDED), $GEN_TEMPLATES, queues.create_queue(UNPROVIDED)));
        }
        initialize_pph_phrase_template_generator(generator, formula, focus_arg, specified_reln, nl_preds, mt, arg_position_map);
        return generator;
    }

    public static SubLObject free_pph_phrase_template_generator(final SubLObject generator) {
        _csetf_pph_phrase_template_generator_formula(generator, $FREE);
        _csetf_pph_phrase_template_generator_mt(generator, $FREE);
        _csetf_pph_phrase_template_generator_focus_arg(generator, $FREE);
        _csetf_pph_phrase_template_generator_specified_reln(generator, $FREE);
        _csetf_pph_phrase_template_generator_nl_preds(generator, $FREE);
        _csetf_pph_phrase_template_generator_doneP(generator, $FREE);
        _csetf_pph_phrase_template_generator_search_limit(generator, $FREE);
        _csetf_pph_phrase_template_generator_search_level(generator, $FREE);
        queues.clear_queue(pph_phrase_template_generator_relns_to_use(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_template_sets(generator));
        queues.clear_queue(pph_phrase_template_generator_gen_templates(generator));
        queues.enqueue(generator, $free_pph_phrase_template_generators$.getGlobalValue());
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str240$Freeing_PPH_phrase_template_gener, queues.queue_size($free_pph_phrase_template_generators$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return generator;
    }

    public static SubLObject pph_phrase_output_list_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_phrase_output_list_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_phrase_output_list_iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$pph_phrase_output_list_iterator_native.class ? T : NIL;
    }

    public static SubLObject pph_phrase_output_list_iterator_item_queue(final SubLObject v_object) {
        assert NIL != pph_phrase_output_list_iterator_p(v_object) : "pph_data_structures.pph_phrase_output_list_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_pph_phrase_output_list_iterator_item_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_phrase_output_list_iterator_p(v_object) : "pph_data_structures.pph_phrase_output_list_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_pph_phrase_output_list_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $pph_phrase_output_list_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ITEM_QUEUE)) {
                _csetf_pph_phrase_output_list_iterator_item_queue(v_new, current_value);
            } else {
                Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_phrase_output_list_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ITEM_QUEUE, pph_phrase_output_list_iterator_item_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_PHRASE_OUTPUT_LIST_ITERATOR, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_phrase_output_list_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_phrase_output_list_iterator(obj, visitor_fn);
    }

    public static SubLObject pprint_pph_phrase_output_list_iterator(final SubLObject iterator, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str255$_PPH_OL_Iterator_);
        return iterator;
    }

    public static SubLObject new_pph_phrase_output_list_iterator(final SubLObject output_list) {
        final SubLObject iterator = make_pph_phrase_output_list_iterator(UNPROVIDED);
        final SubLObject item_queue = queues.create_queue(UNPROVIDED);
        SubLObject cdolist_list_var = output_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queues.enqueue(pph_phrase_output_item_copy(item), item_queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        _csetf_pph_phrase_output_list_iterator_item_queue(iterator, item_queue);
        return iterator;
    }

    public static SubLObject pph_phrase_output_list_iterator_empty_p(final SubLObject iterator) {
        return queues.queue_empty_p(pph_phrase_output_list_iterator_item_queue(iterator));
    }

    public static SubLObject pph_phrase_output_list_iterator_next(final SubLObject iterator) {
        if (NIL != pph_phrase_output_list_iterator_empty_p(iterator)) {
            final SubLObject new_format_string = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str256$___Iterator_empty___S__) });
            pph_error.pph_handle_error(new_format_string, list(iterator));
        }
        final SubLObject queue = pph_phrase_output_list_iterator_item_queue(iterator);
        final SubLObject top = queues.queue_peek(queue);
        if (NIL != pph_phrase_output_item_p(top)) {
            queues.dequeue(queue);
            return top;
        }
        if (NIL != pph_phrase_output_item_nospace_group_p(top)) {
            final SubLObject next = pph_phrase_output_item_nospace_group_grab_first_item(top);
            if (NIL == pph_phrase_output_item_nospace_group_items(top)) {
                queues.dequeue(queue);
            }
            return next;
        }
        if (NIL != enhanced_pph_output_item_p(top)) {
            queues.dequeue(queue);
            return top;
        }
        final SubLObject new_format_string2 = cconcatenate($str37$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str38$__, format_nil.format_nil_a_no_copy($str257$___Can_t_get_next_item_from__S) });
        pph_error.pph_handle_error(new_format_string2, list(iterator));
        return NIL;
    }

    public static SubLObject pph_phrase_output_item_nospace_group_grab_first_item(final SubLObject nospace_group) {
        final SubLObject nospace_group_items = pph_phrase_output_item_nospace_group_items(nospace_group);
        final SubLObject first_nospace_group_item = nospace_group_items.first();
        SubLObject first_item = first_nospace_group_item.first();
        if (NIL != pph_phrase_output_item_nospace_group_p(first_item)) {
            final SubLObject real_first_item = pph_phrase_output_item_nospace_group_grab_first_item(first_item);
            if (NIL == pph_phrase_output_item_nospace_group_items(first_item)) {
                pph_nospace_group_remove_first_item(nospace_group);
            }
            first_item = real_first_item;
        } else
            if (NIL != pph_phrase_output_item_loose_p(first_item)) {
                pph_nospace_group_remove_first_item(nospace_group);
            }

        if (NIL != pph_phrase_output_item_p(first_item)) {
            pph_update_output_item_from_nospace_group(first_item, nospace_group);
        }
        return first_item;
    }

    public static SubLObject pph_nospace_group_remove_first_item(final SubLObject nospace_group) {
        final SubLObject nospace_group_items = pph_phrase_output_item_nospace_group_items(nospace_group);
        SubLObject first_nospace_group_item = nospace_group_items.first();
        first_nospace_group_item = first_nospace_group_item.rest();
        final SubLObject new_items = (NIL == first_nospace_group_item) ? nospace_group_items.rest() : cons(first_nospace_group_item, nospace_group_items.rest());
        pph_phrase_output_item_nospace_group_set_items(nospace_group, new_items);
        return nospace_group;
    }

    public static SubLObject pph_update_output_item_from_nospace_group(final SubLObject item, final SubLObject nospace_group) {
        if (NIL == pph_phrase.pph_known_cycl_p(pph_phrase_output_item_cycl(item))) {
            pph_phrase_output_item_set_cycl(item, pph_phrase_output_item_nospace_group_cycl(nospace_group));
            pph_phrase_output_item_set_arg_position(item, pph_phrase_output_item_nospace_group_arg_position(nospace_group));
        }
        final SubLObject item_open_tag = pph_phrase_output_item_html_open_tag(item);
        final SubLObject nospace_group_open_tag = pph_phrase_output_item_nospace_group_html_open_tag(nospace_group);
        final SubLObject new_open_tag = (item_open_tag.isString()) ? nospace_group_open_tag.isString() ? cconcatenate(nospace_group_open_tag, item_open_tag) : item_open_tag : nospace_group_open_tag;
        final SubLObject item_close_tag = pph_phrase_output_item_html_close_tag(item);
        final SubLObject nospace_group_close_tag = pph_phrase_output_item_nospace_group_html_close_tag(nospace_group);
        final SubLObject last_itemP = sublisp_null(pph_phrase_output_item_nospace_group_items(nospace_group));
        final SubLObject new_close_tag = (item_close_tag.isString()) ? nospace_group_close_tag.isString() && (NIL != last_itemP) ? cconcatenate(item_close_tag, nospace_group_close_tag) : item_close_tag : NIL != last_itemP ? nospace_group_close_tag : NIL;
        pph_phrase_output_item_nospace_group_set_html_tags(nospace_group, NIL, nospace_group_close_tag);
        pph_phrase_output_item_set_html_tags(item, new_open_tag, new_close_tag);
        return item;
    }

    public static SubLObject declare_pph_data_structures_file() {
        declareFunction(me, "gen_template_store_present_p", "GEN-TEMPLATE-STORE-PRESENT-P", 0, 0, false);
        declareFunction(me, "note_gen_template_store_initialized", "NOTE-GEN-TEMPLATE-STORE-INITIALIZED", 0, 0, false);
        declareFunction(me, "clear_gen_template_store", "CLEAR-GEN-TEMPLATE-STORE", 0, 0, false);
        declareFunction(me, "gen_template_store_initializedP", "GEN-TEMPLATE-STORE-INITIALIZED?", 0, 0, false);
        declareFunction(me, "check_gen_template_store_initialization", "CHECK-GEN-TEMPLATE-STORE-INITIALIZATION", 0, 0, false);
        declareFunction(me, "gen_template_store_length", "GEN-TEMPLATE-STORE-LENGTH", 0, 0, false);
        declareFunction(me, "new_gen_template_store_iterator", "NEW-GEN-TEMPLATE-STORE-ITERATOR", 0, 0, false);
        declareFunction(me, "gen_template_sets_for_reln_from_store", "GEN-TEMPLATE-SETS-FOR-RELN-FROM-STORE", 1, 1, false);
        declareFunction(me, "set_gen_template_store_value", "SET-GEN-TEMPLATE-STORE-VALUE", 2, 0, false);
        declareFunction(me, "clear_gen_template_store_value", "CLEAR-GEN-TEMPLATE-STORE-VALUE", 1, 0, false);
        declareFunction(me, "destroy_gen_templates_for_reln", "DESTROY-GEN-TEMPLATES-FOR-RELN", 1, 0, false);
        declareFunction(me, "destroy_gen_template", "DESTROY-GEN-TEMPLATE", 1, 0, false);
        declareFunction(me, "generation_template_print_function_trampoline", "GENERATION-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "generation_template_p", "GENERATION-TEMPLATE-P", 1, 0, false);
        new pph_data_structures.$generation_template_p$UnaryFunction();
        declareFunction(me, "gen_template_phrase", "GEN-TEMPLATE-PHRASE", 1, 0, false);
        declareFunction(me, "gen_template_constraint", "GEN-TEMPLATE-CONSTRAINT", 1, 0, false);
        declareFunction(me, "gen_template_assertion", "GEN-TEMPLATE-ASSERTION", 1, 0, false);
        declareFunction(me, "_csetf_gen_template_phrase", "_CSETF-GEN-TEMPLATE-PHRASE", 2, 0, false);
        declareFunction(me, "_csetf_gen_template_constraint", "_CSETF-GEN-TEMPLATE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "_csetf_gen_template_assertion", "_CSETF-GEN-TEMPLATE-ASSERTION", 2, 0, false);
        declareFunction(me, "make_generation_template", "MAKE-GENERATION-TEMPLATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_generation_template", "VISIT-DEFSTRUCT-GENERATION-TEMPLATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_generation_template_method", "VISIT-DEFSTRUCT-OBJECT-GENERATION-TEMPLATE-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_generation_template_method", "SXHASH-GENERATION-TEMPLATE-METHOD", 1, 0, false);
        new pph_data_structures.$sxhash_generation_template_method$UnaryFunction();
        declareFunction(me, "new_gen_template", "NEW-GEN-TEMPLATE", 0, 3, false);
        declareFunction(me, "pprint_gen_template", "PPRINT-GEN-TEMPLATE", 1, 2, false);
        declareFunction(me, "gen_template_el_constraint", "GEN-TEMPLATE-EL-CONSTRAINT", 1, 0, false);
        declareFunction(me, "gen_template_set_constraint", "GEN-TEMPLATE-SET-CONSTRAINT", 2, 0, false);
        declareFunction(me, "get_gen_template_phrase", "GET-GEN-TEMPLATE-PHRASE", 1, 0, false);
        declareFunction(me, "get_gen_template_constraint", "GET-GEN-TEMPLATE-CONSTRAINT", 1, 0, false);
        declareFunction(me, "get_gen_template_assertion", "GET-GEN-TEMPLATE-ASSERTION", 1, 0, false);
        new pph_data_structures.$get_gen_template_assertion$UnaryFunction();
        declareFunction(me, "get_gen_template_mt", "GET-GEN-TEMPLATE-MT", 1, 0, false);
        declareFunction(me, "cfasl_output_object_generation_template_method", "CFASL-OUTPUT-OBJECT-GENERATION-TEMPLATE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_generation_template", "CFASL-OUTPUT-GENERATION-TEMPLATE", 2, 0, false);
        declareFunction(me, "cfasl_input_generation_template", "CFASL-INPUT-GENERATION-TEMPLATE", 1, 0, false);
        new pph_data_structures.$cfasl_input_generation_template$UnaryFunction();
        declareFunction(me, "pph_phrase_agr_print_function_trampoline", "PPH-PHRASE-AGR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_p", "PPH-PHRASE-AGR-P", 1, 0, false);
        new pph_data_structures.$pph_phrase_agr_p$UnaryFunction();
        declareFunction(me, "pph_phrase_agr_absolute_constraint", "PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT", 1, 0, false);
        declareFunction(me, "pph_phrase_agr_relative_constraint", "PPH-PHRASE-AGR-RELATIVE-CONSTRAINT", 1, 0, false);
        declareFunction(me, "_csetf_pph_phrase_agr_absolute_constraint", "_CSETF-PPH-PHRASE-AGR-ABSOLUTE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_agr_relative_constraint", "_CSETF-PPH-PHRASE-AGR-RELATIVE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "make_pph_phrase_agr", "MAKE-PPH-PHRASE-AGR", 0, 1, false);
        declareFunction(me, "visit_defstruct_pph_phrase_agr", "VISIT-DEFSTRUCT-PPH-PHRASE-AGR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_pph_phrase_agr_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-AGR-METHOD", 2, 0, false);
        declareFunction(me, "pprint_pph_phrase_agr", "PPRINT-PPH-PHRASE-AGR", 3, 0, false);
        declareFunction(me, "new_pph_phrase_agr", "NEW-PPH-PHRASE-AGR", 0, 2, false);
        declareFunction(me, "new_pph_phrase_agr_low", "NEW-PPH-PHRASE-AGR-LOW", 2, 0, false);
        declareFunction(me, "new_dont_care_pph_phrase_agr", "NEW-DONT-CARE-PPH-PHRASE-AGR", 0, 0, false);
        declareFunction(me, "dont_care_pph_phrase_agr_p", "DONT-CARE-PPH-PHRASE-AGR-P", 1, 0, false);
        declareFunction(me, "pph_phrase_agr_set_absolute_constraint", "PPH-PHRASE-AGR-SET-ABSOLUTE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_set_relative_constraint", "PPH-PHRASE-AGR-SET-RELATIVE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_copy", "PPH-PHRASE-AGR-COPY", 1, 1, false);
        declareFunction(me, "pph_phrase_agr_relative_constraint_copy", "PPH-PHRASE-AGR-RELATIVE-CONSTRAINT-COPY", 2, 0, false);
        declareFunction(me, "find_new_pph_relative_agr_target", "FIND-NEW-PPH-RELATIVE-AGR-TARGET", 2, 0, false);
        declareFunction(me, "cfasl_output_object_pph_phrase_agr_method", "CFASL-OUTPUT-OBJECT-PPH-PHRASE-AGR-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_pph_phrase_agr", "CFASL-OUTPUT-PPH-PHRASE-AGR", 2, 0, false);
        declareFunction(me, "cfasl_input_pph_phrase_agr", "CFASL-INPUT-PPH-PHRASE-AGR", 1, 0, false);
        new pph_data_structures.$cfasl_input_pph_phrase_agr$UnaryFunction();
        declareFunction(me, "paraphrase_phrase_info_bundle_print_function_trampoline", "PARAPHRASE-PHRASE-INFO-BUNDLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "paraphrase_phrase_info_bundle_p", "PARAPHRASE-PHRASE-INFO-BUNDLE-P", 1, 0, false);
        new pph_data_structures.$paraphrase_phrase_info_bundle_p$UnaryFunction();
        declareFunction(me, "pph_phrase_info_cycl", "PPH-PHRASE-INFO-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_info_agr", "PPH-PHRASE-INFO-AGR", 1, 0, false);
        declareFunction(me, "pph_phrase_info_justification", "PPH-PHRASE-INFO-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "pph_phrase_info_output_list", "PPH-PHRASE-INFO-OUTPUT-LIST", 1, 0, false);
        declareFunction(me, "pph_phrase_info_arg_position_map", "PPH-PHRASE-INFO-ARG-POSITION-MAP", 1, 0, false);
        declareFunction(me, "pph_phrase_info_other", "PPH-PHRASE-INFO-OTHER", 1, 0, false);
        declareFunction(me, "_csetf_pph_phrase_info_cycl", "_CSETF-PPH-PHRASE-INFO-CYCL", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_info_agr", "_CSETF-PPH-PHRASE-INFO-AGR", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_info_justification", "_CSETF-PPH-PHRASE-INFO-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_info_output_list", "_CSETF-PPH-PHRASE-INFO-OUTPUT-LIST", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_info_arg_position_map", "_CSETF-PPH-PHRASE-INFO-ARG-POSITION-MAP", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_info_other", "_CSETF-PPH-PHRASE-INFO-OTHER", 2, 0, false);
        declareFunction(me, "make_paraphrase_phrase_info_bundle", "MAKE-PARAPHRASE-PHRASE-INFO-BUNDLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_paraphrase_phrase_info_bundle", "VISIT-DEFSTRUCT-PARAPHRASE-PHRASE-INFO-BUNDLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_paraphrase_phrase_info_bundle_method", "VISIT-DEFSTRUCT-OBJECT-PARAPHRASE-PHRASE-INFO-BUNDLE-METHOD", 2, 0, false);
        declareFunction(me, "pph_phrase_has_info_vector_p", "PPH-PHRASE-HAS-INFO-VECTOR-P", 1, 0, false);
        declareFunction(me, "pph_empty_info_vector_p", "PPH-EMPTY-INFO-VECTOR-P", 1, 0, false);
        declareFunction(me, "pph_info_vector_p", "PPH-INFO-VECTOR-P", 1, 0, false);
        declareFunction(me, "pph_phrase_plist", "PPH-PHRASE-PLIST", 1, 0, false);
        declareMacro(me, "pph_phrase_do_plist", "PPH-PHRASE-DO-PLIST");
        declareFunction(me, "pph_phrase_info_lookup", "PPH-PHRASE-INFO-LOOKUP", 2, 1, false);
        declareFunction(me, "pph_phrase_info_lookup_by_keyword_or_integer", "PPH-PHRASE-INFO-LOOKUP-BY-KEYWORD-OR-INTEGER", 3, 1, false);
        declareFunction(me, "pph_phrase_info_property_set_p", "PPH-PHRASE-INFO-PROPERTY-SET-P", 3, 0, false);
        declareFunction(me, "pph_phrase_info_set", "PPH-PHRASE-INFO-SET", 3, 0, false);
        declareFunction(me, "pph_phrase_info_set_by_keyword_or_integer", "PPH-PHRASE-INFO-SET-BY-KEYWORD-OR-INTEGER", 4, 0, false);
        declareFunction(me, "pph_phrase_info_clear", "PPH-PHRASE-INFO-CLEAR", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_print_function_trampoline", "PPH-PHRASE-OUTPUT-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_p", "PPH-PHRASE-OUTPUT-ITEM-P", 1, 0, false);
        new pph_data_structures.$pph_phrase_output_item_p$UnaryFunction();
        declareFunction(me, "pph_oi_string", "PPH-OI-STRING", 1, 0, false);
        declareFunction(me, "pph_oi_arg_position", "PPH-OI-ARG-POSITION", 1, 0, false);
        declareFunction(me, "pph_oi_cycl", "PPH-OI-CYCL", 1, 0, false);
        declareFunction(me, "pph_oi_html_open_tag", "PPH-OI-HTML-OPEN-TAG", 1, 0, false);
        declareFunction(me, "pph_oi_html_close_tag", "PPH-OI-HTML-CLOSE-TAG", 1, 0, false);
        declareFunction(me, "pph_oi_agr", "PPH-OI-AGR", 1, 0, false);
        declareFunction(me, "_csetf_pph_oi_string", "_CSETF-PPH-OI-STRING", 2, 0, false);
        declareFunction(me, "_csetf_pph_oi_arg_position", "_CSETF-PPH-OI-ARG-POSITION", 2, 0, false);
        declareFunction(me, "_csetf_pph_oi_cycl", "_CSETF-PPH-OI-CYCL", 2, 0, false);
        declareFunction(me, "_csetf_pph_oi_html_open_tag", "_CSETF-PPH-OI-HTML-OPEN-TAG", 2, 0, false);
        declareFunction(me, "_csetf_pph_oi_html_close_tag", "_CSETF-PPH-OI-HTML-CLOSE-TAG", 2, 0, false);
        declareFunction(me, "_csetf_pph_oi_agr", "_CSETF-PPH-OI-AGR", 2, 0, false);
        declareFunction(me, "make_pph_phrase_output_item", "MAKE-PPH-PHRASE-OUTPUT-ITEM", 0, 1, false);
        declareFunction(me, "visit_defstruct_pph_phrase_output_item", "VISIT-DEFSTRUCT-PPH-PHRASE-OUTPUT-ITEM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_pph_phrase_output_item_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD", 2, 0, false);
        declareFunction(me, "new_pph_phrase_output_item", "NEW-PPH-PHRASE-OUTPUT-ITEM", 0, 6, false);
        declareFunction(me, "pph_phrase_output_item_copy", "PPH-PHRASE-OUTPUT-ITEM-COPY", 1, 0, false);
        declareFunction(me, "pprint_pph_phrase_output_item", "PPRINT-PPH-PHRASE-OUTPUT-ITEM", 1, 2, false);
        declareFunction(me, "pph_phrase_output_item_string", "PPH-PHRASE-OUTPUT-ITEM-STRING", 1, 0, false);
        new pph_data_structures.$pph_phrase_output_item_string$UnaryFunction();
        declareFunction(me, "pph_phrase_output_item_set_string", "PPH-PHRASE-OUTPUT-ITEM-SET-STRING", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_prefix_string", "PPH-PHRASE-OUTPUT-ITEM-PREFIX-STRING", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_suffix_string", "PPH-PHRASE-OUTPUT-ITEM-SUFFIX-STRING", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_arg_position", "PPH-PHRASE-OUTPUT-ITEM-ARG-POSITION", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_set_arg_position", "PPH-PHRASE-OUTPUT-ITEM-SET-ARG-POSITION", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_cycl", "PPH-PHRASE-OUTPUT-ITEM-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_set_cycl", "PPH-PHRASE-OUTPUT-ITEM-SET-CYCL", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-AGR-PRED", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_set_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-SET-AGR-PRED", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_html_open_tag", "PPH-PHRASE-OUTPUT-ITEM-HTML-OPEN-TAG", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_html_close_tag", "PPH-PHRASE-OUTPUT-ITEM-HTML-CLOSE-TAG", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_html_tags", "PPH-PHRASE-OUTPUT-ITEM-HTML-TAGS", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_set_html_tags", "PPH-PHRASE-OUTPUT-ITEM-SET-HTML-TAGS", 3, 0, false);
        declareFunction(me, "pph_phrase_output_item_demerits", "PPH-PHRASE-OUTPUT-ITEM-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_justification", "PPH-PHRASE-OUTPUT-ITEM-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "new_pph_phrase_output_item_nospace_group", "NEW-PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP", 1, 0, false);
        declareFunction(me, "new_pph_phrase_output_item_nospace_group_from_olists", "NEW-PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-FROM-OLISTS", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_p", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-P", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_items", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-ITEMS", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_set_items", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-ITEMS", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_string", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-STRING", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_get_string", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-GET-STRING", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_copy", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-COPY", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_arg_position", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-ARG-POSITION", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_set_arg_position", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-ARG-POSITION", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_cycl", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_set_cycl", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-CYCL", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-AGR-PRED", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_set_agr_pred", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-AGR-PRED", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_set_html_tags", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-SET-HTML-TAGS", 3, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_html_open_tag", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-HTML-OPEN-TAG", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_html_close_tag", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-HTML-CLOSE-TAG", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_loose_p", "PPH-PHRASE-OUTPUT-ITEM-LOOSE-P", 1, 0, false);
        new pph_data_structures.$pph_phrase_output_item_loose_p$UnaryFunction();
        declareFunction(me, "enhanced_pph_output_item_p", "ENHANCED-PPH-OUTPUT-ITEM-P", 1, 0, false);
        declareFunction(me, "new_enhanced_pph_output_item", "NEW-ENHANCED-PPH-OUTPUT-ITEM", 3, 0, false);
        declareFunction(me, "enhanced_pph_output_item_item", "ENHANCED-PPH-OUTPUT-ITEM-ITEM", 1, 0, false);
        declareFunction(me, "enhanced_pph_output_item_demerits", "ENHANCED-PPH-OUTPUT-ITEM-DEMERITS", 1, 0, false);
        declareFunction(me, "enhanced_pph_output_item_justification", "ENHANCED-PPH-OUTPUT-ITEM-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "enhanced_pph_output_item_set_demerits", "ENHANCED-PPH-OUTPUT-ITEM-SET-DEMERITS", 2, 0, false);
        declareFunction(me, "enhanced_pph_output_item_set_justification", "ENHANCED-PPH-OUTPUT-ITEM-SET-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "cfasl_output_object_pph_phrase_output_item_method", "CFASL-OUTPUT-OBJECT-PPH-PHRASE-OUTPUT-ITEM-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_pph_oi", "CFASL-OUTPUT-PPH-OI", 2, 0, false);
        declareFunction(me, "cfasl_input_pph_oi", "CFASL-INPUT-PPH-OI", 1, 0, false);
        new pph_data_structures.$cfasl_input_pph_oi$UnaryFunction();
        declareFunction(me, "pprint_pph_phrase_info_bundle", "PPRINT-PPH-PHRASE-INFO-BUNDLE", 1, 2, false);
        declareFunction(me, "new_pph_phrase_limit", "NEW-PPH-PHRASE-LIMIT", 0, 0, false);
        declareFunction(me, "make_pph_phrase_shell", "MAKE-PPH-PHRASE-SHELL", 1, 0, false);
        declareFunction(me, "new_pph_phrase", "NEW-PPH-PHRASE", 0, 3, false);
        declareFunction(me, "populate_pph_phrase", "POPULATE-PPH-PHRASE", 3, 4, false);
        declareFunction(me, "pph_info_vector_slots", "PPH-INFO-VECTOR-SLOTS", 0, 0, false);
        declareFunction(me, "make_pph_info_vector", "MAKE-PPH-INFO-VECTOR", 0, 0, false);
        declareFunction(me, "pph_phrase_info_vector", "PPH-PHRASE-INFO-VECTOR", 1, 0, false);
        declareFunction(me, "pph_phrase_info_vector_lookup", "PPH-PHRASE-INFO-VECTOR-LOOKUP", 2, 1, false);
        declareFunction(me, "pph_phrase_info_vector_lookup_no_default", "PPH-PHRASE-INFO-VECTOR-LOOKUP-NO-DEFAULT", 2, 0, false);
        declareFunction(me, "pph_phrase_info_vector_clear", "PPH-PHRASE-INFO-VECTOR-CLEAR", 2, 0, false);
        declareFunction(me, "pph_info_vector_lookup", "PPH-INFO-VECTOR-LOOKUP", 3, 0, false);
        declareFunction(me, "pph_info_vector_straight_lookup", "PPH-INFO-VECTOR-STRAIGHT-LOOKUP", 2, 0, false);
        declareFunction(me, "pph_phrase_info_vector_set", "PPH-PHRASE-INFO-VECTOR-SET", 3, 0, false);
        declareFunction(me, "pph_phrase_id_index", "PPH-PHRASE-ID-INDEX", 0, 0, false);
        declareFunction(me, "pph_phrase_id_index_new_objects_size", "PPH-PHRASE-ID-INDEX-NEW-OBJECTS-SIZE", 0, 0, false);
        declareFunction(me, "pph_phrase_id_index_new_objects_count", "PPH-PHRASE-ID-INDEX-NEW-OBJECTS-COUNT", 0, 0, false);
        declareFunction(me, "clear_pph_phrase_id_index", "CLEAR-PPH-PHRASE-ID-INDEX", 0, 1, false);
        declareFunction(me, "pph_phrase_id_index_enter", "PPH-PHRASE-ID-INDEX-ENTER", 2, 0, false);
        declareFunction(me, "pph_phrase_id_index_remove", "PPH-PHRASE-ID-INDEX-REMOVE", 1, 0, false);
        declareFunction(me, "optimize_pph_phrase_id_index", "OPTIMIZE-PPH-PHRASE-ID-INDEX", 0, 1, false);
        declareFunction(me, "remove_invalid_pph_phrases", "REMOVE-INVALID-PPH-PHRASES", 0, 0, false);
        declareFunction(me, "valid_pph_phrase_p", "VALID-PPH-PHRASE-P", 1, 0, false);
        declareFunction(me, "pph_phrase_set_suid_if_valid", "PPH-PHRASE-SET-SUID-IF-VALID", 2, 0, false);
        declareFunction(me, "get_next_pph_phrase_id", "GET-NEXT-PPH-PHRASE-ID", 0, 0, false);
        declareFunction(me, "find_pph_phrase_by_id", "FIND-PPH-PHRASE-BY-ID", 1, 0, false);
        declareFunction(me, "pph_phrase_count", "PPH-PHRASE-COUNT", 0, 0, false);
        declareFunction(me, "pph_phrase_constituents_vector_to_id_list", "PPH-PHRASE-CONSTITUENTS-VECTOR-TO-ID-LIST", 1, 0, false);
        declareFunction(me, "pph_phrase_constituents_id_list_to_vector", "PPH-PHRASE-CONSTITUENTS-ID-LIST-TO-VECTOR", 1, 0, false);
        declareFunction(me, "dump_pph_phrase_content", "DUMP-PPH-PHRASE-CONTENT", 2, 0, false);
        declareFunction(me, "load_pph_phrase_content", "LOAD-PPH-PHRASE-CONTENT", 2, 0, false);
        declareFunction(me, "prepare_pph_phrase_info_other_for_dump", "PREPARE-PPH-PHRASE-INFO-OTHER-FOR-DUMP", 1, 0, false);
        declareFunction(me, "recover_pph_phrase_info_other", "RECOVER-PPH-PHRASE-INFO-OTHER", 1, 0, false);
        declareFunction(me, "pph_listified_vector_p", "PPH-LISTIFIED-VECTOR-P", 1, 0, false);
        declareFunction(me, "listify_pph_vectors", "LISTIFY-PPH-VECTORS", 1, 0, false);
        declareFunction(me, "listify_pph_vector", "LISTIFY-PPH-VECTOR", 1, 0, false);
        declareFunction(me, "delistify_pph_vectors", "DELISTIFY-PPH-VECTORS", 1, 0, false);
        declareFunction(me, "delistify_pph_vector", "DELISTIFY-PPH-VECTOR", 1, 0, false);
        declareFunction(me, "shellify_pph_phrases", "SHELLIFY-PPH-PHRASES", 1, 0, false);
        declareFunction(me, "shellify_pph_phrase", "SHELLIFY-PPH-PHRASE", 1, 0, false);
        declareFunction(me, "shellified_pph_phrase_p", "SHELLIFIED-PPH-PHRASE-P", 1, 0, false);
        declareFunction(me, "deshellify_pph_phrases", "DESHELLIFY-PPH-PHRASES", 1, 0, false);
        declareFunction(me, "deshellify_pph_phrase", "DESHELLIFY-PPH-PHRASE", 1, 0, false);
        declareFunction(me, "paraphrase_cycl_caches_unbuiltP", "PARAPHRASE-CYCL-CACHES-UNBUILT?", 0, 0, false);
        declareFunction(me, "rebuild_paraphrase_cycl_caches", "REBUILD-PARAPHRASE-CYCL-CACHES", 0, 0, false);
        declareFunction(me, "dump_gen_template_store_to_stream", "DUMP-GEN-TEMPLATE-STORE-TO-STREAM", 1, 0, false);
        declareFunction(me, "load_gen_template_store_from_stream", "LOAD-GEN-TEMPLATE-STORE-FROM-STREAM", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_print_function_trampoline", "PPH-PHRASE-TEMPLATE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "pph_phrase_template_generator_p", "PPH-PHRASE-TEMPLATE-GENERATOR-P", 1, 0, false);
        new pph_data_structures.$pph_phrase_template_generator_p$UnaryFunction();
        declareFunction(me, "pph_phrase_template_generator_formula", "PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_mt", "PPH-PHRASE-TEMPLATE-GENERATOR-MT", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_focus_arg", "PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_specified_reln", "PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_nl_preds", "PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_doneP", "PPH-PHRASE-TEMPLATE-GENERATOR-DONE?", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_search_limit", "PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_search_level", "PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_relns_to_use", "PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_gen_template_sets", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_gen_templates", "PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES", 1, 0, false);
        declareFunction(me, "pph_phrase_template_generator_arg_position_map", "PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP", 1, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_formula", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_mt", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-MT", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_focus_arg", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-FOCUS-ARG", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_specified_reln", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SPECIFIED-RELN", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_nl_preds", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-NL-PREDS", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_doneP", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-DONE?", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_search_limit", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LIMIT", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_search_level", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-SEARCH-LEVEL", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_relns_to_use", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-RELNS-TO-USE", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_gen_template_sets", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATE-SETS", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_gen_templates", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-GEN-TEMPLATES", 2, 0, false);
        declareFunction(me, "_csetf_pph_phrase_template_generator_arg_position_map", "_CSETF-PPH-PHRASE-TEMPLATE-GENERATOR-ARG-POSITION-MAP", 2, 0, false);
        declareFunction(me, "make_pph_phrase_template_generator", "MAKE-PPH-PHRASE-TEMPLATE-GENERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_pph_phrase_template_generator", "VISIT-DEFSTRUCT-PPH-PHRASE-TEMPLATE-GENERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_pph_phrase_template_generator_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-TEMPLATE-GENERATOR-METHOD", 2, 0, false);
        declareFunction(me, "pprint_pph_phrase_template_generator", "PPRINT-PPH-PHRASE-TEMPLATE-GENERATOR", 1, 2, false);
        declareFunction(me, "initialize_pph_phrase_template_generator", "INITIALIZE-PPH-PHRASE-TEMPLATE-GENERATOR", 7, 0, false);
        declareFunction(me, "pph_phrase_template_generator_done_p", "PPH-PHRASE-TEMPLATE-GENERATOR-DONE-P", 1, 0, false);
        declareFunction(me, "get_pph_phrase_template_generator", "GET-PPH-PHRASE-TEMPLATE-GENERATOR", 1, 5, false);
        declareFunction(me, "free_pph_phrase_template_generator", "FREE-PPH-PHRASE-TEMPLATE-GENERATOR", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_iterator_print_function_trampoline", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "pph_phrase_output_list_iterator_p", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-P", 1, 0, false);
        new pph_data_structures.$pph_phrase_output_list_iterator_p$UnaryFunction();
        declareFunction(me, "pph_phrase_output_list_iterator_item_queue", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE", 1, 0, false);
        declareFunction(me, "_csetf_pph_phrase_output_list_iterator_item_queue", "_CSETF-PPH-PHRASE-OUTPUT-LIST-ITERATOR-ITEM-QUEUE", 2, 0, false);
        declareFunction(me, "make_pph_phrase_output_list_iterator", "MAKE-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_pph_phrase_output_list_iterator", "VISIT-DEFSTRUCT-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_pph_phrase_output_list_iterator_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PHRASE-OUTPUT-LIST-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "pprint_pph_phrase_output_list_iterator", "PPRINT-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 1, 2, false);
        declareFunction(me, "new_pph_phrase_output_list_iterator", "NEW-PPH-PHRASE-OUTPUT-LIST-ITERATOR", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_iterator_empty_p", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-EMPTY-P", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_iterator_next", "PPH-PHRASE-OUTPUT-LIST-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_nospace_group_grab_first_item", "PPH-PHRASE-OUTPUT-ITEM-NOSPACE-GROUP-GRAB-FIRST-ITEM", 1, 0, false);
        declareFunction(me, "pph_nospace_group_remove_first_item", "PPH-NOSPACE-GROUP-REMOVE-FIRST-ITEM", 1, 0, false);
        declareFunction(me, "pph_update_output_item_from_nospace_group", "PPH-UPDATE-OUTPUT-ITEM-FROM-NOSPACE-GROUP", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_data_structures_file() {
        deflexical("*RELATION-CARDINALITY*", $int$12000);
        deflexical("*GEN-TEMPLATE-STORE*", SubLTrampolineFile.maybeDefault($gen_template_store$, $gen_template_store$, () -> dictionary.new_dictionary(symbol_function(EQ), $relation_cardinality$.getGlobalValue())));
        deflexical("*GEN-TEMPLATE-STORE-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sym3$_GEN_TEMPLATE_STORE_INITIALIZED__, $gen_template_store_initializedP$, NIL));
        defconstant("*DTP-GENERATION-TEMPLATE*", GENERATION_TEMPLATE);
        defconstant("*CFASL-OPCODE-GENERATION-TEMPLATE*", $int$72);
        defconstant("*DTP-PPH-PHRASE-AGR*", PPH_PHRASE_AGR);
        defconstant("*CFASL-OPCODE-PPH-PHRASE-AGR*", $int$73);
        defconstant("*DTP-PARAPHRASE-PHRASE-INFO-BUNDLE*", PARAPHRASE_PHRASE_INFO_BUNDLE);
        deflexical("*PPH-EMPTY-INFO-VECTOR*", $PPH_EMPTY_INFO_VECTOR);
        defconstant("*DTP-PPH-PHRASE-OUTPUT-ITEM*", PPH_PHRASE_OUTPUT_ITEM);
        defconstant("*CFASL-OPCODE-PPH-OI*", $int$74);
        deflexical("*A-LOT-OF-NEW-PPH-PHRASES*", $int$50000);
        deflexical("*A-WHOLE-LOT-OF-NEW-PPH-PHRASES*", $int$200000);
        deflexical("*A-SHITLOAD-OF-NEW-PPH-PHRASES*", $int$500000);
        deflexical("*PPH-INFO-VECTOR-SLOTS*", $list157);
        deflexical("*PPH-INFO-VECTOR-UNSPECIFIED-VALUE*", CHAR_vertical);
        deflexical("*PPH-PHRASE-ID-INDEX*", SubLTrampolineFile.maybeDefault($pph_phrase_id_index$, $pph_phrase_id_index$, () -> new_id_index(UNPROVIDED, UNPROVIDED)));
        deflexical("*PPH-PHRASE-ID-INDEX-LOCK*", make_lock($$$PPH_phrase_ID_index));
        deflexical("*PPH-LISTIFIED-VECTOR-MARKER*", $LISTIFIED_PPH_VECTOR);
        deflexical("*PPH-PHRASE-SHELL-MARKER*", $PPH_PHRASE_SHELL);
        defconstant("*DTP-PPH-PHRASE-TEMPLATE-GENERATOR*", PPH_PHRASE_TEMPLATE_GENERATOR);
        deflexical("*FREE-PPH-PHRASE-TEMPLATE-GENERATORS*", SubLTrampolineFile.maybeDefault($free_pph_phrase_template_generators$, $free_pph_phrase_template_generators$, () -> queues.create_queue(UNPROVIDED)));
        defconstant("*DTP-PPH-PHRASE-OUTPUT-LIST-ITERATOR*", PPH_PHRASE_OUTPUT_LIST_ITERATOR);
        return NIL;
    }

    public static SubLObject setup_pph_data_structures_file() {
        pph_vars.$pph_data_structures_code_revision$.setGlobalValue($str0$_Revision__148135__);
        declare_defglobal($gen_template_store$);
        declare_defglobal($sym3$_GEN_TEMPLATE_STORE_INITIALIZED__);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_generation_template$.getGlobalValue(), symbol_function(GENERATION_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list17);
        def_csetf(GEN_TEMPLATE_PHRASE, _CSETF_GEN_TEMPLATE_PHRASE);
        def_csetf(GEN_TEMPLATE_CONSTRAINT, _CSETF_GEN_TEMPLATE_CONSTRAINT);
        def_csetf(GEN_TEMPLATE_ASSERTION, _CSETF_GEN_TEMPLATE_ASSERTION);
        identity(GENERATION_TEMPLATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_generation_template$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GENERATION_TEMPLATE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_generation_template$.getGlobalValue(), symbol_function(SXHASH_GENERATION_TEMPLATE_METHOD));
        register_cfasl_input_function($cfasl_opcode_generation_template$.getGlobalValue(), CFASL_INPUT_GENERATION_TEMPLATE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_generation_template$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_GENERATION_TEMPLATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_phrase_agr$.getGlobalValue(), symbol_function(PPH_PHRASE_AGR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list53);
        def_csetf(PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT, _CSETF_PPH_PHRASE_AGR_ABSOLUTE_CONSTRAINT);
        def_csetf(PPH_PHRASE_AGR_RELATIVE_CONSTRAINT, _CSETF_PPH_PHRASE_AGR_RELATIVE_CONSTRAINT);
        identity(PPH_PHRASE_AGR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_phrase_agr$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_AGR_METHOD));
        register_cfasl_input_function($cfasl_opcode_pph_phrase_agr$.getGlobalValue(), CFASL_INPUT_PPH_PHRASE_AGR);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_pph_phrase_agr$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PPH_PHRASE_AGR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_paraphrase_phrase_info_bundle$.getGlobalValue(), symbol_function(PARAPHRASE_PHRASE_INFO_BUNDLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list80);
        def_csetf(PPH_PHRASE_INFO_CYCL, _CSETF_PPH_PHRASE_INFO_CYCL);
        def_csetf(PPH_PHRASE_INFO_AGR, _CSETF_PPH_PHRASE_INFO_AGR);
        def_csetf(PPH_PHRASE_INFO_JUSTIFICATION, _CSETF_PPH_PHRASE_INFO_JUSTIFICATION);
        def_csetf(PPH_PHRASE_INFO_OUTPUT_LIST, _CSETF_PPH_PHRASE_INFO_OUTPUT_LIST);
        def_csetf(PPH_PHRASE_INFO_ARG_POSITION_MAP, _CSETF_PPH_PHRASE_INFO_ARG_POSITION_MAP);
        def_csetf(PPH_PHRASE_INFO_OTHER, _CSETF_PPH_PHRASE_INFO_OTHER);
        identity(PARAPHRASE_PHRASE_INFO_BUNDLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_paraphrase_phrase_info_bundle$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARAPHRASE_PHRASE_INFO_BUNDLE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_phrase_output_item$.getGlobalValue(), symbol_function(PPH_PHRASE_OUTPUT_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list116);
        def_csetf(PPH_OI_STRING, _CSETF_PPH_OI_STRING);
        def_csetf(PPH_OI_ARG_POSITION, _CSETF_PPH_OI_ARG_POSITION);
        def_csetf(PPH_OI_CYCL, _CSETF_PPH_OI_CYCL);
        def_csetf(PPH_OI_HTML_OPEN_TAG, _CSETF_PPH_OI_HTML_OPEN_TAG);
        def_csetf(PPH_OI_HTML_CLOSE_TAG, _CSETF_PPH_OI_HTML_CLOSE_TAG);
        def_csetf(PPH_OI_AGR, _CSETF_PPH_OI_AGR);
        identity(PPH_PHRASE_OUTPUT_ITEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_phrase_output_item$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD));
        register_cfasl_input_function($cfasl_opcode_pph_oi$.getGlobalValue(), CFASL_INPUT_PPH_OI);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_pph_phrase_output_item$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PPH_PHRASE_OUTPUT_ITEM_METHOD));
        declare_defglobal($pph_phrase_id_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_phrase_template_generator$.getGlobalValue(), symbol_function(PPH_PHRASE_TEMPLATE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list195);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FORMULA);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_MT, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_MT);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_FOCUS_ARG);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SPECIFIED_RELN);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_NL_PREDS);
        def_csetf($sym206$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_, $sym207$_CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_DONE_);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LIMIT);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_SEARCH_LEVEL);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_RELNS_TO_USE);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATE_SETS);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_GEN_TEMPLATES);
        def_csetf(PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP, _CSETF_PPH_PHRASE_TEMPLATE_GENERATOR_ARG_POSITION_MAP);
        identity(PPH_PHRASE_TEMPLATE_GENERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_phrase_template_generator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_TEMPLATE_GENERATOR_METHOD));
        declare_defglobal($free_pph_phrase_template_generators$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_phrase_output_list_iterator$.getGlobalValue(), symbol_function(PPH_PHRASE_OUTPUT_LIST_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list249);
        def_csetf(PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE, _CSETF_PPH_PHRASE_OUTPUT_LIST_ITERATOR_ITEM_QUEUE);
        identity(PPH_PHRASE_OUTPUT_LIST_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_phrase_output_list_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_PHRASE_OUTPUT_LIST_ITERATOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_data_structures_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_data_structures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_data_structures_file();
    }

    

    public static final class $generation_template_native extends SubLStructNative {
        public SubLObject $phrase;

        public SubLObject $constraint;

        public SubLObject $assertion;

        private static final SubLStructDeclNative structDecl;

        private $generation_template_native() {
            this.$phrase = Lisp.NIL;
            this.$constraint = Lisp.NIL;
            this.$assertion = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$phrase;
        }

        @Override
        public SubLObject getField3() {
            return this.$constraint;
        }

        @Override
        public SubLObject getField4() {
            return this.$assertion;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$phrase = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$constraint = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$assertion = value;
        }

        static {
            structDecl = makeStructDeclNative($generation_template_native.class, GENERATION_TEMPLATE, GENERATION_TEMPLATE_P, $list11, $list12, new String[]{ "$phrase", "$constraint", "$assertion" }, $list13, $list14, PPRINT_GEN_TEMPLATE);
        }
    }

    public static final class $generation_template_p$UnaryFunction extends UnaryFunction {
        public $generation_template_p$UnaryFunction() {
            super(extractFunctionNamed("GENERATION-TEMPLATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return generation_template_p(arg1);
        }
    }

    public static final class $sxhash_generation_template_method$UnaryFunction extends UnaryFunction {
        public $sxhash_generation_template_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-GENERATION-TEMPLATE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_generation_template_method(arg1);
        }
    }

    public static final class $get_gen_template_assertion$UnaryFunction extends UnaryFunction {
        public $get_gen_template_assertion$UnaryFunction() {
            super(extractFunctionNamed("GET-GEN-TEMPLATE-ASSERTION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return get_gen_template_assertion(arg1);
        }
    }

    public static final class $cfasl_input_generation_template$UnaryFunction extends UnaryFunction {
        public $cfasl_input_generation_template$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-GENERATION-TEMPLATE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_generation_template(arg1);
        }
    }

    public static final class $pph_phrase_agr_native extends SubLStructNative {
        public SubLObject $absolute_constraint;

        public SubLObject $relative_constraint;

        private static final SubLStructDeclNative structDecl;

        private $pph_phrase_agr_native() {
            this.$absolute_constraint = Lisp.NIL;
            this.$relative_constraint = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$absolute_constraint;
        }

        @Override
        public SubLObject getField3() {
            return this.$relative_constraint;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$absolute_constraint = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$relative_constraint = value;
        }

        static {
            structDecl = makeStructDeclNative($pph_phrase_agr_native.class, PPH_PHRASE_AGR, PPH_PHRASE_AGR_P, $list47, $list48, new String[]{ "$absolute_constraint", "$relative_constraint" }, $list49, $list50, PPRINT_PPH_PHRASE_AGR);
        }
    }

    public static final class $pph_phrase_agr_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_agr_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-AGR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_agr_p(arg1);
        }
    }

    public static final class $cfasl_input_pph_phrase_agr$UnaryFunction extends UnaryFunction {
        public $cfasl_input_pph_phrase_agr$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-PPH-PHRASE-AGR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_pph_phrase_agr(arg1);
        }
    }

    public static final class $paraphrase_phrase_info_bundle_native extends SubLStructNative {
        public SubLObject $cycl;

        public SubLObject $agr;

        public SubLObject $justification;

        public SubLObject $output_list;

        public SubLObject $arg_position_map;

        public SubLObject $other;

        private static final SubLStructDeclNative structDecl;

        private $paraphrase_phrase_info_bundle_native() {
            this.$cycl = Lisp.NIL;
            this.$agr = Lisp.NIL;
            this.$justification = Lisp.NIL;
            this.$output_list = Lisp.NIL;
            this.$arg_position_map = Lisp.NIL;
            this.$other = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cycl;
        }

        @Override
        public SubLObject getField3() {
            return this.$agr;
        }

        @Override
        public SubLObject getField4() {
            return this.$justification;
        }

        @Override
        public SubLObject getField5() {
            return this.$output_list;
        }

        @Override
        public SubLObject getField6() {
            return this.$arg_position_map;
        }

        @Override
        public SubLObject getField7() {
            return this.$other;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$agr = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$justification = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$output_list = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_position_map = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$other = value;
        }

        static {
            structDecl = makeStructDeclNative($paraphrase_phrase_info_bundle_native.class, PARAPHRASE_PHRASE_INFO_BUNDLE, PARAPHRASE_PHRASE_INFO_BUNDLE_P, $list74, $list75, new String[]{ "$cycl", "$agr", "$justification", "$output_list", "$arg_position_map", "$other" }, $list76, $list77, PPRINT_PPH_PHRASE_INFO_BUNDLE);
        }
    }

    public static final class $paraphrase_phrase_info_bundle_p$UnaryFunction extends UnaryFunction {
        public $paraphrase_phrase_info_bundle_p$UnaryFunction() {
            super(extractFunctionNamed("PARAPHRASE-PHRASE-INFO-BUNDLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return paraphrase_phrase_info_bundle_p(arg1);
        }
    }

    public static final class $pph_phrase_output_item_native extends SubLStructNative {
        public SubLObject $string;

        public SubLObject $arg_position;

        public SubLObject $cycl;

        public SubLObject $html_open_tag;

        public SubLObject $html_close_tag;

        public SubLObject $agr;

        private static final SubLStructDeclNative structDecl;

        private $pph_phrase_output_item_native() {
            this.$string = Lisp.NIL;
            this.$arg_position = Lisp.NIL;
            this.$cycl = Lisp.NIL;
            this.$html_open_tag = Lisp.NIL;
            this.$html_close_tag = Lisp.NIL;
            this.$agr = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$string;
        }

        @Override
        public SubLObject getField3() {
            return this.$arg_position;
        }

        @Override
        public SubLObject getField4() {
            return this.$cycl;
        }

        @Override
        public SubLObject getField5() {
            return this.$html_open_tag;
        }

        @Override
        public SubLObject getField6() {
            return this.$html_close_tag;
        }

        @Override
        public SubLObject getField7() {
            return this.$agr;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$arg_position = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$cycl = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$html_open_tag = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$html_close_tag = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$agr = value;
        }

        static {
            structDecl = makeStructDeclNative($pph_phrase_output_item_native.class, PPH_PHRASE_OUTPUT_ITEM, PPH_PHRASE_OUTPUT_ITEM_P, $list110, $list111, new String[]{ "$string", "$arg_position", "$cycl", "$html_open_tag", "$html_close_tag", "$agr" }, $list112, $list113, PPRINT_PPH_PHRASE_OUTPUT_ITEM);
        }
    }

    public static final class $pph_phrase_output_item_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_output_item_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_output_item_p(arg1);
        }
    }

    public static final class $pph_phrase_output_item_string$UnaryFunction extends UnaryFunction {
        public $pph_phrase_output_item_string$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-STRING"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_output_item_string(arg1);
        }
    }

    public static final class $pph_phrase_output_item_loose_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_output_item_loose_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_output_item_loose_p(arg1);
        }
    }

    public static final class $cfasl_input_pph_oi$UnaryFunction extends UnaryFunction {
        public $cfasl_input_pph_oi$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-PPH-OI"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_pph_oi(arg1);
        }
    }

    public static final class $pph_phrase_template_generator_native extends SubLStructNative {
        public SubLObject $formula;

        public SubLObject $mt;

        public SubLObject $focus_arg;

        public SubLObject $specified_reln;

        public SubLObject $nl_preds;

        public SubLObject $doneP;

        public SubLObject $search_limit;

        public SubLObject $search_level;

        public SubLObject $relns_to_use;

        public SubLObject $gen_template_sets;

        public SubLObject $gen_templates;

        public SubLObject $arg_position_map;

        private static final SubLStructDeclNative structDecl;

        private $pph_phrase_template_generator_native() {
            this.$formula = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$focus_arg = Lisp.NIL;
            this.$specified_reln = Lisp.NIL;
            this.$nl_preds = Lisp.NIL;
            this.$doneP = Lisp.NIL;
            this.$search_limit = Lisp.NIL;
            this.$search_level = Lisp.NIL;
            this.$relns_to_use = Lisp.NIL;
            this.$gen_template_sets = Lisp.NIL;
            this.$gen_templates = Lisp.NIL;
            this.$arg_position_map = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$formula;
        }

        @Override
        public SubLObject getField3() {
            return this.$mt;
        }

        @Override
        public SubLObject getField4() {
            return this.$focus_arg;
        }

        @Override
        public SubLObject getField5() {
            return this.$specified_reln;
        }

        @Override
        public SubLObject getField6() {
            return this.$nl_preds;
        }

        @Override
        public SubLObject getField7() {
            return this.$doneP;
        }

        @Override
        public SubLObject getField8() {
            return this.$search_limit;
        }

        @Override
        public SubLObject getField9() {
            return this.$search_level;
        }

        @Override
        public SubLObject getField10() {
            return this.$relns_to_use;
        }

        @Override
        public SubLObject getField11() {
            return this.$gen_template_sets;
        }

        @Override
        public SubLObject getField12() {
            return this.$gen_templates;
        }

        @Override
        public SubLObject getField13() {
            return this.$arg_position_map;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$formula = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$focus_arg = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$specified_reln = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$nl_preds = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$doneP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$search_limit = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$search_level = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$relns_to_use = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$gen_template_sets = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$gen_templates = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$arg_position_map = value;
        }

        static {
            structDecl = makeStructDeclNative($pph_phrase_template_generator_native.class, PPH_PHRASE_TEMPLATE_GENERATOR, PPH_PHRASE_TEMPLATE_GENERATOR_P, $list189, $list190, new String[]{ "$formula", "$mt", "$focus_arg", "$specified_reln", "$nl_preds", "$doneP", "$search_limit", "$search_level", "$relns_to_use", "$gen_template_sets", "$gen_templates", "$arg_position_map" }, $list191, $list192, PPRINT_PPH_PHRASE_TEMPLATE_GENERATOR);
        }
    }

    public static final class $pph_phrase_template_generator_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_template_generator_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-TEMPLATE-GENERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_template_generator_p(arg1);
        }
    }

    public static final class $pph_phrase_output_list_iterator_native extends SubLStructNative {
        public SubLObject $item_queue;

        private static final SubLStructDeclNative structDecl;

        private $pph_phrase_output_list_iterator_native() {
            this.$item_queue = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$item_queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$item_queue = value;
        }

        static {
            structDecl = makeStructDeclNative($pph_phrase_output_list_iterator_native.class, PPH_PHRASE_OUTPUT_LIST_ITERATOR, PPH_PHRASE_OUTPUT_LIST_ITERATOR_P, $list243, $list244, new String[]{ "$item_queue" }, $list245, $list246, PPRINT_PPH_PHRASE_OUTPUT_LIST_ITERATOR);
        }
    }

    public static final class $pph_phrase_output_list_iterator_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_output_list_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-OUTPUT-LIST-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_output_list_iterator_p(arg1);
        }
    }
}

/**
 * Total time: 900 ms synthetic
 */
