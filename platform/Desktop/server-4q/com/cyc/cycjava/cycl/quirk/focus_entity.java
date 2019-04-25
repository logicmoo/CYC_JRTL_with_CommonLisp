package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class focus_entity
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.focus_entity";
  public static final String myFingerPrint = "62c4f9bef1081466a47638d1ed895ed00f021e3b175e49b771073b42ec2850b7";
  private static final SubLSymbol $sym0$FOCUS_ENTITY;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$ANSWERS;
  private static final SubLSymbol $sym4$UNANSWERED_QUESTIONS;
  private static final SubLSymbol $sym5$SALIENT_QUERIES;
  private static final SubLSymbol $sym6$SALIENT_QUERY_JUSTIFICATIONS;
  private static final SubLSymbol $sym7$INFERENCE_POOL_CREATED;
  private static final SubLSymbol $sym8$CONTINUABLE_INFERENCE_POOL;
  private static final SubLSymbol $sym9$ASSERTED_TYPES;
  private static final SubLSymbol $sym10$LEARNED_TYPES;
  private static final SubLSymbol $sym11$TYPES;
  private static final SubLSymbol $sym12$RELEVANT_MT;
  private static final SubLSymbol $sym13$CYC_ENTITY;
  private static final SubLSymbol $sym14$INSTANCE_COUNT;
  private static final SubLSymbol $sym15$SALIENCE_PREDICATES;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$QUERY_PARAMETERS;
  private static final SubLSymbol $kw18$MAX_NUMBER;
  private static final SubLSymbol $kw19$MAX_TIME;
  private static final SubLInteger $int20$200;
  private static final SubLSymbol $kw21$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw22$BLOCK_;
  private static final SubLSymbol $kw23$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw24$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw25$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw26$HL;
  private static final SubLSymbol $kw27$CONTINUABLE_;
  private static final SubLSymbol $kw28$PRODUCTIVITY_LIMIT;
  private static final SubLInteger $int29$2000000;
  private static final SubLSymbol $sym30$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS;
  private static final SubLSymbol $sym31$ISOLATED_P;
  private static final SubLSymbol $sym32$INSTANCE_NUMBER;
  private static final SubLSymbol $sym33$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE;
  private static final SubLSymbol $sym34$ALL_TYPES;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym38$FOCUS_ENTITY_ALL_TYPES_METHOD;
  private static final SubLSymbol $sym39$GENERATE_SALIENT_QUERIES;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym42$KB_INTEGRATE;
  private static final SubLSymbol $sym43$COMPUTE_SALIENT_JUSTIFICATIONS;
  private static final SubLSymbol $sym44$FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym48$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const49$EverythingPSC;
  private static final SubLObject $const50$Person;
  private static final SubLObject $const51$isa;
  private static final SubLObject $const52$PeopleDataMt;
  private static final SubLObject $const53$Organization;
  private static final SubLObject $const54$OrganizationDataMt;
  private static final SubLObject $const55$genls;
  private static final SubLObject $const56$TREC_Mt;
  private static final SubLSymbol $sym57$FOCUS_ENTITY_KB_INTEGRATE_METHOD;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLList $list60;
  private static final SubLString $str61$ci_;
  private static final SubLString $str62$_S;
  private static final SubLSymbol $sym63$CONTINUE_INFERENCE;
  private static final SubLSymbol $sym64$FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD;
  private static final SubLSymbol $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$SUSPENDED;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD;
  private static final SubLSymbol $sym73$GET_SALIENT_QUERIES;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLSymbol $kw76$CURRENT;
  private static final SubLSymbol $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym78$INTEGERP;
  private static final SubLSymbol $kw79$UPDATE;
  private static final SubLSymbol $sym80$CYCL_QUERY_EQUAL_P;
  private static final SubLSymbol $kw81$ALL;
  private static final SubLSymbol $sym82$DONE_COMPUTING_SALIENT_QUERIES;
  private static final SubLSymbol $sym83$FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD;
  private static final SubLSymbol $sym88$ANSWER_SALIENT_QUERIES;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym91$ANSWER;
  private static final SubLSymbol $sym92$FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD;
  private static final SubLSymbol $sym93$TEXTUAL_FOCUS_ENTITY;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$LEARNED_TEXTUAL_TYPES;
  private static final SubLSymbol $sym96$PASSAGES;
  private static final SubLSymbol $sym97$NAME;
  private static final SubLSymbol $sym98$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS;
  private static final SubLSymbol $sym99$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE;
  private static final SubLSymbol $sym100$STRINGP;
  private static final SubLSymbol $sym101$CYCL_EXPRESSION_;
  private static final SubLSymbol $sym102$LISTP;
  private static final SubLSymbol $sym103$ADMISSIBLE_FOCUS_ENTITY_TYPE;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym106$TEXTUAL_FOCUS_ENTITY_NAME_METHOD;
  private static final SubLSymbol $sym107$PRINT;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD;
  private static final SubLString $str111$__ESS_ENT_;
  private static final SubLString $str112$__;
  private static final SubLString $str113$_types__;
  private static final SubLString $str114$_facts__;
  private static final SubLString $str115$_;
  private static final SubLSymbol $sym116$TEXTUAL_FOCUS_ENTITY_PRINT_METHOD;
  private static final SubLList $list117;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym120$TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD;
  private static final SubLSymbol $sym121$TEXTUAL_FOCUS_ENTITY_P;
  private static final SubLSymbol $sym122$CHRONOLOGY;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$RENDER;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $kw131$FORMAT;
  private static final SubLSymbol $kw132$ORDER;
  private static final SubLSymbol $kw133$TEXT;
  private static final SubLString $str134$_;
  private static final SubLSymbol $kw135$SEQUENTIAL;
  private static final SubLSymbol $sym136$JUSTIFY;
  private static final SubLSymbol $sym137$GET_SOURCE;
  private static final SubLString $str138$;
  private static final SubLSymbol $sym139$GET_CONTENT;
  private static final SubLString $str140$_;
  private static final SubLString $str141$_;
  private static final SubLSymbol $kw142$CHRONOLOGICAL;
  private static final SubLSymbol $sym143$ANSWER_OLDER_METHOD;
  private static final SubLSymbol $sym144$TEXTUAL_FOCUS_ENTITY_RENDER_METHOD;
  private static final SubLSymbol $sym145$LEARN_TYPES_FROM_CORPORA;
  private static final SubLList $list146;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD;
  private static final SubLList $list149;
  private static final SubLString $str150$Who_is_;
  private static final SubLString $str151$_;
  private static final SubLString $str152$What_is_;
  private static final SubLSymbol $sym153$TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD;
  private static final SubLSymbol $sym154$ADD_PASSAGE;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD;
  private static final SubLSymbol $sym158$CORPUS_PASSAGE_P;
  private static final SubLSymbol $sym159$PASSAGE_EQUAL;
  private static final SubLSymbol $sym160$TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD;
  private static final SubLSymbol $sym161$INFERENCE_ANSWER_JUSTIFICATION_P;
  private static final SubLSymbol $kw162$ISA;
  private static final SubLObject $const163$thereExists;
  private static final SubLObject $const164$relationExistsInstance;
  private static final SubLObject $const165$relationInstanceExists;
  private static final SubLSymbol $sym166$_WHAT;
  private static final SubLObject $const167$CycKBSubsetCollection;
  private static final SubLObject $const168$CycVocabularyTopic;
  private static final SubLObject $const169$KFDInternalKRTerm;
  private static final SubLObject $const170$MicrotheoryType;
  private static final SubLObject $const171$VocabularyConstrainingAbstraction;
  private static final SubLObject $const172$RelationshipType;
  private static final SubLObject $const173$MIPTMappingConstant;
  private static final SubLObject $const174$DealingWithAStringInNounLearnerTo;
  private static final SubLObject $const175$LexicalItem;
  private static final SubLObject $const176$QAClarifyingCollectionType;
  private static final SubLObject $const177$BBNEntityType;
  private static final SubLObject $const178$Individual;
  private static final SubLObject $const179$PotentiallyPornRelated;
  private static final SubLObject $const180$PersonTypeByGender;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_answers(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, ELEVEN_INTEGER, $sym3$ANSWERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_answers(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, ELEVEN_INTEGER, $sym3$ANSWERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_unanswered_questions(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, TEN_INTEGER, $sym4$UNANSWERED_QUESTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_unanswered_questions(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, TEN_INTEGER, $sym4$UNANSWERED_QUESTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_salient_queries(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, NINE_INTEGER, $sym5$SALIENT_QUERIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_salient_queries(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, NINE_INTEGER, $sym5$SALIENT_QUERIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_salient_query_justifications(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, EIGHT_INTEGER, $sym6$SALIENT_QUERY_JUSTIFICATIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_salient_query_justifications(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, EIGHT_INTEGER, $sym6$SALIENT_QUERY_JUSTIFICATIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_inference_pool_created(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, SEVEN_INTEGER, $sym7$INFERENCE_POOL_CREATED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_inference_pool_created(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, SEVEN_INTEGER, $sym7$INFERENCE_POOL_CREATED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_continuable_inference_pool(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, SIX_INTEGER, $sym8$CONTINUABLE_INFERENCE_POOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_continuable_inference_pool(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, SIX_INTEGER, $sym8$CONTINUABLE_INFERENCE_POOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_asserted_types(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, FIVE_INTEGER, $sym9$ASSERTED_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_asserted_types(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, FIVE_INTEGER, $sym9$ASSERTED_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_learned_types(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, FOUR_INTEGER, $sym10$LEARNED_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_learned_types(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, FOUR_INTEGER, $sym10$LEARNED_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_types(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, THREE_INTEGER, $sym11$TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_types(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, THREE_INTEGER, $sym11$TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_relevant_mt(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, TWO_INTEGER, $sym12$RELEVANT_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_relevant_mt(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, TWO_INTEGER, $sym12$RELEVANT_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_cyc_entity(final SubLObject v_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( v_focus_entity, ONE_INTEGER, $sym13$CYC_ENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_cyc_entity(final SubLObject v_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_focus_entity, value, ONE_INTEGER, $sym13$CYC_ENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_query_parameters(final SubLObject v_focus_entity)
  {
    final SubLObject v_class = v_focus_entity.isSymbol() ? classes.classes_retrieve_class( v_focus_entity )
        : ( ( NIL != subloop_structures.class_p( v_focus_entity ) ) ? v_focus_entity : ( ( NIL != subloop_structures.instance_p( v_focus_entity ) ) ? subloop_structures.instance_class( v_focus_entity ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_query_parameters(final SubLObject v_focus_entity, final SubLObject value)
  {
    final SubLObject v_class = v_focus_entity.isSymbol() ? classes.classes_retrieve_class( v_focus_entity )
        : ( ( NIL != subloop_structures.class_p( v_focus_entity ) ) ? v_focus_entity : ( ( NIL != subloop_structures.instance_p( v_focus_entity ) ) ? subloop_structures.instance_class( v_focus_entity ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject get_focus_entity_salience_predicates(final SubLObject v_focus_entity)
  {
    final SubLObject v_class = v_focus_entity.isSymbol() ? classes.classes_retrieve_class( v_focus_entity )
        : ( ( NIL != subloop_structures.class_p( v_focus_entity ) ) ? v_focus_entity : ( ( NIL != subloop_structures.instance_p( v_focus_entity ) ) ? subloop_structures.instance_class( v_focus_entity ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject set_focus_entity_salience_predicates(final SubLObject v_focus_entity, final SubLObject value)
  {
    final SubLObject v_class = v_focus_entity.isSymbol() ? classes.classes_retrieve_class( v_focus_entity )
        : ( ( NIL != subloop_structures.class_p( v_focus_entity ) ) ? v_focus_entity : ( ( NIL != subloop_structures.instance_p( v_focus_entity ) ) ? subloop_structures.instance_class( v_focus_entity ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject subloop_reserved_initialize_focus_entity_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym15$SALIENCE_PREDICATES, $list16 );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym17$QUERY_PARAMETERS, ConsesLow.list( new SubLObject[] { $kw18$MAX_NUMBER, FIVE_INTEGER, $kw19$MAX_TIME, $int20$200,
      $kw21$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw22$BLOCK_, NIL, $kw23$MAX_PROOF_DEPTH, NIL, $kw24$CACHE_INFERENCE_RESULTS_, NIL, $kw25$ANSWER_LANGUAGE, $kw26$HL, $kw27$CONTINUABLE_, T, $kw28$PRODUCTIVITY_LIMIT,
      $int29$2000000
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject subloop_reserved_initialize_focus_entity_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym31$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym32$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym13$CYC_ENTITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym12$RELEVANT_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym11$TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym10$LEARNED_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym9$ASSERTED_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym8$CONTINUABLE_INFERENCE_POOL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym7$INFERENCE_POOL_CREATED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym6$SALIENT_QUERY_JUSTIFICATIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym5$SALIENT_QUERIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym4$UNANSWERED_QUESTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym3$ANSWERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
  public static SubLObject focus_entity_p(final SubLObject v_focus_entity)
  {
    return classes.subloop_instanceof_class( v_focus_entity, $sym0$FOCUS_ENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 3195L)
  public static SubLObject focus_entity_all_types_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    final SubLObject learned_types = get_focus_entity_learned_types( self );
    final SubLObject types = get_focus_entity_types( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        final SubLObject raw = conses_high.union( types, learned_types, UNPROVIDED, UNPROVIDED );
        SubLObject organized = NIL;
        SubLObject cdolist_list_var = raw;
        SubLObject candidate_type = NIL;
        candidate_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject fail = NIL;
          if( NIL == fail )
          {
            SubLObject csome_list_var;
            SubLObject existing_type;
            for( csome_list_var = organized, existing_type = NIL, existing_type = csome_list_var.first(); NIL == fail && NIL != csome_list_var; fail = genls.genl_in_any_mtP( existing_type,
                candidate_type ), csome_list_var = csome_list_var.rest(), existing_type = csome_list_var.first() )
            {
            }
          }
          if( NIL == fail )
          {
            organized = ConsesLow.cons( candidate_type, organized );
          }
          cdolist_list_var = cdolist_list_var.rest();
          candidate_type = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, organized );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_learned_types( self, learned_types );
          set_focus_entity_types( self, types );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 3649L)
  public static SubLObject focus_entity_generate_salient_queries_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    SubLObject inference_pool_created = get_focus_entity_inference_pool_created( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        methods.funcall_instance_method_with_0_args( self, $sym42$KB_INTEGRATE );
        methods.funcall_instance_method_with_0_args( self, $sym43$COMPUTE_SALIENT_JUSTIFICATIONS );
        inference_pool_created = T;
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_inference_pool_created( self, inference_pool_created );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 4007L)
  public static SubLObject focus_entity_kb_integrate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    SubLObject asserted_types = get_focus_entity_asserted_types( self );
    final SubLObject types = get_focus_entity_types( self );
    final SubLObject cyc_entity = get_focus_entity_cyc_entity( self );
    try
    {
      thread.throwStack.push( $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        final SubLObject all_types = methods.funcall_instance_method_with_0_args( self, $sym34$ALL_TYPES );
        SubLObject min_types = NIL;
        SubLObject pred = NIL;
        SubLObject mt = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym48$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const49$EverythingPSC, thread );
          min_types = genls.min_cols( all_types, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        if( NIL != conses_high.member( $const50$Person, types, UNPROVIDED, UNPROVIDED ) )
        {
          pred = $const51$isa;
          mt = $const52$PeopleDataMt;
        }
        else if( NIL != conses_high.member( $const53$Organization, types, UNPROVIDED, UNPROVIDED ) )
        {
          pred = $const51$isa;
          mt = $const54$OrganizationDataMt;
        }
        else if( NIL != fort_types_interface.collectionP( cyc_entity ) )
        {
          pred = $const55$genls;
          mt = $const56$TREC_Mt;
        }
        SubLObject cdolist_list_var = min_types;
        SubLObject m_type = NIL;
        m_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject assertion = ConsesLow.list( pred, cyc_entity, m_type );
          final SubLObject wff_test = wff.el_wffP( assertion, mt, UNPROVIDED );
          final SubLObject success = ( NIL != wff_test ) ? cyc_kernel.cyc_assert( assertion, mt, UNPROVIDED ) : NIL;
          if( NIL != success )
          {
            asserted_types = ConsesLow.cons( m_type, asserted_types );
          }
          cdolist_list_var = cdolist_list_var.rest();
          m_type = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_asserted_types( self, asserted_types );
          set_focus_entity_types( self, types );
          set_focus_entity_cyc_entity( self, cyc_entity );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 4840L)
  public static SubLObject focus_entity_compute_salient_justifications_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    final SubLObject query_parameters = get_focus_entity_query_parameters( self );
    final SubLObject salience_predicates = get_focus_entity_salience_predicates( self );
    SubLObject continuable_inference_pool = get_focus_entity_continuable_inference_pool( self );
    final SubLObject cyc_entity = get_focus_entity_cyc_entity( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        if( NIL == cyc_entity )
        {
          Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self );
        }
        SubLObject cdolist_list_var = salience_predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject cont_inf = inference_kernel.new_continuable_inference( ConsesLow.listS( pred, cyc_entity, $list60 ), $const49$EverythingPSC, UNPROVIDED );
          final SubLObject cont_inf_string = Sequences.cconcatenate( $str61$ci_, PrintLow.format( NIL, $str62$_S, Symbols.gensym( UNPROVIDED ) ) );
          final SubLObject task = process_utilities.new_task( cont_inf_string, $sym63$CONTINUE_INFERENCE, ConsesLow.list( cont_inf, query_parameters ), UNPROVIDED );
          continuable_inference_pool = ConsesLow.cons( ConsesLow.list( task, cont_inf ), continuable_inference_pool );
          cdolist_list_var = cdolist_list_var.rest();
          pred = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_query_parameters( self, query_parameters );
          set_focus_entity_salience_predicates( self, salience_predicates );
          set_focus_entity_continuable_inference_pool( self, continuable_inference_pool );
          set_focus_entity_cyc_entity( self, cyc_entity );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 5489L)
  public static SubLObject focus_entity_harvest_queries_from_inference_pool_method(final SubLObject self, final SubLObject specificity)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    SubLObject continuable_inference_pool = get_focus_entity_continuable_inference_pool( self );
    final SubLObject types = get_focus_entity_types( self );
    final SubLObject cyc_entity = get_focus_entity_cyc_entity( self );
    try
    {
      thread.throwStack.push( $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        SubLObject cycl_queries = NIL;
        SubLObject new_inference_pool = NIL;
        SubLObject cdolist_list_var = continuable_inference_pool;
        SubLObject inference_task = NIL;
        inference_task = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = inference_task;
          SubLObject task = NIL;
          SubLObject inference = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
          task = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
          inference = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != inference_datastructures_inference.inference_p( inference ) && inference_datastructures_inference.inference_status( inference ) == $kw70$SUSPENDED )
            {
              final SubLObject inf = inference;
              final SubLObject start_id = inference_datastructures_inference.inference_new_answer_id_start( inference );
              SubLObject end_id;
              SubLObject id;
              SubLObject v_answer;
              SubLObject salient_answer;
              SubLObject cdolist_list_var_$1;
              SubLObject justification;
              SubLObject cdolist_list_var_$2;
              SubLObject v_bindings;
              SubLObject binding;
              SubLObject var;
              SubLObject bind;
              SubLObject query;
              SubLObject query_pred;
              for( end_id = inference_datastructures_inference.inference_next_new_answer_id( inference ), id = NIL, id = start_id; !id.numGE( end_id ); id = number_utilities.f_1X( id ) )
              {
                v_answer = inference_datastructures_inference.find_inference_answer_by_id( inf, id );
                salient_answer = Numbers.zerop( specificity );
                cdolist_list_var_$1 = inference_datastructures_inference.inference_answer_justifications( v_answer );
                justification = NIL;
                justification = cdolist_list_var_$1.first();
                while ( NIL != cdolist_list_var_$1)
                {
                  if( NIL == salient_answer )
                  {
                    salient_answer = entity_specific_justification_p( cyc_entity, types, justification, specificity );
                  }
                  cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                  justification = cdolist_list_var_$1.first();
                }
                if( NIL != salient_answer )
                {
                  v_bindings = ( cdolist_list_var_$2 = inference_datastructures_inference.inference_answer_bindings( v_answer ) );
                  binding = NIL;
                  binding = cdolist_list_var_$2.first();
                  while ( NIL != cdolist_list_var_$2)
                  {
                    var = binding.first();
                    bind = binding.rest();
                    query = NIL;
                    if( bind.isCons() )
                    {
                      query = unpack_existential_query( bind, cyc_entity );
                    }
                    if( NIL != query )
                    {
                      query_pred = cycl_utilities.formula_arg0( query );
                      if( NIL == subl_promotions.memberP( query_pred, $list71, UNPROVIDED, UNPROVIDED ) )
                      {
                        cycl_queries = ConsesLow.cons( search_engine.new_cycl_query( query, UNPROVIDED, UNPROVIDED ), cycl_queries );
                      }
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    binding = cdolist_list_var_$2.first();
                  }
                }
              }
              if( NIL != process_utilities.task_process( task ) )
              {
                Threads.kill_process( process_utilities.task_process( task ) );
              }
              inference_datastructures_inference.destroy_inference( inference );
            }
            else if( NIL != inference_datastructures_inference.inference_p( inference ) )
            {
              new_inference_pool = ConsesLow.cons( inference_task, new_inference_pool );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          inference_task = cdolist_list_var.first();
        }
        continuable_inference_pool = new_inference_pool;
        Dynamic.sublisp_throw( $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, cycl_queries );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_continuable_inference_pool( self, continuable_inference_pool );
          set_focus_entity_types( self, types );
          set_focus_entity_cyc_entity( self, cyc_entity );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 6967L)
  public static SubLObject focus_entity_get_salient_queries_method(final SubLObject self, SubLObject completeness, SubLObject specificity)
  {
    if( completeness == UNPROVIDED )
    {
      completeness = $kw76$CURRENT;
    }
    if( specificity == UNPROVIDED )
    {
      specificity = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    SubLObject salient_queries = get_focus_entity_salient_queries( self );
    try
    {
      thread.throwStack.push( $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        assert NIL != Types.integerp( specificity ) : specificity;
        final SubLObject pcase_var = completeness;
        if( pcase_var.eql( $kw76$CURRENT ) )
        {
          Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, salient_queries );
        }
        else if( pcase_var.eql( $kw79$UPDATE ) )
        {
          final SubLObject latest = methods.funcall_instance_method_with_1_args( self, $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity );
          SubLObject update = salient_queries;
          SubLObject cdolist_list_var = latest;
          SubLObject l = NIL;
          l = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var = l;
            if( NIL == conses_high.member( item_var, update, $sym80$CYCL_QUERY_EQUAL_P, Symbols.symbol_function( IDENTITY ) ) )
            {
              update = ConsesLow.cons( item_var, update );
            }
            cdolist_list_var = cdolist_list_var.rest();
            l = cdolist_list_var.first();
          }
          salient_queries = update;
          Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update );
        }
        else if( pcase_var.eql( $kw81$ALL ) )
        {
          SubLObject update2 = salient_queries;
          SubLObject latest2 = NIL;
          while ( NIL == methods.funcall_instance_method_with_0_args( self, $sym82$DONE_COMPUTING_SALIENT_QUERIES ))
          {
            Threads.sleep( ONE_INTEGER );
          }
          SubLObject cdolist_list_var;
          latest2 = ( cdolist_list_var = methods.funcall_instance_method_with_1_args( self, $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity ) );
          SubLObject l = NIL;
          l = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var = l;
            if( NIL == conses_high.member( item_var, update2, $sym80$CYCL_QUERY_EQUAL_P, Symbols.symbol_function( IDENTITY ) ) )
            {
              update2 = ConsesLow.cons( item_var, update2 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            l = cdolist_list_var.first();
          }
          salient_queries = update2;
          Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update2 );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_salient_queries( self, salient_queries );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 8392L)
  public static SubLObject focus_entity_done_computing_salient_queries_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    final SubLObject continuable_inference_pool = get_focus_entity_continuable_inference_pool( self );
    try
    {
      thread.throwStack.push( $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        SubLObject still_working = NIL;
        if( NIL == still_working )
        {
          SubLObject csome_list_var = continuable_inference_pool;
          SubLObject inference_task = NIL;
          inference_task = csome_list_var.first();
          while ( NIL == still_working && NIL != csome_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = inference_task;
            SubLObject task = NIL;
            SubLObject inference = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
            task = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
            inference = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL != inference_datastructures_inference.inference_p( inference ) )
              {
                final SubLObject status = inference_datastructures_inference.inference_status( inference );
                still_working = conses_high.member( status, $list86, UNPROVIDED, UNPROVIDED );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
            }
            csome_list_var = csome_list_var.rest();
            inference_task = csome_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, makeBoolean( NIL == still_working ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_continuable_inference_pool( self, continuable_inference_pool );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 8962L)
  public static SubLObject focus_entity_answer_salient_queries_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_focus_entity_method = NIL;
    SubLObject answers = get_focus_entity_answers( self );
    SubLObject unanswered_questions = get_focus_entity_unanswered_questions( self );
    final SubLObject salient_queries = get_focus_entity_salient_queries( self );
    try
    {
      thread.throwStack.push( $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
      try
      {
        final SubLObject _prev_bind_0 = control_vars.$ask_quirkP$.currentBinding( thread );
        try
        {
          control_vars.$ask_quirkP$.bind( T, thread );
          SubLObject cdolist_list_var = salient_queries;
          SubLObject query = NIL;
          query = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject local_answers = methods.funcall_instance_method_with_0_args( query, $sym91$ANSWER );
            if( NIL == local_answers )
            {
              unanswered_questions = ConsesLow.cons( query, unanswered_questions );
            }
            SubLObject cdolist_list_var_$3 = local_answers;
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              answers = ConsesLow.cons( v_answer, answers );
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              v_answer = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
          }
        }
        finally
        {
          control_vars.$ask_quirkP$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_focus_entity_answers( self, answers );
          set_focus_entity_unanswered_questions( self, unanswered_questions );
          set_focus_entity_salient_queries( self, salient_queries );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject get_textual_focus_entity_learned_textual_types(final SubLObject textual_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( textual_focus_entity, FOURTEEN_INTEGER, $sym95$LEARNED_TEXTUAL_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject set_textual_focus_entity_learned_textual_types(final SubLObject textual_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( textual_focus_entity, value, FOURTEEN_INTEGER, $sym95$LEARNED_TEXTUAL_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject get_textual_focus_entity_passages(final SubLObject textual_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( textual_focus_entity, THIRTEEN_INTEGER, $sym96$PASSAGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject set_textual_focus_entity_passages(final SubLObject textual_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( textual_focus_entity, value, THIRTEEN_INTEGER, $sym96$PASSAGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject get_textual_focus_entity_name(final SubLObject textual_focus_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( textual_focus_entity, TWELVE_INTEGER, $sym97$NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject set_textual_focus_entity_name(final SubLObject textual_focus_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( textual_focus_entity, value, TWELVE_INTEGER, $sym97$NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject subloop_reserved_initialize_textual_focus_entity_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym15$SALIENCE_PREDICATES, $list16 );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym17$QUERY_PARAMETERS, ConsesLow.list( new SubLObject[] { $kw18$MAX_NUMBER, FIVE_INTEGER, $kw19$MAX_TIME, $int20$200,
      $kw21$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw22$BLOCK_, NIL, $kw23$MAX_PROOF_DEPTH, NIL, $kw24$CACHE_INFERENCE_RESULTS_, NIL, $kw25$ANSWER_LANGUAGE, $kw26$HL, $kw27$CONTINUABLE_, T, $kw28$PRODUCTIVITY_LIMIT,
      $int29$2000000
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject subloop_reserved_initialize_textual_focus_entity_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym31$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym32$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym13$CYC_ENTITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym12$RELEVANT_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym11$TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym10$LEARNED_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym9$ASSERTED_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym8$CONTINUABLE_INFERENCE_POOL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym7$INFERENCE_POOL_CREATED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym6$SALIENT_QUERY_JUSTIFICATIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym5$SALIENT_QUERIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym4$UNANSWERED_QUESTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$FOCUS_ENTITY, $sym3$ANSWERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym93$TEXTUAL_FOCUS_ENTITY, $sym97$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym93$TEXTUAL_FOCUS_ENTITY, $sym96$PASSAGES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym93$TEXTUAL_FOCUS_ENTITY, $sym95$LEARNED_TEXTUAL_TYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
  public static SubLObject textual_focus_entity_p(final SubLObject textual_focus_entity)
  {
    return classes.subloop_instanceof_class( textual_focus_entity, $sym93$TEXTUAL_FOCUS_ENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9976L)
  public static SubLObject new_textual_focus_entity(final SubLObject name, final SubLObject cyc_entity, SubLObject types)
  {
    if( types == UNPROVIDED )
    {
      types = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( name ) : name;
    assert NIL != collection_defns.cycl_expressionP( cyc_entity ) : cyc_entity;
    assert NIL != Types.listp( types ) : types;
    final SubLObject v_new = object.new_class_instance( $sym93$TEXTUAL_FOCUS_ENTITY );
    SubLObject minimal_types = types;
    SubLObject recoverable_types = NIL;
    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym48$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const49$EverythingPSC, thread );
      recoverable_types = isa.min_isa( cyc_entity, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym48$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const49$EverythingPSC, thread );
      minimal_types = genls.min_cols( conses_high.union( recoverable_types, types, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    instances.set_slot( v_new, $sym97$NAME, name );
    instances.set_slot( v_new, $sym13$CYC_ENTITY, cyc_entity );
    instances.set_slot( v_new, $sym11$TYPES, list_utilities.remove_if_not( $sym103$ADMISSIBLE_FOCUS_ENTITY_TYPE, minimal_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 10800L)
  public static SubLObject textual_focus_entity_name_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_textual_focus_entity_method = NIL;
    final SubLObject name = get_textual_focus_entity_name( self );
    try
    {
      thread.throwStack.push( $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, name );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_textual_focus_entity_name( self, name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_textual_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_textual_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 10875L)
  public static SubLObject textual_focus_entity_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_textual_focus_entity_method = NIL;
    final SubLObject name = get_textual_focus_entity_name( self );
    final SubLObject answers = get_focus_entity_answers( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
      try
      {
        streams_high.write_string( $str111$__ESS_ENT_, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( instance_number, stream );
        streams_high.write_string( $str112$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( name, stream );
        streams_high.write_string( $str113$_types__, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( Sequences.length( methods.funcall_instance_method_with_0_args( self, $sym34$ALL_TYPES ) ), stream );
        streams_high.write_string( $str114$_facts__, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( Sequences.length( answers ), stream );
        streams_high.write_string( $str115$_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( stream );
        Dynamic.sublisp_throw( $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_textual_focus_entity_name( self, name );
          set_focus_entity_answers( self, answers );
          object.set_object_instance_number( self, instance_number );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_textual_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_textual_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11302L)
  public static SubLObject textual_focus_entity_equal_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_textual_focus_entity_method = NIL;
    final SubLObject name = get_textual_focus_entity_name( self );
    try
    {
      thread.throwStack.push( $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, makeBoolean( NIL != textual_focus_entity_p( v_object ) && name.equal( methods.funcall_instance_method_with_0_args( v_object,
            $sym97$NAME ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_textual_focus_entity_name( self, name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_textual_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_textual_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11535L)
  public static SubLObject textual_focus_entity_equal(final SubLObject e1, final SubLObject e2)
  {
    assert NIL != textual_focus_entity_p( e1 ) : e1;
    assert NIL != textual_focus_entity_p( e2 ) : e2;
    return methods.funcall_instance_method_with_1_args( e1, EQUAL, e2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11696L)
  public static SubLObject textual_focus_entity_chronology_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_1_args( self, $sym124$RENDER, $list125 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11928L)
  public static SubLObject textual_focus_entity_render_method(final SubLObject self, SubLObject strategy)
  {
    if( strategy == UNPROVIDED )
    {
      strategy = $list129;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_textual_focus_entity_method = NIL;
    final SubLObject name = get_textual_focus_entity_name( self );
    final SubLObject answers = get_focus_entity_answers( self );
    try
    {
      thread.throwStack.push( $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
      try
      {
        final SubLObject format = conses_high.getf( strategy, $kw131$FORMAT, UNPROVIDED );
        final SubLObject order = conses_high.getf( strategy, $kw132$ORDER, UNPROVIDED );
        SubLObject accumulator = NIL;
        SubLObject pcase_var = format;
        if( pcase_var.eql( $kw133$TEXT ) )
        {
          accumulator = Sequences.cconcatenate( name, new SubLObject[] { $str134$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue()
          } );
        }
        pcase_var = order;
        if( pcase_var.eql( $kw135$SEQUENTIAL ) )
        {
          SubLObject cdolist_list_var = answers;
          SubLObject v_answer = NIL;
          v_answer = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject justification = methods.funcall_instance_method_with_0_args( v_answer, $sym136$JUSTIFY );
            final SubLObject source = ( NIL != search_engine.corpus_passage_p( justification ) ) ? methods.funcall_instance_method_with_0_args( justification, $sym137$GET_SOURCE ) : $str138$;
            accumulator = Sequences.cconcatenate( accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args( v_answer, $sym139$GET_CONTENT ), string_utilities.$new_line_string$.getGlobalValue(),
              $str140$_, source, $str141$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue()
            } );
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
          }
        }
        else if( pcase_var.eql( $kw142$CHRONOLOGICAL ) )
        {
          SubLObject cdolist_list_var2;
          final SubLObject sorted = cdolist_list_var2 = Sort.sort( conses_high.copy_list( answers ), $sym143$ANSWER_OLDER_METHOD, UNPROVIDED );
          SubLObject v_answer2 = NIL;
          v_answer2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            final SubLObject justification2 = methods.funcall_instance_method_with_0_args( v_answer2, $sym136$JUSTIFY );
            final SubLObject source2 = ( NIL != search_engine.corpus_passage_p( justification2 ) ) ? methods.funcall_instance_method_with_0_args( justification2, $sym137$GET_SOURCE ) : $str138$;
            accumulator = Sequences.cconcatenate( accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args( v_answer2, $sym139$GET_CONTENT ), string_utilities.$new_line_string$.getGlobalValue(),
              $str140$_, source2, $str141$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue()
            } );
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_answer2 = cdolist_list_var2.first();
          }
        }
        Dynamic.sublisp_throw( $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, accumulator );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_textual_focus_entity_name( self, name );
          set_focus_entity_answers( self, answers );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_textual_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_textual_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 13164L)
  public static SubLObject textual_focus_entity_learn_types_from_corpora_method(final SubLObject self, final SubLObject corpora)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_textual_focus_entity_method = NIL;
    final SubLObject name = get_textual_focus_entity_name( self );
    SubLObject answers = get_focus_entity_answers( self );
    SubLObject unanswered_questions = get_focus_entity_unanswered_questions( self );
    SubLObject learned_types = get_focus_entity_learned_types( self );
    try
    {
      thread.throwStack.push( $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
      try
      {
        assert NIL != Types.listp( corpora ) : corpora;
        SubLObject current_types = methods.funcall_instance_method_with_0_args( self, $sym34$ALL_TYPES );
        SubLObject local_answers = NIL;
        SubLObject who_type = NIL;
        SubLObject v_question = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym48$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const49$EverythingPSC, thread );
          who_type = genls.any_genl_anyP( current_types, $list149, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        if( NIL != who_type )
        {
          v_question = question.new_question( Sequences.cconcatenate( $str150$Who_is_, new SubLObject[] { name, $str151$_
          } ), UNPROVIDED, UNPROVIDED );
        }
        else
        {
          v_question = question.new_question( Sequences.cconcatenate( $str152$What_is_, new SubLObject[] { name, $str151$_
          } ), UNPROVIDED, UNPROVIDED );
        }
        if( NIL != v_question )
        {
          local_answers = methods.funcall_instance_method_with_0_args( v_question, $sym91$ANSWER );
        }
        if( NIL == local_answers )
        {
          unanswered_questions = ConsesLow.cons( v_question, unanswered_questions );
        }
        SubLObject cdolist_list_var = local_answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          answers = ConsesLow.cons( v_answer, answers );
          final SubLObject _prev_bind_3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
          try
          {
            parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
            SubLObject cdolist_list_var_$4;
            final SubLObject denots = cdolist_list_var_$4 = psp_main.ps_get_cycls_for_np( methods.funcall_instance_method_with_0_args( v_answer, $sym139$GET_CONTENT ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject denot = NIL;
            denot = cdolist_list_var_$4.first();
            while ( NIL != cdolist_list_var_$4)
            {
              SubLObject fail = NIL;
              if( NIL == fail )
              {
                SubLObject csome_list_var = current_types;
                SubLObject type = NIL;
                type = csome_list_var.first();
                while ( NIL == fail && NIL != csome_list_var)
                {
                  final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym48$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const49$EverythingPSC, thread );
                    fail = disjoint_with.collections_disjointP( denot, type, UNPROVIDED );
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$5, thread );
                  }
                  csome_list_var = csome_list_var.rest();
                  type = csome_list_var.first();
                }
              }
              if( NIL == fail )
              {
                current_types = ConsesLow.cons( denot, current_types );
                learned_types = ConsesLow.cons( denot, learned_types );
              }
              cdolist_list_var_$4 = cdolist_list_var_$4.rest();
              denot = cdolist_list_var_$4.first();
            }
          }
          finally
          {
            parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_3, thread );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_answer = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_textual_focus_entity_name( self, name );
          set_focus_entity_answers( self, answers );
          set_focus_entity_unanswered_questions( self, unanswered_questions );
          set_focus_entity_learned_types( self, learned_types );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_textual_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_textual_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 14383L)
  public static SubLObject textual_focus_entity_add_passage_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_textual_focus_entity_method = NIL;
    SubLObject passages = get_textual_focus_entity_passages( self );
    try
    {
      thread.throwStack.push( $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
      try
      {
        assert NIL != search_engine.corpus_passage_p( passage ) : passage;
        if( NIL == conses_high.member( passage, passages, $sym159$PASSAGE_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          passages = ConsesLow.cons( passage, passages );
        }
        Dynamic.sublisp_throw( $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_textual_focus_entity_passages( self, passages );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_textual_focus_entity_method = Errors.handleThrowable( ccatch_env_var, $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_textual_focus_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 14729L)
  public static SubLObject entity_specific_justification_p(final SubLObject entity, final SubLObject types, final SubLObject justification, final SubLObject threshold)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_answer_justification_p( justification ) : justification;
    SubLObject degrees_of_separation = ZERO_INTEGER;
    final SubLObject justification_steps = inference_datastructures_inference.inference_answer_justification_supports( justification );
    SubLObject broader_than_type = NIL;
    if( NIL == broader_than_type )
    {
      SubLObject csome_list_var = types;
      SubLObject type = NIL;
      type = csome_list_var.first();
      while ( NIL == broader_than_type && NIL != csome_list_var)
      {
        if( NIL == broader_than_type )
        {
          SubLObject csome_list_var_$6 = justification_steps;
          SubLObject step = NIL;
          step = csome_list_var_$6.first();
          while ( NIL == broader_than_type && NIL != csome_list_var_$6)
          {
            if( step.isCons() && $kw162$ISA == step.first() )
            {
              final SubLObject gaf = conses_high.second( step );
              final SubLObject arg1 = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
              final SubLObject arg2 = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
              if( entity.equal( arg1 ) )
              {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
                try
                {
                  mt_relevance_macros.$relevant_mt_function$.bind( $sym48$RELEVANT_MT_IS_EVERYTHING, thread );
                  mt_relevance_macros.$mt$.bind( $const49$EverythingPSC, thread );
                  broader_than_type = makeBoolean( !type.eql( arg2 ) && NIL != genls.genlP( type, arg2, UNPROVIDED, UNPROVIDED ) );
                  degrees_of_separation = Sequences.length( isa.why_isaP( entity, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                }
                finally
                {
                  mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
                  mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
                }
              }
            }
            csome_list_var_$6 = csome_list_var_$6.rest();
            step = csome_list_var_$6.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        type = csome_list_var.first();
      }
    }
    if( NIL != broader_than_type )
    {
      return NIL;
    }
    if( degrees_of_separation.numG( threshold ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 16263L)
  public static SubLObject unpack_existential_query(final SubLObject formula, final SubLObject entity)
  {
    final SubLObject operator = cycl_utilities.formula_operator( formula );
    if( $const163$thereExists.eql( operator ) )
    {
      return cycl_utilities.formula_arg2( formula, UNPROVIDED );
    }
    if( $const164$relationExistsInstance.eql( operator ) || $const165$relationInstanceExists.eql( operator ) )
    {
      final SubLObject pred = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      final SubLObject arg1 = cycl_utilities.formula_arg2( formula, UNPROVIDED ).equal( entity ) ? entity : $sym166$_WHAT;
      final SubLObject arg2 = cycl_utilities.formula_arg3( formula, UNPROVIDED ).equal( entity ) ? entity : $sym166$_WHAT;
      return ConsesLow.list( pred, arg1, arg2 );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 16783L)
  public static SubLObject admissible_focus_entity_type(final SubLObject cyc_expression)
  {
    if( NIL != isa.isa_in_any_mtP( cyc_expression, $const167$CycKBSubsetCollection ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cyc_expression, $const168$CycVocabularyTopic ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cyc_expression, $const169$KFDInternalKRTerm ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cyc_expression, $const170$MicrotheoryType ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cyc_expression, $const171$VocabularyConstrainingAbstraction ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cyc_expression, $const172$RelationshipType ) )
    {
      return NIL;
    }
    if( NIL != isa.quoted_isa_in_any_mtP( cyc_expression, $const173$MIPTMappingConstant ) )
    {
      return NIL;
    }
    if( NIL != genls.genl_in_any_mtP( cyc_expression, $const174$DealingWithAStringInNounLearnerTo ) )
    {
      return NIL;
    }
    if( NIL != genls.genl_in_any_mtP( cyc_expression, $const175$LexicalItem ) )
    {
      return NIL;
    }
    if( cyc_expression.eql( $const176$QAClarifyingCollectionType ) )
    {
      return NIL;
    }
    if( cyc_expression.eql( $const177$BBNEntityType ) )
    {
      return NIL;
    }
    if( cyc_expression.eql( $const178$Individual ) )
    {
      return NIL;
    }
    if( cyc_expression.eql( $const179$PotentiallyPornRelated ) )
    {
      return NIL;
    }
    if( cyc_expression.eql( $const180$PersonTypeByGender ) )
    {
      return NIL;
    }
    return T;
  }

  public static SubLObject declare_focus_entity_file()
  {
    SubLFiles.declareFunction( me, "get_focus_entity_answers", "GET-FOCUS-ENTITY-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_answers", "SET-FOCUS-ENTITY-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_unanswered_questions", "GET-FOCUS-ENTITY-UNANSWERED-QUESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_unanswered_questions", "SET-FOCUS-ENTITY-UNANSWERED-QUESTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_salient_queries", "GET-FOCUS-ENTITY-SALIENT-QUERIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_salient_queries", "SET-FOCUS-ENTITY-SALIENT-QUERIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_salient_query_justifications", "GET-FOCUS-ENTITY-SALIENT-QUERY-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_salient_query_justifications", "SET-FOCUS-ENTITY-SALIENT-QUERY-JUSTIFICATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_inference_pool_created", "GET-FOCUS-ENTITY-INFERENCE-POOL-CREATED", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_inference_pool_created", "SET-FOCUS-ENTITY-INFERENCE-POOL-CREATED", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_continuable_inference_pool", "GET-FOCUS-ENTITY-CONTINUABLE-INFERENCE-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_continuable_inference_pool", "SET-FOCUS-ENTITY-CONTINUABLE-INFERENCE-POOL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_asserted_types", "GET-FOCUS-ENTITY-ASSERTED-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_asserted_types", "SET-FOCUS-ENTITY-ASSERTED-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_learned_types", "GET-FOCUS-ENTITY-LEARNED-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_learned_types", "SET-FOCUS-ENTITY-LEARNED-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_types", "GET-FOCUS-ENTITY-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_types", "SET-FOCUS-ENTITY-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_relevant_mt", "GET-FOCUS-ENTITY-RELEVANT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_relevant_mt", "SET-FOCUS-ENTITY-RELEVANT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_cyc_entity", "GET-FOCUS-ENTITY-CYC-ENTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_cyc_entity", "SET-FOCUS-ENTITY-CYC-ENTITY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_query_parameters", "GET-FOCUS-ENTITY-QUERY-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_query_parameters", "SET-FOCUS-ENTITY-QUERY-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_focus_entity_salience_predicates", "GET-FOCUS-ENTITY-SALIENCE-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_focus_entity_salience_predicates", "SET-FOCUS-ENTITY-SALIENCE-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_focus_entity_class", "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_focus_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_p", "FOCUS-ENTITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_all_types_method", "FOCUS-ENTITY-ALL-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_generate_salient_queries_method", "FOCUS-ENTITY-GENERATE-SALIENT-QUERIES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_kb_integrate_method", "FOCUS-ENTITY-KB-INTEGRATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_compute_salient_justifications_method", "FOCUS-ENTITY-COMPUTE-SALIENT-JUSTIFICATIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_harvest_queries_from_inference_pool_method", "FOCUS-ENTITY-HARVEST-QUERIES-FROM-INFERENCE-POOL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_get_salient_queries_method", "FOCUS-ENTITY-GET-SALIENT-QUERIES-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "focus_entity_done_computing_salient_queries_method", "FOCUS-ENTITY-DONE-COMPUTING-SALIENT-QUERIES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "focus_entity_answer_salient_queries_method", "FOCUS-ENTITY-ANSWER-SALIENT-QUERIES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_textual_focus_entity_learned_textual_types", "GET-TEXTUAL-FOCUS-ENTITY-LEARNED-TEXTUAL-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_textual_focus_entity_learned_textual_types", "SET-TEXTUAL-FOCUS-ENTITY-LEARNED-TEXTUAL-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_textual_focus_entity_passages", "GET-TEXTUAL-FOCUS-ENTITY-PASSAGES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_textual_focus_entity_passages", "SET-TEXTUAL-FOCUS-ENTITY-PASSAGES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_textual_focus_entity_name", "GET-TEXTUAL-FOCUS-ENTITY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_textual_focus_entity_name", "SET-TEXTUAL-FOCUS-ENTITY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_textual_focus_entity_class", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_textual_focus_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_p", "TEXTUAL-FOCUS-ENTITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_textual_focus_entity", "NEW-TEXTUAL-FOCUS-ENTITY", 2, 1, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_name_method", "TEXTUAL-FOCUS-ENTITY-NAME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_print_method", "TEXTUAL-FOCUS-ENTITY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_equal_method", "TEXTUAL-FOCUS-ENTITY-EQUAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_equal", "TEXTUAL-FOCUS-ENTITY-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_chronology_method", "TEXTUAL-FOCUS-ENTITY-CHRONOLOGY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_render_method", "TEXTUAL-FOCUS-ENTITY-RENDER-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_learn_types_from_corpora_method", "TEXTUAL-FOCUS-ENTITY-LEARN-TYPES-FROM-CORPORA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "textual_focus_entity_add_passage_method", "TEXTUAL-FOCUS-ENTITY-ADD-PASSAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "entity_specific_justification_p", "ENTITY-SPECIFIC-JUSTIFICATION-P", 4, 0, false );
    SubLFiles.declareFunction( me, "unpack_existential_query", "UNPACK-EXISTENTIAL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "admissible_focus_entity_type", "ADMISSIBLE-FOCUS-ENTITY-TYPE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_focus_entity_file()
  {
    return NIL;
  }

  public static SubLObject setup_focus_entity_file()
  {
    classes.subloop_new_class( $sym0$FOCUS_ENTITY, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$FOCUS_ENTITY, NIL );
    classes.subloop_note_class_initialization_function( $sym0$FOCUS_ENTITY, $sym30$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$FOCUS_ENTITY, $sym33$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE );
    subloop_reserved_initialize_focus_entity_class( $sym0$FOCUS_ENTITY );
    methods.methods_incorporate_instance_method( $sym34$ALL_TYPES, $sym0$FOCUS_ENTITY, $list35, NIL, $list36 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym34$ALL_TYPES, $sym38$FOCUS_ENTITY_ALL_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym39$GENERATE_SALIENT_QUERIES, $sym0$FOCUS_ENTITY, $list35, NIL, $list40 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym39$GENERATE_SALIENT_QUERIES, $sym44$FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD );
    methods.methods_incorporate_instance_method( $sym42$KB_INTEGRATE, $sym0$FOCUS_ENTITY, $list45, NIL, $list46 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym42$KB_INTEGRATE, $sym57$FOCUS_ENTITY_KB_INTEGRATE_METHOD );
    methods.methods_incorporate_instance_method( $sym43$COMPUTE_SALIENT_JUSTIFICATIONS, $sym0$FOCUS_ENTITY, $list45, NIL, $list58 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym43$COMPUTE_SALIENT_JUSTIFICATIONS, $sym64$FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, $sym0$FOCUS_ENTITY, $list45, $list66, $list67 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, $sym72$FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD );
    methods.methods_incorporate_instance_method( $sym73$GET_SALIENT_QUERIES, $sym0$FOCUS_ENTITY, $list35, $list74, $list75 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym73$GET_SALIENT_QUERIES, $sym83$FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD );
    methods.methods_incorporate_instance_method( $sym82$DONE_COMPUTING_SALIENT_QUERIES, $sym0$FOCUS_ENTITY, $list35, NIL, $list84 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym82$DONE_COMPUTING_SALIENT_QUERIES, $sym87$FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD );
    methods.methods_incorporate_instance_method( $sym88$ANSWER_SALIENT_QUERIES, $sym0$FOCUS_ENTITY, $list35, NIL, $list89 );
    methods.subloop_register_instance_method( $sym0$FOCUS_ENTITY, $sym88$ANSWER_SALIENT_QUERIES, $sym92$FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD );
    classes.subloop_new_class( $sym93$TEXTUAL_FOCUS_ENTITY, $sym0$FOCUS_ENTITY, NIL, NIL, $list94 );
    classes.class_set_implements_slot_listeners( $sym93$TEXTUAL_FOCUS_ENTITY, NIL );
    classes.subloop_note_class_initialization_function( $sym93$TEXTUAL_FOCUS_ENTITY, $sym98$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym93$TEXTUAL_FOCUS_ENTITY, $sym99$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE );
    subloop_reserved_initialize_textual_focus_entity_class( $sym93$TEXTUAL_FOCUS_ENTITY );
    methods.methods_incorporate_instance_method( $sym97$NAME, $sym93$TEXTUAL_FOCUS_ENTITY, $list35, NIL, $list104 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, $sym97$NAME, $sym106$TEXTUAL_FOCUS_ENTITY_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym107$PRINT, $sym93$TEXTUAL_FOCUS_ENTITY, $list45, $list108, $list109 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, $sym107$PRINT, $sym116$TEXTUAL_FOCUS_ENTITY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( EQUAL, $sym93$TEXTUAL_FOCUS_ENTITY, $list35, $list117, $list118 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, EQUAL, $sym120$TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD );
    methods.methods_incorporate_instance_method( $sym122$CHRONOLOGY, $sym93$TEXTUAL_FOCUS_ENTITY, $list35, NIL, $list123 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, $sym122$CHRONOLOGY, $sym126$TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD );
    methods.methods_incorporate_instance_method( $sym124$RENDER, $sym93$TEXTUAL_FOCUS_ENTITY, $list35, $list127, $list128 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, $sym124$RENDER, $sym144$TEXTUAL_FOCUS_ENTITY_RENDER_METHOD );
    methods.methods_incorporate_instance_method( $sym145$LEARN_TYPES_FROM_CORPORA, $sym93$TEXTUAL_FOCUS_ENTITY, $list35, $list146, $list147 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, $sym145$LEARN_TYPES_FROM_CORPORA, $sym153$TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD );
    methods.methods_incorporate_instance_method( $sym154$ADD_PASSAGE, $sym93$TEXTUAL_FOCUS_ENTITY, $list35, $list155, $list156 );
    methods.subloop_register_instance_method( $sym93$TEXTUAL_FOCUS_ENTITY, $sym154$ADD_PASSAGE, $sym160$TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_focus_entity_file();
  }

  @Override
  public void initializeVariables()
  {
    init_focus_entity_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_focus_entity_file();
  }
  static
  {
    me = new focus_entity();
    $sym0$FOCUS_ENTITY = makeSymbol( "FOCUS-ENTITY" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SALIENCE-PREDICATES" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keStrongSuggestion" ) ) ) ) ), ConsesLow.list( makeSymbol( "QUERY-PARAMETERS" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ),
            makeKeyword( "VALUE" ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "LIST" ), makeKeyword( "MAX-NUMBER" ), FIVE_INTEGER, makeKeyword( "MAX-TIME" ), makeInteger( 200 ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "BLOCK?" ), NIL,
              makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), T, makeKeyword(
                  "PRODUCTIVITY-LIMIT" ), makeInteger( 2000000 )
            } ) ), ConsesLow.list( makeSymbol( "CYC-ENTITY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RELEVANT-MT" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TYPES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEARNED-TYPES" ), makeKeyword( "INSTANCE" ), makeKeyword(
                    "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ASSERTED-TYPES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONTINUABLE-INFERENCE-POOL" ), makeKeyword(
                        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INFERENCE-POOL-CREATED" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                            "SALIENT-QUERY-JUSTIFICATIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SALIENT-QUERIES" ), makeKeyword( "INSTANCE" ), makeKeyword(
                                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "UNANSWERED-QUESTIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ANSWERS" ), makeKeyword(
                                    "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ALL-TYPES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GENERATE-SALIENT-QUERIES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                            "KB-INTEGRATE" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPUTE-SALIENT-QUERIES" ), NIL, makeKeyword(
                                                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DONE-COMPUTING-SALIENT-QUERIES" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym3$ANSWERS = makeSymbol( "ANSWERS" );
    $sym4$UNANSWERED_QUESTIONS = makeSymbol( "UNANSWERED-QUESTIONS" );
    $sym5$SALIENT_QUERIES = makeSymbol( "SALIENT-QUERIES" );
    $sym6$SALIENT_QUERY_JUSTIFICATIONS = makeSymbol( "SALIENT-QUERY-JUSTIFICATIONS" );
    $sym7$INFERENCE_POOL_CREATED = makeSymbol( "INFERENCE-POOL-CREATED" );
    $sym8$CONTINUABLE_INFERENCE_POOL = makeSymbol( "CONTINUABLE-INFERENCE-POOL" );
    $sym9$ASSERTED_TYPES = makeSymbol( "ASSERTED-TYPES" );
    $sym10$LEARNED_TYPES = makeSymbol( "LEARNED-TYPES" );
    $sym11$TYPES = makeSymbol( "TYPES" );
    $sym12$RELEVANT_MT = makeSymbol( "RELEVANT-MT" );
    $sym13$CYC_ENTITY = makeSymbol( "CYC-ENTITY" );
    $sym14$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym15$SALIENCE_PREDICATES = makeSymbol( "SALIENCE-PREDICATES" );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keStrongSuggestion" ) ) );
    $sym17$QUERY_PARAMETERS = makeSymbol( "QUERY-PARAMETERS" );
    $kw18$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw19$MAX_TIME = makeKeyword( "MAX-TIME" );
    $int20$200 = makeInteger( 200 );
    $kw21$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw22$BLOCK_ = makeKeyword( "BLOCK?" );
    $kw23$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw24$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw25$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw26$HL = makeKeyword( "HL" );
    $kw27$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw28$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $int29$2000000 = makeInteger( 2000000 );
    $sym30$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-CLASS" );
    $sym31$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym32$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym33$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-INSTANCE" );
    $sym34$ALL_TYPES = makeSymbol( "ALL-TYPES" );
    $list35 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list36 = ConsesLow.list( makeString( "@return listp, the list of all Cyc types this entity is know to be an instance of.\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "RAW" ), ConsesLow.list( makeSymbol( "UNION" ), makeSymbol( "TYPES" ), makeSymbol( "LEARNED-TYPES" ) ) ), ConsesLow.list( makeSymbol( "ORGANIZED" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
            ConsesLow.list( makeSymbol( "CANDIDATE-TYPE" ), makeSymbol( "RAW" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list(
                makeSymbol( "EXISTING-TYPE" ), makeSymbol( "ORGANIZED" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "GENL-IN-ANY-MT?" ), makeSymbol(
                    "EXISTING-TYPE" ), makeSymbol( "CANDIDATE-TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CANDIDATE-TYPE" ),
                        makeSymbol( "ORGANIZED" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ORGANIZED" ) ) ) );
    $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $sym38$FOCUS_ENTITY_ALL_TYPES_METHOD = makeSymbol( "FOCUS-ENTITY-ALL-TYPES-METHOD" );
    $sym39$GENERATE_SALIENT_QUERIES = makeSymbol( "GENERATE-SALIENT-QUERIES" );
    $list40 = ConsesLow.list( makeString( "@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KB-INTEGRATE" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "COMPUTE-SALIENT-JUSTIFICATIONS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INFERENCE-POOL-CREATED" ), T ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "SELF" ) ) );
    $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $sym42$KB_INTEGRATE = makeSymbol( "KB-INTEGRATE" );
    $sym43$COMPUTE_SALIENT_JUSTIFICATIONS = makeSymbol( "COMPUTE-SALIENT-JUSTIFICATIONS" );
    $sym44$FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD = makeSymbol( "FOCUS-ENTITY-GENERATE-SALIENT-QUERIES-METHOD" );
    $list45 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list46 = ConsesLow.list( makeString( "@return focus-entity-p\n   As a side effect it introduces this entity into the KB, based on what its type(s) \n   is/are known to be.\n   @owner bertolo" ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-TYPES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALL-TYPES" ) ) ) ),
            makeSymbol( "MIN-TYPES" ), makeSymbol( "PRED" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MIN-TYPES" ), ConsesLow.list(
                makeSymbol( "MIN-COLS" ), makeSymbol( "ALL-TYPES" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), constant_handles.reader_make_constant_shell(
                    makeString( "Person" ) ), makeSymbol( "TYPES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRED" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list(
                        makeSymbol( "CSETQ" ), makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "PeopleDataMt" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), constant_handles
                            .reader_make_constant_shell( makeString( "Organization" ) ), makeSymbol( "TYPES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRED" ), constant_handles.reader_make_constant_shell(
                                makeString( "isa" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "OrganizationDataMt" ) ) ) ), ConsesLow.list(
                                    ConsesLow.list( makeSymbol( "COLLECTION?" ), makeSymbol( "CYC-ENTITY" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRED" ), constant_handles.reader_make_constant_shell(
                                        makeString( "genls" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "TREC-Mt" ) ) ) ) ), ConsesLow.list(
                                            makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "M-TYPE" ), makeSymbol( "MIN-TYPES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                "ASSERTION" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "PRED" ), makeSymbol( "CYC-ENTITY" ), makeSymbol( "M-TYPE" ) ) ), ConsesLow.list( makeSymbol(
                                                    "WFF-TEST" ), ConsesLow.list( makeSymbol( "EL-WFF?" ), makeSymbol( "ASSERTION" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeSymbol( "SUCCESS" ), ConsesLow.list(
                                                        makeSymbol( "FWHEN" ), makeSymbol( "WFF-TEST" ), ConsesLow.list( makeSymbol( "CYC-ASSERT" ), makeSymbol( "ASSERTION" ), makeSymbol( "MT" ) ) ) ) ), ConsesLow.list(
                                                            makeSymbol( "PWHEN" ), makeSymbol( "SUCCESS" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "M-TYPE" ), makeSymbol( "ASSERTED-TYPES" ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $sym48$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const49$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const50$Person = constant_handles.reader_make_constant_shell( makeString( "Person" ) );
    $const51$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const52$PeopleDataMt = constant_handles.reader_make_constant_shell( makeString( "PeopleDataMt" ) );
    $const53$Organization = constant_handles.reader_make_constant_shell( makeString( "Organization" ) );
    $const54$OrganizationDataMt = constant_handles.reader_make_constant_shell( makeString( "OrganizationDataMt" ) );
    $const55$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const56$TREC_Mt = constant_handles.reader_make_constant_shell( makeString( "TREC-Mt" ) );
    $sym57$FOCUS_ENTITY_KB_INTEGRATE_METHOD = makeSymbol( "FOCUS-ENTITY-KB-INTEGRATE-METHOD" );
    $list58 = ConsesLow.list( makeString( "@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo" ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "CYC-ENTITY" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PRED" ),
            makeSymbol( "SALIENCE-PREDICATES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONT-INF" ), ConsesLow.list( makeSymbol( "NEW-CONTINUABLE-INFERENCE" ), ConsesLow
                .list( makeSymbol( "BQ-LIST*" ), makeSymbol( "PRED" ), makeSymbol( "CYC-ENTITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "?WHAT" ) ) ) ), constant_handles
                    .reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "CONT-INF-STRING" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "ci-" ), ConsesLow.list(
                        makeSymbol( "FORMAT" ), NIL, makeString( "~S" ), ConsesLow.list( makeSymbol( "GENSYM" ) ) ) ) ), ConsesLow.list( makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "NEW-TASK" ), makeSymbol(
                            "CONT-INF-STRING" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONTINUE-INFERENCE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "CONT-INF" ), makeSymbol(
                                "QUERY-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "TASK" ), makeSymbol( "CONT-INF" ) ), makeSymbol(
                                    "CONTINUABLE-INFERENCE-POOL" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $list60 = ConsesLow.list( makeSymbol( "?WHAT" ) );
    $str61$ci_ = makeString( "ci-" );
    $str62$_S = makeString( "~S" );
    $sym63$CONTINUE_INFERENCE = makeSymbol( "CONTINUE-INFERENCE" );
    $sym64$FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD = makeSymbol( "FOCUS-ENTITY-COMPUTE-SALIENT-JUSTIFICATIONS-METHOD" );
    $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL = makeSymbol( "HARVEST-QUERIES-FROM-INFERENCE-POOL" );
    $list66 = ConsesLow.list( makeSymbol( "SPECIFICITY" ) );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCL-QUERIES" ), NIL ), ConsesLow.list( makeSymbol( "NEW-INFERENCE-POOL" ), NIL ) ), ConsesLow.list(
        makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "INFERENCE-TASK" ), makeSymbol( "CONTINUABLE-INFERENCE-POOL" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "TASK" ),
            makeSymbol( "INFERENCE" ) ), makeSymbol( "INFERENCE-TASK" ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INFERENCE-P" ),
                makeSymbol( "INFERENCE" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "INFERENCE-STATUS" ), makeSymbol( "INFERENCE" ) ), makeKeyword( "SUSPENDED" ) ) ), ConsesLow.list( makeSymbol(
                    "DO-INFERENCE-NEW-ANSWERS" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SALIENT-ANSWER" ),
                        ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol( "SPECIFICITY" ) ) ) ), ConsesLow.list( makeSymbol( "DO-INFERENCE-ANSWER-JUSTIFICATIONS" ), ConsesLow.list( makeSymbol( "JUSTIFICATION" ),
                            makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SALIENT-ANSWER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SALIENT-ANSWER" ), ConsesLow.list(
                                makeSymbol( "ENTITY-SPECIFIC-JUSTIFICATION-P" ), makeSymbol( "CYC-ENTITY" ), makeSymbol( "TYPES" ), makeSymbol( "JUSTIFICATION" ), makeSymbol( "SPECIFICITY" ) ) ) ) ), ConsesLow.list(
                                    makeSymbol( "PWHEN" ), makeSymbol( "SALIENT-ANSWER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "BINDINGS" ), ConsesLow.list( makeSymbol(
                                        "INFERENCE-ANSWER-BINDINGS" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "BINDING" ), makeSymbol( "BINDINGS" ) ), ConsesLow
                                            .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "BINDING" ) ) ), ConsesLow.list( makeSymbol(
                                                "BIND" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "BINDING" ) ) ), makeSymbol( "QUERY" ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "VAR" ) ),
                                                ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "BIND" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUERY" ),
                                                    ConsesLow.list( makeSymbol( "UNPACK-EXISTENTIAL-QUERY" ), makeSymbol( "BIND" ), makeSymbol( "CYC-ENTITY" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                        "QUERY" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUERY-PRED" ), ConsesLow.list( makeSymbol( "FORMULA-ARG0" ),
                                                            makeSymbol( "QUERY" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "QUERY-PRED" ), ConsesLow.list(
                                                                makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                                                    makeString( "genls" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-CYCL-QUERY" ), makeSymbol( "QUERY" ) ),
                                                                        makeSymbol( "CYCL-QUERIES" ) ) ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "TASK-PROCESS" ), makeSymbol(
                                                                            "TASK" ) ), ConsesLow.list( makeSymbol( "KILL-PROCESS" ), ConsesLow.list( makeSymbol( "TASK-PROCESS" ), makeSymbol( "TASK" ) ) ) ), ConsesLow
                                                                                .list( makeSymbol( "DESTROY-INFERENCE" ), makeSymbol( "INFERENCE" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE-P" ),
                                                                                    makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "INFERENCE-TASK" ), makeSymbol(
                                                                                        "NEW-INFERENCE-POOL" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTINUABLE-INFERENCE-POOL" ), makeSymbol(
                                                                                            "NEW-INFERENCE-POOL" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCL-QUERIES" ) ) ) );
    $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $list69 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "INFERENCE" ) );
    $kw70$SUSPENDED = makeKeyword( "SUSPENDED" );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $sym72$FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD = makeSymbol( "FOCUS-ENTITY-HARVEST-QUERIES-FROM-INFERENCE-POOL-METHOD" );
    $sym73$GET_SALIENT_QUERIES = makeSymbol( "GET-SALIENT-QUERIES" );
    $list74 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COMPLETENESS" ), makeKeyword( "CURRENT" ) ), ConsesLow.list( makeSymbol( "SPECIFICITY" ), ZERO_INTEGER ) );
    $list75 = ConsesLow.list( makeString(
        "@param SPECIFICITY, integerp meant to denote how many levels of inheritance are acceptable\n   for a salient query. The lower the number, the tighter the restriction. The default, 0, causes \n   salient queries to be inherited without restriction from all supertypes of this entity.\n   @param COMPLETE, booleanp. If T, then the method will return only after all the inferences \n   that were started to compute salient queries are complete. If NIL the method will return\n   immediately with all the salient queries discovered so far.\n   @return listp, a list of salient cycl-query-p.\n   @owner bertolo" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "SPECIFICITY" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "COMPLETENESS" ), ConsesLow.list( makeKeyword( "CURRENT" ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SALIENT-QUERIES" ) ) ), ConsesLow.list( makeKeyword( "UPDATE" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LATEST" ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HARVEST-QUERIES-FROM-INFERENCE-POOL" ) ), makeSymbol( "SPECIFICITY" ) ) ), ConsesLow.list(
                    makeSymbol( "UPDATE" ), makeSymbol( "SALIENT-QUERIES" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "L" ), makeSymbol( "LATEST" ) ), ConsesLow.list( makeSymbol(
                        "CPUSHNEW" ), makeSymbol( "L" ), makeSymbol( "UPDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCL-QUERY-EQUAL-P" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "SALIENT-QUERIES" ), makeSymbol( "UPDATE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "UPDATE" ) ) ) ), ConsesLow.list( makeKeyword( "ALL" ), ConsesLow.list( makeSymbol( "CLET" ),
                                ConsesLow.list( ConsesLow.list( makeSymbol( "UPDATE" ), makeSymbol( "SALIENT-QUERIES" ) ), makeSymbol( "LATEST" ) ), ConsesLow.list( makeSymbol( "UNTIL" ), ConsesLow.list( makeSymbol(
                                    "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DONE-COMPUTING-SALIENT-QUERIES" ) ) ), ConsesLow.list( makeSymbol( "SLEEP" ), ONE_INTEGER ) ),
                                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LATEST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "HARVEST-QUERIES-FROM-INFERENCE-POOL" ) ), makeSymbol( "SPECIFICITY" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "L" ), makeSymbol( "LATEST" ) ),
                                        ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "L" ), makeSymbol( "UPDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCL-QUERY-EQUAL-P" ) ) ) ), ConsesLow
                                            .list( makeSymbol( "CSETQ" ), makeSymbol( "SALIENT-QUERIES" ), makeSymbol( "UPDATE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "UPDATE" ) ) ) ) ) );
    $kw76$CURRENT = makeKeyword( "CURRENT" );
    $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $sym78$INTEGERP = makeSymbol( "INTEGERP" );
    $kw79$UPDATE = makeKeyword( "UPDATE" );
    $sym80$CYCL_QUERY_EQUAL_P = makeSymbol( "CYCL-QUERY-EQUAL-P" );
    $kw81$ALL = makeKeyword( "ALL" );
    $sym82$DONE_COMPUTING_SALIENT_QUERIES = makeSymbol( "DONE-COMPUTING-SALIENT-QUERIES" );
    $sym83$FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD = makeSymbol( "FOCUS-ENTITY-GET-SALIENT-QUERIES-METHOD" );
    $list84 = ConsesLow.list( makeString( "@return BOOLEAN; T iff no inference that has been started to compute\n   salient queries is still running.\n   @bertolo" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        makeSymbol( "STILL-WORKING" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "INFERENCE-TASK" ), makeSymbol( "CONTINUABLE-INFERENCE-POOL" ), makeSymbol( "STILL-WORKING" ) ), ConsesLow.list(
            makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "INFERENCE" ) ), makeSymbol( "INFERENCE-TASK" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "TASK" ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INFERENCE-P" ), makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATUS" ),
                ConsesLow.list( makeSymbol( "INFERENCE-STATUS" ), makeSymbol( "INFERENCE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STILL-WORKING" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol(
                    "STATUS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NEW" ), makeKeyword( "PREPARED" ), makeKeyword( "READY" ), makeKeyword( "RUNNING" ) ) ) ) ) ) ) ) ), ConsesLow.list(
                        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "STILL-WORKING" ) ) ) ) );
    $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $list86 = ConsesLow.list( makeKeyword( "NEW" ), makeKeyword( "PREPARED" ), makeKeyword( "READY" ), makeKeyword( "RUNNING" ) );
    $sym87$FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD = makeSymbol( "FOCUS-ENTITY-DONE-COMPUTING-SALIENT-QUERIES-METHOD" );
    $sym88$ANSWER_SALIENT_QUERIES = makeSymbol( "ANSWER-SALIENT-QUERIES" );
    $list89 = ConsesLow.list( makeString( "@return focus-entity-p, this focus entity\n   As a side effect it computes the answers to all the salient queries for this entity.\n   @owner bertolo" ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*ASK-QUIRK?*" ), T ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "QUERY" ), makeSymbol( "SALIENT-QUERIES" ) ),
            ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LOCAL-ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "ANSWER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LOCAL-ANSWERS" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "QUERY" ), makeSymbol(
                    "UNANSWERED-QUESTIONS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "LOCAL-ANSWERS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                        "ANSWER" ), makeSymbol( "ANSWERS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD" );
    $sym91$ANSWER = makeSymbol( "ANSWER" );
    $sym92$FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD = makeSymbol( "FOCUS-ENTITY-ANSWER-SALIENT-QUERIES-METHOD" );
    $sym93$TEXTUAL_FOCUS_ENTITY = makeSymbol( "TEXTUAL-FOCUS-ENTITY" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PASSAGES" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEARNED-TYPES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEARNED-TEXTUAL-TYPES" ), makeKeyword( "INSTANCE" ),
            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "LEARN-TYPES-FROM-CORPORA" ), ConsesLow.list( makeSymbol( "CORPORA" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-PASSAGE" ), ConsesLow.list(
                    makeSymbol( "PASSAGE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), EQUAL, ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym95$LEARNED_TEXTUAL_TYPES = makeSymbol( "LEARNED-TEXTUAL-TYPES" );
    $sym96$PASSAGES = makeSymbol( "PASSAGES" );
    $sym97$NAME = makeSymbol( "NAME" );
    $sym98$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-CLASS" );
    $sym99$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-INSTANCE" );
    $sym100$STRINGP = makeSymbol( "STRINGP" );
    $sym101$CYCL_EXPRESSION_ = makeSymbol( "CYCL-EXPRESSION?" );
    $sym102$LISTP = makeSymbol( "LISTP" );
    $sym103$ADMISSIBLE_FOCUS_ENTITY_TYPE = makeSymbol( "ADMISSIBLE-FOCUS-ENTITY-TYPE" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NAME" ) ) );
    $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD" );
    $sym106$TEXTUAL_FOCUS_ENTITY_NAME_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-NAME-METHOD" );
    $sym107$PRINT = makeSymbol( "PRINT" );
    $list108 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list109 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<ESS-ENT-" ), makeSymbol( "STREAM" ) ),
      ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ": " ), makeSymbol( "STREAM" ) ), ConsesLow.list(
          makeSymbol( "PRIN1" ), makeSymbol( "NAME" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( " types: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ),
              ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALL-TYPES" ) ) ) ), makeSymbol( "STREAM" ) ), ConsesLow
                  .list( makeSymbol( "WRITE-STRING" ), makeString( " facts: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "ANSWERS" ) ),
                      makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list(
                          makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } );
    $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD" );
    $str111$__ESS_ENT_ = makeString( "#<ESS-ENT-" );
    $str112$__ = makeString( ": " );
    $str113$_types__ = makeString( " types: " );
    $str114$_facts__ = makeString( " facts: " );
    $str115$_ = makeString( ">" );
    $sym116$TEXTUAL_FOCUS_ENTITY_PRINT_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-PRINT-METHOD" );
    $list117 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list118 = ConsesLow.list( makeString( "@return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
        makeSymbol( "TEXTUAL-FOCUS-ENTITY-P" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( EQUAL, makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "NAME" ) ) ) ) ) ) );
    $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD" );
    $sym120$TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-EQUAL-METHOD" );
    $sym121$TEXTUAL_FOCUS_ENTITY_P = makeSymbol( "TEXTUAL-FOCUS-ENTITY-P" );
    $sym122$CHRONOLOGY = makeSymbol( "CHRONOLOGY" );
    $list123 = ConsesLow.list( makeString( "@return a chronological summary of all information known about this entity.\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RENDER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword(
            "ORDER" ), makeKeyword( "CHRONOLOGICAL" ) ) ) ) ) );
    $sym124$RENDER = makeSymbol( "RENDER" );
    $list125 = ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword( "ORDER" ), makeKeyword( "CHRONOLOGICAL" ) );
    $sym126$TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-CHRONOLOGY-METHOD" );
    $list127 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STRATEGY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword(
        "ORDER" ), makeKeyword( "SEQUENTIAL" ) ) ) ) );
    $list128 = ConsesLow.list( makeString( "@return a summary of all information known about this entity.\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "FORMAT" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "STRATEGY" ), makeKeyword( "FORMAT" ) ) ), ConsesLow.list( makeSymbol( "ORDER" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "STRATEGY" ),
            makeKeyword( "ORDER" ) ) ), makeSymbol( "ACCUMULATOR" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "FORMAT" ), ConsesLow.list( makeKeyword( "TEXT" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                makeSymbol( "ACCUMULATOR" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "NAME" ), makeString( ":" ), makeSymbol( "*NEW-LINE-STRING*" ), makeSymbol( "*NEW-LINE-STRING*" ) ) ) ) ), ConsesLow
                    .list( makeSymbol( "PCASE" ), makeSymbol( "ORDER" ), ConsesLow.list( makeKeyword( "SEQUENTIAL" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol(
                        "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "JUSTIFICATION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "JUSTIFY" ) ) ) ), ConsesLow.list( makeSymbol( "SOURCE" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CORPUS-PASSAGE-P" ), makeSymbol(
                                "JUSTIFICATION" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "JUSTIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SOURCE" ) ) ), makeString( "" ) ) ) ),
                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ACCUMULATOR" ), ConsesLow.list( new SubLObject[]
                            { makeSymbol( "CCONCATENATE" ), makeSymbol( "ACCUMULATOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-CONTENT" ) ) ), makeSymbol( "*NEW-LINE-STRING*" ), makeString( "(" ), makeSymbol( "SOURCE" ), makeString( ")" ), makeSymbol( "*NEW-LINE-STRING*" ), makeSymbol( "*NEW-LINE-STRING*" )
                            } ) ) ) ) ), ConsesLow.list( makeKeyword( "CHRONOLOGICAL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SORTED" ), ConsesLow.list( makeSymbol( "SORT" ),
                                ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-OLDER-METHOD" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                    "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "SORTED" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "JUSTIFICATION" ),
                                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "JUSTIFY" ) ) ) ), ConsesLow.list( makeSymbol( "SOURCE" ), ConsesLow
                                            .list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CORPUS-PASSAGE-P" ), makeSymbol( "JUSTIFICATION" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                "JUSTIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SOURCE" ) ) ), makeString( "" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                    "ACCUMULATOR" ), ConsesLow.list( new SubLObject[]
                                                    { makeSymbol( "CCONCATENATE" ), makeSymbol( "ACCUMULATOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                        makeSymbol( "GET-CONTENT" ) ) ), makeSymbol( "*NEW-LINE-STRING*" ), makeString( "(" ), makeSymbol( "SOURCE" ), makeString( ")" ), makeSymbol( "*NEW-LINE-STRING*" ),
                                                      makeSymbol( "*NEW-LINE-STRING*" )
    } ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ACCUMULATOR" ) ) ) );
    $list129 = ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword( "ORDER" ), makeKeyword( "SEQUENTIAL" ) );
    $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD" );
    $kw131$FORMAT = makeKeyword( "FORMAT" );
    $kw132$ORDER = makeKeyword( "ORDER" );
    $kw133$TEXT = makeKeyword( "TEXT" );
    $str134$_ = makeString( ":" );
    $kw135$SEQUENTIAL = makeKeyword( "SEQUENTIAL" );
    $sym136$JUSTIFY = makeSymbol( "JUSTIFY" );
    $sym137$GET_SOURCE = makeSymbol( "GET-SOURCE" );
    $str138$ = makeString( "" );
    $sym139$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $str140$_ = makeString( "(" );
    $str141$_ = makeString( ")" );
    $kw142$CHRONOLOGICAL = makeKeyword( "CHRONOLOGICAL" );
    $sym143$ANSWER_OLDER_METHOD = makeSymbol( "ANSWER-OLDER-METHOD" );
    $sym144$TEXTUAL_FOCUS_ENTITY_RENDER_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-RENDER-METHOD" );
    $sym145$LEARN_TYPES_FROM_CORPORA = makeSymbol( "LEARN-TYPES-FROM-CORPORA" );
    $list146 = ConsesLow.list( makeSymbol( "CORPORA" ) );
    $list147 = ConsesLow.list( makeString(
        "@param CORPORA, listp a list of strings denoting available corpora\n   @return textual-focus-entity-p, this entity.\n   As a side effect it consults documents in CORPORA to try to learn its own type.\n   @owner bertolo" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "CORPORA" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-TYPES" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALL-TYPES" ) ) ) ), ConsesLow.list( makeSymbol( "LOCAL-ANSWERS" ), NIL ), makeSymbol( "WHO-TYPE" ), makeSymbol(
                "QUESTION" ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WHO-TYPE" ), ConsesLow.list( makeSymbol( "ANY-GENL-ANY?" ), makeSymbol( "CURRENT-TYPES" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString(
                        "Organization" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "WHO-TYPE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol(
                            "NEW-QUESTION" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "Who is " ), makeSymbol( "NAME" ), makeString( "?" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                "QUESTION" ), ConsesLow.list( makeSymbol( "NEW-QUESTION" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "What is " ), makeSymbol( "NAME" ), makeString( "?" ) ) ) ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LOCAL-ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUESTION" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LOCAL-ANSWERS" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "QUESTION" ),
                    makeSymbol( "UNANSWERED-QUESTIONS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "LOCAL-ANSWERS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                        makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*NPP-USE-NL-TAGS?*" ), NIL ), ConsesLow.list( makeSymbol(
                            "DENOTS" ), ConsesLow.list( makeSymbol( "PS-GET-CYCLS-FOR-NP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-CONTENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), makeSymbol( "DENOTS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                    makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "CURRENT-TYPES" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol(
                                        "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "COLLECTIONS-DISJOINT?" ), makeSymbol( "DENOT" ), makeSymbol(
                                            "TYPE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "DENOT" ), makeSymbol( "CURRENT-TYPES" ) ),
                                                ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "DENOT" ), makeSymbol( "LEARNED-TYPES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD" );
    $list149 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) );
    $str150$Who_is_ = makeString( "Who is " );
    $str151$_ = makeString( "?" );
    $str152$What_is_ = makeString( "What is " );
    $sym153$TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-LEARN-TYPES-FROM-CORPORA-METHOD" );
    $sym154$ADD_PASSAGE = makeSymbol( "ADD-PASSAGE" );
    $list155 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list156 = ConsesLow.list( makeString( "@param PASSAGE passage-p\n   @return textual-focus-entity; this entity with PASSAGE added to the list\n   of passages where the entity occurs" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "PASSAGE" ), makeSymbol( "CORPUS-PASSAGE-P" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "PASSAGE" ), makeSymbol( "PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "PASSAGE-EQUAL" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD" );
    $sym158$CORPUS_PASSAGE_P = makeSymbol( "CORPUS-PASSAGE-P" );
    $sym159$PASSAGE_EQUAL = makeSymbol( "PASSAGE-EQUAL" );
    $sym160$TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD = makeSymbol( "TEXTUAL-FOCUS-ENTITY-ADD-PASSAGE-METHOD" );
    $sym161$INFERENCE_ANSWER_JUSTIFICATION_P = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-P" );
    $kw162$ISA = makeKeyword( "ISA" );
    $const163$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const164$relationExistsInstance = constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) );
    $const165$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $sym166$_WHAT = makeSymbol( "?WHAT" );
    $const167$CycKBSubsetCollection = constant_handles.reader_make_constant_shell( makeString( "CycKBSubsetCollection" ) );
    $const168$CycVocabularyTopic = constant_handles.reader_make_constant_shell( makeString( "CycVocabularyTopic" ) );
    $const169$KFDInternalKRTerm = constant_handles.reader_make_constant_shell( makeString( "KFDInternalKRTerm" ) );
    $const170$MicrotheoryType = constant_handles.reader_make_constant_shell( makeString( "MicrotheoryType" ) );
    $const171$VocabularyConstrainingAbstraction = constant_handles.reader_make_constant_shell( makeString( "VocabularyConstrainingAbstraction" ) );
    $const172$RelationshipType = constant_handles.reader_make_constant_shell( makeString( "RelationshipType" ) );
    $const173$MIPTMappingConstant = constant_handles.reader_make_constant_shell( makeString( "MIPTMappingConstant" ) );
    $const174$DealingWithAStringInNounLearnerTo = constant_handles.reader_make_constant_shell( makeString( "DealingWithAStringInNounLearnerTool" ) );
    $const175$LexicalItem = constant_handles.reader_make_constant_shell( makeString( "LexicalItem" ) );
    $const176$QAClarifyingCollectionType = constant_handles.reader_make_constant_shell( makeString( "QAClarifyingCollectionType" ) );
    $const177$BBNEntityType = constant_handles.reader_make_constant_shell( makeString( "BBNEntityType" ) );
    $const178$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const179$PotentiallyPornRelated = constant_handles.reader_make_constant_shell( makeString( "PotentiallyPornRelated" ) );
    $const180$PersonTypeByGender = constant_handles.reader_make_constant_shell( makeString( "PersonTypeByGender" ) );
  }
}
/*
 * 
 * Total time: 740 ms
 * 
 */