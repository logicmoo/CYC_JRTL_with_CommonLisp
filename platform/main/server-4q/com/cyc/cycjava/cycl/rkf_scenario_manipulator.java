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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class rkf_scenario_manipulator
    extends
      SubLTranslatedFile
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
  public static SubLObject with_sm_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$WITH_LOCK_HELD, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1336L)
  public static SubLObject sm_find_scenario_by_id(final SubLObject id)
  {
    return sm_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1502L)
  public static SubLObject sm_find_scenario_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject v_scenario = sm_find_scenario_by_id( id );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1663L)
  public static SubLObject sm_find_template_by_id(final SubLObject id)
  {
    return sm_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1742L)
  public static SubLObject sm_find_template_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject template = sm_find_template_by_id( id );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1903L)
  public static SubLObject sm_find_indexical_record_by_id(final SubLObject id)
  {
    return sm_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 1990L)
  public static SubLObject sm_find_indexical_record_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject indexical_record = sm_find_indexical_record_by_id( id );
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2183L)
  public static SubLObject sm_find_constraint_record_by_id(final SubLObject id)
  {
    return sm_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2271L)
  public static SubLObject sm_find_constraint_record_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject constraint_record = sm_find_constraint_record_by_id( id );
    return constraint_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2468L)
  public static SubLObject sm_find_merge_info_by_id(final SubLObject id)
  {
    return sm_find_object_by_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2549L)
  public static SubLObject sm_find_merge_info_by_id_string(final SubLObject id_string)
  {
    final SubLObject id = reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject merge_info = sm_find_merge_info_by_id( id );
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 2940L)
  public static SubLObject next_sm_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $sm_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3047L)
  public static SubLObject sm_add_object(final SubLObject id, final SubLObject v_object)
  {
    return dictionary.dictionary_enter( $sm_index$.getGlobalValue(), id, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3190L)
  public static SubLObject sm_rem_object(final SubLObject id)
  {
    return dictionary.dictionary_remove( $sm_index$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3320L)
  public static SubLObject sm_find_object_by_id(final SubLObject id)
  {
    return dictionary.dictionary_lookup( $sm_index$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sm_scenario_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_id(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_sessions(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_phrase(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_candidate_terms(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_candidate_constraints(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_fort(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_terms(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_constraints(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_templates(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject sm_scenario_state(final SubLObject v_object)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_sessions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_phrase(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_candidate_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_candidate_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_fort(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_templates(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject _csetf_sm_scenario_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_scenario_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject make_sm_scenario(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sm_scenario_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_sm_scenario_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$SESSIONS ) )
      {
        _csetf_sm_scenario_sessions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$PHRASE ) )
      {
        _csetf_sm_scenario_phrase( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$CANDIDATE_TERMS ) )
      {
        _csetf_sm_scenario_candidate_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$CANDIDATE_CONSTRAINTS ) )
      {
        _csetf_sm_scenario_candidate_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$FORT ) )
      {
        _csetf_sm_scenario_fort( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$TERMS ) )
      {
        _csetf_sm_scenario_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$CONSTRAINTS ) )
      {
        _csetf_sm_scenario_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$TEMPLATES ) )
      {
        _csetf_sm_scenario_templates( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$STATE ) )
      {
        _csetf_sm_scenario_state( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject visit_defstruct_sm_scenario(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym46$MAKE_SM_SCENARIO, TEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw34$ID, sm_scenario_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw35$SESSIONS, sm_scenario_sessions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw36$PHRASE, sm_scenario_phrase( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw37$CANDIDATE_TERMS, sm_scenario_candidate_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw38$CANDIDATE_CONSTRAINTS, sm_scenario_candidate_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw39$FORT, sm_scenario_fort( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw40$TERMS, sm_scenario_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw41$CONSTRAINTS, sm_scenario_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw42$TEMPLATES, sm_scenario_templates( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$STATE, sm_scenario_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym46$MAKE_SM_SCENARIO, TEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 3406L)
  public static SubLObject visit_defstruct_object_sm_scenario_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sm_scenario( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4070L)
  public static SubLObject sm_new_scenario(SubLObject phrase, SubLObject fort, SubLObject session)
  {
    if( phrase == UNPROVIDED )
    {
      phrase = NIL;
    }
    if( fort == UNPROVIDED )
    {
      fort = NIL;
    }
    if( session == UNPROVIDED )
    {
      session = NIL;
    }
    final SubLObject v_scenario = make_sm_scenario( UNPROVIDED );
    final SubLObject id = next_sm_id();
    if( NIL != phrase )
    {
      sm_set_scenario_phrase( v_scenario, phrase );
    }
    if( NIL != fort )
    {
      sm_set_scenario_fort( v_scenario, fort );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL != session )
      {
        final SubLObject item_var = session;
        if( NIL == conses_high.member( item_var, sm_scenario_sessions( v_scenario ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          _csetf_sm_scenario_sessions( v_scenario, ConsesLow.cons( item_var, sm_scenario_sessions( v_scenario ) ) );
        }
      }
      _csetf_sm_scenario_id( v_scenario, id );
      sm_add_object( id, v_scenario );
      _csetf_sm_scenario_state( v_scenario, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4573L)
  public static SubLObject sm_set_scenario_phrase(final SubLObject v_scenario, final SubLObject phrase)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != Types.stringp( phrase ) : phrase;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_phrase( v_scenario, phrase );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4787L)
  public static SubLObject sm_set_scenario_fort(final SubLObject v_scenario, final SubLObject fort)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_fort( v_scenario, fort );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 4987L)
  public static SubLObject sm_add_scenario_candidate_terms(final SubLObject v_scenario, final SubLObject indexical_records)
  {
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_add_scenario_candidate_term( v_scenario, indexical_record );
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 5220L)
  public static SubLObject sm_add_scenario_candidate_term(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == Sequences.find( indexical_record, sm_scenario_candidate_terms( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_sm_scenario_candidate_terms( v_scenario, ConsesLow.append( sm_scenario_candidate_terms( v_scenario ), ConsesLow.list( indexical_record ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 5638L)
  public static SubLObject sm_rem_scenario_candidate_term(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_candidate_terms( v_scenario, Sequences.remove( indexical_record, sm_scenario_candidate_terms( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      sm_cleanup_indexical_record( indexical_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 6012L)
  public static SubLObject sm_add_scenario_candidate_constraints(final SubLObject v_scenario, final SubLObject constraint_records)
  {
    SubLObject cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_add_scenario_candidate_constraint( v_scenario, constraint_record );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 6236L)
  public static SubLObject sm_add_scenario_candidate_constraint(final SubLObject v_scenario, final SubLObject constraint_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == Sequences.find( constraint_record, sm_scenario_candidate_constraints( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_sm_scenario_candidate_constraints( v_scenario, ConsesLow.append( sm_scenario_candidate_constraints( v_scenario ), ConsesLow.list( constraint_record ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 6684L)
  public static SubLObject sm_rem_scenario_candidate_constraint(final SubLObject v_scenario, final SubLObject constraint_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_candidate_constraints( v_scenario, Sequences.remove( constraint_record, sm_scenario_candidate_constraints( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      sm_cleanup_constraint_record( constraint_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 7083L)
  public static SubLObject sm_add_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == Sequences.find( indexical_record, sm_scenario_terms( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_sm_scenario_terms( v_scenario, ConsesLow.append( sm_scenario_terms( v_scenario ), ConsesLow.list( indexical_record ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 7463L)
  public static SubLObject sm_rem_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_terms( v_scenario, Sequences.remove( indexical_record, sm_scenario_terms( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL != sm_scenario_borrowed_indexical_p( v_scenario, indexical_record ) )
      {
        sm_scenario_return_borrowed_indexical( v_scenario, indexical_record );
      }
      else
      {
        sm_cleanup_indexical_record( indexical_record );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 8016L)
  public static SubLObject sm_add_scenario_constraint(final SubLObject v_scenario, final SubLObject constraint_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == Sequences.find( constraint_record, sm_scenario_constraints( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_sm_scenario_constraints( v_scenario, ConsesLow.append( sm_scenario_constraints( v_scenario ), ConsesLow.list( constraint_record ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 8423L)
  public static SubLObject sm_rem_scenario_constraint(final SubLObject v_scenario, final SubLObject constraint_record)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_constraints( v_scenario, Sequences.remove( constraint_record, sm_scenario_constraints( v_scenario ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      sm_cleanup_constraint_record( constraint_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 8799L)
  public static SubLObject sm_add_scenario_template(final SubLObject v_scenario, final SubLObject template)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_template_p( template ) : template;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == Sequences.find( template, sm_scenario_templates( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_sm_scenario_templates( v_scenario, ConsesLow.append( sm_scenario_templates( v_scenario ), ConsesLow.list( template ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 9153L)
  public static SubLObject sm_rem_scenario_template(final SubLObject v_scenario, final SubLObject template)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    assert NIL != sm_template_p( template ) : template;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_scenario_templates( v_scenario, Sequences.remove( template, sm_scenario_templates( v_scenario ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      sm_cleanup_template( template );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 9461L)
  public static SubLObject sm_cleanup_scenario(final SubLObject v_scenario)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    final SubLObject id = sm_scenario_id( v_scenario );
    final SubLObject candidate_terms = sm_scenario_candidate_terms( v_scenario );
    final SubLObject candidate_constraints = sm_scenario_candidate_constraints( v_scenario );
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    final SubLObject constraint_records = sm_scenario_constraints( v_scenario );
    final SubLObject templates = sm_scenario_templates( v_scenario );
    SubLObject cdolist_list_var = candidate_terms;
    SubLObject candidate_term = NIL;
    candidate_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_cleanup_indexical_record( candidate_term );
      cdolist_list_var = cdolist_list_var.rest();
      candidate_term = cdolist_list_var.first();
    }
    cdolist_list_var = candidate_constraints;
    SubLObject candidate_constraint = NIL;
    candidate_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_cleanup_constraint_record( candidate_constraint );
      cdolist_list_var = cdolist_list_var.rest();
      candidate_constraint = cdolist_list_var.first();
    }
    cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_cleanup_indexical_record( indexical_record );
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_cleanup_constraint_record( constraint_record );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_cleanup_template( template );
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return sm_rem_object( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 10506L)
  public static SubLObject sm_scenario_note_borrowed_indexical(final SubLObject v_scenario, final SubLObject indexical)
  {
    final SubLObject state = sm_scenario_state( v_scenario );
    dictionary_utilities.dictionary_push( state, $kw55$BORROWED_INDEXICALS, indexical );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 10741L)
  public static SubLObject sm_scenario_borrowed_indexical_p(final SubLObject v_scenario, final SubLObject indexical)
  {
    final SubLObject state = sm_scenario_state( v_scenario );
    final SubLObject borrowed_indexicals = dictionary.dictionary_lookup( state, $kw55$BORROWED_INDEXICALS, UNPROVIDED );
    return subl_promotions.memberP( indexical, borrowed_indexicals, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 10992L)
  public static SubLObject sm_scenario_return_borrowed_indexical(final SubLObject v_scenario, final SubLObject indexical)
  {
    final SubLObject state = sm_scenario_state( v_scenario );
    final SubLObject borrowed_indexicals = dictionary.dictionary_lookup( state, $kw55$BORROWED_INDEXICALS, UNPROVIDED );
    Sequences.delete( indexical, borrowed_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    dictionary.dictionary_enter( state, $kw55$BORROWED_INDEXICALS, borrowed_indexicals );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 11328L)
  public static SubLObject sm_scenario_memoization_state(final SubLObject v_scenario)
  {
    final SubLObject state = sm_scenario_state( v_scenario );
    SubLObject v_memoization_state = dictionary.dictionary_lookup( state, $kw56$MEMOIZATION_STATE, $kw57$UNINITIALIZED );
    if( v_memoization_state == $kw57$UNINITIALIZED )
    {
      v_memoization_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      dictionary.dictionary_enter( state, $kw56$MEMOIZATION_STATE, v_memoization_state );
    }
    return v_memoization_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 11773L)
  public static SubLObject sm_scenario_clear_all_memoization_state(final SubLObject v_scenario)
  {
    memoization_state.clear_all_memoization( sm_scenario_memoization_state( v_scenario ) );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 11928L)
  public static SubLObject with_scenario_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_scenario = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    v_scenario = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_memoization_state = $sym59$MEMOIZATION_STATE;
      return ConsesLow.list( $sym60$CLET, ConsesLow.list( ConsesLow.list( v_memoization_state, ConsesLow.list( $sym61$SM_SCENARIO_MEMOIZATION_STATE, v_scenario ) ) ), ConsesLow.listS( $sym62$WITH_MEMOIZATION_STATE,
          ConsesLow.list( v_memoization_state ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sm_template_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_id(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_scenario(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_phrase(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_expression(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_param_subs(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_parameters(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_constraints(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject sm_template_state(final SubLObject v_object)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_scenario(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_phrase(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_expression(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_param_subs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_parameters(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject _csetf_sm_template_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_template_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject make_sm_template(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sm_template_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_sm_template_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw86$SCENARIO ) )
      {
        _csetf_sm_template_scenario( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$PHRASE ) )
      {
        _csetf_sm_template_phrase( v_new, current_value );
      }
      else if( pcase_var.eql( $kw87$EXPRESSION ) )
      {
        _csetf_sm_template_expression( v_new, current_value );
      }
      else if( pcase_var.eql( $kw88$PARAM_SUBS ) )
      {
        _csetf_sm_template_param_subs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw89$PARAMETERS ) )
      {
        _csetf_sm_template_parameters( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$CONSTRAINTS ) )
      {
        _csetf_sm_template_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$STATE ) )
      {
        _csetf_sm_template_state( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject visit_defstruct_sm_template(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym90$MAKE_SM_TEMPLATE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw34$ID, sm_template_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw86$SCENARIO, sm_template_scenario( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw36$PHRASE, sm_template_phrase( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw87$EXPRESSION, sm_template_expression( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw88$PARAM_SUBS, sm_template_param_subs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw89$PARAMETERS, sm_template_parameters( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw41$CONSTRAINTS, sm_template_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$STATE, sm_template_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym90$MAKE_SM_TEMPLATE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12208L)
  public static SubLObject visit_defstruct_object_sm_template_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sm_template( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 12635L)
  public static SubLObject sm_new_template(final SubLObject v_scenario)
  {
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    final SubLObject template = make_sm_template( UNPROVIDED );
    final SubLObject id = next_sm_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_template_scenario( template, v_scenario );
      _csetf_sm_template_id( template, id );
      _csetf_sm_template_state( template, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
      sm_add_object( id, template );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13036L)
  public static SubLObject sm_set_template_expression(final SubLObject template, final SubLObject template_expr)
  {
    assert NIL != sm_template_p( template ) : template;
    assert NIL != Types.listp( template_expr ) : template_expr;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_template_expression( template, template_expr );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13327L)
  public static SubLObject sm_set_template_param_subs(final SubLObject template, final SubLObject param_subs)
  {
    assert NIL != sm_template_p( template ) : template;
    assert NIL != Types.listp( param_subs ) : param_subs;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_template_param_subs( template, param_subs );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13621L)
  public static SubLObject sm_set_template_parameters(final SubLObject template, final SubLObject parameters)
  {
    assert NIL != sm_template_p( template ) : template;
    assert NIL != Types.listp( parameters ) : parameters;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_template_parameters( template, parameters );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 13849L)
  public static SubLObject sm_set_template_phrase(final SubLObject template, final SubLObject phrase)
  {
    assert NIL != sm_template_p( template ) : template;
    assert NIL != Types.stringp( phrase ) : phrase;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_template_phrase( template, phrase );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14125L)
  public static SubLObject sm_add_template_constraint(final SubLObject template, final SubLObject constraint_record)
  {
    assert NIL != sm_template_p( template ) : template;
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_template_constraints( template, ConsesLow.cons( constraint_record, sm_template_constraints( template ) ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14393L)
  public static SubLObject sm_cleanup_template(final SubLObject template)
  {
    assert NIL != sm_template_p( template ) : template;
    final SubLObject id = sm_template_id( template );
    final SubLObject success = sm_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14617L)
  public static SubLObject sm_scenario_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != forts.fort_p( v_object.first() ) && NIL != sm_substitution_list_p( v_object.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 14859L)
  public static SubLObject sm_new_scenario_spec(final SubLObject fort, final SubLObject substitutions)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return ConsesLow.cons( fort, substitutions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15039L)
  public static SubLObject sm_scenario_spec_fort(final SubLObject scenario_spec)
  {
    return scenario_spec.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15123L)
  public static SubLObject sm_scenario_spec_substitutions(final SubLObject scenario_spec)
  {
    return scenario_spec.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15216L)
  public static SubLObject sm_substitution_list_p(final SubLObject v_object)
  {
    if( v_object.isCons() && NIL != v_object )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == sm_substitution_p( elem ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15586L)
  public static SubLObject sm_substitution_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && NIL != sm_indexical_p( v_object.first() ) && NIL != sm_term_p( conses_high.cadr( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 15734L)
  public static SubLObject sm_get_standin_for_indexical(final SubLObject substitution_list, final SubLObject indexical)
  {
    if( NIL == sm_substitution_list_p( substitution_list ) || NIL == sm_indexical_p( indexical ) )
    {
      return indexical;
    }
    return conses_high.second( conses_high.assoc( indexical, substitution_list, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16002L)
  public static SubLObject sm_scenario_expression_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && v_object.first().eql( $const93$ScenarioInstanceFn ) && NIL != forts.fort_p( conses_high.second( v_object ) ) && NIL != el_utilities.el_list_p( conses_high.third( v_object ) )
        && NIL != el_utilities.el_list_p( conses_high.fourth( v_object ) ) && NIL == list_utilities.find_if_not( Symbols.symbol_function( $sym94$NAUT_ ), el_utilities.el_list_items( conses_high.fourth( v_object ) ),
            UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16376L)
  public static SubLObject sm_scenario_expression_fort(final SubLObject scenario_expression)
  {
    assert NIL != sm_scenario_expression_p( scenario_expression ) : scenario_expression;
    return conses_high.second( scenario_expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16541L)
  public static SubLObject sm_scenario_expression_cyc_terms(final SubLObject scenario_expression)
  {
    assert NIL != sm_scenario_expression_p( scenario_expression ) : scenario_expression;
    return el_utilities.el_list_items( conses_high.third( scenario_expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16726L)
  public static SubLObject sm_scenario_expression_indexical_nauts(final SubLObject scenario_expression)
  {
    assert NIL != sm_scenario_expression_p( scenario_expression ) : scenario_expression;
    return el_utilities.el_list_items( conses_high.fourth( scenario_expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sm_indexical_record_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_id(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_indexical(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_phrases(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_var(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_explicit_isas(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_explicit_genls(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_isas(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_genls(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject sm_indexical_record_state(final SubLObject v_object)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_indexical(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_phrases(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_var(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_explicit_isas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_explicit_genls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_isas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_genls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject _csetf_sm_indexical_record_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_indexical_record_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject make_sm_indexical_record(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sm_indexical_record_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_sm_indexical_record_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw121$INDEXICAL ) )
      {
        _csetf_sm_indexical_record_indexical( v_new, current_value );
      }
      else if( pcase_var.eql( $kw122$PHRASES ) )
      {
        _csetf_sm_indexical_record_phrases( v_new, current_value );
      }
      else if( pcase_var.eql( $kw123$VAR ) )
      {
        _csetf_sm_indexical_record_var( v_new, current_value );
      }
      else if( pcase_var.eql( $kw124$EXPLICIT_ISAS ) )
      {
        _csetf_sm_indexical_record_explicit_isas( v_new, current_value );
      }
      else if( pcase_var.eql( $kw125$EXPLICIT_GENLS ) )
      {
        _csetf_sm_indexical_record_explicit_genls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw126$ISAS ) )
      {
        _csetf_sm_indexical_record_isas( v_new, current_value );
      }
      else if( pcase_var.eql( $kw127$GENLS ) )
      {
        _csetf_sm_indexical_record_genls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$STATE ) )
      {
        _csetf_sm_indexical_record_state( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject visit_defstruct_sm_indexical_record(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym128$MAKE_SM_INDEXICAL_RECORD, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw34$ID, sm_indexical_record_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw121$INDEXICAL, sm_indexical_record_indexical( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw122$PHRASES, sm_indexical_record_phrases( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw123$VAR, sm_indexical_record_var( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw124$EXPLICIT_ISAS, sm_indexical_record_explicit_isas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw125$EXPLICIT_GENLS, sm_indexical_record_explicit_genls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw126$ISAS, sm_indexical_record_isas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw127$GENLS, sm_indexical_record_genls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$STATE, sm_indexical_record_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym128$MAKE_SM_INDEXICAL_RECORD, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 16918L)
  public static SubLObject visit_defstruct_object_sm_indexical_record_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sm_indexical_record( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 17678L)
  public static SubLObject sm_new_indexical_record(SubLObject indexical, SubLObject phrases, SubLObject isas, SubLObject v_genls)
  {
    if( indexical == UNPROVIDED )
    {
      indexical = NIL;
    }
    if( phrases == UNPROVIDED )
    {
      phrases = NIL;
    }
    if( isas == UNPROVIDED )
    {
      isas = NIL;
    }
    if( v_genls == UNPROVIDED )
    {
      v_genls = NIL;
    }
    final SubLObject indexical_record = make_sm_indexical_record( UNPROVIDED );
    final SubLObject id = next_sm_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_id( indexical_record, id );
      _csetf_sm_indexical_record_state( indexical_record, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
      sm_add_object( id, indexical_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    if( NIL != indexical )
    {
      sm_set_indexical_record_indexical( indexical_record, indexical );
    }
    if( NIL != phrases )
    {
      sm_set_indexical_record_phrases( indexical_record, phrases );
    }
    if( NIL != isas )
    {
      sm_update_indexical_record_explicit_isas( indexical_record, isas );
    }
    if( NIL != v_genls )
    {
      sm_update_indexical_record_explicit_genls( indexical_record, v_genls );
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 18432L)
  public static SubLObject sm_set_indexical_record_indexical(final SubLObject indexical_record, final SubLObject indexical)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != sm_indexical_p( indexical ) : indexical;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_indexical( indexical_record, indexical );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 18819L)
  public static SubLObject sm_set_indexical_record_phrases(final SubLObject indexical_record, final SubLObject phrases)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( phrases ) : phrases;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_phrases( indexical_record, phrases );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 19088L)
  public static SubLObject sm_add_indexical_phrase(final SubLObject indexical_record, final SubLObject phrase)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.stringp( phrase ) : phrase;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == Sequences.find( phrase, sm_indexical_record_phrases( indexical_record ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_sm_indexical_record_phrases( indexical_record, ConsesLow.append( sm_indexical_record_phrases( indexical_record ), ConsesLow.list( phrase ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 19511L)
  public static SubLObject sm_rem_indexical_phrase(final SubLObject indexical_record, final SubLObject phrase)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.stringp( phrase ) : phrase;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_phrases( indexical_record, Sequences.remove( phrase, sm_indexical_record_phrases( indexical_record ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 19839L)
  public static SubLObject sm_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != cycl_variables.el_varP( var ) : var;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_var( indexical_record, var );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20090L)
  public static SubLObject sm_set_indexical_record_explicit_isas(final SubLObject indexical_record, final SubLObject isas)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( isas ) : isas;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_explicit_isas( indexical_record, isas );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20362L)
  public static SubLObject sm_set_indexical_record_explicit_genls(final SubLObject indexical_record, final SubLObject v_genls)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( v_genls ) : v_genls;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_explicit_genls( indexical_record, v_genls );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20639L)
  public static SubLObject sm_set_indexical_record_isas(final SubLObject indexical_record, final SubLObject isas)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( isas ) : isas;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_isas( indexical_record, isas );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 20893L)
  public static SubLObject sm_set_indexical_record_genls(final SubLObject indexical_record, final SubLObject v_genls)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( v_genls ) : v_genls;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_genls( indexical_record, v_genls );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 21152L)
  public static SubLObject sm_cleanup_indexical_record(final SubLObject indexical_record)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    final SubLObject id = sm_indexical_record_id( indexical_record );
    final SubLObject success = sm_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 21424L)
  public static SubLObject sm_indexical_record_preferred_phrase(final SubLObject indexical_record)
  {
    return sm_indexical_record_phrases( indexical_record ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 21648L)
  public static SubLObject sm_copy_indexical_record_for_scenario(final SubLObject indexical_record, final SubLObject v_scenario)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    final SubLObject new_indexical_record = sm_new_indexical_record( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject id = next_sm_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_indexical_record_id( new_indexical_record, id );
      _csetf_sm_indexical_record_indexical( new_indexical_record, sm_indexical_record_indexical( indexical_record ) );
      _csetf_sm_indexical_record_phrases( new_indexical_record, sm_indexical_record_phrases( indexical_record ) );
      _csetf_sm_indexical_record_explicit_isas( new_indexical_record, sm_indexical_record_explicit_isas( indexical_record ) );
      _csetf_sm_indexical_record_explicit_genls( new_indexical_record, sm_indexical_record_explicit_genls( indexical_record ) );
      _csetf_sm_indexical_record_isas( new_indexical_record, sm_indexical_record_isas( indexical_record ) );
      _csetf_sm_indexical_record_genls( new_indexical_record, sm_indexical_record_genls( indexical_record ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return new_indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 22728L)
  public static SubLObject sm_indexical_record_type(final SubLObject indexical_record)
  {
    return sm_indexical_type( sm_indexical_record_indexical( indexical_record ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 22889L)
  public static SubLObject sm_indexical_record_number(final SubLObject indexical_record)
  {
    return sm_indexical_number( sm_indexical_record_indexical( indexical_record ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 23032L)
  public static SubLObject sm_update_indexical_record_explicit_isas(final SubLObject indexical_record, final SubLObject isas)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( isas ) : isas;
    SubLObject current_explicit_isas = sm_indexical_record_explicit_isas( indexical_record );
    SubLObject current_isas = sm_indexical_record_isas( indexical_record );
    current_explicit_isas = Sequences.remove_duplicates( ConsesLow.nconc( isas, current_explicit_isas ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    current_isas = Sequences.remove_duplicates( ConsesLow.nconc( isas, current_isas ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    sm_set_indexical_record_explicit_isas( indexical_record, current_explicit_isas );
    sm_set_indexical_record_isas( indexical_record, current_isas );
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 23678L)
  public static SubLObject sm_update_indexical_record_explicit_genls(final SubLObject indexical_record, final SubLObject v_genls)
  {
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    assert NIL != Types.listp( v_genls ) : v_genls;
    SubLObject current_explicit_genls = sm_indexical_record_explicit_genls( indexical_record );
    SubLObject current_genls = sm_indexical_record_genls( indexical_record );
    current_explicit_genls = Sequences.remove_duplicates( ConsesLow.nconc( v_genls, current_explicit_genls ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    current_genls = Sequences.remove_duplicates( ConsesLow.nconc( v_genls, current_genls ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    sm_set_indexical_record_explicit_genls( indexical_record, current_explicit_genls );
    sm_set_indexical_record_genls( indexical_record, current_genls );
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24340L)
  public static SubLObject sm_indexical_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const132$TheNthFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24570L)
  public static SubLObject sm_new_indexical(final SubLObject type, final SubLObject number)
  {
    assert NIL != forts.fort_p( type ) : type;
    assert NIL != Types.integerp( number ) : number;
    return czer_main.cyc_find_or_create_nart( el_utilities.make_binary_formula( $const132$TheNthFn, type, number ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24795L)
  public static SubLObject sm_indexical_type(final SubLObject indexical)
  {
    assert NIL != sm_indexical_p( indexical ) : indexical;
    return cycl_utilities.nat_arg1( indexical, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 24904L)
  public static SubLObject sm_indexical_number(final SubLObject indexical)
  {
    assert NIL != sm_indexical_p( indexical ) : indexical;
    return cycl_utilities.nat_arg2( indexical, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25015L)
  public static SubLObject sm_indexical_of_scenarioP(final SubLObject v_term, final SubLObject v_scenario)
  {
    if( NIL == sm_indexical_p( v_term ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = sm_scenario_terms( v_scenario );
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( v_term.equal( sm_indexical_record_indexical( indexical_record ) ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25288L)
  public static SubLObject sm_indexical_record_of_indexical(final SubLObject v_term, final SubLObject v_scenario)
  {
    assert NIL != sm_indexical_p( v_term ) : v_term;
    assert NIL != sm_scenario_p( v_scenario ) : v_scenario;
    SubLObject cdolist_list_var = sm_scenario_terms( v_scenario );
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( v_term.equal( sm_indexical_record_indexical( indexical_record ) ) )
      {
        return indexical_record;
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject sm_constraint_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject sm_constraint_record_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sm_constraint_record_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject sm_constraint_record_id(final SubLObject v_object)
  {
    assert NIL != sm_constraint_record_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject sm_constraint_record_sentence(final SubLObject v_object)
  {
    assert NIL != sm_constraint_record_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject sm_constraint_record_nl_sentence(final SubLObject v_object)
  {
    assert NIL != sm_constraint_record_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject _csetf_sm_constraint_record_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_constraint_record_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject _csetf_sm_constraint_record_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_constraint_record_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject _csetf_sm_constraint_record_nl_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_constraint_record_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject make_sm_constraint_record(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sm_constraint_record_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_sm_constraint_record_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw147$SENTENCE ) )
      {
        _csetf_sm_constraint_record_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw148$NL_SENTENCE ) )
      {
        _csetf_sm_constraint_record_nl_sentence( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject visit_defstruct_sm_constraint_record(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym149$MAKE_SM_CONSTRAINT_RECORD, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw34$ID, sm_constraint_record_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw147$SENTENCE, sm_constraint_record_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw148$NL_SENTENCE, sm_constraint_record_nl_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym149$MAKE_SM_CONSTRAINT_RECORD, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25603L)
  public static SubLObject visit_defstruct_object_sm_constraint_record_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sm_constraint_record( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 25806L)
  public static SubLObject sm_new_constraint_record(SubLObject sentence)
  {
    if( sentence == UNPROVIDED )
    {
      sentence = NIL;
    }
    if( NIL != sentence && !assertionsDisabledInClass && NIL == el_utilities.el_formula_p( sentence ) )
    {
      throw new AssertionError( sentence );
    }
    final SubLObject constraint_record = make_sm_constraint_record( UNPROVIDED );
    final SubLObject id = next_sm_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_constraint_record_id( constraint_record, id );
      if( NIL != sentence )
      {
        _csetf_sm_constraint_record_sentence( constraint_record, sentence );
      }
      sm_add_object( id, constraint_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return constraint_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 26290L)
  public static SubLObject sm_set_constraint_record_sentence(final SubLObject constraint_record, final SubLObject sentence)
  {
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    assert NIL != Types.listp( sentence ) : sentence;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_constraint_record_sentence( constraint_record, sentence );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return constraint_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 26572L)
  public static SubLObject sm_set_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject nl_sentence)
  {
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    assert NIL != Types.stringp( nl_sentence ) : nl_sentence;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_constraint_record_nl_sentence( constraint_record, nl_sentence );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return constraint_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 26875L)
  public static SubLObject sm_rem_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject nl_sentence)
  {
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_constraint_record_nl_sentence( constraint_record, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return constraint_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27154L)
  public static SubLObject sm_cleanup_constraint_record(final SubLObject constraint_record)
  {
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    final SubLObject id = sm_constraint_record_id( constraint_record );
    final SubLObject success = sm_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27432L)
  public static SubLObject sm_term_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) || NIL != el_utilities.el_formula_p( v_object ) || v_object.isString() || v_object.isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sm_merge_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_id(final SubLObject v_object)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_from_scenario(final SubLObject v_object)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_to_scenario(final SubLObject v_object)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_align_to(final SubLObject v_object)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_align_from(final SubLObject v_object)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject sm_merge_info_indexical_equivalences(final SubLObject v_object)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject _csetf_sm_merge_info_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject _csetf_sm_merge_info_from_scenario(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject _csetf_sm_merge_info_to_scenario(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject _csetf_sm_merge_info_align_to(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject _csetf_sm_merge_info_align_from(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject _csetf_sm_merge_info_indexical_equivalences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_merge_info_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject make_sm_merge_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sm_merge_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_sm_merge_info_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw172$FROM_SCENARIO ) )
      {
        _csetf_sm_merge_info_from_scenario( v_new, current_value );
      }
      else if( pcase_var.eql( $kw173$TO_SCENARIO ) )
      {
        _csetf_sm_merge_info_to_scenario( v_new, current_value );
      }
      else if( pcase_var.eql( $kw174$ALIGN_TO ) )
      {
        _csetf_sm_merge_info_align_to( v_new, current_value );
      }
      else if( pcase_var.eql( $kw175$ALIGN_FROM ) )
      {
        _csetf_sm_merge_info_align_from( v_new, current_value );
      }
      else if( pcase_var.eql( $kw176$INDEXICAL_EQUIVALENCES ) )
      {
        _csetf_sm_merge_info_indexical_equivalences( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject visit_defstruct_sm_merge_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym177$MAKE_SM_MERGE_INFO, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw34$ID, sm_merge_info_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw172$FROM_SCENARIO, sm_merge_info_from_scenario( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw173$TO_SCENARIO, sm_merge_info_to_scenario( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw174$ALIGN_TO, sm_merge_info_align_to( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw175$ALIGN_FROM, sm_merge_info_align_from( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw176$INDEXICAL_EQUIVALENCES, sm_merge_info_indexical_equivalences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym177$MAKE_SM_MERGE_INFO, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 27832L)
  public static SubLObject visit_defstruct_object_sm_merge_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sm_merge_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28169L)
  public static SubLObject sm_new_merge_info()
  {
    final SubLObject merge_info = make_sm_merge_info( UNPROVIDED );
    final SubLObject id = next_sm_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_merge_info_id( merge_info, id );
      sm_add_object( id, merge_info );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28395L)
  public static SubLObject sm_cleanup_merge_info(final SubLObject merge_info)
  {
    assert NIL != sm_merge_info_p( merge_info ) : merge_info;
    final SubLObject id = sm_merge_info_id( merge_info );
    final SubLObject success = sm_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28633L)
  public static SubLObject sm_set_merge_info_from_scenario(final SubLObject merge_info, final SubLObject from_scenario)
  {
    assert NIL != sm_merge_info_p( merge_info ) : merge_info;
    assert NIL != sm_scenario_p( from_scenario ) : from_scenario;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_merge_info_from_scenario( merge_info, from_scenario );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 28898L)
  public static SubLObject sm_set_merge_info_to_scenario(final SubLObject merge_info, final SubLObject to_scenario)
  {
    assert NIL != sm_merge_info_p( merge_info ) : merge_info;
    assert NIL != sm_scenario_p( to_scenario ) : to_scenario;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_merge_info_to_scenario( merge_info, to_scenario );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 29153L)
  public static SubLObject sm_set_merge_info_align_to(final SubLObject merge_info, final SubLObject indexical_record)
  {
    assert NIL != sm_merge_info_p( merge_info ) : merge_info;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_merge_info_align_to( merge_info, indexical_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 29425L)
  public static SubLObject sm_set_merge_info_align_from(final SubLObject merge_info, final SubLObject indexical_record)
  {
    assert NIL != sm_merge_info_p( merge_info ) : merge_info;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_merge_info_align_from( merge_info, indexical_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 29701L)
  public static SubLObject update_sm_merge_info_indexical_equivalences(final SubLObject merge_info)
  {
    assert NIL != sm_merge_info_p( merge_info ) : merge_info;
    final SubLObject align_to = sm_merge_info_align_to( merge_info );
    final SubLObject align_from = sm_merge_info_align_from( merge_info );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      final SubLObject item_var = ConsesLow.list( align_to, align_from );
      if( NIL == conses_high.member( item_var, sm_merge_info_indexical_equivalences( merge_info ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_sm_merge_info_indexical_equivalences( merge_info, ConsesLow.cons( item_var, sm_merge_info_indexical_equivalences( merge_info ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return merge_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sm_gen_point_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_id(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_non_indexical(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_isas(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_genls(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_positions(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_indexical_record(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject sm_gen_point_keyword(final SubLObject v_object)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_non_indexical(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_isas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_genls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_positions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_indexical_record(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject _csetf_sm_gen_point_keyword(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sm_gen_point_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject make_sm_gen_point(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sm_gen_point_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_sm_gen_point_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw201$NON_INDEXICAL ) )
      {
        _csetf_sm_gen_point_non_indexical( v_new, current_value );
      }
      else if( pcase_var.eql( $kw126$ISAS ) )
      {
        _csetf_sm_gen_point_isas( v_new, current_value );
      }
      else if( pcase_var.eql( $kw127$GENLS ) )
      {
        _csetf_sm_gen_point_genls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw202$POSITIONS ) )
      {
        _csetf_sm_gen_point_positions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw203$INDEXICAL_RECORD ) )
      {
        _csetf_sm_gen_point_indexical_record( v_new, current_value );
      }
      else if( pcase_var.eql( $kw204$KEYWORD ) )
      {
        _csetf_sm_gen_point_keyword( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject visit_defstruct_sm_gen_point(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym205$MAKE_SM_GEN_POINT, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw34$ID, sm_gen_point_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw201$NON_INDEXICAL, sm_gen_point_non_indexical( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw126$ISAS, sm_gen_point_isas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw127$GENLS, sm_gen_point_genls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw202$POSITIONS, sm_gen_point_positions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw203$INDEXICAL_RECORD, sm_gen_point_indexical_record( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw204$KEYWORD, sm_gen_point_keyword( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym205$MAKE_SM_GEN_POINT, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30067L)
  public static SubLObject visit_defstruct_object_sm_gen_point_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sm_gen_point( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30417L)
  public static SubLObject sm_new_gen_point(final SubLObject non_indexical)
  {
    final SubLObject sm_gen_point = make_sm_gen_point( UNPROVIDED );
    final SubLObject id = next_sm_id();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_gen_point_id( sm_gen_point, id );
      _csetf_sm_gen_point_non_indexical( sm_gen_point, non_indexical );
      sm_add_object( id, sm_gen_point );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return sm_gen_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 30799L)
  public static SubLObject sm_add_gen_point_isas(final SubLObject sm_gen_point, final SubLObject isas)
  {
    assert NIL != sm_gen_point_p( sm_gen_point ) : sm_gen_point;
    assert NIL != Types.listp( isas ) : isas;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_gen_point_isas( sm_gen_point, isas );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return sm_gen_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31016L)
  public static SubLObject sm_add_gen_point_genls(final SubLObject sm_gen_point, final SubLObject v_genls)
  {
    assert NIL != sm_gen_point_p( sm_gen_point ) : sm_gen_point;
    assert NIL != Types.listp( v_genls ) : v_genls;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_gen_point_genls( sm_gen_point, v_genls );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return sm_gen_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31238L)
  public static SubLObject sm_add_gen_point_position(final SubLObject sm_gen_point, SubLObject position)
  {
    assert NIL != sm_gen_point_p( sm_gen_point ) : sm_gen_point;
    assert NIL != Types.listp( position ) : position;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      if( NIL == conses_high.member( position, sm_gen_point_positions( sm_gen_point ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_sm_gen_point_positions( sm_gen_point, ConsesLow.cons( position, sm_gen_point_positions( sm_gen_point ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return sm_gen_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31487L)
  public static SubLObject sm_set_gen_point_indexical_record(final SubLObject sm_gen_point, final SubLObject indexical_record)
  {
    assert NIL != sm_gen_point_p( sm_gen_point ) : sm_gen_point;
    assert NIL != sm_indexical_record_p( indexical_record ) : indexical_record;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $sm_lock$.getGlobalValue() );
      _csetf_sm_gen_point_indexical_record( sm_gen_point, indexical_record );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $sm_lock$.getGlobalValue() );
      }
    }
    return sm_gen_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 31780L)
  public static SubLObject sm_grab_or_compute_gen_point_keyword(final SubLObject gen_point)
  {
    final SubLObject keyword = sm_gen_point_keyword( gen_point );
    if( NIL != keyword )
    {
      return keyword;
    }
    final SubLObject type = sm_best_gen_point_type( gen_point );
    _csetf_sm_gen_point_keyword( gen_point, ( NIL != constant_handles.constant_p( type ) ) ? string_utilities.keyword_from_string( Strings.string_upcase( constants_high.constant_name( type ), UNPROVIDED, UNPROVIDED ) )
        : Symbols.gentemp( $str207$_SC ) );
    return sm_gen_point_keyword( gen_point );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 32188L)
  public static SubLObject sm_best_gen_point_type(final SubLObject gen_point)
  {
    return sm_gen_point_isas( gen_point ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 32298L)
  public static SubLObject sm_cleanup_gen_point(final SubLObject gen_point)
  {
    assert NIL != sm_gen_point_p( gen_point ) : gen_point;
    final SubLObject id = sm_gen_point_id( gen_point );
    final SubLObject success = sm_rem_object( id );
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 32528L)
  public static SubLObject sm_simple_compute_and_set_indexical_phrase(final SubLObject indexical_record)
  {
    final SubLObject v_genls = sm_indexical_record_explicit_genls( indexical_record );
    final SubLObject isas = sm_indexical_record_explicit_isas( indexical_record );
    final SubLObject specific_genls = sm_choose_optimal_genls( v_genls );
    final SubLObject specific_isa = sm_choose_optimal_isa( isas );
    SubLObject phrase = NIL;
    if( NIL != v_genls && cardinality_estimates.generality_estimate( specific_genls ).numL( cardinality_estimates.generality_estimate( specific_isa ) ) )
    {
      phrase = Sequences.cconcatenate( $str208$the_kind_of_, pph_main.generate_phrase( specific_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      phrase = pph_main.generate_phrase( el_utilities.make_unary_formula( $const209$The, specific_isa ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    sm_add_indexical_phrase( indexical_record, phrase );
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 33314L)
  public static SubLObject sm_choose_optimal_genls(final SubLObject v_genls)
  {
    return Sort.sort( v_genls, Symbols.symbol_function( $sym210$_ ), $sym211$GENERALITY_ESTIMATE ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 33418L)
  public static SubLObject sm_choose_optimal_isa(final SubLObject isas)
  {
    return Sort.sort( isas, Symbols.symbol_function( $sym210$_ ), $sym211$GENERALITY_ESTIMATE ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 33519L)
  public static SubLObject sm_scenario_indexical_records_of_type(final SubLObject v_scenario, final SubLObject collection, final SubLObject relation, SubLObject template)
  {
    if( template == UNPROVIDED )
    {
      template = NIL;
    }
    SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject result = NIL;
    if( NIL != template )
    {
      indexical_records = ConsesLow.append( sm_template_parameters( template ), indexical_records );
    }
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( relation.eql( $kw212$ISA ) )
      {
        if( collection.eql( sm_indexical_record_explicit_isas( indexical_record ).first() ) )
        {
          result = ConsesLow.cons( indexical_record, result );
        }
      }
      else if( relation.eql( $kw127$GENLS ) && collection.eql( sm_indexical_record_explicit_genls( indexical_record ).first() ) )
      {
        result = ConsesLow.cons( indexical_record, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 34298L)
  public static SubLObject sm_number_indexical_phrases(final SubLObject indexical_records, final SubLObject collection, final SubLObject relation)
  {
    final SubLObject basic_phrase = pph_main.generate_phrase( collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.doubletonP( indexical_records ) )
    {
      sm_uniquify_two_indexical_records( indexical_records, basic_phrase, relation );
      return NIL;
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( indexical_records ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      sm_number_one_indexical_phrase( Sequences.elt( indexical_records, i ), Sequences.elt( $sm_indexical_numbered_phrases$.getGlobalValue(), i ), basic_phrase, relation );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 34794L)
  public static SubLObject sm_uniquify_two_indexical_records(final SubLObject indexical_records, final SubLObject basic_phrase, final SubLObject relation)
  {
    SubLObject first_record = NIL;
    SubLObject second_record = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( indexical_records, indexical_records, $list214 );
    first_record = indexical_records.first();
    SubLObject current = indexical_records.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, indexical_records, $list214 );
    second_record = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( relation.eql( $kw212$ISA ) )
      {
        sm_add_indexical_phrase( first_record, Sequences.cconcatenate( $str215$the_, basic_phrase ) );
        sm_add_indexical_phrase( second_record, Sequences.cconcatenate( $str216$the_other_, basic_phrase ) );
      }
      else if( relation.eql( $kw127$GENLS ) )
      {
        sm_add_indexical_phrase( first_record, Sequences.cconcatenate( $str208$the_kind_of_, basic_phrase ) );
        sm_add_indexical_phrase( second_record, Sequences.cconcatenate( $str217$the_other_kind_of_, basic_phrase ) );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( indexical_records, $list214 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 35375L)
  public static SubLObject sm_number_one_indexical_phrase(final SubLObject indexical_record, final SubLObject number_phrase, final SubLObject basic_phrase, final SubLObject relation)
  {
    SubLObject cdolist_list_var = sm_indexical_record_phrases( indexical_record );
    SubLObject phrase = NIL;
    phrase = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.substringP( basic_phrase, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        sm_rem_indexical_phrase( indexical_record, phrase );
      }
      cdolist_list_var = cdolist_list_var.rest();
      phrase = cdolist_list_var.first();
    }
    if( relation.eql( $kw212$ISA ) )
    {
      sm_add_indexical_phrase( indexical_record, Sequences.cconcatenate( $str215$the_, new SubLObject[] { number_phrase, $str218$_, basic_phrase
      } ) );
    }
    else if( relation.eql( $kw127$GENLS ) )
    {
      sm_add_indexical_phrase( indexical_record, Sequences.cconcatenate( $str215$the_, new SubLObject[] { number_phrase, $str219$_kind_of_, basic_phrase
      } ) );
    }
    return indexical_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 35948L)
  public static SubLObject sm_generate_indexical_phrases_for_scenario(final SubLObject v_scenario, SubLObject template)
  {
    if( template == UNPROVIDED )
    {
      template = NIL;
    }
    SubLObject already_handled = NIL;
    SubLObject indexical_records = sm_scenario_terms( v_scenario );
    if( NIL != template )
    {
      indexical_records = ConsesLow.append( sm_template_parameters( template ), indexical_records );
    }
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( indexical_record, already_handled, UNPROVIDED, UNPROVIDED ) && NIL == sm_indexical_record_phrases( indexical_record ) )
      {
        final SubLObject v_isa = sm_indexical_record_explicit_isas( indexical_record ).first();
        final SubLObject genl = v_isa.eql( $const220$Collection ) ? sm_indexical_record_explicit_genls( indexical_record ).first() : NIL;
        final SubLObject others_of_type = Sequences.remove( indexical_record, ( NIL != genl ) ? sm_scenario_indexical_records_of_type( v_scenario, genl, $kw127$GENLS, template )
            : sm_scenario_indexical_records_of_type( v_scenario, v_isa, $kw212$ISA, template ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        already_handled = ConsesLow.cons( indexical_record, already_handled );
        if( NIL == others_of_type )
        {
          if( NIL == sm_indexical_record_phrases( indexical_record ) )
          {
            sm_simple_compute_and_set_indexical_phrase( indexical_record );
          }
        }
        else
        {
          already_handled = ConsesLow.nconc( already_handled, others_of_type );
          if( NIL != genl )
          {
            sm_number_indexical_phrases( Sort.sort( ConsesLow.cons( indexical_record, others_of_type ), Symbols.symbol_function( $sym210$_ ), Symbols.symbol_function( $sym221$SM_INDEXICAL_RECORD_NUMBER ) ), genl,
                $kw127$GENLS );
          }
          else
          {
            sm_number_indexical_phrases( Sort.sort( ConsesLow.cons( indexical_record, others_of_type ), Symbols.symbol_function( $sym210$_ ), Symbols.symbol_function( $sym221$SM_INDEXICAL_RECORD_NUMBER ) ), v_isa,
                $kw212$ISA );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 37688L)
  public static SubLObject sm_act_read_scenario(final SubLObject scenario_spec, final SubLObject phrase, final SubLObject interaction_mt)
  {
    final SubLObject scenario_fort = sm_scenario_spec_fort( scenario_spec );
    final SubLObject v_scenario = sm_new_scenario( phrase, scenario_fort, UNPROVIDED );
    final SubLObject substitutions = sm_scenario_spec_substitutions( scenario_spec );
    final SubLObject indexical_records = sm_retrieve_scenario_fort_indexical_records( v_scenario, scenario_fort, interaction_mt );
    final SubLObject constraint_records = sm_retrieve_scenario_fort_constraint_records( v_scenario, scenario_fort, interaction_mt );
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( sm_indexical_record_indexical( indexical_record ), substitutions, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym222$CAR ) ) )
      {
        sm_add_scenario_term( v_scenario, indexical_record );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    sm_generate_indexical_phrases_for_scenario( v_scenario, UNPROVIDED );
    cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_add_scenario_constraint( v_scenario, sm_substitute_terms_for_indexicals( constraint_record, substitutions ) );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39188L)
  public static SubLObject sm_retrieve_scenario_fort_indexical_records(final SubLObject v_scenario, final SubLObject scenario_fort, final SubLObject mt)
  {
    final SubLObject indexicals = sm_retrieve_scenario_terms_for_scenario( scenario_fort, mt );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = indexicals;
    SubLObject indexical = NIL;
    indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject phrases = sm_retrieve_scenario_referents_for_scenario( scenario_fort, indexical, mt );
      result = ConsesLow.cons( sm_new_indexical_record( indexical, phrases, UNPROVIDED, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      indexical = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39647L)
  public static SubLObject sm_retrieve_scenario_terms_for_scenario(final SubLObject scenario_fort, final SubLObject mt)
  {
    return kb_mapping_utilities.pred_values_in_relevant_mts( scenario_fort, $const223$scenarioTerms, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39802L)
  public static SubLObject sm_retrieve_scenario_referents_for_scenario(final SubLObject scenario_fort, final SubLObject indexical, final SubLObject mt)
  {
    return kb_mapping_utilities.pred_arg_values_in_relevant_mts( scenario_fort, $const224$scenarioReferent, indexical, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 39985L)
  public static SubLObject sm_retrieve_scenario_fort_constraint_records(final SubLObject v_scenario, final SubLObject scenario_fort, final SubLObject mt)
  {
    final SubLObject sentences = kb_mapping_utilities.pred_values_in_relevant_mts( scenario_fort, $const225$scenarioConstraint, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentence = narts_high.nart_substitute( sentence );
      result = ConsesLow.cons( sm_new_constraint_record( sentence ), result );
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 40362L)
  public static SubLObject sm_substitute_terms_for_indexicals(final SubLObject constraint_record, final SubLObject substitutions)
  {
    final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
    SubLObject sentence_copy = el_utilities.copy_formula( sentence );
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw226$IGNORE );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.nautP( v_term, UNPROVIDED ) )
      {
        v_term = narts_high.find_nart( v_term );
      }
      if( NIL != sm_indexical_p( v_term ) )
      {
        final SubLObject new_term = ( NIL != sm_substitution_list_p( substitutions ) ) ? sm_get_standin_for_indexical( substitutions, v_term ) : v_term;
        if( NIL != new_term )
        {
          sentence_copy = cycl_utilities.expression_subst( new_term, v_term, sentence_copy, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    sm_set_constraint_record_sentence( constraint_record, sentence_copy );
    return constraint_record;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 41200L)
  public static SubLObject sm_act_suggest_scenarios(final SubLObject phrase, final SubLObject interaction_mt, final SubLObject parsing_mt)
  {
    final SubLObject scenario_expressions = sm_extract_candidate_scenario_expressions( phrase, parsing_mt, interaction_mt );
    SubLObject candidate_scenarios = NIL;
    SubLObject cdolist_list_var = scenario_expressions;
    SubLObject scenario_expression = NIL;
    scenario_expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_scenario = sm_act_initialize_scenario_from_expression( scenario_expression, phrase, interaction_mt, parsing_mt );
      candidate_scenarios = ConsesLow.cons( v_scenario, candidate_scenarios );
      cdolist_list_var = cdolist_list_var.rest();
      scenario_expression = cdolist_list_var.first();
    }
    return candidate_scenarios;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 42253L)
  public static SubLObject sm_extract_candidate_scenario_expressions(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject interaction_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject parse_results = NIL;
    parse_results = rkf_text_processors.rkf_scenario_reader( phrase, parsing_mt, interaction_mt );
    final SubLObject token_list = rkf_concept_harvester.rkf_ch_string_tokenize( phrase );
    final SubLObject top_result = parse_results.first();
    if( Sequences.length( token_list ).numE( Sequences.length( top_result.first() ) ) )
    {
      SubLObject result = conses_high.second( top_result );
      result = list_utilities.remove_if_not( Symbols.symbol_function( $sym95$SM_SCENARIO_EXPRESSION_P ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = parse_results.rest();
      SubLObject parse_result = NIL;
      parse_result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = sm_parse_result_substitute( parse_result, token_list, result );
        cdolist_list_var = cdolist_list_var.rest();
        parse_result = cdolist_list_var.first();
      }
      final SubLObject _prev_bind_0 = $sm_semantic_mt$.currentBinding( thread );
      try
      {
        $sm_semantic_mt$.bind( interaction_mt, thread );
        result = list_utilities.remove_if_not( Symbols.symbol_function( $sym227$SM_SCENARIO_EXPRESSION_OK ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        $sm_semantic_mt$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 43301L)
  public static SubLObject sm_act_initialize_scenario_from_expression(final SubLObject scenario_expression, final SubLObject phrase, final SubLObject storage_mt, final SubLObject parsing_mt)
  {
    final SubLObject scenario_fort = sm_scenario_expression_fort( scenario_expression );
    final SubLObject cyc_terms = sm_scenario_expression_cyc_terms( scenario_expression );
    final SubLObject indexical_nauts = sm_scenario_expression_indexical_nauts( scenario_expression );
    final SubLObject indexicals = Mapping.mapcar( Symbols.symbol_function( $sym228$FIND_NART ), indexical_nauts );
    final SubLObject substitutions = Mapping.mapcar( Symbols.symbol_function( $sym229$LIST ), indexicals, new SubLObject[] { cyc_terms
    } );
    final SubLObject scenario_spec = sm_new_scenario_spec( scenario_fort, substitutions );
    SubLObject scenario_phrase = NIL;
    SubLObject v_scenario = NIL;
    if( NIL == phrase )
    {
      scenario_phrase = sm_fetch_scenario_phrase( scenario_expression, parsing_mt );
    }
    else
    {
      scenario_phrase = phrase;
    }
    v_scenario = sm_act_read_scenario( scenario_spec, scenario_phrase, storage_mt );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 44130L)
  public static SubLObject sm_scenario_expression_ok(final SubLObject scenario_expression, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $sm_semantic_mt$.getDynamicValue();
    }
    if( NIL != list_utilities.lengthE( scenario_expression, FOUR_INTEGER, UNPROVIDED ) )
    {
      final SubLObject cyc_terms = sm_scenario_expression_cyc_terms( scenario_expression );
      final SubLObject indexical_nauts = sm_scenario_expression_indexical_nauts( scenario_expression );
      final SubLObject length = Sequences.length( cyc_terms );
      if( NIL != list_utilities.lengthE( indexical_nauts, length, UNPROVIDED ) )
      {
        SubLObject i;
        SubLObject indexical_naut;
        SubLObject cyc_term;
        SubLObject naut_type;
        for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          indexical_naut = cycl_utilities.formula_arg( indexical_nauts, i, UNPROVIDED );
          cyc_term = cycl_utilities.formula_arg( cyc_terms, i, UNPROVIDED );
          naut_type = cycl_utilities.nat_arg1( indexical_naut, UNPROVIDED );
          if( NIL == sm_el_wftP( cyc_term, mt ) || NIL != isa.not_isaP( cyc_term, naut_type, mt, UNPROVIDED ) )
          {
            return NIL;
          }
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 44947L)
  public static SubLObject sm_el_wftP(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_list_as_terminalP$.currentBinding( thread );
    try
    {
      cycl_grammar.$grammar_permits_list_as_terminalP$.bind( NIL, thread );
      result = wff.el_wftP( v_term, mt, UNPROVIDED );
    }
    finally
    {
      cycl_grammar.$grammar_permits_list_as_terminalP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 45121L)
  public static SubLObject sm_scenario_constraints_wffP(final SubLObject v_scenario, final SubLObject mt)
  {
    final SubLObject constraint_records = sm_scenario_constraints( v_scenario );
    SubLObject cdolist_list_var;
    final SubLObject constraint_sentences = cdolist_list_var = Mapping.mapcar( Symbols.symbol_function( $sym143$SM_CONSTRAINT_RECORD_SENTENCE ), constraint_records );
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == wff.el_wffP( sentence, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 45441L)
  public static SubLObject sm_fetch_scenario_phrase(final SubLObject scenario_expression, final SubLObject parsing_mt)
  {
    final SubLObject template_expression = ask_utilities.ask_variable( ConsesLow.list( $const230$termTemplate, $const231$ScenarioTemplate, $sym232$_EXPR, scenario_expression ), parsing_mt, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sm_enumerate_scenarios_unpack_template_expression( template_expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 45758L)
  public static SubLObject sm_act_initialize_scenario_from_cycl(SubLObject cycl_sentence, final SubLObject domain_interaction_mt, final SubLObject generation_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.el_conjunction_p( cycl_sentence ) )
    {
      cycl_sentence = el_utilities.make_conjunction( ConsesLow.list( cycl_sentence ) );
    }
    final SubLObject v_scenario = sm_new_scenario( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject vars = sm_extract_cycl_sentence_vars( cycl_sentence );
    SubLObject constraints = NIL;
    SubLObject var_map = NIL;
    final SubLObject literals = sm_extract_cycl_sentence_constraints( cycl_sentence );
    SubLObject cdolist_list_var = vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject isas = NIL;
      SubLObject v_genls = NIL;
      final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
      try
      {
        at_vars.$accumulating_at_violationsP$.bind( T, thread );
        thread.resetMultipleValues();
        final SubLObject var_isas = sm_term_requires_types_in_relations( var, literals, domain_interaction_mt );
        final SubLObject var_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        isas = var_isas;
        v_genls = var_genls;
      }
      finally
      {
        at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
      }
      if( NIL == isas )
      {
        isas = ConsesLow.list( $const233$Thing );
      }
      final SubLObject indexical = sm_new_indexical( $const233$Thing, sm_get_next_indexical_number_of_type( v_scenario, $const233$Thing ) );
      final SubLObject indexical_record = sm_new_indexical_record( indexical, NIL, isas, v_genls );
      var_map = ConsesLow.cons( ConsesLow.list( var, indexical_record ), var_map );
      sm_set_indexical_record_var( indexical_record, var );
      sm_add_scenario_term( v_scenario, indexical_record );
      cycl_sentence = cycl_utilities.expression_subst( indexical, var, cycl_sentence, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    sm_generate_indexical_phrases_for_scenario( v_scenario, UNPROVIDED );
    constraints = ConsesLow.nconc( constraints, sm_extract_cycl_sentence_constraints( cycl_sentence ) );
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject cdolist_list_var2 = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject constraint_record = sm_new_constraint_record( UNPROVIDED );
      sm_set_constraint_record_sentence( constraint_record, constraint );
      sm_add_scenario_constraint( v_scenario, constraint_record );
      sm_act_constraint_record_nl_sentence( constraint_record, indexical_records, domain_interaction_mt, generation_mt );
      cdolist_list_var2 = cdolist_list_var2.rest();
      constraint = cdolist_list_var2.first();
    }
    return Values.values( v_scenario, var_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 48788L)
  public static SubLObject sm_extract_cycl_sentence_vars(final SubLObject cycl_sentence)
  {
    return cycl_utilities.expression_gather( cycl_sentence, $sym131$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 48918L)
  public static SubLObject sm_extract_types_for_var(final SubLObject formula, final SubLObject var)
  {
    if( NIL == formula )
    {
      return NIL;
    }
    if( formula.isAtom() )
    {
      return NIL;
    }
    if( NIL != el_utilities.possibly_sentence_p( formula ) && cycl_utilities.sentence_arg0( formula ).eql( $const234$and ) )
    {
      return sm_extract_types_for_var( cycl_utilities.sentence_args( formula, UNPROVIDED ), var );
    }
    if( NIL != el_utilities.possibly_sentence_p( formula ) && cycl_utilities.sentence_arg0( formula ).eql( $const235$isa ) && cycl_utilities.sentence_arg1( formula, UNPROVIDED ).eql( var ) )
    {
      return ConsesLow.list( cycl_utilities.sentence_arg2( formula, UNPROVIDED ) );
    }
    if( NIL != el_utilities.possibly_sentence_p( formula ) )
    {
      return ConsesLow.append( sm_extract_types_for_var( formula.first(), var ), sm_extract_types_for_var( formula.rest(), var ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 49510L)
  public static SubLObject sm_extract_cycl_sentence_constraints(final SubLObject cycl_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym236$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const237$EverythingPSC, thread );
      if( NIL == cycl_sentence )
      {
        result = NIL;
      }
      else if( NIL != el_utilities.el_existential_p( cycl_sentence ) )
      {
        result = sm_extract_cycl_sentence_constraints( cycl_utilities.sentence_arg2( cycl_sentence, UNPROVIDED ) );
      }
      else if( NIL != el_utilities.possibly_sentence_p( cycl_sentence ) && cycl_utilities.sentence_arg0( cycl_sentence ).eql( $const234$and ) )
      {
        result = sm_extract_cycl_sentence_constraints( cycl_utilities.sentence_args( cycl_sentence, UNPROVIDED ) );
      }
      else if( NIL != el_utilities.el_general_implication_p( cycl_sentence ) || NIL != el_utilities.el_disjunction_p( cycl_sentence ) || NIL != el_utilities.el_universal_p( cycl_sentence ) )
      {
        Errors.error( $str238$Cycl_formulas_containing__A_canno, cycl_utilities.sentence_arg0( cycl_sentence ) );
      }
      else if( NIL != sm_atomic_sentenceP( cycl_sentence, UNPROVIDED ) || NIL != sm_negated_atomic_sentenceP( cycl_sentence, UNPROVIDED ) )
      {
        result = ConsesLow.list( cycl_sentence );
      }
      else if( cycl_sentence.isCons() )
      {
        result = ConsesLow.append( sm_extract_cycl_sentence_constraints( cycl_sentence.first() ), sm_extract_cycl_sentence_constraints( cycl_sentence.rest() ) );
      }
      else
      {
        Errors.error( $str239$_A_unexpected_, cycl_sentence );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 50640L)
  public static SubLObject sm_atomic_sentenceP(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym240$CYC_VAR_;
    }
    return makeBoolean( NIL != el_utilities.atomic_sentenceP( v_object ) || ( NIL != el_utilities.el_formula_p( v_object ) && NIL != term.relation_syntaxP( v_object, varP ) && NIL != sm_indexical_p( cycl_utilities
        .formula_arg0( v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 50909L)
  public static SubLObject sm_negated_atomic_sentenceP(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym240$CYC_VAR_;
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && cycl_utilities.sentence_arg0( v_object ).eql( $const241$not ) && NIL != sm_atomic_sentenceP( cycl_utilities.sentence_arg1( v_object, UNPROVIDED ),
        varP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 51124L)
  public static SubLObject sm_act_suggest_new_indexical_type(final SubLObject indexical_phrase, final SubLObject parsing_mt, final SubLObject domain_mt)
  {
    SubLObject parse_results = NIL;
    parse_results = rkf_text_processors.rkf_term_reader( indexical_phrase, parsing_mt, domain_mt, UNPROVIDED );
    final SubLObject length = Sequences.length( rkf_concept_harvester.rkf_ch_string_tokenize( indexical_phrase ) );
    final SubLObject collections = sm_extract_entire_parses_of_type( parse_results, length, $sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_ );
    return collections;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 51853L)
  public static SubLObject sm_act_add_new_indexical(final SubLObject v_scenario, final SubLObject indexical_phrase, final SubLObject indexical_isa, final SubLObject indexical_genls)
  {
    final SubLObject indexical = sm_new_indexical( $const233$Thing, sm_get_next_indexical_number_of_type( v_scenario, $const233$Thing ) );
    final SubLObject isas = indexical_isa.isList() ? indexical_isa : ConsesLow.list( indexical_isa );
    final SubLObject v_genls = indexical_genls.isList() ? indexical_genls : ConsesLow.list( indexical_genls );
    final SubLObject indexical_record = sm_new_indexical_record( indexical, ConsesLow.list( indexical_phrase ), isas, v_genls );
    sm_add_scenario_term( v_scenario, indexical_record );
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 52877L)
  public static SubLObject sm_act_share_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    sm_add_scenario_term( v_scenario, indexical_record );
    sm_scenario_note_borrowed_indexical( v_scenario, indexical_record );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 53185L)
  public static SubLObject sm_get_next_indexical_number_of_type(final SubLObject v_scenario, final SubLObject indexical_type)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject largest_seen = ZERO_INTEGER;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      final SubLObject existing_type = sm_indexical_type( indexical );
      if( existing_type.equal( indexical_type ) && sm_indexical_number( indexical ).numG( largest_seen ) )
      {
        largest_seen = sm_indexical_number( indexical );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return number_utilities.f_1X( largest_seen );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 53733L)
  public static SubLObject sm_extract_entire_parses_of_type(final SubLObject parse_results, final SubLObject length, final SubLObject test)
  {
    SubLObject concepts = NIL;
    SubLObject cdolist_list_var = parse_results;
    SubLObject parse_result = NIL;
    parse_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( Sequences.length( parse_result.first() ).numE( length ) )
      {
        SubLObject cdolist_list_var_$1 = conses_high.second( parse_result );
        SubLObject parse = NIL;
        parse = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( NIL != Functions.funcall( test, parse ) )
          {
            concepts = ConsesLow.cons( parse, concepts );
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
  public static SubLObject sm_act_find_indexical(final SubLObject v_scenario, final SubLObject indexical_phrase, SubLObject testfn)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = $sym243$STRING_EQUAL;
    }
    SubLObject foundP = NIL;
    if( NIL == foundP )
    {
      SubLObject csome_list_var = sm_scenario_terms( v_scenario );
      SubLObject indexical_record = NIL;
      indexical_record = csome_list_var.first();
      while ( NIL == foundP && NIL != csome_list_var)
      {
        if( NIL != Sequences.find( indexical_phrase, sm_indexical_record_phrases( indexical_record ), testfn, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          foundP = indexical_record;
        }
        csome_list_var = csome_list_var.rest();
        indexical_record = csome_list_var.first();
      }
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 54459L)
  public static SubLObject sm_act_suggest_differences(final SubLObject v_scenario, final SubLObject new_indexical, final SubLObject domain_interaction_mt)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    final SubLObject new_constraints = sm_indexical_record_get_collections( new_indexical );
    SubLObject candidates = NIL;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !indexical_record.eql( new_indexical ) )
      {
        final SubLObject current_constraints = sm_indexical_record_get_collections( indexical_record );
        if( NIL == disjoint_with.any_disjoint_with_anyP( new_constraints, current_constraints, domain_interaction_mt, UNPROVIDED, UNPROVIDED ) )
        {
          candidates = ConsesLow.cons( indexical_record, candidates );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return candidates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 55517L)
  public static SubLObject sm_indexical_record_get_collections(final SubLObject indexical)
  {
    return list_utilities.flatten( conses_high.union( sm_indexical_record_genls( indexical ), sm_indexical_record_isas( indexical ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 55708L)
  public static SubLObject sm_act_distinguish_indexicals(final SubLObject v_scenario, final SubLObject indexical_a, final SubLObject indexical_b, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_a = sm_indexical_record_indexical( indexical_a );
    final SubLObject term_b = sm_indexical_record_indexical( indexical_b );
    final SubLObject sentence = el_utilities.make_binary_formula( $const244$different, term_a, term_b );
    thread.resetMultipleValues();
    final SubLObject temp = sm_act_add_scenario_constraint( v_scenario, sentence, domain_mt );
    final SubLObject status = thread.secondMultipleValue();
    final SubLObject irec = thread.thirdMultipleValue();
    final SubLObject predicate = thread.fourthMultipleValue();
    final SubLObject index_col = thread.fifthMultipleValue();
    final SubLObject rel_col = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 56226L)
  public static SubLObject sm_act_remove_indexical(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject domain_interaction_mt)
  {
    sm_remove_dependent_constraints( v_scenario, indexical_record, domain_interaction_mt );
    sm_rem_scenario_term( v_scenario, indexical_record );
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 56758L)
  public static SubLObject sm_remove_dependent_constraints(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject domain_interaction_mt)
  {
    final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
    SubLObject dependent_constraints = NIL;
    SubLObject cdolist_list_var = sm_scenario_constraints( v_scenario );
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl = sm_constraint_record_sentence( constraint_record );
      if( NIL != cycl_utilities.formula_find( indexical, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        dependent_constraints = ConsesLow.cons( constraint_record, dependent_constraints );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    sm_act_remove_many_constraints( v_scenario, dependent_constraints, domain_interaction_mt );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 57320L)
  public static SubLObject sm_act_add_indexical_phrase(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject indexical_phrase)
  {
    sm_add_indexical_phrase( indexical_record, indexical_phrase );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 57798L)
  public static SubLObject sm_act_remove_indexical_phrase(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject indexical_phrase)
  {
    sm_rem_indexical_phrase( indexical_record, indexical_phrase );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 58309L)
  public static SubLObject sm_act_gather_all_preferred_indexical_phrases(final SubLObject v_scenario)
  {
    return Mapping.mapcar( $sym245$SM_INDEXICAL_RECORD_PREFERRED_PHRASE, sm_scenario_terms( v_scenario ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 58575L)
  public static SubLObject sm_act_resolve_phrase_to_term(final SubLObject v_scenario, final SubLObject phrase)
  {
    SubLObject doneP = NIL;
    SubLObject result = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = sm_scenario_terms( v_scenario );
      SubLObject indexical_record = NIL;
      indexical_record = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != subl_promotions.memberP( phrase, sm_indexical_record_phrases( indexical_record ), $sym243$STRING_EQUAL, UNPROVIDED ) )
        {
          doneP = T;
          result = sm_indexical_record_indexical( indexical_record );
        }
        csome_list_var = csome_list_var.rest();
        indexical_record = csome_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 58935L)
  public static SubLObject sm_act_remove_isaXgenls_constraint(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject collection, final SubLObject domain_interaction_mt, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $const235$isa;
    }
    SubLObject explicit_known_cols = type.eql( $const235$isa ) ? sm_indexical_record_explicit_isas( indexical_record ) : sm_indexical_record_explicit_genls( indexical_record );
    SubLObject all_known_cols = type.eql( $const235$isa ) ? sm_indexical_record_isas( indexical_record ) : sm_indexical_record_genls( indexical_record );
    explicit_known_cols = Sequences.delete( collection, explicit_known_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    all_known_cols = Sequences.delete( collection, all_known_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( type.eql( $const235$isa ) )
    {
      sm_set_indexical_record_explicit_isas( indexical_record, explicit_known_cols );
      sm_set_indexical_record_isas( indexical_record, all_known_cols );
    }
    else
    {
      sm_set_indexical_record_explicit_genls( indexical_record, explicit_known_cols );
      sm_set_indexical_record_genls( indexical_record, all_known_cols );
    }
    sm_compute_current_indexical_isas_genls( v_scenario, domain_interaction_mt );
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 60459L)
  public static SubLObject sm_act_get_all_isas_for_indexicals(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_get_all_isas_for_indexicals_memoized( v_scenario );
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 60831L)
  public static SubLObject sm_act_get_all_isas_for_indexicals_memoized_internal(final SubLObject v_scenario)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject isas = NIL;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = sm_indexical_record_explicit_isas( indexical_record );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        final SubLObject item_var = v_isa;
        if( NIL == conses_high.member( item_var, isas, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          isas = ConsesLow.cons( item_var, isas );
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
  public static SubLObject sm_act_get_all_isas_for_indexicals_memoized(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_get_all_isas_for_indexicals_memoized_internal( v_scenario );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_get_all_isas_for_indexicals_memoized_internal( v_scenario ) ) );
      memoization_state.caching_state_put( caching_state, v_scenario, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61163L)
  public static SubLObject sm_act_get_all_genls_for_indexicals(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_get_all_genls_for_indexicals_memoized( v_scenario );
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61392L)
  public static SubLObject sm_act_get_all_genls_for_indexicals_memoized_internal(final SubLObject v_scenario)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject v_genls = NIL;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$5 = sm_indexical_record_explicit_genls( indexical_record );
      SubLObject genl = NIL;
      genl = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        final SubLObject item_var = genl;
        if( NIL == conses_high.member( item_var, v_genls, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          v_genls = ConsesLow.cons( item_var, v_genls );
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
  public static SubLObject sm_act_get_all_genls_for_indexicals_memoized(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_get_all_genls_for_indexicals_memoized_internal( v_scenario );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_get_all_genls_for_indexicals_memoized_internal( v_scenario ) ) );
      memoization_state.caching_state_put( caching_state, v_scenario, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 61731L)
  public static SubLObject sm_act_suggest_constraint_cycl_from_text(final SubLObject nl_sentence, final SubLObject indexical_records, final SubLObject parsing_mt, SubLObject interaction_mt)
  {
    if( interaction_mt == UNPROVIDED )
    {
      interaction_mt = NIL;
    }
    SubLObject parse_results = NIL;
    parse_results = rkf_text_processors.rkf_assertion_reader( nl_sentence, parsing_mt, interaction_mt );
    final SubLObject token_list = rkf_concept_harvester.rkf_ch_string_tokenize( nl_sentence );
    final SubLObject length = Sequences.length( token_list );
    final SubLObject first_result = parse_results.first();
    SubLObject sentences = length.numE( Sequences.length( first_result.first() ) ) ? conses_high.second( first_result ) : NIL;
    if( NIL != sentences )
    {
      SubLObject cdolist_list_var = parse_results.rest();
      SubLObject parse_result = NIL;
      parse_result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sentences = sm_indexical_parse_substitute( indexical_records, sentences );
        sentences = sm_parse_result_substitute( parse_result, token_list, sentences );
        cdolist_list_var = cdolist_list_var.rest();
        parse_result = cdolist_list_var.first();
      }
      return Sequences.remove_duplicates( sentences, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 63006L)
  public static SubLObject sm_act_add_scenario_constraint(final SubLObject v_scenario, final SubLObject sentence, final SubLObject domain_interaction_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sm_scenario_clear_all_memoization_state( v_scenario );
    thread.resetMultipleValues();
    final SubLObject okP = sm_sentence_ok_for_scenarioP( v_scenario, sentence, domain_interaction_mt );
    final SubLObject irec = thread.secondMultipleValue();
    final SubLObject predicate = thread.thirdMultipleValue();
    final SubLObject index_col = thread.fourthMultipleValue();
    final SubLObject rel_col = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    if( NIL == okP )
    {
      return Values.values( v_scenario, $kw248$NON_WFF, irec, predicate, index_col, rel_col );
    }
    final SubLObject constraint_record = sm_new_constraint_record( sentence );
    sm_add_scenario_constraint( v_scenario, constraint_record );
    sm_compute_current_indexical_isas_genls( v_scenario, domain_interaction_mt );
    return Values.values( v_scenario, $kw249$OK, NIL, NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 64141L)
  public static SubLObject sm_indexical_parse_substitute(final SubLObject indexical_records, SubLObject sentences)
  {
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical_phrases = sm_indexical_record_phrases( indexical_record );
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      SubLObject cdolist_list_var_$6 = indexical_phrases;
      SubLObject indexical_phrase = NIL;
      indexical_phrase = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        final SubLObject unresolved = cycl_utilities.expression_find( indexical_phrase, sentences, NIL, Symbols.symbol_function( $sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE ), UNPROVIDED );
        if( NIL != unresolved )
        {
          sentences = cycl_utilities.expression_subst( indexical, unresolved, sentences, Symbols.symbol_function( $sym251$SM_UNRESOLVED_EQUAL ), UNPROVIDED );
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
  public static SubLObject sm_unresolved_item_for_phrase(final SubLObject phrase, final SubLObject item)
  {
    return makeBoolean( NIL != function_terms.nat_formula_p( item ) && cycl_utilities.nat_arg0( item ).eql( $const252$TheResultOfParsing ) && cycl_utilities.nat_arg1( item, UNPROVIDED ).equalp( phrase ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 65048L)
  public static SubLObject sm_unresolved_equal(final SubLObject obj1, final SubLObject obj2)
  {
    return makeBoolean( obj1.isCons() && obj2.isCons() && obj1.first().equal( $const252$TheResultOfParsing ) && obj2.first().equal( $const252$TheResultOfParsing ) && conses_high.second( obj1 ).equal( conses_high.second(
        obj2 ) ) && conses_high.third( obj1 ).equal( conses_high.third( obj2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 65326L)
  public static SubLObject sm_subphrase(final SubLObject token_list, final SubLObject token_numbers)
  {
    SubLObject subphrase = NIL;
    SubLObject cdolist_list_var = token_numbers;
    SubLObject token_number = NIL;
    token_number = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subphrase = ConsesLow.cons( ConsesLow.nth( token_number, token_list ), subphrase );
      cdolist_list_var = cdolist_list_var.rest();
      token_number = cdolist_list_var.first();
    }
    return Sequences.nreverse( subphrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 65539L)
  public static SubLObject sm_parse_result_substitute(final SubLObject parse_result, final SubLObject token_list, final SubLObject sentences)
  {
    SubLObject result_sentences = NIL;
    SubLObject token_numbers = NIL;
    SubLObject parses = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( parse_result, parse_result, $list253 );
    token_numbers = parse_result.first();
    SubLObject current = parse_result.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, parse_result, $list253 );
    parses = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject subphrase = string_utilities.bunge( sm_subphrase( token_list, token_numbers ), UNPROVIDED );
      final SubLObject unresolved = cycl_utilities.expression_find( subphrase, sentences, NIL, Symbols.symbol_function( $sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE ), UNPROVIDED );
      if( NIL == unresolved )
      {
        return sentences;
      }
      SubLObject cdolist_list_var = sentences;
      SubLObject sentence = NIL;
      sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cycl_utilities.expression_find( unresolved, sentence, NIL, Symbols.symbol_function( $sym251$SM_UNRESOLVED_EQUAL ), UNPROVIDED ) )
        {
          SubLObject cdolist_list_var_$7 = parses;
          SubLObject parse = NIL;
          parse = cdolist_list_var_$7.first();
          while ( NIL != cdolist_list_var_$7)
          {
            result_sentences = ConsesLow.cons( cycl_utilities.expression_subst( parse, unresolved, sentence, Symbols.symbol_function( $sym251$SM_UNRESOLVED_EQUAL ), UNPROVIDED ), result_sentences );
            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
            parse = cdolist_list_var_$7.first();
          }
        }
        else
        {
          result_sentences = ConsesLow.cons( sentence, result_sentences );
        }
        cdolist_list_var = cdolist_list_var.rest();
        sentence = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( parse_result, $list253 );
    }
    return Sequences.nreverse( result_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 66316L)
  public static SubLObject sm_sentence_ok_for_scenarioP(final SubLObject v_scenario, final SubLObject sentence, final SubLObject domain_interaction_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject indexicals = cdolist_list_var = cycl_utilities.expression_gather( sentence, Symbols.symbol_function( $sym130$SM_INDEXICAL_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject indexical = NIL;
    indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject isas = NIL;
      SubLObject v_genls = NIL;
      final SubLObject indexical_record = sm_indexical_record_of_indexical( indexical, v_scenario );
      final SubLObject current_isas = sm_indexical_record_isas( indexical_record );
      final SubLObject current_genls = sm_indexical_record_genls( indexical_record );
      final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
      try
      {
        at_vars.$accumulating_at_violationsP$.bind( T, thread );
        thread.resetMultipleValues();
        final SubLObject indexical_isas = sm_term_requires_types_in_relation( indexical, sentence, domain_interaction_mt );
        final SubLObject indexical_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        isas = indexical_isas;
        v_genls = indexical_genls;
      }
      finally
      {
        at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
      }
      thread.resetMultipleValues();
      SubLObject indexical_constraint = sm_identify_violating_collection_pair( current_isas, isas, domain_interaction_mt );
      SubLObject relation_constraint = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != indexical_constraint )
      {
        return Values.values( NIL, indexical_record, $const235$isa, indexical_constraint, relation_constraint );
      }
      thread.resetMultipleValues();
      indexical_constraint = sm_identify_violating_collection_pair( current_genls, v_genls, domain_interaction_mt );
      relation_constraint = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != indexical_constraint )
      {
        return Values.values( NIL, indexical_record, $const254$genls, indexical_constraint, relation_constraint );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical = cdolist_list_var.first();
    }
    return Values.values( T, NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 67823L)
  public static SubLObject sm_term_requires_types_in_relation(final SubLObject indexical, final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject isas = at_utilities.term_requires_types_in_relation( indexical, sentence, mt );
    SubLObject v_genls = thread.secondMultipleValue();
    thread.resetMultipleValues();
    isas = rkf_relevance_utilities.rkf_filter_irrelevant_terms( isas, mt );
    v_genls = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_genls, mt );
    return Values.values( genls.min_cols( isas, mt, UNPROVIDED ), genls.min_cols( v_genls, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 68397L)
  public static SubLObject sm_term_requires_types_in_relations(final SubLObject indexical, final SubLObject sentences, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject isas = at_utilities.term_requires_types_in_relations( indexical, sentences, mt, NIL );
    SubLObject v_genls = thread.secondMultipleValue();
    thread.resetMultipleValues();
    isas = rkf_relevance_utilities.rkf_filter_irrelevant_terms( isas, mt );
    v_genls = rkf_relevance_utilities.rkf_filter_irrelevant_terms( v_genls, mt );
    return Values.values( genls.min_cols( isas, mt, UNPROVIDED ), genls.min_cols( v_genls, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 68843L)
  public static SubLObject sm_identify_violating_collection_pair(final SubLObject indexical_cols, final SubLObject relation_cols, final SubLObject mt)
  {
    SubLObject disjoint_problem = NIL;
    SubLObject indexical_constraint = NIL;
    SubLObject relation_constraint = NIL;
    disjoint_problem = disjoint_with.any_disjoint_collection_pair( conses_high.union( indexical_cols, relation_cols, UNPROVIDED, UNPROVIDED ), mt );
    if( NIL != disjoint_problem )
    {
      SubLObject current;
      final SubLObject datum = current = disjoint_problem;
      SubLObject col_one = NIL;
      SubLObject col_other = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list255 );
      col_one = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list255 );
      col_other = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != subl_promotions.memberP( col_one, indexical_cols, UNPROVIDED, UNPROVIDED ) )
        {
          relation_constraint = col_other;
          indexical_constraint = col_one;
        }
        else
        {
          relation_constraint = col_one;
          indexical_constraint = col_other;
        }
        return Values.values( indexical_constraint, relation_constraint );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list255 );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 69756L)
  public static SubLObject sm_compute_current_indexical_isas_genls(final SubLObject v_scenario, final SubLObject interaction_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject indexical_records = cdolist_list_var = sm_scenario_terms( v_scenario );
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      final SubLObject explicit_isas = sm_indexical_record_explicit_isas( indexical_record );
      final SubLObject explicit_genls = sm_indexical_record_explicit_genls( indexical_record );
      SubLObject isas = NIL;
      SubLObject v_genls = NIL;
      thread.resetMultipleValues();
      final SubLObject term_isas = sm_scenario_type_constraints_on_term( v_scenario, indexical, interaction_mt );
      final SubLObject term_genls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      isas = genls.min_cols( ConsesLow.list( term_isas, explicit_isas ), interaction_mt, UNPROVIDED );
      v_genls = genls.min_cols( ConsesLow.list( term_genls, explicit_genls ), interaction_mt, UNPROVIDED );
      sm_set_indexical_record_isas( indexical_record, isas );
      sm_set_indexical_record_genls( indexical_record, v_genls );
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 70634L)
  public static SubLObject sm_scenario_type_constraints_on_term(final SubLObject v_scenario, final SubLObject v_term, final SubLObject interaction_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraint_sentences = Mapping.mapcar( Symbols.symbol_function( $sym143$SM_CONSTRAINT_RECORD_SENTENCE ), sm_scenario_constraints( v_scenario ) );
    SubLObject isas = NIL;
    SubLObject v_genls = NIL;
    final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$accumulating_at_violationsP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject relation_isas = sm_term_requires_types_in_relations( v_term, constraint_sentences, interaction_mt );
      final SubLObject relation_genls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      isas = relation_isas;
      v_genls = relation_genls;
    }
    finally
    {
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( isas, v_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 71242L)
  public static SubLObject sm_act_remove_constraint(final SubLObject v_scenario, final SubLObject constraint_record, final SubLObject domain_interaction_mt)
  {
    sm_rem_scenario_constraint( v_scenario, constraint_record );
    sm_compute_current_indexical_isas_genls( v_scenario, domain_interaction_mt );
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 71874L)
  public static SubLObject sm_act_remove_all_constraints(final SubLObject v_scenario, final SubLObject domain_interaction_mt)
  {
    return sm_act_remove_many_constraints( v_scenario, sm_scenario_constraints( v_scenario ), domain_interaction_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 72177L)
  public static SubLObject sm_act_remove_many_constraints(final SubLObject v_scenario, final SubLObject constraints, final SubLObject domain_interaction_mt)
  {
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_rem_scenario_constraint( v_scenario, constraint_record );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    sm_compute_current_indexical_isas_genls( v_scenario, domain_interaction_mt );
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 72522L)
  public static SubLObject sm_act_import_constraint(final SubLObject v_scenario, final SubLObject constraint, final SubLObject domain_interaction_mt)
  {
    sm_add_scenario_constraint( v_scenario, constraint );
    sm_add_object( sm_constraint_record_id( constraint ), constraint );
    sm_compute_current_indexical_isas_genls( v_scenario, domain_interaction_mt );
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73083L)
  public static SubLObject sm_act_gather_constraint_formulas(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_gather_constraint_formulas_memoized( v_scenario );
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73397L)
  public static SubLObject sm_act_gather_constraint_formulas_memoized_internal(final SubLObject v_scenario)
  {
    final SubLObject indexicals = Mapping.mapcar( $sym105$SM_INDEXICAL_RECORD_INDEXICAL, sm_scenario_terms( v_scenario ) );
    SubLObject formulas = NIL;
    SubLObject cdolist_list_var = sm_scenario_constraints( v_scenario );
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject formula = conses_high.copy_tree( sm_constraint_record_sentence( constraint_record ) );
      SubLObject cdolist_list_var_$9 = indexicals;
      SubLObject indexical = NIL;
      indexical = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        conses_high.nsubst( $kw121$INDEXICAL, indexical, formula, UNPROVIDED, UNPROVIDED );
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        indexical = cdolist_list_var_$9.first();
      }
      formulas = ConsesLow.cons( formula, formulas );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return formulas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73397L)
  public static SubLObject sm_act_gather_constraint_formulas_memoized(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_gather_constraint_formulas_memoized_internal( v_scenario );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_gather_constraint_formulas_memoized_internal( v_scenario ) ) );
      memoization_state.caching_state_put( caching_state, v_scenario, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 73894L)
  public static SubLObject sm_act_modify_phrase(final SubLObject v_scenario, final SubLObject new_phrase)
  {
    sm_set_scenario_phrase( v_scenario, new_phrase );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 74232L)
  public static SubLObject sm_act_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_records, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    assert NIL != sm_constraint_record_p( constraint_record ) : constraint_record;
    final SubLObject nl_sentence = sm_constraint_record_nl_sentence( constraint_record );
    if( NIL != nl_sentence )
    {
      return nl_sentence;
    }
    final SubLObject indexical_table = sm_act_construct_indexical_table_from_indexical_records( indexical_records );
    return sm_compute_one_constraint_record_nl_sentence( constraint_record, indexical_table, domain_mt, generation_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 75245L)
  public static SubLObject sm_compute_one_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_table, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cycl_sentence = sm_constraint_record_sentence( constraint_record );
    SubLObject nl_sentence = NIL;
    enforceType( indexical_table, $sym257$ALIST_P );
    final SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding( thread );
    try
    {
      pph_vars.$pph_term_paraphrase_map$.bind( indexical_table, thread );
      nl_sentence = rkf_sentence_communicator.rkf_sentence_phrase( cycl_sentence, generation_mt, domain_mt, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_term_paraphrase_map$.rebind( _prev_bind_0, thread );
    }
    sm_set_constraint_record_nl_sentence( constraint_record, nl_sentence );
    return nl_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 75769L)
  public static SubLObject sm_compute_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_records, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cycl_sentence = sm_substitute_phrases_for_indexicals( sm_constraint_record_sentence( constraint_record ), indexical_records );
    final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
      pph_vars.$pph_language_mt$.bind( generation_mt, thread );
      sm_set_constraint_record_nl_sentence( constraint_record, pph_main.generate_text( cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      pph_vars.$pph_language_mt$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_0, thread );
    }
    return sm_constraint_record_nl_sentence( constraint_record );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 76353L)
  public static SubLObject sm_substitute_phrases_for_indexicals(SubLObject cycl_sentence, final SubLObject indexical_records)
  {
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      final SubLObject preferred_phrase = sm_indexical_record_preferred_phrase( indexical_record );
      cycl_sentence = cycl_utilities.expression_subst( preferred_phrase, indexical, cycl_sentence, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return cycl_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 76754L)
  public static SubLObject sm_act_merge_scenarios(final SubLObject to_scenario, final SubLObject from_scenario, final SubLObject indexical_equivalences)
  {
    assert NIL != sm_scenario_p( to_scenario ) : to_scenario;
    assert NIL != sm_scenario_p( from_scenario ) : from_scenario;
    assert NIL != Types.listp( indexical_equivalences ) : indexical_equivalences;
    SubLObject cdolist_list_var = sm_scenario_constraints( from_scenario );
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_sentence = el_utilities.copy_formula( sm_constraint_record_sentence( constraint_record ) );
      new_sentence = sm_merge_replace_non_equivalent_indexical( new_sentence, from_scenario, to_scenario, indexical_equivalences );
      new_sentence = sm_merge_substitute_indexical_equivalences_in_sentence( new_sentence, indexical_equivalences );
      final SubLObject new_constraint_record = sm_new_constraint_record( new_sentence );
      sm_add_scenario_constraint( to_scenario, new_constraint_record );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    cdolist_list_var = sm_scenario_terms( from_scenario );
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      if( NIL == subl_promotions.memberP( indexical, indexical_equivalences, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym258$SECOND ) ) && NIL == sm_indexical_of_scenarioP( indexical, to_scenario ) )
      {
        final SubLObject new_indexical_record = sm_copy_indexical_record_for_scenario( indexical_record, to_scenario );
        sm_add_scenario_term( to_scenario, new_indexical_record );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    sm_generate_indexical_phrases_for_scenario( to_scenario, UNPROVIDED );
    sm_scenario_clear_all_memoization_state( to_scenario );
    return to_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 79191L)
  public static SubLObject sm_merge_substitute_indexical_equivalences_in_sentence(final SubLObject sentence, final SubLObject indexical_equivalences)
  {
    SubLObject new_sentence = sentence;
    SubLObject cdolist_list_var = indexical_equivalences;
    SubLObject indexical_equivalence = NIL;
    indexical_equivalence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = indexical_equivalence;
      SubLObject new_indexical_record = NIL;
      SubLObject old_indexical_record = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list259 );
      new_indexical_record = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list259 );
      old_indexical_record = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject new_indexical = sm_indexical_record_indexical( new_indexical_record );
        final SubLObject old_indexical = sm_indexical_record_indexical( old_indexical_record );
        if( !new_indexical.equal( old_indexical ) )
        {
          new_sentence = cycl_utilities.expression_subst( new_indexical, old_indexical, new_sentence, UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list259 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_equivalence = cdolist_list_var.first();
    }
    return new_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 79816L)
  public static SubLObject sm_merge_replace_non_equivalent_indexical(final SubLObject sentence, final SubLObject from_scenario, final SubLObject to_scenario, final SubLObject indexical_equivalences)
  {
    SubLObject new_sentence = sentence;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw226$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sm_indexical_of_scenarioP( arg, to_scenario ) )
      {
        final SubLObject equivalence = conses_high.assoc( arg, indexical_equivalences, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym105$SM_INDEXICAL_RECORD_INDEXICAL ) );
        if( NIL == equivalence || !arg.equal( sm_indexical_record_indexical( conses_high.second( equivalence ) ) ) )
        {
          final SubLObject indexical_type = sm_indexical_type( arg );
          SubLObject number = sm_get_next_indexical_number_of_type( to_scenario, indexical_type );
          number = sm_ensure_new_indexical_number_of_type( from_scenario, indexical_type, number );
          final SubLObject new_indexical = sm_new_indexical( indexical_type, number );
          final SubLObject new_indexical_record = sm_new_indexical_record( new_indexical, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          sm_add_scenario_term( to_scenario, new_indexical_record );
          new_sentence = cycl_utilities.expression_subst( new_indexical, arg, new_sentence, UNPROVIDED, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return new_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 81469L)
  public static SubLObject sm_ensure_new_indexical_number_of_type(final SubLObject v_scenario, final SubLObject type, final SubLObject number)
  {
    final SubLObject next_number = sm_get_next_indexical_number_of_type( v_scenario, type );
    return Numbers.max( number, next_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 81662L)
  public static SubLObject sm_act_generalize_scenario(final SubLObject v_scenario, final SubLObject interaction_mt, final SubLObject generation_mt)
  {
    SubLObject gen_points = sm_act_compute_scenario_generalization_points( v_scenario, interaction_mt );
    gen_points = Sequences.remove_if( Symbols.symbol_function( $sym260$SM_GEN_POINT_WITHOUT_POSITIONS_P ), gen_points, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sm_act_generalize_scenario_with_gen_points( v_scenario, gen_points, interaction_mt, generation_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 82882L)
  public static SubLObject sm_act_generalize_scenario_with_gen_points(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject interaction_mt, final SubLObject generation_mt)
  {
    final SubLObject template_expr = sm_compute_template_expr_from_generalization_points( v_scenario, gen_points, interaction_mt );
    final SubLObject param_subs = sm_compute_template_param_subs_from_generalization_points( v_scenario, gen_points );
    final SubLObject parameter_indexical_records = Mapping.mapcar( Symbols.symbol_function( $sym197$SM_GEN_POINT_INDEXICAL_RECORD ), gen_points );
    final SubLObject template = sm_new_template( v_scenario );
    sm_set_template_expression( template, template_expr );
    sm_set_template_param_subs( template, param_subs );
    sm_set_template_parameters( template, parameter_indexical_records );
    sm_add_scenario_template( v_scenario, template );
    sm_set_template_phrase( template, sm_generate_text_from_template_expr( sm_template_expression( template ), sm_template_param_subs( template ) ) );
    sm_generate_indexical_phrases_for_scenario( v_scenario, template );
    sm_generalize_scenario_constraints( v_scenario, gen_points, template, interaction_mt, generation_mt );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 84044L)
  public static SubLObject sm_act_compute_scenario_generalization_points(final SubLObject v_scenario, final SubLObject interaction_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject non_indexicals = sm_non_indexicals_of_constraints( v_scenario );
    SubLObject generalization_points = NIL;
    final SubLObject scenario_tokens = rkf_concept_harvester.rkf_ch_string_tokenize( sm_scenario_phrase( v_scenario ) );
    SubLObject cdolist_list_var = non_indexicals;
    SubLObject non_indexical = NIL;
    non_indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gen_point = sm_new_gen_point( non_indexical );
      thread.resetMultipleValues();
      final SubLObject isas = sm_scenario_type_constraints_on_term( v_scenario, non_indexical, interaction_mt );
      final SubLObject v_genls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sm_add_gen_point_isas( gen_point, isas );
      sm_add_gen_point_genls( gen_point, v_genls );
      SubLObject cdolist_list_var_$10;
      final SubLObject phrases = cdolist_list_var_$10 = sm_all_phrases_for_term( non_indexical );
      SubLObject phrase = NIL;
      phrase = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        final SubLObject phrase_tokens = rkf_concept_harvester.rkf_ch_string_tokenize( phrase );
        final SubLObject phrase_length = Sequences.length( phrase_tokens );
        SubLObject cdolist_list_var_$11;
        final SubLObject starts = cdolist_list_var_$11 = string_utilities.search_all( phrase_tokens, scenario_tokens, Symbols.symbol_function( EQUALP ), UNPROVIDED );
        SubLObject start = NIL;
        start = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          sm_add_gen_point_position( gen_point, list_utilities.new_num_list( phrase_length, start ) );
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          start = cdolist_list_var_$11.first();
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        phrase = cdolist_list_var_$10.first();
      }
      generalization_points = ConsesLow.cons( gen_point, generalization_points );
      cdolist_list_var = cdolist_list_var.rest();
      non_indexical = cdolist_list_var.first();
    }
    return generalization_points;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 85276L)
  public static SubLObject sm_all_phrases_for_term(SubLObject v_term)
  {
    SubLObject result = NIL;
    if( NIL != term.nautP( v_term, UNPROVIDED ) )
    {
      v_term = narts_high.find_nart( v_term );
    }
    result = pph_methods_lexicon.all_phrases_for_term( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == result )
    {
      result = ConsesLow.list( pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 85595L)
  public static SubLObject sm_non_indexicals_of_constraints(final SubLObject v_scenario)
  {
    final SubLObject constraint_records = sm_scenario_constraints( v_scenario );
    SubLObject non_indexicals = NIL;
    SubLObject cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
      SubLObject cdolist_list_var_$12;
      final SubLObject args = cdolist_list_var_$12 = cycl_utilities.formula_args( sentence, $kw226$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var_$12.first();
      while ( NIL != cdolist_list_var_$12)
      {
        if( NIL == sm_indexical_p( arg ) )
        {
          final SubLObject item_var = arg;
          if( NIL == conses_high.member( item_var, non_indexicals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            non_indexicals = ConsesLow.cons( item_var, non_indexicals );
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
  public static SubLObject sm_gen_point_without_positions_p(final SubLObject gen_point)
  {
    return Types.sublisp_null( sm_gen_point_positions( gen_point ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 86380L)
  public static SubLObject sm_compute_template_expr_from_generalization_points(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject interaction_mt)
  {
    final SubLObject scenario_tokens = conses_high.copy_list( rkf_concept_harvester.rkf_ch_string_tokenize( sm_scenario_phrase( v_scenario ) ) );
    SubLObject result = NIL;
    SubLObject next = ZERO_INTEGER;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject gen_point;
    SubLObject sequence;
    SubLObject template_type;
    SubLObject keyword;
    SubLObject template_element;
    SubLObject token;
    for( cdotimes_end_var = Sequences.length( scenario_tokens ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( i.numGE( next ) )
      {
        gen_point = sm_gen_point_starting_at( i, gen_points );
        if( NIL != gen_point )
        {
          sequence = sm_best_gen_point_sequence( sm_gen_point_positions( gen_point ) );
          template_type = sm_template_type_for_gen_point( gen_point, interaction_mt );
          keyword = sm_grab_or_compute_gen_point_keyword( gen_point );
          template_element = ConsesLow.list( template_type, keyword );
          next = Numbers.add( ONE_INTEGER, conses_high.last( sequence, UNPROVIDED ).first() );
          result = ConsesLow.cons( template_element, result );
        }
        else
        {
          token = Sequences.elt( scenario_tokens, i );
          if( NIL != Sequences.find_if( Symbols.symbol_function( $sym261$PUNCTUATION_P ), token, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $const262$OptionalSome, token ), result );
          }
          else
          {
            result = ConsesLow.cons( token, result );
          }
        }
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 87730L)
  public static SubLObject sm_gen_point_starting_at(final SubLObject n, final SubLObject gen_points)
  {
    SubLObject cdolist_list_var = gen_points;
    SubLObject gen_point = NIL;
    gen_point = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( n, sm_gen_point_positions( gen_point ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym222$CAR ) ) )
      {
        return gen_point;
      }
      cdolist_list_var = cdolist_list_var.rest();
      gen_point = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 87928L)
  public static SubLObject sm_best_gen_point_sequence(final SubLObject positions)
  {
    SubLObject best = positions.first();
    SubLObject cdolist_list_var = positions.rest();
    SubLObject sequence = NIL;
    sequence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.subsetp( best, sequence, UNPROVIDED, UNPROVIDED ) )
      {
        best = sequence;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sequence = cdolist_list_var.first();
    }
    return best;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 88181L)
  public static SubLObject sm_template_type_for_gen_point(final SubLObject gen_point, final SubLObject mt)
  {
    final SubLObject non_indexical = sm_gen_point_non_indexical( gen_point );
    final SubLObject type = sm_best_gen_point_type( gen_point );
    if( non_indexical.isString() )
    {
      return $const263$StringTemplate;
    }
    if( non_indexical.isNumber() )
    {
      return $const264$NumberTemplate;
    }
    if( NIL != term.nautP( non_indexical, UNPROVIDED ) )
    {
      return sm_template_type_for_collection( type, mt );
    }
    if( NIL != forts.fort_p( non_indexical ) )
    {
      return sm_template_type_for_collection( type, mt );
    }
    return $const265$SinkTemplate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 88674L)
  public static SubLObject sm_template_type_for_collection(final SubLObject col, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym266$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      if( NIL != genls.genlP( col, $const267$PropositionalConceptualWork, UNPROVIDED, UNPROVIDED ) )
      {
        result = $const268$MovieTitleTemplate;
      }
      else if( NIL != genls.genlP( col, $const269$Event, UNPROVIDED, UNPROVIDED ) )
      {
        result = $const270$NPTemplate;
      }
      else if( NIL != genls.genlP( col, $const271$SomethingExisting, UNPROVIDED, UNPROVIDED ) )
      {
        result = $const270$NPTemplate;
      }
      else
      {
        result = $const265$SinkTemplate;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 89064L)
  public static SubLObject sm_compute_template_param_subs_from_generalization_points(final SubLObject v_scenario, final SubLObject gen_points)
  {
    SubLObject param_subs = NIL;
    SubLObject cdolist_list_var = gen_points;
    SubLObject gen_point = NIL;
    gen_point = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_set_gen_point_indexical_record( gen_point, sm_construct_gen_point_indexical_record( v_scenario, gen_point, gen_points ) );
      param_subs = ConsesLow.cons( ConsesLow.list( sm_gen_point_keyword( gen_point ), sm_gen_point_indexical_record( gen_point ) ), param_subs );
      cdolist_list_var = cdolist_list_var.rest();
      gen_point = cdolist_list_var.first();
    }
    return Sequences.nreverse( param_subs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 89574L)
  public static SubLObject sm_construct_gen_point_indexical_record(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject gen_points)
  {
    final SubLObject type = sm_best_gen_point_type( gen_point );
    final SubLObject isas = sm_gen_point_isas( gen_point );
    final SubLObject v_genls = sm_gen_point_genls( gen_point );
    final SubLObject number = Numbers.max( sm_get_next_indexical_number_of_type( v_scenario, type ), sm_get_next_gen_point_indexical_number_of_type( gen_points, type ) );
    final SubLObject indexical = sm_new_indexical( type, number );
    return sm_new_indexical_record( indexical, NIL, isas, v_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 90068L)
  public static SubLObject sm_get_next_gen_point_indexical_number_of_type(final SubLObject gen_points, final SubLObject type)
  {
    SubLObject number = ZERO_INTEGER;
    SubLObject cdolist_list_var = gen_points;
    SubLObject gen_point = NIL;
    gen_point = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical_record = sm_gen_point_indexical_record( gen_point );
      final SubLObject indexical = ( NIL != indexical_record ) ? sm_indexical_record_indexical( indexical_record ) : NIL;
      if( NIL != indexical && sm_indexical_type( indexical ).equal( type ) )
      {
        number = Numbers.max( number, sm_indexical_number( indexical ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gen_point = cdolist_list_var.first();
    }
    return Numbers.add( number, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 90567L)
  public static SubLObject sm_generalize_scenario_constraints(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    SubLObject cdolist_list_var = sm_scenario_constraints( v_scenario );
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_constraint_record = sm_new_constraint_record( UNPROVIDED );
      final SubLObject sentence = el_utilities.copy_formula( sm_constraint_record_sentence( constraint_record ) );
      sm_set_constraint_record_sentence( new_constraint_record, sentence );
      sm_add_template_constraint( template, new_constraint_record );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    cdolist_list_var = gen_points;
    SubLObject gen_point = NIL;
    gen_point = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sm_apply_gen_point_to_template_constraints( v_scenario, gen_point, template, domain_mt, generation_mt );
      cdolist_list_var = cdolist_list_var.rest();
      gen_point = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 91551L)
  public static SubLObject sm_apply_gen_point_to_template_constraints(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    final SubLObject non_indexical = sm_gen_point_non_indexical( gen_point );
    final SubLObject gen_point_ir = sm_gen_point_indexical_record( gen_point );
    final SubLObject indexical = sm_indexical_record_indexical( gen_point_ir );
    final SubLObject constraint_records = sm_template_constraints( template );
    final SubLObject indexical_records = ConsesLow.append( sm_scenario_terms( v_scenario ), sm_template_parameters( template ) );
    SubLObject cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
      cycl_utilities.expression_nsubst( indexical, non_indexical, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      sm_compute_constraint_record_nl_sentence( constraint_record, indexical_records, domain_mt, generation_mt );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 92332L)
  public static SubLObject sm_de_apply_gen_point_to_template_constraints(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    final SubLObject non_indexical = sm_gen_point_non_indexical( gen_point );
    final SubLObject gen_point_ir = sm_gen_point_indexical_record( gen_point );
    final SubLObject indexical = sm_indexical_record_indexical( gen_point_ir );
    final SubLObject constraint_records = sm_template_constraints( template );
    final SubLObject indexical_records = ConsesLow.append( sm_scenario_terms( v_scenario ), sm_template_parameters( template ) );
    SubLObject cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      _csetf_sm_constraint_record_nl_sentence( constraint_record, NIL );
      final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
      cycl_utilities.expression_nsubst( non_indexical, indexical, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      sm_compute_constraint_record_nl_sentence( constraint_record, indexical_records, domain_mt, generation_mt );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 93187L)
  public static SubLObject sm_generate_text_from_template_expr(final SubLObject template_expr, final SubLObject substitutions)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = template_expr;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( sm_generate_text_from_template_element( element, substitutions ), result );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    result = string_utilities.bunge( Sequences.nreverse( result ), UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 93798L)
  public static SubLObject sm_generate_text_from_template_element(final SubLObject element, final SubLObject substitutions)
  {
    if( element.isString() )
    {
      return element;
    }
    if( !element.isCons() )
    {
      return NIL;
    }
    if( element.first().eql( $const272$RequireOne ) )
    {
      return sm_generate_text_from_template_element( conses_high.second( element ), substitutions );
    }
    if( element.first().eql( $const273$OptionalOne ) )
    {
      return NIL;
    }
    if( NIL != genls.genlP( element.first(), $const274$ParsingTemplateCategory, $const275$TemplateParsingMt, UNPROVIDED ) )
    {
      return sm_generate_blank_for_template_element( conses_high.second( element ), substitutions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 94383L)
  public static SubLObject sm_generate_blank_for_template_element(final SubLObject keyword, final SubLObject substitutions)
  {
    final SubLObject indexical_record = conses_high.second( conses_high.assoc( keyword, substitutions, UNPROVIDED, UNPROVIDED ) );
    final SubLObject type = sm_indexical_record_explicit_isas( indexical_record ).first();
    final SubLObject phrase = pph_main.generate_phrase( type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Sequences.cconcatenate( $str276$_, new SubLObject[] { phrase, $str277$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 94699L)
  public static SubLObject sm_act_save_scenario(final SubLObject v_scenario, final SubLObject template, final SubLObject storage_mt, final SubLObject parsing_mt)
  {
    final SubLObject constant = rkf_term_utilities.rkf_scenario_create( $str278$Scenario );
    rkf_assertion_utilities.rkf_scenario_assert( ConsesLow.listS( $const235$isa, constant, $list279 ), storage_mt );
    rkf_assertion_utilities.rkf_scenario_assert( ConsesLow.listS( $const280$quotedIsa, constant, $list281 ), storage_mt );
    sm_set_scenario_fort( v_scenario, constant );
    sm_save_scenario_terms_and_referents( v_scenario, template, storage_mt );
    sm_save_template_constraints( v_scenario, template, storage_mt );
    sm_save_scenario_term_template( v_scenario, template, parsing_mt );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 95675L)
  public static SubLObject sm_save_scenario_terms_and_referents(final SubLObject v_scenario, final SubLObject template, final SubLObject mt)
  {
    final SubLObject fort = sm_scenario_fort( v_scenario );
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    final SubLObject parameters = sm_template_parameters( template );
    sm_save_scenario_terms_and_referents_int( fort, indexical_records, mt );
    sm_save_scenario_terms_and_referents_int( fort, parameters, mt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 96068L)
  public static SubLObject sm_save_scenario_terms_and_referents_int(final SubLObject fort, final SubLObject indexical_records, final SubLObject mt)
  {
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      final SubLObject phrases = sm_indexical_record_phrases( indexical_record );
      rkf_assertion_utilities.rkf_scenario_assert( ConsesLow.list( $const223$scenarioTerms, fort, indexical ), mt );
      SubLObject cdolist_list_var_$13 = phrases;
      SubLObject phrase = NIL;
      phrase = cdolist_list_var_$13.first();
      while ( NIL != cdolist_list_var_$13)
      {
        rkf_assertion_utilities.rkf_scenario_assert( ConsesLow.list( $const224$scenarioReferent, fort, indexical, phrase ), mt );
        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
        phrase = cdolist_list_var_$13.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 96525L)
  public static SubLObject sm_save_template_constraints(final SubLObject v_scenario, final SubLObject template, final SubLObject mt)
  {
    final SubLObject fort = sm_scenario_fort( v_scenario );
    SubLObject cdolist_list_var;
    final SubLObject constraint_records = cdolist_list_var = sm_template_constraints( template );
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
      rkf_assertion_utilities.rkf_scenario_assert( ConsesLow.list( $const225$scenarioConstraint, fort, sentence ), mt );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 96906L)
  public static SubLObject sm_save_scenario_term_template(final SubLObject v_scenario, final SubLObject template, final SubLObject parsing_mt)
  {
    final SubLObject fort = sm_scenario_fort( v_scenario );
    final SubLObject template_expr = sm_template_expression( template );
    final SubLObject param_subs = sm_template_param_subs( template );
    final SubLObject keywords = el_utilities.make_el_list( Mapping.mapcar( Symbols.symbol_function( $sym282$FIRST ), param_subs ), UNPROVIDED );
    final SubLObject indexical_formulas = el_utilities.make_el_list( Mapping.mapcar( Symbols.symbol_function( $sym283$NART_EL_FORMULA ), Mapping.mapcar( Symbols.symbol_function( $sym105$SM_INDEXICAL_RECORD_INDEXICAL ),
        Mapping.mapcar( Symbols.symbol_function( $sym258$SECOND ), param_subs ) ) ), UNPROVIDED );
    rkf_assertion_utilities.rkf_scenario_assert( ConsesLow.list( $const230$termTemplate, $const231$ScenarioTemplate, template_expr, ConsesLow.list( $const93$ScenarioInstanceFn, fort, keywords, indexical_formulas ) ),
        parsing_mt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 97510L)
  public static SubLObject sm_act_enumerate_saved_scenarios(final SubLObject storage_mt, final SubLObject parsing_mt)
  {
    final SubLObject scenarios = ask_utilities.ask_variable( $kw86$SCENARIO, $list284, storage_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject v_bindings = fi.fi_ask_int( $list285, parsing_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = scenarios;
    SubLObject v_scenario = NIL;
    v_scenario = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject binding = sm_enumerate_scenarios_identify_term_template( v_scenario, v_bindings );
      if( NIL != binding )
      {
        final SubLObject template_expr = conses_high.assoc( $sym232$_EXPR, binding, UNPROVIDED, UNPROVIDED ).rest();
        final SubLObject unpacked = sm_enumerate_scenarios_unpack_template_expression( template_expr );
        tuples = ConsesLow.cons( ConsesLow.list( v_scenario, unpacked ), tuples );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_scenario = cdolist_list_var.first();
    }
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 98486L)
  public static SubLObject sm_enumerate_scenarios_identify_term_template(final SubLObject v_scenario, final SubLObject v_bindings)
  {
    SubLObject found = NIL;
    if( NIL == found )
    {
      SubLObject csome_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == found && NIL != csome_list_var)
      {
        if( NIL != list_utilities.tree_find( v_scenario, binding, UNPROVIDED, UNPROVIDED ) )
        {
          found = binding;
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 98714L)
  public static SubLObject sm_enumerate_scenarios_unpack_template_expression(final SubLObject template_expression)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = template_expression;
    SubLObject part = NIL;
    part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( part.isString() )
      {
        if( NIL != result )
        {
          result = ConsesLow.cons( $str218$_, result );
        }
        result = ConsesLow.cons( part, result );
      }
      else if( NIL != el_utilities.el_formula_p( part ) && cycl_utilities.formula_arg0( part ).eql( $const262$OptionalSome ) )
      {
        result = ConsesLow.cons( cycl_utilities.formula_arg1( part, UNPROVIDED ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      part = cdolist_list_var.first();
    }
    return Functions.apply( Symbols.symbol_function( $sym286$CCONCATENATE ), Sequences.nreverse( result ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 99182L)
  public static SubLObject sm_act_discard_template(final SubLObject v_scenario, final SubLObject template)
  {
    sm_rem_scenario_template( v_scenario, template );
    sm_cleanup_template( template );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 99550L)
  public static SubLObject sm_act_compute_unused_indexicals(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_compute_unused_indexicals_memoized( v_scenario );
      }
      finally
      {
        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 100081L)
  public static SubLObject sm_act_compute_unused_indexicals_memoized_internal(final SubLObject v_scenario)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    final SubLObject constraint_records = sm_scenario_constraints( v_scenario );
    SubLObject unused_indexicals = NIL;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      SubLObject found = NIL;
      if( NIL == found )
      {
        SubLObject csome_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = csome_list_var.first();
        while ( NIL == found && NIL != csome_list_var)
        {
          final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
          if( NIL != cycl_utilities.expression_find( indexical, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            found = T;
          }
          csome_list_var = csome_list_var.rest();
          constraint_record = csome_list_var.first();
        }
      }
      if( NIL == found )
      {
        unused_indexicals = ConsesLow.cons( indexical_record, unused_indexicals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return Sequences.nreverse( unused_indexicals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 100081L)
  public static SubLObject sm_act_compute_unused_indexicals_memoized(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_compute_unused_indexicals_memoized_internal( v_scenario );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_compute_unused_indexicals_memoized_internal( v_scenario ) ) );
      memoization_state.caching_state_put( caching_state, v_scenario, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 100759L)
  public static SubLObject sm_act_compute_explicit_type_constraints(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_compute_explicit_type_constraints_memoized( indexical_record );
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101023L)
  public static SubLObject sm_act_compute_explicit_type_constraints_memoized_internal(final SubLObject indexical_record)
  {
    final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
    SubLObject sentences = NIL;
    SubLObject cdolist_list_var = sm_indexical_record_explicit_isas( indexical_record );
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = el_utilities.make_binary_formula( $const235$isa, indexical, v_isa );
      sentences = ConsesLow.cons( sentence, sentences );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    cdolist_list_var = sm_indexical_record_explicit_genls( indexical_record );
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = el_utilities.make_binary_formula( $const254$genls, indexical, genl );
      sentences = ConsesLow.cons( sentence, sentences );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return Sequences.nreverse( sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101023L)
  public static SubLObject sm_act_compute_explicit_type_constraints_memoized(final SubLObject indexical_record)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_compute_explicit_type_constraints_memoized_internal( indexical_record );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, ONE_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical_record, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_compute_explicit_type_constraints_memoized_internal( indexical_record ) ) );
      memoization_state.caching_state_put( caching_state, indexical_record, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101610L)
  public static SubLObject sm_act_compute_indexical_constraints(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_compute_indexical_constraints_memoized( v_scenario, indexical_record );
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101898L)
  public static SubLObject sm_act_compute_indexical_constraints_memoized_internal(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    final SubLObject constraint_records = sm_scenario_constraints( v_scenario );
    final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
    SubLObject mentioned = NIL;
    SubLObject cdolist_list_var = constraint_records;
    SubLObject constraint_record = NIL;
    constraint_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentence = sm_constraint_record_sentence( constraint_record );
      if( NIL != cycl_utilities.expression_find( indexical, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        mentioned = ConsesLow.cons( constraint_record, mentioned );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_record = cdolist_list_var.first();
    }
    return Sequences.nreverse( mentioned );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 101898L)
  public static SubLObject sm_act_compute_indexical_constraints_memoized(final SubLObject v_scenario, final SubLObject indexical_record)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_compute_indexical_constraints_memoized_internal( v_scenario, indexical_record );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_scenario, indexical_record );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_scenario.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && indexical_record.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_compute_indexical_constraints_memoized_internal( v_scenario, indexical_record ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_scenario, indexical_record ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 102426L)
  public static SubLObject sm_act_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var)
  {
    return sm_set_indexical_record_var( indexical_record, var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 102845L)
  public static SubLObject sm_act_add_explicit_constraints(final SubLObject v_scenario, final SubLObject domain_mt, final SubLObject generation_mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject indexical_records = cdolist_list_var = sm_scenario_terms( v_scenario );
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      final SubLObject isas = sm_indexical_record_isas( indexical_record );
      final SubLObject v_genls = sm_indexical_record_genls( indexical_record );
      SubLObject sentences = NIL;
      SubLObject cdolist_list_var_$17 = isas;
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var_$17.first();
      while ( NIL != cdolist_list_var_$17)
      {
        final SubLObject sentence = el_utilities.make_binary_formula( $const235$isa, indexical, v_isa );
        sentences = ConsesLow.cons( sentence, sentences );
        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
        v_isa = cdolist_list_var_$17.first();
      }
      SubLObject cdolist_list_var_$18 = v_genls;
      SubLObject genl = NIL;
      genl = cdolist_list_var_$18.first();
      while ( NIL != cdolist_list_var_$18)
      {
        final SubLObject sentence = el_utilities.make_binary_formula( $const254$genls, indexical, genl );
        sentences = ConsesLow.cons( sentence, sentences );
        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
        genl = cdolist_list_var_$18.first();
      }
      SubLObject cdolist_list_var_$19 = sentences;
      SubLObject sentence2 = NIL;
      sentence2 = cdolist_list_var_$19.first();
      while ( NIL != cdolist_list_var_$19)
      {
        if( NIL == sm_redundant_constraintP( v_scenario, sentence2 ) )
        {
          final SubLObject constraint_record = sm_new_constraint_record( UNPROVIDED );
          sm_set_constraint_record_sentence( constraint_record, sentence2 );
          final SubLObject nl_sentence = sm_act_constraint_record_nl_sentence( constraint_record, indexical_records, domain_mt, generation_mt );
          sm_set_constraint_record_nl_sentence( constraint_record, nl_sentence );
          sm_add_scenario_constraint( v_scenario, constraint_record );
        }
        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
        sentence2 = cdolist_list_var_$19.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    sm_scenario_clear_all_memoization_state( v_scenario );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 104134L)
  public static SubLObject sm_redundant_constraintP(final SubLObject v_scenario, final SubLObject sentence)
  {
    final SubLObject constraint_records = sm_scenario_constraints( v_scenario );
    return conses_high.member( sentence, constraint_records, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym143$SM_CONSTRAINT_RECORD_SENTENCE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 104440L)
  public static SubLObject sm_act_propose_sentence_adjustments(final SubLObject v_scenario, final SubLObject cycl_sentence, final SubLObject domain_mt)
  {
    if( NIL != el_utilities.gafP( cycl_sentence ) )
    {
      return sm_propose_gaf_sentence_adjustments( v_scenario, cycl_sentence, domain_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 104958L)
  public static SubLObject sm_propose_gaf_sentence_adjustments(final SubLObject v_scenario, final SubLObject cycl_sentence, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject arg_choices = NIL;
    SubLObject argnum = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( cycl_sentence, $kw226$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      argnum = Numbers.add( argnum, ONE_INTEGER );
      thread.resetMultipleValues();
      final SubLObject relation_isas = at_utilities.term_position_requires_types_in_relation( ConsesLow.cons( argnum, NIL ), cycl_sentence, domain_mt );
      final SubLObject relation_genls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject argnum_choices = ConsesLow.list( arg );
      SubLObject cdolist_list_var_$20 = indexical_records;
      SubLObject indexical_record = NIL;
      indexical_record = cdolist_list_var_$20.first();
      while ( NIL != cdolist_list_var_$20)
      {
        final SubLObject isas = list_utilities.flatten( sm_indexical_record_isas( indexical_record ) );
        final SubLObject v_genls = list_utilities.flatten( sm_indexical_record_genls( indexical_record ) );
        if( NIL == sm_identify_violating_collection_pair( isas, relation_isas, domain_mt ) && NIL == sm_identify_violating_collection_pair( v_genls, relation_genls, domain_mt ) )
        {
          final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
          argnum_choices = ConsesLow.cons( indexical, argnum_choices );
        }
        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
        indexical_record = cdolist_list_var_$20.first();
      }
      arg_choices = ConsesLow.cons( ConsesLow.cons( argnum, argnum_choices ), arg_choices );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return arg_choices;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 106129L)
  public static SubLObject sm_act_construct_indexical_table(final SubLObject v_scenario)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    return sm_act_construct_indexical_table_from_indexical_records( indexical_records );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 106526L)
  public static SubLObject sm_act_construct_indexical_table_from_indexical_records(final SubLObject indexical_records)
  {
    SubLObject table = NIL;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      SubLObject cdolist_list_var_$21;
      final SubLObject phrases = cdolist_list_var_$21 = sm_indexical_record_phrases( indexical_record );
      SubLObject phrase = NIL;
      phrase = cdolist_list_var_$21.first();
      while ( NIL != cdolist_list_var_$21)
      {
        table = ConsesLow.cons( ConsesLow.cons( indexical, phrase ), table );
        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
        phrase = cdolist_list_var_$21.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 106930L)
  public static SubLObject sm_act_construct_indexical_constraint_table(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject local_state;
    final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state( v_scenario );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        results = sm_act_construct_indexical_constraint_table_memoized( v_scenario );
      }
      finally
      {
        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 107477L)
  public static SubLObject sm_act_construct_indexical_constraint_table_memoized_internal(final SubLObject v_scenario)
  {
    final SubLObject indexical_records = sm_scenario_terms( v_scenario );
    SubLObject table = NIL;
    SubLObject cdolist_list_var = indexical_records;
    SubLObject indexical_record = NIL;
    indexical_record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = sm_indexical_record_indexical( indexical_record );
      final SubLObject isas = sm_indexical_record_isas( indexical_record );
      final SubLObject v_genls = sm_indexical_record_genls( indexical_record );
      table = ConsesLow.cons( ConsesLow.list( indexical, isas, v_genls ), table );
      cdolist_list_var = cdolist_list_var.rest();
      indexical_record = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-scenario-manipulator.lisp", position = 107477L)
  public static SubLObject sm_act_construct_indexical_constraint_table_memoized(final SubLObject v_scenario)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sm_act_construct_indexical_constraint_table_memoized_internal( v_scenario );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, ONE_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sm_act_construct_indexical_constraint_table_memoized_internal( v_scenario ) ) );
      memoization_state.caching_state_put( caching_state, v_scenario, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_rkf_scenario_manipulator_file()
  {
    SubLFiles.declareMacro( me, "with_sm_lock", "WITH-SM-LOCK" );
    SubLFiles.declareFunction( me, "sm_find_scenario_by_id", "SM-FIND-SCENARIO-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_scenario_by_id_string", "SM-FIND-SCENARIO-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_template_by_id", "SM-FIND-TEMPLATE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_template_by_id_string", "SM-FIND-TEMPLATE-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_indexical_record_by_id", "SM-FIND-INDEXICAL-RECORD-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_indexical_record_by_id_string", "SM-FIND-INDEXICAL-RECORD-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_constraint_record_by_id", "SM-FIND-CONSTRAINT-RECORD-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_constraint_record_by_id_string", "SM-FIND-CONSTRAINT-RECORD-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_merge_info_by_id", "SM-FIND-MERGE-INFO-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_merge_info_by_id_string", "SM-FIND-MERGE-INFO-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "next_sm_id", "NEXT-SM-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "sm_add_object", "SM-ADD-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_object", "SM-REM-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_find_object_by_id", "SM-FIND-OBJECT-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_print_function_trampoline", "SM-SCENARIO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_p", "SM-SCENARIO-P", 1, 0, false );
    new $sm_scenario_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sm_scenario_id", "SM-SCENARIO-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_sessions", "SM-SCENARIO-SESSIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_phrase", "SM-SCENARIO-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_candidate_terms", "SM-SCENARIO-CANDIDATE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_candidate_constraints", "SM-SCENARIO-CANDIDATE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_fort", "SM-SCENARIO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_terms", "SM-SCENARIO-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_constraints", "SM-SCENARIO-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_templates", "SM-SCENARIO-TEMPLATES", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_state", "SM-SCENARIO-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_id", "_CSETF-SM-SCENARIO-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_sessions", "_CSETF-SM-SCENARIO-SESSIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_phrase", "_CSETF-SM-SCENARIO-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_candidate_terms", "_CSETF-SM-SCENARIO-CANDIDATE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_candidate_constraints", "_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_fort", "_CSETF-SM-SCENARIO-FORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_terms", "_CSETF-SM-SCENARIO-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_constraints", "_CSETF-SM-SCENARIO-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_templates", "_CSETF-SM-SCENARIO-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_scenario_state", "_CSETF-SM-SCENARIO-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sm_scenario", "MAKE-SM-SCENARIO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sm_scenario", "VISIT-DEFSTRUCT-SM-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sm_scenario_method", "VISIT-DEFSTRUCT-OBJECT-SM-SCENARIO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_new_scenario", "SM-NEW-SCENARIO", 0, 3, false );
    SubLFiles.declareFunction( me, "sm_set_scenario_phrase", "SM-SET-SCENARIO-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_scenario_fort", "SM-SET-SCENARIO-FORT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_candidate_terms", "SM-ADD-SCENARIO-CANDIDATE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_candidate_term", "SM-ADD-SCENARIO-CANDIDATE-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_scenario_candidate_term", "SM-REM-SCENARIO-CANDIDATE-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_candidate_constraints", "SM-ADD-SCENARIO-CANDIDATE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_candidate_constraint", "SM-ADD-SCENARIO-CANDIDATE-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_scenario_candidate_constraint", "SM-REM-SCENARIO-CANDIDATE-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_term", "SM-ADD-SCENARIO-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_scenario_term", "SM-REM-SCENARIO-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_constraint", "SM-ADD-SCENARIO-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_scenario_constraint", "SM-REM-SCENARIO-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_scenario_template", "SM-ADD-SCENARIO-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_scenario_template", "SM-REM-SCENARIO-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_cleanup_scenario", "SM-CLEANUP-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_note_borrowed_indexical", "SM-SCENARIO-NOTE-BORROWED-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_borrowed_indexical_p", "SM-SCENARIO-BORROWED-INDEXICAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_return_borrowed_indexical", "SM-SCENARIO-RETURN-BORROWED-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_memoization_state", "SM-SCENARIO-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_clear_all_memoization_state", "SM-SCENARIO-CLEAR-ALL-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_scenario_memoization_state", "WITH-SCENARIO-MEMOIZATION-STATE" );
    SubLFiles.declareFunction( me, "sm_template_print_function_trampoline", "SM-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_template_p", "SM-TEMPLATE-P", 1, 0, false );
    new $sm_template_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sm_template_id", "SM-TEMPLATE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_scenario", "SM-TEMPLATE-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_phrase", "SM-TEMPLATE-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_expression", "SM-TEMPLATE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_param_subs", "SM-TEMPLATE-PARAM-SUBS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_parameters", "SM-TEMPLATE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_constraints", "SM-TEMPLATE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_state", "SM-TEMPLATE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_id", "_CSETF-SM-TEMPLATE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_scenario", "_CSETF-SM-TEMPLATE-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_phrase", "_CSETF-SM-TEMPLATE-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_expression", "_CSETF-SM-TEMPLATE-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_param_subs", "_CSETF-SM-TEMPLATE-PARAM-SUBS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_parameters", "_CSETF-SM-TEMPLATE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_constraints", "_CSETF-SM-TEMPLATE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_template_state", "_CSETF-SM-TEMPLATE-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sm_template", "MAKE-SM-TEMPLATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sm_template", "VISIT-DEFSTRUCT-SM-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sm_template_method", "VISIT-DEFSTRUCT-OBJECT-SM-TEMPLATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_new_template", "SM-NEW-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_set_template_expression", "SM-SET-TEMPLATE-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_template_param_subs", "SM-SET-TEMPLATE-PARAM-SUBS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_template_parameters", "SM-SET-TEMPLATE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_template_phrase", "SM-SET-TEMPLATE-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_template_constraint", "SM-ADD-TEMPLATE-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_cleanup_template", "SM-CLEANUP-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_spec_p", "SM-SCENARIO-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_new_scenario_spec", "SM-NEW-SCENARIO-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_spec_fort", "SM-SCENARIO-SPEC-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_spec_substitutions", "SM-SCENARIO-SPEC-SUBSTITUTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_substitution_list_p", "SM-SUBSTITUTION-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_substitution_p", "SM-SUBSTITUTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_get_standin_for_indexical", "SM-GET-STANDIN-FOR-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_expression_p", "SM-SCENARIO-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_expression_fort", "SM-SCENARIO-EXPRESSION-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_expression_cyc_terms", "SM-SCENARIO-EXPRESSION-CYC-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_expression_indexical_nauts", "SM-SCENARIO-EXPRESSION-INDEXICAL-NAUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_print_function_trampoline", "SM-INDEXICAL-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_p", "SM-INDEXICAL-RECORD-P", 1, 0, false );
    new $sm_indexical_record_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sm_indexical_record_id", "SM-INDEXICAL-RECORD-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_indexical", "SM-INDEXICAL-RECORD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_phrases", "SM-INDEXICAL-RECORD-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_var", "SM-INDEXICAL-RECORD-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_explicit_isas", "SM-INDEXICAL-RECORD-EXPLICIT-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_explicit_genls", "SM-INDEXICAL-RECORD-EXPLICIT-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_isas", "SM-INDEXICAL-RECORD-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_genls", "SM-INDEXICAL-RECORD-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_state", "SM-INDEXICAL-RECORD-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_id", "_CSETF-SM-INDEXICAL-RECORD-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_indexical", "_CSETF-SM-INDEXICAL-RECORD-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_phrases", "_CSETF-SM-INDEXICAL-RECORD-PHRASES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_var", "_CSETF-SM-INDEXICAL-RECORD-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_explicit_isas", "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_explicit_genls", "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_isas", "_CSETF-SM-INDEXICAL-RECORD-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_genls", "_CSETF-SM-INDEXICAL-RECORD-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_indexical_record_state", "_CSETF-SM-INDEXICAL-RECORD-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sm_indexical_record", "MAKE-SM-INDEXICAL-RECORD", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sm_indexical_record", "VISIT-DEFSTRUCT-SM-INDEXICAL-RECORD", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sm_indexical_record_method", "VISIT-DEFSTRUCT-OBJECT-SM-INDEXICAL-RECORD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_new_indexical_record", "SM-NEW-INDEXICAL-RECORD", 0, 4, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_indexical", "SM-SET-INDEXICAL-RECORD-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_phrases", "SM-SET-INDEXICAL-RECORD-PHRASES", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_indexical_phrase", "SM-ADD-INDEXICAL-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_indexical_phrase", "SM-REM-INDEXICAL-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_var", "SM-SET-INDEXICAL-RECORD-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_explicit_isas", "SM-SET-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_explicit_genls", "SM-SET-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_isas", "SM-SET-INDEXICAL-RECORD-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_indexical_record_genls", "SM-SET-INDEXICAL-RECORD-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_cleanup_indexical_record", "SM-CLEANUP-INDEXICAL-RECORD", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_preferred_phrase", "SM-INDEXICAL-RECORD-PREFERRED-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_copy_indexical_record_for_scenario", "SM-COPY-INDEXICAL-RECORD-FOR-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_type", "SM-INDEXICAL-RECORD-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_number", "SM-INDEXICAL-RECORD-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_update_indexical_record_explicit_isas", "SM-UPDATE-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_update_indexical_record_explicit_genls", "SM-UPDATE-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_p", "SM-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_new_indexical", "SM-NEW-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_type", "SM-INDEXICAL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_number", "SM-INDEXICAL-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_of_scenarioP", "SM-INDEXICAL-OF-SCENARIO?", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_of_indexical", "SM-INDEXICAL-RECORD-OF-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_constraint_record_print_function_trampoline", "SM-CONSTRAINT-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_constraint_record_p", "SM-CONSTRAINT-RECORD-P", 1, 0, false );
    new $sm_constraint_record_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sm_constraint_record_id", "SM-CONSTRAINT-RECORD-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_constraint_record_sentence", "SM-CONSTRAINT-RECORD-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_constraint_record_nl_sentence", "SM-CONSTRAINT-RECORD-NL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_constraint_record_id", "_CSETF-SM-CONSTRAINT-RECORD-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_constraint_record_sentence", "_CSETF-SM-CONSTRAINT-RECORD-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_constraint_record_nl_sentence", "_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sm_constraint_record", "MAKE-SM-CONSTRAINT-RECORD", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sm_constraint_record", "VISIT-DEFSTRUCT-SM-CONSTRAINT-RECORD", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sm_constraint_record_method", "VISIT-DEFSTRUCT-OBJECT-SM-CONSTRAINT-RECORD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_new_constraint_record", "SM-NEW-CONSTRAINT-RECORD", 0, 1, false );
    SubLFiles.declareFunction( me, "sm_set_constraint_record_sentence", "SM-SET-CONSTRAINT-RECORD-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_constraint_record_nl_sentence", "SM-SET-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_rem_constraint_record_nl_sentence", "SM-REM-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_cleanup_constraint_record", "SM-CLEANUP-CONSTRAINT-RECORD", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_term_p", "SM-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_print_function_trampoline", "SM-MERGE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_p", "SM-MERGE-INFO-P", 1, 0, false );
    new $sm_merge_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sm_merge_info_id", "SM-MERGE-INFO-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_from_scenario", "SM-MERGE-INFO-FROM-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_to_scenario", "SM-MERGE-INFO-TO-SCENARIO", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_align_to", "SM-MERGE-INFO-ALIGN-TO", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_align_from", "SM-MERGE-INFO-ALIGN-FROM", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_info_indexical_equivalences", "SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_merge_info_id", "_CSETF-SM-MERGE-INFO-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_merge_info_from_scenario", "_CSETF-SM-MERGE-INFO-FROM-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_merge_info_to_scenario", "_CSETF-SM-MERGE-INFO-TO-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_merge_info_align_to", "_CSETF-SM-MERGE-INFO-ALIGN-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_merge_info_align_from", "_CSETF-SM-MERGE-INFO-ALIGN-FROM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_merge_info_indexical_equivalences", "_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sm_merge_info", "MAKE-SM-MERGE-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sm_merge_info", "VISIT-DEFSTRUCT-SM-MERGE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sm_merge_info_method", "VISIT-DEFSTRUCT-OBJECT-SM-MERGE-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_new_merge_info", "SM-NEW-MERGE-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "sm_cleanup_merge_info", "SM-CLEANUP-MERGE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_set_merge_info_from_scenario", "SM-SET-MERGE-INFO-FROM-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_merge_info_to_scenario", "SM-SET-MERGE-INFO-TO-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_merge_info_align_to", "SM-SET-MERGE-INFO-ALIGN-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_merge_info_align_from", "SM-SET-MERGE-INFO-ALIGN-FROM", 2, 0, false );
    SubLFiles.declareFunction( me, "update_sm_merge_info_indexical_equivalences", "UPDATE-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_print_function_trampoline", "SM-GEN-POINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_p", "SM-GEN-POINT-P", 1, 0, false );
    new $sm_gen_point_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sm_gen_point_id", "SM-GEN-POINT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_non_indexical", "SM-GEN-POINT-NON-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_isas", "SM-GEN-POINT-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_genls", "SM-GEN-POINT-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_positions", "SM-GEN-POINT-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_indexical_record", "SM-GEN-POINT-INDEXICAL-RECORD", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_keyword", "SM-GEN-POINT-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_id", "_CSETF-SM-GEN-POINT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_non_indexical", "_CSETF-SM-GEN-POINT-NON-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_isas", "_CSETF-SM-GEN-POINT-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_genls", "_CSETF-SM-GEN-POINT-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_positions", "_CSETF-SM-GEN-POINT-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_indexical_record", "_CSETF-SM-GEN-POINT-INDEXICAL-RECORD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sm_gen_point_keyword", "_CSETF-SM-GEN-POINT-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sm_gen_point", "MAKE-SM-GEN-POINT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sm_gen_point", "VISIT-DEFSTRUCT-SM-GEN-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sm_gen_point_method", "VISIT-DEFSTRUCT-OBJECT-SM-GEN-POINT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_new_gen_point", "SM-NEW-GEN-POINT", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_add_gen_point_isas", "SM-ADD-GEN-POINT-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_gen_point_genls", "SM-ADD-GEN-POINT-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_add_gen_point_position", "SM-ADD-GEN-POINT-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_set_gen_point_indexical_record", "SM-SET-GEN-POINT-INDEXICAL-RECORD", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_grab_or_compute_gen_point_keyword", "SM-GRAB-OR-COMPUTE-GEN-POINT-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_best_gen_point_type", "SM-BEST-GEN-POINT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_cleanup_gen_point", "SM-CLEANUP-GEN-POINT", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_simple_compute_and_set_indexical_phrase", "SM-SIMPLE-COMPUTE-AND-SET-INDEXICAL-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_choose_optimal_genls", "SM-CHOOSE-OPTIMAL-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_choose_optimal_isa", "SM-CHOOSE-OPTIMAL-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_indexical_records_of_type", "SM-SCENARIO-INDEXICAL-RECORDS-OF-TYPE", 3, 1, false );
    SubLFiles.declareFunction( me, "sm_number_indexical_phrases", "SM-NUMBER-INDEXICAL-PHRASES", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_uniquify_two_indexical_records", "SM-UNIQUIFY-TWO-INDEXICAL-RECORDS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_number_one_indexical_phrase", "SM-NUMBER-ONE-INDEXICAL-PHRASE", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_generate_indexical_phrases_for_scenario", "SM-GENERATE-INDEXICAL-PHRASES-FOR-SCENARIO", 1, 1, false );
    SubLFiles.declareFunction( me, "sm_act_read_scenario", "SM-ACT-READ-SCENARIO", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_retrieve_scenario_fort_indexical_records", "SM-RETRIEVE-SCENARIO-FORT-INDEXICAL-RECORDS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_retrieve_scenario_terms_for_scenario", "SM-RETRIEVE-SCENARIO-TERMS-FOR-SCENARIO", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_retrieve_scenario_referents_for_scenario", "SM-RETRIEVE-SCENARIO-REFERENTS-FOR-SCENARIO", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_retrieve_scenario_fort_constraint_records", "SM-RETRIEVE-SCENARIO-FORT-CONSTRAINT-RECORDS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_substitute_terms_for_indexicals", "SM-SUBSTITUTE-TERMS-FOR-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_suggest_scenarios", "SM-ACT-SUGGEST-SCENARIOS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_extract_candidate_scenario_expressions", "SM-EXTRACT-CANDIDATE-SCENARIO-EXPRESSIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_initialize_scenario_from_expression", "SM-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_expression_ok", "SM-SCENARIO-EXPRESSION-OK", 1, 1, false );
    SubLFiles.declareFunction( me, "sm_el_wftP", "SM-EL-WFT?", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_constraints_wffP", "SM-SCENARIO-CONSTRAINTS-WFF?", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_fetch_scenario_phrase", "SM-FETCH-SCENARIO-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_initialize_scenario_from_cycl", "SM-ACT-INITIALIZE-SCENARIO-FROM-CYCL", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_extract_cycl_sentence_vars", "SM-EXTRACT-CYCL-SENTENCE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_extract_types_for_var", "SM-EXTRACT-TYPES-FOR-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_extract_cycl_sentence_constraints", "SM-EXTRACT-CYCL-SENTENCE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_atomic_sentenceP", "SM-ATOMIC-SENTENCE?", 1, 1, false );
    SubLFiles.declareFunction( me, "sm_negated_atomic_sentenceP", "SM-NEGATED-ATOMIC-SENTENCE?", 1, 1, false );
    SubLFiles.declareFunction( me, "sm_act_suggest_new_indexical_type", "SM-ACT-SUGGEST-NEW-INDEXICAL-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_add_new_indexical", "SM-ACT-ADD-NEW-INDEXICAL", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_act_share_scenario_term", "SM-ACT-SHARE-SCENARIO-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_get_next_indexical_number_of_type", "SM-GET-NEXT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_extract_entire_parses_of_type", "SM-EXTRACT-ENTIRE-PARSES-OF-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_find_indexical", "SM-ACT-FIND-INDEXICAL", 2, 1, false );
    SubLFiles.declareFunction( me, "sm_act_suggest_differences", "SM-ACT-SUGGEST-DIFFERENCES", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_record_get_collections", "SM-INDEXICAL-RECORD-GET-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_distinguish_indexicals", "SM-ACT-DISTINGUISH-INDEXICALS", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_act_remove_indexical", "SM-ACT-REMOVE-INDEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_remove_dependent_constraints", "SM-REMOVE-DEPENDENT-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_add_indexical_phrase", "SM-ACT-ADD-INDEXICAL-PHRASE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_remove_indexical_phrase", "SM-ACT-REMOVE-INDEXICAL-PHRASE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_gather_all_preferred_indexical_phrases", "SM-ACT-GATHER-ALL-PREFERRED-INDEXICAL-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_resolve_phrase_to_term", "SM-ACT-RESOLVE-PHRASE-TO-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_remove_isaXgenls_constraint", "SM-ACT-REMOVE-ISA/GENLS-CONSTRAINT", 4, 1, false );
    SubLFiles.declareFunction( me, "sm_act_get_all_isas_for_indexicals", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_get_all_isas_for_indexicals_memoized_internal", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_get_all_isas_for_indexicals_memoized", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_get_all_genls_for_indexicals", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_get_all_genls_for_indexicals_memoized_internal", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_get_all_genls_for_indexicals_memoized", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_suggest_constraint_cycl_from_text", "SM-ACT-SUGGEST-CONSTRAINT-CYCL-FROM-TEXT", 3, 1, false );
    SubLFiles.declareFunction( me, "sm_act_add_scenario_constraint", "SM-ACT-ADD-SCENARIO-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_indexical_parse_substitute", "SM-INDEXICAL-PARSE-SUBSTITUTE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_unresolved_item_for_phrase", "SM-UNRESOLVED-ITEM-FOR-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_unresolved_equal", "SM-UNRESOLVED-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_subphrase", "SM-SUBPHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_parse_result_substitute", "SM-PARSE-RESULT-SUBSTITUTE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_sentence_ok_for_scenarioP", "SM-SENTENCE-OK-FOR-SCENARIO?", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_term_requires_types_in_relation", "SM-TERM-REQUIRES-TYPES-IN-RELATION", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_term_requires_types_in_relations", "SM-TERM-REQUIRES-TYPES-IN-RELATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_identify_violating_collection_pair", "SM-IDENTIFY-VIOLATING-COLLECTION-PAIR", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_compute_current_indexical_isas_genls", "SM-COMPUTE-CURRENT-INDEXICAL-ISAS-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_scenario_type_constraints_on_term", "SM-SCENARIO-TYPE-CONSTRAINTS-ON-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_remove_constraint", "SM-ACT-REMOVE-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_remove_all_constraints", "SM-ACT-REMOVE-ALL-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_remove_many_constraints", "SM-ACT-REMOVE-MANY-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_import_constraint", "SM-ACT-IMPORT-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_gather_constraint_formulas", "SM-ACT-GATHER-CONSTRAINT-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_gather_constraint_formulas_memoized_internal", "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_gather_constraint_formulas_memoized", "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_modify_phrase", "SM-ACT-MODIFY-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_constraint_record_nl_sentence", "SM-ACT-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_compute_one_constraint_record_nl_sentence", "SM-COMPUTE-ONE-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_compute_constraint_record_nl_sentence", "SM-COMPUTE-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_substitute_phrases_for_indexicals", "SM-SUBSTITUTE-PHRASES-FOR-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_merge_scenarios", "SM-ACT-MERGE-SCENARIOS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_substitute_indexical_equivalences_in_sentence", "SM-MERGE-SUBSTITUTE-INDEXICAL-EQUIVALENCES-IN-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_merge_replace_non_equivalent_indexical", "SM-MERGE-REPLACE-NON-EQUIVALENT-INDEXICAL", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_ensure_new_indexical_number_of_type", "SM-ENSURE-NEW-INDEXICAL-NUMBER-OF-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_generalize_scenario", "SM-ACT-GENERALIZE-SCENARIO", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_generalize_scenario_with_gen_points", "SM-ACT-GENERALIZE-SCENARIO-WITH-GEN-POINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_scenario_generalization_points", "SM-ACT-COMPUTE-SCENARIO-GENERALIZATION-POINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_all_phrases_for_term", "SM-ALL-PHRASES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_non_indexicals_of_constraints", "SM-NON-INDEXICALS-OF-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_without_positions_p", "SM-GEN-POINT-WITHOUT-POSITIONS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_compute_template_expr_from_generalization_points", "SM-COMPUTE-TEMPLATE-EXPR-FROM-GENERALIZATION-POINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_gen_point_starting_at", "SM-GEN-POINT-STARTING-AT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_best_gen_point_sequence", "SM-BEST-GEN-POINT-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_template_type_for_gen_point", "SM-TEMPLATE-TYPE-FOR-GEN-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_template_type_for_collection", "SM-TEMPLATE-TYPE-FOR-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_compute_template_param_subs_from_generalization_points", "SM-COMPUTE-TEMPLATE-PARAM-SUBS-FROM-GENERALIZATION-POINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_construct_gen_point_indexical_record", "SM-CONSTRUCT-GEN-POINT-INDEXICAL-RECORD", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_get_next_gen_point_indexical_number_of_type", "SM-GET-NEXT-GEN-POINT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_generalize_scenario_constraints", "SM-GENERALIZE-SCENARIO-CONSTRAINTS", 5, 0, false );
    SubLFiles.declareFunction( me, "sm_apply_gen_point_to_template_constraints", "SM-APPLY-GEN-POINT-TO-TEMPLATE-CONSTRAINTS", 5, 0, false );
    SubLFiles.declareFunction( me, "sm_de_apply_gen_point_to_template_constraints", "SM-DE-APPLY-GEN-POINT-TO-TEMPLATE-CONSTRAINTS", 5, 0, false );
    SubLFiles.declareFunction( me, "sm_generate_text_from_template_expr", "SM-GENERATE-TEXT-FROM-TEMPLATE-EXPR", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_generate_text_from_template_element", "SM-GENERATE-TEXT-FROM-TEMPLATE-ELEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_generate_blank_for_template_element", "SM-GENERATE-BLANK-FOR-TEMPLATE-ELEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_save_scenario", "SM-ACT-SAVE-SCENARIO", 4, 0, false );
    SubLFiles.declareFunction( me, "sm_save_scenario_terms_and_referents", "SM-SAVE-SCENARIO-TERMS-AND-REFERENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_save_scenario_terms_and_referents_int", "SM-SAVE-SCENARIO-TERMS-AND-REFERENTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_save_template_constraints", "SM-SAVE-TEMPLATE-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_save_scenario_term_template", "SM-SAVE-SCENARIO-TERM-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_enumerate_saved_scenarios", "SM-ACT-ENUMERATE-SAVED-SCENARIOS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_enumerate_scenarios_identify_term_template", "SM-ENUMERATE-SCENARIOS-IDENTIFY-TERM-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_enumerate_scenarios_unpack_template_expression", "SM-ENUMERATE-SCENARIOS-UNPACK-TEMPLATE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_discard_template", "SM-ACT-DISCARD-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_unused_indexicals", "SM-ACT-COMPUTE-UNUSED-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_unused_indexicals_memoized_internal", "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_unused_indexicals_memoized", "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_explicit_type_constraints", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_explicit_type_constraints_memoized_internal", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_explicit_type_constraints_memoized", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_indexical_constraints", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_indexical_constraints_memoized_internal", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_compute_indexical_constraints_memoized", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_set_indexical_record_var", "SM-ACT-SET-INDEXICAL-RECORD-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_add_explicit_constraints", "SM-ACT-ADD-EXPLICIT-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_redundant_constraintP", "SM-REDUNDANT-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "sm_act_propose_sentence_adjustments", "SM-ACT-PROPOSE-SENTENCE-ADJUSTMENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_propose_gaf_sentence_adjustments", "SM-PROPOSE-GAF-SENTENCE-ADJUSTMENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "sm_act_construct_indexical_table", "SM-ACT-CONSTRUCT-INDEXICAL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_construct_indexical_table_from_indexical_records", "SM-ACT-CONSTRUCT-INDEXICAL-TABLE-FROM-INDEXICAL-RECORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_construct_indexical_constraint_table", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_construct_indexical_constraint_table_memoized_internal", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sm_act_construct_indexical_constraint_table_memoized", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_scenario_manipulator_file()
  {
    $sm_lock$ = SubLFiles.deflexical( "*SM-LOCK*", Locks.make_lock( $str0$Scenario_Manipulator_Lock ) );
    $sm_isg$ = SubLFiles.deflexical( "*SM-ISG*", maybeDefault( $sym3$_SM_ISG_, $sm_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    $sm_index$ = SubLFiles.deflexical( "*SM-INDEX*", maybeDefault( $sym4$_SM_INDEX_, $sm_index$, () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_sm_scenario$ = SubLFiles.defconstant( "*DTP-SM-SCENARIO*", $sym5$SM_SCENARIO );
    $dtp_sm_template$ = SubLFiles.defconstant( "*DTP-SM-TEMPLATE*", $sym63$SM_TEMPLATE );
    $dtp_sm_indexical_record$ = SubLFiles.defconstant( "*DTP-SM-INDEXICAL-RECORD*", $sym96$SM_INDEXICAL_RECORD );
    $dtp_sm_constraint_record$ = SubLFiles.defconstant( "*DTP-SM-CONSTRAINT-RECORD*", $sym134$SM_CONSTRAINT_RECORD );
    $dtp_sm_merge_info$ = SubLFiles.defconstant( "*DTP-SM-MERGE-INFO*", $sym152$SM_MERGE_INFO );
    $dtp_sm_gen_point$ = SubLFiles.defconstant( "*DTP-SM-GEN-POINT*", $sym179$SM_GEN_POINT );
    $sm_indexical_numbered_phrases$ = SubLFiles.deflexical( "*SM-INDEXICAL-NUMBERED-PHRASES*", $list213 );
    $sm_semantic_mt$ = SubLFiles.defparameter( "*SM-SEMANTIC-MT*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_scenario_manipulator_file()
  {
    subl_macro_promotions.declare_defglobal( $sym3$_SM_ISG_ );
    subl_macro_promotions.declare_defglobal( $sym4$_SM_INDEX_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sm_scenario$.getGlobalValue(), Symbols.symbol_function( $sym12$SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list13 );
    Structures.def_csetf( $sym14$SM_SCENARIO_ID, $sym15$_CSETF_SM_SCENARIO_ID );
    Structures.def_csetf( $sym16$SM_SCENARIO_SESSIONS, $sym17$_CSETF_SM_SCENARIO_SESSIONS );
    Structures.def_csetf( $sym18$SM_SCENARIO_PHRASE, $sym19$_CSETF_SM_SCENARIO_PHRASE );
    Structures.def_csetf( $sym20$SM_SCENARIO_CANDIDATE_TERMS, $sym21$_CSETF_SM_SCENARIO_CANDIDATE_TERMS );
    Structures.def_csetf( $sym22$SM_SCENARIO_CANDIDATE_CONSTRAINTS, $sym23$_CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS );
    Structures.def_csetf( $sym24$SM_SCENARIO_FORT, $sym25$_CSETF_SM_SCENARIO_FORT );
    Structures.def_csetf( $sym26$SM_SCENARIO_TERMS, $sym27$_CSETF_SM_SCENARIO_TERMS );
    Structures.def_csetf( $sym28$SM_SCENARIO_CONSTRAINTS, $sym29$_CSETF_SM_SCENARIO_CONSTRAINTS );
    Structures.def_csetf( $sym30$SM_SCENARIO_TEMPLATES, $sym31$_CSETF_SM_SCENARIO_TEMPLATES );
    Structures.def_csetf( $sym32$SM_SCENARIO_STATE, $sym33$_CSETF_SM_SCENARIO_STATE );
    Equality.identity( $sym5$SM_SCENARIO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_scenario$.getGlobalValue(), Symbols.symbol_function( $sym49$VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sm_template$.getGlobalValue(), Symbols.symbol_function( $sym68$SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list69 );
    Structures.def_csetf( $sym70$SM_TEMPLATE_ID, $sym71$_CSETF_SM_TEMPLATE_ID );
    Structures.def_csetf( $sym72$SM_TEMPLATE_SCENARIO, $sym73$_CSETF_SM_TEMPLATE_SCENARIO );
    Structures.def_csetf( $sym74$SM_TEMPLATE_PHRASE, $sym75$_CSETF_SM_TEMPLATE_PHRASE );
    Structures.def_csetf( $sym76$SM_TEMPLATE_EXPRESSION, $sym77$_CSETF_SM_TEMPLATE_EXPRESSION );
    Structures.def_csetf( $sym78$SM_TEMPLATE_PARAM_SUBS, $sym79$_CSETF_SM_TEMPLATE_PARAM_SUBS );
    Structures.def_csetf( $sym80$SM_TEMPLATE_PARAMETERS, $sym81$_CSETF_SM_TEMPLATE_PARAMETERS );
    Structures.def_csetf( $sym82$SM_TEMPLATE_CONSTRAINTS, $sym83$_CSETF_SM_TEMPLATE_CONSTRAINTS );
    Structures.def_csetf( $sym84$SM_TEMPLATE_STATE, $sym85$_CSETF_SM_TEMPLATE_STATE );
    Equality.identity( $sym63$SM_TEMPLATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_template$.getGlobalValue(), Symbols.symbol_function( $sym91$VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sm_indexical_record$.getGlobalValue(), Symbols.symbol_function( $sym101$SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list102 );
    Structures.def_csetf( $sym103$SM_INDEXICAL_RECORD_ID, $sym104$_CSETF_SM_INDEXICAL_RECORD_ID );
    Structures.def_csetf( $sym105$SM_INDEXICAL_RECORD_INDEXICAL, $sym106$_CSETF_SM_INDEXICAL_RECORD_INDEXICAL );
    Structures.def_csetf( $sym107$SM_INDEXICAL_RECORD_PHRASES, $sym108$_CSETF_SM_INDEXICAL_RECORD_PHRASES );
    Structures.def_csetf( $sym109$SM_INDEXICAL_RECORD_VAR, $sym110$_CSETF_SM_INDEXICAL_RECORD_VAR );
    Structures.def_csetf( $sym111$SM_INDEXICAL_RECORD_EXPLICIT_ISAS, $sym112$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS );
    Structures.def_csetf( $sym113$SM_INDEXICAL_RECORD_EXPLICIT_GENLS, $sym114$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS );
    Structures.def_csetf( $sym115$SM_INDEXICAL_RECORD_ISAS, $sym116$_CSETF_SM_INDEXICAL_RECORD_ISAS );
    Structures.def_csetf( $sym117$SM_INDEXICAL_RECORD_GENLS, $sym118$_CSETF_SM_INDEXICAL_RECORD_GENLS );
    Structures.def_csetf( $sym119$SM_INDEXICAL_RECORD_STATE, $sym120$_CSETF_SM_INDEXICAL_RECORD_STATE );
    Equality.identity( $sym96$SM_INDEXICAL_RECORD );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_indexical_record$.getGlobalValue(), Symbols.symbol_function(
        $sym129$VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sm_constraint_record$.getGlobalValue(), Symbols.symbol_function( $sym139$SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list140 );
    Structures.def_csetf( $sym141$SM_CONSTRAINT_RECORD_ID, $sym142$_CSETF_SM_CONSTRAINT_RECORD_ID );
    Structures.def_csetf( $sym143$SM_CONSTRAINT_RECORD_SENTENCE, $sym144$_CSETF_SM_CONSTRAINT_RECORD_SENTENCE );
    Structures.def_csetf( $sym145$SM_CONSTRAINT_RECORD_NL_SENTENCE, $sym146$_CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE );
    Equality.identity( $sym134$SM_CONSTRAINT_RECORD );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_constraint_record$.getGlobalValue(), Symbols.symbol_function(
        $sym150$VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sm_merge_info$.getGlobalValue(), Symbols.symbol_function( $sym158$SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list159 );
    Structures.def_csetf( $sym160$SM_MERGE_INFO_ID, $sym161$_CSETF_SM_MERGE_INFO_ID );
    Structures.def_csetf( $sym162$SM_MERGE_INFO_FROM_SCENARIO, $sym163$_CSETF_SM_MERGE_INFO_FROM_SCENARIO );
    Structures.def_csetf( $sym164$SM_MERGE_INFO_TO_SCENARIO, $sym165$_CSETF_SM_MERGE_INFO_TO_SCENARIO );
    Structures.def_csetf( $sym166$SM_MERGE_INFO_ALIGN_TO, $sym167$_CSETF_SM_MERGE_INFO_ALIGN_TO );
    Structures.def_csetf( $sym168$SM_MERGE_INFO_ALIGN_FROM, $sym169$_CSETF_SM_MERGE_INFO_ALIGN_FROM );
    Structures.def_csetf( $sym170$SM_MERGE_INFO_INDEXICAL_EQUIVALENCES, $sym171$_CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES );
    Equality.identity( $sym152$SM_MERGE_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_merge_info$.getGlobalValue(), Symbols.symbol_function( $sym178$VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sm_gen_point$.getGlobalValue(), Symbols.symbol_function( $sym185$SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list186 );
    Structures.def_csetf( $sym187$SM_GEN_POINT_ID, $sym188$_CSETF_SM_GEN_POINT_ID );
    Structures.def_csetf( $sym189$SM_GEN_POINT_NON_INDEXICAL, $sym190$_CSETF_SM_GEN_POINT_NON_INDEXICAL );
    Structures.def_csetf( $sym191$SM_GEN_POINT_ISAS, $sym192$_CSETF_SM_GEN_POINT_ISAS );
    Structures.def_csetf( $sym193$SM_GEN_POINT_GENLS, $sym194$_CSETF_SM_GEN_POINT_GENLS );
    Structures.def_csetf( $sym195$SM_GEN_POINT_POSITIONS, $sym196$_CSETF_SM_GEN_POINT_POSITIONS );
    Structures.def_csetf( $sym197$SM_GEN_POINT_INDEXICAL_RECORD, $sym198$_CSETF_SM_GEN_POINT_INDEXICAL_RECORD );
    Structures.def_csetf( $sym199$SM_GEN_POINT_KEYWORD, $sym200$_CSETF_SM_GEN_POINT_KEYWORD );
    Equality.identity( $sym179$SM_GEN_POINT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_gen_point$.getGlobalValue(), Symbols.symbol_function( $sym206$VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD ) );
    memoization_state.note_memoized_function( $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED );
    memoization_state.note_memoized_function( $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED );
    memoization_state.note_memoized_function( $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED );
    memoization_state.note_memoized_function( $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED );
    memoization_state.note_memoized_function( $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED );
    memoization_state.note_memoized_function( $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED );
    memoization_state.note_memoized_function( $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_scenario_manipulator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_scenario_manipulator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_scenario_manipulator_file();
  }
  static
  {
    me = new rkf_scenario_manipulator();
    $sm_lock$ = null;
    $sm_isg$ = null;
    $sm_index$ = null;
    $dtp_sm_scenario$ = null;
    $dtp_sm_template$ = null;
    $dtp_sm_indexical_record$ = null;
    $dtp_sm_constraint_record$ = null;
    $dtp_sm_merge_info$ = null;
    $dtp_sm_gen_point$ = null;
    $sm_indexical_numbered_phrases$ = null;
    $sm_semantic_mt$ = null;
    $str0$Scenario_Manipulator_Lock = makeString( "Scenario Manipulator Lock" );
    $sym1$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list2 = ConsesLow.list( makeSymbol( "*SM-LOCK*" ) );
    $sym3$_SM_ISG_ = makeSymbol( "*SM-ISG*" );
    $sym4$_SM_INDEX_ = makeSymbol( "*SM-INDEX*" );
    $sym5$SM_SCENARIO = makeSymbol( "SM-SCENARIO" );
    $sym6$SM_SCENARIO_P = makeSymbol( "SM-SCENARIO-P" );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "SESSIONS" ), makeSymbol( "PHRASE" ), makeSymbol( "CANDIDATE-TERMS" ), makeSymbol( "CANDIDATE-CONSTRAINTS" ), makeSymbol( "FORT" ),
      makeSymbol( "TERMS" ), makeSymbol( "CONSTRAINTS" ), makeSymbol( "TEMPLATES" ), makeSymbol( "STATE" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "SESSIONS" ), makeKeyword( "PHRASE" ), makeKeyword( "CANDIDATE-TERMS" ), makeKeyword( "CANDIDATE-CONSTRAINTS" ), makeKeyword( "FORT" ),
      makeKeyword( "TERMS" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "TEMPLATES" ), makeKeyword( "STATE" )
    } );
    $list9 = ConsesLow.list( new SubLObject[] { makeSymbol( "SM-SCENARIO-ID" ), makeSymbol( "SM-SCENARIO-SESSIONS" ), makeSymbol( "SM-SCENARIO-PHRASE" ), makeSymbol( "SM-SCENARIO-CANDIDATE-TERMS" ), makeSymbol(
        "SM-SCENARIO-CANDIDATE-CONSTRAINTS" ), makeSymbol( "SM-SCENARIO-FORT" ), makeSymbol( "SM-SCENARIO-TERMS" ), makeSymbol( "SM-SCENARIO-CONSTRAINTS" ), makeSymbol( "SM-SCENARIO-TEMPLATES" ), makeSymbol(
            "SM-SCENARIO-STATE" )
    } );
    $list10 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SM-SCENARIO-ID" ), makeSymbol( "_CSETF-SM-SCENARIO-SESSIONS" ), makeSymbol( "_CSETF-SM-SCENARIO-PHRASE" ), makeSymbol(
        "_CSETF-SM-SCENARIO-CANDIDATE-TERMS" ), makeSymbol( "_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS" ), makeSymbol( "_CSETF-SM-SCENARIO-FORT" ), makeSymbol( "_CSETF-SM-SCENARIO-TERMS" ), makeSymbol(
            "_CSETF-SM-SCENARIO-CONSTRAINTS" ), makeSymbol( "_CSETF-SM-SCENARIO-TEMPLATES" ), makeSymbol( "_CSETF-SM-SCENARIO-STATE" )
    } );
    $sym11$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym12$SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SM-SCENARIO-PRINT-FUNCTION-TRAMPOLINE" );
    $list13 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SM-SCENARIO-P" ) );
    $sym14$SM_SCENARIO_ID = makeSymbol( "SM-SCENARIO-ID" );
    $sym15$_CSETF_SM_SCENARIO_ID = makeSymbol( "_CSETF-SM-SCENARIO-ID" );
    $sym16$SM_SCENARIO_SESSIONS = makeSymbol( "SM-SCENARIO-SESSIONS" );
    $sym17$_CSETF_SM_SCENARIO_SESSIONS = makeSymbol( "_CSETF-SM-SCENARIO-SESSIONS" );
    $sym18$SM_SCENARIO_PHRASE = makeSymbol( "SM-SCENARIO-PHRASE" );
    $sym19$_CSETF_SM_SCENARIO_PHRASE = makeSymbol( "_CSETF-SM-SCENARIO-PHRASE" );
    $sym20$SM_SCENARIO_CANDIDATE_TERMS = makeSymbol( "SM-SCENARIO-CANDIDATE-TERMS" );
    $sym21$_CSETF_SM_SCENARIO_CANDIDATE_TERMS = makeSymbol( "_CSETF-SM-SCENARIO-CANDIDATE-TERMS" );
    $sym22$SM_SCENARIO_CANDIDATE_CONSTRAINTS = makeSymbol( "SM-SCENARIO-CANDIDATE-CONSTRAINTS" );
    $sym23$_CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS = makeSymbol( "_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS" );
    $sym24$SM_SCENARIO_FORT = makeSymbol( "SM-SCENARIO-FORT" );
    $sym25$_CSETF_SM_SCENARIO_FORT = makeSymbol( "_CSETF-SM-SCENARIO-FORT" );
    $sym26$SM_SCENARIO_TERMS = makeSymbol( "SM-SCENARIO-TERMS" );
    $sym27$_CSETF_SM_SCENARIO_TERMS = makeSymbol( "_CSETF-SM-SCENARIO-TERMS" );
    $sym28$SM_SCENARIO_CONSTRAINTS = makeSymbol( "SM-SCENARIO-CONSTRAINTS" );
    $sym29$_CSETF_SM_SCENARIO_CONSTRAINTS = makeSymbol( "_CSETF-SM-SCENARIO-CONSTRAINTS" );
    $sym30$SM_SCENARIO_TEMPLATES = makeSymbol( "SM-SCENARIO-TEMPLATES" );
    $sym31$_CSETF_SM_SCENARIO_TEMPLATES = makeSymbol( "_CSETF-SM-SCENARIO-TEMPLATES" );
    $sym32$SM_SCENARIO_STATE = makeSymbol( "SM-SCENARIO-STATE" );
    $sym33$_CSETF_SM_SCENARIO_STATE = makeSymbol( "_CSETF-SM-SCENARIO-STATE" );
    $kw34$ID = makeKeyword( "ID" );
    $kw35$SESSIONS = makeKeyword( "SESSIONS" );
    $kw36$PHRASE = makeKeyword( "PHRASE" );
    $kw37$CANDIDATE_TERMS = makeKeyword( "CANDIDATE-TERMS" );
    $kw38$CANDIDATE_CONSTRAINTS = makeKeyword( "CANDIDATE-CONSTRAINTS" );
    $kw39$FORT = makeKeyword( "FORT" );
    $kw40$TERMS = makeKeyword( "TERMS" );
    $kw41$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw42$TEMPLATES = makeKeyword( "TEMPLATES" );
    $kw43$STATE = makeKeyword( "STATE" );
    $str44$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw45$BEGIN = makeKeyword( "BEGIN" );
    $sym46$MAKE_SM_SCENARIO = makeSymbol( "MAKE-SM-SCENARIO" );
    $kw47$SLOT = makeKeyword( "SLOT" );
    $kw48$END = makeKeyword( "END" );
    $sym49$VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SM-SCENARIO-METHOD" );
    $sym50$STRINGP = makeSymbol( "STRINGP" );
    $sym51$FORT_P = makeSymbol( "FORT-P" );
    $sym52$SM_INDEXICAL_RECORD_P = makeSymbol( "SM-INDEXICAL-RECORD-P" );
    $sym53$SM_CONSTRAINT_RECORD_P = makeSymbol( "SM-CONSTRAINT-RECORD-P" );
    $sym54$SM_TEMPLATE_P = makeSymbol( "SM-TEMPLATE-P" );
    $kw55$BORROWED_INDEXICALS = makeKeyword( "BORROWED-INDEXICALS" );
    $kw56$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $kw57$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "SCENARIO" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym59$MEMOIZATION_STATE = makeUninternedSymbol( "MEMOIZATION-STATE" );
    $sym60$CLET = makeSymbol( "CLET" );
    $sym61$SM_SCENARIO_MEMOIZATION_STATE = makeSymbol( "SM-SCENARIO-MEMOIZATION-STATE" );
    $sym62$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $sym63$SM_TEMPLATE = makeSymbol( "SM-TEMPLATE" );
    $list64 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "SCENARIO" ), makeSymbol( "PHRASE" ), makeSymbol( "EXPRESSION" ), makeSymbol( "PARAM-SUBS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "CONSTRAINTS" ),
        makeSymbol( "STATE" ) );
    $list65 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "SCENARIO" ), makeKeyword( "PHRASE" ), makeKeyword( "EXPRESSION" ), makeKeyword( "PARAM-SUBS" ), makeKeyword( "PARAMETERS" ), makeKeyword( "CONSTRAINTS" ),
        makeKeyword( "STATE" ) );
    $list66 = ConsesLow.list( makeSymbol( "SM-TEMPLATE-ID" ), makeSymbol( "SM-TEMPLATE-SCENARIO" ), makeSymbol( "SM-TEMPLATE-PHRASE" ), makeSymbol( "SM-TEMPLATE-EXPRESSION" ), makeSymbol( "SM-TEMPLATE-PARAM-SUBS" ),
        makeSymbol( "SM-TEMPLATE-PARAMETERS" ), makeSymbol( "SM-TEMPLATE-CONSTRAINTS" ), makeSymbol( "SM-TEMPLATE-STATE" ) );
    $list67 = ConsesLow.list( makeSymbol( "_CSETF-SM-TEMPLATE-ID" ), makeSymbol( "_CSETF-SM-TEMPLATE-SCENARIO" ), makeSymbol( "_CSETF-SM-TEMPLATE-PHRASE" ), makeSymbol( "_CSETF-SM-TEMPLATE-EXPRESSION" ), makeSymbol(
        "_CSETF-SM-TEMPLATE-PARAM-SUBS" ), makeSymbol( "_CSETF-SM-TEMPLATE-PARAMETERS" ), makeSymbol( "_CSETF-SM-TEMPLATE-CONSTRAINTS" ), makeSymbol( "_CSETF-SM-TEMPLATE-STATE" ) );
    $sym68$SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SM-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list69 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SM-TEMPLATE-P" ) );
    $sym70$SM_TEMPLATE_ID = makeSymbol( "SM-TEMPLATE-ID" );
    $sym71$_CSETF_SM_TEMPLATE_ID = makeSymbol( "_CSETF-SM-TEMPLATE-ID" );
    $sym72$SM_TEMPLATE_SCENARIO = makeSymbol( "SM-TEMPLATE-SCENARIO" );
    $sym73$_CSETF_SM_TEMPLATE_SCENARIO = makeSymbol( "_CSETF-SM-TEMPLATE-SCENARIO" );
    $sym74$SM_TEMPLATE_PHRASE = makeSymbol( "SM-TEMPLATE-PHRASE" );
    $sym75$_CSETF_SM_TEMPLATE_PHRASE = makeSymbol( "_CSETF-SM-TEMPLATE-PHRASE" );
    $sym76$SM_TEMPLATE_EXPRESSION = makeSymbol( "SM-TEMPLATE-EXPRESSION" );
    $sym77$_CSETF_SM_TEMPLATE_EXPRESSION = makeSymbol( "_CSETF-SM-TEMPLATE-EXPRESSION" );
    $sym78$SM_TEMPLATE_PARAM_SUBS = makeSymbol( "SM-TEMPLATE-PARAM-SUBS" );
    $sym79$_CSETF_SM_TEMPLATE_PARAM_SUBS = makeSymbol( "_CSETF-SM-TEMPLATE-PARAM-SUBS" );
    $sym80$SM_TEMPLATE_PARAMETERS = makeSymbol( "SM-TEMPLATE-PARAMETERS" );
    $sym81$_CSETF_SM_TEMPLATE_PARAMETERS = makeSymbol( "_CSETF-SM-TEMPLATE-PARAMETERS" );
    $sym82$SM_TEMPLATE_CONSTRAINTS = makeSymbol( "SM-TEMPLATE-CONSTRAINTS" );
    $sym83$_CSETF_SM_TEMPLATE_CONSTRAINTS = makeSymbol( "_CSETF-SM-TEMPLATE-CONSTRAINTS" );
    $sym84$SM_TEMPLATE_STATE = makeSymbol( "SM-TEMPLATE-STATE" );
    $sym85$_CSETF_SM_TEMPLATE_STATE = makeSymbol( "_CSETF-SM-TEMPLATE-STATE" );
    $kw86$SCENARIO = makeKeyword( "SCENARIO" );
    $kw87$EXPRESSION = makeKeyword( "EXPRESSION" );
    $kw88$PARAM_SUBS = makeKeyword( "PARAM-SUBS" );
    $kw89$PARAMETERS = makeKeyword( "PARAMETERS" );
    $sym90$MAKE_SM_TEMPLATE = makeSymbol( "MAKE-SM-TEMPLATE" );
    $sym91$VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SM-TEMPLATE-METHOD" );
    $sym92$LISTP = makeSymbol( "LISTP" );
    $const93$ScenarioInstanceFn = constant_handles.reader_make_constant_shell( makeString( "ScenarioInstanceFn" ) );
    $sym94$NAUT_ = makeSymbol( "NAUT?" );
    $sym95$SM_SCENARIO_EXPRESSION_P = makeSymbol( "SM-SCENARIO-EXPRESSION-P" );
    $sym96$SM_INDEXICAL_RECORD = makeSymbol( "SM-INDEXICAL-RECORD" );
    $list97 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "INDEXICAL" ), makeSymbol( "PHRASES" ), makeSymbol( "VAR" ), makeSymbol( "EXPLICIT-ISAS" ), makeSymbol( "EXPLICIT-GENLS" ), makeSymbol(
        "ISAS" ), makeSymbol( "GENLS" ), makeSymbol( "STATE" )
    } );
    $list98 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "INDEXICAL" ), makeKeyword( "PHRASES" ), makeKeyword( "VAR" ), makeKeyword( "EXPLICIT-ISAS" ), makeKeyword( "EXPLICIT-GENLS" ),
      makeKeyword( "ISAS" ), makeKeyword( "GENLS" ), makeKeyword( "STATE" )
    } );
    $list99 = ConsesLow.list( new SubLObject[] { makeSymbol( "SM-INDEXICAL-RECORD-ID" ), makeSymbol( "SM-INDEXICAL-RECORD-INDEXICAL" ), makeSymbol( "SM-INDEXICAL-RECORD-PHRASES" ), makeSymbol(
        "SM-INDEXICAL-RECORD-VAR" ), makeSymbol( "SM-INDEXICAL-RECORD-EXPLICIT-ISAS" ), makeSymbol( "SM-INDEXICAL-RECORD-EXPLICIT-GENLS" ), makeSymbol( "SM-INDEXICAL-RECORD-ISAS" ), makeSymbol(
            "SM-INDEXICAL-RECORD-GENLS" ), makeSymbol( "SM-INDEXICAL-RECORD-STATE" )
    } );
    $list100 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-ID" ), makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-INDEXICAL" ), makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-PHRASES" ), makeSymbol(
        "_CSETF-SM-INDEXICAL-RECORD-VAR" ), makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS" ), makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS" ), makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-ISAS" ),
      makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-GENLS" ), makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-STATE" )
    } );
    $sym101$SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SM-INDEXICAL-RECORD-PRINT-FUNCTION-TRAMPOLINE" );
    $list102 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SM-INDEXICAL-RECORD-P" ) );
    $sym103$SM_INDEXICAL_RECORD_ID = makeSymbol( "SM-INDEXICAL-RECORD-ID" );
    $sym104$_CSETF_SM_INDEXICAL_RECORD_ID = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-ID" );
    $sym105$SM_INDEXICAL_RECORD_INDEXICAL = makeSymbol( "SM-INDEXICAL-RECORD-INDEXICAL" );
    $sym106$_CSETF_SM_INDEXICAL_RECORD_INDEXICAL = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-INDEXICAL" );
    $sym107$SM_INDEXICAL_RECORD_PHRASES = makeSymbol( "SM-INDEXICAL-RECORD-PHRASES" );
    $sym108$_CSETF_SM_INDEXICAL_RECORD_PHRASES = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-PHRASES" );
    $sym109$SM_INDEXICAL_RECORD_VAR = makeSymbol( "SM-INDEXICAL-RECORD-VAR" );
    $sym110$_CSETF_SM_INDEXICAL_RECORD_VAR = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-VAR" );
    $sym111$SM_INDEXICAL_RECORD_EXPLICIT_ISAS = makeSymbol( "SM-INDEXICAL-RECORD-EXPLICIT-ISAS" );
    $sym112$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS" );
    $sym113$SM_INDEXICAL_RECORD_EXPLICIT_GENLS = makeSymbol( "SM-INDEXICAL-RECORD-EXPLICIT-GENLS" );
    $sym114$_CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS" );
    $sym115$SM_INDEXICAL_RECORD_ISAS = makeSymbol( "SM-INDEXICAL-RECORD-ISAS" );
    $sym116$_CSETF_SM_INDEXICAL_RECORD_ISAS = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-ISAS" );
    $sym117$SM_INDEXICAL_RECORD_GENLS = makeSymbol( "SM-INDEXICAL-RECORD-GENLS" );
    $sym118$_CSETF_SM_INDEXICAL_RECORD_GENLS = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-GENLS" );
    $sym119$SM_INDEXICAL_RECORD_STATE = makeSymbol( "SM-INDEXICAL-RECORD-STATE" );
    $sym120$_CSETF_SM_INDEXICAL_RECORD_STATE = makeSymbol( "_CSETF-SM-INDEXICAL-RECORD-STATE" );
    $kw121$INDEXICAL = makeKeyword( "INDEXICAL" );
    $kw122$PHRASES = makeKeyword( "PHRASES" );
    $kw123$VAR = makeKeyword( "VAR" );
    $kw124$EXPLICIT_ISAS = makeKeyword( "EXPLICIT-ISAS" );
    $kw125$EXPLICIT_GENLS = makeKeyword( "EXPLICIT-GENLS" );
    $kw126$ISAS = makeKeyword( "ISAS" );
    $kw127$GENLS = makeKeyword( "GENLS" );
    $sym128$MAKE_SM_INDEXICAL_RECORD = makeSymbol( "MAKE-SM-INDEXICAL-RECORD" );
    $sym129$VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SM-INDEXICAL-RECORD-METHOD" );
    $sym130$SM_INDEXICAL_P = makeSymbol( "SM-INDEXICAL-P" );
    $sym131$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $const132$TheNthFn = constant_handles.reader_make_constant_shell( makeString( "TheNthFn" ) );
    $sym133$INTEGERP = makeSymbol( "INTEGERP" );
    $sym134$SM_CONSTRAINT_RECORD = makeSymbol( "SM-CONSTRAINT-RECORD" );
    $list135 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "NL-SENTENCE" ) );
    $list136 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "SENTENCE" ), makeKeyword( "NL-SENTENCE" ) );
    $list137 = ConsesLow.list( makeSymbol( "SM-CONSTRAINT-RECORD-ID" ), makeSymbol( "SM-CONSTRAINT-RECORD-SENTENCE" ), makeSymbol( "SM-CONSTRAINT-RECORD-NL-SENTENCE" ) );
    $list138 = ConsesLow.list( makeSymbol( "_CSETF-SM-CONSTRAINT-RECORD-ID" ), makeSymbol( "_CSETF-SM-CONSTRAINT-RECORD-SENTENCE" ), makeSymbol( "_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE" ) );
    $sym139$SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SM-CONSTRAINT-RECORD-PRINT-FUNCTION-TRAMPOLINE" );
    $list140 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SM-CONSTRAINT-RECORD-P" ) );
    $sym141$SM_CONSTRAINT_RECORD_ID = makeSymbol( "SM-CONSTRAINT-RECORD-ID" );
    $sym142$_CSETF_SM_CONSTRAINT_RECORD_ID = makeSymbol( "_CSETF-SM-CONSTRAINT-RECORD-ID" );
    $sym143$SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol( "SM-CONSTRAINT-RECORD-SENTENCE" );
    $sym144$_CSETF_SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol( "_CSETF-SM-CONSTRAINT-RECORD-SENTENCE" );
    $sym145$SM_CONSTRAINT_RECORD_NL_SENTENCE = makeSymbol( "SM-CONSTRAINT-RECORD-NL-SENTENCE" );
    $sym146$_CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE = makeSymbol( "_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE" );
    $kw147$SENTENCE = makeKeyword( "SENTENCE" );
    $kw148$NL_SENTENCE = makeKeyword( "NL-SENTENCE" );
    $sym149$MAKE_SM_CONSTRAINT_RECORD = makeSymbol( "MAKE-SM-CONSTRAINT-RECORD" );
    $sym150$VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SM-CONSTRAINT-RECORD-METHOD" );
    $sym151$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym152$SM_MERGE_INFO = makeSymbol( "SM-MERGE-INFO" );
    $sym153$SM_MERGE_INFO_P = makeSymbol( "SM-MERGE-INFO-P" );
    $list154 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "FROM-SCENARIO" ), makeSymbol( "TO-SCENARIO" ), makeSymbol( "ALIGN-TO" ), makeSymbol( "ALIGN-FROM" ), makeSymbol( "INDEXICAL-EQUIVALENCES" ) );
    $list155 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "FROM-SCENARIO" ), makeKeyword( "TO-SCENARIO" ), makeKeyword( "ALIGN-TO" ), makeKeyword( "ALIGN-FROM" ), makeKeyword( "INDEXICAL-EQUIVALENCES" ) );
    $list156 = ConsesLow.list( makeSymbol( "SM-MERGE-INFO-ID" ), makeSymbol( "SM-MERGE-INFO-FROM-SCENARIO" ), makeSymbol( "SM-MERGE-INFO-TO-SCENARIO" ), makeSymbol( "SM-MERGE-INFO-ALIGN-TO" ), makeSymbol(
        "SM-MERGE-INFO-ALIGN-FROM" ), makeSymbol( "SM-MERGE-INFO-INDEXICAL-EQUIVALENCES" ) );
    $list157 = ConsesLow.list( makeSymbol( "_CSETF-SM-MERGE-INFO-ID" ), makeSymbol( "_CSETF-SM-MERGE-INFO-FROM-SCENARIO" ), makeSymbol( "_CSETF-SM-MERGE-INFO-TO-SCENARIO" ), makeSymbol( "_CSETF-SM-MERGE-INFO-ALIGN-TO" ),
        makeSymbol( "_CSETF-SM-MERGE-INFO-ALIGN-FROM" ), makeSymbol( "_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES" ) );
    $sym158$SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SM-MERGE-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list159 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SM-MERGE-INFO-P" ) );
    $sym160$SM_MERGE_INFO_ID = makeSymbol( "SM-MERGE-INFO-ID" );
    $sym161$_CSETF_SM_MERGE_INFO_ID = makeSymbol( "_CSETF-SM-MERGE-INFO-ID" );
    $sym162$SM_MERGE_INFO_FROM_SCENARIO = makeSymbol( "SM-MERGE-INFO-FROM-SCENARIO" );
    $sym163$_CSETF_SM_MERGE_INFO_FROM_SCENARIO = makeSymbol( "_CSETF-SM-MERGE-INFO-FROM-SCENARIO" );
    $sym164$SM_MERGE_INFO_TO_SCENARIO = makeSymbol( "SM-MERGE-INFO-TO-SCENARIO" );
    $sym165$_CSETF_SM_MERGE_INFO_TO_SCENARIO = makeSymbol( "_CSETF-SM-MERGE-INFO-TO-SCENARIO" );
    $sym166$SM_MERGE_INFO_ALIGN_TO = makeSymbol( "SM-MERGE-INFO-ALIGN-TO" );
    $sym167$_CSETF_SM_MERGE_INFO_ALIGN_TO = makeSymbol( "_CSETF-SM-MERGE-INFO-ALIGN-TO" );
    $sym168$SM_MERGE_INFO_ALIGN_FROM = makeSymbol( "SM-MERGE-INFO-ALIGN-FROM" );
    $sym169$_CSETF_SM_MERGE_INFO_ALIGN_FROM = makeSymbol( "_CSETF-SM-MERGE-INFO-ALIGN-FROM" );
    $sym170$SM_MERGE_INFO_INDEXICAL_EQUIVALENCES = makeSymbol( "SM-MERGE-INFO-INDEXICAL-EQUIVALENCES" );
    $sym171$_CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES = makeSymbol( "_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES" );
    $kw172$FROM_SCENARIO = makeKeyword( "FROM-SCENARIO" );
    $kw173$TO_SCENARIO = makeKeyword( "TO-SCENARIO" );
    $kw174$ALIGN_TO = makeKeyword( "ALIGN-TO" );
    $kw175$ALIGN_FROM = makeKeyword( "ALIGN-FROM" );
    $kw176$INDEXICAL_EQUIVALENCES = makeKeyword( "INDEXICAL-EQUIVALENCES" );
    $sym177$MAKE_SM_MERGE_INFO = makeSymbol( "MAKE-SM-MERGE-INFO" );
    $sym178$VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SM-MERGE-INFO-METHOD" );
    $sym179$SM_GEN_POINT = makeSymbol( "SM-GEN-POINT" );
    $sym180$SM_GEN_POINT_P = makeSymbol( "SM-GEN-POINT-P" );
    $list181 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "NON-INDEXICAL" ), makeSymbol( "ISAS" ), makeSymbol( "GENLS" ), makeSymbol( "POSITIONS" ), makeSymbol( "INDEXICAL-RECORD" ), makeSymbol( "KEYWORD" ) );
    $list182 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "NON-INDEXICAL" ), makeKeyword( "ISAS" ), makeKeyword( "GENLS" ), makeKeyword( "POSITIONS" ), makeKeyword( "INDEXICAL-RECORD" ), makeKeyword(
        "KEYWORD" ) );
    $list183 = ConsesLow.list( makeSymbol( "SM-GEN-POINT-ID" ), makeSymbol( "SM-GEN-POINT-NON-INDEXICAL" ), makeSymbol( "SM-GEN-POINT-ISAS" ), makeSymbol( "SM-GEN-POINT-GENLS" ), makeSymbol( "SM-GEN-POINT-POSITIONS" ),
        makeSymbol( "SM-GEN-POINT-INDEXICAL-RECORD" ), makeSymbol( "SM-GEN-POINT-KEYWORD" ) );
    $list184 = ConsesLow.list( makeSymbol( "_CSETF-SM-GEN-POINT-ID" ), makeSymbol( "_CSETF-SM-GEN-POINT-NON-INDEXICAL" ), makeSymbol( "_CSETF-SM-GEN-POINT-ISAS" ), makeSymbol( "_CSETF-SM-GEN-POINT-GENLS" ), makeSymbol(
        "_CSETF-SM-GEN-POINT-POSITIONS" ), makeSymbol( "_CSETF-SM-GEN-POINT-INDEXICAL-RECORD" ), makeSymbol( "_CSETF-SM-GEN-POINT-KEYWORD" ) );
    $sym185$SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SM-GEN-POINT-PRINT-FUNCTION-TRAMPOLINE" );
    $list186 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SM-GEN-POINT-P" ) );
    $sym187$SM_GEN_POINT_ID = makeSymbol( "SM-GEN-POINT-ID" );
    $sym188$_CSETF_SM_GEN_POINT_ID = makeSymbol( "_CSETF-SM-GEN-POINT-ID" );
    $sym189$SM_GEN_POINT_NON_INDEXICAL = makeSymbol( "SM-GEN-POINT-NON-INDEXICAL" );
    $sym190$_CSETF_SM_GEN_POINT_NON_INDEXICAL = makeSymbol( "_CSETF-SM-GEN-POINT-NON-INDEXICAL" );
    $sym191$SM_GEN_POINT_ISAS = makeSymbol( "SM-GEN-POINT-ISAS" );
    $sym192$_CSETF_SM_GEN_POINT_ISAS = makeSymbol( "_CSETF-SM-GEN-POINT-ISAS" );
    $sym193$SM_GEN_POINT_GENLS = makeSymbol( "SM-GEN-POINT-GENLS" );
    $sym194$_CSETF_SM_GEN_POINT_GENLS = makeSymbol( "_CSETF-SM-GEN-POINT-GENLS" );
    $sym195$SM_GEN_POINT_POSITIONS = makeSymbol( "SM-GEN-POINT-POSITIONS" );
    $sym196$_CSETF_SM_GEN_POINT_POSITIONS = makeSymbol( "_CSETF-SM-GEN-POINT-POSITIONS" );
    $sym197$SM_GEN_POINT_INDEXICAL_RECORD = makeSymbol( "SM-GEN-POINT-INDEXICAL-RECORD" );
    $sym198$_CSETF_SM_GEN_POINT_INDEXICAL_RECORD = makeSymbol( "_CSETF-SM-GEN-POINT-INDEXICAL-RECORD" );
    $sym199$SM_GEN_POINT_KEYWORD = makeSymbol( "SM-GEN-POINT-KEYWORD" );
    $sym200$_CSETF_SM_GEN_POINT_KEYWORD = makeSymbol( "_CSETF-SM-GEN-POINT-KEYWORD" );
    $kw201$NON_INDEXICAL = makeKeyword( "NON-INDEXICAL" );
    $kw202$POSITIONS = makeKeyword( "POSITIONS" );
    $kw203$INDEXICAL_RECORD = makeKeyword( "INDEXICAL-RECORD" );
    $kw204$KEYWORD = makeKeyword( "KEYWORD" );
    $sym205$MAKE_SM_GEN_POINT = makeSymbol( "MAKE-SM-GEN-POINT" );
    $sym206$VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SM-GEN-POINT-METHOD" );
    $str207$_SC = makeString( ":SC" );
    $str208$the_kind_of_ = makeString( "the kind of " );
    $const209$The = constant_handles.reader_make_constant_shell( makeString( "The" ) );
    $sym210$_ = makeSymbol( "<" );
    $sym211$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $kw212$ISA = makeKeyword( "ISA" );
    $list213 = ConsesLow.list( makeString( "first" ), makeString( "second" ), makeString( "third" ), makeString( "fourth" ), makeString( "fifth" ), makeString( "sixth" ), makeString( "seventh" ) );
    $list214 = ConsesLow.list( makeSymbol( "FIRST-RECORD" ), makeSymbol( "SECOND-RECORD" ) );
    $str215$the_ = makeString( "the " );
    $str216$the_other_ = makeString( "the other " );
    $str217$the_other_kind_of_ = makeString( "the other kind of " );
    $str218$_ = makeString( " " );
    $str219$_kind_of_ = makeString( " kind of " );
    $const220$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym221$SM_INDEXICAL_RECORD_NUMBER = makeSymbol( "SM-INDEXICAL-RECORD-NUMBER" );
    $sym222$CAR = makeSymbol( "CAR" );
    $const223$scenarioTerms = constant_handles.reader_make_constant_shell( makeString( "scenarioTerms" ) );
    $const224$scenarioReferent = constant_handles.reader_make_constant_shell( makeString( "scenarioReferent" ) );
    $const225$scenarioConstraint = constant_handles.reader_make_constant_shell( makeString( "scenarioConstraint" ) );
    $kw226$IGNORE = makeKeyword( "IGNORE" );
    $sym227$SM_SCENARIO_EXPRESSION_OK = makeSymbol( "SM-SCENARIO-EXPRESSION-OK" );
    $sym228$FIND_NART = makeSymbol( "FIND-NART" );
    $sym229$LIST = makeSymbol( "LIST" );
    $const230$termTemplate = constant_handles.reader_make_constant_shell( makeString( "termTemplate" ) );
    $const231$ScenarioTemplate = constant_handles.reader_make_constant_shell( makeString( "ScenarioTemplate" ) );
    $sym232$_EXPR = makeSymbol( "?EXPR" );
    $const233$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const234$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const235$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym236$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const237$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str238$Cycl_formulas_containing__A_canno = makeString( "Cycl formulas containing ~A cannot be used to initialize a scenario." );
    $str239$_A_unexpected_ = makeString( "~A unexpected." );
    $sym240$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $const241$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_ = makeSymbol( "UIA-IS-TERM-A-COLLECTION-IN-ANY-MT?" );
    $sym243$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $const244$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $sym245$SM_INDEXICAL_RECORD_PREFERRED_PHRASE = makeSymbol( "SM-INDEXICAL-RECORD-PREFERRED-PHRASE" );
    $sym246$SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED = makeSymbol( "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED" );
    $sym247$SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED = makeSymbol( "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED" );
    $kw248$NON_WFF = makeKeyword( "NON-WFF" );
    $kw249$OK = makeKeyword( "OK" );
    $sym250$SM_UNRESOLVED_ITEM_FOR_PHRASE = makeSymbol( "SM-UNRESOLVED-ITEM-FOR-PHRASE" );
    $sym251$SM_UNRESOLVED_EQUAL = makeSymbol( "SM-UNRESOLVED-EQUAL" );
    $const252$TheResultOfParsing = constant_handles.reader_make_constant_shell( makeString( "TheResultOfParsing" ) );
    $list253 = ConsesLow.list( makeSymbol( "TOKEN-NUMBERS" ), makeSymbol( "PARSES" ) );
    $const254$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list255 = ConsesLow.list( makeSymbol( "COL-ONE" ), makeSymbol( "COL-OTHER" ) );
    $sym256$SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED = makeSymbol( "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED" );
    $sym257$ALIST_P = makeSymbol( "ALIST-P" );
    $sym258$SECOND = makeSymbol( "SECOND" );
    $list259 = ConsesLow.list( makeSymbol( "NEW-INDEXICAL-RECORD" ), makeSymbol( "OLD-INDEXICAL-RECORD" ) );
    $sym260$SM_GEN_POINT_WITHOUT_POSITIONS_P = makeSymbol( "SM-GEN-POINT-WITHOUT-POSITIONS-P" );
    $sym261$PUNCTUATION_P = makeSymbol( "PUNCTUATION-P" );
    $const262$OptionalSome = constant_handles.reader_make_constant_shell( makeString( "OptionalSome" ) );
    $const263$StringTemplate = constant_handles.reader_make_constant_shell( makeString( "StringTemplate" ) );
    $const264$NumberTemplate = constant_handles.reader_make_constant_shell( makeString( "NumberTemplate" ) );
    $const265$SinkTemplate = constant_handles.reader_make_constant_shell( makeString( "SinkTemplate" ) );
    $sym266$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $const267$PropositionalConceptualWork = constant_handles.reader_make_constant_shell( makeString( "PropositionalConceptualWork" ) );
    $const268$MovieTitleTemplate = constant_handles.reader_make_constant_shell( makeString( "MovieTitleTemplate" ) );
    $const269$Event = constant_handles.reader_make_constant_shell( makeString( "Event" ) );
    $const270$NPTemplate = constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) );
    $const271$SomethingExisting = constant_handles.reader_make_constant_shell( makeString( "SomethingExisting" ) );
    $const272$RequireOne = constant_handles.reader_make_constant_shell( makeString( "RequireOne" ) );
    $const273$OptionalOne = constant_handles.reader_make_constant_shell( makeString( "OptionalOne" ) );
    $const274$ParsingTemplateCategory = constant_handles.reader_make_constant_shell( makeString( "ParsingTemplateCategory" ) );
    $const275$TemplateParsingMt = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) );
    $str276$_ = makeString( "[" );
    $str277$_ = makeString( "]" );
    $str278$Scenario = makeString( "Scenario" );
    $list279 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Scenario-Generalized" ) ) );
    $const280$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list281 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RKFConstant" ) ) );
    $sym282$FIRST = makeSymbol( "FIRST" );
    $sym283$NART_EL_FORMULA = makeSymbol( "NART-EL-FORMULA" );
    $list284 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "SCENARIO" ), constant_handles.reader_make_constant_shell( makeString( "Scenario-Generalized" ) ) );
    $list285 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "ScenarioTemplate" ) ), makeSymbol( "?EXPR" ),
        makeSymbol( "?INSTANCE" ) );
    $sym286$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym287$SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED = makeSymbol( "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED" );
    $sym288$SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED = makeSymbol( "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED" );
    $sym289$SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED = makeSymbol( "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED" );
    $sym290$SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED = makeSymbol( "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED" );
  }

  public static final class $sm_scenario_native
      extends
        SubLStructNative
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

    public $sm_scenario_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$sessions = CommonSymbols.NIL;
      this.$phrase = CommonSymbols.NIL;
      this.$candidate_terms = CommonSymbols.NIL;
      this.$candidate_constraints = CommonSymbols.NIL;
      this.$fort = CommonSymbols.NIL;
      this.$terms = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$templates = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sm_scenario_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$sessions;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$phrase;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$candidate_terms;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$candidate_constraints;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$fort;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$terms;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$templates;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$state;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$sessions = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$phrase = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$candidate_terms = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$candidate_constraints = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$fort = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$terms = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$templates = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$state = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sm_scenario_native.class, $sym5$SM_SCENARIO, $sym6$SM_SCENARIO_P, $list7, $list8, new String[] { "$id", "$sessions", "$phrase", "$candidate_terms",
        "$candidate_constraints", "$fort", "$terms", "$constraints", "$templates", "$state"
      }, $list9, $list10, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sm_scenario_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sm_scenario_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SM-SCENARIO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sm_scenario_p( arg1 );
    }
  }

  public static final class $sm_template_native
      extends
        SubLStructNative
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

    public $sm_template_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$scenario = CommonSymbols.NIL;
      this.$phrase = CommonSymbols.NIL;
      this.$expression = CommonSymbols.NIL;
      this.$param_subs = CommonSymbols.NIL;
      this.$parameters = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sm_template_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$scenario;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$phrase;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$expression;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$param_subs;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$parameters;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$state;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$scenario = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$phrase = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$expression = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$param_subs = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$parameters = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$state = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sm_template_native.class, $sym63$SM_TEMPLATE, $sym54$SM_TEMPLATE_P, $list64, $list65, new String[] { "$id", "$scenario", "$phrase", "$expression", "$param_subs",
        "$parameters", "$constraints", "$state"
      }, $list66, $list67, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sm_template_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sm_template_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SM-TEMPLATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sm_template_p( arg1 );
    }
  }

  public static final class $sm_indexical_record_native
      extends
        SubLStructNative
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

    public $sm_indexical_record_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$indexical = CommonSymbols.NIL;
      this.$phrases = CommonSymbols.NIL;
      this.$var = CommonSymbols.NIL;
      this.$explicit_isas = CommonSymbols.NIL;
      this.$explicit_genls = CommonSymbols.NIL;
      this.$isas = CommonSymbols.NIL;
      this.$genls = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sm_indexical_record_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$indexical;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$phrases;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$var;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$explicit_isas;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$explicit_genls;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$isas;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$genls;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$state;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$indexical = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$phrases = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$var = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$explicit_isas = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$explicit_genls = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$isas = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$genls = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$state = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sm_indexical_record_native.class, $sym96$SM_INDEXICAL_RECORD, $sym52$SM_INDEXICAL_RECORD_P, $list97, $list98, new String[] { "$id", "$indexical", "$phrases", "$var",
        "$explicit_isas", "$explicit_genls", "$isas", "$genls", "$state"
      }, $list99, $list100, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sm_indexical_record_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sm_indexical_record_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SM-INDEXICAL-RECORD-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sm_indexical_record_p( arg1 );
    }
  }

  public static final class $sm_constraint_record_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $sentence;
    public SubLObject $nl_sentence;
    private static final SubLStructDeclNative structDecl;

    public $sm_constraint_record_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$sentence = CommonSymbols.NIL;
      this.$nl_sentence = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sm_constraint_record_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$sentence;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$nl_sentence;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$sentence = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$nl_sentence = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sm_constraint_record_native.class, $sym134$SM_CONSTRAINT_RECORD, $sym53$SM_CONSTRAINT_RECORD_P, $list135, $list136, new String[] { "$id", "$sentence", "$nl_sentence"
      }, $list137, $list138, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sm_constraint_record_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sm_constraint_record_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SM-CONSTRAINT-RECORD-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sm_constraint_record_p( arg1 );
    }
  }

  public static final class $sm_merge_info_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $from_scenario;
    public SubLObject $to_scenario;
    public SubLObject $align_to;
    public SubLObject $align_from;
    public SubLObject $indexical_equivalences;
    private static final SubLStructDeclNative structDecl;

    public $sm_merge_info_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$from_scenario = CommonSymbols.NIL;
      this.$to_scenario = CommonSymbols.NIL;
      this.$align_to = CommonSymbols.NIL;
      this.$align_from = CommonSymbols.NIL;
      this.$indexical_equivalences = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sm_merge_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$from_scenario;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$to_scenario;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$align_to;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$align_from;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$indexical_equivalences;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$from_scenario = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$to_scenario = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$align_to = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$align_from = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$indexical_equivalences = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sm_merge_info_native.class, $sym152$SM_MERGE_INFO, $sym153$SM_MERGE_INFO_P, $list154, $list155, new String[] { "$id", "$from_scenario", "$to_scenario", "$align_to",
        "$align_from", "$indexical_equivalences"
      }, $list156, $list157, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sm_merge_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sm_merge_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SM-MERGE-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sm_merge_info_p( arg1 );
    }
  }

  public static final class $sm_gen_point_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $non_indexical;
    public SubLObject $isas;
    public SubLObject $genls;
    public SubLObject $positions;
    public SubLObject $indexical_record;
    public SubLObject $keyword;
    private static final SubLStructDeclNative structDecl;

    public $sm_gen_point_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$non_indexical = CommonSymbols.NIL;
      this.$isas = CommonSymbols.NIL;
      this.$genls = CommonSymbols.NIL;
      this.$positions = CommonSymbols.NIL;
      this.$indexical_record = CommonSymbols.NIL;
      this.$keyword = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sm_gen_point_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$non_indexical;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$isas;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$genls;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$positions;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$indexical_record;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$keyword;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$non_indexical = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$isas = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$genls = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$positions = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$indexical_record = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$keyword = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sm_gen_point_native.class, $sym179$SM_GEN_POINT, $sym180$SM_GEN_POINT_P, $list181, $list182, new String[] { "$id", "$non_indexical", "$isas", "$genls", "$positions",
        "$indexical_record", "$keyword"
      }, $list183, $list184, $sym11$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sm_gen_point_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sm_gen_point_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SM-GEN-POINT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sm_gen_point_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1583 ms synthetic
 */