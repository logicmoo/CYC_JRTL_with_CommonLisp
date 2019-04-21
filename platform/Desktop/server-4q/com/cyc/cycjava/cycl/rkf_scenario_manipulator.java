package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_scenario_manipulator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_scenario_manipulator";
    public static final String myFingerPrint = "3b16380b785db21b3a35e50275a64a20fb615d4442a29e8689abd808eba5524d";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1023L)
    private static SubLSymbol $sm_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2718L)
    private static SubLSymbol $sm_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2843L)
    private static SubLSymbol $sm_index$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLSymbol $dtp_sm_scenario$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLSymbol $dtp_sm_template$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLSymbol $dtp_sm_indexical_record$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLSymbol $dtp_sm_constraint_record$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLSymbol $dtp_sm_merge_info$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLSymbol $dtp_sm_gen_point$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 34177L)
    private static SubLSymbol $sm_indexical_numbered_phrases$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 42194L)
    private static SubLSymbol $sm_semantic_mt$;
    private static final SubLString $str0$Scenario_Manipulator_Lock;
    private static final SubLSymbol $sym1$WITH_LOCK_HELD;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_SM_ISG_;
    private static final SubLSymbol $sym4$_SM_INDEX_;
    private static final SubLSymbol $sym5$SM_SCENARIO;
    private static final SubLSymbol $sym6$SM_SCENARIO_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym12$SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$SM_SCENARIO_ID;
    private static final SubLSymbol $sym15$_CSETF_SM_SCENARIO_ID;
    private static final SubLSymbol $sym16$SM_SCENARIO_SESSIONS;
    private static final SubLSymbol $sym17$_CSETF_SM_SCENARIO_SESSIONS;
    private static final SubLSymbol $sym18$SM_SCENARIO_PHRASE;
    private static final SubLSymbol $sym19$_CSETF_SM_SCENARIO_PHRASE;
    private static final SubLSymbol $sym20$SM_SCENARIO_CANDIDATE_TERMS;
    private static final SubLSymbol $sym21$_CSETF_SM_SCENARIO_CANDIDATE_TERMS;
    private static final SubLSymbol $sym22$SM_SCENARIO_CANDIDATE_CONSTRAINTS;
    private static final SubLSymbol $sym23$_CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS;
    private static final SubLSymbol $sym24$SM_SCENARIO_FORT;
    private static final SubLSymbol $sym25$_CSETF_SM_SCENARIO_FORT;
    private static final SubLSymbol $sym26$SM_SCENARIO_TERMS;
    private static final SubLSymbol $sym27$_CSETF_SM_SCENARIO_TERMS;
    private static final SubLSymbol $sym28$SM_SCENARIO_CONSTRAINTS;
    private static final SubLSymbol $sym29$_CSETF_SM_SCENARIO_CONSTRAINTS;
    private static final SubLSymbol $sym30$SM_SCENARIO_TEMPLATES;
    private static final SubLSymbol $sym31$_CSETF_SM_SCENARIO_TEMPLATES;
    private static final SubLSymbol $sym32$SM_SCENARIO_STATE;
    private static final SubLSymbol $sym33$_CSETF_SM_SCENARIO_STATE;
    private static final SubLSymbol $kw34$ID;
    private static final SubLSymbol $kw35$SESSIONS;
    private static final SubLSymbol $kw36$PHRASE;
    private static final SubLSymbol $kw37$CANDIDATE_TERMS;
    private static final SubLSymbol $kw38$CANDIDATE_CONSTRAINTS;
    private static final SubLSymbol $kw39$FORT;
    private static final SubLSymbol $kw40$TERMS;
    private static final SubLSymbol $kw41$CONSTRAINTS;
    private static final SubLSymbol $kw42$TEMPLATES;
    private static final SubLSymbol $kw43$STATE;
    private static final SubLString $str44$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw45$BEGIN;
    private static final SubLSymbol $sym46$MAKE_SM_SCENARIO;
    private static final SubLSymbol $kw47$SLOT;
    private static final SubLSymbol $kw48$END;
    private static final SubLSymbol $sym49$VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD;
    private static final SubLSymbol $sym50$STRINGP;
    private static final SubLSymbol $sym51$FORT_P;
    private static final SubLSymbol $sym52$SM_INDEXICAL_RECORD_P;
    private static final SubLSymbol $sym53$SM_CONSTRAINT_RECORD_P;
    private static final SubLSymbol $sym54$SM_TEMPLATE_P;
    private static final SubLSymbol $kw55$BORROWED_INDEXICALS;
    private static final SubLSymbol $kw56$MEMOIZATION_STATE;
    private static final SubLSymbol $kw57$UNINITIALIZED;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$MEMOIZATION_STATE;
    private static final SubLSymbol $sym60$CLET;
    private static final SubLSymbol $sym61$SM_SCENARIO_MEMOIZATION_STATE;
    private static final SubLSymbol $sym62$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym63$SM_TEMPLATE;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$SM_TEMPLATE_ID;
    private static final SubLSymbol $sym71$_CSETF_SM_TEMPLATE_ID;
    private static final SubLSymbol $sym72$SM_TEMPLATE_SCENARIO;
    private static final SubLSymbol $sym73$_CSETF_SM_TEMPLATE_SCENARIO;
    private static final SubLSymbol $sym74$SM_TEMPLATE_PHRASE;
    private static final SubLSymbol $sym75$_CSETF_SM_TEMPLATE_PHRASE;
    private static final SubLSymbol $sym76$SM_TEMPLATE_EXPRESSION;
    private static final SubLSymbol $sym77$_CSETF_SM_TEMPLATE_EXPRESSION;
    private static final SubLSymbol $sym78$SM_TEMPLATE_PARAM_SUBS;
    private static final SubLSymbol $sym79$_CSETF_SM_TEMPLATE_PARAM_SUBS;
    private static final SubLSymbol $sym80$SM_TEMPLATE_PARAMETERS;
    private static final SubLSymbol $sym81$_CSETF_SM_TEMPLATE_PARAMETERS;
    private static final SubLSymbol $sym82$SM_TEMPLATE_CONSTRAINTS;
    private static final SubLSymbol $sym83$_CSETF_SM_TEMPLATE_CONSTRAINTS;
    private static final SubLSymbol $sym84$SM_TEMPLATE_STATE;
    private static final SubLSymbol $sym85$_CSETF_SM_TEMPLATE_STATE;
    private static final SubLSymbol $kw86$SCENARIO;
    private static final SubLSymbol $kw87$EXPRESSION;
    private static final SubLSymbol $kw88$PARAM_SUBS;
    private static final SubLSymbol $kw89$PARAMETERS;
    private static final SubLSymbol $sym90$MAKE_SM_TEMPLATE;
    private static final SubLSymbol $sym91$VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD;
    private static final SubLSymbol $sym92$LISTP;
    private static final SubLObject $const93$ScenarioInstanceFn;
    private static final SubLSymbol $sym94$NAUT_;
    private static final SubLSymbol $sym95$SM_SCENARIO_EXPRESSION_P;
    private static final SubLSymbol $sym96$SM_INDEXICAL_RECORD;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$SM_INDEXICAL_RECORD_ID;
    private static final SubLSymbol $sym104$_CSETF_SM_INDEXICAL_RECORD_ID;
    private static final SubLSymbol $sym105$SM_INDEXICAL_RECORD_INDEXICAL;
    private static final SubLSymbol $sym106$_CSETF_SM_INDEXICAL_RECORD_INDEXICAL;
    private static final SubLSymbol $sym107$SM_INDEXICAL_RECORD_PHRASES;
    private static final SubLSymbol $sym108$_CSETF_SM_INDEXICAL_RECORD_PHRASES;
    private static final SubLSymbol $sym109$SM_INDEXICAL_RECORD_VAR;
    private static final SubLSymbol $sym110$_CSETF_SM_INDEXICAL_RECORD_VAR;
    private static final SubLSymbol $sym111$SM_INDEXICAL_RECORD_EXPLICIT_ISAS;
    private static final SubLSymbol $sym112$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS;
    private static final SubLSymbol $sym113$SM_INDEXICAL_RECORD_EXPLICIT_GENLS;
    private static final SubLSymbol $sym114$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS;
    private static final SubLSymbol $sym115$SM_INDEXICAL_RECORD_ISAS;
    private static final SubLSymbol $sym116$_CSETF_SM_INDEXICAL_RECORD_ISAS;
    private static final SubLSymbol $sym117$SM_INDEXICAL_RECORD_GENLS;
    private static final SubLSymbol $sym118$_CSETF_SM_INDEXICAL_RECORD_GENLS;
    private static final SubLSymbol $sym119$SM_INDEXICAL_RECORD_STATE;
    private static final SubLSymbol $sym120$_CSETF_SM_INDEXICAL_RECORD_STATE;
    private static final SubLSymbol $kw121$INDEXICAL;
    private static final SubLSymbol $kw122$PHRASES;
    private static final SubLSymbol $kw123$VAR;
    private static final SubLSymbol $kw124$EXPLICIT_ISAS;
    private static final SubLSymbol $kw125$EXPLICIT_GENLS;
    private static final SubLSymbol $kw126$ISAS;
    private static final SubLSymbol $kw127$GENLS;
    private static final SubLSymbol $sym128$MAKE_SM_INDEXICAL_RECORD;
    private static final SubLSymbol $sym129$VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD;
    private static final SubLSymbol $sym130$SM_INDEXICAL_P;
    private static final SubLSymbol $sym131$EL_VAR_;
    private static final SubLObject $const132$TheNthFn;
    private static final SubLSymbol $sym133$INTEGERP;
    private static final SubLSymbol $sym134$SM_CONSTRAINT_RECORD;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLList $list137;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$SM_CONSTRAINT_RECORD_ID;
    private static final SubLSymbol $sym142$_CSETF_SM_CONSTRAINT_RECORD_ID;
    private static final SubLSymbol $sym143$SM_CONSTRAINT_RECORD_SENTENCE;
    private static final SubLSymbol $sym144$_CSETF_SM_CONSTRAINT_RECORD_SENTENCE;
    private static final SubLSymbol $sym145$SM_CONSTRAINT_RECORD_NL_SENTENCE;
    private static final SubLSymbol $sym146$_CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE;
    private static final SubLSymbol $kw147$SENTENCE;
    private static final SubLSymbol $kw148$NL_SENTENCE;
    private static final SubLSymbol $sym149$MAKE_SM_CONSTRAINT_RECORD;
    private static final SubLSymbol $sym150$VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD;
    private static final SubLSymbol $sym151$EL_FORMULA_P;
    private static final SubLSymbol $sym152$SM_MERGE_INFO;
    private static final SubLSymbol $sym153$SM_MERGE_INFO_P;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$SM_MERGE_INFO_ID;
    private static final SubLSymbol $sym161$_CSETF_SM_MERGE_INFO_ID;
    private static final SubLSymbol $sym162$SM_MERGE_INFO_FROM_SCENARIO;
    private static final SubLSymbol $sym163$_CSETF_SM_MERGE_INFO_FROM_SCENARIO;
    private static final SubLSymbol $sym164$SM_MERGE_INFO_TO_SCENARIO;
    private static final SubLSymbol $sym165$_CSETF_SM_MERGE_INFO_TO_SCENARIO;
    private static final SubLSymbol $sym166$SM_MERGE_INFO_ALIGN_TO;
    private static final SubLSymbol $sym167$_CSETF_SM_MERGE_INFO_ALIGN_TO;
    private static final SubLSymbol $sym168$SM_MERGE_INFO_ALIGN_FROM;
    private static final SubLSymbol $sym169$_CSETF_SM_MERGE_INFO_ALIGN_FROM;
    private static final SubLSymbol $sym170$SM_MERGE_INFO_INDEXICAL_EQUIVALENCES;
    private static final SubLSymbol $sym171$_CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES;
    private static final SubLSymbol $kw172$FROM_SCENARIO;
    private static final SubLSymbol $kw173$TO_SCENARIO;
    private static final SubLSymbol $kw174$ALIGN_TO;
    private static final SubLSymbol $kw175$ALIGN_FROM;
    private static final SubLSymbol $kw176$INDEXICAL_EQUIVALENCES;
    private static final SubLSymbol $sym177$MAKE_SM_MERGE_INFO;
    private static final SubLSymbol $sym178$VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD;
    private static final SubLSymbol $sym179$SM_GEN_POINT;
    private static final SubLSymbol $sym180$SM_GEN_POINT_P;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list186;
    private static final SubLSymbol $sym187$SM_GEN_POINT_ID;
    private static final SubLSymbol $sym188$_CSETF_SM_GEN_POINT_ID;
    private static final SubLSymbol $sym189$SM_GEN_POINT_NON_INDEXICAL;
    private static final SubLSymbol $sym190$_CSETF_SM_GEN_POINT_NON_INDEXICAL;
    private static final SubLSymbol $sym191$SM_GEN_POINT_ISAS;
    private static final SubLSymbol $sym192$_CSETF_SM_GEN_POINT_ISAS;
    private static final SubLSymbol $sym193$SM_GEN_POINT_GENLS;
    private static final SubLSymbol $sym194$_CSETF_SM_GEN_POINT_GENLS;
    private static final SubLSymbol $sym195$SM_GEN_POINT_POSITIONS;
    private static final SubLSymbol $sym196$_CSETF_SM_GEN_POINT_POSITIONS;
    private static final SubLSymbol $sym197$SM_GEN_POINT_INDEXICAL_RECORD;
    private static final SubLSymbol $sym198$_CSETF_SM_GEN_POINT_INDEXICAL_RECORD;
    private static final SubLSymbol $sym199$SM_GEN_POINT_KEYWORD;
    private static final SubLSymbol $sym200$_CSETF_SM_GEN_POINT_KEYWORD;
    private static final SubLSymbol $kw201$NON_INDEXICAL;
    private static final SubLSymbol $kw202$POSITIONS;
    private static final SubLSymbol $kw203$INDEXICAL_RECORD;
    private static final SubLSymbol $kw204$KEYWORD;
    private static final SubLSymbol $sym205$MAKE_SM_GEN_POINT;
    private static final SubLSymbol $sym206$VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD;
    private static final SubLString $str207$_SC;
    private static final SubLString $str208$the_kind_of_;
    private static final SubLObject $const209$The;
    private static final SubLSymbol $sym210$_;
    private static final SubLSymbol $sym211$GENERALITY_ESTIMATE;
    private static final SubLSymbol $kw212$ISA;
    private static final SubLList $list213;
    private static final SubLList $list214;
    private static final SubLString $str215$the_;
    private static final SubLString $str216$the_other_;
    private static final SubLString $str217$the_other_kind_of_;
    private static final SubLString $str218$_;
    private static final SubLString $str219$_kind_of_;
    private static final SubLObject $const220$Collection;
    private static final SubLSymbol $sym221$SM_INDEXICAL_RECORD_NUMBER;
    private static final SubLSymbol $sym222$CAR;
    private static final SubLObject $const223$scenarioTerms;
    private static final SubLObject $const224$scenarioReferent;
    private static final SubLObject $const225$scenarioConstraint;
    private static final SubLSymbol $kw226$IGNORE;
    private static final SubLSymbol $sym227$SM_SCENARIO_EXPRESSION_OK;
    private static final SubLSymbol $sym228$FIND_NART;
    private static final SubLSymbol $sym229$LIST;
    private static final SubLObject $const230$termTemplate;
    private static final SubLObject $const231$ScenarioTemplate;
    private static final SubLSymbol $sym232$_EXPR;
    private static final SubLObject $const233$Thing;
    private static final SubLObject $const234$and;
    private static final SubLObject $const235$isa;
    private static final SubLSymbol $sym236$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const237$EverythingPSC;
    private static final SubLString $str238$Cycl_formulas_containing__A_canno;
    private static final SubLString $str239$_A_unexpected_;
    private static final SubLSymbol $sym240$CYC_VAR_;
    private static final SubLObject $const241$not;
    private static final SubLSymbol $sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_;
    private static final SubLSymbol $sym243$STRING_EQUAL;
    private static final SubLObject $const244$different;
    private static final SubLSymbol $sym245$SM_INDEXICAL_RECORD_PREFERRED_PHRASE;
    private static final SubLSymbol $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED;
    private static final SubLSymbol $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED;
    private static final SubLSymbol $kw248$NON_WFF;
    private static final SubLSymbol $kw249$OK;
    private static final SubLSymbol $sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE;
    private static final SubLSymbol $sym251$SM_UNRESOLVED_EQUAL;
    private static final SubLObject $const252$TheResultOfParsing;
    private static final SubLList $list253;
    private static final SubLObject $const254$genls;
    private static final SubLList $list255;
    private static final SubLSymbol $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED;
    private static final SubLSymbol $sym257$ALIST_P;
    private static final SubLSymbol $sym258$SECOND;
    private static final SubLList $list259;
    private static final SubLSymbol $sym260$SM_GEN_POINT_WITHOUT_POSITIONS_P;
    private static final SubLSymbol $sym261$PUNCTUATION_P;
    private static final SubLObject $const262$OptionalSome;
    private static final SubLObject $const263$StringTemplate;
    private static final SubLObject $const264$NumberTemplate;
    private static final SubLObject $const265$SinkTemplate;
    private static final SubLSymbol $sym266$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const267$PropositionalConceptualWork;
    private static final SubLObject $const268$MovieTitleTemplate;
    private static final SubLObject $const269$Event;
    private static final SubLObject $const270$NPTemplate;
    private static final SubLObject $const271$SomethingExisting;
    private static final SubLObject $const272$RequireOne;
    private static final SubLObject $const273$OptionalOne;
    private static final SubLObject $const274$ParsingTemplateCategory;
    private static final SubLObject $const275$TemplateParsingMt;
    private static final SubLString $str276$_;
    private static final SubLString $str277$_;
    private static final SubLString $str278$Scenario;
    private static final SubLList $list279;
    private static final SubLObject $const280$quotedIsa;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$FIRST;
    private static final SubLSymbol $sym283$NART_EL_FORMULA;
    private static final SubLList $list284;
    private static final SubLList $list285;
    private static final SubLSymbol $sym286$CCONCATENATE;
    private static final SubLSymbol $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED;
    private static final SubLSymbol $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED;
    private static final SubLSymbol $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED;
    private static final SubLSymbol $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1242L)
    public static SubLObject with_sm_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_scenario_manipulator.$sym1$WITH_LOCK_HELD, (SubLObject)rkf_scenario_manipulator.$list2, ConsesLow.append(body, (SubLObject)rkf_scenario_manipulator.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1336L)
    public static SubLObject sm_find_scenario_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1502L)
    public static SubLObject sm_find_scenario_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject v_scenario = sm_find_scenario_by_id(id);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1663L)
    public static SubLObject sm_find_template_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1742L)
    public static SubLObject sm_find_template_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject template = sm_find_template_by_id(id);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1903L)
    public static SubLObject sm_find_indexical_record_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1990L)
    public static SubLObject sm_find_indexical_record_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject indexical_record = sm_find_indexical_record_by_id(id);
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2183L)
    public static SubLObject sm_find_constraint_record_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2271L)
    public static SubLObject sm_find_constraint_record_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject constraint_record = sm_find_constraint_record_by_id(id);
        return constraint_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2468L)
    public static SubLObject sm_find_merge_info_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2549L)
    public static SubLObject sm_find_merge_info_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject merge_info = sm_find_merge_info_by_id(id);
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2940L)
    public static SubLObject next_sm_id() {
        return integer_sequence_generator.integer_sequence_generator_next(rkf_scenario_manipulator.$sm_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3047L)
    public static SubLObject sm_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter(rkf_scenario_manipulator.$sm_index$.getGlobalValue(), id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3190L)
    public static SubLObject sm_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove(rkf_scenario_manipulator.$sm_index$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3320L)
    public static SubLObject sm_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup(rkf_scenario_manipulator.$sm_index$.getGlobalValue(), id, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sm_scenario_native.class) ? rkf_scenario_manipulator.T : rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_id(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_sessions(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_phrase(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_candidate_terms(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_candidate_constraints(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_fort(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_terms(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_constraints(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_templates(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject sm_scenario_state(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_sessions(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_phrase(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_candidate_terms(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_candidate_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_fort(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_terms(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_templates(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject _csetf_sm_scenario_state(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject make_sm_scenario(SubLObject arglist) {
        if (arglist == rkf_scenario_manipulator.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sm_scenario_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_manipulator.NIL, next = arglist; rkf_scenario_manipulator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw34$ID)) {
                _csetf_sm_scenario_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw35$SESSIONS)) {
                _csetf_sm_scenario_sessions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw36$PHRASE)) {
                _csetf_sm_scenario_phrase(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw37$CANDIDATE_TERMS)) {
                _csetf_sm_scenario_candidate_terms(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw38$CANDIDATE_CONSTRAINTS)) {
                _csetf_sm_scenario_candidate_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw39$FORT)) {
                _csetf_sm_scenario_fort(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw40$TERMS)) {
                _csetf_sm_scenario_terms(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw41$CONSTRAINTS)) {
                _csetf_sm_scenario_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw42$TEMPLATES)) {
                _csetf_sm_scenario_templates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw43$STATE)) {
                _csetf_sm_scenario_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject visit_defstruct_sm_scenario(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw45$BEGIN, (SubLObject)rkf_scenario_manipulator.$sym46$MAKE_SM_SCENARIO, (SubLObject)rkf_scenario_manipulator.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw34$ID, sm_scenario_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw35$SESSIONS, sm_scenario_sessions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw36$PHRASE, sm_scenario_phrase(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw37$CANDIDATE_TERMS, sm_scenario_candidate_terms(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw38$CANDIDATE_CONSTRAINTS, sm_scenario_candidate_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw39$FORT, sm_scenario_fort(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw40$TERMS, sm_scenario_terms(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw41$CONSTRAINTS, sm_scenario_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw42$TEMPLATES, sm_scenario_templates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw43$STATE, sm_scenario_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw48$END, (SubLObject)rkf_scenario_manipulator.$sym46$MAKE_SM_SCENARIO, (SubLObject)rkf_scenario_manipulator.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
    public static SubLObject visit_defstruct_object_sm_scenario_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_scenario(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4070L)
    public static SubLObject sm_new_scenario(SubLObject phrase, SubLObject fort, SubLObject session) {
        if (phrase == rkf_scenario_manipulator.UNPROVIDED) {
            phrase = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (fort == rkf_scenario_manipulator.UNPROVIDED) {
            fort = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (session == rkf_scenario_manipulator.UNPROVIDED) {
            session = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_scenario = make_sm_scenario((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        if (rkf_scenario_manipulator.NIL != phrase) {
            sm_set_scenario_phrase(v_scenario, phrase);
        }
        if (rkf_scenario_manipulator.NIL != fort) {
            sm_set_scenario_fort(v_scenario, fort);
        }
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL != session) {
                final SubLObject item_var = session;
                if (rkf_scenario_manipulator.NIL == conses_high.member(item_var, sm_scenario_sessions(v_scenario), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.IDENTITY))) {
                    _csetf_sm_scenario_sessions(v_scenario, (SubLObject)ConsesLow.cons(item_var, sm_scenario_sessions(v_scenario)));
                }
            }
            _csetf_sm_scenario_id(v_scenario, id);
            sm_add_object(id, v_scenario);
            _csetf_sm_scenario_state(v_scenario, dictionary.new_dictionary((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4573L)
    public static SubLObject sm_set_scenario_phrase(final SubLObject v_scenario, final SubLObject phrase) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != Types.stringp(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_phrase(v_scenario, phrase);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4787L)
    public static SubLObject sm_set_scenario_fort(final SubLObject v_scenario, final SubLObject fort) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != forts.fort_p(fort) : fort;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_fort(v_scenario, fort);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4987L)
    public static SubLObject sm_add_scenario_candidate_terms(final SubLObject v_scenario, final SubLObject indexical_records) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_add_scenario_candidate_term(v_scenario, indexical_record);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 5220L)
    public static SubLObject sm_add_scenario_candidate_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == Sequences.find(indexical_record, sm_scenario_candidate_terms(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                _csetf_sm_scenario_candidate_terms(v_scenario, ConsesLow.append(sm_scenario_candidate_terms(v_scenario), (SubLObject)ConsesLow.list(indexical_record)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 5638L)
    public static SubLObject sm_rem_scenario_candidate_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_candidate_terms(v_scenario, Sequences.remove(indexical_record, sm_scenario_candidate_terms(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            sm_cleanup_indexical_record(indexical_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 6012L)
    public static SubLObject sm_add_scenario_candidate_constraints(final SubLObject v_scenario, final SubLObject constraint_records) {
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_add_scenario_candidate_constraint(v_scenario, constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 6236L)
    public static SubLObject sm_add_scenario_candidate_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == Sequences.find(constraint_record, sm_scenario_candidate_constraints(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                _csetf_sm_scenario_candidate_constraints(v_scenario, ConsesLow.append(sm_scenario_candidate_constraints(v_scenario), (SubLObject)ConsesLow.list(constraint_record)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 6684L)
    public static SubLObject sm_rem_scenario_candidate_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_candidate_constraints(v_scenario, Sequences.remove(constraint_record, sm_scenario_candidate_constraints(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            sm_cleanup_constraint_record(constraint_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 7083L)
    public static SubLObject sm_add_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == Sequences.find(indexical_record, sm_scenario_terms(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                _csetf_sm_scenario_terms(v_scenario, ConsesLow.append(sm_scenario_terms(v_scenario), (SubLObject)ConsesLow.list(indexical_record)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 7463L)
    public static SubLObject sm_rem_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_terms(v_scenario, Sequences.remove(indexical_record, sm_scenario_terms(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            if (rkf_scenario_manipulator.NIL != sm_scenario_borrowed_indexical_p(v_scenario, indexical_record)) {
                sm_scenario_return_borrowed_indexical(v_scenario, indexical_record);
            }
            else {
                sm_cleanup_indexical_record(indexical_record);
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 8016L)
    public static SubLObject sm_add_scenario_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == Sequences.find(constraint_record, sm_scenario_constraints(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                _csetf_sm_scenario_constraints(v_scenario, ConsesLow.append(sm_scenario_constraints(v_scenario), (SubLObject)ConsesLow.list(constraint_record)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 8423L)
    public static SubLObject sm_rem_scenario_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_constraints(v_scenario, Sequences.remove(constraint_record, sm_scenario_constraints(v_scenario), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            sm_cleanup_constraint_record(constraint_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 8799L)
    public static SubLObject sm_add_scenario_template(final SubLObject v_scenario, final SubLObject template) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == Sequences.find(template, sm_scenario_templates(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                _csetf_sm_scenario_templates(v_scenario, ConsesLow.append(sm_scenario_templates(v_scenario), (SubLObject)ConsesLow.list(template)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 9153L)
    public static SubLObject sm_rem_scenario_template(final SubLObject v_scenario, final SubLObject template) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_scenario_templates(v_scenario, Sequences.remove(template, sm_scenario_templates(v_scenario), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            sm_cleanup_template(template);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 9461L)
    public static SubLObject sm_cleanup_scenario(final SubLObject v_scenario) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        final SubLObject id = sm_scenario_id(v_scenario);
        final SubLObject candidate_terms = sm_scenario_candidate_terms(v_scenario);
        final SubLObject candidate_constraints = sm_scenario_candidate_constraints(v_scenario);
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        final SubLObject templates = sm_scenario_templates(v_scenario);
        SubLObject cdolist_list_var = candidate_terms;
        SubLObject candidate_term = (SubLObject)rkf_scenario_manipulator.NIL;
        candidate_term = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_cleanup_indexical_record(candidate_term);
            cdolist_list_var = cdolist_list_var.rest();
            candidate_term = cdolist_list_var.first();
        }
        cdolist_list_var = candidate_constraints;
        SubLObject candidate_constraint = (SubLObject)rkf_scenario_manipulator.NIL;
        candidate_constraint = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_cleanup_constraint_record(candidate_constraint);
            cdolist_list_var = cdolist_list_var.rest();
            candidate_constraint = cdolist_list_var.first();
        }
        cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_cleanup_indexical_record(indexical_record);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_cleanup_constraint_record(constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        cdolist_list_var = templates;
        SubLObject template = (SubLObject)rkf_scenario_manipulator.NIL;
        template = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_cleanup_template(template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return sm_rem_object(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 10506L)
    public static SubLObject sm_scenario_note_borrowed_indexical(final SubLObject v_scenario, final SubLObject indexical) {
        final SubLObject state = sm_scenario_state(v_scenario);
        dictionary_utilities.dictionary_push(state, (SubLObject)rkf_scenario_manipulator.$kw55$BORROWED_INDEXICALS, indexical);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 10741L)
    public static SubLObject sm_scenario_borrowed_indexical_p(final SubLObject v_scenario, final SubLObject indexical) {
        final SubLObject state = sm_scenario_state(v_scenario);
        final SubLObject borrowed_indexicals = dictionary.dictionary_lookup(state, (SubLObject)rkf_scenario_manipulator.$kw55$BORROWED_INDEXICALS, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        return subl_promotions.memberP(indexical, borrowed_indexicals, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 10992L)
    public static SubLObject sm_scenario_return_borrowed_indexical(final SubLObject v_scenario, final SubLObject indexical) {
        final SubLObject state = sm_scenario_state(v_scenario);
        final SubLObject borrowed_indexicals = dictionary.dictionary_lookup(state, (SubLObject)rkf_scenario_manipulator.$kw55$BORROWED_INDEXICALS, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        Sequences.delete(indexical, borrowed_indexicals, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        dictionary.dictionary_enter(state, (SubLObject)rkf_scenario_manipulator.$kw55$BORROWED_INDEXICALS, borrowed_indexicals);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 11328L)
    public static SubLObject sm_scenario_memoization_state(final SubLObject v_scenario) {
        final SubLObject state = sm_scenario_state(v_scenario);
        SubLObject v_memoization_state = dictionary.dictionary_lookup(state, (SubLObject)rkf_scenario_manipulator.$kw56$MEMOIZATION_STATE, (SubLObject)rkf_scenario_manipulator.$kw57$UNINITIALIZED);
        if (v_memoization_state == rkf_scenario_manipulator.$kw57$UNINITIALIZED) {
            v_memoization_state = memoization_state.new_memoization_state((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            dictionary.dictionary_enter(state, (SubLObject)rkf_scenario_manipulator.$kw56$MEMOIZATION_STATE, v_memoization_state);
        }
        return v_memoization_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 11773L)
    public static SubLObject sm_scenario_clear_all_memoization_state(final SubLObject v_scenario) {
        memoization_state.clear_all_memoization(sm_scenario_memoization_state(v_scenario));
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 11928L)
    public static SubLObject with_scenario_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_scenario_manipulator.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_scenario = (SubLObject)rkf_scenario_manipulator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_scenario_manipulator.$list58);
        v_scenario = current.first();
        current = current.rest();
        if (rkf_scenario_manipulator.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject v_memoization_state = (SubLObject)rkf_scenario_manipulator.$sym59$MEMOIZATION_STATE;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_scenario_manipulator.$sym60$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)rkf_scenario_manipulator.$sym61$SM_SCENARIO_MEMOIZATION_STATE, v_scenario))), (SubLObject)ConsesLow.listS((SubLObject)rkf_scenario_manipulator.$sym62$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(v_memoization_state), ConsesLow.append(body, (SubLObject)rkf_scenario_manipulator.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_scenario_manipulator.$list58);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sm_template_native.class) ? rkf_scenario_manipulator.T : rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_id(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_scenario(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_phrase(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_expression(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_param_subs(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_parameters(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_constraints(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject sm_template_state(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_phrase(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_expression(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_param_subs(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_parameters(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject _csetf_sm_template_state(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject make_sm_template(SubLObject arglist) {
        if (arglist == rkf_scenario_manipulator.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sm_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_manipulator.NIL, next = arglist; rkf_scenario_manipulator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw34$ID)) {
                _csetf_sm_template_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw86$SCENARIO)) {
                _csetf_sm_template_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw36$PHRASE)) {
                _csetf_sm_template_phrase(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw87$EXPRESSION)) {
                _csetf_sm_template_expression(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw88$PARAM_SUBS)) {
                _csetf_sm_template_param_subs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw89$PARAMETERS)) {
                _csetf_sm_template_parameters(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw41$CONSTRAINTS)) {
                _csetf_sm_template_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw43$STATE)) {
                _csetf_sm_template_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject visit_defstruct_sm_template(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw45$BEGIN, (SubLObject)rkf_scenario_manipulator.$sym90$MAKE_SM_TEMPLATE, (SubLObject)rkf_scenario_manipulator.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw34$ID, sm_template_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw86$SCENARIO, sm_template_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw36$PHRASE, sm_template_phrase(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw87$EXPRESSION, sm_template_expression(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw88$PARAM_SUBS, sm_template_param_subs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw89$PARAMETERS, sm_template_parameters(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw41$CONSTRAINTS, sm_template_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw43$STATE, sm_template_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw48$END, (SubLObject)rkf_scenario_manipulator.$sym90$MAKE_SM_TEMPLATE, (SubLObject)rkf_scenario_manipulator.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
    public static SubLObject visit_defstruct_object_sm_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_template(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12635L)
    public static SubLObject sm_new_template(final SubLObject v_scenario) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        final SubLObject template = make_sm_template((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_template_scenario(template, v_scenario);
            _csetf_sm_template_id(template, id);
            _csetf_sm_template_state(template, dictionary.new_dictionary((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            sm_add_object(id, template);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13036L)
    public static SubLObject sm_set_template_expression(final SubLObject template, final SubLObject template_expr) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        assert rkf_scenario_manipulator.NIL != Types.listp(template_expr) : template_expr;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_template_expression(template, template_expr);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13327L)
    public static SubLObject sm_set_template_param_subs(final SubLObject template, final SubLObject param_subs) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        assert rkf_scenario_manipulator.NIL != Types.listp(param_subs) : param_subs;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_template_param_subs(template, param_subs);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13621L)
    public static SubLObject sm_set_template_parameters(final SubLObject template, final SubLObject parameters) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        assert rkf_scenario_manipulator.NIL != Types.listp(parameters) : parameters;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_template_parameters(template, parameters);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13849L)
    public static SubLObject sm_set_template_phrase(final SubLObject template, final SubLObject phrase) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        assert rkf_scenario_manipulator.NIL != Types.stringp(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_template_phrase(template, phrase);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14125L)
    public static SubLObject sm_add_template_constraint(final SubLObject template, final SubLObject constraint_record) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_template_constraints(template, (SubLObject)ConsesLow.cons(constraint_record, sm_template_constraints(template)));
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14393L)
    public static SubLObject sm_cleanup_template(final SubLObject template) {
        assert rkf_scenario_manipulator.NIL != sm_template_p(template) : template;
        final SubLObject id = sm_template_id(template);
        final SubLObject success = sm_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14617L)
    public static SubLObject sm_scenario_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && rkf_scenario_manipulator.NIL != forts.fort_p(v_object.first()) && rkf_scenario_manipulator.NIL != sm_substitution_list_p(v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14859L)
    public static SubLObject sm_new_scenario_spec(final SubLObject fort, final SubLObject substitutions) {
        assert rkf_scenario_manipulator.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)ConsesLow.cons(fort, substitutions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15039L)
    public static SubLObject sm_scenario_spec_fort(final SubLObject scenario_spec) {
        return scenario_spec.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15123L)
    public static SubLObject sm_scenario_spec_substitutions(final SubLObject scenario_spec) {
        return scenario_spec.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15216L)
    public static SubLObject sm_substitution_list_p(final SubLObject v_object) {
        if (v_object.isCons() && rkf_scenario_manipulator.NIL != v_object) {
            SubLObject cdolist_list_var = v_object;
            SubLObject elem = (SubLObject)rkf_scenario_manipulator.NIL;
            elem = cdolist_list_var.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
                if (rkf_scenario_manipulator.NIL == sm_substitution_p(elem)) {
                    return (SubLObject)rkf_scenario_manipulator.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
            return (SubLObject)rkf_scenario_manipulator.T;
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15586L)
    public static SubLObject sm_substitution_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_manipulator.NIL != list_utilities.doubletonP(v_object) && rkf_scenario_manipulator.NIL != sm_indexical_p(v_object.first()) && rkf_scenario_manipulator.NIL != sm_term_p(conses_high.cadr(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15734L)
    public static SubLObject sm_get_standin_for_indexical(final SubLObject substitution_list, final SubLObject indexical) {
        if (rkf_scenario_manipulator.NIL == sm_substitution_list_p(substitution_list) || rkf_scenario_manipulator.NIL == sm_indexical_p(indexical)) {
            return indexical;
        }
        return conses_high.second(conses_high.assoc(indexical, substitution_list, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16002L)
    public static SubLObject sm_scenario_expression_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().eql(rkf_scenario_manipulator.$const93$ScenarioInstanceFn) && rkf_scenario_manipulator.NIL != forts.fort_p(conses_high.second(v_object)) && rkf_scenario_manipulator.NIL != el_utilities.el_list_p(conses_high.third(v_object)) && rkf_scenario_manipulator.NIL != el_utilities.el_list_p(conses_high.fourth(v_object)) && rkf_scenario_manipulator.NIL == list_utilities.find_if_not(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym94$NAUT_), el_utilities.el_list_items(conses_high.fourth(v_object)), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16376L)
    public static SubLObject sm_scenario_expression_fort(final SubLObject scenario_expression) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_expression_p(scenario_expression) : scenario_expression;
        return conses_high.second(scenario_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16541L)
    public static SubLObject sm_scenario_expression_cyc_terms(final SubLObject scenario_expression) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_expression_p(scenario_expression) : scenario_expression;
        return el_utilities.el_list_items(conses_high.third(scenario_expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16726L)
    public static SubLObject sm_scenario_expression_indexical_nauts(final SubLObject scenario_expression) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_expression_p(scenario_expression) : scenario_expression;
        return el_utilities.el_list_items(conses_high.fourth(scenario_expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sm_indexical_record_native.class) ? rkf_scenario_manipulator.T : rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_id(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_indexical(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_phrases(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_var(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_explicit_isas(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_explicit_genls(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_isas(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_genls(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject sm_indexical_record_state(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_indexical(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_var(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_explicit_isas(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_explicit_genls(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_isas(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_genls(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject _csetf_sm_indexical_record_state(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject make_sm_indexical_record(SubLObject arglist) {
        if (arglist == rkf_scenario_manipulator.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sm_indexical_record_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_manipulator.NIL, next = arglist; rkf_scenario_manipulator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw34$ID)) {
                _csetf_sm_indexical_record_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw121$INDEXICAL)) {
                _csetf_sm_indexical_record_indexical(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw122$PHRASES)) {
                _csetf_sm_indexical_record_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw123$VAR)) {
                _csetf_sm_indexical_record_var(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw124$EXPLICIT_ISAS)) {
                _csetf_sm_indexical_record_explicit_isas(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw125$EXPLICIT_GENLS)) {
                _csetf_sm_indexical_record_explicit_genls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw126$ISAS)) {
                _csetf_sm_indexical_record_isas(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw127$GENLS)) {
                _csetf_sm_indexical_record_genls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw43$STATE)) {
                _csetf_sm_indexical_record_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject visit_defstruct_sm_indexical_record(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw45$BEGIN, (SubLObject)rkf_scenario_manipulator.$sym128$MAKE_SM_INDEXICAL_RECORD, (SubLObject)rkf_scenario_manipulator.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw34$ID, sm_indexical_record_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw121$INDEXICAL, sm_indexical_record_indexical(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw122$PHRASES, sm_indexical_record_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw123$VAR, sm_indexical_record_var(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw124$EXPLICIT_ISAS, sm_indexical_record_explicit_isas(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw125$EXPLICIT_GENLS, sm_indexical_record_explicit_genls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw126$ISAS, sm_indexical_record_isas(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw127$GENLS, sm_indexical_record_genls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw43$STATE, sm_indexical_record_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw48$END, (SubLObject)rkf_scenario_manipulator.$sym128$MAKE_SM_INDEXICAL_RECORD, (SubLObject)rkf_scenario_manipulator.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
    public static SubLObject visit_defstruct_object_sm_indexical_record_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_indexical_record(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 17678L)
    public static SubLObject sm_new_indexical_record(SubLObject indexical, SubLObject phrases, SubLObject isas, SubLObject v_genls) {
        if (indexical == rkf_scenario_manipulator.UNPROVIDED) {
            indexical = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (phrases == rkf_scenario_manipulator.UNPROVIDED) {
            phrases = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (isas == rkf_scenario_manipulator.UNPROVIDED) {
            isas = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (v_genls == rkf_scenario_manipulator.UNPROVIDED) {
            v_genls = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject indexical_record = make_sm_indexical_record((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_id(indexical_record, id);
            _csetf_sm_indexical_record_state(indexical_record, dictionary.new_dictionary((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            sm_add_object(id, indexical_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        if (rkf_scenario_manipulator.NIL != indexical) {
            sm_set_indexical_record_indexical(indexical_record, indexical);
        }
        if (rkf_scenario_manipulator.NIL != phrases) {
            sm_set_indexical_record_phrases(indexical_record, phrases);
        }
        if (rkf_scenario_manipulator.NIL != isas) {
            sm_update_indexical_record_explicit_isas(indexical_record, isas);
        }
        if (rkf_scenario_manipulator.NIL != v_genls) {
            sm_update_indexical_record_explicit_genls(indexical_record, v_genls);
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 18432L)
    public static SubLObject sm_set_indexical_record_indexical(final SubLObject indexical_record, final SubLObject indexical) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != sm_indexical_p(indexical) : indexical;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_indexical(indexical_record, indexical);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 18819L)
    public static SubLObject sm_set_indexical_record_phrases(final SubLObject indexical_record, final SubLObject phrases) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(phrases) : phrases;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_phrases(indexical_record, phrases);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 19088L)
    public static SubLObject sm_add_indexical_phrase(final SubLObject indexical_record, final SubLObject phrase) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.stringp(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == Sequences.find(phrase, sm_indexical_record_phrases(indexical_record), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUALP), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                _csetf_sm_indexical_record_phrases(indexical_record, ConsesLow.append(sm_indexical_record_phrases(indexical_record), (SubLObject)ConsesLow.list(phrase)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 19511L)
    public static SubLObject sm_rem_indexical_phrase(final SubLObject indexical_record, final SubLObject phrase) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.stringp(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_phrases(indexical_record, Sequences.remove(phrase, sm_indexical_record_phrases(indexical_record), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 19839L)
    public static SubLObject sm_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != cycl_variables.el_varP(var) : var;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_var(indexical_record, var);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20090L)
    public static SubLObject sm_set_indexical_record_explicit_isas(final SubLObject indexical_record, final SubLObject isas) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(isas) : isas;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_explicit_isas(indexical_record, isas);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20362L)
    public static SubLObject sm_set_indexical_record_explicit_genls(final SubLObject indexical_record, final SubLObject v_genls) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(v_genls) : v_genls;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_explicit_genls(indexical_record, v_genls);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20639L)
    public static SubLObject sm_set_indexical_record_isas(final SubLObject indexical_record, final SubLObject isas) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(isas) : isas;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_isas(indexical_record, isas);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20893L)
    public static SubLObject sm_set_indexical_record_genls(final SubLObject indexical_record, final SubLObject v_genls) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(v_genls) : v_genls;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_genls(indexical_record, v_genls);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 21152L)
    public static SubLObject sm_cleanup_indexical_record(final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        final SubLObject id = sm_indexical_record_id(indexical_record);
        final SubLObject success = sm_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 21424L)
    public static SubLObject sm_indexical_record_preferred_phrase(final SubLObject indexical_record) {
        return sm_indexical_record_phrases(indexical_record).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 21648L)
    public static SubLObject sm_copy_indexical_record_for_scenario(final SubLObject indexical_record, final SubLObject v_scenario) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        final SubLObject new_indexical_record = sm_new_indexical_record((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_id(new_indexical_record, id);
            _csetf_sm_indexical_record_indexical(new_indexical_record, sm_indexical_record_indexical(indexical_record));
            _csetf_sm_indexical_record_phrases(new_indexical_record, sm_indexical_record_phrases(indexical_record));
            _csetf_sm_indexical_record_explicit_isas(new_indexical_record, sm_indexical_record_explicit_isas(indexical_record));
            _csetf_sm_indexical_record_explicit_genls(new_indexical_record, sm_indexical_record_explicit_genls(indexical_record));
            _csetf_sm_indexical_record_isas(new_indexical_record, sm_indexical_record_isas(indexical_record));
            _csetf_sm_indexical_record_genls(new_indexical_record, sm_indexical_record_genls(indexical_record));
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return new_indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 22728L)
    public static SubLObject sm_indexical_record_type(final SubLObject indexical_record) {
        return sm_indexical_type(sm_indexical_record_indexical(indexical_record));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 22889L)
    public static SubLObject sm_indexical_record_number(final SubLObject indexical_record) {
        return sm_indexical_number(sm_indexical_record_indexical(indexical_record));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 23032L)
    public static SubLObject sm_update_indexical_record_explicit_isas(final SubLObject indexical_record, final SubLObject isas) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(isas) : isas;
        SubLObject current_explicit_isas = sm_indexical_record_explicit_isas(indexical_record);
        SubLObject current_isas = sm_indexical_record_isas(indexical_record);
        current_explicit_isas = Sequences.remove_duplicates(ConsesLow.nconc(isas, current_explicit_isas), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        current_isas = Sequences.remove_duplicates(ConsesLow.nconc(isas, current_isas), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        sm_set_indexical_record_explicit_isas(indexical_record, current_explicit_isas);
        sm_set_indexical_record_isas(indexical_record, current_isas);
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 23678L)
    public static SubLObject sm_update_indexical_record_explicit_genls(final SubLObject indexical_record, final SubLObject v_genls) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(v_genls) : v_genls;
        SubLObject current_explicit_genls = sm_indexical_record_explicit_genls(indexical_record);
        SubLObject current_genls = sm_indexical_record_genls(indexical_record);
        current_explicit_genls = Sequences.remove_duplicates(ConsesLow.nconc(v_genls, current_explicit_genls), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        current_genls = Sequences.remove_duplicates(ConsesLow.nconc(v_genls, current_genls), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        sm_set_indexical_record_explicit_genls(indexical_record, current_explicit_genls);
        sm_set_indexical_record_genls(indexical_record, current_genls);
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24340L)
    public static SubLObject sm_indexical_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_manipulator.NIL != nart_handles.nart_p(v_object) && cycl_utilities.nat_functor(v_object).eql(rkf_scenario_manipulator.$const132$TheNthFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24570L)
    public static SubLObject sm_new_indexical(final SubLObject type, final SubLObject number) {
        assert rkf_scenario_manipulator.NIL != forts.fort_p(type) : type;
        assert rkf_scenario_manipulator.NIL != Types.integerp(number) : number;
        return czer_main.cyc_find_or_create_nart(el_utilities.make_binary_formula(rkf_scenario_manipulator.$const132$TheNthFn, type, number), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24795L)
    public static SubLObject sm_indexical_type(final SubLObject indexical) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_p(indexical) : indexical;
        return cycl_utilities.nat_arg1(indexical, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24904L)
    public static SubLObject sm_indexical_number(final SubLObject indexical) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_p(indexical) : indexical;
        return cycl_utilities.nat_arg2(indexical, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25015L)
    public static SubLObject sm_indexical_of_scenarioP(final SubLObject v_term, final SubLObject v_scenario) {
        if (rkf_scenario_manipulator.NIL == sm_indexical_p(v_term)) {
            return (SubLObject)rkf_scenario_manipulator.NIL;
        }
        SubLObject cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (v_term.equal(sm_indexical_record_indexical(indexical_record))) {
                return (SubLObject)rkf_scenario_manipulator.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25288L)
    public static SubLObject sm_indexical_record_of_indexical(final SubLObject v_term, final SubLObject v_scenario) {
        assert rkf_scenario_manipulator.NIL != sm_indexical_p(v_term) : v_term;
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(v_scenario) : v_scenario;
        SubLObject cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (v_term.equal(sm_indexical_record_indexical(indexical_record))) {
                return indexical_record;
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject sm_constraint_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject sm_constraint_record_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sm_constraint_record_native.class) ? rkf_scenario_manipulator.T : rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject sm_constraint_record_id(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject sm_constraint_record_sentence(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject sm_constraint_record_nl_sentence(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject _csetf_sm_constraint_record_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject _csetf_sm_constraint_record_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject _csetf_sm_constraint_record_nl_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject make_sm_constraint_record(SubLObject arglist) {
        if (arglist == rkf_scenario_manipulator.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sm_constraint_record_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_manipulator.NIL, next = arglist; rkf_scenario_manipulator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw34$ID)) {
                _csetf_sm_constraint_record_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw147$SENTENCE)) {
                _csetf_sm_constraint_record_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw148$NL_SENTENCE)) {
                _csetf_sm_constraint_record_nl_sentence(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject visit_defstruct_sm_constraint_record(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw45$BEGIN, (SubLObject)rkf_scenario_manipulator.$sym149$MAKE_SM_CONSTRAINT_RECORD, (SubLObject)rkf_scenario_manipulator.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw34$ID, sm_constraint_record_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw147$SENTENCE, sm_constraint_record_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw148$NL_SENTENCE, sm_constraint_record_nl_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw48$END, (SubLObject)rkf_scenario_manipulator.$sym149$MAKE_SM_CONSTRAINT_RECORD, (SubLObject)rkf_scenario_manipulator.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
    public static SubLObject visit_defstruct_object_sm_constraint_record_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_constraint_record(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25806L)
    public static SubLObject sm_new_constraint_record(SubLObject sentence) {
        if (sentence == rkf_scenario_manipulator.UNPROVIDED) {
            sentence = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (rkf_scenario_manipulator.NIL != sentence && !rkf_scenario_manipulator.assertionsDisabledInClass && rkf_scenario_manipulator.NIL == el_utilities.el_formula_p(sentence)) {
            throw new AssertionError(sentence);
        }
        final SubLObject constraint_record = make_sm_constraint_record((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_id(constraint_record, id);
            if (rkf_scenario_manipulator.NIL != sentence) {
                _csetf_sm_constraint_record_sentence(constraint_record, sentence);
            }
            sm_add_object(id, constraint_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 26290L)
    public static SubLObject sm_set_constraint_record_sentence(final SubLObject constraint_record, final SubLObject sentence) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        assert rkf_scenario_manipulator.NIL != Types.listp(sentence) : sentence;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_sentence(constraint_record, sentence);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 26572L)
    public static SubLObject sm_set_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject nl_sentence) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        assert rkf_scenario_manipulator.NIL != Types.stringp(nl_sentence) : nl_sentence;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_nl_sentence(constraint_record, nl_sentence);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 26875L)
    public static SubLObject sm_rem_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject nl_sentence) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_nl_sentence(constraint_record, (SubLObject)rkf_scenario_manipulator.NIL);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27154L)
    public static SubLObject sm_cleanup_constraint_record(final SubLObject constraint_record) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        final SubLObject id = sm_constraint_record_id(constraint_record);
        final SubLObject success = sm_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27432L)
    public static SubLObject sm_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_manipulator.NIL != forts.fort_p(v_object) || rkf_scenario_manipulator.NIL != el_utilities.el_formula_p(v_object) || v_object.isString() || v_object.isNumber());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sm_merge_info_native.class) ? rkf_scenario_manipulator.T : rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_id(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_from_scenario(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_to_scenario(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_align_to(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_align_from(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject sm_merge_info_indexical_equivalences(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject _csetf_sm_merge_info_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject _csetf_sm_merge_info_from_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject _csetf_sm_merge_info_to_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject _csetf_sm_merge_info_align_to(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject _csetf_sm_merge_info_align_from(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject _csetf_sm_merge_info_indexical_equivalences(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject make_sm_merge_info(SubLObject arglist) {
        if (arglist == rkf_scenario_manipulator.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sm_merge_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_manipulator.NIL, next = arglist; rkf_scenario_manipulator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw34$ID)) {
                _csetf_sm_merge_info_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw172$FROM_SCENARIO)) {
                _csetf_sm_merge_info_from_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw173$TO_SCENARIO)) {
                _csetf_sm_merge_info_to_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw174$ALIGN_TO)) {
                _csetf_sm_merge_info_align_to(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw175$ALIGN_FROM)) {
                _csetf_sm_merge_info_align_from(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw176$INDEXICAL_EQUIVALENCES)) {
                _csetf_sm_merge_info_indexical_equivalences(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject visit_defstruct_sm_merge_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw45$BEGIN, (SubLObject)rkf_scenario_manipulator.$sym177$MAKE_SM_MERGE_INFO, (SubLObject)rkf_scenario_manipulator.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw34$ID, sm_merge_info_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw172$FROM_SCENARIO, sm_merge_info_from_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw173$TO_SCENARIO, sm_merge_info_to_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw174$ALIGN_TO, sm_merge_info_align_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw175$ALIGN_FROM, sm_merge_info_align_from(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw176$INDEXICAL_EQUIVALENCES, sm_merge_info_indexical_equivalences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw48$END, (SubLObject)rkf_scenario_manipulator.$sym177$MAKE_SM_MERGE_INFO, (SubLObject)rkf_scenario_manipulator.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
    public static SubLObject visit_defstruct_object_sm_merge_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_merge_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28169L)
    public static SubLObject sm_new_merge_info() {
        final SubLObject merge_info = make_sm_merge_info((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_id(merge_info, id);
            sm_add_object(id, merge_info);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28395L)
    public static SubLObject sm_cleanup_merge_info(final SubLObject merge_info) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(merge_info) : merge_info;
        final SubLObject id = sm_merge_info_id(merge_info);
        final SubLObject success = sm_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28633L)
    public static SubLObject sm_set_merge_info_from_scenario(final SubLObject merge_info, final SubLObject from_scenario) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(merge_info) : merge_info;
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(from_scenario) : from_scenario;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_from_scenario(merge_info, from_scenario);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28898L)
    public static SubLObject sm_set_merge_info_to_scenario(final SubLObject merge_info, final SubLObject to_scenario) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(merge_info) : merge_info;
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(to_scenario) : to_scenario;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_to_scenario(merge_info, to_scenario);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 29153L)
    public static SubLObject sm_set_merge_info_align_to(final SubLObject merge_info, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(merge_info) : merge_info;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_align_to(merge_info, indexical_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 29425L)
    public static SubLObject sm_set_merge_info_align_from(final SubLObject merge_info, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(merge_info) : merge_info;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_align_from(merge_info, indexical_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 29701L)
    public static SubLObject update_sm_merge_info_indexical_equivalences(final SubLObject merge_info) {
        assert rkf_scenario_manipulator.NIL != sm_merge_info_p(merge_info) : merge_info;
        final SubLObject align_to = sm_merge_info_align_to(merge_info);
        final SubLObject align_from = sm_merge_info_align_from(merge_info);
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            final SubLObject item_var = (SubLObject)ConsesLow.list(align_to, align_from);
            if (rkf_scenario_manipulator.NIL == conses_high.member(item_var, sm_merge_info_indexical_equivalences(merge_info), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.IDENTITY))) {
                _csetf_sm_merge_info_indexical_equivalences(merge_info, (SubLObject)ConsesLow.cons(item_var, sm_merge_info_indexical_equivalences(merge_info)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sm_gen_point_native.class) ? rkf_scenario_manipulator.T : rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_id(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_non_indexical(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_isas(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_genls(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_positions(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_indexical_record(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject sm_gen_point_keyword(final SubLObject v_object) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_non_indexical(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_isas(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_genls(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_positions(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_indexical_record(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject _csetf_sm_gen_point_keyword(final SubLObject v_object, final SubLObject value) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject make_sm_gen_point(SubLObject arglist) {
        if (arglist == rkf_scenario_manipulator.UNPROVIDED) {
            arglist = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sm_gen_point_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_scenario_manipulator.NIL, next = arglist; rkf_scenario_manipulator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw34$ID)) {
                _csetf_sm_gen_point_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw201$NON_INDEXICAL)) {
                _csetf_sm_gen_point_non_indexical(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw126$ISAS)) {
                _csetf_sm_gen_point_isas(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw127$GENLS)) {
                _csetf_sm_gen_point_genls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw202$POSITIONS)) {
                _csetf_sm_gen_point_positions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw203$INDEXICAL_RECORD)) {
                _csetf_sm_gen_point_indexical_record(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_scenario_manipulator.$kw204$KEYWORD)) {
                _csetf_sm_gen_point_keyword(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject visit_defstruct_sm_gen_point(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw45$BEGIN, (SubLObject)rkf_scenario_manipulator.$sym205$MAKE_SM_GEN_POINT, (SubLObject)rkf_scenario_manipulator.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw34$ID, sm_gen_point_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw201$NON_INDEXICAL, sm_gen_point_non_indexical(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw126$ISAS, sm_gen_point_isas(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw127$GENLS, sm_gen_point_genls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw202$POSITIONS, sm_gen_point_positions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw203$INDEXICAL_RECORD, sm_gen_point_indexical_record(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw47$SLOT, (SubLObject)rkf_scenario_manipulator.$kw204$KEYWORD, sm_gen_point_keyword(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_scenario_manipulator.$kw48$END, (SubLObject)rkf_scenario_manipulator.$sym205$MAKE_SM_GEN_POINT, (SubLObject)rkf_scenario_manipulator.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
    public static SubLObject visit_defstruct_object_sm_gen_point_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_gen_point(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30417L)
    public static SubLObject sm_new_gen_point(final SubLObject non_indexical) {
        final SubLObject sm_gen_point = make_sm_gen_point((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_id(sm_gen_point, id);
            _csetf_sm_gen_point_non_indexical(sm_gen_point, non_indexical);
            sm_add_object(id, sm_gen_point);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30799L)
    public static SubLObject sm_add_gen_point_isas(final SubLObject sm_gen_point, final SubLObject isas) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(sm_gen_point) : sm_gen_point;
        assert rkf_scenario_manipulator.NIL != Types.listp(isas) : isas;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_isas(sm_gen_point, isas);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31016L)
    public static SubLObject sm_add_gen_point_genls(final SubLObject sm_gen_point, final SubLObject v_genls) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(sm_gen_point) : sm_gen_point;
        assert rkf_scenario_manipulator.NIL != Types.listp(v_genls) : v_genls;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_genls(sm_gen_point, v_genls);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31238L)
    public static SubLObject sm_add_gen_point_position(final SubLObject sm_gen_point, SubLObject position) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(sm_gen_point) : sm_gen_point;
        assert rkf_scenario_manipulator.NIL != Types.listp(position) : position;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            if (rkf_scenario_manipulator.NIL == conses_high.member(position, sm_gen_point_positions(sm_gen_point), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.IDENTITY))) {
                _csetf_sm_gen_point_positions(sm_gen_point, (SubLObject)ConsesLow.cons(position, sm_gen_point_positions(sm_gen_point)));
            }
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31487L)
    public static SubLObject sm_set_gen_point_indexical_record(final SubLObject sm_gen_point, final SubLObject indexical_record) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(sm_gen_point) : sm_gen_point;
        assert rkf_scenario_manipulator.NIL != sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_scenario_manipulator.NIL;
        try {
            release = Locks.seize_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_indexical_record(sm_gen_point, indexical_record);
        }
        finally {
            if (rkf_scenario_manipulator.NIL != release) {
                Locks.release_lock(rkf_scenario_manipulator.$sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31780L)
    public static SubLObject sm_grab_or_compute_gen_point_keyword(final SubLObject gen_point) {
        final SubLObject keyword = sm_gen_point_keyword(gen_point);
        if (rkf_scenario_manipulator.NIL != keyword) {
            return keyword;
        }
        final SubLObject type = sm_best_gen_point_type(gen_point);
        _csetf_sm_gen_point_keyword(gen_point, (rkf_scenario_manipulator.NIL != constant_handles.constant_p(type)) ? string_utilities.keyword_from_string(Strings.string_upcase(constants_high.constant_name(type), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) : Symbols.gentemp((SubLObject)rkf_scenario_manipulator.$str207$_SC));
        return sm_gen_point_keyword(gen_point);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 32188L)
    public static SubLObject sm_best_gen_point_type(final SubLObject gen_point) {
        return sm_gen_point_isas(gen_point).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 32298L)
    public static SubLObject sm_cleanup_gen_point(final SubLObject gen_point) {
        assert rkf_scenario_manipulator.NIL != sm_gen_point_p(gen_point) : gen_point;
        final SubLObject id = sm_gen_point_id(gen_point);
        final SubLObject success = sm_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 32528L)
    public static SubLObject sm_simple_compute_and_set_indexical_phrase(final SubLObject indexical_record) {
        final SubLObject v_genls = sm_indexical_record_explicit_genls(indexical_record);
        final SubLObject isas = sm_indexical_record_explicit_isas(indexical_record);
        final SubLObject specific_genls = sm_choose_optimal_genls(v_genls);
        final SubLObject specific_isa = sm_choose_optimal_isa(isas);
        SubLObject phrase = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL != v_genls && cardinality_estimates.generality_estimate(specific_genls).numL(cardinality_estimates.generality_estimate(specific_isa))) {
            phrase = Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str208$the_kind_of_, pph_main.generate_phrase(specific_genls, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        }
        else {
            phrase = pph_main.generate_phrase(el_utilities.make_unary_formula(rkf_scenario_manipulator.$const209$The, specific_isa), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        sm_add_indexical_phrase(indexical_record, phrase);
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 33314L)
    public static SubLObject sm_choose_optimal_genls(final SubLObject v_genls) {
        return Sort.sort(v_genls, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym210$_), (SubLObject)rkf_scenario_manipulator.$sym211$GENERALITY_ESTIMATE).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 33418L)
    public static SubLObject sm_choose_optimal_isa(final SubLObject isas) {
        return Sort.sort(isas, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym210$_), (SubLObject)rkf_scenario_manipulator.$sym211$GENERALITY_ESTIMATE).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 33519L)
    public static SubLObject sm_scenario_indexical_records_of_type(final SubLObject v_scenario, final SubLObject collection, final SubLObject relation, SubLObject template) {
        if (template == rkf_scenario_manipulator.UNPROVIDED) {
            template = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL != template) {
            indexical_records = ConsesLow.append(sm_template_parameters(template), indexical_records);
        }
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (relation.eql((SubLObject)rkf_scenario_manipulator.$kw212$ISA)) {
                if (collection.eql(sm_indexical_record_explicit_isas(indexical_record).first())) {
                    result = (SubLObject)ConsesLow.cons(indexical_record, result);
                }
            }
            else if (relation.eql((SubLObject)rkf_scenario_manipulator.$kw127$GENLS) && collection.eql(sm_indexical_record_explicit_genls(indexical_record).first())) {
                result = (SubLObject)ConsesLow.cons(indexical_record, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 34298L)
    public static SubLObject sm_number_indexical_phrases(final SubLObject indexical_records, final SubLObject collection, final SubLObject relation) {
        final SubLObject basic_phrase = pph_main.generate_phrase(collection, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL != list_utilities.doubletonP(indexical_records)) {
            sm_uniquify_two_indexical_records(indexical_records, basic_phrase, relation);
            return (SubLObject)rkf_scenario_manipulator.NIL;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(indexical_records), i = (SubLObject)rkf_scenario_manipulator.NIL, i = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER)) {
            sm_number_one_indexical_phrase(Sequences.elt(indexical_records, i), Sequences.elt(rkf_scenario_manipulator.$sm_indexical_numbered_phrases$.getGlobalValue(), i), basic_phrase, relation);
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 34794L)
    public static SubLObject sm_uniquify_two_indexical_records(final SubLObject indexical_records, final SubLObject basic_phrase, final SubLObject relation) {
        SubLObject first_record = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject second_record = (SubLObject)rkf_scenario_manipulator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(indexical_records, indexical_records, (SubLObject)rkf_scenario_manipulator.$list214);
        first_record = indexical_records.first();
        SubLObject current = indexical_records.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, indexical_records, (SubLObject)rkf_scenario_manipulator.$list214);
        second_record = current.first();
        current = current.rest();
        if (rkf_scenario_manipulator.NIL == current) {
            if (relation.eql((SubLObject)rkf_scenario_manipulator.$kw212$ISA)) {
                sm_add_indexical_phrase(first_record, Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str215$the_, basic_phrase));
                sm_add_indexical_phrase(second_record, Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str216$the_other_, basic_phrase));
            }
            else if (relation.eql((SubLObject)rkf_scenario_manipulator.$kw127$GENLS)) {
                sm_add_indexical_phrase(first_record, Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str208$the_kind_of_, basic_phrase));
                sm_add_indexical_phrase(second_record, Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str217$the_other_kind_of_, basic_phrase));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(indexical_records, (SubLObject)rkf_scenario_manipulator.$list214);
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 35375L)
    public static SubLObject sm_number_one_indexical_phrase(final SubLObject indexical_record, final SubLObject number_phrase, final SubLObject basic_phrase, final SubLObject relation) {
        SubLObject cdolist_list_var = sm_indexical_record_phrases(indexical_record);
        SubLObject phrase = (SubLObject)rkf_scenario_manipulator.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL != string_utilities.substringP(basic_phrase, phrase, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                sm_rem_indexical_phrase(indexical_record, phrase);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        if (relation.eql((SubLObject)rkf_scenario_manipulator.$kw212$ISA)) {
            sm_add_indexical_phrase(indexical_record, Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str215$the_, new SubLObject[] { number_phrase, rkf_scenario_manipulator.$str218$_, basic_phrase }));
        }
        else if (relation.eql((SubLObject)rkf_scenario_manipulator.$kw127$GENLS)) {
            sm_add_indexical_phrase(indexical_record, Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str215$the_, new SubLObject[] { number_phrase, rkf_scenario_manipulator.$str219$_kind_of_, basic_phrase }));
        }
        return indexical_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 35948L)
    public static SubLObject sm_generate_indexical_phrases_for_scenario(final SubLObject v_scenario, SubLObject template) {
        if (template == rkf_scenario_manipulator.UNPROVIDED) {
            template = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        SubLObject already_handled = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject indexical_records = sm_scenario_terms(v_scenario);
        if (rkf_scenario_manipulator.NIL != template) {
            indexical_records = ConsesLow.append(sm_template_parameters(template), indexical_records);
        }
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL == subl_promotions.memberP(indexical_record, already_handled, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED) && rkf_scenario_manipulator.NIL == sm_indexical_record_phrases(indexical_record)) {
                final SubLObject v_isa = sm_indexical_record_explicit_isas(indexical_record).first();
                final SubLObject genl = (SubLObject)(v_isa.eql(rkf_scenario_manipulator.$const220$Collection) ? sm_indexical_record_explicit_genls(indexical_record).first() : rkf_scenario_manipulator.NIL);
                final SubLObject others_of_type = Sequences.remove(indexical_record, (rkf_scenario_manipulator.NIL != genl) ? sm_scenario_indexical_records_of_type(v_scenario, genl, (SubLObject)rkf_scenario_manipulator.$kw127$GENLS, template) : sm_scenario_indexical_records_of_type(v_scenario, v_isa, (SubLObject)rkf_scenario_manipulator.$kw212$ISA, template), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                already_handled = (SubLObject)ConsesLow.cons(indexical_record, already_handled);
                if (rkf_scenario_manipulator.NIL == others_of_type) {
                    if (rkf_scenario_manipulator.NIL == sm_indexical_record_phrases(indexical_record)) {
                        sm_simple_compute_and_set_indexical_phrase(indexical_record);
                    }
                }
                else {
                    already_handled = ConsesLow.nconc(already_handled, others_of_type);
                    if (rkf_scenario_manipulator.NIL != genl) {
                        sm_number_indexical_phrases(Sort.sort((SubLObject)ConsesLow.cons(indexical_record, others_of_type), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym210$_), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym221$SM_INDEXICAL_RECORD_NUMBER)), genl, (SubLObject)rkf_scenario_manipulator.$kw127$GENLS);
                    }
                    else {
                        sm_number_indexical_phrases(Sort.sort((SubLObject)ConsesLow.cons(indexical_record, others_of_type), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym210$_), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym221$SM_INDEXICAL_RECORD_NUMBER)), v_isa, (SubLObject)rkf_scenario_manipulator.$kw212$ISA);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 37688L)
    public static SubLObject sm_act_read_scenario(final SubLObject scenario_spec, final SubLObject phrase, final SubLObject interaction_mt) {
        final SubLObject scenario_fort = sm_scenario_spec_fort(scenario_spec);
        final SubLObject v_scenario = sm_new_scenario(phrase, scenario_fort, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject substitutions = sm_scenario_spec_substitutions(scenario_spec);
        final SubLObject indexical_records = sm_retrieve_scenario_fort_indexical_records(v_scenario, scenario_fort, interaction_mt);
        final SubLObject constraint_records = sm_retrieve_scenario_fort_constraint_records(v_scenario, scenario_fort, interaction_mt);
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL == subl_promotions.memberP(sm_indexical_record_indexical(indexical_record), substitutions, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym222$CAR))) {
                sm_add_scenario_term(v_scenario, indexical_record);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        sm_generate_indexical_phrases_for_scenario(v_scenario, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_add_scenario_constraint(v_scenario, sm_substitute_terms_for_indexicals(constraint_record, substitutions));
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39188L)
    public static SubLObject sm_retrieve_scenario_fort_indexical_records(final SubLObject v_scenario, final SubLObject scenario_fort, final SubLObject mt) {
        final SubLObject indexicals = sm_retrieve_scenario_terms_for_scenario(scenario_fort, mt);
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexicals;
        SubLObject indexical = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject phrases = sm_retrieve_scenario_referents_for_scenario(scenario_fort, indexical, mt);
            result = (SubLObject)ConsesLow.cons(sm_new_indexical_record(indexical, phrases, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39647L)
    public static SubLObject sm_retrieve_scenario_terms_for_scenario(final SubLObject scenario_fort, final SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(scenario_fort, rkf_scenario_manipulator.$const223$scenarioTerms, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39802L)
    public static SubLObject sm_retrieve_scenario_referents_for_scenario(final SubLObject scenario_fort, final SubLObject indexical, final SubLObject mt) {
        return kb_mapping_utilities.pred_arg_values_in_relevant_mts(scenario_fort, rkf_scenario_manipulator.$const224$scenarioReferent, indexical, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39985L)
    public static SubLObject sm_retrieve_scenario_fort_constraint_records(final SubLObject v_scenario, final SubLObject scenario_fort, final SubLObject mt) {
        final SubLObject sentences = kb_mapping_utilities.pred_values_in_relevant_mts(scenario_fort, rkf_scenario_manipulator.$const225$scenarioConstraint, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)rkf_scenario_manipulator.NIL;
        sentence = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sentence = narts_high.nart_substitute(sentence);
            result = (SubLObject)ConsesLow.cons(sm_new_constraint_record(sentence), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 40362L)
    public static SubLObject sm_substitute_terms_for_indexicals(final SubLObject constraint_record, final SubLObject substitutions) {
        final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
        SubLObject sentence_copy = el_utilities.copy_formula(sentence);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)rkf_scenario_manipulator.$kw226$IGNORE);
        SubLObject v_term = (SubLObject)rkf_scenario_manipulator.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL != term.nautP(v_term, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                v_term = narts_high.find_nart(v_term);
            }
            if (rkf_scenario_manipulator.NIL != sm_indexical_p(v_term)) {
                final SubLObject new_term = (rkf_scenario_manipulator.NIL != sm_substitution_list_p(substitutions)) ? sm_get_standin_for_indexical(substitutions, v_term) : v_term;
                if (rkf_scenario_manipulator.NIL != new_term) {
                    sentence_copy = cycl_utilities.expression_subst(new_term, v_term, sentence_copy, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        sm_set_constraint_record_sentence(constraint_record, sentence_copy);
        return constraint_record;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 41200L)
    public static SubLObject sm_act_suggest_scenarios(final SubLObject phrase, final SubLObject interaction_mt, final SubLObject parsing_mt) {
        final SubLObject scenario_expressions = sm_extract_candidate_scenario_expressions(phrase, parsing_mt, interaction_mt);
        SubLObject candidate_scenarios = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = scenario_expressions;
        SubLObject scenario_expression = (SubLObject)rkf_scenario_manipulator.NIL;
        scenario_expression = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject v_scenario = sm_act_initialize_scenario_from_expression(scenario_expression, phrase, interaction_mt, parsing_mt);
            candidate_scenarios = (SubLObject)ConsesLow.cons(v_scenario, candidate_scenarios);
            cdolist_list_var = cdolist_list_var.rest();
            scenario_expression = cdolist_list_var.first();
        }
        return candidate_scenarios;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 42253L)
    public static SubLObject sm_extract_candidate_scenario_expressions(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parse_results = (SubLObject)rkf_scenario_manipulator.NIL;
        parse_results = rkf_text_processors.rkf_scenario_reader(phrase, parsing_mt, interaction_mt);
        final SubLObject token_list = rkf_concept_harvester.rkf_ch_string_tokenize(phrase);
        final SubLObject top_result = parse_results.first();
        if (Sequences.length(token_list).numE(Sequences.length(top_result.first()))) {
            SubLObject result = conses_high.second(top_result);
            result = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym95$SM_SCENARIO_EXPRESSION_P), result, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            SubLObject cdolist_list_var = parse_results.rest();
            SubLObject parse_result = (SubLObject)rkf_scenario_manipulator.NIL;
            parse_result = cdolist_list_var.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
                result = sm_parse_result_substitute(parse_result, token_list, result);
                cdolist_list_var = cdolist_list_var.rest();
                parse_result = cdolist_list_var.first();
            }
            final SubLObject _prev_bind_0 = rkf_scenario_manipulator.$sm_semantic_mt$.currentBinding(thread);
            try {
                rkf_scenario_manipulator.$sm_semantic_mt$.bind(interaction_mt, thread);
                result = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym227$SM_SCENARIO_EXPRESSION_OK), result, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            }
            finally {
                rkf_scenario_manipulator.$sm_semantic_mt$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 43301L)
    public static SubLObject sm_act_initialize_scenario_from_expression(final SubLObject scenario_expression, final SubLObject phrase, final SubLObject storage_mt, final SubLObject parsing_mt) {
        final SubLObject scenario_fort = sm_scenario_expression_fort(scenario_expression);
        final SubLObject cyc_terms = sm_scenario_expression_cyc_terms(scenario_expression);
        final SubLObject indexical_nauts = sm_scenario_expression_indexical_nauts(scenario_expression);
        final SubLObject indexicals = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym228$FIND_NART), indexical_nauts);
        final SubLObject substitutions = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym229$LIST), indexicals, new SubLObject[] { cyc_terms });
        final SubLObject scenario_spec = sm_new_scenario_spec(scenario_fort, substitutions);
        SubLObject scenario_phrase = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject v_scenario = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == phrase) {
            scenario_phrase = sm_fetch_scenario_phrase(scenario_expression, parsing_mt);
        }
        else {
            scenario_phrase = phrase;
        }
        v_scenario = sm_act_read_scenario(scenario_spec, scenario_phrase, storage_mt);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 44130L)
    public static SubLObject sm_scenario_expression_ok(final SubLObject scenario_expression, SubLObject mt) {
        if (mt == rkf_scenario_manipulator.UNPROVIDED) {
            mt = rkf_scenario_manipulator.$sm_semantic_mt$.getDynamicValue();
        }
        if (rkf_scenario_manipulator.NIL != list_utilities.lengthE(scenario_expression, (SubLObject)rkf_scenario_manipulator.FOUR_INTEGER, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
            final SubLObject cyc_terms = sm_scenario_expression_cyc_terms(scenario_expression);
            final SubLObject indexical_nauts = sm_scenario_expression_indexical_nauts(scenario_expression);
            final SubLObject length = Sequences.length(cyc_terms);
            if (rkf_scenario_manipulator.NIL != list_utilities.lengthE(indexical_nauts, length, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                SubLObject i;
                SubLObject indexical_naut;
                SubLObject cyc_term;
                SubLObject naut_type;
                for (i = (SubLObject)rkf_scenario_manipulator.NIL, i = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER)) {
                    indexical_naut = cycl_utilities.formula_arg(indexical_nauts, i, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                    cyc_term = cycl_utilities.formula_arg(cyc_terms, i, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                    naut_type = cycl_utilities.nat_arg1(indexical_naut, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                    if (rkf_scenario_manipulator.NIL == sm_el_wftP(cyc_term, mt) || rkf_scenario_manipulator.NIL != isa.not_isaP(cyc_term, naut_type, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                        return (SubLObject)rkf_scenario_manipulator.NIL;
                    }
                }
                return (SubLObject)rkf_scenario_manipulator.T;
            }
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 44947L)
    public static SubLObject sm_el_wftP(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_list_as_terminalP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_list_as_terminalP$.bind((SubLObject)rkf_scenario_manipulator.NIL, thread);
            result = wff.el_wftP(v_term, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        finally {
            cycl_grammar.$grammar_permits_list_as_terminalP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 45121L)
    public static SubLObject sm_scenario_constraints_wffP(final SubLObject v_scenario, final SubLObject mt) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        SubLObject cdolist_list_var;
        final SubLObject constraint_sentences = cdolist_list_var = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym143$SM_CONSTRAINT_RECORD_SENTENCE), constraint_records);
        SubLObject sentence = (SubLObject)rkf_scenario_manipulator.NIL;
        sentence = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL == wff.el_wffP(sentence, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                return (SubLObject)rkf_scenario_manipulator.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)rkf_scenario_manipulator.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 45441L)
    public static SubLObject sm_fetch_scenario_phrase(final SubLObject scenario_expression, final SubLObject parsing_mt) {
        final SubLObject template_expression = ask_utilities.ask_variable((SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const230$termTemplate, rkf_scenario_manipulator.$const231$ScenarioTemplate, (SubLObject)rkf_scenario_manipulator.$sym232$_EXPR, scenario_expression), parsing_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        return sm_enumerate_scenarios_unpack_template_expression(template_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 45758L)
    public static SubLObject sm_act_initialize_scenario_from_cycl(SubLObject cycl_sentence, final SubLObject domain_interaction_mt, final SubLObject generation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_scenario_manipulator.NIL == el_utilities.el_conjunction_p(cycl_sentence)) {
            cycl_sentence = el_utilities.make_conjunction((SubLObject)ConsesLow.list(cycl_sentence));
        }
        final SubLObject v_scenario = sm_new_scenario((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject vars = sm_extract_cycl_sentence_vars(cycl_sentence);
        SubLObject constraints = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject var_map = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject literals = sm_extract_cycl_sentence_constraints(cycl_sentence);
        SubLObject cdolist_list_var = vars;
        SubLObject var = (SubLObject)rkf_scenario_manipulator.NIL;
        var = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            SubLObject isas = (SubLObject)rkf_scenario_manipulator.NIL;
            SubLObject v_genls = (SubLObject)rkf_scenario_manipulator.NIL;
            final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            try {
                at_vars.$accumulating_at_violationsP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                thread.resetMultipleValues();
                final SubLObject var_isas = sm_term_requires_types_in_relations(var, literals, domain_interaction_mt);
                final SubLObject var_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                isas = var_isas;
                v_genls = var_genls;
            }
            finally {
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
            }
            if (rkf_scenario_manipulator.NIL == isas) {
                isas = (SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const233$Thing);
            }
            final SubLObject indexical = sm_new_indexical(rkf_scenario_manipulator.$const233$Thing, sm_get_next_indexical_number_of_type(v_scenario, rkf_scenario_manipulator.$const233$Thing));
            final SubLObject indexical_record = sm_new_indexical_record(indexical, (SubLObject)rkf_scenario_manipulator.NIL, isas, v_genls);
            var_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var, indexical_record), var_map);
            sm_set_indexical_record_var(indexical_record, var);
            sm_add_scenario_term(v_scenario, indexical_record);
            cycl_sentence = cycl_utilities.expression_subst(indexical, var, cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        sm_generate_indexical_phrases_for_scenario(v_scenario, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        constraints = ConsesLow.nconc(constraints, sm_extract_cycl_sentence_constraints(cycl_sentence));
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject cdolist_list_var2 = constraints;
        SubLObject constraint = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint = cdolist_list_var2.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var2) {
            final SubLObject constraint_record = sm_new_constraint_record((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            sm_set_constraint_record_sentence(constraint_record, constraint);
            sm_add_scenario_constraint(v_scenario, constraint_record);
            sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_interaction_mt, generation_mt);
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint = cdolist_list_var2.first();
        }
        return Values.values(v_scenario, var_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 48788L)
    public static SubLObject sm_extract_cycl_sentence_vars(final SubLObject cycl_sentence) {
        return cycl_utilities.expression_gather(cycl_sentence, (SubLObject)rkf_scenario_manipulator.$sym131$EL_VAR_, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 48918L)
    public static SubLObject sm_extract_types_for_var(final SubLObject formula, final SubLObject var) {
        if (rkf_scenario_manipulator.NIL == formula) {
            return (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (formula.isAtom()) {
            return (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (rkf_scenario_manipulator.NIL != el_utilities.possibly_sentence_p(formula) && cycl_utilities.sentence_arg0(formula).eql(rkf_scenario_manipulator.$const234$and)) {
            return sm_extract_types_for_var(cycl_utilities.sentence_args(formula, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), var);
        }
        if (rkf_scenario_manipulator.NIL != el_utilities.possibly_sentence_p(formula) && cycl_utilities.sentence_arg0(formula).eql(rkf_scenario_manipulator.$const235$isa) && cycl_utilities.sentence_arg1(formula, (SubLObject)rkf_scenario_manipulator.UNPROVIDED).eql(var)) {
            return (SubLObject)ConsesLow.list(cycl_utilities.sentence_arg2(formula, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        }
        if (rkf_scenario_manipulator.NIL != el_utilities.possibly_sentence_p(formula)) {
            return ConsesLow.append(sm_extract_types_for_var(formula.first(), var), sm_extract_types_for_var(formula.rest(), var));
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 49510L)
    public static SubLObject sm_extract_cycl_sentence_constraints(final SubLObject cycl_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_scenario_manipulator.$sym236$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_scenario_manipulator.$const237$EverythingPSC, thread);
            if (rkf_scenario_manipulator.NIL == cycl_sentence) {
                result = (SubLObject)rkf_scenario_manipulator.NIL;
            }
            else if (rkf_scenario_manipulator.NIL != el_utilities.el_existential_p(cycl_sentence)) {
                result = sm_extract_cycl_sentence_constraints(cycl_utilities.sentence_arg2(cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            }
            else if (rkf_scenario_manipulator.NIL != el_utilities.possibly_sentence_p(cycl_sentence) && cycl_utilities.sentence_arg0(cycl_sentence).eql(rkf_scenario_manipulator.$const234$and)) {
                result = sm_extract_cycl_sentence_constraints(cycl_utilities.sentence_args(cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
            }
            else if (rkf_scenario_manipulator.NIL != el_utilities.el_general_implication_p(cycl_sentence) || rkf_scenario_manipulator.NIL != el_utilities.el_disjunction_p(cycl_sentence) || rkf_scenario_manipulator.NIL != el_utilities.el_universal_p(cycl_sentence)) {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str238$Cycl_formulas_containing__A_canno, cycl_utilities.sentence_arg0(cycl_sentence));
            }
            else if (rkf_scenario_manipulator.NIL != sm_atomic_sentenceP(cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED) || rkf_scenario_manipulator.NIL != sm_negated_atomic_sentenceP(cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.list(cycl_sentence);
            }
            else if (cycl_sentence.isCons()) {
                result = ConsesLow.append(sm_extract_cycl_sentence_constraints(cycl_sentence.first()), sm_extract_cycl_sentence_constraints(cycl_sentence.rest()));
            }
            else {
                Errors.error((SubLObject)rkf_scenario_manipulator.$str239$_A_unexpected_, cycl_sentence);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 50640L)
    public static SubLObject sm_atomic_sentenceP(final SubLObject v_object, SubLObject varP) {
        if (varP == rkf_scenario_manipulator.UNPROVIDED) {
            varP = (SubLObject)rkf_scenario_manipulator.$sym240$CYC_VAR_;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_manipulator.NIL != el_utilities.atomic_sentenceP(v_object) || (rkf_scenario_manipulator.NIL != el_utilities.el_formula_p(v_object) && rkf_scenario_manipulator.NIL != term.relation_syntaxP(v_object, varP) && rkf_scenario_manipulator.NIL != sm_indexical_p(cycl_utilities.formula_arg0(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 50909L)
    public static SubLObject sm_negated_atomic_sentenceP(final SubLObject v_object, SubLObject varP) {
        if (varP == rkf_scenario_manipulator.UNPROVIDED) {
            varP = (SubLObject)rkf_scenario_manipulator.$sym240$CYC_VAR_;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_manipulator.NIL != el_utilities.el_formula_p(v_object) && cycl_utilities.sentence_arg0(v_object).eql(rkf_scenario_manipulator.$const241$not) && rkf_scenario_manipulator.NIL != sm_atomic_sentenceP(cycl_utilities.sentence_arg1(v_object, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), varP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 51124L)
    public static SubLObject sm_act_suggest_new_indexical_type(final SubLObject indexical_phrase, final SubLObject parsing_mt, final SubLObject domain_mt) {
        SubLObject parse_results = (SubLObject)rkf_scenario_manipulator.NIL;
        parse_results = rkf_text_processors.rkf_term_reader(indexical_phrase, parsing_mt, domain_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject length = Sequences.length(rkf_concept_harvester.rkf_ch_string_tokenize(indexical_phrase));
        final SubLObject collections = sm_extract_entire_parses_of_type(parse_results, length, (SubLObject)rkf_scenario_manipulator.$sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_);
        return collections;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 51853L)
    public static SubLObject sm_act_add_new_indexical(final SubLObject v_scenario, final SubLObject indexical_phrase, final SubLObject indexical_isa, final SubLObject indexical_genls) {
        final SubLObject indexical = sm_new_indexical(rkf_scenario_manipulator.$const233$Thing, sm_get_next_indexical_number_of_type(v_scenario, rkf_scenario_manipulator.$const233$Thing));
        final SubLObject isas = (SubLObject)(indexical_isa.isList() ? indexical_isa : ConsesLow.list(indexical_isa));
        final SubLObject v_genls = (SubLObject)(indexical_genls.isList() ? indexical_genls : ConsesLow.list(indexical_genls));
        final SubLObject indexical_record = sm_new_indexical_record(indexical, (SubLObject)ConsesLow.list(indexical_phrase), isas, v_genls);
        sm_add_scenario_term(v_scenario, indexical_record);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 52877L)
    public static SubLObject sm_act_share_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        sm_add_scenario_term(v_scenario, indexical_record);
        sm_scenario_note_borrowed_indexical(v_scenario, indexical_record);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 53185L)
    public static SubLObject sm_get_next_indexical_number_of_type(final SubLObject v_scenario, final SubLObject indexical_type) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject largest_seen = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject existing_type = sm_indexical_type(indexical);
            if (existing_type.equal(indexical_type) && sm_indexical_number(indexical).numG(largest_seen)) {
                largest_seen = sm_indexical_number(indexical);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return number_utilities.f_1X(largest_seen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 53733L)
    public static SubLObject sm_extract_entire_parses_of_type(final SubLObject parse_results, final SubLObject length, final SubLObject test) {
        SubLObject concepts = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = parse_results;
        SubLObject parse_result = (SubLObject)rkf_scenario_manipulator.NIL;
        parse_result = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (Sequences.length(parse_result.first()).numE(length)) {
                SubLObject cdolist_list_var_$1 = conses_high.second(parse_result);
                SubLObject parse = (SubLObject)rkf_scenario_manipulator.NIL;
                parse = cdolist_list_var_$1.first();
                while (rkf_scenario_manipulator.NIL != cdolist_list_var_$1) {
                    if (rkf_scenario_manipulator.NIL != Functions.funcall(test, parse)) {
                        concepts = (SubLObject)ConsesLow.cons(parse, concepts);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    parse = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse_result = cdolist_list_var.first();
        }
        return concepts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 54085L)
    public static SubLObject sm_act_find_indexical(final SubLObject v_scenario, final SubLObject indexical_phrase, SubLObject testfn) {
        if (testfn == rkf_scenario_manipulator.UNPROVIDED) {
            testfn = (SubLObject)rkf_scenario_manipulator.$sym243$STRING_EQUAL;
        }
        SubLObject foundP = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == foundP) {
            SubLObject csome_list_var = sm_scenario_terms(v_scenario);
            SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
            indexical_record = csome_list_var.first();
            while (rkf_scenario_manipulator.NIL == foundP && rkf_scenario_manipulator.NIL != csome_list_var) {
                if (rkf_scenario_manipulator.NIL != Sequences.find(indexical_phrase, sm_indexical_record_phrases(indexical_record), testfn, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                    foundP = indexical_record;
                }
                csome_list_var = csome_list_var.rest();
                indexical_record = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 54459L)
    public static SubLObject sm_act_suggest_differences(final SubLObject v_scenario, final SubLObject new_indexical, final SubLObject domain_interaction_mt) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject new_constraints = sm_indexical_record_get_collections(new_indexical);
        SubLObject candidates = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (!indexical_record.eql(new_indexical)) {
                final SubLObject current_constraints = sm_indexical_record_get_collections(indexical_record);
                if (rkf_scenario_manipulator.NIL == disjoint_with.any_disjoint_with_anyP(new_constraints, current_constraints, domain_interaction_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                    candidates = (SubLObject)ConsesLow.cons(indexical_record, candidates);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return candidates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 55517L)
    public static SubLObject sm_indexical_record_get_collections(final SubLObject indexical) {
        return list_utilities.flatten(conses_high.union(sm_indexical_record_genls(indexical), sm_indexical_record_isas(indexical), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 55708L)
    public static SubLObject sm_act_distinguish_indexicals(final SubLObject v_scenario, final SubLObject indexical_a, final SubLObject indexical_b, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_a = sm_indexical_record_indexical(indexical_a);
        final SubLObject term_b = sm_indexical_record_indexical(indexical_b);
        final SubLObject sentence = el_utilities.make_binary_formula(rkf_scenario_manipulator.$const244$different, term_a, term_b);
        thread.resetMultipleValues();
        final SubLObject temp = sm_act_add_scenario_constraint(v_scenario, sentence, domain_mt);
        final SubLObject status = thread.secondMultipleValue();
        final SubLObject irec = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        final SubLObject index_col = thread.fifthMultipleValue();
        final SubLObject rel_col = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 56226L)
    public static SubLObject sm_act_remove_indexical(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject domain_interaction_mt) {
        sm_remove_dependent_constraints(v_scenario, indexical_record, domain_interaction_mt);
        sm_rem_scenario_term(v_scenario, indexical_record);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 56758L)
    public static SubLObject sm_remove_dependent_constraints(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject domain_interaction_mt) {
        final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
        SubLObject dependent_constraints = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = sm_scenario_constraints(v_scenario);
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject cycl = sm_constraint_record_sentence(constraint_record);
            if (rkf_scenario_manipulator.NIL != cycl_utilities.formula_find(indexical, cycl, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                dependent_constraints = (SubLObject)ConsesLow.cons(constraint_record, dependent_constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        sm_act_remove_many_constraints(v_scenario, dependent_constraints, domain_interaction_mt);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 57320L)
    public static SubLObject sm_act_add_indexical_phrase(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        sm_add_indexical_phrase(indexical_record, indexical_phrase);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 57798L)
    public static SubLObject sm_act_remove_indexical_phrase(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        sm_rem_indexical_phrase(indexical_record, indexical_phrase);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 58309L)
    public static SubLObject sm_act_gather_all_preferred_indexical_phrases(final SubLObject v_scenario) {
        return Mapping.mapcar((SubLObject)rkf_scenario_manipulator.$sym245$SM_INDEXICAL_RECORD_PREFERRED_PHRASE, sm_scenario_terms(v_scenario));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 58575L)
    public static SubLObject sm_act_resolve_phrase_to_term(final SubLObject v_scenario, final SubLObject phrase) {
        SubLObject doneP = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == doneP) {
            SubLObject csome_list_var = sm_scenario_terms(v_scenario);
            SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
            indexical_record = csome_list_var.first();
            while (rkf_scenario_manipulator.NIL == doneP && rkf_scenario_manipulator.NIL != csome_list_var) {
                if (rkf_scenario_manipulator.NIL != subl_promotions.memberP(phrase, sm_indexical_record_phrases(indexical_record), (SubLObject)rkf_scenario_manipulator.$sym243$STRING_EQUAL, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                    doneP = (SubLObject)rkf_scenario_manipulator.T;
                    result = sm_indexical_record_indexical(indexical_record);
                }
                csome_list_var = csome_list_var.rest();
                indexical_record = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 58935L)
    public static SubLObject sm_act_remove_isaXgenls_constraint(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject collection, final SubLObject domain_interaction_mt, SubLObject type) {
        if (type == rkf_scenario_manipulator.UNPROVIDED) {
            type = rkf_scenario_manipulator.$const235$isa;
        }
        SubLObject explicit_known_cols = type.eql(rkf_scenario_manipulator.$const235$isa) ? sm_indexical_record_explicit_isas(indexical_record) : sm_indexical_record_explicit_genls(indexical_record);
        SubLObject all_known_cols = type.eql(rkf_scenario_manipulator.$const235$isa) ? sm_indexical_record_isas(indexical_record) : sm_indexical_record_genls(indexical_record);
        explicit_known_cols = Sequences.delete(collection, explicit_known_cols, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        all_known_cols = Sequences.delete(collection, all_known_cols, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (type.eql(rkf_scenario_manipulator.$const235$isa)) {
            sm_set_indexical_record_explicit_isas(indexical_record, explicit_known_cols);
            sm_set_indexical_record_isas(indexical_record, all_known_cols);
        }
        else {
            sm_set_indexical_record_explicit_genls(indexical_record, explicit_known_cols);
            sm_set_indexical_record_genls(indexical_record, all_known_cols);
        }
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 60459L)
    public static SubLObject sm_act_get_all_isas_for_indexicals(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_get_all_isas_for_indexicals_memoized(v_scenario);
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 60831L)
    public static SubLObject sm_act_get_all_isas_for_indexicals_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject isas = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = sm_indexical_record_explicit_isas(indexical_record);
            SubLObject v_isa = (SubLObject)rkf_scenario_manipulator.NIL;
            v_isa = cdolist_list_var_$3.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$3) {
                final SubLObject item_var = v_isa;
                if (rkf_scenario_manipulator.NIL == conses_high.member(item_var, isas, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.IDENTITY))) {
                    isas = (SubLObject)ConsesLow.cons(item_var, isas);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                v_isa = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return isas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 60831L)
    public static SubLObject sm_act_get_all_isas_for_indexicals_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_get_all_isas_for_indexicals_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_get_all_isas_for_indexicals_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61163L)
    public static SubLObject sm_act_get_all_genls_for_indexicals(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_get_all_genls_for_indexicals_memoized(v_scenario);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61392L)
    public static SubLObject sm_act_get_all_genls_for_indexicals_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject v_genls = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = sm_indexical_record_explicit_genls(indexical_record);
            SubLObject genl = (SubLObject)rkf_scenario_manipulator.NIL;
            genl = cdolist_list_var_$5.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$5) {
                final SubLObject item_var = genl;
                if (rkf_scenario_manipulator.NIL == conses_high.member(item_var, v_genls, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.IDENTITY))) {
                    v_genls = (SubLObject)ConsesLow.cons(item_var, v_genls);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                genl = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return v_genls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61392L)
    public static SubLObject sm_act_get_all_genls_for_indexicals_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_get_all_genls_for_indexicals_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_get_all_genls_for_indexicals_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61731L)
    public static SubLObject sm_act_suggest_constraint_cycl_from_text(final SubLObject nl_sentence, final SubLObject indexical_records, final SubLObject parsing_mt, SubLObject interaction_mt) {
        if (interaction_mt == rkf_scenario_manipulator.UNPROVIDED) {
            interaction_mt = (SubLObject)rkf_scenario_manipulator.NIL;
        }
        SubLObject parse_results = (SubLObject)rkf_scenario_manipulator.NIL;
        parse_results = rkf_text_processors.rkf_assertion_reader(nl_sentence, parsing_mt, interaction_mt);
        final SubLObject token_list = rkf_concept_harvester.rkf_ch_string_tokenize(nl_sentence);
        final SubLObject length = Sequences.length(token_list);
        final SubLObject first_result = parse_results.first();
        SubLObject sentences = (SubLObject)(length.numE(Sequences.length(first_result.first())) ? conses_high.second(first_result) : rkf_scenario_manipulator.NIL);
        if (rkf_scenario_manipulator.NIL != sentences) {
            SubLObject cdolist_list_var = parse_results.rest();
            SubLObject parse_result = (SubLObject)rkf_scenario_manipulator.NIL;
            parse_result = cdolist_list_var.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
                sentences = sm_indexical_parse_substitute(indexical_records, sentences);
                sentences = sm_parse_result_substitute(parse_result, token_list, sentences);
                cdolist_list_var = cdolist_list_var.rest();
                parse_result = cdolist_list_var.first();
            }
            return Sequences.remove_duplicates(sentences, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 63006L)
    public static SubLObject sm_act_add_scenario_constraint(final SubLObject v_scenario, final SubLObject sentence, final SubLObject domain_interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sm_scenario_clear_all_memoization_state(v_scenario);
        thread.resetMultipleValues();
        final SubLObject okP = sm_sentence_ok_for_scenarioP(v_scenario, sentence, domain_interaction_mt);
        final SubLObject irec = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_col = thread.fourthMultipleValue();
        final SubLObject rel_col = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (rkf_scenario_manipulator.NIL == okP) {
            return Values.values(v_scenario, (SubLObject)rkf_scenario_manipulator.$kw248$NON_WFF, irec, predicate, index_col, rel_col);
        }
        final SubLObject constraint_record = sm_new_constraint_record(sentence);
        sm_add_scenario_constraint(v_scenario, constraint_record);
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        return Values.values(v_scenario, (SubLObject)rkf_scenario_manipulator.$kw249$OK, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 64141L)
    public static SubLObject sm_indexical_parse_substitute(final SubLObject indexical_records, SubLObject sentences) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical_phrases = sm_indexical_record_phrases(indexical_record);
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            SubLObject cdolist_list_var_$6 = indexical_phrases;
            SubLObject indexical_phrase = (SubLObject)rkf_scenario_manipulator.NIL;
            indexical_phrase = cdolist_list_var_$6.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$6) {
                final SubLObject unresolved = cycl_utilities.expression_find(indexical_phrase, sentences, (SubLObject)rkf_scenario_manipulator.NIL, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                if (rkf_scenario_manipulator.NIL != unresolved) {
                    sentences = cycl_utilities.expression_subst(indexical, unresolved, sentences, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym251$SM_UNRESOLVED_EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                indexical_phrase = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 64863L)
    public static SubLObject sm_unresolved_item_for_phrase(final SubLObject phrase, final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_scenario_manipulator.NIL != function_terms.nat_formula_p(item) && cycl_utilities.nat_arg0(item).eql(rkf_scenario_manipulator.$const252$TheResultOfParsing) && cycl_utilities.nat_arg1(item, (SubLObject)rkf_scenario_manipulator.UNPROVIDED).equalp(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 65048L)
    public static SubLObject sm_unresolved_equal(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj1.isCons() && obj2.isCons() && obj1.first().equal(rkf_scenario_manipulator.$const252$TheResultOfParsing) && obj2.first().equal(rkf_scenario_manipulator.$const252$TheResultOfParsing) && conses_high.second(obj1).equal(conses_high.second(obj2)) && conses_high.third(obj1).equal(conses_high.third(obj2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 65326L)
    public static SubLObject sm_subphrase(final SubLObject token_list, final SubLObject token_numbers) {
        SubLObject subphrase = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = token_numbers;
        SubLObject token_number = (SubLObject)rkf_scenario_manipulator.NIL;
        token_number = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            subphrase = (SubLObject)ConsesLow.cons(ConsesLow.nth(token_number, token_list), subphrase);
            cdolist_list_var = cdolist_list_var.rest();
            token_number = cdolist_list_var.first();
        }
        return Sequences.nreverse(subphrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 65539L)
    public static SubLObject sm_parse_result_substitute(final SubLObject parse_result, final SubLObject token_list, final SubLObject sentences) {
        SubLObject result_sentences = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject token_numbers = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject parses = (SubLObject)rkf_scenario_manipulator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parse_result, parse_result, (SubLObject)rkf_scenario_manipulator.$list253);
        token_numbers = parse_result.first();
        SubLObject current = parse_result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parse_result, (SubLObject)rkf_scenario_manipulator.$list253);
        parses = current.first();
        current = current.rest();
        if (rkf_scenario_manipulator.NIL == current) {
            final SubLObject subphrase = string_utilities.bunge(sm_subphrase(token_list, token_numbers), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            final SubLObject unresolved = cycl_utilities.expression_find(subphrase, sentences, (SubLObject)rkf_scenario_manipulator.NIL, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            if (rkf_scenario_manipulator.NIL == unresolved) {
                return sentences;
            }
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)rkf_scenario_manipulator.NIL;
            sentence = cdolist_list_var.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
                if (rkf_scenario_manipulator.NIL != cycl_utilities.expression_find(unresolved, sentence, (SubLObject)rkf_scenario_manipulator.NIL, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym251$SM_UNRESOLVED_EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$7 = parses;
                    SubLObject parse = (SubLObject)rkf_scenario_manipulator.NIL;
                    parse = cdolist_list_var_$7.first();
                    while (rkf_scenario_manipulator.NIL != cdolist_list_var_$7) {
                        result_sentences = (SubLObject)ConsesLow.cons(cycl_utilities.expression_subst(parse, unresolved, sentence, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym251$SM_UNRESOLVED_EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED), result_sentences);
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        parse = cdolist_list_var_$7.first();
                    }
                }
                else {
                    result_sentences = (SubLObject)ConsesLow.cons(sentence, result_sentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parse_result, (SubLObject)rkf_scenario_manipulator.$list253);
        }
        return Sequences.nreverse(result_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 66316L)
    public static SubLObject sm_sentence_ok_for_scenarioP(final SubLObject v_scenario, final SubLObject sentence, final SubLObject domain_interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject indexicals = cdolist_list_var = cycl_utilities.expression_gather(sentence, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym130$SM_INDEXICAL_P), (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        SubLObject indexical = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            SubLObject isas = (SubLObject)rkf_scenario_manipulator.NIL;
            SubLObject v_genls = (SubLObject)rkf_scenario_manipulator.NIL;
            final SubLObject indexical_record = sm_indexical_record_of_indexical(indexical, v_scenario);
            final SubLObject current_isas = sm_indexical_record_isas(indexical_record);
            final SubLObject current_genls = sm_indexical_record_genls(indexical_record);
            final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            try {
                at_vars.$accumulating_at_violationsP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                thread.resetMultipleValues();
                final SubLObject indexical_isas = sm_term_requires_types_in_relation(indexical, sentence, domain_interaction_mt);
                final SubLObject indexical_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                isas = indexical_isas;
                v_genls = indexical_genls;
            }
            finally {
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
            }
            thread.resetMultipleValues();
            SubLObject indexical_constraint = sm_identify_violating_collection_pair(current_isas, isas, domain_interaction_mt);
            SubLObject relation_constraint = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_scenario_manipulator.NIL != indexical_constraint) {
                return Values.values((SubLObject)rkf_scenario_manipulator.NIL, indexical_record, rkf_scenario_manipulator.$const235$isa, indexical_constraint, relation_constraint);
            }
            thread.resetMultipleValues();
            indexical_constraint = sm_identify_violating_collection_pair(current_genls, v_genls, domain_interaction_mt);
            relation_constraint = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_scenario_manipulator.NIL != indexical_constraint) {
                return Values.values((SubLObject)rkf_scenario_manipulator.NIL, indexical_record, rkf_scenario_manipulator.$const254$genls, indexical_constraint, relation_constraint);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        }
        return Values.values((SubLObject)rkf_scenario_manipulator.T, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 67823L)
    public static SubLObject sm_term_requires_types_in_relation(final SubLObject indexical, final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject isas = at_utilities.term_requires_types_in_relation(indexical, sentence, mt);
        SubLObject v_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        isas = rkf_relevance_utilities.rkf_filter_irrelevant_terms(isas, mt);
        v_genls = rkf_relevance_utilities.rkf_filter_irrelevant_terms(v_genls, mt);
        return Values.values(genls.min_cols(isas, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), genls.min_cols(v_genls, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 68397L)
    public static SubLObject sm_term_requires_types_in_relations(final SubLObject indexical, final SubLObject sentences, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject isas = at_utilities.term_requires_types_in_relations(indexical, sentences, mt, (SubLObject)rkf_scenario_manipulator.NIL);
        SubLObject v_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        isas = rkf_relevance_utilities.rkf_filter_irrelevant_terms(isas, mt);
        v_genls = rkf_relevance_utilities.rkf_filter_irrelevant_terms(v_genls, mt);
        return Values.values(genls.min_cols(isas, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), genls.min_cols(v_genls, mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 68843L)
    public static SubLObject sm_identify_violating_collection_pair(final SubLObject indexical_cols, final SubLObject relation_cols, final SubLObject mt) {
        SubLObject disjoint_problem = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject indexical_constraint = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject relation_constraint = (SubLObject)rkf_scenario_manipulator.NIL;
        disjoint_problem = disjoint_with.any_disjoint_collection_pair(conses_high.union(indexical_cols, relation_cols, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), mt);
        if (rkf_scenario_manipulator.NIL != disjoint_problem) {
            SubLObject current;
            final SubLObject datum = current = disjoint_problem;
            SubLObject col_one = (SubLObject)rkf_scenario_manipulator.NIL;
            SubLObject col_other = (SubLObject)rkf_scenario_manipulator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_scenario_manipulator.$list255);
            col_one = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_scenario_manipulator.$list255);
            col_other = current.first();
            current = current.rest();
            if (rkf_scenario_manipulator.NIL == current) {
                if (rkf_scenario_manipulator.NIL != subl_promotions.memberP(col_one, indexical_cols, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                    relation_constraint = col_other;
                    indexical_constraint = col_one;
                }
                else {
                    relation_constraint = col_one;
                    indexical_constraint = col_other;
                }
                return Values.values(indexical_constraint, relation_constraint);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_scenario_manipulator.$list255);
        }
        return Values.values((SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 69756L)
    public static SubLObject sm_compute_current_indexical_isas_genls(final SubLObject v_scenario, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject indexical_records = cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject explicit_isas = sm_indexical_record_explicit_isas(indexical_record);
            final SubLObject explicit_genls = sm_indexical_record_explicit_genls(indexical_record);
            SubLObject isas = (SubLObject)rkf_scenario_manipulator.NIL;
            SubLObject v_genls = (SubLObject)rkf_scenario_manipulator.NIL;
            thread.resetMultipleValues();
            final SubLObject term_isas = sm_scenario_type_constraints_on_term(v_scenario, indexical, interaction_mt);
            final SubLObject term_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            isas = genls.min_cols((SubLObject)ConsesLow.list(term_isas, explicit_isas), interaction_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            v_genls = genls.min_cols((SubLObject)ConsesLow.list(term_genls, explicit_genls), interaction_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            sm_set_indexical_record_isas(indexical_record, isas);
            sm_set_indexical_record_genls(indexical_record, v_genls);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 70634L)
    public static SubLObject sm_scenario_type_constraints_on_term(final SubLObject v_scenario, final SubLObject v_term, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraint_sentences = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym143$SM_CONSTRAINT_RECORD_SENTENCE), sm_scenario_constraints(v_scenario));
        SubLObject isas = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject v_genls = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
            thread.resetMultipleValues();
            final SubLObject relation_isas = sm_term_requires_types_in_relations(v_term, constraint_sentences, interaction_mt);
            final SubLObject relation_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            isas = relation_isas;
            v_genls = relation_genls;
        }
        finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(isas, v_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 71242L)
    public static SubLObject sm_act_remove_constraint(final SubLObject v_scenario, final SubLObject constraint_record, final SubLObject domain_interaction_mt) {
        sm_rem_scenario_constraint(v_scenario, constraint_record);
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 71874L)
    public static SubLObject sm_act_remove_all_constraints(final SubLObject v_scenario, final SubLObject domain_interaction_mt) {
        return sm_act_remove_many_constraints(v_scenario, sm_scenario_constraints(v_scenario), domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 72177L)
    public static SubLObject sm_act_remove_many_constraints(final SubLObject v_scenario, final SubLObject constraints, final SubLObject domain_interaction_mt) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_rem_scenario_constraint(v_scenario, constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 72522L)
    public static SubLObject sm_act_import_constraint(final SubLObject v_scenario, final SubLObject constraint, final SubLObject domain_interaction_mt) {
        sm_add_scenario_constraint(v_scenario, constraint);
        sm_add_object(sm_constraint_record_id(constraint), constraint);
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73083L)
    public static SubLObject sm_act_gather_constraint_formulas(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_gather_constraint_formulas_memoized(v_scenario);
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73397L)
    public static SubLObject sm_act_gather_constraint_formulas_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexicals = Mapping.mapcar((SubLObject)rkf_scenario_manipulator.$sym105$SM_INDEXICAL_RECORD_INDEXICAL, sm_scenario_terms(v_scenario));
        SubLObject formulas = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = sm_scenario_constraints(v_scenario);
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject formula = conses_high.copy_tree(sm_constraint_record_sentence(constraint_record));
            SubLObject cdolist_list_var_$9 = indexicals;
            SubLObject indexical = (SubLObject)rkf_scenario_manipulator.NIL;
            indexical = cdolist_list_var_$9.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$9) {
                conses_high.nsubst((SubLObject)rkf_scenario_manipulator.$kw121$INDEXICAL, indexical, formula, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                indexical = cdolist_list_var_$9.first();
            }
            formulas = (SubLObject)ConsesLow.cons(formula, formulas);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73397L)
    public static SubLObject sm_act_gather_constraint_formulas_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_gather_constraint_formulas_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_gather_constraint_formulas_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73894L)
    public static SubLObject sm_act_modify_phrase(final SubLObject v_scenario, final SubLObject new_phrase) {
        sm_set_scenario_phrase(v_scenario, new_phrase);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 74232L)
    public static SubLObject sm_act_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_records, final SubLObject domain_mt, final SubLObject generation_mt) {
        assert rkf_scenario_manipulator.NIL != sm_constraint_record_p(constraint_record) : constraint_record;
        final SubLObject nl_sentence = sm_constraint_record_nl_sentence(constraint_record);
        if (rkf_scenario_manipulator.NIL != nl_sentence) {
            return nl_sentence;
        }
        final SubLObject indexical_table = sm_act_construct_indexical_table_from_indexical_records(indexical_records);
        return sm_compute_one_constraint_record_nl_sentence(constraint_record, indexical_table, domain_mt, generation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 75245L)
    public static SubLObject sm_compute_one_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_table, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_sentence = sm_constraint_record_sentence(constraint_record);
        SubLObject nl_sentence = (SubLObject)rkf_scenario_manipulator.NIL;
        enforceType(indexical_table, rkf_scenario_manipulator.$sym257$ALIST_P);
        final SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
        try {
            pph_vars.$pph_term_paraphrase_map$.bind(indexical_table, thread);
            nl_sentence = rkf_sentence_communicator.rkf_sentence_phrase(cycl_sentence, generation_mt, domain_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
        }
        sm_set_constraint_record_nl_sentence(constraint_record, nl_sentence);
        return nl_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 75769L)
    public static SubLObject sm_compute_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_records, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_sentence = sm_substitute_phrases_for_indexicals(sm_constraint_record_sentence(constraint_record), indexical_records);
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_language_mt$.bind(generation_mt, thread);
            sm_set_constraint_record_nl_sentence(constraint_record, pph_main.generate_text(cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return sm_constraint_record_nl_sentence(constraint_record);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 76353L)
    public static SubLObject sm_substitute_phrases_for_indexicals(SubLObject cycl_sentence, final SubLObject indexical_records) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject preferred_phrase = sm_indexical_record_preferred_phrase(indexical_record);
            cycl_sentence = cycl_utilities.expression_subst(preferred_phrase, indexical, cycl_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return cycl_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 76754L)
    public static SubLObject sm_act_merge_scenarios(final SubLObject to_scenario, final SubLObject from_scenario, final SubLObject indexical_equivalences) {
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(to_scenario) : to_scenario;
        assert rkf_scenario_manipulator.NIL != sm_scenario_p(from_scenario) : from_scenario;
        assert rkf_scenario_manipulator.NIL != Types.listp(indexical_equivalences) : indexical_equivalences;
        SubLObject cdolist_list_var = sm_scenario_constraints(from_scenario);
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            SubLObject new_sentence = el_utilities.copy_formula(sm_constraint_record_sentence(constraint_record));
            new_sentence = sm_merge_replace_non_equivalent_indexical(new_sentence, from_scenario, to_scenario, indexical_equivalences);
            new_sentence = sm_merge_substitute_indexical_equivalences_in_sentence(new_sentence, indexical_equivalences);
            final SubLObject new_constraint_record = sm_new_constraint_record(new_sentence);
            sm_add_scenario_constraint(to_scenario, new_constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        cdolist_list_var = sm_scenario_terms(from_scenario);
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            if (rkf_scenario_manipulator.NIL == subl_promotions.memberP(indexical, indexical_equivalences, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym258$SECOND)) && rkf_scenario_manipulator.NIL == sm_indexical_of_scenarioP(indexical, to_scenario)) {
                final SubLObject new_indexical_record = sm_copy_indexical_record_for_scenario(indexical_record, to_scenario);
                sm_add_scenario_term(to_scenario, new_indexical_record);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        sm_generate_indexical_phrases_for_scenario(to_scenario, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        sm_scenario_clear_all_memoization_state(to_scenario);
        return to_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 79191L)
    public static SubLObject sm_merge_substitute_indexical_equivalences_in_sentence(final SubLObject sentence, final SubLObject indexical_equivalences) {
        SubLObject new_sentence = sentence;
        SubLObject cdolist_list_var = indexical_equivalences;
        SubLObject indexical_equivalence = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_equivalence = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = indexical_equivalence;
            SubLObject new_indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
            SubLObject old_indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_scenario_manipulator.$list259);
            new_indexical_record = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_scenario_manipulator.$list259);
            old_indexical_record = current.first();
            current = current.rest();
            if (rkf_scenario_manipulator.NIL == current) {
                final SubLObject new_indexical = sm_indexical_record_indexical(new_indexical_record);
                final SubLObject old_indexical = sm_indexical_record_indexical(old_indexical_record);
                if (!new_indexical.equal(old_indexical)) {
                    new_sentence = cycl_utilities.expression_subst(new_indexical, old_indexical, new_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_scenario_manipulator.$list259);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_equivalence = cdolist_list_var.first();
        }
        return new_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 79816L)
    public static SubLObject sm_merge_replace_non_equivalent_indexical(final SubLObject sentence, final SubLObject from_scenario, final SubLObject to_scenario, final SubLObject indexical_equivalences) {
        SubLObject new_sentence = sentence;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)rkf_scenario_manipulator.$kw226$IGNORE);
        SubLObject arg = (SubLObject)rkf_scenario_manipulator.NIL;
        arg = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL != sm_indexical_of_scenarioP(arg, to_scenario)) {
                final SubLObject equivalence = conses_high.assoc(arg, indexical_equivalences, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym105$SM_INDEXICAL_RECORD_INDEXICAL));
                if (rkf_scenario_manipulator.NIL == equivalence || !arg.equal(sm_indexical_record_indexical(conses_high.second(equivalence)))) {
                    final SubLObject indexical_type = sm_indexical_type(arg);
                    SubLObject number = sm_get_next_indexical_number_of_type(to_scenario, indexical_type);
                    number = sm_ensure_new_indexical_number_of_type(from_scenario, indexical_type, number);
                    final SubLObject new_indexical = sm_new_indexical(indexical_type, number);
                    final SubLObject new_indexical_record = sm_new_indexical_record(new_indexical, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                    sm_add_scenario_term(to_scenario, new_indexical_record);
                    new_sentence = cycl_utilities.expression_subst(new_indexical, arg, new_sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return new_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 81469L)
    public static SubLObject sm_ensure_new_indexical_number_of_type(final SubLObject v_scenario, final SubLObject type, final SubLObject number) {
        final SubLObject next_number = sm_get_next_indexical_number_of_type(v_scenario, type);
        return Numbers.max(number, next_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 81662L)
    public static SubLObject sm_act_generalize_scenario(final SubLObject v_scenario, final SubLObject interaction_mt, final SubLObject generation_mt) {
        SubLObject gen_points = sm_act_compute_scenario_generalization_points(v_scenario, interaction_mt);
        gen_points = Sequences.remove_if(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym260$SM_GEN_POINT_WITHOUT_POSITIONS_P), gen_points, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        return sm_act_generalize_scenario_with_gen_points(v_scenario, gen_points, interaction_mt, generation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 82882L)
    public static SubLObject sm_act_generalize_scenario_with_gen_points(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject interaction_mt, final SubLObject generation_mt) {
        final SubLObject template_expr = sm_compute_template_expr_from_generalization_points(v_scenario, gen_points, interaction_mt);
        final SubLObject param_subs = sm_compute_template_param_subs_from_generalization_points(v_scenario, gen_points);
        final SubLObject parameter_indexical_records = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym197$SM_GEN_POINT_INDEXICAL_RECORD), gen_points);
        final SubLObject template = sm_new_template(v_scenario);
        sm_set_template_expression(template, template_expr);
        sm_set_template_param_subs(template, param_subs);
        sm_set_template_parameters(template, parameter_indexical_records);
        sm_add_scenario_template(v_scenario, template);
        sm_set_template_phrase(template, sm_generate_text_from_template_expr(sm_template_expression(template), sm_template_param_subs(template)));
        sm_generate_indexical_phrases_for_scenario(v_scenario, template);
        sm_generalize_scenario_constraints(v_scenario, gen_points, template, interaction_mt, generation_mt);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 84044L)
    public static SubLObject sm_act_compute_scenario_generalization_points(final SubLObject v_scenario, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject non_indexicals = sm_non_indexicals_of_constraints(v_scenario);
        SubLObject generalization_points = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject scenario_tokens = rkf_concept_harvester.rkf_ch_string_tokenize(sm_scenario_phrase(v_scenario));
        SubLObject cdolist_list_var = non_indexicals;
        SubLObject non_indexical = (SubLObject)rkf_scenario_manipulator.NIL;
        non_indexical = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject gen_point = sm_new_gen_point(non_indexical);
            thread.resetMultipleValues();
            final SubLObject isas = sm_scenario_type_constraints_on_term(v_scenario, non_indexical, interaction_mt);
            final SubLObject v_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sm_add_gen_point_isas(gen_point, isas);
            sm_add_gen_point_genls(gen_point, v_genls);
            SubLObject cdolist_list_var_$10;
            final SubLObject phrases = cdolist_list_var_$10 = sm_all_phrases_for_term(non_indexical);
            SubLObject phrase = (SubLObject)rkf_scenario_manipulator.NIL;
            phrase = cdolist_list_var_$10.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$10) {
                final SubLObject phrase_tokens = rkf_concept_harvester.rkf_ch_string_tokenize(phrase);
                final SubLObject phrase_length = Sequences.length(phrase_tokens);
                SubLObject cdolist_list_var_$11;
                final SubLObject starts = cdolist_list_var_$11 = string_utilities.search_all(phrase_tokens, scenario_tokens, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUALP), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                SubLObject start = (SubLObject)rkf_scenario_manipulator.NIL;
                start = cdolist_list_var_$11.first();
                while (rkf_scenario_manipulator.NIL != cdolist_list_var_$11) {
                    sm_add_gen_point_position(gen_point, list_utilities.new_num_list(phrase_length, start));
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    start = cdolist_list_var_$11.first();
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                phrase = cdolist_list_var_$10.first();
            }
            generalization_points = (SubLObject)ConsesLow.cons(gen_point, generalization_points);
            cdolist_list_var = cdolist_list_var.rest();
            non_indexical = cdolist_list_var.first();
        }
        return generalization_points;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 85276L)
    public static SubLObject sm_all_phrases_for_term(SubLObject v_term) {
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL != term.nautP(v_term, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
            v_term = narts_high.find_nart(v_term);
        }
        result = pph_methods_lexicon.all_phrases_for_term(v_term, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == result) {
            result = (SubLObject)ConsesLow.list(pph_main.generate_phrase(v_term, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 85595L)
    public static SubLObject sm_non_indexicals_of_constraints(final SubLObject v_scenario) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        SubLObject non_indexicals = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            SubLObject cdolist_list_var_$12;
            final SubLObject args = cdolist_list_var_$12 = cycl_utilities.formula_args(sentence, (SubLObject)rkf_scenario_manipulator.$kw226$IGNORE);
            SubLObject arg = (SubLObject)rkf_scenario_manipulator.NIL;
            arg = cdolist_list_var_$12.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$12) {
                if (rkf_scenario_manipulator.NIL == sm_indexical_p(arg)) {
                    final SubLObject item_var = arg;
                    if (rkf_scenario_manipulator.NIL == conses_high.member(item_var, non_indexicals, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.IDENTITY))) {
                        non_indexicals = (SubLObject)ConsesLow.cons(item_var, non_indexicals);
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                arg = cdolist_list_var_$12.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return non_indexicals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 86079L)
    public static SubLObject sm_gen_point_without_positions_p(final SubLObject gen_point) {
        return Types.sublisp_null(sm_gen_point_positions(gen_point));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 86380L)
    public static SubLObject sm_compute_template_expr_from_generalization_points(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject interaction_mt) {
        final SubLObject scenario_tokens = conses_high.copy_list(rkf_concept_harvester.rkf_ch_string_tokenize(sm_scenario_phrase(v_scenario)));
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject next = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject gen_point;
        SubLObject sequence;
        SubLObject template_type;
        SubLObject keyword;
        SubLObject template_element;
        SubLObject token;
        for (cdotimes_end_var = Sequences.length(scenario_tokens), i = (SubLObject)rkf_scenario_manipulator.NIL, i = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER)) {
            if (i.numGE(next)) {
                gen_point = sm_gen_point_starting_at(i, gen_points);
                if (rkf_scenario_manipulator.NIL != gen_point) {
                    sequence = sm_best_gen_point_sequence(sm_gen_point_positions(gen_point));
                    template_type = sm_template_type_for_gen_point(gen_point, interaction_mt);
                    keyword = sm_grab_or_compute_gen_point_keyword(gen_point);
                    template_element = (SubLObject)ConsesLow.list(template_type, keyword);
                    next = Numbers.add((SubLObject)rkf_scenario_manipulator.ONE_INTEGER, conses_high.last(sequence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED).first());
                    result = (SubLObject)ConsesLow.cons(template_element, result);
                }
                else {
                    token = Sequences.elt(scenario_tokens, i);
                    if (rkf_scenario_manipulator.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym261$PUNCTUATION_P), token, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const262$OptionalSome, token), result);
                    }
                    else {
                        result = (SubLObject)ConsesLow.cons(token, result);
                    }
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 87730L)
    public static SubLObject sm_gen_point_starting_at(final SubLObject n, final SubLObject gen_points) {
        SubLObject cdolist_list_var = gen_points;
        SubLObject gen_point = (SubLObject)rkf_scenario_manipulator.NIL;
        gen_point = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL != subl_promotions.memberP(n, sm_gen_point_positions(gen_point), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym222$CAR))) {
                return gen_point;
            }
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 87928L)
    public static SubLObject sm_best_gen_point_sequence(final SubLObject positions) {
        SubLObject best = positions.first();
        SubLObject cdolist_list_var = positions.rest();
        SubLObject sequence = (SubLObject)rkf_scenario_manipulator.NIL;
        sequence = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (rkf_scenario_manipulator.NIL != conses_high.subsetp(best, sequence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                best = sequence;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sequence = cdolist_list_var.first();
        }
        return best;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 88181L)
    public static SubLObject sm_template_type_for_gen_point(final SubLObject gen_point, final SubLObject mt) {
        final SubLObject non_indexical = sm_gen_point_non_indexical(gen_point);
        final SubLObject type = sm_best_gen_point_type(gen_point);
        if (non_indexical.isString()) {
            return rkf_scenario_manipulator.$const263$StringTemplate;
        }
        if (non_indexical.isNumber()) {
            return rkf_scenario_manipulator.$const264$NumberTemplate;
        }
        if (rkf_scenario_manipulator.NIL != term.nautP(non_indexical, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
            return sm_template_type_for_collection(type, mt);
        }
        if (rkf_scenario_manipulator.NIL != forts.fort_p(non_indexical)) {
            return sm_template_type_for_collection(type, mt);
        }
        return rkf_scenario_manipulator.$const265$SinkTemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 88674L)
    public static SubLObject sm_template_type_for_collection(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_scenario_manipulator.$sym266$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (rkf_scenario_manipulator.NIL != genls.genlP(col, rkf_scenario_manipulator.$const267$PropositionalConceptualWork, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                result = rkf_scenario_manipulator.$const268$MovieTitleTemplate;
            }
            else if (rkf_scenario_manipulator.NIL != genls.genlP(col, rkf_scenario_manipulator.$const269$Event, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                result = rkf_scenario_manipulator.$const270$NPTemplate;
            }
            else if (rkf_scenario_manipulator.NIL != genls.genlP(col, rkf_scenario_manipulator.$const271$SomethingExisting, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                result = rkf_scenario_manipulator.$const270$NPTemplate;
            }
            else {
                result = rkf_scenario_manipulator.$const265$SinkTemplate;
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 89064L)
    public static SubLObject sm_compute_template_param_subs_from_generalization_points(final SubLObject v_scenario, final SubLObject gen_points) {
        SubLObject param_subs = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = gen_points;
        SubLObject gen_point = (SubLObject)rkf_scenario_manipulator.NIL;
        gen_point = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_set_gen_point_indexical_record(gen_point, sm_construct_gen_point_indexical_record(v_scenario, gen_point, gen_points));
            param_subs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sm_gen_point_keyword(gen_point), sm_gen_point_indexical_record(gen_point)), param_subs);
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        }
        return Sequences.nreverse(param_subs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 89574L)
    public static SubLObject sm_construct_gen_point_indexical_record(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject gen_points) {
        final SubLObject type = sm_best_gen_point_type(gen_point);
        final SubLObject isas = sm_gen_point_isas(gen_point);
        final SubLObject v_genls = sm_gen_point_genls(gen_point);
        final SubLObject number = Numbers.max(sm_get_next_indexical_number_of_type(v_scenario, type), sm_get_next_gen_point_indexical_number_of_type(gen_points, type));
        final SubLObject indexical = sm_new_indexical(type, number);
        return sm_new_indexical_record(indexical, (SubLObject)rkf_scenario_manipulator.NIL, isas, v_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 90068L)
    public static SubLObject sm_get_next_gen_point_indexical_number_of_type(final SubLObject gen_points, final SubLObject type) {
        SubLObject number = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER;
        SubLObject cdolist_list_var = gen_points;
        SubLObject gen_point = (SubLObject)rkf_scenario_manipulator.NIL;
        gen_point = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical_record = sm_gen_point_indexical_record(gen_point);
            final SubLObject indexical = (SubLObject)((rkf_scenario_manipulator.NIL != indexical_record) ? sm_indexical_record_indexical(indexical_record) : rkf_scenario_manipulator.NIL);
            if (rkf_scenario_manipulator.NIL != indexical && sm_indexical_type(indexical).equal(type)) {
                number = Numbers.max(number, sm_indexical_number(indexical));
            }
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        }
        return Numbers.add(number, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 90567L)
    public static SubLObject sm_generalize_scenario_constraints(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt) {
        SubLObject cdolist_list_var = sm_scenario_constraints(v_scenario);
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject new_constraint_record = sm_new_constraint_record((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            final SubLObject sentence = el_utilities.copy_formula(sm_constraint_record_sentence(constraint_record));
            sm_set_constraint_record_sentence(new_constraint_record, sentence);
            sm_add_template_constraint(template, new_constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        cdolist_list_var = gen_points;
        SubLObject gen_point = (SubLObject)rkf_scenario_manipulator.NIL;
        gen_point = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            sm_apply_gen_point_to_template_constraints(v_scenario, gen_point, template, domain_mt, generation_mt);
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 91551L)
    public static SubLObject sm_apply_gen_point_to_template_constraints(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLObject non_indexical = sm_gen_point_non_indexical(gen_point);
        final SubLObject gen_point_ir = sm_gen_point_indexical_record(gen_point);
        final SubLObject indexical = sm_indexical_record_indexical(gen_point_ir);
        final SubLObject constraint_records = sm_template_constraints(template);
        final SubLObject indexical_records = ConsesLow.append(sm_scenario_terms(v_scenario), sm_template_parameters(template));
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            cycl_utilities.expression_nsubst(indexical, non_indexical, sentence, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            sm_compute_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 92332L)
    public static SubLObject sm_de_apply_gen_point_to_template_constraints(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLObject non_indexical = sm_gen_point_non_indexical(gen_point);
        final SubLObject gen_point_ir = sm_gen_point_indexical_record(gen_point);
        final SubLObject indexical = sm_indexical_record_indexical(gen_point_ir);
        final SubLObject constraint_records = sm_template_constraints(template);
        final SubLObject indexical_records = ConsesLow.append(sm_scenario_terms(v_scenario), sm_template_parameters(template));
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            _csetf_sm_constraint_record_nl_sentence(constraint_record, (SubLObject)rkf_scenario_manipulator.NIL);
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            cycl_utilities.expression_nsubst(non_indexical, indexical, sentence, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            sm_compute_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 93187L)
    public static SubLObject sm_generate_text_from_template_expr(final SubLObject template_expr, final SubLObject substitutions) {
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = template_expr;
        SubLObject element = (SubLObject)rkf_scenario_manipulator.NIL;
        element = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(sm_generate_text_from_template_element(element, substitutions), result);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        result = string_utilities.bunge(Sequences.nreverse(result), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 93798L)
    public static SubLObject sm_generate_text_from_template_element(final SubLObject element, final SubLObject substitutions) {
        if (element.isString()) {
            return element;
        }
        if (!element.isCons()) {
            return (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (element.first().eql(rkf_scenario_manipulator.$const272$RequireOne)) {
            return sm_generate_text_from_template_element(conses_high.second(element), substitutions);
        }
        if (element.first().eql(rkf_scenario_manipulator.$const273$OptionalOne)) {
            return (SubLObject)rkf_scenario_manipulator.NIL;
        }
        if (rkf_scenario_manipulator.NIL != genls.genlP(element.first(), rkf_scenario_manipulator.$const274$ParsingTemplateCategory, rkf_scenario_manipulator.$const275$TemplateParsingMt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
            return sm_generate_blank_for_template_element(conses_high.second(element), substitutions);
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 94383L)
    public static SubLObject sm_generate_blank_for_template_element(final SubLObject keyword, final SubLObject substitutions) {
        final SubLObject indexical_record = conses_high.second(conses_high.assoc(keyword, substitutions, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED));
        final SubLObject type = sm_indexical_record_explicit_isas(indexical_record).first();
        final SubLObject phrase = pph_main.generate_phrase(type, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        return Sequences.cconcatenate((SubLObject)rkf_scenario_manipulator.$str276$_, new SubLObject[] { phrase, rkf_scenario_manipulator.$str277$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 94699L)
    public static SubLObject sm_act_save_scenario(final SubLObject v_scenario, final SubLObject template, final SubLObject storage_mt, final SubLObject parsing_mt) {
        final SubLObject constant = rkf_term_utilities.rkf_scenario_create((SubLObject)rkf_scenario_manipulator.$str278$Scenario);
        rkf_assertion_utilities.rkf_scenario_assert((SubLObject)ConsesLow.listS(rkf_scenario_manipulator.$const235$isa, constant, (SubLObject)rkf_scenario_manipulator.$list279), storage_mt);
        rkf_assertion_utilities.rkf_scenario_assert((SubLObject)ConsesLow.listS(rkf_scenario_manipulator.$const280$quotedIsa, constant, (SubLObject)rkf_scenario_manipulator.$list281), storage_mt);
        sm_set_scenario_fort(v_scenario, constant);
        sm_save_scenario_terms_and_referents(v_scenario, template, storage_mt);
        sm_save_template_constraints(v_scenario, template, storage_mt);
        sm_save_scenario_term_template(v_scenario, template, parsing_mt);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 95675L)
    public static SubLObject sm_save_scenario_terms_and_referents(final SubLObject v_scenario, final SubLObject template, final SubLObject mt) {
        final SubLObject fort = sm_scenario_fort(v_scenario);
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject parameters = sm_template_parameters(template);
        sm_save_scenario_terms_and_referents_int(fort, indexical_records, mt);
        sm_save_scenario_terms_and_referents_int(fort, parameters, mt);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 96068L)
    public static SubLObject sm_save_scenario_terms_and_referents_int(final SubLObject fort, final SubLObject indexical_records, final SubLObject mt) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject phrases = sm_indexical_record_phrases(indexical_record);
            rkf_assertion_utilities.rkf_scenario_assert((SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const223$scenarioTerms, fort, indexical), mt);
            SubLObject cdolist_list_var_$13 = phrases;
            SubLObject phrase = (SubLObject)rkf_scenario_manipulator.NIL;
            phrase = cdolist_list_var_$13.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$13) {
                rkf_assertion_utilities.rkf_scenario_assert((SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const224$scenarioReferent, fort, indexical, phrase), mt);
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                phrase = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 96525L)
    public static SubLObject sm_save_template_constraints(final SubLObject v_scenario, final SubLObject template, final SubLObject mt) {
        final SubLObject fort = sm_scenario_fort(v_scenario);
        SubLObject cdolist_list_var;
        final SubLObject constraint_records = cdolist_list_var = sm_template_constraints(template);
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            rkf_assertion_utilities.rkf_scenario_assert((SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const225$scenarioConstraint, fort, sentence), mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 96906L)
    public static SubLObject sm_save_scenario_term_template(final SubLObject v_scenario, final SubLObject template, final SubLObject parsing_mt) {
        final SubLObject fort = sm_scenario_fort(v_scenario);
        final SubLObject template_expr = sm_template_expression(template);
        final SubLObject param_subs = sm_template_param_subs(template);
        final SubLObject keywords = el_utilities.make_el_list(Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym282$FIRST), param_subs), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject indexical_formulas = el_utilities.make_el_list(Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym283$NART_EL_FORMULA), Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym105$SM_INDEXICAL_RECORD_INDEXICAL), Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym258$SECOND), param_subs))), (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        rkf_assertion_utilities.rkf_scenario_assert((SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const230$termTemplate, rkf_scenario_manipulator.$const231$ScenarioTemplate, template_expr, (SubLObject)ConsesLow.list(rkf_scenario_manipulator.$const93$ScenarioInstanceFn, fort, keywords, indexical_formulas)), parsing_mt);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 97510L)
    public static SubLObject sm_act_enumerate_saved_scenarios(final SubLObject storage_mt, final SubLObject parsing_mt) {
        final SubLObject scenarios = ask_utilities.ask_variable((SubLObject)rkf_scenario_manipulator.$kw86$SCENARIO, (SubLObject)rkf_scenario_manipulator.$list284, storage_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        final SubLObject v_bindings = fi.fi_ask_int((SubLObject)rkf_scenario_manipulator.$list285, parsing_mt, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        SubLObject tuples = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = scenarios;
        SubLObject v_scenario = (SubLObject)rkf_scenario_manipulator.NIL;
        v_scenario = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject binding = sm_enumerate_scenarios_identify_term_template(v_scenario, v_bindings);
            if (rkf_scenario_manipulator.NIL != binding) {
                final SubLObject template_expr = conses_high.assoc((SubLObject)rkf_scenario_manipulator.$sym232$_EXPR, binding, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED).rest();
                final SubLObject unpacked = sm_enumerate_scenarios_unpack_template_expression(template_expr);
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_scenario, unpacked), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_scenario = cdolist_list_var.first();
        }
        return tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 98486L)
    public static SubLObject sm_enumerate_scenarios_identify_term_template(final SubLObject v_scenario, final SubLObject v_bindings) {
        SubLObject found = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == found) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = (SubLObject)rkf_scenario_manipulator.NIL;
            binding = csome_list_var.first();
            while (rkf_scenario_manipulator.NIL == found && rkf_scenario_manipulator.NIL != csome_list_var) {
                if (rkf_scenario_manipulator.NIL != list_utilities.tree_find(v_scenario, binding, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                    found = binding;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 98714L)
    public static SubLObject sm_enumerate_scenarios_unpack_template_expression(final SubLObject template_expression) {
        SubLObject result = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = template_expression;
        SubLObject part = (SubLObject)rkf_scenario_manipulator.NIL;
        part = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            if (part.isString()) {
                if (rkf_scenario_manipulator.NIL != result) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)rkf_scenario_manipulator.$str218$_, result);
                }
                result = (SubLObject)ConsesLow.cons(part, result);
            }
            else if (rkf_scenario_manipulator.NIL != el_utilities.el_formula_p(part) && cycl_utilities.formula_arg0(part).eql(rkf_scenario_manipulator.$const262$OptionalSome)) {
                result = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(part, (SubLObject)rkf_scenario_manipulator.UNPROVIDED), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym286$CCONCATENATE), Sequences.nreverse(result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 99182L)
    public static SubLObject sm_act_discard_template(final SubLObject v_scenario, final SubLObject template) {
        sm_rem_scenario_template(v_scenario, template);
        sm_cleanup_template(template);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 99550L)
    public static SubLObject sm_act_compute_unused_indexicals(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_compute_unused_indexicals_memoized(v_scenario);
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 100081L)
    public static SubLObject sm_act_compute_unused_indexicals_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        SubLObject unused_indexicals = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            SubLObject found = (SubLObject)rkf_scenario_manipulator.NIL;
            if (rkf_scenario_manipulator.NIL == found) {
                SubLObject csome_list_var = constraint_records;
                SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
                constraint_record = csome_list_var.first();
                while (rkf_scenario_manipulator.NIL == found && rkf_scenario_manipulator.NIL != csome_list_var) {
                    final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
                    if (rkf_scenario_manipulator.NIL != cycl_utilities.expression_find(indexical, sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                        found = (SubLObject)rkf_scenario_manipulator.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint_record = csome_list_var.first();
                }
            }
            if (rkf_scenario_manipulator.NIL == found) {
                unused_indexicals = (SubLObject)ConsesLow.cons(indexical_record, unused_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return Sequences.nreverse(unused_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 100081L)
    public static SubLObject sm_act_compute_unused_indexicals_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_compute_unused_indexicals_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_compute_unused_indexicals_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 100759L)
    public static SubLObject sm_act_compute_explicit_type_constraints(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_compute_explicit_type_constraints_memoized(indexical_record);
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101023L)
    public static SubLObject sm_act_compute_explicit_type_constraints_memoized_internal(final SubLObject indexical_record) {
        final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
        SubLObject sentences = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = sm_indexical_record_explicit_isas(indexical_record);
        SubLObject v_isa = (SubLObject)rkf_scenario_manipulator.NIL;
        v_isa = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject sentence = el_utilities.make_binary_formula(rkf_scenario_manipulator.$const235$isa, indexical, v_isa);
            sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = sm_indexical_record_explicit_genls(indexical_record);
        SubLObject genl = (SubLObject)rkf_scenario_manipulator.NIL;
        genl = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject sentence = el_utilities.make_binary_formula(rkf_scenario_manipulator.$const254$genls, indexical, genl);
            sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101023L)
    public static SubLObject sm_act_compute_explicit_type_constraints_memoized(final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_compute_explicit_type_constraints_memoized_internal(indexical_record);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical_record, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_compute_explicit_type_constraints_memoized_internal(indexical_record)));
            memoization_state.caching_state_put(caching_state, indexical_record, results, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101610L)
    public static SubLObject sm_act_compute_indexical_constraints(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_compute_indexical_constraints_memoized(v_scenario, indexical_record);
            }
            finally {
                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101898L)
    public static SubLObject sm_act_compute_indexical_constraints_memoized_internal(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
        SubLObject mentioned = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_scenario_manipulator.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            if (rkf_scenario_manipulator.NIL != cycl_utilities.expression_find(indexical, sentence, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED)) {
                mentioned = (SubLObject)ConsesLow.cons(constraint_record, mentioned);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return Sequences.nreverse(mentioned);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101898L)
    public static SubLObject sm_act_compute_indexical_constraints_memoized(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_compute_indexical_constraints_memoized_internal(v_scenario, indexical_record);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, (SubLObject)rkf_scenario_manipulator.TWO_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_scenario, indexical_record);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_scenario_manipulator.NIL;
            collision = cdolist_list_var.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_scenario.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_scenario_manipulator.NIL != cached_args && rkf_scenario_manipulator.NIL == cached_args.rest() && indexical_record.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_compute_indexical_constraints_memoized_internal(v_scenario, indexical_record)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_scenario, indexical_record));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 102426L)
    public static SubLObject sm_act_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        return sm_set_indexical_record_var(indexical_record, var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 102845L)
    public static SubLObject sm_act_add_explicit_constraints(final SubLObject v_scenario, final SubLObject domain_mt, final SubLObject generation_mt) {
        SubLObject cdolist_list_var;
        final SubLObject indexical_records = cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject isas = sm_indexical_record_isas(indexical_record);
            final SubLObject v_genls = sm_indexical_record_genls(indexical_record);
            SubLObject sentences = (SubLObject)rkf_scenario_manipulator.NIL;
            SubLObject cdolist_list_var_$17 = isas;
            SubLObject v_isa = (SubLObject)rkf_scenario_manipulator.NIL;
            v_isa = cdolist_list_var_$17.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$17) {
                final SubLObject sentence = el_utilities.make_binary_formula(rkf_scenario_manipulator.$const235$isa, indexical, v_isa);
                sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                v_isa = cdolist_list_var_$17.first();
            }
            SubLObject cdolist_list_var_$18 = v_genls;
            SubLObject genl = (SubLObject)rkf_scenario_manipulator.NIL;
            genl = cdolist_list_var_$18.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$18) {
                final SubLObject sentence = el_utilities.make_binary_formula(rkf_scenario_manipulator.$const254$genls, indexical, genl);
                sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                genl = cdolist_list_var_$18.first();
            }
            SubLObject cdolist_list_var_$19 = sentences;
            SubLObject sentence2 = (SubLObject)rkf_scenario_manipulator.NIL;
            sentence2 = cdolist_list_var_$19.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$19) {
                if (rkf_scenario_manipulator.NIL == sm_redundant_constraintP(v_scenario, sentence2)) {
                    final SubLObject constraint_record = sm_new_constraint_record((SubLObject)rkf_scenario_manipulator.UNPROVIDED);
                    sm_set_constraint_record_sentence(constraint_record, sentence2);
                    final SubLObject nl_sentence = sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
                    sm_set_constraint_record_nl_sentence(constraint_record, nl_sentence);
                    sm_add_scenario_constraint(v_scenario, constraint_record);
                }
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                sentence2 = cdolist_list_var_$19.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 104134L)
    public static SubLObject sm_redundant_constraintP(final SubLObject v_scenario, final SubLObject sentence) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        return conses_high.member(sentence, constraint_records, Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.EQUAL), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym143$SM_CONSTRAINT_RECORD_SENTENCE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 104440L)
    public static SubLObject sm_act_propose_sentence_adjustments(final SubLObject v_scenario, final SubLObject cycl_sentence, final SubLObject domain_mt) {
        if (rkf_scenario_manipulator.NIL != el_utilities.gafP(cycl_sentence)) {
            return sm_propose_gaf_sentence_adjustments(v_scenario, cycl_sentence, domain_mt);
        }
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 104958L)
    public static SubLObject sm_propose_gaf_sentence_adjustments(final SubLObject v_scenario, final SubLObject cycl_sentence, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject arg_choices = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject argnum = (SubLObject)rkf_scenario_manipulator.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_sentence, (SubLObject)rkf_scenario_manipulator.$kw226$IGNORE);
        SubLObject arg = (SubLObject)rkf_scenario_manipulator.NIL;
        arg = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER);
            thread.resetMultipleValues();
            final SubLObject relation_isas = at_utilities.term_position_requires_types_in_relation((SubLObject)ConsesLow.cons(argnum, (SubLObject)rkf_scenario_manipulator.NIL), cycl_sentence, domain_mt);
            final SubLObject relation_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject argnum_choices = (SubLObject)ConsesLow.list(arg);
            SubLObject cdolist_list_var_$20 = indexical_records;
            SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
            indexical_record = cdolist_list_var_$20.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$20) {
                final SubLObject isas = list_utilities.flatten(sm_indexical_record_isas(indexical_record));
                final SubLObject v_genls = list_utilities.flatten(sm_indexical_record_genls(indexical_record));
                if (rkf_scenario_manipulator.NIL == sm_identify_violating_collection_pair(isas, relation_isas, domain_mt) && rkf_scenario_manipulator.NIL == sm_identify_violating_collection_pair(v_genls, relation_genls, domain_mt)) {
                    final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
                    argnum_choices = (SubLObject)ConsesLow.cons(indexical, argnum_choices);
                }
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                indexical_record = cdolist_list_var_$20.first();
            }
            arg_choices = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(argnum, argnum_choices), arg_choices);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return arg_choices;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 106129L)
    public static SubLObject sm_act_construct_indexical_table(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        return sm_act_construct_indexical_table_from_indexical_records(indexical_records);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 106526L)
    public static SubLObject sm_act_construct_indexical_table_from_indexical_records(final SubLObject indexical_records) {
        SubLObject table = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            SubLObject cdolist_list_var_$21;
            final SubLObject phrases = cdolist_list_var_$21 = sm_indexical_record_phrases(indexical_record);
            SubLObject phrase = (SubLObject)rkf_scenario_manipulator.NIL;
            phrase = cdolist_list_var_$21.first();
            while (rkf_scenario_manipulator.NIL != cdolist_list_var_$21) {
                table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(indexical, phrase), table);
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                phrase = cdolist_list_var_$21.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 106930L)
    public static SubLObject sm_act_construct_indexical_constraint_table(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)rkf_scenario_manipulator.NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_construct_indexical_constraint_table_memoized(v_scenario);
            }
            finally {
                final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_scenario_manipulator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 107477L)
    public static SubLObject sm_act_construct_indexical_constraint_table_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject table = (SubLObject)rkf_scenario_manipulator.NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_scenario_manipulator.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_scenario_manipulator.NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject isas = sm_indexical_record_isas(indexical_record);
            final SubLObject v_genls = sm_indexical_record_genls(indexical_record);
            table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(indexical, isas, v_genls), table);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 107477L)
    public static SubLObject sm_act_construct_indexical_constraint_table_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_scenario_manipulator.NIL;
        if (rkf_scenario_manipulator.NIL == v_memoization_state) {
            return sm_act_construct_indexical_constraint_table_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        if (rkf_scenario_manipulator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_scenario_manipulator.$sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, (SubLObject)rkf_scenario_manipulator.ONE_INTEGER, (SubLObject)rkf_scenario_manipulator.NIL, (SubLObject)rkf_scenario_manipulator.EQ, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_scenario_manipulator.$sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sm_act_construct_indexical_constraint_table_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, (SubLObject)rkf_scenario_manipulator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_rkf_scenario_manipulator_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "with_sm_lock", "WITH-SM-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_scenario_by_id", "SM-FIND-SCENARIO-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_scenario_by_id_string", "SM-FIND-SCENARIO-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_template_by_id", "SM-FIND-TEMPLATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_template_by_id_string", "SM-FIND-TEMPLATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_indexical_record_by_id", "SM-FIND-INDEXICAL-RECORD-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_indexical_record_by_id_string", "SM-FIND-INDEXICAL-RECORD-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_constraint_record_by_id", "SM-FIND-CONSTRAINT-RECORD-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_constraint_record_by_id_string", "SM-FIND-CONSTRAINT-RECORD-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_merge_info_by_id", "SM-FIND-MERGE-INFO-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_merge_info_by_id_string", "SM-FIND-MERGE-INFO-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "next_sm_id", "NEXT-SM-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_object", "SM-ADD-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_object", "SM-REM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_find_object_by_id", "SM-FIND-OBJECT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_print_function_trampoline", "SM-SCENARIO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_p", "SM-SCENARIO-P", 1, 0, false);
        new $sm_scenario_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_id", "SM-SCENARIO-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_sessions", "SM-SCENARIO-SESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_phrase", "SM-SCENARIO-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_candidate_terms", "SM-SCENARIO-CANDIDATE-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_candidate_constraints", "SM-SCENARIO-CANDIDATE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_fort", "SM-SCENARIO-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_terms", "SM-SCENARIO-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_constraints", "SM-SCENARIO-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_templates", "SM-SCENARIO-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_state", "SM-SCENARIO-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_id", "_CSETF-SM-SCENARIO-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_sessions", "_CSETF-SM-SCENARIO-SESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_phrase", "_CSETF-SM-SCENARIO-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_candidate_terms", "_CSETF-SM-SCENARIO-CANDIDATE-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_candidate_constraints", "_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_fort", "_CSETF-SM-SCENARIO-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_terms", "_CSETF-SM-SCENARIO-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_constraints", "_CSETF-SM-SCENARIO-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_templates", "_CSETF-SM-SCENARIO-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_scenario_state", "_CSETF-SM-SCENARIO-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "make_sm_scenario", "MAKE-SM-SCENARIO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_sm_scenario", "VISIT-DEFSTRUCT-SM-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_object_sm_scenario_method", "VISIT-DEFSTRUCT-OBJECT-SM-SCENARIO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_scenario", "SM-NEW-SCENARIO", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_scenario_phrase", "SM-SET-SCENARIO-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_scenario_fort", "SM-SET-SCENARIO-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_candidate_terms", "SM-ADD-SCENARIO-CANDIDATE-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_candidate_term", "SM-ADD-SCENARIO-CANDIDATE-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_scenario_candidate_term", "SM-REM-SCENARIO-CANDIDATE-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_candidate_constraints", "SM-ADD-SCENARIO-CANDIDATE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_candidate_constraint", "SM-ADD-SCENARIO-CANDIDATE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_scenario_candidate_constraint", "SM-REM-SCENARIO-CANDIDATE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_term", "SM-ADD-SCENARIO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_scenario_term", "SM-REM-SCENARIO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_constraint", "SM-ADD-SCENARIO-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_scenario_constraint", "SM-REM-SCENARIO-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_scenario_template", "SM-ADD-SCENARIO-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_scenario_template", "SM-REM-SCENARIO-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_cleanup_scenario", "SM-CLEANUP-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_note_borrowed_indexical", "SM-SCENARIO-NOTE-BORROWED-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_borrowed_indexical_p", "SM-SCENARIO-BORROWED-INDEXICAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_return_borrowed_indexical", "SM-SCENARIO-RETURN-BORROWED-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_memoization_state", "SM-SCENARIO-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_clear_all_memoization_state", "SM-SCENARIO-CLEAR-ALL-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "with_scenario_memoization_state", "WITH-SCENARIO-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_print_function_trampoline", "SM-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_p", "SM-TEMPLATE-P", 1, 0, false);
        new $sm_template_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_id", "SM-TEMPLATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_scenario", "SM-TEMPLATE-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_phrase", "SM-TEMPLATE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_expression", "SM-TEMPLATE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_param_subs", "SM-TEMPLATE-PARAM-SUBS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_parameters", "SM-TEMPLATE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_constraints", "SM-TEMPLATE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_state", "SM-TEMPLATE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_id", "_CSETF-SM-TEMPLATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_scenario", "_CSETF-SM-TEMPLATE-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_phrase", "_CSETF-SM-TEMPLATE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_expression", "_CSETF-SM-TEMPLATE-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_param_subs", "_CSETF-SM-TEMPLATE-PARAM-SUBS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_parameters", "_CSETF-SM-TEMPLATE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_constraints", "_CSETF-SM-TEMPLATE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_template_state", "_CSETF-SM-TEMPLATE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "make_sm_template", "MAKE-SM-TEMPLATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_sm_template", "VISIT-DEFSTRUCT-SM-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_object_sm_template_method", "VISIT-DEFSTRUCT-OBJECT-SM-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_template", "SM-NEW-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_template_expression", "SM-SET-TEMPLATE-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_template_param_subs", "SM-SET-TEMPLATE-PARAM-SUBS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_template_parameters", "SM-SET-TEMPLATE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_template_phrase", "SM-SET-TEMPLATE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_template_constraint", "SM-ADD-TEMPLATE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_cleanup_template", "SM-CLEANUP-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_spec_p", "SM-SCENARIO-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_scenario_spec", "SM-NEW-SCENARIO-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_spec_fort", "SM-SCENARIO-SPEC-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_spec_substitutions", "SM-SCENARIO-SPEC-SUBSTITUTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_substitution_list_p", "SM-SUBSTITUTION-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_substitution_p", "SM-SUBSTITUTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_get_standin_for_indexical", "SM-GET-STANDIN-FOR-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_expression_p", "SM-SCENARIO-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_expression_fort", "SM-SCENARIO-EXPRESSION-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_expression_cyc_terms", "SM-SCENARIO-EXPRESSION-CYC-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_expression_indexical_nauts", "SM-SCENARIO-EXPRESSION-INDEXICAL-NAUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_print_function_trampoline", "SM-INDEXICAL-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_p", "SM-INDEXICAL-RECORD-P", 1, 0, false);
        new $sm_indexical_record_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_id", "SM-INDEXICAL-RECORD-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_indexical", "SM-INDEXICAL-RECORD-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_phrases", "SM-INDEXICAL-RECORD-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_var", "SM-INDEXICAL-RECORD-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_explicit_isas", "SM-INDEXICAL-RECORD-EXPLICIT-ISAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_explicit_genls", "SM-INDEXICAL-RECORD-EXPLICIT-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_isas", "SM-INDEXICAL-RECORD-ISAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_genls", "SM-INDEXICAL-RECORD-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_state", "SM-INDEXICAL-RECORD-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_id", "_CSETF-SM-INDEXICAL-RECORD-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_indexical", "_CSETF-SM-INDEXICAL-RECORD-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_phrases", "_CSETF-SM-INDEXICAL-RECORD-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_var", "_CSETF-SM-INDEXICAL-RECORD-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_explicit_isas", "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_explicit_genls", "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_isas", "_CSETF-SM-INDEXICAL-RECORD-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_genls", "_CSETF-SM-INDEXICAL-RECORD-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_indexical_record_state", "_CSETF-SM-INDEXICAL-RECORD-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "make_sm_indexical_record", "MAKE-SM-INDEXICAL-RECORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_sm_indexical_record", "VISIT-DEFSTRUCT-SM-INDEXICAL-RECORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_object_sm_indexical_record_method", "VISIT-DEFSTRUCT-OBJECT-SM-INDEXICAL-RECORD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_indexical_record", "SM-NEW-INDEXICAL-RECORD", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_indexical", "SM-SET-INDEXICAL-RECORD-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_phrases", "SM-SET-INDEXICAL-RECORD-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_indexical_phrase", "SM-ADD-INDEXICAL-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_indexical_phrase", "SM-REM-INDEXICAL-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_var", "SM-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_explicit_isas", "SM-SET-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_explicit_genls", "SM-SET-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_isas", "SM-SET-INDEXICAL-RECORD-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_indexical_record_genls", "SM-SET-INDEXICAL-RECORD-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_cleanup_indexical_record", "SM-CLEANUP-INDEXICAL-RECORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_preferred_phrase", "SM-INDEXICAL-RECORD-PREFERRED-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_copy_indexical_record_for_scenario", "SM-COPY-INDEXICAL-RECORD-FOR-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_type", "SM-INDEXICAL-RECORD-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_number", "SM-INDEXICAL-RECORD-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_update_indexical_record_explicit_isas", "SM-UPDATE-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_update_indexical_record_explicit_genls", "SM-UPDATE-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_p", "SM-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_indexical", "SM-NEW-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_type", "SM-INDEXICAL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_number", "SM-INDEXICAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_of_scenarioP", "SM-INDEXICAL-OF-SCENARIO?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_of_indexical", "SM-INDEXICAL-RECORD-OF-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_constraint_record_print_function_trampoline", "SM-CONSTRAINT-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_constraint_record_p", "SM-CONSTRAINT-RECORD-P", 1, 0, false);
        new $sm_constraint_record_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_constraint_record_id", "SM-CONSTRAINT-RECORD-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_constraint_record_sentence", "SM-CONSTRAINT-RECORD-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_constraint_record_nl_sentence", "SM-CONSTRAINT-RECORD-NL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_constraint_record_id", "_CSETF-SM-CONSTRAINT-RECORD-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_constraint_record_sentence", "_CSETF-SM-CONSTRAINT-RECORD-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_constraint_record_nl_sentence", "_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "make_sm_constraint_record", "MAKE-SM-CONSTRAINT-RECORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_sm_constraint_record", "VISIT-DEFSTRUCT-SM-CONSTRAINT-RECORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_object_sm_constraint_record_method", "VISIT-DEFSTRUCT-OBJECT-SM-CONSTRAINT-RECORD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_constraint_record", "SM-NEW-CONSTRAINT-RECORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_constraint_record_sentence", "SM-SET-CONSTRAINT-RECORD-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_constraint_record_nl_sentence", "SM-SET-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_rem_constraint_record_nl_sentence", "SM-REM-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_cleanup_constraint_record", "SM-CLEANUP-CONSTRAINT-RECORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_term_p", "SM-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_print_function_trampoline", "SM-MERGE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_p", "SM-MERGE-INFO-P", 1, 0, false);
        new $sm_merge_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_id", "SM-MERGE-INFO-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_from_scenario", "SM-MERGE-INFO-FROM-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_to_scenario", "SM-MERGE-INFO-TO-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_align_to", "SM-MERGE-INFO-ALIGN-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_align_from", "SM-MERGE-INFO-ALIGN-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_info_indexical_equivalences", "SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_merge_info_id", "_CSETF-SM-MERGE-INFO-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_merge_info_from_scenario", "_CSETF-SM-MERGE-INFO-FROM-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_merge_info_to_scenario", "_CSETF-SM-MERGE-INFO-TO-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_merge_info_align_to", "_CSETF-SM-MERGE-INFO-ALIGN-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_merge_info_align_from", "_CSETF-SM-MERGE-INFO-ALIGN-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_merge_info_indexical_equivalences", "_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "make_sm_merge_info", "MAKE-SM-MERGE-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_sm_merge_info", "VISIT-DEFSTRUCT-SM-MERGE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_object_sm_merge_info_method", "VISIT-DEFSTRUCT-OBJECT-SM-MERGE-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_merge_info", "SM-NEW-MERGE-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_cleanup_merge_info", "SM-CLEANUP-MERGE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_merge_info_from_scenario", "SM-SET-MERGE-INFO-FROM-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_merge_info_to_scenario", "SM-SET-MERGE-INFO-TO-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_merge_info_align_to", "SM-SET-MERGE-INFO-ALIGN-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_merge_info_align_from", "SM-SET-MERGE-INFO-ALIGN-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "update_sm_merge_info_indexical_equivalences", "UPDATE-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_print_function_trampoline", "SM-GEN-POINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_p", "SM-GEN-POINT-P", 1, 0, false);
        new $sm_gen_point_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_id", "SM-GEN-POINT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_non_indexical", "SM-GEN-POINT-NON-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_isas", "SM-GEN-POINT-ISAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_genls", "SM-GEN-POINT-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_positions", "SM-GEN-POINT-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_indexical_record", "SM-GEN-POINT-INDEXICAL-RECORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_keyword", "SM-GEN-POINT-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_id", "_CSETF-SM-GEN-POINT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_non_indexical", "_CSETF-SM-GEN-POINT-NON-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_isas", "_CSETF-SM-GEN-POINT-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_genls", "_CSETF-SM-GEN-POINT-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_positions", "_CSETF-SM-GEN-POINT-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_indexical_record", "_CSETF-SM-GEN-POINT-INDEXICAL-RECORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "_csetf_sm_gen_point_keyword", "_CSETF-SM-GEN-POINT-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "make_sm_gen_point", "MAKE-SM-GEN-POINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_sm_gen_point", "VISIT-DEFSTRUCT-SM-GEN-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "visit_defstruct_object_sm_gen_point_method", "VISIT-DEFSTRUCT-OBJECT-SM-GEN-POINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_new_gen_point", "SM-NEW-GEN-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_gen_point_isas", "SM-ADD-GEN-POINT-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_gen_point_genls", "SM-ADD-GEN-POINT-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_add_gen_point_position", "SM-ADD-GEN-POINT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_set_gen_point_indexical_record", "SM-SET-GEN-POINT-INDEXICAL-RECORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_grab_or_compute_gen_point_keyword", "SM-GRAB-OR-COMPUTE-GEN-POINT-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_best_gen_point_type", "SM-BEST-GEN-POINT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_cleanup_gen_point", "SM-CLEANUP-GEN-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_simple_compute_and_set_indexical_phrase", "SM-SIMPLE-COMPUTE-AND-SET-INDEXICAL-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_choose_optimal_genls", "SM-CHOOSE-OPTIMAL-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_choose_optimal_isa", "SM-CHOOSE-OPTIMAL-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_indexical_records_of_type", "SM-SCENARIO-INDEXICAL-RECORDS-OF-TYPE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_number_indexical_phrases", "SM-NUMBER-INDEXICAL-PHRASES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_uniquify_two_indexical_records", "SM-UNIQUIFY-TWO-INDEXICAL-RECORDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_number_one_indexical_phrase", "SM-NUMBER-ONE-INDEXICAL-PHRASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_generate_indexical_phrases_for_scenario", "SM-GENERATE-INDEXICAL-PHRASES-FOR-SCENARIO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_read_scenario", "SM-ACT-READ-SCENARIO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_retrieve_scenario_fort_indexical_records", "SM-RETRIEVE-SCENARIO-FORT-INDEXICAL-RECORDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_retrieve_scenario_terms_for_scenario", "SM-RETRIEVE-SCENARIO-TERMS-FOR-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_retrieve_scenario_referents_for_scenario", "SM-RETRIEVE-SCENARIO-REFERENTS-FOR-SCENARIO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_retrieve_scenario_fort_constraint_records", "SM-RETRIEVE-SCENARIO-FORT-CONSTRAINT-RECORDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_substitute_terms_for_indexicals", "SM-SUBSTITUTE-TERMS-FOR-INDEXICALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_suggest_scenarios", "SM-ACT-SUGGEST-SCENARIOS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_extract_candidate_scenario_expressions", "SM-EXTRACT-CANDIDATE-SCENARIO-EXPRESSIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_initialize_scenario_from_expression", "SM-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_expression_ok", "SM-SCENARIO-EXPRESSION-OK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_el_wftP", "SM-EL-WFT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_constraints_wffP", "SM-SCENARIO-CONSTRAINTS-WFF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_fetch_scenario_phrase", "SM-FETCH-SCENARIO-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_initialize_scenario_from_cycl", "SM-ACT-INITIALIZE-SCENARIO-FROM-CYCL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_extract_cycl_sentence_vars", "SM-EXTRACT-CYCL-SENTENCE-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_extract_types_for_var", "SM-EXTRACT-TYPES-FOR-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_extract_cycl_sentence_constraints", "SM-EXTRACT-CYCL-SENTENCE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_atomic_sentenceP", "SM-ATOMIC-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_negated_atomic_sentenceP", "SM-NEGATED-ATOMIC-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_suggest_new_indexical_type", "SM-ACT-SUGGEST-NEW-INDEXICAL-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_add_new_indexical", "SM-ACT-ADD-NEW-INDEXICAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_share_scenario_term", "SM-ACT-SHARE-SCENARIO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_get_next_indexical_number_of_type", "SM-GET-NEXT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_extract_entire_parses_of_type", "SM-EXTRACT-ENTIRE-PARSES-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_find_indexical", "SM-ACT-FIND-INDEXICAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_suggest_differences", "SM-ACT-SUGGEST-DIFFERENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_record_get_collections", "SM-INDEXICAL-RECORD-GET-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_distinguish_indexicals", "SM-ACT-DISTINGUISH-INDEXICALS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_remove_indexical", "SM-ACT-REMOVE-INDEXICAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_remove_dependent_constraints", "SM-REMOVE-DEPENDENT-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_add_indexical_phrase", "SM-ACT-ADD-INDEXICAL-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_remove_indexical_phrase", "SM-ACT-REMOVE-INDEXICAL-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_gather_all_preferred_indexical_phrases", "SM-ACT-GATHER-ALL-PREFERRED-INDEXICAL-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_resolve_phrase_to_term", "SM-ACT-RESOLVE-PHRASE-TO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_remove_isaXgenls_constraint", "SM-ACT-REMOVE-ISA/GENLS-CONSTRAINT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_get_all_isas_for_indexicals", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_get_all_isas_for_indexicals_memoized_internal", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_get_all_isas_for_indexicals_memoized", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_get_all_genls_for_indexicals", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_get_all_genls_for_indexicals_memoized_internal", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_get_all_genls_for_indexicals_memoized", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_suggest_constraint_cycl_from_text", "SM-ACT-SUGGEST-CONSTRAINT-CYCL-FROM-TEXT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_add_scenario_constraint", "SM-ACT-ADD-SCENARIO-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_indexical_parse_substitute", "SM-INDEXICAL-PARSE-SUBSTITUTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_unresolved_item_for_phrase", "SM-UNRESOLVED-ITEM-FOR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_unresolved_equal", "SM-UNRESOLVED-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_subphrase", "SM-SUBPHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_parse_result_substitute", "SM-PARSE-RESULT-SUBSTITUTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_sentence_ok_for_scenarioP", "SM-SENTENCE-OK-FOR-SCENARIO?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_term_requires_types_in_relation", "SM-TERM-REQUIRES-TYPES-IN-RELATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_term_requires_types_in_relations", "SM-TERM-REQUIRES-TYPES-IN-RELATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_identify_violating_collection_pair", "SM-IDENTIFY-VIOLATING-COLLECTION-PAIR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_compute_current_indexical_isas_genls", "SM-COMPUTE-CURRENT-INDEXICAL-ISAS-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_scenario_type_constraints_on_term", "SM-SCENARIO-TYPE-CONSTRAINTS-ON-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_remove_constraint", "SM-ACT-REMOVE-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_remove_all_constraints", "SM-ACT-REMOVE-ALL-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_remove_many_constraints", "SM-ACT-REMOVE-MANY-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_import_constraint", "SM-ACT-IMPORT-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_gather_constraint_formulas", "SM-ACT-GATHER-CONSTRAINT-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_gather_constraint_formulas_memoized_internal", "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_gather_constraint_formulas_memoized", "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_modify_phrase", "SM-ACT-MODIFY-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_constraint_record_nl_sentence", "SM-ACT-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_compute_one_constraint_record_nl_sentence", "SM-COMPUTE-ONE-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_compute_constraint_record_nl_sentence", "SM-COMPUTE-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_substitute_phrases_for_indexicals", "SM-SUBSTITUTE-PHRASES-FOR-INDEXICALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_merge_scenarios", "SM-ACT-MERGE-SCENARIOS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_substitute_indexical_equivalences_in_sentence", "SM-MERGE-SUBSTITUTE-INDEXICAL-EQUIVALENCES-IN-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_merge_replace_non_equivalent_indexical", "SM-MERGE-REPLACE-NON-EQUIVALENT-INDEXICAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_ensure_new_indexical_number_of_type", "SM-ENSURE-NEW-INDEXICAL-NUMBER-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_generalize_scenario", "SM-ACT-GENERALIZE-SCENARIO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_generalize_scenario_with_gen_points", "SM-ACT-GENERALIZE-SCENARIO-WITH-GEN-POINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_scenario_generalization_points", "SM-ACT-COMPUTE-SCENARIO-GENERALIZATION-POINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_all_phrases_for_term", "SM-ALL-PHRASES-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_non_indexicals_of_constraints", "SM-NON-INDEXICALS-OF-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_without_positions_p", "SM-GEN-POINT-WITHOUT-POSITIONS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_compute_template_expr_from_generalization_points", "SM-COMPUTE-TEMPLATE-EXPR-FROM-GENERALIZATION-POINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_gen_point_starting_at", "SM-GEN-POINT-STARTING-AT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_best_gen_point_sequence", "SM-BEST-GEN-POINT-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_type_for_gen_point", "SM-TEMPLATE-TYPE-FOR-GEN-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_template_type_for_collection", "SM-TEMPLATE-TYPE-FOR-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_compute_template_param_subs_from_generalization_points", "SM-COMPUTE-TEMPLATE-PARAM-SUBS-FROM-GENERALIZATION-POINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_construct_gen_point_indexical_record", "SM-CONSTRUCT-GEN-POINT-INDEXICAL-RECORD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_get_next_gen_point_indexical_number_of_type", "SM-GET-NEXT-GEN-POINT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_generalize_scenario_constraints", "SM-GENERALIZE-SCENARIO-CONSTRAINTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_apply_gen_point_to_template_constraints", "SM-APPLY-GEN-POINT-TO-TEMPLATE-CONSTRAINTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_de_apply_gen_point_to_template_constraints", "SM-DE-APPLY-GEN-POINT-TO-TEMPLATE-CONSTRAINTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_generate_text_from_template_expr", "SM-GENERATE-TEXT-FROM-TEMPLATE-EXPR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_generate_text_from_template_element", "SM-GENERATE-TEXT-FROM-TEMPLATE-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_generate_blank_for_template_element", "SM-GENERATE-BLANK-FOR-TEMPLATE-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_save_scenario", "SM-ACT-SAVE-SCENARIO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_save_scenario_terms_and_referents", "SM-SAVE-SCENARIO-TERMS-AND-REFERENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_save_scenario_terms_and_referents_int", "SM-SAVE-SCENARIO-TERMS-AND-REFERENTS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_save_template_constraints", "SM-SAVE-TEMPLATE-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_save_scenario_term_template", "SM-SAVE-SCENARIO-TERM-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_enumerate_saved_scenarios", "SM-ACT-ENUMERATE-SAVED-SCENARIOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_enumerate_scenarios_identify_term_template", "SM-ENUMERATE-SCENARIOS-IDENTIFY-TERM-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_enumerate_scenarios_unpack_template_expression", "SM-ENUMERATE-SCENARIOS-UNPACK-TEMPLATE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_discard_template", "SM-ACT-DISCARD-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_unused_indexicals", "SM-ACT-COMPUTE-UNUSED-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_unused_indexicals_memoized_internal", "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_unused_indexicals_memoized", "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_explicit_type_constraints", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_explicit_type_constraints_memoized_internal", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_explicit_type_constraints_memoized", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_indexical_constraints", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_indexical_constraints_memoized_internal", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_compute_indexical_constraints_memoized", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_set_indexical_record_var", "SM-ACT-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_add_explicit_constraints", "SM-ACT-ADD-EXPLICIT-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_redundant_constraintP", "SM-REDUNDANT-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_propose_sentence_adjustments", "SM-ACT-PROPOSE-SENTENCE-ADJUSTMENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_propose_gaf_sentence_adjustments", "SM-PROPOSE-GAF-SENTENCE-ADJUSTMENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_construct_indexical_table", "SM-ACT-CONSTRUCT-INDEXICAL-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_construct_indexical_table_from_indexical_records", "SM-ACT-CONSTRUCT-INDEXICAL-TABLE-FROM-INDEXICAL-RECORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_construct_indexical_constraint_table", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_construct_indexical_constraint_table_memoized_internal", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_scenario_manipulator", "sm_act_construct_indexical_constraint_table_memoized", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED", 1, 0, false);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    public static SubLObject init_rkf_scenario_manipulator_file() {
        rkf_scenario_manipulator.$sm_lock$ = SubLFiles.deflexical("*SM-LOCK*", Locks.make_lock((SubLObject)rkf_scenario_manipulator.$str0$Scenario_Manipulator_Lock));
        rkf_scenario_manipulator.$sm_isg$ = SubLFiles.deflexical("*SM-ISG*", maybeDefault((SubLObject)rkf_scenario_manipulator.$sym3$_SM_ISG_, rkf_scenario_manipulator.$sm_isg$, ()->(integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED))));
        rkf_scenario_manipulator.$sm_index$ = SubLFiles.deflexical("*SM-INDEX*", maybeDefault((SubLObject)rkf_scenario_manipulator.$sym4$_SM_INDEX_, rkf_scenario_manipulator.$sm_index$, ()->(dictionary.new_dictionary((SubLObject)rkf_scenario_manipulator.UNPROVIDED, (SubLObject)rkf_scenario_manipulator.UNPROVIDED))));
        rkf_scenario_manipulator.$dtp_sm_scenario$ = SubLFiles.defconstant("*DTP-SM-SCENARIO*", (SubLObject)rkf_scenario_manipulator.$sym5$SM_SCENARIO);
        rkf_scenario_manipulator.$dtp_sm_template$ = SubLFiles.defconstant("*DTP-SM-TEMPLATE*", (SubLObject)rkf_scenario_manipulator.$sym63$SM_TEMPLATE);
        rkf_scenario_manipulator.$dtp_sm_indexical_record$ = SubLFiles.defconstant("*DTP-SM-INDEXICAL-RECORD*", (SubLObject)rkf_scenario_manipulator.$sym96$SM_INDEXICAL_RECORD);
        rkf_scenario_manipulator.$dtp_sm_constraint_record$ = SubLFiles.defconstant("*DTP-SM-CONSTRAINT-RECORD*", (SubLObject)rkf_scenario_manipulator.$sym134$SM_CONSTRAINT_RECORD);
        rkf_scenario_manipulator.$dtp_sm_merge_info$ = SubLFiles.defconstant("*DTP-SM-MERGE-INFO*", (SubLObject)rkf_scenario_manipulator.$sym152$SM_MERGE_INFO);
        rkf_scenario_manipulator.$dtp_sm_gen_point$ = SubLFiles.defconstant("*DTP-SM-GEN-POINT*", (SubLObject)rkf_scenario_manipulator.$sym179$SM_GEN_POINT);
        rkf_scenario_manipulator.$sm_indexical_numbered_phrases$ = SubLFiles.deflexical("*SM-INDEXICAL-NUMBERED-PHRASES*", (SubLObject)rkf_scenario_manipulator.$list213);
        rkf_scenario_manipulator.$sm_semantic_mt$ = SubLFiles.defparameter("*SM-SEMANTIC-MT*", (SubLObject)rkf_scenario_manipulator.NIL);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    public static SubLObject setup_rkf_scenario_manipulator_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_scenario_manipulator.$sym3$_SM_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_scenario_manipulator.$sym4$_SM_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_scenario$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym12$SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_manipulator.$list13);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym14$SM_SCENARIO_ID, (SubLObject)rkf_scenario_manipulator.$sym15$_CSETF_SM_SCENARIO_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym16$SM_SCENARIO_SESSIONS, (SubLObject)rkf_scenario_manipulator.$sym17$_CSETF_SM_SCENARIO_SESSIONS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym18$SM_SCENARIO_PHRASE, (SubLObject)rkf_scenario_manipulator.$sym19$_CSETF_SM_SCENARIO_PHRASE);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym20$SM_SCENARIO_CANDIDATE_TERMS, (SubLObject)rkf_scenario_manipulator.$sym21$_CSETF_SM_SCENARIO_CANDIDATE_TERMS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym22$SM_SCENARIO_CANDIDATE_CONSTRAINTS, (SubLObject)rkf_scenario_manipulator.$sym23$_CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym24$SM_SCENARIO_FORT, (SubLObject)rkf_scenario_manipulator.$sym25$_CSETF_SM_SCENARIO_FORT);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym26$SM_SCENARIO_TERMS, (SubLObject)rkf_scenario_manipulator.$sym27$_CSETF_SM_SCENARIO_TERMS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym28$SM_SCENARIO_CONSTRAINTS, (SubLObject)rkf_scenario_manipulator.$sym29$_CSETF_SM_SCENARIO_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym30$SM_SCENARIO_TEMPLATES, (SubLObject)rkf_scenario_manipulator.$sym31$_CSETF_SM_SCENARIO_TEMPLATES);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym32$SM_SCENARIO_STATE, (SubLObject)rkf_scenario_manipulator.$sym33$_CSETF_SM_SCENARIO_STATE);
        Equality.identity((SubLObject)rkf_scenario_manipulator.$sym5$SM_SCENARIO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_scenario$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym49$VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym68$SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_manipulator.$list69);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym70$SM_TEMPLATE_ID, (SubLObject)rkf_scenario_manipulator.$sym71$_CSETF_SM_TEMPLATE_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym72$SM_TEMPLATE_SCENARIO, (SubLObject)rkf_scenario_manipulator.$sym73$_CSETF_SM_TEMPLATE_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym74$SM_TEMPLATE_PHRASE, (SubLObject)rkf_scenario_manipulator.$sym75$_CSETF_SM_TEMPLATE_PHRASE);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym76$SM_TEMPLATE_EXPRESSION, (SubLObject)rkf_scenario_manipulator.$sym77$_CSETF_SM_TEMPLATE_EXPRESSION);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym78$SM_TEMPLATE_PARAM_SUBS, (SubLObject)rkf_scenario_manipulator.$sym79$_CSETF_SM_TEMPLATE_PARAM_SUBS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym80$SM_TEMPLATE_PARAMETERS, (SubLObject)rkf_scenario_manipulator.$sym81$_CSETF_SM_TEMPLATE_PARAMETERS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym82$SM_TEMPLATE_CONSTRAINTS, (SubLObject)rkf_scenario_manipulator.$sym83$_CSETF_SM_TEMPLATE_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym84$SM_TEMPLATE_STATE, (SubLObject)rkf_scenario_manipulator.$sym85$_CSETF_SM_TEMPLATE_STATE);
        Equality.identity((SubLObject)rkf_scenario_manipulator.$sym63$SM_TEMPLATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym91$VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_indexical_record$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym101$SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_manipulator.$list102);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym103$SM_INDEXICAL_RECORD_ID, (SubLObject)rkf_scenario_manipulator.$sym104$_CSETF_SM_INDEXICAL_RECORD_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym105$SM_INDEXICAL_RECORD_INDEXICAL, (SubLObject)rkf_scenario_manipulator.$sym106$_CSETF_SM_INDEXICAL_RECORD_INDEXICAL);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym107$SM_INDEXICAL_RECORD_PHRASES, (SubLObject)rkf_scenario_manipulator.$sym108$_CSETF_SM_INDEXICAL_RECORD_PHRASES);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym109$SM_INDEXICAL_RECORD_VAR, (SubLObject)rkf_scenario_manipulator.$sym110$_CSETF_SM_INDEXICAL_RECORD_VAR);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym111$SM_INDEXICAL_RECORD_EXPLICIT_ISAS, (SubLObject)rkf_scenario_manipulator.$sym112$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym113$SM_INDEXICAL_RECORD_EXPLICIT_GENLS, (SubLObject)rkf_scenario_manipulator.$sym114$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym115$SM_INDEXICAL_RECORD_ISAS, (SubLObject)rkf_scenario_manipulator.$sym116$_CSETF_SM_INDEXICAL_RECORD_ISAS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym117$SM_INDEXICAL_RECORD_GENLS, (SubLObject)rkf_scenario_manipulator.$sym118$_CSETF_SM_INDEXICAL_RECORD_GENLS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym119$SM_INDEXICAL_RECORD_STATE, (SubLObject)rkf_scenario_manipulator.$sym120$_CSETF_SM_INDEXICAL_RECORD_STATE);
        Equality.identity((SubLObject)rkf_scenario_manipulator.$sym96$SM_INDEXICAL_RECORD);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_indexical_record$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym129$VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_constraint_record$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym139$SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_manipulator.$list140);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym141$SM_CONSTRAINT_RECORD_ID, (SubLObject)rkf_scenario_manipulator.$sym142$_CSETF_SM_CONSTRAINT_RECORD_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym143$SM_CONSTRAINT_RECORD_SENTENCE, (SubLObject)rkf_scenario_manipulator.$sym144$_CSETF_SM_CONSTRAINT_RECORD_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym145$SM_CONSTRAINT_RECORD_NL_SENTENCE, (SubLObject)rkf_scenario_manipulator.$sym146$_CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE);
        Equality.identity((SubLObject)rkf_scenario_manipulator.$sym134$SM_CONSTRAINT_RECORD);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_constraint_record$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym150$VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_merge_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym158$SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_manipulator.$list159);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym160$SM_MERGE_INFO_ID, (SubLObject)rkf_scenario_manipulator.$sym161$_CSETF_SM_MERGE_INFO_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym162$SM_MERGE_INFO_FROM_SCENARIO, (SubLObject)rkf_scenario_manipulator.$sym163$_CSETF_SM_MERGE_INFO_FROM_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym164$SM_MERGE_INFO_TO_SCENARIO, (SubLObject)rkf_scenario_manipulator.$sym165$_CSETF_SM_MERGE_INFO_TO_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym166$SM_MERGE_INFO_ALIGN_TO, (SubLObject)rkf_scenario_manipulator.$sym167$_CSETF_SM_MERGE_INFO_ALIGN_TO);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym168$SM_MERGE_INFO_ALIGN_FROM, (SubLObject)rkf_scenario_manipulator.$sym169$_CSETF_SM_MERGE_INFO_ALIGN_FROM);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym170$SM_MERGE_INFO_INDEXICAL_EQUIVALENCES, (SubLObject)rkf_scenario_manipulator.$sym171$_CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES);
        Equality.identity((SubLObject)rkf_scenario_manipulator.$sym152$SM_MERGE_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_merge_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym178$VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_gen_point$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym185$SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_scenario_manipulator.$list186);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym187$SM_GEN_POINT_ID, (SubLObject)rkf_scenario_manipulator.$sym188$_CSETF_SM_GEN_POINT_ID);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym189$SM_GEN_POINT_NON_INDEXICAL, (SubLObject)rkf_scenario_manipulator.$sym190$_CSETF_SM_GEN_POINT_NON_INDEXICAL);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym191$SM_GEN_POINT_ISAS, (SubLObject)rkf_scenario_manipulator.$sym192$_CSETF_SM_GEN_POINT_ISAS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym193$SM_GEN_POINT_GENLS, (SubLObject)rkf_scenario_manipulator.$sym194$_CSETF_SM_GEN_POINT_GENLS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym195$SM_GEN_POINT_POSITIONS, (SubLObject)rkf_scenario_manipulator.$sym196$_CSETF_SM_GEN_POINT_POSITIONS);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym197$SM_GEN_POINT_INDEXICAL_RECORD, (SubLObject)rkf_scenario_manipulator.$sym198$_CSETF_SM_GEN_POINT_INDEXICAL_RECORD);
        Structures.def_csetf((SubLObject)rkf_scenario_manipulator.$sym199$SM_GEN_POINT_KEYWORD, (SubLObject)rkf_scenario_manipulator.$sym200$_CSETF_SM_GEN_POINT_KEYWORD);
        Equality.identity((SubLObject)rkf_scenario_manipulator.$sym179$SM_GEN_POINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_gen_point$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_scenario_manipulator.$sym206$VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD));
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)rkf_scenario_manipulator.$sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED);
        return (SubLObject)rkf_scenario_manipulator.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_scenario_manipulator_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_scenario_manipulator_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_scenario_manipulator_file();
    }
    
    static {
        me = (SubLFile)new rkf_scenario_manipulator();
        rkf_scenario_manipulator.$sm_lock$ = null;
        rkf_scenario_manipulator.$sm_isg$ = null;
        rkf_scenario_manipulator.$sm_index$ = null;
        rkf_scenario_manipulator.$dtp_sm_scenario$ = null;
        rkf_scenario_manipulator.$dtp_sm_template$ = null;
        rkf_scenario_manipulator.$dtp_sm_indexical_record$ = null;
        rkf_scenario_manipulator.$dtp_sm_constraint_record$ = null;
        rkf_scenario_manipulator.$dtp_sm_merge_info$ = null;
        rkf_scenario_manipulator.$dtp_sm_gen_point$ = null;
        rkf_scenario_manipulator.$sm_indexical_numbered_phrases$ = null;
        rkf_scenario_manipulator.$sm_semantic_mt$ = null;
        $str0$Scenario_Manipulator_Lock = SubLObjectFactory.makeString("Scenario Manipulator Lock");
        $sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SM-LOCK*"));
        $sym3$_SM_ISG_ = SubLObjectFactory.makeSymbol("*SM-ISG*");
        $sym4$_SM_INDEX_ = SubLObjectFactory.makeSymbol("*SM-INDEX*");
        $sym5$SM_SCENARIO = SubLObjectFactory.makeSymbol("SM-SCENARIO");
        $sym6$SM_SCENARIO_P = SubLObjectFactory.makeSymbol("SM-SCENARIO-P");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SESSIONS"), SubLObjectFactory.makeSymbol("PHRASE"), SubLObjectFactory.makeSymbol("CANDIDATE-TERMS"), SubLObjectFactory.makeSymbol("CANDIDATE-CONSTRAINTS"), SubLObjectFactory.makeSymbol("FORT"), SubLObjectFactory.makeSymbol("TERMS"), SubLObjectFactory.makeSymbol("CONSTRAINTS"), SubLObjectFactory.makeSymbol("TEMPLATES"), SubLObjectFactory.makeSymbol("STATE") });
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SESSIONS"), SubLObjectFactory.makeKeyword("PHRASE"), SubLObjectFactory.makeKeyword("CANDIDATE-TERMS"), SubLObjectFactory.makeKeyword("CANDIDATE-CONSTRAINTS"), SubLObjectFactory.makeKeyword("FORT"), SubLObjectFactory.makeKeyword("TERMS"), SubLObjectFactory.makeKeyword("CONSTRAINTS"), SubLObjectFactory.makeKeyword("TEMPLATES"), SubLObjectFactory.makeKeyword("STATE") });
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SM-SCENARIO-ID"), SubLObjectFactory.makeSymbol("SM-SCENARIO-SESSIONS"), SubLObjectFactory.makeSymbol("SM-SCENARIO-PHRASE"), SubLObjectFactory.makeSymbol("SM-SCENARIO-CANDIDATE-TERMS"), SubLObjectFactory.makeSymbol("SM-SCENARIO-CANDIDATE-CONSTRAINTS"), SubLObjectFactory.makeSymbol("SM-SCENARIO-FORT"), SubLObjectFactory.makeSymbol("SM-SCENARIO-TERMS"), SubLObjectFactory.makeSymbol("SM-SCENARIO-CONSTRAINTS"), SubLObjectFactory.makeSymbol("SM-SCENARIO-TEMPLATES"), SubLObjectFactory.makeSymbol("SM-SCENARIO-STATE") });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-ID"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-SESSIONS"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-PHRASE"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-TERMS"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-FORT"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-TERMS"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-TEMPLATES"), SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-STATE") });
        $sym11$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym12$SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SM-SCENARIO-PRINT-FUNCTION-TRAMPOLINE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-SCENARIO-P"));
        $sym14$SM_SCENARIO_ID = SubLObjectFactory.makeSymbol("SM-SCENARIO-ID");
        $sym15$_CSETF_SM_SCENARIO_ID = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-ID");
        $sym16$SM_SCENARIO_SESSIONS = SubLObjectFactory.makeSymbol("SM-SCENARIO-SESSIONS");
        $sym17$_CSETF_SM_SCENARIO_SESSIONS = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-SESSIONS");
        $sym18$SM_SCENARIO_PHRASE = SubLObjectFactory.makeSymbol("SM-SCENARIO-PHRASE");
        $sym19$_CSETF_SM_SCENARIO_PHRASE = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-PHRASE");
        $sym20$SM_SCENARIO_CANDIDATE_TERMS = SubLObjectFactory.makeSymbol("SM-SCENARIO-CANDIDATE-TERMS");
        $sym21$_CSETF_SM_SCENARIO_CANDIDATE_TERMS = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-TERMS");
        $sym22$SM_SCENARIO_CANDIDATE_CONSTRAINTS = SubLObjectFactory.makeSymbol("SM-SCENARIO-CANDIDATE-CONSTRAINTS");
        $sym23$_CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS");
        $sym24$SM_SCENARIO_FORT = SubLObjectFactory.makeSymbol("SM-SCENARIO-FORT");
        $sym25$_CSETF_SM_SCENARIO_FORT = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-FORT");
        $sym26$SM_SCENARIO_TERMS = SubLObjectFactory.makeSymbol("SM-SCENARIO-TERMS");
        $sym27$_CSETF_SM_SCENARIO_TERMS = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-TERMS");
        $sym28$SM_SCENARIO_CONSTRAINTS = SubLObjectFactory.makeSymbol("SM-SCENARIO-CONSTRAINTS");
        $sym29$_CSETF_SM_SCENARIO_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-CONSTRAINTS");
        $sym30$SM_SCENARIO_TEMPLATES = SubLObjectFactory.makeSymbol("SM-SCENARIO-TEMPLATES");
        $sym31$_CSETF_SM_SCENARIO_TEMPLATES = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-TEMPLATES");
        $sym32$SM_SCENARIO_STATE = SubLObjectFactory.makeSymbol("SM-SCENARIO-STATE");
        $sym33$_CSETF_SM_SCENARIO_STATE = SubLObjectFactory.makeSymbol("_CSETF-SM-SCENARIO-STATE");
        $kw34$ID = SubLObjectFactory.makeKeyword("ID");
        $kw35$SESSIONS = SubLObjectFactory.makeKeyword("SESSIONS");
        $kw36$PHRASE = SubLObjectFactory.makeKeyword("PHRASE");
        $kw37$CANDIDATE_TERMS = SubLObjectFactory.makeKeyword("CANDIDATE-TERMS");
        $kw38$CANDIDATE_CONSTRAINTS = SubLObjectFactory.makeKeyword("CANDIDATE-CONSTRAINTS");
        $kw39$FORT = SubLObjectFactory.makeKeyword("FORT");
        $kw40$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $kw41$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $kw42$TEMPLATES = SubLObjectFactory.makeKeyword("TEMPLATES");
        $kw43$STATE = SubLObjectFactory.makeKeyword("STATE");
        $str44$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw45$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym46$MAKE_SM_SCENARIO = SubLObjectFactory.makeSymbol("MAKE-SM-SCENARIO");
        $kw47$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw48$END = SubLObjectFactory.makeKeyword("END");
        $sym49$VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-SCENARIO-METHOD");
        $sym50$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym51$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym52$SM_INDEXICAL_RECORD_P = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-P");
        $sym53$SM_CONSTRAINT_RECORD_P = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-P");
        $sym54$SM_TEMPLATE_P = SubLObjectFactory.makeSymbol("SM-TEMPLATE-P");
        $kw55$BORROWED_INDEXICALS = SubLObjectFactory.makeKeyword("BORROWED-INDEXICALS");
        $kw56$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $kw57$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCENARIO")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym59$MEMOIZATION_STATE = SubLObjectFactory.makeUninternedSymbol("MEMOIZATION-STATE");
        $sym60$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym61$SM_SCENARIO_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("SM-SCENARIO-MEMOIZATION-STATE");
        $sym62$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $sym63$SM_TEMPLATE = SubLObjectFactory.makeSymbol("SM-TEMPLATE");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM-SUBS"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SCENARIO"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("EXPRESSION"), (SubLObject)SubLObjectFactory.makeKeyword("PARAM-SUBS"), (SubLObject)SubLObjectFactory.makeKeyword("PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-PARAM-SUBS"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-STATE"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-PARAM-SUBS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-STATE"));
        $sym68$SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SM-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-TEMPLATE-P"));
        $sym70$SM_TEMPLATE_ID = SubLObjectFactory.makeSymbol("SM-TEMPLATE-ID");
        $sym71$_CSETF_SM_TEMPLATE_ID = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-ID");
        $sym72$SM_TEMPLATE_SCENARIO = SubLObjectFactory.makeSymbol("SM-TEMPLATE-SCENARIO");
        $sym73$_CSETF_SM_TEMPLATE_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-SCENARIO");
        $sym74$SM_TEMPLATE_PHRASE = SubLObjectFactory.makeSymbol("SM-TEMPLATE-PHRASE");
        $sym75$_CSETF_SM_TEMPLATE_PHRASE = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-PHRASE");
        $sym76$SM_TEMPLATE_EXPRESSION = SubLObjectFactory.makeSymbol("SM-TEMPLATE-EXPRESSION");
        $sym77$_CSETF_SM_TEMPLATE_EXPRESSION = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-EXPRESSION");
        $sym78$SM_TEMPLATE_PARAM_SUBS = SubLObjectFactory.makeSymbol("SM-TEMPLATE-PARAM-SUBS");
        $sym79$_CSETF_SM_TEMPLATE_PARAM_SUBS = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-PARAM-SUBS");
        $sym80$SM_TEMPLATE_PARAMETERS = SubLObjectFactory.makeSymbol("SM-TEMPLATE-PARAMETERS");
        $sym81$_CSETF_SM_TEMPLATE_PARAMETERS = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-PARAMETERS");
        $sym82$SM_TEMPLATE_CONSTRAINTS = SubLObjectFactory.makeSymbol("SM-TEMPLATE-CONSTRAINTS");
        $sym83$_CSETF_SM_TEMPLATE_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-CONSTRAINTS");
        $sym84$SM_TEMPLATE_STATE = SubLObjectFactory.makeSymbol("SM-TEMPLATE-STATE");
        $sym85$_CSETF_SM_TEMPLATE_STATE = SubLObjectFactory.makeSymbol("_CSETF-SM-TEMPLATE-STATE");
        $kw86$SCENARIO = SubLObjectFactory.makeKeyword("SCENARIO");
        $kw87$EXPRESSION = SubLObjectFactory.makeKeyword("EXPRESSION");
        $kw88$PARAM_SUBS = SubLObjectFactory.makeKeyword("PARAM-SUBS");
        $kw89$PARAMETERS = SubLObjectFactory.makeKeyword("PARAMETERS");
        $sym90$MAKE_SM_TEMPLATE = SubLObjectFactory.makeSymbol("MAKE-SM-TEMPLATE");
        $sym91$VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-TEMPLATE-METHOD");
        $sym92$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $const93$ScenarioInstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioInstanceFn"));
        $sym94$NAUT_ = SubLObjectFactory.makeSymbol("NAUT?");
        $sym95$SM_SCENARIO_EXPRESSION_P = SubLObjectFactory.makeSymbol("SM-SCENARIO-EXPRESSION-P");
        $sym96$SM_INDEXICAL_RECORD = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD");
        $list97 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("INDEXICAL"), SubLObjectFactory.makeSymbol("PHRASES"), SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("EXPLICIT-ISAS"), SubLObjectFactory.makeSymbol("EXPLICIT-GENLS"), SubLObjectFactory.makeSymbol("ISAS"), SubLObjectFactory.makeSymbol("GENLS"), SubLObjectFactory.makeSymbol("STATE") });
        $list98 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("INDEXICAL"), SubLObjectFactory.makeKeyword("PHRASES"), SubLObjectFactory.makeKeyword("VAR"), SubLObjectFactory.makeKeyword("EXPLICIT-ISAS"), SubLObjectFactory.makeKeyword("EXPLICIT-GENLS"), SubLObjectFactory.makeKeyword("ISAS"), SubLObjectFactory.makeKeyword("GENLS"), SubLObjectFactory.makeKeyword("STATE") });
        $list99 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-ID"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-INDEXICAL"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-PHRASES"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-VAR"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-ISAS"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-GENLS"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-ISAS"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-GENLS"), SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-STATE") });
        $list100 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ID"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-INDEXICAL"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-VAR"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ISAS"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-GENLS"), SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-STATE") });
        $sym101$SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-PRINT-FUNCTION-TRAMPOLINE");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-P"));
        $sym103$SM_INDEXICAL_RECORD_ID = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-ID");
        $sym104$_CSETF_SM_INDEXICAL_RECORD_ID = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ID");
        $sym105$SM_INDEXICAL_RECORD_INDEXICAL = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-INDEXICAL");
        $sym106$_CSETF_SM_INDEXICAL_RECORD_INDEXICAL = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-INDEXICAL");
        $sym107$SM_INDEXICAL_RECORD_PHRASES = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-PHRASES");
        $sym108$_CSETF_SM_INDEXICAL_RECORD_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-PHRASES");
        $sym109$SM_INDEXICAL_RECORD_VAR = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-VAR");
        $sym110$_CSETF_SM_INDEXICAL_RECORD_VAR = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-VAR");
        $sym111$SM_INDEXICAL_RECORD_EXPLICIT_ISAS = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-ISAS");
        $sym112$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS");
        $sym113$SM_INDEXICAL_RECORD_EXPLICIT_GENLS = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-GENLS");
        $sym114$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS");
        $sym115$SM_INDEXICAL_RECORD_ISAS = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-ISAS");
        $sym116$_CSETF_SM_INDEXICAL_RECORD_ISAS = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ISAS");
        $sym117$SM_INDEXICAL_RECORD_GENLS = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-GENLS");
        $sym118$_CSETF_SM_INDEXICAL_RECORD_GENLS = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-GENLS");
        $sym119$SM_INDEXICAL_RECORD_STATE = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-STATE");
        $sym120$_CSETF_SM_INDEXICAL_RECORD_STATE = SubLObjectFactory.makeSymbol("_CSETF-SM-INDEXICAL-RECORD-STATE");
        $kw121$INDEXICAL = SubLObjectFactory.makeKeyword("INDEXICAL");
        $kw122$PHRASES = SubLObjectFactory.makeKeyword("PHRASES");
        $kw123$VAR = SubLObjectFactory.makeKeyword("VAR");
        $kw124$EXPLICIT_ISAS = SubLObjectFactory.makeKeyword("EXPLICIT-ISAS");
        $kw125$EXPLICIT_GENLS = SubLObjectFactory.makeKeyword("EXPLICIT-GENLS");
        $kw126$ISAS = SubLObjectFactory.makeKeyword("ISAS");
        $kw127$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym128$MAKE_SM_INDEXICAL_RECORD = SubLObjectFactory.makeSymbol("MAKE-SM-INDEXICAL-RECORD");
        $sym129$VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-INDEXICAL-RECORD-METHOD");
        $sym130$SM_INDEXICAL_P = SubLObjectFactory.makeSymbol("SM-INDEXICAL-P");
        $sym131$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const132$TheNthFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn"));
        $sym133$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym134$SM_CONSTRAINT_RECORD = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-SENTENCE"));
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("NL-SENTENCE"));
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-NL-SENTENCE"));
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE"));
        $sym139$SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-PRINT-FUNCTION-TRAMPOLINE");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-P"));
        $sym141$SM_CONSTRAINT_RECORD_ID = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-ID");
        $sym142$_CSETF_SM_CONSTRAINT_RECORD_ID = SubLObjectFactory.makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-ID");
        $sym143$SM_CONSTRAINT_RECORD_SENTENCE = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE");
        $sym144$_CSETF_SM_CONSTRAINT_RECORD_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-SENTENCE");
        $sym145$SM_CONSTRAINT_RECORD_NL_SENTENCE = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-NL-SENTENCE");
        $sym146$_CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE");
        $kw147$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw148$NL_SENTENCE = SubLObjectFactory.makeKeyword("NL-SENTENCE");
        $sym149$MAKE_SM_CONSTRAINT_RECORD = SubLObjectFactory.makeSymbol("MAKE-SM-CONSTRAINT-RECORD");
        $sym150$VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-CONSTRAINT-RECORD-METHOD");
        $sym151$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym152$SM_MERGE_INFO = SubLObjectFactory.makeSymbol("SM-MERGE-INFO");
        $sym153$SM_MERGE_INFO_P = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-P");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("TO-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("ALIGN-TO"), (SubLObject)SubLObjectFactory.makeSymbol("ALIGN-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-EQUIVALENCES"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("FROM-SCENARIO"), (SubLObject)SubLObjectFactory.makeKeyword("TO-SCENARIO"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN-TO"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN-FROM"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICAL-EQUIVALENCES"));
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-FROM-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-TO-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-ALIGN-TO"), (SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-ALIGN-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-INDEXICAL-EQUIVALENCES"));
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-FROM-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-TO-SCENARIO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-TO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES"));
        $sym158$SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-MERGE-INFO-P"));
        $sym160$SM_MERGE_INFO_ID = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-ID");
        $sym161$_CSETF_SM_MERGE_INFO_ID = SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-ID");
        $sym162$SM_MERGE_INFO_FROM_SCENARIO = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-FROM-SCENARIO");
        $sym163$_CSETF_SM_MERGE_INFO_FROM_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-FROM-SCENARIO");
        $sym164$SM_MERGE_INFO_TO_SCENARIO = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-TO-SCENARIO");
        $sym165$_CSETF_SM_MERGE_INFO_TO_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-TO-SCENARIO");
        $sym166$SM_MERGE_INFO_ALIGN_TO = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-ALIGN-TO");
        $sym167$_CSETF_SM_MERGE_INFO_ALIGN_TO = SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-TO");
        $sym168$SM_MERGE_INFO_ALIGN_FROM = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-ALIGN-FROM");
        $sym169$_CSETF_SM_MERGE_INFO_ALIGN_FROM = SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-FROM");
        $sym170$SM_MERGE_INFO_INDEXICAL_EQUIVALENCES = SubLObjectFactory.makeSymbol("SM-MERGE-INFO-INDEXICAL-EQUIVALENCES");
        $sym171$_CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES = SubLObjectFactory.makeSymbol("_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES");
        $kw172$FROM_SCENARIO = SubLObjectFactory.makeKeyword("FROM-SCENARIO");
        $kw173$TO_SCENARIO = SubLObjectFactory.makeKeyword("TO-SCENARIO");
        $kw174$ALIGN_TO = SubLObjectFactory.makeKeyword("ALIGN-TO");
        $kw175$ALIGN_FROM = SubLObjectFactory.makeKeyword("ALIGN-FROM");
        $kw176$INDEXICAL_EQUIVALENCES = SubLObjectFactory.makeKeyword("INDEXICAL-EQUIVALENCES");
        $sym177$MAKE_SM_MERGE_INFO = SubLObjectFactory.makeSymbol("MAKE-SM-MERGE-INFO");
        $sym178$VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-MERGE-INFO-METHOD");
        $sym179$SM_GEN_POINT = SubLObjectFactory.makeSymbol("SM-GEN-POINT");
        $sym180$SM_GEN_POINT_P = SubLObjectFactory.makeSymbol("SM-GEN-POINT-P");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("NON-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"));
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("NON-INDEXICAL"), (SubLObject)SubLObjectFactory.makeKeyword("ISAS"), (SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICAL-RECORD"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"));
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-NON-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-POSITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-INDEXICAL-RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-KEYWORD"));
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-NON-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-POSITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-INDEXICAL-RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-KEYWORD"));
        $sym185$SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SM-GEN-POINT-PRINT-FUNCTION-TRAMPOLINE");
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SM-GEN-POINT-P"));
        $sym187$SM_GEN_POINT_ID = SubLObjectFactory.makeSymbol("SM-GEN-POINT-ID");
        $sym188$_CSETF_SM_GEN_POINT_ID = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-ID");
        $sym189$SM_GEN_POINT_NON_INDEXICAL = SubLObjectFactory.makeSymbol("SM-GEN-POINT-NON-INDEXICAL");
        $sym190$_CSETF_SM_GEN_POINT_NON_INDEXICAL = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-NON-INDEXICAL");
        $sym191$SM_GEN_POINT_ISAS = SubLObjectFactory.makeSymbol("SM-GEN-POINT-ISAS");
        $sym192$_CSETF_SM_GEN_POINT_ISAS = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-ISAS");
        $sym193$SM_GEN_POINT_GENLS = SubLObjectFactory.makeSymbol("SM-GEN-POINT-GENLS");
        $sym194$_CSETF_SM_GEN_POINT_GENLS = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-GENLS");
        $sym195$SM_GEN_POINT_POSITIONS = SubLObjectFactory.makeSymbol("SM-GEN-POINT-POSITIONS");
        $sym196$_CSETF_SM_GEN_POINT_POSITIONS = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-POSITIONS");
        $sym197$SM_GEN_POINT_INDEXICAL_RECORD = SubLObjectFactory.makeSymbol("SM-GEN-POINT-INDEXICAL-RECORD");
        $sym198$_CSETF_SM_GEN_POINT_INDEXICAL_RECORD = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-INDEXICAL-RECORD");
        $sym199$SM_GEN_POINT_KEYWORD = SubLObjectFactory.makeSymbol("SM-GEN-POINT-KEYWORD");
        $sym200$_CSETF_SM_GEN_POINT_KEYWORD = SubLObjectFactory.makeSymbol("_CSETF-SM-GEN-POINT-KEYWORD");
        $kw201$NON_INDEXICAL = SubLObjectFactory.makeKeyword("NON-INDEXICAL");
        $kw202$POSITIONS = SubLObjectFactory.makeKeyword("POSITIONS");
        $kw203$INDEXICAL_RECORD = SubLObjectFactory.makeKeyword("INDEXICAL-RECORD");
        $kw204$KEYWORD = SubLObjectFactory.makeKeyword("KEYWORD");
        $sym205$MAKE_SM_GEN_POINT = SubLObjectFactory.makeSymbol("MAKE-SM-GEN-POINT");
        $sym206$VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-GEN-POINT-METHOD");
        $str207$_SC = SubLObjectFactory.makeString(":SC");
        $str208$the_kind_of_ = SubLObjectFactory.makeString("the kind of ");
        $const209$The = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The"));
        $sym210$_ = SubLObjectFactory.makeSymbol("<");
        $sym211$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $kw212$ISA = SubLObjectFactory.makeKeyword("ISA");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("first"), (SubLObject)SubLObjectFactory.makeString("second"), (SubLObject)SubLObjectFactory.makeString("third"), (SubLObject)SubLObjectFactory.makeString("fourth"), (SubLObject)SubLObjectFactory.makeString("fifth"), (SubLObject)SubLObjectFactory.makeString("sixth"), (SubLObject)SubLObjectFactory.makeString("seventh"));
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-RECORD"));
        $str215$the_ = SubLObjectFactory.makeString("the ");
        $str216$the_other_ = SubLObjectFactory.makeString("the other ");
        $str217$the_other_kind_of_ = SubLObjectFactory.makeString("the other kind of ");
        $str218$_ = SubLObjectFactory.makeString(" ");
        $str219$_kind_of_ = SubLObjectFactory.makeString(" kind of ");
        $const220$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym221$SM_INDEXICAL_RECORD_NUMBER = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-NUMBER");
        $sym222$CAR = SubLObjectFactory.makeSymbol("CAR");
        $const223$scenarioTerms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scenarioTerms"));
        $const224$scenarioReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scenarioReferent"));
        $const225$scenarioConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scenarioConstraint"));
        $kw226$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym227$SM_SCENARIO_EXPRESSION_OK = SubLObjectFactory.makeSymbol("SM-SCENARIO-EXPRESSION-OK");
        $sym228$FIND_NART = SubLObjectFactory.makeSymbol("FIND-NART");
        $sym229$LIST = SubLObjectFactory.makeSymbol("LIST");
        $const230$termTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTemplate"));
        $const231$ScenarioTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioTemplate"));
        $sym232$_EXPR = SubLObjectFactory.makeSymbol("?EXPR");
        $const233$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const234$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const235$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym236$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const237$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str238$Cycl_formulas_containing__A_canno = SubLObjectFactory.makeString("Cycl formulas containing ~A cannot be used to initialize a scenario.");
        $str239$_A_unexpected_ = SubLObjectFactory.makeString("~A unexpected.");
        $sym240$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $const241$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("UIA-IS-TERM-A-COLLECTION-IN-ANY-MT?");
        $sym243$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $const244$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $sym245$SM_INDEXICAL_RECORD_PREFERRED_PHRASE = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-PREFERRED-PHRASE");
        $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED");
        $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED");
        $kw248$NON_WFF = SubLObjectFactory.makeKeyword("NON-WFF");
        $kw249$OK = SubLObjectFactory.makeKeyword("OK");
        $sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE = SubLObjectFactory.makeSymbol("SM-UNRESOLVED-ITEM-FOR-PHRASE");
        $sym251$SM_UNRESOLVED_EQUAL = SubLObjectFactory.makeSymbol("SM-UNRESOLVED-EQUAL");
        $const252$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKEN-NUMBERS"), (SubLObject)SubLObjectFactory.makeSymbol("PARSES"));
        $const254$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-ONE"), (SubLObject)SubLObjectFactory.makeSymbol("COL-OTHER"));
        $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED");
        $sym257$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $sym258$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INDEXICAL-RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-INDEXICAL-RECORD"));
        $sym260$SM_GEN_POINT_WITHOUT_POSITIONS_P = SubLObjectFactory.makeSymbol("SM-GEN-POINT-WITHOUT-POSITIONS-P");
        $sym261$PUNCTUATION_P = SubLObjectFactory.makeSymbol("PUNCTUATION-P");
        $const262$OptionalSome = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalSome"));
        $const263$StringTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringTemplate"));
        $const264$NumberTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumberTemplate"));
        $const265$SinkTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinkTemplate"));
        $sym266$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const267$PropositionalConceptualWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PropositionalConceptualWork"));
        $const268$MovieTitleTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MovieTitleTemplate"));
        $const269$Event = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event"));
        $const270$NPTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"));
        $const271$SomethingExisting = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomethingExisting"));
        $const272$RequireOne = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireOne"));
        $const273$OptionalOne = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalOne"));
        $const274$ParsingTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParsingTemplateCategory"));
        $const275$TemplateParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateParsingMt"));
        $str276$_ = SubLObjectFactory.makeString("[");
        $str277$_ = SubLObjectFactory.makeString("]");
        $str278$Scenario = SubLObjectFactory.makeString("Scenario");
        $list279 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Scenario-Generalized")));
        $const280$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list281 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFConstant")));
        $sym282$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym283$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $list284 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("SCENARIO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Scenario-Generalized")));
        $list285 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioTemplate")), (SubLObject)SubLObjectFactory.makeSymbol("?EXPR"), (SubLObject)SubLObjectFactory.makeSymbol("?INSTANCE"));
        $sym286$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED");
        $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED");
        $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED");
        $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED = SubLObjectFactory.makeSymbol("SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED");
    }
    
    public static final class $sm_scenario_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $sessions;
        public SubLObject $phrase;
        public SubLObject $candidate_terms;
        public SubLObject $candidate_constraints;
        public SubLObject $fort;
        public SubLObject $terms;
        public SubLObject $constraints;
        public SubLObject $templates;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $sm_scenario_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sessions = (SubLObject)CommonSymbols.NIL;
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$candidate_terms = (SubLObject)CommonSymbols.NIL;
            this.$candidate_constraints = (SubLObject)CommonSymbols.NIL;
            this.$fort = (SubLObject)CommonSymbols.NIL;
            this.$terms = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
            this.$templates = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sm_scenario_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$sessions;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$phrase;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$candidate_terms;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$candidate_constraints;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$fort;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$terms;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$constraints;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$templates;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$sessions = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$phrase = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$candidate_terms = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$candidate_constraints = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$fort = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$terms = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$constraints = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$templates = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sm_scenario_native.class, rkf_scenario_manipulator.$sym5$SM_SCENARIO, rkf_scenario_manipulator.$sym6$SM_SCENARIO_P, rkf_scenario_manipulator.$list7, rkf_scenario_manipulator.$list8, new String[] { "$id", "$sessions", "$phrase", "$candidate_terms", "$candidate_constraints", "$fort", "$terms", "$constraints", "$templates", "$state" }, rkf_scenario_manipulator.$list9, rkf_scenario_manipulator.$list10, rkf_scenario_manipulator.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sm_scenario_p$UnaryFunction extends UnaryFunction
    {
        public $sm_scenario_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SM-SCENARIO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_manipulator.sm_scenario_p(arg1);
        }
    }
    
    public static final class $sm_template_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $scenario;
        public SubLObject $phrase;
        public SubLObject $expression;
        public SubLObject $param_subs;
        public SubLObject $parameters;
        public SubLObject $constraints;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $sm_template_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$scenario = (SubLObject)CommonSymbols.NIL;
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$expression = (SubLObject)CommonSymbols.NIL;
            this.$param_subs = (SubLObject)CommonSymbols.NIL;
            this.$parameters = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sm_template_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$scenario;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$phrase;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$expression;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$param_subs;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$parameters;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$constraints;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$scenario = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$phrase = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$expression = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$param_subs = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$parameters = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$constraints = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sm_template_native.class, rkf_scenario_manipulator.$sym63$SM_TEMPLATE, rkf_scenario_manipulator.$sym54$SM_TEMPLATE_P, rkf_scenario_manipulator.$list64, rkf_scenario_manipulator.$list65, new String[] { "$id", "$scenario", "$phrase", "$expression", "$param_subs", "$parameters", "$constraints", "$state" }, rkf_scenario_manipulator.$list66, rkf_scenario_manipulator.$list67, rkf_scenario_manipulator.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sm_template_p$UnaryFunction extends UnaryFunction
    {
        public $sm_template_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SM-TEMPLATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_manipulator.sm_template_p(arg1);
        }
    }
    
    public static final class $sm_indexical_record_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $indexical;
        public SubLObject $phrases;
        public SubLObject $var;
        public SubLObject $explicit_isas;
        public SubLObject $explicit_genls;
        public SubLObject $isas;
        public SubLObject $genls;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $sm_indexical_record_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$indexical = (SubLObject)CommonSymbols.NIL;
            this.$phrases = (SubLObject)CommonSymbols.NIL;
            this.$var = (SubLObject)CommonSymbols.NIL;
            this.$explicit_isas = (SubLObject)CommonSymbols.NIL;
            this.$explicit_genls = (SubLObject)CommonSymbols.NIL;
            this.$isas = (SubLObject)CommonSymbols.NIL;
            this.$genls = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sm_indexical_record_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$indexical;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$phrases;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$var;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$explicit_isas;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$explicit_genls;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$isas;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$genls;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$indexical = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$phrases = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$var = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$explicit_isas = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$explicit_genls = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$isas = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$genls = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sm_indexical_record_native.class, rkf_scenario_manipulator.$sym96$SM_INDEXICAL_RECORD, rkf_scenario_manipulator.$sym52$SM_INDEXICAL_RECORD_P, rkf_scenario_manipulator.$list97, rkf_scenario_manipulator.$list98, new String[] { "$id", "$indexical", "$phrases", "$var", "$explicit_isas", "$explicit_genls", "$isas", "$genls", "$state" }, rkf_scenario_manipulator.$list99, rkf_scenario_manipulator.$list100, rkf_scenario_manipulator.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sm_indexical_record_p$UnaryFunction extends UnaryFunction
    {
        public $sm_indexical_record_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SM-INDEXICAL-RECORD-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_manipulator.sm_indexical_record_p(arg1);
        }
    }
    
    public static final class $sm_constraint_record_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $nl_sentence;
        private static final SubLStructDeclNative structDecl;
        
        public $sm_constraint_record_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$nl_sentence = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sm_constraint_record_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$sentence;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$nl_sentence;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$sentence = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$nl_sentence = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sm_constraint_record_native.class, rkf_scenario_manipulator.$sym134$SM_CONSTRAINT_RECORD, rkf_scenario_manipulator.$sym53$SM_CONSTRAINT_RECORD_P, rkf_scenario_manipulator.$list135, rkf_scenario_manipulator.$list136, new String[] { "$id", "$sentence", "$nl_sentence" }, rkf_scenario_manipulator.$list137, rkf_scenario_manipulator.$list138, rkf_scenario_manipulator.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sm_constraint_record_p$UnaryFunction extends UnaryFunction
    {
        public $sm_constraint_record_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SM-CONSTRAINT-RECORD-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_manipulator.sm_constraint_record_p(arg1);
        }
    }
    
    public static final class $sm_merge_info_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $from_scenario;
        public SubLObject $to_scenario;
        public SubLObject $align_to;
        public SubLObject $align_from;
        public SubLObject $indexical_equivalences;
        private static final SubLStructDeclNative structDecl;
        
        public $sm_merge_info_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$from_scenario = (SubLObject)CommonSymbols.NIL;
            this.$to_scenario = (SubLObject)CommonSymbols.NIL;
            this.$align_to = (SubLObject)CommonSymbols.NIL;
            this.$align_from = (SubLObject)CommonSymbols.NIL;
            this.$indexical_equivalences = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sm_merge_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$from_scenario;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$to_scenario;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$align_to;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$align_from;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$indexical_equivalences;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$from_scenario = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$to_scenario = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$align_to = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$align_from = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$indexical_equivalences = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sm_merge_info_native.class, rkf_scenario_manipulator.$sym152$SM_MERGE_INFO, rkf_scenario_manipulator.$sym153$SM_MERGE_INFO_P, rkf_scenario_manipulator.$list154, rkf_scenario_manipulator.$list155, new String[] { "$id", "$from_scenario", "$to_scenario", "$align_to", "$align_from", "$indexical_equivalences" }, rkf_scenario_manipulator.$list156, rkf_scenario_manipulator.$list157, rkf_scenario_manipulator.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sm_merge_info_p$UnaryFunction extends UnaryFunction
    {
        public $sm_merge_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SM-MERGE-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_manipulator.sm_merge_info_p(arg1);
        }
    }
    
    public static final class $sm_gen_point_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $non_indexical;
        public SubLObject $isas;
        public SubLObject $genls;
        public SubLObject $positions;
        public SubLObject $indexical_record;
        public SubLObject $keyword;
        private static final SubLStructDeclNative structDecl;
        
        public $sm_gen_point_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$non_indexical = (SubLObject)CommonSymbols.NIL;
            this.$isas = (SubLObject)CommonSymbols.NIL;
            this.$genls = (SubLObject)CommonSymbols.NIL;
            this.$positions = (SubLObject)CommonSymbols.NIL;
            this.$indexical_record = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sm_gen_point_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$non_indexical;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$isas;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$genls;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$positions;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$indexical_record;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$keyword;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$non_indexical = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$isas = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$genls = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$positions = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$indexical_record = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$keyword = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sm_gen_point_native.class, rkf_scenario_manipulator.$sym179$SM_GEN_POINT, rkf_scenario_manipulator.$sym180$SM_GEN_POINT_P, rkf_scenario_manipulator.$list181, rkf_scenario_manipulator.$list182, new String[] { "$id", "$non_indexical", "$isas", "$genls", "$positions", "$indexical_record", "$keyword" }, rkf_scenario_manipulator.$list183, rkf_scenario_manipulator.$list184, rkf_scenario_manipulator.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sm_gen_point_p$UnaryFunction extends UnaryFunction
    {
        public $sm_gen_point_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SM-GEN-POINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_scenario_manipulator.sm_gen_point_p(arg1);
        }
    }
}

/*

	Total time: 1583 ms
	 synthetic 
*/