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

public final class focus_entity extends SubLTranslatedFile
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
    public static SubLObject get_focus_entity_answers(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.ELEVEN_INTEGER, (SubLObject)focus_entity.$sym3$ANSWERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_answers(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.ELEVEN_INTEGER, (SubLObject)focus_entity.$sym3$ANSWERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_unanswered_questions(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.TEN_INTEGER, (SubLObject)focus_entity.$sym4$UNANSWERED_QUESTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_unanswered_questions(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.TEN_INTEGER, (SubLObject)focus_entity.$sym4$UNANSWERED_QUESTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_salient_queries(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.NINE_INTEGER, (SubLObject)focus_entity.$sym5$SALIENT_QUERIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_salient_queries(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.NINE_INTEGER, (SubLObject)focus_entity.$sym5$SALIENT_QUERIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_salient_query_justifications(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.EIGHT_INTEGER, (SubLObject)focus_entity.$sym6$SALIENT_QUERY_JUSTIFICATIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_salient_query_justifications(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.EIGHT_INTEGER, (SubLObject)focus_entity.$sym6$SALIENT_QUERY_JUSTIFICATIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_inference_pool_created(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.SEVEN_INTEGER, (SubLObject)focus_entity.$sym7$INFERENCE_POOL_CREATED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_inference_pool_created(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.SEVEN_INTEGER, (SubLObject)focus_entity.$sym7$INFERENCE_POOL_CREATED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_continuable_inference_pool(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.SIX_INTEGER, (SubLObject)focus_entity.$sym8$CONTINUABLE_INFERENCE_POOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_continuable_inference_pool(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.SIX_INTEGER, (SubLObject)focus_entity.$sym8$CONTINUABLE_INFERENCE_POOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_asserted_types(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.FIVE_INTEGER, (SubLObject)focus_entity.$sym9$ASSERTED_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_asserted_types(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.FIVE_INTEGER, (SubLObject)focus_entity.$sym9$ASSERTED_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_learned_types(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.FOUR_INTEGER, (SubLObject)focus_entity.$sym10$LEARNED_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_learned_types(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.FOUR_INTEGER, (SubLObject)focus_entity.$sym10$LEARNED_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_types(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.THREE_INTEGER, (SubLObject)focus_entity.$sym11$TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_types(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.THREE_INTEGER, (SubLObject)focus_entity.$sym11$TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_relevant_mt(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.TWO_INTEGER, (SubLObject)focus_entity.$sym12$RELEVANT_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_relevant_mt(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.TWO_INTEGER, (SubLObject)focus_entity.$sym12$RELEVANT_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_cyc_entity(final SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, (SubLObject)focus_entity.ONE_INTEGER, (SubLObject)focus_entity.$sym13$CYC_ENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_cyc_entity(final SubLObject v_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, (SubLObject)focus_entity.ONE_INTEGER, (SubLObject)focus_entity.$sym13$CYC_ENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_query_parameters(final SubLObject v_focus_entity) {
        final SubLObject v_class = (SubLObject)(v_focus_entity.isSymbol() ? classes.classes_retrieve_class(v_focus_entity) : ((focus_entity.NIL != subloop_structures.class_p(v_focus_entity)) ? v_focus_entity : ((focus_entity.NIL != subloop_structures.instance_p(v_focus_entity)) ? subloop_structures.instance_class(v_focus_entity) : focus_entity.NIL)));
        if (focus_entity.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)focus_entity.TWO_INTEGER);
        }
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_query_parameters(final SubLObject v_focus_entity, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_focus_entity.isSymbol() ? classes.classes_retrieve_class(v_focus_entity) : ((focus_entity.NIL != subloop_structures.class_p(v_focus_entity)) ? v_focus_entity : ((focus_entity.NIL != subloop_structures.instance_p(v_focus_entity)) ? subloop_structures.instance_class(v_focus_entity) : focus_entity.NIL)));
        if (focus_entity.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)focus_entity.TWO_INTEGER, value);
        }
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject get_focus_entity_salience_predicates(final SubLObject v_focus_entity) {
        final SubLObject v_class = (SubLObject)(v_focus_entity.isSymbol() ? classes.classes_retrieve_class(v_focus_entity) : ((focus_entity.NIL != subloop_structures.class_p(v_focus_entity)) ? v_focus_entity : ((focus_entity.NIL != subloop_structures.instance_p(v_focus_entity)) ? subloop_structures.instance_class(v_focus_entity) : focus_entity.NIL)));
        if (focus_entity.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)focus_entity.ONE_INTEGER);
        }
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject set_focus_entity_salience_predicates(final SubLObject v_focus_entity, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_focus_entity.isSymbol() ? classes.classes_retrieve_class(v_focus_entity) : ((focus_entity.NIL != subloop_structures.class_p(v_focus_entity)) ? v_focus_entity : ((focus_entity.NIL != subloop_structures.instance_p(v_focus_entity)) ? subloop_structures.instance_class(v_focus_entity) : focus_entity.NIL)));
        if (focus_entity.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)focus_entity.ONE_INTEGER, value);
        }
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject subloop_reserved_initialize_focus_entity_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.$sym14$INSTANCE_COUNT, (SubLObject)focus_entity.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym15$SALIENCE_PREDICATES, (SubLObject)focus_entity.$list16);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym17$QUERY_PARAMETERS, (SubLObject)ConsesLow.list(new SubLObject[] { focus_entity.$kw18$MAX_NUMBER, focus_entity.FIVE_INTEGER, focus_entity.$kw19$MAX_TIME, focus_entity.$int20$200, focus_entity.$kw21$MAX_TRANSFORMATION_DEPTH, focus_entity.ONE_INTEGER, focus_entity.$kw22$BLOCK_, focus_entity.NIL, focus_entity.$kw23$MAX_PROOF_DEPTH, focus_entity.NIL, focus_entity.$kw24$CACHE_INFERENCE_RESULTS_, focus_entity.NIL, focus_entity.$kw25$ANSWER_LANGUAGE, focus_entity.$kw26$HL, focus_entity.$kw27$CONTINUABLE_, focus_entity.T, focus_entity.$kw28$PRODUCTIVITY_LIMIT, focus_entity.$int29$2000000 }));
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject subloop_reserved_initialize_focus_entity_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.$sym31$ISOLATED_P, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.$sym32$INSTANCE_NUMBER, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym13$CYC_ENTITY, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym12$RELEVANT_MT, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym11$TYPES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym10$LEARNED_TYPES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym9$ASSERTED_TYPES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym8$CONTINUABLE_INFERENCE_POOL, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym7$INFERENCE_POOL_CREATED, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym6$SALIENT_QUERY_JUSTIFICATIONS, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym5$SALIENT_QUERIES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym4$UNANSWERED_QUESTIONS, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym3$ANSWERS, (SubLObject)focus_entity.NIL);
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 1928L)
    public static SubLObject focus_entity_p(final SubLObject v_focus_entity) {
        return classes.subloop_instanceof_class(v_focus_entity, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 3195L)
    public static SubLObject focus_entity_all_types_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject learned_types = get_focus_entity_learned_types(self);
        final SubLObject types = get_focus_entity_types(self);
        try {
            thread.throwStack.push(focus_entity.$sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject raw = conses_high.union(types, learned_types, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                SubLObject organized = (SubLObject)focus_entity.NIL;
                SubLObject cdolist_list_var = raw;
                SubLObject candidate_type = (SubLObject)focus_entity.NIL;
                candidate_type = cdolist_list_var.first();
                while (focus_entity.NIL != cdolist_list_var) {
                    SubLObject fail = (SubLObject)focus_entity.NIL;
                    if (focus_entity.NIL == fail) {
                        SubLObject csome_list_var;
                        SubLObject existing_type;
                        for (csome_list_var = organized, existing_type = (SubLObject)focus_entity.NIL, existing_type = csome_list_var.first(); focus_entity.NIL == fail && focus_entity.NIL != csome_list_var; fail = genls.genl_in_any_mtP(existing_type, candidate_type), csome_list_var = csome_list_var.rest(), existing_type = csome_list_var.first()) {}
                    }
                    if (focus_entity.NIL == fail) {
                        organized = (SubLObject)ConsesLow.cons(candidate_type, organized);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_type = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, organized);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_learned_types(self, learned_types);
                    set_focus_entity_types(self, types);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 3649L)
    public static SubLObject focus_entity_generate_salient_queries_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        SubLObject inference_pool_created = get_focus_entity_inference_pool_created(self);
        try {
            thread.throwStack.push(focus_entity.$sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(self, (SubLObject)focus_entity.$sym42$KB_INTEGRATE);
                methods.funcall_instance_method_with_0_args(self, (SubLObject)focus_entity.$sym43$COMPUTE_SALIENT_JUSTIFICATIONS);
                inference_pool_created = (SubLObject)focus_entity.T;
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_inference_pool_created(self, inference_pool_created);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 4007L)
    public static SubLObject focus_entity_kb_integrate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        SubLObject asserted_types = get_focus_entity_asserted_types(self);
        final SubLObject types = get_focus_entity_types(self);
        final SubLObject cyc_entity = get_focus_entity_cyc_entity(self);
        try {
            thread.throwStack.push(focus_entity.$sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject all_types = methods.funcall_instance_method_with_0_args(self, (SubLObject)focus_entity.$sym34$ALL_TYPES);
                SubLObject min_types = (SubLObject)focus_entity.NIL;
                SubLObject pred = (SubLObject)focus_entity.NIL;
                SubLObject mt = (SubLObject)focus_entity.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)focus_entity.$sym48$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(focus_entity.$const49$EverythingPSC, thread);
                    min_types = genls.min_cols(all_types, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                if (focus_entity.NIL != conses_high.member(focus_entity.$const50$Person, types, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED)) {
                    pred = focus_entity.$const51$isa;
                    mt = focus_entity.$const52$PeopleDataMt;
                }
                else if (focus_entity.NIL != conses_high.member(focus_entity.$const53$Organization, types, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED)) {
                    pred = focus_entity.$const51$isa;
                    mt = focus_entity.$const54$OrganizationDataMt;
                }
                else if (focus_entity.NIL != fort_types_interface.collectionP(cyc_entity)) {
                    pred = focus_entity.$const55$genls;
                    mt = focus_entity.$const56$TREC_Mt;
                }
                SubLObject cdolist_list_var = min_types;
                SubLObject m_type = (SubLObject)focus_entity.NIL;
                m_type = cdolist_list_var.first();
                while (focus_entity.NIL != cdolist_list_var) {
                    final SubLObject assertion = (SubLObject)ConsesLow.list(pred, cyc_entity, m_type);
                    final SubLObject wff_test = wff.el_wffP(assertion, mt, (SubLObject)focus_entity.UNPROVIDED);
                    final SubLObject success = (SubLObject)((focus_entity.NIL != wff_test) ? cyc_kernel.cyc_assert(assertion, mt, (SubLObject)focus_entity.UNPROVIDED) : focus_entity.NIL);
                    if (focus_entity.NIL != success) {
                        asserted_types = (SubLObject)ConsesLow.cons(m_type, asserted_types);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    m_type = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_asserted_types(self, asserted_types);
                    set_focus_entity_types(self, types);
                    set_focus_entity_cyc_entity(self, cyc_entity);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 4840L)
    public static SubLObject focus_entity_compute_salient_justifications_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject query_parameters = get_focus_entity_query_parameters(self);
        final SubLObject salience_predicates = get_focus_entity_salience_predicates(self);
        SubLObject continuable_inference_pool = get_focus_entity_continuable_inference_pool(self);
        final SubLObject cyc_entity = get_focus_entity_cyc_entity(self);
        try {
            thread.throwStack.push(focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                if (focus_entity.NIL == cyc_entity) {
                    Dynamic.sublisp_throw((SubLObject)focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                }
                SubLObject cdolist_list_var = salience_predicates;
                SubLObject pred = (SubLObject)focus_entity.NIL;
                pred = cdolist_list_var.first();
                while (focus_entity.NIL != cdolist_list_var) {
                    final SubLObject cont_inf = inference_kernel.new_continuable_inference((SubLObject)ConsesLow.listS(pred, cyc_entity, (SubLObject)focus_entity.$list60), focus_entity.$const49$EverythingPSC, (SubLObject)focus_entity.UNPROVIDED);
                    final SubLObject cont_inf_string = Sequences.cconcatenate((SubLObject)focus_entity.$str61$ci_, PrintLow.format((SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$str62$_S, Symbols.gensym((SubLObject)focus_entity.UNPROVIDED)));
                    final SubLObject task = process_utilities.new_task(cont_inf_string, (SubLObject)focus_entity.$sym63$CONTINUE_INFERENCE, (SubLObject)ConsesLow.list(cont_inf, query_parameters), (SubLObject)focus_entity.UNPROVIDED);
                    continuable_inference_pool = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(task, cont_inf), continuable_inference_pool);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_query_parameters(self, query_parameters);
                    set_focus_entity_salience_predicates(self, salience_predicates);
                    set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                    set_focus_entity_cyc_entity(self, cyc_entity);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 5489L)
    public static SubLObject focus_entity_harvest_queries_from_inference_pool_method(final SubLObject self, final SubLObject specificity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        SubLObject continuable_inference_pool = get_focus_entity_continuable_inference_pool(self);
        final SubLObject types = get_focus_entity_types(self);
        final SubLObject cyc_entity = get_focus_entity_cyc_entity(self);
        try {
            thread.throwStack.push(focus_entity.$sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                SubLObject cycl_queries = (SubLObject)focus_entity.NIL;
                SubLObject new_inference_pool = (SubLObject)focus_entity.NIL;
                SubLObject cdolist_list_var = continuable_inference_pool;
                SubLObject inference_task = (SubLObject)focus_entity.NIL;
                inference_task = cdolist_list_var.first();
                while (focus_entity.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = inference_task;
                    SubLObject task = (SubLObject)focus_entity.NIL;
                    SubLObject inference = (SubLObject)focus_entity.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)focus_entity.$list69);
                    task = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)focus_entity.$list69);
                    inference = current.first();
                    current = current.rest();
                    if (focus_entity.NIL == current) {
                        if (focus_entity.NIL != inference_datastructures_inference.inference_p(inference) && inference_datastructures_inference.inference_status(inference) == focus_entity.$kw70$SUSPENDED) {
                            final SubLObject inf = inference;
                            final SubLObject start_id = inference_datastructures_inference.inference_new_answer_id_start(inference);
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
                            for (end_id = inference_datastructures_inference.inference_next_new_answer_id(inference), id = (SubLObject)focus_entity.NIL, id = start_id; !id.numGE(end_id); id = number_utilities.f_1X(id)) {
                                v_answer = inference_datastructures_inference.find_inference_answer_by_id(inf, id);
                                salient_answer = Numbers.zerop(specificity);
                                cdolist_list_var_$1 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                justification = (SubLObject)focus_entity.NIL;
                                justification = cdolist_list_var_$1.first();
                                while (focus_entity.NIL != cdolist_list_var_$1) {
                                    if (focus_entity.NIL == salient_answer) {
                                        salient_answer = entity_specific_justification_p(cyc_entity, types, justification, specificity);
                                    }
                                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                    justification = cdolist_list_var_$1.first();
                                }
                                if (focus_entity.NIL != salient_answer) {
                                    v_bindings = (cdolist_list_var_$2 = inference_datastructures_inference.inference_answer_bindings(v_answer));
                                    binding = (SubLObject)focus_entity.NIL;
                                    binding = cdolist_list_var_$2.first();
                                    while (focus_entity.NIL != cdolist_list_var_$2) {
                                        var = binding.first();
                                        bind = binding.rest();
                                        query = (SubLObject)focus_entity.NIL;
                                        if (bind.isCons()) {
                                            query = unpack_existential_query(bind, cyc_entity);
                                        }
                                        if (focus_entity.NIL != query) {
                                            query_pred = cycl_utilities.formula_arg0(query);
                                            if (focus_entity.NIL == subl_promotions.memberP(query_pred, (SubLObject)focus_entity.$list71, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED)) {
                                                cycl_queries = (SubLObject)ConsesLow.cons(search_engine.new_cycl_query(query, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED), cycl_queries);
                                            }
                                        }
                                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                        binding = cdolist_list_var_$2.first();
                                    }
                                }
                            }
                            if (focus_entity.NIL != process_utilities.task_process(task)) {
                                Threads.kill_process(process_utilities.task_process(task));
                            }
                            inference_datastructures_inference.destroy_inference(inference);
                        }
                        else if (focus_entity.NIL != inference_datastructures_inference.inference_p(inference)) {
                            new_inference_pool = (SubLObject)ConsesLow.cons(inference_task, new_inference_pool);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)focus_entity.$list69);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    inference_task = cdolist_list_var.first();
                }
                continuable_inference_pool = new_inference_pool;
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, cycl_queries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                    set_focus_entity_types(self, types);
                    set_focus_entity_cyc_entity(self, cyc_entity);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 6967L)
    public static SubLObject focus_entity_get_salient_queries_method(final SubLObject self, SubLObject completeness, SubLObject specificity) {
        if (completeness == focus_entity.UNPROVIDED) {
            completeness = (SubLObject)focus_entity.$kw76$CURRENT;
        }
        if (specificity == focus_entity.UNPROVIDED) {
            specificity = (SubLObject)focus_entity.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        SubLObject salient_queries = get_focus_entity_salient_queries(self);
        try {
            thread.throwStack.push(focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                assert focus_entity.NIL != Types.integerp(specificity) : specificity;
                final SubLObject pcase_var = completeness;
                if (pcase_var.eql((SubLObject)focus_entity.$kw76$CURRENT)) {
                    Dynamic.sublisp_throw((SubLObject)focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, salient_queries);
                }
                else if (pcase_var.eql((SubLObject)focus_entity.$kw79$UPDATE)) {
                    final SubLObject latest = methods.funcall_instance_method_with_1_args(self, (SubLObject)focus_entity.$sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity);
                    SubLObject update = salient_queries;
                    SubLObject cdolist_list_var = latest;
                    SubLObject l = (SubLObject)focus_entity.NIL;
                    l = cdolist_list_var.first();
                    while (focus_entity.NIL != cdolist_list_var) {
                        final SubLObject item_var = l;
                        if (focus_entity.NIL == conses_high.member(item_var, update, (SubLObject)focus_entity.$sym80$CYCL_QUERY_EQUAL_P, Symbols.symbol_function((SubLObject)focus_entity.IDENTITY))) {
                            update = (SubLObject)ConsesLow.cons(item_var, update);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        l = cdolist_list_var.first();
                    }
                    salient_queries = update;
                    Dynamic.sublisp_throw((SubLObject)focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update);
                }
                else if (pcase_var.eql((SubLObject)focus_entity.$kw81$ALL)) {
                    SubLObject update2 = salient_queries;
                    SubLObject latest2 = (SubLObject)focus_entity.NIL;
                    while (focus_entity.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)focus_entity.$sym82$DONE_COMPUTING_SALIENT_QUERIES)) {
                        Threads.sleep((SubLObject)focus_entity.ONE_INTEGER);
                    }
                    SubLObject cdolist_list_var;
                    latest2 = (cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)focus_entity.$sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity));
                    SubLObject l = (SubLObject)focus_entity.NIL;
                    l = cdolist_list_var.first();
                    while (focus_entity.NIL != cdolist_list_var) {
                        final SubLObject item_var = l;
                        if (focus_entity.NIL == conses_high.member(item_var, update2, (SubLObject)focus_entity.$sym80$CYCL_QUERY_EQUAL_P, Symbols.symbol_function((SubLObject)focus_entity.IDENTITY))) {
                            update2 = (SubLObject)ConsesLow.cons(item_var, update2);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        l = cdolist_list_var.first();
                    }
                    salient_queries = update2;
                    Dynamic.sublisp_throw((SubLObject)focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update2);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_salient_queries(self, salient_queries);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 8392L)
    public static SubLObject focus_entity_done_computing_salient_queries_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject continuable_inference_pool = get_focus_entity_continuable_inference_pool(self);
        try {
            thread.throwStack.push(focus_entity.$sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                SubLObject still_working = (SubLObject)focus_entity.NIL;
                if (focus_entity.NIL == still_working) {
                    SubLObject csome_list_var = continuable_inference_pool;
                    SubLObject inference_task = (SubLObject)focus_entity.NIL;
                    inference_task = csome_list_var.first();
                    while (focus_entity.NIL == still_working && focus_entity.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = inference_task;
                        SubLObject task = (SubLObject)focus_entity.NIL;
                        SubLObject inference = (SubLObject)focus_entity.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)focus_entity.$list69);
                        task = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)focus_entity.$list69);
                        inference = current.first();
                        current = current.rest();
                        if (focus_entity.NIL == current) {
                            if (focus_entity.NIL != inference_datastructures_inference.inference_p(inference)) {
                                final SubLObject status = inference_datastructures_inference.inference_status(inference);
                                still_working = conses_high.member(status, (SubLObject)focus_entity.$list86, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)focus_entity.$list69);
                        }
                        csome_list_var = csome_list_var.rest();
                        inference_task = csome_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(focus_entity.NIL == still_working));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 8962L)
    public static SubLObject focus_entity_answer_salient_queries_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = (SubLObject)focus_entity.NIL;
        SubLObject answers = get_focus_entity_answers(self);
        SubLObject unanswered_questions = get_focus_entity_unanswered_questions(self);
        final SubLObject salient_queries = get_focus_entity_salient_queries(self);
        try {
            thread.throwStack.push(focus_entity.$sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject _prev_bind_0 = control_vars.$ask_quirkP$.currentBinding(thread);
                try {
                    control_vars.$ask_quirkP$.bind((SubLObject)focus_entity.T, thread);
                    SubLObject cdolist_list_var = salient_queries;
                    SubLObject query = (SubLObject)focus_entity.NIL;
                    query = cdolist_list_var.first();
                    while (focus_entity.NIL != cdolist_list_var) {
                        final SubLObject local_answers = methods.funcall_instance_method_with_0_args(query, (SubLObject)focus_entity.$sym91$ANSWER);
                        if (focus_entity.NIL == local_answers) {
                            unanswered_questions = (SubLObject)ConsesLow.cons(query, unanswered_questions);
                        }
                        SubLObject cdolist_list_var_$3 = local_answers;
                        SubLObject v_answer = (SubLObject)focus_entity.NIL;
                        v_answer = cdolist_list_var_$3.first();
                        while (focus_entity.NIL != cdolist_list_var_$3) {
                            answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            v_answer = cdolist_list_var_$3.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        query = cdolist_list_var.first();
                    }
                }
                finally {
                    control_vars.$ask_quirkP$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_focus_entity_answers(self, answers);
                    set_focus_entity_unanswered_questions(self, unanswered_questions);
                    set_focus_entity_salient_queries(self, salient_queries);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject get_textual_focus_entity_learned_textual_types(final SubLObject textual_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(textual_focus_entity, (SubLObject)focus_entity.FOURTEEN_INTEGER, (SubLObject)focus_entity.$sym95$LEARNED_TEXTUAL_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject set_textual_focus_entity_learned_textual_types(final SubLObject textual_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(textual_focus_entity, value, (SubLObject)focus_entity.FOURTEEN_INTEGER, (SubLObject)focus_entity.$sym95$LEARNED_TEXTUAL_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject get_textual_focus_entity_passages(final SubLObject textual_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(textual_focus_entity, (SubLObject)focus_entity.THIRTEEN_INTEGER, (SubLObject)focus_entity.$sym96$PASSAGES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject set_textual_focus_entity_passages(final SubLObject textual_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(textual_focus_entity, value, (SubLObject)focus_entity.THIRTEEN_INTEGER, (SubLObject)focus_entity.$sym96$PASSAGES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject get_textual_focus_entity_name(final SubLObject textual_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(textual_focus_entity, (SubLObject)focus_entity.TWELVE_INTEGER, (SubLObject)focus_entity.$sym97$NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject set_textual_focus_entity_name(final SubLObject textual_focus_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(textual_focus_entity, value, (SubLObject)focus_entity.TWELVE_INTEGER, (SubLObject)focus_entity.$sym97$NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject subloop_reserved_initialize_textual_focus_entity_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.$sym14$INSTANCE_COUNT, (SubLObject)focus_entity.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym15$SALIENCE_PREDICATES, (SubLObject)focus_entity.$list16);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym17$QUERY_PARAMETERS, (SubLObject)ConsesLow.list(new SubLObject[] { focus_entity.$kw18$MAX_NUMBER, focus_entity.FIVE_INTEGER, focus_entity.$kw19$MAX_TIME, focus_entity.$int20$200, focus_entity.$kw21$MAX_TRANSFORMATION_DEPTH, focus_entity.ONE_INTEGER, focus_entity.$kw22$BLOCK_, focus_entity.NIL, focus_entity.$kw23$MAX_PROOF_DEPTH, focus_entity.NIL, focus_entity.$kw24$CACHE_INFERENCE_RESULTS_, focus_entity.NIL, focus_entity.$kw25$ANSWER_LANGUAGE, focus_entity.$kw26$HL, focus_entity.$kw27$CONTINUABLE_, focus_entity.T, focus_entity.$kw28$PRODUCTIVITY_LIMIT, focus_entity.$int29$2000000 }));
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject subloop_reserved_initialize_textual_focus_entity_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.$sym31$ISOLATED_P, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.$sym32$INSTANCE_NUMBER, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym13$CYC_ENTITY, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym12$RELEVANT_MT, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym11$TYPES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym10$LEARNED_TYPES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym9$ASSERTED_TYPES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym8$CONTINUABLE_INFERENCE_POOL, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym7$INFERENCE_POOL_CREATED, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym6$SALIENT_QUERY_JUSTIFICATIONS, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym5$SALIENT_QUERIES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym4$UNANSWERED_QUESTIONS, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym3$ANSWERS, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym97$NAME, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym96$PASSAGES, (SubLObject)focus_entity.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym95$LEARNED_TEXTUAL_TYPES, (SubLObject)focus_entity.NIL);
        return (SubLObject)focus_entity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9437L)
    public static SubLObject textual_focus_entity_p(final SubLObject textual_focus_entity) {
        return classes.subloop_instanceof_class(textual_focus_entity, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 9976L)
    public static SubLObject new_textual_focus_entity(final SubLObject name, final SubLObject cyc_entity, SubLObject types) {
        if (types == focus_entity.UNPROVIDED) {
            types = (SubLObject)focus_entity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert focus_entity.NIL != Types.stringp(name) : name;
        assert focus_entity.NIL != collection_defns.cycl_expressionP(cyc_entity) : cyc_entity;
        assert focus_entity.NIL != Types.listp(types) : types;
        final SubLObject v_new = object.new_class_instance((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY);
        SubLObject minimal_types = types;
        SubLObject recoverable_types = (SubLObject)focus_entity.NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)focus_entity.$sym48$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(focus_entity.$const49$EverythingPSC, thread);
            recoverable_types = isa.min_isa(cyc_entity, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)focus_entity.$sym48$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(focus_entity.$const49$EverythingPSC, thread);
            minimal_types = genls.min_cols(conses_high.union(recoverable_types, types, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED), (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        instances.set_slot(v_new, (SubLObject)focus_entity.$sym97$NAME, name);
        instances.set_slot(v_new, (SubLObject)focus_entity.$sym13$CYC_ENTITY, cyc_entity);
        instances.set_slot(v_new, (SubLObject)focus_entity.$sym11$TYPES, list_utilities.remove_if_not((SubLObject)focus_entity.$sym103$ADMISSIBLE_FOCUS_ENTITY_TYPE, minimal_types, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED));
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 10800L)
    public static SubLObject textual_focus_entity_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject name = get_textual_focus_entity_name(self);
        try {
            thread.throwStack.push(focus_entity.$sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, name);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_textual_focus_entity_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 10875L)
    public static SubLObject textual_focus_entity_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject name = get_textual_focus_entity_name(self);
        final SubLObject answers = get_focus_entity_answers(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(focus_entity.$sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                streams_high.write_string((SubLObject)focus_entity.$str111$__ESS_ENT_, stream, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                print_high.prin1(instance_number, stream);
                streams_high.write_string((SubLObject)focus_entity.$str112$__, stream, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                print_high.prin1(name, stream);
                streams_high.write_string((SubLObject)focus_entity.$str113$_types__, stream, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                print_high.prin1(Sequences.length(methods.funcall_instance_method_with_0_args(self, (SubLObject)focus_entity.$sym34$ALL_TYPES)), stream);
                streams_high.write_string((SubLObject)focus_entity.$str114$_facts__, stream, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                print_high.prin1(Sequences.length(answers), stream);
                streams_high.write_string((SubLObject)focus_entity.$str115$_, stream, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                streams_high.terpri(stream);
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_textual_focus_entity_name(self, name);
                    set_focus_entity_answers(self, answers);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11302L)
    public static SubLObject textual_focus_entity_equal_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject name = get_textual_focus_entity_name(self);
        try {
            thread.throwStack.push(focus_entity.$sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(focus_entity.NIL != textual_focus_entity_p(v_object) && name.equal(methods.funcall_instance_method_with_0_args(v_object, (SubLObject)focus_entity.$sym97$NAME))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_textual_focus_entity_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11535L)
    public static SubLObject textual_focus_entity_equal(final SubLObject e1, final SubLObject e2) {
        assert focus_entity.NIL != textual_focus_entity_p(e1) : e1;
        assert focus_entity.NIL != textual_focus_entity_p(e2) : e2;
        return methods.funcall_instance_method_with_1_args(e1, (SubLObject)focus_entity.EQUAL, e2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11696L)
    public static SubLObject textual_focus_entity_chronology_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)focus_entity.$sym124$RENDER, (SubLObject)focus_entity.$list125);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 11928L)
    public static SubLObject textual_focus_entity_render_method(final SubLObject self, SubLObject strategy) {
        if (strategy == focus_entity.UNPROVIDED) {
            strategy = (SubLObject)focus_entity.$list129;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject name = get_textual_focus_entity_name(self);
        final SubLObject answers = get_focus_entity_answers(self);
        try {
            thread.throwStack.push(focus_entity.$sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject format = conses_high.getf(strategy, (SubLObject)focus_entity.$kw131$FORMAT, (SubLObject)focus_entity.UNPROVIDED);
                final SubLObject order = conses_high.getf(strategy, (SubLObject)focus_entity.$kw132$ORDER, (SubLObject)focus_entity.UNPROVIDED);
                SubLObject accumulator = (SubLObject)focus_entity.NIL;
                SubLObject pcase_var = format;
                if (pcase_var.eql((SubLObject)focus_entity.$kw133$TEXT)) {
                    accumulator = Sequences.cconcatenate(name, new SubLObject[] { focus_entity.$str134$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                }
                pcase_var = order;
                if (pcase_var.eql((SubLObject)focus_entity.$kw135$SEQUENTIAL)) {
                    SubLObject cdolist_list_var = answers;
                    SubLObject v_answer = (SubLObject)focus_entity.NIL;
                    v_answer = cdolist_list_var.first();
                    while (focus_entity.NIL != cdolist_list_var) {
                        final SubLObject justification = methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)focus_entity.$sym136$JUSTIFY);
                        final SubLObject source = (SubLObject)((focus_entity.NIL != search_engine.corpus_passage_p(justification)) ? methods.funcall_instance_method_with_0_args(justification, (SubLObject)focus_entity.$sym137$GET_SOURCE) : focus_entity.$str138$);
                        accumulator = Sequences.cconcatenate(accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)focus_entity.$sym139$GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), focus_entity.$str140$_, source, focus_entity.$str141$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                        cdolist_list_var = cdolist_list_var.rest();
                        v_answer = cdolist_list_var.first();
                    }
                }
                else if (pcase_var.eql((SubLObject)focus_entity.$kw142$CHRONOLOGICAL)) {
                    SubLObject cdolist_list_var2;
                    final SubLObject sorted = cdolist_list_var2 = Sort.sort(conses_high.copy_list(answers), (SubLObject)focus_entity.$sym143$ANSWER_OLDER_METHOD, (SubLObject)focus_entity.UNPROVIDED);
                    SubLObject v_answer2 = (SubLObject)focus_entity.NIL;
                    v_answer2 = cdolist_list_var2.first();
                    while (focus_entity.NIL != cdolist_list_var2) {
                        final SubLObject justification2 = methods.funcall_instance_method_with_0_args(v_answer2, (SubLObject)focus_entity.$sym136$JUSTIFY);
                        final SubLObject source2 = (SubLObject)((focus_entity.NIL != search_engine.corpus_passage_p(justification2)) ? methods.funcall_instance_method_with_0_args(justification2, (SubLObject)focus_entity.$sym137$GET_SOURCE) : focus_entity.$str138$);
                        accumulator = Sequences.cconcatenate(accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args(v_answer2, (SubLObject)focus_entity.$sym139$GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), focus_entity.$str140$_, source2, focus_entity.$str141$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_answer2 = cdolist_list_var2.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, accumulator);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_textual_focus_entity_name(self, name);
                    set_focus_entity_answers(self, answers);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 13164L)
    public static SubLObject textual_focus_entity_learn_types_from_corpora_method(final SubLObject self, final SubLObject corpora) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = (SubLObject)focus_entity.NIL;
        final SubLObject name = get_textual_focus_entity_name(self);
        SubLObject answers = get_focus_entity_answers(self);
        SubLObject unanswered_questions = get_focus_entity_unanswered_questions(self);
        SubLObject learned_types = get_focus_entity_learned_types(self);
        try {
            thread.throwStack.push(focus_entity.$sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                assert focus_entity.NIL != Types.listp(corpora) : corpora;
                SubLObject current_types = methods.funcall_instance_method_with_0_args(self, (SubLObject)focus_entity.$sym34$ALL_TYPES);
                SubLObject local_answers = (SubLObject)focus_entity.NIL;
                SubLObject who_type = (SubLObject)focus_entity.NIL;
                SubLObject v_question = (SubLObject)focus_entity.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)focus_entity.$sym48$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(focus_entity.$const49$EverythingPSC, thread);
                    who_type = genls.any_genl_anyP(current_types, (SubLObject)focus_entity.$list149, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                if (focus_entity.NIL != who_type) {
                    v_question = question.new_question(Sequences.cconcatenate((SubLObject)focus_entity.$str150$Who_is_, new SubLObject[] { name, focus_entity.$str151$_ }), (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                }
                else {
                    v_question = question.new_question(Sequences.cconcatenate((SubLObject)focus_entity.$str152$What_is_, new SubLObject[] { name, focus_entity.$str151$_ }), (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                }
                if (focus_entity.NIL != v_question) {
                    local_answers = methods.funcall_instance_method_with_0_args(v_question, (SubLObject)focus_entity.$sym91$ANSWER);
                }
                if (focus_entity.NIL == local_answers) {
                    unanswered_questions = (SubLObject)ConsesLow.cons(v_question, unanswered_questions);
                }
                SubLObject cdolist_list_var = local_answers;
                SubLObject v_answer = (SubLObject)focus_entity.NIL;
                v_answer = cdolist_list_var.first();
                while (focus_entity.NIL != cdolist_list_var) {
                    answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                    final SubLObject _prev_bind_3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                    try {
                        parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)focus_entity.NIL, thread);
                        SubLObject cdolist_list_var_$4;
                        final SubLObject denots = cdolist_list_var_$4 = psp_main.ps_get_cycls_for_np(methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)focus_entity.$sym139$GET_CONTENT), (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED);
                        SubLObject denot = (SubLObject)focus_entity.NIL;
                        denot = cdolist_list_var_$4.first();
                        while (focus_entity.NIL != cdolist_list_var_$4) {
                            SubLObject fail = (SubLObject)focus_entity.NIL;
                            if (focus_entity.NIL == fail) {
                                SubLObject csome_list_var = current_types;
                                SubLObject type = (SubLObject)focus_entity.NIL;
                                type = csome_list_var.first();
                                while (focus_entity.NIL == fail && focus_entity.NIL != csome_list_var) {
                                    final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)focus_entity.$sym48$RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind(focus_entity.$const49$EverythingPSC, thread);
                                        fail = disjoint_with.collections_disjointP(denot, type, (SubLObject)focus_entity.UNPROVIDED);
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$5, thread);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    type = csome_list_var.first();
                                }
                            }
                            if (focus_entity.NIL == fail) {
                                current_types = (SubLObject)ConsesLow.cons(denot, current_types);
                                learned_types = (SubLObject)ConsesLow.cons(denot, learned_types);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            denot = cdolist_list_var_$4.first();
                        }
                    }
                    finally {
                        parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_3, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_textual_focus_entity_name(self, name);
                    set_focus_entity_answers(self, answers);
                    set_focus_entity_unanswered_questions(self, unanswered_questions);
                    set_focus_entity_learned_types(self, learned_types);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 14383L)
    public static SubLObject textual_focus_entity_add_passage_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = (SubLObject)focus_entity.NIL;
        SubLObject passages = get_textual_focus_entity_passages(self);
        try {
            thread.throwStack.push(focus_entity.$sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                assert focus_entity.NIL != search_engine.corpus_passage_p(passage) : passage;
                if (focus_entity.NIL == conses_high.member(passage, passages, (SubLObject)focus_entity.$sym159$PASSAGE_EQUAL, Symbols.symbol_function((SubLObject)focus_entity.IDENTITY))) {
                    passages = (SubLObject)ConsesLow.cons(passage, passages);
                }
                Dynamic.sublisp_throw((SubLObject)focus_entity.$sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)focus_entity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_textual_focus_entity_passages(self, passages);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)focus_entity.$sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 14729L)
    public static SubLObject entity_specific_justification_p(final SubLObject entity, final SubLObject types, final SubLObject justification, final SubLObject threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert focus_entity.NIL != inference_datastructures_inference.inference_answer_justification_p(justification) : justification;
        SubLObject degrees_of_separation = (SubLObject)focus_entity.ZERO_INTEGER;
        final SubLObject justification_steps = inference_datastructures_inference.inference_answer_justification_supports(justification);
        SubLObject broader_than_type = (SubLObject)focus_entity.NIL;
        if (focus_entity.NIL == broader_than_type) {
            SubLObject csome_list_var = types;
            SubLObject type = (SubLObject)focus_entity.NIL;
            type = csome_list_var.first();
            while (focus_entity.NIL == broader_than_type && focus_entity.NIL != csome_list_var) {
                if (focus_entity.NIL == broader_than_type) {
                    SubLObject csome_list_var_$6 = justification_steps;
                    SubLObject step = (SubLObject)focus_entity.NIL;
                    step = csome_list_var_$6.first();
                    while (focus_entity.NIL == broader_than_type && focus_entity.NIL != csome_list_var_$6) {
                        if (step.isCons() && focus_entity.$kw162$ISA == step.first()) {
                            final SubLObject gaf = conses_high.second(step);
                            final SubLObject arg1 = cycl_utilities.formula_arg1(gaf, (SubLObject)focus_entity.UNPROVIDED);
                            final SubLObject arg2 = cycl_utilities.formula_arg2(gaf, (SubLObject)focus_entity.UNPROVIDED);
                            if (entity.equal(arg1)) {
                                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)focus_entity.$sym48$RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind(focus_entity.$const49$EverythingPSC, thread);
                                    broader_than_type = (SubLObject)SubLObjectFactory.makeBoolean(!type.eql(arg2) && focus_entity.NIL != genls.genlP(type, arg2, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED));
                                    degrees_of_separation = Sequences.length(isa.why_isaP(entity, arg2, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED, (SubLObject)focus_entity.UNPROVIDED));
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
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
        if (focus_entity.NIL != broader_than_type) {
            return (SubLObject)focus_entity.NIL;
        }
        if (degrees_of_separation.numG(threshold)) {
            return (SubLObject)focus_entity.NIL;
        }
        return (SubLObject)focus_entity.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 16263L)
    public static SubLObject unpack_existential_query(final SubLObject formula, final SubLObject entity) {
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        if (focus_entity.$const163$thereExists.eql(operator)) {
            return cycl_utilities.formula_arg2(formula, (SubLObject)focus_entity.UNPROVIDED);
        }
        if (focus_entity.$const164$relationExistsInstance.eql(operator) || focus_entity.$const165$relationInstanceExists.eql(operator)) {
            final SubLObject pred = cycl_utilities.formula_arg1(formula, (SubLObject)focus_entity.UNPROVIDED);
            final SubLObject arg1 = (SubLObject)(cycl_utilities.formula_arg2(formula, (SubLObject)focus_entity.UNPROVIDED).equal(entity) ? entity : focus_entity.$sym166$_WHAT);
            final SubLObject arg2 = (SubLObject)(cycl_utilities.formula_arg3(formula, (SubLObject)focus_entity.UNPROVIDED).equal(entity) ? entity : focus_entity.$sym166$_WHAT);
            return (SubLObject)ConsesLow.list(pred, arg1, arg2);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/focus-entity.lisp", position = 16783L)
    public static SubLObject admissible_focus_entity_type(final SubLObject cyc_expression) {
        if (focus_entity.NIL != isa.isa_in_any_mtP(cyc_expression, focus_entity.$const167$CycKBSubsetCollection)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != isa.isa_in_any_mtP(cyc_expression, focus_entity.$const168$CycVocabularyTopic)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != isa.isa_in_any_mtP(cyc_expression, focus_entity.$const169$KFDInternalKRTerm)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != isa.isa_in_any_mtP(cyc_expression, focus_entity.$const170$MicrotheoryType)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != isa.isa_in_any_mtP(cyc_expression, focus_entity.$const171$VocabularyConstrainingAbstraction)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != isa.isa_in_any_mtP(cyc_expression, focus_entity.$const172$RelationshipType)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != isa.quoted_isa_in_any_mtP(cyc_expression, focus_entity.$const173$MIPTMappingConstant)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != genls.genl_in_any_mtP(cyc_expression, focus_entity.$const174$DealingWithAStringInNounLearnerTo)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (focus_entity.NIL != genls.genl_in_any_mtP(cyc_expression, focus_entity.$const175$LexicalItem)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (cyc_expression.eql(focus_entity.$const176$QAClarifyingCollectionType)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (cyc_expression.eql(focus_entity.$const177$BBNEntityType)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (cyc_expression.eql(focus_entity.$const178$Individual)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (cyc_expression.eql(focus_entity.$const179$PotentiallyPornRelated)) {
            return (SubLObject)focus_entity.NIL;
        }
        if (cyc_expression.eql(focus_entity.$const180$PersonTypeByGender)) {
            return (SubLObject)focus_entity.NIL;
        }
        return (SubLObject)focus_entity.T;
    }
    
    public static SubLObject declare_focus_entity_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_answers", "GET-FOCUS-ENTITY-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_answers", "SET-FOCUS-ENTITY-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_unanswered_questions", "GET-FOCUS-ENTITY-UNANSWERED-QUESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_unanswered_questions", "SET-FOCUS-ENTITY-UNANSWERED-QUESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_salient_queries", "GET-FOCUS-ENTITY-SALIENT-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_salient_queries", "SET-FOCUS-ENTITY-SALIENT-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_salient_query_justifications", "GET-FOCUS-ENTITY-SALIENT-QUERY-JUSTIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_salient_query_justifications", "SET-FOCUS-ENTITY-SALIENT-QUERY-JUSTIFICATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_inference_pool_created", "GET-FOCUS-ENTITY-INFERENCE-POOL-CREATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_inference_pool_created", "SET-FOCUS-ENTITY-INFERENCE-POOL-CREATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_continuable_inference_pool", "GET-FOCUS-ENTITY-CONTINUABLE-INFERENCE-POOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_continuable_inference_pool", "SET-FOCUS-ENTITY-CONTINUABLE-INFERENCE-POOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_asserted_types", "GET-FOCUS-ENTITY-ASSERTED-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_asserted_types", "SET-FOCUS-ENTITY-ASSERTED-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_learned_types", "GET-FOCUS-ENTITY-LEARNED-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_learned_types", "SET-FOCUS-ENTITY-LEARNED-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_types", "GET-FOCUS-ENTITY-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_types", "SET-FOCUS-ENTITY-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_relevant_mt", "GET-FOCUS-ENTITY-RELEVANT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_relevant_mt", "SET-FOCUS-ENTITY-RELEVANT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_cyc_entity", "GET-FOCUS-ENTITY-CYC-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_cyc_entity", "SET-FOCUS-ENTITY-CYC-ENTITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_query_parameters", "GET-FOCUS-ENTITY-QUERY-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_query_parameters", "SET-FOCUS-ENTITY-QUERY-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_focus_entity_salience_predicates", "GET-FOCUS-ENTITY-SALIENCE-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_focus_entity_salience_predicates", "SET-FOCUS-ENTITY-SALIENCE-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "subloop_reserved_initialize_focus_entity_class", "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "subloop_reserved_initialize_focus_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_p", "FOCUS-ENTITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_all_types_method", "FOCUS-ENTITY-ALL-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_generate_salient_queries_method", "FOCUS-ENTITY-GENERATE-SALIENT-QUERIES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_kb_integrate_method", "FOCUS-ENTITY-KB-INTEGRATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_compute_salient_justifications_method", "FOCUS-ENTITY-COMPUTE-SALIENT-JUSTIFICATIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_harvest_queries_from_inference_pool_method", "FOCUS-ENTITY-HARVEST-QUERIES-FROM-INFERENCE-POOL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_get_salient_queries_method", "FOCUS-ENTITY-GET-SALIENT-QUERIES-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_done_computing_salient_queries_method", "FOCUS-ENTITY-DONE-COMPUTING-SALIENT-QUERIES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "focus_entity_answer_salient_queries_method", "FOCUS-ENTITY-ANSWER-SALIENT-QUERIES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_textual_focus_entity_learned_textual_types", "GET-TEXTUAL-FOCUS-ENTITY-LEARNED-TEXTUAL-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_textual_focus_entity_learned_textual_types", "SET-TEXTUAL-FOCUS-ENTITY-LEARNED-TEXTUAL-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_textual_focus_entity_passages", "GET-TEXTUAL-FOCUS-ENTITY-PASSAGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_textual_focus_entity_passages", "SET-TEXTUAL-FOCUS-ENTITY-PASSAGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "get_textual_focus_entity_name", "GET-TEXTUAL-FOCUS-ENTITY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "set_textual_focus_entity_name", "SET-TEXTUAL-FOCUS-ENTITY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "subloop_reserved_initialize_textual_focus_entity_class", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "subloop_reserved_initialize_textual_focus_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_p", "TEXTUAL-FOCUS-ENTITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "new_textual_focus_entity", "NEW-TEXTUAL-FOCUS-ENTITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_name_method", "TEXTUAL-FOCUS-ENTITY-NAME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_print_method", "TEXTUAL-FOCUS-ENTITY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_equal_method", "TEXTUAL-FOCUS-ENTITY-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_equal", "TEXTUAL-FOCUS-ENTITY-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_chronology_method", "TEXTUAL-FOCUS-ENTITY-CHRONOLOGY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_render_method", "TEXTUAL-FOCUS-ENTITY-RENDER-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_learn_types_from_corpora_method", "TEXTUAL-FOCUS-ENTITY-LEARN-TYPES-FROM-CORPORA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "textual_focus_entity_add_passage_method", "TEXTUAL-FOCUS-ENTITY-ADD-PASSAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "entity_specific_justification_p", "ENTITY-SPECIFIC-JUSTIFICATION-P", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "unpack_existential_query", "UNPACK-EXISTENTIAL-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.focus_entity", "admissible_focus_entity_type", "ADMISSIBLE-FOCUS-ENTITY-TYPE", 1, 0, false);
        return (SubLObject)focus_entity.NIL;
    }
    
    public static SubLObject init_focus_entity_file() {
        return (SubLObject)focus_entity.NIL;
    }
    
    public static SubLObject setup_focus_entity_file() {
        classes.subloop_new_class((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym1$OBJECT, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym30$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym33$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE);
        subloop_reserved_initialize_focus_entity_class((SubLObject)focus_entity.$sym0$FOCUS_ENTITY);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym34$ALL_TYPES, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list36);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym34$ALL_TYPES, (SubLObject)focus_entity.$sym38$FOCUS_ENTITY_ALL_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym39$GENERATE_SALIENT_QUERIES, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list40);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym39$GENERATE_SALIENT_QUERIES, (SubLObject)focus_entity.$sym44$FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym42$KB_INTEGRATE, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list45, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list46);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym42$KB_INTEGRATE, (SubLObject)focus_entity.$sym57$FOCUS_ENTITY_KB_INTEGRATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym43$COMPUTE_SALIENT_JUSTIFICATIONS, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list45, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list58);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym43$COMPUTE_SALIENT_JUSTIFICATIONS, (SubLObject)focus_entity.$sym64$FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list45, (SubLObject)focus_entity.$list66, (SubLObject)focus_entity.$list67);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL, (SubLObject)focus_entity.$sym72$FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym73$GET_SALIENT_QUERIES, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.$list74, (SubLObject)focus_entity.$list75);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym73$GET_SALIENT_QUERIES, (SubLObject)focus_entity.$sym83$FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym82$DONE_COMPUTING_SALIENT_QUERIES, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list84);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym82$DONE_COMPUTING_SALIENT_QUERIES, (SubLObject)focus_entity.$sym87$FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym88$ANSWER_SALIENT_QUERIES, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list89);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.$sym88$ANSWER_SALIENT_QUERIES, (SubLObject)focus_entity.$sym92$FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD);
        classes.subloop_new_class((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym0$FOCUS_ENTITY, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list94);
        classes.class_set_implements_slot_listeners((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym98$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym99$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE);
        subloop_reserved_initialize_textual_focus_entity_class((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym97$NAME, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list104);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym97$NAME, (SubLObject)focus_entity.$sym106$TEXTUAL_FOCUS_ENTITY_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym107$PRINT, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list45, (SubLObject)focus_entity.$list108, (SubLObject)focus_entity.$list109);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym107$PRINT, (SubLObject)focus_entity.$sym116$TEXTUAL_FOCUS_ENTITY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.EQUAL, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.$list117, (SubLObject)focus_entity.$list118);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.EQUAL, (SubLObject)focus_entity.$sym120$TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym122$CHRONOLOGY, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.NIL, (SubLObject)focus_entity.$list123);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym122$CHRONOLOGY, (SubLObject)focus_entity.$sym126$TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym124$RENDER, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.$list127, (SubLObject)focus_entity.$list128);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym124$RENDER, (SubLObject)focus_entity.$sym144$TEXTUAL_FOCUS_ENTITY_RENDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym145$LEARN_TYPES_FROM_CORPORA, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.$list146, (SubLObject)focus_entity.$list147);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym145$LEARN_TYPES_FROM_CORPORA, (SubLObject)focus_entity.$sym153$TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)focus_entity.$sym154$ADD_PASSAGE, (SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$list35, (SubLObject)focus_entity.$list155, (SubLObject)focus_entity.$list156);
        methods.subloop_register_instance_method((SubLObject)focus_entity.$sym93$TEXTUAL_FOCUS_ENTITY, (SubLObject)focus_entity.$sym154$ADD_PASSAGE, (SubLObject)focus_entity.$sym160$TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD);
        return (SubLObject)focus_entity.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_focus_entity_file();
    }
    
    @Override
	public void initializeVariables() {
        init_focus_entity_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_focus_entity_file();
    }
    
    static {
        me = (SubLFile)new focus_entity();
        $sym0$FOCUS_ENTITY = SubLObjectFactory.makeSymbol("FOCUS-ENTITY");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SALIENCE-PREDICATES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keStrongSuggestion"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeKeyword("MAX-NUMBER"), focus_entity.FIVE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(200), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), focus_entity.ONE_INTEGER, SubLObjectFactory.makeKeyword("BLOCK?"), focus_entity.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), focus_entity.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), focus_entity.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), focus_entity.T, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeInteger(2000000) })), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-POOL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-POOL-CREATED"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERY-JUSTIFICATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNANSWERED-QUESTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-SALIENT-QUERIES"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTEGRATE"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-SALIENT-QUERIES"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-COMPUTING-SALIENT-QUERIES"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym3$ANSWERS = SubLObjectFactory.makeSymbol("ANSWERS");
        $sym4$UNANSWERED_QUESTIONS = SubLObjectFactory.makeSymbol("UNANSWERED-QUESTIONS");
        $sym5$SALIENT_QUERIES = SubLObjectFactory.makeSymbol("SALIENT-QUERIES");
        $sym6$SALIENT_QUERY_JUSTIFICATIONS = SubLObjectFactory.makeSymbol("SALIENT-QUERY-JUSTIFICATIONS");
        $sym7$INFERENCE_POOL_CREATED = SubLObjectFactory.makeSymbol("INFERENCE-POOL-CREATED");
        $sym8$CONTINUABLE_INFERENCE_POOL = SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-POOL");
        $sym9$ASSERTED_TYPES = SubLObjectFactory.makeSymbol("ASSERTED-TYPES");
        $sym10$LEARNED_TYPES = SubLObjectFactory.makeSymbol("LEARNED-TYPES");
        $sym11$TYPES = SubLObjectFactory.makeSymbol("TYPES");
        $sym12$RELEVANT_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT");
        $sym13$CYC_ENTITY = SubLObjectFactory.makeSymbol("CYC-ENTITY");
        $sym14$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym15$SALIENCE_PREDICATES = SubLObjectFactory.makeSymbol("SALIENCE-PREDICATES");
        $list16 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keStrongSuggestion")));
        $sym17$QUERY_PARAMETERS = SubLObjectFactory.makeSymbol("QUERY-PARAMETERS");
        $kw18$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw19$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int20$200 = SubLObjectFactory.makeInteger(200);
        $kw21$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw22$BLOCK_ = SubLObjectFactory.makeKeyword("BLOCK?");
        $kw23$MAX_PROOF_DEPTH = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $kw24$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw25$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw26$HL = SubLObjectFactory.makeKeyword("HL");
        $kw27$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw28$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $int29$2000000 = SubLObjectFactory.makeInteger(2000000);
        $sym30$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-CLASS");
        $sym31$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym32$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym33$SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-INSTANCE");
        $sym34$ALL_TYPES = SubLObjectFactory.makeSymbol("ALL-TYPES");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp, the list of all Cyc types this entity is know to be an instance of.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-TYPES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORGANIZED"), (SubLObject)focus_entity.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RAW")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ORGANIZED"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ORGANIZED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ORGANIZED"))));
        $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $sym38$FOCUS_ENTITY_ALL_TYPES_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-ALL-TYPES-METHOD");
        $sym39$GENERATE_SALIENT_QUERIES = SubLObjectFactory.makeSymbol("GENERATE-SALIENT-QUERIES");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTEGRATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-SALIENT-JUSTIFICATIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-POOL-CREATED"), (SubLObject)focus_entity.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $sym42$KB_INTEGRATE = SubLObjectFactory.makeSymbol("KB-INTEGRATE");
        $sym43$COMPUTE_SALIENT_JUSTIFICATIONS = SubLObjectFactory.makeSymbol("COMPUTE-SALIENT-JUSTIFICATIONS");
        $sym44$FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-GENERATE-SALIENT-QUERIES-METHOD");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return focus-entity-p\n   As a side effect it introduces this entity into the KB, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES")))), (SubLObject)SubLObjectFactory.makeSymbol("MIN-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-COLS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)SubLObjectFactory.makeSymbol("TYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PeopleDataMt")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")), (SubLObject)SubLObjectFactory.makeSymbol("TYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrganizationDataMt")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TREC-Mt"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("M-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-TYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("M-TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-WFF?"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUCCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("M-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-TYPES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $sym48$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const49$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const50$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $const51$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const52$PeopleDataMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PeopleDataMt"));
        $const53$Organization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"));
        $const54$OrganizationDataMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrganizationDataMt"));
        $const55$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const56$TREC_Mt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TREC-Mt"));
        $sym57$FOCUS_ENTITY_KB_INTEGRATE_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-KB-INTEGRATE-METHOD");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENCE-PREDICATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONT-INF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTINUABLE-INFERENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?WHAT")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONT-INF-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("ci-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeString("~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENSYM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CONT-INF-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONT-INF"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PARAMETERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CONT-INF")), (SubLObject)SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-POOL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?WHAT"));
        $str61$ci_ = SubLObjectFactory.makeString("ci-");
        $str62$_S = SubLObjectFactory.makeString("~S");
        $sym63$CONTINUE_INFERENCE = SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE");
        $sym64$FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-COMPUTE-SALIENT-JUSTIFICATIONS-METHOD");
        $sym65$HARVEST_QUERIES_FROM_INFERENCE_POOL = SubLObjectFactory.makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY"));
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERIES"), (SubLObject)focus_entity.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INFERENCE-POOL"), (SubLObject)focus_entity.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-POOL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)focus_entity.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)SubLObjectFactory.makeKeyword("SUSPENDED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-INFERENCE-NEW-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SALIENT-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY-SPECIFIC-JUSTIFICATION-P"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING"))), (SubLObject)SubLObjectFactory.makeSymbol("QUERY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("BIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNPACK-EXISTENTIAL-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ENTITY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCL-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY")), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERIES"))))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KILL-PROCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESTROY-INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INFERENCE-POOL")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-POOL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INFERENCE-POOL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERIES"))));
        $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"));
        $kw70$SUSPENDED = SubLObjectFactory.makeKeyword("SUSPENDED");
        $list71 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $sym72$FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-HARVEST-QUERIES-FROM-INFERENCE-POOL-METHOD");
        $sym73$GET_SALIENT_QUERIES = SubLObjectFactory.makeSymbol("GET-SALIENT-QUERIES");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY"), (SubLObject)focus_entity.ZERO_INTEGER));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param SPECIFICITY, integerp meant to denote how many levels of inheritance are acceptable\n   for a salient query. The lower the number, the tighter the restriction. The default, 0, causes \n   salient queries to be inherited without restriction from all supertypes of this entity.\n   @param COMPLETE, booleanp. If T, then the method will return only after all the inferences \n   that were started to compute salient queries are complete. If NIL the method will return\n   immediately with all the salient queries discovered so far.\n   @return listp, a list of salient cycl-query-p.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETENESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CURRENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UPDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LATEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL")), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("L"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("L"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY-EQUAL-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES")), (SubLObject)SubLObjectFactory.makeSymbol("LATEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-COMPUTING-SALIENT-QUERIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLEEP"), (SubLObject)focus_entity.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL")), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFICITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("L"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("L"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY-EQUAL-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE"))))));
        $kw76$CURRENT = SubLObjectFactory.makeKeyword("CURRENT");
        $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $sym78$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw79$UPDATE = SubLObjectFactory.makeKeyword("UPDATE");
        $sym80$CYCL_QUERY_EQUAL_P = SubLObjectFactory.makeSymbol("CYCL-QUERY-EQUAL-P");
        $kw81$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym82$DONE_COMPUTING_SALIENT_QUERIES = SubLObjectFactory.makeSymbol("DONE-COMPUTING-SALIENT-QUERIES");
        $sym83$FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-GET-SALIENT-QUERIES-METHOD");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return BOOLEAN; T iff no inference that has been started to compute\n   salient queries is still running.\n   @bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STILL-WORKING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-POOL"), (SubLObject)SubLObjectFactory.makeSymbol("STILL-WORKING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STILL-WORKING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("PREPARED"), (SubLObject)SubLObjectFactory.makeKeyword("READY"), (SubLObject)SubLObjectFactory.makeKeyword("RUNNING"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("STILL-WORKING")))));
        $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("PREPARED"), (SubLObject)SubLObjectFactory.makeKeyword("READY"), (SubLObject)SubLObjectFactory.makeKeyword("RUNNING"));
        $sym87$FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-DONE-COMPUTING-SALIENT-QUERIES-METHOD");
        $sym88$ANSWER_SALIENT_QUERIES = SubLObjectFactory.makeSymbol("ANSWER-SALIENT-QUERIES");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return focus-entity-p, this focus entity\n   As a side effect it computes the answers to all the salient queries for this entity.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ASK-QUIRK?*"), (SubLObject)focus_entity.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("SALIENT-QUERIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("UNANSWERED-QUESTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");
        $sym91$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym92$FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD = SubLObjectFactory.makeSymbol("FOCUS-ENTITY-ANSWER-SALIENT-QUERIES-METHOD");
        $sym93$TEXTUAL_FOCUS_ENTITY = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-TEXTUAL-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)focus_entity.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN-TYPES-FROM-CORPORA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)focus_entity.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym95$LEARNED_TEXTUAL_TYPES = SubLObjectFactory.makeSymbol("LEARNED-TEXTUAL-TYPES");
        $sym96$PASSAGES = SubLObjectFactory.makeSymbol("PASSAGES");
        $sym97$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym98$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-CLASS");
        $sym99$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-INSTANCE");
        $sym100$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym101$CYCL_EXPRESSION_ = SubLObjectFactory.makeSymbol("CYCL-EXPRESSION?");
        $sym102$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym103$ADMISSIBLE_FOCUS_ENTITY_TYPE = SubLObjectFactory.makeSymbol("ADMISSIBLE-FOCUS-ENTITY-TYPE");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NAME")));
        $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");
        $sym106$TEXTUAL_FOCUS_ENTITY_NAME_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-NAME-METHOD");
        $sym107$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list109 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<ESS-ENT-"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" types: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES")))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" facts: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");
        $str111$__ESS_ENT_ = SubLObjectFactory.makeString("#<ESS-ENT-");
        $str112$__ = SubLObjectFactory.makeString(": ");
        $str113$_types__ = SubLObjectFactory.makeString(" types: ");
        $str114$_facts__ = SubLObjectFactory.makeString(" facts: ");
        $str115$_ = SubLObjectFactory.makeString(">");
        $sym116$TEXTUAL_FOCUS_ENTITY_PRINT_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-PRINT-METHOD");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)focus_entity.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME")))))));
        $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");
        $sym120$TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL-METHOD");
        $sym121$TEXTUAL_FOCUS_ENTITY_P = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-P");
        $sym122$CHRONOLOGY = SubLObjectFactory.makeSymbol("CHRONOLOGY");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return a chronological summary of all information known about this entity.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RENDER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("CHRONOLOGICAL"))))));
        $sym124$RENDER = SubLObjectFactory.makeSymbol("RENDER");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("CHRONOLOGICAL"));
        $sym126$TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-CHRONOLOGY-METHOD");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("SEQUENTIAL")))));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return a summary of all information known about this entity.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("FORMAT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"))), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), (SubLObject)SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEQUENTIAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"))), (SubLObject)SubLObjectFactory.makeString("")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CCONCATENATE"), SubLObjectFactory.makeSymbol("ACCUMULATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeString("("), SubLObjectFactory.makeSymbol("SOURCE"), SubLObjectFactory.makeString(")"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*") }))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHRONOLOGICAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORTED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-OLDER-METHOD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SORTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"))), (SubLObject)SubLObjectFactory.makeString("")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CCONCATENATE"), SubLObjectFactory.makeSymbol("ACCUMULATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeString("("), SubLObjectFactory.makeSymbol("SOURCE"), SubLObjectFactory.makeString(")"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*") }))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"))));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("SEQUENTIAL"));
        $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");
        $kw131$FORMAT = SubLObjectFactory.makeKeyword("FORMAT");
        $kw132$ORDER = SubLObjectFactory.makeKeyword("ORDER");
        $kw133$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str134$_ = SubLObjectFactory.makeString(":");
        $kw135$SEQUENTIAL = SubLObjectFactory.makeKeyword("SEQUENTIAL");
        $sym136$JUSTIFY = SubLObjectFactory.makeSymbol("JUSTIFY");
        $sym137$GET_SOURCE = SubLObjectFactory.makeSymbol("GET-SOURCE");
        $str138$ = SubLObjectFactory.makeString("");
        $sym139$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $str140$_ = SubLObjectFactory.makeString("(");
        $str141$_ = SubLObjectFactory.makeString(")");
        $kw142$CHRONOLOGICAL = SubLObjectFactory.makeKeyword("CHRONOLOGICAL");
        $sym143$ANSWER_OLDER_METHOD = SubLObjectFactory.makeSymbol("ANSWER-OLDER-METHOD");
        $sym144$TEXTUAL_FOCUS_ENTITY_RENDER_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-RENDER-METHOD");
        $sym145$LEARN_TYPES_FROM_CORPORA = SubLObjectFactory.makeSymbol("LEARN-TYPES-FROM-CORPORA");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPORA"));
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param CORPORA, listp a list of strings denoting available corpora\n   @return textual-focus-entity-p, this entity.\n   As a side effect it consults documents in CORPORA to try to learn its own type.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS"), (SubLObject)focus_entity.NIL), (SubLObject)SubLObjectFactory.makeSymbol("WHO-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WHO-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANY-GENL-ANY?"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("WHO-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("Who is "), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeString("?")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("What is "), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeString("?"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("UNANSWERED-QUESTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NPP-USE-NL-TAGS?*"), (SubLObject)focus_entity.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PS-GET-CYCLS-FOR-NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTIONS-DISJOINT?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-TYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-TYPES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");
        $list149 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")));
        $str150$Who_is_ = SubLObjectFactory.makeString("Who is ");
        $str151$_ = SubLObjectFactory.makeString("?");
        $str152$What_is_ = SubLObjectFactory.makeString("What is ");
        $sym153$TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-LEARN-TYPES-FROM-CORPORA-METHOD");
        $sym154$ADD_PASSAGE = SubLObjectFactory.makeSymbol("ADD-PASSAGE");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PASSAGE passage-p\n   @return textual-focus-entity; this entity with PASSAGE added to the list\n   of passages where the entity occurs"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-EQUAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");
        $sym158$CORPUS_PASSAGE_P = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-P");
        $sym159$PASSAGE_EQUAL = SubLObjectFactory.makeSymbol("PASSAGE-EQUAL");
        $sym160$TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-ADD-PASSAGE-METHOD");
        $sym161$INFERENCE_ANSWER_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-P");
        $kw162$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const163$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const164$relationExistsInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance"));
        $const165$relationInstanceExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists"));
        $sym166$_WHAT = SubLObjectFactory.makeSymbol("?WHAT");
        $const167$CycKBSubsetCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycKBSubsetCollection"));
        $const168$CycVocabularyTopic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycVocabularyTopic"));
        $const169$KFDInternalKRTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KFDInternalKRTerm"));
        $const170$MicrotheoryType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MicrotheoryType"));
        $const171$VocabularyConstrainingAbstraction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VocabularyConstrainingAbstraction"));
        $const172$RelationshipType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationshipType"));
        $const173$MIPTMappingConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MIPTMappingConstant"));
        $const174$DealingWithAStringInNounLearnerTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DealingWithAStringInNounLearnerTool"));
        $const175$LexicalItem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalItem"));
        $const176$QAClarifyingCollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QAClarifyingCollectionType"));
        $const177$BBNEntityType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BBNEntityType"));
        $const178$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const179$PotentiallyPornRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PotentiallyPornRelated"));
        $const180$PersonTypeByGender = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonTypeByGender"));
    }
}

/*

	Total time: 740 ms
	
*/