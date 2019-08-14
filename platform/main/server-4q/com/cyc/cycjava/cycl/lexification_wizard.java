/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.misc_kb_utilities.fort_for_string;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tilde;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXIFICATION-WIZARD
 * source file: /cyc/top/cycl/lexification-wizard.lisp
 * created:     2019/07/03 17:38:22
 */
public final class lexification_wizard extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt118$ = makeString("");

    public static final SubLFile me = new lexification_wizard();

 public static final String myName = "com.cyc.cycjava.cycl.lexification_wizard";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_lexification_parameters$ = makeSymbol("*DTP-LEXIFICATION-PARAMETERS*");

    // defparameter
    /**
     * lexification-parameters object with settings to be used to initialize the
     * wizard
     */
    @LispMethod(comment = "lexification-parameters object with settings to be used to initialize the\r\nwizard\ndefparameter\nlexification-parameters object with settings to be used to initialize the\nwizard")
    public static final SubLSymbol $lexwiz_defaults$ = makeSymbol("*LEXWIZ-DEFAULTS*");

    // deflexical
    // Keywords for parts-of-speech to be considered during lexification
    /**
     * Keywords for parts-of-speech to be considered during lexification
     */
    @LispMethod(comment = "Keywords for parts-of-speech to be considered during lexification\ndeflexical")
    public static final SubLSymbol $lexification_part_of_speech_keywords$ = makeSymbol("*LEXIFICATION-PART-OF-SPEECH-KEYWORDS*");

    // deflexical
    // Name for the predicate to use for proper name lexifications
    /**
     * Name for the predicate to use for proper name lexifications
     */
    @LispMethod(comment = "Name for the predicate to use for proper name lexifications\ndeflexical")
    public static final SubLSymbol $default_proper_name_pred$ = makeSymbol("*DEFAULT-PROPER-NAME-PRED*");

    // deflexical
    // Default predicate to use for denotation assertions
    /**
     * Default predicate to use for denotation assertions
     */
    @LispMethod(comment = "Default predicate to use for denotation assertions\ndeflexical")
    public static final SubLSymbol $default_denotation_predicate$ = makeSymbol("*DEFAULT-DENOTATION-PREDICATE*");

    // defparameter
    // Whether the lexification wizard has been initialized or not
    /**
     * Whether the lexification wizard has been initialized or not
     */
    @LispMethod(comment = "Whether the lexification wizard has been initialized or not\ndefparameter")
    private static final SubLSymbol $lexification_wizard_initialized$ = makeSymbol("*LEXIFICATION-WIZARD-INITIALIZED*");

    // defvar
    /**
     * Whether the SME lexification wizard is active
     *
     * @unknown Add this to the lexification parameters???
     */
    @LispMethod(comment = "Whether the SME lexification wizard is active\r\n\r\n@unknown Add this to the lexification parameters???\ndefvar")
    public static final SubLSymbol $sme_lexwiz_active$ = makeSymbol("*SME-LEXWIZ-ACTIVE*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $allow_advanced_lexwiz_featuresP$ = makeSymbol("*ALLOW-ADVANCED-LEXWIZ-FEATURES?*");

    // deflexical
    /**
     * Whether the syntactic mappings for lexifications should be isolated from
     * other mappings
     */
    @LispMethod(comment = "Whether the syntactic mappings for lexifications should be isolated from\r\nother mappings\ndeflexical\nWhether the syntactic mappings for lexifications should be isolated from\nother mappings")
    public static final SubLSymbol $isolate_syntactic_mappingsP$ = makeSymbol("*ISOLATE-SYNTACTIC-MAPPINGS?*");

    // deflexical
    /**
     * Whether additional information about the term to be lexified should be
     * displayed
     */
    @LispMethod(comment = "Whether additional information about the term to be lexified should be\r\ndisplayed\ndeflexical\nWhether additional information about the term to be lexified should be\ndisplayed")
    public static final SubLSymbol $lexwiz_show_term_informationP$ = makeSymbol("*LEXWIZ-SHOW-TERM-INFORMATION?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $lexwiz_test$ = makeSymbol("*LEXWIZ-TEST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $lexwiz_test_category$ = makeSymbol("*LEXWIZ-TEST-CATEGORY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $lexwiz_test_suite$ = makeSymbol("*LEXWIZ-TEST-SUITE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $lexwiz_module$ = makeSymbol("*LEXWIZ-MODULE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol LEXIFICATION_PARAMETERS = makeSymbol("LEXIFICATION-PARAMETERS");

    private static final SubLSymbol LEXIFICATION_PARAMETERS_P = makeSymbol("LEXIFICATION-PARAMETERS-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT"), makeSymbol("IS-PREFERRED?"), makeSymbol("IS-PROPER?"), makeSymbol("NONRELATIONAL?"), makeSymbol("PROPER-NAME-PRED"), makeSymbol("TEMPLATE"), makeSymbol("TEMPLATE-ARGS"), makeSymbol("TEMPLATE-SPEECH-PARTS"), makeSymbol("IGNORE-ARITY?"), makeSymbol("HEADWORD-POSITION"), makeSymbol("HEADWORD-PART-OF-SPEECH"), makeSymbol("ERROR-MESSAGE"), makeSymbol("STATE"), makeSymbol("READY?"), makeSymbol("FORMULA"), makeSymbol("USER-EDITED?"), makeSymbol("USER-FORMULA"), makeSymbol("OTHER-FORMULAS"), makeSymbol("USER-ACTION"), makeSymbol("PARSE-TEMPLATE-MT"), makeSymbol("PARSE-TEMPLATE"), makeSymbol("PARSE-TEMPLATE-FORMULA"), makeSymbol("LEXICAL-MT"), makeSymbol("SYNTACTIC-MT"), makeSymbol("GENERATION-MT") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("ID"), $TERM, makeKeyword("PHRASE"), makeKeyword("MT"), makeKeyword("IS-PREFERRED?"), makeKeyword("IS-PROPER?"), makeKeyword("NONRELATIONAL?"), makeKeyword("PROPER-NAME-PRED"), makeKeyword("TEMPLATE"), makeKeyword("TEMPLATE-ARGS"), makeKeyword("TEMPLATE-SPEECH-PARTS"), makeKeyword("IGNORE-ARITY?"), makeKeyword("HEADWORD-POSITION"), makeKeyword("HEADWORD-PART-OF-SPEECH"), makeKeyword("ERROR-MESSAGE"), makeKeyword("STATE"), makeKeyword("READY?"), makeKeyword("FORMULA"), makeKeyword("USER-EDITED?"), makeKeyword("USER-FORMULA"), makeKeyword("OTHER-FORMULAS"), makeKeyword("USER-ACTION"), makeKeyword("PARSE-TEMPLATE-MT"), makeKeyword("PARSE-TEMPLATE"), makeKeyword("PARSE-TEMPLATE-FORMULA"), makeKeyword("LEXICAL-MT"), makeKeyword("SYNTACTIC-MT"), makeKeyword("GENERATION-MT") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("LEXWIZ-ID"), makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-IS-PREFERRED?"), makeSymbol("LEXWIZ-IS-PROPER?"), makeSymbol("LEXWIZ-NONRELATIONAL?"), makeSymbol("LEXWIZ-PROPER-NAME-PRED"), makeSymbol("LEXWIZ-TEMPLATE"), makeSymbol("LEXWIZ-TEMPLATE-ARGS"), makeSymbol("LEXWIZ-TEMPLATE-SPEECH-PARTS"), makeSymbol("LEXWIZ-IGNORE-ARITY?"), makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-STATE"), makeSymbol("LEXWIZ-READY?"), makeSymbol("LEXWIZ-FORMULA"), makeSymbol("LEXWIZ-USER-EDITED?"), makeSymbol("LEXWIZ-USER-FORMULA"), makeSymbol("LEXWIZ-OTHER-FORMULAS"), makeSymbol("LEXWIZ-USER-ACTION"), makeSymbol("LEXWIZ-PARSE-TEMPLATE-MT"), makeSymbol("LEXWIZ-PARSE-TEMPLATE"), makeSymbol("LEXWIZ-PARSE-TEMPLATE-FORMULA"), makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("LEXWIZ-SYNTACTIC-MT"), makeSymbol("LEXWIZ-GENERATION-MT") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-LEXWIZ-ID"), makeSymbol("_CSETF-LEXWIZ-TERM"), makeSymbol("_CSETF-LEXWIZ-PHRASE"), makeSymbol("_CSETF-LEXWIZ-MT"), makeSymbol("_CSETF-LEXWIZ-IS-PREFERRED?"), makeSymbol("_CSETF-LEXWIZ-IS-PROPER?"), makeSymbol("_CSETF-LEXWIZ-NONRELATIONAL?"), makeSymbol("_CSETF-LEXWIZ-PROPER-NAME-PRED"), makeSymbol("_CSETF-LEXWIZ-TEMPLATE"), makeSymbol("_CSETF-LEXWIZ-TEMPLATE-ARGS"), makeSymbol("_CSETF-LEXWIZ-TEMPLATE-SPEECH-PARTS"), makeSymbol("_CSETF-LEXWIZ-IGNORE-ARITY?"), makeSymbol("_CSETF-LEXWIZ-HEADWORD-POSITION"), makeSymbol("_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("_CSETF-LEXWIZ-ERROR-MESSAGE"), makeSymbol("_CSETF-LEXWIZ-STATE"), makeSymbol("_CSETF-LEXWIZ-READY?"), makeSymbol("_CSETF-LEXWIZ-FORMULA"), makeSymbol("_CSETF-LEXWIZ-USER-EDITED?"), makeSymbol("_CSETF-LEXWIZ-USER-FORMULA"), makeSymbol("_CSETF-LEXWIZ-OTHER-FORMULAS"), makeSymbol("_CSETF-LEXWIZ-USER-ACTION"), makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE-MT"), makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE"), makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA"), makeSymbol("_CSETF-LEXWIZ-LEXICAL-MT"), makeSymbol("_CSETF-LEXWIZ-SYNTACTIC-MT"), makeSymbol("_CSETF-LEXWIZ-GENERATION-MT") });



















    private static final SubLSymbol LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LEXIFICATION-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LEXIFICATION-PARAMETERS-P"));

    private static final SubLSymbol LEXWIZ_ID = makeSymbol("LEXWIZ-ID");

    private static final SubLSymbol _CSETF_LEXWIZ_ID = makeSymbol("_CSETF-LEXWIZ-ID");

    private static final SubLSymbol _CSETF_LEXWIZ_TERM = makeSymbol("_CSETF-LEXWIZ-TERM");

    private static final SubLSymbol _CSETF_LEXWIZ_PHRASE = makeSymbol("_CSETF-LEXWIZ-PHRASE");

    private static final SubLSymbol _CSETF_LEXWIZ_MT = makeSymbol("_CSETF-LEXWIZ-MT");

    private static final SubLSymbol $sym26$LEXWIZ_IS_PREFERRED_ = makeSymbol("LEXWIZ-IS-PREFERRED?");

    private static final SubLSymbol $sym27$_CSETF_LEXWIZ_IS_PREFERRED_ = makeSymbol("_CSETF-LEXWIZ-IS-PREFERRED?");

    private static final SubLSymbol $sym28$LEXWIZ_IS_PROPER_ = makeSymbol("LEXWIZ-IS-PROPER?");

    private static final SubLSymbol $sym29$_CSETF_LEXWIZ_IS_PROPER_ = makeSymbol("_CSETF-LEXWIZ-IS-PROPER?");

    private static final SubLSymbol $sym30$LEXWIZ_NONRELATIONAL_ = makeSymbol("LEXWIZ-NONRELATIONAL?");

    private static final SubLSymbol $sym31$_CSETF_LEXWIZ_NONRELATIONAL_ = makeSymbol("_CSETF-LEXWIZ-NONRELATIONAL?");

    private static final SubLSymbol LEXWIZ_PROPER_NAME_PRED = makeSymbol("LEXWIZ-PROPER-NAME-PRED");

    private static final SubLSymbol _CSETF_LEXWIZ_PROPER_NAME_PRED = makeSymbol("_CSETF-LEXWIZ-PROPER-NAME-PRED");

    private static final SubLSymbol LEXWIZ_TEMPLATE = makeSymbol("LEXWIZ-TEMPLATE");

    private static final SubLSymbol _CSETF_LEXWIZ_TEMPLATE = makeSymbol("_CSETF-LEXWIZ-TEMPLATE");

    private static final SubLSymbol LEXWIZ_TEMPLATE_ARGS = makeSymbol("LEXWIZ-TEMPLATE-ARGS");

    private static final SubLSymbol _CSETF_LEXWIZ_TEMPLATE_ARGS = makeSymbol("_CSETF-LEXWIZ-TEMPLATE-ARGS");

    private static final SubLSymbol LEXWIZ_TEMPLATE_SPEECH_PARTS = makeSymbol("LEXWIZ-TEMPLATE-SPEECH-PARTS");

    private static final SubLSymbol _CSETF_LEXWIZ_TEMPLATE_SPEECH_PARTS = makeSymbol("_CSETF-LEXWIZ-TEMPLATE-SPEECH-PARTS");

    private static final SubLSymbol $sym40$LEXWIZ_IGNORE_ARITY_ = makeSymbol("LEXWIZ-IGNORE-ARITY?");

    private static final SubLSymbol $sym41$_CSETF_LEXWIZ_IGNORE_ARITY_ = makeSymbol("_CSETF-LEXWIZ-IGNORE-ARITY?");

    private static final SubLSymbol _CSETF_LEXWIZ_HEADWORD_POSITION = makeSymbol("_CSETF-LEXWIZ-HEADWORD-POSITION");

    private static final SubLSymbol LEXWIZ_HEADWORD_PART_OF_SPEECH = makeSymbol("LEXWIZ-HEADWORD-PART-OF-SPEECH");

    private static final SubLSymbol _CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH = makeSymbol("_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH");

    private static final SubLSymbol _CSETF_LEXWIZ_ERROR_MESSAGE = makeSymbol("_CSETF-LEXWIZ-ERROR-MESSAGE");

    private static final SubLSymbol LEXWIZ_STATE = makeSymbol("LEXWIZ-STATE");

    private static final SubLSymbol _CSETF_LEXWIZ_STATE = makeSymbol("_CSETF-LEXWIZ-STATE");

    private static final SubLSymbol $sym50$LEXWIZ_READY_ = makeSymbol("LEXWIZ-READY?");

    private static final SubLSymbol $sym51$_CSETF_LEXWIZ_READY_ = makeSymbol("_CSETF-LEXWIZ-READY?");

    private static final SubLSymbol LEXWIZ_FORMULA = makeSymbol("LEXWIZ-FORMULA");

    private static final SubLSymbol _CSETF_LEXWIZ_FORMULA = makeSymbol("_CSETF-LEXWIZ-FORMULA");

    private static final SubLSymbol $sym54$LEXWIZ_USER_EDITED_ = makeSymbol("LEXWIZ-USER-EDITED?");

    private static final SubLSymbol $sym55$_CSETF_LEXWIZ_USER_EDITED_ = makeSymbol("_CSETF-LEXWIZ-USER-EDITED?");

    private static final SubLSymbol LEXWIZ_USER_FORMULA = makeSymbol("LEXWIZ-USER-FORMULA");

    private static final SubLSymbol _CSETF_LEXWIZ_USER_FORMULA = makeSymbol("_CSETF-LEXWIZ-USER-FORMULA");

    private static final SubLSymbol LEXWIZ_OTHER_FORMULAS = makeSymbol("LEXWIZ-OTHER-FORMULAS");

    private static final SubLSymbol _CSETF_LEXWIZ_OTHER_FORMULAS = makeSymbol("_CSETF-LEXWIZ-OTHER-FORMULAS");

    private static final SubLSymbol LEXWIZ_USER_ACTION = makeSymbol("LEXWIZ-USER-ACTION");

    private static final SubLSymbol _CSETF_LEXWIZ_USER_ACTION = makeSymbol("_CSETF-LEXWIZ-USER-ACTION");

    private static final SubLSymbol LEXWIZ_PARSE_TEMPLATE_MT = makeSymbol("LEXWIZ-PARSE-TEMPLATE-MT");

    private static final SubLSymbol _CSETF_LEXWIZ_PARSE_TEMPLATE_MT = makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE-MT");

    private static final SubLSymbol LEXWIZ_PARSE_TEMPLATE = makeSymbol("LEXWIZ-PARSE-TEMPLATE");

    private static final SubLSymbol _CSETF_LEXWIZ_PARSE_TEMPLATE = makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE");

    private static final SubLSymbol LEXWIZ_PARSE_TEMPLATE_FORMULA = makeSymbol("LEXWIZ-PARSE-TEMPLATE-FORMULA");

    private static final SubLSymbol _CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA = makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA");

    private static final SubLSymbol LEXWIZ_LEXICAL_MT = makeSymbol("LEXWIZ-LEXICAL-MT");

    private static final SubLSymbol _CSETF_LEXWIZ_LEXICAL_MT = makeSymbol("_CSETF-LEXWIZ-LEXICAL-MT");

    private static final SubLSymbol LEXWIZ_SYNTACTIC_MT = makeSymbol("LEXWIZ-SYNTACTIC-MT");

    private static final SubLSymbol _CSETF_LEXWIZ_SYNTACTIC_MT = makeSymbol("_CSETF-LEXWIZ-SYNTACTIC-MT");

    private static final SubLSymbol LEXWIZ_GENERATION_MT = makeSymbol("LEXWIZ-GENERATION-MT");

    private static final SubLSymbol _CSETF_LEXWIZ_GENERATION_MT = makeSymbol("_CSETF-LEXWIZ-GENERATION-MT");

    private static final SubLSymbol $kw78$IS_PREFERRED_ = makeKeyword("IS-PREFERRED?");

    private static final SubLSymbol $kw79$IS_PROPER_ = makeKeyword("IS-PROPER?");

    private static final SubLSymbol $PROPER_NAME_PRED = makeKeyword("PROPER-NAME-PRED");

    private static final SubLSymbol $TEMPLATE_SPEECH_PARTS = makeKeyword("TEMPLATE-SPEECH-PARTS");

    private static final SubLSymbol $kw85$IGNORE_ARITY_ = makeKeyword("IGNORE-ARITY?");

    private static final SubLSymbol $HEADWORD_PART_OF_SPEECH = makeKeyword("HEADWORD-PART-OF-SPEECH");

    private static final SubLSymbol $kw92$USER_EDITED_ = makeKeyword("USER-EDITED?");

    private static final SubLSymbol $PARSE_TEMPLATE_MT = makeKeyword("PARSE-TEMPLATE-MT");

    private static final SubLSymbol $PARSE_TEMPLATE_FORMULA = makeKeyword("PARSE-TEMPLATE-FORMULA");

    private static final SubLString $str102$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_LEXIFICATION_PARAMETERS = makeSymbol("MAKE-LEXIFICATION-PARAMETERS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LEXIFICATION_PARAMETERS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LEXIFICATION-PARAMETERS-METHOD");

    private static final SubLList $list108 = list($NOUN, makeKeyword("PROPER-NOUN"), $VERB, makeKeyword("ADJECTIVE"), makeKeyword("ADVERB"));

    public static final SubLSymbol $main_lexification_parts_of_speech$ = makeSymbol("*MAIN-LEXIFICATION-PARTS-OF-SPEECH*");

    public static final SubLSymbol $all_lexification_parts_of_speech_labels$ = makeSymbol("*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*");

    public static final SubLSymbol $lexification_proper_name_predicate_names$ = makeSymbol("*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*");

    public static final SubLSymbol $lexification_proper_name_predicate_constraints$ = makeSymbol("*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*");

    public static final SubLSymbol $lexification_mts$ = makeSymbol("*LEXIFICATION-MTS*");

    private static final SubLString $$$nameString = makeString("nameString");



    public static final SubLSymbol $lexification_object_table$ = makeSymbol("*LEXIFICATION-OBJECT-TABLE*");

    public static final SubLSymbol $lexification_template_mts$ = makeSymbol("*LEXIFICATION-TEMPLATE-MTS*");

    private static final SubLString $str119$Warning__ = makeString("Warning: ");

    private static final SubLString $$$Object_hash_table_not_initialized = makeString("Object hash table not initialized");

    private static final SubLString $str121$lexwiz_settings_changed____A_vs__ = makeString("lexwiz-settings-changed?: ~A vs. ~A~%");

    private static final SubLString $str122$setting_change___s__ = makeString("setting change: ~s~%");

    private static final SubLString $str123$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    private static final SubLList $list124 = list(EQUAL, makeSymbol("ID"), list(makeSymbol("LEXWIZ-ID"), makeSymbol("LEXWIZ-OBJECT")));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str127$_ = makeString("(");

    private static final SubLString $str128$_ = makeString(")");

    private static final SubLList $list129 = list(CHAR_null, CHAR_tilde, CHAR_percent);

    private static final SubLString $$$First = makeString("First");

    private static final SubLString $$$Last = makeString("Last");







    private static final SubLString $str135$Unable_to_map_headword__s_in_part = makeString("Unable to map headword ~s in part-of-speech ~s");

    private static final SubLString $$$Unexpected_lexification_error = makeString("Unexpected lexification error");



    private static final SubLSymbol KE_CREATE_NOW = makeSymbol("KE-CREATE-NOW");

    private static final SubLSymbol TRY_LEX_ASSERT_NOW = makeSymbol("TRY-LEX-ASSERT-NOW");

    private static final SubLSymbol TRY_UNASSERT_NOW = makeSymbol("TRY-UNASSERT-NOW");

    private static final SubLList $list141 = list(makeKeyword("SIMPLE-NOUN"), $VERB);



    private static final SubLString $str144$ = makeString("");

    private static final SubLString $$$Missing_lexification_phrase = makeString("Missing lexification phrase");

    private static final SubLString $$$Invalid_headword_specification = makeString("Invalid headword specification");

    private static final SubLString $$$Missing_part_of_speech = makeString("Missing part of speech");

    private static final SubLSymbol $sym148$ACCEPTABLE_LEXIFICATION_WORD_UNIT_ = makeSymbol("ACCEPTABLE-LEXIFICATION-WORD-UNIT?");

    private static final SubLList $list149 = list(reader_make_constant_shell("WordWithSuffixFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SUFFIX")));



    private static final SubLString $str152$Unable_to_make_main_lexical_asser = makeString("Unable to make main lexical assertion: ~S");

    private static final SubLString $str153$Unable_to_make_other_lexical_asse = makeString("Unable to make other lexical assertion: ~S");

    private static final SubLObject $$genStringAssertion_Precise = reader_make_constant_shell("genStringAssertion-Precise");





    private static final SubLSymbol KE_UNASSERT_ASSERTION_NOW = makeSymbol("KE-UNASSERT-ASSERTION-NOW");

    private static final SubLSymbol KE_UNASSERT_ASSERTION = makeSymbol("KE-UNASSERT-ASSERTION");



    private static final SubLString $str165$Lexification_parameters____S__ = makeString("Lexification parameters:~%~S~%");



    private static final SubLSymbol FORT_FOR_STRING = makeSymbol("FORT-FOR-STRING");

    private static final SubLList $list168 = list(makeString("CountNoun"), makeString("MassNoun"), makeString("Verb"));



    private static final SubLObject $$ProperNamePredicate_Strict = reader_make_constant_shell("ProperNamePredicate-Strict");

    private static final SubLList $list171 = list(reader_make_constant_shell("properNameStrings"), reader_make_constant_shell("preferredNameString"));

    private static final SubLSymbol STRING_FOR_FORT = makeSymbol("STRING-FOR-FORT");

    private static final SubLSymbol MOST_SPECIFIC_ARG1_CONSTRAINT = makeSymbol("MOST-SPECIFIC-ARG1-CONSTRAINT");

    private static final SubLSymbol $sym174$STRING_ = makeSymbol("STRING<");







    private static final SubLObject $$LexicalMicrotheory_NonLexWiz = reader_make_constant_shell("LexicalMicrotheory-NonLexWiz");

    private static final SubLString $$$Lexification_Wizard_Test = makeString("Lexification Wizard Test");

    private static final SubLString $$$_Category = makeString(" Category");

    private static final SubLString $$$_Suite = makeString(" Suite");

    private static final SubLString $str182$lexification_wizard = makeString("lexification-wizard");

    public static final SubLObject lexification_parameters_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject lexification_parameters_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject lexification_parameters_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject lexification_parameters_p(final SubLObject v_object) {
        return v_object.getClass() == lexification_wizard.$lexification_parameters_native.class ? T : NIL;
    }

    public static SubLObject lexwiz_id(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject lexwiz_term_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$term;
    }

    public static SubLObject lexwiz_term(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject lexwiz_phrase_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$phrase;
    }

    public static SubLObject lexwiz_phrase(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject lexwiz_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$mt;
    }

    public static SubLObject lexwiz_mt(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject lexwiz_is_preferredP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$is_preferredP;
    }

    public static SubLObject lexwiz_is_preferredP(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject lexwiz_is_properP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$is_properP;
    }

    public static SubLObject lexwiz_is_properP(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject lexwiz_nonrelationalP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$nonrelationalP;
    }

    public static SubLObject lexwiz_nonrelationalP(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject lexwiz_proper_name_pred_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$proper_name_pred;
    }

    public static SubLObject lexwiz_proper_name_pred(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject lexwiz_template_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$template;
    }

    public static SubLObject lexwiz_template(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject lexwiz_template_args_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$template_args;
    }

    public static SubLObject lexwiz_template_args(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject lexwiz_template_speech_parts(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject lexwiz_ignore_arityP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$ignore_arityP;
    }

    public static SubLObject lexwiz_ignore_arityP(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject lexwiz_headword_position_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$headword_position;
    }

    public static SubLObject lexwiz_headword_position(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject lexwiz_headword_part_of_speech_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$headword_part_of_speech;
    }

    public static SubLObject lexwiz_headword_part_of_speech(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject lexwiz_error_message_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$error_message;
    }

    public static SubLObject lexwiz_error_message(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject lexwiz_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$state;
    }

    public static SubLObject lexwiz_state(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField17();
    }

    public static final SubLObject lexwiz_readyP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$readyP;
    }

    public static SubLObject lexwiz_readyP(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField18();
    }

    public static final SubLObject lexwiz_formula_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$formula;
    }

    public static SubLObject lexwiz_formula(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField19();
    }

    public static SubLObject lexwiz_user_editedP(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.getField20();
    }

    public static SubLObject lexwiz_user_formula(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$user_formula;
    }

    public static final SubLObject lexwiz_other_formulas_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$other_formulas;
    }

    public static SubLObject lexwiz_other_formulas(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$other_formulas;
    }

    public static final SubLObject lexwiz_user_action_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$user_action;
    }

    public static SubLObject lexwiz_user_action(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$user_action;
    }

    public static final SubLObject lexwiz_parse_template_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$mt;
    }

    public static SubLObject lexwiz_parse_template_mt(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template_mt;
    }

    public static final SubLObject lexwiz_parse_template_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template;
    }

    public static SubLObject lexwiz_parse_template(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template;
    }

    public static final SubLObject lexwiz_parse_template_formula_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template_formula;
    }

    public static SubLObject lexwiz_parse_template_formula(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template_formula;
    }

    public static final SubLObject lexwiz_lexical_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$lexical_mt;
    }

    public static SubLObject lexwiz_lexical_mt(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$lexical_mt;
    }

    public static final SubLObject lexwiz_syntactic_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$syntactic_mt;
    }

    public static SubLObject lexwiz_syntactic_mt(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$syntactic_mt;
    }

    public static final SubLObject lexwiz_generation_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$generation_mt;
    }

    public static SubLObject lexwiz_generation_mt(final SubLObject v_object) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$generation_mt;
    }

    public static SubLObject _csetf_lexwiz_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_lexwiz_term_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$term = (value);
    }

    public static SubLObject _csetf_lexwiz_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_lexwiz_phrase_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$phrase = (value);
    }

    public static SubLObject _csetf_lexwiz_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_lexwiz_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$mt = (value);
    }

    public static SubLObject _csetf_lexwiz_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_lexwiz_is_preferredP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$is_preferredP = (value);
    }

    public static SubLObject _csetf_lexwiz_is_preferredP(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_lexwiz_is_properP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$is_properP = (value);
    }

    public static SubLObject _csetf_lexwiz_is_properP(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_lexwiz_nonrelationalP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$nonrelationalP = (value);
    }

    public static SubLObject _csetf_lexwiz_nonrelationalP(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_lexwiz_proper_name_pred_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$proper_name_pred = (value);
    }

    public static SubLObject _csetf_lexwiz_proper_name_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_lexwiz_template_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$template = (value);
    }

    public static SubLObject _csetf_lexwiz_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_lexwiz_template_args_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$template_args = (value);
    }

    public static SubLObject _csetf_lexwiz_template_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_lexwiz_template_speech_parts(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_lexwiz_ignore_arityP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$ignore_arityP = (value);
    }

    public static SubLObject _csetf_lexwiz_ignore_arityP(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_lexwiz_headword_position_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$headword_position = (value);
    }

    public static SubLObject _csetf_lexwiz_headword_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_lexwiz_headword_part_of_speech_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$headword_part_of_speech = (value);
    }

    public static SubLObject _csetf_lexwiz_headword_part_of_speech(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_lexwiz_error_message_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$error_message = (value);
    }

    public static SubLObject _csetf_lexwiz_error_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject _csetf_lexwiz_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$state = (value);
    }

    public static SubLObject _csetf_lexwiz_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static final SubLObject _csetf_lexwiz_readyP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$readyP = (value);
    }

    public static SubLObject _csetf_lexwiz_readyP(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField18(value);
    }

    public static final SubLObject _csetf_lexwiz_formula_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$formula = (value);
    }

    public static SubLObject _csetf_lexwiz_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField19(value);
    }

    public static SubLObject _csetf_lexwiz_user_editedP(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return v_object.setField20(value);
    }

    public static SubLObject _csetf_lexwiz_user_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$user_formula = value;
    }

    public static final SubLObject _csetf_lexwiz_other_formulas_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$other_formulas = (value);
    }

    public static SubLObject _csetf_lexwiz_other_formulas(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$other_formulas = value;
    }

    public static final SubLObject _csetf_lexwiz_user_action_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$user_action = (value);
    }

    public static SubLObject _csetf_lexwiz_user_action(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$user_action = value;
    }

    public static final SubLObject _csetf_lexwiz_parse_template_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, lexification_wizard.LEXIFICATION_PARAMETERS_P);
        return (($lexification_parameters_native)v_object).$mt = (value);
    }

    public static SubLObject _csetf_lexwiz_parse_template_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template_mt = value;
    }

    public static final SubLObject _csetf_lexwiz_parse_template_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template = value;
    }

    public static SubLObject _csetf_lexwiz_parse_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template = value;
    }

    public static final SubLObject _csetf_lexwiz_parse_template_formula_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template_formula = value;
    }

    public static SubLObject _csetf_lexwiz_parse_template_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$parse_template_formula = value;
    }

    public static final SubLObject _csetf_lexwiz_lexical_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$lexical_mt = value;
    }

    public static SubLObject _csetf_lexwiz_lexical_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$lexical_mt = value;
    }

    public static final SubLObject _csetf_lexwiz_syntactic_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$syntactic_mt = value;
    }

    public static SubLObject _csetf_lexwiz_syntactic_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$syntactic_mt = value;
    }

    public static final SubLObject _csetf_lexwiz_generation_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LEXIFICATION_PARAMETERS_P);
        return ((com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native) (v_object)).$generation_mt = value;
    }

    public static SubLObject _csetf_lexwiz_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != lexification_wizard.lexification_parameters_p(v_object) : "! lexification_wizard.lexification_parameters_p(v_object) " + "lexification_wizard.lexification_parameters_p error :" + v_object;
        return ((lexification_wizard.$lexification_parameters_native) (v_object)).$generation_mt = value;
    }

    public static final SubLObject make_lexification_parameters_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.lexification_wizard.$lexification_parameters_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TERM)) {
                        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_term(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PHRASE)) {
                            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_phrase(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MT)) {
                                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_mt(v_new, current_value);
                            } else {
                                if (pcase_var.eql($kw64$IS_PREFERRED_)) {
                                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_is_preferredP(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($kw65$IS_PROPER_)) {
                                        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_is_properP(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($NONRELATIONAL_)) {
                                            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_nonrelationalP(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PROPER_NAME_PRED)) {
                                                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_proper_name_pred(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($TEMPLATE)) {
                                                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_template(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($TEMPLATE_ARGS)) {
                                                        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_template_args(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($kw70$IGNORE_ARITY_)) {
                                                            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_ignore_arityP(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($HEADWORD_POSITION)) {
                                                                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_headword_position(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($HEADWORD_PART_OF_SPEECH)) {
                                                                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_headword_part_of_speech(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($ERROR_MESSAGE)) {
                                                                        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_error_message(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($STATE)) {
                                                                            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_state(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($READY_)) {
                                                                                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_readyP(v_new, current_value);
                                                                            } else {
                                                                                if (pcase_var.eql($FORMULA)) {
                                                                                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_formula(v_new, current_value);
                                                                                } else {
                                                                                    if (pcase_var.eql($OTHER_FORMULAS)) {
                                                                                        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_other_formulas(v_new, current_value);
                                                                                    } else {
                                                                                        if (pcase_var.eql($USER_ACTION)) {
                                                                                            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_user_action(v_new, current_value);
                                                                                        } else {
                                                                                            if (pcase_var.eql($PARSE_TEMPLATE_MT)) {
                                                                                                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template_mt(v_new, current_value);
                                                                                            } else {
                                                                                                if (pcase_var.eql($PARSE_TEMPLATE)) {
                                                                                                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template(v_new, current_value);
                                                                                                } else {
                                                                                                    if (pcase_var.eql($PARSE_TEMPLATE_FORMULA)) {
                                                                                                        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template_formula(v_new, current_value);
                                                                                                    } else {
                                                                                                        if (pcase_var.eql($LEXICAL_MT)) {
                                                                                                            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_lexical_mt(v_new, current_value);
                                                                                                        } else {
                                                                                                            if (pcase_var.eql($SYNTACTIC_MT)) {
                                                                                                                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_syntactic_mt(v_new, current_value);
                                                                                                            } else {
                                                                                                                if (pcase_var.eql($GENERATION_MT)) {
                                                                                                                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_generation_mt(v_new, current_value);
                                                                                                                } else {
                                                                                                                    Errors.error($str_alt85$Invalid_slot__S_for_construction_, current_arg);
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
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_lexification_parameters(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new lexification_wizard.$lexification_parameters_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                lexification_wizard._csetf_lexwiz_id(v_new, current_value);
            } else
                if (pcase_var.eql($TERM)) {
                    lexification_wizard._csetf_lexwiz_term(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASE)) {
                        lexification_wizard._csetf_lexwiz_phrase(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            lexification_wizard._csetf_lexwiz_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql(lexification_wizard.$kw78$IS_PREFERRED_)) {
                                lexification_wizard._csetf_lexwiz_is_preferredP(v_new, current_value);
                            } else
                                if (pcase_var.eql(lexification_wizard.$kw79$IS_PROPER_)) {
                                    lexification_wizard._csetf_lexwiz_is_properP(v_new, current_value);
                                } else
                                    if (pcase_var.eql($NONRELATIONAL_)) {
                                        lexification_wizard._csetf_lexwiz_nonrelationalP(v_new, current_value);
                                    } else
                                        if (pcase_var.eql(lexification_wizard.$PROPER_NAME_PRED)) {
                                            lexification_wizard._csetf_lexwiz_proper_name_pred(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($TEMPLATE)) {
                                                lexification_wizard._csetf_lexwiz_template(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($TEMPLATE_ARGS)) {
                                                    lexification_wizard._csetf_lexwiz_template_args(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql(lexification_wizard.$TEMPLATE_SPEECH_PARTS)) {
                                                        lexification_wizard._csetf_lexwiz_template_speech_parts(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql(lexification_wizard.$kw85$IGNORE_ARITY_)) {
                                                            lexification_wizard._csetf_lexwiz_ignore_arityP(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($HEADWORD_POSITION)) {
                                                                lexification_wizard._csetf_lexwiz_headword_position(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql(lexification_wizard.$HEADWORD_PART_OF_SPEECH)) {
                                                                    lexification_wizard._csetf_lexwiz_headword_part_of_speech(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($ERROR_MESSAGE)) {
                                                                        lexification_wizard._csetf_lexwiz_error_message(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($STATE)) {
                                                                            lexification_wizard._csetf_lexwiz_state(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($READY_)) {
                                                                                lexification_wizard._csetf_lexwiz_readyP(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($FORMULA)) {
                                                                                    lexification_wizard._csetf_lexwiz_formula(v_new, current_value);
                                                                                } else
                                                                                    if (pcase_var.eql(lexification_wizard.$kw92$USER_EDITED_)) {
                                                                                        lexification_wizard._csetf_lexwiz_user_editedP(v_new, current_value);
                                                                                    } else
                                                                                        if (pcase_var.eql($USER_FORMULA)) {
                                                                                            lexification_wizard._csetf_lexwiz_user_formula(v_new, current_value);
                                                                                        } else
                                                                                            if (pcase_var.eql($OTHER_FORMULAS)) {
                                                                                                lexification_wizard._csetf_lexwiz_other_formulas(v_new, current_value);
                                                                                            } else
                                                                                                if (pcase_var.eql($USER_ACTION)) {
                                                                                                    lexification_wizard._csetf_lexwiz_user_action(v_new, current_value);
                                                                                                } else
                                                                                                    if (pcase_var.eql(lexification_wizard.$PARSE_TEMPLATE_MT)) {
                                                                                                        lexification_wizard._csetf_lexwiz_parse_template_mt(v_new, current_value);
                                                                                                    } else
                                                                                                        if (pcase_var.eql($PARSE_TEMPLATE)) {
                                                                                                            lexification_wizard._csetf_lexwiz_parse_template(v_new, current_value);
                                                                                                        } else
                                                                                                            if (pcase_var.eql(lexification_wizard.$PARSE_TEMPLATE_FORMULA)) {
                                                                                                                lexification_wizard._csetf_lexwiz_parse_template_formula(v_new, current_value);
                                                                                                            } else
                                                                                                                if (pcase_var.eql($LEXICAL_MT)) {
                                                                                                                    lexification_wizard._csetf_lexwiz_lexical_mt(v_new, current_value);
                                                                                                                } else
                                                                                                                    if (pcase_var.eql($SYNTACTIC_MT)) {
                                                                                                                        lexification_wizard._csetf_lexwiz_syntactic_mt(v_new, current_value);
                                                                                                                    } else
                                                                                                                        if (pcase_var.eql($GENERATION_MT)) {
                                                                                                                            lexification_wizard._csetf_lexwiz_generation_mt(v_new, current_value);
                                                                                                                        } else {
                                                                                                                            Errors.error(lexification_wizard.$str102$Invalid_slot__S_for_construction_, current_arg);
                                                                                                                        }



























        }
        return v_new;
    }

    public static SubLObject visit_defstruct_lexification_parameters(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, lexification_wizard.MAKE_LEXIFICATION_PARAMETERS, lexification_wizard.$int$28);
        funcall(visitor_fn, obj, $SLOT, $ID, lexification_wizard.lexwiz_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TERM, lexification_wizard.lexwiz_term(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASE, lexification_wizard.lexwiz_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, lexification_wizard.lexwiz_mt(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$kw78$IS_PREFERRED_, lexification_wizard.lexwiz_is_preferredP(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$kw79$IS_PROPER_, lexification_wizard.lexwiz_is_properP(obj));
        funcall(visitor_fn, obj, $SLOT, $NONRELATIONAL_, lexification_wizard.lexwiz_nonrelationalP(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$PROPER_NAME_PRED, lexification_wizard.lexwiz_proper_name_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE, lexification_wizard.lexwiz_template(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE_ARGS, lexification_wizard.lexwiz_template_args(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$TEMPLATE_SPEECH_PARTS, lexification_wizard.lexwiz_template_speech_parts(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$kw85$IGNORE_ARITY_, lexification_wizard.lexwiz_ignore_arityP(obj));
        funcall(visitor_fn, obj, $SLOT, $HEADWORD_POSITION, lexification_wizard.lexwiz_headword_position(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$HEADWORD_PART_OF_SPEECH, lexification_wizard.lexwiz_headword_part_of_speech(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_MESSAGE, lexification_wizard.lexwiz_error_message(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, lexification_wizard.lexwiz_state(obj));
        funcall(visitor_fn, obj, $SLOT, $READY_, lexification_wizard.lexwiz_readyP(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, lexification_wizard.lexwiz_formula(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$kw92$USER_EDITED_, lexification_wizard.lexwiz_user_editedP(obj));
        funcall(visitor_fn, obj, $SLOT, $USER_FORMULA, lexification_wizard.lexwiz_user_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $OTHER_FORMULAS, lexification_wizard.lexwiz_other_formulas(obj));
        funcall(visitor_fn, obj, $SLOT, $USER_ACTION, lexification_wizard.lexwiz_user_action(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$PARSE_TEMPLATE_MT, lexification_wizard.lexwiz_parse_template_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSE_TEMPLATE, lexification_wizard.lexwiz_parse_template(obj));
        funcall(visitor_fn, obj, $SLOT, lexification_wizard.$PARSE_TEMPLATE_FORMULA, lexification_wizard.lexwiz_parse_template_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICAL_MT, lexification_wizard.lexwiz_lexical_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $SYNTACTIC_MT, lexification_wizard.lexwiz_syntactic_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERATION_MT, lexification_wizard.lexwiz_generation_mt(obj));
        funcall(visitor_fn, obj, $END, lexification_wizard.MAKE_LEXIFICATION_PARAMETERS, lexification_wizard.$int$28);
        return obj;
    }

    public static SubLObject visit_defstruct_object_lexification_parameters_method(final SubLObject obj, final SubLObject visitor_fn) {
        return lexification_wizard.visit_defstruct_lexification_parameters(obj, visitor_fn);
    }

    /**
     * Create list from the lexification-parameters object, optionally including an unique ID and/or excluding the miscellaneous parameters
     *
     * @unknown see if there is an automatic way of doing this
     */
    @LispMethod(comment = "Create list from the lexification-parameters object, optionally including an unique ID and/or excluding the miscellaneous parameters\r\n\r\n@unknown see if there is an automatic way of doing this")
    public static final SubLObject list_lexification_parameters_alt(SubLObject v_object, SubLObject include_idP, SubLObject exclude_miscP) {
        if (v_object == UNPROVIDED) {
            v_object = $lexwiz_defaults$.getDynamicValue();
        }
        if (include_idP == UNPROVIDED) {
            include_idP = NIL;
        }
        if (exclude_miscP == UNPROVIDED) {
            exclude_miscP = NIL;
        }
        {
            SubLObject params = list(new SubLObject[]{ com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_phrase(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_mt(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_preferredP(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_properP(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_nonrelationalP(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_proper_name_pred(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_template(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_template_args(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_ignore_arityP(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_headword_position(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_headword_part_of_speech(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_lexical_mt(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_syntactic_mt(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_generation_mt(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_mt(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_formula(v_object) });
            SubLObject other_params = list(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_user_action(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_error_message(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_state(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_readyP(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_formula(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_other_formulas(v_object));
            if (NIL == exclude_miscP) {
                params = append(params, other_params);
            }
            if (NIL != include_idP) {
                params = cons(v_object, params);
            }
            return params;
        }
    }

    /**
     * Create list from the lexification-parameters object, optionally including an unique ID and/or excluding the miscellaneous parameters
     *
     * @unknown see if there is an automatic way of doing this
     */
    @LispMethod(comment = "Create list from the lexification-parameters object, optionally including an unique ID and/or excluding the miscellaneous parameters\r\n\r\n@unknown see if there is an automatic way of doing this")
    public static SubLObject list_lexification_parameters(SubLObject v_object, SubLObject include_idP, SubLObject exclude_miscP) {
        if (v_object == UNPROVIDED) {
            v_object = lexification_wizard.$lexwiz_defaults$.getDynamicValue();
        }
        if (include_idP == UNPROVIDED) {
            include_idP = NIL;
        }
        if (exclude_miscP == UNPROVIDED) {
            exclude_miscP = NIL;
        }
        SubLObject params = list(new SubLObject[]{ lexification_wizard.lexwiz_term(v_object), lexification_wizard.lexwiz_phrase(v_object), lexification_wizard.lexwiz_mt(v_object), lexification_wizard.lexwiz_is_preferredP(v_object), lexification_wizard.lexwiz_is_properP(v_object), lexification_wizard.lexwiz_user_formula(v_object), lexification_wizard.lexwiz_nonrelationalP(v_object), lexification_wizard.lexwiz_proper_name_pred(v_object), lexification_wizard.lexwiz_template(v_object), lexification_wizard.lexwiz_template_args(v_object), lexification_wizard.lexwiz_template_speech_parts(v_object), lexification_wizard.lexwiz_ignore_arityP(v_object), lexification_wizard.lexwiz_headword_position(v_object), lexification_wizard.lexwiz_headword_part_of_speech(v_object), lexification_wizard.lexwiz_lexical_mt(v_object), lexification_wizard.lexwiz_syntactic_mt(v_object), lexification_wizard.lexwiz_generation_mt(v_object), lexification_wizard.lexwiz_parse_template_mt(v_object), lexification_wizard.lexwiz_parse_template(v_object), lexification_wizard.lexwiz_parse_template_formula(v_object) });
        final SubLObject other_params = list(lexification_wizard.lexwiz_id(v_object), lexification_wizard.lexwiz_user_action(v_object), lexification_wizard.lexwiz_error_message(v_object), lexification_wizard.lexwiz_state(v_object), lexification_wizard.lexwiz_readyP(v_object), lexification_wizard.lexwiz_formula(v_object), lexification_wizard.lexwiz_user_editedP(v_object), lexification_wizard.lexwiz_other_formulas(v_object));
        if (NIL == exclude_miscP) {
            params = append(params, other_params);
        }
        if (NIL != include_idP) {
            params = cons(v_object, params);
        }
        return params;
    }

    /**
     *
     *
     * @return list ; list representation of the main lexwiz parameters in OBJECT
     */
    @LispMethod(comment = "@return list ; list representation of the main lexwiz parameters in OBJECT")
    public static final SubLObject list_main_lexification_parameters_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.lexification_wizard.list_lexification_parameters(v_object, NIL, T);
    }

    /**
     *
     *
     * @return list ; list representation of the main lexwiz parameters in OBJECT
     */
    @LispMethod(comment = "@return list ; list representation of the main lexwiz parameters in OBJECT")
    public static SubLObject list_main_lexification_parameters(final SubLObject v_object) {
        return lexification_wizard.list_lexification_parameters(v_object, NIL, T);
    }

    /**
     * Copy the lexification-parameters of OBJECT into NEW-OBJECT
     *
     * @unknown see if there is an automatic way of doing this in SubL
     * @unknown if not, develop a sanity check to ensure all fields copied
     */
    @LispMethod(comment = "Copy the lexification-parameters of OBJECT into NEW-OBJECT\r\n\r\n@unknown see if there is an automatic way of doing this in SubL\r\n@unknown if not, develop a sanity check to ensure all fields copied")
    public static final SubLObject copy_over_lexification_parameters_alt(SubLObject new_object, SubLObject v_object) {
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_term(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_phrase(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_phrase(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_mt(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_mt(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_is_preferredP(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_preferredP(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_is_properP(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_properP(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_nonrelationalP(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_nonrelationalP(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_proper_name_pred(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_proper_name_pred(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_template(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_template(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_template_args(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_template_args(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_ignore_arityP(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_ignore_arityP(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_headword_position(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_headword_position(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_headword_part_of_speech(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_headword_part_of_speech(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_error_message(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_error_message(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_state(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_state(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_readyP(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_readyP(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_formula(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_formula(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_other_formulas(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_other_formulas(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_user_action(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_user_action(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_lexical_mt(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_lexical_mt(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_syntactic_mt(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_syntactic_mt(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_generation_mt(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_generation_mt(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template_mt(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_mt(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template(v_object));
        com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template_formula(new_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_formula(v_object));
        return NIL;
    }

    /**
     * Copy the lexification-parameters of OBJECT into NEW-OBJECT
     *
     * @unknown see if there is an automatic way of doing this in SubL
     * @unknown if not, develop a sanity check to ensure all fields copied
     */
    @LispMethod(comment = "Copy the lexification-parameters of OBJECT into NEW-OBJECT\r\n\r\n@unknown see if there is an automatic way of doing this in SubL\r\n@unknown if not, develop a sanity check to ensure all fields copied")
    public static SubLObject copy_over_lexification_parameters(final SubLObject new_object, final SubLObject v_object) {
        lexification_wizard._csetf_lexwiz_term(new_object, lexification_wizard.lexwiz_term(v_object));
        lexification_wizard._csetf_lexwiz_phrase(new_object, lexification_wizard.lexwiz_phrase(v_object));
        lexification_wizard._csetf_lexwiz_mt(new_object, lexification_wizard.lexwiz_mt(v_object));
        lexification_wizard._csetf_lexwiz_is_preferredP(new_object, lexification_wizard.lexwiz_is_preferredP(v_object));
        lexification_wizard._csetf_lexwiz_is_properP(new_object, lexification_wizard.lexwiz_is_properP(v_object));
        lexification_wizard._csetf_lexwiz_nonrelationalP(new_object, lexification_wizard.lexwiz_nonrelationalP(v_object));
        lexification_wizard._csetf_lexwiz_proper_name_pred(new_object, lexification_wizard.lexwiz_proper_name_pred(v_object));
        lexification_wizard._csetf_lexwiz_template(new_object, lexification_wizard.lexwiz_template(v_object));
        lexification_wizard._csetf_lexwiz_template_args(new_object, lexification_wizard.lexwiz_template_args(v_object));
        lexification_wizard._csetf_lexwiz_template_speech_parts(new_object, lexification_wizard.lexwiz_template_speech_parts(v_object));
        lexification_wizard._csetf_lexwiz_ignore_arityP(new_object, lexification_wizard.lexwiz_ignore_arityP(v_object));
        lexification_wizard._csetf_lexwiz_headword_position(new_object, lexification_wizard.lexwiz_headword_position(v_object));
        lexification_wizard._csetf_lexwiz_headword_part_of_speech(new_object, lexification_wizard.lexwiz_headword_part_of_speech(v_object));
        lexification_wizard._csetf_lexwiz_error_message(new_object, lexification_wizard.lexwiz_error_message(v_object));
        lexification_wizard._csetf_lexwiz_state(new_object, lexification_wizard.lexwiz_state(v_object));
        lexification_wizard._csetf_lexwiz_readyP(new_object, lexification_wizard.lexwiz_readyP(v_object));
        lexification_wizard._csetf_lexwiz_user_formula(new_object, lexification_wizard.lexwiz_user_formula(v_object));
        lexification_wizard._csetf_lexwiz_user_editedP(new_object, lexification_wizard.lexwiz_user_editedP(v_object));
        lexification_wizard._csetf_lexwiz_formula(new_object, lexification_wizard.lexwiz_formula(v_object));
        lexification_wizard._csetf_lexwiz_other_formulas(new_object, lexification_wizard.lexwiz_other_formulas(v_object));
        lexification_wizard._csetf_lexwiz_user_action(new_object, lexification_wizard.lexwiz_user_action(v_object));
        lexification_wizard._csetf_lexwiz_lexical_mt(new_object, lexification_wizard.lexwiz_lexical_mt(v_object));
        lexification_wizard._csetf_lexwiz_syntactic_mt(new_object, lexification_wizard.lexwiz_syntactic_mt(v_object));
        lexification_wizard._csetf_lexwiz_generation_mt(new_object, lexification_wizard.lexwiz_generation_mt(v_object));
        lexification_wizard._csetf_lexwiz_parse_template_mt(new_object, lexification_wizard.lexwiz_parse_template_mt(v_object));
        lexification_wizard._csetf_lexwiz_parse_template(new_object, lexification_wizard.lexwiz_parse_template(v_object));
        lexification_wizard._csetf_lexwiz_parse_template_formula(new_object, lexification_wizard.lexwiz_parse_template_formula(v_object));
        lexification_wizard._csetf_lexwiz_id(new_object, lexification_wizard.new_lexification_id());
        lexification_wizard.set_lexification_object(lexification_wizard.lexwiz_id(new_object), new_object);
        return NIL;
    }

    /**
     * Copy the lexification-parameters object
     *
     * @unknown see if there is an automatic way of doing this in SubL
     */
    @LispMethod(comment = "Copy the lexification-parameters object\r\n\r\n@unknown see if there is an automatic way of doing this in SubL")
    public static final SubLObject copy_lexification_parameters_alt(SubLObject v_object) {
        {
            SubLObject new_object = com.cyc.cycjava.cycl.lexification_wizard.make_lexification_parameters(UNPROVIDED);
            com.cyc.cycjava.cycl.lexification_wizard.copy_over_lexification_parameters(new_object, v_object);
            return new_object;
        }
    }

    /**
     * Copy the lexification-parameters object
     *
     * @unknown see if there is an automatic way of doing this in SubL
     */
    @LispMethod(comment = "Copy the lexification-parameters object\r\n\r\n@unknown see if there is an automatic way of doing this in SubL")
    public static SubLObject copy_lexification_parameters(final SubLObject v_object) {
        final SubLObject new_object = lexification_wizard.make_lexification_parameters(UNPROVIDED);
        lexification_wizard.copy_over_lexification_parameters(new_object, v_object);
        return new_object;
    }

    /**
     *
     *
     * @return string ; new unique ID string for representing the interaction object
     */
    @LispMethod(comment = "@return string ; new unique ID string for representing the interaction object")
    public static final SubLObject new_lexification_id_alt() {
        return Guids.guid_to_string(Guids.new_guid());
    }

    /**
     *
     *
     * @return string ; new unique ID string for representing the interaction object
     */
    @LispMethod(comment = "@return string ; new unique ID string for representing the interaction object")
    public static SubLObject new_lexification_id() {
        return Guids.guid_to_string(Guids.new_guid());
    }

    /**
     * Sets ID's @xref lexification-parameter structure to OBJECT
     */
    @LispMethod(comment = "Sets ID\'s @xref lexification-parameter structure to OBJECT")
    public static final SubLObject set_lexification_object_alt(SubLObject id, SubLObject v_object) {
        if (NIL != $lexification_object_table$.getGlobalValue()) {
            return sethash(id, $lexification_object_table$.getGlobalValue(), v_object);
        }
        return NIL;
    }

    /**
     * Sets ID's @xref lexification-parameter structure to OBJECT
     */
    @LispMethod(comment = "Sets ID\'s @xref lexification-parameter structure to OBJECT")
    public static SubLObject set_lexification_object(final SubLObject id, final SubLObject v_object) {
        if (NIL != lexification_wizard.$lexification_object_table$.getGlobalValue()) {
            return sethash(id, lexification_wizard.$lexification_object_table$.getGlobalValue(), v_object);
        }
        return NIL;
    }

    /**
     *
     *
     * @return @xref lexification-parameter structure corresponding to object given by ID
     * @unknown return emtpy object if the ID is not valid???
     */
    @LispMethod(comment = "@return @xref lexification-parameter structure corresponding to object given by ID\r\n@unknown return emtpy object if the ID is not valid???")
    public static final SubLObject get_lexification_object_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                if (NIL != $lexification_object_table$.getGlobalValue()) {
                    v_object = (NIL != id) ? ((SubLObject) (gethash(id, $lexification_object_table$.getGlobalValue(), UNPROVIDED))) : NIL;
                } else {
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt96$Warning__, $$$Object_hash_table_not_initialized));
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                }
                return v_object;
            }
        }
    }

    /**
     *
     *
     * @return @xref lexification-parameter structure corresponding to object given by ID
     * @unknown return emtpy object if the ID is not valid???
     */
    @LispMethod(comment = "@return @xref lexification-parameter structure corresponding to object given by ID\r\n@unknown return emtpy object if the ID is not valid???")
    public static SubLObject get_lexification_object(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        if (NIL != lexification_wizard.$lexification_object_table$.getGlobalValue()) {
            v_object = (NIL != id) ? gethash(id, lexification_wizard.$lexification_object_table$.getGlobalValue(), UNPROVIDED) : NIL;
        } else
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate(lexification_wizard.$str119$Warning__, lexification_wizard.$$$Object_hash_table_not_initialized));
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }

        return v_object;
    }

    public static SubLObject lexwiz_settings_changedP(final SubLObject object_before, final SubLObject object_after) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject main_settings = lexification_wizard.list_main_lexification_parameters(object_after);
        final SubLObject main_settings_before = lexification_wizard.list_main_lexification_parameters(object_before);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), lexification_wizard.$str121$lexwiz_settings_changed____A_vs__, lexification_wizard.lexwiz_id(object_before), lexification_wizard.lexwiz_id(object_after));
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if (!main_settings.equalp(main_settings_before)) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), lexification_wizard.$str122$setting_change___s__, set_difference(main_settings, main_settings_before, symbol_function(EQUALP), UNPROVIDED));
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject resolve_lexwiz_object_fort(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexwiz_object = lexification_wizard.get_lexification_object(id);
        SubLObject fort = NIL;
        if (NIL != lexwiz_object) {
            if ((!id.equal(lexification_wizard.lexwiz_id(lexwiz_object))) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate(lexification_wizard.$str119$Warning__, lexification_wizard.$str123$____assertion_failed___a______), lexification_wizard.$list124);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            fort = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(lexwiz_object));
        }
        return fort;
    }

    /**
     *
     *
     * @return list ; Lisp representation of template argument list (e.g., genFormat's arg 3)
     * @unknown The string is first converted to lisp as-is. If the entire string is not used, then
    it is assumed to be a list and the conversion is retried with parentheses.
     */
    @LispMethod(comment = "@return list ; Lisp representation of template argument list (e.g., genFormat\'s arg 3)\r\n@unknown The string is first converted to lisp as-is. If the entire string is not used, then\r\nit is assumed to be a list and the conversion is retried with parentheses.")
    public static final SubLObject lispify_template_args_alt(SubLObject arg_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyc_args = NIL;
                SubLObject next_pos = NIL;
                arg_string = string_utilities.trim_whitespace(arg_string);
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cyc_args_1 = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject next_pos_2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        cyc_args = cyc_args_1;
                                        next_pos = next_pos_2;
                                    }
                                    if (next_pos.numL(length(arg_string)) || ((NIL != cyc_args) && cyc_args.isAtom())) {
                                        arg_string = cconcatenate($str_alt100$_, new SubLObject[]{ arg_string, $str_alt101$_ });
                                        cyc_args = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
                return cyc_args;
            }
        }
    }

    /**
     *
     *
     * @return list ; Lisp representation of template argument list (e.g., genFormat's arg 3)
     * @unknown The string is first converted to lisp as-is. If the entire string is not used, then
    it is assumed to be a list and the conversion is retried with parentheses.
     */
    @LispMethod(comment = "@return list ; Lisp representation of template argument list (e.g., genFormat\'s arg 3)\r\n@unknown The string is first converted to lisp as-is. If the entire string is not used, then\r\nit is assumed to be a list and the conversion is retried with parentheses.")
    public static SubLObject lispify_template_args(SubLObject arg_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cyc_args = NIL;
        SubLObject next_pos = NIL;
        arg_string = string_utilities.trim_whitespace(arg_string);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push(lexification_wizard.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(lexification_wizard.IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject cyc_args_$1 = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject next_pos_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cyc_args = cyc_args_$1;
                    next_pos = next_pos_$2;
                    if (next_pos.numL(length(arg_string)) || ((NIL != cyc_args) && cyc_args.isAtom())) {
                        arg_string = cconcatenate(lexification_wizard.$str127$_, new SubLObject[]{ arg_string, lexification_wizard.$str128$_ });
                        cyc_args = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, lexification_wizard.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return cyc_args;
    }

    /**
     *
     *
     * @return integer ; number of positional arguments in FORMAT-STRING (e.g., genFormat's arg 2)
     */
    @LispMethod(comment = "@return integer ; number of positional arguments in FORMAT-STRING (e.g., genFormat\'s arg 2)")
    public static final SubLObject count_positional_args_alt(SubLObject format_string) {
        {
            SubLObject num = ZERO_INTEGER;
            SubLObject len = length(format_string);
            SubLObject previous_char = NIL;
            SubLObject string_var = format_string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_3 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_3); i = number_utilities.f_1X(i)) {
                {
                    SubLObject v_char = Strings.sublisp_char(string_var, i);
                    SubLObject next_char = (add(i, ONE_INTEGER).numL(len)) ? ((SubLObject) (elt(format_string, add(i, ONE_INTEGER)))) : NIL;
                    if (((v_char == CHAR_tilde) && (previous_char != CHAR_tilde)) && (NIL == subl_promotions.memberP(next_char, $list_alt102, UNPROVIDED, UNPROVIDED))) {
                        num = add(num, ONE_INTEGER);
                    }
                    previous_char = v_char;
                }
            }
            return num;
        }
    }

    /**
     *
     *
     * @return integer ; number of positional arguments in FORMAT-STRING (e.g., genFormat's arg 2)
     */
    @LispMethod(comment = "@return integer ; number of positional arguments in FORMAT-STRING (e.g., genFormat\'s arg 2)")
    public static SubLObject count_positional_args(final SubLObject format_string) {
        SubLObject num = ZERO_INTEGER;
        final SubLObject len = length(format_string);
        SubLObject previous_char = NIL;
        SubLObject end_var_$3;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        SubLObject next_char;
        for (end_var = end_var_$3 = length(format_string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$3); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(format_string, i);
            next_char = (add(i, ONE_INTEGER).numL(len)) ? elt(format_string, add(i, ONE_INTEGER)) : NIL;
            if ((v_char.eql(CHAR_tilde) && (!previous_char.eql(CHAR_tilde))) && (NIL == subl_promotions.memberP(next_char, lexification_wizard.$list129, UNPROVIDED, UNPROVIDED))) {
                num = add(num, ONE_INTEGER);
            }
            previous_char = v_char;
        }
        return num;
    }

    /**
     *
     *
     * @return integer ; numeric value of POSITION-TEXT for a sequence of the given LENGTH
     * @unknown 'First' is used for 1; and 'Last' for the length of the sequence
     */
    @LispMethod(comment = "@return integer ; numeric value of POSITION-TEXT for a sequence of the given LENGTH\r\n@unknown \'First\' is used for 1; and \'Last\' for the length of the sequence")
    public static final SubLObject convert_position_alt(SubLObject position_text, SubLObject length) {
        {
            SubLObject position_value = lexification_utilities.extract_integer(position_text, MINUS_ONE_INTEGER);
            if (position_text.equalp($$$First)) {
                position_value = ONE_INTEGER;
            } else {
                if (position_text.equalp($$$Last)) {
                    position_value = length;
                }
            }
            return position_value;
        }
    }

    /**
     *
     *
     * @return integer ; numeric value of POSITION-TEXT for a sequence of the given LENGTH
     * @unknown 'First' is used for 1; and 'Last' for the length of the sequence
     */
    @LispMethod(comment = "@return integer ; numeric value of POSITION-TEXT for a sequence of the given LENGTH\r\n@unknown \'First\' is used for 1; and \'Last\' for the length of the sequence")
    public static SubLObject convert_position(final SubLObject position_text, final SubLObject length) {
        SubLObject position_value = lexification_utilities.extract_integer(position_text, MINUS_ONE_INTEGER);
        if (position_text.equalp(lexification_wizard.$$$First)) {
            position_value = ONE_INTEGER;
        } else
            if (position_text.equalp(lexification_wizard.$$$Last)) {
                position_value = length;
            }

        return position_value;
    }

    /**
     *
     *
     * @return fort ; Cyc predicate to use for lexification given headword POSITION and PHRASE-LEN
     */
    @LispMethod(comment = "@return fort ; Cyc predicate to use for lexification given headword POSITION and PHRASE-LEN")
    public static final SubLObject determine_lexical_predicate_alt(SubLObject position, SubLObject phrase_len) {
        {
            SubLObject predicate = NIL;
            if (phrase_len.numE(ONE_INTEGER)) {
                predicate = $default_denotation_predicate$.getGlobalValue();
            } else {
                if (position.numE(ONE_INTEGER)) {
                    predicate = $$compoundString;
                } else {
                    if (position.numE(phrase_len)) {
                        predicate = $$multiWordString;
                    } else {
                        predicate = $$headMedialString;
                    }
                }
            }
            return predicate;
        }
    }

    /**
     *
     *
     * @return fort ; Cyc predicate to use for lexification given headword POSITION and PHRASE-LEN
     */
    @LispMethod(comment = "@return fort ; Cyc predicate to use for lexification given headword POSITION and PHRASE-LEN")
    public static SubLObject determine_lexical_predicate(SubLObject position, final SubLObject phrase_len) {
        SubLObject predicate = NIL;
        if (phrase_len.numE(ONE_INTEGER)) {
            predicate = lexification_wizard.$default_denotation_predicate$.getGlobalValue();
        } else
            if (position.numE(ONE_INTEGER)) {
                predicate = lexification_wizard.$$compoundString;
            } else
                if (position.numE(phrase_len)) {
                    predicate = lexification_wizard.$$multiWordString;
                } else {
                    predicate = lexification_wizard.$$headMedialString;
                }


        return predicate;
    }

    /**
     *
     *
     * @return 0. list ; formula needed to perform the lexical mapping of PHRASE into MEANING,
    where headword is at HEAD-POSITION and of Cyc SpeechPart PART-OF-SPEECH-TEXT; nil indicates error
     * @return 1. text ; error message
     * @unknown This returns nil if head-word is not in lexicon
     */
    @LispMethod(comment = "@return 0. list ; formula needed to perform the lexical mapping of PHRASE into MEANING,\r\nwhere headword is at HEAD-POSITION and of Cyc SpeechPart PART-OF-SPEECH-TEXT; nil indicates error\r\n@return 1. text ; error message\r\n@unknown This returns nil if head-word is not in lexicon")
    public static final SubLObject determine_lexical_formula_alt(SubLObject meaning, SubLObject phrase, SubLObject head_position, SubLObject part_of_speech_text, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject word_list = lexification_utilities.lex_string_tokenize(phrase, NIL);
            SubLObject phrase_len = length(word_list);
            SubLObject part_of_speech = fort_for_string(part_of_speech_text);
            SubLObject error = com.cyc.cycjava.cycl.lexification_wizard.validate_lexification_parameters(head_position, part_of_speech, phrase, phrase_len);
            SubLObject formula = NIL;
            if (NIL == error) {
                {
                    SubLObject head_offset = subtract(head_position, ONE_INTEGER);
                    SubLObject predicate = com.cyc.cycjava.cycl.lexification_wizard.determine_lexical_predicate(head_position, phrase_len);
                    SubLObject head_word = elt(word_list, head_offset);
                    SubLObject other_words = list_utilities.remove_nth(head_offset, word_list);
                    SubLObject other_words_for_formula = make_el_list(other_words, UNPROVIDED);
                    SubLObject other_words_aux = NIL;
                    SubLObject head_unit = com.cyc.cycjava.cycl.lexification_wizard.determine_lexification_word_unit(head_word, part_of_speech, lexical_mt);
                    if (NIL == head_unit) {
                        error = format(NIL, $str_alt108$Unable_to_map_headword__s_in_part, head_word, part_of_speech_text);
                    } else {
                        if (predicate == $$compoundString) {
                            formula = list($$compoundString, head_unit, other_words_for_formula, part_of_speech, meaning);
                        } else {
                            if (predicate == $$multiWordString) {
                                formula = list($$multiWordString, other_words_for_formula, head_unit, part_of_speech, meaning);
                            } else {
                                if (predicate == $$headMedialString) {
                                    other_words_aux = make_el_list(nthcdr(head_offset, other_words), UNPROVIDED);
                                    other_words_for_formula = make_el_list(list_utilities.first_n(head_offset, other_words), UNPROVIDED);
                                    formula = list($$headMedialString, other_words_for_formula, head_unit, other_words_aux, part_of_speech, meaning);
                                } else {
                                    if ((predicate == $default_denotation_predicate$.getGlobalValue()) && (NIL == other_words)) {
                                        {
                                            SubLObject sense = lexicon_utilities.unique_ws(head_unit, part_of_speech, meaning);
                                            formula = list($default_denotation_predicate$.getGlobalValue(), head_unit, part_of_speech, sense, meaning);
                                        }
                                    } else {
                                        error = $$$Unexpected_lexification_error;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(formula, error);
        }
    }

    /**
     *
     *
     * @return 0. list ; formula needed to perform the lexical mapping of PHRASE into MEANING,
    where headword is at HEAD-POSITION and of Cyc SpeechPart PART-OF-SPEECH-TEXT; nil indicates error
     * @return 1. text ; error message
     * @unknown This returns nil if head-word is not in lexicon
     */
    @LispMethod(comment = "@return 0. list ; formula needed to perform the lexical mapping of PHRASE into MEANING,\r\nwhere headword is at HEAD-POSITION and of Cyc SpeechPart PART-OF-SPEECH-TEXT; nil indicates error\r\n@return 1. text ; error message\r\n@unknown This returns nil if head-word is not in lexicon")
    public static SubLObject determine_lexical_formula(final SubLObject meaning, final SubLObject phrase, final SubLObject head_position, final SubLObject part_of_speech_text, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject word_list = lexification_utilities.lex_string_tokenize(phrase, NIL);
        final SubLObject phrase_len = length(word_list);
        final SubLObject part_of_speech = misc_kb_utilities.fort_for_string(part_of_speech_text);
        SubLObject error = lexification_wizard.validate_lexification_parameters(head_position, part_of_speech, phrase, phrase_len);
        SubLObject formula = NIL;
        if (NIL == error) {
            final SubLObject head_offset = subtract(head_position, ONE_INTEGER);
            final SubLObject predicate = lexification_wizard.determine_lexical_predicate(head_position, phrase_len);
            final SubLObject head_word = elt(word_list, head_offset);
            final SubLObject other_words = list_utilities.remove_nth(head_offset, word_list);
            SubLObject other_words_for_formula = make_el_list(other_words, UNPROVIDED);
            SubLObject other_words_aux = NIL;
            final SubLObject head_unit = lexification_wizard.determine_lexification_word_unit(head_word, part_of_speech, lexical_mt);
            if (NIL == head_unit) {
                error = format(NIL, lexification_wizard.$str135$Unable_to_map_headword__s_in_part, head_word, part_of_speech_text);
            } else
                if (predicate.eql(lexification_wizard.$$compoundString)) {
                    formula = list(lexification_wizard.$$compoundString, head_unit, other_words_for_formula, part_of_speech, meaning);
                } else
                    if (predicate.eql(lexification_wizard.$$multiWordString)) {
                        formula = list(lexification_wizard.$$multiWordString, other_words_for_formula, head_unit, part_of_speech, meaning);
                    } else
                        if (predicate.eql(lexification_wizard.$$headMedialString)) {
                            other_words_aux = make_el_list(nthcdr(head_offset, other_words), UNPROVIDED);
                            other_words_for_formula = make_el_list(list_utilities.first_n(head_offset, other_words), UNPROVIDED);
                            formula = list(lexification_wizard.$$headMedialString, other_words_for_formula, head_unit, other_words_aux, part_of_speech, meaning);
                        } else
                            if (predicate.eql(lexification_wizard.$default_denotation_predicate$.getGlobalValue()) && (NIL == other_words)) {
                                final SubLObject sense = lexicon_utilities.unique_ws(head_unit, part_of_speech, meaning);
                                formula = list(lexification_wizard.$default_denotation_predicate$.getGlobalValue(), head_unit, part_of_speech, sense, meaning);
                            } else {
                                error = lexification_wizard.$$$Unexpected_lexification_error;
                            }




        }
        return values(formula, error);
    }

    /**
     * Adds an appropriate syntactic mapping in MT for WORDFORM as PART-OF-SPEECH
     */
    @LispMethod(comment = "Adds an appropriate syntactic mapping in MT for WORDFORM as PART-OF-SPEECH")
    public static final SubLObject add_lexical_mapping_alt(SubLObject wordform, SubLObject part_of_speech, SubLObject mt, SubLObject word_type) {
        if (word_type == UNPROVIDED) {
            word_type = $$EnglishWord;
        }
        return com.cyc.cycjava.cycl.lexification_wizard.do_lexical_mapping_int(wordform, part_of_speech, mt, word_type, T, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Adds an appropriate syntactic mapping in MT for WORDFORM as PART-OF-SPEECH")
    public static SubLObject add_lexical_mapping(final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, SubLObject word_type) {
        if (word_type == UNPROVIDED) {
            word_type = lexification_wizard.$$EnglishWord;
        }
        return lexification_wizard.do_lexical_mapping_int(wordform, part_of_speech, mt, word_type, T, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Remove the syntactic mapping in MT for WORDFORM as PART-OF-SPEECH
     */
    @LispMethod(comment = "Remove the syntactic mapping in MT for WORDFORM as PART-OF-SPEECH")
    public static final SubLObject remove_lexical_mapping_alt(SubLObject wordform, SubLObject part_of_speech, SubLObject mt, SubLObject word_type) {
        if (word_type == UNPROVIDED) {
            word_type = $$EnglishWord;
        }
        return com.cyc.cycjava.cycl.lexification_wizard.do_lexical_mapping_int(wordform, part_of_speech, mt, word_type, NIL, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Remove the syntactic mapping in MT for WORDFORM as PART-OF-SPEECH")
    public static SubLObject remove_lexical_mapping(final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, SubLObject word_type) {
        if (word_type == UNPROVIDED) {
            word_type = lexification_wizard.$$EnglishWord;
        }
        return lexification_wizard.do_lexical_mapping_int(wordform, part_of_speech, mt, word_type, NIL, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean ; result of adding (or removing) the syntactic mapping
    Since the syntactic mapping is specified by SpeechPart rather than predicate, the stem
    of the wordform is used rather than the word itself.
     * @unknown The word unit is currently not removed when the mapping is removed
     * @unknown new word units will be tagged with #$termDependsOn (see @xref create-constant)
     * @unknown If CREATE-CONSTANT-DATA is non-nil then this is passed as the first parameter to the create-constant-fn, which is assumed to be a method of a SubLoops class. See @xref sme-li-denotational::do-lexical-mapping in sme-lexification-wizard.lisp
     */
    @LispMethod(comment = "@return boolean ; result of adding (or removing) the syntactic mapping\r\nSince the syntactic mapping is specified by SpeechPart rather than predicate, the stem\r\nof the wordform is used rather than the word itself.\r\n@unknown The word unit is currently not removed when the mapping is removed\r\n@unknown new word units will be tagged with #$termDependsOn (see @xref create-constant)\r\n@unknown If CREATE-CONSTANT-DATA is non-nil then this is passed as the first parameter to the create-constant-fn, which is assumed to be a method of a SubLoops class. See @xref sme-li-denotational::do-lexical-mapping in sme-lexification-wizard.lisp")
    public static final SubLObject do_lexical_mapping_int_alt(SubLObject wordform, SubLObject part_of_speech, SubLObject mt, SubLObject word_type, SubLObject addP, SubLObject create_constant_fn, SubLObject create_constant_data) {
        if (create_constant_fn == UNPROVIDED) {
            create_constant_fn = symbol_function(KE_CREATE_NOW);
        }
        if (create_constant_data == UNPROVIDED) {
            create_constant_data = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_keyword = lexification_utilities.precise_keyword_for_pos(part_of_speech, UNPROVIDED);
                SubLObject stem = lexification_utilities.guess_stem(wordform, pos_keyword);
                SubLObject assert_fn = (NIL != addP) ? ((SubLObject) (symbol_function(TRY_LEX_ASSERT_NOW))) : symbol_function(TRY_UNASSERT_NOW);
                SubLObject pred = lexicon_utilities.ordered_preds_of_pos(part_of_speech).first();
                SubLObject new_wordform = (NIL != member(pos_keyword, $list_alt114, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (stem)) : wordform;
                SubLObject word_unit = lexicon_accessors.words_of_stringXpred(new_wordform, pred, NIL, mt, UNPROVIDED).first();
                if (NIL == word_unit) {
                    if (NIL == word_unit) {
                        {
                            SubLObject csome_list_var = lexicon_cache.words_of_string(stem, NIL, mt, UNPROVIDED);
                            SubLObject possible_word_unit = NIL;
                            for (possible_word_unit = csome_list_var.first(); !((NIL != word_unit) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , possible_word_unit = csome_list_var.first()) {
                                if (NIL == lexicon_accessors.get_strings_of_type(possible_word_unit, part_of_speech, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    word_unit = possible_word_unit;
                                }
                            }
                        }
                    }
                }
                if (NIL == word_unit) {
                    {
                        SubLObject word_unit_name = constant_completion_high.uniquify_constant_name(lexicon_utilities.suggest_word_unit(stem));
                        if (NIL != create_constant_data) {
                            word_unit = funcall(create_constant_fn, create_constant_data, word_unit_name);
                        } else {
                            word_unit = funcall(create_constant_fn, word_unit_name);
                        }
                        if (NIL == word_unit) {
                            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt96$Warning__, $str_alt115$____assertion_failed___a______), WORD_UNIT);
                                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                            }
                        }
                        lexification_utilities.try_lex_assert_now(list($$isa, word_unit, word_type), mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                return funcall(assert_fn, list(pred, word_unit, new_wordform), mt);
            }
        }
    }

    /**
     *
     *
     * @return boolean ; result of adding (or removing) the syntactic mapping
    Since the syntactic mapping is specified by SpeechPart rather than predicate, the stem
    of the wordform is used rather than the word itself.
     * @unknown The word unit is currently not removed when the mapping is removed
     * @unknown new word units will be tagged with #$termDependsOn (see @xref create-constant)
     * @unknown If CREATE-CONSTANT-DATA is non-nil then this is passed as the first parameter to the create-constant-fn, which is assumed to be a method of a SubLoops class. See @xref sme-li-denotational::do-lexical-mapping in sme-lexification-wizard.lisp
     */
    @LispMethod(comment = "@return boolean ; result of adding (or removing) the syntactic mapping\r\nSince the syntactic mapping is specified by SpeechPart rather than predicate, the stem\r\nof the wordform is used rather than the word itself.\r\n@unknown The word unit is currently not removed when the mapping is removed\r\n@unknown new word units will be tagged with #$termDependsOn (see @xref create-constant)\r\n@unknown If CREATE-CONSTANT-DATA is non-nil then this is passed as the first parameter to the create-constant-fn, which is assumed to be a method of a SubLoops class. See @xref sme-li-denotational::do-lexical-mapping in sme-lexification-wizard.lisp")
    public static SubLObject do_lexical_mapping_int(final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, final SubLObject word_type, final SubLObject addP, SubLObject create_constant_fn, SubLObject create_constant_data) {
        if (create_constant_fn == UNPROVIDED) {
            create_constant_fn = symbol_function(lexification_wizard.KE_CREATE_NOW);
        }
        if (create_constant_data == UNPROVIDED) {
            create_constant_data = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_keyword = lexification_utilities.precise_keyword_for_pos(part_of_speech, UNPROVIDED);
        final SubLObject stem = lexification_utilities.guess_stem(wordform, pos_keyword);
        final SubLObject assert_fn = (NIL != addP) ? symbol_function(lexification_wizard.TRY_LEX_ASSERT_NOW) : symbol_function(lexification_wizard.TRY_UNASSERT_NOW);
        final SubLObject pred = lexicon_utilities.ordered_preds_of_pos(part_of_speech).first();
        final SubLObject new_wordform = (NIL != member(pos_keyword, lexification_wizard.$list141, UNPROVIDED, UNPROVIDED)) ? stem : wordform;
        SubLObject word_unit = lexicon_accessors.words_of_stringXpred(new_wordform, pred, NIL, mt, UNPROVIDED).first();
        if ((NIL == word_unit) && (NIL == word_unit)) {
            SubLObject csome_list_var = lexicon_cache.words_of_string(stem, NIL, mt, UNPROVIDED);
            SubLObject possible_word_unit = NIL;
            possible_word_unit = csome_list_var.first();
            while ((NIL == word_unit) && (NIL != csome_list_var)) {
                if (NIL == lexicon_accessors.get_strings_of_type(possible_word_unit, part_of_speech, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    word_unit = possible_word_unit;
                }
                csome_list_var = csome_list_var.rest();
                possible_word_unit = csome_list_var.first();
            } 
        }
        if (NIL == word_unit) {
            final SubLObject word_unit_name = constant_completion_high.uniquify_constant_name(lexicon_utilities.suggest_word_unit(stem), UNPROVIDED);
            if (NIL != create_constant_data) {
                word_unit = funcall(create_constant_fn, create_constant_data, word_unit_name);
            } else {
                word_unit = funcall(create_constant_fn, word_unit_name);
            }
            if ((NIL == word_unit) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate(lexification_wizard.$str119$Warning__, lexification_wizard.$str123$____assertion_failed___a______), WORD_UNIT);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            lexification_utilities.try_lex_assert_now(list(lexification_wizard.$$isa, word_unit, word_type), mt, UNPROVIDED, UNPROVIDED);
        }
        return funcall(assert_fn, list(pred, word_unit, new_wordform), mt);
    }

    /**
     * Validate the parameters specifying the lexification
     *
     * @return Error message or nil if OK
     */
    @LispMethod(comment = "Validate the parameters specifying the lexification\r\n\r\n@return Error message or nil if OK")
    public static final SubLObject validate_lexification_parameters_alt(SubLObject head_position, SubLObject part_of_speech, SubLObject phrase, SubLObject phrase_len) {
        {
            SubLObject error = NIL;
            if (phrase == $str_alt118$) {
                error = $$$Missing_lexification_phrase;
            } else {
                if (head_position.numL(ONE_INTEGER) || head_position.numG(phrase_len)) {
                    error = $$$Invalid_headword_specification;
                } else {
                    if (NIL == part_of_speech) {
                        error = $$$Missing_part_of_speech;
                    }
                }
            }
            return error;
        }
    }

    @LispMethod(comment = "Validate the parameters specifying the lexification\r\n\r\n@return Error message or nil if OK")
    public static SubLObject validate_lexification_parameters(final SubLObject head_position, final SubLObject part_of_speech, final SubLObject phrase, final SubLObject phrase_len) {
        SubLObject error = NIL;
        if (phrase.eql(lexification_wizard.$str144$)) {
            error = lexification_wizard.$$$Missing_lexification_phrase;
        } else
            if (head_position.numL(ONE_INTEGER) || head_position.numG(phrase_len)) {
                error = lexification_wizard.$$$Invalid_headword_specification;
            } else
                if (NIL == part_of_speech) {
                    error = lexification_wizard.$$$Missing_part_of_speech;
                }


        return error;
    }

    /**
     * Determines the word-unit most suitable for HEAD-WORD in the given PART-OF-SPEECH.
     *
     * @unknown This first checks whether the word as-is occurs in the appropriate syntactic mapping
    for some lexical entry. Otherwise, the stemmed version of the word is checked.
     * @unknown handle the unlikely case of more than one word unit for the word/pos pair
     * @unknown rework using @xref words-of-string&speech-part
     */
    @LispMethod(comment = "Determines the word-unit most suitable for HEAD-WORD in the given PART-OF-SPEECH.\r\n\r\n@unknown This first checks whether the word as-is occurs in the appropriate syntactic mapping\r\nfor some lexical entry. Otherwise, the stemmed version of the word is checked.\r\n@unknown handle the unlikely case of more than one word unit for the word/pos pair\r\n@unknown rework using @xref words-of-string&speech-part")
    public static final SubLObject determine_lexification_word_unit_alt(SubLObject head_word, SubLObject part_of_speech, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject word_unit = NIL;
            if (NIL == word_unit) {
                {
                    SubLObject csome_list_var = lexicon_utilities.ordered_preds_of_pos(part_of_speech);
                    SubLObject pos_predicate = NIL;
                    for (pos_predicate = csome_list_var.first(); !((NIL != word_unit) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos_predicate = csome_list_var.first()) {
                        {
                            SubLObject pos_keyword = lexification_utilities.keyword_for_pred(pos_predicate, UNPROVIDED);
                            if (NIL == word_unit) {
                                {
                                    SubLObject csome_list_var_4 = list(head_word, morphology.find_stem(head_word, pos_keyword));
                                    SubLObject word = NIL;
                                    for (word = csome_list_var_4.first(); !((NIL != word_unit) || (NIL == csome_list_var_4)); csome_list_var_4 = csome_list_var_4.rest() , word = csome_list_var_4.first()) {
                                        {
                                            SubLObject word_units = lexicon_accessors.words_of_stringXpred(word, pos_predicate, NIL, lexical_mt, UNPROVIDED);
                                            word_unit = word_units.first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return word_unit;
        }
    }

    @LispMethod(comment = "Determines the word-unit most suitable for HEAD-WORD in the given PART-OF-SPEECH.\r\n\r\n@unknown This first checks whether the word as-is occurs in the appropriate syntactic mapping\r\nfor some lexical entry. Otherwise, the stemmed version of the word is checked.\r\n@unknown handle the unlikely case of more than one word unit for the word/pos pair\r\n@unknown rework using @xref words-of-string&speech-part")
    public static SubLObject determine_lexification_word_unit(final SubLObject head_word, final SubLObject part_of_speech, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject word_unit = NIL;
        if (NIL == word_unit) {
            SubLObject csome_list_var = lexicon_utilities.ordered_preds_of_pos(part_of_speech);
            SubLObject pos_predicate = NIL;
            pos_predicate = csome_list_var.first();
            while ((NIL == word_unit) && (NIL != csome_list_var)) {
                final SubLObject pos_keyword = lexification_utilities.keyword_for_pred(pos_predicate, UNPROVIDED);
                if (NIL == word_unit) {
                    SubLObject csome_list_var_$4 = list(head_word, morphology.find_stem(head_word, pos_keyword));
                    SubLObject word = NIL;
                    word = csome_list_var_$4.first();
                    while ((NIL == word_unit) && (NIL != csome_list_var_$4)) {
                        final SubLObject word_units = lexicon_accessors.words_of_stringXpred(word, pos_predicate, NIL, lexical_mt, UNPROVIDED);
                        word_unit = find_if(lexification_wizard.$sym148$ACCEPTABLE_LEXIFICATION_WORD_UNIT_, word_units, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        csome_list_var_$4 = csome_list_var_$4.rest();
                        word = csome_list_var_$4.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                pos_predicate = csome_list_var.first();
            } 
        }
        return word_unit;
    }

    public static SubLObject acceptable_lexification_word_unitP(final SubLObject word_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(word_unit, lexification_wizard.$list149);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject suffix = list_utilities.alist_lookup_without_values(v_bindings, SUFFIX, UNPROVIDED, UNPROVIDED);
            final SubLObject suffix_string = kb_mapping_utilities.fpred_value_in_any_mt(suffix, lexification_wizard.$$suffixString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != string_utilities.empty_string_p(suffix_string)) {
                return NIL;
            }
        }
        return T;
    }

    /**
     * Perform the lexification for lexification-parameters OBJECT. In addition, if there
     * are any termString-type lexifications matching the term and phrase, these are unasserted.
     *
     * @unknown For relational lexifications, a nameString assertion will be made along with the genFormat (or genTemplate)
     * @unknown genStringAssertion's will also be added if object:lexwiz-is-preferred? is set (genStringAssertion-Precise is used when the value is :precise)
     * @return boolean ; T iff the assertion was made successfully
     */
    @LispMethod(comment = "Perform the lexification for lexification-parameters OBJECT. In addition, if there\r\nare any termString-type lexifications matching the term and phrase, these are unasserted.\r\n\r\n@unknown For relational lexifications, a nameString assertion will be made along with the genFormat (or genTemplate)\r\n@unknown genStringAssertion\'s will also be added if object:lexwiz-is-preferred? is set (genStringAssertion-Precise is used when the value is :precise)\r\n@return boolean ; T iff the assertion was made successfully\nPerform the lexification for lexification-parameters OBJECT. In addition, if there\nare any termString-type lexifications matching the term and phrase, these are unasserted.")
    public static final SubLObject perform_lexification_alt(SubLObject v_object) {
        com.cyc.cycjava.cycl.lexification_wizard.trace_lexification_parameters(v_object, UNPROVIDED);
        {
            SubLObject cyc_term = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object));
            SubLObject mt = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_mt(v_object));
            SubLObject formula = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_formula(v_object);
            SubLObject is_relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == com.cyc.cycjava.cycl.lexification_wizard.lexwiz_nonrelationalP(v_object)));
            SubLObject ok = (NIL != formula) ? ((SubLObject) (lexification_utilities.try_lex_assert_now(formula, mt, UNPROVIDED, UNPROVIDED))) : NIL;
            if (NIL != ok) {
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_other_formulas(v_object);
                    SubLObject formula_5 = NIL;
                    for (formula_5 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_5 = cdolist_list_var.first()) {
                        ok = lexification_utilities.try_lex_assert_now(formula_5, mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                if ((NIL != com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_preferredP(v_object)) && (NIL == is_relationalP)) {
                    {
                        SubLObject is_preciseP = eq(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_preferredP(v_object), $PRECISE);
                        SubLObject pred = (NIL != is_preciseP) ? ((SubLObject) ($$genStringAssertion_Precise)) : $$genStringAssertion;
                        com.cyc.cycjava.cycl.lexification_wizard.remove_genstring_assertions(cyc_term, pred, UNPROVIDED);
                        lexification_utilities.try_lex_assert(list(pred, cyc_term, list($$ist, mt, formula)), mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_formula(v_object)) {
                    {
                        SubLObject parse_template_mt = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_mt(v_object));
                        lexification_utilities.try_lex_assert(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_formula(v_object), parse_template_mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.lexification_wizard.lexwiz_user_action(v_object)) {
                    lexification_reminders.remove_lexification_user_action(v_object, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_user_action(v_object));
                }
                com.cyc.cycjava.cycl.lexification_wizard.remove_stub_lexifications(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_phrase(v_object), UNPROVIDED);
            }
            return ok;
        }
    }

    @LispMethod(comment = "Perform the lexification for lexification-parameters OBJECT. In addition, if there\r\nare any termString-type lexifications matching the term and phrase, these are unasserted.\r\n\r\n@unknown For relational lexifications, a nameString assertion will be made along with the genFormat (or genTemplate)\r\n@unknown genStringAssertion\'s will also be added if object:lexwiz-is-preferred? is set (genStringAssertion-Precise is used when the value is :precise)\r\n@return boolean ; T iff the assertion was made successfully\nPerform the lexification for lexification-parameters OBJECT. In addition, if there\nare any termString-type lexifications matching the term and phrase, these are unasserted.")
    public static SubLObject perform_lexification(final SubLObject v_object) {
        lexification_wizard.trace_lexification_parameters(v_object, UNPROVIDED);
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object));
        final SubLObject mt = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_mt(v_object));
        final SubLObject formula = lexification_wizard.lexwiz_formula(v_object);
        final SubLObject is_relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == lexification_wizard.lexwiz_nonrelationalP(v_object)));
        SubLObject ok = (NIL != formula) ? lexification_utilities.try_lex_assert_now(formula, mt, UNPROVIDED, UNPROVIDED) : NIL;
        if (NIL == ok) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, format(NIL, lexification_wizard.$str152$Unable_to_make_main_lexical_asser, formula));
            return NIL;
        }
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(formula, mt);
        SubLObject cdolist_list_var = lexification_wizard.lexwiz_other_formulas(v_object);
        SubLObject formula_$5 = NIL;
        formula_$5 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ok = lexification_utilities.try_lex_assert_now(formula_$5, mt, UNPROVIDED, UNPROVIDED);
            if (NIL == ok) {
                lexification_wizard._csetf_lexwiz_error_message(v_object, format(NIL, lexification_wizard.$str153$Unable_to_make_other_lexical_asse, formula_$5));
                return NIL;
            }
            cb_tools.cb_add_sentence_in_mt_to_assertion_history(formula_$5, mt);
            cdolist_list_var = cdolist_list_var.rest();
            formula_$5 = cdolist_list_var.first();
        } 
        if ((NIL != lexification_wizard.lexwiz_is_preferredP(v_object)) && (NIL == is_relationalP)) {
            final SubLObject is_preciseP = eq(lexification_wizard.lexwiz_is_preferredP(v_object), $PRECISE);
            final SubLObject pred = (NIL != is_preciseP) ? lexification_wizard.$$genStringAssertion_Precise : lexification_wizard.$$genStringAssertion;
            lexification_wizard.remove_genstring_assertions(cyc_term, pred, UNPROVIDED);
            lexification_utilities.try_lex_assert(list(pred, cycl_utilities.hl_to_el(cyc_term), list(lexification_wizard.$$ist, mt, formula)), mt, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != lexification_wizard.lexwiz_parse_template_formula(v_object)) {
            final SubLObject parse_template_mt = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_parse_template_mt(v_object));
            lexification_utilities.try_lex_assert(lexification_wizard.lexwiz_parse_template_formula(v_object), parse_template_mt, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != lexification_wizard.lexwiz_user_action(v_object)) {
            lexification_reminders.remove_lexification_user_action(v_object, lexification_wizard.lexwiz_user_action(v_object));
        }
        lexification_wizard.remove_stub_lexifications(lexification_wizard.lexwiz_term(v_object), lexification_wizard.lexwiz_phrase(v_object), UNPROVIDED);
        return ok;
    }

    /**
     * unasserts any loose lexification assertions (e.g., termStrings) mapping
     * PHRASE to TERM
     */
    @LispMethod(comment = "unasserts any loose lexification assertions (e.g., termStrings) mapping\r\nPHRASE to TERM\nunasserts any loose lexification assertions (e.g., termStrings) mapping\nPHRASE to TERM")
    public static final SubLObject remove_stub_lexifications_alt(SubLObject v_term, SubLObject phrase, SubLObject nowP) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        {
            SubLObject cdolist_list_var = lexicon_utilities.stub_lexifications_for_term(fort_for_string(v_term));
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != assertions_high.gaf_assertionP(assertion)) {
                    {
                        SubLObject unassert_function = (NIL != nowP) ? ((SubLObject) (KE_UNASSERT_ASSERTION_NOW)) : KE_UNASSERT_ASSERTION;
                        funcall(unassert_function, assertion);
                    }
                }
            }
        }
        return T;
    }

    @LispMethod(comment = "unasserts any loose lexification assertions (e.g., termStrings) mapping\r\nPHRASE to TERM\nunasserts any loose lexification assertions (e.g., termStrings) mapping\nPHRASE to TERM")
    public static SubLObject remove_stub_lexifications(final SubLObject v_term, SubLObject phrase, SubLObject nowP) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        SubLObject cdolist_list_var = lexicon_utilities.stub_lexifications_for_term(misc_kb_utilities.fort_for_string(v_term));
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                final SubLObject unassert_function = (NIL != nowP) ? lexification_wizard.KE_UNASSERT_ASSERTION_NOW : lexification_wizard.KE_UNASSERT_ASSERTION;
                funcall(unassert_function, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * Unasserts any genString assertions associated with FORT
     */
    @LispMethod(comment = "Unasserts any genString assertions associated with FORT")
    public static final SubLObject remove_genstring_assertions_alt(SubLObject fort, SubLObject pred, SubLObject nowP) {
        if (pred == UNPROVIDED) {
            pred = $$genStringAssertion;
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = pred;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    {
                                                        SubLObject done_var_6 = NIL;
                                                        SubLObject token_var_7 = NIL;
                                                        while (NIL == done_var_6) {
                                                            {
                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                SubLObject valid_8 = makeBoolean(token_var_7 != assertion);
                                                                if (NIL != valid_8) {
                                                                    {
                                                                        SubLObject unassert_function = (NIL != nowP) ? ((SubLObject) (KE_UNASSERT_ASSERTION_NOW)) : KE_UNASSERT_ASSERTION;
                                                                        funcall(unassert_function, assertion);
                                                                    }
                                                                }
                                                                done_var_6 = makeBoolean(NIL == valid_8);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    @LispMethod(comment = "Unasserts any genString assertions associated with FORT")
    public static SubLObject remove_genstring_assertions(final SubLObject fort, SubLObject pred, SubLObject nowP) {
        if (pred == UNPROVIDED) {
            pred = lexification_wizard.$$genStringAssertion;
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexification_wizard.$$EverythingPSC, thread);
            final SubLObject pred_var = pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$6 = NIL;
                            final SubLObject token_var_$7 = NIL;
                            while (NIL == done_var_$6) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion));
                                if (NIL != valid_$8) {
                                    final SubLObject unassert_function = (NIL != nowP) ? lexification_wizard.KE_UNASSERT_ASSERTION_NOW : lexification_wizard.KE_UNASSERT_ASSERTION;
                                    funcall(unassert_function, assertion);
                                }
                                done_var_$6 = makeBoolean(NIL == valid_$8);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    /**
     * Derive the CycL formula(s) for lexification specified by the parameters in OBJECT
     */
    @LispMethod(comment = "Derive the CycL formula(s) for lexification specified by the parameters in OBJECT")
    public static final SubLObject derive_lexification_formula_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyc_term = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object));
                SubLObject is_relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == com.cyc.cycjava.cycl.lexification_wizard.lexwiz_nonrelationalP(v_object)));
                SubLObject cyc_mt = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_mt(v_object));
                if (NIL == cyc_mt) {
                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_mt(v_object, NIL != is_relationalP ? ((SubLObject) (lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread))) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread));
                    cyc_mt = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_mt(v_object));
                }
                if (NIL != com.cyc.cycjava.cycl.lexification_wizard.lexwiz_is_properP(v_object)) {
                    com.cyc.cycjava.cycl.lexification_wizard.derive_proper_name_formula(v_object);
                } else {
                    if (NIL != is_relationalP) {
                        com.cyc.cycjava.cycl.lexification_wizard.derive_relation_formula(v_object);
                    } else {
                        com.cyc.cycjava.cycl.lexification_wizard.derive_denotation_formula(v_object);
                    }
                }
                if (!((NIL == com.cyc.cycjava.cycl.lexification_wizard.lexwiz_formula(v_object)) || ((NIL != $sme_lexwiz_active$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.lexification_wizard.lexwiz_error_message(v_object))))) {
                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_error_message(v_object, lexification_utilities.invalid_lexificationP(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_formula(v_object), cyc_mt));
                }
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Derive the CycL formula(s) for lexification specified by the parameters in OBJECT")
    public static SubLObject derive_lexification_formula(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object));
        final SubLObject is_relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == lexification_wizard.lexwiz_nonrelationalP(v_object)));
        SubLObject cyc_mt = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_mt(v_object));
        if (NIL == cyc_mt) {
            lexification_wizard._csetf_lexwiz_mt(v_object, NIL != is_relationalP ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread));
            cyc_mt = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_mt(v_object));
        }
        if (NIL != lexification_wizard.lexwiz_is_properP(v_object)) {
            lexification_wizard.derive_proper_name_formula(v_object);
        } else
            if (NIL != is_relationalP) {
                lexification_wizard.derive_relation_formula(v_object);
            } else {
                lexification_wizard.derive_denotation_formula(v_object);
            }

        if ((NIL != lexification_wizard.lexwiz_formula(v_object)) && ((NIL == lexification_wizard.$sme_lexwiz_active$.getDynamicValue(thread)) || (NIL == lexification_wizard.lexwiz_error_message(v_object)))) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, lexification_utilities.invalid_lexificationP(lexification_wizard.lexwiz_formula(v_object), cyc_mt));
        }
        return NIL;
    }

    /**
     * Derive the CycL formula for proper name lexification given lexwiz params OBJECT
     */
    @LispMethod(comment = "Derive the CycL formula for proper name lexification given lexwiz params OBJECT")
    public static final SubLObject derive_proper_name_formula_alt(SubLObject v_object) {
        {
            SubLObject cyc_term = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object));
            SubLObject lex_phrase = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_phrase(v_object);
            SubLObject cyc_predicate = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_proper_name_pred(v_object));
            if (NIL == cyc_predicate) {
                cyc_predicate = fort_for_string($default_proper_name_pred$.getGlobalValue());
            }
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_formula(v_object, list(cyc_predicate, cyc_term, lex_phrase));
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_error_message(v_object, NIL);
            return NIL;
        }
    }

    @LispMethod(comment = "Derive the CycL formula for proper name lexification given lexwiz params OBJECT")
    public static SubLObject derive_proper_name_formula(final SubLObject v_object) {
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object));
        final SubLObject lex_phrase = lexification_wizard.lexwiz_phrase(v_object);
        SubLObject cyc_predicate = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_proper_name_pred(v_object));
        if (NIL == cyc_predicate) {
            cyc_predicate = misc_kb_utilities.fort_for_string(lexification_wizard.$default_proper_name_pred$.getGlobalValue());
        }
        lexification_wizard._csetf_lexwiz_formula(v_object, list(cyc_predicate, cycl_utilities.hl_to_el(cyc_term), lex_phrase));
        lexification_wizard._csetf_lexwiz_error_message(v_object, NIL);
        return NIL;
    }

    /**
     * Derives the Cycl formula for the denotation lexification given the parameters in OBJECT
     */
    @LispMethod(comment = "Derives the Cycl formula for the denotation lexification given the parameters in OBJECT")
    public static final SubLObject derive_denotation_formula_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyc_term = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object));
                thread.resetMultipleValues();
                {
                    SubLObject formula = com.cyc.cycjava.cycl.lexification_wizard.determine_lexical_formula(cyc_term, com.cyc.cycjava.cycl.lexification_wizard.lexwiz_phrase(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_headword_position(v_object), com.cyc.cycjava.cycl.lexification_wizard.lexwiz_headword_part_of_speech(v_object), com.cyc.cycjava.cycl.lexification_wizard.determine_lexical_mapping_mt(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_mt(v_object), UNPROVIDED));
                    SubLObject status_message = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_formula(v_object, formula);
                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_error_message(v_object, status_message);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Derives the Cycl formula for the denotation lexification given the parameters in OBJECT")
    public static SubLObject derive_denotation_formula(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object));
        thread.resetMultipleValues();
        final SubLObject formula = lexification_wizard.determine_lexical_formula(cyc_term, lexification_wizard.lexwiz_phrase(v_object), lexification_wizard.lexwiz_headword_position(v_object), lexification_wizard.lexwiz_headword_part_of_speech(v_object), lexification_wizard.determine_lexical_mapping_mt(lexification_wizard.lexwiz_mt(v_object), UNPROVIDED));
        final SubLObject status_message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        lexification_wizard._csetf_lexwiz_formula(v_object, formula);
        lexification_wizard._csetf_lexwiz_error_message(v_object, status_message);
        return NIL;
    }

    /**
     * Derive the CycL formula for relation lexification given lexwiz params OBJECT
     *
     * @unknown The template field either specifies the string for the old genFormat assertion or
    the entire formula for the new genTemplate assertion (from relation lexifier)
     */
    @LispMethod(comment = "Derive the CycL formula for relation lexification given lexwiz params OBJECT\r\n\r\n@unknown The template field either specifies the string for the old genFormat assertion or\r\nthe entire formula for the new genTemplate assertion (from relation lexifier)")
    public static final SubLObject derive_relation_formula_alt(SubLObject v_object) {
        {
            SubLObject cyc_term = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_term(v_object));
            SubLObject lex_template = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_template(v_object);
            SubLObject args = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_template_args(v_object);
            SubLObject cyc_args = (NIL != args) ? ((SubLObject) (com.cyc.cycjava.cycl.lexification_wizard.lispify_template_args(args))) : NIL;
            if (lex_template.isString()) {
                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_formula(v_object, list($$genFormat, cyc_term, lex_template, cyc_args));
            } else {
                if (NIL != el_formula_p(lex_template)) {
                    com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_formula(v_object, lex_template);
                }
            }
            com.cyc.cycjava.cycl.lexification_wizard.derive_parse_template_formula(v_object);
            return NIL;
        }
    }

    @LispMethod(comment = "Derive the CycL formula for relation lexification given lexwiz params OBJECT\r\n\r\n@unknown The template field either specifies the string for the old genFormat assertion or\r\nthe entire formula for the new genTemplate assertion (from relation lexifier)")
    public static SubLObject derive_relation_formula(final SubLObject v_object) {
        final SubLObject lex_template = lexification_wizard.lexwiz_template(v_object);
        if (NIL != el_formula_p(lex_template)) {
            lexification_wizard._csetf_lexwiz_formula(v_object, lex_template);
        }
        return NIL;
    }

    /**
     * Derive the CycL formula for the relation parse template given lexwiz params OBJECT
     */
    @LispMethod(comment = "Derive the CycL formula for the relation parse template given lexwiz params OBJECT")
    public static final SubLObject derive_parse_template_formula_alt(SubLObject v_object) {
        {
            SubLObject lex_parse_template = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template(v_object);
            SubLObject formula = com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_formula(v_object);
            SubLObject parse_template_mt = fort_for_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_mt(v_object));
            if (NIL != string_utilities.non_empty_stringP(lex_parse_template)) {
                formula = read_from_string_ignoring_errors(string_utilities.cyclify_string(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template(v_object)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template_formula(v_object, formula);
            }
            if (NIL != formula) {
                com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_error_message(v_object, lexification_utilities.invalid_lexificationP(com.cyc.cycjava.cycl.lexification_wizard.lexwiz_parse_template_formula(v_object), parse_template_mt));
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Derive the CycL formula for the relation parse template given lexwiz params OBJECT")
    public static SubLObject derive_parse_template_formula(final SubLObject v_object) {
        final SubLObject lex_parse_template = lexification_wizard.lexwiz_parse_template(v_object);
        SubLObject formula = lexification_wizard.lexwiz_parse_template_formula(v_object);
        final SubLObject parse_template_mt = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_parse_template_mt(v_object));
        if (NIL != string_utilities.non_empty_stringP(lex_parse_template)) {
            formula = read_from_string_ignoring_errors(string_utilities.cyclify_string(lexification_wizard.lexwiz_parse_template(v_object)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            lexification_wizard._csetf_lexwiz_parse_template_formula(v_object, formula);
        }
        if (NIL != formula) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, lexification_utilities.invalid_lexificationP(lexification_wizard.lexwiz_parse_template_formula(v_object), parse_template_mt));
        }
        return NIL;
    }

    /**
     * Clear the values of all the lexification parameters for OBJECT
     */
    @LispMethod(comment = "Clear the values of all the lexification parameters for OBJECT")
    public static final SubLObject reset_lexification_parameters_alt(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = $lexwiz_defaults$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.lexification_wizard.copy_over_lexification_parameters(v_object, com.cyc.cycjava.cycl.lexification_wizard.make_lexification_parameters(UNPROVIDED));
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_proper_name_pred(v_object, $default_proper_name_pred$.getGlobalValue());
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_state(v_object, $FRESH);
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_lexical_mt(v_object, fort_for_string(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread)));
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_syntactic_mt(v_object, fort_for_string(lexicon_vars.$default_syntactic_mt$.getDynamicValue(thread)));
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_generation_mt(v_object, fort_for_string(lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread)));
            com.cyc.cycjava.cycl.lexification_wizard._csetf_lexwiz_parse_template_mt(v_object, fort_for_string(lexicon_vars.$default_lexification_template_mt$.getDynamicValue(thread)));
            return T;
        }
    }

    @LispMethod(comment = "Clear the values of all the lexification parameters for OBJECT")
    public static SubLObject reset_lexification_parameters(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = lexification_wizard.$lexwiz_defaults$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexification_wizard.copy_over_lexification_parameters(v_object, lexification_wizard.make_lexification_parameters(UNPROVIDED));
        lexification_wizard._csetf_lexwiz_proper_name_pred(v_object, lexification_wizard.$default_proper_name_pred$.getGlobalValue());
        lexification_wizard._csetf_lexwiz_state(v_object, $FRESH);
        lexification_wizard._csetf_lexwiz_lexical_mt(v_object, misc_kb_utilities.fort_for_string(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread)));
        lexification_wizard._csetf_lexwiz_syntactic_mt(v_object, misc_kb_utilities.fort_for_string(lexicon_vars.$default_syntactic_mt$.getDynamicValue(thread)));
        lexification_wizard._csetf_lexwiz_generation_mt(v_object, misc_kb_utilities.fort_for_string(lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread)));
        lexification_wizard._csetf_lexwiz_parse_template_mt(v_object, misc_kb_utilities.fort_for_string(lexicon_vars.$default_lexification_template_mt$.getDynamicValue(thread)));
        return T;
    }

    /**
     * Displays the settings of all the lexification parameters (using *trace-output*)
     *
     * @unknown Under Allegro the object is also describe'd when the trace level is very high
     */
    @LispMethod(comment = "Displays the settings of all the lexification parameters (using *trace-output*)\r\n\r\n@unknown Under Allegro the object is also describe\'d when the trace level is very high")
    public static final SubLObject trace_lexification_parameters_alt(SubLObject v_object, SubLObject debug_level) {
        if (v_object == UNPROVIDED) {
            v_object = $lexwiz_defaults$.getDynamicValue();
        }
        if (debug_level == UNPROVIDED) {
            debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(debug_level)) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt134$Lexification_parameters____S__, com.cyc.cycjava.cycl.lexification_wizard.list_lexification_parameters(v_object, T, UNPROVIDED));
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            return T;
        }
    }

    @LispMethod(comment = "Displays the settings of all the lexification parameters (using *trace-output*)\r\n\r\n@unknown Under Allegro the object is also describe\'d when the trace level is very high")
    public static SubLObject trace_lexification_parameters(SubLObject v_object, SubLObject debug_level) {
        if (v_object == UNPROVIDED) {
            v_object = lexification_wizard.$lexwiz_defaults$.getDynamicValue();
        }
        if (debug_level == UNPROVIDED) {
            debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unhandled = NIL;
        if ((NIL != unhandled) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(debug_level)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), lexification_wizard.$str165$Lexification_parameters____S__, lexification_wizard.list_lexification_parameters(v_object, T, UNPROVIDED));
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     *
     *
     * @return list ; names for the proper-name predicates that apply to term (a string)
     */
    @LispMethod(comment = "@return list ; names for the proper-name predicates that apply to term (a string)")
    public static final SubLObject filter_proper_name_predicates_alt(SubLObject lex_term) {
        {
            SubLObject cyc_term = fort_for_string(lex_term);
            SubLObject term_isas = isa.all_isa_in_any_mt(cyc_term);
            SubLObject pred_names = NIL;
            SubLObject list_var = NIL;
            SubLObject constraint = NIL;
            SubLObject i = NIL;
            for (list_var = $lexification_proper_name_predicate_constraints$.getGlobalValue(), constraint = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , constraint = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (((NIL == cyc_term) || (constraint == $$CycLReifiableDenotationalTerm)) || (NIL != member(constraint, term_isas, UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject item_var = elt($lexification_proper_name_predicate_names$.getGlobalValue(), i);
                        if (NIL == member(item_var, pred_names, symbol_function(EQL), symbol_function(IDENTITY))) {
                            pred_names = cons(item_var, pred_names);
                        }
                    }
                }
            }
            return reverse(pred_names);
        }
    }

    /**
     *
     *
     * @return list ; names for the proper-name predicates that apply to term (a string)
     */
    @LispMethod(comment = "@return list ; names for the proper-name predicates that apply to term (a string)")
    public static SubLObject filter_proper_name_predicates(final SubLObject lex_term) {
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject term_isas = isa.all_isa_in_any_mt(cyc_term);
        SubLObject pred_names = NIL;
        SubLObject list_var = NIL;
        SubLObject constraint = NIL;
        SubLObject i = NIL;
        list_var = lexification_wizard.$lexification_proper_name_predicate_constraints$.getGlobalValue();
        constraint = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , constraint = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (((NIL == cyc_term) || constraint.eql(lexification_wizard.$$CycLReifiableDenotationalTerm)) || (NIL != member(constraint, term_isas, UNPROVIDED, UNPROVIDED))) {
                final SubLObject item_var = elt(lexification_wizard.$lexification_proper_name_predicate_names$.getGlobalValue(), i);
                if (NIL == member(item_var, pred_names, symbol_function(EQL), symbol_function(IDENTITY))) {
                    pred_names = cons(item_var, pred_names);
                }
            }
        }
        return reverse(pred_names);
    }

    /**
     * Initialize the data structures used by lexification wizard (e.g., table mapping ID's into lexification-parameter structures)
     *
     * @unknown *lexification-proper-name-predicate-names* is set to the string labels for the proper name predicates that are not filtered out (i.e., not keIrrelevantTerm). *lexification-proper-name-predicate-constraints* is the corresponding arg1 constraint (most specific).
     * @unknown Lists of cyc terms such as *main-lexification-parts-of-speech* and *lexification-mts* are stored as strings rather than forts.
     */
    @LispMethod(comment = "Initialize the data structures used by lexification wizard (e.g., table mapping ID\'s into lexification-parameter structures)\r\n\r\n@unknown *lexification-proper-name-predicate-names* is set to the string labels for the proper name predicates that are not filtered out (i.e., not keIrrelevantTerm). *lexification-proper-name-predicate-constraints* is the corresponding arg1 constraint (most specific).\r\n@unknown Lists of cyc terms such as *main-lexification-parts-of-speech* and *lexification-mts* are stored as strings rather than forts.")
    public static final SubLObject init_lexification_wizard_alt(SubLObject force) {
        if (force == UNPROVIDED) {
            force = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $lexification_wizard_initialized$.getDynamicValue(thread)) && (NIL == force)) {
                return T;
            }
            $lexwiz_defaults$.setDynamicValue(com.cyc.cycjava.cycl.lexification_wizard.make_lexification_parameters(UNPROVIDED), thread);
            com.cyc.cycjava.cycl.lexification_wizard.reset_lexification_parameters(UNPROVIDED);
            $lexification_object_table$.setGlobalValue(make_hash_table($int$25, symbol_function(EQUAL), UNPROVIDED));
            $main_lexification_parts_of_speech$.setGlobalValue(Mapping.mapcar(symbol_function(FORT_FOR_STRING), $list_alt137));
            {
                SubLObject proper_name_preds = remove_duplicates(append(genl_predicates.all_spec_preds($$properNameStrings, UNPROVIDED, UNPROVIDED), isa.all_fort_instances($$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject filtered_preds = proper_name_preds;
                SubLObject sorted_preds = lexification_utilities.sort_by_pred_usage(filtered_preds);
                SubLObject desired_preds = list_utilities.ordered_set_difference(sorted_preds, $list_alt140, UNPROVIDED, UNPROVIDED);
                $lexification_proper_name_predicate_names$.setGlobalValue(Mapping.mapcar(symbol_function(STRING_FOR_FORT), desired_preds));
                $lexification_proper_name_predicate_constraints$.setGlobalValue(Mapping.mapcar(symbol_function(MOST_SPECIFIC_ARG1_CONSTRAINT), desired_preds));
            }
            {
                SubLObject parts_of_speech = NIL;
                SubLObject cdolist_list_var = $lexification_part_of_speech_keywords$.getGlobalValue();
                SubLObject keyword = NIL;
                for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_10 = lexification_utilities.lex_pos_for_keyword(keyword);
                        SubLObject pos = NIL;
                        for (pos = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , pos = cdolist_list_var_10.first()) {
                            {
                                SubLObject item_var = pos;
                                if (NIL == member(item_var, parts_of_speech, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    parts_of_speech = cons(item_var, parts_of_speech);
                                }
                            }
                        }
                    }
                }
                parts_of_speech = Sort.sort(parts_of_speech, symbol_function($sym143$STRING_), symbol_function(STRING_FOR_FORT));
                $all_lexification_parts_of_speech_labels$.setGlobalValue(Mapping.mapcar(symbol_function(STRING_FOR_FORT), parts_of_speech));
            }
            {
                SubLObject lexical_mts = Mapping.mapcar(symbol_function(STRING_FOR_FORT), com.cyc.cycjava.cycl.lexification_wizard.get_all_lexwiz_lexical_mts());
                $lexification_mts$.setGlobalValue(cons($str_alt118$, Sort.sort(lexical_mts, symbol_function($sym143$STRING_), UNPROVIDED)));
            }
            {
                SubLObject template_mts = Mapping.mapcar(symbol_function(STRING_FOR_FORT), genl_mts.all_spec_mts($$TemplateParsingMt, UNPROVIDED, UNPROVIDED));
                $lexification_template_mts$.setGlobalValue(Sort.sort(template_mts, symbol_function($sym143$STRING_), UNPROVIDED));
            }
            $lexification_wizard_initialized$.setDynamicValue(T, thread);
            return T;
        }
    }

    @LispMethod(comment = "Initialize the data structures used by lexification wizard (e.g., table mapping ID\'s into lexification-parameter structures)\r\n\r\n@unknown *lexification-proper-name-predicate-names* is set to the string labels for the proper name predicates that are not filtered out (i.e., not keIrrelevantTerm). *lexification-proper-name-predicate-constraints* is the corresponding arg1 constraint (most specific).\r\n@unknown Lists of cyc terms such as *main-lexification-parts-of-speech* and *lexification-mts* are stored as strings rather than forts.")
    public static SubLObject init_lexification_wizard(SubLObject force) {
        if (force == UNPROVIDED) {
            force = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != lexification_wizard.$lexification_wizard_initialized$.getDynamicValue(thread)) && (NIL == force)) {
            return T;
        }
        if (NIL == lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)) {
            lexification_wizard.$lexwiz_defaults$.setDynamicValue(lexification_wizard.make_lexification_parameters(UNPROVIDED), thread);
        }
        lexification_wizard.reset_lexification_parameters(UNPROVIDED);
        lexification_wizard.$main_lexification_parts_of_speech$.setGlobalValue(Mapping.mapcar(symbol_function(lexification_wizard.FORT_FOR_STRING), lexification_wizard.$list168));
        final SubLObject filtered_preds;
        final SubLObject proper_name_preds = filtered_preds = remove_duplicates(append(genl_predicates.all_spec_preds(lexification_wizard.$$properNameStrings, UNPROVIDED, UNPROVIDED), isa.all_fort_instances(lexification_wizard.$$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sorted_preds = lexification_utilities.sort_by_pred_usage(filtered_preds);
        final SubLObject desired_preds = list_utilities.ordered_set_difference(sorted_preds, lexification_wizard.$list171, UNPROVIDED, UNPROVIDED);
        lexification_wizard.$lexification_proper_name_predicate_names$.setGlobalValue(Mapping.mapcar(symbol_function(lexification_wizard.STRING_FOR_FORT), desired_preds));
        lexification_wizard.$lexification_proper_name_predicate_constraints$.setGlobalValue(Mapping.mapcar(symbol_function(lexification_wizard.MOST_SPECIFIC_ARG1_CONSTRAINT), desired_preds));
        SubLObject parts_of_speech = NIL;
        SubLObject cdolist_list_var = lexification_wizard.$lexification_part_of_speech_keywords$.getGlobalValue();
        SubLObject keyword = NIL;
        keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = lexification_utilities.lex_pos_for_keyword(keyword);
            SubLObject pos = NIL;
            pos = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                final SubLObject item_var = pos;
                if (NIL == member(item_var, parts_of_speech, symbol_function(EQL), symbol_function(IDENTITY))) {
                    parts_of_speech = cons(item_var, parts_of_speech);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                pos = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        } 
        parts_of_speech = Sort.sort(parts_of_speech, symbol_function(lexification_wizard.$sym174$STRING_), symbol_function(lexification_wizard.STRING_FOR_FORT));
        lexification_wizard.$all_lexification_parts_of_speech_labels$.setGlobalValue(Mapping.mapcar(symbol_function(lexification_wizard.STRING_FOR_FORT), parts_of_speech));
        final SubLObject lexical_mts = Mapping.mapcar(symbol_function(lexification_wizard.STRING_FOR_FORT), lexification_wizard.get_all_lexwiz_lexical_mts());
        lexification_wizard.$lexification_mts$.setGlobalValue(cons(lexification_wizard.$str144$, Sort.sort(lexical_mts, symbol_function(lexification_wizard.$sym174$STRING_), UNPROVIDED)));
        final SubLObject template_mts = Mapping.mapcar(symbol_function(lexification_wizard.STRING_FOR_FORT), genl_mts.all_spec_mts(lexification_wizard.$$TemplateParsingMt, UNPROVIDED, UNPROVIDED));
        lexification_wizard.$lexification_template_mts$.setGlobalValue(Sort.sort(template_mts, symbol_function(lexification_wizard.$sym174$STRING_), UNPROVIDED));
        lexification_wizard.$lexification_wizard_initialized$.setDynamicValue(T, thread);
        return T;
    }

    public static final SubLObject get_all_lexwiz_lexical_mts_alt() {
        return set_difference(isa.all_fort_instances($$LexicalMicrotheory, $$InferencePSC, UNPROVIDED), isa.all_fort_instances($$LexicalMicrotheory_NonLexWiz, $$InferencePSC, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_all_lexwiz_lexical_mts() {
        return set_difference(isa.all_fort_instances(lexification_wizard.$$LexicalMicrotheory, lexification_wizard.$$InferencePSC, UNPROVIDED), isa.all_fort_instances(lexification_wizard.$$LexicalMicrotheory_NonLexWiz, lexification_wizard.$$InferencePSC, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean ; whether TERM is irrelevant for lexification purpose
     * @unknown This is usually used for determining predicates to be skipped
     */
    @LispMethod(comment = "@return boolean ; whether TERM is irrelevant for lexification purpose\r\n@unknown This is usually used for determining predicates to be skipped")
    public static final SubLObject irrelevant_lexification_term_alt(SubLObject v_term, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return rkf_relevance_utilities.rkf_irrelevant_term(v_term, lexical_mt);
    }

    /**
     *
     *
     * @return boolean ; whether TERM is irrelevant for lexification purpose
     * @unknown This is usually used for determining predicates to be skipped
     */
    @LispMethod(comment = "@return boolean ; whether TERM is irrelevant for lexification purpose\r\n@unknown This is usually used for determining predicates to be skipped")
    public static SubLObject irrelevant_lexification_term(final SubLObject v_term, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return rkf_relevance_utilities.rkf_irrelevant_term(v_term, lexical_mt);
    }

    /**
     *
     *
     * @return MT : microtheory to use for syntactic mappings, given that lexifications are being placed in LEXIFICATION-MT
    The main purpose is to ensure that the SME's can make mappings regardless of whether there are other lexifications in the system
     * @unknown This function should be used whenever determining the optional lookup-mt parameter for @xref words-of-strings and related functions
     */
    @LispMethod(comment = "@return MT : microtheory to use for syntactic mappings, given that lexifications are being placed in LEXIFICATION-MT\r\nThe main purpose is to ensure that the SME\'s can make mappings regardless of whether there are other lexifications in the system\r\n@unknown This function should be used whenever determining the optional lookup-mt parameter for @xref words-of-strings and related functions")
    public static final SubLObject determine_lexical_mapping_mt_alt(SubLObject lexification_mt, SubLObject default_mt) {
        if (default_mt == UNPROVIDED) {
            default_mt = lexicon_vars.$default_lexification_mt$.getDynamicValue();
        }
        {
            SubLObject mt = fort_for_string(default_mt);
            if (NIL != $isolate_syntactic_mappingsP$.getGlobalValue()) {
                mt = fort_for_string(lexification_mt);
            }
            return mt;
        }
    }

    /**
     *
     *
     * @return MT : microtheory to use for syntactic mappings, given that lexifications are being placed in LEXIFICATION-MT
    The main purpose is to ensure that the SME's can make mappings regardless of whether there are other lexifications in the system
     * @unknown This function should be used whenever determining the optional lookup-mt parameter for @xref words-of-strings and related functions
     */
    @LispMethod(comment = "@return MT : microtheory to use for syntactic mappings, given that lexifications are being placed in LEXIFICATION-MT\r\nThe main purpose is to ensure that the SME\'s can make mappings regardless of whether there are other lexifications in the system\r\n@unknown This function should be used whenever determining the optional lookup-mt parameter for @xref words-of-strings and related functions")
    public static SubLObject determine_lexical_mapping_mt(final SubLObject lexification_mt, SubLObject default_mt) {
        if (default_mt == UNPROVIDED) {
            default_mt = lexicon_vars.$default_lexification_mt$.getDynamicValue();
        }
        SubLObject mt = misc_kb_utilities.fort_for_string(default_mt);
        if (NIL != lexification_wizard.$isolate_syntactic_mappingsP$.getGlobalValue()) {
            mt = misc_kb_utilities.fort_for_string(lexification_mt);
        }
        return mt;
    }

    public static SubLObject declare_lexification_wizard_file() {
        declareFunction("lexification_parameters_print_function_trampoline", "LEXIFICATION-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("lexification_parameters_p", "LEXIFICATION-PARAMETERS-P", 1, 0, false);
        new lexification_wizard.$lexification_parameters_p$UnaryFunction();
        declareFunction("lexwiz_id", "LEXWIZ-ID", 1, 0, false);
        declareFunction("lexwiz_term", "LEXWIZ-TERM", 1, 0, false);
        declareFunction("lexwiz_phrase", "LEXWIZ-PHRASE", 1, 0, false);
        declareFunction("lexwiz_mt", "LEXWIZ-MT", 1, 0, false);
        declareFunction("lexwiz_is_preferredP", "LEXWIZ-IS-PREFERRED?", 1, 0, false);
        declareFunction("lexwiz_is_properP", "LEXWIZ-IS-PROPER?", 1, 0, false);
        declareFunction("lexwiz_nonrelationalP", "LEXWIZ-NONRELATIONAL?", 1, 0, false);
        declareFunction("lexwiz_proper_name_pred", "LEXWIZ-PROPER-NAME-PRED", 1, 0, false);
        declareFunction("lexwiz_template", "LEXWIZ-TEMPLATE", 1, 0, false);
        declareFunction("lexwiz_template_args", "LEXWIZ-TEMPLATE-ARGS", 1, 0, false);
        declareFunction("lexwiz_template_speech_parts", "LEXWIZ-TEMPLATE-SPEECH-PARTS", 1, 0, false);
        declareFunction("lexwiz_ignore_arityP", "LEXWIZ-IGNORE-ARITY?", 1, 0, false);
        declareFunction("lexwiz_headword_position", "LEXWIZ-HEADWORD-POSITION", 1, 0, false);
        declareFunction("lexwiz_headword_part_of_speech", "LEXWIZ-HEADWORD-PART-OF-SPEECH", 1, 0, false);
        declareFunction("lexwiz_error_message", "LEXWIZ-ERROR-MESSAGE", 1, 0, false);
        declareFunction("lexwiz_state", "LEXWIZ-STATE", 1, 0, false);
        declareFunction("lexwiz_readyP", "LEXWIZ-READY?", 1, 0, false);
        declareFunction("lexwiz_formula", "LEXWIZ-FORMULA", 1, 0, false);
        declareFunction("lexwiz_user_editedP", "LEXWIZ-USER-EDITED?", 1, 0, false);
        declareFunction("lexwiz_user_formula", "LEXWIZ-USER-FORMULA", 1, 0, false);
        declareFunction("lexwiz_other_formulas", "LEXWIZ-OTHER-FORMULAS", 1, 0, false);
        declareFunction("lexwiz_user_action", "LEXWIZ-USER-ACTION", 1, 0, false);
        declareFunction("lexwiz_parse_template_mt", "LEXWIZ-PARSE-TEMPLATE-MT", 1, 0, false);
        declareFunction("lexwiz_parse_template", "LEXWIZ-PARSE-TEMPLATE", 1, 0, false);
        declareFunction("lexwiz_parse_template_formula", "LEXWIZ-PARSE-TEMPLATE-FORMULA", 1, 0, false);
        declareFunction("lexwiz_lexical_mt", "LEXWIZ-LEXICAL-MT", 1, 0, false);
        declareFunction("lexwiz_syntactic_mt", "LEXWIZ-SYNTACTIC-MT", 1, 0, false);
        declareFunction("lexwiz_generation_mt", "LEXWIZ-GENERATION-MT", 1, 0, false);
        declareFunction("_csetf_lexwiz_id", "_CSETF-LEXWIZ-ID", 2, 0, false);
        declareFunction("_csetf_lexwiz_term", "_CSETF-LEXWIZ-TERM", 2, 0, false);
        declareFunction("_csetf_lexwiz_phrase", "_CSETF-LEXWIZ-PHRASE", 2, 0, false);
        declareFunction("_csetf_lexwiz_mt", "_CSETF-LEXWIZ-MT", 2, 0, false);
        declareFunction("_csetf_lexwiz_is_preferredP", "_CSETF-LEXWIZ-IS-PREFERRED?", 2, 0, false);
        declareFunction("_csetf_lexwiz_is_properP", "_CSETF-LEXWIZ-IS-PROPER?", 2, 0, false);
        declareFunction("_csetf_lexwiz_nonrelationalP", "_CSETF-LEXWIZ-NONRELATIONAL?", 2, 0, false);
        declareFunction("_csetf_lexwiz_proper_name_pred", "_CSETF-LEXWIZ-PROPER-NAME-PRED", 2, 0, false);
        declareFunction("_csetf_lexwiz_template", "_CSETF-LEXWIZ-TEMPLATE", 2, 0, false);
        declareFunction("_csetf_lexwiz_template_args", "_CSETF-LEXWIZ-TEMPLATE-ARGS", 2, 0, false);
        declareFunction("_csetf_lexwiz_template_speech_parts", "_CSETF-LEXWIZ-TEMPLATE-SPEECH-PARTS", 2, 0, false);
        declareFunction("_csetf_lexwiz_ignore_arityP", "_CSETF-LEXWIZ-IGNORE-ARITY?", 2, 0, false);
        declareFunction("_csetf_lexwiz_headword_position", "_CSETF-LEXWIZ-HEADWORD-POSITION", 2, 0, false);
        declareFunction("_csetf_lexwiz_headword_part_of_speech", "_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH", 2, 0, false);
        declareFunction("_csetf_lexwiz_error_message", "_CSETF-LEXWIZ-ERROR-MESSAGE", 2, 0, false);
        declareFunction("_csetf_lexwiz_state", "_CSETF-LEXWIZ-STATE", 2, 0, false);
        declareFunction("_csetf_lexwiz_readyP", "_CSETF-LEXWIZ-READY?", 2, 0, false);
        declareFunction("_csetf_lexwiz_formula", "_CSETF-LEXWIZ-FORMULA", 2, 0, false);
        declareFunction("_csetf_lexwiz_user_editedP", "_CSETF-LEXWIZ-USER-EDITED?", 2, 0, false);
        declareFunction("_csetf_lexwiz_user_formula", "_CSETF-LEXWIZ-USER-FORMULA", 2, 0, false);
        declareFunction("_csetf_lexwiz_other_formulas", "_CSETF-LEXWIZ-OTHER-FORMULAS", 2, 0, false);
        declareFunction("_csetf_lexwiz_user_action", "_CSETF-LEXWIZ-USER-ACTION", 2, 0, false);
        declareFunction("_csetf_lexwiz_parse_template_mt", "_CSETF-LEXWIZ-PARSE-TEMPLATE-MT", 2, 0, false);
        declareFunction("_csetf_lexwiz_parse_template", "_CSETF-LEXWIZ-PARSE-TEMPLATE", 2, 0, false);
        declareFunction("_csetf_lexwiz_parse_template_formula", "_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA", 2, 0, false);
        declareFunction("_csetf_lexwiz_lexical_mt", "_CSETF-LEXWIZ-LEXICAL-MT", 2, 0, false);
        declareFunction("_csetf_lexwiz_syntactic_mt", "_CSETF-LEXWIZ-SYNTACTIC-MT", 2, 0, false);
        declareFunction("_csetf_lexwiz_generation_mt", "_CSETF-LEXWIZ-GENERATION-MT", 2, 0, false);
        declareFunction("make_lexification_parameters", "MAKE-LEXIFICATION-PARAMETERS", 0, 1, false);
        declareFunction("visit_defstruct_lexification_parameters", "VISIT-DEFSTRUCT-LEXIFICATION-PARAMETERS", 2, 0, false);
        declareFunction("visit_defstruct_object_lexification_parameters_method", "VISIT-DEFSTRUCT-OBJECT-LEXIFICATION-PARAMETERS-METHOD", 2, 0, false);
        declareFunction("list_lexification_parameters", "LIST-LEXIFICATION-PARAMETERS", 0, 3, false);
        declareFunction("list_main_lexification_parameters", "LIST-MAIN-LEXIFICATION-PARAMETERS", 1, 0, false);
        declareFunction("copy_over_lexification_parameters", "COPY-OVER-LEXIFICATION-PARAMETERS", 2, 0, false);
        declareFunction("copy_lexification_parameters", "COPY-LEXIFICATION-PARAMETERS", 1, 0, false);
        declareFunction("new_lexification_id", "NEW-LEXIFICATION-ID", 0, 0, false);
        declareFunction("set_lexification_object", "SET-LEXIFICATION-OBJECT", 2, 0, false);
        declareFunction("get_lexification_object", "GET-LEXIFICATION-OBJECT", 1, 0, false);
        declareFunction("lexwiz_settings_changedP", "LEXWIZ-SETTINGS-CHANGED?", 2, 0, false);
        declareFunction("resolve_lexwiz_object_fort", "RESOLVE-LEXWIZ-OBJECT-FORT", 1, 0, false);
        declareFunction("lispify_template_args", "LISPIFY-TEMPLATE-ARGS", 1, 0, false);
        declareFunction("count_positional_args", "COUNT-POSITIONAL-ARGS", 1, 0, false);
        declareFunction("convert_position", "CONVERT-POSITION", 2, 0, false);
        declareFunction("determine_lexical_predicate", "DETERMINE-LEXICAL-PREDICATE", 2, 0, false);
        declareFunction("determine_lexical_formula", "DETERMINE-LEXICAL-FORMULA", 4, 1, false);
        declareFunction("add_lexical_mapping", "ADD-LEXICAL-MAPPING", 3, 1, false);
        declareFunction("remove_lexical_mapping", "REMOVE-LEXICAL-MAPPING", 3, 1, false);
        declareFunction("do_lexical_mapping_int", "DO-LEXICAL-MAPPING-INT", 5, 2, false);
        declareFunction("validate_lexification_parameters", "VALIDATE-LEXIFICATION-PARAMETERS", 4, 0, false);
        declareFunction("determine_lexification_word_unit", "DETERMINE-LEXIFICATION-WORD-UNIT", 2, 1, false);
        declareFunction("acceptable_lexification_word_unitP", "ACCEPTABLE-LEXIFICATION-WORD-UNIT?", 1, 0, false);
        declareFunction("perform_lexification", "PERFORM-LEXIFICATION", 1, 0, false);
        declareFunction("remove_stub_lexifications", "REMOVE-STUB-LEXIFICATIONS", 1, 2, false);
        declareFunction("remove_genstring_assertions", "REMOVE-GENSTRING-ASSERTIONS", 1, 2, false);
        declareFunction("derive_lexification_formula", "DERIVE-LEXIFICATION-FORMULA", 1, 0, false);
        declareFunction("derive_proper_name_formula", "DERIVE-PROPER-NAME-FORMULA", 1, 0, false);
        declareFunction("derive_denotation_formula", "DERIVE-DENOTATION-FORMULA", 1, 0, false);
        declareFunction("derive_relation_formula", "DERIVE-RELATION-FORMULA", 1, 0, false);
        declareFunction("derive_parse_template_formula", "DERIVE-PARSE-TEMPLATE-FORMULA", 1, 0, false);
        declareFunction("reset_lexification_parameters", "RESET-LEXIFICATION-PARAMETERS", 0, 1, false);
        declareFunction("trace_lexification_parameters", "TRACE-LEXIFICATION-PARAMETERS", 0, 2, false);
        declareFunction("filter_proper_name_predicates", "FILTER-PROPER-NAME-PREDICATES", 1, 0, false);
        declareFunction("init_lexification_wizard", "INIT-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("get_all_lexwiz_lexical_mts", "GET-ALL-LEXWIZ-LEXICAL-MTS", 0, 0, false);
        declareFunction("irrelevant_lexification_term", "IRRELEVANT-LEXIFICATION-TERM", 1, 1, false);
        declareFunction("determine_lexical_mapping_mt", "DETERMINE-LEXICAL-MAPPING-MT", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_lexification_wizard_file_alt() {
        defconstant("*DTP-LEXIFICATION-PARAMETERS*", LEXIFICATION_PARAMETERS);
        defparameter("*LEXWIZ-DEFAULTS*", NIL);
        deflexical("*LEXIFICATION-PART-OF-SPEECH-KEYWORDS*", $list_alt86);
        deflexical("*MAIN-LEXIFICATION-PARTS-OF-SPEECH*", NIL != boundp($main_lexification_parts_of_speech$) ? ((SubLObject) ($main_lexification_parts_of_speech$.getGlobalValue())) : NIL);
        deflexical("*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*", NIL != boundp($all_lexification_parts_of_speech_labels$) ? ((SubLObject) ($all_lexification_parts_of_speech_labels$.getGlobalValue())) : NIL);
        deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*", NIL != boundp($lexification_proper_name_predicate_names$) ? ((SubLObject) ($lexification_proper_name_predicate_names$.getGlobalValue())) : NIL);
        deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*", NIL != boundp($lexification_proper_name_predicate_constraints$) ? ((SubLObject) ($lexification_proper_name_predicate_constraints$.getGlobalValue())) : NIL);
        deflexical("*LEXIFICATION-MTS*", NIL != boundp($lexification_mts$) ? ((SubLObject) ($lexification_mts$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-PROPER-NAME-PRED*", $$$nameString);
        deflexical("*DEFAULT-DENOTATION-PREDICATE*", $$denotation);
        deflexical("*LEXIFICATION-OBJECT-TABLE*", NIL != boundp($lexification_object_table$) ? ((SubLObject) ($lexification_object_table$.getGlobalValue())) : NIL);
        defparameter("*LEXIFICATION-WIZARD-INITIALIZED*", NIL);
        defvar("*SME-LEXWIZ-ACTIVE*", NIL);
        deflexical("*LEXIFICATION-TEMPLATE-MTS*", NIL != boundp($lexification_template_mts$) ? ((SubLObject) ($lexification_template_mts$.getGlobalValue())) : NIL);
        deflexical("*ISOLATE-SYNTACTIC-MAPPINGS?*", T);
        deflexical("*LEXWIZ-SHOW-TERM-INFORMATION?*", T);
        return NIL;
    }

    public static SubLObject init_lexification_wizard_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-LEXIFICATION-PARAMETERS*", lexification_wizard.LEXIFICATION_PARAMETERS);
            defparameter("*LEXWIZ-DEFAULTS*", lexification_wizard.make_lexification_parameters(UNPROVIDED));
            deflexical("*LEXIFICATION-PART-OF-SPEECH-KEYWORDS*", lexification_wizard.$list108);
            deflexical("*MAIN-LEXIFICATION-PARTS-OF-SPEECH*", SubLTrampolineFile.maybeDefault(lexification_wizard.$main_lexification_parts_of_speech$, lexification_wizard.$main_lexification_parts_of_speech$, NIL));
            deflexical("*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$all_lexification_parts_of_speech_labels$, lexification_wizard.$all_lexification_parts_of_speech_labels$, NIL));
            deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_proper_name_predicate_names$, lexification_wizard.$lexification_proper_name_predicate_names$, NIL));
            deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_proper_name_predicate_constraints$, lexification_wizard.$lexification_proper_name_predicate_constraints$, NIL));
            deflexical("*LEXIFICATION-MTS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_mts$, lexification_wizard.$lexification_mts$, NIL));
            deflexical("*DEFAULT-PROPER-NAME-PRED*", lexification_wizard.$$$nameString);
            deflexical("*DEFAULT-DENOTATION-PREDICATE*", lexification_wizard.$$denotation);
            deflexical("*LEXIFICATION-OBJECT-TABLE*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_object_table$, lexification_wizard.$lexification_object_table$, () -> make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED)));
            defparameter("*LEXIFICATION-WIZARD-INITIALIZED*", NIL);
            defvar("*SME-LEXWIZ-ACTIVE*", NIL);
            defvar("*ALLOW-ADVANCED-LEXWIZ-FEATURES?*", NIL);
            deflexical("*LEXIFICATION-TEMPLATE-MTS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_template_mts$, lexification_wizard.$lexification_template_mts$, NIL));
            deflexical("*ISOLATE-SYNTACTIC-MAPPINGS?*", T);
            deflexical("*LEXWIZ-SHOW-TERM-INFORMATION?*", T);
            defconstant("*LEXWIZ-TEST*", lexification_wizard.$$$Lexification_Wizard_Test);
            defconstant("*LEXWIZ-TEST-CATEGORY*", cconcatenate(lexification_wizard.$lexwiz_test$.getGlobalValue(), lexification_wizard.$$$_Category));
            defconstant("*LEXWIZ-TEST-SUITE*", cconcatenate(lexification_wizard.$lexwiz_test$.getGlobalValue(), lexification_wizard.$$$_Suite));
            defconstant("*LEXWIZ-MODULE*", lexification_wizard.$str182$lexification_wizard);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*LEXWIZ-DEFAULTS*", NIL);
            deflexical("*LEXIFICATION-PART-OF-SPEECH-KEYWORDS*", $list_alt86);
            deflexical("*MAIN-LEXIFICATION-PARTS-OF-SPEECH*", NIL != boundp($main_lexification_parts_of_speech$) ? ((SubLObject) ($main_lexification_parts_of_speech$.getGlobalValue())) : NIL);
            deflexical("*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*", NIL != boundp($all_lexification_parts_of_speech_labels$) ? ((SubLObject) ($all_lexification_parts_of_speech_labels$.getGlobalValue())) : NIL);
            deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*", NIL != boundp($lexification_proper_name_predicate_names$) ? ((SubLObject) ($lexification_proper_name_predicate_names$.getGlobalValue())) : NIL);
            deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*", NIL != boundp($lexification_proper_name_predicate_constraints$) ? ((SubLObject) ($lexification_proper_name_predicate_constraints$.getGlobalValue())) : NIL);
            deflexical("*LEXIFICATION-MTS*", NIL != boundp($lexification_mts$) ? ((SubLObject) ($lexification_mts$.getGlobalValue())) : NIL);
            deflexical("*LEXIFICATION-OBJECT-TABLE*", NIL != boundp($lexification_object_table$) ? ((SubLObject) ($lexification_object_table$.getGlobalValue())) : NIL);
            deflexical("*LEXIFICATION-TEMPLATE-MTS*", NIL != boundp($lexification_template_mts$) ? ((SubLObject) ($lexification_template_mts$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_lexification_wizard_file_Previous() {
        defconstant("*DTP-LEXIFICATION-PARAMETERS*", lexification_wizard.LEXIFICATION_PARAMETERS);
        defparameter("*LEXWIZ-DEFAULTS*", lexification_wizard.make_lexification_parameters(UNPROVIDED));
        deflexical("*LEXIFICATION-PART-OF-SPEECH-KEYWORDS*", lexification_wizard.$list108);
        deflexical("*MAIN-LEXIFICATION-PARTS-OF-SPEECH*", SubLTrampolineFile.maybeDefault(lexification_wizard.$main_lexification_parts_of_speech$, lexification_wizard.$main_lexification_parts_of_speech$, NIL));
        deflexical("*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$all_lexification_parts_of_speech_labels$, lexification_wizard.$all_lexification_parts_of_speech_labels$, NIL));
        deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_proper_name_predicate_names$, lexification_wizard.$lexification_proper_name_predicate_names$, NIL));
        deflexical("*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_proper_name_predicate_constraints$, lexification_wizard.$lexification_proper_name_predicate_constraints$, NIL));
        deflexical("*LEXIFICATION-MTS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_mts$, lexification_wizard.$lexification_mts$, NIL));
        deflexical("*DEFAULT-PROPER-NAME-PRED*", lexification_wizard.$$$nameString);
        deflexical("*DEFAULT-DENOTATION-PREDICATE*", lexification_wizard.$$denotation);
        deflexical("*LEXIFICATION-OBJECT-TABLE*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_object_table$, lexification_wizard.$lexification_object_table$, () -> make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*LEXIFICATION-WIZARD-INITIALIZED*", NIL);
        defvar("*SME-LEXWIZ-ACTIVE*", NIL);
        defvar("*ALLOW-ADVANCED-LEXWIZ-FEATURES?*", NIL);
        deflexical("*LEXIFICATION-TEMPLATE-MTS*", SubLTrampolineFile.maybeDefault(lexification_wizard.$lexification_template_mts$, lexification_wizard.$lexification_template_mts$, NIL));
        deflexical("*ISOLATE-SYNTACTIC-MAPPINGS?*", T);
        deflexical("*LEXWIZ-SHOW-TERM-INFORMATION?*", T);
        defconstant("*LEXWIZ-TEST*", lexification_wizard.$$$Lexification_Wizard_Test);
        defconstant("*LEXWIZ-TEST-CATEGORY*", cconcatenate(lexification_wizard.$lexwiz_test$.getGlobalValue(), lexification_wizard.$$$_Category));
        defconstant("*LEXWIZ-TEST-SUITE*", cconcatenate(lexification_wizard.$lexwiz_test$.getGlobalValue(), lexification_wizard.$$$_Suite));
        defconstant("*LEXWIZ-MODULE*", lexification_wizard.$str182$lexification_wizard);
        return NIL;
    }

    public static final SubLObject setup_lexification_wizard_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_lexification_parameters$.getGlobalValue(), symbol_function(LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(LEXWIZ_TERM, _CSETF_LEXWIZ_TERM);
        def_csetf(LEXWIZ_PHRASE, _CSETF_LEXWIZ_PHRASE);
        def_csetf(LEXWIZ_MT, _CSETF_LEXWIZ_MT);
        def_csetf($sym19$LEXWIZ_IS_PREFERRED_, $sym20$_CSETF_LEXWIZ_IS_PREFERRED_);
        def_csetf($sym21$LEXWIZ_IS_PROPER_, $sym22$_CSETF_LEXWIZ_IS_PROPER_);
        def_csetf($sym23$LEXWIZ_NONRELATIONAL_, $sym24$_CSETF_LEXWIZ_NONRELATIONAL_);
        def_csetf(LEXWIZ_PROPER_NAME_PRED, _CSETF_LEXWIZ_PROPER_NAME_PRED);
        def_csetf(LEXWIZ_TEMPLATE, _CSETF_LEXWIZ_TEMPLATE);
        def_csetf(LEXWIZ_TEMPLATE_ARGS, _CSETF_LEXWIZ_TEMPLATE_ARGS);
        def_csetf($sym31$LEXWIZ_IGNORE_ARITY_, $sym32$_CSETF_LEXWIZ_IGNORE_ARITY_);
        def_csetf(LEXWIZ_HEADWORD_POSITION, _CSETF_LEXWIZ_HEADWORD_POSITION);
        def_csetf(LEXWIZ_HEADWORD_PART_OF_SPEECH, _CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH);
        def_csetf(LEXWIZ_ERROR_MESSAGE, _CSETF_LEXWIZ_ERROR_MESSAGE);
        def_csetf(LEXWIZ_STATE, _CSETF_LEXWIZ_STATE);
        def_csetf($sym41$LEXWIZ_READY_, $sym42$_CSETF_LEXWIZ_READY_);
        def_csetf(LEXWIZ_FORMULA, _CSETF_LEXWIZ_FORMULA);
        def_csetf(LEXWIZ_OTHER_FORMULAS, _CSETF_LEXWIZ_OTHER_FORMULAS);
        def_csetf(LEXWIZ_USER_ACTION, _CSETF_LEXWIZ_USER_ACTION);
        def_csetf(LEXWIZ_PARSE_TEMPLATE_MT, _CSETF_LEXWIZ_PARSE_TEMPLATE_MT);
        def_csetf(LEXWIZ_PARSE_TEMPLATE, _CSETF_LEXWIZ_PARSE_TEMPLATE);
        def_csetf(LEXWIZ_PARSE_TEMPLATE_FORMULA, _CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA);
        def_csetf(LEXWIZ_LEXICAL_MT, _CSETF_LEXWIZ_LEXICAL_MT);
        def_csetf(LEXWIZ_SYNTACTIC_MT, _CSETF_LEXWIZ_SYNTACTIC_MT);
        def_csetf(LEXWIZ_GENERATION_MT, _CSETF_LEXWIZ_GENERATION_MT);
        identity(LEXIFICATION_PARAMETERS);
        declare_defglobal($main_lexification_parts_of_speech$);
        declare_defglobal($all_lexification_parts_of_speech_labels$);
        declare_defglobal($lexification_proper_name_predicate_names$);
        declare_defglobal($lexification_proper_name_predicate_constraints$);
        declare_defglobal($lexification_mts$);
        declare_defglobal($lexification_object_table$);
        declare_defglobal($lexification_template_mts$);
        return NIL;
    }

    public static SubLObject setup_lexification_wizard_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), lexification_wizard.$dtp_lexification_parameters$.getGlobalValue(), symbol_function(lexification_wizard.LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(lexification_wizard.$list17);
            def_csetf(lexification_wizard.LEXWIZ_ID, lexification_wizard._CSETF_LEXWIZ_ID);
            def_csetf(LEXWIZ_TERM, lexification_wizard._CSETF_LEXWIZ_TERM);
            def_csetf(LEXWIZ_PHRASE, lexification_wizard._CSETF_LEXWIZ_PHRASE);
            def_csetf(LEXWIZ_MT, lexification_wizard._CSETF_LEXWIZ_MT);
            def_csetf(lexification_wizard.$sym26$LEXWIZ_IS_PREFERRED_, lexification_wizard.$sym27$_CSETF_LEXWIZ_IS_PREFERRED_);
            def_csetf(lexification_wizard.$sym28$LEXWIZ_IS_PROPER_, lexification_wizard.$sym29$_CSETF_LEXWIZ_IS_PROPER_);
            def_csetf(lexification_wizard.$sym30$LEXWIZ_NONRELATIONAL_, lexification_wizard.$sym31$_CSETF_LEXWIZ_NONRELATIONAL_);
            def_csetf(lexification_wizard.LEXWIZ_PROPER_NAME_PRED, lexification_wizard._CSETF_LEXWIZ_PROPER_NAME_PRED);
            def_csetf(lexification_wizard.LEXWIZ_TEMPLATE, lexification_wizard._CSETF_LEXWIZ_TEMPLATE);
            def_csetf(lexification_wizard.LEXWIZ_TEMPLATE_ARGS, lexification_wizard._CSETF_LEXWIZ_TEMPLATE_ARGS);
            def_csetf(lexification_wizard.LEXWIZ_TEMPLATE_SPEECH_PARTS, lexification_wizard._CSETF_LEXWIZ_TEMPLATE_SPEECH_PARTS);
            def_csetf(lexification_wizard.$sym40$LEXWIZ_IGNORE_ARITY_, lexification_wizard.$sym41$_CSETF_LEXWIZ_IGNORE_ARITY_);
            def_csetf(LEXWIZ_HEADWORD_POSITION, lexification_wizard._CSETF_LEXWIZ_HEADWORD_POSITION);
            def_csetf(lexification_wizard.LEXWIZ_HEADWORD_PART_OF_SPEECH, lexification_wizard._CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH);
            def_csetf(LEXWIZ_ERROR_MESSAGE, lexification_wizard._CSETF_LEXWIZ_ERROR_MESSAGE);
            def_csetf(lexification_wizard.LEXWIZ_STATE, lexification_wizard._CSETF_LEXWIZ_STATE);
            def_csetf(lexification_wizard.$sym50$LEXWIZ_READY_, lexification_wizard.$sym51$_CSETF_LEXWIZ_READY_);
            def_csetf(lexification_wizard.LEXWIZ_FORMULA, lexification_wizard._CSETF_LEXWIZ_FORMULA);
            def_csetf(lexification_wizard.$sym54$LEXWIZ_USER_EDITED_, lexification_wizard.$sym55$_CSETF_LEXWIZ_USER_EDITED_);
            def_csetf(lexification_wizard.LEXWIZ_USER_FORMULA, lexification_wizard._CSETF_LEXWIZ_USER_FORMULA);
            def_csetf(lexification_wizard.LEXWIZ_OTHER_FORMULAS, lexification_wizard._CSETF_LEXWIZ_OTHER_FORMULAS);
            def_csetf(lexification_wizard.LEXWIZ_USER_ACTION, lexification_wizard._CSETF_LEXWIZ_USER_ACTION);
            def_csetf(lexification_wizard.LEXWIZ_PARSE_TEMPLATE_MT, lexification_wizard._CSETF_LEXWIZ_PARSE_TEMPLATE_MT);
            def_csetf(lexification_wizard.LEXWIZ_PARSE_TEMPLATE, lexification_wizard._CSETF_LEXWIZ_PARSE_TEMPLATE);
            def_csetf(lexification_wizard.LEXWIZ_PARSE_TEMPLATE_FORMULA, lexification_wizard._CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA);
            def_csetf(lexification_wizard.LEXWIZ_LEXICAL_MT, lexification_wizard._CSETF_LEXWIZ_LEXICAL_MT);
            def_csetf(lexification_wizard.LEXWIZ_SYNTACTIC_MT, lexification_wizard._CSETF_LEXWIZ_SYNTACTIC_MT);
            def_csetf(lexification_wizard.LEXWIZ_GENERATION_MT, lexification_wizard._CSETF_LEXWIZ_GENERATION_MT);
            identity(lexification_wizard.LEXIFICATION_PARAMETERS);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), lexification_wizard.$dtp_lexification_parameters$.getGlobalValue(), symbol_function(lexification_wizard.VISIT_DEFSTRUCT_OBJECT_LEXIFICATION_PARAMETERS_METHOD));
            declare_defglobal(lexification_wizard.$main_lexification_parts_of_speech$);
            declare_defglobal(lexification_wizard.$all_lexification_parts_of_speech_labels$);
            declare_defglobal(lexification_wizard.$lexification_proper_name_predicate_names$);
            declare_defglobal(lexification_wizard.$lexification_proper_name_predicate_constraints$);
            declare_defglobal(lexification_wizard.$lexification_mts$);
            declare_defglobal(lexification_wizard.$lexification_object_table$);
            declare_defglobal(lexification_wizard.$lexification_template_mts$);
            sunit_external.define_test_category(lexification_wizard.$lexwiz_test_category$.getGlobalValue(), UNPROVIDED);
            sunit_external.define_test_suite(lexification_wizard.$lexwiz_test_suite$.getGlobalValue(), list(lexification_wizard.$lexwiz_test_category$.getGlobalValue()), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym19$LEXWIZ_IS_PREFERRED_, $sym20$_CSETF_LEXWIZ_IS_PREFERRED_);
            def_csetf($sym21$LEXWIZ_IS_PROPER_, $sym22$_CSETF_LEXWIZ_IS_PROPER_);
            def_csetf($sym23$LEXWIZ_NONRELATIONAL_, $sym24$_CSETF_LEXWIZ_NONRELATIONAL_);
            def_csetf($sym31$LEXWIZ_IGNORE_ARITY_, $sym32$_CSETF_LEXWIZ_IGNORE_ARITY_);
            def_csetf($sym41$LEXWIZ_READY_, $sym42$_CSETF_LEXWIZ_READY_);
        }
        return NIL;
    }

    public static SubLObject setup_lexification_wizard_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), lexification_wizard.$dtp_lexification_parameters$.getGlobalValue(), symbol_function(lexification_wizard.LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(lexification_wizard.$list17);
        def_csetf(lexification_wizard.LEXWIZ_ID, lexification_wizard._CSETF_LEXWIZ_ID);
        def_csetf(LEXWIZ_TERM, lexification_wizard._CSETF_LEXWIZ_TERM);
        def_csetf(LEXWIZ_PHRASE, lexification_wizard._CSETF_LEXWIZ_PHRASE);
        def_csetf(LEXWIZ_MT, lexification_wizard._CSETF_LEXWIZ_MT);
        def_csetf(lexification_wizard.$sym26$LEXWIZ_IS_PREFERRED_, lexification_wizard.$sym27$_CSETF_LEXWIZ_IS_PREFERRED_);
        def_csetf(lexification_wizard.$sym28$LEXWIZ_IS_PROPER_, lexification_wizard.$sym29$_CSETF_LEXWIZ_IS_PROPER_);
        def_csetf(lexification_wizard.$sym30$LEXWIZ_NONRELATIONAL_, lexification_wizard.$sym31$_CSETF_LEXWIZ_NONRELATIONAL_);
        def_csetf(lexification_wizard.LEXWIZ_PROPER_NAME_PRED, lexification_wizard._CSETF_LEXWIZ_PROPER_NAME_PRED);
        def_csetf(lexification_wizard.LEXWIZ_TEMPLATE, lexification_wizard._CSETF_LEXWIZ_TEMPLATE);
        def_csetf(lexification_wizard.LEXWIZ_TEMPLATE_ARGS, lexification_wizard._CSETF_LEXWIZ_TEMPLATE_ARGS);
        def_csetf(lexification_wizard.LEXWIZ_TEMPLATE_SPEECH_PARTS, lexification_wizard._CSETF_LEXWIZ_TEMPLATE_SPEECH_PARTS);
        def_csetf(lexification_wizard.$sym40$LEXWIZ_IGNORE_ARITY_, lexification_wizard.$sym41$_CSETF_LEXWIZ_IGNORE_ARITY_);
        def_csetf(LEXWIZ_HEADWORD_POSITION, lexification_wizard._CSETF_LEXWIZ_HEADWORD_POSITION);
        def_csetf(lexification_wizard.LEXWIZ_HEADWORD_PART_OF_SPEECH, lexification_wizard._CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH);
        def_csetf(LEXWIZ_ERROR_MESSAGE, lexification_wizard._CSETF_LEXWIZ_ERROR_MESSAGE);
        def_csetf(lexification_wizard.LEXWIZ_STATE, lexification_wizard._CSETF_LEXWIZ_STATE);
        def_csetf(lexification_wizard.$sym50$LEXWIZ_READY_, lexification_wizard.$sym51$_CSETF_LEXWIZ_READY_);
        def_csetf(lexification_wizard.LEXWIZ_FORMULA, lexification_wizard._CSETF_LEXWIZ_FORMULA);
        def_csetf(lexification_wizard.$sym54$LEXWIZ_USER_EDITED_, lexification_wizard.$sym55$_CSETF_LEXWIZ_USER_EDITED_);
        def_csetf(lexification_wizard.LEXWIZ_USER_FORMULA, lexification_wizard._CSETF_LEXWIZ_USER_FORMULA);
        def_csetf(lexification_wizard.LEXWIZ_OTHER_FORMULAS, lexification_wizard._CSETF_LEXWIZ_OTHER_FORMULAS);
        def_csetf(lexification_wizard.LEXWIZ_USER_ACTION, lexification_wizard._CSETF_LEXWIZ_USER_ACTION);
        def_csetf(lexification_wizard.LEXWIZ_PARSE_TEMPLATE_MT, lexification_wizard._CSETF_LEXWIZ_PARSE_TEMPLATE_MT);
        def_csetf(lexification_wizard.LEXWIZ_PARSE_TEMPLATE, lexification_wizard._CSETF_LEXWIZ_PARSE_TEMPLATE);
        def_csetf(lexification_wizard.LEXWIZ_PARSE_TEMPLATE_FORMULA, lexification_wizard._CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA);
        def_csetf(lexification_wizard.LEXWIZ_LEXICAL_MT, lexification_wizard._CSETF_LEXWIZ_LEXICAL_MT);
        def_csetf(lexification_wizard.LEXWIZ_SYNTACTIC_MT, lexification_wizard._CSETF_LEXWIZ_SYNTACTIC_MT);
        def_csetf(lexification_wizard.LEXWIZ_GENERATION_MT, lexification_wizard._CSETF_LEXWIZ_GENERATION_MT);
        identity(lexification_wizard.LEXIFICATION_PARAMETERS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), lexification_wizard.$dtp_lexification_parameters$.getGlobalValue(), symbol_function(lexification_wizard.VISIT_DEFSTRUCT_OBJECT_LEXIFICATION_PARAMETERS_METHOD));
        declare_defglobal(lexification_wizard.$main_lexification_parts_of_speech$);
        declare_defglobal(lexification_wizard.$all_lexification_parts_of_speech_labels$);
        declare_defglobal(lexification_wizard.$lexification_proper_name_predicate_names$);
        declare_defglobal(lexification_wizard.$lexification_proper_name_predicate_constraints$);
        declare_defglobal(lexification_wizard.$lexification_mts$);
        declare_defglobal(lexification_wizard.$lexification_object_table$);
        declare_defglobal(lexification_wizard.$lexification_template_mts$);
        sunit_external.define_test_category(lexification_wizard.$lexwiz_test_category$.getGlobalValue(), UNPROVIDED);
        sunit_external.define_test_suite(lexification_wizard.$lexwiz_test_suite$.getGlobalValue(), list(lexification_wizard.$lexwiz_test_category$.getGlobalValue()), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        lexification_wizard.declare_lexification_wizard_file();
    }

    @Override
    public void initializeVariables() {
        lexification_wizard.init_lexification_wizard_file();
    }

    @Override
    public void runTopLevelForms() {
        lexification_wizard.setup_lexification_wizard_file();
    }

    static {
    }

    public static final class $lexification_parameters_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $term;

        public SubLObject $phrase;

        public SubLObject $mt;

        public SubLObject $is_preferredP;

        public SubLObject $is_properP;

        public SubLObject $nonrelationalP;

        public SubLObject $proper_name_pred;

        public SubLObject $template;

        public SubLObject $template_args;

        public SubLObject $template_speech_parts;

        public SubLObject $ignore_arityP;

        public SubLObject $headword_position;

        public SubLObject $headword_part_of_speech;

        public SubLObject $error_message;

        public SubLObject $state;

        public SubLObject $readyP;

        public SubLObject $formula;

        public SubLObject $user_editedP;

        public SubLObject $user_formula;

        public SubLObject $other_formulas;

        public SubLObject $user_action;

        public SubLObject $parse_template_mt;

        public SubLObject $parse_template;

        public SubLObject $parse_template_formula;

        public SubLObject $lexical_mt;

        public SubLObject $syntactic_mt;

        public SubLObject $generation_mt;

        private static final SubLStructDeclNative structDecl;

        public $lexification_parameters_native() {
            this.$id = Lisp.NIL;
            this.$term = Lisp.NIL;
            this.$phrase = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$is_preferredP = Lisp.NIL;
            this.$is_properP = Lisp.NIL;
            this.$nonrelationalP = Lisp.NIL;
            this.$proper_name_pred = Lisp.NIL;
            this.$template = Lisp.NIL;
            this.$template_args = Lisp.NIL;
            this.$template_speech_parts = Lisp.NIL;
            this.$ignore_arityP = Lisp.NIL;
            this.$headword_position = Lisp.NIL;
            this.$headword_part_of_speech = Lisp.NIL;
            this.$error_message = Lisp.NIL;
            this.$state = Lisp.NIL;
            this.$readyP = Lisp.NIL;
            this.$formula = Lisp.NIL;
            this.$user_editedP = Lisp.NIL;
            this.$user_formula = Lisp.NIL;
            this.$other_formulas = Lisp.NIL;
            this.$user_action = Lisp.NIL;
            this.$parse_template_mt = Lisp.NIL;
            this.$parse_template = Lisp.NIL;
            this.$parse_template_formula = Lisp.NIL;
            this.$lexical_mt = Lisp.NIL;
            this.$syntactic_mt = Lisp.NIL;
            this.$generation_mt = Lisp.NIL;
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
            return this.$term;
        }

        @Override
        public SubLObject getField4() {
            return this.$phrase;
        }

        @Override
        public SubLObject getField5() {
            return this.$mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$is_preferredP;
        }

        @Override
        public SubLObject getField7() {
            return this.$is_properP;
        }

        @Override
        public SubLObject getField8() {
            return this.$nonrelationalP;
        }

        @Override
        public SubLObject getField9() {
            return this.$proper_name_pred;
        }

        @Override
        public SubLObject getField10() {
            return this.$template;
        }

        @Override
        public SubLObject getField11() {
            return this.$template_args;
        }

        @Override
        public SubLObject getField12() {
            return this.$template_speech_parts;
        }

        @Override
        public SubLObject getField13() {
            return this.$ignore_arityP;
        }

        @Override
        public SubLObject getField14() {
            return this.$headword_position;
        }

        @Override
        public SubLObject getField15() {
            return this.$headword_part_of_speech;
        }

        @Override
        public SubLObject getField16() {
            return this.$error_message;
        }

        @Override
        public SubLObject getField17() {
            return this.$state;
        }

        @Override
        public SubLObject getField18() {
            return this.$readyP;
        }

        @Override
        public SubLObject getField19() {
            return this.$formula;
        }

        @Override
        public SubLObject getField20() {
            return this.$user_editedP;
        }

        public SubLObject getField21() {
            return this.$user_formula;
        }

        public SubLObject getField22() {
            return this.$other_formulas;
        }

        public SubLObject getField23() {
            return this.$user_action;
        }

        public SubLObject getField24() {
            return this.$parse_template_mt;
        }

        public SubLObject getField25() {
            return this.$parse_template;
        }

        public SubLObject getField26() {
            return this.$parse_template_formula;
        }

        public SubLObject getField27() {
            return this.$lexical_mt;
        }

        public SubLObject getField28() {
            return this.$syntactic_mt;
        }

        public SubLObject getField29() {
            return this.$generation_mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$term = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$phrase = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$is_preferredP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$is_properP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$nonrelationalP = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$proper_name_pred = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$template = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$template_args = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$template_speech_parts = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$ignore_arityP = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$headword_position = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$headword_part_of_speech = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$error_message = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField18(final SubLObject value) {
            return this.$readyP = value;
        }

        @Override
        public SubLObject setField19(final SubLObject value) {
            return this.$formula = value;
        }

        @Override
        public SubLObject setField20(final SubLObject value) {
            return this.$user_editedP = value;
        }

        public SubLObject setField21(final SubLObject value) {
            return this.$user_formula = value;
        }

        public SubLObject setField22(final SubLObject value) {
            return this.$other_formulas = value;
        }

        public SubLObject setField23(final SubLObject value) {
            return this.$user_action = value;
        }

        public SubLObject setField24(final SubLObject value) {
            return this.$parse_template_mt = value;
        }

        public SubLObject setField25(final SubLObject value) {
            return this.$parse_template = value;
        }

        public SubLObject setField26(final SubLObject value) {
            return this.$parse_template_formula = value;
        }

        public SubLObject setField27(final SubLObject value) {
            return this.$lexical_mt = value;
        }

        public SubLObject setField28(final SubLObject value) {
            return this.$syntactic_mt = value;
        }

        public SubLObject setField29(final SubLObject value) {
            return this.$generation_mt = value;
        }

        static {
            structDecl = makeStructDeclNative(lexification_wizard.$lexification_parameters_native.class, lexification_wizard.LEXIFICATION_PARAMETERS, lexification_wizard.LEXIFICATION_PARAMETERS_P, lexification_wizard.$list2, lexification_wizard.$list3, new String[]{ "$id", "$term", "$phrase", "$mt", "$is_preferredP", "$is_properP", "$nonrelationalP", "$proper_name_pred", "$template", "$template_args", "$template_speech_parts", "$ignore_arityP", "$headword_position", "$headword_part_of_speech", "$error_message", "$state", "$readyP", "$formula", "$user_editedP", "$user_formula", "$other_formulas", "$user_action", "$parse_template_mt", "$parse_template", "$parse_template_formula", "$lexical_mt", "$syntactic_mt", "$generation_mt" }, lexification_wizard.$list4, lexification_wizard.$list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT"), makeSymbol("IS-PREFERRED?"), makeSymbol("IS-PROPER?"), makeSymbol("NONRELATIONAL?"), makeSymbol("PROPER-NAME-PRED"), makeSymbol("TEMPLATE"), makeSymbol("TEMPLATE-ARGS"), makeSymbol("IGNORE-ARITY?"), makeSymbol("HEADWORD-POSITION"), makeSymbol("HEADWORD-PART-OF-SPEECH"), makeSymbol("ERROR-MESSAGE"), makeSymbol("STATE"), makeSymbol("READY?"), makeSymbol("FORMULA"), makeSymbol("OTHER-FORMULAS"), makeSymbol("USER-ACTION"), makeSymbol("PARSE-TEMPLATE-MT"), makeSymbol("PARSE-TEMPLATE"), makeSymbol("PARSE-TEMPLATE-FORMULA"), makeSymbol("LEXICAL-MT"), makeSymbol("SYNTACTIC-MT"), makeSymbol("GENERATION-MT") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ $TERM, makeKeyword("PHRASE"), makeKeyword("MT"), makeKeyword("IS-PREFERRED?"), makeKeyword("IS-PROPER?"), makeKeyword("NONRELATIONAL?"), makeKeyword("PROPER-NAME-PRED"), makeKeyword("TEMPLATE"), makeKeyword("TEMPLATE-ARGS"), makeKeyword("IGNORE-ARITY?"), makeKeyword("HEADWORD-POSITION"), makeKeyword("HEADWORD-PART-OF-SPEECH"), makeKeyword("ERROR-MESSAGE"), makeKeyword("STATE"), makeKeyword("READY?"), makeKeyword("FORMULA"), makeKeyword("OTHER-FORMULAS"), makeKeyword("USER-ACTION"), makeKeyword("PARSE-TEMPLATE-MT"), makeKeyword("PARSE-TEMPLATE"), makeKeyword("PARSE-TEMPLATE-FORMULA"), makeKeyword("LEXICAL-MT"), makeKeyword("SYNTACTIC-MT"), makeKeyword("GENERATION-MT") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-IS-PREFERRED?"), makeSymbol("LEXWIZ-IS-PROPER?"), makeSymbol("LEXWIZ-NONRELATIONAL?"), makeSymbol("LEXWIZ-PROPER-NAME-PRED"), makeSymbol("LEXWIZ-TEMPLATE"), makeSymbol("LEXWIZ-TEMPLATE-ARGS"), makeSymbol("LEXWIZ-IGNORE-ARITY?"), makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-STATE"), makeSymbol("LEXWIZ-READY?"), makeSymbol("LEXWIZ-FORMULA"), makeSymbol("LEXWIZ-OTHER-FORMULAS"), makeSymbol("LEXWIZ-USER-ACTION"), makeSymbol("LEXWIZ-PARSE-TEMPLATE-MT"), makeSymbol("LEXWIZ-PARSE-TEMPLATE"), makeSymbol("LEXWIZ-PARSE-TEMPLATE-FORMULA"), makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("LEXWIZ-SYNTACTIC-MT"), makeSymbol("LEXWIZ-GENERATION-MT") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-LEXWIZ-TERM"), makeSymbol("_CSETF-LEXWIZ-PHRASE"), makeSymbol("_CSETF-LEXWIZ-MT"), makeSymbol("_CSETF-LEXWIZ-IS-PREFERRED?"), makeSymbol("_CSETF-LEXWIZ-IS-PROPER?"), makeSymbol("_CSETF-LEXWIZ-NONRELATIONAL?"), makeSymbol("_CSETF-LEXWIZ-PROPER-NAME-PRED"), makeSymbol("_CSETF-LEXWIZ-TEMPLATE"), makeSymbol("_CSETF-LEXWIZ-TEMPLATE-ARGS"), makeSymbol("_CSETF-LEXWIZ-IGNORE-ARITY?"), makeSymbol("_CSETF-LEXWIZ-HEADWORD-POSITION"), makeSymbol("_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("_CSETF-LEXWIZ-ERROR-MESSAGE"), makeSymbol("_CSETF-LEXWIZ-STATE"), makeSymbol("_CSETF-LEXWIZ-READY?"), makeSymbol("_CSETF-LEXWIZ-FORMULA"), makeSymbol("_CSETF-LEXWIZ-OTHER-FORMULAS"), makeSymbol("_CSETF-LEXWIZ-USER-ACTION"), makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE-MT"), makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE"), makeSymbol("_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA"), makeSymbol("_CSETF-LEXWIZ-LEXICAL-MT"), makeSymbol("_CSETF-LEXWIZ-SYNTACTIC-MT"), makeSymbol("_CSETF-LEXWIZ-GENERATION-MT") });

    static private final SubLSymbol $sym19$LEXWIZ_IS_PREFERRED_ = makeSymbol("LEXWIZ-IS-PREFERRED?");

    static private final SubLSymbol $sym20$_CSETF_LEXWIZ_IS_PREFERRED_ = makeSymbol("_CSETF-LEXWIZ-IS-PREFERRED?");

    static private final SubLSymbol $sym21$LEXWIZ_IS_PROPER_ = makeSymbol("LEXWIZ-IS-PROPER?");

    static private final SubLSymbol $sym22$_CSETF_LEXWIZ_IS_PROPER_ = makeSymbol("_CSETF-LEXWIZ-IS-PROPER?");

    static private final SubLSymbol $sym23$LEXWIZ_NONRELATIONAL_ = makeSymbol("LEXWIZ-NONRELATIONAL?");

    static private final SubLSymbol $sym24$_CSETF_LEXWIZ_NONRELATIONAL_ = makeSymbol("_CSETF-LEXWIZ-NONRELATIONAL?");

    static private final SubLSymbol $sym31$LEXWIZ_IGNORE_ARITY_ = makeSymbol("LEXWIZ-IGNORE-ARITY?");

    static private final SubLSymbol $sym32$_CSETF_LEXWIZ_IGNORE_ARITY_ = makeSymbol("_CSETF-LEXWIZ-IGNORE-ARITY?");

    static private final SubLSymbol $sym41$LEXWIZ_READY_ = makeSymbol("LEXWIZ-READY?");

    static private final SubLSymbol $sym42$_CSETF_LEXWIZ_READY_ = makeSymbol("_CSETF-LEXWIZ-READY?");

    public static final class $lexification_parameters_p$UnaryFunction extends UnaryFunction {
        public $lexification_parameters_p$UnaryFunction() {
            super(extractFunctionNamed("LEXIFICATION-PARAMETERS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return lexification_wizard.lexification_parameters_p(arg1);
        }
    }

    public static final SubLSymbol $kw64$IS_PREFERRED_ = makeKeyword("IS-PREFERRED?");

    public static final SubLSymbol $kw65$IS_PROPER_ = makeKeyword("IS-PROPER?");

    public static final SubLSymbol $kw70$IGNORE_ARITY_ = makeKeyword("IGNORE-ARITY?");

    static private final SubLString $str_alt85$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt86 = list($NOUN, makeKeyword("PROPER-NOUN"), $VERB, makeKeyword("ADJECTIVE"), makeKeyword("ADVERB"));

    static private final SubLString $str_alt96$Warning__ = makeString("Warning: ");

    static private final SubLString $str_alt100$_ = makeString("(");

    static private final SubLString $str_alt101$_ = makeString(")");

    static private final SubLList $list_alt102 = list(CHAR_null, CHAR_tilde, CHAR_percent);

    static private final SubLString $str_alt108$Unable_to_map_headword__s_in_part = makeString("Unable to map headword ~s in part-of-speech ~s");

    static private final SubLList $list_alt114 = list(makeKeyword("SIMPLE-NOUN"), $VERB);

    static private final SubLString $str_alt115$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");



    static private final SubLString $str_alt134$Lexification_parameters____S__ = makeString("Lexification parameters:~%~S~%");

    static private final SubLList $list_alt137 = list(makeString("CountNoun"), makeString("MassNoun"), makeString("Verb"));

    static private final SubLList $list_alt140 = list(reader_make_constant_shell("properNameStrings"), reader_make_constant_shell("preferredNameString"));

    static private final SubLSymbol $sym143$STRING_ = makeSymbol("STRING<");
}

/**
 * Total time: 466 ms
 */
