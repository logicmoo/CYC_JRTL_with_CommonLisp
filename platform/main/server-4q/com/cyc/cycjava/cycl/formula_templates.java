package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class formula_templates extends SubLTranslatedFile {
    public static final SubLFile me = new formula_templates();

    public static final String myName = "com.cyc.cycjava.cycl.formula_templates";

    public static final String myFingerPrint = "9c5f506c169b4ec38e3687e8c05192a19d0215ed387b43f2a3115eea736e3671";

    // defconstant
    public static final SubLSymbol $dtp_template_topic$ = makeSymbol("*DTP-TEMPLATE-TOPIC*");

    // deflexical
    private static final SubLSymbol $cfasl_guid_opcode_template_topic$ = makeSymbol("*CFASL-GUID-OPCODE-TEMPLATE-TOPIC*");

    // defconstant
    public static final SubLSymbol $dtp_arg_position_details$ = makeSymbol("*DTP-ARG-POSITION-DETAILS*");

    // deflexical
    private static final SubLSymbol $cfasl_guid_opcode_arg_position_details$ = makeSymbol("*CFASL-GUID-OPCODE-ARG-POSITION-DETAILS*");

    // defconstant
    public static final SubLSymbol $dtp_formula_template$ = makeSymbol("*DTP-FORMULA-TEMPLATE*");

    // deflexical
    private static final SubLSymbol $cfasl_guid_opcode_formula_template$ = makeSymbol("*CFASL-GUID-OPCODE-FORMULA-TEMPLATE*");

    // defparameter
    private static final SubLSymbol $make_ftemplate_loading_supporting_ask_browsableP$ = makeSymbol("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*");



    // defparameter
    // A useful switch to test things that should not be made available yet.
    private static final SubLSymbol $xml_suppress_future_template_extensions$ = makeSymbol("*XML-SUPPRESS-FUTURE-TEMPLATE-EXTENSIONS*");

    // deflexical
    private static final SubLSymbol $xml_template_topic_revisions$ = makeSymbol("*XML-TEMPLATE-TOPIC-REVISIONS*");

    // deflexical
    private static final SubLSymbol $formula_template_dtd_uri$ = makeSymbol("*FORMULA-TEMPLATE-DTD-URI*");

    // defparameter
    // Bound to dictionary mapping terms to lists of lower priority terms.
    private static final SubLSymbol $high_to_low_priorities$ = makeSymbol("*HIGH-TO-LOW-PRIORITIES*");

    // deflexical
    // Only emit output that something is bad, dont actually stop.
    private static final SubLSymbol $warn_on_template_topic_validation_only$ = makeSymbol("*WARN-ON-TEMPLATE-TOPIC-VALIDATION-ONLY*");

    // defparameter
    private static final SubLSymbol $template_count_mt$ = makeSymbol("*TEMPLATE-COUNT-MT*");

    // deflexical
    private static final SubLSymbol $xml_template_topic_assertions_revisions$ = makeSymbol("*XML-TEMPLATE-TOPIC-ASSERTIONS-REVISIONS*");

    // deflexical
    private static final SubLSymbol $quaternary_fet_evaluation_pred$ = makeSymbol("*QUATERNARY-FET-EVALUATION-PRED*");



    // deflexical
    private static final SubLSymbol $unique_variables_list_for_formula_templates$ = makeSymbol("*UNIQUE-VARIABLES-LIST-FOR-FORMULA-TEMPLATES*");

    // deflexical
    private static final SubLSymbol $elmt_variable_for_formula_templates$ = makeSymbol("*ELMT-VARIABLE-FOR-FORMULA-TEMPLATES*");

    // defparameter
    /**
     * BOOLEANP; Should we try to get assertion objects via our first ask, as
     * opposed to finding bindings, substituting, and then looking for matching
     * assertions?
     */
    public static final SubLSymbol $get_assertions_from_initial_askP$ = makeSymbol("*GET-ASSERTIONS-FROM-INITIAL-ASK?*");

    // deflexical
    // All the constructions we dont currently deal with.
    private static final SubLSymbol $ftemplate_constraint_to_collection_skiplist$ = makeSymbol("*FTEMPLATE-CONSTRAINT-TO-COLLECTION-SKIPLIST*");

    // Internal Constants
    public static final SubLSymbol TEMPLATE_TOPIC = makeSymbol("TEMPLATE-TOPIC");

    public static final SubLSymbol TEMPLATE_TOPIC_P = makeSymbol("TEMPLATE-TOPIC-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("SUPERTOPIC"), makeSymbol("TOPIC"), makeSymbol("SUBTOPICS"), makeSymbol("TEMPLATES"), makeSymbol("ORDERING"), makeSymbol("TITLE"), makeSymbol("TERM-PREFIX"), makeSymbol("INTRO-TEMPLATE"), makeSymbol("SOURCE-TYPES"), makeSymbol("SOURCE-MT"), makeSymbol("QUERY-MT"), makeSymbol("DEFINITIONAL-MT") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SUPERTOPIC"), makeKeyword("TOPIC"), makeKeyword("SUBTOPICS"), makeKeyword("TEMPLATES"), makeKeyword("ORDERING"), makeKeyword("TITLE"), makeKeyword("TERM-PREFIX"), makeKeyword("INTRO-TEMPLATE"), makeKeyword("SOURCE-TYPES"), makeKeyword("SOURCE-MT"), makeKeyword("QUERY-MT"), makeKeyword("DEFINITIONAL-MT") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("TEMPLATE-TOPIC-SUPERTOPIC"), makeSymbol("TEMPLATE-TOPIC-TOPIC"), makeSymbol("TEMPLATE-TOPIC-SUBTOPICS"), makeSymbol("TEMPLATE-TOPIC-TEMPLATES"), makeSymbol("TEMPLATE-TOPIC-ORDERING"), makeSymbol("TEMPLATE-TOPIC-TITLE"), makeSymbol("TEMPLATE-TOPIC-TERM-PREFIX"), makeSymbol("TEMPLATE-TOPIC-INTRO-TEMPLATE"), makeSymbol("TEMPLATE-TOPIC-SOURCE-TYPES"), makeSymbol("TEMPLATE-TOPIC-SOURCE-MT"), makeSymbol("TEMPLATE-TOPIC-QUERY-MT"), makeSymbol("TEMPLATE-TOPIC-DEFINITIONAL-MT") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-TEMPLATE-TOPIC-SUPERTOPIC"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TOPIC"), makeSymbol("_CSETF-TEMPLATE-TOPIC-SUBTOPICS"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TEMPLATES"), makeSymbol("_CSETF-TEMPLATE-TOPIC-ORDERING"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TITLE"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TERM-PREFIX"), makeSymbol("_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE"), makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES"), makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-MT"), makeSymbol("_CSETF-TEMPLATE-TOPIC-QUERY-MT"), makeSymbol("_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT") });

    public static final SubLSymbol PRINT_TEMPLATE_TOPIC = makeSymbol("PRINT-TEMPLATE-TOPIC");

    public static final SubLSymbol TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEMPLATE-TOPIC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TEMPLATE-TOPIC-P"));

    private static final SubLSymbol TEMPLATE_TOPIC_SUPERTOPIC = makeSymbol("TEMPLATE-TOPIC-SUPERTOPIC");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_SUPERTOPIC = makeSymbol("_CSETF-TEMPLATE-TOPIC-SUPERTOPIC");

    private static final SubLSymbol TEMPLATE_TOPIC_TOPIC = makeSymbol("TEMPLATE-TOPIC-TOPIC");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_TOPIC = makeSymbol("_CSETF-TEMPLATE-TOPIC-TOPIC");

    private static final SubLSymbol TEMPLATE_TOPIC_SUBTOPICS = makeSymbol("TEMPLATE-TOPIC-SUBTOPICS");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_SUBTOPICS = makeSymbol("_CSETF-TEMPLATE-TOPIC-SUBTOPICS");

    private static final SubLSymbol TEMPLATE_TOPIC_TEMPLATES = makeSymbol("TEMPLATE-TOPIC-TEMPLATES");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_TEMPLATES = makeSymbol("_CSETF-TEMPLATE-TOPIC-TEMPLATES");

    private static final SubLSymbol TEMPLATE_TOPIC_ORDERING = makeSymbol("TEMPLATE-TOPIC-ORDERING");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_ORDERING = makeSymbol("_CSETF-TEMPLATE-TOPIC-ORDERING");

    private static final SubLSymbol TEMPLATE_TOPIC_TITLE = makeSymbol("TEMPLATE-TOPIC-TITLE");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_TITLE = makeSymbol("_CSETF-TEMPLATE-TOPIC-TITLE");

    private static final SubLSymbol TEMPLATE_TOPIC_TERM_PREFIX = makeSymbol("TEMPLATE-TOPIC-TERM-PREFIX");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_TERM_PREFIX = makeSymbol("_CSETF-TEMPLATE-TOPIC-TERM-PREFIX");

    private static final SubLSymbol TEMPLATE_TOPIC_INTRO_TEMPLATE = makeSymbol("TEMPLATE-TOPIC-INTRO-TEMPLATE");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE = makeSymbol("_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE");

    private static final SubLSymbol TEMPLATE_TOPIC_SOURCE_TYPES = makeSymbol("TEMPLATE-TOPIC-SOURCE-TYPES");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_SOURCE_TYPES = makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES");

    private static final SubLSymbol TEMPLATE_TOPIC_SOURCE_MT = makeSymbol("TEMPLATE-TOPIC-SOURCE-MT");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_SOURCE_MT = makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-MT");

    private static final SubLSymbol TEMPLATE_TOPIC_QUERY_MT = makeSymbol("TEMPLATE-TOPIC-QUERY-MT");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_QUERY_MT = makeSymbol("_CSETF-TEMPLATE-TOPIC-QUERY-MT");

    private static final SubLSymbol TEMPLATE_TOPIC_DEFINITIONAL_MT = makeSymbol("TEMPLATE-TOPIC-DEFINITIONAL-MT");

    private static final SubLSymbol _CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT = makeSymbol("_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT");

























    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TEMPLATE_TOPIC = makeSymbol("MAKE-TEMPLATE-TOPIC");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TEMPLATE_TOPIC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEMPLATE-TOPIC-METHOD");

    private static final SubLString $str51$18287931_d871_11d9_8eef_0002b3891 = makeString("18287931-d871-11d9-8eef-0002b3891c5a");

    private static final SubLSymbol CFASL_INPUT_TEMPLATE_TOPIC = makeSymbol("CFASL-INPUT-TEMPLATE-TOPIC");

    private static final SubLSymbol ARG_POSITION_DETAILS = makeSymbol("ARG-POSITION-DETAILS");

    private static final SubLSymbol ARG_POSITION_DETAILS_P = makeSymbol("ARG-POSITION-DETAILS-P");

    private static final SubLList $list55 = list(new SubLObject[]{ makeSymbol("ARGUMENT-POSITION"), makeSymbol("ORDERING"), makeSymbol("GLOSS"), makeSymbol("INVISIBLE-REPLACEMENT-POSITIONS"), makeSymbol("REPLACEMENT-CONSTRAINTS"), makeSymbol("CANDIDATE-REPLACEMENTS"), makeSymbol("IS-EDITABLE"), makeSymbol("EXPLANATION"), makeSymbol("REQUIRES-VALIDATION"), makeSymbol("UNKNOWN-REPLACEMENT") });

    private static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("ARGUMENT-POSITION"), makeKeyword("ORDERING"), makeKeyword("GLOSS"), makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS"), makeKeyword("REPLACEMENT-CONSTRAINTS"), makeKeyword("CANDIDATE-REPLACEMENTS"), makeKeyword("IS-EDITABLE"), makeKeyword("EXPLANATION"), makeKeyword("REQUIRES-VALIDATION"), makeKeyword("UNKNOWN-REPLACEMENT") });

    private static final SubLList $list57 = list(new SubLObject[]{ makeSymbol("ARG-POSITION-DETAILS-ARGUMENT-POSITION"), makeSymbol("ARG-POSITION-DETAILS-ORDERING"), makeSymbol("ARG-POSITION-DETAILS-GLOSS"), makeSymbol("ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS"), makeSymbol("ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS"), makeSymbol("ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS"), makeSymbol("ARG-POSITION-DETAILS-IS-EDITABLE"), makeSymbol("ARG-POSITION-DETAILS-EXPLANATION"), makeSymbol("ARG-POSITION-DETAILS-REQUIRES-VALIDATION"), makeSymbol("ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT") });

    private static final SubLList $list58 = list(new SubLObject[]{ makeSymbol("_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-ORDERING"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-GLOSS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-EXPLANATION"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT") });

    private static final SubLSymbol PRINT_ARG_POSITION_DETAILS = makeSymbol("PRINT-ARG-POSITION-DETAILS");

    private static final SubLSymbol ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARG-POSITION-DETAILS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list61 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ARG-POSITION-DETAILS-P"));

    private static final SubLSymbol ARG_POSITION_DETAILS_ARGUMENT_POSITION = makeSymbol("ARG-POSITION-DETAILS-ARGUMENT-POSITION");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION = makeSymbol("_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION");

    private static final SubLSymbol ARG_POSITION_DETAILS_ORDERING = makeSymbol("ARG-POSITION-DETAILS-ORDERING");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_ORDERING = makeSymbol("_CSETF-ARG-POSITION-DETAILS-ORDERING");

    private static final SubLSymbol ARG_POSITION_DETAILS_GLOSS = makeSymbol("ARG-POSITION-DETAILS-GLOSS");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_GLOSS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-GLOSS");

    private static final SubLSymbol ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS = makeSymbol("ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS");

    private static final SubLSymbol ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS = makeSymbol("ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS");

    private static final SubLSymbol ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS = makeSymbol("ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS");

    private static final SubLSymbol ARG_POSITION_DETAILS_IS_EDITABLE = makeSymbol("ARG-POSITION-DETAILS-IS-EDITABLE");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_IS_EDITABLE = makeSymbol("_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE");

    private static final SubLSymbol ARG_POSITION_DETAILS_EXPLANATION = makeSymbol("ARG-POSITION-DETAILS-EXPLANATION");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_EXPLANATION = makeSymbol("_CSETF-ARG-POSITION-DETAILS-EXPLANATION");

    private static final SubLSymbol ARG_POSITION_DETAILS_REQUIRES_VALIDATION = makeSymbol("ARG-POSITION-DETAILS-REQUIRES-VALIDATION");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION = makeSymbol("_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION");

    private static final SubLSymbol ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT = makeSymbol("ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT");

    private static final SubLSymbol _CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT = makeSymbol("_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT");





    private static final SubLSymbol $INVISIBLE_REPLACEMENT_POSITIONS = makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS");













    private static final SubLSymbol MAKE_ARG_POSITION_DETAILS = makeSymbol("MAKE-ARG-POSITION-DETAILS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ARG_POSITION_DETAILS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ARG-POSITION-DETAILS-METHOD");

    private static final SubLString $str93$182a9c10_d871_11d9_8eef_0002b3891 = makeString("182a9c10-d871-11d9-8eef-0002b3891c5a");

    private static final SubLSymbol CFASL_INPUT_ARG_POSITION_DETAILS = makeSymbol("CFASL-INPUT-ARG-POSITION-DETAILS");

    private static final SubLSymbol FORMULA_TEMPLATE = makeSymbol("FORMULA-TEMPLATE");

    private static final SubLSymbol FORMULA_TEMPLATE_P = makeSymbol("FORMULA-TEMPLATE-P");

    private static final SubLList $list97 = list(new SubLObject[]{ makeSymbol("TOPIC"), makeSymbol("ID"), makeSymbol("FORMULA"), makeSymbol("QUERY-SPECIFICATION"), makeSymbol("ELMT"), makeSymbol("FOCAL-TERM"), makeSymbol("ARGPOS-DETAILS"), makeSymbol("ARGPOS-ORDERING"), makeSymbol("EXAMPLES"), makeSymbol("ENTRY-FORMAT"), makeSymbol("FOLLOW-UPS"), makeSymbol("GLOSS"), makeSymbol("REFSPEC") });

    private static final SubLList $list98 = list(new SubLObject[]{ makeKeyword("TOPIC"), makeKeyword("ID"), makeKeyword("FORMULA"), makeKeyword("QUERY-SPECIFICATION"), makeKeyword("ELMT"), makeKeyword("FOCAL-TERM"), makeKeyword("ARGPOS-DETAILS"), makeKeyword("ARGPOS-ORDERING"), makeKeyword("EXAMPLES"), makeKeyword("ENTRY-FORMAT"), makeKeyword("FOLLOW-UPS"), makeKeyword("GLOSS"), makeKeyword("REFSPEC") });

    private static final SubLList $list99 = list(new SubLObject[]{ makeSymbol("FORMULA-TEMPLATE-TOPIC"), makeSymbol("FORMULA-TEMPLATE-ID"), makeSymbol("FORMULA-TEMPLATE-FORMULA"), makeSymbol("FORMULA-TEMPLATE-QUERY-SPECIFICATION"), makeSymbol("FORMULA-TEMPLATE-ELMT"), makeSymbol("FORMULA-TEMPLATE-FOCAL-TERM"), makeSymbol("FORMULA-TEMPLATE-ARGPOS-DETAILS"), makeSymbol("FORMULA-TEMPLATE-ARGPOS-ORDERING"), makeSymbol("FORMULA-TEMPLATE-EXAMPLES"), makeSymbol("FORMULA-TEMPLATE-ENTRY-FORMAT"), makeSymbol("FORMULA-TEMPLATE-FOLLOW-UPS"), makeSymbol("FORMULA-TEMPLATE-GLOSS"), makeSymbol("FORMULA-TEMPLATE-REFSPEC") });

    private static final SubLList $list100 = list(new SubLObject[]{ makeSymbol("_CSETF-FORMULA-TEMPLATE-TOPIC"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ID"), makeSymbol("_CSETF-FORMULA-TEMPLATE-FORMULA"), makeSymbol("_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ELMT"), makeSymbol("_CSETF-FORMULA-TEMPLATE-FOCAL-TERM"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EXAMPLES"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT"), makeSymbol("_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-GLOSS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-REFSPEC") });

    private static final SubLSymbol PRINT_FORMULA_TEMPLATE = makeSymbol("PRINT-FORMULA-TEMPLATE");

    private static final SubLSymbol FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORMULA-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list103 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORMULA-TEMPLATE-P"));

    private static final SubLSymbol FORMULA_TEMPLATE_TOPIC = makeSymbol("FORMULA-TEMPLATE-TOPIC");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_TOPIC = makeSymbol("_CSETF-FORMULA-TEMPLATE-TOPIC");

    private static final SubLSymbol FORMULA_TEMPLATE_ID = makeSymbol("FORMULA-TEMPLATE-ID");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_ID = makeSymbol("_CSETF-FORMULA-TEMPLATE-ID");

    private static final SubLSymbol FORMULA_TEMPLATE_FORMULA = makeSymbol("FORMULA-TEMPLATE-FORMULA");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_FORMULA = makeSymbol("_CSETF-FORMULA-TEMPLATE-FORMULA");

    private static final SubLSymbol FORMULA_TEMPLATE_QUERY_SPECIFICATION = makeSymbol("FORMULA-TEMPLATE-QUERY-SPECIFICATION");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION = makeSymbol("_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION");

    private static final SubLSymbol FORMULA_TEMPLATE_ELMT = makeSymbol("FORMULA-TEMPLATE-ELMT");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_ELMT = makeSymbol("_CSETF-FORMULA-TEMPLATE-ELMT");

    private static final SubLSymbol FORMULA_TEMPLATE_FOCAL_TERM = makeSymbol("FORMULA-TEMPLATE-FOCAL-TERM");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_FOCAL_TERM = makeSymbol("_CSETF-FORMULA-TEMPLATE-FOCAL-TERM");

    private static final SubLSymbol FORMULA_TEMPLATE_ARGPOS_DETAILS = makeSymbol("FORMULA-TEMPLATE-ARGPOS-DETAILS");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS = makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS");

    private static final SubLSymbol FORMULA_TEMPLATE_ARGPOS_ORDERING = makeSymbol("FORMULA-TEMPLATE-ARGPOS-ORDERING");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING = makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING");

    private static final SubLSymbol FORMULA_TEMPLATE_EXAMPLES = makeSymbol("FORMULA-TEMPLATE-EXAMPLES");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EXAMPLES = makeSymbol("_CSETF-FORMULA-TEMPLATE-EXAMPLES");

    private static final SubLSymbol FORMULA_TEMPLATE_ENTRY_FORMAT = makeSymbol("FORMULA-TEMPLATE-ENTRY-FORMAT");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT = makeSymbol("_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT");

    private static final SubLSymbol FORMULA_TEMPLATE_FOLLOW_UPS = makeSymbol("FORMULA-TEMPLATE-FOLLOW-UPS");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_FOLLOW_UPS = makeSymbol("_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS");

    private static final SubLSymbol FORMULA_TEMPLATE_GLOSS = makeSymbol("FORMULA-TEMPLATE-GLOSS");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_GLOSS = makeSymbol("_CSETF-FORMULA-TEMPLATE-GLOSS");

    private static final SubLSymbol FORMULA_TEMPLATE_REFSPEC = makeSymbol("FORMULA-TEMPLATE-REFSPEC");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_REFSPEC = makeSymbol("_CSETF-FORMULA-TEMPLATE-REFSPEC");























    private static final SubLSymbol MAKE_FORMULA_TEMPLATE = makeSymbol("MAKE-FORMULA-TEMPLATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-METHOD");

    private static final SubLString $str143$182b1140_d871_11d9_8eef_0002b3891 = makeString("182b1140-d871-11d9-8eef-0002b3891c5a");

    private static final SubLSymbol CFASL_INPUT_FORMULA_TEMPLATE = makeSymbol("CFASL-INPUT-FORMULA-TEMPLATE");



    private static final SubLList $list146 = list(list(makeSymbol("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*"), T));



    private static final SubLSymbol REUSING_RKF_SD_PROBLEM_STORE = makeSymbol("REUSING-RKF-SD-PROBLEM-STORE");



    private static final SubLList $list150 = list(list(makeSymbol("NON-EDITABLES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $non_editable_assertions_for_template_topic_instance$ = makeSymbol("*NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE*");



    private static final SubLList $list153 = list(makeSymbol("SET-P"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list156 = list(list(makeSymbol("INSTANCE"), makeSymbol("TEMPLATE-ID"), makeSymbol("TEMPLATE-ELMT"), makeSymbol("QUERY-MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym157$NON_EDITABLE = makeUninternedSymbol("NON-EDITABLE");

    private static final SubLSymbol COMPUTE_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE = makeSymbol("COMPUTE-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");

    private static final SubLSymbol WITH_KNOWN_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE = makeSymbol("WITH-KNOWN-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");

    private static final SubLString $str160$_S_is_not_a_FORMULA_TEMPLATE_P_ = makeString("~S is not a FORMULA-TEMPLATE-P.");

    private static final SubLString $str161$_S_is_not_EL_FORMULA_P_ = makeString("~S is not EL-FORMULA-P.");

    private static final SubLString $str162$_S_is_not_POSSIBLY_MT_P_ = makeString("~S is not POSSIBLY-MT-P.");

    private static final SubLString $str163$bad_formula_template___S__ = makeString("bad formula template: ~S~%");







    private static final SubLString $str167$_TemplateTopic__ = makeString("<TemplateTopic: ");

    private static final SubLString $str168$Parent___S___Topic___S_ = makeString("Parent: ~S : Topic: ~S ");

    private static final SubLString $$$_named_ = makeString(" named ");

    private static final SubLString $str170$_Term_Prefix__ = makeString(" Term Prefix: ");

    private static final SubLString $str171$___SubTopics__ = makeString(" : SubTopics: ");

    private static final SubLString $str172$___Sources__ = makeString(" : Sources: ");

    private static final SubLString $str173$___Template_Source_Mt__ = makeString(" : Template Source Mt: ");

    private static final SubLString $str174$___Template_Query_Mt__ = makeString(" : Template Query Mt: ");

    private static final SubLString $str175$___Template_Definitional_Mt__ = makeString(" : Template Definitional Mt: ");

    private static final SubLString $str176$___Templates_ = makeString(" : Templates:");

    private static final SubLString $str177$____introductory_template__ = makeString(" (= introductory template) ");

    private static final SubLString $str178$_ = makeString(">");

    private static final SubLList $list179 = list(list(makeSymbol("LOCAL-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC?")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list181 = list(NIL, NIL, list(makeSymbol("FORMULA-TEMPLATE-NAMESPACE")));

    private static final SubLList $list182 = list(list(makeSymbol("*CYCL-QUERY-INCLUDE-NAMESPACE?*"), makeSymbol("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*")), list(makeSymbol("*CYCML-INCLUDE-NAMESPACE?*"), makeSymbol("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*")));

    private static final SubLList $list183 = list(list(TWO_INTEGER, makeString("Adds support for default namespace")), list(ONE_INTEGER, makeString("Adds <templateTopicRevision> to <templateTopic>")), list(ZERO_INTEGER, makeString("Initial version")));

    private static final SubLString $$$templateTopic = makeString("templateTopic");

    private static final SubLString $$$templateTopicRevision = makeString("templateTopicRevision");

    private static final SubLString $$$topic = makeString("topic");

    private static final SubLString $$$superTopic = makeString("superTopic");

    private static final SubLString $$$title = makeString("title");

    private static final SubLString $$$termPrefix = makeString("termPrefix");

    private static final SubLString $$$introductoryTemplate = makeString("introductoryTemplate");

    private static final SubLString $$$subTopics = makeString("subTopics");

    private static final SubLString $$$subTopic = makeString("subTopic");

    private static final SubLString $$$sourcesOfTopic = makeString("sourcesOfTopic");

    private static final SubLString $$$sourceOfTopic = makeString("sourceOfTopic");

    private static final SubLString $$$templateSourceMt = makeString("templateSourceMt");

    private static final SubLString $$$templateQueryMt = makeString("templateQueryMt");

    private static final SubLString $$$templateDefinitionalMt = makeString("templateDefinitionalMt");

    private static final SubLString $$$formulaTemplates = makeString("formulaTemplates");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TEMPLATE-TOPIC-METHOD");

    private static final SubLSymbol VALID_FORMULA_TEMPLATE_P = makeSymbol("VALID-FORMULA-TEMPLATE-P");

    private static final SubLString $str201$CFASL_INPUT_TEMPLATE_TOPIC_has_lo = makeString("CFASL-INPUT-TEMPLATE-TOPIC has loaded a subtopic for ~A which claims to belong to ~A");

    private static final SubLObject $$SingleAssertionEntry = reader_make_constant_shell(makeString("SingleAssertionEntry"));

    private static final SubLObject $$MultipleAssertionEntry = reader_make_constant_shell(makeString("MultipleAssertionEntry"));

    private static final SubLString $str204$_Formula_Template__ = makeString("<Formula Template: ");

    private static final SubLString $str205$_A_ = makeString("~A ");

    private static final SubLString $str206$of_topic__A__ = makeString("of topic ~A~%");

    private static final SubLString $str207$_formula__A_in__A__ = makeString(" formula ~A in ~A~%");

    private static final SubLString $str208$_query_spec__A_in__A__ = makeString(" query-spec ~A in ~A~%");

    private static final SubLString $str209$_focal_term__A___A___ = makeString(" focal term ~A (~A)~%");

    private static final SubLString $str210$_focal_term_occurrences__A___A___ = makeString(" focal term occurrences ~A (~A)~%");

    private static final SubLString $str211$_examples___A__ = makeString(" examples: ~A~%");

    private static final SubLString $str212$_follow_ups___A__ = makeString(" follow-ups: ~A~%");

    private static final SubLString $str213$_template_gloss___A__ = makeString(" template gloss: ~A~%");

    private static final SubLString $str214$_reformulation_specification___A_ = makeString(" reformulation specification: ~A~%");

    private static final SubLString $str215$_argpos_details__ = makeString(" argpos-details: ");

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLSymbol $sym218$ISA_MT_ = makeSymbol("ISA-MT?");



    private static final SubLSymbol NEW_CYCL_QUERY_SPECIFICATION_P = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-P");

    private static final SubLString $$$formulaTemplate = makeString("formulaTemplate");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$formula = makeString("formula");

    private static final SubLString $$$elmt = makeString("elmt");

    private static final SubLString $$$focalTerm = makeString("focalTerm");

    private static final SubLString $$$argPositions = makeString("argPositions");

    private static final SubLString $$$singleEntry = makeString("singleEntry");



    private static final SubLString $$$multipleEntry = makeString("multipleEntry");

    private static final SubLString $$$usageExamples = makeString("usageExamples");

    private static final SubLString $$$example = makeString("example");

    private static final SubLString $$$glossForTemplate = makeString("glossForTemplate");

    private static final SubLString $$$followUps = makeString("followUps");

    private static final SubLString $$$followUp = makeString("followUp");

    private static final SubLList $list235 = list(makeSymbol("TERM"), makeSymbol("CONNECTIVE"), makeSymbol("LOAD-MT"));

    private static final SubLString $$$templateId = makeString("templateId");

    private static final SubLString $$$connective = makeString("connective");

    private static final SubLString $$$loadMt = makeString("loadMt");

    private static final SubLString $$$reformulationSpecification = makeString("reformulationSpecification");

    private static final SubLString $$$argumentPositionDetails = makeString("argumentPositionDetails");

    private static final SubLString $str241$http___dev_cyc_com_dtd_formulatem = makeString("http://dev.cyc.com/dtd/formulatemplate.dtd");

    private static final SubLString $str242$__xml_version__1_0__encoding__US_ = makeString("<?xml version=\"1.0\" encoding=\"US-ASCII\" standalone=\"no\"?>");

    private static final SubLString $str243$__DOCTYPE_formulaTemplate_SYSTEM_ = makeString("<!DOCTYPE formulaTemplate SYSTEM ~S>");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FORMULA-TEMPLATE-METHOD");

    private static final SubLString $str245$__ArgPos_Details__ = makeString("#<ArgPos-Details: ");

    private static final SubLString $str246$_for_position__A_ = makeString(" for position ~A ");

    private static final SubLString $str247$__ordering_slot__D_ = makeString(" (ordering slot ~D)");

    private static final SubLString $str248$__no_ordering_info_ = makeString(" (no ordering info)");

    private static final SubLString $str249$_READ_ONLY = makeString(" READ-ONLY");

    private static final SubLString $str250$_gloss___A__ = makeString(" gloss: ~A~%");

    private static final SubLString $str251$_replacementInvisible___A__ = makeString(" replacementInvisible: ~A~%");

    private static final SubLString $str252$_candidate_replacements___A__ = makeString(" candidate replacements: ~A~%");

    private static final SubLString $str253$_constraints___A__ = makeString(" constraints: ~A~%");

    private static final SubLString $str254$__requires_validation____ = makeString(" [requires validation] ~%");

    private static final SubLString $str255$_explanation___A__ = makeString(" explanation: ~A~%");

    private static final SubLString $str256$_term_for_unknown___A__ = makeString(" term for unknown: ~A~%");

    private static final SubLString $$$argumentPositionDetail = makeString("argumentPositionDetail");

    private static final SubLString $$$ordering = makeString("ordering");

    private static final SubLString $$$glossText = makeString("glossText");

    private static final SubLString $$$candidateReplacementsForPosition = makeString("candidateReplacementsForPosition");

    private static final SubLString $$$candidateReplacementForPosition = makeString("candidateReplacementForPosition");

    private static final SubLString $str262$templateReplacementsInvisibleForP = makeString("templateReplacementsInvisibleForPosition");

    private static final SubLString $$$isEditable = makeString("isEditable");

    private static final SubLString $$$validationRequired = makeString("validationRequired");

    private static final SubLString $$$explanation = makeString("explanation");

    private static final SubLString $$$unknownTermForTemplatePosition = makeString("unknownTermForTemplatePosition");

    private static final SubLString $$$constraintsOnReplacement = makeString("constraintsOnReplacement");

    private static final SubLString $$$constraintOnReplacement = makeString("constraintOnReplacement");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-ARG-POSITION-DETAILS-METHOD");

    private static final SubLString $$$argPosition = makeString("argPosition");

    private static final SubLString $$$position = makeString("position");



    private static final SubLString $str273$Can_t_load_a_formula_template_wit = makeString("Can't load a formula template without a FORT id: ~S");

    private static final SubLObject $const274$formulaTemplateHasArgumentPositio = reader_make_constant_shell(makeString("formulaTemplateHasArgumentPositionInformation"));

    private static final SubLList $list275 = list(makeSymbol("GLOSS-TEXT"), makeSymbol("ARGPOS"), makeSymbol("ORDERING"));

    public static final SubLList $list276 = list(makeSymbol("EXPLANATION-TEXT"), makeSymbol("ARGPOS"));

    private static final SubLList $list277 = list(makeSymbol("ARGPOS"), makeSymbol("REPLACE-CONSTRAINTS"));

    private static final SubLList $list278 = list(makeSymbol("ARGPOS"), makeSymbol("CANDIDATES"));

    public static final SubLList $list279 = list(makeSymbol("ARGPOS"), makeSymbol("THING"));

    private static final SubLSymbol ORDERED_BY_ARGUMENT_POSITION = makeSymbol("ORDERED-BY-ARGUMENT-POSITION");

    private static final SubLSymbol $sym281$_ = makeSymbol("<");

    private static final SubLSymbol POSSIBLY_FO_REPRESENTED_TERM_P = makeSymbol("POSSIBLY-FO-REPRESENTED-TERM-P");

    private static final SubLString $str283$Dwimming_MT_for__A_to__A____your_ = makeString("Dwimming MT for ~A to ~A -- your own fault.");

    private static final SubLList $list284 = list(TWO_INTEGER);

    private static final SubLObject $const285$reformulateTemplateViaSpecificati = reader_make_constant_shell(makeString("reformulateTemplateViaSpecification"));

    private static final SubLObject $$TemplateFromTestQueryFn = reader_make_constant_shell(makeString("TemplateFromTestQueryFn"));

    private static final SubLObject $const287$querySpecificationForFormulaTempl = reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate"));

    private static final SubLObject $$formulaForFormulaTemplate = reader_make_constant_shell(makeString("formulaForFormulaTemplate"));

    private static final SubLObject $$assertMtForFormulaTemplate = reader_make_constant_shell(makeString("assertMtForFormulaTemplate"));

    private static final SubLObject $$formulaTemplateFollowUp = reader_make_constant_shell(makeString("formulaTemplateFollowUp"));

    private static final SubLSymbol $sym291$COMMUTATIVE_RELATION_ = makeSymbol("COMMUTATIVE-RELATION?");



    private static final SubLList $list293 = list(makeSymbol("FOLLOW-UP"), makeSymbol("CONNECTIVE"));

    private static final SubLObject $$formulaTemplateGloss = reader_make_constant_shell(makeString("formulaTemplateGloss"));



    private static final SubLList $list296 = list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), reader_make_constant_shell(makeString("Now")), reader_make_constant_shell(makeString("CalendarSecond")));

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLList $list298 = list(FOUR_INTEGER, THREE_INTEGER, FIVE_INTEGER);

    private static final SubLObject $$glossForFormulaTemplate = reader_make_constant_shell(makeString("glossForFormulaTemplate"));

    public static final SubLList $list300 = list(FOUR_INTEGER, THREE_INTEGER);

    private static final SubLObject $$formulaTemplateArgExplanation = reader_make_constant_shell(makeString("formulaTemplateArgExplanation"));

    private static final SubLObject $$formulaTemplateExample = reader_make_constant_shell(makeString("formulaTemplateExample"));



    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));



    private static final SubLSymbol $kw306$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");











    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $const314$focalTermPositionForFormulaTempla = reader_make_constant_shell(makeString("focalTermPositionForFormulaTemplate"));

    private static final SubLObject $$assertionFormatForFormulaTemplate = reader_make_constant_shell(makeString("assertionFormatForFormulaTemplate"));

    private static final SubLObject $const316$templateReplacementsInvisibleForP = reader_make_constant_shell(makeString("templateReplacementsInvisibleForPosition"));

    public static final SubLList $list317 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLObject $$constraintOnReplacement = reader_make_constant_shell(makeString("constraintOnReplacement"));

    private static final SubLList $list319 = list(makeSymbol("POSITION"), makeSymbol("CONSTRAINT"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLSymbol $sym321$_X = makeSymbol("?X");

    private static final SubLObject $$unknownTermForTemplatePosition = reader_make_constant_shell(makeString("unknownTermForTemplatePosition"));

    private static final SubLObject $$candidateReplacementForPosition = reader_make_constant_shell(makeString("candidateReplacementForPosition"));

    public static final SubLList $list324 = list(makeSymbol("POSITION"), makeSymbol("CANDIDATE"));

    private static final SubLObject $const325$positionInFormulaTemplateIsReplac = reader_make_constant_shell(makeString("positionInFormulaTemplateIsReplaceable"));

    private static final SubLObject $const326$validationRequiredOnTemplatePosit = reader_make_constant_shell(makeString("validationRequiredOnTemplatePosition"));

    private static final SubLObject $$InducedFormulaTemplateTopicType = reader_make_constant_shell(makeString("InducedFormulaTemplateTopicType"));



    private static final SubLSymbol $sym329$HIGHER_PRIORITY_ = makeSymbol("HIGHER-PRIORITY?");

    private static final SubLSymbol FORT_SORT_PRED = makeSymbol("FORT-SORT-PRED");

    private static final SubLList $list331 = list(makeSymbol("HIGHER"), makeSymbol("LOWER"));

    private static final SubLString $str332$higherPriorityTemplateTypeForTopi = makeString("higherPriorityTemplateTypeForTopicType");

    private static final SubLList $list333 = list(makeSymbol("?HIGHER"), makeSymbol("?LOWER"));

    private static final SubLSymbol $sym334$_HIGHER = makeSymbol("?HIGHER");

    private static final SubLSymbol $sym335$_LOWER = makeSymbol("?LOWER");

    private static final SubLList $list336 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER);

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list338 = list(reader_make_constant_shell(makeString("higherPriorityTemplateType")), makeSymbol("?HIGHER"), makeSymbol("?LOWER"));

    private static final SubLList $list339 = list(reader_make_constant_shell(makeString("different")), makeSymbol("?HIGHER"), makeSymbol("?LOWER"));

    private static final SubLObject $$formulaTemplateTypeHasTopicType = reader_make_constant_shell(makeString("formulaTemplateTypeHasTopicType"));

    private static final SubLList $list341 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    private static final SubLObject $$higherPriorityTemplateForType = reader_make_constant_shell(makeString("higherPriorityTemplateForType"));

    private static final SubLSymbol STABLE_TEMPLATE_ID_COMPARE = makeSymbol("STABLE-TEMPLATE-ID-COMPARE");





    private static final SubLString $str346$Invalid_formula_template__A_in_to = makeString("Invalid formula template ~A in topic ~A: template topic query mt ~A cannot see formula template mt ~A");

    private static final SubLString $$$FactivoreTab = makeString("FactivoreTab");

    private static final SubLObject $$FormulaTemplateTopicType = reader_make_constant_shell(makeString("FormulaTemplateTopicType"));

    private static final SubLObject $$FirstOrderCollection = reader_make_constant_shell(makeString("FirstOrderCollection"));

    private static final SubLSymbol $sym350$_TEMPLATE = makeSymbol("?TEMPLATE");

    private static final SubLObject $$formulaTemplateHasType = reader_make_constant_shell(makeString("formulaTemplateHasType"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $sym353$_ = makeSymbol(">");

    private static final SubLSymbol COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE = makeSymbol("COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE");

    private static final SubLList $list355 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $sym356$_SUBTOPIC = makeSymbol("?SUBTOPIC");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    private static final SubLSymbol $sym359$_MT = makeSymbol("?MT");

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    public static final SubLList $list361 = list(makeSymbol("?VOCABULARY-MT"));

    private static final SubLList $list362 = list(list(reader_make_constant_shell(makeString("genlMt-Vocabulary")), makeSymbol("?MT"), makeSymbol("?VOCABULARY-MT")));

    private static final SubLObject $$DataForNLMt = reader_make_constant_shell(makeString("DataForNLMt"));

    private static final SubLSymbol FORT_OR_NAUT_P = makeSymbol("FORT-OR-NAUT-P");

    private static final SubLObject $$sourcesForTopic = reader_make_constant_shell(makeString("sourcesForTopic"));

    private static final SubLObject $$focalTermIntroduction = reader_make_constant_shell(makeString("focalTermIntroduction"));

    private static final SubLObject $const367$titleForFormulaTemplateType_Strin = reader_make_constant_shell(makeString("titleForFormulaTemplateType-String"));

    private static final SubLObject $$templateTopicPrefix = reader_make_constant_shell(makeString("templateTopicPrefix"));

    private static final SubLObject $$queryMtForTopicAssertions = reader_make_constant_shell(makeString("queryMtForTopicAssertions"));

    private static final SubLObject $$definitionalMtForTopicAssertions = reader_make_constant_shell(makeString("definitionalMtForTopicAssertions"));



    private static final SubLList $list372 = list(list(TWO_INTEGER, makeString("Adds support for default namespace")), list(ONE_INTEGER, makeString("Adds <templateTopicAssertionsRevision> to <knownAssertionsForTemplateTopic>\n          Adds <knownAssertionSUIDs> to <knownAssertion>\n          Adds <assertion-id> to <knownAssertionSUIDs>\n          Adds <bookkeeping-info> to <knownAssertion>\n          Adds <date> to <bookkeeping-info>\n          Adds <time> to <bookkeeping-info>\n          Adds <knownAssertionEvaluations> to <knownAssertion>\n          Adds <knownAssertionEvaluation> to <knownAssertionEvaluations>\n          Adds <evaluator> to <knownAssertionEvaluation>\n          Adds <judgment> to <knownAssertionEvaluation>")), list(ZERO_INTEGER, makeString("Initial version")));

    private static final SubLString $$$knownAssertionsForTemplateTopic = makeString("knownAssertionsForTemplateTopic");

    private static final SubLString $$$queryELMt = makeString("queryELMt");

    private static final SubLString $$$templateInstance = makeString("templateInstance");

    private static final SubLString $$$templateTopicAssertionsRevision = makeString("templateTopicAssertionsRevision");

    private static final SubLString $str377$knownAssertionsForTemplateSubTopi = makeString("knownAssertionsForTemplateSubTopics");

    private static final SubLList $list378 = list(makeSymbol("SUBTOPIC-ID"), makeSymbol("TEMPLATE-RESULT-SETS"));

    private static final SubLString $str379$knownAssertionsForTemplateSubTopi = makeString("knownAssertionsForTemplateSubTopic");

    private static final SubLString $str380$knownAssertionsForFormulaTemplate = makeString("knownAssertionsForFormulaTemplates");

    private static final SubLList $list381 = list(makeSymbol("TEMPLATE-ID"), makeSymbol("ASSERTIONS"));

    private static final SubLString $$$knownAssertionsForFormulaTemplate = makeString("knownAssertionsForFormulaTemplate");

    private static final SubLString $$$assertionsMatchTemplate = makeString("assertionsMatchTemplate");

    private static final SubLString $$$knownAssertions = makeString("knownAssertions");

    private static final SubLString $str385$Problem_serializing_assertions_fo = makeString("Problem serializing assertions for ");

    private static final SubLSymbol $sym386$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLString $$$Invalid_return_object_ = makeString("Invalid return object ");

    private static final SubLString $$$_in_assertion_list = makeString(" in assertion list");

    private static final SubLString $$$knownAssertion = makeString("knownAssertion");

    private static final SubLString $$$deducedAssertion = makeString("deducedAssertion");

    private static final SubLString $$$knownAssertionSUIDs = makeString("knownAssertionSUIDs");

    private static final SubLString $$$knownAssertionEvaluations = makeString("knownAssertionEvaluations");

    private static final SubLList $list393 = list(makeSymbol("EVALUATION"), makeSymbol("EVALUATOR"));

    private static final SubLString $$$knownAssertionEvaluation = makeString("knownAssertionEvaluation");

    private static final SubLString $$$evaluator = makeString("evaluator");

    private static final SubLString $$$judgment = makeString("judgment");

    private static final SubLString $$$evaluationOfAssertionByOn = makeString("evaluationOfAssertionByOn");

    private static final SubLString $$$evaluationOfAssertionOfByOn = makeString("evaluationOfAssertionOfByOn");

    private static final SubLList $list399 = list(makeSymbol("?EVAL"), makeSymbol("?BY"));

    private static final SubLSymbol $sym400$_EVAL = makeSymbol("?EVAL");

    public static final SubLList $list401 = list(makeSymbol("?BY"), makeSymbol("??ON"));

    private static final SubLList $list402 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol $sym403$_JUDGMENT = makeSymbol("?JUDGMENT");

    private static final SubLObject $$evaluationOutputSentences = reader_make_constant_shell(makeString("evaluationOutputSentences"));

    private static final SubLList $list405 = list(list(makeSymbol("?JUDGMENT"), makeSymbol("?SENTENCE")));

    private static final SubLString $$$knownAssertionELMt = makeString("knownAssertionELMt");

    private static final SubLString $$$knownAssertionCW = makeString("knownAssertionCW");

    private static final SubLSymbol MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK = makeSymbol("MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK");



    private static final SubLObject $$contextOfPCW = reader_make_constant_shell(makeString("contextOfPCW"));

    private static final SubLSymbol $map_elmt_to_published_conceptual_work_caching_state$ = makeSymbol("*MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-CACHING-STATE*");

    private static final SubLList $list412 = list(new SubLObject[]{ makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"), makeSymbol("?F"), makeSymbol("?G"), makeSymbol("?H"), makeSymbol("?J"), makeSymbol("?K"), makeSymbol("?L"), makeSymbol("?M"), makeSymbol("?N"), makeSymbol("?O"), makeSymbol("?P"), makeSymbol("?Q"), makeSymbol("?R"), makeSymbol("?S"), makeSymbol("?T"), makeSymbol("?U"), makeSymbol("?V"), makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z") });

    private static final SubLSymbol $sym413$_POLY_ELMT = makeSymbol("?POLY-ELMT");

    private static final SubLObject $$ist_Intermediate = reader_make_constant_shell(makeString("ist-Intermediate"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLObject $$RKFInteractionContextMicrotheory = reader_make_constant_shell(makeString("RKFInteractionContextMicrotheory"));

    private static final SubLSymbol $sym417$__REFSPEC = makeSymbol("??REFSPEC");

    private static final SubLSymbol $sym418$__ASSERTION = makeSymbol("??ASSERTION");





    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $kw424$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");



    private static final SubLList $list426 = cons(makeSymbol("VARIABLE"), makeSymbol("TERM"));

    private static final SubLSymbol $sym427$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");

    private static final SubLSymbol EL_TERM_P = makeSymbol("EL-TERM-P");





    private static final SubLSymbol FTEMPLATE_POLYCANONICALIZED_ASSERTION_P = makeSymbol("FTEMPLATE-POLYCANONICALIZED-ASSERTION-P");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLList $list434 = list(makeSymbol("IST-PART"), makeSymbol("MT-PART"), makeSymbol("FORMULA-PART"));

    private static final SubLSymbol $sym435$_FET_ASSERTION_VAR_524 = makeSymbol("?FET-ASSERTION-VAR-524");

    public static final SubLList $list436 = list(makeSymbol("QUANTIFIER"), makeSymbol("VARIABLE"), makeSymbol("CLAUSES"));

    private static final SubLObject $$assertionSentence = reader_make_constant_shell(makeString("assertionSentence"));

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLObject $$assertionProducedByReformulation = reader_make_constant_shell(makeString("assertionProducedByReformulation"));

    private static final SubLList $list440 = list(list(reader_make_constant_shell(makeString("SomeExampleFn")), reader_make_constant_shell(makeString("TimeInterval"))));

    private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));

    private static final SubLObject $$SomeExampleFn = reader_make_constant_shell(makeString("SomeExampleFn"));

    private static final SubLObject $$SomeExampleSpecFn = reader_make_constant_shell(makeString("SomeExampleSpecFn"));

    private static final SubLObject $$defnIff = reader_make_constant_shell(makeString("defnIff"));

    private static final SubLObject $$defnSufficient = reader_make_constant_shell(makeString("defnSufficient"));



    private static final SubLList $list447 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("LEXICAL-MT"), reader_make_constant_shell(makeString("TemporaryLexicalMicrotheory")));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject template_topic_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_template_topic(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject template_topic_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$template_topic_native.class ? T : NIL;
    }

    public static SubLObject template_topic_supertopic(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject template_topic_topic(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject template_topic_subtopics(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject template_topic_templates(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject template_topic_ordering(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject template_topic_title(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject template_topic_term_prefix(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject template_topic_intro_template(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject template_topic_source_types(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject template_topic_source_mt(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject template_topic_query_mt(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject template_topic_definitional_mt(final SubLObject v_object) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_template_topic_supertopic(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_template_topic_topic(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_template_topic_subtopics(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_template_topic_templates(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_template_topic_ordering(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_template_topic_title(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_template_topic_term_prefix(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_template_topic_intro_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_template_topic_source_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_template_topic_source_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_template_topic_query_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_template_topic_definitional_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != template_topic_p(v_object) : "formula_templates.template_topic_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_template_topic(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $template_topic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUPERTOPIC)) {
                _csetf_template_topic_supertopic(v_new, current_value);
            } else
                if (pcase_var.eql($TOPIC)) {
                    _csetf_template_topic_topic(v_new, current_value);
                } else
                    if (pcase_var.eql($SUBTOPICS)) {
                        _csetf_template_topic_subtopics(v_new, current_value);
                    } else
                        if (pcase_var.eql($TEMPLATES)) {
                            _csetf_template_topic_templates(v_new, current_value);
                        } else
                            if (pcase_var.eql($ORDERING)) {
                                _csetf_template_topic_ordering(v_new, current_value);
                            } else
                                if (pcase_var.eql($TITLE)) {
                                    _csetf_template_topic_title(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TERM_PREFIX)) {
                                        _csetf_template_topic_term_prefix(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($INTRO_TEMPLATE)) {
                                            _csetf_template_topic_intro_template(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($SOURCE_TYPES)) {
                                                _csetf_template_topic_source_types(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SOURCE_MT)) {
                                                    _csetf_template_topic_source_mt(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($QUERY_MT)) {
                                                        _csetf_template_topic_query_mt(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($DEFINITIONAL_MT)) {
                                                            _csetf_template_topic_definitional_mt(v_new, current_value);
                                                        } else {
                                                            Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_template_topic(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TEMPLATE_TOPIC, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUPERTOPIC, template_topic_supertopic(obj));
        funcall(visitor_fn, obj, $SLOT, $TOPIC, template_topic_topic(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBTOPICS, template_topic_subtopics(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATES, template_topic_templates(obj));
        funcall(visitor_fn, obj, $SLOT, $ORDERING, template_topic_ordering(obj));
        funcall(visitor_fn, obj, $SLOT, $TITLE, template_topic_title(obj));
        funcall(visitor_fn, obj, $SLOT, $TERM_PREFIX, template_topic_term_prefix(obj));
        funcall(visitor_fn, obj, $SLOT, $INTRO_TEMPLATE, template_topic_intro_template(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_TYPES, template_topic_source_types(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_MT, template_topic_source_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_MT, template_topic_query_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINITIONAL_MT, template_topic_definitional_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_TEMPLATE_TOPIC, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_template_topic_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_template_topic(obj, visitor_fn);
    }

    public static SubLObject arg_position_details_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_arg_position_details(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject arg_position_details_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$arg_position_details_native.class ? T : NIL;
    }

    public static SubLObject arg_position_details_argument_position(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject arg_position_details_ordering(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject arg_position_details_gloss(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject arg_position_details_invisible_replacement_positions(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject arg_position_details_replacement_constraints(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject arg_position_details_candidate_replacements(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject arg_position_details_is_editable(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject arg_position_details_explanation(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject arg_position_details_requires_validation(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject arg_position_details_unknown_replacement(final SubLObject v_object) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_arg_position_details_argument_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_arg_position_details_ordering(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_arg_position_details_gloss(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_arg_position_details_invisible_replacement_positions(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_arg_position_details_replacement_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_arg_position_details_candidate_replacements(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_arg_position_details_is_editable(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_arg_position_details_explanation(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_arg_position_details_requires_validation(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_arg_position_details_unknown_replacement(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_position_details_p(v_object) : "formula_templates.arg_position_details_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_arg_position_details(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $arg_position_details_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ARGUMENT_POSITION)) {
                _csetf_arg_position_details_argument_position(v_new, current_value);
            } else
                if (pcase_var.eql($ORDERING)) {
                    _csetf_arg_position_details_ordering(v_new, current_value);
                } else
                    if (pcase_var.eql($GLOSS)) {
                        _csetf_arg_position_details_gloss(v_new, current_value);
                    } else
                        if (pcase_var.eql($INVISIBLE_REPLACEMENT_POSITIONS)) {
                            _csetf_arg_position_details_invisible_replacement_positions(v_new, current_value);
                        } else
                            if (pcase_var.eql($REPLACEMENT_CONSTRAINTS)) {
                                _csetf_arg_position_details_replacement_constraints(v_new, current_value);
                            } else
                                if (pcase_var.eql($CANDIDATE_REPLACEMENTS)) {
                                    _csetf_arg_position_details_candidate_replacements(v_new, current_value);
                                } else
                                    if (pcase_var.eql($IS_EDITABLE)) {
                                        _csetf_arg_position_details_is_editable(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($EXPLANATION)) {
                                            _csetf_arg_position_details_explanation(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($REQUIRES_VALIDATION)) {
                                                _csetf_arg_position_details_requires_validation(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($UNKNOWN_REPLACEMENT)) {
                                                    _csetf_arg_position_details_unknown_replacement(v_new, current_value);
                                                } else {
                                                    Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_arg_position_details(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ARG_POSITION_DETAILS, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ARGUMENT_POSITION, arg_position_details_argument_position(obj));
        funcall(visitor_fn, obj, $SLOT, $ORDERING, arg_position_details_ordering(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOSS, arg_position_details_gloss(obj));
        funcall(visitor_fn, obj, $SLOT, $INVISIBLE_REPLACEMENT_POSITIONS, arg_position_details_invisible_replacement_positions(obj));
        funcall(visitor_fn, obj, $SLOT, $REPLACEMENT_CONSTRAINTS, arg_position_details_replacement_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATE_REPLACEMENTS, arg_position_details_candidate_replacements(obj));
        funcall(visitor_fn, obj, $SLOT, $IS_EDITABLE, arg_position_details_is_editable(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPLANATION, arg_position_details_explanation(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRES_VALIDATION, arg_position_details_requires_validation(obj));
        funcall(visitor_fn, obj, $SLOT, $UNKNOWN_REPLACEMENT, arg_position_details_unknown_replacement(obj));
        funcall(visitor_fn, obj, $END, MAKE_ARG_POSITION_DETAILS, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_arg_position_details_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_arg_position_details(obj, visitor_fn);
    }

    public static SubLObject formula_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_formula_template(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject formula_template_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$formula_template_native.class ? T : NIL;
    }

    public static SubLObject formula_template_topic(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject formula_template_id(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject formula_template_formula(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject formula_template_query_specification(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject formula_template_elmt(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject formula_template_focal_term(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject formula_template_argpos_details(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject formula_template_argpos_ordering(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject formula_template_examples(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject formula_template_entry_format(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject formula_template_follow_ups(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject formula_template_gloss(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject formula_template_refspec(final SubLObject v_object) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject _csetf_formula_template_topic(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_formula_template_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_formula_template_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_formula_template_query_specification(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_formula_template_elmt(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_formula_template_focal_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_formula_template_argpos_details(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_formula_template_argpos_ordering(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_formula_template_examples(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_formula_template_entry_format(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_formula_template_follow_ups(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_formula_template_gloss(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_formula_template_refspec(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_p(v_object) : "formula_templates.formula_template_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject make_formula_template(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $formula_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TOPIC)) {
                _csetf_formula_template_topic(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_formula_template_id(v_new, current_value);
                } else
                    if (pcase_var.eql($FORMULA)) {
                        _csetf_formula_template_formula(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERY_SPECIFICATION)) {
                            _csetf_formula_template_query_specification(v_new, current_value);
                        } else
                            if (pcase_var.eql($ELMT)) {
                                _csetf_formula_template_elmt(v_new, current_value);
                            } else
                                if (pcase_var.eql($FOCAL_TERM)) {
                                    _csetf_formula_template_focal_term(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARGPOS_DETAILS)) {
                                        _csetf_formula_template_argpos_details(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ARGPOS_ORDERING)) {
                                            _csetf_formula_template_argpos_ordering(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($EXAMPLES)) {
                                                _csetf_formula_template_examples(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ENTRY_FORMAT)) {
                                                    _csetf_formula_template_entry_format(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($FOLLOW_UPS)) {
                                                        _csetf_formula_template_follow_ups(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($GLOSS)) {
                                                            _csetf_formula_template_gloss(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($REFSPEC)) {
                                                                _csetf_formula_template_refspec(v_new, current_value);
                                                            } else {
                                                                Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_formula_template(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORMULA_TEMPLATE, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TOPIC, formula_template_topic(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, formula_template_id(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, formula_template_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_SPECIFICATION, formula_template_query_specification(obj));
        funcall(visitor_fn, obj, $SLOT, $ELMT, formula_template_elmt(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCAL_TERM, formula_template_focal_term(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGPOS_DETAILS, formula_template_argpos_details(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGPOS_ORDERING, formula_template_argpos_ordering(obj));
        funcall(visitor_fn, obj, $SLOT, $EXAMPLES, formula_template_examples(obj));
        funcall(visitor_fn, obj, $SLOT, $ENTRY_FORMAT, formula_template_entry_format(obj));
        funcall(visitor_fn, obj, $SLOT, $FOLLOW_UPS, formula_template_follow_ups(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOSS, formula_template_gloss(obj));
        funcall(visitor_fn, obj, $SLOT, $REFSPEC, formula_template_refspec(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORMULA_TEMPLATE, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_formula_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_formula_template(obj, visitor_fn);
    }

    public static SubLObject is_ftemplate_loading_supporting_ask_browsableP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($make_ftemplate_loading_supporting_ask_browsableP$.getDynamicValue(thread));
    }

    public static SubLObject with_browsable_ftemplate_loading_supporting_ask(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list146, append(body, NIL));
    }

    public static SubLObject reusing_rkf_sd_problem_store_if_available(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != find($CYC_RKF, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bq_cons(REUSING_RKF_SD_PROBLEM_STORE, append(body, NIL));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject get_non_editable_assertions_for_template_topic_instance() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $non_editable_assertions_for_template_topic_instance$.getDynamicValue(thread);
    }

    public static SubLObject with_known_non_editable_assertions_for_template_topic_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list150);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject non_editables = NIL;
        destructuring_bind_must_consp(current, datum, $list150);
        non_editables = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($non_editable_assertions_for_template_topic_instance$, non_editables)), listS(CHECK_TYPE, non_editables, $list153), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list150);
        return NIL;
    }

    public static SubLObject compute_non_editable_assertions_for_template_topic_instance(final SubLObject instance, final SubLObject template_id, final SubLObject template_elmt, final SubLObject query_mt) {
        final SubLObject non_editables = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject isas = formula_template_utilities.template_type_for_focal_term_types(template_id, template_elmt);
        final SubLObject v_genls = formula_template_utilities.template_topic_genls(template_id, template_elmt);
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = list($$isa, instance, v_isa);
            SubLObject cdolist_list_var_$1 = smarter_find_visible_assertions_cycl(sentence, query_mt);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                set.set_add(assertion, non_editables);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                assertion = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = list($$genls, instance, genl);
            SubLObject cdolist_list_var_$2 = smarter_find_visible_assertions_cycl(sentence, query_mt);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                set.set_add(assertion, non_editables);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                assertion = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return non_editables;
    }

    public static SubLObject is_non_editable_assertion_for_template_topic_instanceP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != set.set_p($non_editable_assertions_for_template_topic_instance$.getDynamicValue(thread))) {
            return set.set_memberP(assertion, $non_editable_assertions_for_template_topic_instance$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject with_non_editable_assertions_for_template_topic_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = NIL;
        SubLObject template_id = NIL;
        SubLObject template_elmt = NIL;
        SubLObject query_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        template_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        template_elmt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        query_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject non_editable = $sym157$NON_EDITABLE;
            return list(CLET, list(list(non_editable, list(COMPUTE_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE, instance, template_id, template_elmt, query_mt))), listS(WITH_KNOWN_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE, list(non_editable), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list156);
        return NIL;
    }

    public static SubLObject valid_formula_template_p(final SubLObject template) {
        SubLObject result = NIL;
        if (NIL == formula_template_p(template)) {
            Errors.warn($str160$_S_is_not_a_FORMULA_TEMPLATE_P_, template);
        } else
            if (((NIL != new_cycl_query_specification.new_cycl_query_specification_p(formula_template_query_specification(template))) && (NIL != el_formula_p(new_cycl_query_specification.new_cycl_query_specification_formula(formula_template_query_specification(template))))) && (NIL != hlmt.possibly_mt_p(new_cycl_query_specification.new_cycl_query_specification_mt(formula_template_query_specification(template))))) {
                result = T;
            } else
                if (NIL == el_formula_p(formula_template_formula(template))) {
                    Errors.warn($str161$_S_is_not_EL_FORMULA_P_, formula_template_formula(template));
                } else
                    if (NIL == hlmt.possibly_mt_p(formula_template_elmt(template))) {
                        Errors.warn($str162$_S_is_not_POSSIBLY_MT_P_, formula_template_elmt(template));
                    } else {
                        result = T;
                    }



        if (NIL == result) {
            Errors.warn($str163$bad_formula_template___S__, template);
        }
        return result;
    }

    public static SubLObject new_template_topic(final SubLObject topic, SubLObject supertopic) {
        if (supertopic == UNPROVIDED) {
            supertopic = NIL;
        }
        final SubLObject tmplt_topic = make_template_topic(UNPROVIDED);
        _csetf_template_topic_topic(tmplt_topic, topic);
        if (NIL != supertopic) {
            _csetf_template_topic_supertopic(tmplt_topic, supertopic);
        }
        return tmplt_topic;
    }

    public static SubLObject template_topic_add_subtopic(final SubLObject tmplt_topic, final SubLObject subtopic) {
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        assert NIL != template_topic_p(subtopic) : "formula_templates.template_topic_p(subtopic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(subtopic) " + subtopic;
        _csetf_template_topic_supertopic(subtopic, tmplt_topic);
        _csetf_template_topic_subtopics(tmplt_topic, cons(subtopic, template_topic_subtopics(tmplt_topic)));
        return tmplt_topic;
    }

    public static SubLObject template_topic_add_template(final SubLObject tmplt_topic, final SubLObject ftemplate) {
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        _csetf_formula_template_topic(ftemplate, tmplt_topic);
        _csetf_template_topic_templates(tmplt_topic, cons(ftemplate, template_topic_templates(tmplt_topic)));
        return tmplt_topic;
    }

    public static SubLObject template_topic_add_title(final SubLObject tmplt_topic, final SubLObject title) {
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        assert NIL != stringp(title) : "Types.stringp(title) " + "CommonSymbols.NIL != Types.stringp(title) " + title;
        _csetf_template_topic_title(tmplt_topic, title);
        return tmplt_topic;
    }

    public static SubLObject template_topic_add_term_prefix(final SubLObject tmplt_topic, final SubLObject term_prefix) {
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        assert NIL != stringp(term_prefix) : "Types.stringp(term_prefix) " + "CommonSymbols.NIL != Types.stringp(term_prefix) " + term_prefix;
        _csetf_template_topic_term_prefix(tmplt_topic, term_prefix);
        return tmplt_topic;
    }

    public static SubLObject template_topic_set_introductory_template(final SubLObject tmplt_topic, final SubLObject v_term) {
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        _csetf_template_topic_intro_template(tmplt_topic, v_term);
        return tmplt_topic;
    }

    public static SubLObject template_topic_set_source_types(final SubLObject tmplt_topic, final SubLObject source_types) {
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        assert NIL != listp(source_types) : "Types.listp(source_types) " + "CommonSymbols.NIL != Types.listp(source_types) " + source_types;
        _csetf_template_topic_source_types(tmplt_topic, source_types);
        return tmplt_topic;
    }

    public static SubLObject print_template_topic(final SubLObject tmplt_topic, final SubLObject stream, final SubLObject depth) {
        write_string($str167$_TemplateTopic__, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str168$Parent___S___Topic___S_, NIL != template_topic_supertopic(tmplt_topic) ? template_topic_topic(template_topic_supertopic(tmplt_topic)) : NIL, template_topic_topic(tmplt_topic));
        if (template_topic_title(tmplt_topic).isString()) {
            write_string($$$_named_, stream, UNPROVIDED, UNPROVIDED);
            write_string(template_topic_title(tmplt_topic), stream, UNPROVIDED, UNPROVIDED);
            princ(CHAR_space, stream);
        }
        if (template_topic_term_prefix(tmplt_topic).isString()) {
            write_string($str170$_Term_Prefix__, stream, UNPROVIDED, UNPROVIDED);
            write_string(template_topic_term_prefix(tmplt_topic), stream, UNPROVIDED, UNPROVIDED);
            princ(CHAR_space, stream);
        }
        if (NIL != template_topic_subtopics(tmplt_topic)) {
            write_string($str171$___SubTopics__, stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = template_topic_subtopics(tmplt_topic);
            SubLObject subtopic = NIL;
            subtopic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(CHAR_space, stream);
                prin1(template_topic_topic(subtopic), stream);
                cdolist_list_var = cdolist_list_var.rest();
                subtopic = cdolist_list_var.first();
            } 
        }
        if (NIL != template_topic_source_types(tmplt_topic)) {
            write_string($str172$___Sources__, stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = template_topic_source_types(tmplt_topic);
            SubLObject source = NIL;
            source = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(CHAR_space, stream);
                prin1(source, stream);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            } 
        }
        if (NIL != template_topic_source_mt(tmplt_topic)) {
            write_string($str173$___Template_Source_Mt__, stream, UNPROVIDED, UNPROVIDED);
            prin1(template_topic_source_mt(tmplt_topic), stream);
        }
        if (NIL != template_topic_query_mt(tmplt_topic)) {
            write_string($str174$___Template_Query_Mt__, stream, UNPROVIDED, UNPROVIDED);
            prin1(template_topic_query_mt(tmplt_topic), stream);
        }
        if (NIL != template_topic_definitional_mt(tmplt_topic)) {
            write_string($str175$___Template_Definitional_Mt__, stream, UNPROVIDED, UNPROVIDED);
            prin1(template_topic_definitional_mt(tmplt_topic), stream);
        }
        if (NIL != template_topic_templates(tmplt_topic)) {
            write_string($str176$___Templates_, stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = template_topic_templates(tmplt_topic);
            SubLObject ftemplate = NIL;
            ftemplate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(CHAR_space, stream);
                prin1(formula_template_id(ftemplate), stream);
                if (formula_template_id(ftemplate).eql(template_topic_intro_template(tmplt_topic))) {
                    princ($str177$____introductory_template__, stream);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ftemplate = cdolist_list_var.first();
            } 
        }
        write_string($str178$_, stream, UNPROVIDED, UNPROVIDED);
        return tmplt_topic;
    }

    public static SubLObject formula_template_xml_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list179);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject local_name = NIL;
        destructuring_bind_must_consp(current, datum, $list179);
        local_name = current.first();
        current = current.rest();
        final SubLObject attributes = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list179);
        current = current.rest();
        final SubLObject atomicP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list179);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(XML_TAG, listS(local_name, attributes, atomicP, $list181), listS(CLET, $list182, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list179);
        return NIL;
    }

    public static SubLObject xml_template_topic_current_revision() {
        return $xml_template_topic_revisions$.getGlobalValue().first().first();
    }

    public static SubLObject xml_serialize_template_topic(final SubLObject tmplt_topic, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != template_topic_p(tmplt_topic) : "formula_templates.template_topic_p(tmplt_topic) " + "CommonSymbols.NIL != formula_templates.template_topic_p(tmplt_topic) " + tmplt_topic;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$templateTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        if (NIL == $xml_suppress_future_template_extensions$.getDynamicValue(thread)) {
                            try {
                                final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$templateTopicRevision, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$10 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_number(xml_template_topic_current_revision(), UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$10, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$7, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$templateTopicRevision);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$topic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$9 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$11 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml_generator.cycml_serialize_fort(template_topic_topic(tmplt_topic));
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$11, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$9, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$topic);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        if (NIL != template_topic_supertopic(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$superTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$12 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml_generator.cycml_serialize_fort(template_topic_topic(template_topic_supertopic(tmplt_topic)));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$12, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$11, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$superTopic);
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_title(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$title, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$13 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$13 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(template_topic_title(tmplt_topic), UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$13, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$13, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$title);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_term_prefix(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$termPrefix, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(template_topic_term_prefix(tmplt_topic), UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$14, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$15, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$14, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$termPrefix);
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_intro_template(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$introductoryTemplate, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$17 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$15 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml_generator.cycml_serialize_fort(template_topic_intro_template(tmplt_topic));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$15, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$17, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values6 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$introductoryTemplate);
                                    restoreValuesFromVector(_values6);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_subtopics(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$subTopics, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$19 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$16 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = template_topic_subtopics(tmplt_topic);
                                        SubLObject subtopic = NIL;
                                        subtopic = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$subTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$21 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$17 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_serialize_template_topic(subtopic, stream);
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$17, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$21, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values7 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$subTopic);
                                                    restoreValuesFromVector(_values7);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            subtopic = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$16, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$19, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values8 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$subTopics);
                                    restoreValuesFromVector(_values8);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_source_types(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$sourcesOfTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$18 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = template_topic_source_types(tmplt_topic);
                                        SubLObject source_type = NIL;
                                        source_type = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$sourceOfTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$25 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$19 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(source_type);
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$19, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$25, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values9 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$sourceOfTopic);
                                                    restoreValuesFromVector(_values9);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            source_type = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$18, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$23, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values10 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$sourcesOfTopic);
                                    restoreValuesFromVector(_values10);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_source_mt(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$templateSourceMt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$27 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$20 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(template_topic_source_mt(tmplt_topic));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$20, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$27, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values11 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$templateSourceMt);
                                    restoreValuesFromVector(_values11);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_query_mt(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$templateQueryMt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$29 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$21 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(template_topic_query_mt(tmplt_topic));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$21, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$29, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values12 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$templateQueryMt);
                                    restoreValuesFromVector(_values12);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_definitional_mt(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$templateDefinitionalMt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$31 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$22 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(template_topic_definitional_mt(tmplt_topic));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$22, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$31, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values13 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$templateDefinitionalMt);
                                    restoreValuesFromVector(_values13);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                }
                            }
                        }
                        if (NIL != template_topic_templates(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$formulaTemplates, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$33 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$23 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = template_topic_templates(tmplt_topic);
                                        SubLObject ftemplate = NIL;
                                        ftemplate = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if (NIL != valid_formula_template_p(ftemplate)) {
                                                xml_serialize_formula_template(ftemplate, stream);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            ftemplate = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$23, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$33, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values14 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$formulaTemplates);
                                    restoreValuesFromVector(_values14);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$5, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values15 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$templateTopic);
                    restoreValuesFromVector(_values15);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return tmplt_topic;
    }

    public static SubLObject cfasl_output_object_template_topic_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_template_topic(v_object, stream);
    }

    public static SubLObject cfasl_output_template_topic(final SubLObject tmplt_topic, final SubLObject stream) {
        write_cfasl_guid_denoted_type_opcode(stream, $cfasl_guid_opcode_template_topic$.getGlobalValue());
        cfasl_output(template_topic_topic(tmplt_topic), stream);
        final SubLObject parent_topic = (NIL != template_topic_p(template_topic_supertopic(tmplt_topic))) ? template_topic_topic(template_topic_supertopic(tmplt_topic)) : NIL;
        cfasl_output(parent_topic, stream);
        cfasl_output(template_topic_title(tmplt_topic), stream);
        cfasl_output(template_topic_term_prefix(tmplt_topic), stream);
        cfasl_output(template_topic_intro_template(tmplt_topic), stream);
        cfasl_output(template_topic_subtopics(tmplt_topic), stream);
        cfasl_output(template_topic_source_types(tmplt_topic), stream);
        cfasl_output(template_topic_source_mt(tmplt_topic), stream);
        cfasl_output(template_topic_query_mt(tmplt_topic), stream);
        cfasl_output(template_topic_definitional_mt(tmplt_topic), stream);
        final SubLObject ftemplates = copy_list(template_topic_templates(tmplt_topic));
        final SubLObject valid_ftemplates = list_utilities.remove_if_not(VALID_FORMULA_TEMPLATE_P, ftemplates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cfasl_output(valid_ftemplates, stream);
        return tmplt_topic;
    }

    public static SubLObject cfasl_input_template_topic(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tmplt_topic = make_template_topic(UNPROVIDED);
        _csetf_template_topic_topic(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_supertopic(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_title(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_term_prefix(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_intro_template(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_subtopics(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_source_types(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_source_mt(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_query_mt(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_definitional_mt(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_template_topic_templates(tmplt_topic, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = template_topic_subtopics(tmplt_topic);
        SubLObject subtopic = NIL;
        subtopic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!template_topic_supertopic(subtopic).eql(template_topic_topic(tmplt_topic)))) {
                Errors.error($str201$CFASL_INPUT_TEMPLATE_TOPIC_has_lo, template_topic_supertopic(subtopic), template_topic_topic(tmplt_topic));
            }
            _csetf_template_topic_supertopic(subtopic, tmplt_topic);
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        } 
        return tmplt_topic;
    }

    public static SubLObject new_formula_template(final SubLObject identifier, SubLObject topic) {
        if (topic == UNPROVIDED) {
            topic = NIL;
        }
        final SubLObject ftemplate = make_formula_template(UNPROVIDED);
        _csetf_formula_template_id(ftemplate, identifier);
        if (NIL != template_topic_p(topic)) {
            template_topic_add_template(topic, ftemplate);
        } else {
            _csetf_formula_template_topic(ftemplate, topic);
        }
        _csetf_formula_template_argpos_details(ftemplate, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return ftemplate;
    }

    public static SubLObject formula_template_is_single_entryP(final SubLObject ftemplate) {
        return eq($$SingleAssertionEntry, formula_template_entry_format(ftemplate));
    }

    public static SubLObject formula_template_is_multiple_entryP(final SubLObject ftemplate) {
        return eq($$MultipleAssertionEntry, formula_template_entry_format(ftemplate));
    }

    public static SubLObject formula_template_has_reformulation_specificationP(final SubLObject ftemplate) {
        return list_utilities.sublisp_boolean(formula_template_refspec(ftemplate));
    }

    public static SubLObject print_formula_template(final SubLObject ftemplate, final SubLObject stream, final SubLObject depth) {
        write_string($str204$_Formula_Template__, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str205$_A_, formula_template_id(ftemplate));
        if (NIL != template_topic_p(formula_template_topic(ftemplate))) {
            format(stream, $str206$of_topic__A__, template_topic_topic(formula_template_topic(ftemplate)));
        } else {
            terpri(stream);
        }
        string_utilities.indent(stream, depth);
        if (NIL != formula_template_formula(ftemplate)) {
            format(stream, $str207$_formula__A_in__A__, formula_template_formula(ftemplate), formula_template_elmt(ftemplate));
        } else {
            format(stream, $str208$_query_spec__A_in__A__, formula_template_query_specification(ftemplate), formula_template_elmt(ftemplate));
        }
        string_utilities.indent(stream, depth);
        if (NIL != formula_template_focal_term(ftemplate)) {
            if (NIL != list_utilities.singletonP(formula_template_focal_term(ftemplate))) {
                format(stream, $str209$_focal_term__A___A___, formula_template_focal_term(ftemplate).first(), formula_template_entry_format(ftemplate));
            } else {
                format(stream, $str210$_focal_term_occurrences__A___A___, formula_template_focal_term(ftemplate), formula_template_entry_format(ftemplate));
            }
            string_utilities.indent(stream, depth);
        }
        if (NIL != formula_template_examples(ftemplate)) {
            format(stream, $str211$_examples___A__, formula_template_examples(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (NIL != formula_template_follow_ups(ftemplate)) {
            format(stream, $str212$_follow_ups___A__, formula_template_follow_ups(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (NIL != formula_template_gloss(ftemplate)) {
            format(stream, $str213$_template_gloss___A__, formula_template_gloss(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (NIL != formula_template_refspec(ftemplate)) {
            format(stream, $str214$_reformulation_specification___A_, formula_template_refspec(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (NIL != formula_template_argpos_details(ftemplate)) {
            write_string($str215$_argpos_details__, stream, UNPROVIDED, UNPROVIDED);
            if (NIL == formula_template_argpos_ordering(ftemplate)) {
                princ(formula_template_argpos_details(ftemplate), stream);
            } else {
                SubLObject cdolist_list_var = formula_template_argpos_ordering(ftemplate);
                SubLObject argpos_detail = NIL;
                argpos_detail = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    print_arg_position_details(argpos_detail, stream, add(depth, ONE_INTEGER));
                    princ($$$_, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    argpos_detail = cdolist_list_var.first();
                } 
            }
        }
        write_string($str178$_, stream, UNPROVIDED, UNPROVIDED);
        return ftemplate;
    }

    public static SubLObject formula_template_set_formula(final SubLObject ftemplate, final SubLObject formula) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        _csetf_formula_template_formula(ftemplate, formula);
        return ftemplate;
    }

    public static SubLObject formula_template_set_examples(final SubLObject ftemplate, final SubLObject examples) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != listp(examples) : "Types.listp(examples) " + "CommonSymbols.NIL != Types.listp(examples) " + examples;
        _csetf_formula_template_examples(ftemplate, examples);
        return ftemplate;
    }

    public static SubLObject formula_template_set_focal_term(final SubLObject ftemplate, final SubLObject focal_term) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != forts.fort_p(focal_term) : "forts.fort_p(focal_term) " + "CommonSymbols.NIL != forts.fort_p(focal_term) " + focal_term;
        _csetf_formula_template_focal_term(ftemplate, focal_term);
        return ftemplate;
    }

    public static SubLObject formula_template_set_elmt(final SubLObject ftemplate, final SubLObject elmt) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != fort_types_interface.isa_mtP(elmt, UNPROVIDED) : "fort_types_interface.isa_mtP(elmt, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_mtP(elmt, CommonSymbols.UNPROVIDED) " + elmt;
        _csetf_formula_template_elmt(ftemplate, elmt);
        return ftemplate;
    }

    public static SubLObject formula_template_set_entry_format(final SubLObject ftemplate, final SubLObject entry_format) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != constant_p(entry_format) : "constant_handles.constant_p(entry_format) " + "CommonSymbols.NIL != constant_handles.constant_p(entry_format) " + entry_format;
        _csetf_formula_template_entry_format(ftemplate, entry_format);
        return ftemplate;
    }

    public static SubLObject formula_template_set_gloss(final SubLObject ftemplate, final SubLObject gloss) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != stringp(gloss) : "Types.stringp(gloss) " + "CommonSymbols.NIL != Types.stringp(gloss) " + gloss;
        _csetf_formula_template_gloss(ftemplate, gloss);
        return ftemplate;
    }

    public static SubLObject formula_template_set_query_specification(final SubLObject ftemplate, final SubLObject spec) {
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != new_cycl_query_specification.new_cycl_query_specification_p(spec) : "new_cycl_query_specification.new_cycl_query_specification_p(spec) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(spec) " + spec;
        _csetf_formula_template_query_specification(ftemplate, spec);
        return ftemplate;
    }

    public static SubLObject xml_serialize_formula_template(final SubLObject ftemplate, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$formulaTemplate, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$93 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        try {
                            final SubLObject _prev_bind_0_$93 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$id, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$95 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$98 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(formula_template_id(ftemplate));
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$98, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$95, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$94, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$93, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$id);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                        if (NIL != formula_template_formula(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$96 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$formula, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$97 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$97 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$99 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_el_formula(formula_template_formula(ftemplate));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$99, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$97, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$97, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$96, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$formula);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                                }
                            }
                        }
                        final SubLObject query_spec = formula_template_query_specification(ftemplate);
                        if ((NIL != query_spec) && (NIL != cycl_grammar.cycl_sentence_p(possibly_unquote(new_cycl_query_specification.new_cycl_query_specification_formula(query_spec))))) {
                            new_cycl_query_specification.xml_serialize_new_cycl_query_specification(query_spec, UNPROVIDED);
                        }
                        try {
                            final SubLObject _prev_bind_0_$99 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$98 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$elmt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$100 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$99 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$100 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(formula_template_elmt(ftemplate));
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$100, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$99, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$100, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$98, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$99, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$elmt);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                        if (NIL != formula_template_focal_term(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$102 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$100 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$focalTerm, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$103 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$101 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$101 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        if (NIL != list_utilities.singletonP(formula_template_focal_term(ftemplate))) {
                                            xml_serialize_arg_position(formula_template_focal_term(ftemplate).first(), UNPROVIDED);
                                        } else {
                                            try {
                                                final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$102 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$argPositions, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$103 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$102 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        SubLObject cdolist_list_var = formula_template_focal_term(ftemplate);
                                                        SubLObject focus = NIL;
                                                        focus = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            xml_serialize_arg_position(focus, UNPROVIDED);
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            focus = cdolist_list_var.first();
                                                        } 
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$102, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$103, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$105, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$102, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$104, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$argPositions);
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$101, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$101, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$103, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$100, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$102, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$focalTerm);
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                }
                            }
                        }
                        if (NIL != formula_template_is_single_entryP(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$104 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$singleEntry, NIL, $ATOMIC, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$105 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$103 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$103, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$105, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$109, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$104, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$108, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values6 = getValuesAsVector();
                                    restoreValuesFromVector(_values6);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                }
                            }
                        } else {
                            try {
                                final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$multipleEntry, NIL, $ATOMIC, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$107 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$104 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$104, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$107, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$106, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values7 = getValuesAsVector();
                                    restoreValuesFromVector(_values7);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                }
                            }
                        }
                        if (NIL != formula_template_examples(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$108 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$usageExamples, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$109 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$105 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var2 = formula_template_examples(ftemplate);
                                        SubLObject example = NIL;
                                        example = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            try {
                                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$110 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$example, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$111 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$106 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_el_formula(example);
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$106, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$111, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$110, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values8 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$example);
                                                    restoreValuesFromVector(_values8);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            example = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$105, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$109, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$108, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values9 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$usageExamples);
                                    restoreValuesFromVector(_values9);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                                }
                            }
                        }
                        if (NIL != formula_template_gloss(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$112 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$glossForTemplate, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$113 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$107 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write(formula_template_gloss(ftemplate), UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$107, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$113, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$112, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$120, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values10 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$glossForTemplate);
                                    restoreValuesFromVector(_values10);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                }
                            }
                        }
                        if (NIL != formula_template_follow_ups(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$123 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$114 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$followUps, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$124 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$115 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$108 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var2 = formula_template_follow_ups(ftemplate);
                                        SubLObject follow_up = NIL;
                                        follow_up = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            try {
                                                final SubLObject _prev_bind_0_$125 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$followUp, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$126 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$117 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$109 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        SubLObject current;
                                                        final SubLObject datum = current = follow_up;
                                                        SubLObject v_term = NIL;
                                                        SubLObject connective = NIL;
                                                        SubLObject load_mt = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list235);
                                                        v_term = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list235);
                                                        connective = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list235);
                                                        load_mt = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$127 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$118 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$templateId, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                                    final SubLObject _prev_bind_0_$128 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$119 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$110 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(v_term);
                                                                    } finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$110, thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$119, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$128, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$118, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$127, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values11 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$templateId);
                                                                    restoreValuesFromVector(_values11);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$130 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$120 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$connective, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                                    final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$121 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$111 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(connective);
                                                                    } finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$111, thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$121, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$131, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$120, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$130, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$132 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values12 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$connective);
                                                                    restoreValuesFromVector(_values12);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$133 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$122 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$loadMt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                                    final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$123 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$112 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(load_mt);
                                                                    } finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$112, thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$123, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$134, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$122, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$133, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$135 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values13 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$loadMt);
                                                                    restoreValuesFromVector(_values13);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$135, thread);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list235);
                                                        }
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$109, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$117, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$126, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$125, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$136 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values14 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$followUp);
                                                    restoreValuesFromVector(_values14);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$136, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            follow_up = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$108, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$115, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$124, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$114, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$123, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values15 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$followUps);
                                    restoreValuesFromVector(_values15);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        }
                        if (NIL != formula_template_refspec(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$138 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$124 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$reformulationSpecification, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$139 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$125 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$113 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(formula_template_refspec(ftemplate));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$113, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$125, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$139, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$124, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$138, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$140 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values16 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$reformulationSpecification);
                                    restoreValuesFromVector(_values16);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$140, thread);
                                }
                            }
                        }
                        if (NIL != formula_template_argpos_details(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$141 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$126 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$argumentPositionDetails, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$142 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$127 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$114 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        if (NIL != formula_template_argpos_ordering(ftemplate)) {
                                            SubLObject cdolist_list_var2 = formula_template_argpos_ordering(ftemplate);
                                            SubLObject argpos_details = NIL;
                                            argpos_details = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                if (NIL != valid_arg_position_details_p(argpos_details)) {
                                                    xml_serialize_arg_position_details(argpos_details, UNPROVIDED);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                argpos_details = cdolist_list_var2.first();
                                            } 
                                        } else {
                                            SubLObject iteration_state;
                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(formula_template_argpos_details(ftemplate))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                thread.resetMultipleValues();
                                                final SubLObject argpos = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                final SubLObject argpos_details2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != valid_arg_position_details_p(argpos_details2)) {
                                                    xml_serialize_arg_position_details(argpos_details2, UNPROVIDED);
                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$114, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$127, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$142, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$126, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$141, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$143 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values17 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$argumentPositionDetails);
                                    restoreValuesFromVector(_values17);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$93, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$144 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values18 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$formulaTemplate);
                    restoreValuesFromVector(_values18);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$144, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return ftemplate;
    }

    public static SubLObject xml_serialize_formula_template_as_document(final SubLObject ftemplate, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        xml_serialize_formula_template_header(stream);
        xml_serialize_formula_template(ftemplate, stream);
        return ftemplate;
    }

    public static SubLObject formula_template_dtd_uri() {
        return $formula_template_dtd_uri$.getGlobalValue();
    }

    public static SubLObject xml_serialize_formula_template_header(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            princ($str242$__xml_version__1_0__encoding__US_, xml_vars.$xml_stream$.getDynamicValue(thread));
            terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str243$__DOCTYPE_formulaTemplate_SYSTEM_, formula_template_dtd_uri());
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cfasl_output_object_formula_template_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_formula_template(v_object, stream);
    }

    public static SubLObject cfasl_output_formula_template(final SubLObject ftemplate, final SubLObject stream) {
        write_cfasl_guid_denoted_type_opcode(stream, $cfasl_guid_opcode_formula_template$.getGlobalValue());
        cfasl_output(formula_template_id(ftemplate), stream);
        cfasl_output(formula_template_formula(ftemplate), stream);
        cfasl_output(formula_template_query_specification(ftemplate), stream);
        cfasl_output(formula_template_elmt(ftemplate), stream);
        cfasl_output(formula_template_focal_term(ftemplate), stream);
        cfasl_output(formula_template_entry_format(ftemplate), stream);
        cfasl_output(formula_template_examples(ftemplate), stream);
        cfasl_output(formula_template_gloss(ftemplate), stream);
        cfasl_output(formula_template_follow_ups(ftemplate), stream);
        cfasl_output(formula_template_refspec(ftemplate), stream);
        if (NIL == formula_template_argpos_ordering(ftemplate)) {
            cfasl_output(NIL, stream);
        } else {
            final SubLObject argpos_ordering_keys = Mapping.mapcar(ARG_POSITION_DETAILS_ARGUMENT_POSITION, formula_template_argpos_ordering(ftemplate));
            cfasl_output(argpos_ordering_keys, stream);
        }
        cfasl_output(formula_template_argpos_details(ftemplate), stream);
        return ftemplate;
    }

    public static SubLObject cfasl_input_formula_template(final SubLObject stream) {
        final SubLObject ftemplate = make_formula_template(UNPROVIDED);
        _csetf_formula_template_id(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_formula(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_query_specification(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_elmt(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_focal_term(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_entry_format(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_examples(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_gloss(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_follow_ups(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_formula_template_refspec(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        final SubLObject argpos_ordering_keys = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject ordering = NIL;
        _csetf_formula_template_argpos_details(ftemplate, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = argpos_ordering_keys;
        SubLObject argpos_key = NIL;
        argpos_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argpos_detail = dictionary.dictionary_lookup(formula_template_argpos_details(ftemplate), argpos_key, UNPROVIDED);
            ordering = cons(argpos_detail, ordering);
            cdolist_list_var = cdolist_list_var.rest();
            argpos_key = cdolist_list_var.first();
        } 
        _csetf_formula_template_argpos_ordering(ftemplate, nreverse(ordering));
        return ftemplate;
    }

    public static SubLObject new_arg_position_details(final SubLObject argpos) {
        final SubLObject argpos_details = make_arg_position_details(UNPROVIDED);
        _csetf_arg_position_details_argument_position(argpos_details, argpos);
        return argpos_details;
    }

    public static SubLObject valid_arg_position_details_p(final SubLObject argpos) {
        return makeBoolean((NIL != arg_position_details_p(argpos)) && (((NIL != arg_position_details_candidate_replacements(argpos)) || (NIL != arg_position_details_replacement_constraints(argpos))) || (NIL != arg_position_details_gloss(argpos))));
    }

    public static SubLObject print_arg_position_details(final SubLObject argpos_details, final SubLObject stream, final SubLObject depth) {
        write_string($str245$__ArgPos_Details__, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str246$_for_position__A_, arg_position_details_argument_position(argpos_details));
        if (arg_position_details_ordering(argpos_details).isFixnum()) {
            format(stream, $str247$__ordering_slot__D_, arg_position_details_ordering(argpos_details));
        } else {
            write_string($str248$__no_ordering_info_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == arg_position_details_is_editable(argpos_details)) {
            write_string($str249$_READ_ONLY, stream, UNPROVIDED, UNPROVIDED);
        }
        terpri(stream);
        if (NIL != arg_position_details_gloss(argpos_details)) {
            format(stream, $str250$_gloss___A__, arg_position_details_gloss(argpos_details));
        }
        if (NIL != arg_position_details_invisible_replacement_positions(argpos_details)) {
            format(stream, $str251$_replacementInvisible___A__, arg_position_details_invisible_replacement_positions(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (NIL != arg_position_details_replacement_constraints(argpos_details)) {
            format(stream, $str252$_candidate_replacements___A__, arg_position_details_candidate_replacements(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (NIL != arg_position_details_replacement_constraints(argpos_details)) {
            format(stream, $str253$_constraints___A__, arg_position_details_replacement_constraints(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (NIL != arg_position_details_requires_validation(argpos_details)) {
            format(stream, $str254$__requires_validation____);
            string_utilities.indent(stream, depth);
        }
        if (NIL != arg_position_details_explanation(argpos_details)) {
            format(stream, $str255$_explanation___A__, arg_position_details_explanation(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (NIL != arg_position_details_unknown_replacement(argpos_details)) {
            format(stream, $str256$_term_for_unknown___A__, arg_position_details_unknown_replacement(argpos_details));
            string_utilities.indent(stream, depth);
        }
        write_string($str178$_, stream, UNPROVIDED, UNPROVIDED);
        return argpos_details;
    }

    public static SubLObject xml_serialize_arg_position_details(final SubLObject argpos_details, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$197 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$argumentPositionDetail, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$198 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$199 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_serialize_arg_position(arg_position_details_argument_position(argpos_details), UNPROVIDED);
                        if (arg_position_details_ordering(argpos_details).isFixnum()) {
                            try {
                                final SubLObject _prev_bind_0_$199 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$200 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$ordering, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$200 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$201 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$204 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_prin1(arg_position_details_ordering(argpos_details), UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$204, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$201, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$200, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$200, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$199, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$201 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$ordering);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                                }
                            }
                        }
                        if (arg_position_details_gloss(argpos_details).isString()) {
                            try {
                                final SubLObject _prev_bind_0_$202 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$202 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$glossText, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$203 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$203 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$205 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(arg_position_details_gloss(argpos_details), UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$205, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$203, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$203, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$202, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$202, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$204 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$glossText);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$204, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_candidate_replacements(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$205 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$204 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$candidateReplacementsForPosition, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$206 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$205 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$206 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = arg_position_details_candidate_replacements(argpos_details);
                                        SubLObject candidate = NIL;
                                        candidate = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$207 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$206 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$candidateReplacementForPosition, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$208 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$207 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$207 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(candidate);
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$207, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$207, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$208, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$206, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$207, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$209 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$candidateReplacementForPosition);
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            candidate = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$206, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$205, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$206, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$204, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$205, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$210 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$candidateReplacementsForPosition);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_invisible_replacement_positions(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$211 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$208 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($str262$templateReplacementsInvisibleForP, NIL, $ATOMIC, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$212 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$209 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$208 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$208, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$209, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$212, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$208, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$211, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$213 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_is_editable(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$214 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$210 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$isEditable, NIL, $ATOMIC, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$215 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$211 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$209 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$209, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$211, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$215, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$210, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$214, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$216 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values6 = getValuesAsVector();
                                    restoreValuesFromVector(_values6);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$216, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_requires_validation(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$217 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$212 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$validationRequired, NIL, $ATOMIC, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$218 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$213 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$210 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$210, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$213, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$218, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$212, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$217, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$219 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values7 = getValuesAsVector();
                                    restoreValuesFromVector(_values7);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$219, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_explanation(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$220 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$214 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$explanation, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$221 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$215 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$211 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(arg_position_details_explanation(argpos_details), UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$211, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$215, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$221, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$214, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$220, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$222 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values8 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$explanation);
                                    restoreValuesFromVector(_values8);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$222, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_unknown_replacement(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$223 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$216 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$unknownTermForTemplatePosition, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$224 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$217 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$212 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(arg_position_details_unknown_replacement(argpos_details));
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$212, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$217, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$224, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$216, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$223, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$225 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values9 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$unknownTermForTemplatePosition);
                                    restoreValuesFromVector(_values9);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                                }
                            }
                        }
                        if (NIL != arg_position_details_replacement_constraints(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$226 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$218 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$constraintsOnReplacement, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$227 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$219 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$213 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = arg_position_details_replacement_constraints(argpos_details);
                                        SubLObject constraint = NIL;
                                        constraint = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$228 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$220 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$constraintOnReplacement, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$229 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$221 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$214 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(constraint);
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$214, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$221, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$229, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$220, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$228, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$230 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values10 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$constraintOnReplacement);
                                                    restoreValuesFromVector(_values10);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            constraint = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$213, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$219, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$227, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$218, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$226, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$231 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values11 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$constraintsOnReplacement);
                                    restoreValuesFromVector(_values11);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$231, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$199, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$198, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$197, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$232 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values12 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$argumentPositionDetail);
                    restoreValuesFromVector(_values12);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$232, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return argpos_details;
    }

    public static SubLObject cfasl_output_object_arg_position_details_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_arg_position_details(v_object, stream);
    }

    public static SubLObject cfasl_output_arg_position_details(final SubLObject argpos_details, final SubLObject stream) {
        write_cfasl_guid_denoted_type_opcode(stream, $cfasl_guid_opcode_arg_position_details$.getGlobalValue());
        cfasl_output(arg_position_details_argument_position(argpos_details), stream);
        cfasl_output(arg_position_details_ordering(argpos_details), stream);
        cfasl_output(arg_position_details_gloss(argpos_details), stream);
        cfasl_output(arg_position_details_candidate_replacements(argpos_details), stream);
        cfasl_output(arg_position_details_invisible_replacement_positions(argpos_details), stream);
        cfasl_output(arg_position_details_is_editable(argpos_details), stream);
        cfasl_output(arg_position_details_requires_validation(argpos_details), stream);
        cfasl_output(arg_position_details_explanation(argpos_details), stream);
        cfasl_output(arg_position_details_unknown_replacement(argpos_details), stream);
        cfasl_output(arg_position_details_replacement_constraints(argpos_details), stream);
        return argpos_details;
    }

    public static SubLObject cfasl_input_arg_position_details(final SubLObject stream) {
        final SubLObject argpos_details = make_arg_position_details(UNPROVIDED);
        _csetf_arg_position_details_argument_position(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_ordering(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_gloss(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_candidate_replacements(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_invisible_replacement_positions(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_is_editable(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_requires_validation(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_explanation(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_unknown_replacement(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_arg_position_details_replacement_constraints(argpos_details, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return argpos_details;
    }

    public static SubLObject xml_serialize_arg_position(SubLObject position, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$267 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$argPosition, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$268 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$269 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        SubLObject cdolist_list_var = position.rest();
                        SubLObject index = NIL;
                        index = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            try {
                                final SubLObject _prev_bind_0_$269 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$270 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$position, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$270 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$271 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$274 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_prin1(index, UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$274, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$271, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$270, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$270, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$269, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$271 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$position);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$271, thread);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            index = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$269, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$268, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$267, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$272 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$argPosition);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return position;
    }

    public static SubLObject formula_template_load_topic_template_details(final SubLObject topic_id, final SubLObject ftemplate, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != topic_id) && (!assertionsDisabledSynth)) && (NIL == forts.fort_p(topic_id))) {
            throw new AssertionError(topic_id);
        }
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        assert NIL != hlmt.hlmt_p(elmt) : "hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) " + elmt;
        final SubLObject template_id = formula_template_id(ftemplate);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(template_id))) {
            Errors.error($str273$Can_t_load_a_formula_template_wit, ftemplate);
        }
        _csetf_formula_template_formula(ftemplate, ftemplate_get_template_formula(template_id, elmt));
        _csetf_formula_template_elmt(ftemplate, ftemplate_get_template_elmt(template_id, elmt));
        _csetf_formula_template_follow_ups(ftemplate, ftemplate_get_template_follow_ups(template_id, elmt));
        _csetf_formula_template_gloss(ftemplate, ftemplate_get_template_gloss(template_id, elmt));
        _csetf_formula_template_refspec(ftemplate, ftemplate_get_template_reformulation_specification(template_id, elmt));
        if (NIL != forts.fort_p(topic_id)) {
            _csetf_formula_template_focal_term(ftemplate, ftemplate_get_template_focal_term(template_id, topic_id, elmt));
            _csetf_formula_template_entry_format(ftemplate, ftemplate_get_template_format(template_id, topic_id, elmt));
            _csetf_formula_template_examples(ftemplate, ftemplate_get_template_examples(template_id, topic_id, elmt));
        }
        ftemplate_load_argument_position_detail_information(ftemplate, elmt, topic_id);
        return ftemplate;
    }

    public static SubLObject ftemplate_load_argument_position_detail_information(final SubLObject ftemplate, final SubLObject elmt, SubLObject topic_id) {
        if (topic_id == UNPROVIDED) {
            topic_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id = formula_template_id(ftemplate);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(template_id))) {
            Errors.error($str273$Can_t_load_a_formula_template_wit, ftemplate);
        }
        if ((NIL != valid_constantP($const274$formulaTemplateHasArgumentPositio, UNPROVIDED)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($const274$formulaTemplateHasArgumentPositio, template_id, ONE_INTEGER, T))) {
            update_ftemplate_argpos_detail_invisible_replacement_positions(ftemplate, ftemplate_get_template_invisible_replacement_positions(template_id, topic_id, elmt));
            update_ftemplate_argpos_detail_replacable_positions(ftemplate, ftemplate_get_template_replacable_positions(template_id, elmt));
            update_ftemplate_argpos_detail_replacement_constraints(ftemplate, ftemplate_get_template_replacement_constraints(template_id, elmt));
            update_ftemplate_argpos_detail_candidate_replacements(ftemplate, ftemplate_get_template_candidate_replacements_for_position(template_id, elmt));
            if (NIL != forts.fort_p(topic_id)) {
                update_ftemplate_argpos_detail_glosses(ftemplate, ftemplate_get_template_glosses(template_id, topic_id, elmt));
                update_ftemplate_argpos_detail_explanations(ftemplate, ftemplate_get_template_explanations(template_id, topic_id, elmt));
            }
            update_ftemplate_argpos_detail_validation_required(ftemplate, ftemplate_get_template_validation_requirements(template_id, elmt));
            update_ftemplate_argpos_detail_unknown_replacements(ftemplate, ftemplate_get_template_unknown_replacements(template_id, elmt));
            update_ftemplate_argpos_detail_ordering_information(ftemplate);
            if (NIL == dictionary.dictionary_empty_p(formula_template_argpos_details(ftemplate))) {
            }
        }
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_glosses(final SubLObject ftemplate, final SubLObject glosses) {
        SubLObject cdolist_list_var = glosses;
        SubLObject gloss_definition = NIL;
        gloss_definition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = gloss_definition;
            SubLObject gloss_text = NIL;
            SubLObject argpos = NIL;
            SubLObject ordering = NIL;
            destructuring_bind_must_consp(current, datum, $list275);
            gloss_text = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list275);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list275);
            ordering = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_ordering(argpos_details, ordering);
                _csetf_arg_position_details_gloss(argpos_details, gloss_text);
            } else {
                cdestructuring_bind_error(datum, $list275);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gloss_definition = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_explanations(final SubLObject ftemplate, final SubLObject explanations) {
        SubLObject cdolist_list_var = explanations;
        SubLObject explanation_definition = NIL;
        explanation_definition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = explanation_definition;
            SubLObject explanation_text = NIL;
            SubLObject argpos = NIL;
            destructuring_bind_must_consp(current, datum, $list276);
            explanation_text = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list276);
            argpos = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_explanation(argpos_details, explanation_text);
            } else {
                cdestructuring_bind_error(datum, $list276);
            }
            cdolist_list_var = cdolist_list_var.rest();
            explanation_definition = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_invisible_replacement_positions(final SubLObject ftemplate, final SubLObject invisible_pos) {
        SubLObject cdolist_list_var = invisible_pos;
        SubLObject invisible_position = NIL;
        invisible_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, invisible_position);
            _csetf_arg_position_details_invisible_replacement_positions(argpos_details, T);
            cdolist_list_var = cdolist_list_var.rest();
            invisible_position = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_replacable_positions(final SubLObject ftemplate, final SubLObject replacable_pos) {
        SubLObject cdolist_list_var = replacable_pos;
        SubLObject replacable_position = NIL;
        replacable_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, replacable_position);
            _csetf_arg_position_details_is_editable(argpos_details, T);
            cdolist_list_var = cdolist_list_var.rest();
            replacable_position = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_replacement_constraints(final SubLObject ftemplate, final SubLObject constraints) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject argpos = NIL;
            SubLObject replace_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list277);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list277);
            replace_constraints = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_replacement_constraints(argpos_details, replace_constraints);
            } else {
                cdestructuring_bind_error(datum, $list277);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_candidate_replacements(final SubLObject ftemplate, final SubLObject replacements) {
        SubLObject cdolist_list_var = replacements;
        SubLObject candidate_replacement = NIL;
        candidate_replacement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = candidate_replacement;
            SubLObject argpos = NIL;
            SubLObject candidates = NIL;
            destructuring_bind_must_consp(current, datum, $list278);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list278);
            candidates = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_candidate_replacements(argpos_details, candidates);
            } else {
                cdestructuring_bind_error(datum, $list278);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_replacement = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_validation_required(final SubLObject ftemplate, final SubLObject required) {
        SubLObject cdolist_list_var = required;
        SubLObject argpos = NIL;
        argpos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
            _csetf_arg_position_details_requires_validation(argpos_details, T);
            cdolist_list_var = cdolist_list_var.rest();
            argpos = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject update_ftemplate_argpos_detail_unknown_replacements(final SubLObject ftemplate, final SubLObject replacements) {
        SubLObject cdolist_list_var = replacements;
        SubLObject replacement = NIL;
        replacement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = replacement;
            SubLObject argpos = NIL;
            SubLObject thing = NIL;
            destructuring_bind_must_consp(current, datum, $list279);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list279);
            thing = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_unknown_replacement(argpos_details, thing);
            } else {
                cdestructuring_bind_error(datum, $list279);
            }
            cdolist_list_var = cdolist_list_var.rest();
            replacement = cdolist_list_var.first();
        } 
        return ftemplate;
    }

    public static SubLObject get_ftemplate_arg_position_details(final SubLObject ftemplate, final SubLObject argpos) {
        final SubLObject details = formula_template_argpos_details(ftemplate);
        SubLObject argpos_details = dictionary.dictionary_lookup(details, argpos, NIL);
        if (NIL == arg_position_details_p(argpos_details)) {
            argpos_details = new_arg_position_details(argpos);
            dictionary.dictionary_enter(details, argpos, argpos_details);
        }
        return argpos_details;
    }

    public static SubLObject update_ftemplate_argpos_detail_ordering_information(final SubLObject ftemplate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordering = NIL;
        SubLObject ordered = NIL;
        SubLObject unordered = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(formula_template_argpos_details(ftemplate))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject argpos = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject argpos_details = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (arg_position_details_ordering(argpos_details).isFixnum()) {
                ordered = cons(argpos_details, ordered);
            } else {
                unordered = cons(argpos_details, unordered);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        ordering = ftemplate_compute_ordering_of_argpos_details(ordered, unordered);
        _csetf_formula_template_argpos_ordering(ftemplate, ordering);
        return ftemplate;
    }

    public static SubLObject ftemplate_compute_ordering_of_argpos_details(final SubLObject ordered, final SubLObject unordered) {
        return cconcatenate(sort_argpos_details_by_ordering(ordered), Sort.sort(unordered, ORDERED_BY_ARGUMENT_POSITION, ARG_POSITION_DETAILS_ARGUMENT_POSITION));
    }

    public static SubLObject sort_argpos_details_by_ordering(final SubLObject details) {
        return Sort.sort(details, symbol_function($sym281$_), ARG_POSITION_DETAILS_ORDERING);
    }

    public static SubLObject ordered_by_argument_position(final SubLObject argpos_a, final SubLObject argpos_b) {
        if (!argpos_a.isCons()) {
            return T;
        }
        if (!argpos_b.isCons()) {
            return NIL;
        }
        if (!argpos_a.first().isFixnum()) {
            return T;
        }
        if (!argpos_b.first().isFixnum()) {
            return NIL;
        }
        if (argpos_a.first().numE(argpos_b.first())) {
            return ordered_by_argument_position(argpos_a.rest(), argpos_b.rest());
        }
        return numL(argpos_a.first(), argpos_b.first());
    }

    public static SubLObject load_formula_template_skeleton_from_kb(final SubLObject el_template_id, final SubLObject elmt) {
        assert NIL != possibly_fo_represented_term_p(el_template_id) : "el_utilities.possibly_fo_represented_term_p(el_template_id) " + "CommonSymbols.NIL != el_utilities.possibly_fo_represented_term_p(el_template_id) " + el_template_id;
        assert NIL != hlmt.hlmt_p(elmt) : "hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) " + elmt;
        final SubLObject template_id = czer_main.canonicalize_term(el_template_id, UNPROVIDED);
        final SubLObject ftemplate = new_formula_template(template_id, UNPROVIDED);
        _csetf_formula_template_gloss(ftemplate, ftemplate_get_template_gloss(template_id, elmt));
        _csetf_formula_template_elmt(ftemplate, elmt);
        return ftemplate;
    }

    public static SubLObject load_formula_template_details_from_kb(final SubLObject cycl_template_id, final SubLObject elmt) {
        assert NIL != possibly_fo_represented_term_p(cycl_template_id) : "el_utilities.possibly_fo_represented_term_p(cycl_template_id) " + "CommonSymbols.NIL != el_utilities.possibly_fo_represented_term_p(cycl_template_id) " + cycl_template_id;
        assert NIL != hlmt.hlmt_p(elmt) : "hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) " + elmt;
        final SubLObject template_id = czer_main.canonicalize_term(cycl_template_id, UNPROVIDED);
        final SubLObject ftemplate = new_formula_template(template_id, UNPROVIDED);
        final SubLObject query_spec_id = ftemplate_get_query_specification(template_id, elmt);
        if (NIL == query_spec_id) {
            _csetf_formula_template_formula(ftemplate, ftemplate_get_template_formula(template_id, elmt));
            _csetf_formula_template_elmt(ftemplate, ftemplate_get_template_elmt(template_id, elmt));
        } else {
            final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_spec_id, elmt);
            _csetf_formula_template_query_specification(ftemplate, query_spec);
            if (NIL == new_cycl_query_specification.new_cycl_query_specification_mt(query_spec)) {
                Errors.warn($str283$Dwimming_MT_for__A_to__A____your_, template_id, elmt);
                new_cycl_query_specification.reset_new_cycl_query_specification_mt(query_spec, elmt);
            }
            _csetf_formula_template_elmt(ftemplate, new_cycl_query_specification.new_cycl_query_specification_mt(query_spec));
        }
        _csetf_formula_template_follow_ups(ftemplate, ftemplate_get_template_follow_ups(template_id, elmt));
        _csetf_formula_template_gloss(ftemplate, ftemplate_get_template_gloss(template_id, elmt));
        ftemplate_load_argument_position_detail_information(ftemplate, elmt, UNPROVIDED);
        return ftemplate;
    }

    public static SubLObject ftemplate_assign_formula_component(final SubLObject ftemplate, final SubLObject elmt) {
        final SubLObject template_id = formula_template_id(ftemplate);
        final SubLObject query_spec_id = ftemplate_get_query_specification(template_id, elmt);
        if (NIL == query_spec_id) {
            _csetf_formula_template_formula(ftemplate, ftemplate_get_template_formula(template_id, elmt));
            return ftemplate;
        }
        final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_spec_id, elmt);
        _csetf_formula_template_query_specification(ftemplate, query_spec);
        return ftemplate;
    }

    public static SubLObject ftemplate_get_functional_slot_value(final SubLObject template_id, final SubLObject predicate, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id = NIL;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject allow_genl_topicsP = NIL;
        final SubLObject answer_argnums = $list284;
        return ftemplate_get_first_asserted_value(template_id, topic_id, predicate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
    }

    public static SubLObject ftemplate_get_template_reformulation_specification(final SubLObject template_id, final SubLObject elmt) {
        return ftemplate_get_functional_slot_value(template_id, $const285$reformulateTemplateViaSpecificati, elmt);
    }

    public static SubLObject ftemplate_get_query_specification(final SubLObject template_id, final SubLObject elmt) {
        if ((NIL != nart_handles.nart_p(template_id)) && cycl_utilities.nat_functor(template_id).eql($$TemplateFromTestQueryFn)) {
            return cycl_utilities.nat_arg1(template_id, UNPROVIDED);
        }
        return ftemplate_get_functional_slot_value(template_id, $const287$querySpecificationForFormulaTempl, elmt);
    }

    public static SubLObject ftemplate_get_template_formula(final SubLObject template_id, final SubLObject elmt) {
        return ftemplate_get_functional_slot_value(template_id, $$formulaForFormulaTemplate, elmt);
    }

    public static SubLObject ftemplate_get_template_elmt(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = NIL;
        SubLObject template_elmt = ftemplate_get_first_asserted_value(template_id, topic_id, $$assertMtForFormulaTemplate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
        if (NIL == template_elmt) {
            if (NIL != cycl_utilities.fort_or_naut_p(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread))) {
                template_elmt = czer_main.canonicalize_term(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread), UNPROVIDED);
            } else {
                template_elmt = elmt;
            }
        }
        return template_elmt;
    }

    public static SubLObject ftemplate_get_template_follow_ups(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject follow_up_argnum = TWO_INTEGER;
        final SubLObject connective_argnum = THREE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject allow_genl_topicsP = NIL;
        final SubLObject straight = ftemplate_get_asserted_values(template_id, topic_id, $$formulaTemplateFollowUp, elmt, template_id_argnum, topic_id_argnum, list(follow_up_argnum, connective_argnum), allow_genl_topicsP, UNPROVIDED);
        final SubLObject commuted = list_utilities.remove_if_not($sym291$COMMUTATIVE_RELATION_, ftemplate_get_asserted_values(template_id, topic_id, $$formulaTemplateFollowUp, elmt, follow_up_argnum, topic_id_argnum, list(template_id_argnum, connective_argnum), allow_genl_topicsP, UNPROVIDED), symbol_function(SECOND), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject results = append(straight, commuted);
        SubLObject final_results = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject follow_up = NIL;
            SubLObject connective = NIL;
            destructuring_bind_must_consp(current, datum, $list293);
            follow_up = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list293);
            connective = current.first();
            current = current.rest();
            if (NIL == current) {
                final_results = cons(list(follow_up, connective, elmt), final_results);
            } else {
                cdestructuring_bind_error(datum, $list293);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(final_results);
    }

    public static SubLObject ftemplate_get_template_gloss(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_now = ftemplate_qualify_mt_to_now(elmt);
        SubLObject gloss = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_now);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gloss = kb_mapping_utilities.fpred_value(template_id, $$formulaTemplateGloss, ONE_INTEGER, TWO_INTEGER, $TRUE);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gloss;
    }

    public static SubLObject ftemplate_qualify_mt_to_now(final SubLObject mt) {
        return ftemplate_hlmt_change_time(mt, $list296);
    }

    public static SubLObject ftemplate_qualify_mt_to_anytime(final SubLObject mt) {
        return ftemplate_hlmt_change_time(mt, $$AnytimePSC);
    }

    public static SubLObject ftemplate_hlmt_change_time(final SubLObject v_hlmt, final SubLObject new_time_context) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        return NIL != hlmt.hlmt_p(monad_mt) ? hlmt.new_hlmt(list(monad_mt, new_time_context)) : v_hlmt;
    }

    public static SubLObject ftemplate_get_template_glosses(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = TWO_INTEGER;
        final SubLObject answer_argnums = $list298;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_asserted_values(template_id, topic_id, $$glossForFormulaTemplate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject ftemplate_get_template_explanations(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = TWO_INTEGER;
        final SubLObject answer_argnums = $list300;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_asserted_values(template_id, topic_id, $$formulaTemplateArgExplanation, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject ftemplate_get_template_examples(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        return ftemplate_get_asserted_values(template_id, topic_id, $$formulaTemplateExample, elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ftemplate_get_first_asserted_value(final SubLObject template_id, final SubLObject topic_id, final SubLObject predicate, final SubLObject elmt, SubLObject template_id_argnum, SubLObject topic_id_argnum, SubLObject answer_argnums, SubLObject allow_genl_topicsP) {
        if (template_id_argnum == UNPROVIDED) {
            template_id_argnum = ONE_INTEGER;
        }
        if (topic_id_argnum == UNPROVIDED) {
            topic_id_argnum = TWO_INTEGER;
        }
        if (answer_argnums == UNPROVIDED) {
            answer_argnums = list(THREE_INTEGER);
        }
        if (allow_genl_topicsP == UNPROVIDED) {
            allow_genl_topicsP = templates_use_isaXgenlsP();
        }
        final SubLObject first_onlyP = T;
        return ftemplate_get_asserted_values(template_id, topic_id, predicate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, first_onlyP).first();
    }

    public static SubLObject ftemplate_get_asserted_values(final SubLObject template_id, final SubLObject topic_id, final SubLObject predicate, final SubLObject elmt, SubLObject template_id_argnum, SubLObject topic_id_argnum, SubLObject answer_argnums, SubLObject allow_genl_topicsP, SubLObject first_onlyP) {
        if (template_id_argnum == UNPROVIDED) {
            template_id_argnum = ONE_INTEGER;
        }
        if (topic_id_argnum == UNPROVIDED) {
            topic_id_argnum = TWO_INTEGER;
        }
        if (answer_argnums == UNPROVIDED) {
            answer_argnums = list(THREE_INTEGER);
        }
        if (allow_genl_topicsP == UNPROVIDED) {
            allow_genl_topicsP = templates_use_isaXgenlsP();
        }
        if (first_onlyP == UNPROVIDED) {
            first_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_vars = Mapping.mapcar(GET_VARIABLE, answer_argnums);
        final SubLObject v_arity = arity.min_arity(predicate);
        SubLObject answer_lit = cons(predicate, Mapping.mapcar(GET_VARIABLE, list_utilities.num_list(v_arity, ONE_INTEGER)));
        SubLObject pos_lits = NIL;
        final SubLObject neg_lits = NIL;
        if (template_id_argnum.isInteger()) {
            answer_lit = list_utilities.nreplace_nth(template_id_argnum, template_id, answer_lit);
        }
        if (NIL != allow_genl_topicsP) {
            final SubLObject genl_topic_var = variables.get_variable(topic_id_argnum);
            pos_lits = cons(list($$genls, topic_id, genl_topic_var), pos_lits);
        } else
            if (NIL != subl_promotions.positive_integer_p(topic_id_argnum)) {
                answer_lit = list_utilities.nreplace_nth(topic_id_argnum, topic_id, answer_lit);
            }

        pos_lits = cons(list($$assertedSentence, answer_lit), pos_lits);
        final SubLObject template = (NIL != list_utilities.singletonP(answer_vars)) ? answer_vars.first() : answer_vars;
        SubLObject v_properties = NIL;
        SubLObject ans = NIL;
        if (NIL != first_onlyP) {
            v_properties = putf(v_properties, $MAX_NUMBER, ONE_INTEGER);
        }
        if ((NIL != neg_lits) || (NIL != list_utilities.lengthG(pos_lits, ONE_INTEGER, UNPROVIDED))) {
            final SubLObject dnf = clauses.make_clause(neg_lits, pos_lits);
            v_properties = putf(v_properties, $kw306$TRANSFORMATION_ALLOWED_, NIL);
            v_properties = putf(v_properties, $PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
            v_properties = putf(v_properties, $RETURN, list($TEMPLATE, template));
            v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
            ans = inference_kernel.new_cyc_query_from_dnf(dnf, elmt, NIL, v_properties);
            if ((NIL != api_widgets.everything_psc_dwimmed_awayP()) && (NIL == ans)) {
                ans = inference_kernel.new_cyc_query_from_dnf(dnf, $$EverythingPSC, NIL, v_properties);
            }
        } else {
            SubLObject assertions = NIL;
            if ((((NIL != topic_id) && (NIL != subl_promotions.positive_integer_p(topic_id_argnum))) && (NIL != template_id)) && (NIL != subl_promotions.positive_integer_p(template_id_argnum))) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = kb_mapping_utilities.pred_u_v_holds_gafs(predicate, template_id, topic_id, template_id_argnum, topic_id_argnum, $TRUE);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if ((NIL != api_widgets.everything_psc_dwimmed_awayP()) && (NIL == assertions)) {
                    assertions = kb_mapping_utilities.pred_u_v_holds_gafs_in_any_mt(predicate, template_id, topic_id, template_id_argnum, topic_id_argnum, $TRUE);
                }
            } else
                if ((NIL != template_id) && (NIL != subl_promotions.positive_integer_p(template_id_argnum))) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        assertions = kb_mapping_utilities.pred_value_gafs(template_id, predicate, template_id_argnum, $TRUE);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    if ((NIL != api_widgets.everything_psc_dwimmed_awayP()) && (NIL == assertions)) {
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            assertions = kb_mapping_utilities.pred_value_gafs(template_id, predicate, template_id_argnum, $TRUE);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        }
                    }
                } else
                    if ((NIL != topic_id) && (NIL != subl_promotions.positive_integer_p(topic_id_argnum))) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            assertions = kb_mapping_utilities.pred_value_gafs(topic_id, predicate, topic_id_argnum, $TRUE);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                        if ((NIL != api_widgets.everything_psc_dwimmed_awayP()) && (NIL == assertions)) {
                            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                assertions = kb_mapping_utilities.pred_value_gafs(topic_id, predicate, topic_id_argnum, $TRUE);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                            }
                        }
                    }


            if (NIL != assertions) {
                if (NIL != list_utilities.singletonP(answer_argnums)) {
                    final SubLObject answer_argnum = answer_argnums.first();
                    if (NIL != first_onlyP) {
                        ans = cons(assertions_high.gaf_arg(assertions.first(), answer_argnum), ans);
                    } else {
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = NIL;
                        assertion = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            ans = cons(assertions_high.gaf_arg(assertion, answer_argnum), ans);
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        } 
                    }
                } else
                    if (NIL != first_onlyP) {
                        final SubLObject assertion2 = assertions.first();
                        SubLObject temp_result = NIL;
                        SubLObject cdolist_list_var2 = answer_argnums;
                        SubLObject answer_argnum2 = NIL;
                        answer_argnum2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            temp_result = cons(assertions_high.gaf_arg(assertion2, answer_argnum2), temp_result);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            answer_argnum2 = cdolist_list_var2.first();
                        } 
                        ans = list(nreverse(temp_result));
                    } else {
                        SubLObject cdolist_list_var3 = assertions;
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            SubLObject temp_result2 = NIL;
                            SubLObject cdolist_list_var_$277 = answer_argnums;
                            SubLObject answer_argnum3 = NIL;
                            answer_argnum3 = cdolist_list_var_$277.first();
                            while (NIL != cdolist_list_var_$277) {
                                temp_result2 = cons(assertions_high.gaf_arg(assertion3, answer_argnum3), temp_result2);
                                cdolist_list_var_$277 = cdolist_list_var_$277.rest();
                                answer_argnum3 = cdolist_list_var_$277.first();
                            } 
                            ans = cons(nreverse(temp_result2), ans);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            assertion3 = cdolist_list_var3.first();
                        } 
                    }

            }
        }
        return ans;
    }

    public static SubLObject ftemplate_get_template_focal_term(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = THREE_INTEGER;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_asserted_values(template_id, topic_id, $const314$focalTermPositionForFormulaTempla, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject ftemplate_get_template_format(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = THREE_INTEGER;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_first_asserted_value(template_id, topic_id, $$assertionFormatForFormulaTemplate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
    }

    public static SubLObject ftemplate_get_template_invisible_replacement_positions(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = NIL;
        return ftemplate_get_asserted_values(template_id, topic_id, $const316$templateReplacementsInvisibleForP, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject ftemplate_get_template_replacement_constraints(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject answer_argnums = $list317;
        final SubLObject allow_genl_topicsP = NIL;
        final SubLObject repl_constraints = ftemplate_get_asserted_values(template_id, topic_id, $$constraintOnReplacement, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
        final SubLObject constraints = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject replacement_constraints = NIL;
        SubLObject cdolist_list_var = repl_constraints;
        SubLObject repl_constraint = NIL;
        repl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = repl_constraint;
            SubLObject position = NIL;
            SubLObject constraint = NIL;
            destructuring_bind_must_consp(current, datum, $list319);
            position = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list319);
            constraint = current.first();
            current = current.rest();
            if (NIL == current) {
                if (!cycl_utilities.formula_arg0(constraint).eql($$TheSet)) {
                    constraint = list($$TheSet, $sym321$_X, list($$isa, $sym321$_X, constraint));
                }
                dictionary_utilities.dictionary_push(constraints, position, constraint);
            } else {
                cdestructuring_bind_error(datum, $list319);
            }
            cdolist_list_var = cdolist_list_var.rest();
            repl_constraint = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraints)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject position2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraint_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            replacement_constraints = cons(list(position2, constraint_set), replacement_constraints);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return replacement_constraints;
    }

    public static SubLObject ftemplate_get_template_unknown_replacements(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject answer_argnums = $list317;
        final SubLObject allow_genl_topicsP = NIL;
        final SubLObject replacements = ftemplate_get_asserted_values(template_id, topic_id, $$unknownTermForTemplatePosition, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
        return replacements;
    }

    public static SubLObject ftemplate_get_template_candidate_replacements_for_position(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject answer_argnums = $list317;
        final SubLObject allow_genl_topicsP = NIL;
        final SubLObject repl_candidates = ftemplate_get_asserted_values(template_id, topic_id, $$candidateReplacementForPosition, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
        final SubLObject replacements = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject replacement_candidates = NIL;
        SubLObject cdolist_list_var = repl_candidates;
        SubLObject repl_candidate = NIL;
        repl_candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = repl_candidate;
            SubLObject position = NIL;
            SubLObject candidate = NIL;
            destructuring_bind_must_consp(current, datum, $list324);
            position = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list324);
            candidate = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary_utilities.dictionary_push(replacements, position, candidate);
            } else {
                cdestructuring_bind_error(datum, $list324);
            }
            cdolist_list_var = cdolist_list_var.rest();
            repl_candidate = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(replacements)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject position2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidates = thread.secondMultipleValue();
            thread.resetMultipleValues();
            replacement_candidates = cons(list(position2, candidates), replacement_candidates);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return replacement_candidates;
    }

    public static SubLObject ftemplate_get_template_replacable_positions(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = NIL;
        return ftemplate_get_asserted_values(template_id, topic_id, $const325$positionInFormulaTemplateIsReplac, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject ftemplate_get_template_validation_requirements(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = ONE_INTEGER;
        final SubLObject topic_id_argnum = NIL;
        final SubLObject topic_id = NIL;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = NIL;
        return ftemplate_get_asserted_values(template_id, topic_id, $const326$validationRequiredOnTemplatePosit, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject formula_template_load_topic_subtopic_ordering(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.isaP(topic, $$InducedFormulaTemplateTopicType, UNPROVIDED, UNPROVIDED)) {
            return sort_formula_template_subtopics_by_template_count(asserted_formula_template_subtopics_for_type(topic, elmt), elmt);
        }
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_template_load_prioritization_information_for_subtopics(topic, elmt);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
    }

    public static SubLObject formula_template_load_topic_template_ordering(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordered_template_forts = NIL;
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_template_load_prioritization_information_for_templates(topic, elmt);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ordered_template_forts = apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
        return ordered_template_forts;
    }

    public static SubLObject lower_priority_terms(final SubLObject obj) {
        return accumulate_lower_priority_terms(obj, set.new_set(symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject accumulate_lower_priority_terms(final SubLObject obj, final SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = dictionary.dictionary_lookup($high_to_low_priorities$.getDynamicValue(thread), obj, UNPROVIDED);
        SubLObject immediate = NIL;
        immediate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == set.set_memberP(immediate, accumulator)) {
                set.set_add(immediate, accumulator);
                accumulate_lower_priority_terms(immediate, accumulator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            immediate = cdolist_list_var.first();
        } 
        return accumulator;
    }

    public static SubLObject higher_priorityP(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p($high_to_low_priorities$.getDynamicValue(thread)) : "dictionary.dictionary_p(formula_templates.$high_to_low_priorities$.getDynamicValue(thread)) " + "CommonSymbols.NIL != dictionary.dictionary_p(formula_templates.$high_to_low_priorities$.getDynamicValue(thread)) " + $high_to_low_priorities$.getDynamicValue(thread);
        return set.set_memberP(obj2, lower_priority_terms(obj1));
    }

    public static SubLObject apply_prioritizing_ordering_to_kb_objects(final SubLObject high_to_low, final SubLObject low_to_high) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordered_keys = NIL;
        final SubLObject high_keys = dictionary.dictionary_keys(high_to_low);
        final SubLObject low_keys = dictionary.dictionary_keys(low_to_high);
        final SubLObject _prev_bind_0 = $high_to_low_priorities$.currentBinding(thread);
        try {
            $high_to_low_priorities$.bind(high_to_low, thread);
            final SubLObject all_keys = union(high_keys, low_keys, dictionary.dictionary_test(high_to_low), UNPROVIDED);
            ordered_keys = Sort.sort(all_keys, $sym329$HIGHER_PRIORITY_, UNPROVIDED);
        } finally {
            $high_to_low_priorities$.rebind(_prev_bind_0, thread);
        }
        return ordered_keys;
    }

    public static SubLObject apply_prioritizing_ordering_to_kb_objects_rck(final SubLObject high_to_low, final SubLObject low_to_high) {
        SubLObject tuples = NIL;
        final SubLObject high_keys = dictionary.dictionary_keys(high_to_low);
        final SubLObject low_keys = dictionary.dictionary_keys(low_to_high);
        SubLObject highest = set_difference(high_keys, low_keys, UNPROVIDED, UNPROVIDED);
        if (NIL == highest) {
            highest = high_keys;
        }
        final SubLObject work_queue = queues.create_queue(UNPROVIDED);
        final SubLObject result_queue = queues.create_queue(UNPROVIDED);
        SubLObject cdolist_list_var = Sort.sort(highest, symbol_function(FORT_SORT_PRED), UNPROVIDED);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queues.enqueue(item, work_queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        while (NIL == queues.queue_empty_p(work_queue)) {
            final SubLObject current = queues.dequeue(work_queue);
            final SubLObject children = dictionary.dictionary_lookup(high_to_low, current, NIL);
            if (NIL == queues.queue_find(current, result_queue, UNPROVIDED, UNPROVIDED)) {
                queues.enqueue(current, result_queue);
            }
            if (NIL != children) {
                SubLObject cdolist_list_var2 = Sort.sort(children, symbol_function(FORT_SORT_PRED), UNPROVIDED);
                SubLObject item2 = NIL;
                item2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL == queues.queue_find(item2, result_queue, UNPROVIDED, UNPROVIDED)) {
                        queues.enqueue(item2, work_queue);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    item2 = cdolist_list_var2.first();
                } 
            }
        } 
        tuples = queues.queue_elements(result_queue);
        return tuples;
    }

    public static SubLObject construct_highXlow_information_from_prioritizing_ordering(final SubLObject tuples) {
        final SubLObject high_to_low = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject low_to_high = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject higher = NIL;
            SubLObject lower = NIL;
            destructuring_bind_must_consp(current, datum, $list331);
            higher = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list331);
            lower = current.first();
            current = current.rest();
            if (NIL == current) {
                higher = czer_main.canonicalize_term(higher, UNPROVIDED);
                lower = czer_main.canonicalize_term(lower, UNPROVIDED);
                dictionary_utilities.dictionary_push(high_to_low, higher, lower);
                dictionary_utilities.dictionary_push(low_to_high, lower, higher);
            } else {
                cdestructuring_bind_error(datum, $list331);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return values(high_to_low, low_to_high);
    }

    public static SubLObject formula_template_load_prioritization_information_for_subtopics(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_pred = constants_high.find_constant($str332$higherPriorityTemplateTypeForTopi);
        final SubLObject tuples = (NIL != valid_constantP(new_pred, UNPROVIDED)) ? ftemplate_ask_template($list333, list(new_pred, $sym334$_HIGHER, $sym335$_LOWER, topic), elmt, $list336) : ftemplate_ask_template($list333, list($$and, $list338, $list339, list($$formulaTemplateTypeHasTopicType, $sym334$_HIGHER, topic), list($$formulaTemplateTypeHasTopicType, $sym335$_LOWER, topic)), elmt, $list341);
        thread.resetMultipleValues();
        final SubLObject high_to_low = construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(high_to_low, low_to_high);
    }

    public static SubLObject formula_template_load_prioritization_information_for_templates(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tuples = ftemplate_ask_template($list333, list($$higherPriorityTemplateForType, $sym334$_HIGHER, $sym335$_LOWER, topic), elmt, $list336);
        thread.resetMultipleValues();
        final SubLObject high_to_low = construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(high_to_low, low_to_high);
    }

    public static SubLObject formula_template_organize_templates_by_ordering(final SubLObject topic) {
        final SubLObject ordering = template_topic_ordering(topic);
        final SubLObject all_templates = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject ordered_templates = NIL;
        SubLObject cdolist_list_var = template_topic_templates(topic);
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(all_templates, formula_template_id(template), template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        ordered_templates = formula_template_organize_by_ordering(all_templates, ordering, STABLE_TEMPLATE_ID_COMPARE);
        _csetf_template_topic_templates(topic, ordered_templates);
        return ordered_templates;
    }

    public static SubLObject formula_template_organize_subtopics_by_ordering(final SubLObject topic) {
        final SubLObject ordering = template_topic_ordering(topic);
        final SubLObject all_subtopics = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject ordered_subtopics = NIL;
        SubLObject cdolist_list_var = template_topic_subtopics(topic);
        SubLObject subtopic = NIL;
        subtopic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(all_subtopics, template_topic_topic(subtopic), subtopic);
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        } 
        ordered_subtopics = formula_template_organize_by_ordering(all_subtopics, ordering, STABLE_TEMPLATE_ID_COMPARE);
        _csetf_template_topic_subtopics(topic, ordered_subtopics);
        return ordered_subtopics;
    }

    public static SubLObject formula_template_organize_by_ordering(final SubLObject all_items, final SubLObject ordering, final SubLObject sortfn) {
        SubLObject ordered_items = NIL;
        SubLObject cdolist_list_var = ordering;
        SubLObject id_in_order = NIL;
        id_in_order = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item = dictionary.dictionary_lookup(all_items, id_in_order, UNPROVIDED);
            if (NIL != item) {
                ordered_items = cons(item, ordered_items);
                dictionary.dictionary_remove(all_items, id_in_order);
            }
            cdolist_list_var = cdolist_list_var.rest();
            id_in_order = cdolist_list_var.first();
        } 
        final SubLObject keys = dictionary.dictionary_keys(all_items);
        SubLObject cdolist_list_var2 = Sort.sort(keys, sortfn, UNPROVIDED);
        SubLObject key = NIL;
        key = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject item2 = dictionary.dictionary_lookup(all_items, key, UNPROVIDED);
            ordered_items = cons(item2, ordered_items);
            cdolist_list_var2 = cdolist_list_var2.rest();
            key = cdolist_list_var2.first();
        } 
        return nreverse(ordered_items);
    }

    public static SubLObject stable_template_id_compare(final SubLObject id_a, final SubLObject id_b) {
        return kb_utilities.term_L(id_a, id_b, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject formula_template_load_template_graph(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(topic) : "forts.fort_p(topic) " + "CommonSymbols.NIL != forts.fort_p(topic) " + topic;
        assert NIL != hlmt.hlmt_p(elmt) : "hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) " + elmt;
        final SubLObject start_topic = new_template_topic(topic, UNPROVIDED);
        final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$278 = formula_template_vars.$template_topic_problem_store$.currentBinding(thread);
                try {
                    formula_template_vars.$template_topic_problem_store$.bind(formula_template_vars.find_or_create_template_topic_problem_store(), thread);
                    final SubLObject reusedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        final SubLObject seen = set.new_set(symbol_function(EQL), UNPROVIDED);
                        final SubLObject todo = queues.create_queue(UNPROVIDED);
                        queues.enqueue(start_topic, todo);
                        set.set_add(start_topic, seen);
                        while (NIL == queues.queue_empty_p(todo)) {
                            SubLObject current_topic = NIL;
                            SubLObject children = NIL;
                            current_topic = queues.dequeue(todo);
                            final SubLObject current = template_topic_topic(current_topic);
                            final SubLObject candidates = formula_template_subtopics_for_type(current, elmt);
                            formula_template_topic_load_topic_specifics(current_topic, elmt);
                            if (NIL == candidates) {
                                SubLObject cdolist_list_var;
                                final SubLObject template_ids = cdolist_list_var = asserted_formula_template_ids_for_type(current, elmt);
                                SubLObject template_id = NIL;
                                template_id = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject ftemplate = new_formula_template(template_id, current_topic);
                                    formula_template_load_topic_template_details(current, ftemplate, elmt);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    template_id = cdolist_list_var.first();
                                } 
                                formula_template_organize_templates_by_ordering(current_topic);
                            } else {
                                SubLObject subtopics = NIL;
                                SubLObject cdolist_list_var = candidates;
                                SubLObject candidate = NIL;
                                candidate = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject candidate_has_subtopicsP = fet_topic_fort_has_subtopicsP(candidate, elmt);
                                    final SubLObject subtopic = new_template_topic(candidate, current_topic);
                                    if ((((NIL == formula_template_utilities.$assume_induced_fet_templates_already_reifiedP$.getDynamicValue(thread)) && (NIL != formula_template_utilities.induction_topic_typeP(candidate))) && (NIL == candidate_has_subtopicsP)) && (NIL == fet_topic_fort_has_templatesP(candidate, elmt))) {
                                        final SubLObject focal_term_type = formula_template_utilities.focal_term_type_for_induced_template_type(candidate, elmt);
                                        final SubLObject induction_mt = formula_template_induction_mt(focal_term_type, elmt);
                                        formula_template_utilities.induced_formula_template_forts_for_focal_term_type(focal_term_type, induction_mt, candidate);
                                    }
                                    if ((NIL != candidate_has_subtopicsP) || (NIL != fet_topic_fort_has_templatesP(candidate, elmt))) {
                                        template_topic_add_subtopic(current_topic, subtopic);
                                        subtopics = cons(subtopic, subtopics);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    candidate = cdolist_list_var.first();
                                } 
                                children = subtopics;
                                formula_template_organize_subtopics_by_ordering(current_topic);
                            }
                            SubLObject cdolist_list_var2 = children;
                            SubLObject child = NIL;
                            child = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                if (NIL == set.set_memberP(child, seen)) {
                                    set.set_add(child, seen);
                                    queues.enqueue(child, todo);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                child = cdolist_list_var2.first();
                            } 
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$279 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if ((NIL == reusedP) && (NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP())) {
                                formula_template_vars.destroy_template_topic_problem_store(UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$279, thread);
                        }
                    }
                } finally {
                    formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0_$278, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$280 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL == reuse_existingP) {
                        rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$280, thread);
                }
            }
        } finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        validate_template_topic_semantic_constraints(start_topic);
        return start_topic;
    }

    public static SubLObject validate_template_topic_semantic_constraints(final SubLObject template_topic) {
        template_topic_query_mt_can_see_all_assertion_mts(template_topic);
        return template_topic;
    }

    public static SubLObject template_topic_query_mt_can_see_all_assertion_mts(final SubLObject template_topic) {
        final SubLObject query_mt = template_topic_query_mt(template_topic);
        SubLObject cdolist_list_var = template_topic_subtopics(template_topic);
        SubLObject subtopic = NIL;
        subtopic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            check_template_topic_query_mt_can_see_subtopics_assertion_mts(subtopic, query_mt);
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        } 
        return template_topic;
    }

    public static SubLObject check_template_topic_query_mt_can_see_subtopics_assertion_mts(final SubLObject subtopic, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == template_topic_subtopics(subtopic)) {
            SubLObject cdolist_list_var = template_topic_templates(subtopic);
            SubLObject ftemplate = NIL;
            ftemplate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject elmt = formula_template_elmt(ftemplate);
                SubLObject visibleP = NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(query_mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    visibleP = mt_relevance_macros.relevant_mtP(elmt);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (NIL == visibleP) {
                    funcall(NIL != $warn_on_template_topic_validation_only$.getGlobalValue() ? WARN : ERROR, $str346$Invalid_formula_template__A_in_to, formula_template_id(ftemplate), template_topic_topic(subtopic), query_mt, elmt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ftemplate = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = template_topic_subtopics(subtopic);
            SubLObject subsubtopic = NIL;
            subsubtopic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                check_template_topic_query_mt_can_see_subtopics_assertion_mts(subsubtopic, query_mt);
                cdolist_list_var = cdolist_list_var.rest();
                subsubtopic = cdolist_list_var.first();
            } 
        }
        return subtopic;
    }

    public static SubLObject templates_use_isaXgenlsP() {
        return makeBoolean((NIL == constants_high.find_constant($$$FactivoreTab)) || (NIL == isa.isaP($$FormulaTemplateTopicType, $$FirstOrderCollection, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject asserted_formula_template_ids_for_type(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = isa.instances(topic, elmt, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            ans = ftemplate_ask_variable($sym350$_TEMPLATE, list($$assertedSentence, list($$formulaTemplateHasType, $sym350$_TEMPLATE, topic)), elmt, UNPROVIDED);
        }
        return ans;
    }

    public static SubLObject sort_formula_template_subtopics_by_template_count(final SubLObject subtopics, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $template_count_mt$.currentBinding(thread);
        try {
            $template_count_mt$.bind(elmt, thread);
            ans = Sort.sort(subtopics, symbol_function($sym353$_), COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE);
        } finally {
            $template_count_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject count_asserted_formula_template_ids_for_type_internal(final SubLObject topic, SubLObject elmt) {
        if (elmt == UNPROVIDED) {
            elmt = $template_count_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = isa.count_all_instances(topic, elmt, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            ans = length(asserted_formula_template_ids_for_type(topic, elmt));
        }
        return ans;
    }

    public static SubLObject count_asserted_formula_template_ids_for_type(final SubLObject topic, SubLObject elmt) {
        if (elmt == UNPROVIDED) {
            elmt = $template_count_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return count_asserted_formula_template_ids_for_type_internal(topic, elmt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(topic, elmt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (topic.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && elmt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(count_asserted_formula_template_ids_for_type_internal(topic, elmt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(topic, elmt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject fet_topic_fort_has_subtopicsP(final SubLObject topic, final SubLObject elmt) {
        return list_utilities.sublisp_boolean(formula_template_subtopics_for_type(topic, elmt));
    }

    public static SubLObject fet_topic_fort_has_templatesP(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = list_utilities.sublisp_boolean(isa.all_fort_instances(topic, UNPROVIDED, UNPROVIDED));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        return list_utilities.sublisp_boolean(ftemplate_ask_variable($sym350$_TEMPLATE, list($$formulaTemplateHasType, $sym350$_TEMPLATE, topic), elmt, $list355));
    }

    public static SubLObject formula_template_subtopics_for_type(final SubLObject topic, final SubLObject elmt) {
        if ((NIL != formula_template_utilities.induction_topic_typeP(topic)) && (NIL == formula_template_asserted_subtopics_for_type(topic, elmt))) {
            formula_template_utilities.induce_formula_template_subtopics_for_type(topic, elmt);
        }
        return formula_template_asserted_subtopics_for_type(topic, elmt);
    }

    public static SubLObject formula_template_asserted_subtopics_for_type(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subtopics = NIL;
        if (NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                subtopics = genls.specs(topic, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            subtopics = ftemplate_ask_variable($sym356$_SUBTOPIC, list($$formulaTemplateTypeHasTopicType, $sym356$_SUBTOPIC, topic), elmt, UNPROVIDED);
        }
        return subtopics;
    }

    public static SubLObject asserted_formula_template_subtopics_for_type(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subtopics = NIL;
        if (NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                subtopics = genls.specs(topic, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            subtopics = ftemplate_ask_variable($sym356$_SUBTOPIC, list($$assertedSentence, list($$formulaTemplateTypeHasTopicType, $sym356$_SUBTOPIC, topic)), elmt, UNPROVIDED);
        }
        return subtopics;
    }

    public static SubLObject formula_template_induction_mt(final SubLObject topic, final SubLObject elmt) {
        return $$InferencePSC;
    }

    public static SubLObject formula_template_topic_load_topic_specifics(final SubLObject template_topic, final SubLObject elmt) {
        final SubLObject current = template_topic_topic(template_topic);
        final SubLObject title = topictmplt_get_topic_template_title(current, elmt);
        if (title.isString()) {
            template_topic_add_title(template_topic, title);
        }
        final SubLObject prefix = topictmplt_get_topic_template_term_prefix(current, elmt);
        if (prefix.isString()) {
            template_topic_add_term_prefix(template_topic, prefix);
        }
        final SubLObject introductory = topictmplt_get_topic_template_introductory_template(current, elmt);
        if (NIL != forts.fort_p(introductory)) {
            template_topic_set_introductory_template(template_topic, introductory);
        }
        final SubLObject v_sources = topictmplt_get_topic_template_source_types(current, elmt);
        if (NIL != list_utilities.list_of_type_p(symbol_function(FORT_OR_NAUT_P), v_sources)) {
            template_topic_set_source_types(template_topic, v_sources);
        }
        _csetf_template_topic_ordering(template_topic, NIL != template_topic_supertopic(template_topic) ? formula_template_load_topic_template_ordering(current, elmt) : formula_template_load_topic_subtopic_ordering(current, elmt));
        _csetf_template_topic_query_mt(template_topic, topictmplt_get_topic_template_query_mt(current, elmt));
        _csetf_template_topic_definitional_mt(template_topic, topictmplt_get_topic_template_definitional_mt(current, elmt));
        _csetf_template_topic_source_mt(template_topic, elmt);
        return template_topic;
    }

    public static SubLObject topictmplt_get_topic_template_source_types(final SubLObject topic, final SubLObject elmt) {
        final SubLObject template_id_argnum = NIL;
        final SubLObject template_id = NIL;
        final SubLObject topic_id_argnum = ONE_INTEGER;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = NIL;
        return ftemplate_get_asserted_values(template_id, topic, $$sourcesForTopic, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, UNPROVIDED);
    }

    public static SubLObject ftemplate_topic_get_functional_slot_value(final SubLObject topic_id, final SubLObject predicate, final SubLObject elmt) {
        final SubLObject template_id_argnum = NIL;
        final SubLObject template_id = NIL;
        final SubLObject topic_id_argnum = ONE_INTEGER;
        final SubLObject answer_argnums = $list284;
        final SubLObject allow_genl_topicsP = NIL;
        return ftemplate_get_first_asserted_value(template_id, topic_id, predicate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
    }

    public static SubLObject topictmplt_get_topic_template_introductory_template(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, $$focalTermIntroduction, elmt);
    }

    public static SubLObject topictmplt_get_topic_template_title(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, $const367$titleForFormulaTemplateType_Strin, elmt);
    }

    public static SubLObject topictmplt_get_topic_template_term_prefix(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, $$templateTopicPrefix, elmt);
    }

    public static SubLObject topictmplt_get_topic_template_query_mt(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, $$queryMtForTopicAssertions, elmt);
    }

    public static SubLObject topictmplt_get_topic_template_definitional_mt(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, $$definitionalMtForTopicAssertions, elmt);
    }

    public static SubLObject ftemplate_ask_variable(final SubLObject variable, final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject all_properties = putf(v_properties, $PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
        return ask_utilities.query_variable(variable, sentence, mt, all_properties);
    }

    public static SubLObject ftemplate_ask_template(final SubLObject template, final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject all_properties = putf(v_properties, $PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
        return ask_utilities.query_template(template, sentence, mt, all_properties);
    }

    public static SubLObject get_editable_and_non_editable_assertions_for_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject non_editables = NIL;
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = formula_template_vars.$template_topic_problem_store$.currentBinding(thread);
        try {
            formula_template_vars.$template_topic_problem_store$.bind(formula_template_vars.find_or_create_template_topic_problem_store(), thread);
            final SubLObject reusedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                final SubLObject query_mt = template_topic_query_mt(template_topic);
                final SubLObject non_editable = compute_non_editable_assertions_for_template_topic_instance(focal_term, template_topic_topic(template_topic), elmt, query_mt);
                final SubLObject _prev_bind_0_$281 = $non_editable_assertions_for_template_topic_instance$.currentBinding(thread);
                try {
                    $non_editable_assertions_for_template_topic_instance$.bind(non_editable, thread);
                    assert NIL != set.set_p(non_editable) : "set.set_p(non_editable) " + "CommonSymbols.NIL != set.set_p(non_editable) " + non_editable;
                    results = get_assertions_for_template_topic_instance_int(focal_term, template_topic, elmt, query_mt);
                    non_editables = get_non_editable_assertions_for_template_topic_instance();
                } finally {
                    $non_editable_assertions_for_template_topic_instance$.rebind(_prev_bind_0_$281, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$282 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if ((NIL == reusedP) && (NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP())) {
                        formula_template_vars.destroy_template_topic_problem_store(UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$282, thread);
                }
            }
        } finally {
            formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0, thread);
        }
        return values(results, non_editables);
    }

    public static SubLObject get_assertions_for_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = get_editable_and_non_editable_assertions_for_template_topic_instance(focal_term, template_topic, elmt);
        final SubLObject non_editables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return results;
    }

    public static SubLObject get_assertions_for_template_topic_instance_int(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt, final SubLObject query_mt) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = template_topic_subtopics(template_topic);
        SubLObject subtopic = NIL;
        subtopic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sub_results = NIL;
            if (NIL == template_topic_templates(subtopic)) {
                sub_results = get_assertions_for_template_topic_instance_int(focal_term, subtopic, elmt, query_mt);
            } else {
                sub_results = get_assertions_for_leaf_template_topic_instance(focal_term, subtopic, elmt, query_mt);
            }
            if (NIL != sub_results) {
                results = cons(list(template_topic_topic(subtopic), sub_results), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject xml_template_topic_assertions_current_revision() {
        return $xml_template_topic_assertions_revisions$.getGlobalValue().first().first();
    }

    public static SubLObject xml_serialize_assertions_for_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject template_elmt, final SubLObject assertions_elmt, final SubLObject results, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$283 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$knownAssertionsForTemplateTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$284 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$285 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        try {
                            final SubLObject _prev_bind_0_$285 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$286 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$templateTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$286 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$287 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$290 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(template_topic_topic(template_topic));
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$290, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$287, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$286, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$286, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$285, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$287 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$templateTopic);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$287, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$288 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$288 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$queryELMt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$289 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$289 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$291 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(assertions_elmt);
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$291, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$289, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$289, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$288, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$288, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$290 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$queryELMt);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$290, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$291 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$290 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$templateInstance, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$292 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$291 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$292 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(focal_term);
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$292, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$291, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$292, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$290, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$291, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$293 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$templateInstance);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$293, thread);
                            }
                        }
                        if (NIL == $xml_suppress_future_template_extensions$.getDynamicValue(thread)) {
                            try {
                                final SubLObject _prev_bind_0_$294 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$292 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$templateTopicAssertionsRevision, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$295 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$293 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$293 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_number(xml_template_topic_assertions_current_revision(), UNPROVIDED);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$293, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$293, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$295, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$292, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$294, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$296 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$templateTopicAssertionsRevision);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$297 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$294 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($str377$knownAssertionsForTemplateSubTopi, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$298 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$295 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$294 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    SubLObject cdolist_list_var = results;
                                    SubLObject subtopic_results = NIL;
                                    subtopic_results = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = subtopic_results;
                                        SubLObject subtopic_id = NIL;
                                        SubLObject template_result_sets = NIL;
                                        destructuring_bind_must_consp(current, datum, $list378);
                                        subtopic_id = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list378);
                                        template_result_sets = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            try {
                                                final SubLObject _prev_bind_0_$299 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$296 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($str379$knownAssertionsForTemplateSubTopi, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$300 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$297 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$295 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$301 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$298 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$subTopic, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                                final SubLObject _prev_bind_0_$302 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$299 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$296 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    cycml.cycml_serialize_term(subtopic_id);
                                                                } finally {
                                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$296, thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$299, thread);
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$302, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$298, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$301, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$303 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values5 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$subTopic);
                                                                restoreValuesFromVector(_values5);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$303, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$304 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$300 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($str380$knownAssertionsForFormulaTemplate, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                                final SubLObject _prev_bind_0_$305 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$301 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$297 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    SubLObject cdolist_list_var_$331 = template_result_sets;
                                                                    SubLObject template_results = NIL;
                                                                    template_results = cdolist_list_var_$331.first();
                                                                    while (NIL != cdolist_list_var_$331) {
                                                                        SubLObject current_$333;
                                                                        final SubLObject datum_$332 = current_$333 = template_results;
                                                                        SubLObject template_id = NIL;
                                                                        SubLObject assertions = NIL;
                                                                        destructuring_bind_must_consp(current_$333, datum_$332, $list381);
                                                                        template_id = current_$333.first();
                                                                        current_$333 = current_$333.rest();
                                                                        destructuring_bind_must_consp(current_$333, datum_$332, $list381);
                                                                        assertions = current_$333.first();
                                                                        current_$333 = current_$333.rest();
                                                                        if (NIL == current_$333) {
                                                                            xml_serialize_assertions_for_formula_template_instance(focal_term, template_id, assertions, UNPROVIDED);
                                                                        } else {
                                                                            cdestructuring_bind_error(datum_$332, $list381);
                                                                        }
                                                                        cdolist_list_var_$331 = cdolist_list_var_$331.rest();
                                                                        template_results = cdolist_list_var_$331.first();
                                                                    } 
                                                                } finally {
                                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$297, thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$301, thread);
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$305, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$300, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$304, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$306 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values6 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($str380$knownAssertionsForFormulaTemplate);
                                                                restoreValuesFromVector(_values6);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$306, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$295, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$297, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$300, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$296, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$299, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$307 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values7 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($str379$knownAssertionsForTemplateSubTopi);
                                                    restoreValuesFromVector(_values7);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$307, thread);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list378);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        subtopic_results = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$294, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$295, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$298, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$294, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$297, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$308 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($str377$knownAssertionsForTemplateSubTopi);
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$308, thread);
                            }
                        }
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$285, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$284, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$283, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$309 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values9 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$knownAssertionsForTemplateTopic);
                    restoreValuesFromVector(_values9);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$309, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return template_topic;
    }

    public static SubLObject xml_serialize_assertions_for_formula_template_instance(final SubLObject focal_term, final SubLObject template_id, final SubLObject assertions, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$338 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$knownAssertionsForFormulaTemplate, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$339 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$340 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        try {
                            final SubLObject _prev_bind_0_$340 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$341 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$assertionsMatchTemplate, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$341 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$342 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$345 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(template_id);
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$345, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$342, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$341, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$341, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$340, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$342 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$assertionsMatchTemplate);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$342, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$343 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$343 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$knownAssertions, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$344 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$344 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$346 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    SubLObject cdolist_list_var = assertions;
                                    SubLObject assertion = NIL;
                                    assertion = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject error_message = xml_serialize_assertion_for_formula_template_instance(focal_term, assertion, stream);
                                        if (error_message.isString()) {
                                            Errors.error(cconcatenate(cconcatenate($str385$Problem_serializing_assertions_fo, format_nil.format_nil_a_no_copy(template_id)), error_message));
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$346, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$344, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$344, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$343, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$343, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$345 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$knownAssertions);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$345, thread);
                            }
                        }
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$340, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$339, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$338, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$346 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$knownAssertionsForFormulaTemplate);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$346, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return template_id;
    }

    public static SubLObject ftemplate_assertion_non_editableP(final SubLObject assertion, final SubLObject focal_term) {
        SubLObject non_editableP = NIL;
        if (NIL != assertion_handles.assertion_p(assertion)) {
            non_editableP = makeBoolean((NIL != assertions_high.deduced_assertionP(assertion)) || (NIL != is_non_editable_assertion_for_template_topic_instanceP(assertion)));
        } else
            if (NIL != ftemplate_polycanonicalized_assertion_p(assertion)) {
                non_editableP = list_utilities.sublisp_boolean(list_utilities.find_if_not($sym386$ASSERTED_ASSERTION_, ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                non_editableP = NIL;
            }

        return non_editableP;
    }

    public static SubLObject xml_serialize_assertion_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject polycanonicalizedP = ftemplate_polycanonicalized_assertion_p(assertion);
        final SubLObject unknown_typeP = makeBoolean((NIL == polycanonicalizedP) && (NIL == assertion_handles.assertion_p(assertion)));
        final SubLObject error_message = (NIL != unknown_typeP) ? cconcatenate($$$Invalid_return_object_, new SubLObject[]{ format_nil.format_nil_a_no_copy(assertion), $$$_in_assertion_list }) : NIL;
        final SubLObject non_editableP = (NIL != error_message) ? NIL : ftemplate_assertion_non_editableP(assertion, focal_term);
        if (!error_message.isString()) {
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$knownAssertion, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$354 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$355 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        if (NIL != non_editableP) {
                            try {
                                final SubLObject _prev_bind_0_$355 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$356 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$deducedAssertion, NIL, $ATOMIC, NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$356 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$357 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$360 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$360, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$357, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$356, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$356, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$355, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$357 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$357, thread);
                                }
                            }
                        }
                        xml_serialize_assertion_sentence_for_formula_template_instance(assertion, polycanonicalizedP, stream);
                        xml_serialize_assertion_elmt_for_formula_template_instance(assertion, polycanonicalizedP, stream);
                        if (NIL == $xml_suppress_future_template_extensions$.getDynamicValue(thread)) {
                            xml_serialize_assertion_suids_for_formula_template_instance(focal_term, assertion, polycanonicalizedP, stream);
                            xml_serialize_assertion_timestamp_for_formula_template_instance(focal_term, assertion, polycanonicalizedP, stream);
                            xml_serialize_assertion_evaluation_data_for_formula_template_instance(focal_term, assertion, polycanonicalizedP, stream);
                        }
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$355, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$354, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$knownAssertion);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return error_message;
    }

    public static SubLObject xml_serialize_assertion_sentence_for_formula_template_instance(final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            if (NIL != polycanonicalizedP) {
                cycml.cycml_serialize_sentence(ftemplate_polycanonicalized_assertion_sentence(assertion));
            } else {
                cycml.cycml_serialize_sentence(uncanonicalizer.assertion_el_formula(assertion));
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject xml_serialize_assertion_suids_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$362 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$knownAssertionSUIDs, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$363 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$364 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        SubLObject cdolist_list_var;
                        final SubLObject suids = cdolist_list_var = (NIL != polycanonicalizedP) ? ftemplate_polycanonicalized_assertion_suids(focal_term, assertion) : list(assertion_handles.assertion_id(assertion));
                        SubLObject suid = NIL;
                        suid = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (suid.isInteger()) {
                                cycml.cycml_serialize_assertion_id(suid, UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            suid = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$364, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$363, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$362, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$364 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$knownAssertionSUIDs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$364, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_suids(final SubLObject focal_term, final SubLObject assertion) {
        SubLObject suids = NIL;
        SubLObject cdolist_list_var = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term);
        SubLObject hl_assertion = NIL;
        hl_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            suids = cons(assertion_handles.assertion_id(hl_assertion), suids);
            cdolist_list_var = cdolist_list_var.rest();
            hl_assertion = cdolist_list_var.first();
        } 
        return suids;
    }

    public static SubLObject xml_serialize_assertion_evaluation_data_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$366 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$knownAssertionEvaluations, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$367 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$368 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        SubLObject cdolist_list_var = ftemplate_assertion_evaluations(focal_term, assertion, polycanonicalizedP);
                        SubLObject evaluation_data = NIL;
                        evaluation_data = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = evaluation_data;
                            SubLObject evaluation = NIL;
                            SubLObject evaluator = NIL;
                            destructuring_bind_must_consp(current, datum, $list393);
                            evaluation = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list393);
                            evaluator = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject judgment = ftemplate_evaluation_judgment(evaluation);
                                Label_1839 : {
                                    if (NIL == evaluation) {
                                        if (NIL == judgment) {
                                            break Label_1839;
                                        }
                                    }
                                    try {
                                        final SubLObject _prev_bind_0_$368 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$369 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$knownAssertionEvaluation, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                            final SubLObject _prev_bind_0_$369 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$370 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$373 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                if (NIL != evaluator) {
                                                    try {
                                                        final SubLObject _prev_bind_0_$370 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$371 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$evaluator, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                            final SubLObject _prev_bind_0_$371 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$372 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$374 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                cycml.cycml_serialize_term(evaluator);
                                                            } finally {
                                                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$374, thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$372, thread);
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$371, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$371, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$370, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$372 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$evaluator);
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$372, thread);
                                                        }
                                                    }
                                                }
                                                if (NIL != judgment) {
                                                    try {
                                                        final SubLObject _prev_bind_0_$373 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$373 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$judgment, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                                                            final SubLObject _prev_bind_0_$374 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$374 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$375 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                cycml.cycml_serialize_term(judgment);
                                                            } finally {
                                                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$375, thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$374, thread);
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$374, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$373, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$373, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$375 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values2 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$judgment);
                                                            restoreValuesFromVector(_values2);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$375, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$373, thread);
                                                xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$370, thread);
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$369, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$369, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$368, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$376 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$knownAssertionEvaluation);
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$376, thread);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list393);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            evaluation_data = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$368, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$367, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$366, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$377 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$knownAssertionEvaluations);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$377, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject quaternary_fet_evaluation_pred() {
        SubLObject pred = $quaternary_fet_evaluation_pred$.getGlobalValue();
        if (NIL == pred) {
            pred = constants_high.find_constant($$$evaluationOfAssertionByOn);
            if (NIL == pred) {
                pred = constants_high.find_constant($$$evaluationOfAssertionOfByOn);
            }
            $quaternary_fet_evaluation_pred$.setGlobalValue(pred);
        }
        return pred;
    }

    public static SubLObject ftemplate_assertion_evaluations(final SubLObject focal_term, SubLObject assertion, final SubLObject polycanonicalizedP) {
        SubLObject evaluations = NIL;
        if (NIL != polycanonicalizedP) {
            assertion = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term).first();
        }
        if ((NIL != assertion) && (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion))) {
            final SubLObject pred = quaternary_fet_evaluation_pred();
            final SubLObject mt = $$InferencePSC;
            evaluations = ftemplate_ask_template($list399, list($$assertedSentence, listS(pred, $sym400$_EVAL, assertion, $list401)), mt, $list402);
        }
        return evaluations;
    }

    public static SubLObject ftemplate_evaluation_judgment(final SubLObject evaluation) {
        return ftemplate_ask_variable($sym403$_JUDGMENT, list($$assertedSentence, listS($$evaluationOutputSentences, evaluation, $list405)), $$InferencePSC, UNPROVIDED).first();
    }

    public static SubLObject xml_serialize_assertion_timestamp_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date = (NIL != polycanonicalizedP) ? ftemplate_polycanonicalized_assertion_date(focal_term, assertion) : assertions_high.asserted_when(assertion);
        final SubLObject second = (NIL != polycanonicalizedP) ? ftemplate_polycanonicalized_assertion_second(focal_term, assertion) : assertions_high.asserted_second(assertion);
        final SubLObject cyclist = NIL;
        final SubLObject image_id = NIL;
        final SubLObject purpose = NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            cycml_generator.cycml_serialize_bookkeeping(cyclist, image_id, date, second, purpose);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_date(final SubLObject focal_term, final SubLObject assertion) {
        SubLObject date = NIL;
        if (NIL == date) {
            SubLObject csome_list_var;
            SubLObject hl_assertion;
            for (csome_list_var = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term), hl_assertion = NIL, hl_assertion = csome_list_var.first(); (NIL == date) && (NIL != csome_list_var); date = assertions_high.asserted_when(hl_assertion) , csome_list_var = csome_list_var.rest() , hl_assertion = csome_list_var.first()) {
            }
        }
        return date;
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_second(final SubLObject focal_term, final SubLObject assertion) {
        SubLObject date = NIL;
        if (NIL == date) {
            SubLObject csome_list_var;
            SubLObject hl_assertion;
            for (csome_list_var = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term), hl_assertion = NIL, hl_assertion = csome_list_var.first(); (NIL == date) && (NIL != csome_list_var); date = assertions_high.asserted_second(hl_assertion) , csome_list_var = csome_list_var.rest() , hl_assertion = csome_list_var.first()) {
            }
        }
        return date;
    }

    public static SubLObject xml_serialize_assertion_elmt_for_formula_template_instance(final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            if (NIL != polycanonicalizedP) {
                xml_serialize_elmt_information_for_assertion(ftemplate_polycanonicalized_assertion_mt(assertion), stream);
            } else {
                xml_serialize_elmt_information_for_assertion(uncanonicalizer.assertion_elmt(assertion), stream);
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject xml_serialize_elmt_information_for_assertion(final SubLObject elmt, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$388 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$knownAssertionELMt, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$389 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$390 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        cycml.cycml_serialize_term(elmt);
                    } finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$390, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$389, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$388, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$390 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$knownAssertionELMt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$390, thread);
                }
            }
            final SubLObject pcw = map_elmt_to_published_conceptual_work(elmt);
            if (NIL != pcw) {
                try {
                    final SubLObject _prev_bind_0_$391 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$knownAssertionCW, NIL, NIL, NIL, xml_vars.formula_template_namespace());
                        final SubLObject _prev_bind_0_$392 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$391 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                            xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                            xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                            cycml.cycml_serialize_term(pcw);
                        } finally {
                            xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_5, thread);
                            xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$391, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$392, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$391, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$393 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$knownAssertionCW);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$393, thread);
                    }
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return elmt;
    }

    public static SubLObject clear_map_elmt_to_published_conceptual_work() {
        final SubLObject cs = $map_elmt_to_published_conceptual_work_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_map_elmt_to_published_conceptual_work(final SubLObject elmt) {
        return memoization_state.caching_state_remove_function_results_with_args($map_elmt_to_published_conceptual_work_caching_state$.getGlobalValue(), list(elmt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject map_elmt_to_published_conceptual_work_internal(final SubLObject elmt) {
        final SubLObject v_properties = list($MAX_NUMBER, ONE_INTEGER);
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        return NIL != hlmt.hlmt_p(monad_mt) ? ftemplate_ask_variable($PCW, list($$contextOfPCW, $PCW, monad_mt), $$InferencePSC, v_properties).first() : NIL;
    }

    public static SubLObject map_elmt_to_published_conceptual_work(final SubLObject elmt) {
        SubLObject caching_state = $map_elmt_to_published_conceptual_work_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK, $map_elmt_to_published_conceptual_work_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, elmt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(map_elmt_to_published_conceptual_work_internal(elmt)));
            memoization_state.caching_state_put(caching_state, elmt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_assertions_for_leaf_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt, final SubLObject query_mt) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = template_topic_templates(template_topic);
        SubLObject ftemplate = NIL;
        ftemplate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject template_id = formula_template_id(ftemplate);
            final SubLObject assertions = get_assertions_for_formula_template_instance(focal_term, ftemplate, elmt, query_mt);
            if (NIL != assertions) {
                results = cons(list(template_id, assertions), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ftemplate = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject get_assertions_for_formula_template_instance(final SubLObject focal_term, final SubLObject ftemplate, SubLObject elmt, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(focal_term) : "forts.fort_p(focal_term) " + "CommonSymbols.NIL != forts.fort_p(focal_term) " + focal_term;
        assert NIL != formula_template_p(ftemplate) : "formula_templates.formula_template_p(ftemplate) " + "CommonSymbols.NIL != formula_templates.formula_template_p(ftemplate) " + ftemplate;
        elmt = czer_main.canonicalize_term(elmt, elmt);
        assert NIL != hlmt.hlmt_p(elmt) : "hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) " + elmt;
        SubLObject assertions = NIL;
        thread.resetMultipleValues();
        final SubLObject assertion_sentence = get_assertion_sentence_and_constraints_from_formula_template(ftemplate, focal_term, elmt);
        final SubLObject constraint_clauses = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject query_sentence = get_assertion_finding_query_sentence(assertion_sentence, constraint_clauses);
        final SubLObject original_query = thread.secondMultipleValue();
        final SubLObject allow_skolemsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != query_sentence) {
            final SubLObject has_reformulation_specP = formula_template_has_reformulation_specificationP(ftemplate);
            final SubLObject max_number = ((NIL == has_reformulation_specP) && (NIL != formula_template_is_single_entryP(ftemplate))) ? ONE_INTEGER : NIL;
            final SubLObject result = get_assertions_for_fet_sentence(query_sentence, focal_term, query_mt, max_number, original_query, constraint_clauses, T, has_reformulation_specP);
            assertions = kb_utilities.sort_terms(result, NIL, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return assertions;
    }

    public static SubLObject get_assertions_for_fet_sentence(final SubLObject formula, final SubLObject focal_term, SubLObject query_mt, final SubLObject max_number, final SubLObject original_query, SubLObject constraint_clauses, SubLObject reassemble_polycanonicalized_assertionsP, SubLObject check_reformulatedP) {
        if (constraint_clauses == UNPROVIDED) {
            constraint_clauses = NIL;
        }
        if (reassemble_polycanonicalized_assertionsP == UNPROVIDED) {
            reassemble_polycanonicalized_assertionsP = T;
        }
        if (check_reformulatedP == UNPROVIDED) {
            check_reformulatedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_set = NIL;
        SubLObject default_assertions = NIL;
        SubLObject reformulated_result_set = NIL;
        SubLObject reformulated_assertions = NIL;
        final SubLObject assertion_varP = cycl_utilities.expression_find(fet_assertion_variable_for_formula(original_query), formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == cycl_utilities.expression_find($$ist_Intermediate, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject enhanced_query_mt = (NIL != hlmt.possibly_mt_p(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread))) ? hlmt_czer.canonicalize_hlmt(list($$MtUnionFn, formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread), query_mt)) : query_mt;
            result_set = ftemplate_loading_supporting_ask(formula, enhanced_query_mt, max_number, T);
            default_assertions = get_assertions_from_formula_template_result_sets(original_query, result_set, focal_term, enhanced_query_mt, reassemble_polycanonicalized_assertionsP, assertion_varP);
            if ((NIL == result_set) && (NIL != isa.isaP(query_mt, $$RKFInteractionContextMicrotheory, query_mt, UNPROVIDED))) {
                final SubLObject lexical_mt = get_lexical_mt_for_rkf_interaction_mt(query_mt);
                result_set = ftemplate_loading_supporting_ask(formula, lexical_mt, max_number, T);
                query_mt = lexical_mt;
            }
            final SubLObject temp_assertions = get_assertions_from_formula_template_result_sets(original_query, result_set, focal_term, query_mt, reassemble_polycanonicalized_assertionsP, assertion_varP);
            if (NIL != temp_assertions) {
                default_assertions = append(temp_assertions, default_assertions);
            }
        }
        if (NIL != check_reformulatedP) {
            final SubLObject refspec_var = $sym417$__REFSPEC;
            final SubLObject query = constrain_query_with_accumulated_constraints(constrained_term_finder.generate_note_reformulation_formula($sym418$__ASSERTION, focal_term, original_query, refspec_var), constraint_clauses);
            reformulated_result_set = ftemplate_loading_supporting_ask(query, ftemplate_reformulated_query_mt(query_mt, original_query), max_number, T);
            if (((NIL == reformulated_result_set) && (NIL != hlmt.possibly_mt_p(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread)))) && (NIL != fet_fallback_to_default_mtP(original_query))) {
                reformulated_result_set = ftemplate_loading_supporting_ask(query, ftemplate_reformulated_query_mt(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread), original_query), max_number, T);
            }
            reformulated_result_set = ftemplate_filter_reformulated_result_set(reformulated_result_set, result_set);
            reformulated_assertions = unpack_note_reformulation_result_sets(original_query, reformulated_result_set, reassemble_polycanonicalized_assertionsP);
        }
        return remove_duplicates(union(reformulated_assertions, default_assertions, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fet_fallback_to_default_mtP(final SubLObject original_query) {
        return T;
    }

    public static SubLObject ftemplate_reformulated_query_mt(final SubLObject query_mt, final SubLObject original_query) {
        return NIL != el_formula_with_operator_p(original_query, $$ist_Intermediate) ? ftemplate_qualify_mt_to_anytime(query_mt) : query_mt;
    }

    public static SubLObject ftemplate_filter_reformulated_result_set(final SubLObject reformulated_result_set, final SubLObject original_result_set) {
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var = reformulated_result_set;
        SubLObject reformulated_result = NIL;
        reformulated_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == ftemplate_reformulated_result_duplicateP(reformulated_result, original_result_set)) {
                filtered = cons(reformulated_result, filtered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            reformulated_result = cdolist_list_var.first();
        } 
        return filtered;
    }

    public static SubLObject ftemplate_reformulated_result_duplicateP(final SubLObject reformulated_result, final SubLObject original_result_set) {
        final SubLObject v_bindings = reformulated_result.first();
        final SubLObject assertion = bindings.variable_lookup($sym418$__ASSERTION, v_bindings);
        SubLObject duplicateP = NIL;
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == duplicateP)) {
            SubLObject csome_list_var = original_result_set;
            SubLObject original_result = NIL;
            original_result = csome_list_var.first();
            while ((NIL == duplicateP) && (NIL != csome_list_var)) {
                if (NIL == duplicateP) {
                    SubLObject csome_list_var_$396 = second(original_result);
                    SubLObject support = NIL;
                    support = csome_list_var_$396.first();
                    while ((NIL == duplicateP) && (NIL != csome_list_var_$396)) {
                        if (support.eql(assertion)) {
                            duplicateP = T;
                        }
                        csome_list_var_$396 = csome_list_var_$396.rest();
                        support = csome_list_var_$396.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                original_result = csome_list_var.first();
            } 
        }
        return duplicateP;
    }

    public static SubLObject unpack_note_reformulation_result_sets(final SubLObject original_query, final SubLObject result_set, final SubLObject reassemble_polycanonicalized_assertionsP) {
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = result_set;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$397 = unpack_note_reformulation_result(original_query, result, reassemble_polycanonicalized_assertionsP);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$397.first();
            while (NIL != cdolist_list_var_$397) {
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    assertions = cons(assertion, assertions);
                } else {
                    assertions = add_one_polycanonicalized_result(assertion, assertions);
                }
                cdolist_list_var_$397 = cdolist_list_var_$397.rest();
                assertion = cdolist_list_var_$397.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(assertions);
    }

    public static SubLObject add_one_polycanonicalized_result(final SubLObject assertion, SubLObject assertions) {
        SubLObject existing = NIL;
        if (NIL == existing) {
            SubLObject csome_list_var = assertions;
            SubLObject other_assertion = NIL;
            other_assertion = csome_list_var.first();
            while ((NIL == existing) && (NIL != csome_list_var)) {
                if (((NIL != ftemplate_polycanonicalized_assertion_p(other_assertion)) && second(other_assertion).equal(second(assertion))) && third(other_assertion).equal(third(assertion))) {
                    existing = other_assertion;
                }
                csome_list_var = csome_list_var.rest();
                other_assertion = csome_list_var.first();
            } 
        }
        if (NIL == existing) {
            assertions = cons(assertion, assertions);
        } else
            if (!existing.equal(assertion)) {
                set_nth(THREE_INTEGER, existing, delete_duplicates(nconc(nth(THREE_INTEGER, assertion), nth(THREE_INTEGER, existing)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }

        return assertions;
    }

    public static SubLObject unpack_note_reformulation_result(final SubLObject original_query, final SubLObject result, final SubLObject reassemble_polycanonicalized_assertionsP) {
        SubLObject assertions = NIL;
        final SubLObject binding_set = result.first();
        final SubLObject supports = second(result);
        SubLObject elmt = NIL;
        if (NIL != reassemble_polycanonicalized_assertionsP) {
            final SubLObject bound_formula = bindings.apply_bindings(binding_set, copy_formula(original_query));
            SubLObject hl_assertions = NIL;
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != assertion_handles.assertion_p(support)) && (NIL != constrained_term_finder.is_note_reformulation_assertionP(support))) {
                    final SubLObject hl_assertion = assertions_high.gaf_arg1(support);
                    if (NIL != assertion_handles.assertion_p(hl_assertion)) {
                        hl_assertions = cons(hl_assertion, hl_assertions);
                        if (NIL == elmt) {
                            elmt = uncanonicalizer.assertion_elmt(support);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            if (NIL != hl_assertions) {
                final SubLObject item_var = make_ftemplate_polycanonicalized_assertion(bound_formula, elmt, hl_assertions);
                if (NIL == member(item_var, assertions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    assertions = cons(item_var, assertions);
                }
            }
        } else {
            final SubLObject assertion = bindings.variable_lookup($sym418$__ASSERTION, binding_set);
            if (NIL != assertion_handles.assertion_p(assertion)) {
                final SubLObject item_var2 = assertion;
                if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                    assertions = cons(item_var2, assertions);
                }
            }
        }
        return nreverse(assertions);
    }

    public static SubLObject ftemplate_loading_supporting_ask(final SubLObject query, final SubLObject elmt, final SubLObject number, SubLObject indeterminateP) {
        if (indeterminateP == UNPROVIDED) {
            indeterminateP = NIL;
        }
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, number, UNPROVIDED, UNPROVIDED);
        SubLObject result_set = NIL;
        query_properties = putf(query_properties, $RESULT_UNIQUENESS, $BINDINGS);
        query_properties = putf(query_properties, $PROBABLY_APPROXIMATELY_DONE, $float$1_0);
        query_properties = putf(query_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
        query_properties = putf(query_properties, $ANSWER_LANGUAGE, $HL);
        query_properties = putf(query_properties, $kw424$ALLOW_INDETERMINATE_RESULTS_, indeterminateP);
        query_properties = putf(query_properties, $PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
        if (NIL != is_ftemplate_loading_supporting_ask_browsableP()) {
            query_properties = putf(query_properties, $BROWSABLE_, T);
        }
        result_set = inference_kernel.new_cyc_query(query, elmt, query_properties);
        return result_set;
    }

    public static SubLObject smarter_find_visible_assertions_cycl(final SubLObject formula, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visible_assertions = NIL;
        SubLObject all_assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            all_assertions = czer_meta.find_visible_assertions_cycl(formula, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))) {
                    visible_assertions = cons(assertion, visible_assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
        }
        return visible_assertions;
    }

    public static SubLObject get_assertions_from_formula_template_result_sets(final SubLObject formula, final SubLObject result_set, final SubLObject focal_term, final SubLObject elmt, final SubLObject reassemble_polycanonicalized_assertionsP, SubLObject assertion_varP) {
        if (assertion_varP == UNPROVIDED) {
            assertion_varP = NIL;
        }
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = result_set;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject binding_set = result.first();
            final SubLObject supports = second(result);
            SubLObject bound_formula = copy_formula(formula);
            final SubLObject discardP = NIL;
            SubLObject contains_skolemsP = NIL;
            SubLObject v_skolems = NIL;
            if (NIL == discardP) {
                SubLObject csome_list_var = binding_set;
                SubLObject binding = NIL;
                binding = csome_list_var.first();
                while ((NIL == discardP) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = binding;
                    SubLObject variable = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list426);
                    variable = current.first();
                    current = v_term = current.rest();
                    if (NIL != is_skolemish_termP(v_term)) {
                        v_skolems = cons(v_term, v_skolems);
                        contains_skolemsP = T;
                    } else {
                        bound_formula = list_utilities.tree_substitute(bound_formula, variable, v_term);
                    }
                    csome_list_var = csome_list_var.rest();
                    binding = csome_list_var.first();
                } 
            }
            if (NIL == discardP) {
                if ((NIL != reassemble_polycanonicalized_assertionsP) && (NIL != contains_skolemsP)) {
                    SubLObject skolem_elmt = NIL;
                    SubLObject hl_assertions = NIL;
                    SubLObject cdolist_list_var_$398 = supports;
                    SubLObject support = NIL;
                    support = cdolist_list_var_$398.first();
                    while (NIL != cdolist_list_var_$398) {
                        if (NIL != assertion_handles.assertion_p(support)) {
                            hl_assertions = cons(support, hl_assertions);
                            if (NIL == skolem_elmt) {
                                SubLObject cdolist_list_var_$399 = v_skolems;
                                SubLObject skolem = NIL;
                                skolem = cdolist_list_var_$399.first();
                                while (NIL != cdolist_list_var_$399) {
                                    if (NIL != cycl_utilities.expression_find(skolem, support, T, symbol_function(EQUAL), UNPROVIDED)) {
                                        skolem_elmt = uncanonicalizer.assertion_elmt(support);
                                    }
                                    cdolist_list_var_$399 = cdolist_list_var_$399.rest();
                                    skolem = cdolist_list_var_$399.first();
                                } 
                            }
                        }
                        cdolist_list_var_$398 = cdolist_list_var_$398.rest();
                        support = cdolist_list_var_$398.first();
                    } 
                    if (NIL == skolem_elmt) {
                        skolem_elmt = elmt;
                    }
                    if (NIL != hl_assertions) {
                        assertions = add_one_polycanonicalized_result(make_ftemplate_polycanonicalized_assertion(bound_formula, skolem_elmt, hl_assertions), assertions);
                    }
                } else
                    if (NIL != contains_skolemsP) {
                        SubLObject cdolist_list_var_$400 = supports;
                        SubLObject support2 = NIL;
                        support2 = cdolist_list_var_$400.first();
                        while (NIL != cdolist_list_var_$400) {
                            if (NIL != assertion_handles.assertion_p(support2)) {
                                assertions = cons(support2, assertions);
                            }
                            cdolist_list_var_$400 = cdolist_list_var_$400.rest();
                            support2 = cdolist_list_var_$400.first();
                        } 
                    } else
                        if (NIL != assertion_varP) {
                            final SubLObject assertion = bindings.variable_lookup(fet_assertion_variable_for_formula(formula), binding_set);
                            if (NIL != assertion_handles.assertion_p(assertion)) {
                                assertions = cons(assertion, assertions);
                            }
                        } else {
                            final SubLObject component_assertions = smarter_find_visible_assertions_cycl(bound_formula, elmt);
                            if (NIL != component_assertions) {
                                if (NIL != list_utilities.singletonP(component_assertions)) {
                                    final SubLObject item_var = component_assertions.first();
                                    if (NIL == member(item_var, assertions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        assertions = cons(item_var, assertions);
                                    }
                                } else
                                    if (NIL != list_utilities.list_of_type_p(symbol_function($sym427$DEDUCED_ASSERTION_), component_assertions)) {
                                        final SubLObject item_var = component_assertions.first();
                                        if (NIL == member(item_var, assertions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            assertions = cons(item_var, assertions);
                                        }
                                    } else
                                        if ((NIL != reassemble_polycanonicalized_assertionsP) && ((NIL != el_conjunction_p(formula)) || (NIL != el_existential_p(formula)))) {
                                            final SubLObject elmt_$401 = cycl_utilities.hl_to_el(bindings.variable_lookup($elmt_variable_for_formula_templates$.getGlobalValue(), binding_set));
                                            if (NIL == el_grammar.el_term_p(elmt_$401)) {
                                                uncanonicalizer.assertion_elmt(component_assertions.first());
                                            }
                                            final SubLObject item_var2 = make_ftemplate_polycanonicalized_assertion(bound_formula, elmt_$401, UNPROVIDED);
                                            if (NIL == member(item_var2, assertions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                assertions = cons(item_var2, assertions);
                                            }
                                        } else {
                                            SubLObject cdolist_list_var_$401 = component_assertions;
                                            SubLObject component_assertion = NIL;
                                            component_assertion = cdolist_list_var_$401.first();
                                            while (NIL != cdolist_list_var_$401) {
                                                if (NIL != assertion_handles.assertion_p(component_assertion)) {
                                                    assertions = cons(component_assertion, assertions);
                                                }
                                                cdolist_list_var_$401 = cdolist_list_var_$401.rest();
                                                component_assertion = cdolist_list_var_$401.first();
                                            } 
                                        }


                            }
                        }


            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        SubLObject reversed = NIL;
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion2 = NIL;
        assertion2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == bad_assertion_for_formula_templatesP(assertion2)) {
                reversed = cons(assertion2, reversed);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion2 = cdolist_list_var2.first();
        } 
        return reversed;
    }

    public static SubLObject make_ftemplate_polycanonicalized_assertion(final SubLObject sentence, final SubLObject mt, SubLObject hl_assertions) {
        if (hl_assertions == UNPROVIDED) {
            hl_assertions = NIL;
        }
        assert NIL != el_formula_p(sentence) : "el_utilities.el_formula_p(sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(sentence) " + sentence;
        assert NIL != el_grammar.el_term_p(mt) : "el_grammar.el_term_p(mt) " + "CommonSymbols.NIL != el_grammar.el_term_p(mt) " + mt;
        SubLObject cdolist_list_var = hl_assertions;
        SubLObject hl_assertion = NIL;
        hl_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(hl_assertion) : "assertion_handles.assertion_p(hl_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(hl_assertion) " + hl_assertion;
            cdolist_list_var = cdolist_list_var.rest();
            hl_assertion = cdolist_list_var.first();
        } 
        return list($POLY_CANONICALIZED, sentence, mt, hl_assertions);
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && (NIL != list_utilities.lengthGE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthLE(v_object, FOUR_INTEGER, UNPROVIDED))) && (v_object.first() == $POLY_CANONICALIZED));
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_sentence(final SubLObject assertion) {
        assert NIL != ftemplate_polycanonicalized_assertion_p(assertion) : "formula_templates.ftemplate_polycanonicalized_assertion_p(assertion) " + "CommonSymbols.NIL != formula_templates.ftemplate_polycanonicalized_assertion_p(assertion) " + assertion;
        return second(assertion);
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_hl_assertions(final SubLObject assertion, final SubLObject primary_term) {
        assert NIL != ftemplate_polycanonicalized_assertion_p(assertion) : "formula_templates.ftemplate_polycanonicalized_assertion_p(assertion) " + "CommonSymbols.NIL != formula_templates.ftemplate_polycanonicalized_assertion_p(assertion) " + assertion;
        final SubLObject already_known = fourth(assertion);
        if (NIL != already_known) {
            return already_known;
        }
        final SubLObject newly_found = ftemplate_polycanonicalized_assertion_find_hl_assertions(assertion, primary_term);
        set_nth(THREE_INTEGER, assertion, newly_found);
        return newly_found;
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_find_hl_assertions(final SubLObject assertion, final SubLObject primary_term) {
        final SubLObject psentence = ftemplate_polycanonicalized_assertion_sentence(assertion);
        final SubLObject elmt = hlmt_czer.canonicalize_hlmt(ftemplate_polycanonicalized_assertion_mt(assertion));
        final SubLObject query_sentence = get_assertion_finding_query_sentence(psentence, NIL);
        final SubLObject max_number = NIL;
        final SubLObject reassemble_polycanonicalized_assertionsP = NIL;
        final SubLObject check_reformulatedP = T;
        return get_assertions_for_fet_sentence(query_sentence, primary_term, elmt, max_number, psentence, NIL, reassemble_polycanonicalized_assertionsP, check_reformulatedP);
    }

    public static SubLObject ftemplate_polycanonicalized_assertion_mt(final SubLObject assertion) {
        assert NIL != ftemplate_polycanonicalized_assertion_p(assertion) : "formula_templates.ftemplate_polycanonicalized_assertion_p(assertion) " + "CommonSymbols.NIL != formula_templates.ftemplate_polycanonicalized_assertion_p(assertion) " + assertion;
        return third(assertion);
    }

    public static SubLObject ftemplate_assertion_mt(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return assertions_high.assertion_mt(assertion);
        }
        if (NIL != ftemplate_polycanonicalized_assertion_p(assertion)) {
            return ftemplate_polycanonicalized_assertion_mt(assertion);
        }
        return NIL;
    }

    public static SubLObject bad_assertion_for_formula_templatesP(final SubLObject assertion) {
        final SubLObject badP = NIL;
        if (NIL != assertion_handles.assertion_p(assertion)) {
        }
        return badP;
    }

    public static SubLObject uninteresting_indeterminate_termP(final SubLObject v_term) {
        return makeBoolean((NIL != inference_trampolines.inference_indeterminate_termP(v_term)) && (NIL == is_skolemish_termP(v_term)));
    }

    public static SubLObject is_skolemish_termP(final SubLObject v_term) {
        return makeBoolean((NIL != fort_types_interface.skolem_function_p(v_term)) || (NIL != term.skolem_nartP(v_term)));
    }

    public static SubLObject get_assertion_sentence_and_constraints_from_formula_template(final SubLObject ftemplate, final SubLObject focal_term, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = formula_template_formula(ftemplate);
        final SubLObject focal_term_argpositions = formula_template_focal_term(ftemplate);
        SubLObject v_clauses = NIL;
        if (NIL != formula) {
            formula = copy_formula(formula);
            SubLObject cdolist_list_var = focal_term_argpositions;
            SubLObject focal_term_argpos = NIL;
            focal_term_argpos = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cycl_utilities.formula_arg_position_nsubst(focal_term, focal_term_argpos.rest(), formula);
                cdolist_list_var = cdolist_list_var.rest();
                focal_term_argpos = cdolist_list_var.first();
            } 
            SubLObject list_var = NIL;
            SubLObject argpos_detail = NIL;
            SubLObject var_index = NIL;
            list_var = formula_template_argpos_ordering(ftemplate);
            argpos_detail = list_var.first();
            for (var_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , argpos_detail = list_var.first() , var_index = add(ONE_INTEGER, var_index)) {
                final SubLObject variable = nth(var_index, $unique_variables_list_for_formula_templates$.getGlobalValue());
                final SubLObject argpos = arg_position_details_argument_position(argpos_detail);
                final SubLObject unknown_replacement = arg_position_details_unknown_replacement(argpos_detail);
                SubLObject constraint = NIL;
                if (NIL == subl_promotions.memberP(argpos, focal_term_argpositions, symbol_function(EQUAL), UNPROVIDED)) {
                    constraint = cycl_utilities.formula_arg_position(formula, argpos.rest(), UNPROVIDED);
                    cycl_utilities.formula_arg_position_nsubst(variable, argpos.rest(), formula);
                    thread.resetMultipleValues();
                    final SubLObject collection = convert_ftemplate_input_constraint_to_collection(constraint, elmt);
                    final SubLObject predicate = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != collection) {
                        SubLObject clause = make_binary_formula(predicate, variable, collection);
                        if (NIL != cycl_grammar.cycl_represented_term_p(unknown_replacement)) {
                            clause = make_disjunction(list(clause, list($$equals, variable, unknown_replacement)));
                        }
                        v_clauses = cons(clause, v_clauses);
                    }
                }
            }
            return values(formula, v_clauses);
        }
        return NIL;
    }

    public static SubLObject get_assertion_finding_query_sentence(SubLObject formula, SubLObject v_clauses) {
        if (v_clauses == UNPROVIDED) {
            v_clauses = NIL;
        }
        SubLObject allow_skolemP = NIL;
        final SubLObject unconstrained_query = copy_formula(formula);
        if (NIL != el_existential_p(formula)) {
            formula = cycl_utilities.formula_arg2(formula, UNPROVIDED);
            allow_skolemP = T;
        }
        formula = constrain_query_with_accumulated_constraints(formula, v_clauses);
        return values(formula, unconstrained_query, allow_skolemP);
    }

    public static SubLObject constrain_query_with_accumulated_constraints(final SubLObject formula, SubLObject v_clauses) {
        SubLObject new_query_formula = formula;
        if (NIL == v_clauses) {
            return ftemplate_assertion_constrained_query_formula(formula, UNPROVIDED);
        }
        if (cycl_utilities.formula_arg0(formula).eql($$ist)) {
            SubLObject ist_part = NIL;
            SubLObject mt_part = NIL;
            SubLObject formula_part = NIL;
            destructuring_bind_must_consp(formula, formula, $list434);
            ist_part = formula.first();
            SubLObject current = formula.rest();
            destructuring_bind_must_consp(current, formula, $list434);
            mt_part = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, formula, $list434);
            formula_part = current.first();
            current = current.rest();
            if (NIL == current) {
                v_clauses = cons(ftemplate_assertion_constrained_query_formula(formula_part, UNPROVIDED), v_clauses);
                new_query_formula = make_binary_formula(ist_part, mt_part, simplifier.conjoin(v_clauses, UNPROVIDED));
            } else {
                cdestructuring_bind_error(formula, $list434);
            }
        } else {
            v_clauses = cons(ftemplate_assertion_constrained_query_formula(formula, UNPROVIDED), v_clauses);
            new_query_formula = simplifier.conjoin(v_clauses, UNPROVIDED);
        }
        return new_query_formula;
    }

    public static SubLObject fet_assertion_variable_for_formula(final SubLObject formula) {
        return $sym435$_FET_ASSERTION_VAR_524;
    }

    public static SubLObject ftemplate_assertion_constrained_query_formula(final SubLObject formula, SubLObject use_ist_assertedP) {
        if (use_ist_assertedP == UNPROVIDED) {
            use_ist_assertedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(formula);
        if (NIL != el_existential_p(formula)) {
            SubLObject quantifier = NIL;
            SubLObject variable = NIL;
            SubLObject v_clauses = NIL;
            destructuring_bind_must_consp(formula, formula, $list436);
            quantifier = formula.first();
            SubLObject current = formula.rest();
            destructuring_bind_must_consp(current, formula, $list436);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, formula, $list436);
            v_clauses = current.first();
            current = current.rest();
            if (NIL == current) {
                return make_binary_formula(quantifier, variable, ftemplate_assertion_constrained_query_formula(v_clauses, UNPROVIDED));
            }
            cdestructuring_bind_error(formula, $list436);
        } else {
            if (NIL != el_conjunction_p(formula)) {
                SubLObject focused_clauses = NIL;
                final SubLObject _prev_bind_0 = $get_assertions_from_initial_askP$.currentBinding(thread);
                try {
                    $get_assertions_from_initial_askP$.bind(NIL, thread);
                    SubLObject cdolist_list_var = formula.rest();
                    SubLObject clause = NIL;
                    clause = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        focused_clauses = cons(ftemplate_assertion_constrained_query_formula(clause, T), focused_clauses);
                        cdolist_list_var = cdolist_list_var.rest();
                        clause = cdolist_list_var.first();
                    } 
                } finally {
                    $get_assertions_from_initial_askP$.rebind(_prev_bind_0, thread);
                }
                return simplifier.conjoin(focused_clauses, UNPROVIDED);
            }
            if (NIL == fort_types_interface.logical_connective_p(arg0)) {
                final SubLObject assertion_var = fet_assertion_variable_for_formula(formula);
                return NIL != formula_ok_for_fet_assertion_varP(formula, assertion_var) ? make_binary_formula($$assertionSentence, assertion_var, formula) : NIL != el_formula_with_operator_p(formula, $$ist) ? replace_formula_arg(ZERO_INTEGER, $$ist_Asserted, formula) : NIL != use_ist_assertedP ? make_binary_formula($$ist_Asserted, $elmt_variable_for_formula_templates$.getGlobalValue(), formula) : make_unary_formula($$assertedSentence, formula);
            }
        }
        return formula;
    }

    public static SubLObject formula_ok_for_fet_assertion_varP(final SubLObject formula, final SubLObject assertion_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $get_assertions_from_initial_askP$.getDynamicValue(thread)) && (NIL == cycl_utilities.expression_find(assertion_var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == el_formula_with_operator_p(formula, $$assertionProducedByReformulation)));
    }

    public static SubLObject convert_ftemplate_input_constraint_to_collection(final SubLObject constraint, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != narts_high.naut_p(constraint)) && (NIL == subl_promotions.memberP(constraint, $ftemplate_constraint_to_collection_skiplist$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
            final SubLObject collection = cycl_utilities.formula_arg1(constraint, UNPROVIDED);
            if (NIL != narts_high.naut_p(collection)) {
                final SubLObject pcase_var = cycl_utilities.formula_arg0(collection);
                if (pcase_var.eql($$SpecsFn)) {
                    return values(cycl_utilities.formula_arg1(collection, UNPROVIDED), $$genls);
                }
                if (pcase_var.eql($$SomeExampleFn)) {
                    SubLObject spec_coll = cycl_utilities.formula_arg1(collection, UNPROVIDED);
                    if ((NIL != narts_high.naut_p(spec_coll)) && cycl_utilities.formula_arg0(spec_coll).eql($$SpecsFn)) {
                        spec_coll = cycl_utilities.formula_arg1(spec_coll, UNPROVIDED);
                    }
                    return values(spec_coll, $$isa);
                }
                if (pcase_var.eql($$SomeExampleSpecFn)) {
                    return values(cycl_utilities.formula_arg1(collection, UNPROVIDED), $$isa);
                }
                return values(collection, $$isa);
            } else
                if (NIL != forts.fort_p(collection)) {
                    SubLObject usableP = NIL;
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        usableP = makeBoolean((NIL == kb_mapping_utilities.some_pred_value(collection, $$defnIff, UNPROVIDED, UNPROVIDED)) && (NIL == kb_mapping_utilities.some_pred_value(collection, $$defnSufficient, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    return values(NIL != usableP ? collection : NIL, $$isa);
                }

        }
        return values(NIL, NIL);
    }

    public static SubLObject get_lexical_mt_for_rkf_interaction_mt(final SubLObject domain_mt) {
        final SubLObject v_properties = list($MAX_NUMBER, ONE_INTEGER);
        final SubLObject lexical_candidates = ftemplate_ask_variable($LEXICAL_MT, list($$and, $list447, list($$genlMt, $LEXICAL_MT, domain_mt)), domain_mt, v_properties);
        return lexical_candidates.first();
    }

    public static SubLObject declare_formula_templates_file() {
        declareFunction(me, "template_topic_print_function_trampoline", "TEMPLATE-TOPIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "template_topic_p", "TEMPLATE-TOPIC-P", 1, 0, false);
        new formula_templates.$template_topic_p$UnaryFunction();
        declareFunction(me, "template_topic_supertopic", "TEMPLATE-TOPIC-SUPERTOPIC", 1, 0, false);
        declareFunction(me, "template_topic_topic", "TEMPLATE-TOPIC-TOPIC", 1, 0, false);
        declareFunction(me, "template_topic_subtopics", "TEMPLATE-TOPIC-SUBTOPICS", 1, 0, false);
        declareFunction(me, "template_topic_templates", "TEMPLATE-TOPIC-TEMPLATES", 1, 0, false);
        declareFunction(me, "template_topic_ordering", "TEMPLATE-TOPIC-ORDERING", 1, 0, false);
        declareFunction(me, "template_topic_title", "TEMPLATE-TOPIC-TITLE", 1, 0, false);
        declareFunction(me, "template_topic_term_prefix", "TEMPLATE-TOPIC-TERM-PREFIX", 1, 0, false);
        declareFunction(me, "template_topic_intro_template", "TEMPLATE-TOPIC-INTRO-TEMPLATE", 1, 0, false);
        declareFunction(me, "template_topic_source_types", "TEMPLATE-TOPIC-SOURCE-TYPES", 1, 0, false);
        declareFunction(me, "template_topic_source_mt", "TEMPLATE-TOPIC-SOURCE-MT", 1, 0, false);
        declareFunction(me, "template_topic_query_mt", "TEMPLATE-TOPIC-QUERY-MT", 1, 0, false);
        declareFunction(me, "template_topic_definitional_mt", "TEMPLATE-TOPIC-DEFINITIONAL-MT", 1, 0, false);
        declareFunction(me, "_csetf_template_topic_supertopic", "_CSETF-TEMPLATE-TOPIC-SUPERTOPIC", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_topic", "_CSETF-TEMPLATE-TOPIC-TOPIC", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_subtopics", "_CSETF-TEMPLATE-TOPIC-SUBTOPICS", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_templates", "_CSETF-TEMPLATE-TOPIC-TEMPLATES", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_ordering", "_CSETF-TEMPLATE-TOPIC-ORDERING", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_title", "_CSETF-TEMPLATE-TOPIC-TITLE", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_term_prefix", "_CSETF-TEMPLATE-TOPIC-TERM-PREFIX", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_intro_template", "_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_source_types", "_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_source_mt", "_CSETF-TEMPLATE-TOPIC-SOURCE-MT", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_query_mt", "_CSETF-TEMPLATE-TOPIC-QUERY-MT", 2, 0, false);
        declareFunction(me, "_csetf_template_topic_definitional_mt", "_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT", 2, 0, false);
        declareFunction(me, "make_template_topic", "MAKE-TEMPLATE-TOPIC", 0, 1, false);
        declareFunction(me, "visit_defstruct_template_topic", "VISIT-DEFSTRUCT-TEMPLATE-TOPIC", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_template_topic_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-TOPIC-METHOD", 2, 0, false);
        declareFunction(me, "arg_position_details_print_function_trampoline", "ARG-POSITION-DETAILS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "arg_position_details_p", "ARG-POSITION-DETAILS-P", 1, 0, false);
        new formula_templates.$arg_position_details_p$UnaryFunction();
        declareFunction(me, "arg_position_details_argument_position", "ARG-POSITION-DETAILS-ARGUMENT-POSITION", 1, 0, false);
        declareFunction(me, "arg_position_details_ordering", "ARG-POSITION-DETAILS-ORDERING", 1, 0, false);
        declareFunction(me, "arg_position_details_gloss", "ARG-POSITION-DETAILS-GLOSS", 1, 0, false);
        declareFunction(me, "arg_position_details_invisible_replacement_positions", "ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS", 1, 0, false);
        declareFunction(me, "arg_position_details_replacement_constraints", "ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "arg_position_details_candidate_replacements", "ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS", 1, 0, false);
        declareFunction(me, "arg_position_details_is_editable", "ARG-POSITION-DETAILS-IS-EDITABLE", 1, 0, false);
        declareFunction(me, "arg_position_details_explanation", "ARG-POSITION-DETAILS-EXPLANATION", 1, 0, false);
        declareFunction(me, "arg_position_details_requires_validation", "ARG-POSITION-DETAILS-REQUIRES-VALIDATION", 1, 0, false);
        declareFunction(me, "arg_position_details_unknown_replacement", "ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT", 1, 0, false);
        declareFunction(me, "_csetf_arg_position_details_argument_position", "_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_ordering", "_CSETF-ARG-POSITION-DETAILS-ORDERING", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_gloss", "_CSETF-ARG-POSITION-DETAILS-GLOSS", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_invisible_replacement_positions", "_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_replacement_constraints", "_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_candidate_replacements", "_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_is_editable", "_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_explanation", "_CSETF-ARG-POSITION-DETAILS-EXPLANATION", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_requires_validation", "_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION", 2, 0, false);
        declareFunction(me, "_csetf_arg_position_details_unknown_replacement", "_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT", 2, 0, false);
        declareFunction(me, "make_arg_position_details", "MAKE-ARG-POSITION-DETAILS", 0, 1, false);
        declareFunction(me, "visit_defstruct_arg_position_details", "VISIT-DEFSTRUCT-ARG-POSITION-DETAILS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_arg_position_details_method", "VISIT-DEFSTRUCT-OBJECT-ARG-POSITION-DETAILS-METHOD", 2, 0, false);
        declareFunction(me, "formula_template_print_function_trampoline", "FORMULA-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "formula_template_p", "FORMULA-TEMPLATE-P", 1, 0, false);
        new formula_templates.$formula_template_p$UnaryFunction();
        declareFunction(me, "formula_template_topic", "FORMULA-TEMPLATE-TOPIC", 1, 0, false);
        declareFunction(me, "formula_template_id", "FORMULA-TEMPLATE-ID", 1, 0, false);
        declareFunction(me, "formula_template_formula", "FORMULA-TEMPLATE-FORMULA", 1, 0, false);
        declareFunction(me, "formula_template_query_specification", "FORMULA-TEMPLATE-QUERY-SPECIFICATION", 1, 0, false);
        declareFunction(me, "formula_template_elmt", "FORMULA-TEMPLATE-ELMT", 1, 0, false);
        declareFunction(me, "formula_template_focal_term", "FORMULA-TEMPLATE-FOCAL-TERM", 1, 0, false);
        declareFunction(me, "formula_template_argpos_details", "FORMULA-TEMPLATE-ARGPOS-DETAILS", 1, 0, false);
        declareFunction(me, "formula_template_argpos_ordering", "FORMULA-TEMPLATE-ARGPOS-ORDERING", 1, 0, false);
        declareFunction(me, "formula_template_examples", "FORMULA-TEMPLATE-EXAMPLES", 1, 0, false);
        declareFunction(me, "formula_template_entry_format", "FORMULA-TEMPLATE-ENTRY-FORMAT", 1, 0, false);
        declareFunction(me, "formula_template_follow_ups", "FORMULA-TEMPLATE-FOLLOW-UPS", 1, 0, false);
        declareFunction(me, "formula_template_gloss", "FORMULA-TEMPLATE-GLOSS", 1, 0, false);
        declareFunction(me, "formula_template_refspec", "FORMULA-TEMPLATE-REFSPEC", 1, 0, false);
        declareFunction(me, "_csetf_formula_template_topic", "_CSETF-FORMULA-TEMPLATE-TOPIC", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_id", "_CSETF-FORMULA-TEMPLATE-ID", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_formula", "_CSETF-FORMULA-TEMPLATE-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_query_specification", "_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_elmt", "_CSETF-FORMULA-TEMPLATE-ELMT", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_focal_term", "_CSETF-FORMULA-TEMPLATE-FOCAL-TERM", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_argpos_details", "_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_argpos_ordering", "_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_examples", "_CSETF-FORMULA-TEMPLATE-EXAMPLES", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_entry_format", "_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_follow_ups", "_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_gloss", "_CSETF-FORMULA-TEMPLATE-GLOSS", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_refspec", "_CSETF-FORMULA-TEMPLATE-REFSPEC", 2, 0, false);
        declareFunction(me, "make_formula_template", "MAKE-FORMULA-TEMPLATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_formula_template", "VISIT-DEFSTRUCT-FORMULA-TEMPLATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_formula_template_method", "VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-METHOD", 2, 0, false);
        declareFunction(me, "is_ftemplate_loading_supporting_ask_browsableP", "IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?", 0, 0, false);
        declareMacro(me, "with_browsable_ftemplate_loading_supporting_ask", "WITH-BROWSABLE-FTEMPLATE-LOADING-SUPPORTING-ASK");
        declareMacro(me, "reusing_rkf_sd_problem_store_if_available", "REUSING-RKF-SD-PROBLEM-STORE-IF-AVAILABLE");
        declareFunction(me, "get_non_editable_assertions_for_template_topic_instance", "GET-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 0, 0, false);
        declareMacro(me, "with_known_non_editable_assertions_for_template_topic_instance", "WITH-KNOWN-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
        declareFunction(me, "compute_non_editable_assertions_for_template_topic_instance", "COMPUTE-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 4, 0, false);
        declareFunction(me, "is_non_editable_assertion_for_template_topic_instanceP", "IS-NON-EDITABLE-ASSERTION-FOR-TEMPLATE-TOPIC-INSTANCE?", 1, 0, false);
        declareMacro(me, "with_non_editable_assertions_for_template_topic_instance", "WITH-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
        declareFunction(me, "valid_formula_template_p", "VALID-FORMULA-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "new_template_topic", "NEW-TEMPLATE-TOPIC", 1, 1, false);
        declareFunction(me, "template_topic_add_subtopic", "TEMPLATE-TOPIC-ADD-SUBTOPIC", 2, 0, false);
        declareFunction(me, "template_topic_add_template", "TEMPLATE-TOPIC-ADD-TEMPLATE", 2, 0, false);
        declareFunction(me, "template_topic_add_title", "TEMPLATE-TOPIC-ADD-TITLE", 2, 0, false);
        declareFunction(me, "template_topic_add_term_prefix", "TEMPLATE-TOPIC-ADD-TERM-PREFIX", 2, 0, false);
        declareFunction(me, "template_topic_set_introductory_template", "TEMPLATE-TOPIC-SET-INTRODUCTORY-TEMPLATE", 2, 0, false);
        declareFunction(me, "template_topic_set_source_types", "TEMPLATE-TOPIC-SET-SOURCE-TYPES", 2, 0, false);
        declareFunction(me, "print_template_topic", "PRINT-TEMPLATE-TOPIC", 3, 0, false);
        declareMacro(me, "formula_template_xml_tag", "FORMULA-TEMPLATE-XML-TAG");
        declareFunction(me, "xml_template_topic_current_revision", "XML-TEMPLATE-TOPIC-CURRENT-REVISION", 0, 0, false);
        declareFunction(me, "xml_serialize_template_topic", "XML-SERIALIZE-TEMPLATE-TOPIC", 1, 1, false);
        declareFunction(me, "cfasl_output_object_template_topic_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-TOPIC-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_template_topic", "CFASL-OUTPUT-TEMPLATE-TOPIC", 2, 0, false);
        declareFunction(me, "cfasl_input_template_topic", "CFASL-INPUT-TEMPLATE-TOPIC", 1, 0, false);
        declareFunction(me, "new_formula_template", "NEW-FORMULA-TEMPLATE", 1, 1, false);
        declareFunction(me, "formula_template_is_single_entryP", "FORMULA-TEMPLATE-IS-SINGLE-ENTRY?", 1, 0, false);
        declareFunction(me, "formula_template_is_multiple_entryP", "FORMULA-TEMPLATE-IS-MULTIPLE-ENTRY?", 1, 0, false);
        declareFunction(me, "formula_template_has_reformulation_specificationP", "FORMULA-TEMPLATE-HAS-REFORMULATION-SPECIFICATION?", 1, 0, false);
        declareFunction(me, "print_formula_template", "PRINT-FORMULA-TEMPLATE", 3, 0, false);
        declareFunction(me, "formula_template_set_formula", "FORMULA-TEMPLATE-SET-FORMULA", 2, 0, false);
        declareFunction(me, "formula_template_set_examples", "FORMULA-TEMPLATE-SET-EXAMPLES", 2, 0, false);
        declareFunction(me, "formula_template_set_focal_term", "FORMULA-TEMPLATE-SET-FOCAL-TERM", 2, 0, false);
        declareFunction(me, "formula_template_set_elmt", "FORMULA-TEMPLATE-SET-ELMT", 2, 0, false);
        declareFunction(me, "formula_template_set_entry_format", "FORMULA-TEMPLATE-SET-ENTRY-FORMAT", 2, 0, false);
        declareFunction(me, "formula_template_set_gloss", "FORMULA-TEMPLATE-SET-GLOSS", 2, 0, false);
        declareFunction(me, "formula_template_set_query_specification", "FORMULA-TEMPLATE-SET-QUERY-SPECIFICATION", 2, 0, false);
        declareFunction(me, "xml_serialize_formula_template", "XML-SERIALIZE-FORMULA-TEMPLATE", 1, 1, false);
        declareFunction(me, "xml_serialize_formula_template_as_document", "XML-SERIALIZE-FORMULA-TEMPLATE-AS-DOCUMENT", 1, 1, false);
        declareFunction(me, "formula_template_dtd_uri", "FORMULA-TEMPLATE-DTD-URI", 0, 0, false);
        declareFunction(me, "xml_serialize_formula_template_header", "XML-SERIALIZE-FORMULA-TEMPLATE-HEADER", 0, 1, false);
        declareFunction(me, "cfasl_output_object_formula_template_method", "CFASL-OUTPUT-OBJECT-FORMULA-TEMPLATE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_formula_template", "CFASL-OUTPUT-FORMULA-TEMPLATE", 2, 0, false);
        declareFunction(me, "cfasl_input_formula_template", "CFASL-INPUT-FORMULA-TEMPLATE", 1, 0, false);
        declareFunction(me, "new_arg_position_details", "NEW-ARG-POSITION-DETAILS", 1, 0, false);
        declareFunction(me, "valid_arg_position_details_p", "VALID-ARG-POSITION-DETAILS-P", 1, 0, false);
        declareFunction(me, "print_arg_position_details", "PRINT-ARG-POSITION-DETAILS", 3, 0, false);
        declareFunction(me, "xml_serialize_arg_position_details", "XML-SERIALIZE-ARG-POSITION-DETAILS", 1, 1, false);
        declareFunction(me, "cfasl_output_object_arg_position_details_method", "CFASL-OUTPUT-OBJECT-ARG-POSITION-DETAILS-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_arg_position_details", "CFASL-OUTPUT-ARG-POSITION-DETAILS", 2, 0, false);
        declareFunction(me, "cfasl_input_arg_position_details", "CFASL-INPUT-ARG-POSITION-DETAILS", 1, 0, false);
        declareFunction(me, "xml_serialize_arg_position", "XML-SERIALIZE-ARG-POSITION", 1, 1, false);
        declareFunction(me, "formula_template_load_topic_template_details", "FORMULA-TEMPLATE-LOAD-TOPIC-TEMPLATE-DETAILS", 3, 0, false);
        declareFunction(me, "ftemplate_load_argument_position_detail_information", "FTEMPLATE-LOAD-ARGUMENT-POSITION-DETAIL-INFORMATION", 2, 1, false);
        declareFunction(me, "update_ftemplate_argpos_detail_glosses", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-GLOSSES", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_explanations", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-EXPLANATIONS", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_invisible_replacement_positions", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-INVISIBLE-REPLACEMENT-POSITIONS", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_replacable_positions", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-REPLACABLE-POSITIONS", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_replacement_constraints", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-REPLACEMENT-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_candidate_replacements", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-CANDIDATE-REPLACEMENTS", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_validation_required", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-VALIDATION-REQUIRED", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_unknown_replacements", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-UNKNOWN-REPLACEMENTS", 2, 0, false);
        declareFunction(me, "get_ftemplate_arg_position_details", "GET-FTEMPLATE-ARG-POSITION-DETAILS", 2, 0, false);
        declareFunction(me, "update_ftemplate_argpos_detail_ordering_information", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-ORDERING-INFORMATION", 1, 0, false);
        declareFunction(me, "ftemplate_compute_ordering_of_argpos_details", "FTEMPLATE-COMPUTE-ORDERING-OF-ARGPOS-DETAILS", 2, 0, false);
        declareFunction(me, "sort_argpos_details_by_ordering", "SORT-ARGPOS-DETAILS-BY-ORDERING", 1, 0, false);
        declareFunction(me, "ordered_by_argument_position", "ORDERED-BY-ARGUMENT-POSITION", 2, 0, false);
        declareFunction(me, "load_formula_template_skeleton_from_kb", "LOAD-FORMULA-TEMPLATE-SKELETON-FROM-KB", 2, 0, false);
        declareFunction(me, "load_formula_template_details_from_kb", "LOAD-FORMULA-TEMPLATE-DETAILS-FROM-KB", 2, 0, false);
        declareFunction(me, "ftemplate_assign_formula_component", "FTEMPLATE-ASSIGN-FORMULA-COMPONENT", 2, 0, false);
        declareFunction(me, "ftemplate_get_functional_slot_value", "FTEMPLATE-GET-FUNCTIONAL-SLOT-VALUE", 3, 0, false);
        declareFunction(me, "ftemplate_get_template_reformulation_specification", "FTEMPLATE-GET-TEMPLATE-REFORMULATION-SPECIFICATION", 2, 0, false);
        declareFunction(me, "ftemplate_get_query_specification", "FTEMPLATE-GET-QUERY-SPECIFICATION", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_formula", "FTEMPLATE-GET-TEMPLATE-FORMULA", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_elmt", "FTEMPLATE-GET-TEMPLATE-ELMT", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_follow_ups", "FTEMPLATE-GET-TEMPLATE-FOLLOW-UPS", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_gloss", "FTEMPLATE-GET-TEMPLATE-GLOSS", 2, 0, false);
        declareFunction(me, "ftemplate_qualify_mt_to_now", "FTEMPLATE-QUALIFY-MT-TO-NOW", 1, 0, false);
        declareFunction(me, "ftemplate_qualify_mt_to_anytime", "FTEMPLATE-QUALIFY-MT-TO-ANYTIME", 1, 0, false);
        declareFunction(me, "ftemplate_hlmt_change_time", "FTEMPLATE-HLMT-CHANGE-TIME", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_glosses", "FTEMPLATE-GET-TEMPLATE-GLOSSES", 3, 0, false);
        declareFunction(me, "ftemplate_get_template_explanations", "FTEMPLATE-GET-TEMPLATE-EXPLANATIONS", 3, 0, false);
        declareFunction(me, "ftemplate_get_template_examples", "FTEMPLATE-GET-TEMPLATE-EXAMPLES", 3, 0, false);
        declareFunction(me, "ftemplate_get_first_asserted_value", "FTEMPLATE-GET-FIRST-ASSERTED-VALUE", 4, 4, false);
        declareFunction(me, "ftemplate_get_asserted_values", "FTEMPLATE-GET-ASSERTED-VALUES", 4, 5, false);
        declareFunction(me, "ftemplate_get_template_focal_term", "FTEMPLATE-GET-TEMPLATE-FOCAL-TERM", 3, 0, false);
        declareFunction(me, "ftemplate_get_template_format", "FTEMPLATE-GET-TEMPLATE-FORMAT", 3, 0, false);
        declareFunction(me, "ftemplate_get_template_invisible_replacement_positions", "FTEMPLATE-GET-TEMPLATE-INVISIBLE-REPLACEMENT-POSITIONS", 3, 0, false);
        declareFunction(me, "ftemplate_get_template_replacement_constraints", "FTEMPLATE-GET-TEMPLATE-REPLACEMENT-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_unknown_replacements", "FTEMPLATE-GET-TEMPLATE-UNKNOWN-REPLACEMENTS", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_candidate_replacements_for_position", "FTEMPLATE-GET-TEMPLATE-CANDIDATE-REPLACEMENTS-FOR-POSITION", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_replacable_positions", "FTEMPLATE-GET-TEMPLATE-REPLACABLE-POSITIONS", 2, 0, false);
        declareFunction(me, "ftemplate_get_template_validation_requirements", "FTEMPLATE-GET-TEMPLATE-VALIDATION-REQUIREMENTS", 2, 0, false);
        declareFunction(me, "formula_template_load_topic_subtopic_ordering", "FORMULA-TEMPLATE-LOAD-TOPIC-SUBTOPIC-ORDERING", 2, 0, false);
        declareFunction(me, "formula_template_load_topic_template_ordering", "FORMULA-TEMPLATE-LOAD-TOPIC-TEMPLATE-ORDERING", 2, 0, false);
        declareFunction(me, "lower_priority_terms", "LOWER-PRIORITY-TERMS", 1, 0, false);
        declareFunction(me, "accumulate_lower_priority_terms", "ACCUMULATE-LOWER-PRIORITY-TERMS", 2, 0, false);
        declareFunction(me, "higher_priorityP", "HIGHER-PRIORITY?", 2, 0, false);
        declareFunction(me, "apply_prioritizing_ordering_to_kb_objects", "APPLY-PRIORITIZING-ORDERING-TO-KB-OBJECTS", 2, 0, false);
        declareFunction(me, "apply_prioritizing_ordering_to_kb_objects_rck", "APPLY-PRIORITIZING-ORDERING-TO-KB-OBJECTS-RCK", 2, 0, false);
        declareFunction(me, "construct_highXlow_information_from_prioritizing_ordering", "CONSTRUCT-HIGH/LOW-INFORMATION-FROM-PRIORITIZING-ORDERING", 1, 0, false);
        declareFunction(me, "formula_template_load_prioritization_information_for_subtopics", "FORMULA-TEMPLATE-LOAD-PRIORITIZATION-INFORMATION-FOR-SUBTOPICS", 2, 0, false);
        declareFunction(me, "formula_template_load_prioritization_information_for_templates", "FORMULA-TEMPLATE-LOAD-PRIORITIZATION-INFORMATION-FOR-TEMPLATES", 2, 0, false);
        declareFunction(me, "formula_template_organize_templates_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-TEMPLATES-BY-ORDERING", 1, 0, false);
        declareFunction(me, "formula_template_organize_subtopics_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-SUBTOPICS-BY-ORDERING", 1, 0, false);
        declareFunction(me, "formula_template_organize_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-BY-ORDERING", 3, 0, false);
        declareFunction(me, "stable_template_id_compare", "STABLE-TEMPLATE-ID-COMPARE", 2, 0, false);
        declareFunction(me, "formula_template_load_template_graph", "FORMULA-TEMPLATE-LOAD-TEMPLATE-GRAPH", 2, 0, false);
        declareFunction(me, "validate_template_topic_semantic_constraints", "VALIDATE-TEMPLATE-TOPIC-SEMANTIC-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "template_topic_query_mt_can_see_all_assertion_mts", "TEMPLATE-TOPIC-QUERY-MT-CAN-SEE-ALL-ASSERTION-MTS", 1, 0, false);
        declareFunction(me, "check_template_topic_query_mt_can_see_subtopics_assertion_mts", "CHECK-TEMPLATE-TOPIC-QUERY-MT-CAN-SEE-SUBTOPICS-ASSERTION-MTS", 2, 0, false);
        declareFunction(me, "templates_use_isaXgenlsP", "TEMPLATES-USE-ISA/GENLS?", 0, 0, false);
        declareFunction(me, "asserted_formula_template_ids_for_type", "ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE", 2, 0, false);
        declareFunction(me, "sort_formula_template_subtopics_by_template_count", "SORT-FORMULA-TEMPLATE-SUBTOPICS-BY-TEMPLATE-COUNT", 2, 0, false);
        declareFunction(me, "count_asserted_formula_template_ids_for_type_internal", "COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE-INTERNAL", 1, 1, false);
        declareFunction(me, "count_asserted_formula_template_ids_for_type", "COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE", 1, 1, false);
        declareFunction(me, "fet_topic_fort_has_subtopicsP", "FET-TOPIC-FORT-HAS-SUBTOPICS?", 2, 0, false);
        declareFunction(me, "fet_topic_fort_has_templatesP", "FET-TOPIC-FORT-HAS-TEMPLATES?", 2, 0, false);
        declareFunction(me, "formula_template_subtopics_for_type", "FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false);
        declareFunction(me, "formula_template_asserted_subtopics_for_type", "FORMULA-TEMPLATE-ASSERTED-SUBTOPICS-FOR-TYPE", 2, 0, false);
        declareFunction(me, "asserted_formula_template_subtopics_for_type", "ASSERTED-FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false);
        declareFunction(me, "formula_template_induction_mt", "FORMULA-TEMPLATE-INDUCTION-MT", 2, 0, false);
        declareFunction(me, "formula_template_topic_load_topic_specifics", "FORMULA-TEMPLATE-TOPIC-LOAD-TOPIC-SPECIFICS", 2, 0, false);
        declareFunction(me, "topictmplt_get_topic_template_source_types", "TOPICTMPLT-GET-TOPIC-TEMPLATE-SOURCE-TYPES", 2, 0, false);
        declareFunction(me, "ftemplate_topic_get_functional_slot_value", "FTEMPLATE-TOPIC-GET-FUNCTIONAL-SLOT-VALUE", 3, 0, false);
        declareFunction(me, "topictmplt_get_topic_template_introductory_template", "TOPICTMPLT-GET-TOPIC-TEMPLATE-INTRODUCTORY-TEMPLATE", 2, 0, false);
        declareFunction(me, "topictmplt_get_topic_template_title", "TOPICTMPLT-GET-TOPIC-TEMPLATE-TITLE", 2, 0, false);
        declareFunction(me, "topictmplt_get_topic_template_term_prefix", "TOPICTMPLT-GET-TOPIC-TEMPLATE-TERM-PREFIX", 2, 0, false);
        declareFunction(me, "topictmplt_get_topic_template_query_mt", "TOPICTMPLT-GET-TOPIC-TEMPLATE-QUERY-MT", 2, 0, false);
        declareFunction(me, "topictmplt_get_topic_template_definitional_mt", "TOPICTMPLT-GET-TOPIC-TEMPLATE-DEFINITIONAL-MT", 2, 0, false);
        declareFunction(me, "ftemplate_ask_variable", "FTEMPLATE-ASK-VARIABLE", 3, 1, false);
        declareFunction(me, "ftemplate_ask_template", "FTEMPLATE-ASK-TEMPLATE", 3, 1, false);
        declareFunction(me, "get_editable_and_non_editable_assertions_for_template_topic_instance", "GET-EDITABLE-AND-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 3, 0, false);
        declareFunction(me, "get_assertions_for_template_topic_instance", "GET-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 3, 0, false);
        declareFunction(me, "get_assertions_for_template_topic_instance_int", "GET-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE-INT", 4, 0, false);
        declareFunction(me, "xml_template_topic_assertions_current_revision", "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION", 0, 0, false);
        declareFunction(me, "xml_serialize_assertions_for_template_topic_instance", "XML-SERIALIZE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 5, 1, false);
        declareFunction(me, "xml_serialize_assertions_for_formula_template_instance", "XML-SERIALIZE-ASSERTIONS-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 1, false);
        declareFunction(me, "ftemplate_assertion_non_editableP", "FTEMPLATE-ASSERTION-NON-EDITABLE?", 2, 0, false);
        declareFunction(me, "xml_serialize_assertion_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
        declareFunction(me, "xml_serialize_assertion_sentence_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-SENTENCE-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
        declareFunction(me, "xml_serialize_assertion_suids_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-SUIDS-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_suids", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SUIDS", 2, 0, false);
        declareFunction(me, "xml_serialize_assertion_evaluation_data_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-EVALUATION-DATA-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        declareFunction(me, "quaternary_fet_evaluation_pred", "QUATERNARY-FET-EVALUATION-PRED", 0, 0, false);
        declareFunction(me, "ftemplate_assertion_evaluations", "FTEMPLATE-ASSERTION-EVALUATIONS", 3, 0, false);
        declareFunction(me, "ftemplate_evaluation_judgment", "FTEMPLATE-EVALUATION-JUDGMENT", 1, 0, false);
        declareFunction(me, "xml_serialize_assertion_timestamp_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-TIMESTAMP-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_date", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-DATE", 2, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_second", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SECOND", 2, 0, false);
        declareFunction(me, "xml_serialize_assertion_elmt_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-ELMT-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
        declareFunction(me, "xml_serialize_elmt_information_for_assertion", "XML-SERIALIZE-ELMT-INFORMATION-FOR-ASSERTION", 1, 1, false);
        declareFunction(me, "clear_map_elmt_to_published_conceptual_work", "CLEAR-MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 0, 0, false);
        declareFunction(me, "remove_map_elmt_to_published_conceptual_work", "REMOVE-MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 1, 0, false);
        declareFunction(me, "map_elmt_to_published_conceptual_work_internal", "MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-INTERNAL", 1, 0, false);
        declareFunction(me, "map_elmt_to_published_conceptual_work", "MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 1, 0, false);
        declareFunction(me, "get_assertions_for_leaf_template_topic_instance", "GET-ASSERTIONS-FOR-LEAF-TEMPLATE-TOPIC-INSTANCE", 4, 0, false);
        declareFunction(me, "get_assertions_for_formula_template_instance", "GET-ASSERTIONS-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        declareFunction(me, "get_assertions_for_fet_sentence", "GET-ASSERTIONS-FOR-FET-SENTENCE", 5, 3, false);
        declareFunction(me, "fet_fallback_to_default_mtP", "FET-FALLBACK-TO-DEFAULT-MT?", 1, 0, false);
        declareFunction(me, "ftemplate_reformulated_query_mt", "FTEMPLATE-REFORMULATED-QUERY-MT", 2, 0, false);
        declareFunction(me, "ftemplate_filter_reformulated_result_set", "FTEMPLATE-FILTER-REFORMULATED-RESULT-SET", 2, 0, false);
        declareFunction(me, "ftemplate_reformulated_result_duplicateP", "FTEMPLATE-REFORMULATED-RESULT-DUPLICATE?", 2, 0, false);
        declareFunction(me, "unpack_note_reformulation_result_sets", "UNPACK-NOTE-REFORMULATION-RESULT-SETS", 3, 0, false);
        declareFunction(me, "add_one_polycanonicalized_result", "ADD-ONE-POLYCANONICALIZED-RESULT", 2, 0, false);
        declareFunction(me, "unpack_note_reformulation_result", "UNPACK-NOTE-REFORMULATION-RESULT", 3, 0, false);
        declareFunction(me, "ftemplate_loading_supporting_ask", "FTEMPLATE-LOADING-SUPPORTING-ASK", 3, 1, false);
        declareFunction(me, "smarter_find_visible_assertions_cycl", "SMARTER-FIND-VISIBLE-ASSERTIONS-CYCL", 2, 0, false);
        declareFunction(me, "get_assertions_from_formula_template_result_sets", "GET-ASSERTIONS-FROM-FORMULA-TEMPLATE-RESULT-SETS", 5, 1, false);
        declareFunction(me, "make_ftemplate_polycanonicalized_assertion", "MAKE-FTEMPLATE-POLYCANONICALIZED-ASSERTION", 2, 1, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_p", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-P", 1, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_sentence", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SENTENCE", 1, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_hl_assertions", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-HL-ASSERTIONS", 2, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_find_hl_assertions", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-FIND-HL-ASSERTIONS", 2, 0, false);
        declareFunction(me, "ftemplate_polycanonicalized_assertion_mt", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-MT", 1, 0, false);
        declareFunction(me, "ftemplate_assertion_mt", "FTEMPLATE-ASSERTION-MT", 1, 0, false);
        declareFunction(me, "bad_assertion_for_formula_templatesP", "BAD-ASSERTION-FOR-FORMULA-TEMPLATES?", 1, 0, false);
        declareFunction(me, "uninteresting_indeterminate_termP", "UNINTERESTING-INDETERMINATE-TERM?", 1, 0, false);
        declareFunction(me, "is_skolemish_termP", "IS-SKOLEMISH-TERM?", 1, 0, false);
        declareFunction(me, "get_assertion_sentence_and_constraints_from_formula_template", "GET-ASSERTION-SENTENCE-AND-CONSTRAINTS-FROM-FORMULA-TEMPLATE", 3, 0, false);
        declareFunction(me, "get_assertion_finding_query_sentence", "GET-ASSERTION-FINDING-QUERY-SENTENCE", 1, 1, false);
        declareFunction(me, "constrain_query_with_accumulated_constraints", "CONSTRAIN-QUERY-WITH-ACCUMULATED-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "fet_assertion_variable_for_formula", "FET-ASSERTION-VARIABLE-FOR-FORMULA", 1, 0, false);
        declareFunction(me, "ftemplate_assertion_constrained_query_formula", "FTEMPLATE-ASSERTION-CONSTRAINED-QUERY-FORMULA", 1, 1, false);
        declareFunction(me, "formula_ok_for_fet_assertion_varP", "FORMULA-OK-FOR-FET-ASSERTION-VAR?", 2, 0, false);
        declareFunction(me, "convert_ftemplate_input_constraint_to_collection", "CONVERT-FTEMPLATE-INPUT-CONSTRAINT-TO-COLLECTION", 2, 0, false);
        declareFunction(me, "get_lexical_mt_for_rkf_interaction_mt", "GET-LEXICAL-MT-FOR-RKF-INTERACTION-MT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_formula_templates_file() {
        defconstant("*DTP-TEMPLATE-TOPIC*", TEMPLATE_TOPIC);
        deflexical("*CFASL-GUID-OPCODE-TEMPLATE-TOPIC*", Guids.string_to_guid($str51$18287931_d871_11d9_8eef_0002b3891));
        defconstant("*DTP-ARG-POSITION-DETAILS*", ARG_POSITION_DETAILS);
        deflexical("*CFASL-GUID-OPCODE-ARG-POSITION-DETAILS*", Guids.string_to_guid($str93$182a9c10_d871_11d9_8eef_0002b3891));
        defconstant("*DTP-FORMULA-TEMPLATE*", FORMULA_TEMPLATE);
        deflexical("*CFASL-GUID-OPCODE-FORMULA-TEMPLATE*", Guids.string_to_guid($str143$182b1140_d871_11d9_8eef_0002b3891));
        defparameter("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*", NIL);
        defparameter("*NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE*", NIL);
        defparameter("*XML-SUPPRESS-FUTURE-TEMPLATE-EXTENSIONS*", T);
        deflexical("*XML-TEMPLATE-TOPIC-REVISIONS*", $list183);
        deflexical("*FORMULA-TEMPLATE-DTD-URI*", $str241$http___dev_cyc_com_dtd_formulatem);
        defparameter("*HIGH-TO-LOW-PRIORITIES*", NIL);
        deflexical("*WARN-ON-TEMPLATE-TOPIC-VALIDATION-ONLY*", T);
        defparameter("*TEMPLATE-COUNT-MT*", $$InferencePSC);
        deflexical("*XML-TEMPLATE-TOPIC-ASSERTIONS-REVISIONS*", $list372);
        deflexical("*QUATERNARY-FET-EVALUATION-PRED*", NIL);
        deflexical("*MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-CACHING-STATE*", NIL);
        deflexical("*UNIQUE-VARIABLES-LIST-FOR-FORMULA-TEMPLATES*", $list412);
        deflexical("*ELMT-VARIABLE-FOR-FORMULA-TEMPLATES*", $sym413$_POLY_ELMT);
        defparameter("*GET-ASSERTIONS-FROM-INITIAL-ASK?*", T);
        deflexical("*FTEMPLATE-CONSTRAINT-TO-COLLECTION-SKIPLIST*", $list440);
        return NIL;
    }

    public static SubLObject setup_formula_templates_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_template_topic$.getGlobalValue(), symbol_function(TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(TEMPLATE_TOPIC_SUPERTOPIC, _CSETF_TEMPLATE_TOPIC_SUPERTOPIC);
        def_csetf(TEMPLATE_TOPIC_TOPIC, _CSETF_TEMPLATE_TOPIC_TOPIC);
        def_csetf(TEMPLATE_TOPIC_SUBTOPICS, _CSETF_TEMPLATE_TOPIC_SUBTOPICS);
        def_csetf(TEMPLATE_TOPIC_TEMPLATES, _CSETF_TEMPLATE_TOPIC_TEMPLATES);
        def_csetf(TEMPLATE_TOPIC_ORDERING, _CSETF_TEMPLATE_TOPIC_ORDERING);
        def_csetf(TEMPLATE_TOPIC_TITLE, _CSETF_TEMPLATE_TOPIC_TITLE);
        def_csetf(TEMPLATE_TOPIC_TERM_PREFIX, _CSETF_TEMPLATE_TOPIC_TERM_PREFIX);
        def_csetf(TEMPLATE_TOPIC_INTRO_TEMPLATE, _CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE);
        def_csetf(TEMPLATE_TOPIC_SOURCE_TYPES, _CSETF_TEMPLATE_TOPIC_SOURCE_TYPES);
        def_csetf(TEMPLATE_TOPIC_SOURCE_MT, _CSETF_TEMPLATE_TOPIC_SOURCE_MT);
        def_csetf(TEMPLATE_TOPIC_QUERY_MT, _CSETF_TEMPLATE_TOPIC_QUERY_MT);
        def_csetf(TEMPLATE_TOPIC_DEFINITIONAL_MT, _CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT);
        identity(TEMPLATE_TOPIC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_template_topic$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TEMPLATE_TOPIC_METHOD));
        register_cfasl_guid_denoted_type_input_function($cfasl_guid_opcode_template_topic$.getGlobalValue(), CFASL_INPUT_TEMPLATE_TOPIC);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_arg_position_details$.getGlobalValue(), symbol_function(ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list61);
        def_csetf(ARG_POSITION_DETAILS_ARGUMENT_POSITION, _CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION);
        def_csetf(ARG_POSITION_DETAILS_ORDERING, _CSETF_ARG_POSITION_DETAILS_ORDERING);
        def_csetf(ARG_POSITION_DETAILS_GLOSS, _CSETF_ARG_POSITION_DETAILS_GLOSS);
        def_csetf(ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS, _CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS);
        def_csetf(ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS, _CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS);
        def_csetf(ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS, _CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS);
        def_csetf(ARG_POSITION_DETAILS_IS_EDITABLE, _CSETF_ARG_POSITION_DETAILS_IS_EDITABLE);
        def_csetf(ARG_POSITION_DETAILS_EXPLANATION, _CSETF_ARG_POSITION_DETAILS_EXPLANATION);
        def_csetf(ARG_POSITION_DETAILS_REQUIRES_VALIDATION, _CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION);
        def_csetf(ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT, _CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT);
        identity(ARG_POSITION_DETAILS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arg_position_details$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ARG_POSITION_DETAILS_METHOD));
        register_cfasl_guid_denoted_type_input_function($cfasl_guid_opcode_arg_position_details$.getGlobalValue(), CFASL_INPUT_ARG_POSITION_DETAILS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_formula_template$.getGlobalValue(), symbol_function(FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list103);
        def_csetf(FORMULA_TEMPLATE_TOPIC, _CSETF_FORMULA_TEMPLATE_TOPIC);
        def_csetf(FORMULA_TEMPLATE_ID, _CSETF_FORMULA_TEMPLATE_ID);
        def_csetf(FORMULA_TEMPLATE_FORMULA, _CSETF_FORMULA_TEMPLATE_FORMULA);
        def_csetf(FORMULA_TEMPLATE_QUERY_SPECIFICATION, _CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION);
        def_csetf(FORMULA_TEMPLATE_ELMT, _CSETF_FORMULA_TEMPLATE_ELMT);
        def_csetf(FORMULA_TEMPLATE_FOCAL_TERM, _CSETF_FORMULA_TEMPLATE_FOCAL_TERM);
        def_csetf(FORMULA_TEMPLATE_ARGPOS_DETAILS, _CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS);
        def_csetf(FORMULA_TEMPLATE_ARGPOS_ORDERING, _CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING);
        def_csetf(FORMULA_TEMPLATE_EXAMPLES, _CSETF_FORMULA_TEMPLATE_EXAMPLES);
        def_csetf(FORMULA_TEMPLATE_ENTRY_FORMAT, _CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT);
        def_csetf(FORMULA_TEMPLATE_FOLLOW_UPS, _CSETF_FORMULA_TEMPLATE_FOLLOW_UPS);
        def_csetf(FORMULA_TEMPLATE_GLOSS, _CSETF_FORMULA_TEMPLATE_GLOSS);
        def_csetf(FORMULA_TEMPLATE_REFSPEC, _CSETF_FORMULA_TEMPLATE_REFSPEC);
        identity(FORMULA_TEMPLATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_formula_template$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_METHOD));
        register_cfasl_guid_denoted_type_input_function($cfasl_guid_opcode_formula_template$.getGlobalValue(), CFASL_INPUT_FORMULA_TEMPLATE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_template_topic$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_formula_template$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_arg_position_details$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD));
        memoization_state.note_memoized_function(COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE);
        memoization_state.note_globally_cached_function(MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_formula_templates_file();
    }

    @Override
    public void initializeVariables() {
        init_formula_templates_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_formula_templates_file();
    }

    

    public static final class $template_topic_native extends SubLStructNative {
        public SubLObject $supertopic;

        public SubLObject $topic;

        public SubLObject $subtopics;

        public SubLObject $templates;

        public SubLObject $ordering;

        public SubLObject $title;

        public SubLObject $term_prefix;

        public SubLObject $intro_template;

        public SubLObject $source_types;

        public SubLObject $source_mt;

        public SubLObject $query_mt;

        public SubLObject $definitional_mt;

        private static final SubLStructDeclNative structDecl;

        private $template_topic_native() {
            this.$supertopic = Lisp.NIL;
            this.$topic = Lisp.NIL;
            this.$subtopics = Lisp.NIL;
            this.$templates = Lisp.NIL;
            this.$ordering = Lisp.NIL;
            this.$title = Lisp.NIL;
            this.$term_prefix = Lisp.NIL;
            this.$intro_template = Lisp.NIL;
            this.$source_types = Lisp.NIL;
            this.$source_mt = Lisp.NIL;
            this.$query_mt = Lisp.NIL;
            this.$definitional_mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$supertopic;
        }

        @Override
        public SubLObject getField3() {
            return this.$topic;
        }

        @Override
        public SubLObject getField4() {
            return this.$subtopics;
        }

        @Override
        public SubLObject getField5() {
            return this.$templates;
        }

        @Override
        public SubLObject getField6() {
            return this.$ordering;
        }

        @Override
        public SubLObject getField7() {
            return this.$title;
        }

        @Override
        public SubLObject getField8() {
            return this.$term_prefix;
        }

        @Override
        public SubLObject getField9() {
            return this.$intro_template;
        }

        @Override
        public SubLObject getField10() {
            return this.$source_types;
        }

        @Override
        public SubLObject getField11() {
            return this.$source_mt;
        }

        @Override
        public SubLObject getField12() {
            return this.$query_mt;
        }

        @Override
        public SubLObject getField13() {
            return this.$definitional_mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$supertopic = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$topic = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$subtopics = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$templates = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$ordering = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$title = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$term_prefix = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$intro_template = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$source_types = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$source_mt = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$query_mt = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$definitional_mt = value;
        }

        static {
            structDecl = makeStructDeclNative($template_topic_native.class, TEMPLATE_TOPIC, TEMPLATE_TOPIC_P, $list2, $list3, new String[]{ "$supertopic", "$topic", "$subtopics", "$templates", "$ordering", "$title", "$term_prefix", "$intro_template", "$source_types", "$source_mt", "$query_mt", "$definitional_mt" }, $list4, $list5, PRINT_TEMPLATE_TOPIC);
        }
    }

    public static final class $template_topic_p$UnaryFunction extends UnaryFunction {
        public $template_topic_p$UnaryFunction() {
            super(extractFunctionNamed("TEMPLATE-TOPIC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return template_topic_p(arg1);
        }
    }

    public static final class $arg_position_details_native extends SubLStructNative {
        public SubLObject $argument_position;

        public SubLObject $ordering;

        public SubLObject $gloss;

        public SubLObject $invisible_replacement_positions;

        public SubLObject $replacement_constraints;

        public SubLObject $candidate_replacements;

        public SubLObject $is_editable;

        public SubLObject $explanation;

        public SubLObject $requires_validation;

        public SubLObject $unknown_replacement;

        private static final SubLStructDeclNative structDecl;

        private $arg_position_details_native() {
            this.$argument_position = Lisp.NIL;
            this.$ordering = Lisp.NIL;
            this.$gloss = Lisp.NIL;
            this.$invisible_replacement_positions = Lisp.NIL;
            this.$replacement_constraints = Lisp.NIL;
            this.$candidate_replacements = Lisp.NIL;
            this.$is_editable = Lisp.NIL;
            this.$explanation = Lisp.NIL;
            this.$requires_validation = Lisp.NIL;
            this.$unknown_replacement = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$argument_position;
        }

        @Override
        public SubLObject getField3() {
            return this.$ordering;
        }

        @Override
        public SubLObject getField4() {
            return this.$gloss;
        }

        @Override
        public SubLObject getField5() {
            return this.$invisible_replacement_positions;
        }

        @Override
        public SubLObject getField6() {
            return this.$replacement_constraints;
        }

        @Override
        public SubLObject getField7() {
            return this.$candidate_replacements;
        }

        @Override
        public SubLObject getField8() {
            return this.$is_editable;
        }

        @Override
        public SubLObject getField9() {
            return this.$explanation;
        }

        @Override
        public SubLObject getField10() {
            return this.$requires_validation;
        }

        @Override
        public SubLObject getField11() {
            return this.$unknown_replacement;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$argument_position = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$ordering = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$gloss = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$invisible_replacement_positions = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$replacement_constraints = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$candidate_replacements = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$is_editable = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$explanation = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$requires_validation = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$unknown_replacement = value;
        }

        static {
            structDecl = makeStructDeclNative($arg_position_details_native.class, ARG_POSITION_DETAILS, ARG_POSITION_DETAILS_P, $list55, $list56, new String[]{ "$argument_position", "$ordering", "$gloss", "$invisible_replacement_positions", "$replacement_constraints", "$candidate_replacements", "$is_editable", "$explanation", "$requires_validation", "$unknown_replacement" }, $list57, $list58, PRINT_ARG_POSITION_DETAILS);
        }
    }

    public static final class $arg_position_details_p$UnaryFunction extends UnaryFunction {
        public $arg_position_details_p$UnaryFunction() {
            super(extractFunctionNamed("ARG-POSITION-DETAILS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return arg_position_details_p(arg1);
        }
    }

    public static final class $formula_template_native extends SubLStructNative {
        public SubLObject $topic;

        public SubLObject $id;

        public SubLObject $formula;

        public SubLObject $query_specification;

        public SubLObject $elmt;

        public SubLObject $focal_term;

        public SubLObject $argpos_details;

        public SubLObject $argpos_ordering;

        public SubLObject $examples;

        public SubLObject $entry_format;

        public SubLObject $follow_ups;

        public SubLObject $gloss;

        public SubLObject $refspec;

        private static final SubLStructDeclNative structDecl;

        private $formula_template_native() {
            this.$topic = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$formula = Lisp.NIL;
            this.$query_specification = Lisp.NIL;
            this.$elmt = Lisp.NIL;
            this.$focal_term = Lisp.NIL;
            this.$argpos_details = Lisp.NIL;
            this.$argpos_ordering = Lisp.NIL;
            this.$examples = Lisp.NIL;
            this.$entry_format = Lisp.NIL;
            this.$follow_ups = Lisp.NIL;
            this.$gloss = Lisp.NIL;
            this.$refspec = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$topic;
        }

        @Override
        public SubLObject getField3() {
            return this.$id;
        }

        @Override
        public SubLObject getField4() {
            return this.$formula;
        }

        @Override
        public SubLObject getField5() {
            return this.$query_specification;
        }

        @Override
        public SubLObject getField6() {
            return this.$elmt;
        }

        @Override
        public SubLObject getField7() {
            return this.$focal_term;
        }

        @Override
        public SubLObject getField8() {
            return this.$argpos_details;
        }

        @Override
        public SubLObject getField9() {
            return this.$argpos_ordering;
        }

        @Override
        public SubLObject getField10() {
            return this.$examples;
        }

        @Override
        public SubLObject getField11() {
            return this.$entry_format;
        }

        @Override
        public SubLObject getField12() {
            return this.$follow_ups;
        }

        @Override
        public SubLObject getField13() {
            return this.$gloss;
        }

        @Override
        public SubLObject getField14() {
            return this.$refspec;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$topic = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$query_specification = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$elmt = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$focal_term = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$argpos_details = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$argpos_ordering = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$examples = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$entry_format = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$follow_ups = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$gloss = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$refspec = value;
        }

        static {
            structDecl = makeStructDeclNative($formula_template_native.class, FORMULA_TEMPLATE, FORMULA_TEMPLATE_P, $list97, $list98, new String[]{ "$topic", "$id", "$formula", "$query_specification", "$elmt", "$focal_term", "$argpos_details", "$argpos_ordering", "$examples", "$entry_format", "$follow_ups", "$gloss", "$refspec" }, $list99, $list100, PRINT_FORMULA_TEMPLATE);
        }
    }

    public static final class $formula_template_p$UnaryFunction extends UnaryFunction {
        public $formula_template_p$UnaryFunction() {
            super(extractFunctionNamed("FORMULA-TEMPLATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return formula_template_p(arg1);
        }
    }
}

/**
 * Total time: 11549 ms synthetic
 */
