package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.clustering;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scenario extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.scenario";
    public static final String myFingerPrint = "5bb46dfc06978e75616d9947c4331f47e82f9054df57a40f5de2ad5b02df23e2";
    private static final SubLSymbol $sym0$SCENARIO;
    private static final SubLSymbol $sym1$INFORMATION_REQUEST;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$ANSWERS;
    private static final SubLSymbol $sym4$QUESTIONS;
    private static final SubLSymbol $sym5$VECTOR;
    private static final SubLSymbol $sym6$AUGMENTATION_TERMS;
    private static final SubLSymbol $sym7$SENTENCES;
    private static final SubLSymbol $sym8$CORPORA;
    private static final SubLSymbol $sym9$STRING;
    private static final SubLSymbol $sym10$TAGGER;
    private static final SubLSymbol $sym11$PARSER;
    private static final SubLSymbol $sym12$LEXICON;
    private static final SubLSymbol $sym13$OBJECT;
    private static final SubLSymbol $sym14$INSTANCE_COUNT;
    private static final SubLSymbol $sym15$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS;
    private static final SubLSymbol $sym16$ISOLATED_P;
    private static final SubLSymbol $sym17$INSTANCE_NUMBER;
    private static final SubLSymbol $sym18$ERROR_HANDLING;
    private static final SubLSymbol $sym19$TIMEOUT;
    private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE;
    private static final SubLSymbol $sym21$VIABLE_QUESTION;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$SCENARIO_VIABLE_QUESTION_METHOD;
    private static final SubLSymbol $sym27$INITIALIZE;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD;
    private static final SubLSymbol $sym30$QUIRK_LEXICON;
    private static final SubLSymbol $kw31$WARN;
    private static final SubLInteger $int32$30;
    private static final SubLSymbol $sym33$SCENARIO_INITIALIZE_METHOD;
    private static final SubLSymbol $sym34$GET_VECTOR;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD;
    private static final SubLSymbol $sym38$SCENARIO_GET_VECTOR_METHOD;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$STRINGP;
    private static final SubLSymbol $sym41$LISTP;
    private static final SubLSymbol $sym42$ANSWER;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$QUESTION;
    private static final SubLSymbol $sym46$AUGMENT_TERMS;
    private static final SubLInteger $int47$50;
    private static final SubLSymbol $sym48$ESSAY;
    private static final SubLSymbol $sym49$SELECT;
    private static final SubLSymbol $sym50$SCENARIO_ANSWER_METHOD;
    private static final SubLSymbol $sym51$ANSWER_SUBQUESTIONS;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD;
    private static final SubLString $str55$___S_has_been_answered____;
    private static final SubLString $str56$_______S;
    private static final SubLSymbol $sym57$GET_CONTENT;
    private static final SubLString $str58$____;
    private static final SubLSymbol $sym59$SCENARIO_ANSWER_SUBQUESTIONS_METHOD;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$IDENTIFIED_ENTITIES;
    private static final SubLSymbol $sym62$SUBQUESTION_ANSWERS;
    private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS;
    private static final SubLSymbol $sym64$INFO_REQUEST;
    private static final SubLSymbol $sym65$CONTENT;
    private static final SubLSymbol $sym66$CONFIDENCE;
    private static final SubLSymbol $sym67$RELEVANCE;
    private static final SubLSymbol $sym68$JUSTIFICATION;
    private static final SubLSymbol $sym69$INFO;
    private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLFloat $float73$0_3;
    private static final SubLSymbol $sym74$PASSAGE_SIMILARITY;
    private static final SubLSymbol $sym75$CORPUS_PASSAGE;
    private static final SubLSymbol $sym76$MAX_INSTANCES;
    private static final SubLSymbol $sym77$TYPICAL_INSTANCE;
    private static final SubLSymbol $sym78$ESSAY_SELECT_METHOD;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$GET_ABSTRACT_PASSAGE_VECTOR;
    private static final SubLSymbol $sym81$ESSAY_TYPICAL_INSTANCE_METHOD;
    private static final SubLSymbol $sym82$KEY_POINTS;
    private static final SubLSymbol $sym83$PRINT;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$OUTER_CATCH_FOR_ESSAY_METHOD;
    private static final SubLString $str87$__ESSAY_sources_;
    private static final SubLString $str88$_entities_;
    private static final SubLString $str89$_;
    private static final SubLSymbol $sym90$ESSAY_PRINT_METHOD;
    private static final SubLSymbol $sym91$CHRONOLOGY;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$RENDER;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$ESSAY_CHRONOLOGY_METHOD;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$OUTER_CATCH_FOR_ESSAY_METHOD;
    private static final SubLSymbol $kw100$FORMAT;
    private static final SubLSymbol $kw101$ORDER;
    private static final SubLSymbol $kw102$TEXT;
    private static final SubLString $str103$;
    private static final SubLSymbol $kw104$SEQUENTIAL;
    private static final SubLString $str105$_;
    private static final SubLSymbol $sym106$GET_SOURCE;
    private static final SubLString $str107$_;
    private static final SubLSymbol $kw108$CHRONOLOGICAL;
    private static final SubLSymbol $sym109$ABSTRACT_PASSAGE_OLDER_METHOD;
    private static final SubLSymbol $sym110$ESSAY_RENDER_METHOD;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$OUTER_CATCH_FOR_ESSAY_METHOD;
    private static final SubLSymbol $sym113$EXTRACT;
    private static final SubLSymbol $sym114$ESSAY_ANSWER_SUBQUESTIONS_METHOD;
    private static final SubLSymbol $sym115$BACKGROUND_IDENTIFY_ENTITIES;
    private static final SubLList $list116;
    private static final SubLString $str117$_S;
    private static final SubLSymbol $sym118$ESSAY_IDENTIFY_ENTITIES_METHOD;
    private static final SubLSymbol $sym119$ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD;
    private static final SubLSymbol $sym120$GET_ENTITY_BY_NAME;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_ESSAY_METHOD;
    private static final SubLSymbol $sym124$ESSAY_GET_ENTITY_BY_NAME_METHOD;
    private static final SubLSymbol $sym125$GET_ENTITIES_BY_TYPES;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$OUTER_CATCH_FOR_ESSAY_METHOD;
    private static final SubLSymbol $sym129$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const130$EverythingPSC;
    private static final SubLSymbol $sym131$ALL_TYPES;
    private static final SubLSymbol $sym132$ESSAY_GET_ENTITIES_BY_TYPES_METHOD;
    private static final SubLSymbol $sym133$IDENTIFY_ENTITIES;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$OUTER_CATCH_FOR_ESSAY_METHOD;
    private static final SubLInteger $int138$32;
    private static final SubLSymbol $sym139$ADD_PASSAGE;
    private static final SubLSymbol $sym140$TEXTUAL_FOCUS_ENTITY_EQUAL;
    private static final SubLSymbol $sym141$SPARSE_VECTOR_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_answers(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.NINE_INTEGER, (SubLObject)scenario.$sym3$ANSWERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_answers(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.NINE_INTEGER, (SubLObject)scenario.$sym3$ANSWERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_questions(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.EIGHT_INTEGER, (SubLObject)scenario.$sym4$QUESTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_questions(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.EIGHT_INTEGER, (SubLObject)scenario.$sym4$QUESTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_vector(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.SEVEN_INTEGER, (SubLObject)scenario.$sym5$VECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_vector(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.SEVEN_INTEGER, (SubLObject)scenario.$sym5$VECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_augmentation_terms(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.SIX_INTEGER, (SubLObject)scenario.$sym6$AUGMENTATION_TERMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_augmentation_terms(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.SIX_INTEGER, (SubLObject)scenario.$sym6$AUGMENTATION_TERMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_sentences(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.FIVE_INTEGER, (SubLObject)scenario.$sym7$SENTENCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_sentences(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.FIVE_INTEGER, (SubLObject)scenario.$sym7$SENTENCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_corpora(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.FOUR_INTEGER, (SubLObject)scenario.$sym8$CORPORA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_corpora(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.FOUR_INTEGER, (SubLObject)scenario.$sym8$CORPORA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_string(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, (SubLObject)scenario.THREE_INTEGER, (SubLObject)scenario.$sym9$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_string(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, (SubLObject)scenario.THREE_INTEGER, (SubLObject)scenario.$sym9$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_tagger(final SubLObject v_scenario) {
        final SubLObject v_class = (SubLObject)(v_scenario.isSymbol() ? classes.classes_retrieve_class(v_scenario) : ((scenario.NIL != subloop_structures.class_p(v_scenario)) ? v_scenario : ((scenario.NIL != subloop_structures.instance_p(v_scenario)) ? subloop_structures.instance_class(v_scenario) : scenario.NIL)));
        if (scenario.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)scenario.$sym10$TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)scenario.THREE_INTEGER);
        }
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_tagger(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_scenario.isSymbol() ? classes.classes_retrieve_class(v_scenario) : ((scenario.NIL != subloop_structures.class_p(v_scenario)) ? v_scenario : ((scenario.NIL != subloop_structures.instance_p(v_scenario)) ? subloop_structures.instance_class(v_scenario) : scenario.NIL)));
        if (scenario.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)scenario.$sym10$TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)scenario.THREE_INTEGER, value);
        }
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_parser(final SubLObject v_scenario) {
        final SubLObject v_class = (SubLObject)(v_scenario.isSymbol() ? classes.classes_retrieve_class(v_scenario) : ((scenario.NIL != subloop_structures.class_p(v_scenario)) ? v_scenario : ((scenario.NIL != subloop_structures.instance_p(v_scenario)) ? subloop_structures.instance_class(v_scenario) : scenario.NIL)));
        if (scenario.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)scenario.$sym11$PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)scenario.TWO_INTEGER);
        }
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_parser(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_scenario.isSymbol() ? classes.classes_retrieve_class(v_scenario) : ((scenario.NIL != subloop_structures.class_p(v_scenario)) ? v_scenario : ((scenario.NIL != subloop_structures.instance_p(v_scenario)) ? subloop_structures.instance_class(v_scenario) : scenario.NIL)));
        if (scenario.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)scenario.$sym11$PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)scenario.TWO_INTEGER, value);
        }
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject get_scenario_lexicon(final SubLObject v_scenario) {
        final SubLObject v_class = (SubLObject)(v_scenario.isSymbol() ? classes.classes_retrieve_class(v_scenario) : ((scenario.NIL != subloop_structures.class_p(v_scenario)) ? v_scenario : ((scenario.NIL != subloop_structures.instance_p(v_scenario)) ? subloop_structures.instance_class(v_scenario) : scenario.NIL)));
        if (scenario.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)scenario.$sym12$LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)scenario.ONE_INTEGER);
        }
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject set_scenario_lexicon(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_scenario.isSymbol() ? classes.classes_retrieve_class(v_scenario) : ((scenario.NIL != subloop_structures.class_p(v_scenario)) ? v_scenario : ((scenario.NIL != subloop_structures.instance_p(v_scenario)) ? subloop_structures.instance_class(v_scenario) : scenario.NIL)));
        if (scenario.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)scenario.$sym12$LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)scenario.ONE_INTEGER, value);
        }
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject subloop_reserved_initialize_scenario_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym13$OBJECT, (SubLObject)scenario.$sym14$INSTANCE_COUNT, (SubLObject)scenario.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym12$LEXICON, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym11$PARSER, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym10$TAGGER, (SubLObject)scenario.NIL);
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject subloop_reserved_initialize_scenario_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym13$OBJECT, (SubLObject)scenario.$sym16$ISOLATED_P, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym13$OBJECT, (SubLObject)scenario.$sym17$INSTANCE_NUMBER, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym1$INFORMATION_REQUEST, (SubLObject)scenario.$sym18$ERROR_HANDLING, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym1$INFORMATION_REQUEST, (SubLObject)scenario.$sym19$TIMEOUT, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym9$STRING, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym8$CORPORA, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym7$SENTENCES, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym6$AUGMENTATION_TERMS, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym5$VECTOR, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym4$QUESTIONS, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym3$ANSWERS, (SubLObject)scenario.NIL);
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 851L)
    public static SubLObject scenario_p(final SubLObject v_scenario) {
        return classes.subloop_instanceof_class(v_scenario, (SubLObject)scenario.$sym0$SCENARIO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 1573L)
    public static SubLObject scenario_viable_question_method(final SubLObject self, final SubLObject v_question) {
        SubLObject viable = (SubLObject)scenario.NIL;
        if (scenario.NIL == viable) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = (SubLObject)scenario.$list25, pred = (SubLObject)scenario.NIL, pred = csome_list_var.first(); scenario.NIL == viable && scenario.NIL != csome_list_var; viable = Functions.funcall(pred, v_question), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
        }
        return viable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 2129L)
    public static SubLObject scenario_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = (SubLObject)scenario.NIL;
        SubLObject tagger = get_scenario_tagger(self);
        SubLObject v_parser = get_scenario_parser(self);
        SubLObject lexicon = get_scenario_lexicon(self);
        try {
            thread.throwStack.push(scenario.$sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                search_engine.information_request_initialize_method(self);
                if (scenario.NIL == lexicon) {
                    lexicon = object.new_class_instance((SubLObject)scenario.$sym30$QUIRK_LEXICON);
                }
                if (scenario.NIL == v_parser) {
                    v_parser = parser.new_charniak_parser((SubLObject)scenario.$kw31$WARN, (SubLObject)scenario.$int32$30);
                }
                if (scenario.NIL == tagger) {
                    tagger = pos_tagger.get_tagger();
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym29$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scenario_tagger(self, tagger);
                    set_scenario_parser(self, v_parser);
                    set_scenario_lexicon(self, lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 2490L)
    public static SubLObject scenario_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = (SubLObject)scenario.NIL;
        SubLObject vector = get_scenario_vector(self);
        final SubLObject augmentation_terms = get_scenario_augmentation_terms(self);
        final SubLObject string = get_scenario_string(self);
        try {
            thread.throwStack.push(scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                if (scenario.NIL != vector) {
                    Dynamic.sublisp_throw((SubLObject)scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, vector);
                }
                final SubLObject augmented_string = Sequences.cconcatenate(string, string_utilities.bunge(augmentation_terms, (SubLObject)scenario.UNPROVIDED));
                final SubLObject new_vector = vector = question.new_string_vector(augmented_string);
                Dynamic.sublisp_throw((SubLObject)scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, new_vector);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scenario_vector(self, vector);
                    set_scenario_augmentation_terms(self, augmentation_terms);
                    set_scenario_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 2847L)
    public static SubLObject new_scenario(final SubLObject scenario_string, SubLObject corpora) {
        if (corpora == scenario.UNPROVIDED) {
            corpora = (SubLObject)scenario.$list39;
        }
        assert scenario.NIL != Types.stringp(scenario_string) : scenario_string;
        assert scenario.NIL != Types.listp(corpora) : corpora;
        question.initialize_question();
        final SubLObject v_scenario = object.new_class_instance((SubLObject)scenario.$sym0$SCENARIO);
        SubLObject sentences = (SubLObject)scenario.NIL;
        SubLObject questions = (SubLObject)scenario.NIL;
        instances.set_slot(v_scenario, (SubLObject)scenario.$sym9$STRING, scenario_string);
        instances.set_slot(v_scenario, (SubLObject)scenario.$sym8$CORPORA, corpora);
        final SubLObject vector_var = document.paragraph_sentences(document.new_paragraph(scenario_string));
        final SubLObject backwardP_var = (SubLObject)scenario.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject q;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)scenario.NIL, v_iteration = (SubLObject)scenario.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)scenario.ONE_INTEGER)) {
            element_num = ((scenario.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)scenario.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            q = question.new_question(string_utilities.bunge(document.sentence_stringify(sentence), (SubLObject)scenario.UNPROVIDED), (SubLObject)scenario.UNPROVIDED, (SubLObject)scenario.UNPROVIDED);
            sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
            if (scenario.NIL != question.question_p(q)) {
                questions = (SubLObject)ConsesLow.cons(q, questions);
            }
        }
        instances.set_slot(v_scenario, (SubLObject)scenario.$sym7$SENTENCES, Sequences.nreverse(sentences));
        instances.set_slot(v_scenario, (SubLObject)scenario.$sym4$QUESTIONS, Sequences.nreverse(questions));
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 3805L)
    public static SubLObject scenario_answer_method(final SubLObject self) {
        SubLObject words = (SubLObject)scenario.NIL;
        SubLObject passages = (SubLObject)scenario.NIL;
        SubLObject scenario_query = (SubLObject)scenario.NIL;
        instances.set_slot(self, (SubLObject)scenario.$sym3$ANSWERS, (SubLObject)scenario.NIL);
        instances.set_slot(self, (SubLObject)scenario.$sym6$AUGMENTATION_TERMS, (SubLObject)scenario.NIL);
        SubLObject cdolist_list_var = instances.get_slot(self, (SubLObject)scenario.$sym7$SENTENCES);
        SubLObject sentence = (SubLObject)scenario.NIL;
        sentence = cdolist_list_var.first();
        while (scenario.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = document.sentence_yield_exhaustive(sentence);
            SubLObject word = (SubLObject)scenario.NIL;
            word = cdolist_list_var_$1.first();
            while (scenario.NIL != cdolist_list_var_$1) {
                words = (SubLObject)ConsesLow.cons(document.word_string(word), words);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                word = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        cdolist_list_var = instances.get_slot(self, (SubLObject)scenario.$sym8$CORPORA);
        SubLObject corpus = (SubLObject)scenario.NIL;
        corpus = cdolist_list_var.first();
        while (scenario.NIL != cdolist_list_var) {
            final SubLObject augmented_terms = methods.funcall_class_method_with_2_args((SubLObject)scenario.$sym45$QUESTION, (SubLObject)scenario.$sym46$AUGMENT_TERMS, words, corpus);
            instances.set_slot(self, (SubLObject)scenario.$sym6$AUGMENTATION_TERMS, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(corpus, augmented_terms), instances.get_slot(self, (SubLObject)scenario.$sym6$AUGMENTATION_TERMS)));
            scenario_query = search_engine.new_lemur_query(string_utilities.bunge(ConsesLow.append(words, augmented_terms), (SubLObject)scenario.UNPROVIDED), corpus, (SubLObject)scenario.TEN_INTEGER, (SubLObject)scenario.$int47$50);
            SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(scenario_query, (SubLObject)scenario.$sym42$ANSWER);
            SubLObject passage = (SubLObject)scenario.NIL;
            passage = cdolist_list_var_$2.first();
            while (scenario.NIL != cdolist_list_var_$2) {
                passages = (SubLObject)ConsesLow.cons(passage, passages);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                passage = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            corpus = cdolist_list_var.first();
        }
        return new_essay(self, methods.funcall_class_method_with_1_args((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym49$SELECT, passages), (SubLObject)scenario.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 4951L)
    public static SubLObject scenario_answer_subquestions_method(final SubLObject self, SubLObject verbose) {
        if (verbose == scenario.UNPROVIDED) {
            verbose = (SubLObject)scenario.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = (SubLObject)scenario.NIL;
        SubLObject answers = get_scenario_answers(self);
        final SubLObject questions = get_scenario_questions(self);
        try {
            thread.throwStack.push(scenario.$sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                SubLObject cdolist_list_var = questions;
                SubLObject v_question = (SubLObject)scenario.NIL;
                v_question = cdolist_list_var.first();
                while (scenario.NIL != cdolist_list_var) {
                    if (scenario.NIL != methods.funcall_class_method_with_1_args((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym21$VIABLE_QUESTION, v_question)) {
                        final SubLObject q_answers = methods.funcall_instance_method_with_0_args(v_question, (SubLObject)scenario.$sym42$ANSWER);
                        if (scenario.NIL != q_answers && scenario.NIL != verbose) {
                            PrintLow.format((SubLObject)scenario.T, (SubLObject)scenario.$str55$___S_has_been_answered____, v_question);
                            SubLObject cdolist_list_var_$3 = q_answers;
                            SubLObject v_answer = (SubLObject)scenario.NIL;
                            v_answer = cdolist_list_var_$3.first();
                            while (scenario.NIL != cdolist_list_var_$3) {
                                PrintLow.format((SubLObject)scenario.T, (SubLObject)scenario.$str56$_______S, methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)scenario.$sym57$GET_CONTENT));
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                v_answer = cdolist_list_var_$3.first();
                            }
                            PrintLow.format((SubLObject)scenario.T, (SubLObject)scenario.$str58$____, v_question);
                        }
                        answers = ConsesLow.append(q_answers, answers);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_question = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym54$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scenario_answers(self, answers);
                    set_scenario_questions(self, questions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject get_essay_identified_entities(final SubLObject essay) {
        return classes.subloop_get_access_protected_instance_slot(essay, (SubLObject)scenario.EIGHT_INTEGER, (SubLObject)scenario.$sym61$IDENTIFIED_ENTITIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject set_essay_identified_entities(final SubLObject essay, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(essay, value, (SubLObject)scenario.EIGHT_INTEGER, (SubLObject)scenario.$sym61$IDENTIFIED_ENTITIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject get_essay_subquestion_answers(final SubLObject essay) {
        return classes.subloop_get_access_protected_instance_slot(essay, (SubLObject)scenario.SEVEN_INTEGER, (SubLObject)scenario.$sym62$SUBQUESTION_ANSWERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject set_essay_subquestion_answers(final SubLObject essay, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(essay, value, (SubLObject)scenario.SEVEN_INTEGER, (SubLObject)scenario.$sym62$SUBQUESTION_ANSWERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject subloop_reserved_initialize_essay_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym13$OBJECT, (SubLObject)scenario.$sym14$INSTANCE_COUNT, (SubLObject)scenario.ZERO_INTEGER);
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject subloop_reserved_initialize_essay_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym13$OBJECT, (SubLObject)scenario.$sym16$ISOLATED_P, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym13$OBJECT, (SubLObject)scenario.$sym17$INSTANCE_NUMBER, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym64$INFO_REQUEST, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym65$CONTENT, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym66$CONFIDENCE, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym67$RELEVANCE, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym68$JUSTIFICATION, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym69$INFO, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym62$SUBQUESTION_ANSWERS, (SubLObject)scenario.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym61$IDENTIFIED_ENTITIES, (SubLObject)scenario.NIL);
        return (SubLObject)scenario.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 5655L)
    public static SubLObject essay_p(final SubLObject essay) {
        return classes.subloop_instanceof_class(essay, (SubLObject)scenario.$sym48$ESSAY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 6255L)
    public static SubLObject essay_select_method(final SubLObject self, final SubLObject passages) {
        assert scenario.NIL != Types.listp(passages) : passages;
        SubLObject selected = (SubLObject)scenario.NIL;
        final SubLObject require_similarity = (SubLObject)scenario.$float73$0_3;
        SubLObject cdolist_list_var;
        final SubLObject clusters = cdolist_list_var = clustering.cluster(passages, (SubLObject)scenario.$sym74$PASSAGE_SIMILARITY, (SubLObject)scenario.ONE_INTEGER, require_similarity);
        SubLObject cluster = (SubLObject)scenario.NIL;
        cluster = cdolist_list_var.first();
        while (scenario.NIL != cdolist_list_var) {
            final SubLObject max_passages = methods.funcall_class_method_with_1_args((SubLObject)scenario.$sym75$CORPUS_PASSAGE, (SubLObject)scenario.$sym76$MAX_INSTANCES, clustering.cluster_elements(cluster));
            selected = (SubLObject)ConsesLow.cons(methods.funcall_class_method_with_1_args((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym77$TYPICAL_INSTANCE, max_passages), selected);
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        }
        return selected;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 6950L)
    public static SubLObject essay_typical_instance_method(final SubLObject self, final SubLObject passages) {
        assert scenario.NIL != Types.listp(passages) : passages;
        SubLObject typical = passages.first();
        final SubLObject centroid = sparse_vector.svector_centroid(Mapping.mapcar((SubLObject)scenario.$sym80$GET_ABSTRACT_PASSAGE_VECTOR, passages));
        final SubLObject centroid_length = sparse_vector.svector_length(centroid);
        if (!centroid_length.isZero()) {
            final SubLObject typical_vector = search_engine.get_abstract_passage_vector(typical);
            SubLObject min_distance = safe_svector_cosine_angle(typical_vector, centroid, (SubLObject)scenario.UNPROVIDED);
            SubLObject distance = (SubLObject)scenario.NIL;
            SubLObject cdolist_list_var = passages;
            SubLObject passage = (SubLObject)scenario.NIL;
            passage = cdolist_list_var.first();
            while (scenario.NIL != cdolist_list_var) {
                final SubLObject passage_vector = search_engine.get_abstract_passage_vector(passage);
                distance = safe_svector_cosine_angle(passage_vector, centroid, (SubLObject)scenario.UNPROVIDED);
                if (distance.numG(min_distance)) {
                    min_distance = distance;
                    typical = passage;
                }
                cdolist_list_var = cdolist_list_var.rest();
                passage = cdolist_list_var.first();
            }
        }
        return typical;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 7819L)
    public static SubLObject new_essay(final SubLObject info_request, final SubLObject passages, SubLObject key_points) {
        if (key_points == scenario.UNPROVIDED) {
            key_points = (SubLObject)scenario.NIL;
        }
        final SubLObject essay = object.new_class_instance((SubLObject)scenario.$sym48$ESSAY);
        answer.set_answer_info_request(essay, info_request);
        answer.set_answer_content(essay, passages);
        instances.set_slot(essay, (SubLObject)scenario.$sym82$KEY_POINTS, key_points);
        return essay;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 8266L)
    public static SubLObject essay_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = (SubLObject)scenario.NIL;
        final SubLObject identified_entities = get_essay_identified_entities(self);
        final SubLObject content = answer.get_answer_content(self);
        try {
            thread.throwStack.push(scenario.$sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                streams_high.write_string((SubLObject)scenario.$str87$__ESSAY_sources_, stream, (SubLObject)scenario.UNPROVIDED, (SubLObject)scenario.UNPROVIDED);
                print_high.prin1(Sequences.length(content), stream);
                streams_high.write_string((SubLObject)scenario.$str88$_entities_, stream, (SubLObject)scenario.UNPROVIDED, (SubLObject)scenario.UNPROVIDED);
                print_high.prin1(Sequences.length(identified_entities), stream);
                streams_high.write_string((SubLObject)scenario.$str89$_, stream, (SubLObject)scenario.UNPROVIDED, (SubLObject)scenario.UNPROVIDED);
                streams_high.terpri(stream);
                Dynamic.sublisp_throw((SubLObject)scenario.$sym86$OUTER_CATCH_FOR_ESSAY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    answer.set_answer_content(self, content);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 8565L)
    public static SubLObject essay_chronology_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)scenario.$sym93$RENDER, (SubLObject)scenario.$list94);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 8684L)
    public static SubLObject essay_render_method(final SubLObject self, SubLObject strategy) {
        if (strategy == scenario.UNPROVIDED) {
            strategy = (SubLObject)scenario.$list98;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = (SubLObject)scenario.NIL;
        final SubLObject content = answer.get_answer_content(self);
        try {
            thread.throwStack.push(scenario.$sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                final SubLObject format = conses_high.getf(strategy, (SubLObject)scenario.$kw100$FORMAT, (SubLObject)scenario.UNPROVIDED);
                final SubLObject order = conses_high.getf(strategy, (SubLObject)scenario.$kw101$ORDER, (SubLObject)scenario.UNPROVIDED);
                SubLObject accumulator = (SubLObject)scenario.NIL;
                SubLObject pcase_var = format;
                if (pcase_var.eql((SubLObject)scenario.$kw102$TEXT)) {
                    accumulator = (SubLObject)scenario.$str103$;
                }
                pcase_var = order;
                if (pcase_var.eql((SubLObject)scenario.$kw104$SEQUENTIAL)) {
                    SubLObject cdolist_list_var = content;
                    SubLObject passage = (SubLObject)scenario.NIL;
                    passage = cdolist_list_var.first();
                    while (scenario.NIL != cdolist_list_var) {
                        accumulator = Sequences.cconcatenate(accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args(passage, (SubLObject)scenario.$sym57$GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), scenario.$str105$_, methods.funcall_instance_method_with_0_args(passage, (SubLObject)scenario.$sym106$GET_SOURCE), scenario.$str107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                        cdolist_list_var = cdolist_list_var.rest();
                        passage = cdolist_list_var.first();
                    }
                }
                else if (pcase_var.eql((SubLObject)scenario.$kw108$CHRONOLOGICAL)) {
                    SubLObject cdolist_list_var2;
                    final SubLObject sorted = cdolist_list_var2 = Sort.sort(conses_high.copy_list(content), (SubLObject)scenario.$sym109$ABSTRACT_PASSAGE_OLDER_METHOD, (SubLObject)scenario.UNPROVIDED);
                    SubLObject passage2 = (SubLObject)scenario.NIL;
                    passage2 = cdolist_list_var2.first();
                    while (scenario.NIL != cdolist_list_var2) {
                        accumulator = Sequences.cconcatenate(accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args(passage2, (SubLObject)scenario.$sym57$GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), scenario.$str105$_, methods.funcall_instance_method_with_0_args(passage2, (SubLObject)scenario.$sym106$GET_SOURCE), scenario.$str107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        passage2 = cdolist_list_var2.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym99$OUTER_CATCH_FOR_ESSAY_METHOD, accumulator);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    answer.set_answer_content(self, content);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 9549L)
    public static SubLObject essay_answer_subquestions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = (SubLObject)scenario.NIL;
        SubLObject subquestion_answers = get_essay_subquestion_answers(self);
        final SubLObject content = answer.get_answer_content(self);
        final SubLObject info_request = answer.get_answer_info_request(self);
        try {
            thread.throwStack.push(scenario.$sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                SubLObject cdolist_list_var = instances.get_slot(info_request, (SubLObject)scenario.$sym4$QUESTIONS);
                SubLObject v_question = (SubLObject)scenario.NIL;
                v_question = cdolist_list_var.first();
                while (scenario.NIL != cdolist_list_var) {
                    if (scenario.NIL != methods.funcall_class_method_with_1_args((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym21$VIABLE_QUESTION, v_question)) {
                        SubLObject cdolist_list_var_$4 = content;
                        SubLObject passage = (SubLObject)scenario.NIL;
                        passage = cdolist_list_var_$4.first();
                        while (scenario.NIL != cdolist_list_var_$4) {
                            final SubLObject answers = methods.funcall_instance_method_with_1_args(v_question, (SubLObject)scenario.$sym113$EXTRACT, passage);
                            if (scenario.NIL != answers) {
                                subquestion_answers = ConsesLow.append(methods.funcall_class_method_with_1_args(answers.first(), (SubLObject)scenario.$sym49$SELECT, answers), subquestion_answers);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            passage = cdolist_list_var_$4.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_question = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym112$OUTER_CATCH_FOR_ESSAY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_essay_subquestion_answers(self, subquestion_answers);
                    answer.set_answer_content(self, content);
                    answer.set_answer_info_request(self, info_request);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 9939L)
    public static SubLObject essay_background_identify_entities_method(final SubLObject self) {
        process_utilities.new_task(PrintLow.format((SubLObject)scenario.NIL, (SubLObject)scenario.$str117$_S, Symbols.gensym((SubLObject)scenario.UNPROVIDED)), (SubLObject)scenario.$sym118$ESSAY_IDENTIFY_ENTITIES_METHOD, (SubLObject)ConsesLow.list(self), (SubLObject)scenario.UNPROVIDED);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 10109L)
    public static SubLObject essay_get_entity_by_name_method(final SubLObject self, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = (SubLObject)scenario.NIL;
        final SubLObject identified_entities = get_essay_identified_entities(self);
        try {
            thread.throwStack.push(scenario.$sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert scenario.NIL != Types.stringp(name) : name;
                SubLObject named_entity = (SubLObject)scenario.NIL;
                if (scenario.NIL == named_entity) {
                    SubLObject csome_list_var = identified_entities;
                    SubLObject entity = (SubLObject)scenario.NIL;
                    entity = csome_list_var.first();
                    while (scenario.NIL == named_entity && scenario.NIL != csome_list_var) {
                        if (name.equalp(instances.get_slot(entity, (SubLObject)scenario.$sym9$STRING))) {
                            named_entity = entity;
                        }
                        csome_list_var = csome_list_var.rest();
                        entity = csome_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym123$OUTER_CATCH_FOR_ESSAY_METHOD, named_entity);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 10386L)
    public static SubLObject essay_get_entities_by_types_method(final SubLObject self, final SubLObject desired_types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = (SubLObject)scenario.NIL;
        final SubLObject identified_entities = get_essay_identified_entities(self);
        try {
            thread.throwStack.push(scenario.$sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert scenario.NIL != Types.listp(desired_types) : desired_types;
                SubLObject appropriate_entities = (SubLObject)scenario.NIL;
                SubLObject cdolist_list_var = identified_entities;
                SubLObject entity = (SubLObject)scenario.NIL;
                entity = cdolist_list_var.first();
                while (scenario.NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)scenario.$sym129$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(scenario.$const130$EverythingPSC, thread);
                        if (scenario.NIL != genls.any_genl_anyP(methods.funcall_instance_method_with_0_args(entity, (SubLObject)scenario.$sym131$ALL_TYPES), desired_types, (SubLObject)scenario.UNPROVIDED, (SubLObject)scenario.UNPROVIDED)) {
                            appropriate_entities = (SubLObject)ConsesLow.cons(entity, appropriate_entities);
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    entity = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym128$OUTER_CATCH_FOR_ESSAY_METHOD, appropriate_entities);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 10737L)
    public static SubLObject essay_identify_entities_method(final SubLObject self, SubLObject types_to_identify) {
        if (types_to_identify == scenario.UNPROVIDED) {
            types_to_identify = (SubLObject)scenario.$list136;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = (SubLObject)scenario.NIL;
        SubLObject identified_entities = get_essay_identified_entities(self);
        final SubLObject content = answer.get_answer_content(self);
        final SubLObject info_request = answer.get_answer_info_request(self);
        try {
            thread.throwStack.push(scenario.$sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert scenario.NIL != Types.listp(types_to_identify) : types_to_identify;
                final SubLObject lexicon = instances.get_slot(info_request, (SubLObject)scenario.$sym12$LEXICON);
                final SubLObject entities_hash = Hashtables.make_hash_table((SubLObject)scenario.$int138$32, Symbols.symbol_function((SubLObject)scenario.EQUAL), (SubLObject)scenario.UNPROVIDED);
                SubLObject cdolist_list_var = content;
                SubLObject passage = (SubLObject)scenario.NIL;
                passage = cdolist_list_var.first();
                while (scenario.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5;
                    final SubLObject passage_entities = cdolist_list_var_$5 = methods.funcall_instance_method_with_2_args(passage, (SubLObject)scenario.$sym133$IDENTIFY_ENTITIES, lexicon, types_to_identify);
                    SubLObject entity = (SubLObject)scenario.NIL;
                    entity = cdolist_list_var_$5.first();
                    while (scenario.NIL != cdolist_list_var_$5) {
                        final SubLObject string = instances.get_slot(entity, (SubLObject)scenario.$sym9$STRING);
                        final SubLObject value = Hashtables.gethash(string, entities_hash, (SubLObject)scenario.UNPROVIDED);
                        if (scenario.NIL != value) {
                            methods.funcall_instance_method_with_1_args(value, (SubLObject)scenario.$sym139$ADD_PASSAGE, passage);
                        }
                        else {
                            Hashtables.sethash(string, entities_hash, entity);
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        entity = cdolist_list_var_$5.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    passage = cdolist_list_var.first();
                }
                SubLObject key = (SubLObject)scenario.NIL;
                SubLObject value2 = (SubLObject)scenario.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(entities_hash);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        final SubLObject item_var;
                        value2 = (item_var = Hashtables.getEntryValue(cdohash_entry));
                        if (scenario.NIL == conses_high.member(item_var, identified_entities, (SubLObject)scenario.$sym140$TEXTUAL_FOCUS_ENTITY_EQUAL, Symbols.symbol_function((SubLObject)scenario.IDENTITY))) {
                            identified_entities = (SubLObject)ConsesLow.cons(item_var, identified_entities);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)scenario.$sym137$OUTER_CATCH_FOR_ESSAY_METHOD, identified_entities);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)scenario.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    answer.set_answer_content(self, content);
                    answer.set_answer_info_request(self, info_request);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)scenario.$sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/scenario.lisp", position = 11512L)
    public static SubLObject safe_svector_cosine_angle(final SubLObject svector1, final SubLObject svector2, SubLObject fall_back) {
        if (fall_back == scenario.UNPROVIDED) {
            fall_back = (SubLObject)scenario.ZERO_INTEGER;
        }
        assert scenario.NIL != sparse_vector.sparse_vector_p(svector1) : svector1;
        assert scenario.NIL != sparse_vector.sparse_vector_p(svector2) : svector2;
        if (sparse_vector.svector_length(svector1).isZero()) {
            return fall_back;
        }
        if (sparse_vector.svector_length(svector2).isZero()) {
            return fall_back;
        }
        return sparse_vector.svector_cosine_angle(svector1, svector2);
    }
    
    public static SubLObject declare_scenario_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_answers", "GET-SCENARIO-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_answers", "SET-SCENARIO-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_questions", "GET-SCENARIO-QUESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_questions", "SET-SCENARIO-QUESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_vector", "GET-SCENARIO-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_vector", "SET-SCENARIO-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_augmentation_terms", "GET-SCENARIO-AUGMENTATION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_augmentation_terms", "SET-SCENARIO-AUGMENTATION-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_sentences", "GET-SCENARIO-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_sentences", "SET-SCENARIO-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_corpora", "GET-SCENARIO-CORPORA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_corpora", "SET-SCENARIO-CORPORA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_string", "GET-SCENARIO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_string", "SET-SCENARIO-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_tagger", "GET-SCENARIO-TAGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_tagger", "SET-SCENARIO-TAGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_parser", "GET-SCENARIO-PARSER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_parser", "SET-SCENARIO-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_scenario_lexicon", "GET-SCENARIO-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_scenario_lexicon", "SET-SCENARIO-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "subloop_reserved_initialize_scenario_class", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "subloop_reserved_initialize_scenario_instance", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "scenario_p", "SCENARIO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "scenario_viable_question_method", "SCENARIO-VIABLE-QUESTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "scenario_initialize_method", "SCENARIO-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "scenario_get_vector_method", "SCENARIO-GET-VECTOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "new_scenario", "NEW-SCENARIO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "scenario_answer_method", "SCENARIO-ANSWER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "scenario_answer_subquestions_method", "SCENARIO-ANSWER-SUBQUESTIONS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_essay_identified_entities", "GET-ESSAY-IDENTIFIED-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_essay_identified_entities", "SET-ESSAY-IDENTIFIED-ENTITIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "get_essay_subquestion_answers", "GET-ESSAY-SUBQUESTION-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "set_essay_subquestion_answers", "SET-ESSAY-SUBQUESTION-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "subloop_reserved_initialize_essay_class", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "subloop_reserved_initialize_essay_instance", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_p", "ESSAY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_select_method", "ESSAY-SELECT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_typical_instance_method", "ESSAY-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "new_essay", "NEW-ESSAY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_print_method", "ESSAY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_chronology_method", "ESSAY-CHRONOLOGY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_render_method", "ESSAY-RENDER-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_answer_subquestions_method", "ESSAY-ANSWER-SUBQUESTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_background_identify_entities_method", "ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_get_entity_by_name_method", "ESSAY-GET-ENTITY-BY-NAME-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_get_entities_by_types_method", "ESSAY-GET-ENTITIES-BY-TYPES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "essay_identify_entities_method", "ESSAY-IDENTIFY-ENTITIES-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.scenario", "safe_svector_cosine_angle", "SAFE-SVECTOR-COSINE-ANGLE", 2, 1, false);
        return (SubLObject)scenario.NIL;
    }
    
    public static SubLObject init_scenario_file() {
        return (SubLObject)scenario.NIL;
    }
    
    public static SubLObject setup_scenario_file() {
        classes.subloop_new_class((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym1$INFORMATION_REQUEST, (SubLObject)scenario.NIL, (SubLObject)scenario.NIL, (SubLObject)scenario.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym15$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym20$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE);
        subloop_reserved_initialize_scenario_class((SubLObject)scenario.$sym0$SCENARIO);
        methods.methods_incorporate_class_method((SubLObject)scenario.$sym21$VIABLE_QUESTION, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$list22, (SubLObject)scenario.$list23, (SubLObject)scenario.$list24);
        methods.subloop_register_class_method((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym21$VIABLE_QUESTION, (SubLObject)scenario.$sym26$SCENARIO_VIABLE_QUESTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym27$INITIALIZE, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$list22, (SubLObject)scenario.NIL, (SubLObject)scenario.$list28);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym27$INITIALIZE, (SubLObject)scenario.$sym33$SCENARIO_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym34$GET_VECTOR, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$list35, (SubLObject)scenario.NIL, (SubLObject)scenario.$list36);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym34$GET_VECTOR, (SubLObject)scenario.$sym38$SCENARIO_GET_VECTOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$list43, (SubLObject)scenario.NIL, (SubLObject)scenario.$list44);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.$sym50$SCENARIO_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym51$ANSWER_SUBQUESTIONS, (SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$list35, (SubLObject)scenario.$list52, (SubLObject)scenario.$list53);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym0$SCENARIO, (SubLObject)scenario.$sym51$ANSWER_SUBQUESTIONS, (SubLObject)scenario.$sym59$SCENARIO_ANSWER_SUBQUESTIONS_METHOD);
        classes.subloop_new_class((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym42$ANSWER, (SubLObject)scenario.NIL, (SubLObject)scenario.NIL, (SubLObject)scenario.$list60);
        classes.class_set_implements_slot_listeners((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym63$SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym70$SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE);
        subloop_reserved_initialize_essay_class((SubLObject)scenario.$sym48$ESSAY);
        methods.methods_incorporate_class_method((SubLObject)scenario.$sym49$SELECT, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.$list71, (SubLObject)scenario.$list72);
        methods.subloop_register_class_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym49$SELECT, (SubLObject)scenario.$sym78$ESSAY_SELECT_METHOD);
        methods.methods_incorporate_class_method((SubLObject)scenario.$sym77$TYPICAL_INSTANCE, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.$list71, (SubLObject)scenario.$list79);
        methods.subloop_register_class_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym77$TYPICAL_INSTANCE, (SubLObject)scenario.$sym81$ESSAY_TYPICAL_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym83$PRINT, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list22, (SubLObject)scenario.$list84, (SubLObject)scenario.$list85);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym83$PRINT, (SubLObject)scenario.$sym90$ESSAY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym91$CHRONOLOGY, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.NIL, (SubLObject)scenario.$list92);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym91$CHRONOLOGY, (SubLObject)scenario.$sym95$ESSAY_CHRONOLOGY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym93$RENDER, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.$list96, (SubLObject)scenario.$list97);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym93$RENDER, (SubLObject)scenario.$sym110$ESSAY_RENDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym51$ANSWER_SUBQUESTIONS, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list22, (SubLObject)scenario.NIL, (SubLObject)scenario.$list111);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym51$ANSWER_SUBQUESTIONS, (SubLObject)scenario.$sym114$ESSAY_ANSWER_SUBQUESTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym115$BACKGROUND_IDENTIFY_ENTITIES, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.NIL, (SubLObject)scenario.$list116);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym115$BACKGROUND_IDENTIFY_ENTITIES, (SubLObject)scenario.$sym119$ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym120$GET_ENTITY_BY_NAME, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.$list121, (SubLObject)scenario.$list122);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym120$GET_ENTITY_BY_NAME, (SubLObject)scenario.$sym124$ESSAY_GET_ENTITY_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym125$GET_ENTITIES_BY_TYPES, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.$list126, (SubLObject)scenario.$list127);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym125$GET_ENTITIES_BY_TYPES, (SubLObject)scenario.$sym132$ESSAY_GET_ENTITIES_BY_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)scenario.$sym133$IDENTIFY_ENTITIES, (SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$list35, (SubLObject)scenario.$list134, (SubLObject)scenario.$list135);
        methods.subloop_register_instance_method((SubLObject)scenario.$sym48$ESSAY, (SubLObject)scenario.$sym133$IDENTIFY_ENTITIES, (SubLObject)scenario.$sym118$ESSAY_IDENTIFY_ENTITIES_METHOD);
        return (SubLObject)scenario.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_scenario_file();
    }
    
    @Override
	public void initializeVariables() {
        init_scenario_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_scenario_file();
    }
    
    static {
        me = (SubLFile)new scenario();
        $sym0$SCENARIO = SubLObjectFactory.makeSymbol("SCENARIO");
        $sym1$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPORA"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE-QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)scenario.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"), (SubLObject)scenario.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)scenario.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym3$ANSWERS = SubLObjectFactory.makeSymbol("ANSWERS");
        $sym4$QUESTIONS = SubLObjectFactory.makeSymbol("QUESTIONS");
        $sym5$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym6$AUGMENTATION_TERMS = SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS");
        $sym7$SENTENCES = SubLObjectFactory.makeSymbol("SENTENCES");
        $sym8$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym9$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym10$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym11$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym12$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym13$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym14$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym15$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS");
        $sym16$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym17$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym18$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym19$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym20$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE");
        $sym21$VIABLE_QUESTION = SubLObjectFactory.makeSymbol("VIABLE-QUESTION");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param QUESTION, question-p;\n   @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VIABLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-P"), SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-P"), SubLObjectFactory.makeSymbol("EVENT-LOCATION-QUESTION-P"), SubLObjectFactory.makeSymbol("DISTANCE-QUESTION-P"), SubLObjectFactory.makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), SubLObjectFactory.makeSymbol("AGE-QUESTION-P"), SubLObjectFactory.makeSymbol("WHAT-QUESTION-P"), SubLObjectFactory.makeSymbol("DATE-QUESTION-P") })), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE"))));
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-P"), SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-P"), SubLObjectFactory.makeSymbol("EVENT-LOCATION-QUESTION-P"), SubLObjectFactory.makeSymbol("DISTANCE-QUESTION-P"), SubLObjectFactory.makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), SubLObjectFactory.makeSymbol("AGE-QUESTION-P"), SubLObjectFactory.makeSymbol("WHAT-QUESTION-P"), SubLObjectFactory.makeSymbol("DATE-QUESTION-P") });
        $sym26$SCENARIO_VIABLE_QUESTION_METHOD = SubLObjectFactory.makeSymbol("SCENARIO-VIABLE-QUESTION-METHOD");
        $sym27$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Initializes all class slots in question\n   @return scenario-p\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUIRK-LEXICON"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CHARNIAK-PARSER"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeInteger(30)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TAGGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");
        $sym30$QUIRK_LEXICON = SubLObjectFactory.makeSymbol("QUIRK-LEXICON");
        $kw31$WARN = SubLObjectFactory.makeKeyword("WARN");
        $int32$30 = SubLObjectFactory.makeInteger(30);
        $sym33$SCENARIO_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SCENARIO-INITIALIZE-METHOD");
        $sym34$GET_VECTOR = SubLObjectFactory.makeSymbol("GET-VECTOR");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return sparse-vector-p, a vector representation of this scenario.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VECTOR"))));
        $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");
        $sym38$SCENARIO_GET_VECTOR_METHOD = SubLObjectFactory.makeSymbol("SCENARIO-GET-VECTOR-METHOD");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AQUAINT"));
        $sym40$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym41$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym42$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return essay-p, an essay to answer this scenario.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)scenario.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)scenario.NIL), (SubLObject)SubLObjectFactory.makeSymbol("SCENARIO-QUERY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)scenario.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS")), (SubLObject)scenario.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-DO-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT-TERMS")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-TERMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCENARIO-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-TERMS"))), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)scenario.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(50))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SCENARIO-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ESSAY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ESSAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"))))));
        $sym45$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym46$AUGMENT_TERMS = SubLObjectFactory.makeSymbol("AUGMENT-TERMS");
        $int47$50 = SubLObjectFactory.makeInteger(50);
        $sym48$ESSAY = SubLObjectFactory.makeSymbol("ESSAY");
        $sym49$SELECT = SubLObjectFactory.makeSymbol("SELECT");
        $sym50$SCENARIO_ANSWER_METHOD = SubLObjectFactory.makeSymbol("SCENARIO-ANSWER-METHOD");
        $sym51$ANSWER_SUBQUESTIONS = SubLObjectFactory.makeSymbol("ANSWER-SUBQUESTIONS");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param VERBOSE, booleanp\n   @return scenario-p, this scenario\n   As a side effect it computes answers to all viable subquestions of this scenario and\n   stores them in the appropriate slot of this object.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCENARIO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE-QUESTION")), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("Q-ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)scenario.T, (SubLObject)SubLObjectFactory.makeString("~%~S has been answered: ~%"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("Q-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)scenario.T, (SubLObject)SubLObjectFactory.makeString("~%    ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)scenario.T, (SubLObject)SubLObjectFactory.makeString("~%~%"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("Q-ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");
        $str55$___S_has_been_answered____ = SubLObjectFactory.makeString("~%~S has been answered: ~%");
        $str56$_______S = SubLObjectFactory.makeString("~%    ~S");
        $sym57$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $str58$____ = SubLObjectFactory.makeString("~%~%");
        $sym59$SCENARIO_ANSWER_SUBQUESTIONS_METHOD = SubLObjectFactory.makeSymbol("SCENARIO-ANSWER-SUBQUESTIONS-METHOD");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBQUESTION-ANSWERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE-QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RENDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("RENDERING-P-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-SUBQUESTIONS"), (SubLObject)scenario.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym61$IDENTIFIED_ENTITIES = SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES");
        $sym62$SUBQUESTION_ANSWERS = SubLObjectFactory.makeSymbol("SUBQUESTION-ANSWERS");
        $sym63$SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS");
        $sym64$INFO_REQUEST = SubLObjectFactory.makeSymbol("INFO-REQUEST");
        $sym65$CONTENT = SubLObjectFactory.makeSymbol("CONTENT");
        $sym66$CONFIDENCE = SubLObjectFactory.makeSymbol("CONFIDENCE");
        $sym67$RELEVANCE = SubLObjectFactory.makeSymbol("RELEVANCE");
        $sym68$JUSTIFICATION = SubLObjectFactory.makeSymbol("JUSTIFICATION");
        $sym69$INFO = SubLObjectFactory.makeSymbol("INFO");
        $sym70$SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PASSAGES listp;\n     @return listp; the list of conses of the most salient passages among PASSAGES \n     and their confidences, ranked by their salientness.\n     @owner aldag"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECTED"), (SubLObject)scenario.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY"), (SubLObject)SubLObjectFactory.makeDouble(0.3)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-SIMILARITY")), (SubLObject)scenario.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS-PASSAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-INSTANCES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ESSAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE")), (SubLObject)SubLObjectFactory.makeSymbol("MAX-PASSAGES")), (SubLObject)SubLObjectFactory.makeSymbol("SELECTED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELECTED"))));
        $float73$0_3 = (SubLFloat)SubLObjectFactory.makeDouble(0.3);
        $sym74$PASSAGE_SIMILARITY = SubLObjectFactory.makeSymbol("PASSAGE-SIMILARITY");
        $sym75$CORPUS_PASSAGE = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE");
        $sym76$MAX_INSTANCES = SubLObjectFactory.makeSymbol("MAX-INSTANCES");
        $sym77$TYPICAL_INSTANCE = SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE");
        $sym78$ESSAY_SELECT_METHOD = SubLObjectFactory.makeSymbol("ESSAY-SELECT-METHOD");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS.\n    @owner aldag"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CENTROID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SVECTOR-CENTROID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CENTROID-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SVECTOR-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-DISTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID"))), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-DISTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-DISTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"))));
        $sym80$GET_ABSTRACT_PASSAGE_VECTOR = SubLObjectFactory.makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR");
        $sym81$ESSAY_TYPICAL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("ESSAY-TYPICAL-INSTANCE-METHOD");
        $sym82$KEY_POINTS = SubLObjectFactory.makeSymbol("KEY-POINTS");
        $sym83$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<ESSAY sources:"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" entities:"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym86$OUTER_CATCH_FOR_ESSAY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");
        $str87$__ESSAY_sources_ = SubLObjectFactory.makeString("#<ESSAY sources:");
        $str88$_entities_ = SubLObjectFactory.makeString(" entities:");
        $str89$_ = SubLObjectFactory.makeString(">");
        $sym90$ESSAY_PRINT_METHOD = SubLObjectFactory.makeSymbol("ESSAY-PRINT-METHOD");
        $sym91$CHRONOLOGY = SubLObjectFactory.makeSymbol("CHRONOLOGY");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RENDER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("CHRONOLOGICAL"))))));
        $sym93$RENDER = SubLObjectFactory.makeSymbol("RENDER");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("CHRONOLOGICAL"));
        $sym95$ESSAY_CHRONOLOGY_METHOD = SubLObjectFactory.makeSymbol("ESSAY-CHRONOLOGY-METHOD");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("SEQUENTIAL")))));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("FORMAT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"))), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)SubLObjectFactory.makeString("")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEQUENTIAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CCONCATENATE"), SubLObjectFactory.makeSymbol("ACCUMULATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeString("("), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"))), SubLObjectFactory.makeString(")"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*") })))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHRONOLOGICAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORTED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SORTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CCONCATENATE"), SubLObjectFactory.makeSymbol("ACCUMULATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeString("("), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"))), SubLObjectFactory.makeString(")"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*") })))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"))));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("SEQUENTIAL"));
        $sym99$OUTER_CATCH_FOR_ESSAY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");
        $kw100$FORMAT = SubLObjectFactory.makeKeyword("FORMAT");
        $kw101$ORDER = SubLObjectFactory.makeKeyword("ORDER");
        $kw102$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str103$ = SubLObjectFactory.makeString("");
        $kw104$SEQUENTIAL = SubLObjectFactory.makeKeyword("SEQUENTIAL");
        $str105$_ = SubLObjectFactory.makeString("(");
        $sym106$GET_SOURCE = SubLObjectFactory.makeSymbol("GET-SOURCE");
        $str107$_ = SubLObjectFactory.makeString(")");
        $kw108$CHRONOLOGICAL = SubLObjectFactory.makeKeyword("CHRONOLOGICAL");
        $sym109$ABSTRACT_PASSAGE_OLDER_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD");
        $sym110$ESSAY_RENDER_METHOD = SubLObjectFactory.makeSymbol("ESSAY-RENDER-METHOD");
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ESSAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VIABLE-QUESTION")), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBQUESTION-ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeSymbol("SUBQUESTION-ANSWERS")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym112$OUTER_CATCH_FOR_ESSAY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");
        $sym113$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $sym114$ESSAY_ANSWER_SUBQUESTIONS_METHOD = SubLObjectFactory.makeSymbol("ESSAY-ANSWER-SUBQUESTIONS-METHOD");
        $sym115$BACKGROUND_IDENTIFY_ENTITIES = SubLObjectFactory.makeSymbol("BACKGROUND-IDENTIFY-ENTITIES");
        $list116 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)scenario.NIL, (SubLObject)SubLObjectFactory.makeString("~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENSYM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $str117$_S = SubLObjectFactory.makeString("~S");
        $sym118$ESSAY_IDENTIFY_ENTITIES_METHOD = SubLObjectFactory.makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD");
        $sym119$ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD = SubLObjectFactory.makeSymbol("ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD");
        $sym120$GET_ENTITY_BY_NAME = SubLObjectFactory.makeSymbol("GET-ENTITY-BY-NAME");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAMED-ENTITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES"), (SubLObject)SubLObjectFactory.makeSymbol("NAMED-ENTITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)scenario.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NAMED-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NAMED-ENTITY"))));
        $sym123$OUTER_CATCH_FOR_ESSAY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");
        $sym124$ESSAY_GET_ENTITY_BY_NAME_METHOD = SubLObjectFactory.makeSymbol("ESSAY-GET-ENTITY-BY-NAME-METHOD");
        $sym125$GET_ENTITIES_BY_TYPES = SubLObjectFactory.makeSymbol("GET-ENTITIES-BY-TYPES");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESIRED-TYPES"));
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DESIRED-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPROPRIATE-ENTITIES"), (SubLObject)scenario.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANY-GENL-ANY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TYPES"))), (SubLObject)SubLObjectFactory.makeSymbol("DESIRED-TYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("APPROPRIATE-ENTITIES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("APPROPRIATE-ENTITIES"))));
        $sym128$OUTER_CATCH_FOR_ESSAY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");
        $sym129$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const130$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym131$ALL_TYPES = SubLObjectFactory.makeSymbol("ALL-TYPES");
        $sym132$ESSAY_GET_ENTITIES_BY_TYPES_METHOD = SubLObjectFactory.makeSymbol("ESSAY-GET-ENTITIES-BY-TYPES-METHOD");
        $sym133$IDENTIFY_ENTITIES = SubLObjectFactory.makeSymbol("IDENTIFY-ENTITIES");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPES-TO-IDENTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))))));
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES-TO-IDENTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITIES-HASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)scenario.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-ENTITIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFY-ENTITIES")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES-TO-IDENTIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-ENTITIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES-HASH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PASSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES-HASH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES-HASH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFIED-ENTITIES"))));
        $list136 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")));
        $sym137$OUTER_CATCH_FOR_ESSAY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");
        $int138$32 = SubLObjectFactory.makeInteger(32);
        $sym139$ADD_PASSAGE = SubLObjectFactory.makeSymbol("ADD-PASSAGE");
        $sym140$TEXTUAL_FOCUS_ENTITY_EQUAL = SubLObjectFactory.makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL");
        $sym141$SPARSE_VECTOR_P = SubLObjectFactory.makeSymbol("SPARSE-VECTOR-P");
    }
}

/*

	Total time: 764 ms
	
*/