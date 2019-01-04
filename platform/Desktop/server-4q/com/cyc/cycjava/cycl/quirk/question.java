package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.nl_trie;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.shallow_parser;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parser;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.question";
    public static final String myFingerPrint = "511271deee2d79eeebb44a31612a9bdd85747e32ef5b143a01f9f447c5594dce";
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 1534L)
    private static SubLSymbol $question_parser$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 1687L)
    private static SubLSymbol $question_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 1786L)
    private static SubLSymbol $sksi_registered$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 14822L)
    private static SubLSymbol $cyc_to_resporator_map$;
    private static final SubLSymbol $kw0$WARN;
    private static final SubLInteger $int1$30;
    private static final SubLSymbol $sym2$TERM_LEXICON;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$QUESTION;
    private static final SubLSymbol $sym5$INFORMATION_REQUEST;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$CORPORA;
    private static final SubLSymbol $sym8$ANSWER_TYPES;
    private static final SubLSymbol $sym9$PARSE;
    private static final SubLSymbol $sym10$STRING;
    private static final SubLSymbol $sym11$LEARNABLE_TYPES;
    private static final SubLSymbol $sym12$MAX_CONFIDENCE;
    private static final SubLSymbol $sym13$MAX_CANDIDATES;
    private static final SubLSymbol $sym14$CHUNKER;
    private static final SubLSymbol $sym15$TAGGER;
    private static final SubLSymbol $sym16$PARSER;
    private static final SubLSymbol $sym17$LEXICON;
    private static final SubLSymbol $sym18$OBJECT;
    private static final SubLSymbol $sym19$INSTANCE_COUNT;
    private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS;
    private static final SubLSymbol $sym21$ISOLATED_P;
    private static final SubLSymbol $sym22$INSTANCE_NUMBER;
    private static final SubLSymbol $sym23$ERROR_HANDLING;
    private static final SubLSymbol $sym24$TIMEOUT;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE;
    private static final SubLSymbol $sym26$CLASSIFY;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$ISA_;
    private static final SubLSymbol $sym31$CHILD_CLASSES;
    private static final SubLSymbol $sym32$QUESTION_CLASSIFY_METHOD;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym35$INITIALIZE;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLSymbol $sym38$QUESTION_INITIALIZE_METHOD;
    private static final SubLSymbol $sym39$AUGMENT_TERMS;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str43$index;
    private static final SubLString $str44$Could_not_get_augmentation_terms_;
    private static final SubLSymbol $sym45$GET_PATH_LABELS;
    private static final SubLSymbol $sym46$QUESTION_AUGMENT_TERMS_METHOD;
    private static final SubLSymbol $sym47$REQUIRE_PERCENTAGE;
    private static final SubLList $list48;
    private static final SubLInteger $int49$100;
    private static final SubLSymbol $sym50$QUESTION_REQUIRE_PERCENTAGE_METHOD;
    private static final SubLSymbol $sym51$GET_HEAD;
    private static final SubLSymbol $sym52$GET_STRING;
    private static final SubLSymbol $sym53$TREE_TYPE_MATCH;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLSymbol $sym56$GET_KEYWORDS;
    private static final SubLSymbol $sym57$GET;
    private static final SubLSymbol $kw58$DENOT;
    private static final SubLSymbol $sym59$GET_LEXES;
    private static final SubLSymbol $sym60$QUESTION_TREE_TYPE_MATCH_METHOD;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$QUESTION_ANSWER_TYPES_METHOD;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLSymbol $sym65$GET_CATEGORY;
    private static final SubLSymbol $sym66$YIELD;
    private static final SubLSymbol $sym67$QUESTION_GET_KEYWORDS_METHOD;
    private static final SubLSymbol $sym68$GET_KEYSTRINGS;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$WORD_TREE_GET_STRING_METHOD;
    private static final SubLSymbol $sym71$QUESTION_GET_KEYSTRINGS_METHOD;
    private static final SubLSymbol $sym72$CANDIDATE_ANSWER_P;
    private static final SubLList $list73;
    private static final SubLFloat $float74$0_3;
    private static final SubLSymbol $sym75$QUESTION_CANDIDATE_ANSWER_P_METHOD;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$STRINGP;
    private static final SubLSymbol $sym78$LISTP;
    private static final SubLSymbol $sym79$LEARN;
    private static final SubLSymbol $sym80$LEXIFY;
    private static final SubLSymbol $sym81$PRINT;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLString $str85$__;
    private static final SubLString $str86$__;
    private static final SubLString $str87$_;
    private static final SubLSymbol $sym88$QUESTION_PRINT_METHOD;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLSymbol $sym92$QUESTION_GET_STRING_METHOD;
    private static final SubLSymbol $sym93$ANSWER;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLSymbol $sym96$ANSWER_CARDINALITY;
    private static final SubLSymbol $sym97$GET_CONTENT;
    private static final SubLSymbol $sym98$EXTRACT;
    private static final SubLSymbol $sym99$QUERIFY;
    private static final SubLString $str100$Answering__a_timed_out_after__a_s;
    private static final SubLSymbol $sym101$SELECT;
    private static final SubLSymbol $sym102$QUESTION_ANSWER_METHOD;
    private static final SubLObject $const103$GuruQAMt;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const106$EverythingPSC;
    private static final SubLSymbol $sym107$PARSE_TREE_P;
    private static final SubLFloat $float108$0_8;
    private static final SubLSymbol $sym109$WORD_TREE_P;
    private static final SubLSymbol $kw110$STRING;
    private static final SubLString $str111$__;
    private static final SubLString $str112$_;
    private static final SubLString $str113$__;
    private static final SubLString $str114$_;
    private static final SubLString $str115$__;
    private static final SubLString $str116$_;
    private static final SubLString $str117$__;
    private static final SubLString $str118$_;
    private static final SubLString $str119$__;
    private static final SubLString $str120$_;
    private static final SubLString $str121$_;
    private static final SubLSymbol $kw122$CYC_POS;
    private static final SubLSymbol $kw123$WORD_UNIT;
    private static final SubLList $list124;
    private static final SubLString $str125$_cyc_quirk_trec_questions_trec_qu;
    private static final SubLSymbol $sym126$QUESTION_P;
    private static final SubLSymbol $kw127$INPUT;
    private static final SubLString $str128$Unable_to_open__S;
    private static final SubLString $str129$_;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLString $str132$__;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 1826L)
    public static SubLObject initialize_question() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (question.NIL == question.$question_parser$.getDynamicValue(thread)) {
            question.$question_parser$.setDynamicValue(parser.new_stanford_parser((SubLObject)question.$kw0$WARN, (SubLObject)question.$int1$30), thread);
        }
        if (question.NIL == question.$question_lexicon$.getDynamicValue(thread)) {
            question.$question_lexicon$.setDynamicValue(object.new_class_instance((SubLObject)question.$sym2$TERM_LEXICON), thread);
        }
        if (question.NIL == question.$sksi_registered$.getDynamicValue(thread)) {
            sksi_sks_manager.register_sksi_removal_modules_for_skses((SubLObject)question.$list3);
            question.$sksi_registered$.setDynamicValue((SubLObject)question.T, thread);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_corpora(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, (SubLObject)question.SIX_INTEGER, (SubLObject)question.$sym7$CORPORA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_corpora(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, (SubLObject)question.SIX_INTEGER, (SubLObject)question.$sym7$CORPORA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_answer_types(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, (SubLObject)question.FIVE_INTEGER, (SubLObject)question.$sym8$ANSWER_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_answer_types(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, (SubLObject)question.FIVE_INTEGER, (SubLObject)question.$sym8$ANSWER_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_parse(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, (SubLObject)question.FOUR_INTEGER, (SubLObject)question.$sym9$PARSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_parse(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, (SubLObject)question.FOUR_INTEGER, (SubLObject)question.$sym9$PARSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_string(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, (SubLObject)question.THREE_INTEGER, (SubLObject)question.$sym10$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_string(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, (SubLObject)question.THREE_INTEGER, (SubLObject)question.$sym10$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_learnable_types(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym11$LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.SEVEN_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_learnable_types(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym11$LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.SEVEN_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_max_confidence(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym12$MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.SIX_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_max_confidence(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym12$MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.SIX_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_max_candidates(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym13$MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.FIVE_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_max_candidates(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym13$MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.FIVE_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_chunker(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym14$CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.FOUR_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_chunker(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym14$CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.FOUR_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_tagger(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym15$TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.THREE_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_tagger(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym15$TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.THREE_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_parser(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym16$PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.TWO_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_parser(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym16$PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.TWO_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject get_question_lexicon(final SubLObject v_question) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym17$LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.ONE_INTEGER);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject set_question_lexicon(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_question.isSymbol() ? classes.classes_retrieve_class(v_question) : ((question.NIL != subloop_structures.class_p(v_question)) ? v_question : ((question.NIL != subloop_structures.instance_p(v_question)) ? subloop_structures.instance_class(v_question) : question.NIL)));
        if (question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)question.$sym17$LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)question.ONE_INTEGER, value);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject subloop_reserved_initialize_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym18$OBJECT, (SubLObject)question.$sym19$INSTANCE_COUNT, (SubLObject)question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym17$LEXICON, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym16$PARSER, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym15$TAGGER, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym14$CHUNKER, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym13$MAX_CANDIDATES, (SubLObject)question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym12$MAX_CONFIDENCE, (SubLObject)question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym11$LEARNABLE_TYPES, (SubLObject)question.NIL);
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject subloop_reserved_initialize_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym18$OBJECT, (SubLObject)question.$sym21$ISOLATED_P, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym18$OBJECT, (SubLObject)question.$sym22$INSTANCE_NUMBER, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym5$INFORMATION_REQUEST, (SubLObject)question.$sym23$ERROR_HANDLING, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym5$INFORMATION_REQUEST, (SubLObject)question.$sym24$TIMEOUT, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym10$STRING, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym9$PARSE, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym8$ANSWER_TYPES, (SubLObject)question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym7$CORPORA, (SubLObject)question.NIL);
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 2233L)
    public static SubLObject question_p(final SubLObject v_question) {
        return classes.subloop_instanceof_class(v_question, (SubLObject)question.$sym4$QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 3473L)
    public static SubLObject question_classify_method(final SubLObject self, final SubLObject tree) {
        if (question.NIL == parse_tree.question_tree_p(tree)) {
            return (SubLObject)question.NIL;
        }
        final SubLObject class_stack = stacks.create_stack();
        SubLObject qclasses = (SubLObject)question.NIL;
        stacks.stack_push(self, class_stack);
        while (question.NIL == stacks.stack_empty_p(class_stack)) {
            final SubLObject qclass = stacks.stack_pop(class_stack);
            if (question.NIL != methods.funcall_class_method_with_1_args(qclass, (SubLObject)question.$sym30$ISA_, tree)) {
                qclasses = (SubLObject)ConsesLow.cons(qclass, qclasses);
            }
            SubLObject cdolist_list_var = methods.funcall_class_method_with_0_args(qclass, (SubLObject)question.$sym31$CHILD_CLASSES);
            SubLObject child_class = (SubLObject)question.NIL;
            child_class = cdolist_list_var.first();
            while (question.NIL != cdolist_list_var) {
                stacks.stack_push(child_class, class_stack);
                cdolist_list_var = cdolist_list_var.rest();
                child_class = cdolist_list_var.first();
            }
        }
        return qclasses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 4589L)
    public static SubLObject question_isaP_method(final SubLObject self, final SubLObject tree) {
        return parse_tree.question_tree_p(tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 5017L)
    public static SubLObject question_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)question.NIL;
        SubLObject learnable_types = get_question_learnable_types(self);
        SubLObject chunker = get_question_chunker(self);
        SubLObject tagger = get_question_tagger(self);
        SubLObject v_parser = get_question_parser(self);
        SubLObject lexicon = get_question_lexicon(self);
        try {
            thread.throwStack.push(question.$sym37$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                search_engine.information_request_initialize_method(self);
                if (question.NIL == lexicon) {
                    lexicon = object.new_class_instance((SubLObject)question.$sym2$TERM_LEXICON);
                }
                if (question.NIL == v_parser) {
                    v_parser = parser.new_stanford_parser((SubLObject)question.$kw0$WARN, (SubLObject)question.$int1$30);
                }
                if (question.NIL == tagger) {
                    tagger = pos_tagger.get_tagger();
                }
                if (question.NIL == chunker) {
                    chunker = shallow_parser.new_shallow_parser((SubLObject)question.$kw0$WARN, (SubLObject)question.TEN_INTEGER);
                }
                if (question.NIL == learnable_types) {
                    learnable_types = get_learnable_types();
                }
                Dynamic.sublisp_throw((SubLObject)question.$sym37$OUTER_CATCH_FOR_QUESTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_question_learnable_types(self, learnable_types);
                    set_question_chunker(self, chunker);
                    set_question_tagger(self, tagger);
                    set_question_parser(self, v_parser);
                    set_question_lexicon(self, lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)question.$sym37$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 5477L)
    public static SubLObject question_augment_terms_method(final SubLObject self, final SubLObject terms, final SubLObject corpus) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_graph = (SubLObject)question.NIL;
        SubLObject error = (SubLObject)question.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)question.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    word_graph = external_interfaces.get_word_graph(terms, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)question.$str43$index, external_interfaces.get_word_graph_path(corpus))), (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)question.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (question.NIL != error) {
            Errors.warn((SubLObject)question.$str44$Could_not_get_augmentation_terms_, terms);
        }
        if (word_graph.isCons()) {
            return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(word_graph), (SubLObject)question.$sym45$GET_PATH_LABELS, terms);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 6031L)
    public static SubLObject question_require_percentage_method(final SubLObject self) {
        return (SubLObject)question.$int49$100;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 6238L)
    public static SubLObject np_term_match(final SubLObject np, final SubLObject v_term, SubLObject test) {
        if (test == question.UNPROVIDED) {
            test = (SubLObject)question.EQUALP;
        }
        final SubLObject head = methods.funcall_instance_method_with_0_args(np, (SubLObject)question.$sym51$GET_HEAD);
        final SubLObject head_words = (SubLObject)((question.NIL != head) ? string_utilities.split_string(methods.funcall_instance_method_with_0_args(head, (SubLObject)question.$sym52$GET_STRING), (SubLObject)question.UNPROVIDED) : question.NIL);
        final SubLObject term_words = string_utilities.split_string(v_term, (SubLObject)question.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(question.NIL != conses_high.intersection(head_words, term_words, test, (SubLObject)question.UNPROVIDED) && question.NIL != string_utilities.substringP(v_term, methods.funcall_instance_method_with_0_args(np, (SubLObject)question.$sym52$GET_STRING), (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 6551L)
    public static SubLObject question_tree_type_match_method(final SubLObject self, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)question.NIL;
        final SubLObject answer_types = get_question_answer_types(self);
        try {
            thread.throwStack.push(question.$sym55$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                final SubLObject head = methods.funcall_instance_method_with_0_args(tree, (SubLObject)question.$sym51$GET_HEAD);
                SubLObject i = (SubLObject)question.NIL;
                SubLObject denot = (SubLObject)question.NIL;
                SubLObject score = (SubLObject)question.NIL;
                SubLObject incompatibleP = (SubLObject)question.NIL;
                if (question.NIL != head) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)question.$sym56$GET_KEYWORDS);
                    SubLObject keyword = (SubLObject)question.NIL;
                    keyword = cdolist_list_var.first();
                    while (question.NIL != cdolist_list_var) {
                        if (question.NIL != tree_match(head, keyword)) {
                            Dynamic.sublisp_throw((SubLObject)question.$sym55$OUTER_CATCH_FOR_QUESTION_METHOD, (SubLObject)question.ZERO_INTEGER);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        keyword = cdolist_list_var.first();
                    }
                    cdolist_list_var = methods.funcall_instance_method_with_0_args(head, (SubLObject)question.$sym59$GET_LEXES);
                    SubLObject lex = (SubLObject)question.NIL;
                    lex = cdolist_list_var.first();
                    while (question.NIL != cdolist_list_var) {
                        denot = methods.funcall_instance_method_with_1_args(lex, (SubLObject)question.$sym57$GET, (SubLObject)question.$kw58$DENOT);
                        SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(self, (SubLObject)question.$sym8$ANSWER_TYPES);
                        SubLObject type_path = (SubLObject)question.NIL;
                        type_path = cdolist_list_var_$1.first();
                        while (question.NIL != cdolist_list_var_$1) {
                            i = Sequences.length(type_path);
                            incompatibleP = (SubLObject)question.NIL;
                            if (question.NIL == incompatibleP) {
                                SubLObject csome_list_var;
                                SubLObject required_type;
                                for (csome_list_var = type_path, required_type = (SubLObject)question.NIL, required_type = csome_list_var.first(); question.NIL == incompatibleP && question.NIL != csome_list_var; incompatibleP = incompatible_p(denot, required_type), i = Numbers.subtract(i, (SubLObject)question.ONE_INTEGER), csome_list_var = csome_list_var.rest(), required_type = csome_list_var.first()) {
                                    score = number_utilities.f_1X(Numbers.log(i, (SubLObject)question.TWO_INTEGER));
                                    if (question.NIL != at_utilities.more_specific_p(denot, required_type, (SubLObject)question.UNPROVIDED)) {
                                        Dynamic.sublisp_throw((SubLObject)question.$sym55$OUTER_CATCH_FOR_QUESTION_METHOD, score);
                                    }
                                }
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            type_path = cdolist_list_var_$1.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lex = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)question.$sym55$OUTER_CATCH_FOR_QUESTION_METHOD, (SubLObject)question.ZERO_INTEGER);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_question_answer_types(self, answer_types);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)question.$sym55$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 7615L)
    public static SubLObject question_answer_types_method(final SubLObject self) {
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 7838L)
    public static SubLObject question_get_keywords_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)question.NIL;
        final SubLObject parse = get_question_parse(self);
        try {
            thread.throwStack.push(question.$sym64$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                SubLObject keywords = (SubLObject)question.NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(parse, (SubLObject)question.$sym66$YIELD);
                SubLObject word = (SubLObject)question.NIL;
                word = cdolist_list_var.first();
                while (question.NIL != cdolist_list_var) {
                    if (question.NIL != content_category_p(methods.funcall_instance_method_with_0_args(word, (SubLObject)question.$sym65$GET_CATEGORY))) {
                        keywords = (SubLObject)ConsesLow.cons(word, keywords);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)question.$sym64$OUTER_CATCH_FOR_QUESTION_METHOD, keywords);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)question.$sym64$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 8147L)
    public static SubLObject question_get_keystrings_method(final SubLObject self) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)question.$sym70$WORD_TREE_GET_STRING_METHOD), question_get_keywords_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 8351L)
    public static SubLObject question_candidate_answer_p_method(final SubLObject self, final SubLObject tree) {
        return Numbers.numG(methods.funcall_instance_method_with_1_args(self, (SubLObject)question.$sym53$TREE_TYPE_MATCH, tree), (SubLObject)question.$float74$0_3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 8599L)
    public static SubLObject new_question(final SubLObject string, SubLObject corpora, SubLObject v_class) {
        if (corpora == question.UNPROVIDED) {
            corpora = (SubLObject)question.$list76;
        }
        if (v_class == question.UNPROVIDED) {
            v_class = (SubLObject)question.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert question.NIL != Types.stringp(string) : string;
        assert question.NIL != Types.listp(corpora) : corpora;
        initialize_question();
        methods.funcall_instance_method_with_1_args(question.$question_lexicon$.getDynamicValue(thread), (SubLObject)question.$sym79$LEARN, string);
        final SubLObject parse = methods.funcall_instance_method_with_1_args(question.$question_parser$.getDynamicValue(thread), (SubLObject)question.$sym9$PARSE, string);
        SubLObject v_question = (SubLObject)question.NIL;
        if (question.NIL != parse) {
            methods.funcall_instance_method_with_1_args(parse, (SubLObject)question.$sym80$LEXIFY, question.$question_lexicon$.getDynamicValue(thread));
            if (question.NIL == v_class) {
                v_class = methods.funcall_class_method_with_1_args((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym26$CLASSIFY, parse).first();
            }
            if (question.NIL != v_class) {
                v_question = object.new_class_instance(v_class);
                set_question_string(v_question, string);
                set_question_corpora(v_question, corpora);
                set_question_parse(v_question, parse);
            }
        }
        return v_question;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 9361L)
    public static SubLObject question_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)question.NIL;
        final SubLObject string = get_question_string(self);
        try {
            thread.throwStack.push(question.$sym84$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                streams_high.write_string((SubLObject)question.$str85$__, stream, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
                print_high.princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                streams_high.write_string((SubLObject)question.$str86$__, stream, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
                streams_high.write_string(string, stream, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
                streams_high.write_string((SubLObject)question.$str87$_, stream, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)question.$sym84$OUTER_CATCH_FOR_QUESTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_question_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)question.$sym84$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 9672L)
    public static SubLObject question_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)question.NIL;
        final SubLObject string = get_question_string(self);
        try {
            thread.throwStack.push(question.$sym91$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)question.$sym91$OUTER_CATCH_FOR_QUESTION_METHOD, string);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_question_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)question.$sym91$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 9795L)
    public static SubLObject question_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)question.NIL;
        final SubLObject max_candidates = get_question_max_candidates(self);
        final SubLObject timeout = search_engine.get_information_request_timeout(self);
        try {
            thread.throwStack.push(question.$sym95$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                final SubLObject texts = set.new_set((SubLObject)question.EQUAL, (SubLObject)question.UNPROVIDED);
                SubLObject enoughP = (SubLObject)question.NIL;
                SubLObject i = (SubLObject)question.ZERO_INTEGER;
                SubLObject candidates = (SubLObject)question.NIL;
                final SubLObject cutoff = methods.funcall_instance_method_with_0_args(self, (SubLObject)question.$sym96$ANSWER_CARDINALITY);
                SubLObject timed_outP = (SubLObject)question.NIL;
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)question.T, thread);
                        SubLObject timer = (SubLObject)question.NIL;
                        try {
                            final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)question.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                if (question.NIL == enoughP) {
                                    SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)question.$sym99$QUERIFY);
                                    SubLObject query = (SubLObject)question.NIL;
                                    query = csome_list_var.first();
                                    while (question.NIL == enoughP && question.NIL != csome_list_var) {
                                        if (question.NIL == enoughP) {
                                            SubLObject csome_list_var_$3 = methods.funcall_instance_method_with_0_args(query, (SubLObject)question.$sym93$ANSWER);
                                            SubLObject passage = (SubLObject)question.NIL;
                                            passage = csome_list_var_$3.first();
                                            while (question.NIL == enoughP && question.NIL != csome_list_var_$3) {
                                                if (question.NIL == set.set_memberP(methods.funcall_instance_method_with_0_args(passage, (SubLObject)question.$sym97$GET_CONTENT), texts)) {
                                                    set.set_add(methods.funcall_instance_method_with_0_args(passage, (SubLObject)question.$sym97$GET_CONTENT), texts);
                                                    if (question.NIL == enoughP) {
                                                        SubLObject csome_list_var_$4 = methods.funcall_instance_method_with_1_args(self, (SubLObject)question.$sym98$EXTRACT, passage);
                                                        SubLObject candidate = (SubLObject)question.NIL;
                                                        candidate = csome_list_var_$4.first();
                                                        while (question.NIL == enoughP && question.NIL != csome_list_var_$4) {
                                                            candidates = (SubLObject)ConsesLow.cons(candidate, candidates);
                                                            i = Numbers.add(i, (SubLObject)question.ONE_INTEGER);
                                                            enoughP = Numbers.numG(i, max_candidates);
                                                            csome_list_var_$4 = csome_list_var_$4.rest();
                                                            candidate = csome_list_var_$4.first();
                                                        }
                                                    }
                                                }
                                                csome_list_var_$3 = csome_list_var_$3.rest();
                                                passage = csome_list_var_$3.first();
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        query = csome_list_var.first();
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (question.NIL != timed_outP) {
                    Errors.warn((SubLObject)question.$str100$Answering__a_timed_out_after__a_s, self, timeout);
                }
                if (question.NIL != candidates) {
                    Dynamic.sublisp_throw((SubLObject)question.$sym95$OUTER_CATCH_FOR_QUESTION_METHOD, list_utilities.first_n(cutoff, methods.funcall_class_method_with_1_args(candidates.first(), (SubLObject)question.$sym101$SELECT, candidates)));
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_question_max_candidates(self, max_candidates);
                    search_engine.set_information_request_timeout(self, timeout);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var2) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var2, (SubLObject)question.$sym95$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 10700L)
    public static SubLObject get_learnable_types() {
        SubLObject learnable_types = (SubLObject)question.NIL;
        SubLObject cdolist_list_var = (SubLObject)question.$list104;
        SubLObject predicate = (SubLObject)question.NIL;
        predicate = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$6 = kb_mapping.gather_predicate_extent_index(predicate, question.$const103$GuruQAMt, (SubLObject)question.UNPROVIDED);
            SubLObject assertion = (SubLObject)question.NIL;
            assertion = cdolist_list_var_$6.first();
            while (question.NIL != cdolist_list_var_$6) {
                learnable_types = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(assertion), learnable_types);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                assertion = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(learnable_types, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 11138L)
    public static SubLObject incompatible_p(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)question.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)question.$sym105$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(question.$const106$EverythingPSC, thread);
            result = ((question.NIL != fort_types_interface.collection_in_any_mtP(v_term)) ? disjoint_with.disjoint_withP(v_term, collection, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED) : isa.not_isaP(v_term, collection, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 11473L)
    public static SubLObject new_parse_vector(final SubLObject parse) {
        assert question.NIL != parse_tree.parse_tree_p(parse) : parse;
        final SubLObject vec = sparse_vector.new_sparse_vector((SubLObject)question.EQUALP, (SubLObject)question.UNPROVIDED);
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(parse, (SubLObject)question.$sym66$YIELD);
        SubLObject word = (SubLObject)question.NIL;
        word = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            if (question.NIL != content_category_p(methods.funcall_instance_method_with_0_args(word, (SubLObject)question.$sym65$GET_CATEGORY))) {
                SubLObject cdolist_list_var_$7 = string_utilities.split_string(methods.funcall_instance_method_with_0_args(word, (SubLObject)question.$sym52$GET_STRING), (SubLObject)question.UNPROVIDED);
                SubLObject string = (SubLObject)question.NIL;
                string = cdolist_list_var_$7.first();
                while (question.NIL != cdolist_list_var_$7) {
                    sparse_vector.svector_inc(vec, morphology.get_root(string, (SubLObject)question.UNPROVIDED));
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    string = cdolist_list_var_$7.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return vec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 11900L)
    public static SubLObject new_string_vector(final SubLObject string) {
        assert question.NIL != Types.stringp(string) : string;
        final SubLObject vec = sparse_vector.new_sparse_vector((SubLObject)question.EQUALP, (SubLObject)question.UNPROVIDED);
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, (SubLObject)question.UNPROVIDED)));
        SubLObject word = (SubLObject)question.NIL;
        word = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            if (question.NIL != content_category_p(document.word_category(word))) {
                sparse_vector.svector_inc(vec, morphology.get_root(document.word_string(word), (SubLObject)question.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return vec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 12316L)
    public static SubLObject tree_match(final SubLObject tree1, final SubLObject tree2) {
        final SubLObject vec1 = new_parse_vector(tree1);
        final SubLObject vec2 = new_parse_vector(tree2);
        return Numbers.numG(scenario.safe_svector_cosine_angle(vec1, vec2, (SubLObject)question.UNPROVIDED), (SubLObject)question.$float108$0_8);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 12585L)
    public static SubLObject word_implies(final SubLObject word_tree1, final SubLObject word_tree2) {
        assert question.NIL != word_tree.word_tree_p(word_tree1) : word_tree1;
        assert question.NIL != word_tree.word_tree_p(word_tree2) : word_tree2;
        if (question.NIL != parse_tree.verbal_tree_p(word_tree1) && question.NIL != parse_tree.verbal_tree_p(word_tree2)) {
            final SubLObject lexes1 = methods.funcall_instance_method_with_0_args(word_tree1, (SubLObject)question.$sym59$GET_LEXES);
            final SubLObject lexes2 = methods.funcall_instance_method_with_0_args(word_tree2, (SubLObject)question.$sym59$GET_LEXES);
            SubLObject cdolist_list_var = lexes1;
            SubLObject lex1 = (SubLObject)question.NIL;
            lex1 = cdolist_list_var.first();
            while (question.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$8 = lexes2;
                SubLObject lex2 = (SubLObject)question.NIL;
                lex2 = cdolist_list_var_$8.first();
                while (question.NIL != cdolist_list_var_$8) {
                    if (question.NIL != at_utilities.more_specific_p(methods.funcall_instance_method_with_1_args(lex1, (SubLObject)question.$sym57$GET, (SubLObject)question.$kw58$DENOT), methods.funcall_instance_method_with_1_args(lex2, (SubLObject)question.$sym57$GET, (SubLObject)question.$kw58$DENOT), (SubLObject)question.UNPROVIDED)) {
                        return (SubLObject)question.T;
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    lex2 = cdolist_list_var_$8.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                lex1 = cdolist_list_var.first();
            }
        }
        return Equality.equalp(morphology.find_stem(conses_high.last(string_utilities.split_string(methods.funcall_instance_method_with_0_args(word_tree1, (SubLObject)question.$sym52$GET_STRING), (SubLObject)question.UNPROVIDED), (SubLObject)question.UNPROVIDED).first(), (SubLObject)question.UNPROVIDED), morphology.find_stem(conses_high.last(string_utilities.split_string(methods.funcall_instance_method_with_0_args(word_tree2, (SubLObject)question.$sym52$GET_STRING), (SubLObject)question.UNPROVIDED), (SubLObject)question.UNPROVIDED).first(), (SubLObject)question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 13271L)
    public static SubLObject position_mean(final SubLObject yield, final SubLObject keywords) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject positions = (SubLObject)question.NIL;
        SubLObject position = (SubLObject)question.ZERO_INTEGER;
        SubLObject found = (SubLObject)question.NIL;
        SubLObject cdolist_list_var = yield;
        SubLObject word = (SubLObject)question.NIL;
        word = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            position = Numbers.add(position, (SubLObject)question.ONE_INTEGER);
            SubLObject cdolist_list_var_$9 = keywords;
            SubLObject keyword = (SubLObject)question.NIL;
            keyword = cdolist_list_var_$9.first();
            while (question.NIL != cdolist_list_var_$9) {
                if (question.NIL != word_implies(word, keyword)) {
                    positions = (SubLObject)ConsesLow.cons(position, positions);
                    final SubLObject item_var = methods.funcall_instance_method_with_0_args(keyword, (SubLObject)question.$sym52$GET_STRING);
                    if (question.NIL == conses_high.member(item_var, found, (SubLObject)question.EQUAL, Symbols.symbol_function((SubLObject)question.IDENTITY))) {
                        found = (SubLObject)ConsesLow.cons(item_var, found);
                    }
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                keyword = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        if (question.NIL != positions) {
            thread.resetMultipleValues();
            final SubLObject deviation = number_utilities.standard_deviation_from_population(positions);
            final SubLObject mean = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Values.values(deviation, mean, Sequences.length(found));
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 13849L)
    public static SubLObject split_yield(final SubLObject yield, final SubLObject keywords) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject deviation = position_mean(yield, keywords);
        final SubLObject mean = thread.secondMultipleValue();
        final SubLObject found = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rounded_mean = (SubLObject)(mean.isNumber() ? Numbers.round(mean, (SubLObject)question.UNPROVIDED) : question.NIL);
        if (question.NIL != rounded_mean) {
            return Values.values(Sequences.nreverse(list_utilities.first_n(rounded_mean, yield)), conses_high.nthcdr(rounded_mean, yield), deviation, found);
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 14413L)
    public static SubLObject build_cyc_to_resporator_map() {
        final SubLObject map = Hashtables.make_hash_table((SubLObject)question.$int49$100, Symbols.symbol_function((SubLObject)question.EQ), (SubLObject)question.UNPROVIDED);
        SubLObject cdolist_list_var = (SubLObject)question.$list104;
        SubLObject predicate = (SubLObject)question.NIL;
        predicate = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = kb_mapping.gather_predicate_extent_index(predicate, question.$const103$GuruQAMt, (SubLObject)question.UNPROVIDED);
            SubLObject assertion = (SubLObject)question.NIL;
            assertion = cdolist_list_var_$10.first();
            while (question.NIL != cdolist_list_var_$10) {
                Hashtables.sethash(assertions_high.gaf_arg2(assertion), map, Packages.intern(string_utilities.strip_final(assertions_high.gaf_arg1(assertion), (SubLObject)question.UNPROVIDED), (SubLObject)question.UNPROVIDED));
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                assertion = cdolist_list_var_$10.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 14868L)
    public static SubLObject cyc_to_resporator(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!question.$cyc_to_resporator_map$.getDynamicValue(thread).isHashtable()) {
            question.$cyc_to_resporator_map$.setDynamicValue(build_cyc_to_resporator_map(), thread);
        }
        return Hashtables.gethash(constant, question.$cyc_to_resporator_map$.getDynamicValue(thread), (SubLObject)question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 15211L)
    public static SubLObject sentencify(final SubLObject string) {
        assert question.NIL != Types.stringp(string) : string;
        final SubLObject tokens = nl_trie.nl_trie_string_tokenize(separate_punctuation(string));
        final SubLObject length = Sequences.length(tokens);
        final SubLObject sentence = document.new_sentence((SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
        final SubLObject words = Vectors.make_vector(length, (SubLObject)question.UNPROVIDED);
        SubLObject i = (SubLObject)question.ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)question.NIL;
        token = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            Vectors.set_aref(words, i, document.new_word((SubLObject)ConsesLow.list((SubLObject)question.$kw110$STRING, token)));
            i = Numbers.add(i, (SubLObject)question.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        document._csetf_sign_constituents(sentence, words);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 15743L)
    public static SubLObject separate_punctuation(SubLObject string) {
        string = string_utilities.string_substitute((SubLObject)question.$str111$__, (SubLObject)question.$str112$_, string, (SubLObject)question.UNPROVIDED);
        string = string_utilities.string_substitute((SubLObject)question.$str113$__, (SubLObject)question.$str114$_, string, (SubLObject)question.UNPROVIDED);
        string = string_utilities.string_substitute((SubLObject)question.$str115$__, (SubLObject)question.$str116$_, string, (SubLObject)question.UNPROVIDED);
        string = string_utilities.string_substitute((SubLObject)question.$str117$__, (SubLObject)question.$str118$_, string, (SubLObject)question.UNPROVIDED);
        string = string_utilities.string_substitute((SubLObject)question.$str119$__, (SubLObject)question.$str120$_, string, (SubLObject)question.UNPROVIDED);
        if (question.NIL != string_utilities.ends_with(string, (SubLObject)question.$str121$_, (SubLObject)question.UNPROVIDED)) {
            Vectors.set_aref(string, number_utilities.f_1_(Sequences.length(string)), (SubLObject)Characters.CHAR_space);
            string = Sequences.cconcatenate(string, (SubLObject)question.$str121$_);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 16200L)
    public static SubLObject word_alternations(final SubLObject word, final SubLObject pos, final SubLObject lexicon) {
        final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)question.$sym57$GET, word);
        SubLObject variants = (SubLObject)question.NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = (SubLObject)question.NIL;
        lex = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_1_args(lex, (SubLObject)question.$sym57$GET, (SubLObject)question.$kw122$CYC_POS).eql(pos)) {
                SubLObject cdolist_list_var_$11 = lexicon_accessors.get_strings_of_type(methods.funcall_instance_method_with_1_args(lex, (SubLObject)question.$sym57$GET, (SubLObject)question.$kw123$WORD_UNIT), methods.funcall_instance_method_with_1_args(lex, (SubLObject)question.$sym57$GET, (SubLObject)question.$kw122$CYC_POS), (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
                SubLObject variant = (SubLObject)question.NIL;
                variant = cdolist_list_var_$11.first();
                while (question.NIL != cdolist_list_var_$11) {
                    final SubLObject item_var = variant;
                    if (question.NIL == conses_high.member(item_var, variants, (SubLObject)question.EQUAL, Symbols.symbol_function((SubLObject)question.IDENTITY))) {
                        variants = (SubLObject)ConsesLow.cons(item_var, variants);
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    variant = cdolist_list_var_$11.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        if (question.NIL == variants) {
            variants = (SubLObject)ConsesLow.cons(word, variants);
        }
        return variants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 16625L)
    public static SubLObject content_category_p(final SubLObject category) {
        return conses_high.member(category, (SubLObject)question.$list124, (SubLObject)question.EQ, (SubLObject)question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 16782L)
    public static SubLObject test_questions(SubLObject file, SubLObject question_type) {
        if (file == question.UNPROVIDED) {
            file = (SubLObject)question.$str125$_cyc_quirk_trec_questions_trec_qu;
        }
        if (question_type == question.UNPROVIDED) {
            question_type = (SubLObject)question.$sym126$QUESTION_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert question.NIL != Types.stringp(file) : file;
        SubLObject i = (SubLObject)question.ZERO_INTEGER;
        SubLObject tokens = (SubLObject)question.NIL;
        SubLObject v_question = (SubLObject)question.NIL;
        SubLObject stream = (SubLObject)question.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)question.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)question.$kw127$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)question.$str128$Unable_to_open__S, file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = (SubLObject)question.NIL, line = file_utilities.cdolines_get_next_line(infile); question.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    if (question.NIL == string_utilities.starts_with(line, (SubLObject)question.$str129$_)) {
                        i = Numbers.add(i, (SubLObject)question.ONE_INTEGER);
                        tokens = string_utilities.split_string(line, (SubLObject)question.$list130);
                        v_question = new_question(tokens.first(), string_utilities.split_string(conses_high.second(tokens), (SubLObject)question.$list131), (SubLObject)question.UNPROVIDED);
                        if (question.NIL != v_question && question.NIL != Functions.funcall(question_type, v_question)) {
                            print_high.princ(i, (SubLObject)question.UNPROVIDED);
                            print_high.princ((SubLObject)question.$str132$__, (SubLObject)question.UNPROVIDED);
                            print_high.princ(v_question, (SubLObject)question.UNPROVIDED);
                            streams_high.terpri((SubLObject)question.UNPROVIDED);
                            print_high.princ(methods.funcall_instance_method_with_0_args(v_question, (SubLObject)question.$sym93$ANSWER), (SubLObject)question.UNPROVIDED);
                            streams_high.terpri((SubLObject)question.UNPROVIDED);
                            streams_high.terpri((SubLObject)question.UNPROVIDED);
                        }
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)question.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)question.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/question.lisp", position = 17457L)
    public static SubLObject test_scenario_questions(final SubLObject question_triples) {
        assert question.NIL != Types.listp(question_triples) : question_triples;
        SubLObject v_question = (SubLObject)question.NIL;
        SubLObject cdolist_list_var = question_triples;
        SubLObject question_triple = (SubLObject)question.NIL;
        question_triple = cdolist_list_var.first();
        while (question.NIL != cdolist_list_var) {
            v_question = new_question(conses_high.third(question_triple), (SubLObject)question.UNPROVIDED, (SubLObject)question.UNPROVIDED);
            if (question.NIL != question_p(v_question)) {
                print_high.princ(question_triple.first(), (SubLObject)question.UNPROVIDED);
                print_high.princ((SubLObject)question.$str132$__, (SubLObject)question.UNPROVIDED);
                print_high.princ(v_question, (SubLObject)question.UNPROVIDED);
                streams_high.terpri((SubLObject)question.UNPROVIDED);
                print_high.princ(methods.funcall_instance_method_with_0_args(v_question, (SubLObject)question.$sym93$ANSWER), (SubLObject)question.UNPROVIDED);
                streams_high.terpri((SubLObject)question.UNPROVIDED);
                streams_high.terpri((SubLObject)question.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            question_triple = cdolist_list_var.first();
        }
        return (SubLObject)question.NIL;
    }
    
    public static SubLObject declare_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "initialize_question", "INITIALIZE-QUESTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_corpora", "GET-QUESTION-CORPORA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_corpora", "SET-QUESTION-CORPORA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_answer_types", "GET-QUESTION-ANSWER-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_answer_types", "SET-QUESTION-ANSWER-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_parse", "GET-QUESTION-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_parse", "SET-QUESTION-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_string", "GET-QUESTION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_string", "SET-QUESTION-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_learnable_types", "GET-QUESTION-LEARNABLE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_learnable_types", "SET-QUESTION-LEARNABLE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_max_confidence", "GET-QUESTION-MAX-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_max_confidence", "SET-QUESTION-MAX-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_max_candidates", "GET-QUESTION-MAX-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_max_candidates", "SET-QUESTION-MAX-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_chunker", "GET-QUESTION-CHUNKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_chunker", "SET-QUESTION-CHUNKER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_tagger", "GET-QUESTION-TAGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_tagger", "SET-QUESTION-TAGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_parser", "GET-QUESTION-PARSER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_parser", "SET-QUESTION-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_question_lexicon", "GET-QUESTION-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "set_question_lexicon", "SET-QUESTION-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "subloop_reserved_initialize_question_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "subloop_reserved_initialize_question_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_p", "QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_classify_method", "QUESTION-CLASSIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_isaP_method", "QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_initialize_method", "QUESTION-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_augment_terms_method", "QUESTION-AUGMENT-TERMS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_require_percentage_method", "QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "np_term_match", "NP-TERM-MATCH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_tree_type_match_method", "QUESTION-TREE-TYPE-MATCH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_answer_types_method", "QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_get_keywords_method", "QUESTION-GET-KEYWORDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_get_keystrings_method", "QUESTION-GET-KEYSTRINGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_candidate_answer_p_method", "QUESTION-CANDIDATE-ANSWER-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "new_question", "NEW-QUESTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_print_method", "QUESTION-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_get_string_method", "QUESTION-GET-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "question_answer_method", "QUESTION-ANSWER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "get_learnable_types", "GET-LEARNABLE-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "incompatible_p", "INCOMPATIBLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "new_parse_vector", "NEW-PARSE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "new_string_vector", "NEW-STRING-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "tree_match", "TREE-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "word_implies", "WORD-IMPLIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "position_mean", "POSITION-MEAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "split_yield", "SPLIT-YIELD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "build_cyc_to_resporator_map", "BUILD-CYC-TO-RESPORATOR-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "cyc_to_resporator", "CYC-TO-RESPORATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "sentencify", "SENTENCIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "separate_punctuation", "SEPARATE-PUNCTUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "word_alternations", "WORD-ALTERNATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "content_category_p", "CONTENT-CATEGORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "test_questions", "TEST-QUESTIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.question", "test_scenario_questions", "TEST-SCENARIO-QUESTIONS", 1, 0, false);
        return (SubLObject)question.NIL;
    }
    
    public static SubLObject init_question_file() {
        question.$question_parser$ = SubLFiles.defvar("*QUESTION-PARSER*", (SubLObject)question.NIL);
        question.$question_lexicon$ = SubLFiles.defvar("*QUESTION-LEXICON*", (SubLObject)question.NIL);
        question.$sksi_registered$ = SubLFiles.defvar("*SKSI-REGISTERED*", (SubLObject)question.NIL);
        question.$cyc_to_resporator_map$ = SubLFiles.defvar("*CYC-TO-RESPORATOR-MAP*", (SubLObject)question.NIL);
        return (SubLObject)question.NIL;
    }
    
    public static SubLObject setup_question_file() {
        classes.subloop_new_class((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym5$INFORMATION_REQUEST, (SubLObject)question.NIL, (SubLObject)question.NIL, (SubLObject)question.$list6);
        classes.class_set_implements_slot_listeners((SubLObject)question.$sym4$QUESTION, (SubLObject)question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym20$SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym25$SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE);
        subloop_reserved_initialize_question_class((SubLObject)question.$sym4$QUESTION);
        methods.methods_incorporate_class_method((SubLObject)question.$sym26$CLASSIFY, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.$list28, (SubLObject)question.$list29);
        methods.subloop_register_class_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym26$CLASSIFY, (SubLObject)question.$sym32$QUESTION_CLASSIFY_METHOD);
        methods.methods_incorporate_class_method((SubLObject)question.$sym30$ISA_, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.$list28, (SubLObject)question.$list33);
        methods.subloop_register_class_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym30$ISA_, (SubLObject)question.$sym34$QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym35$INITIALIZE, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.NIL, (SubLObject)question.$list36);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym35$INITIALIZE, (SubLObject)question.$sym38$QUESTION_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method((SubLObject)question.$sym39$AUGMENT_TERMS, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.$list40, (SubLObject)question.$list41);
        methods.subloop_register_class_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym39$AUGMENT_TERMS, (SubLObject)question.$sym46$QUESTION_AUGMENT_TERMS_METHOD);
        methods.methods_incorporate_class_method((SubLObject)question.$sym47$REQUIRE_PERCENTAGE, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.NIL, (SubLObject)question.$list48);
        methods.subloop_register_class_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym47$REQUIRE_PERCENTAGE, (SubLObject)question.$sym50$QUESTION_REQUIRE_PERCENTAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym53$TREE_TYPE_MATCH, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.$list28, (SubLObject)question.$list54);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym53$TREE_TYPE_MATCH, (SubLObject)question.$sym60$QUESTION_TREE_TYPE_MATCH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym8$ANSWER_TYPES, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.NIL, (SubLObject)question.$list61);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym8$ANSWER_TYPES, (SubLObject)question.$sym62$QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym56$GET_KEYWORDS, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.NIL, (SubLObject)question.$list63);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym56$GET_KEYWORDS, (SubLObject)question.$sym67$QUESTION_GET_KEYWORDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym68$GET_KEYSTRINGS, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.NIL, (SubLObject)question.$list69);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym68$GET_KEYSTRINGS, (SubLObject)question.$sym71$QUESTION_GET_KEYSTRINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym72$CANDIDATE_ANSWER_P, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.$list28, (SubLObject)question.$list73);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym72$CANDIDATE_ANSWER_P, (SubLObject)question.$sym75$QUESTION_CANDIDATE_ANSWER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym81$PRINT, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list27, (SubLObject)question.$list82, (SubLObject)question.$list83);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym81$PRINT, (SubLObject)question.$sym88$QUESTION_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym52$GET_STRING, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list89, (SubLObject)question.NIL, (SubLObject)question.$list90);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym52$GET_STRING, (SubLObject)question.$sym92$QUESTION_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)question.$sym93$ANSWER, (SubLObject)question.$sym4$QUESTION, (SubLObject)question.$list89, (SubLObject)question.NIL, (SubLObject)question.$list94);
        methods.subloop_register_instance_method((SubLObject)question.$sym4$QUESTION, (SubLObject)question.$sym93$ANSWER, (SubLObject)question.$sym102$QUESTION_ANSWER_METHOD);
        return (SubLObject)question.NIL;
    }
    
    public void declareFunctions() {
        declare_question_file();
    }
    
    public void initializeVariables() {
        init_question_file();
    }
    
    public void runTopLevelForms() {
        setup_question_file();
    }
    
    static {
        me = (SubLFile)new question();
        question.$question_parser$ = null;
        question.$question_lexicon$ = null;
        question.$sksi_registered$ = null;
        question.$cyc_to_resporator_map$ = null;
        $kw0$WARN = SubLObjectFactory.makeKeyword("WARN");
        $int1$30 = SubLObjectFactory.makeInteger(30);
        $sym2$TERM_LEXICON = SubLObjectFactory.makeSymbol("TERM-LEXICON");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Usgs-KS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NGA-KS")));
        $sym4$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym5$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $list6 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHUNKER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-CANDIDATES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)question.TWENTY_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)question.TEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNABLE-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPORA"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASSIFY"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORDS"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYSTRINGS"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY"), (SubLObject)question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym7$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym8$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym9$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym10$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym11$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $sym12$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym13$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym14$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym15$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym16$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym17$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym18$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym19$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym20$SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS");
        $sym21$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym22$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym23$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym24$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE");
        $sym26$CLASSIFY = SubLObjectFactory.makeSymbol("CLASSIFY");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE parse-tree-p; the parse tree to be classified\n   @return symbolp, the question class of PARSE, or nil if there is none\n   This happens by iterating over all subclasses of questions (via \n   introspection) and calling the 'isa' predicate with TREE as its argument.\n   If TREE does qualify as a question tree of a subclass, 'isa?' will return \n   t and that class will be added to the list of questions that TREE qualifies\n   as"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-STACK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QCLASSES"), (SubLObject)question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-PUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-STACK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-STACK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QCLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-POP"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-STACK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("QCLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?")), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("QCLASS"), (SubLObject)SubLObjectFactory.makeSymbol("QCLASSES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHILD-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("QCLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CHILD-CLASSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-PUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CHILD-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-STACK"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QCLASSES"))));
        $sym30$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $sym31$CHILD_CLASSES = SubLObjectFactory.makeSymbol("CHILD-CLASSES");
        $sym32$QUESTION_CLASSIFY_METHOD = SubLObjectFactory.makeSymbol("QUESTION-CLASSIFY-METHOD");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE parse-tree-p; the tree for which we need to decide whether it can \n   be this kind of question\n   @return boolean; t if TREE is this kind of question, nil otherwise\n   @note each subclass of question needs to implement this method to recognize a \n   parse tree as a particular kind of question, otherwise, it'll default to nil"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"))));
        $sym34$QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("QUESTION-ISA?-METHOD");
        $sym35$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Initializes all class slots in question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STANFORD-PARSER"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeInteger(30)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TAGGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CHUNKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CHUNKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SHALLOW-PARSER"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)question.TEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNABLE-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNABLE-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LEARNABLE-TYPES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym37$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $sym38$QUESTION_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("QUESTION-INITIALIZE-METHOD");
        $sym39$AUGMENT_TERMS = SubLObjectFactory.makeSymbol("AUGMENT-TERMS");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TERMS listp; a list of strings to topically augment with related terms\n   @return listp; a list of terms topically related to TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-GRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-GRAPH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORD-GRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("index"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORD-GRAPH-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Could not get augmentation terms for ~S"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-GRAPH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-GRAPH-FROM-STRING-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-GRAPH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PATH-LABELS")), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"))))));
        $sym42$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str43$index = SubLObjectFactory.makeString("index");
        $str44$Could_not_get_augmentation_terms_ = SubLObjectFactory.makeString("Could not get augmentation terms for ~S");
        $sym45$GET_PATH_LABELS = SubLObjectFactory.makeSymbol("GET-PATH-LABELS");
        $sym46$QUESTION_AUGMENT_TERMS_METHOD = SubLObjectFactory.makeSymbol("QUESTION-AUGMENT-TERMS-METHOD");
        $sym47$REQUIRE_PERCENTAGE = SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeInteger(100)));
        $int49$100 = SubLObjectFactory.makeInteger(100);
        $sym50$QUESTION_REQUIRE_PERCENTAGE_METHOD = SubLObjectFactory.makeSymbol("QUESTION-REQUIRE-PERCENTAGE-METHOD");
        $sym51$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym52$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym53$TREE_TYPE_MATCH = SubLObjectFactory.makeSymbol("TREE-TYPE-MATCH");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE parse-tree-p; a possible answer for this question\n   @return numberp; a score for how well TREE matches the answer types this question requires"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("INCOMPATIBLE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)question.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-PATH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INCOMPATIBLE?"), (SubLObject)question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("INCOMPATIBLE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)question.TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INCOMPATIBLE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCOMPATIBLE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("I"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)question.ZERO_INTEGER));
        $sym55$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $sym56$GET_KEYWORDS = SubLObjectFactory.makeSymbol("GET-KEYWORDS");
        $sym57$GET = SubLObjectFactory.makeSymbol("GET");
        $kw58$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym59$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $sym60$QUESTION_TREE_TYPE_MATCH_METHOD = SubLObjectFactory.makeSymbol("QUESTION-TREE-TYPE-MATCH-METHOD");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)question.NIL));
        $sym62$QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("QUESTION-ANSWER-TYPES-METHOD");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the non-functional or content strings of this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-CATEGORY-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"))));
        $sym64$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $sym65$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $sym66$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym67$QUESTION_GET_KEYWORDS_METHOD = SubLObjectFactory.makeSymbol("QUESTION-GET-KEYWORDS-METHOD");
        $sym68$GET_KEYSTRINGS = SubLObjectFactory.makeSymbol("GET-KEYSTRINGS");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the non-functional or content strings of this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-GET-STRING-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym70$WORD_TREE_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-STRING-METHOD");
        $sym71$QUESTION_GET_KEYSTRINGS_METHOD = SubLObjectFactory.makeSymbol("QUESTION-GET-KEYSTRINGS-METHOD");
        $sym72$CANDIDATE_ANSWER_P = SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolanp; t if TREE is considered to be a candidate answer to this question\n   on semantic grounds, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-TYPE-MATCH")), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeDouble(0.3))));
        $float74$0_3 = (SubLFloat)SubLObjectFactory.makeDouble(0.3);
        $sym75$QUESTION_CANDIDATE_ANSWER_P_METHOD = SubLObjectFactory.makeSymbol("QUESTION-CANDIDATE-ANSWER-P-METHOD");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AQUAINT"));
        $sym77$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym78$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym79$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym80$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym81$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints QUESTION to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym84$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $str85$__ = SubLObjectFactory.makeString("#<");
        $str86$__ = SubLObjectFactory.makeString(": ");
        $str87$_ = SubLObjectFactory.makeString(">");
        $sym88$QUESTION_PRINT_METHOD = SubLObjectFactory.makeSymbol("QUESTION-PRINT-METHOD");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the surface string of QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $sym91$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $sym92$QUESTION_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("QUESTION-GET-STRING-METHOD");
        $sym93$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)question.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENOUGH?"), (SubLObject)question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY")))), (SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"))), (SubLObject)SubLObjectFactory.makeSymbol("ENOUGH?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))), (SubLObject)SubLObjectFactory.makeSymbol("ENOUGH?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), (SubLObject)SubLObjectFactory.makeSymbol("TEXTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), (SubLObject)SubLObjectFactory.makeSymbol("TEXTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("ENOUGH?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ENOUGH?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-CANDIDATES")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Answering ~a timed out after ~a seconds~%"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-N"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT")), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")))))));
        $sym95$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $sym96$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $sym97$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym98$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $sym99$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $str100$Answering__a_timed_out_after__a_s = SubLObjectFactory.makeString("Answering ~a timed out after ~a seconds~%");
        $sym101$SELECT = SubLObjectFactory.makeSymbol("SELECT");
        $sym102$QUESTION_ANSWER_METHOD = SubLObjectFactory.makeSymbol("QUESTION-ANSWER-METHOD");
        $const103$GuruQAMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GuruQAMt"));
        $list104 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("guruqaGenlsToken")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("guruqaTypeToken")));
        $sym105$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const106$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym107$PARSE_TREE_P = SubLObjectFactory.makeSymbol("PARSE-TREE-P");
        $float108$0_8 = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $sym109$WORD_TREE_P = SubLObjectFactory.makeSymbol("WORD-TREE-P");
        $kw110$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str111$__ = SubLObjectFactory.makeString(" ,");
        $str112$_ = SubLObjectFactory.makeString(",");
        $str113$__ = SubLObjectFactory.makeString(" ;");
        $str114$_ = SubLObjectFactory.makeString(";");
        $str115$__ = SubLObjectFactory.makeString(" :");
        $str116$_ = SubLObjectFactory.makeString(":");
        $str117$__ = SubLObjectFactory.makeString("( ");
        $str118$_ = SubLObjectFactory.makeString("(");
        $str119$__ = SubLObjectFactory.makeString(" )");
        $str120$_ = SubLObjectFactory.makeString(")");
        $str121$_ = SubLObjectFactory.makeString(".");
        $kw122$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $kw123$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $list124 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NNP"), SubLObjectFactory.makeKeyword("NP"), SubLObjectFactory.makeKeyword("NNPS"), SubLObjectFactory.makeKeyword("NN"), SubLObjectFactory.makeKeyword("NNS"), SubLObjectFactory.makeKeyword("JJ"), SubLObjectFactory.makeKeyword("VBP"), SubLObjectFactory.makeKeyword("VB"), SubLObjectFactory.makeKeyword("VBD"), SubLObjectFactory.makeKeyword("VBG"), SubLObjectFactory.makeKeyword("VBN"), SubLObjectFactory.makeKeyword("VBZ"), SubLObjectFactory.makeKeyword("CD") });
        $str125$_cyc_quirk_trec_questions_trec_qu = SubLObjectFactory.makeString("/cyc/quirk/trec-questions/trec-questions.txt");
        $sym126$QUESTION_P = SubLObjectFactory.makeSymbol("QUESTION-P");
        $kw127$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str128$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str129$_ = SubLObjectFactory.makeString("#");
        $list130 = ConsesLow.list((SubLObject)Characters.CHAR_tab);
        $list131 = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $str132$__ = SubLObjectFactory.makeString(". ");
    }
}

/*

	Total time: 499 ms
	
*/