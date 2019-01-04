package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class formula_templates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.formula_templates";
    public static final String myFingerPrint = "9c5f506c169b4ec38e3687e8c05192a19d0215ed387b43f2a3115eea736e3671";
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLSymbol $dtp_template_topic$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2582L)
    private static SubLSymbol $cfasl_guid_opcode_template_topic$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLSymbol $dtp_arg_position_details$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3320L)
    private static SubLSymbol $cfasl_guid_opcode_arg_position_details$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLSymbol $dtp_formula_template$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 4232L)
    private static SubLSymbol $cfasl_guid_opcode_formula_template$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 4376L)
    private static SubLSymbol $make_ftemplate_loading_supporting_ask_browsableP$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 5132L)
    public static SubLSymbol $non_editable_assertions_for_template_topic_instance$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 12772L)
    private static SubLSymbol $xml_suppress_future_template_extensions$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 12914L)
    private static SubLSymbol $xml_template_topic_revisions$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 27231L)
    private static SubLSymbol $formula_template_dtd_uri$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 68805L)
    private static SubLSymbol $high_to_low_priorities$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 78694L)
    private static SubLSymbol $warn_on_template_topic_validation_only$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 80887L)
    private static SubLSymbol $template_count_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 89645L)
    private static SubLSymbol $xml_template_topic_assertions_revisions$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 96992L)
    private static SubLSymbol $quaternary_fet_evaluation_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 100441L)
    private static SubLSymbol $map_elmt_to_published_conceptual_work_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 101300L)
    private static SubLSymbol $unique_variables_list_for_formula_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 101451L)
    private static SubLSymbol $elmt_variable_for_formula_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 101523L)
    public static SubLSymbol $get_assertions_from_initial_askP$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 122159L)
    private static SubLSymbol $ftemplate_constraint_to_collection_skiplist$;
    private static final SubLSymbol $sym0$TEMPLATE_TOPIC;
    private static final SubLSymbol $sym1$TEMPLATE_TOPIC_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_TEMPLATE_TOPIC;
    private static final SubLSymbol $sym7$TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$TEMPLATE_TOPIC_SUPERTOPIC;
    private static final SubLSymbol $sym10$_CSETF_TEMPLATE_TOPIC_SUPERTOPIC;
    private static final SubLSymbol $sym11$TEMPLATE_TOPIC_TOPIC;
    private static final SubLSymbol $sym12$_CSETF_TEMPLATE_TOPIC_TOPIC;
    private static final SubLSymbol $sym13$TEMPLATE_TOPIC_SUBTOPICS;
    private static final SubLSymbol $sym14$_CSETF_TEMPLATE_TOPIC_SUBTOPICS;
    private static final SubLSymbol $sym15$TEMPLATE_TOPIC_TEMPLATES;
    private static final SubLSymbol $sym16$_CSETF_TEMPLATE_TOPIC_TEMPLATES;
    private static final SubLSymbol $sym17$TEMPLATE_TOPIC_ORDERING;
    private static final SubLSymbol $sym18$_CSETF_TEMPLATE_TOPIC_ORDERING;
    private static final SubLSymbol $sym19$TEMPLATE_TOPIC_TITLE;
    private static final SubLSymbol $sym20$_CSETF_TEMPLATE_TOPIC_TITLE;
    private static final SubLSymbol $sym21$TEMPLATE_TOPIC_TERM_PREFIX;
    private static final SubLSymbol $sym22$_CSETF_TEMPLATE_TOPIC_TERM_PREFIX;
    private static final SubLSymbol $sym23$TEMPLATE_TOPIC_INTRO_TEMPLATE;
    private static final SubLSymbol $sym24$_CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE;
    private static final SubLSymbol $sym25$TEMPLATE_TOPIC_SOURCE_TYPES;
    private static final SubLSymbol $sym26$_CSETF_TEMPLATE_TOPIC_SOURCE_TYPES;
    private static final SubLSymbol $sym27$TEMPLATE_TOPIC_SOURCE_MT;
    private static final SubLSymbol $sym28$_CSETF_TEMPLATE_TOPIC_SOURCE_MT;
    private static final SubLSymbol $sym29$TEMPLATE_TOPIC_QUERY_MT;
    private static final SubLSymbol $sym30$_CSETF_TEMPLATE_TOPIC_QUERY_MT;
    private static final SubLSymbol $sym31$TEMPLATE_TOPIC_DEFINITIONAL_MT;
    private static final SubLSymbol $sym32$_CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT;
    private static final SubLSymbol $kw33$SUPERTOPIC;
    private static final SubLSymbol $kw34$TOPIC;
    private static final SubLSymbol $kw35$SUBTOPICS;
    private static final SubLSymbol $kw36$TEMPLATES;
    private static final SubLSymbol $kw37$ORDERING;
    private static final SubLSymbol $kw38$TITLE;
    private static final SubLSymbol $kw39$TERM_PREFIX;
    private static final SubLSymbol $kw40$INTRO_TEMPLATE;
    private static final SubLSymbol $kw41$SOURCE_TYPES;
    private static final SubLSymbol $kw42$SOURCE_MT;
    private static final SubLSymbol $kw43$QUERY_MT;
    private static final SubLSymbol $kw44$DEFINITIONAL_MT;
    private static final SubLString $str45$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw46$BEGIN;
    private static final SubLSymbol $sym47$MAKE_TEMPLATE_TOPIC;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_TOPIC_METHOD;
    private static final SubLString $str51$18287931_d871_11d9_8eef_0002b3891;
    private static final SubLSymbol $sym52$CFASL_INPUT_TEMPLATE_TOPIC;
    private static final SubLSymbol $sym53$ARG_POSITION_DETAILS;
    private static final SubLSymbol $sym54$ARG_POSITION_DETAILS_P;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$PRINT_ARG_POSITION_DETAILS;
    private static final SubLSymbol $sym60$ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$ARG_POSITION_DETAILS_ARGUMENT_POSITION;
    private static final SubLSymbol $sym63$_CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION;
    private static final SubLSymbol $sym64$ARG_POSITION_DETAILS_ORDERING;
    private static final SubLSymbol $sym65$_CSETF_ARG_POSITION_DETAILS_ORDERING;
    private static final SubLSymbol $sym66$ARG_POSITION_DETAILS_GLOSS;
    private static final SubLSymbol $sym67$_CSETF_ARG_POSITION_DETAILS_GLOSS;
    private static final SubLSymbol $sym68$ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS;
    private static final SubLSymbol $sym69$_CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS;
    private static final SubLSymbol $sym70$ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS;
    private static final SubLSymbol $sym71$_CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS;
    private static final SubLSymbol $sym72$ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS;
    private static final SubLSymbol $sym73$_CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS;
    private static final SubLSymbol $sym74$ARG_POSITION_DETAILS_IS_EDITABLE;
    private static final SubLSymbol $sym75$_CSETF_ARG_POSITION_DETAILS_IS_EDITABLE;
    private static final SubLSymbol $sym76$ARG_POSITION_DETAILS_EXPLANATION;
    private static final SubLSymbol $sym77$_CSETF_ARG_POSITION_DETAILS_EXPLANATION;
    private static final SubLSymbol $sym78$ARG_POSITION_DETAILS_REQUIRES_VALIDATION;
    private static final SubLSymbol $sym79$_CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION;
    private static final SubLSymbol $sym80$ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT;
    private static final SubLSymbol $sym81$_CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT;
    private static final SubLSymbol $kw82$ARGUMENT_POSITION;
    private static final SubLSymbol $kw83$GLOSS;
    private static final SubLSymbol $kw84$INVISIBLE_REPLACEMENT_POSITIONS;
    private static final SubLSymbol $kw85$REPLACEMENT_CONSTRAINTS;
    private static final SubLSymbol $kw86$CANDIDATE_REPLACEMENTS;
    private static final SubLSymbol $kw87$IS_EDITABLE;
    private static final SubLSymbol $kw88$EXPLANATION;
    private static final SubLSymbol $kw89$REQUIRES_VALIDATION;
    private static final SubLSymbol $kw90$UNKNOWN_REPLACEMENT;
    private static final SubLSymbol $sym91$MAKE_ARG_POSITION_DETAILS;
    private static final SubLSymbol $sym92$VISIT_DEFSTRUCT_OBJECT_ARG_POSITION_DETAILS_METHOD;
    private static final SubLString $str93$182a9c10_d871_11d9_8eef_0002b3891;
    private static final SubLSymbol $sym94$CFASL_INPUT_ARG_POSITION_DETAILS;
    private static final SubLSymbol $sym95$FORMULA_TEMPLATE;
    private static final SubLSymbol $sym96$FORMULA_TEMPLATE_P;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$PRINT_FORMULA_TEMPLATE;
    private static final SubLSymbol $sym102$FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$FORMULA_TEMPLATE_TOPIC;
    private static final SubLSymbol $sym105$_CSETF_FORMULA_TEMPLATE_TOPIC;
    private static final SubLSymbol $sym106$FORMULA_TEMPLATE_ID;
    private static final SubLSymbol $sym107$_CSETF_FORMULA_TEMPLATE_ID;
    private static final SubLSymbol $sym108$FORMULA_TEMPLATE_FORMULA;
    private static final SubLSymbol $sym109$_CSETF_FORMULA_TEMPLATE_FORMULA;
    private static final SubLSymbol $sym110$FORMULA_TEMPLATE_QUERY_SPECIFICATION;
    private static final SubLSymbol $sym111$_CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION;
    private static final SubLSymbol $sym112$FORMULA_TEMPLATE_ELMT;
    private static final SubLSymbol $sym113$_CSETF_FORMULA_TEMPLATE_ELMT;
    private static final SubLSymbol $sym114$FORMULA_TEMPLATE_FOCAL_TERM;
    private static final SubLSymbol $sym115$_CSETF_FORMULA_TEMPLATE_FOCAL_TERM;
    private static final SubLSymbol $sym116$FORMULA_TEMPLATE_ARGPOS_DETAILS;
    private static final SubLSymbol $sym117$_CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS;
    private static final SubLSymbol $sym118$FORMULA_TEMPLATE_ARGPOS_ORDERING;
    private static final SubLSymbol $sym119$_CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING;
    private static final SubLSymbol $sym120$FORMULA_TEMPLATE_EXAMPLES;
    private static final SubLSymbol $sym121$_CSETF_FORMULA_TEMPLATE_EXAMPLES;
    private static final SubLSymbol $sym122$FORMULA_TEMPLATE_ENTRY_FORMAT;
    private static final SubLSymbol $sym123$_CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT;
    private static final SubLSymbol $sym124$FORMULA_TEMPLATE_FOLLOW_UPS;
    private static final SubLSymbol $sym125$_CSETF_FORMULA_TEMPLATE_FOLLOW_UPS;
    private static final SubLSymbol $sym126$FORMULA_TEMPLATE_GLOSS;
    private static final SubLSymbol $sym127$_CSETF_FORMULA_TEMPLATE_GLOSS;
    private static final SubLSymbol $sym128$FORMULA_TEMPLATE_REFSPEC;
    private static final SubLSymbol $sym129$_CSETF_FORMULA_TEMPLATE_REFSPEC;
    private static final SubLSymbol $kw130$ID;
    private static final SubLSymbol $kw131$FORMULA;
    private static final SubLSymbol $kw132$QUERY_SPECIFICATION;
    private static final SubLSymbol $kw133$ELMT;
    private static final SubLSymbol $kw134$FOCAL_TERM;
    private static final SubLSymbol $kw135$ARGPOS_DETAILS;
    private static final SubLSymbol $kw136$ARGPOS_ORDERING;
    private static final SubLSymbol $kw137$EXAMPLES;
    private static final SubLSymbol $kw138$ENTRY_FORMAT;
    private static final SubLSymbol $kw139$FOLLOW_UPS;
    private static final SubLSymbol $kw140$REFSPEC;
    private static final SubLSymbol $sym141$MAKE_FORMULA_TEMPLATE;
    private static final SubLSymbol $sym142$VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_METHOD;
    private static final SubLString $str143$182b1140_d871_11d9_8eef_0002b3891;
    private static final SubLSymbol $sym144$CFASL_INPUT_FORMULA_TEMPLATE;
    private static final SubLSymbol $sym145$CLET;
    private static final SubLList $list146;
    private static final SubLSymbol $kw147$CYC_RKF;
    private static final SubLSymbol $sym148$REUSING_RKF_SD_PROBLEM_STORE;
    private static final SubLSymbol $sym149$PROGN;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE_;
    private static final SubLSymbol $sym152$CHECK_TYPE;
    private static final SubLList $list153;
    private static final SubLObject $const154$isa;
    private static final SubLObject $const155$genls;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$NON_EDITABLE;
    private static final SubLSymbol $sym158$COMPUTE_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE;
    private static final SubLSymbol $sym159$WITH_KNOWN_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE;
    private static final SubLString $str160$_S_is_not_a_FORMULA_TEMPLATE_P_;
    private static final SubLString $str161$_S_is_not_EL_FORMULA_P_;
    private static final SubLString $str162$_S_is_not_POSSIBLY_MT_P_;
    private static final SubLString $str163$bad_formula_template___S__;
    private static final SubLSymbol $sym164$STRINGP;
    private static final SubLSymbol $sym165$FORT_P;
    private static final SubLSymbol $sym166$LISTP;
    private static final SubLString $str167$_TemplateTopic__;
    private static final SubLString $str168$Parent___S___Topic___S_;
    private static final SubLString $str169$_named_;
    private static final SubLString $str170$_Term_Prefix__;
    private static final SubLString $str171$___SubTopics__;
    private static final SubLString $str172$___Sources__;
    private static final SubLString $str173$___Template_Source_Mt__;
    private static final SubLString $str174$___Template_Query_Mt__;
    private static final SubLString $str175$___Template_Definitional_Mt__;
    private static final SubLString $str176$___Templates_;
    private static final SubLString $str177$____introductory_template__;
    private static final SubLString $str178$_;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$XML_TAG;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLString $str184$templateTopic;
    private static final SubLString $str185$templateTopicRevision;
    private static final SubLString $str186$topic;
    private static final SubLString $str187$superTopic;
    private static final SubLString $str188$title;
    private static final SubLString $str189$termPrefix;
    private static final SubLString $str190$introductoryTemplate;
    private static final SubLString $str191$subTopics;
    private static final SubLString $str192$subTopic;
    private static final SubLString $str193$sourcesOfTopic;
    private static final SubLString $str194$sourceOfTopic;
    private static final SubLString $str195$templateSourceMt;
    private static final SubLString $str196$templateQueryMt;
    private static final SubLString $str197$templateDefinitionalMt;
    private static final SubLString $str198$formulaTemplates;
    private static final SubLSymbol $sym199$CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD;
    private static final SubLSymbol $sym200$VALID_FORMULA_TEMPLATE_P;
    private static final SubLString $str201$CFASL_INPUT_TEMPLATE_TOPIC_has_lo;
    private static final SubLObject $const202$SingleAssertionEntry;
    private static final SubLObject $const203$MultipleAssertionEntry;
    private static final SubLString $str204$_Formula_Template__;
    private static final SubLString $str205$_A_;
    private static final SubLString $str206$of_topic__A__;
    private static final SubLString $str207$_formula__A_in__A__;
    private static final SubLString $str208$_query_spec__A_in__A__;
    private static final SubLString $str209$_focal_term__A___A___;
    private static final SubLString $str210$_focal_term_occurrences__A___A___;
    private static final SubLString $str211$_examples___A__;
    private static final SubLString $str212$_follow_ups___A__;
    private static final SubLString $str213$_template_gloss___A__;
    private static final SubLString $str214$_reformulation_specification___A_;
    private static final SubLString $str215$_argpos_details__;
    private static final SubLString $str216$_;
    private static final SubLSymbol $sym217$EL_FORMULA_P;
    private static final SubLSymbol $sym218$ISA_MT_;
    private static final SubLSymbol $sym219$CONSTANT_P;
    private static final SubLSymbol $sym220$NEW_CYCL_QUERY_SPECIFICATION_P;
    private static final SubLString $str221$formulaTemplate;
    private static final SubLString $str222$id;
    private static final SubLString $str223$formula;
    private static final SubLString $str224$elmt;
    private static final SubLString $str225$focalTerm;
    private static final SubLString $str226$argPositions;
    private static final SubLString $str227$singleEntry;
    private static final SubLSymbol $kw228$ATOMIC;
    private static final SubLString $str229$multipleEntry;
    private static final SubLString $str230$usageExamples;
    private static final SubLString $str231$example;
    private static final SubLString $str232$glossForTemplate;
    private static final SubLString $str233$followUps;
    private static final SubLString $str234$followUp;
    private static final SubLList $list235;
    private static final SubLString $str236$templateId;
    private static final SubLString $str237$connective;
    private static final SubLString $str238$loadMt;
    private static final SubLString $str239$reformulationSpecification;
    private static final SubLString $str240$argumentPositionDetails;
    private static final SubLString $str241$http___dev_cyc_com_dtd_formulatem;
    private static final SubLString $str242$__xml_version__1_0__encoding__US_;
    private static final SubLString $str243$__DOCTYPE_formulaTemplate_SYSTEM_;
    private static final SubLSymbol $sym244$CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD;
    private static final SubLString $str245$__ArgPos_Details__;
    private static final SubLString $str246$_for_position__A_;
    private static final SubLString $str247$__ordering_slot__D_;
    private static final SubLString $str248$__no_ordering_info_;
    private static final SubLString $str249$_READ_ONLY;
    private static final SubLString $str250$_gloss___A__;
    private static final SubLString $str251$_replacementInvisible___A__;
    private static final SubLString $str252$_candidate_replacements___A__;
    private static final SubLString $str253$_constraints___A__;
    private static final SubLString $str254$__requires_validation____;
    private static final SubLString $str255$_explanation___A__;
    private static final SubLString $str256$_term_for_unknown___A__;
    private static final SubLString $str257$argumentPositionDetail;
    private static final SubLString $str258$ordering;
    private static final SubLString $str259$glossText;
    private static final SubLString $str260$candidateReplacementsForPosition;
    private static final SubLString $str261$candidateReplacementForPosition;
    private static final SubLString $str262$templateReplacementsInvisibleForP;
    private static final SubLString $str263$isEditable;
    private static final SubLString $str264$validationRequired;
    private static final SubLString $str265$explanation;
    private static final SubLString $str266$unknownTermForTemplatePosition;
    private static final SubLString $str267$constraintsOnReplacement;
    private static final SubLString $str268$constraintOnReplacement;
    private static final SubLSymbol $sym269$CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD;
    private static final SubLString $str270$argPosition;
    private static final SubLString $str271$position;
    private static final SubLSymbol $sym272$HLMT_P;
    private static final SubLString $str273$Can_t_load_a_formula_template_wit;
    private static final SubLObject $const274$formulaTemplateHasArgumentPositio;
    private static final SubLList $list275;
    private static final SubLList $list276;
    private static final SubLList $list277;
    private static final SubLList $list278;
    private static final SubLList $list279;
    private static final SubLSymbol $sym280$ORDERED_BY_ARGUMENT_POSITION;
    private static final SubLSymbol $sym281$_;
    private static final SubLSymbol $sym282$POSSIBLY_FO_REPRESENTED_TERM_P;
    private static final SubLString $str283$Dwimming_MT_for__A_to__A____your_;
    private static final SubLList $list284;
    private static final SubLObject $const285$reformulateTemplateViaSpecificati;
    private static final SubLObject $const286$TemplateFromTestQueryFn;
    private static final SubLObject $const287$querySpecificationForFormulaTempl;
    private static final SubLObject $const288$formulaForFormulaTemplate;
    private static final SubLObject $const289$assertMtForFormulaTemplate;
    private static final SubLObject $const290$formulaTemplateFollowUp;
    private static final SubLSymbol $sym291$COMMUTATIVE_RELATION_;
    private static final SubLSymbol $sym292$SECOND;
    private static final SubLList $list293;
    private static final SubLObject $const294$formulaTemplateGloss;
    private static final SubLSymbol $kw295$TRUE;
    private static final SubLList $list296;
    private static final SubLObject $const297$AnytimePSC;
    private static final SubLList $list298;
    private static final SubLObject $const299$glossForFormulaTemplate;
    private static final SubLList $list300;
    private static final SubLObject $const301$formulaTemplateArgExplanation;
    private static final SubLObject $const302$formulaTemplateExample;
    private static final SubLSymbol $sym303$GET_VARIABLE;
    private static final SubLObject $const304$assertedSentence;
    private static final SubLSymbol $kw305$MAX_NUMBER;
    private static final SubLSymbol $kw306$TRANSFORMATION_ALLOWED_;
    private static final SubLSymbol $kw307$PROBLEM_STORE;
    private static final SubLSymbol $kw308$RETURN;
    private static final SubLSymbol $kw309$TEMPLATE;
    private static final SubLSymbol $kw310$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw311$HL;
    private static final SubLObject $const312$EverythingPSC;
    private static final SubLSymbol $sym313$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const314$focalTermPositionForFormulaTempla;
    private static final SubLObject $const315$assertionFormatForFormulaTemplate;
    private static final SubLObject $const316$templateReplacementsInvisibleForP;
    private static final SubLList $list317;
    private static final SubLObject $const318$constraintOnReplacement;
    private static final SubLList $list319;
    private static final SubLObject $const320$TheSet;
    private static final SubLSymbol $sym321$_X;
    private static final SubLObject $const322$unknownTermForTemplatePosition;
    private static final SubLObject $const323$candidateReplacementForPosition;
    private static final SubLList $list324;
    private static final SubLObject $const325$positionInFormulaTemplateIsReplac;
    private static final SubLObject $const326$validationRequiredOnTemplatePosit;
    private static final SubLObject $const327$InducedFormulaTemplateTopicType;
    private static final SubLSymbol $sym328$DICTIONARY_P;
    private static final SubLSymbol $sym329$HIGHER_PRIORITY_;
    private static final SubLSymbol $sym330$FORT_SORT_PRED;
    private static final SubLList $list331;
    private static final SubLString $str332$higherPriorityTemplateTypeForTopi;
    private static final SubLList $list333;
    private static final SubLSymbol $sym334$_HIGHER;
    private static final SubLSymbol $sym335$_LOWER;
    private static final SubLList $list336;
    private static final SubLObject $const337$and;
    private static final SubLList $list338;
    private static final SubLList $list339;
    private static final SubLObject $const340$formulaTemplateTypeHasTopicType;
    private static final SubLList $list341;
    private static final SubLObject $const342$higherPriorityTemplateForType;
    private static final SubLSymbol $sym343$STABLE_TEMPLATE_ID_COMPARE;
    private static final SubLSymbol $sym344$WARN;
    private static final SubLSymbol $sym345$ERROR;
    private static final SubLString $str346$Invalid_formula_template__A_in_to;
    private static final SubLString $str347$FactivoreTab;
    private static final SubLObject $const348$FormulaTemplateTopicType;
    private static final SubLObject $const349$FirstOrderCollection;
    private static final SubLSymbol $sym350$_TEMPLATE;
    private static final SubLObject $const351$formulaTemplateHasType;
    private static final SubLObject $const352$InferencePSC;
    private static final SubLSymbol $sym353$_;
    private static final SubLSymbol $sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE;
    private static final SubLList $list355;
    private static final SubLSymbol $sym356$_SUBTOPIC;
    private static final SubLSymbol $kw357$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw358$MAX_TIME;
    private static final SubLSymbol $sym359$_MT;
    private static final SubLObject $const360$definingMt;
    private static final SubLList $list361;
    private static final SubLList $list362;
    private static final SubLObject $const363$DataForNLMt;
    private static final SubLSymbol $sym364$FORT_OR_NAUT_P;
    private static final SubLObject $const365$sourcesForTopic;
    private static final SubLObject $const366$focalTermIntroduction;
    private static final SubLObject $const367$titleForFormulaTemplateType_Strin;
    private static final SubLObject $const368$templateTopicPrefix;
    private static final SubLObject $const369$queryMtForTopicAssertions;
    private static final SubLObject $const370$definitionalMtForTopicAssertions;
    private static final SubLSymbol $sym371$SET_P;
    private static final SubLList $list372;
    private static final SubLString $str373$knownAssertionsForTemplateTopic;
    private static final SubLString $str374$queryELMt;
    private static final SubLString $str375$templateInstance;
    private static final SubLString $str376$templateTopicAssertionsRevision;
    private static final SubLString $str377$knownAssertionsForTemplateSubTopi;
    private static final SubLList $list378;
    private static final SubLString $str379$knownAssertionsForTemplateSubTopi;
    private static final SubLString $str380$knownAssertionsForFormulaTemplate;
    private static final SubLList $list381;
    private static final SubLString $str382$knownAssertionsForFormulaTemplate;
    private static final SubLString $str383$assertionsMatchTemplate;
    private static final SubLString $str384$knownAssertions;
    private static final SubLString $str385$Problem_serializing_assertions_fo;
    private static final SubLSymbol $sym386$ASSERTED_ASSERTION_;
    private static final SubLString $str387$Invalid_return_object_;
    private static final SubLString $str388$_in_assertion_list;
    private static final SubLString $str389$knownAssertion;
    private static final SubLString $str390$deducedAssertion;
    private static final SubLString $str391$knownAssertionSUIDs;
    private static final SubLString $str392$knownAssertionEvaluations;
    private static final SubLList $list393;
    private static final SubLString $str394$knownAssertionEvaluation;
    private static final SubLString $str395$evaluator;
    private static final SubLString $str396$judgment;
    private static final SubLString $str397$evaluationOfAssertionByOn;
    private static final SubLString $str398$evaluationOfAssertionOfByOn;
    private static final SubLList $list399;
    private static final SubLSymbol $sym400$_EVAL;
    private static final SubLList $list401;
    private static final SubLList $list402;
    private static final SubLSymbol $sym403$_JUDGMENT;
    private static final SubLObject $const404$evaluationOutputSentences;
    private static final SubLList $list405;
    private static final SubLString $str406$knownAssertionELMt;
    private static final SubLString $str407$knownAssertionCW;
    private static final SubLSymbol $sym408$MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK;
    private static final SubLSymbol $kw409$PCW;
    private static final SubLObject $const410$contextOfPCW;
    private static final SubLSymbol $sym411$_MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK_CACHING_STATE_;
    private static final SubLList $list412;
    private static final SubLSymbol $sym413$_POLY_ELMT;
    private static final SubLObject $const414$ist_Intermediate;
    private static final SubLObject $const415$MtUnionFn;
    private static final SubLObject $const416$RKFInteractionContextMicrotheory;
    private static final SubLSymbol $sym417$__REFSPEC;
    private static final SubLSymbol $sym418$__ASSERTION;
    private static final SubLSymbol $kw419$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw420$BINDINGS;
    private static final SubLSymbol $kw421$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLFloat $float422$1_0;
    private static final SubLSymbol $kw423$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw424$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw425$BROWSABLE_;
    private static final SubLList $list426;
    private static final SubLSymbol $sym427$DEDUCED_ASSERTION_;
    private static final SubLSymbol $sym428$EL_TERM_P;
    private static final SubLSymbol $sym429$ASSERTION_P;
    private static final SubLSymbol $kw430$POLY_CANONICALIZED;
    private static final SubLSymbol $sym431$FTEMPLATE_POLYCANONICALIZED_ASSERTION_P;
    private static final SubLObject $const432$equals;
    private static final SubLObject $const433$ist;
    private static final SubLList $list434;
    private static final SubLSymbol $sym435$_FET_ASSERTION_VAR_524;
    private static final SubLList $list436;
    private static final SubLObject $const437$assertionSentence;
    private static final SubLObject $const438$ist_Asserted;
    private static final SubLObject $const439$assertionProducedByReformulation;
    private static final SubLList $list440;
    private static final SubLObject $const441$SpecsFn;
    private static final SubLObject $const442$SomeExampleFn;
    private static final SubLObject $const443$SomeExampleSpecFn;
    private static final SubLObject $const444$defnIff;
    private static final SubLObject $const445$defnSufficient;
    private static final SubLSymbol $kw446$LEXICAL_MT;
    private static final SubLList $list447;
    private static final SubLObject $const448$genlMt;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_template_topic(v_object, stream, (SubLObject)formula_templates.ZERO_INTEGER);
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $template_topic_native.class) ? formula_templates.T : formula_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_supertopic(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_topic(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_subtopics(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_templates(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_ordering(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_title(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_term_prefix(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_intro_template(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_source_types(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_source_mt(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_query_mt(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject template_topic_definitional_mt(final SubLObject v_object) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_supertopic(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_topic(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_subtopics(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_templates(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_ordering(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_title(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_term_prefix(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_intro_template(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_source_types(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_source_mt(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_query_mt(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject _csetf_template_topic_definitional_mt(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != template_topic_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject make_template_topic(SubLObject arglist) {
        if (arglist == formula_templates.UNPROVIDED) {
            arglist = (SubLObject)formula_templates.NIL;
        }
        final SubLObject v_new = (SubLObject)new $template_topic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)formula_templates.NIL, next = arglist; formula_templates.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)formula_templates.$kw33$SUPERTOPIC)) {
                _csetf_template_topic_supertopic(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw34$TOPIC)) {
                _csetf_template_topic_topic(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw35$SUBTOPICS)) {
                _csetf_template_topic_subtopics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw36$TEMPLATES)) {
                _csetf_template_topic_templates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw37$ORDERING)) {
                _csetf_template_topic_ordering(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw38$TITLE)) {
                _csetf_template_topic_title(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw39$TERM_PREFIX)) {
                _csetf_template_topic_term_prefix(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw40$INTRO_TEMPLATE)) {
                _csetf_template_topic_intro_template(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw41$SOURCE_TYPES)) {
                _csetf_template_topic_source_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw42$SOURCE_MT)) {
                _csetf_template_topic_source_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw43$QUERY_MT)) {
                _csetf_template_topic_query_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw44$DEFINITIONAL_MT)) {
                _csetf_template_topic_definitional_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)formula_templates.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject visit_defstruct_template_topic(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw46$BEGIN, (SubLObject)formula_templates.$sym47$MAKE_TEMPLATE_TOPIC, (SubLObject)formula_templates.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw33$SUPERTOPIC, template_topic_supertopic(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw34$TOPIC, template_topic_topic(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw35$SUBTOPICS, template_topic_subtopics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw36$TEMPLATES, template_topic_templates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw37$ORDERING, template_topic_ordering(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw38$TITLE, template_topic_title(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw39$TERM_PREFIX, template_topic_term_prefix(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw40$INTRO_TEMPLATE, template_topic_intro_template(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw41$SOURCE_TYPES, template_topic_source_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw42$SOURCE_MT, template_topic_source_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw43$QUERY_MT, template_topic_query_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw44$DEFINITIONAL_MT, template_topic_definitional_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw49$END, (SubLObject)formula_templates.$sym47$MAKE_TEMPLATE_TOPIC, (SubLObject)formula_templates.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 1893L)
    public static SubLObject visit_defstruct_object_template_topic_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_template_topic(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_arg_position_details(v_object, stream, (SubLObject)formula_templates.ZERO_INTEGER);
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $arg_position_details_native.class) ? formula_templates.T : formula_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_argument_position(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_ordering(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_gloss(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_invisible_replacement_positions(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_replacement_constraints(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_candidate_replacements(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_is_editable(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_explanation(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_requires_validation(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject arg_position_details_unknown_replacement(final SubLObject v_object) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_argument_position(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_ordering(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_gloss(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_invisible_replacement_positions(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_replacement_constraints(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_candidate_replacements(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_is_editable(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_explanation(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_requires_validation(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject _csetf_arg_position_details_unknown_replacement(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != arg_position_details_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject make_arg_position_details(SubLObject arglist) {
        if (arglist == formula_templates.UNPROVIDED) {
            arglist = (SubLObject)formula_templates.NIL;
        }
        final SubLObject v_new = (SubLObject)new $arg_position_details_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)formula_templates.NIL, next = arglist; formula_templates.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)formula_templates.$kw82$ARGUMENT_POSITION)) {
                _csetf_arg_position_details_argument_position(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw37$ORDERING)) {
                _csetf_arg_position_details_ordering(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw83$GLOSS)) {
                _csetf_arg_position_details_gloss(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw84$INVISIBLE_REPLACEMENT_POSITIONS)) {
                _csetf_arg_position_details_invisible_replacement_positions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw85$REPLACEMENT_CONSTRAINTS)) {
                _csetf_arg_position_details_replacement_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw86$CANDIDATE_REPLACEMENTS)) {
                _csetf_arg_position_details_candidate_replacements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw87$IS_EDITABLE)) {
                _csetf_arg_position_details_is_editable(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw88$EXPLANATION)) {
                _csetf_arg_position_details_explanation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw89$REQUIRES_VALIDATION)) {
                _csetf_arg_position_details_requires_validation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw90$UNKNOWN_REPLACEMENT)) {
                _csetf_arg_position_details_unknown_replacement(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)formula_templates.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject visit_defstruct_arg_position_details(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw46$BEGIN, (SubLObject)formula_templates.$sym91$MAKE_ARG_POSITION_DETAILS, (SubLObject)formula_templates.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw82$ARGUMENT_POSITION, arg_position_details_argument_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw37$ORDERING, arg_position_details_ordering(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw83$GLOSS, arg_position_details_gloss(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw84$INVISIBLE_REPLACEMENT_POSITIONS, arg_position_details_invisible_replacement_positions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw85$REPLACEMENT_CONSTRAINTS, arg_position_details_replacement_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw86$CANDIDATE_REPLACEMENTS, arg_position_details_candidate_replacements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw87$IS_EDITABLE, arg_position_details_is_editable(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw88$EXPLANATION, arg_position_details_explanation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw89$REQUIRES_VALIDATION, arg_position_details_requires_validation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw90$UNKNOWN_REPLACEMENT, arg_position_details_unknown_replacement(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw49$END, (SubLObject)formula_templates.$sym91$MAKE_ARG_POSITION_DETAILS, (SubLObject)formula_templates.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 2722L)
    public static SubLObject visit_defstruct_object_arg_position_details_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_arg_position_details(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_formula_template(v_object, stream, (SubLObject)formula_templates.ZERO_INTEGER);
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $formula_template_native.class) ? formula_templates.T : formula_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_topic(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_id(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_formula(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_query_specification(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_elmt(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_focal_term(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_argpos_details(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_argpos_ordering(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_examples(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_entry_format(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_follow_ups(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_gloss(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject formula_template_refspec(final SubLObject v_object) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_topic(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_id(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_formula(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_query_specification(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_elmt(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_focal_term(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_argpos_details(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_argpos_ordering(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_examples(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_entry_format(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_follow_ups(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_gloss(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject _csetf_formula_template_refspec(final SubLObject v_object, final SubLObject value) {
        assert formula_templates.NIL != formula_template_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject make_formula_template(SubLObject arglist) {
        if (arglist == formula_templates.UNPROVIDED) {
            arglist = (SubLObject)formula_templates.NIL;
        }
        final SubLObject v_new = (SubLObject)new $formula_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)formula_templates.NIL, next = arglist; formula_templates.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)formula_templates.$kw34$TOPIC)) {
                _csetf_formula_template_topic(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw130$ID)) {
                _csetf_formula_template_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw131$FORMULA)) {
                _csetf_formula_template_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw132$QUERY_SPECIFICATION)) {
                _csetf_formula_template_query_specification(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw133$ELMT)) {
                _csetf_formula_template_elmt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw134$FOCAL_TERM)) {
                _csetf_formula_template_focal_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw135$ARGPOS_DETAILS)) {
                _csetf_formula_template_argpos_details(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw136$ARGPOS_ORDERING)) {
                _csetf_formula_template_argpos_ordering(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw137$EXAMPLES)) {
                _csetf_formula_template_examples(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw138$ENTRY_FORMAT)) {
                _csetf_formula_template_entry_format(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw139$FOLLOW_UPS)) {
                _csetf_formula_template_follow_ups(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw83$GLOSS)) {
                _csetf_formula_template_gloss(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)formula_templates.$kw140$REFSPEC)) {
                _csetf_formula_template_refspec(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)formula_templates.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject visit_defstruct_formula_template(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw46$BEGIN, (SubLObject)formula_templates.$sym141$MAKE_FORMULA_TEMPLATE, (SubLObject)formula_templates.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw34$TOPIC, formula_template_topic(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw130$ID, formula_template_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw131$FORMULA, formula_template_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw132$QUERY_SPECIFICATION, formula_template_query_specification(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw133$ELMT, formula_template_elmt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw134$FOCAL_TERM, formula_template_focal_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw135$ARGPOS_DETAILS, formula_template_argpos_details(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw136$ARGPOS_ORDERING, formula_template_argpos_ordering(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw137$EXAMPLES, formula_template_examples(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw138$ENTRY_FORMAT, formula_template_entry_format(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw139$FOLLOW_UPS, formula_template_follow_ups(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw83$GLOSS, formula_template_gloss(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw48$SLOT, (SubLObject)formula_templates.$kw140$REFSPEC, formula_template_refspec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)formula_templates.$kw49$END, (SubLObject)formula_templates.$sym141$MAKE_FORMULA_TEMPLATE, (SubLObject)formula_templates.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 3472L)
    public static SubLObject visit_defstruct_object_formula_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_formula_template(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 4487L)
    public static SubLObject is_ftemplate_loading_supporting_ask_browsableP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(formula_templates.$make_ftemplate_loading_supporting_ask_browsableP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 4624L)
    public static SubLObject with_browsable_ftemplate_loading_supporting_ask(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)formula_templates.$sym145$CLET, (SubLObject)formula_templates.$list146, ConsesLow.append(body, (SubLObject)formula_templates.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 4788L)
    public static SubLObject reusing_rkf_sd_problem_store_if_available(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (formula_templates.NIL != Sequences.find((SubLObject)formula_templates.$kw147$CYC_RKF, reader.$features$.getDynamicValue(thread), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)formula_templates.$sym148$REUSING_RKF_SD_PROBLEM_STORE, ConsesLow.append(body, (SubLObject)formula_templates.NIL));
        }
        return reader.bq_cons((SubLObject)formula_templates.$sym149$PROGN, ConsesLow.append(body, (SubLObject)formula_templates.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 5382L)
    public static SubLObject get_non_editable_assertions_for_template_topic_instance() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return formula_templates.$non_editable_assertions_for_template_topic_instance$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 5521L)
    public static SubLObject with_known_non_editable_assertions_for_template_topic_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list150);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject non_editables = (SubLObject)formula_templates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list150);
        non_editables = current.first();
        current = current.rest();
        if (formula_templates.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)formula_templates.$sym145$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)formula_templates.$sym151$_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE_, non_editables)), (SubLObject)ConsesLow.listS((SubLObject)formula_templates.$sym152$CHECK_TYPE, non_editables, (SubLObject)formula_templates.$list153), ConsesLow.append(body, (SubLObject)formula_templates.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list150);
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 5785L)
    public static SubLObject compute_non_editable_assertions_for_template_topic_instance(final SubLObject instance, final SubLObject template_id, final SubLObject template_elmt, final SubLObject query_mt) {
        final SubLObject non_editables = set.new_set((SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject isas = formula_template_utilities.template_type_for_focal_term_types(template_id, template_elmt);
        final SubLObject v_genls = formula_template_utilities.template_topic_genls(template_id, template_elmt);
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = (SubLObject)formula_templates.NIL;
        v_isa = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject sentence = (SubLObject)ConsesLow.list(formula_templates.$const154$isa, instance, v_isa);
            SubLObject cdolist_list_var_$1 = smarter_find_visible_assertions_cycl(sentence, query_mt);
            SubLObject assertion = (SubLObject)formula_templates.NIL;
            assertion = cdolist_list_var_$1.first();
            while (formula_templates.NIL != cdolist_list_var_$1) {
                set.set_add(assertion, non_editables);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                assertion = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)formula_templates.NIL;
        genl = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject sentence = (SubLObject)ConsesLow.list(formula_templates.$const155$genls, instance, genl);
            SubLObject cdolist_list_var_$2 = smarter_find_visible_assertions_cycl(sentence, query_mt);
            SubLObject assertion = (SubLObject)formula_templates.NIL;
            assertion = cdolist_list_var_$2.first();
            while (formula_templates.NIL != cdolist_list_var_$2) {
                set.set_add(assertion, non_editables);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                assertion = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return non_editables;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 6735L)
    public static SubLObject is_non_editable_assertion_for_template_topic_instanceP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula_templates.NIL != set.set_p(formula_templates.$non_editable_assertions_for_template_topic_instance$.getDynamicValue(thread))) {
            return set.set_memberP(assertion, formula_templates.$non_editable_assertions_for_template_topic_instance$.getDynamicValue(thread));
        }
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 6992L)
    public static SubLObject with_non_editable_assertions_for_template_topic_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = (SubLObject)formula_templates.NIL;
        SubLObject template_id = (SubLObject)formula_templates.NIL;
        SubLObject template_elmt = (SubLObject)formula_templates.NIL;
        SubLObject query_mt = (SubLObject)formula_templates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list156);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list156);
        template_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list156);
        template_elmt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list156);
        query_mt = current.first();
        current = current.rest();
        if (formula_templates.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject non_editable = (SubLObject)formula_templates.$sym157$NON_EDITABLE;
            return (SubLObject)ConsesLow.list((SubLObject)formula_templates.$sym145$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(non_editable, (SubLObject)ConsesLow.list((SubLObject)formula_templates.$sym158$COMPUTE_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE, instance, template_id, template_elmt, query_mt))), (SubLObject)ConsesLow.listS((SubLObject)formula_templates.$sym159$WITH_KNOWN_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE, (SubLObject)ConsesLow.list(non_editable), ConsesLow.append(body, (SubLObject)formula_templates.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list156);
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 7460L)
    public static SubLObject valid_formula_template_p(final SubLObject template) {
        SubLObject result = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL == formula_template_p(template)) {
            Errors.warn((SubLObject)formula_templates.$str160$_S_is_not_a_FORMULA_TEMPLATE_P_, template);
        }
        else if (formula_templates.NIL != new_cycl_query_specification.new_cycl_query_specification_p(formula_template_query_specification(template)) && formula_templates.NIL != el_utilities.el_formula_p(new_cycl_query_specification.new_cycl_query_specification_formula(formula_template_query_specification(template))) && formula_templates.NIL != hlmt.possibly_mt_p(new_cycl_query_specification.new_cycl_query_specification_mt(formula_template_query_specification(template)))) {
            result = (SubLObject)formula_templates.T;
        }
        else if (formula_templates.NIL == el_utilities.el_formula_p(formula_template_formula(template))) {
            Errors.warn((SubLObject)formula_templates.$str161$_S_is_not_EL_FORMULA_P_, formula_template_formula(template));
        }
        else if (formula_templates.NIL == hlmt.possibly_mt_p(formula_template_elmt(template))) {
            Errors.warn((SubLObject)formula_templates.$str162$_S_is_not_POSSIBLY_MT_P_, formula_template_elmt(template));
        }
        else {
            result = (SubLObject)formula_templates.T;
        }
        if (formula_templates.NIL == result) {
            Errors.warn((SubLObject)formula_templates.$str163$bad_formula_template___S__, template);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 8489L)
    public static SubLObject new_template_topic(final SubLObject topic, SubLObject supertopic) {
        if (supertopic == formula_templates.UNPROVIDED) {
            supertopic = (SubLObject)formula_templates.NIL;
        }
        final SubLObject tmplt_topic = make_template_topic((SubLObject)formula_templates.UNPROVIDED);
        _csetf_template_topic_topic(tmplt_topic, topic);
        if (formula_templates.NIL != supertopic) {
            _csetf_template_topic_supertopic(tmplt_topic, supertopic);
        }
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 8764L)
    public static SubLObject template_topic_add_subtopic(final SubLObject tmplt_topic, final SubLObject subtopic) {
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        assert formula_templates.NIL != template_topic_p(subtopic) : subtopic;
        _csetf_template_topic_supertopic(subtopic, tmplt_topic);
        _csetf_template_topic_subtopics(tmplt_topic, (SubLObject)ConsesLow.cons(subtopic, template_topic_subtopics(tmplt_topic)));
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 9054L)
    public static SubLObject template_topic_add_template(final SubLObject tmplt_topic, final SubLObject ftemplate) {
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        _csetf_formula_template_topic(ftemplate, tmplt_topic);
        _csetf_template_topic_templates(tmplt_topic, (SubLObject)ConsesLow.cons(ftemplate, template_topic_templates(tmplt_topic)));
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 9347L)
    public static SubLObject template_topic_add_title(final SubLObject tmplt_topic, final SubLObject title) {
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        assert formula_templates.NIL != Types.stringp(title) : title;
        _csetf_template_topic_title(tmplt_topic, title);
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 9553L)
    public static SubLObject template_topic_add_term_prefix(final SubLObject tmplt_topic, final SubLObject term_prefix) {
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        assert formula_templates.NIL != Types.stringp(term_prefix) : term_prefix;
        _csetf_template_topic_term_prefix(tmplt_topic, term_prefix);
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 9791L)
    public static SubLObject template_topic_set_introductory_template(final SubLObject tmplt_topic, final SubLObject v_term) {
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        assert formula_templates.NIL != forts.fort_p(v_term) : v_term;
        _csetf_template_topic_intro_template(tmplt_topic, v_term);
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 10020L)
    public static SubLObject template_topic_set_source_types(final SubLObject tmplt_topic, final SubLObject source_types) {
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        assert formula_templates.NIL != Types.listp(source_types) : source_types;
        _csetf_template_topic_source_types(tmplt_topic, source_types);
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 10263L)
    public static SubLObject print_template_topic(final SubLObject tmplt_topic, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)formula_templates.$str167$_TemplateTopic__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)formula_templates.$str168$Parent___S___Topic___S_, (SubLObject)((formula_templates.NIL != template_topic_supertopic(tmplt_topic)) ? template_topic_topic(template_topic_supertopic(tmplt_topic)) : formula_templates.NIL), template_topic_topic(tmplt_topic));
        if (template_topic_title(tmplt_topic).isString()) {
            streams_high.write_string((SubLObject)formula_templates.$str169$_named_, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            streams_high.write_string(template_topic_title(tmplt_topic), stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            print_high.princ((SubLObject)Characters.CHAR_space, stream);
        }
        if (template_topic_term_prefix(tmplt_topic).isString()) {
            streams_high.write_string((SubLObject)formula_templates.$str170$_Term_Prefix__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            streams_high.write_string(template_topic_term_prefix(tmplt_topic), stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            print_high.princ((SubLObject)Characters.CHAR_space, stream);
        }
        if (formula_templates.NIL != template_topic_subtopics(tmplt_topic)) {
            streams_high.write_string((SubLObject)formula_templates.$str171$___SubTopics__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            SubLObject cdolist_list_var = template_topic_subtopics(tmplt_topic);
            SubLObject subtopic = (SubLObject)formula_templates.NIL;
            subtopic = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)Characters.CHAR_space, stream);
                print_high.prin1(template_topic_topic(subtopic), stream);
                cdolist_list_var = cdolist_list_var.rest();
                subtopic = cdolist_list_var.first();
            }
        }
        if (formula_templates.NIL != template_topic_source_types(tmplt_topic)) {
            streams_high.write_string((SubLObject)formula_templates.$str172$___Sources__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            SubLObject cdolist_list_var = template_topic_source_types(tmplt_topic);
            SubLObject source = (SubLObject)formula_templates.NIL;
            source = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)Characters.CHAR_space, stream);
                print_high.prin1(source, stream);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            }
        }
        if (formula_templates.NIL != template_topic_source_mt(tmplt_topic)) {
            streams_high.write_string((SubLObject)formula_templates.$str173$___Template_Source_Mt__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            print_high.prin1(template_topic_source_mt(tmplt_topic), stream);
        }
        if (formula_templates.NIL != template_topic_query_mt(tmplt_topic)) {
            streams_high.write_string((SubLObject)formula_templates.$str174$___Template_Query_Mt__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            print_high.prin1(template_topic_query_mt(tmplt_topic), stream);
        }
        if (formula_templates.NIL != template_topic_definitional_mt(tmplt_topic)) {
            streams_high.write_string((SubLObject)formula_templates.$str175$___Template_Definitional_Mt__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            print_high.prin1(template_topic_definitional_mt(tmplt_topic), stream);
        }
        if (formula_templates.NIL != template_topic_templates(tmplt_topic)) {
            streams_high.write_string((SubLObject)formula_templates.$str176$___Templates_, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            SubLObject cdolist_list_var = template_topic_templates(tmplt_topic);
            SubLObject ftemplate = (SubLObject)formula_templates.NIL;
            ftemplate = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)Characters.CHAR_space, stream);
                print_high.prin1(formula_template_id(ftemplate), stream);
                if (formula_template_id(ftemplate).eql(template_topic_intro_template(tmplt_topic))) {
                    print_high.princ((SubLObject)formula_templates.$str177$____introductory_template__, stream);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ftemplate = cdolist_list_var.first();
            }
        }
        streams_high.write_string((SubLObject)formula_templates.$str178$_, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 12385L)
    public static SubLObject formula_template_xml_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list179);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject local_name = (SubLObject)formula_templates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list179);
        local_name = current.first();
        current = current.rest();
        final SubLObject attributes = (SubLObject)(current.isCons() ? current.first() : formula_templates.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)formula_templates.$list179);
        current = current.rest();
        final SubLObject atomicP = (SubLObject)(current.isCons() ? current.first() : formula_templates.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)formula_templates.$list179);
        current = current.rest();
        if (formula_templates.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)formula_templates.$sym180$XML_TAG, (SubLObject)ConsesLow.listS(local_name, attributes, atomicP, (SubLObject)formula_templates.$list181), (SubLObject)ConsesLow.listS((SubLObject)formula_templates.$sym145$CLET, (SubLObject)formula_templates.$list182, ConsesLow.append(body, (SubLObject)formula_templates.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list179);
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 13103L)
    public static SubLObject xml_template_topic_current_revision() {
        return formula_templates.$xml_template_topic_revisions$.getGlobalValue().first().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 13215L)
    public static SubLObject xml_serialize_template_topic(final SubLObject tmplt_topic, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert formula_templates.NIL != template_topic_p(tmplt_topic) : tmplt_topic;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str184$templateTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        if (formula_templates.NIL == formula_templates.$xml_suppress_future_template_extensions$.getDynamicValue(thread)) {
                            try {
                                final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str185$templateTopicRevision, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$10 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_number(xml_template_topic_current_revision(), (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$10, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$7, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str185$templateTopicRevision);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str186$topic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$9 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$11 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml_generator.cycml_serialize_fort(template_topic_topic(tmplt_topic));
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$11, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$9, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str186$topic);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        if (formula_templates.NIL != template_topic_supertopic(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str187$superTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$12 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml_generator.cycml_serialize_fort(template_topic_topic(template_topic_supertopic(tmplt_topic)));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$12, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$11, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str187$superTopic);
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_title(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str188$title, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$13 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$13 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(template_topic_title(tmplt_topic), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$13, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$13, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str188$title);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_term_prefix(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str189$termPrefix, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(template_topic_term_prefix(tmplt_topic), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$14, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$15, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$14, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str189$termPrefix);
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_intro_template(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str190$introductoryTemplate, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$17 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$15 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml_generator.cycml_serialize_fort(template_topic_intro_template(tmplt_topic));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$15, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$17, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values6 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str190$introductoryTemplate);
                                    Values.restoreValuesFromVector(_values6);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_subtopics(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str191$subTopics, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$19 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$16 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = template_topic_subtopics(tmplt_topic);
                                        SubLObject subtopic = (SubLObject)formula_templates.NIL;
                                        subtopic = cdolist_list_var.first();
                                        while (formula_templates.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str192$subTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$21 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$17 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_serialize_template_topic(subtopic, stream);
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$17, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$21, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values7 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str192$subTopic);
                                                    Values.restoreValuesFromVector(_values7);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            subtopic = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$16, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$19, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values8 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str191$subTopics);
                                    Values.restoreValuesFromVector(_values8);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_source_types(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str193$sourcesOfTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$18 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = template_topic_source_types(tmplt_topic);
                                        SubLObject source_type = (SubLObject)formula_templates.NIL;
                                        source_type = cdolist_list_var.first();
                                        while (formula_templates.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str194$sourceOfTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$25 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$19 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(source_type);
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$19, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$25, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values9 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str194$sourceOfTopic);
                                                    Values.restoreValuesFromVector(_values9);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            source_type = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$18, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$23, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values10 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str193$sourcesOfTopic);
                                    Values.restoreValuesFromVector(_values10);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_source_mt(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str195$templateSourceMt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$27 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$20 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(template_topic_source_mt(tmplt_topic));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$20, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$27, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values11 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str195$templateSourceMt);
                                    Values.restoreValuesFromVector(_values11);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_query_mt(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str196$templateQueryMt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$29 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$21 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(template_topic_query_mt(tmplt_topic));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$21, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$29, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values12 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str196$templateQueryMt);
                                    Values.restoreValuesFromVector(_values12);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_definitional_mt(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str197$templateDefinitionalMt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$31 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$22 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(template_topic_definitional_mt(tmplt_topic));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$22, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$31, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values13 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str197$templateDefinitionalMt);
                                    Values.restoreValuesFromVector(_values13);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != template_topic_templates(tmplt_topic)) {
                            try {
                                final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str198$formulaTemplates, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$33 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$23 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = template_topic_templates(tmplt_topic);
                                        SubLObject ftemplate = (SubLObject)formula_templates.NIL;
                                        ftemplate = cdolist_list_var.first();
                                        while (formula_templates.NIL != cdolist_list_var) {
                                            if (formula_templates.NIL != valid_formula_template_p(ftemplate)) {
                                                xml_serialize_formula_template(ftemplate, stream);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            ftemplate = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$23, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$33, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values14 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str198$formulaTemplates);
                                    Values.restoreValuesFromVector(_values14);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$5, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values15 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str184$templateTopic);
                    Values.restoreValuesFromVector(_values15);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 15967L)
    public static SubLObject cfasl_output_object_template_topic_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_template_topic(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 16090L)
    public static SubLObject cfasl_output_template_topic(final SubLObject tmplt_topic, final SubLObject stream) {
        cfasl.write_cfasl_guid_denoted_type_opcode(stream, formula_templates.$cfasl_guid_opcode_template_topic$.getGlobalValue());
        cfasl.cfasl_output(template_topic_topic(tmplt_topic), stream);
        final SubLObject parent_topic = (SubLObject)((formula_templates.NIL != template_topic_p(template_topic_supertopic(tmplt_topic))) ? template_topic_topic(template_topic_supertopic(tmplt_topic)) : formula_templates.NIL);
        cfasl.cfasl_output(parent_topic, stream);
        cfasl.cfasl_output(template_topic_title(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_term_prefix(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_intro_template(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_subtopics(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_source_types(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_source_mt(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_query_mt(tmplt_topic), stream);
        cfasl.cfasl_output(template_topic_definitional_mt(tmplt_topic), stream);
        final SubLObject ftemplates = conses_high.copy_list(template_topic_templates(tmplt_topic));
        final SubLObject valid_ftemplates = list_utilities.remove_if_not((SubLObject)formula_templates.$sym200$VALID_FORMULA_TEMPLATE_P, ftemplates, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        cfasl.cfasl_output(valid_ftemplates, stream);
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 17371L)
    public static SubLObject cfasl_input_template_topic(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tmplt_topic = make_template_topic((SubLObject)formula_templates.UNPROVIDED);
        _csetf_template_topic_topic(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_supertopic(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_title(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_term_prefix(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_intro_template(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_subtopics(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_source_types(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_source_mt(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_query_mt(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_definitional_mt(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_template_topic_templates(tmplt_topic, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        SubLObject cdolist_list_var = template_topic_subtopics(tmplt_topic);
        SubLObject subtopic = (SubLObject)formula_templates.NIL;
        subtopic = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            if (formula_templates.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !template_topic_supertopic(subtopic).eql(template_topic_topic(tmplt_topic))) {
                Errors.error((SubLObject)formula_templates.$str201$CFASL_INPUT_TEMPLATE_TOPIC_has_lo, template_topic_supertopic(subtopic), template_topic_topic(tmplt_topic));
            }
            _csetf_template_topic_supertopic(subtopic, tmplt_topic);
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        }
        return tmplt_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 18756L)
    public static SubLObject new_formula_template(final SubLObject identifier, SubLObject topic) {
        if (topic == formula_templates.UNPROVIDED) {
            topic = (SubLObject)formula_templates.NIL;
        }
        final SubLObject ftemplate = make_formula_template((SubLObject)formula_templates.UNPROVIDED);
        _csetf_formula_template_id(ftemplate, identifier);
        if (formula_templates.NIL != template_topic_p(topic)) {
            template_topic_add_template(topic, ftemplate);
        }
        else {
            _csetf_formula_template_topic(ftemplate, topic);
        }
        _csetf_formula_template_argpos_details(ftemplate, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED));
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 19218L)
    public static SubLObject formula_template_is_single_entryP(final SubLObject ftemplate) {
        return Equality.eq(formula_templates.$const202$SingleAssertionEntry, formula_template_entry_format(ftemplate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 19359L)
    public static SubLObject formula_template_is_multiple_entryP(final SubLObject ftemplate) {
        return Equality.eq(formula_templates.$const203$MultipleAssertionEntry, formula_template_entry_format(ftemplate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 19504L)
    public static SubLObject formula_template_has_reformulation_specificationP(final SubLObject ftemplate) {
        return list_utilities.sublisp_boolean(formula_template_refspec(ftemplate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 19638L)
    public static SubLObject print_formula_template(final SubLObject ftemplate, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)formula_templates.$str204$_Formula_Template__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)formula_templates.$str205$_A_, formula_template_id(ftemplate));
        if (formula_templates.NIL != template_topic_p(formula_template_topic(ftemplate))) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str206$of_topic__A__, template_topic_topic(formula_template_topic(ftemplate)));
        }
        else {
            streams_high.terpri(stream);
        }
        string_utilities.indent(stream, depth);
        if (formula_templates.NIL != formula_template_formula(ftemplate)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str207$_formula__A_in__A__, formula_template_formula(ftemplate), formula_template_elmt(ftemplate));
        }
        else {
            PrintLow.format(stream, (SubLObject)formula_templates.$str208$_query_spec__A_in__A__, formula_template_query_specification(ftemplate), formula_template_elmt(ftemplate));
        }
        string_utilities.indent(stream, depth);
        if (formula_templates.NIL != formula_template_focal_term(ftemplate)) {
            if (formula_templates.NIL != list_utilities.singletonP(formula_template_focal_term(ftemplate))) {
                PrintLow.format(stream, (SubLObject)formula_templates.$str209$_focal_term__A___A___, formula_template_focal_term(ftemplate).first(), formula_template_entry_format(ftemplate));
            }
            else {
                PrintLow.format(stream, (SubLObject)formula_templates.$str210$_focal_term_occurrences__A___A___, formula_template_focal_term(ftemplate), formula_template_entry_format(ftemplate));
            }
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != formula_template_examples(ftemplate)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str211$_examples___A__, formula_template_examples(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != formula_template_follow_ups(ftemplate)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str212$_follow_ups___A__, formula_template_follow_ups(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != formula_template_gloss(ftemplate)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str213$_template_gloss___A__, formula_template_gloss(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != formula_template_refspec(ftemplate)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str214$_reformulation_specification___A_, formula_template_refspec(ftemplate));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != formula_template_argpos_details(ftemplate)) {
            streams_high.write_string((SubLObject)formula_templates.$str215$_argpos_details__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            if (formula_templates.NIL == formula_template_argpos_ordering(ftemplate)) {
                print_high.princ(formula_template_argpos_details(ftemplate), stream);
            }
            else {
                SubLObject cdolist_list_var = formula_template_argpos_ordering(ftemplate);
                SubLObject argpos_detail = (SubLObject)formula_templates.NIL;
                argpos_detail = cdolist_list_var.first();
                while (formula_templates.NIL != cdolist_list_var) {
                    print_arg_position_details(argpos_detail, stream, Numbers.add(depth, (SubLObject)formula_templates.ONE_INTEGER));
                    print_high.princ((SubLObject)formula_templates.$str216$_, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    argpos_detail = cdolist_list_var.first();
                }
            }
        }
        streams_high.write_string((SubLObject)formula_templates.$str178$_, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 22024L)
    public static SubLObject formula_template_set_formula(final SubLObject ftemplate, final SubLObject formula) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != el_utilities.el_formula_p(formula) : formula;
        _csetf_formula_template_formula(ftemplate, formula);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 22243L)
    public static SubLObject formula_template_set_examples(final SubLObject ftemplate, final SubLObject examples) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != Types.listp(examples) : examples;
        _csetf_formula_template_examples(ftemplate, examples);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 22460L)
    public static SubLObject formula_template_set_focal_term(final SubLObject ftemplate, final SubLObject focal_term) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != forts.fort_p(focal_term) : focal_term;
        _csetf_formula_template_focal_term(ftemplate, focal_term);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 22688L)
    public static SubLObject formula_template_set_elmt(final SubLObject ftemplate, final SubLObject elmt) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != fort_types_interface.isa_mtP(elmt, (SubLObject)formula_templates.UNPROVIDED) : elmt;
        _csetf_formula_template_elmt(ftemplate, elmt);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 22887L)
    public static SubLObject formula_template_set_entry_format(final SubLObject ftemplate, final SubLObject entry_format) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != constant_handles.constant_p(entry_format) : entry_format;
        _csetf_formula_template_entry_format(ftemplate, entry_format);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 23129L)
    public static SubLObject formula_template_set_gloss(final SubLObject ftemplate, final SubLObject gloss) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != Types.stringp(gloss) : gloss;
        _csetf_formula_template_gloss(ftemplate, gloss);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 23333L)
    public static SubLObject formula_template_set_query_specification(final SubLObject ftemplate, final SubLObject spec) {
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != new_cycl_query_specification.new_cycl_query_specification_p(spec) : spec;
        _csetf_formula_template_query_specification(ftemplate, spec);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 23585L)
    public static SubLObject xml_serialize_formula_template(final SubLObject ftemplate, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str221$formulaTemplate, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
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
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str222$id, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$95 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$98 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(formula_template_id(ftemplate));
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$98, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$95, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$94, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$93, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str222$id);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                        if (formula_templates.NIL != formula_template_formula(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$96 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str223$formula, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$97 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$97 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$99 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_el_formula(formula_template_formula(ftemplate));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$99, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$97, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$97, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$96, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str223$formula);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                                }
                            }
                        }
                        final SubLObject query_spec = formula_template_query_specification(ftemplate);
                        if (formula_templates.NIL != query_spec && formula_templates.NIL != cycl_grammar.cycl_sentence_p(el_utilities.possibly_unquote(new_cycl_query_specification.new_cycl_query_specification_formula(query_spec)))) {
                            new_cycl_query_specification.xml_serialize_new_cycl_query_specification(query_spec, (SubLObject)formula_templates.UNPROVIDED);
                        }
                        try {
                            final SubLObject _prev_bind_0_$99 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$98 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str224$elmt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$100 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$99 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$100 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(formula_template_elmt(ftemplate));
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$100, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$99, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$100, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$98, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$99, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str224$elmt);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                        if (formula_templates.NIL != formula_template_focal_term(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$102 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$100 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str225$focalTerm, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$103 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$101 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$101 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        if (formula_templates.NIL != list_utilities.singletonP(formula_template_focal_term(ftemplate))) {
                                            xml_serialize_arg_position(formula_template_focal_term(ftemplate).first(), (SubLObject)formula_templates.UNPROVIDED);
                                        }
                                        else {
                                            try {
                                                final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$102 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str226$argPositions, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$103 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$102 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        SubLObject cdolist_list_var = formula_template_focal_term(ftemplate);
                                                        SubLObject focus = (SubLObject)formula_templates.NIL;
                                                        focus = cdolist_list_var.first();
                                                        while (formula_templates.NIL != cdolist_list_var) {
                                                            xml_serialize_arg_position(focus, (SubLObject)formula_templates.UNPROVIDED);
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            focus = cdolist_list_var.first();
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$102, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$103, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$105, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$102, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$104, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values4 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str226$argPositions);
                                                    Values.restoreValuesFromVector(_values4);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$101, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$101, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$103, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$100, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$102, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str225$focalTerm);
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != formula_template_is_single_entryP(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$104 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str227$singleEntry, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.$kw228$ATOMIC, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$105 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$103 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$103, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$105, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$109, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$104, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$108, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values6 = Values.getValuesAsVector();
                                    Values.restoreValuesFromVector(_values6);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                }
                            }
                        }
                        else {
                            try {
                                final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str229$multipleEntry, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.$kw228$ATOMIC, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$107 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$104 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$104, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$107, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$106, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values7 = Values.getValuesAsVector();
                                    Values.restoreValuesFromVector(_values7);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != formula_template_examples(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$108 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str230$usageExamples, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$109 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$105 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var2 = formula_template_examples(ftemplate);
                                        SubLObject example = (SubLObject)formula_templates.NIL;
                                        example = cdolist_list_var2.first();
                                        while (formula_templates.NIL != cdolist_list_var2) {
                                            try {
                                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$110 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str231$example, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$111 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$106 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_el_formula(example);
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$106, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$111, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$110, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values8 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str231$example);
                                                    Values.restoreValuesFromVector(_values8);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            example = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$105, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$109, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$108, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values9 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str230$usageExamples);
                                    Values.restoreValuesFromVector(_values9);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != formula_template_gloss(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$112 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str232$glossForTemplate, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$113 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$107 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write(formula_template_gloss(ftemplate), (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$107, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$113, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$112, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$120, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values10 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str232$glossForTemplate);
                                    Values.restoreValuesFromVector(_values10);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != formula_template_follow_ups(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$123 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$114 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str233$followUps, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$124 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$115 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$108 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var2 = formula_template_follow_ups(ftemplate);
                                        SubLObject follow_up = (SubLObject)formula_templates.NIL;
                                        follow_up = cdolist_list_var2.first();
                                        while (formula_templates.NIL != cdolist_list_var2) {
                                            try {
                                                final SubLObject _prev_bind_0_$125 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str234$followUp, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$126 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$117 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$109 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        SubLObject current;
                                                        final SubLObject datum = current = follow_up;
                                                        SubLObject v_term = (SubLObject)formula_templates.NIL;
                                                        SubLObject connective = (SubLObject)formula_templates.NIL;
                                                        SubLObject load_mt = (SubLObject)formula_templates.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list235);
                                                        v_term = current.first();
                                                        current = current.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list235);
                                                        connective = current.first();
                                                        current = current.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list235);
                                                        load_mt = current.first();
                                                        current = current.rest();
                                                        if (formula_templates.NIL == current) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$127 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$118 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str236$templateId, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                                    final SubLObject _prev_bind_0_$128 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$119 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$110 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(v_term);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$110, thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$119, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$128, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$118, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$127, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                                    final SubLObject _values11 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str236$templateId);
                                                                    Values.restoreValuesFromVector(_values11);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$130 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$120 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str237$connective, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                                    final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$121 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$111 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(connective);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$111, thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$121, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$131, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$120, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$130, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                                    final SubLObject _values12 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str237$connective);
                                                                    Values.restoreValuesFromVector(_values12);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$133 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$122 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str238$loadMt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                                    final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$123 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$112 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(load_mt);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$112, thread);
                                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$123, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$134, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$122, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$133, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$135 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                                    final SubLObject _values13 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str238$loadMt);
                                                                    Values.restoreValuesFromVector(_values13);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$135, thread);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list235);
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$109, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$117, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$126, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$125, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$136 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values14 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str234$followUp);
                                                    Values.restoreValuesFromVector(_values14);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$136, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            follow_up = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$108, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$115, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$124, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$114, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$123, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values15 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str233$followUps);
                                    Values.restoreValuesFromVector(_values15);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != formula_template_refspec(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$138 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$124 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str239$reformulationSpecification, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$139 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$125 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$113 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(formula_template_refspec(ftemplate));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$113, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$125, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$139, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$124, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$138, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$140 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values16 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str239$reformulationSpecification);
                                    Values.restoreValuesFromVector(_values16);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$140, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != formula_template_argpos_details(ftemplate)) {
                            try {
                                final SubLObject _prev_bind_0_$141 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$126 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str240$argumentPositionDetails, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$142 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$127 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$114 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        if (formula_templates.NIL != formula_template_argpos_ordering(ftemplate)) {
                                            SubLObject cdolist_list_var2 = formula_template_argpos_ordering(ftemplate);
                                            SubLObject argpos_details = (SubLObject)formula_templates.NIL;
                                            argpos_details = cdolist_list_var2.first();
                                            while (formula_templates.NIL != cdolist_list_var2) {
                                                if (formula_templates.NIL != valid_arg_position_details_p(argpos_details)) {
                                                    xml_serialize_arg_position_details(argpos_details, (SubLObject)formula_templates.UNPROVIDED);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                argpos_details = cdolist_list_var2.first();
                                            }
                                        }
                                        else {
                                            SubLObject iteration_state;
                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(formula_template_argpos_details(ftemplate))); formula_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                thread.resetMultipleValues();
                                                final SubLObject argpos = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                final SubLObject argpos_details2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (formula_templates.NIL != valid_arg_position_details_p(argpos_details2)) {
                                                    xml_serialize_arg_position_details(argpos_details2, (SubLObject)formula_templates.UNPROVIDED);
                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$114, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$127, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$142, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$126, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$141, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values17 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str240$argumentPositionDetails);
                                    Values.restoreValuesFromVector(_values17);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$93, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$144 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values18 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str221$formulaTemplate);
                    Values.restoreValuesFromVector(_values18);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$144, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 27007L)
    public static SubLObject xml_serialize_formula_template_as_document(final SubLObject ftemplate, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        xml_serialize_formula_template_header(stream);
        xml_serialize_formula_template(ftemplate, stream);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 27325L)
    public static SubLObject formula_template_dtd_uri() {
        return formula_templates.$formula_template_dtd_uri$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 27408L)
    public static SubLObject xml_serialize_formula_template_header(SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            print_high.princ((SubLObject)formula_templates.$str242$__xml_version__1_0__encoding__US_, xml_vars.$xml_stream$.getDynamicValue(thread));
            streams_high.terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)formula_templates.$str243$__DOCTYPE_formulaTemplate_SYSTEM_, formula_template_dtd_uri());
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 27758L)
    public static SubLObject cfasl_output_object_formula_template_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_formula_template(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 27886L)
    public static SubLObject cfasl_output_formula_template(final SubLObject ftemplate, final SubLObject stream) {
        cfasl.write_cfasl_guid_denoted_type_opcode(stream, formula_templates.$cfasl_guid_opcode_formula_template$.getGlobalValue());
        cfasl.cfasl_output(formula_template_id(ftemplate), stream);
        cfasl.cfasl_output(formula_template_formula(ftemplate), stream);
        cfasl.cfasl_output(formula_template_query_specification(ftemplate), stream);
        cfasl.cfasl_output(formula_template_elmt(ftemplate), stream);
        cfasl.cfasl_output(formula_template_focal_term(ftemplate), stream);
        cfasl.cfasl_output(formula_template_entry_format(ftemplate), stream);
        cfasl.cfasl_output(formula_template_examples(ftemplate), stream);
        cfasl.cfasl_output(formula_template_gloss(ftemplate), stream);
        cfasl.cfasl_output(formula_template_follow_ups(ftemplate), stream);
        cfasl.cfasl_output(formula_template_refspec(ftemplate), stream);
        if (formula_templates.NIL == formula_template_argpos_ordering(ftemplate)) {
            cfasl.cfasl_output((SubLObject)formula_templates.NIL, stream);
        }
        else {
            final SubLObject argpos_ordering_keys = Mapping.mapcar((SubLObject)formula_templates.$sym62$ARG_POSITION_DETAILS_ARGUMENT_POSITION, formula_template_argpos_ordering(ftemplate));
            cfasl.cfasl_output(argpos_ordering_keys, stream);
        }
        cfasl.cfasl_output(formula_template_argpos_details(ftemplate), stream);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 29119L)
    public static SubLObject cfasl_input_formula_template(final SubLObject stream) {
        final SubLObject ftemplate = make_formula_template((SubLObject)formula_templates.UNPROVIDED);
        _csetf_formula_template_id(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_formula(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_query_specification(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_elmt(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_focal_term(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_entry_format(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_examples(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_gloss(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_follow_ups(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_formula_template_refspec(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        final SubLObject argpos_ordering_keys = cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject ordering = (SubLObject)formula_templates.NIL;
        _csetf_formula_template_argpos_details(ftemplate, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        SubLObject cdolist_list_var = argpos_ordering_keys;
        SubLObject argpos_key = (SubLObject)formula_templates.NIL;
        argpos_key = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject argpos_detail = dictionary.dictionary_lookup(formula_template_argpos_details(ftemplate), argpos_key, (SubLObject)formula_templates.UNPROVIDED);
            ordering = (SubLObject)ConsesLow.cons(argpos_detail, ordering);
            cdolist_list_var = cdolist_list_var.rest();
            argpos_key = cdolist_list_var.first();
        }
        _csetf_formula_template_argpos_ordering(ftemplate, Sequences.nreverse(ordering));
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 30470L)
    public static SubLObject new_arg_position_details(final SubLObject argpos) {
        final SubLObject argpos_details = make_arg_position_details((SubLObject)formula_templates.UNPROVIDED);
        _csetf_arg_position_details_argument_position(argpos_details, argpos);
        return argpos_details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 30718L)
    public static SubLObject valid_arg_position_details_p(final SubLObject argpos) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL != arg_position_details_p(argpos) && (formula_templates.NIL != arg_position_details_candidate_replacements(argpos) || formula_templates.NIL != arg_position_details_replacement_constraints(argpos) || formula_templates.NIL != arg_position_details_gloss(argpos)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 31058L)
    public static SubLObject print_arg_position_details(final SubLObject argpos_details, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)formula_templates.$str245$__ArgPos_Details__, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)formula_templates.$str246$_for_position__A_, arg_position_details_argument_position(argpos_details));
        if (arg_position_details_ordering(argpos_details).isFixnum()) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str247$__ordering_slot__D_, arg_position_details_ordering(argpos_details));
        }
        else {
            streams_high.write_string((SubLObject)formula_templates.$str248$__no_ordering_info_, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        }
        if (formula_templates.NIL == arg_position_details_is_editable(argpos_details)) {
            streams_high.write_string((SubLObject)formula_templates.$str249$_READ_ONLY, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        }
        streams_high.terpri(stream);
        if (formula_templates.NIL != arg_position_details_gloss(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str250$_gloss___A__, arg_position_details_gloss(argpos_details));
        }
        if (formula_templates.NIL != arg_position_details_invisible_replacement_positions(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str251$_replacementInvisible___A__, arg_position_details_invisible_replacement_positions(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != arg_position_details_replacement_constraints(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str252$_candidate_replacements___A__, arg_position_details_candidate_replacements(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != arg_position_details_replacement_constraints(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str253$_constraints___A__, arg_position_details_replacement_constraints(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != arg_position_details_requires_validation(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str254$__requires_validation____);
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != arg_position_details_explanation(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str255$_explanation___A__, arg_position_details_explanation(argpos_details));
            string_utilities.indent(stream, depth);
        }
        if (formula_templates.NIL != arg_position_details_unknown_replacement(argpos_details)) {
            PrintLow.format(stream, (SubLObject)formula_templates.$str256$_term_for_unknown___A__, arg_position_details_unknown_replacement(argpos_details));
            string_utilities.indent(stream, depth);
        }
        streams_high.write_string((SubLObject)formula_templates.$str178$_, stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        return argpos_details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 33051L)
    public static SubLObject xml_serialize_arg_position_details(final SubLObject argpos_details, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str257$argumentPositionDetail, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$198 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$199 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_serialize_arg_position(arg_position_details_argument_position(argpos_details), (SubLObject)formula_templates.UNPROVIDED);
                        if (arg_position_details_ordering(argpos_details).isFixnum()) {
                            try {
                                final SubLObject _prev_bind_0_$199 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$200 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str258$ordering, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$200 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$201 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$204 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_prin1(arg_position_details_ordering(argpos_details), (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$204, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$201, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$200, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$200, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$199, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$201 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str258$ordering);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                                }
                            }
                        }
                        if (arg_position_details_gloss(argpos_details).isString()) {
                            try {
                                final SubLObject _prev_bind_0_$202 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$202 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str259$glossText, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$203 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$203 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$205 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(arg_position_details_gloss(argpos_details), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$205, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$203, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$203, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$202, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$202, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$204 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str259$glossText);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$204, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_candidate_replacements(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$205 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$204 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str260$candidateReplacementsForPosition, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$206 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$205 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$206 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = arg_position_details_candidate_replacements(argpos_details);
                                        SubLObject candidate = (SubLObject)formula_templates.NIL;
                                        candidate = cdolist_list_var.first();
                                        while (formula_templates.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$207 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$206 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str261$candidateReplacementForPosition, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$208 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$207 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$207 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(candidate);
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$207, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$207, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$208, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$206, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$207, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$209 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str261$candidateReplacementForPosition);
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            candidate = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$206, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$205, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$206, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$204, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$205, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$210 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str260$candidateReplacementsForPosition);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_invisible_replacement_positions(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$211 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$208 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str262$templateReplacementsInvisibleForP, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.$kw228$ATOMIC, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$212 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$209 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$208 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$208, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$209, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$212, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$208, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$211, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$213 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_is_editable(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$214 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$210 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str263$isEditable, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.$kw228$ATOMIC, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$215 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$211 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$209 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$209, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$211, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$215, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$210, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$214, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$216 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values6 = Values.getValuesAsVector();
                                    Values.restoreValuesFromVector(_values6);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$216, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_requires_validation(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$217 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$212 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str264$validationRequired, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.$kw228$ATOMIC, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$218 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$213 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$210 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$210, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$213, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$218, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$212, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$217, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$219 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values7 = Values.getValuesAsVector();
                                    Values.restoreValuesFromVector(_values7);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$219, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_explanation(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$220 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$214 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str265$explanation, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$221 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$215 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$211 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_write_string(arg_position_details_explanation(argpos_details), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$211, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$215, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$221, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$214, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$220, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$222 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values8 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str265$explanation);
                                    Values.restoreValuesFromVector(_values8);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$222, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_unknown_replacement(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$223 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$216 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str266$unknownTermForTemplatePosition, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$224 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$217 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$212 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_term(arg_position_details_unknown_replacement(argpos_details));
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$212, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$217, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$224, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$216, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$223, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$225 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values9 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str266$unknownTermForTemplatePosition);
                                    Values.restoreValuesFromVector(_values9);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                                }
                            }
                        }
                        if (formula_templates.NIL != arg_position_details_replacement_constraints(argpos_details)) {
                            try {
                                final SubLObject _prev_bind_0_$226 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$218 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str267$constraintsOnReplacement, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$227 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$219 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$213 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        SubLObject cdolist_list_var = arg_position_details_replacement_constraints(argpos_details);
                                        SubLObject constraint = (SubLObject)formula_templates.NIL;
                                        constraint = cdolist_list_var.first();
                                        while (formula_templates.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$228 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$220 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str268$constraintOnReplacement, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                    final SubLObject _prev_bind_0_$229 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$221 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$214 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(constraint);
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$214, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$221, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$229, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$220, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$228, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$230 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values10 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str268$constraintOnReplacement);
                                                    Values.restoreValuesFromVector(_values10);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            constraint = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$213, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$219, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$227, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$218, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$226, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$231 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values11 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str267$constraintsOnReplacement);
                                    Values.restoreValuesFromVector(_values11);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$231, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$199, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$198, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$197, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$232 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values12 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str257$argumentPositionDetail);
                    Values.restoreValuesFromVector(_values12);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$232, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return argpos_details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 35340L)
    public static SubLObject cfasl_output_object_arg_position_details_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_arg_position_details(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 35475L)
    public static SubLObject cfasl_output_arg_position_details(final SubLObject argpos_details, final SubLObject stream) {
        cfasl.write_cfasl_guid_denoted_type_opcode(stream, formula_templates.$cfasl_guid_opcode_arg_position_details$.getGlobalValue());
        cfasl.cfasl_output(arg_position_details_argument_position(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_ordering(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_gloss(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_candidate_replacements(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_invisible_replacement_positions(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_is_editable(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_requires_validation(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_explanation(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_unknown_replacement(argpos_details), stream);
        cfasl.cfasl_output(arg_position_details_replacement_constraints(argpos_details), stream);
        return argpos_details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 36483L)
    public static SubLObject cfasl_input_arg_position_details(final SubLObject stream) {
        final SubLObject argpos_details = make_arg_position_details((SubLObject)formula_templates.UNPROVIDED);
        _csetf_arg_position_details_argument_position(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_ordering(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_gloss(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_candidate_replacements(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_invisible_replacement_positions(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_is_editable(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_requires_validation(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_explanation(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_unknown_replacement(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        _csetf_arg_position_details_replacement_constraints(argpos_details, cfasl.cfasl_input(stream, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        return argpos_details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 37511L)
    public static SubLObject xml_serialize_arg_position(SubLObject position, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str270$argPosition, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$268 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$269 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        SubLObject cdolist_list_var = position.rest();
                        SubLObject index = (SubLObject)formula_templates.NIL;
                        index = cdolist_list_var.first();
                        while (formula_templates.NIL != cdolist_list_var) {
                            try {
                                final SubLObject _prev_bind_0_$269 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$270 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str271$position, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$270 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$271 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$274 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_prin1(index, (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$274, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$271, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$270, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$270, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$269, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$271 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str271$position);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$271, thread);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            index = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$269, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$268, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$267, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$272 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str270$argPosition);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return position;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 37819L)
    public static SubLObject formula_template_load_topic_template_details(final SubLObject topic_id, final SubLObject ftemplate, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula_templates.NIL != topic_id && !formula_templates.assertionsDisabledSynth && formula_templates.NIL == forts.fort_p(topic_id)) {
            throw new AssertionError(topic_id);
        }
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        assert formula_templates.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject template_id = formula_template_id(ftemplate);
        if (formula_templates.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && formula_templates.NIL == forts.fort_p(template_id)) {
            Errors.error((SubLObject)formula_templates.$str273$Can_t_load_a_formula_template_wit, ftemplate);
        }
        _csetf_formula_template_formula(ftemplate, ftemplate_get_template_formula(template_id, elmt));
        _csetf_formula_template_elmt(ftemplate, ftemplate_get_template_elmt(template_id, elmt));
        _csetf_formula_template_follow_ups(ftemplate, ftemplate_get_template_follow_ups(template_id, elmt));
        _csetf_formula_template_gloss(ftemplate, ftemplate_get_template_gloss(template_id, elmt));
        _csetf_formula_template_refspec(ftemplate, ftemplate_get_template_reformulation_specification(template_id, elmt));
        if (formula_templates.NIL != forts.fort_p(topic_id)) {
            _csetf_formula_template_focal_term(ftemplate, ftemplate_get_template_focal_term(template_id, topic_id, elmt));
            _csetf_formula_template_entry_format(ftemplate, ftemplate_get_template_format(template_id, topic_id, elmt));
            _csetf_formula_template_examples(ftemplate, ftemplate_get_template_examples(template_id, topic_id, elmt));
        }
        ftemplate_load_argument_position_detail_information(ftemplate, elmt, topic_id);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 39459L)
    public static SubLObject ftemplate_load_argument_position_detail_information(final SubLObject ftemplate, final SubLObject elmt, SubLObject topic_id) {
        if (topic_id == formula_templates.UNPROVIDED) {
            topic_id = (SubLObject)formula_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id = formula_template_id(ftemplate);
        if (formula_templates.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && formula_templates.NIL == forts.fort_p(template_id)) {
            Errors.error((SubLObject)formula_templates.$str273$Can_t_load_a_formula_template_wit, ftemplate);
        }
        if (formula_templates.NIL != constant_handles.valid_constantP(formula_templates.$const274$formulaTemplateHasArgumentPositio, (SubLObject)formula_templates.UNPROVIDED) && formula_templates.NIL != somewhere_cache.some_pred_assertion_somewhereP(formula_templates.$const274$formulaTemplateHasArgumentPositio, template_id, (SubLObject)formula_templates.ONE_INTEGER, (SubLObject)formula_templates.T)) {
            update_ftemplate_argpos_detail_invisible_replacement_positions(ftemplate, ftemplate_get_template_invisible_replacement_positions(template_id, topic_id, elmt));
            update_ftemplate_argpos_detail_replacable_positions(ftemplate, ftemplate_get_template_replacable_positions(template_id, elmt));
            update_ftemplate_argpos_detail_replacement_constraints(ftemplate, ftemplate_get_template_replacement_constraints(template_id, elmt));
            update_ftemplate_argpos_detail_candidate_replacements(ftemplate, ftemplate_get_template_candidate_replacements_for_position(template_id, elmt));
            if (formula_templates.NIL != forts.fort_p(topic_id)) {
                update_ftemplate_argpos_detail_glosses(ftemplate, ftemplate_get_template_glosses(template_id, topic_id, elmt));
                update_ftemplate_argpos_detail_explanations(ftemplate, ftemplate_get_template_explanations(template_id, topic_id, elmt));
            }
            update_ftemplate_argpos_detail_validation_required(ftemplate, ftemplate_get_template_validation_requirements(template_id, elmt));
            update_ftemplate_argpos_detail_unknown_replacements(ftemplate, ftemplate_get_template_unknown_replacements(template_id, elmt));
            update_ftemplate_argpos_detail_ordering_information(ftemplate);
            if (formula_templates.NIL == dictionary.dictionary_empty_p(formula_template_argpos_details(ftemplate))) {}
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 41488L)
    public static SubLObject update_ftemplate_argpos_detail_glosses(final SubLObject ftemplate, final SubLObject glosses) {
        SubLObject cdolist_list_var = glosses;
        SubLObject gloss_definition = (SubLObject)formula_templates.NIL;
        gloss_definition = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = gloss_definition;
            SubLObject gloss_text = (SubLObject)formula_templates.NIL;
            SubLObject argpos = (SubLObject)formula_templates.NIL;
            SubLObject ordering = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list275);
            gloss_text = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list275);
            argpos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list275);
            ordering = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_ordering(argpos_details, ordering);
                _csetf_arg_position_details_gloss(argpos_details, gloss_text);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list275);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gloss_definition = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 41927L)
    public static SubLObject update_ftemplate_argpos_detail_explanations(final SubLObject ftemplate, final SubLObject explanations) {
        SubLObject cdolist_list_var = explanations;
        SubLObject explanation_definition = (SubLObject)formula_templates.NIL;
        explanation_definition = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = explanation_definition;
            SubLObject explanation_text = (SubLObject)formula_templates.NIL;
            SubLObject argpos = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list276);
            explanation_text = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list276);
            argpos = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_explanation(argpos_details, explanation_text);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list276);
            }
            cdolist_list_var = cdolist_list_var.rest();
            explanation_definition = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 42326L)
    public static SubLObject update_ftemplate_argpos_detail_invisible_replacement_positions(final SubLObject ftemplate, final SubLObject invisible_pos) {
        SubLObject cdolist_list_var = invisible_pos;
        SubLObject invisible_position = (SubLObject)formula_templates.NIL;
        invisible_position = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, invisible_position);
            _csetf_arg_position_details_invisible_replacement_positions(argpos_details, (SubLObject)formula_templates.T);
            cdolist_list_var = cdolist_list_var.rest();
            invisible_position = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 42680L)
    public static SubLObject update_ftemplate_argpos_detail_replacable_positions(final SubLObject ftemplate, final SubLObject replacable_pos) {
        SubLObject cdolist_list_var = replacable_pos;
        SubLObject replacable_position = (SubLObject)formula_templates.NIL;
        replacable_position = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, replacable_position);
            _csetf_arg_position_details_is_editable(argpos_details, (SubLObject)formula_templates.T);
            cdolist_list_var = cdolist_list_var.rest();
            replacable_position = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 43007L)
    public static SubLObject update_ftemplate_argpos_detail_replacement_constraints(final SubLObject ftemplate, final SubLObject constraints) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = (SubLObject)formula_templates.NIL;
        constraint = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject argpos = (SubLObject)formula_templates.NIL;
            SubLObject replace_constraints = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list277);
            argpos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list277);
            replace_constraints = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_replacement_constraints(argpos_details, replace_constraints);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list277);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 43409L)
    public static SubLObject update_ftemplate_argpos_detail_candidate_replacements(final SubLObject ftemplate, final SubLObject replacements) {
        SubLObject cdolist_list_var = replacements;
        SubLObject candidate_replacement = (SubLObject)formula_templates.NIL;
        candidate_replacement = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = candidate_replacement;
            SubLObject argpos = (SubLObject)formula_templates.NIL;
            SubLObject candidates = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list278);
            argpos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list278);
            candidates = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_candidate_replacements(argpos_details, candidates);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list278);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_replacement = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 43819L)
    public static SubLObject update_ftemplate_argpos_detail_validation_required(final SubLObject ftemplate, final SubLObject required) {
        SubLObject cdolist_list_var = required;
        SubLObject argpos = (SubLObject)formula_templates.NIL;
        argpos = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
            _csetf_arg_position_details_requires_validation(argpos_details, (SubLObject)formula_templates.T);
            cdolist_list_var = cdolist_list_var.rest();
            argpos = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 44115L)
    public static SubLObject update_ftemplate_argpos_detail_unknown_replacements(final SubLObject ftemplate, final SubLObject replacements) {
        SubLObject cdolist_list_var = replacements;
        SubLObject replacement = (SubLObject)formula_templates.NIL;
        replacement = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = replacement;
            SubLObject argpos = (SubLObject)formula_templates.NIL;
            SubLObject thing = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list279);
            argpos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list279);
            thing = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                final SubLObject argpos_details = get_ftemplate_arg_position_details(ftemplate, argpos);
                _csetf_arg_position_details_unknown_replacement(argpos_details, thing);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list279);
            }
            cdolist_list_var = cdolist_list_var.rest();
            replacement = cdolist_list_var.first();
        }
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 44486L)
    public static SubLObject get_ftemplate_arg_position_details(final SubLObject ftemplate, final SubLObject argpos) {
        final SubLObject details = formula_template_argpos_details(ftemplate);
        SubLObject argpos_details = dictionary.dictionary_lookup(details, argpos, (SubLObject)formula_templates.NIL);
        if (formula_templates.NIL == arg_position_details_p(argpos_details)) {
            argpos_details = new_arg_position_details(argpos);
            dictionary.dictionary_enter(details, argpos, argpos_details);
        }
        return argpos_details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 44887L)
    public static SubLObject update_ftemplate_argpos_detail_ordering_information(final SubLObject ftemplate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordering = (SubLObject)formula_templates.NIL;
        SubLObject ordered = (SubLObject)formula_templates.NIL;
        SubLObject unordered = (SubLObject)formula_templates.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(formula_template_argpos_details(ftemplate))); formula_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject argpos = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject argpos_details = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (arg_position_details_ordering(argpos_details).isFixnum()) {
                ordered = (SubLObject)ConsesLow.cons(argpos_details, ordered);
            }
            else {
                unordered = (SubLObject)ConsesLow.cons(argpos_details, unordered);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        ordering = ftemplate_compute_ordering_of_argpos_details(ordered, unordered);
        _csetf_formula_template_argpos_ordering(ftemplate, ordering);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 45444L)
    public static SubLObject ftemplate_compute_ordering_of_argpos_details(final SubLObject ordered, final SubLObject unordered) {
        return Sequences.cconcatenate(sort_argpos_details_by_ordering(ordered), Sort.sort(unordered, (SubLObject)formula_templates.$sym280$ORDERED_BY_ARGUMENT_POSITION, (SubLObject)formula_templates.$sym62$ARG_POSITION_DETAILS_ARGUMENT_POSITION));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 45731L)
    public static SubLObject sort_argpos_details_by_ordering(final SubLObject details) {
        return Sort.sort(details, Symbols.symbol_function((SubLObject)formula_templates.$sym281$_), (SubLObject)formula_templates.$sym64$ARG_POSITION_DETAILS_ORDERING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 45852L)
    public static SubLObject ordered_by_argument_position(final SubLObject argpos_a, final SubLObject argpos_b) {
        if (!argpos_a.isCons()) {
            return (SubLObject)formula_templates.T;
        }
        if (!argpos_b.isCons()) {
            return (SubLObject)formula_templates.NIL;
        }
        if (!argpos_a.first().isFixnum()) {
            return (SubLObject)formula_templates.T;
        }
        if (!argpos_b.first().isFixnum()) {
            return (SubLObject)formula_templates.NIL;
        }
        if (argpos_a.first().numE(argpos_b.first())) {
            return ordered_by_argument_position(argpos_a.rest(), argpos_b.rest());
        }
        return Numbers.numL(argpos_a.first(), argpos_b.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 46274L)
    public static SubLObject load_formula_template_skeleton_from_kb(final SubLObject el_template_id, final SubLObject elmt) {
        assert formula_templates.NIL != el_utilities.possibly_fo_represented_term_p(el_template_id) : el_template_id;
        assert formula_templates.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject template_id = czer_main.canonicalize_term(el_template_id, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject ftemplate = new_formula_template(template_id, (SubLObject)formula_templates.UNPROVIDED);
        _csetf_formula_template_gloss(ftemplate, ftemplate_get_template_gloss(template_id, elmt));
        _csetf_formula_template_elmt(ftemplate, elmt);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 46836L)
    public static SubLObject load_formula_template_details_from_kb(final SubLObject cycl_template_id, final SubLObject elmt) {
        assert formula_templates.NIL != el_utilities.possibly_fo_represented_term_p(cycl_template_id) : cycl_template_id;
        assert formula_templates.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject template_id = czer_main.canonicalize_term(cycl_template_id, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject ftemplate = new_formula_template(template_id, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject query_spec_id = ftemplate_get_query_specification(template_id, elmt);
        if (formula_templates.NIL == query_spec_id) {
            _csetf_formula_template_formula(ftemplate, ftemplate_get_template_formula(template_id, elmt));
            _csetf_formula_template_elmt(ftemplate, ftemplate_get_template_elmt(template_id, elmt));
        }
        else {
            final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_spec_id, elmt);
            _csetf_formula_template_query_specification(ftemplate, query_spec);
            if (formula_templates.NIL == new_cycl_query_specification.new_cycl_query_specification_mt(query_spec)) {
                Errors.warn((SubLObject)formula_templates.$str283$Dwimming_MT_for__A_to__A____your_, template_id, elmt);
                new_cycl_query_specification.reset_new_cycl_query_specification_mt(query_spec, elmt);
            }
            _csetf_formula_template_elmt(ftemplate, new_cycl_query_specification.new_cycl_query_specification_mt(query_spec));
        }
        _csetf_formula_template_follow_ups(ftemplate, ftemplate_get_template_follow_ups(template_id, elmt));
        _csetf_formula_template_gloss(ftemplate, ftemplate_get_template_gloss(template_id, elmt));
        ftemplate_load_argument_position_detail_information(ftemplate, elmt, (SubLObject)formula_templates.UNPROVIDED);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 48590L)
    public static SubLObject ftemplate_assign_formula_component(final SubLObject ftemplate, final SubLObject elmt) {
        final SubLObject template_id = formula_template_id(ftemplate);
        final SubLObject query_spec_id = ftemplate_get_query_specification(template_id, elmt);
        if (formula_templates.NIL == query_spec_id) {
            _csetf_formula_template_formula(ftemplate, ftemplate_get_template_formula(template_id, elmt));
            return ftemplate;
        }
        final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_spec_id, elmt);
        _csetf_formula_template_query_specification(ftemplate, query_spec);
        return ftemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 49210L)
    public static SubLObject ftemplate_get_functional_slot_value(final SubLObject template_id, final SubLObject predicate, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        return ftemplate_get_first_asserted_value(template_id, topic_id, predicate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 49661L)
    public static SubLObject ftemplate_get_template_reformulation_specification(final SubLObject template_id, final SubLObject elmt) {
        return ftemplate_get_functional_slot_value(template_id, formula_templates.$const285$reformulateTemplateViaSpecificati, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 49850L)
    public static SubLObject ftemplate_get_query_specification(final SubLObject template_id, final SubLObject elmt) {
        if (formula_templates.NIL != nart_handles.nart_p(template_id) && cycl_utilities.nat_functor(template_id).eql(formula_templates.$const286$TemplateFromTestQueryFn)) {
            return cycl_utilities.nat_arg1(template_id, (SubLObject)formula_templates.UNPROVIDED);
        }
        return ftemplate_get_functional_slot_value(template_id, formula_templates.$const287$querySpecificationForFormulaTempl, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 50152L)
    public static SubLObject ftemplate_get_template_formula(final SubLObject template_id, final SubLObject elmt) {
        return ftemplate_get_functional_slot_value(template_id, formula_templates.$const288$formulaForFormulaTemplate, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 50311L)
    public static SubLObject ftemplate_get_template_elmt(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        SubLObject template_elmt = ftemplate_get_first_asserted_value(template_id, topic_id, formula_templates.$const289$assertMtForFormulaTemplate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
        if (formula_templates.NIL == template_elmt) {
            if (formula_templates.NIL != cycl_utilities.fort_or_naut_p(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread))) {
                template_elmt = czer_main.canonicalize_term(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread), (SubLObject)formula_templates.UNPROVIDED);
            }
            else {
                template_elmt = elmt;
            }
        }
        return template_elmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 50965L)
    public static SubLObject ftemplate_get_template_follow_ups(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject follow_up_argnum = (SubLObject)formula_templates.TWO_INTEGER;
        final SubLObject connective_argnum = (SubLObject)formula_templates.THREE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        final SubLObject straight = ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const290$formulaTemplateFollowUp, elmt, template_id_argnum, topic_id_argnum, (SubLObject)ConsesLow.list(follow_up_argnum, connective_argnum), allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject commuted = list_utilities.remove_if_not((SubLObject)formula_templates.$sym291$COMMUTATIVE_RELATION_, ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const290$formulaTemplateFollowUp, elmt, follow_up_argnum, topic_id_argnum, (SubLObject)ConsesLow.list(template_id_argnum, connective_argnum), allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED), Symbols.symbol_function((SubLObject)formula_templates.$sym292$SECOND), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject results = ConsesLow.append(straight, commuted);
        SubLObject final_results = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)formula_templates.NIL;
        result = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject follow_up = (SubLObject)formula_templates.NIL;
            SubLObject connective = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list293);
            follow_up = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list293);
            connective = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                final_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(follow_up, connective, elmt), final_results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list293);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Sequences.nreverse(final_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 52079L)
    public static SubLObject ftemplate_get_template_gloss(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_now = ftemplate_qualify_mt_to_now(elmt);
        SubLObject gloss = (SubLObject)formula_templates.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_now);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gloss = kb_mapping_utilities.fpred_value(template_id, formula_templates.$const294$formulaTemplateGloss, (SubLObject)formula_templates.ONE_INTEGER, (SubLObject)formula_templates.TWO_INTEGER, (SubLObject)formula_templates.$kw295$TRUE);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gloss;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 53239L)
    public static SubLObject ftemplate_qualify_mt_to_now(final SubLObject mt) {
        return ftemplate_hlmt_change_time(mt, (SubLObject)formula_templates.$list296);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 53387L)
    public static SubLObject ftemplate_qualify_mt_to_anytime(final SubLObject mt) {
        return ftemplate_hlmt_change_time(mt, formula_templates.$const297$AnytimePSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 53495L)
    public static SubLObject ftemplate_hlmt_change_time(final SubLObject v_hlmt, final SubLObject new_time_context) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        return (formula_templates.NIL != hlmt.hlmt_p(monad_mt)) ? hlmt.new_hlmt((SubLObject)ConsesLow.list(monad_mt, new_time_context)) : v_hlmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 53704L)
    public static SubLObject ftemplate_get_template_glosses(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.TWO_INTEGER;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list298;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const299$glossForFormulaTemplate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 54146L)
    public static SubLObject ftemplate_get_template_explanations(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.TWO_INTEGER;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list300;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const301$formulaTemplateArgExplanation, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 54544L)
    public static SubLObject ftemplate_get_template_examples(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const302$formulaTemplateExample, elmt, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 54769L)
    public static SubLObject ftemplate_get_first_asserted_value(final SubLObject template_id, final SubLObject topic_id, final SubLObject predicate, final SubLObject elmt, SubLObject template_id_argnum, SubLObject topic_id_argnum, SubLObject answer_argnums, SubLObject allow_genl_topicsP) {
        if (template_id_argnum == formula_templates.UNPROVIDED) {
            template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        }
        if (topic_id_argnum == formula_templates.UNPROVIDED) {
            topic_id_argnum = (SubLObject)formula_templates.TWO_INTEGER;
        }
        if (answer_argnums == formula_templates.UNPROVIDED) {
            answer_argnums = (SubLObject)ConsesLow.list((SubLObject)formula_templates.THREE_INTEGER);
        }
        if (allow_genl_topicsP == formula_templates.UNPROVIDED) {
            allow_genl_topicsP = templates_use_isaXgenlsP();
        }
        final SubLObject first_onlyP = (SubLObject)formula_templates.T;
        return ftemplate_get_asserted_values(template_id, topic_id, predicate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, first_onlyP).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 55413L)
    public static SubLObject ftemplate_get_asserted_values(final SubLObject template_id, final SubLObject topic_id, final SubLObject predicate, final SubLObject elmt, SubLObject template_id_argnum, SubLObject topic_id_argnum, SubLObject answer_argnums, SubLObject allow_genl_topicsP, SubLObject first_onlyP) {
        if (template_id_argnum == formula_templates.UNPROVIDED) {
            template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        }
        if (topic_id_argnum == formula_templates.UNPROVIDED) {
            topic_id_argnum = (SubLObject)formula_templates.TWO_INTEGER;
        }
        if (answer_argnums == formula_templates.UNPROVIDED) {
            answer_argnums = (SubLObject)ConsesLow.list((SubLObject)formula_templates.THREE_INTEGER);
        }
        if (allow_genl_topicsP == formula_templates.UNPROVIDED) {
            allow_genl_topicsP = templates_use_isaXgenlsP();
        }
        if (first_onlyP == formula_templates.UNPROVIDED) {
            first_onlyP = (SubLObject)formula_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_vars = Mapping.mapcar((SubLObject)formula_templates.$sym303$GET_VARIABLE, answer_argnums);
        final SubLObject v_arity = arity.min_arity(predicate);
        SubLObject answer_lit = (SubLObject)ConsesLow.cons(predicate, Mapping.mapcar((SubLObject)formula_templates.$sym303$GET_VARIABLE, list_utilities.num_list(v_arity, (SubLObject)formula_templates.ONE_INTEGER)));
        SubLObject pos_lits = (SubLObject)formula_templates.NIL;
        final SubLObject neg_lits = (SubLObject)formula_templates.NIL;
        if (template_id_argnum.isInteger()) {
            answer_lit = list_utilities.nreplace_nth(template_id_argnum, template_id, answer_lit);
        }
        if (formula_templates.NIL != allow_genl_topicsP) {
            final SubLObject genl_topic_var = variables.get_variable(topic_id_argnum);
            pos_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(formula_templates.$const155$genls, topic_id, genl_topic_var), pos_lits);
        }
        else if (formula_templates.NIL != subl_promotions.positive_integer_p(topic_id_argnum)) {
            answer_lit = list_utilities.nreplace_nth(topic_id_argnum, topic_id, answer_lit);
        }
        pos_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(formula_templates.$const304$assertedSentence, answer_lit), pos_lits);
        final SubLObject template = (formula_templates.NIL != list_utilities.singletonP(answer_vars)) ? answer_vars.first() : answer_vars;
        SubLObject v_properties = (SubLObject)formula_templates.NIL;
        SubLObject ans = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != first_onlyP) {
            v_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw305$MAX_NUMBER, (SubLObject)formula_templates.ONE_INTEGER);
        }
        if (formula_templates.NIL != neg_lits || formula_templates.NIL != list_utilities.lengthG(pos_lits, (SubLObject)formula_templates.ONE_INTEGER, (SubLObject)formula_templates.UNPROVIDED)) {
            final SubLObject dnf = clauses.make_clause(neg_lits, pos_lits);
            v_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw306$TRANSFORMATION_ALLOWED_, (SubLObject)formula_templates.NIL);
            v_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw307$PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
            v_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw308$RETURN, (SubLObject)ConsesLow.list((SubLObject)formula_templates.$kw309$TEMPLATE, template));
            v_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw310$ANSWER_LANGUAGE, (SubLObject)formula_templates.$kw311$HL);
            ans = inference_kernel.new_cyc_query_from_dnf(dnf, elmt, (SubLObject)formula_templates.NIL, v_properties);
            if (formula_templates.NIL != api_widgets.everything_psc_dwimmed_awayP() && formula_templates.NIL == ans) {
                ans = inference_kernel.new_cyc_query_from_dnf(dnf, formula_templates.$const312$EverythingPSC, (SubLObject)formula_templates.NIL, v_properties);
            }
        }
        else {
            SubLObject assertions = (SubLObject)formula_templates.NIL;
            if (formula_templates.NIL != topic_id && formula_templates.NIL != subl_promotions.positive_integer_p(topic_id_argnum) && formula_templates.NIL != template_id && formula_templates.NIL != subl_promotions.positive_integer_p(template_id_argnum)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = kb_mapping_utilities.pred_u_v_holds_gafs(predicate, template_id, topic_id, template_id_argnum, topic_id_argnum, (SubLObject)formula_templates.$kw295$TRUE);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (formula_templates.NIL != api_widgets.everything_psc_dwimmed_awayP() && formula_templates.NIL == assertions) {
                    assertions = kb_mapping_utilities.pred_u_v_holds_gafs_in_any_mt(predicate, template_id, topic_id, template_id_argnum, topic_id_argnum, (SubLObject)formula_templates.$kw295$TRUE);
                }
            }
            else if (formula_templates.NIL != template_id && formula_templates.NIL != subl_promotions.positive_integer_p(template_id_argnum)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = kb_mapping_utilities.pred_value_gafs(template_id, predicate, template_id_argnum, (SubLObject)formula_templates.$kw295$TRUE);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (formula_templates.NIL != api_widgets.everything_psc_dwimmed_awayP() && formula_templates.NIL == assertions) {
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)formula_templates.$sym313$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(formula_templates.$const312$EverythingPSC, thread);
                        assertions = kb_mapping_utilities.pred_value_gafs(template_id, predicate, template_id_argnum, (SubLObject)formula_templates.$kw295$TRUE);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                    }
                }
            }
            else if (formula_templates.NIL != topic_id && formula_templates.NIL != subl_promotions.positive_integer_p(topic_id_argnum)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = kb_mapping_utilities.pred_value_gafs(topic_id, predicate, topic_id_argnum, (SubLObject)formula_templates.$kw295$TRUE);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (formula_templates.NIL != api_widgets.everything_psc_dwimmed_awayP() && formula_templates.NIL == assertions) {
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)formula_templates.$sym313$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(formula_templates.$const312$EverythingPSC, thread);
                        assertions = kb_mapping_utilities.pred_value_gafs(topic_id, predicate, topic_id_argnum, (SubLObject)formula_templates.$kw295$TRUE);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                    }
                }
            }
            if (formula_templates.NIL != assertions) {
                if (formula_templates.NIL != list_utilities.singletonP(answer_argnums)) {
                    final SubLObject answer_argnum = answer_argnums.first();
                    if (formula_templates.NIL != first_onlyP) {
                        ans = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertions.first(), answer_argnum), ans);
                    }
                    else {
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = (SubLObject)formula_templates.NIL;
                        assertion = cdolist_list_var.first();
                        while (formula_templates.NIL != cdolist_list_var) {
                            ans = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, answer_argnum), ans);
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        }
                    }
                }
                else if (formula_templates.NIL != first_onlyP) {
                    final SubLObject assertion2 = assertions.first();
                    SubLObject temp_result = (SubLObject)formula_templates.NIL;
                    SubLObject cdolist_list_var2 = answer_argnums;
                    SubLObject answer_argnum2 = (SubLObject)formula_templates.NIL;
                    answer_argnum2 = cdolist_list_var2.first();
                    while (formula_templates.NIL != cdolist_list_var2) {
                        temp_result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion2, answer_argnum2), temp_result);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        answer_argnum2 = cdolist_list_var2.first();
                    }
                    ans = (SubLObject)ConsesLow.list(Sequences.nreverse(temp_result));
                }
                else {
                    SubLObject cdolist_list_var3 = assertions;
                    SubLObject assertion3 = (SubLObject)formula_templates.NIL;
                    assertion3 = cdolist_list_var3.first();
                    while (formula_templates.NIL != cdolist_list_var3) {
                        SubLObject temp_result2 = (SubLObject)formula_templates.NIL;
                        SubLObject cdolist_list_var_$277 = answer_argnums;
                        SubLObject answer_argnum3 = (SubLObject)formula_templates.NIL;
                        answer_argnum3 = cdolist_list_var_$277.first();
                        while (formula_templates.NIL != cdolist_list_var_$277) {
                            temp_result2 = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion3, answer_argnum3), temp_result2);
                            cdolist_list_var_$277 = cdolist_list_var_$277.rest();
                            answer_argnum3 = cdolist_list_var_$277.first();
                        }
                        ans = (SubLObject)ConsesLow.cons(Sequences.nreverse(temp_result2), ans);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        assertion3 = cdolist_list_var3.first();
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 61052L)
    public static SubLObject ftemplate_get_template_focal_term(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.THREE_INTEGER;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const314$focalTermPositionForFormulaTempla, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 61450L)
    public static SubLObject ftemplate_get_template_format(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.THREE_INTEGER;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = templates_use_isaXgenlsP();
        return ftemplate_get_first_asserted_value(template_id, topic_id, formula_templates.$const315$assertionFormatForFormulaTemplate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 61896L)
    public static SubLObject ftemplate_get_template_invisible_replacement_positions(final SubLObject template_id, final SubLObject topic_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const316$templateReplacementsInvisibleForP, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 62304L)
    public static SubLObject ftemplate_get_template_replacement_constraints(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list317;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        final SubLObject repl_constraints = ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const318$constraintOnReplacement, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject constraints = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED);
        SubLObject replacement_constraints = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = repl_constraints;
        SubLObject repl_constraint = (SubLObject)formula_templates.NIL;
        repl_constraint = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = repl_constraint;
            SubLObject position = (SubLObject)formula_templates.NIL;
            SubLObject constraint = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list319);
            position = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list319);
            constraint = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                if (!cycl_utilities.formula_arg0(constraint).eql(formula_templates.$const320$TheSet)) {
                    constraint = (SubLObject)ConsesLow.list(formula_templates.$const320$TheSet, (SubLObject)formula_templates.$sym321$_X, (SubLObject)ConsesLow.list(formula_templates.$const154$isa, (SubLObject)formula_templates.$sym321$_X, constraint));
                }
                dictionary_utilities.dictionary_push(constraints, position, constraint);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list319);
            }
            cdolist_list_var = cdolist_list_var.rest();
            repl_constraint = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraints)); formula_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject position2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraint_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            replacement_constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(position2, constraint_set), replacement_constraints);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return replacement_constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 63363L)
    public static SubLObject ftemplate_get_template_unknown_replacements(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list317;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        final SubLObject replacements = ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const322$unknownTermForTemplatePosition, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
        return replacements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 63792L)
    public static SubLObject ftemplate_get_template_candidate_replacements_for_position(final SubLObject template_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list317;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        final SubLObject repl_candidates = ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const323$candidateReplacementForPosition, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject replacements = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED);
        SubLObject replacement_candidates = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = repl_candidates;
        SubLObject repl_candidate = (SubLObject)formula_templates.NIL;
        repl_candidate = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = repl_candidate;
            SubLObject position = (SubLObject)formula_templates.NIL;
            SubLObject candidate = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list324);
            position = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list324);
            candidate = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                dictionary_utilities.dictionary_push(replacements, position, candidate);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list324);
            }
            cdolist_list_var = cdolist_list_var.rest();
            repl_candidate = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(replacements)); formula_templates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject position2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidates = thread.secondMultipleValue();
            thread.resetMultipleValues();
            replacement_candidates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(position2, candidates), replacement_candidates);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return replacement_candidates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 65008L)
    public static SubLObject ftemplate_get_template_replacable_positions(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const325$positionInFormulaTemplateIsReplac, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 65552L)
    public static SubLObject ftemplate_get_template_validation_requirements(final SubLObject template_id, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id = (SubLObject)formula_templates.NIL;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        return ftemplate_get_asserted_values(template_id, topic_id, formula_templates.$const326$validationRequiredOnTemplatePosit, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 65951L)
    public static SubLObject formula_template_load_topic_subtopic_ordering(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula_templates.NIL != isa.isaP(topic, formula_templates.$const327$InducedFormulaTemplateTopicType, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED)) {
            return sort_formula_template_subtopics_by_template_count(asserted_formula_template_subtopics_for_type(topic, elmt), elmt);
        }
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_template_load_prioritization_information_for_subtopics(topic, elmt);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 66773L)
    public static SubLObject formula_template_load_topic_template_ordering(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordered_template_forts = (SubLObject)formula_templates.NIL;
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_template_load_prioritization_information_for_templates(topic, elmt);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ordered_template_forts = apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
        return ordered_template_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 68932L)
    public static SubLObject lower_priority_terms(final SubLObject obj) {
        return accumulate_lower_priority_terms(obj, set.new_set(Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 69099L)
    public static SubLObject accumulate_lower_priority_terms(final SubLObject obj, final SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = dictionary.dictionary_lookup(formula_templates.$high_to_low_priorities$.getDynamicValue(thread), obj, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject immediate = (SubLObject)formula_templates.NIL;
        immediate = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            if (formula_templates.NIL == set.set_memberP(immediate, accumulator)) {
                set.set_add(immediate, accumulator);
                accumulate_lower_priority_terms(immediate, accumulator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            immediate = cdolist_list_var.first();
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 69409L)
    public static SubLObject higher_priorityP(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert formula_templates.NIL != dictionary.dictionary_p(formula_templates.$high_to_low_priorities$.getDynamicValue(thread)) : formula_templates.$high_to_low_priorities$.getDynamicValue(thread);
        return set.set_memberP(obj2, lower_priority_terms(obj1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 69672L)
    public static SubLObject apply_prioritizing_ordering_to_kb_objects(final SubLObject high_to_low, final SubLObject low_to_high) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordered_keys = (SubLObject)formula_templates.NIL;
        final SubLObject high_keys = dictionary.dictionary_keys(high_to_low);
        final SubLObject low_keys = dictionary.dictionary_keys(low_to_high);
        final SubLObject _prev_bind_0 = formula_templates.$high_to_low_priorities$.currentBinding(thread);
        try {
            formula_templates.$high_to_low_priorities$.bind(high_to_low, thread);
            final SubLObject all_keys = conses_high.union(high_keys, low_keys, dictionary.dictionary_test(high_to_low), (SubLObject)formula_templates.UNPROVIDED);
            ordered_keys = Sort.sort(all_keys, (SubLObject)formula_templates.$sym329$HIGHER_PRIORITY_, (SubLObject)formula_templates.UNPROVIDED);
        }
        finally {
            formula_templates.$high_to_low_priorities$.rebind(_prev_bind_0, thread);
        }
        return ordered_keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 70316L)
    public static SubLObject apply_prioritizing_ordering_to_kb_objects_rck(final SubLObject high_to_low, final SubLObject low_to_high) {
        SubLObject tuples = (SubLObject)formula_templates.NIL;
        final SubLObject high_keys = dictionary.dictionary_keys(high_to_low);
        final SubLObject low_keys = dictionary.dictionary_keys(low_to_high);
        SubLObject highest = conses_high.set_difference(high_keys, low_keys, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        if (formula_templates.NIL == highest) {
            highest = high_keys;
        }
        final SubLObject work_queue = queues.create_queue((SubLObject)formula_templates.UNPROVIDED);
        final SubLObject result_queue = queues.create_queue((SubLObject)formula_templates.UNPROVIDED);
        SubLObject cdolist_list_var = Sort.sort(highest, Symbols.symbol_function((SubLObject)formula_templates.$sym330$FORT_SORT_PRED), (SubLObject)formula_templates.UNPROVIDED);
        SubLObject item = (SubLObject)formula_templates.NIL;
        item = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            queues.enqueue(item, work_queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        while (formula_templates.NIL == queues.queue_empty_p(work_queue)) {
            final SubLObject current = queues.dequeue(work_queue);
            final SubLObject children = dictionary.dictionary_lookup(high_to_low, current, (SubLObject)formula_templates.NIL);
            if (formula_templates.NIL == queues.queue_find(current, result_queue, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED)) {
                queues.enqueue(current, result_queue);
            }
            if (formula_templates.NIL != children) {
                SubLObject cdolist_list_var2 = Sort.sort(children, Symbols.symbol_function((SubLObject)formula_templates.$sym330$FORT_SORT_PRED), (SubLObject)formula_templates.UNPROVIDED);
                SubLObject item2 = (SubLObject)formula_templates.NIL;
                item2 = cdolist_list_var2.first();
                while (formula_templates.NIL != cdolist_list_var2) {
                    if (formula_templates.NIL == queues.queue_find(item2, result_queue, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED)) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 71884L)
    public static SubLObject construct_highXlow_information_from_prioritizing_ordering(final SubLObject tuples) {
        final SubLObject high_to_low = dictionary.new_dictionary((SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        final SubLObject low_to_high = dictionary.new_dictionary((SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)formula_templates.NIL;
        tuple = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject higher = (SubLObject)formula_templates.NIL;
            SubLObject lower = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list331);
            higher = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list331);
            lower = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                higher = czer_main.canonicalize_term(higher, (SubLObject)formula_templates.UNPROVIDED);
                lower = czer_main.canonicalize_term(lower, (SubLObject)formula_templates.UNPROVIDED);
                dictionary_utilities.dictionary_push(high_to_low, higher, lower);
                dictionary_utilities.dictionary_push(low_to_high, lower, higher);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list331);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return Values.values(high_to_low, low_to_high);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 72578L)
    public static SubLObject formula_template_load_prioritization_information_for_subtopics(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_pred = constants_high.find_constant((SubLObject)formula_templates.$str332$higherPriorityTemplateTypeForTopi);
        final SubLObject tuples = (formula_templates.NIL != constant_handles.valid_constantP(new_pred, (SubLObject)formula_templates.UNPROVIDED)) ? ftemplate_ask_template((SubLObject)formula_templates.$list333, (SubLObject)ConsesLow.list(new_pred, (SubLObject)formula_templates.$sym334$_HIGHER, (SubLObject)formula_templates.$sym335$_LOWER, topic), elmt, (SubLObject)formula_templates.$list336) : ftemplate_ask_template((SubLObject)formula_templates.$list333, (SubLObject)ConsesLow.list(formula_templates.$const337$and, (SubLObject)formula_templates.$list338, (SubLObject)formula_templates.$list339, (SubLObject)ConsesLow.list(formula_templates.$const340$formulaTemplateTypeHasTopicType, (SubLObject)formula_templates.$sym334$_HIGHER, topic), (SubLObject)ConsesLow.list(formula_templates.$const340$formulaTemplateTypeHasTopicType, (SubLObject)formula_templates.$sym335$_LOWER, topic)), elmt, (SubLObject)formula_templates.$list341);
        thread.resetMultipleValues();
        final SubLObject high_to_low = construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(high_to_low, low_to_high);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 73562L)
    public static SubLObject formula_template_load_prioritization_information_for_templates(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tuples = ftemplate_ask_template((SubLObject)formula_templates.$list333, (SubLObject)ConsesLow.list(formula_templates.$const342$higherPriorityTemplateForType, (SubLObject)formula_templates.$sym334$_HIGHER, (SubLObject)formula_templates.$sym335$_LOWER, topic), elmt, (SubLObject)formula_templates.$list336);
        thread.resetMultipleValues();
        final SubLObject high_to_low = construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(high_to_low, low_to_high);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 74141L)
    public static SubLObject formula_template_organize_templates_by_ordering(final SubLObject topic) {
        final SubLObject ordering = template_topic_ordering(topic);
        final SubLObject all_templates = dictionary.new_dictionary((SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject ordered_templates = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = template_topic_templates(topic);
        SubLObject template = (SubLObject)formula_templates.NIL;
        template = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(all_templates, formula_template_id(template), template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        ordered_templates = formula_template_organize_by_ordering(all_templates, ordering, (SubLObject)formula_templates.$sym343$STABLE_TEMPLATE_ID_COMPARE);
        _csetf_template_topic_templates(topic, ordered_templates);
        return ordered_templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 74949L)
    public static SubLObject formula_template_organize_subtopics_by_ordering(final SubLObject topic) {
        final SubLObject ordering = template_topic_ordering(topic);
        final SubLObject all_subtopics = dictionary.new_dictionary((SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject ordered_subtopics = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = template_topic_subtopics(topic);
        SubLObject subtopic = (SubLObject)formula_templates.NIL;
        subtopic = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(all_subtopics, template_topic_topic(subtopic), subtopic);
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        }
        ordered_subtopics = formula_template_organize_by_ordering(all_subtopics, ordering, (SubLObject)formula_templates.$sym343$STABLE_TEMPLATE_ID_COMPARE);
        _csetf_template_topic_subtopics(topic, ordered_subtopics);
        return ordered_subtopics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 75615L)
    public static SubLObject formula_template_organize_by_ordering(final SubLObject all_items, final SubLObject ordering, final SubLObject sortfn) {
        SubLObject ordered_items = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = ordering;
        SubLObject id_in_order = (SubLObject)formula_templates.NIL;
        id_in_order = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject item = dictionary.dictionary_lookup(all_items, id_in_order, (SubLObject)formula_templates.UNPROVIDED);
            if (formula_templates.NIL != item) {
                ordered_items = (SubLObject)ConsesLow.cons(item, ordered_items);
                dictionary.dictionary_remove(all_items, id_in_order);
            }
            cdolist_list_var = cdolist_list_var.rest();
            id_in_order = cdolist_list_var.first();
        }
        final SubLObject keys = dictionary.dictionary_keys(all_items);
        SubLObject cdolist_list_var2 = Sort.sort(keys, sortfn, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject key = (SubLObject)formula_templates.NIL;
        key = cdolist_list_var2.first();
        while (formula_templates.NIL != cdolist_list_var2) {
            final SubLObject item2 = dictionary.dictionary_lookup(all_items, key, (SubLObject)formula_templates.UNPROVIDED);
            ordered_items = (SubLObject)ConsesLow.cons(item2, ordered_items);
            cdolist_list_var2 = cdolist_list_var2.rest();
            key = cdolist_list_var2.first();
        }
        return Sequences.nreverse(ordered_items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 76257L)
    public static SubLObject stable_template_id_compare(final SubLObject id_a, final SubLObject id_b) {
        return kb_utilities.term_L(id_a, id_b, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 76341L)
    public static SubLObject formula_template_load_template_graph(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert formula_templates.NIL != forts.fort_p(topic) : topic;
        assert formula_templates.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject start_topic = new_template_topic(topic, (SubLObject)formula_templates.UNPROVIDED);
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
                        final SubLObject seen = set.new_set(Symbols.symbol_function((SubLObject)formula_templates.EQL), (SubLObject)formula_templates.UNPROVIDED);
                        final SubLObject todo = queues.create_queue((SubLObject)formula_templates.UNPROVIDED);
                        queues.enqueue(start_topic, todo);
                        set.set_add(start_topic, seen);
                        while (formula_templates.NIL == queues.queue_empty_p(todo)) {
                            SubLObject current_topic = (SubLObject)formula_templates.NIL;
                            SubLObject children = (SubLObject)formula_templates.NIL;
                            current_topic = queues.dequeue(todo);
                            final SubLObject current = template_topic_topic(current_topic);
                            final SubLObject candidates = formula_template_subtopics_for_type(current, elmt);
                            formula_template_topic_load_topic_specifics(current_topic, elmt);
                            if (formula_templates.NIL == candidates) {
                                SubLObject cdolist_list_var;
                                final SubLObject template_ids = cdolist_list_var = asserted_formula_template_ids_for_type(current, elmt);
                                SubLObject template_id = (SubLObject)formula_templates.NIL;
                                template_id = cdolist_list_var.first();
                                while (formula_templates.NIL != cdolist_list_var) {
                                    final SubLObject ftemplate = new_formula_template(template_id, current_topic);
                                    formula_template_load_topic_template_details(current, ftemplate, elmt);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    template_id = cdolist_list_var.first();
                                }
                                formula_template_organize_templates_by_ordering(current_topic);
                            }
                            else {
                                SubLObject subtopics = (SubLObject)formula_templates.NIL;
                                SubLObject cdolist_list_var = candidates;
                                SubLObject candidate = (SubLObject)formula_templates.NIL;
                                candidate = cdolist_list_var.first();
                                while (formula_templates.NIL != cdolist_list_var) {
                                    final SubLObject candidate_has_subtopicsP = fet_topic_fort_has_subtopicsP(candidate, elmt);
                                    final SubLObject subtopic = new_template_topic(candidate, current_topic);
                                    if (formula_templates.NIL == formula_template_utilities.$assume_induced_fet_templates_already_reifiedP$.getDynamicValue(thread) && formula_templates.NIL != formula_template_utilities.induction_topic_typeP(candidate) && formula_templates.NIL == candidate_has_subtopicsP && formula_templates.NIL == fet_topic_fort_has_templatesP(candidate, elmt)) {
                                        final SubLObject focal_term_type = formula_template_utilities.focal_term_type_for_induced_template_type(candidate, elmt);
                                        final SubLObject induction_mt = formula_template_induction_mt(focal_term_type, elmt);
                                        formula_template_utilities.induced_formula_template_forts_for_focal_term_type(focal_term_type, induction_mt, candidate);
                                    }
                                    if (formula_templates.NIL != candidate_has_subtopicsP || formula_templates.NIL != fet_topic_fort_has_templatesP(candidate, elmt)) {
                                        template_topic_add_subtopic(current_topic, subtopic);
                                        subtopics = (SubLObject)ConsesLow.cons(subtopic, subtopics);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    candidate = cdolist_list_var.first();
                                }
                                children = subtopics;
                                formula_template_organize_subtopics_by_ordering(current_topic);
                            }
                            SubLObject cdolist_list_var2 = children;
                            SubLObject child = (SubLObject)formula_templates.NIL;
                            child = cdolist_list_var2.first();
                            while (formula_templates.NIL != cdolist_list_var2) {
                                if (formula_templates.NIL == set.set_memberP(child, seen)) {
                                    set.set_add(child, seen);
                                    queues.enqueue(child, todo);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                child = cdolist_list_var2.first();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$279 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (formula_templates.NIL == reusedP && formula_templates.NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP()) {
                                formula_template_vars.destroy_template_topic_problem_store((SubLObject)formula_templates.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$279, thread);
                        }
                    }
                }
                finally {
                    formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0_$278, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$280 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (formula_templates.NIL == reuse_existingP) {
                        rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$280, thread);
                }
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        validate_template_topic_semantic_constraints(start_topic);
        return start_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 78824L)
    public static SubLObject validate_template_topic_semantic_constraints(final SubLObject template_topic) {
        template_topic_query_mt_can_see_all_assertion_mts(template_topic);
        return template_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 79107L)
    public static SubLObject template_topic_query_mt_can_see_all_assertion_mts(final SubLObject template_topic) {
        final SubLObject query_mt = template_topic_query_mt(template_topic);
        SubLObject cdolist_list_var = template_topic_subtopics(template_topic);
        SubLObject subtopic = (SubLObject)formula_templates.NIL;
        subtopic = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            check_template_topic_query_mt_can_see_subtopics_assertion_mts(subtopic, query_mt);
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        }
        return template_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 79436L)
    public static SubLObject check_template_topic_query_mt_can_see_subtopics_assertion_mts(final SubLObject subtopic, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula_templates.NIL == template_topic_subtopics(subtopic)) {
            SubLObject cdolist_list_var = template_topic_templates(subtopic);
            SubLObject ftemplate = (SubLObject)formula_templates.NIL;
            ftemplate = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                final SubLObject elmt = formula_template_elmt(ftemplate);
                SubLObject visibleP = (SubLObject)formula_templates.NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(query_mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    visibleP = mt_relevance_macros.relevant_mtP(elmt);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (formula_templates.NIL == visibleP) {
                    Functions.funcall((SubLObject)((formula_templates.NIL != formula_templates.$warn_on_template_topic_validation_only$.getGlobalValue()) ? formula_templates.$sym344$WARN : formula_templates.$sym345$ERROR), (SubLObject)formula_templates.$str346$Invalid_formula_template__A_in_to, formula_template_id(ftemplate), template_topic_topic(subtopic), query_mt, elmt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ftemplate = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = template_topic_subtopics(subtopic);
            SubLObject subsubtopic = (SubLObject)formula_templates.NIL;
            subsubtopic = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                check_template_topic_query_mt_can_see_subtopics_assertion_mts(subsubtopic, query_mt);
                cdolist_list_var = cdolist_list_var.rest();
                subsubtopic = cdolist_list_var.first();
            }
        }
        return subtopic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 80373L)
    public static SubLObject templates_use_isaXgenlsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL == constants_high.find_constant((SubLObject)formula_templates.$str347$FactivoreTab) || formula_templates.NIL == isa.isaP(formula_templates.$const348$FormulaTemplateTopicType, formula_templates.$const349$FirstOrderCollection, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 80534L)
    public static SubLObject asserted_formula_template_ids_for_type(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = isa.instances(topic, elmt, (SubLObject)formula_templates.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            ans = ftemplate_ask_variable((SubLObject)formula_templates.$sym350$_TEMPLATE, (SubLObject)ConsesLow.list(formula_templates.$const304$assertedSentence, (SubLObject)ConsesLow.list(formula_templates.$const351$formulaTemplateHasType, (SubLObject)formula_templates.$sym350$_TEMPLATE, topic)), elmt, (SubLObject)formula_templates.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 80946L)
    public static SubLObject sort_formula_template_subtopics_by_template_count(final SubLObject subtopics, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)formula_templates.NIL;
        final SubLObject _prev_bind_0 = formula_templates.$template_count_mt$.currentBinding(thread);
        try {
            formula_templates.$template_count_mt$.bind(elmt, thread);
            ans = Sort.sort(subtopics, Symbols.symbol_function((SubLObject)formula_templates.$sym353$_), (SubLObject)formula_templates.$sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE);
        }
        finally {
            formula_templates.$template_count_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 81185L)
    public static SubLObject count_asserted_formula_template_ids_for_type_internal(final SubLObject topic, SubLObject elmt) {
        if (elmt == formula_templates.UNPROVIDED) {
            elmt = formula_templates.$template_count_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = isa.count_all_instances(topic, elmt, (SubLObject)formula_templates.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            ans = Sequences.length(asserted_formula_template_ids_for_type(topic, elmt));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 81185L)
    public static SubLObject count_asserted_formula_template_ids_for_type(final SubLObject topic, SubLObject elmt) {
        if (elmt == formula_templates.UNPROVIDED) {
            elmt = formula_templates.$template_count_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL == v_memoization_state) {
            return count_asserted_formula_template_ids_for_type_internal(topic, elmt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)formula_templates.$sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE, (SubLObject)formula_templates.UNPROVIDED);
        if (formula_templates.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)formula_templates.$sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE, (SubLObject)formula_templates.TWO_INTEGER, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.EQL, (SubLObject)formula_templates.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)formula_templates.$sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(topic, elmt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)formula_templates.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)formula_templates.NIL;
            collision = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (topic.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula_templates.NIL != cached_args && formula_templates.NIL == cached_args.rest() && elmt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(count_asserted_formula_template_ids_for_type_internal(topic, elmt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(topic, elmt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 81540L)
    public static SubLObject fet_topic_fort_has_subtopicsP(final SubLObject topic, final SubLObject elmt) {
        return list_utilities.sublisp_boolean(formula_template_subtopics_for_type(topic, elmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 81670L)
    public static SubLObject fet_topic_fort_has_templatesP(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = list_utilities.sublisp_boolean(isa.all_fort_instances(topic, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        return list_utilities.sublisp_boolean(ftemplate_ask_variable((SubLObject)formula_templates.$sym350$_TEMPLATE, (SubLObject)ConsesLow.list(formula_templates.$const351$formulaTemplateHasType, (SubLObject)formula_templates.$sym350$_TEMPLATE, topic), elmt, (SubLObject)formula_templates.$list355));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 82031L)
    public static SubLObject formula_template_subtopics_for_type(final SubLObject topic, final SubLObject elmt) {
        if (formula_templates.NIL != formula_template_utilities.induction_topic_typeP(topic) && formula_templates.NIL == formula_template_asserted_subtopics_for_type(topic, elmt)) {
            formula_template_utilities.induce_formula_template_subtopics_for_type(topic, elmt);
        }
        return formula_template_asserted_subtopics_for_type(topic, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 82412L)
    public static SubLObject formula_template_asserted_subtopics_for_type(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subtopics = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                subtopics = genls.specs(topic, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            subtopics = ftemplate_ask_variable((SubLObject)formula_templates.$sym356$_SUBTOPIC, (SubLObject)ConsesLow.list(formula_templates.$const340$formulaTemplateTypeHasTopicType, (SubLObject)formula_templates.$sym356$_SUBTOPIC, topic), elmt, (SubLObject)formula_templates.UNPROVIDED);
        }
        return subtopics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 82768L)
    public static SubLObject asserted_formula_template_subtopics_for_type(final SubLObject topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subtopics = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != templates_use_isaXgenlsP()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                subtopics = genls.specs(topic, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            subtopics = ftemplate_ask_variable((SubLObject)formula_templates.$sym356$_SUBTOPIC, (SubLObject)ConsesLow.list(formula_templates.$const304$assertedSentence, (SubLObject)ConsesLow.list(formula_templates.$const340$formulaTemplateTypeHasTopicType, (SubLObject)formula_templates.$sym356$_SUBTOPIC, topic)), elmt, (SubLObject)formula_templates.UNPROVIDED);
        }
        return subtopics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 83160L)
    public static SubLObject formula_template_induction_mt(final SubLObject topic, final SubLObject elmt) {
        return formula_templates.$const352$InferencePSC;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 83661L)
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
        if (formula_templates.NIL != forts.fort_p(introductory)) {
            template_topic_set_introductory_template(template_topic, introductory);
        }
        final SubLObject v_sources = topictmplt_get_topic_template_source_types(current, elmt);
        if (formula_templates.NIL != list_utilities.list_of_type_p(Symbols.symbol_function((SubLObject)formula_templates.$sym364$FORT_OR_NAUT_P), v_sources)) {
            template_topic_set_source_types(template_topic, v_sources);
        }
        _csetf_template_topic_ordering(template_topic, (formula_templates.NIL != template_topic_supertopic(template_topic)) ? formula_template_load_topic_template_ordering(current, elmt) : formula_template_load_topic_subtopic_ordering(current, elmt));
        _csetf_template_topic_query_mt(template_topic, topictmplt_get_topic_template_query_mt(current, elmt));
        _csetf_template_topic_definitional_mt(template_topic, topictmplt_get_topic_template_definitional_mt(current, elmt));
        _csetf_template_topic_source_mt(template_topic, elmt);
        return template_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 85149L)
    public static SubLObject topictmplt_get_topic_template_source_types(final SubLObject topic, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject template_id = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        return ftemplate_get_asserted_values(template_id, topic, formula_templates.$const365$sourcesForTopic, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 85541L)
    public static SubLObject ftemplate_topic_get_functional_slot_value(final SubLObject topic_id, final SubLObject predicate, final SubLObject elmt) {
        final SubLObject template_id_argnum = (SubLObject)formula_templates.NIL;
        final SubLObject template_id = (SubLObject)formula_templates.NIL;
        final SubLObject topic_id_argnum = (SubLObject)formula_templates.ONE_INTEGER;
        final SubLObject answer_argnums = (SubLObject)formula_templates.$list284;
        final SubLObject allow_genl_topicsP = (SubLObject)formula_templates.NIL;
        return ftemplate_get_first_asserted_value(template_id, topic_id, predicate, elmt, template_id_argnum, topic_id_argnum, answer_argnums, allow_genl_topicsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 85999L)
    public static SubLObject topictmplt_get_topic_template_introductory_template(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, formula_templates.$const366$focalTermIntroduction, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 86169L)
    public static SubLObject topictmplt_get_topic_template_title(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, formula_templates.$const367$titleForFormulaTemplateType_Strin, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 86336L)
    public static SubLObject topictmplt_get_topic_template_term_prefix(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, formula_templates.$const368$templateTopicPrefix, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 86494L)
    public static SubLObject topictmplt_get_topic_template_query_mt(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, formula_templates.$const369$queryMtForTopicAssertions, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 86657L)
    public static SubLObject topictmplt_get_topic_template_definitional_mt(final SubLObject topic, final SubLObject elmt) {
        return ftemplate_topic_get_functional_slot_value(topic, formula_templates.$const370$definitionalMtForTopicAssertions, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 86834L)
    public static SubLObject ftemplate_ask_variable(final SubLObject variable, final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == formula_templates.UNPROVIDED) {
            v_properties = (SubLObject)formula_templates.NIL;
        }
        final SubLObject all_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw307$PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
        return ask_utilities.query_variable(variable, sentence, mt, all_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 87151L)
    public static SubLObject ftemplate_ask_template(final SubLObject template, final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == formula_templates.UNPROVIDED) {
            v_properties = (SubLObject)formula_templates.NIL;
        }
        final SubLObject all_properties = conses_high.putf(v_properties, (SubLObject)formula_templates.$kw307$PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
        return ask_utilities.query_template(template, sentence, mt, all_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 87395L)
    public static SubLObject get_editable_and_non_editable_assertions_for_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)formula_templates.NIL;
        SubLObject non_editables = (SubLObject)formula_templates.NIL;
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = formula_template_vars.$template_topic_problem_store$.currentBinding(thread);
        try {
            formula_template_vars.$template_topic_problem_store$.bind(formula_template_vars.find_or_create_template_topic_problem_store(), thread);
            final SubLObject reusedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                final SubLObject query_mt = template_topic_query_mt(template_topic);
                final SubLObject non_editable = compute_non_editable_assertions_for_template_topic_instance(focal_term, template_topic_topic(template_topic), elmt, query_mt);
                final SubLObject _prev_bind_0_$281 = formula_templates.$non_editable_assertions_for_template_topic_instance$.currentBinding(thread);
                try {
                    formula_templates.$non_editable_assertions_for_template_topic_instance$.bind(non_editable, thread);
                    assert formula_templates.NIL != set.set_p(non_editable) : non_editable;
                    results = get_assertions_for_template_topic_instance_int(focal_term, template_topic, elmt, query_mt);
                    non_editables = get_non_editable_assertions_for_template_topic_instance();
                }
                finally {
                    formula_templates.$non_editable_assertions_for_template_topic_instance$.rebind(_prev_bind_0_$281, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$282 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (formula_templates.NIL == reusedP && formula_templates.NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP()) {
                        formula_template_vars.destroy_template_topic_problem_store((SubLObject)formula_templates.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$282, thread);
                }
            }
        }
        finally {
            formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0, thread);
        }
        return Values.values(results, non_editables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 88469L)
    public static SubLObject get_assertions_for_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = get_editable_and_non_editable_assertions_for_template_topic_instance(focal_term, template_topic, elmt);
        final SubLObject non_editables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 88906L)
    public static SubLObject get_assertions_for_template_topic_instance_int(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt, final SubLObject query_mt) {
        SubLObject results = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = template_topic_subtopics(template_topic);
        SubLObject subtopic = (SubLObject)formula_templates.NIL;
        subtopic = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject sub_results = (SubLObject)formula_templates.NIL;
            if (formula_templates.NIL == template_topic_templates(subtopic)) {
                sub_results = get_assertions_for_template_topic_instance_int(focal_term, subtopic, elmt, query_mt);
            }
            else {
                sub_results = get_assertions_for_leaf_template_topic_instance(focal_term, subtopic, elmt, query_mt);
            }
            if (formula_templates.NIL != sub_results) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(template_topic_topic(subtopic), sub_results), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subtopic = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 90378L)
    public static SubLObject xml_template_topic_assertions_current_revision() {
        return formula_templates.$xml_template_topic_assertions_revisions$.getGlobalValue().first().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 90512L)
    public static SubLObject xml_serialize_assertions_for_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject template_elmt, final SubLObject assertions_elmt, final SubLObject results, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str373$knownAssertionsForTemplateTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
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
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str184$templateTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$286 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$287 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$290 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(template_topic_topic(template_topic));
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$290, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$287, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$286, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$286, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$285, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$287 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str184$templateTopic);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$287, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$288 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$288 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str374$queryELMt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$289 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$289 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$291 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(assertions_elmt);
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$291, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$289, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$289, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$288, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$288, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$290 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str374$queryELMt);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$290, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$291 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$290 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str375$templateInstance, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$292 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$291 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$292 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(focal_term);
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$292, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$291, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$292, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$290, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$291, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$293 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str375$templateInstance);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$293, thread);
                            }
                        }
                        if (formula_templates.NIL == formula_templates.$xml_suppress_future_template_extensions$.getDynamicValue(thread)) {
                            try {
                                final SubLObject _prev_bind_0_$294 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$292 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str376$templateTopicAssertionsRevision, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$295 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$293 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$293 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        cycml.cycml_serialize_number(xml_template_topic_assertions_current_revision(), (SubLObject)formula_templates.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$293, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$293, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$295, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$292, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$294, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$296 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str376$templateTopicAssertionsRevision);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$297 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$294 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str377$knownAssertionsForTemplateSubTopi, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$298 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$295 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$294 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    SubLObject cdolist_list_var = results;
                                    SubLObject subtopic_results = (SubLObject)formula_templates.NIL;
                                    subtopic_results = cdolist_list_var.first();
                                    while (formula_templates.NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = subtopic_results;
                                        SubLObject subtopic_id = (SubLObject)formula_templates.NIL;
                                        SubLObject template_result_sets = (SubLObject)formula_templates.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list378);
                                        subtopic_id = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list378);
                                        template_result_sets = current.first();
                                        current = current.rest();
                                        if (formula_templates.NIL == current) {
                                            try {
                                                final SubLObject _prev_bind_0_$299 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$296 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str379$knownAssertionsForTemplateSubTopi, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
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
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str192$subTopic, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                                final SubLObject _prev_bind_0_$302 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$299 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$296 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    cycml.cycml_serialize_term(subtopic_id);
                                                                }
                                                                finally {
                                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$296, thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$299, thread);
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$302, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$298, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$301, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$303 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str192$subTopic);
                                                                Values.restoreValuesFromVector(_values5);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$303, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$304 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$300 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str380$knownAssertionsForFormulaTemplate, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                                final SubLObject _prev_bind_0_$305 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$301 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$297 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                    SubLObject cdolist_list_var_$331 = template_result_sets;
                                                                    SubLObject template_results = (SubLObject)formula_templates.NIL;
                                                                    template_results = cdolist_list_var_$331.first();
                                                                    while (formula_templates.NIL != cdolist_list_var_$331) {
                                                                        SubLObject current_$333;
                                                                        final SubLObject datum_$332 = current_$333 = template_results;
                                                                        SubLObject template_id = (SubLObject)formula_templates.NIL;
                                                                        SubLObject assertions = (SubLObject)formula_templates.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current_$333, datum_$332, (SubLObject)formula_templates.$list381);
                                                                        template_id = current_$333.first();
                                                                        current_$333 = current_$333.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current_$333, datum_$332, (SubLObject)formula_templates.$list381);
                                                                        assertions = current_$333.first();
                                                                        current_$333 = current_$333.rest();
                                                                        if (formula_templates.NIL == current_$333) {
                                                                            xml_serialize_assertions_for_formula_template_instance(focal_term, template_id, assertions, (SubLObject)formula_templates.UNPROVIDED);
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum_$332, (SubLObject)formula_templates.$list381);
                                                                        }
                                                                        cdolist_list_var_$331 = cdolist_list_var_$331.rest();
                                                                        template_results = cdolist_list_var_$331.first();
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$297, thread);
                                                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$301, thread);
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$305, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$300, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$304, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$306 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                                final SubLObject _values6 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str380$knownAssertionsForFormulaTemplate);
                                                                Values.restoreValuesFromVector(_values6);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$306, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$295, thread);
                                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$297, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$300, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$296, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$299, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$307 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                    final SubLObject _values7 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str379$knownAssertionsForTemplateSubTopi);
                                                    Values.restoreValuesFromVector(_values7);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$307, thread);
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list378);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        subtopic_results = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$294, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$295, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$298, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$294, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$297, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$308 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str377$knownAssertionsForTemplateSubTopi);
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$308, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$285, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$284, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$283, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$309 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values9 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str373$knownAssertionsForTemplateTopic);
                    Values.restoreValuesFromVector(_values9);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$309, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return template_topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 92160L)
    public static SubLObject xml_serialize_assertions_for_formula_template_instance(final SubLObject focal_term, final SubLObject template_id, final SubLObject assertions, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str382$knownAssertionsForFormulaTemplate, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
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
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str383$assertionsMatchTemplate, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$341 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$342 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$345 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    cycml.cycml_serialize_term(template_id);
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$345, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$342, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$341, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$341, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$340, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$342 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str383$assertionsMatchTemplate);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$342, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$343 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$343 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str384$knownAssertions, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                final SubLObject _prev_bind_0_$344 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$344 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$346 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                    xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    SubLObject cdolist_list_var = assertions;
                                    SubLObject assertion = (SubLObject)formula_templates.NIL;
                                    assertion = cdolist_list_var.first();
                                    while (formula_templates.NIL != cdolist_list_var) {
                                        final SubLObject error_message = xml_serialize_assertion_for_formula_template_instance(focal_term, assertion, stream);
                                        if (error_message.isString()) {
                                            Errors.error(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)formula_templates.$str385$Problem_serializing_assertions_fo, format_nil.format_nil_a_no_copy(template_id)), error_message));
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$346, thread);
                                    xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$344, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$344, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$343, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$343, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$345 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str384$knownAssertions);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$345, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$340, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$339, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$338, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$346 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str382$knownAssertionsForFormulaTemplate);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$346, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return template_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 92926L)
    public static SubLObject ftemplate_assertion_non_editableP(final SubLObject assertion, final SubLObject focal_term) {
        SubLObject non_editableP = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != assertion_handles.assertion_p(assertion)) {
            non_editableP = (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL != assertions_high.deduced_assertionP(assertion) || formula_templates.NIL != is_non_editable_assertion_for_template_topic_instanceP(assertion));
        }
        else if (formula_templates.NIL != ftemplate_polycanonicalized_assertion_p(assertion)) {
            non_editableP = list_utilities.sublisp_boolean(list_utilities.find_if_not((SubLObject)formula_templates.$sym386$ASSERTED_ASSERTION_, ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        }
        else {
            non_editableP = (SubLObject)formula_templates.NIL;
        }
        return non_editableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 93490L)
    public static SubLObject xml_serialize_assertion_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject polycanonicalizedP = ftemplate_polycanonicalized_assertion_p(assertion);
        final SubLObject unknown_typeP = (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL == polycanonicalizedP && formula_templates.NIL == assertion_handles.assertion_p(assertion));
        final SubLObject error_message = (SubLObject)((formula_templates.NIL != unknown_typeP) ? Sequences.cconcatenate((SubLObject)formula_templates.$str387$Invalid_return_object_, new SubLObject[] { format_nil.format_nil_a_no_copy(assertion), formula_templates.$str388$_in_assertion_list }) : formula_templates.NIL);
        final SubLObject non_editableP = (SubLObject)((formula_templates.NIL != error_message) ? formula_templates.NIL : ftemplate_assertion_non_editableP(assertion, focal_term));
        if (!error_message.isString()) {
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str389$knownAssertion, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$354 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$355 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        if (formula_templates.NIL != non_editableP) {
                            try {
                                final SubLObject _prev_bind_0_$355 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$356 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str390$deducedAssertion, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.$kw228$ATOMIC, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                    final SubLObject _prev_bind_0_$356 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$357 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$360 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                    }
                                    finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$360, thread);
                                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$357, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$356, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$356, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$355, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$357 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$357, thread);
                                }
                            }
                        }
                        xml_serialize_assertion_sentence_for_formula_template_instance(assertion, polycanonicalizedP, stream);
                        xml_serialize_assertion_elmt_for_formula_template_instance(assertion, polycanonicalizedP, stream);
                        if (formula_templates.NIL == formula_templates.$xml_suppress_future_template_extensions$.getDynamicValue(thread)) {
                            xml_serialize_assertion_suids_for_formula_template_instance(focal_term, assertion, polycanonicalizedP, stream);
                            xml_serialize_assertion_timestamp_for_formula_template_instance(focal_term, assertion, polycanonicalizedP, stream);
                            xml_serialize_assertion_evaluation_data_for_formula_template_instance(focal_term, assertion, polycanonicalizedP, stream);
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$355, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$354, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str389$knownAssertion);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return error_message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 94933L)
    public static SubLObject xml_serialize_assertion_sentence_for_formula_template_instance(final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            if (formula_templates.NIL != polycanonicalizedP) {
                cycml.cycml_serialize_sentence(ftemplate_polycanonicalized_assertion_sentence(assertion));
            }
            else {
                cycml.cycml_serialize_sentence(uncanonicalizer.assertion_el_formula(assertion));
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 95294L)
    public static SubLObject xml_serialize_assertion_suids_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$362 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str391$knownAssertionSUIDs, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$363 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$364 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        SubLObject cdolist_list_var;
                        final SubLObject suids = cdolist_list_var = (SubLObject)((formula_templates.NIL != polycanonicalizedP) ? ftemplate_polycanonicalized_assertion_suids(focal_term, assertion) : ConsesLow.list(assertion_handles.assertion_id(assertion)));
                        SubLObject suid = (SubLObject)formula_templates.NIL;
                        suid = cdolist_list_var.first();
                        while (formula_templates.NIL != cdolist_list_var) {
                            if (suid.isInteger()) {
                                cycml.cycml_serialize_assertion_id(suid, (SubLObject)formula_templates.UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            suid = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$364, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$363, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$362, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$364 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str391$knownAssertionSUIDs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$364, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 95787L)
    public static SubLObject ftemplate_polycanonicalized_assertion_suids(final SubLObject focal_term, final SubLObject assertion) {
        SubLObject suids = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term);
        SubLObject hl_assertion = (SubLObject)formula_templates.NIL;
        hl_assertion = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            suids = (SubLObject)ConsesLow.cons(assertion_handles.assertion_id(hl_assertion), suids);
            cdolist_list_var = cdolist_list_var.rest();
            hl_assertion = cdolist_list_var.first();
        }
        return suids;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 96192L)
    public static SubLObject xml_serialize_assertion_evaluation_data_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$366 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str392$knownAssertionEvaluations, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$367 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$368 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        SubLObject cdolist_list_var = ftemplate_assertion_evaluations(focal_term, assertion, polycanonicalizedP);
                        SubLObject evaluation_data = (SubLObject)formula_templates.NIL;
                        evaluation_data = cdolist_list_var.first();
                        while (formula_templates.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = evaluation_data;
                            SubLObject evaluation = (SubLObject)formula_templates.NIL;
                            SubLObject evaluator = (SubLObject)formula_templates.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list393);
                            evaluation = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list393);
                            evaluator = current.first();
                            current = current.rest();
                            if (formula_templates.NIL == current) {
                                final SubLObject judgment = ftemplate_evaluation_judgment(evaluation);
                                Label_1839: {
                                    if (formula_templates.NIL == evaluation) {
                                        if (formula_templates.NIL == judgment) {
                                            break Label_1839;
                                        }
                                    }
                                    try {
                                        final SubLObject _prev_bind_0_$368 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$369 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str394$knownAssertionEvaluation, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                            final SubLObject _prev_bind_0_$369 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$370 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$373 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                if (formula_templates.NIL != evaluator) {
                                                    try {
                                                        final SubLObject _prev_bind_0_$370 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$371 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str395$evaluator, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                            final SubLObject _prev_bind_0_$371 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$372 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$374 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                cycml.cycml_serialize_term(evaluator);
                                                            }
                                                            finally {
                                                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$374, thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$372, thread);
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$371, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$371, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$370, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$372 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str395$evaluator);
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$372, thread);
                                                        }
                                                    }
                                                }
                                                if (formula_templates.NIL != judgment) {
                                                    try {
                                                        final SubLObject _prev_bind_0_$373 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$373 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str396$judgment, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                                                            final SubLObject _prev_bind_0_$374 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$374 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$375 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                                                                cycml.cycml_serialize_term(judgment);
                                                            }
                                                            finally {
                                                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$375, thread);
                                                                xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$374, thread);
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$374, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$373, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$373, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$375 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                                            final SubLObject _values2 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str396$judgment);
                                                            Values.restoreValuesFromVector(_values2);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$375, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_2_$373, thread);
                                                xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$370, thread);
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$369, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$369, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$368, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$376 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str394$knownAssertionEvaluation);
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$376, thread);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)formula_templates.$list393);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            evaluation_data = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$368, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$367, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$366, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$377 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str392$knownAssertionEvaluations);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$377, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 97052L)
    public static SubLObject quaternary_fet_evaluation_pred() {
        SubLObject pred = formula_templates.$quaternary_fet_evaluation_pred$.getGlobalValue();
        if (formula_templates.NIL == pred) {
            pred = constants_high.find_constant((SubLObject)formula_templates.$str397$evaluationOfAssertionByOn);
            if (formula_templates.NIL == pred) {
                pred = constants_high.find_constant((SubLObject)formula_templates.$str398$evaluationOfAssertionOfByOn);
            }
            formula_templates.$quaternary_fet_evaluation_pred$.setGlobalValue(pred);
        }
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 97428L)
    public static SubLObject ftemplate_assertion_evaluations(final SubLObject focal_term, SubLObject assertion, final SubLObject polycanonicalizedP) {
        SubLObject evaluations = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != polycanonicalizedP) {
            assertion = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term).first();
        }
        if (formula_templates.NIL != assertion && formula_templates.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            final SubLObject pred = quaternary_fet_evaluation_pred();
            final SubLObject mt = formula_templates.$const352$InferencePSC;
            evaluations = ftemplate_ask_template((SubLObject)formula_templates.$list399, (SubLObject)ConsesLow.list(formula_templates.$const304$assertedSentence, (SubLObject)ConsesLow.listS(pred, (SubLObject)formula_templates.$sym400$_EVAL, assertion, (SubLObject)formula_templates.$list401)), mt, (SubLObject)formula_templates.$list402);
        }
        return evaluations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 98119L)
    public static SubLObject ftemplate_evaluation_judgment(final SubLObject evaluation) {
        return ftemplate_ask_variable((SubLObject)formula_templates.$sym403$_JUDGMENT, (SubLObject)ConsesLow.list(formula_templates.$const304$assertedSentence, (SubLObject)ConsesLow.listS(formula_templates.$const404$evaluationOutputSentences, evaluation, (SubLObject)formula_templates.$list405)), formula_templates.$const352$InferencePSC, (SubLObject)formula_templates.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 98365L)
    public static SubLObject xml_serialize_assertion_timestamp_for_formula_template_instance(final SubLObject focal_term, final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date = (formula_templates.NIL != polycanonicalizedP) ? ftemplate_polycanonicalized_assertion_date(focal_term, assertion) : assertions_high.asserted_when(assertion);
        final SubLObject second = (formula_templates.NIL != polycanonicalizedP) ? ftemplate_polycanonicalized_assertion_second(focal_term, assertion) : assertions_high.asserted_second(assertion);
        final SubLObject cyclist = (SubLObject)formula_templates.NIL;
        final SubLObject image_id = (SubLObject)formula_templates.NIL;
        final SubLObject purpose = (SubLObject)formula_templates.NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            cycml_generator.cycml_serialize_bookkeeping(cyclist, image_id, date, second, purpose);
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 98952L)
    public static SubLObject ftemplate_polycanonicalized_assertion_date(final SubLObject focal_term, final SubLObject assertion) {
        SubLObject date = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL == date) {
            SubLObject csome_list_var;
            SubLObject hl_assertion;
            for (csome_list_var = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term), hl_assertion = (SubLObject)formula_templates.NIL, hl_assertion = csome_list_var.first(); formula_templates.NIL == date && formula_templates.NIL != csome_list_var; date = assertions_high.asserted_when(hl_assertion), csome_list_var = csome_list_var.rest(), hl_assertion = csome_list_var.first()) {}
        }
        return date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 99234L)
    public static SubLObject ftemplate_polycanonicalized_assertion_second(final SubLObject focal_term, final SubLObject assertion) {
        SubLObject date = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL == date) {
            SubLObject csome_list_var;
            SubLObject hl_assertion;
            for (csome_list_var = ftemplate_polycanonicalized_assertion_hl_assertions(assertion, focal_term), hl_assertion = (SubLObject)formula_templates.NIL, hl_assertion = csome_list_var.first(); formula_templates.NIL == date && formula_templates.NIL != csome_list_var; date = assertions_high.asserted_second(hl_assertion), csome_list_var = csome_list_var.rest(), hl_assertion = csome_list_var.first()) {}
        }
        return date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 99519L)
    public static SubLObject xml_serialize_assertion_elmt_for_formula_template_instance(final SubLObject assertion, final SubLObject polycanonicalizedP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            if (formula_templates.NIL != polycanonicalizedP) {
                xml_serialize_elmt_information_for_assertion(ftemplate_polycanonicalized_assertion_mt(assertion), stream);
            }
            else {
                xml_serialize_elmt_information_for_assertion(uncanonicalizer.assertion_elmt(assertion), stream);
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 99921L)
    public static SubLObject xml_serialize_elmt_information_for_assertion(final SubLObject elmt, SubLObject stream) {
        if (stream == formula_templates.UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str406$knownAssertionELMt, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                    final SubLObject _prev_bind_0_$389 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$390 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                        xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                        cycml.cycml_serialize_term(elmt);
                    }
                    finally {
                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_3, thread);
                        xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$390, thread);
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$389, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$388, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$390 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str406$knownAssertionELMt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$390, thread);
                }
            }
            final SubLObject pcw = map_elmt_to_published_conceptual_work(elmt);
            if (formula_templates.NIL != pcw) {
                try {
                    final SubLObject _prev_bind_0_$391 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)formula_templates.$str407$knownAssertionCW, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, xml_vars.formula_template_namespace());
                        final SubLObject _prev_bind_0_$392 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$391 = xml_vars.$cycl_query_include_namespaceP$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.formula_template_namespace(), thread);
                            xml_vars.$cycl_query_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                            xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread), thread);
                            cycml.cycml_serialize_term(pcw);
                        }
                        finally {
                            xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_5, thread);
                            xml_vars.$cycl_query_include_namespaceP$.rebind(_prev_bind_1_$391, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$392, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$391, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$393 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)formula_templates.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)formula_templates.$str407$knownAssertionCW);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$393, thread);
                    }
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return elmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 100441L)
    public static SubLObject clear_map_elmt_to_published_conceptual_work() {
        final SubLObject cs = formula_templates.$map_elmt_to_published_conceptual_work_caching_state$.getGlobalValue();
        if (formula_templates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 100441L)
    public static SubLObject remove_map_elmt_to_published_conceptual_work(final SubLObject elmt) {
        return memoization_state.caching_state_remove_function_results_with_args(formula_templates.$map_elmt_to_published_conceptual_work_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(elmt), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 100441L)
    public static SubLObject map_elmt_to_published_conceptual_work_internal(final SubLObject elmt) {
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)formula_templates.$kw305$MAX_NUMBER, (SubLObject)formula_templates.ONE_INTEGER);
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        return (SubLObject)((formula_templates.NIL != hlmt.hlmt_p(monad_mt)) ? ftemplate_ask_variable((SubLObject)formula_templates.$kw409$PCW, (SubLObject)ConsesLow.list(formula_templates.$const410$contextOfPCW, (SubLObject)formula_templates.$kw409$PCW, monad_mt), formula_templates.$const352$InferencePSC, v_properties).first() : formula_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 100441L)
    public static SubLObject map_elmt_to_published_conceptual_work(final SubLObject elmt) {
        SubLObject caching_state = formula_templates.$map_elmt_to_published_conceptual_work_caching_state$.getGlobalValue();
        if (formula_templates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)formula_templates.$sym408$MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK, (SubLObject)formula_templates.$sym411$_MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK_CACHING_STATE_, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.EQUAL, (SubLObject)formula_templates.ONE_INTEGER, (SubLObject)formula_templates.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, elmt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(map_elmt_to_published_conceptual_work_internal(elmt)));
            memoization_state.caching_state_put(caching_state, elmt, results, (SubLObject)formula_templates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 100788L)
    public static SubLObject get_assertions_for_leaf_template_topic_instance(final SubLObject focal_term, final SubLObject template_topic, final SubLObject elmt, final SubLObject query_mt) {
        SubLObject results = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = template_topic_templates(template_topic);
        SubLObject ftemplate = (SubLObject)formula_templates.NIL;
        ftemplate = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject template_id = formula_template_id(ftemplate);
            final SubLObject assertions = get_assertions_for_formula_template_instance(focal_term, ftemplate, elmt, query_mt);
            if (formula_templates.NIL != assertions) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(template_id, assertions), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ftemplate = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 101747L)
    public static SubLObject get_assertions_for_formula_template_instance(final SubLObject focal_term, final SubLObject ftemplate, SubLObject elmt, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert formula_templates.NIL != forts.fort_p(focal_term) : focal_term;
        assert formula_templates.NIL != formula_template_p(ftemplate) : ftemplate;
        elmt = czer_main.canonicalize_term(elmt, elmt);
        assert formula_templates.NIL != hlmt.hlmt_p(elmt) : elmt;
        SubLObject assertions = (SubLObject)formula_templates.NIL;
        thread.resetMultipleValues();
        final SubLObject assertion_sentence = get_assertion_sentence_and_constraints_from_formula_template(ftemplate, focal_term, elmt);
        final SubLObject constraint_clauses = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject query_sentence = get_assertion_finding_query_sentence(assertion_sentence, constraint_clauses);
        final SubLObject original_query = thread.secondMultipleValue();
        final SubLObject allow_skolemsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (formula_templates.NIL != query_sentence) {
            final SubLObject has_reformulation_specP = formula_template_has_reformulation_specificationP(ftemplate);
            final SubLObject max_number = (SubLObject)((formula_templates.NIL == has_reformulation_specP && formula_templates.NIL != formula_template_is_single_entryP(ftemplate)) ? formula_templates.ONE_INTEGER : formula_templates.NIL);
            final SubLObject result = get_assertions_for_fet_sentence(query_sentence, focal_term, query_mt, max_number, original_query, constraint_clauses, (SubLObject)formula_templates.T, has_reformulation_specP);
            assertions = kb_utilities.sort_terms(result, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.T, (SubLObject)formula_templates.NIL, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 102899L)
    public static SubLObject get_assertions_for_fet_sentence(final SubLObject formula, final SubLObject focal_term, SubLObject query_mt, final SubLObject max_number, final SubLObject original_query, SubLObject constraint_clauses, SubLObject reassemble_polycanonicalized_assertionsP, SubLObject check_reformulatedP) {
        if (constraint_clauses == formula_templates.UNPROVIDED) {
            constraint_clauses = (SubLObject)formula_templates.NIL;
        }
        if (reassemble_polycanonicalized_assertionsP == formula_templates.UNPROVIDED) {
            reassemble_polycanonicalized_assertionsP = (SubLObject)formula_templates.T;
        }
        if (check_reformulatedP == formula_templates.UNPROVIDED) {
            check_reformulatedP = (SubLObject)formula_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_set = (SubLObject)formula_templates.NIL;
        SubLObject default_assertions = (SubLObject)formula_templates.NIL;
        SubLObject reformulated_result_set = (SubLObject)formula_templates.NIL;
        SubLObject reformulated_assertions = (SubLObject)formula_templates.NIL;
        final SubLObject assertion_varP = cycl_utilities.expression_find(fet_assertion_variable_for_formula(original_query), formula, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        if (formula_templates.NIL == cycl_utilities.expression_find(formula_templates.$const414$ist_Intermediate, formula, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED)) {
            final SubLObject enhanced_query_mt = (formula_templates.NIL != hlmt.possibly_mt_p(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread))) ? hlmt_czer.canonicalize_hlmt((SubLObject)ConsesLow.list(formula_templates.$const415$MtUnionFn, formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread), query_mt)) : query_mt;
            result_set = ftemplate_loading_supporting_ask(formula, enhanced_query_mt, max_number, (SubLObject)formula_templates.T);
            default_assertions = get_assertions_from_formula_template_result_sets(original_query, result_set, focal_term, enhanced_query_mt, reassemble_polycanonicalized_assertionsP, assertion_varP);
            if (formula_templates.NIL == result_set && formula_templates.NIL != isa.isaP(query_mt, formula_templates.$const416$RKFInteractionContextMicrotheory, query_mt, (SubLObject)formula_templates.UNPROVIDED)) {
                final SubLObject lexical_mt = get_lexical_mt_for_rkf_interaction_mt(query_mt);
                result_set = ftemplate_loading_supporting_ask(formula, lexical_mt, max_number, (SubLObject)formula_templates.T);
                query_mt = lexical_mt;
            }
            final SubLObject temp_assertions = get_assertions_from_formula_template_result_sets(original_query, result_set, focal_term, query_mt, reassemble_polycanonicalized_assertionsP, assertion_varP);
            if (formula_templates.NIL != temp_assertions) {
                default_assertions = ConsesLow.append(temp_assertions, default_assertions);
            }
        }
        if (formula_templates.NIL != check_reformulatedP) {
            final SubLObject refspec_var = (SubLObject)formula_templates.$sym417$__REFSPEC;
            final SubLObject query = constrain_query_with_accumulated_constraints(constrained_term_finder.generate_note_reformulation_formula((SubLObject)formula_templates.$sym418$__ASSERTION, focal_term, original_query, refspec_var), constraint_clauses);
            reformulated_result_set = ftemplate_loading_supporting_ask(query, ftemplate_reformulated_query_mt(query_mt, original_query), max_number, (SubLObject)formula_templates.T);
            if (formula_templates.NIL == reformulated_result_set && formula_templates.NIL != hlmt.possibly_mt_p(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread)) && formula_templates.NIL != fet_fallback_to_default_mtP(original_query)) {
                reformulated_result_set = ftemplate_loading_supporting_ask(query, ftemplate_reformulated_query_mt(formula_template_vars.$default_assertion_template_elmt$.getDynamicValue(thread), original_query), max_number, (SubLObject)formula_templates.T);
            }
            reformulated_result_set = ftemplate_filter_reformulated_result_set(reformulated_result_set, result_set);
            reformulated_assertions = unpack_note_reformulation_result_sets(original_query, reformulated_result_set, reassemble_polycanonicalized_assertionsP);
        }
        return Sequences.remove_duplicates(conses_high.union(reformulated_assertions, default_assertions, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED), Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 106043L)
    public static SubLObject fet_fallback_to_default_mtP(final SubLObject original_query) {
        return (SubLObject)formula_templates.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 106234L)
    public static SubLObject ftemplate_reformulated_query_mt(final SubLObject query_mt, final SubLObject original_query) {
        return (formula_templates.NIL != el_utilities.el_formula_with_operator_p(original_query, formula_templates.$const414$ist_Intermediate)) ? ftemplate_qualify_mt_to_anytime(query_mt) : query_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 106522L)
    public static SubLObject ftemplate_filter_reformulated_result_set(final SubLObject reformulated_result_set, final SubLObject original_result_set) {
        SubLObject filtered = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = reformulated_result_set;
        SubLObject reformulated_result = (SubLObject)formula_templates.NIL;
        reformulated_result = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            if (formula_templates.NIL == ftemplate_reformulated_result_duplicateP(reformulated_result, original_result_set)) {
                filtered = (SubLObject)ConsesLow.cons(reformulated_result, filtered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            reformulated_result = cdolist_list_var.first();
        }
        return filtered;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 107018L)
    public static SubLObject ftemplate_reformulated_result_duplicateP(final SubLObject reformulated_result, final SubLObject original_result_set) {
        final SubLObject v_bindings = reformulated_result.first();
        final SubLObject assertion = bindings.variable_lookup((SubLObject)formula_templates.$sym418$__ASSERTION, v_bindings);
        SubLObject duplicateP = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != assertion_handles.assertion_p(assertion) && formula_templates.NIL == duplicateP) {
            SubLObject csome_list_var = original_result_set;
            SubLObject original_result = (SubLObject)formula_templates.NIL;
            original_result = csome_list_var.first();
            while (formula_templates.NIL == duplicateP && formula_templates.NIL != csome_list_var) {
                if (formula_templates.NIL == duplicateP) {
                    SubLObject csome_list_var_$396 = conses_high.second(original_result);
                    SubLObject support = (SubLObject)formula_templates.NIL;
                    support = csome_list_var_$396.first();
                    while (formula_templates.NIL == duplicateP && formula_templates.NIL != csome_list_var_$396) {
                        if (support.eql(assertion)) {
                            duplicateP = (SubLObject)formula_templates.T;
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
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 107540L)
    public static SubLObject unpack_note_reformulation_result_sets(final SubLObject original_query, final SubLObject result_set, final SubLObject reassemble_polycanonicalized_assertionsP) {
        SubLObject assertions = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = result_set;
        SubLObject result = (SubLObject)formula_templates.NIL;
        result = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$397 = unpack_note_reformulation_result(original_query, result, reassemble_polycanonicalized_assertionsP);
            SubLObject assertion = (SubLObject)formula_templates.NIL;
            assertion = cdolist_list_var_$397.first();
            while (formula_templates.NIL != cdolist_list_var_$397) {
                if (formula_templates.NIL != assertion_handles.assertion_p(assertion)) {
                    assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                }
                else {
                    assertions = add_one_polycanonicalized_result(assertion, assertions);
                }
                cdolist_list_var_$397 = cdolist_list_var_$397.rest();
                assertion = cdolist_list_var_$397.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Sequences.nreverse(assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 108058L)
    public static SubLObject add_one_polycanonicalized_result(final SubLObject assertion, SubLObject assertions) {
        SubLObject existing = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL == existing) {
            SubLObject csome_list_var = assertions;
            SubLObject other_assertion = (SubLObject)formula_templates.NIL;
            other_assertion = csome_list_var.first();
            while (formula_templates.NIL == existing && formula_templates.NIL != csome_list_var) {
                if (formula_templates.NIL != ftemplate_polycanonicalized_assertion_p(other_assertion) && conses_high.second(other_assertion).equal(conses_high.second(assertion)) && conses_high.third(other_assertion).equal(conses_high.third(assertion))) {
                    existing = other_assertion;
                }
                csome_list_var = csome_list_var.rest();
                other_assertion = csome_list_var.first();
            }
        }
        if (formula_templates.NIL == existing) {
            assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
        }
        else if (!existing.equal(assertion)) {
            ConsesLow.set_nth((SubLObject)formula_templates.THREE_INTEGER, existing, Sequences.delete_duplicates(ConsesLow.nconc(ConsesLow.nth((SubLObject)formula_templates.THREE_INTEGER, assertion), ConsesLow.nth((SubLObject)formula_templates.THREE_INTEGER, existing)), (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 108716L)
    public static SubLObject unpack_note_reformulation_result(final SubLObject original_query, final SubLObject result, final SubLObject reassemble_polycanonicalized_assertionsP) {
        SubLObject assertions = (SubLObject)formula_templates.NIL;
        final SubLObject binding_set = result.first();
        final SubLObject supports = conses_high.second(result);
        SubLObject elmt = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != reassemble_polycanonicalized_assertionsP) {
            final SubLObject bound_formula = bindings.apply_bindings(binding_set, el_utilities.copy_formula(original_query));
            SubLObject hl_assertions = (SubLObject)formula_templates.NIL;
            SubLObject cdolist_list_var = supports;
            SubLObject support = (SubLObject)formula_templates.NIL;
            support = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                if (formula_templates.NIL != assertion_handles.assertion_p(support) && formula_templates.NIL != constrained_term_finder.is_note_reformulation_assertionP(support)) {
                    final SubLObject hl_assertion = assertions_high.gaf_arg1(support);
                    if (formula_templates.NIL != assertion_handles.assertion_p(hl_assertion)) {
                        hl_assertions = (SubLObject)ConsesLow.cons(hl_assertion, hl_assertions);
                        if (formula_templates.NIL == elmt) {
                            elmt = uncanonicalizer.assertion_elmt(support);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            if (formula_templates.NIL != hl_assertions) {
                final SubLObject item_var = make_ftemplate_polycanonicalized_assertion(bound_formula, elmt, hl_assertions);
                if (formula_templates.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)formula_templates.EQUAL), Symbols.symbol_function((SubLObject)formula_templates.IDENTITY))) {
                    assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                }
            }
        }
        else {
            final SubLObject assertion = bindings.variable_lookup((SubLObject)formula_templates.$sym418$__ASSERTION, binding_set);
            if (formula_templates.NIL != assertion_handles.assertion_p(assertion)) {
                final SubLObject item_var2 = assertion;
                if (formula_templates.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)formula_templates.EQL), Symbols.symbol_function((SubLObject)formula_templates.IDENTITY))) {
                    assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                }
            }
        }
        return Sequences.nreverse(assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 109762L)
    public static SubLObject ftemplate_loading_supporting_ask(final SubLObject query, final SubLObject elmt, final SubLObject number, SubLObject indeterminateP) {
        if (indeterminateP == formula_templates.UNPROVIDED) {
            indeterminateP = (SubLObject)formula_templates.NIL;
        }
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters((SubLObject)formula_templates.ZERO_INTEGER, number, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED);
        SubLObject result_set = (SubLObject)formula_templates.NIL;
        query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw419$RESULT_UNIQUENESS, (SubLObject)formula_templates.$kw420$BINDINGS);
        query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw421$PROBABLY_APPROXIMATELY_DONE, (SubLObject)formula_templates.$float422$1_0);
        query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw308$RETURN, (SubLObject)formula_templates.$kw423$BINDINGS_AND_SUPPORTS);
        query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw310$ANSWER_LANGUAGE, (SubLObject)formula_templates.$kw311$HL);
        query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw424$ALLOW_INDETERMINATE_RESULTS_, indeterminateP);
        query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw307$PROBLEM_STORE, formula_template_vars.get_template_topic_problem_store());
        if (formula_templates.NIL != is_ftemplate_loading_supporting_ask_browsableP()) {
            query_properties = conses_high.putf(query_properties, (SubLObject)formula_templates.$kw425$BROWSABLE_, (SubLObject)formula_templates.T);
        }
        result_set = inference_kernel.new_cyc_query(query, elmt, query_properties);
        return result_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 110784L)
    public static SubLObject smarter_find_visible_assertions_cycl(final SubLObject formula, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visible_assertions = (SubLObject)formula_templates.NIL;
        SubLObject all_assertions = (SubLObject)formula_templates.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)formula_templates.$sym313$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(formula_templates.$const312$EverythingPSC, thread);
            all_assertions = czer_meta.find_visible_assertions_cycl(formula, (SubLObject)formula_templates.UNPROVIDED);
        }
        finally {
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
            SubLObject assertion = (SubLObject)formula_templates.NIL;
            assertion = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                if (formula_templates.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))) {
                    visible_assertions = (SubLObject)ConsesLow.cons(assertion, visible_assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
        }
        return visible_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 111275L)
    public static SubLObject get_assertions_from_formula_template_result_sets(final SubLObject formula, final SubLObject result_set, final SubLObject focal_term, final SubLObject elmt, final SubLObject reassemble_polycanonicalized_assertionsP, SubLObject assertion_varP) {
        if (assertion_varP == formula_templates.UNPROVIDED) {
            assertion_varP = (SubLObject)formula_templates.NIL;
        }
        SubLObject assertions = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var = result_set;
        SubLObject result = (SubLObject)formula_templates.NIL;
        result = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            final SubLObject binding_set = result.first();
            final SubLObject supports = conses_high.second(result);
            SubLObject bound_formula = el_utilities.copy_formula(formula);
            final SubLObject discardP = (SubLObject)formula_templates.NIL;
            SubLObject contains_skolemsP = (SubLObject)formula_templates.NIL;
            SubLObject v_skolems = (SubLObject)formula_templates.NIL;
            if (formula_templates.NIL == discardP) {
                SubLObject csome_list_var = binding_set;
                SubLObject binding = (SubLObject)formula_templates.NIL;
                binding = csome_list_var.first();
                while (formula_templates.NIL == discardP && formula_templates.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = binding;
                    SubLObject variable = (SubLObject)formula_templates.NIL;
                    SubLObject v_term = (SubLObject)formula_templates.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)formula_templates.$list426);
                    variable = current.first();
                    current = (v_term = current.rest());
                    if (formula_templates.NIL != is_skolemish_termP(v_term)) {
                        v_skolems = (SubLObject)ConsesLow.cons(v_term, v_skolems);
                        contains_skolemsP = (SubLObject)formula_templates.T;
                    }
                    else {
                        bound_formula = list_utilities.tree_substitute(bound_formula, variable, v_term);
                    }
                    csome_list_var = csome_list_var.rest();
                    binding = csome_list_var.first();
                }
            }
            if (formula_templates.NIL == discardP) {
                if (formula_templates.NIL != reassemble_polycanonicalized_assertionsP && formula_templates.NIL != contains_skolemsP) {
                    SubLObject skolem_elmt = (SubLObject)formula_templates.NIL;
                    SubLObject hl_assertions = (SubLObject)formula_templates.NIL;
                    SubLObject cdolist_list_var_$398 = supports;
                    SubLObject support = (SubLObject)formula_templates.NIL;
                    support = cdolist_list_var_$398.first();
                    while (formula_templates.NIL != cdolist_list_var_$398) {
                        if (formula_templates.NIL != assertion_handles.assertion_p(support)) {
                            hl_assertions = (SubLObject)ConsesLow.cons(support, hl_assertions);
                            if (formula_templates.NIL == skolem_elmt) {
                                SubLObject cdolist_list_var_$399 = v_skolems;
                                SubLObject skolem = (SubLObject)formula_templates.NIL;
                                skolem = cdolist_list_var_$399.first();
                                while (formula_templates.NIL != cdolist_list_var_$399) {
                                    if (formula_templates.NIL != cycl_utilities.expression_find(skolem, support, (SubLObject)formula_templates.T, Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED)) {
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
                    if (formula_templates.NIL == skolem_elmt) {
                        skolem_elmt = elmt;
                    }
                    if (formula_templates.NIL != hl_assertions) {
                        assertions = add_one_polycanonicalized_result(make_ftemplate_polycanonicalized_assertion(bound_formula, skolem_elmt, hl_assertions), assertions);
                    }
                }
                else if (formula_templates.NIL != contains_skolemsP) {
                    SubLObject cdolist_list_var_$400 = supports;
                    SubLObject support2 = (SubLObject)formula_templates.NIL;
                    support2 = cdolist_list_var_$400.first();
                    while (formula_templates.NIL != cdolist_list_var_$400) {
                        if (formula_templates.NIL != assertion_handles.assertion_p(support2)) {
                            assertions = (SubLObject)ConsesLow.cons(support2, assertions);
                        }
                        cdolist_list_var_$400 = cdolist_list_var_$400.rest();
                        support2 = cdolist_list_var_$400.first();
                    }
                }
                else if (formula_templates.NIL != assertion_varP) {
                    final SubLObject assertion = bindings.variable_lookup(fet_assertion_variable_for_formula(formula), binding_set);
                    if (formula_templates.NIL != assertion_handles.assertion_p(assertion)) {
                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                    }
                }
                else {
                    final SubLObject component_assertions = smarter_find_visible_assertions_cycl(bound_formula, elmt);
                    if (formula_templates.NIL != component_assertions) {
                        if (formula_templates.NIL != list_utilities.singletonP(component_assertions)) {
                            final SubLObject item_var = component_assertions.first();
                            if (formula_templates.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)formula_templates.EQUAL), Symbols.symbol_function((SubLObject)formula_templates.IDENTITY))) {
                                assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                            }
                        }
                        else if (formula_templates.NIL != list_utilities.list_of_type_p(Symbols.symbol_function((SubLObject)formula_templates.$sym427$DEDUCED_ASSERTION_), component_assertions)) {
                            final SubLObject item_var = component_assertions.first();
                            if (formula_templates.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)formula_templates.EQUAL), Symbols.symbol_function((SubLObject)formula_templates.IDENTITY))) {
                                assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                            }
                        }
                        else if (formula_templates.NIL != reassemble_polycanonicalized_assertionsP && (formula_templates.NIL != el_utilities.el_conjunction_p(formula) || formula_templates.NIL != el_utilities.el_existential_p(formula))) {
                            final SubLObject elmt_$401 = cycl_utilities.hl_to_el(bindings.variable_lookup(formula_templates.$elmt_variable_for_formula_templates$.getGlobalValue(), binding_set));
                            if (formula_templates.NIL == el_grammar.el_term_p(elmt_$401)) {
                                uncanonicalizer.assertion_elmt(component_assertions.first());
                            }
                            final SubLObject item_var2 = make_ftemplate_polycanonicalized_assertion(bound_formula, elmt_$401, (SubLObject)formula_templates.UNPROVIDED);
                            if (formula_templates.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)formula_templates.EQUAL), Symbols.symbol_function((SubLObject)formula_templates.IDENTITY))) {
                                assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                            }
                        }
                        else {
                            SubLObject cdolist_list_var_$401 = component_assertions;
                            SubLObject component_assertion = (SubLObject)formula_templates.NIL;
                            component_assertion = cdolist_list_var_$401.first();
                            while (formula_templates.NIL != cdolist_list_var_$401) {
                                if (formula_templates.NIL != assertion_handles.assertion_p(component_assertion)) {
                                    assertions = (SubLObject)ConsesLow.cons(component_assertion, assertions);
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
        SubLObject reversed = (SubLObject)formula_templates.NIL;
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion2 = (SubLObject)formula_templates.NIL;
        assertion2 = cdolist_list_var2.first();
        while (formula_templates.NIL != cdolist_list_var2) {
            if (formula_templates.NIL == bad_assertion_for_formula_templatesP(assertion2)) {
                reversed = (SubLObject)ConsesLow.cons(assertion2, reversed);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion2 = cdolist_list_var2.first();
        }
        return reversed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 114787L)
    public static SubLObject make_ftemplate_polycanonicalized_assertion(final SubLObject sentence, final SubLObject mt, SubLObject hl_assertions) {
        if (hl_assertions == formula_templates.UNPROVIDED) {
            hl_assertions = (SubLObject)formula_templates.NIL;
        }
        assert formula_templates.NIL != el_utilities.el_formula_p(sentence) : sentence;
        assert formula_templates.NIL != el_grammar.el_term_p(mt) : mt;
        SubLObject cdolist_list_var = hl_assertions;
        SubLObject hl_assertion = (SubLObject)formula_templates.NIL;
        hl_assertion = cdolist_list_var.first();
        while (formula_templates.NIL != cdolist_list_var) {
            assert formula_templates.NIL != assertion_handles.assertion_p(hl_assertion) : hl_assertion;
            cdolist_list_var = cdolist_list_var.rest();
            hl_assertion = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)formula_templates.$kw430$POLY_CANONICALIZED, sentence, mt, hl_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 115118L)
    public static SubLObject ftemplate_polycanonicalized_assertion_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && formula_templates.NIL != list_utilities.lengthGE(v_object, (SubLObject)formula_templates.THREE_INTEGER, (SubLObject)formula_templates.UNPROVIDED) && formula_templates.NIL != list_utilities.lengthLE(v_object, (SubLObject)formula_templates.FOUR_INTEGER, (SubLObject)formula_templates.UNPROVIDED) && v_object.first() == formula_templates.$kw430$POLY_CANONICALIZED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 115315L)
    public static SubLObject ftemplate_polycanonicalized_assertion_sentence(final SubLObject assertion) {
        assert formula_templates.NIL != ftemplate_polycanonicalized_assertion_p(assertion) : assertion;
        return conses_high.second(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 115486L)
    public static SubLObject ftemplate_polycanonicalized_assertion_hl_assertions(final SubLObject assertion, final SubLObject primary_term) {
        assert formula_templates.NIL != ftemplate_polycanonicalized_assertion_p(assertion) : assertion;
        final SubLObject already_known = conses_high.fourth(assertion);
        if (formula_templates.NIL != already_known) {
            return already_known;
        }
        final SubLObject newly_found = ftemplate_polycanonicalized_assertion_find_hl_assertions(assertion, primary_term);
        ConsesLow.set_nth((SubLObject)formula_templates.THREE_INTEGER, assertion, newly_found);
        return newly_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 116009L)
    public static SubLObject ftemplate_polycanonicalized_assertion_find_hl_assertions(final SubLObject assertion, final SubLObject primary_term) {
        final SubLObject psentence = ftemplate_polycanonicalized_assertion_sentence(assertion);
        final SubLObject elmt = hlmt_czer.canonicalize_hlmt(ftemplate_polycanonicalized_assertion_mt(assertion));
        final SubLObject query_sentence = get_assertion_finding_query_sentence(psentence, (SubLObject)formula_templates.NIL);
        final SubLObject max_number = (SubLObject)formula_templates.NIL;
        final SubLObject reassemble_polycanonicalized_assertionsP = (SubLObject)formula_templates.NIL;
        final SubLObject check_reformulatedP = (SubLObject)formula_templates.T;
        return get_assertions_for_fet_sentence(query_sentence, primary_term, elmt, max_number, psentence, (SubLObject)formula_templates.NIL, reassemble_polycanonicalized_assertionsP, check_reformulatedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 116616L)
    public static SubLObject ftemplate_polycanonicalized_assertion_mt(final SubLObject assertion) {
        assert formula_templates.NIL != ftemplate_polycanonicalized_assertion_p(assertion) : assertion;
        return conses_high.third(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 116778L)
    public static SubLObject ftemplate_assertion_mt(final SubLObject assertion) {
        if (formula_templates.NIL != assertion_handles.assertion_p(assertion)) {
            return assertions_high.assertion_mt(assertion);
        }
        if (formula_templates.NIL != ftemplate_polycanonicalized_assertion_p(assertion)) {
            return ftemplate_polycanonicalized_assertion_mt(assertion);
        }
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 117042L)
    public static SubLObject bad_assertion_for_formula_templatesP(final SubLObject assertion) {
        final SubLObject badP = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != assertion_handles.assertion_p(assertion)) {}
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 117269L)
    public static SubLObject uninteresting_indeterminate_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL != inference_trampolines.inference_indeterminate_termP(v_term) && formula_templates.NIL == is_skolemish_termP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 117426L)
    public static SubLObject is_skolemish_termP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL != fort_types_interface.skolem_function_p(v_term) || formula_templates.NIL != term.skolem_nartP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 117541L)
    public static SubLObject get_assertion_sentence_and_constraints_from_formula_template(final SubLObject ftemplate, final SubLObject focal_term, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = formula_template_formula(ftemplate);
        final SubLObject focal_term_argpositions = formula_template_focal_term(ftemplate);
        SubLObject v_clauses = (SubLObject)formula_templates.NIL;
        if (formula_templates.NIL != formula) {
            formula = el_utilities.copy_formula(formula);
            SubLObject cdolist_list_var = focal_term_argpositions;
            SubLObject focal_term_argpos = (SubLObject)formula_templates.NIL;
            focal_term_argpos = cdolist_list_var.first();
            while (formula_templates.NIL != cdolist_list_var) {
                cycl_utilities.formula_arg_position_nsubst(focal_term, focal_term_argpos.rest(), formula);
                cdolist_list_var = cdolist_list_var.rest();
                focal_term_argpos = cdolist_list_var.first();
            }
            SubLObject list_var = (SubLObject)formula_templates.NIL;
            SubLObject argpos_detail = (SubLObject)formula_templates.NIL;
            SubLObject var_index = (SubLObject)formula_templates.NIL;
            list_var = formula_template_argpos_ordering(ftemplate);
            argpos_detail = list_var.first();
            for (var_index = (SubLObject)formula_templates.ZERO_INTEGER; formula_templates.NIL != list_var; list_var = list_var.rest(), argpos_detail = list_var.first(), var_index = Numbers.add((SubLObject)formula_templates.ONE_INTEGER, var_index)) {
                final SubLObject variable = ConsesLow.nth(var_index, formula_templates.$unique_variables_list_for_formula_templates$.getGlobalValue());
                final SubLObject argpos = arg_position_details_argument_position(argpos_detail);
                final SubLObject unknown_replacement = arg_position_details_unknown_replacement(argpos_detail);
                SubLObject constraint = (SubLObject)formula_templates.NIL;
                if (formula_templates.NIL == subl_promotions.memberP(argpos, focal_term_argpositions, Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED)) {
                    constraint = cycl_utilities.formula_arg_position(formula, argpos.rest(), (SubLObject)formula_templates.UNPROVIDED);
                    cycl_utilities.formula_arg_position_nsubst(variable, argpos.rest(), formula);
                    thread.resetMultipleValues();
                    final SubLObject collection = convert_ftemplate_input_constraint_to_collection(constraint, elmt);
                    final SubLObject predicate = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (formula_templates.NIL != collection) {
                        SubLObject clause = el_utilities.make_binary_formula(predicate, variable, collection);
                        if (formula_templates.NIL != cycl_grammar.cycl_represented_term_p(unknown_replacement)) {
                            clause = el_utilities.make_disjunction((SubLObject)ConsesLow.list(clause, (SubLObject)ConsesLow.list(formula_templates.$const432$equals, variable, unknown_replacement)));
                        }
                        v_clauses = (SubLObject)ConsesLow.cons(clause, v_clauses);
                    }
                }
            }
            return Values.values(formula, v_clauses);
        }
        return (SubLObject)formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 119217L)
    public static SubLObject get_assertion_finding_query_sentence(SubLObject formula, SubLObject v_clauses) {
        if (v_clauses == formula_templates.UNPROVIDED) {
            v_clauses = (SubLObject)formula_templates.NIL;
        }
        SubLObject allow_skolemP = (SubLObject)formula_templates.NIL;
        final SubLObject unconstrained_query = el_utilities.copy_formula(formula);
        if (formula_templates.NIL != el_utilities.el_existential_p(formula)) {
            formula = cycl_utilities.formula_arg2(formula, (SubLObject)formula_templates.UNPROVIDED);
            allow_skolemP = (SubLObject)formula_templates.T;
        }
        formula = constrain_query_with_accumulated_constraints(formula, v_clauses);
        return Values.values(formula, unconstrained_query, allow_skolemP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 119737L)
    public static SubLObject constrain_query_with_accumulated_constraints(final SubLObject formula, SubLObject v_clauses) {
        SubLObject new_query_formula = formula;
        if (formula_templates.NIL == v_clauses) {
            return ftemplate_assertion_constrained_query_formula(formula, (SubLObject)formula_templates.UNPROVIDED);
        }
        if (cycl_utilities.formula_arg0(formula).eql(formula_templates.$const433$ist)) {
            SubLObject ist_part = (SubLObject)formula_templates.NIL;
            SubLObject mt_part = (SubLObject)formula_templates.NIL;
            SubLObject formula_part = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)formula_templates.$list434);
            ist_part = formula.first();
            SubLObject current = formula.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)formula_templates.$list434);
            mt_part = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)formula_templates.$list434);
            formula_part = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                v_clauses = (SubLObject)ConsesLow.cons(ftemplate_assertion_constrained_query_formula(formula_part, (SubLObject)formula_templates.UNPROVIDED), v_clauses);
                new_query_formula = el_utilities.make_binary_formula(ist_part, mt_part, simplifier.conjoin(v_clauses, (SubLObject)formula_templates.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)formula_templates.$list434);
            }
        }
        else {
            v_clauses = (SubLObject)ConsesLow.cons(ftemplate_assertion_constrained_query_formula(formula, (SubLObject)formula_templates.UNPROVIDED), v_clauses);
            new_query_formula = simplifier.conjoin(v_clauses, (SubLObject)formula_templates.UNPROVIDED);
        }
        return new_query_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 120503L)
    public static SubLObject fet_assertion_variable_for_formula(final SubLObject formula) {
        return (SubLObject)formula_templates.$sym435$_FET_ASSERTION_VAR_524;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 120617L)
    public static SubLObject ftemplate_assertion_constrained_query_formula(final SubLObject formula, SubLObject use_ist_assertedP) {
        if (use_ist_assertedP == formula_templates.UNPROVIDED) {
            use_ist_assertedP = (SubLObject)formula_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(formula);
        if (formula_templates.NIL != el_utilities.el_existential_p(formula)) {
            SubLObject quantifier = (SubLObject)formula_templates.NIL;
            SubLObject variable = (SubLObject)formula_templates.NIL;
            SubLObject v_clauses = (SubLObject)formula_templates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)formula_templates.$list436);
            quantifier = formula.first();
            SubLObject current = formula.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)formula_templates.$list436);
            variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)formula_templates.$list436);
            v_clauses = current.first();
            current = current.rest();
            if (formula_templates.NIL == current) {
                return el_utilities.make_binary_formula(quantifier, variable, ftemplate_assertion_constrained_query_formula(v_clauses, (SubLObject)formula_templates.UNPROVIDED));
            }
            cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)formula_templates.$list436);
        }
        else {
            if (formula_templates.NIL != el_utilities.el_conjunction_p(formula)) {
                SubLObject focused_clauses = (SubLObject)formula_templates.NIL;
                final SubLObject _prev_bind_0 = formula_templates.$get_assertions_from_initial_askP$.currentBinding(thread);
                try {
                    formula_templates.$get_assertions_from_initial_askP$.bind((SubLObject)formula_templates.NIL, thread);
                    SubLObject cdolist_list_var = formula.rest();
                    SubLObject clause = (SubLObject)formula_templates.NIL;
                    clause = cdolist_list_var.first();
                    while (formula_templates.NIL != cdolist_list_var) {
                        focused_clauses = (SubLObject)ConsesLow.cons(ftemplate_assertion_constrained_query_formula(clause, (SubLObject)formula_templates.T), focused_clauses);
                        cdolist_list_var = cdolist_list_var.rest();
                        clause = cdolist_list_var.first();
                    }
                }
                finally {
                    formula_templates.$get_assertions_from_initial_askP$.rebind(_prev_bind_0, thread);
                }
                return simplifier.conjoin(focused_clauses, (SubLObject)formula_templates.UNPROVIDED);
            }
            if (formula_templates.NIL == fort_types_interface.logical_connective_p(arg0)) {
                final SubLObject assertion_var = fet_assertion_variable_for_formula(formula);
                return (formula_templates.NIL != formula_ok_for_fet_assertion_varP(formula, assertion_var)) ? el_utilities.make_binary_formula(formula_templates.$const437$assertionSentence, assertion_var, formula) : ((formula_templates.NIL != el_utilities.el_formula_with_operator_p(formula, formula_templates.$const433$ist)) ? el_utilities.replace_formula_arg((SubLObject)formula_templates.ZERO_INTEGER, formula_templates.$const438$ist_Asserted, formula) : ((formula_templates.NIL != use_ist_assertedP) ? el_utilities.make_binary_formula(formula_templates.$const438$ist_Asserted, formula_templates.$elmt_variable_for_formula_templates$.getGlobalValue(), formula) : el_utilities.make_unary_formula(formula_templates.$const304$assertedSentence, formula)));
            }
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 121883L)
    public static SubLObject formula_ok_for_fet_assertion_varP(final SubLObject formula, final SubLObject assertion_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL != formula_templates.$get_assertions_from_initial_askP$.getDynamicValue(thread) && formula_templates.NIL == cycl_utilities.expression_find(assertion_var, formula, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED) && formula_templates.NIL == el_utilities.el_formula_with_operator_p(formula, formula_templates.$const439$assertionProducedByReformulation));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 122323L)
    public static SubLObject convert_ftemplate_input_constraint_to_collection(final SubLObject constraint, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula_templates.NIL != narts_high.naut_p(constraint) && formula_templates.NIL == subl_promotions.memberP(constraint, formula_templates.$ftemplate_constraint_to_collection_skiplist$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.EQUAL), (SubLObject)formula_templates.UNPROVIDED)) {
            final SubLObject collection = cycl_utilities.formula_arg1(constraint, (SubLObject)formula_templates.UNPROVIDED);
            if (formula_templates.NIL != narts_high.naut_p(collection)) {
                final SubLObject pcase_var = cycl_utilities.formula_arg0(collection);
                if (pcase_var.eql(formula_templates.$const441$SpecsFn)) {
                    return Values.values(cycl_utilities.formula_arg1(collection, (SubLObject)formula_templates.UNPROVIDED), formula_templates.$const155$genls);
                }
                if (pcase_var.eql(formula_templates.$const442$SomeExampleFn)) {
                    SubLObject spec_coll = cycl_utilities.formula_arg1(collection, (SubLObject)formula_templates.UNPROVIDED);
                    if (formula_templates.NIL != narts_high.naut_p(spec_coll) && cycl_utilities.formula_arg0(spec_coll).eql(formula_templates.$const441$SpecsFn)) {
                        spec_coll = cycl_utilities.formula_arg1(spec_coll, (SubLObject)formula_templates.UNPROVIDED);
                    }
                    return Values.values(spec_coll, formula_templates.$const154$isa);
                }
                if (pcase_var.eql(formula_templates.$const443$SomeExampleSpecFn)) {
                    return Values.values(cycl_utilities.formula_arg1(collection, (SubLObject)formula_templates.UNPROVIDED), formula_templates.$const154$isa);
                }
                return Values.values(collection, formula_templates.$const154$isa);
            }
            else if (formula_templates.NIL != forts.fort_p(collection)) {
                SubLObject usableP = (SubLObject)formula_templates.NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    usableP = (SubLObject)SubLObjectFactory.makeBoolean(formula_templates.NIL == kb_mapping_utilities.some_pred_value(collection, formula_templates.$const444$defnIff, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED) && formula_templates.NIL == kb_mapping_utilities.some_pred_value(collection, formula_templates.$const445$defnSufficient, (SubLObject)formula_templates.UNPROVIDED, (SubLObject)formula_templates.UNPROVIDED));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                return Values.values((SubLObject)((formula_templates.NIL != usableP) ? collection : formula_templates.NIL), formula_templates.$const154$isa);
            }
        }
        return Values.values((SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-templates.lisp", position = 123897L)
    public static SubLObject get_lexical_mt_for_rkf_interaction_mt(final SubLObject domain_mt) {
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)formula_templates.$kw305$MAX_NUMBER, (SubLObject)formula_templates.ONE_INTEGER);
        final SubLObject lexical_candidates = ftemplate_ask_variable((SubLObject)formula_templates.$kw446$LEXICAL_MT, (SubLObject)ConsesLow.list(formula_templates.$const337$and, (SubLObject)formula_templates.$list447, (SubLObject)ConsesLow.list(formula_templates.$const448$genlMt, (SubLObject)formula_templates.$kw446$LEXICAL_MT, domain_mt)), domain_mt, v_properties);
        return lexical_candidates.first();
    }
    
    public static SubLObject declare_formula_templates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_print_function_trampoline", "TEMPLATE-TOPIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_p", "TEMPLATE-TOPIC-P", 1, 0, false);
        new $template_topic_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_supertopic", "TEMPLATE-TOPIC-SUPERTOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_topic", "TEMPLATE-TOPIC-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_subtopics", "TEMPLATE-TOPIC-SUBTOPICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_templates", "TEMPLATE-TOPIC-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_ordering", "TEMPLATE-TOPIC-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_title", "TEMPLATE-TOPIC-TITLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_term_prefix", "TEMPLATE-TOPIC-TERM-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_intro_template", "TEMPLATE-TOPIC-INTRO-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_source_types", "TEMPLATE-TOPIC-SOURCE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_source_mt", "TEMPLATE-TOPIC-SOURCE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_query_mt", "TEMPLATE-TOPIC-QUERY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_definitional_mt", "TEMPLATE-TOPIC-DEFINITIONAL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_supertopic", "_CSETF-TEMPLATE-TOPIC-SUPERTOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_topic", "_CSETF-TEMPLATE-TOPIC-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_subtopics", "_CSETF-TEMPLATE-TOPIC-SUBTOPICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_templates", "_CSETF-TEMPLATE-TOPIC-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_ordering", "_CSETF-TEMPLATE-TOPIC-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_title", "_CSETF-TEMPLATE-TOPIC-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_term_prefix", "_CSETF-TEMPLATE-TOPIC-TERM-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_intro_template", "_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_source_types", "_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_source_mt", "_CSETF-TEMPLATE-TOPIC-SOURCE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_query_mt", "_CSETF-TEMPLATE-TOPIC-QUERY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_template_topic_definitional_mt", "_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "make_template_topic", "MAKE-TEMPLATE-TOPIC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "visit_defstruct_template_topic", "VISIT-DEFSTRUCT-TEMPLATE-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "visit_defstruct_object_template_topic_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-TOPIC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_print_function_trampoline", "ARG-POSITION-DETAILS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_p", "ARG-POSITION-DETAILS-P", 1, 0, false);
        new $arg_position_details_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_argument_position", "ARG-POSITION-DETAILS-ARGUMENT-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_ordering", "ARG-POSITION-DETAILS-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_gloss", "ARG-POSITION-DETAILS-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_invisible_replacement_positions", "ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_replacement_constraints", "ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_candidate_replacements", "ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_is_editable", "ARG-POSITION-DETAILS-IS-EDITABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_explanation", "ARG-POSITION-DETAILS-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_requires_validation", "ARG-POSITION-DETAILS-REQUIRES-VALIDATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "arg_position_details_unknown_replacement", "ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_argument_position", "_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_ordering", "_CSETF-ARG-POSITION-DETAILS-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_gloss", "_CSETF-ARG-POSITION-DETAILS-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_invisible_replacement_positions", "_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_replacement_constraints", "_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_candidate_replacements", "_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_is_editable", "_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_explanation", "_CSETF-ARG-POSITION-DETAILS-EXPLANATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_requires_validation", "_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_arg_position_details_unknown_replacement", "_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "make_arg_position_details", "MAKE-ARG-POSITION-DETAILS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "visit_defstruct_arg_position_details", "VISIT-DEFSTRUCT-ARG-POSITION-DETAILS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "visit_defstruct_object_arg_position_details_method", "VISIT-DEFSTRUCT-OBJECT-ARG-POSITION-DETAILS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_print_function_trampoline", "FORMULA-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_p", "FORMULA-TEMPLATE-P", 1, 0, false);
        new $formula_template_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_topic", "FORMULA-TEMPLATE-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_id", "FORMULA-TEMPLATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_formula", "FORMULA-TEMPLATE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_query_specification", "FORMULA-TEMPLATE-QUERY-SPECIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_elmt", "FORMULA-TEMPLATE-ELMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_focal_term", "FORMULA-TEMPLATE-FOCAL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_argpos_details", "FORMULA-TEMPLATE-ARGPOS-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_argpos_ordering", "FORMULA-TEMPLATE-ARGPOS-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_examples", "FORMULA-TEMPLATE-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_entry_format", "FORMULA-TEMPLATE-ENTRY-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_follow_ups", "FORMULA-TEMPLATE-FOLLOW-UPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_gloss", "FORMULA-TEMPLATE-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_refspec", "FORMULA-TEMPLATE-REFSPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_topic", "_CSETF-FORMULA-TEMPLATE-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_id", "_CSETF-FORMULA-TEMPLATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_formula", "_CSETF-FORMULA-TEMPLATE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_query_specification", "_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_elmt", "_CSETF-FORMULA-TEMPLATE-ELMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_focal_term", "_CSETF-FORMULA-TEMPLATE-FOCAL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_argpos_details", "_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_argpos_ordering", "_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_examples", "_CSETF-FORMULA-TEMPLATE-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_entry_format", "_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_follow_ups", "_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_gloss", "_CSETF-FORMULA-TEMPLATE-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "_csetf_formula_template_refspec", "_CSETF-FORMULA-TEMPLATE-REFSPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "make_formula_template", "MAKE-FORMULA-TEMPLATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "visit_defstruct_formula_template", "VISIT-DEFSTRUCT-FORMULA-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "visit_defstruct_object_formula_template_method", "VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "is_ftemplate_loading_supporting_ask_browsableP", "IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.formula_templates", "with_browsable_ftemplate_loading_supporting_ask", "WITH-BROWSABLE-FTEMPLATE-LOADING-SUPPORTING-ASK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.formula_templates", "reusing_rkf_sd_problem_store_if_available", "REUSING-RKF-SD-PROBLEM-STORE-IF-AVAILABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_non_editable_assertions_for_template_topic_instance", "GET-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.formula_templates", "with_known_non_editable_assertions_for_template_topic_instance", "WITH-KNOWN-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "compute_non_editable_assertions_for_template_topic_instance", "COMPUTE-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "is_non_editable_assertion_for_template_topic_instanceP", "IS-NON-EDITABLE-ASSERTION-FOR-TEMPLATE-TOPIC-INSTANCE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.formula_templates", "with_non_editable_assertions_for_template_topic_instance", "WITH-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "valid_formula_template_p", "VALID-FORMULA-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "new_template_topic", "NEW-TEMPLATE-TOPIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_add_subtopic", "TEMPLATE-TOPIC-ADD-SUBTOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_add_template", "TEMPLATE-TOPIC-ADD-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_add_title", "TEMPLATE-TOPIC-ADD-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_add_term_prefix", "TEMPLATE-TOPIC-ADD-TERM-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_set_introductory_template", "TEMPLATE-TOPIC-SET-INTRODUCTORY-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_set_source_types", "TEMPLATE-TOPIC-SET-SOURCE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "print_template_topic", "PRINT-TEMPLATE-TOPIC", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.formula_templates", "formula_template_xml_tag", "FORMULA-TEMPLATE-XML-TAG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_template_topic_current_revision", "XML-TEMPLATE-TOPIC-CURRENT-REVISION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_template_topic", "XML-SERIALIZE-TEMPLATE-TOPIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_output_object_template_topic_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-TOPIC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_output_template_topic", "CFASL-OUTPUT-TEMPLATE-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_input_template_topic", "CFASL-INPUT-TEMPLATE-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "new_formula_template", "NEW-FORMULA-TEMPLATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_is_single_entryP", "FORMULA-TEMPLATE-IS-SINGLE-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_is_multiple_entryP", "FORMULA-TEMPLATE-IS-MULTIPLE-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_has_reformulation_specificationP", "FORMULA-TEMPLATE-HAS-REFORMULATION-SPECIFICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "print_formula_template", "PRINT-FORMULA-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_formula", "FORMULA-TEMPLATE-SET-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_examples", "FORMULA-TEMPLATE-SET-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_focal_term", "FORMULA-TEMPLATE-SET-FOCAL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_elmt", "FORMULA-TEMPLATE-SET-ELMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_entry_format", "FORMULA-TEMPLATE-SET-ENTRY-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_gloss", "FORMULA-TEMPLATE-SET-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_set_query_specification", "FORMULA-TEMPLATE-SET-QUERY-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_formula_template", "XML-SERIALIZE-FORMULA-TEMPLATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_formula_template_as_document", "XML-SERIALIZE-FORMULA-TEMPLATE-AS-DOCUMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_dtd_uri", "FORMULA-TEMPLATE-DTD-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_formula_template_header", "XML-SERIALIZE-FORMULA-TEMPLATE-HEADER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_output_object_formula_template_method", "CFASL-OUTPUT-OBJECT-FORMULA-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_output_formula_template", "CFASL-OUTPUT-FORMULA-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_input_formula_template", "CFASL-INPUT-FORMULA-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "new_arg_position_details", "NEW-ARG-POSITION-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "valid_arg_position_details_p", "VALID-ARG-POSITION-DETAILS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "print_arg_position_details", "PRINT-ARG-POSITION-DETAILS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_arg_position_details", "XML-SERIALIZE-ARG-POSITION-DETAILS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_output_object_arg_position_details_method", "CFASL-OUTPUT-OBJECT-ARG-POSITION-DETAILS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_output_arg_position_details", "CFASL-OUTPUT-ARG-POSITION-DETAILS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "cfasl_input_arg_position_details", "CFASL-INPUT-ARG-POSITION-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_arg_position", "XML-SERIALIZE-ARG-POSITION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_load_topic_template_details", "FORMULA-TEMPLATE-LOAD-TOPIC-TEMPLATE-DETAILS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_load_argument_position_detail_information", "FTEMPLATE-LOAD-ARGUMENT-POSITION-DETAIL-INFORMATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_glosses", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-GLOSSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_explanations", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-EXPLANATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_invisible_replacement_positions", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-INVISIBLE-REPLACEMENT-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_replacable_positions", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-REPLACABLE-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_replacement_constraints", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-REPLACEMENT-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_candidate_replacements", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-CANDIDATE-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_validation_required", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-VALIDATION-REQUIRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_unknown_replacements", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-UNKNOWN-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_ftemplate_arg_position_details", "GET-FTEMPLATE-ARG-POSITION-DETAILS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "update_ftemplate_argpos_detail_ordering_information", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-ORDERING-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_compute_ordering_of_argpos_details", "FTEMPLATE-COMPUTE-ORDERING-OF-ARGPOS-DETAILS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "sort_argpos_details_by_ordering", "SORT-ARGPOS-DETAILS-BY-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ordered_by_argument_position", "ORDERED-BY-ARGUMENT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "load_formula_template_skeleton_from_kb", "LOAD-FORMULA-TEMPLATE-SKELETON-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "load_formula_template_details_from_kb", "LOAD-FORMULA-TEMPLATE-DETAILS-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_assign_formula_component", "FTEMPLATE-ASSIGN-FORMULA-COMPONENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_functional_slot_value", "FTEMPLATE-GET-FUNCTIONAL-SLOT-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_reformulation_specification", "FTEMPLATE-GET-TEMPLATE-REFORMULATION-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_query_specification", "FTEMPLATE-GET-QUERY-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_formula", "FTEMPLATE-GET-TEMPLATE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_elmt", "FTEMPLATE-GET-TEMPLATE-ELMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_follow_ups", "FTEMPLATE-GET-TEMPLATE-FOLLOW-UPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_gloss", "FTEMPLATE-GET-TEMPLATE-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_qualify_mt_to_now", "FTEMPLATE-QUALIFY-MT-TO-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_qualify_mt_to_anytime", "FTEMPLATE-QUALIFY-MT-TO-ANYTIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_hlmt_change_time", "FTEMPLATE-HLMT-CHANGE-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_glosses", "FTEMPLATE-GET-TEMPLATE-GLOSSES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_explanations", "FTEMPLATE-GET-TEMPLATE-EXPLANATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_examples", "FTEMPLATE-GET-TEMPLATE-EXAMPLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_first_asserted_value", "FTEMPLATE-GET-FIRST-ASSERTED-VALUE", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_asserted_values", "FTEMPLATE-GET-ASSERTED-VALUES", 4, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_focal_term", "FTEMPLATE-GET-TEMPLATE-FOCAL-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_format", "FTEMPLATE-GET-TEMPLATE-FORMAT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_invisible_replacement_positions", "FTEMPLATE-GET-TEMPLATE-INVISIBLE-REPLACEMENT-POSITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_replacement_constraints", "FTEMPLATE-GET-TEMPLATE-REPLACEMENT-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_unknown_replacements", "FTEMPLATE-GET-TEMPLATE-UNKNOWN-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_candidate_replacements_for_position", "FTEMPLATE-GET-TEMPLATE-CANDIDATE-REPLACEMENTS-FOR-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_replacable_positions", "FTEMPLATE-GET-TEMPLATE-REPLACABLE-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_get_template_validation_requirements", "FTEMPLATE-GET-TEMPLATE-VALIDATION-REQUIREMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_load_topic_subtopic_ordering", "FORMULA-TEMPLATE-LOAD-TOPIC-SUBTOPIC-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_load_topic_template_ordering", "FORMULA-TEMPLATE-LOAD-TOPIC-TEMPLATE-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "lower_priority_terms", "LOWER-PRIORITY-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "accumulate_lower_priority_terms", "ACCUMULATE-LOWER-PRIORITY-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "higher_priorityP", "HIGHER-PRIORITY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "apply_prioritizing_ordering_to_kb_objects", "APPLY-PRIORITIZING-ORDERING-TO-KB-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "apply_prioritizing_ordering_to_kb_objects_rck", "APPLY-PRIORITIZING-ORDERING-TO-KB-OBJECTS-RCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "construct_highXlow_information_from_prioritizing_ordering", "CONSTRUCT-HIGH/LOW-INFORMATION-FROM-PRIORITIZING-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_load_prioritization_information_for_subtopics", "FORMULA-TEMPLATE-LOAD-PRIORITIZATION-INFORMATION-FOR-SUBTOPICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_load_prioritization_information_for_templates", "FORMULA-TEMPLATE-LOAD-PRIORITIZATION-INFORMATION-FOR-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_organize_templates_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-TEMPLATES-BY-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_organize_subtopics_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-SUBTOPICS-BY-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_organize_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-BY-ORDERING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "stable_template_id_compare", "STABLE-TEMPLATE-ID-COMPARE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_load_template_graph", "FORMULA-TEMPLATE-LOAD-TEMPLATE-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "validate_template_topic_semantic_constraints", "VALIDATE-TEMPLATE-TOPIC-SEMANTIC-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "template_topic_query_mt_can_see_all_assertion_mts", "TEMPLATE-TOPIC-QUERY-MT-CAN-SEE-ALL-ASSERTION-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "check_template_topic_query_mt_can_see_subtopics_assertion_mts", "CHECK-TEMPLATE-TOPIC-QUERY-MT-CAN-SEE-SUBTOPICS-ASSERTION-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "templates_use_isaXgenlsP", "TEMPLATES-USE-ISA/GENLS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "asserted_formula_template_ids_for_type", "ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "sort_formula_template_subtopics_by_template_count", "SORT-FORMULA-TEMPLATE-SUBTOPICS-BY-TEMPLATE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "count_asserted_formula_template_ids_for_type_internal", "COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "count_asserted_formula_template_ids_for_type", "COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "fet_topic_fort_has_subtopicsP", "FET-TOPIC-FORT-HAS-SUBTOPICS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "fet_topic_fort_has_templatesP", "FET-TOPIC-FORT-HAS-TEMPLATES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_subtopics_for_type", "FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_asserted_subtopics_for_type", "FORMULA-TEMPLATE-ASSERTED-SUBTOPICS-FOR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "asserted_formula_template_subtopics_for_type", "ASSERTED-FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_induction_mt", "FORMULA-TEMPLATE-INDUCTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_template_topic_load_topic_specifics", "FORMULA-TEMPLATE-TOPIC-LOAD-TOPIC-SPECIFICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "topictmplt_get_topic_template_source_types", "TOPICTMPLT-GET-TOPIC-TEMPLATE-SOURCE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_topic_get_functional_slot_value", "FTEMPLATE-TOPIC-GET-FUNCTIONAL-SLOT-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "topictmplt_get_topic_template_introductory_template", "TOPICTMPLT-GET-TOPIC-TEMPLATE-INTRODUCTORY-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "topictmplt_get_topic_template_title", "TOPICTMPLT-GET-TOPIC-TEMPLATE-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "topictmplt_get_topic_template_term_prefix", "TOPICTMPLT-GET-TOPIC-TEMPLATE-TERM-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "topictmplt_get_topic_template_query_mt", "TOPICTMPLT-GET-TOPIC-TEMPLATE-QUERY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "topictmplt_get_topic_template_definitional_mt", "TOPICTMPLT-GET-TOPIC-TEMPLATE-DEFINITIONAL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_ask_variable", "FTEMPLATE-ASK-VARIABLE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_ask_template", "FTEMPLATE-ASK-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_editable_and_non_editable_assertions_for_template_topic_instance", "GET-EDITABLE-AND-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertions_for_template_topic_instance", "GET-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertions_for_template_topic_instance_int", "GET-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_template_topic_assertions_current_revision", "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertions_for_template_topic_instance", "XML-SERIALIZE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertions_for_formula_template_instance", "XML-SERIALIZE-ASSERTIONS-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_assertion_non_editableP", "FTEMPLATE-ASSERTION-NON-EDITABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertion_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertion_sentence_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-SENTENCE-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertion_suids_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-SUIDS-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_suids", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SUIDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertion_evaluation_data_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-EVALUATION-DATA-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "quaternary_fet_evaluation_pred", "QUATERNARY-FET-EVALUATION-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_assertion_evaluations", "FTEMPLATE-ASSERTION-EVALUATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_evaluation_judgment", "FTEMPLATE-EVALUATION-JUDGMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertion_timestamp_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-TIMESTAMP-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_date", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_second", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SECOND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_assertion_elmt_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-ELMT-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "xml_serialize_elmt_information_for_assertion", "XML-SERIALIZE-ELMT-INFORMATION-FOR-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "clear_map_elmt_to_published_conceptual_work", "CLEAR-MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "remove_map_elmt_to_published_conceptual_work", "REMOVE-MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "map_elmt_to_published_conceptual_work_internal", "MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "map_elmt_to_published_conceptual_work", "MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertions_for_leaf_template_topic_instance", "GET-ASSERTIONS-FOR-LEAF-TEMPLATE-TOPIC-INSTANCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertions_for_formula_template_instance", "GET-ASSERTIONS-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertions_for_fet_sentence", "GET-ASSERTIONS-FOR-FET-SENTENCE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "fet_fallback_to_default_mtP", "FET-FALLBACK-TO-DEFAULT-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_reformulated_query_mt", "FTEMPLATE-REFORMULATED-QUERY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_filter_reformulated_result_set", "FTEMPLATE-FILTER-REFORMULATED-RESULT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_reformulated_result_duplicateP", "FTEMPLATE-REFORMULATED-RESULT-DUPLICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "unpack_note_reformulation_result_sets", "UNPACK-NOTE-REFORMULATION-RESULT-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "add_one_polycanonicalized_result", "ADD-ONE-POLYCANONICALIZED-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "unpack_note_reformulation_result", "UNPACK-NOTE-REFORMULATION-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_loading_supporting_ask", "FTEMPLATE-LOADING-SUPPORTING-ASK", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "smarter_find_visible_assertions_cycl", "SMARTER-FIND-VISIBLE-ASSERTIONS-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertions_from_formula_template_result_sets", "GET-ASSERTIONS-FROM-FORMULA-TEMPLATE-RESULT-SETS", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "make_ftemplate_polycanonicalized_assertion", "MAKE-FTEMPLATE-POLYCANONICALIZED-ASSERTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_p", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_sentence", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_hl_assertions", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-HL-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_find_hl_assertions", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-FIND-HL-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_polycanonicalized_assertion_mt", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_assertion_mt", "FTEMPLATE-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "bad_assertion_for_formula_templatesP", "BAD-ASSERTION-FOR-FORMULA-TEMPLATES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "uninteresting_indeterminate_termP", "UNINTERESTING-INDETERMINATE-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "is_skolemish_termP", "IS-SKOLEMISH-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertion_sentence_and_constraints_from_formula_template", "GET-ASSERTION-SENTENCE-AND-CONSTRAINTS-FROM-FORMULA-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_assertion_finding_query_sentence", "GET-ASSERTION-FINDING-QUERY-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "constrain_query_with_accumulated_constraints", "CONSTRAIN-QUERY-WITH-ACCUMULATED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "fet_assertion_variable_for_formula", "FET-ASSERTION-VARIABLE-FOR-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "ftemplate_assertion_constrained_query_formula", "FTEMPLATE-ASSERTION-CONSTRAINED-QUERY-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "formula_ok_for_fet_assertion_varP", "FORMULA-OK-FOR-FET-ASSERTION-VAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "convert_ftemplate_input_constraint_to_collection", "CONVERT-FTEMPLATE-INPUT-CONSTRAINT-TO-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_templates", "get_lexical_mt_for_rkf_interaction_mt", "GET-LEXICAL-MT-FOR-RKF-INTERACTION-MT", 1, 0, false);
        return (SubLObject)formula_templates.NIL;
    }
    
    public static SubLObject init_formula_templates_file() {
        formula_templates.$dtp_template_topic$ = SubLFiles.defconstant("*DTP-TEMPLATE-TOPIC*", (SubLObject)formula_templates.$sym0$TEMPLATE_TOPIC);
        formula_templates.$cfasl_guid_opcode_template_topic$ = SubLFiles.deflexical("*CFASL-GUID-OPCODE-TEMPLATE-TOPIC*", Guids.string_to_guid((SubLObject)formula_templates.$str51$18287931_d871_11d9_8eef_0002b3891));
        formula_templates.$dtp_arg_position_details$ = SubLFiles.defconstant("*DTP-ARG-POSITION-DETAILS*", (SubLObject)formula_templates.$sym53$ARG_POSITION_DETAILS);
        formula_templates.$cfasl_guid_opcode_arg_position_details$ = SubLFiles.deflexical("*CFASL-GUID-OPCODE-ARG-POSITION-DETAILS*", Guids.string_to_guid((SubLObject)formula_templates.$str93$182a9c10_d871_11d9_8eef_0002b3891));
        formula_templates.$dtp_formula_template$ = SubLFiles.defconstant("*DTP-FORMULA-TEMPLATE*", (SubLObject)formula_templates.$sym95$FORMULA_TEMPLATE);
        formula_templates.$cfasl_guid_opcode_formula_template$ = SubLFiles.deflexical("*CFASL-GUID-OPCODE-FORMULA-TEMPLATE*", Guids.string_to_guid((SubLObject)formula_templates.$str143$182b1140_d871_11d9_8eef_0002b3891));
        formula_templates.$make_ftemplate_loading_supporting_ask_browsableP$ = SubLFiles.defparameter("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*", (SubLObject)formula_templates.NIL);
        formula_templates.$non_editable_assertions_for_template_topic_instance$ = SubLFiles.defparameter("*NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE*", (SubLObject)formula_templates.NIL);
        formula_templates.$xml_suppress_future_template_extensions$ = SubLFiles.defparameter("*XML-SUPPRESS-FUTURE-TEMPLATE-EXTENSIONS*", (SubLObject)formula_templates.T);
        formula_templates.$xml_template_topic_revisions$ = SubLFiles.deflexical("*XML-TEMPLATE-TOPIC-REVISIONS*", (SubLObject)formula_templates.$list183);
        formula_templates.$formula_template_dtd_uri$ = SubLFiles.deflexical("*FORMULA-TEMPLATE-DTD-URI*", (SubLObject)formula_templates.$str241$http___dev_cyc_com_dtd_formulatem);
        formula_templates.$high_to_low_priorities$ = SubLFiles.defparameter("*HIGH-TO-LOW-PRIORITIES*", (SubLObject)formula_templates.NIL);
        formula_templates.$warn_on_template_topic_validation_only$ = SubLFiles.deflexical("*WARN-ON-TEMPLATE-TOPIC-VALIDATION-ONLY*", (SubLObject)formula_templates.T);
        formula_templates.$template_count_mt$ = SubLFiles.defparameter("*TEMPLATE-COUNT-MT*", formula_templates.$const352$InferencePSC);
        formula_templates.$xml_template_topic_assertions_revisions$ = SubLFiles.deflexical("*XML-TEMPLATE-TOPIC-ASSERTIONS-REVISIONS*", (SubLObject)formula_templates.$list372);
        formula_templates.$quaternary_fet_evaluation_pred$ = SubLFiles.deflexical("*QUATERNARY-FET-EVALUATION-PRED*", (SubLObject)formula_templates.NIL);
        formula_templates.$map_elmt_to_published_conceptual_work_caching_state$ = SubLFiles.deflexical("*MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-CACHING-STATE*", (SubLObject)formula_templates.NIL);
        formula_templates.$unique_variables_list_for_formula_templates$ = SubLFiles.deflexical("*UNIQUE-VARIABLES-LIST-FOR-FORMULA-TEMPLATES*", (SubLObject)formula_templates.$list412);
        formula_templates.$elmt_variable_for_formula_templates$ = SubLFiles.deflexical("*ELMT-VARIABLE-FOR-FORMULA-TEMPLATES*", (SubLObject)formula_templates.$sym413$_POLY_ELMT);
        formula_templates.$get_assertions_from_initial_askP$ = SubLFiles.defparameter("*GET-ASSERTIONS-FROM-INITIAL-ASK?*", (SubLObject)formula_templates.T);
        formula_templates.$ftemplate_constraint_to_collection_skiplist$ = SubLFiles.deflexical("*FTEMPLATE-CONSTRAINT-TO-COLLECTION-SKIPLIST*", (SubLObject)formula_templates.$list440);
        return (SubLObject)formula_templates.NIL;
    }
    
    public static SubLObject setup_formula_templates_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), formula_templates.$dtp_template_topic$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym7$TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)formula_templates.$list8);
        Structures.def_csetf((SubLObject)formula_templates.$sym9$TEMPLATE_TOPIC_SUPERTOPIC, (SubLObject)formula_templates.$sym10$_CSETF_TEMPLATE_TOPIC_SUPERTOPIC);
        Structures.def_csetf((SubLObject)formula_templates.$sym11$TEMPLATE_TOPIC_TOPIC, (SubLObject)formula_templates.$sym12$_CSETF_TEMPLATE_TOPIC_TOPIC);
        Structures.def_csetf((SubLObject)formula_templates.$sym13$TEMPLATE_TOPIC_SUBTOPICS, (SubLObject)formula_templates.$sym14$_CSETF_TEMPLATE_TOPIC_SUBTOPICS);
        Structures.def_csetf((SubLObject)formula_templates.$sym15$TEMPLATE_TOPIC_TEMPLATES, (SubLObject)formula_templates.$sym16$_CSETF_TEMPLATE_TOPIC_TEMPLATES);
        Structures.def_csetf((SubLObject)formula_templates.$sym17$TEMPLATE_TOPIC_ORDERING, (SubLObject)formula_templates.$sym18$_CSETF_TEMPLATE_TOPIC_ORDERING);
        Structures.def_csetf((SubLObject)formula_templates.$sym19$TEMPLATE_TOPIC_TITLE, (SubLObject)formula_templates.$sym20$_CSETF_TEMPLATE_TOPIC_TITLE);
        Structures.def_csetf((SubLObject)formula_templates.$sym21$TEMPLATE_TOPIC_TERM_PREFIX, (SubLObject)formula_templates.$sym22$_CSETF_TEMPLATE_TOPIC_TERM_PREFIX);
        Structures.def_csetf((SubLObject)formula_templates.$sym23$TEMPLATE_TOPIC_INTRO_TEMPLATE, (SubLObject)formula_templates.$sym24$_CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE);
        Structures.def_csetf((SubLObject)formula_templates.$sym25$TEMPLATE_TOPIC_SOURCE_TYPES, (SubLObject)formula_templates.$sym26$_CSETF_TEMPLATE_TOPIC_SOURCE_TYPES);
        Structures.def_csetf((SubLObject)formula_templates.$sym27$TEMPLATE_TOPIC_SOURCE_MT, (SubLObject)formula_templates.$sym28$_CSETF_TEMPLATE_TOPIC_SOURCE_MT);
        Structures.def_csetf((SubLObject)formula_templates.$sym29$TEMPLATE_TOPIC_QUERY_MT, (SubLObject)formula_templates.$sym30$_CSETF_TEMPLATE_TOPIC_QUERY_MT);
        Structures.def_csetf((SubLObject)formula_templates.$sym31$TEMPLATE_TOPIC_DEFINITIONAL_MT, (SubLObject)formula_templates.$sym32$_CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT);
        Equality.identity((SubLObject)formula_templates.$sym0$TEMPLATE_TOPIC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), formula_templates.$dtp_template_topic$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym50$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_TOPIC_METHOD));
        cfasl.register_cfasl_guid_denoted_type_input_function(formula_templates.$cfasl_guid_opcode_template_topic$.getGlobalValue(), (SubLObject)formula_templates.$sym52$CFASL_INPUT_TEMPLATE_TOPIC);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), formula_templates.$dtp_arg_position_details$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym60$ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)formula_templates.$list61);
        Structures.def_csetf((SubLObject)formula_templates.$sym62$ARG_POSITION_DETAILS_ARGUMENT_POSITION, (SubLObject)formula_templates.$sym63$_CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION);
        Structures.def_csetf((SubLObject)formula_templates.$sym64$ARG_POSITION_DETAILS_ORDERING, (SubLObject)formula_templates.$sym65$_CSETF_ARG_POSITION_DETAILS_ORDERING);
        Structures.def_csetf((SubLObject)formula_templates.$sym66$ARG_POSITION_DETAILS_GLOSS, (SubLObject)formula_templates.$sym67$_CSETF_ARG_POSITION_DETAILS_GLOSS);
        Structures.def_csetf((SubLObject)formula_templates.$sym68$ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS, (SubLObject)formula_templates.$sym69$_CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS);
        Structures.def_csetf((SubLObject)formula_templates.$sym70$ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS, (SubLObject)formula_templates.$sym71$_CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS);
        Structures.def_csetf((SubLObject)formula_templates.$sym72$ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS, (SubLObject)formula_templates.$sym73$_CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS);
        Structures.def_csetf((SubLObject)formula_templates.$sym74$ARG_POSITION_DETAILS_IS_EDITABLE, (SubLObject)formula_templates.$sym75$_CSETF_ARG_POSITION_DETAILS_IS_EDITABLE);
        Structures.def_csetf((SubLObject)formula_templates.$sym76$ARG_POSITION_DETAILS_EXPLANATION, (SubLObject)formula_templates.$sym77$_CSETF_ARG_POSITION_DETAILS_EXPLANATION);
        Structures.def_csetf((SubLObject)formula_templates.$sym78$ARG_POSITION_DETAILS_REQUIRES_VALIDATION, (SubLObject)formula_templates.$sym79$_CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION);
        Structures.def_csetf((SubLObject)formula_templates.$sym80$ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT, (SubLObject)formula_templates.$sym81$_CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT);
        Equality.identity((SubLObject)formula_templates.$sym53$ARG_POSITION_DETAILS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), formula_templates.$dtp_arg_position_details$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym92$VISIT_DEFSTRUCT_OBJECT_ARG_POSITION_DETAILS_METHOD));
        cfasl.register_cfasl_guid_denoted_type_input_function(formula_templates.$cfasl_guid_opcode_arg_position_details$.getGlobalValue(), (SubLObject)formula_templates.$sym94$CFASL_INPUT_ARG_POSITION_DETAILS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), formula_templates.$dtp_formula_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym102$FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)formula_templates.$list103);
        Structures.def_csetf((SubLObject)formula_templates.$sym104$FORMULA_TEMPLATE_TOPIC, (SubLObject)formula_templates.$sym105$_CSETF_FORMULA_TEMPLATE_TOPIC);
        Structures.def_csetf((SubLObject)formula_templates.$sym106$FORMULA_TEMPLATE_ID, (SubLObject)formula_templates.$sym107$_CSETF_FORMULA_TEMPLATE_ID);
        Structures.def_csetf((SubLObject)formula_templates.$sym108$FORMULA_TEMPLATE_FORMULA, (SubLObject)formula_templates.$sym109$_CSETF_FORMULA_TEMPLATE_FORMULA);
        Structures.def_csetf((SubLObject)formula_templates.$sym110$FORMULA_TEMPLATE_QUERY_SPECIFICATION, (SubLObject)formula_templates.$sym111$_CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION);
        Structures.def_csetf((SubLObject)formula_templates.$sym112$FORMULA_TEMPLATE_ELMT, (SubLObject)formula_templates.$sym113$_CSETF_FORMULA_TEMPLATE_ELMT);
        Structures.def_csetf((SubLObject)formula_templates.$sym114$FORMULA_TEMPLATE_FOCAL_TERM, (SubLObject)formula_templates.$sym115$_CSETF_FORMULA_TEMPLATE_FOCAL_TERM);
        Structures.def_csetf((SubLObject)formula_templates.$sym116$FORMULA_TEMPLATE_ARGPOS_DETAILS, (SubLObject)formula_templates.$sym117$_CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS);
        Structures.def_csetf((SubLObject)formula_templates.$sym118$FORMULA_TEMPLATE_ARGPOS_ORDERING, (SubLObject)formula_templates.$sym119$_CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING);
        Structures.def_csetf((SubLObject)formula_templates.$sym120$FORMULA_TEMPLATE_EXAMPLES, (SubLObject)formula_templates.$sym121$_CSETF_FORMULA_TEMPLATE_EXAMPLES);
        Structures.def_csetf((SubLObject)formula_templates.$sym122$FORMULA_TEMPLATE_ENTRY_FORMAT, (SubLObject)formula_templates.$sym123$_CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT);
        Structures.def_csetf((SubLObject)formula_templates.$sym124$FORMULA_TEMPLATE_FOLLOW_UPS, (SubLObject)formula_templates.$sym125$_CSETF_FORMULA_TEMPLATE_FOLLOW_UPS);
        Structures.def_csetf((SubLObject)formula_templates.$sym126$FORMULA_TEMPLATE_GLOSS, (SubLObject)formula_templates.$sym127$_CSETF_FORMULA_TEMPLATE_GLOSS);
        Structures.def_csetf((SubLObject)formula_templates.$sym128$FORMULA_TEMPLATE_REFSPEC, (SubLObject)formula_templates.$sym129$_CSETF_FORMULA_TEMPLATE_REFSPEC);
        Equality.identity((SubLObject)formula_templates.$sym95$FORMULA_TEMPLATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), formula_templates.$dtp_formula_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym142$VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_METHOD));
        cfasl.register_cfasl_guid_denoted_type_input_function(formula_templates.$cfasl_guid_opcode_formula_template$.getGlobalValue(), (SubLObject)formula_templates.$sym144$CFASL_INPUT_FORMULA_TEMPLATE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), formula_templates.$dtp_template_topic$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym199$CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), formula_templates.$dtp_formula_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym244$CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), formula_templates.$dtp_arg_position_details$.getGlobalValue(), Symbols.symbol_function((SubLObject)formula_templates.$sym269$CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD));
        memoization_state.note_memoized_function((SubLObject)formula_templates.$sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE);
        memoization_state.note_globally_cached_function((SubLObject)formula_templates.$sym408$MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK);
        return (SubLObject)formula_templates.NIL;
    }
    
    public void declareFunctions() {
        declare_formula_templates_file();
    }
    
    public void initializeVariables() {
        init_formula_templates_file();
    }
    
    public void runTopLevelForms() {
        setup_formula_templates_file();
    }
    
    static {
        me = (SubLFile)new formula_templates();
        formula_templates.$dtp_template_topic$ = null;
        formula_templates.$cfasl_guid_opcode_template_topic$ = null;
        formula_templates.$dtp_arg_position_details$ = null;
        formula_templates.$cfasl_guid_opcode_arg_position_details$ = null;
        formula_templates.$dtp_formula_template$ = null;
        formula_templates.$cfasl_guid_opcode_formula_template$ = null;
        formula_templates.$make_ftemplate_loading_supporting_ask_browsableP$ = null;
        formula_templates.$non_editable_assertions_for_template_topic_instance$ = null;
        formula_templates.$xml_suppress_future_template_extensions$ = null;
        formula_templates.$xml_template_topic_revisions$ = null;
        formula_templates.$formula_template_dtd_uri$ = null;
        formula_templates.$high_to_low_priorities$ = null;
        formula_templates.$warn_on_template_topic_validation_only$ = null;
        formula_templates.$template_count_mt$ = null;
        formula_templates.$xml_template_topic_assertions_revisions$ = null;
        formula_templates.$quaternary_fet_evaluation_pred$ = null;
        formula_templates.$map_elmt_to_published_conceptual_work_caching_state$ = null;
        formula_templates.$unique_variables_list_for_formula_templates$ = null;
        formula_templates.$elmt_variable_for_formula_templates$ = null;
        formula_templates.$get_assertions_from_initial_askP$ = null;
        formula_templates.$ftemplate_constraint_to_collection_skiplist$ = null;
        $sym0$TEMPLATE_TOPIC = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC");
        $sym1$TEMPLATE_TOPIC_P = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SUPERTOPIC"), SubLObjectFactory.makeSymbol("TOPIC"), SubLObjectFactory.makeSymbol("SUBTOPICS"), SubLObjectFactory.makeSymbol("TEMPLATES"), SubLObjectFactory.makeSymbol("ORDERING"), SubLObjectFactory.makeSymbol("TITLE"), SubLObjectFactory.makeSymbol("TERM-PREFIX"), SubLObjectFactory.makeSymbol("INTRO-TEMPLATE"), SubLObjectFactory.makeSymbol("SOURCE-TYPES"), SubLObjectFactory.makeSymbol("SOURCE-MT"), SubLObjectFactory.makeSymbol("QUERY-MT"), SubLObjectFactory.makeSymbol("DEFINITIONAL-MT") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUPERTOPIC"), SubLObjectFactory.makeKeyword("TOPIC"), SubLObjectFactory.makeKeyword("SUBTOPICS"), SubLObjectFactory.makeKeyword("TEMPLATES"), SubLObjectFactory.makeKeyword("ORDERING"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeKeyword("TERM-PREFIX"), SubLObjectFactory.makeKeyword("INTRO-TEMPLATE"), SubLObjectFactory.makeKeyword("SOURCE-TYPES"), SubLObjectFactory.makeKeyword("SOURCE-MT"), SubLObjectFactory.makeKeyword("QUERY-MT"), SubLObjectFactory.makeKeyword("DEFINITIONAL-MT") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SUPERTOPIC"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TOPIC"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SUBTOPICS"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TEMPLATES"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-ORDERING"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TITLE"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TERM-PREFIX"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-INTRO-TEMPLATE"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SOURCE-TYPES"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SOURCE-MT"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-QUERY-MT"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-DEFINITIONAL-MT") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SUPERTOPIC"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TOPIC"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SUBTOPICS"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TEMPLATES"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-ORDERING"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TITLE"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TERM-PREFIX"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-MT"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-QUERY-MT"), SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT") });
        $sym6$PRINT_TEMPLATE_TOPIC = SubLObjectFactory.makeSymbol("PRINT-TEMPLATE-TOPIC");
        $sym7$TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-P"));
        $sym9$TEMPLATE_TOPIC_SUPERTOPIC = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SUPERTOPIC");
        $sym10$_CSETF_TEMPLATE_TOPIC_SUPERTOPIC = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SUPERTOPIC");
        $sym11$TEMPLATE_TOPIC_TOPIC = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TOPIC");
        $sym12$_CSETF_TEMPLATE_TOPIC_TOPIC = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TOPIC");
        $sym13$TEMPLATE_TOPIC_SUBTOPICS = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SUBTOPICS");
        $sym14$_CSETF_TEMPLATE_TOPIC_SUBTOPICS = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SUBTOPICS");
        $sym15$TEMPLATE_TOPIC_TEMPLATES = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TEMPLATES");
        $sym16$_CSETF_TEMPLATE_TOPIC_TEMPLATES = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TEMPLATES");
        $sym17$TEMPLATE_TOPIC_ORDERING = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-ORDERING");
        $sym18$_CSETF_TEMPLATE_TOPIC_ORDERING = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-ORDERING");
        $sym19$TEMPLATE_TOPIC_TITLE = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TITLE");
        $sym20$_CSETF_TEMPLATE_TOPIC_TITLE = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TITLE");
        $sym21$TEMPLATE_TOPIC_TERM_PREFIX = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-TERM-PREFIX");
        $sym22$_CSETF_TEMPLATE_TOPIC_TERM_PREFIX = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-TERM-PREFIX");
        $sym23$TEMPLATE_TOPIC_INTRO_TEMPLATE = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-INTRO-TEMPLATE");
        $sym24$_CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE");
        $sym25$TEMPLATE_TOPIC_SOURCE_TYPES = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SOURCE-TYPES");
        $sym26$_CSETF_TEMPLATE_TOPIC_SOURCE_TYPES = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES");
        $sym27$TEMPLATE_TOPIC_SOURCE_MT = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-SOURCE-MT");
        $sym28$_CSETF_TEMPLATE_TOPIC_SOURCE_MT = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-MT");
        $sym29$TEMPLATE_TOPIC_QUERY_MT = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-QUERY-MT");
        $sym30$_CSETF_TEMPLATE_TOPIC_QUERY_MT = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-QUERY-MT");
        $sym31$TEMPLATE_TOPIC_DEFINITIONAL_MT = SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-DEFINITIONAL-MT");
        $sym32$_CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT = SubLObjectFactory.makeSymbol("_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT");
        $kw33$SUPERTOPIC = SubLObjectFactory.makeKeyword("SUPERTOPIC");
        $kw34$TOPIC = SubLObjectFactory.makeKeyword("TOPIC");
        $kw35$SUBTOPICS = SubLObjectFactory.makeKeyword("SUBTOPICS");
        $kw36$TEMPLATES = SubLObjectFactory.makeKeyword("TEMPLATES");
        $kw37$ORDERING = SubLObjectFactory.makeKeyword("ORDERING");
        $kw38$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $kw39$TERM_PREFIX = SubLObjectFactory.makeKeyword("TERM-PREFIX");
        $kw40$INTRO_TEMPLATE = SubLObjectFactory.makeKeyword("INTRO-TEMPLATE");
        $kw41$SOURCE_TYPES = SubLObjectFactory.makeKeyword("SOURCE-TYPES");
        $kw42$SOURCE_MT = SubLObjectFactory.makeKeyword("SOURCE-MT");
        $kw43$QUERY_MT = SubLObjectFactory.makeKeyword("QUERY-MT");
        $kw44$DEFINITIONAL_MT = SubLObjectFactory.makeKeyword("DEFINITIONAL-MT");
        $str45$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw46$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym47$MAKE_TEMPLATE_TOPIC = SubLObjectFactory.makeSymbol("MAKE-TEMPLATE-TOPIC");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_TEMPLATE_TOPIC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEMPLATE-TOPIC-METHOD");
        $str51$18287931_d871_11d9_8eef_0002b3891 = SubLObjectFactory.makeString("18287931-d871-11d9-8eef-0002b3891c5a");
        $sym52$CFASL_INPUT_TEMPLATE_TOPIC = SubLObjectFactory.makeSymbol("CFASL-INPUT-TEMPLATE-TOPIC");
        $sym53$ARG_POSITION_DETAILS = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS");
        $sym54$ARG_POSITION_DETAILS_P = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-P");
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARGUMENT-POSITION"), SubLObjectFactory.makeSymbol("ORDERING"), SubLObjectFactory.makeSymbol("GLOSS"), SubLObjectFactory.makeSymbol("INVISIBLE-REPLACEMENT-POSITIONS"), SubLObjectFactory.makeSymbol("REPLACEMENT-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENTS"), SubLObjectFactory.makeSymbol("IS-EDITABLE"), SubLObjectFactory.makeSymbol("EXPLANATION"), SubLObjectFactory.makeSymbol("REQUIRES-VALIDATION"), SubLObjectFactory.makeSymbol("UNKNOWN-REPLACEMENT") });
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ARGUMENT-POSITION"), SubLObjectFactory.makeKeyword("ORDERING"), SubLObjectFactory.makeKeyword("GLOSS"), SubLObjectFactory.makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS"), SubLObjectFactory.makeKeyword("REPLACEMENT-CONSTRAINTS"), SubLObjectFactory.makeKeyword("CANDIDATE-REPLACEMENTS"), SubLObjectFactory.makeKeyword("IS-EDITABLE"), SubLObjectFactory.makeKeyword("EXPLANATION"), SubLObjectFactory.makeKeyword("REQUIRES-VALIDATION"), SubLObjectFactory.makeKeyword("UNKNOWN-REPLACEMENT") });
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-ARGUMENT-POSITION"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-ORDERING"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-GLOSS"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-IS-EDITABLE"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-EXPLANATION"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-REQUIRES-VALIDATION"), SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT") });
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-ORDERING"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-GLOSS"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-EXPLANATION"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION"), SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT") });
        $sym59$PRINT_ARG_POSITION_DETAILS = SubLObjectFactory.makeSymbol("PRINT-ARG-POSITION-DETAILS");
        $sym60$ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-PRINT-FUNCTION-TRAMPOLINE");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-P"));
        $sym62$ARG_POSITION_DETAILS_ARGUMENT_POSITION = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-ARGUMENT-POSITION");
        $sym63$_CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION");
        $sym64$ARG_POSITION_DETAILS_ORDERING = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-ORDERING");
        $sym65$_CSETF_ARG_POSITION_DETAILS_ORDERING = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-ORDERING");
        $sym66$ARG_POSITION_DETAILS_GLOSS = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-GLOSS");
        $sym67$_CSETF_ARG_POSITION_DETAILS_GLOSS = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-GLOSS");
        $sym68$ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS");
        $sym69$_CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS");
        $sym70$ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS");
        $sym71$_CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS");
        $sym72$ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS");
        $sym73$_CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS");
        $sym74$ARG_POSITION_DETAILS_IS_EDITABLE = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-IS-EDITABLE");
        $sym75$_CSETF_ARG_POSITION_DETAILS_IS_EDITABLE = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE");
        $sym76$ARG_POSITION_DETAILS_EXPLANATION = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-EXPLANATION");
        $sym77$_CSETF_ARG_POSITION_DETAILS_EXPLANATION = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-EXPLANATION");
        $sym78$ARG_POSITION_DETAILS_REQUIRES_VALIDATION = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-REQUIRES-VALIDATION");
        $sym79$_CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION");
        $sym80$ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT = SubLObjectFactory.makeSymbol("ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT");
        $sym81$_CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT = SubLObjectFactory.makeSymbol("_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT");
        $kw82$ARGUMENT_POSITION = SubLObjectFactory.makeKeyword("ARGUMENT-POSITION");
        $kw83$GLOSS = SubLObjectFactory.makeKeyword("GLOSS");
        $kw84$INVISIBLE_REPLACEMENT_POSITIONS = SubLObjectFactory.makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS");
        $kw85$REPLACEMENT_CONSTRAINTS = SubLObjectFactory.makeKeyword("REPLACEMENT-CONSTRAINTS");
        $kw86$CANDIDATE_REPLACEMENTS = SubLObjectFactory.makeKeyword("CANDIDATE-REPLACEMENTS");
        $kw87$IS_EDITABLE = SubLObjectFactory.makeKeyword("IS-EDITABLE");
        $kw88$EXPLANATION = SubLObjectFactory.makeKeyword("EXPLANATION");
        $kw89$REQUIRES_VALIDATION = SubLObjectFactory.makeKeyword("REQUIRES-VALIDATION");
        $kw90$UNKNOWN_REPLACEMENT = SubLObjectFactory.makeKeyword("UNKNOWN-REPLACEMENT");
        $sym91$MAKE_ARG_POSITION_DETAILS = SubLObjectFactory.makeSymbol("MAKE-ARG-POSITION-DETAILS");
        $sym92$VISIT_DEFSTRUCT_OBJECT_ARG_POSITION_DETAILS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ARG-POSITION-DETAILS-METHOD");
        $str93$182a9c10_d871_11d9_8eef_0002b3891 = SubLObjectFactory.makeString("182a9c10-d871-11d9-8eef-0002b3891c5a");
        $sym94$CFASL_INPUT_ARG_POSITION_DETAILS = SubLObjectFactory.makeSymbol("CFASL-INPUT-ARG-POSITION-DETAILS");
        $sym95$FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE");
        $sym96$FORMULA_TEMPLATE_P = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-P");
        $list97 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TOPIC"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("QUERY-SPECIFICATION"), SubLObjectFactory.makeSymbol("ELMT"), SubLObjectFactory.makeSymbol("FOCAL-TERM"), SubLObjectFactory.makeSymbol("ARGPOS-DETAILS"), SubLObjectFactory.makeSymbol("ARGPOS-ORDERING"), SubLObjectFactory.makeSymbol("EXAMPLES"), SubLObjectFactory.makeSymbol("ENTRY-FORMAT"), SubLObjectFactory.makeSymbol("FOLLOW-UPS"), SubLObjectFactory.makeSymbol("GLOSS"), SubLObjectFactory.makeSymbol("REFSPEC") });
        $list98 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TOPIC"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("QUERY-SPECIFICATION"), SubLObjectFactory.makeKeyword("ELMT"), SubLObjectFactory.makeKeyword("FOCAL-TERM"), SubLObjectFactory.makeKeyword("ARGPOS-DETAILS"), SubLObjectFactory.makeKeyword("ARGPOS-ORDERING"), SubLObjectFactory.makeKeyword("EXAMPLES"), SubLObjectFactory.makeKeyword("ENTRY-FORMAT"), SubLObjectFactory.makeKeyword("FOLLOW-UPS"), SubLObjectFactory.makeKeyword("GLOSS"), SubLObjectFactory.makeKeyword("REFSPEC") });
        $list99 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-TOPIC"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ID"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-FORMULA"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-QUERY-SPECIFICATION"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ELMT"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-FOCAL-TERM"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ARGPOS-DETAILS"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ARGPOS-ORDERING"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EXAMPLES"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ENTRY-FORMAT"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-FOLLOW-UPS"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-GLOSS"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-REFSPEC") });
        $list100 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-TOPIC"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ID"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-FORMULA"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ELMT"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-FOCAL-TERM"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EXAMPLES"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-GLOSS"), SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-REFSPEC") });
        $sym101$PRINT_FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("PRINT-FORMULA-TEMPLATE");
        $sym102$FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-P"));
        $sym104$FORMULA_TEMPLATE_TOPIC = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-TOPIC");
        $sym105$_CSETF_FORMULA_TEMPLATE_TOPIC = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-TOPIC");
        $sym106$FORMULA_TEMPLATE_ID = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ID");
        $sym107$_CSETF_FORMULA_TEMPLATE_ID = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ID");
        $sym108$FORMULA_TEMPLATE_FORMULA = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-FORMULA");
        $sym109$_CSETF_FORMULA_TEMPLATE_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-FORMULA");
        $sym110$FORMULA_TEMPLATE_QUERY_SPECIFICATION = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-QUERY-SPECIFICATION");
        $sym111$_CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION");
        $sym112$FORMULA_TEMPLATE_ELMT = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ELMT");
        $sym113$_CSETF_FORMULA_TEMPLATE_ELMT = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ELMT");
        $sym114$FORMULA_TEMPLATE_FOCAL_TERM = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-FOCAL-TERM");
        $sym115$_CSETF_FORMULA_TEMPLATE_FOCAL_TERM = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-FOCAL-TERM");
        $sym116$FORMULA_TEMPLATE_ARGPOS_DETAILS = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ARGPOS-DETAILS");
        $sym117$_CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS");
        $sym118$FORMULA_TEMPLATE_ARGPOS_ORDERING = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ARGPOS-ORDERING");
        $sym119$_CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING");
        $sym120$FORMULA_TEMPLATE_EXAMPLES = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EXAMPLES");
        $sym121$_CSETF_FORMULA_TEMPLATE_EXAMPLES = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EXAMPLES");
        $sym122$FORMULA_TEMPLATE_ENTRY_FORMAT = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-ENTRY-FORMAT");
        $sym123$_CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT");
        $sym124$FORMULA_TEMPLATE_FOLLOW_UPS = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-FOLLOW-UPS");
        $sym125$_CSETF_FORMULA_TEMPLATE_FOLLOW_UPS = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS");
        $sym126$FORMULA_TEMPLATE_GLOSS = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-GLOSS");
        $sym127$_CSETF_FORMULA_TEMPLATE_GLOSS = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-GLOSS");
        $sym128$FORMULA_TEMPLATE_REFSPEC = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-REFSPEC");
        $sym129$_CSETF_FORMULA_TEMPLATE_REFSPEC = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-REFSPEC");
        $kw130$ID = SubLObjectFactory.makeKeyword("ID");
        $kw131$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw132$QUERY_SPECIFICATION = SubLObjectFactory.makeKeyword("QUERY-SPECIFICATION");
        $kw133$ELMT = SubLObjectFactory.makeKeyword("ELMT");
        $kw134$FOCAL_TERM = SubLObjectFactory.makeKeyword("FOCAL-TERM");
        $kw135$ARGPOS_DETAILS = SubLObjectFactory.makeKeyword("ARGPOS-DETAILS");
        $kw136$ARGPOS_ORDERING = SubLObjectFactory.makeKeyword("ARGPOS-ORDERING");
        $kw137$EXAMPLES = SubLObjectFactory.makeKeyword("EXAMPLES");
        $kw138$ENTRY_FORMAT = SubLObjectFactory.makeKeyword("ENTRY-FORMAT");
        $kw139$FOLLOW_UPS = SubLObjectFactory.makeKeyword("FOLLOW-UPS");
        $kw140$REFSPEC = SubLObjectFactory.makeKeyword("REFSPEC");
        $sym141$MAKE_FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("MAKE-FORMULA-TEMPLATE");
        $sym142$VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-METHOD");
        $str143$182b1140_d871_11d9_8eef_0002b3891 = SubLObjectFactory.makeString("182b1140-d871-11d9-8eef-0002b3891c5a");
        $sym144$CFASL_INPUT_FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("CFASL-INPUT-FORMULA-TEMPLATE");
        $sym145$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*"), (SubLObject)formula_templates.T));
        $kw147$CYC_RKF = SubLObjectFactory.makeKeyword("CYC-RKF");
        $sym148$REUSING_RKF_SD_PROBLEM_STORE = SubLObjectFactory.makeSymbol("REUSING-RKF-SD-PROBLEM-STORE");
        $sym149$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-EDITABLES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym151$_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE_ = SubLObjectFactory.makeSymbol("*NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE*");
        $sym152$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-P"));
        $const154$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const155$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELMT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym157$NON_EDITABLE = SubLObjectFactory.makeUninternedSymbol("NON-EDITABLE");
        $sym158$COMPUTE_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE = SubLObjectFactory.makeSymbol("COMPUTE-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
        $sym159$WITH_KNOWN_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE = SubLObjectFactory.makeSymbol("WITH-KNOWN-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
        $str160$_S_is_not_a_FORMULA_TEMPLATE_P_ = SubLObjectFactory.makeString("~S is not a FORMULA-TEMPLATE-P.");
        $str161$_S_is_not_EL_FORMULA_P_ = SubLObjectFactory.makeString("~S is not EL-FORMULA-P.");
        $str162$_S_is_not_POSSIBLY_MT_P_ = SubLObjectFactory.makeString("~S is not POSSIBLY-MT-P.");
        $str163$bad_formula_template___S__ = SubLObjectFactory.makeString("bad formula template: ~S~%");
        $sym164$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym165$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym166$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str167$_TemplateTopic__ = SubLObjectFactory.makeString("<TemplateTopic: ");
        $str168$Parent___S___Topic___S_ = SubLObjectFactory.makeString("Parent: ~S : Topic: ~S ");
        $str169$_named_ = SubLObjectFactory.makeString(" named ");
        $str170$_Term_Prefix__ = SubLObjectFactory.makeString(" Term Prefix: ");
        $str171$___SubTopics__ = SubLObjectFactory.makeString(" : SubTopics: ");
        $str172$___Sources__ = SubLObjectFactory.makeString(" : Sources: ");
        $str173$___Template_Source_Mt__ = SubLObjectFactory.makeString(" : Template Source Mt: ");
        $str174$___Template_Query_Mt__ = SubLObjectFactory.makeString(" : Template Query Mt: ");
        $str175$___Template_Definitional_Mt__ = SubLObjectFactory.makeString(" : Template Definitional Mt: ");
        $str176$___Templates_ = SubLObjectFactory.makeString(" : Templates:");
        $str177$____introductory_template__ = SubLObjectFactory.makeString(" (= introductory template) ");
        $str178$_ = SubLObjectFactory.makeString(">");
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym180$XML_TAG = SubLObjectFactory.makeSymbol("XML-TAG");
        $list181 = ConsesLow.list((SubLObject)formula_templates.NIL, (SubLObject)formula_templates.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-NAMESPACE")));
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCL-QUERY-INCLUDE-NAMESPACE?*"), (SubLObject)SubLObjectFactory.makeSymbol("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCML-INCLUDE-NAMESPACE?*"), (SubLObject)SubLObjectFactory.makeSymbol("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*")));
        $list183 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)formula_templates.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Adds support for default namespace")), (SubLObject)ConsesLow.list((SubLObject)formula_templates.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Adds <templateTopicRevision> to <templateTopic>")), (SubLObject)ConsesLow.list((SubLObject)formula_templates.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Initial version")));
        $str184$templateTopic = SubLObjectFactory.makeString("templateTopic");
        $str185$templateTopicRevision = SubLObjectFactory.makeString("templateTopicRevision");
        $str186$topic = SubLObjectFactory.makeString("topic");
        $str187$superTopic = SubLObjectFactory.makeString("superTopic");
        $str188$title = SubLObjectFactory.makeString("title");
        $str189$termPrefix = SubLObjectFactory.makeString("termPrefix");
        $str190$introductoryTemplate = SubLObjectFactory.makeString("introductoryTemplate");
        $str191$subTopics = SubLObjectFactory.makeString("subTopics");
        $str192$subTopic = SubLObjectFactory.makeString("subTopic");
        $str193$sourcesOfTopic = SubLObjectFactory.makeString("sourcesOfTopic");
        $str194$sourceOfTopic = SubLObjectFactory.makeString("sourceOfTopic");
        $str195$templateSourceMt = SubLObjectFactory.makeString("templateSourceMt");
        $str196$templateQueryMt = SubLObjectFactory.makeString("templateQueryMt");
        $str197$templateDefinitionalMt = SubLObjectFactory.makeString("templateDefinitionalMt");
        $str198$formulaTemplates = SubLObjectFactory.makeString("formulaTemplates");
        $sym199$CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-TEMPLATE-TOPIC-METHOD");
        $sym200$VALID_FORMULA_TEMPLATE_P = SubLObjectFactory.makeSymbol("VALID-FORMULA-TEMPLATE-P");
        $str201$CFASL_INPUT_TEMPLATE_TOPIC_has_lo = SubLObjectFactory.makeString("CFASL-INPUT-TEMPLATE-TOPIC has loaded a subtopic for ~A which claims to belong to ~A");
        $const202$SingleAssertionEntry = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleAssertionEntry"));
        $const203$MultipleAssertionEntry = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultipleAssertionEntry"));
        $str204$_Formula_Template__ = SubLObjectFactory.makeString("<Formula Template: ");
        $str205$_A_ = SubLObjectFactory.makeString("~A ");
        $str206$of_topic__A__ = SubLObjectFactory.makeString("of topic ~A~%");
        $str207$_formula__A_in__A__ = SubLObjectFactory.makeString(" formula ~A in ~A~%");
        $str208$_query_spec__A_in__A__ = SubLObjectFactory.makeString(" query-spec ~A in ~A~%");
        $str209$_focal_term__A___A___ = SubLObjectFactory.makeString(" focal term ~A (~A)~%");
        $str210$_focal_term_occurrences__A___A___ = SubLObjectFactory.makeString(" focal term occurrences ~A (~A)~%");
        $str211$_examples___A__ = SubLObjectFactory.makeString(" examples: ~A~%");
        $str212$_follow_ups___A__ = SubLObjectFactory.makeString(" follow-ups: ~A~%");
        $str213$_template_gloss___A__ = SubLObjectFactory.makeString(" template gloss: ~A~%");
        $str214$_reformulation_specification___A_ = SubLObjectFactory.makeString(" reformulation specification: ~A~%");
        $str215$_argpos_details__ = SubLObjectFactory.makeString(" argpos-details: ");
        $str216$_ = SubLObjectFactory.makeString(" ");
        $sym217$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym218$ISA_MT_ = SubLObjectFactory.makeSymbol("ISA-MT?");
        $sym219$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym220$NEW_CYCL_QUERY_SPECIFICATION_P = SubLObjectFactory.makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-P");
        $str221$formulaTemplate = SubLObjectFactory.makeString("formulaTemplate");
        $str222$id = SubLObjectFactory.makeString("id");
        $str223$formula = SubLObjectFactory.makeString("formula");
        $str224$elmt = SubLObjectFactory.makeString("elmt");
        $str225$focalTerm = SubLObjectFactory.makeString("focalTerm");
        $str226$argPositions = SubLObjectFactory.makeString("argPositions");
        $str227$singleEntry = SubLObjectFactory.makeString("singleEntry");
        $kw228$ATOMIC = SubLObjectFactory.makeKeyword("ATOMIC");
        $str229$multipleEntry = SubLObjectFactory.makeString("multipleEntry");
        $str230$usageExamples = SubLObjectFactory.makeString("usageExamples");
        $str231$example = SubLObjectFactory.makeString("example");
        $str232$glossForTemplate = SubLObjectFactory.makeString("glossForTemplate");
        $str233$followUps = SubLObjectFactory.makeString("followUps");
        $str234$followUp = SubLObjectFactory.makeString("followUp");
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CONNECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("LOAD-MT"));
        $str236$templateId = SubLObjectFactory.makeString("templateId");
        $str237$connective = SubLObjectFactory.makeString("connective");
        $str238$loadMt = SubLObjectFactory.makeString("loadMt");
        $str239$reformulationSpecification = SubLObjectFactory.makeString("reformulationSpecification");
        $str240$argumentPositionDetails = SubLObjectFactory.makeString("argumentPositionDetails");
        $str241$http___dev_cyc_com_dtd_formulatem = SubLObjectFactory.makeString("http://dev.cyc.com/dtd/formulatemplate.dtd");
        $str242$__xml_version__1_0__encoding__US_ = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"US-ASCII\" standalone=\"no\"?>");
        $str243$__DOCTYPE_formulaTemplate_SYSTEM_ = SubLObjectFactory.makeString("<!DOCTYPE formulaTemplate SYSTEM ~S>");
        $sym244$CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-FORMULA-TEMPLATE-METHOD");
        $str245$__ArgPos_Details__ = SubLObjectFactory.makeString("#<ArgPos-Details: ");
        $str246$_for_position__A_ = SubLObjectFactory.makeString(" for position ~A ");
        $str247$__ordering_slot__D_ = SubLObjectFactory.makeString(" (ordering slot ~D)");
        $str248$__no_ordering_info_ = SubLObjectFactory.makeString(" (no ordering info)");
        $str249$_READ_ONLY = SubLObjectFactory.makeString(" READ-ONLY");
        $str250$_gloss___A__ = SubLObjectFactory.makeString(" gloss: ~A~%");
        $str251$_replacementInvisible___A__ = SubLObjectFactory.makeString(" replacementInvisible: ~A~%");
        $str252$_candidate_replacements___A__ = SubLObjectFactory.makeString(" candidate replacements: ~A~%");
        $str253$_constraints___A__ = SubLObjectFactory.makeString(" constraints: ~A~%");
        $str254$__requires_validation____ = SubLObjectFactory.makeString(" [requires validation] ~%");
        $str255$_explanation___A__ = SubLObjectFactory.makeString(" explanation: ~A~%");
        $str256$_term_for_unknown___A__ = SubLObjectFactory.makeString(" term for unknown: ~A~%");
        $str257$argumentPositionDetail = SubLObjectFactory.makeString("argumentPositionDetail");
        $str258$ordering = SubLObjectFactory.makeString("ordering");
        $str259$glossText = SubLObjectFactory.makeString("glossText");
        $str260$candidateReplacementsForPosition = SubLObjectFactory.makeString("candidateReplacementsForPosition");
        $str261$candidateReplacementForPosition = SubLObjectFactory.makeString("candidateReplacementForPosition");
        $str262$templateReplacementsInvisibleForP = SubLObjectFactory.makeString("templateReplacementsInvisibleForPosition");
        $str263$isEditable = SubLObjectFactory.makeString("isEditable");
        $str264$validationRequired = SubLObjectFactory.makeString("validationRequired");
        $str265$explanation = SubLObjectFactory.makeString("explanation");
        $str266$unknownTermForTemplatePosition = SubLObjectFactory.makeString("unknownTermForTemplatePosition");
        $str267$constraintsOnReplacement = SubLObjectFactory.makeString("constraintsOnReplacement");
        $str268$constraintOnReplacement = SubLObjectFactory.makeString("constraintOnReplacement");
        $sym269$CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-ARG-POSITION-DETAILS-METHOD");
        $str270$argPosition = SubLObjectFactory.makeString("argPosition");
        $str271$position = SubLObjectFactory.makeString("position");
        $sym272$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $str273$Can_t_load_a_formula_template_wit = SubLObjectFactory.makeString("Can't load a formula template without a FORT id: ~S");
        $const274$formulaTemplateHasArgumentPositio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasArgumentPositionInformation"));
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOSS-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("ARGPOS"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERING"));
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPLANATION-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("ARGPOS"));
        $list277 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGPOS"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACE-CONSTRAINTS"));
        $list278 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGPOS"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"));
        $list279 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGPOS"), (SubLObject)SubLObjectFactory.makeSymbol("THING"));
        $sym280$ORDERED_BY_ARGUMENT_POSITION = SubLObjectFactory.makeSymbol("ORDERED-BY-ARGUMENT-POSITION");
        $sym281$_ = SubLObjectFactory.makeSymbol("<");
        $sym282$POSSIBLY_FO_REPRESENTED_TERM_P = SubLObjectFactory.makeSymbol("POSSIBLY-FO-REPRESENTED-TERM-P");
        $str283$Dwimming_MT_for__A_to__A____your_ = SubLObjectFactory.makeString("Dwimming MT for ~A to ~A -- your own fault.");
        $list284 = ConsesLow.list((SubLObject)formula_templates.TWO_INTEGER);
        $const285$reformulateTemplateViaSpecificati = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulateTemplateViaSpecification"));
        $const286$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $const287$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySpecificationForFormulaTemplate"));
        $const288$formulaForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaForFormulaTemplate"));
        $const289$assertMtForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertMtForFormulaTemplate"));
        $const290$formulaTemplateFollowUp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateFollowUp"));
        $sym291$COMMUTATIVE_RELATION_ = SubLObjectFactory.makeSymbol("COMMUTATIVE-RELATION?");
        $sym292$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list293 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOLLOW-UP"), (SubLObject)SubLObjectFactory.makeSymbol("CONNECTIVE"));
        $const294$formulaTemplateGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $kw295$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list296 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarSecond")));
        $const297$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $list298 = ConsesLow.list((SubLObject)formula_templates.FOUR_INTEGER, (SubLObject)formula_templates.THREE_INTEGER, (SubLObject)formula_templates.FIVE_INTEGER);
        $const299$glossForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("glossForFormulaTemplate"));
        $list300 = ConsesLow.list((SubLObject)formula_templates.FOUR_INTEGER, (SubLObject)formula_templates.THREE_INTEGER);
        $const301$formulaTemplateArgExplanation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateArgExplanation"));
        $const302$formulaTemplateExample = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateExample"));
        $sym303$GET_VARIABLE = SubLObjectFactory.makeSymbol("GET-VARIABLE");
        $const304$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $kw305$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw306$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw307$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw308$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw309$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw310$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw311$HL = SubLObjectFactory.makeKeyword("HL");
        $const312$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym313$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const314$focalTermPositionForFormulaTempla = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("focalTermPositionForFormulaTemplate"));
        $const315$assertionFormatForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionFormatForFormulaTemplate"));
        $const316$templateReplacementsInvisibleForP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("templateReplacementsInvisibleForPosition"));
        $list317 = ConsesLow.list((SubLObject)formula_templates.TWO_INTEGER, (SubLObject)formula_templates.THREE_INTEGER);
        $const318$constraintOnReplacement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constraintOnReplacement"));
        $list319 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"));
        $const320$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $sym321$_X = SubLObjectFactory.makeSymbol("?X");
        $const322$unknownTermForTemplatePosition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownTermForTemplatePosition"));
        $const323$candidateReplacementForPosition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateReplacementForPosition"));
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"));
        $const325$positionInFormulaTemplateIsReplac = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("positionInFormulaTemplateIsReplaceable"));
        $const326$validationRequiredOnTemplatePosit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("validationRequiredOnTemplatePosition"));
        $const327$InducedFormulaTemplateTopicType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InducedFormulaTemplateTopicType"));
        $sym328$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym329$HIGHER_PRIORITY_ = SubLObjectFactory.makeSymbol("HIGHER-PRIORITY?");
        $sym330$FORT_SORT_PRED = SubLObjectFactory.makeSymbol("FORT-SORT-PRED");
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("LOWER"));
        $str332$higherPriorityTemplateTypeForTopi = SubLObjectFactory.makeString("higherPriorityTemplateTypeForTopicType");
        $list333 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $sym334$_HIGHER = SubLObjectFactory.makeSymbol("?HIGHER");
        $sym335$_LOWER = SubLObjectFactory.makeSymbol("?LOWER");
        $list336 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)formula_templates.ZERO_INTEGER);
        $const337$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list338 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("higherPriorityTemplateType")), (SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $list339 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $const340$formulaTemplateTypeHasTopicType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateTypeHasTopicType"));
        $list341 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)formula_templates.ONE_INTEGER);
        $const342$higherPriorityTemplateForType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("higherPriorityTemplateForType"));
        $sym343$STABLE_TEMPLATE_ID_COMPARE = SubLObjectFactory.makeSymbol("STABLE-TEMPLATE-ID-COMPARE");
        $sym344$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym345$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str346$Invalid_formula_template__A_in_to = SubLObjectFactory.makeString("Invalid formula template ~A in topic ~A: template topic query mt ~A cannot see formula template mt ~A");
        $str347$FactivoreTab = SubLObjectFactory.makeString("FactivoreTab");
        $const348$FormulaTemplateTopicType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplateTopicType"));
        $const349$FirstOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection"));
        $sym350$_TEMPLATE = SubLObjectFactory.makeSymbol("?TEMPLATE");
        $const351$formulaTemplateHasType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasType"));
        $const352$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym353$_ = SubLObjectFactory.makeSymbol(">");
        $sym354$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE = SubLObjectFactory.makeSymbol("COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE");
        $list355 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)formula_templates.ONE_INTEGER);
        $sym356$_SUBTOPIC = SubLObjectFactory.makeSymbol("?SUBTOPIC");
        $kw357$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw358$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $sym359$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const360$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $list361 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VOCABULARY-MT"));
        $list362 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt-Vocabulary")), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?VOCABULARY-MT")));
        $const363$DataForNLMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DataForNLMt"));
        $sym364$FORT_OR_NAUT_P = SubLObjectFactory.makeSymbol("FORT-OR-NAUT-P");
        $const365$sourcesForTopic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourcesForTopic"));
        $const366$focalTermIntroduction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("focalTermIntroduction"));
        $const367$titleForFormulaTemplateType_Strin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleForFormulaTemplateType-String"));
        $const368$templateTopicPrefix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("templateTopicPrefix"));
        $const369$queryMtForTopicAssertions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryMtForTopicAssertions"));
        $const370$definitionalMtForTopicAssertions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definitionalMtForTopicAssertions"));
        $sym371$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $list372 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)formula_templates.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Adds support for default namespace")), (SubLObject)ConsesLow.list((SubLObject)formula_templates.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Adds <templateTopicAssertionsRevision> to <knownAssertionsForTemplateTopic>\n          Adds <knownAssertionSUIDs> to <knownAssertion>\n          Adds <assertion-id> to <knownAssertionSUIDs>\n          Adds <bookkeeping-info> to <knownAssertion>\n          Adds <date> to <bookkeeping-info>\n          Adds <time> to <bookkeeping-info>\n          Adds <knownAssertionEvaluations> to <knownAssertion>\n          Adds <knownAssertionEvaluation> to <knownAssertionEvaluations>\n          Adds <evaluator> to <knownAssertionEvaluation>\n          Adds <judgment> to <knownAssertionEvaluation>")), (SubLObject)ConsesLow.list((SubLObject)formula_templates.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Initial version")));
        $str373$knownAssertionsForTemplateTopic = SubLObjectFactory.makeString("knownAssertionsForTemplateTopic");
        $str374$queryELMt = SubLObjectFactory.makeString("queryELMt");
        $str375$templateInstance = SubLObjectFactory.makeString("templateInstance");
        $str376$templateTopicAssertionsRevision = SubLObjectFactory.makeString("templateTopicAssertionsRevision");
        $str377$knownAssertionsForTemplateSubTopi = SubLObjectFactory.makeString("knownAssertionsForTemplateSubTopics");
        $list378 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTOPIC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT-SETS"));
        $str379$knownAssertionsForTemplateSubTopi = SubLObjectFactory.makeString("knownAssertionsForTemplateSubTopic");
        $str380$knownAssertionsForFormulaTemplate = SubLObjectFactory.makeString("knownAssertionsForFormulaTemplates");
        $list381 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"));
        $str382$knownAssertionsForFormulaTemplate = SubLObjectFactory.makeString("knownAssertionsForFormulaTemplate");
        $str383$assertionsMatchTemplate = SubLObjectFactory.makeString("assertionsMatchTemplate");
        $str384$knownAssertions = SubLObjectFactory.makeString("knownAssertions");
        $str385$Problem_serializing_assertions_fo = SubLObjectFactory.makeString("Problem serializing assertions for ");
        $sym386$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $str387$Invalid_return_object_ = SubLObjectFactory.makeString("Invalid return object ");
        $str388$_in_assertion_list = SubLObjectFactory.makeString(" in assertion list");
        $str389$knownAssertion = SubLObjectFactory.makeString("knownAssertion");
        $str390$deducedAssertion = SubLObjectFactory.makeString("deducedAssertion");
        $str391$knownAssertionSUIDs = SubLObjectFactory.makeString("knownAssertionSUIDs");
        $str392$knownAssertionEvaluations = SubLObjectFactory.makeString("knownAssertionEvaluations");
        $list393 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVALUATION"), (SubLObject)SubLObjectFactory.makeSymbol("EVALUATOR"));
        $str394$knownAssertionEvaluation = SubLObjectFactory.makeString("knownAssertionEvaluation");
        $str395$evaluator = SubLObjectFactory.makeString("evaluator");
        $str396$judgment = SubLObjectFactory.makeString("judgment");
        $str397$evaluationOfAssertionByOn = SubLObjectFactory.makeString("evaluationOfAssertionByOn");
        $str398$evaluationOfAssertionOfByOn = SubLObjectFactory.makeString("evaluationOfAssertionOfByOn");
        $list399 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("?BY"));
        $sym400$_EVAL = SubLObjectFactory.makeSymbol("?EVAL");
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?BY"), (SubLObject)SubLObjectFactory.makeSymbol("??ON"));
        $list402 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym403$_JUDGMENT = SubLObjectFactory.makeSymbol("?JUDGMENT");
        $const404$evaluationOutputSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationOutputSentences"));
        $list405 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?JUDGMENT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE")));
        $str406$knownAssertionELMt = SubLObjectFactory.makeString("knownAssertionELMt");
        $str407$knownAssertionCW = SubLObjectFactory.makeString("knownAssertionCW");
        $sym408$MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK = SubLObjectFactory.makeSymbol("MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK");
        $kw409$PCW = SubLObjectFactory.makeKeyword("PCW");
        $const410$contextOfPCW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contextOfPCW"));
        $sym411$_MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-CACHING-STATE*");
        $list412 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("?A"), SubLObjectFactory.makeSymbol("?B"), SubLObjectFactory.makeSymbol("?C"), SubLObjectFactory.makeSymbol("?D"), SubLObjectFactory.makeSymbol("?E"), SubLObjectFactory.makeSymbol("?F"), SubLObjectFactory.makeSymbol("?G"), SubLObjectFactory.makeSymbol("?H"), SubLObjectFactory.makeSymbol("?J"), SubLObjectFactory.makeSymbol("?K"), SubLObjectFactory.makeSymbol("?L"), SubLObjectFactory.makeSymbol("?M"), SubLObjectFactory.makeSymbol("?N"), SubLObjectFactory.makeSymbol("?O"), SubLObjectFactory.makeSymbol("?P"), SubLObjectFactory.makeSymbol("?Q"), SubLObjectFactory.makeSymbol("?R"), SubLObjectFactory.makeSymbol("?S"), SubLObjectFactory.makeSymbol("?T"), SubLObjectFactory.makeSymbol("?U"), SubLObjectFactory.makeSymbol("?V"), SubLObjectFactory.makeSymbol("?W"), SubLObjectFactory.makeSymbol("?X"), SubLObjectFactory.makeSymbol("?Y"), SubLObjectFactory.makeSymbol("?Z") });
        $sym413$_POLY_ELMT = SubLObjectFactory.makeSymbol("?POLY-ELMT");
        $const414$ist_Intermediate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Intermediate"));
        $const415$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $const416$RKFInteractionContextMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFInteractionContextMicrotheory"));
        $sym417$__REFSPEC = SubLObjectFactory.makeSymbol("??REFSPEC");
        $sym418$__ASSERTION = SubLObjectFactory.makeSymbol("??ASSERTION");
        $kw419$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw420$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw421$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float422$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $kw423$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw424$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw425$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $list426 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $sym427$DEDUCED_ASSERTION_ = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?");
        $sym428$EL_TERM_P = SubLObjectFactory.makeSymbol("EL-TERM-P");
        $sym429$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $kw430$POLY_CANONICALIZED = SubLObjectFactory.makeKeyword("POLY-CANONICALIZED");
        $sym431$FTEMPLATE_POLYCANONICALIZED_ASSERTION_P = SubLObjectFactory.makeSymbol("FTEMPLATE-POLYCANONICALIZED-ASSERTION-P");
        $const432$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const433$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list434 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST-PART"), (SubLObject)SubLObjectFactory.makeSymbol("MT-PART"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-PART"));
        $sym435$_FET_ASSERTION_VAR_524 = SubLObjectFactory.makeSymbol("?FET-ASSERTION-VAR-524");
        $list436 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES"));
        $const437$assertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $const438$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $const439$assertionProducedByReformulation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionProducedByReformulation"));
        $list440 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval"))));
        $const441$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $const442$SomeExampleFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleFn"));
        $const443$SomeExampleSpecFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleSpecFn"));
        $const444$defnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $const445$defnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $kw446$LEXICAL_MT = SubLObjectFactory.makeKeyword("LEXICAL-MT");
        $list447 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("LEXICAL-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalMicrotheory")));
        $const448$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
    }
    
    public static final class $template_topic_native extends SubLStructNative
    {
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
        
        public $template_topic_native() {
            this.$supertopic = (SubLObject)CommonSymbols.NIL;
            this.$topic = (SubLObject)CommonSymbols.NIL;
            this.$subtopics = (SubLObject)CommonSymbols.NIL;
            this.$templates = (SubLObject)CommonSymbols.NIL;
            this.$ordering = (SubLObject)CommonSymbols.NIL;
            this.$title = (SubLObject)CommonSymbols.NIL;
            this.$term_prefix = (SubLObject)CommonSymbols.NIL;
            this.$intro_template = (SubLObject)CommonSymbols.NIL;
            this.$source_types = (SubLObject)CommonSymbols.NIL;
            this.$source_mt = (SubLObject)CommonSymbols.NIL;
            this.$query_mt = (SubLObject)CommonSymbols.NIL;
            this.$definitional_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$template_topic_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$supertopic;
        }
        
        public SubLObject getField3() {
            return this.$topic;
        }
        
        public SubLObject getField4() {
            return this.$subtopics;
        }
        
        public SubLObject getField5() {
            return this.$templates;
        }
        
        public SubLObject getField6() {
            return this.$ordering;
        }
        
        public SubLObject getField7() {
            return this.$title;
        }
        
        public SubLObject getField8() {
            return this.$term_prefix;
        }
        
        public SubLObject getField9() {
            return this.$intro_template;
        }
        
        public SubLObject getField10() {
            return this.$source_types;
        }
        
        public SubLObject getField11() {
            return this.$source_mt;
        }
        
        public SubLObject getField12() {
            return this.$query_mt;
        }
        
        public SubLObject getField13() {
            return this.$definitional_mt;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$supertopic = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$topic = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$subtopics = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$templates = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$ordering = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$title = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$term_prefix = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$intro_template = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$source_types = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$source_mt = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$query_mt = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$definitional_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$template_topic_native.class, formula_templates.$sym0$TEMPLATE_TOPIC, formula_templates.$sym1$TEMPLATE_TOPIC_P, formula_templates.$list2, formula_templates.$list3, new String[] { "$supertopic", "$topic", "$subtopics", "$templates", "$ordering", "$title", "$term_prefix", "$intro_template", "$source_types", "$source_mt", "$query_mt", "$definitional_mt" }, formula_templates.$list4, formula_templates.$list5, formula_templates.$sym6$PRINT_TEMPLATE_TOPIC);
        }
    }
    
    public static final class $template_topic_p$UnaryFunction extends UnaryFunction
    {
        public $template_topic_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TEMPLATE-TOPIC-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return formula_templates.template_topic_p(arg1);
        }
    }
    
    public static final class $arg_position_details_native extends SubLStructNative
    {
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
        
        public $arg_position_details_native() {
            this.$argument_position = (SubLObject)CommonSymbols.NIL;
            this.$ordering = (SubLObject)CommonSymbols.NIL;
            this.$gloss = (SubLObject)CommonSymbols.NIL;
            this.$invisible_replacement_positions = (SubLObject)CommonSymbols.NIL;
            this.$replacement_constraints = (SubLObject)CommonSymbols.NIL;
            this.$candidate_replacements = (SubLObject)CommonSymbols.NIL;
            this.$is_editable = (SubLObject)CommonSymbols.NIL;
            this.$explanation = (SubLObject)CommonSymbols.NIL;
            this.$requires_validation = (SubLObject)CommonSymbols.NIL;
            this.$unknown_replacement = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$arg_position_details_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$argument_position;
        }
        
        public SubLObject getField3() {
            return this.$ordering;
        }
        
        public SubLObject getField4() {
            return this.$gloss;
        }
        
        public SubLObject getField5() {
            return this.$invisible_replacement_positions;
        }
        
        public SubLObject getField6() {
            return this.$replacement_constraints;
        }
        
        public SubLObject getField7() {
            return this.$candidate_replacements;
        }
        
        public SubLObject getField8() {
            return this.$is_editable;
        }
        
        public SubLObject getField9() {
            return this.$explanation;
        }
        
        public SubLObject getField10() {
            return this.$requires_validation;
        }
        
        public SubLObject getField11() {
            return this.$unknown_replacement;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$argument_position = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$ordering = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$gloss = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$invisible_replacement_positions = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$replacement_constraints = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$candidate_replacements = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$is_editable = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$explanation = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$requires_validation = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$unknown_replacement = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$arg_position_details_native.class, formula_templates.$sym53$ARG_POSITION_DETAILS, formula_templates.$sym54$ARG_POSITION_DETAILS_P, formula_templates.$list55, formula_templates.$list56, new String[] { "$argument_position", "$ordering", "$gloss", "$invisible_replacement_positions", "$replacement_constraints", "$candidate_replacements", "$is_editable", "$explanation", "$requires_validation", "$unknown_replacement" }, formula_templates.$list57, formula_templates.$list58, formula_templates.$sym59$PRINT_ARG_POSITION_DETAILS);
        }
    }
    
    public static final class $arg_position_details_p$UnaryFunction extends UnaryFunction
    {
        public $arg_position_details_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ARG-POSITION-DETAILS-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return formula_templates.arg_position_details_p(arg1);
        }
    }
    
    public static final class $formula_template_native extends SubLStructNative
    {
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
        
        public $formula_template_native() {
            this.$topic = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$query_specification = (SubLObject)CommonSymbols.NIL;
            this.$elmt = (SubLObject)CommonSymbols.NIL;
            this.$focal_term = (SubLObject)CommonSymbols.NIL;
            this.$argpos_details = (SubLObject)CommonSymbols.NIL;
            this.$argpos_ordering = (SubLObject)CommonSymbols.NIL;
            this.$examples = (SubLObject)CommonSymbols.NIL;
            this.$entry_format = (SubLObject)CommonSymbols.NIL;
            this.$follow_ups = (SubLObject)CommonSymbols.NIL;
            this.$gloss = (SubLObject)CommonSymbols.NIL;
            this.$refspec = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$formula_template_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$topic;
        }
        
        public SubLObject getField3() {
            return this.$id;
        }
        
        public SubLObject getField4() {
            return this.$formula;
        }
        
        public SubLObject getField5() {
            return this.$query_specification;
        }
        
        public SubLObject getField6() {
            return this.$elmt;
        }
        
        public SubLObject getField7() {
            return this.$focal_term;
        }
        
        public SubLObject getField8() {
            return this.$argpos_details;
        }
        
        public SubLObject getField9() {
            return this.$argpos_ordering;
        }
        
        public SubLObject getField10() {
            return this.$examples;
        }
        
        public SubLObject getField11() {
            return this.$entry_format;
        }
        
        public SubLObject getField12() {
            return this.$follow_ups;
        }
        
        public SubLObject getField13() {
            return this.$gloss;
        }
        
        public SubLObject getField14() {
            return this.$refspec;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$topic = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$query_specification = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$elmt = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$focal_term = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$argpos_details = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$argpos_ordering = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$examples = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$entry_format = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$follow_ups = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$gloss = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$refspec = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$formula_template_native.class, formula_templates.$sym95$FORMULA_TEMPLATE, formula_templates.$sym96$FORMULA_TEMPLATE_P, formula_templates.$list97, formula_templates.$list98, new String[] { "$topic", "$id", "$formula", "$query_specification", "$elmt", "$focal_term", "$argpos_details", "$argpos_ordering", "$examples", "$entry_format", "$follow_ups", "$gloss", "$refspec" }, formula_templates.$list99, formula_templates.$list100, formula_templates.$sym101$PRINT_FORMULA_TEMPLATE);
        }
    }
    
    public static final class $formula_template_p$UnaryFunction extends UnaryFunction
    {
        public $formula_template_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORMULA-TEMPLATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return formula_templates.formula_template_p(arg1);
        }
    }
}

/*

	Total time: 11549 ms
	 synthetic 
*/