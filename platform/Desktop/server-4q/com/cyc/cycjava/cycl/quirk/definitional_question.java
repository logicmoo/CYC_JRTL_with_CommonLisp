package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.cyclifier_lexicon;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.linkage;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class definitional_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.definitional_question";
    public static final String myFingerPrint = "1146b563676e0e2a772ad3674edf63ad2f8eef0db2581f063486cdcda0960639";
    private static final SubLSymbol $sym0$DEFINITIONAL_QUESTION;
    private static final SubLSymbol $sym1$WH_QUESTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$LEADING_APPOSITIVE_BLACKLIST;
    private static final SubLSymbol $sym4$THING_TEMPLATE_PARAMETERS;
    private static final SubLSymbol $sym5$ORGANIZATION_TEMPLATE_PARAMETERS;
    private static final SubLSymbol $sym6$PERSON_TEMPLATE_PARAMETERS;
    private static final SubLSymbol $sym7$GENERAL_TEMPLATE_PARAMETERS;
    private static final SubLSymbol $sym8$GLIMPSE_THING_TEMPLATES;
    private static final SubLSymbol $sym9$GLIMPSE_GENERAL_TEMPLATES;
    private static final SubLSymbol $sym10$OBJECT;
    private static final SubLSymbol $sym11$INSTANCE_COUNT;
    private static final SubLSymbol $sym12$QUESTION;
    private static final SubLSymbol $sym13$LEXICON;
    private static final SubLSymbol $sym14$PARSER;
    private static final SubLSymbol $sym15$TAGGER;
    private static final SubLSymbol $sym16$CHUNKER;
    private static final SubLSymbol $sym17$MAX_CANDIDATES;
    private static final SubLSymbol $sym18$MAX_CONFIDENCE;
    private static final SubLSymbol $sym19$LEARNABLE_TYPES;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS;
    private static final SubLSymbol $sym28$ISOLATED_P;
    private static final SubLSymbol $sym29$INSTANCE_NUMBER;
    private static final SubLSymbol $sym30$INFORMATION_REQUEST;
    private static final SubLSymbol $sym31$ERROR_HANDLING;
    private static final SubLSymbol $sym32$TIMEOUT;
    private static final SubLSymbol $sym33$STRING;
    private static final SubLSymbol $sym34$PARSE;
    private static final SubLSymbol $sym35$ANSWER_TYPES;
    private static final SubLSymbol $sym36$CORPORA;
    private static final SubLSymbol $sym37$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE;
    private static final SubLSymbol $sym38$ISA_;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$GET_DAUGHTER;
    private static final SubLSymbol $sym43$GET_SUBJECT;
    private static final SubLSymbol $sym44$GET_SEMANTIC_HEAD;
    private static final SubLSymbol $sym45$YIELD;
    private static final SubLSymbol $sym46$GET_STRING;
    private static final SubLList $list47;
    private static final SubLString $str48$the_name;
    private static final SubLString $str49$what;
    private static final SubLString $str50$who;
    private static final SubLSymbol $sym51$GET_HEAD;
    private static final SubLSymbol $sym52$GET_CATEGORY;
    private static final SubLSymbol $kw53$NNP;
    private static final SubLSymbol $sym54$GET_OBJECTS;
    private static final SubLSymbol $sym55$DEFINITIONAL_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym56$QUERIFY;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLSymbol $sym59$GET_WH_PHRASE;
    private static final SubLSymbol $sym60$TEMPLATE_PARAM_TABLE;
    private static final SubLSymbol $sym61$DEFINITIONAL_QUESTION_QUERIFY_METHOD;
    private static final SubLSymbol $sym62$ANSWER_WORDNET;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD;
    private static final SubLSymbol $kw65$ROOT;
    private static final SubLSymbol $sym66$APPEND;
    private static final SubLSymbol $sym67$GET_ROOTS;
    private static final SubLSymbol $sym68$EXTRACT;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLSymbol $sym72$ABSTRACT_PASSAGE_P;
    private static final SubLSymbol $sym73$GET_FOCUS;
    private static final SubLSymbol $sym74$GET_FOCUS_VARIANTS;
    private static final SubLSymbol $sym75$GET_CONTENT;
    private static final SubLSymbol $sym76$EXTRACT_VIA_DEEP_PARSE;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK;
    private static final SubLSymbol $sym79$DEFINITIONAL_QUESTION_EXTRACT_METHOD;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLList $list83;
    private static final SubLSymbol $kw84$DFR2L;
    private static final SubLSymbol $kw85$DFL2R;
    private static final SubLString $str86$_S_is_not_one_of__S;
    private static final SubLSymbol $sym87$DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLSymbol $sym91$DAUGHTER_COUNT;
    private static final SubLSymbol $sym92$GET_PARSE_TREE_STRING;
    private static final SubLSymbol $sym93$DEFINITIONAL_QUESTION_GET_FOCUS_METHOD;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLSymbol $kw96$NN;
    private static final SubLSymbol $kw97$NNS;
    private static final SubLSymbol $sym98$DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD;
    private static final SubLSymbol $sym101$ANSWER_CARDINALITY;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD;
    private static final SubLList $list104;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLString $str107$_FOCUS_;
    private static final SubLSymbol $sym108$DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD;
    private static final SubLSymbol $sym109$NRESTR_APPOSITIVE_DESCRIPTION;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $kw113$NP;
    private static final SubLList $list114;
    private static final SubLSymbol $kw115$PRN;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD;
    private static final SubLSymbol $sym118$EQUALITY_DESCRIPTION;
    private static final SubLList $list119;
    private static final SubLSymbol $kw120$S;
    private static final SubLSymbol $kw121$VP;
    private static final SubLSymbol $sym122$GET_DESCENDANT;
    private static final SubLList $list123;
    private static final SubLSymbol $kw124$AUX;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD;
    private static final SubLSymbol $sym127$CALLED_X_DESCRIPTION;
    private static final SubLList $list128;
    private static final SubLString $str129$called;
    private static final SubLSymbol $sym130$DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD;
    private static final SubLSymbol $sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLSymbol $kw134$_;
    private static final SubLSymbol $kw135$SBAR;
    private static final SubLList $list136;
    private static final SubLSymbol $kw137$WHNP;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD;
    private static final SubLSymbol $sym140$RESTR_APPOSITIVE_DESCRIPTION;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLList $list143;
    private static final SubLSymbol $kw144$DT;
    private static final SubLSymbol $sym145$DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD;
    private static final SubLSymbol $sym146$LINK_WORD_P;
    private static final SubLSymbol $sym147$GET_DIRECTLY_RELATED;
    private static final SubLSymbol $kw148$G_PATTERN;
    private static final SubLSymbol $kw149$LEFT;
    private static final SubLSymbol $kw150$X_I_PATTERN;
    private static final SubLSymbol $kw151$RIGHT;
    private static final SubLSymbol $sym152$STRINGP;
    private static final SubLSymbol $kw153$X_D_PATTERN;
    private static final SubLSymbol $kw154$X_C_PATTERN;
    private static final SubLSymbol $kw155$MX_PATTERN;
    private static final SubLSymbol $sym156$GET_MODIFIERS;
    private static final SubLSymbol $sym157$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw158$LEXICON;
    private static final SubLString $str159$Error_caught_in_GET_PRE_NOMINAL_D;
    private static final SubLSymbol $kw160$GN_PATTERN;
    private static final SubLSymbol $kw161$AN_PATTERN;
    private static final SubLSymbol $sym162$LINK_WORD_AFTER;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
    private static final SubLSymbol $sym165$DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD;
    private static final SubLInteger $int166$32;
    private static final SubLString $str167$_cyc_projects_aquaint_lemur_indic;
    private static final SubLString $str168$___S__;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$_;
    private static final SubLSymbol $sym171$SECOND;
    private static final SubLString $str172$_a_is__a_;
    private static final SubLSymbol $sym173$PERSON;
    private static final SubLString $str174$Who;
    private static final SubLString $str175$What;
    private static final SubLString $str176$CNSjan2004;
    private static final SubLString $str177$_________________________________;
    private static final SubLSymbol $sym178$ANSWER;
    private static final SubLString $str179$Who_is_;
    private static final SubLString $str180$_;
    private static final SubLSymbol $sym181$GET_PRE_NOMINAL_DESCRIPTION;
    private static final SubLSymbol $kw182$TEST;
    private static final SubLSymbol $sym183$PRE_NOMINAL_TEST_FUNC;
    private static final SubLSymbol $kw184$OWNER;
    private static final SubLSymbol $kw185$CLASSES;
    private static final SubLSymbol $kw186$KB;
    private static final SubLSymbol $kw187$FULL;
    private static final SubLSymbol $kw188$WORKING_;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$DEFINITIONAL_QUESTION_TEST_HELPER;
    private static final SubLSymbol $sym191$THIS_EQUAL;
    private static final SubLList $list192;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_leading_appositive_blacklist(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym3$LEADING_APPOSITIVE_BLACKLIST, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.FOURTEEN_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_leading_appositive_blacklist(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym3$LEADING_APPOSITIVE_BLACKLIST, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.FOURTEEN_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_thing_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym4$THING_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.THIRTEEN_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_thing_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym4$THING_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.THIRTEEN_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_organization_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym5$ORGANIZATION_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.TWELVE_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_organization_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym5$ORGANIZATION_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.TWELVE_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_person_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym6$PERSON_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.ELEVEN_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_person_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym6$PERSON_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.ELEVEN_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_general_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym7$GENERAL_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.TEN_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_general_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym7$GENERAL_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.TEN_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_glimpse_thing_templates(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym8$GLIMPSE_THING_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.NINE_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_glimpse_thing_templates(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym8$GLIMPSE_THING_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.NINE_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject get_definitional_question_glimpse_general_templates(final SubLObject v_definitional_question) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym9$GLIMPSE_GENERAL_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.EIGHT_INTEGER);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject set_definitional_question_glimpse_general_templates(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_definitional_question.isSymbol() ? classes.classes_retrieve_class(v_definitional_question) : ((definitional_question.NIL != subloop_structures.class_p(v_definitional_question)) ? v_definitional_question : ((definitional_question.NIL != subloop_structures.instance_p(v_definitional_question)) ? subloop_structures.instance_class(v_definitional_question) : definitional_question.NIL)));
        if (definitional_question.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)definitional_question.$sym9$GLIMPSE_GENERAL_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)definitional_question.EIGHT_INTEGER, value);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject subloop_reserved_initialize_definitional_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym10$OBJECT, (SubLObject)definitional_question.$sym11$INSTANCE_COUNT, (SubLObject)definitional_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym13$LEXICON, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym14$PARSER, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym15$TAGGER, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym16$CHUNKER, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym17$MAX_CANDIDATES, (SubLObject)definitional_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym18$MAX_CONFIDENCE, (SubLObject)definitional_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym19$LEARNABLE_TYPES, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym9$GLIMPSE_GENERAL_TEMPLATES, (SubLObject)definitional_question.$list20);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym8$GLIMPSE_THING_TEMPLATES, (SubLObject)definitional_question.$list21);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym7$GENERAL_TEMPLATE_PARAMETERS, (SubLObject)definitional_question.$list22);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym6$PERSON_TEMPLATE_PARAMETERS, (SubLObject)definitional_question.$list23);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym5$ORGANIZATION_TEMPLATE_PARAMETERS, (SubLObject)definitional_question.$list24);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym4$THING_TEMPLATE_PARAMETERS, (SubLObject)definitional_question.$list25);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym3$LEADING_APPOSITIVE_BLACKLIST, (SubLObject)definitional_question.$list26);
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject subloop_reserved_initialize_definitional_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym10$OBJECT, (SubLObject)definitional_question.$sym28$ISOLATED_P, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym10$OBJECT, (SubLObject)definitional_question.$sym29$INSTANCE_NUMBER, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym30$INFORMATION_REQUEST, (SubLObject)definitional_question.$sym31$ERROR_HANDLING, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym30$INFORMATION_REQUEST, (SubLObject)definitional_question.$sym32$TIMEOUT, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym33$STRING, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym34$PARSE, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym35$ANSWER_TYPES, (SubLObject)definitional_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)definitional_question.$sym12$QUESTION, (SubLObject)definitional_question.$sym36$CORPORA, (SubLObject)definitional_question.NIL);
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
    public static SubLObject definitional_question_p(final SubLObject v_definitional_question) {
        return classes.subloop_instanceof_class(v_definitional_question, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 3172L)
    public static SubLObject definitional_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(definitional_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER)) && definitional_question.NIL != methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym43$GET_SUBJECT) && definitional_question.NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym44$GET_SEMANTIC_HEAD)) && definitional_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym45$YIELD).first(), (SubLObject)definitional_question.$sym46$GET_STRING), (SubLObject)definitional_question.$list47, (SubLObject)definitional_question.EQUAL, (SubLObject)definitional_question.UNPROVIDED) && definitional_question.NIL == string_utilities.starts_with_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym43$GET_SUBJECT), (SubLObject)definitional_question.$sym46$GET_STRING), (SubLObject)definitional_question.$str48$the_name, (SubLObject)definitional_question.EQUALP) && ((methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym46$GET_STRING).equalp((SubLObject)definitional_question.$str49$what) && definitional_question.NIL == parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER))) || (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym46$GET_STRING).equalp((SubLObject)definitional_question.$str50$who) && definitional_question.NIL == word_tree.determiner_word_tree_p(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym43$GET_SUBJECT), (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER)) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym43$GET_SUBJECT), (SubLObject)definitional_question.$sym51$GET_HEAD), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw53$NNP || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym54$GET_OBJECTS).first(), (SubLObject)definitional_question.$sym51$GET_HEAD), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw53$NNP))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 4450L)
    public static SubLObject definitional_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject glimpse_thing_templates = get_definitional_question_glimpse_thing_templates(self);
        final SubLObject glimpse_general_templates = get_definitional_question_glimpse_general_templates(self);
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push(definitional_question.$sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject wh_word = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym59$GET_WH_PHRASE), (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym46$GET_STRING);
                final SubLObject templates = wh_word.equalp((SubLObject)definitional_question.$str49$what) ? ConsesLow.append(glimpse_general_templates, glimpse_thing_templates) : glimpse_general_templates;
                final SubLObject param_table = methods.funcall_instance_method_with_1_args(self, (SubLObject)definitional_question.$sym60$TEMPLATE_PARAM_TABLE, wh_word);
                SubLObject queries = (SubLObject)definitional_question.NIL;
                SubLObject cdolist_list_var = instantiate_templates(templates, param_table);
                SubLObject template = (SubLObject)definitional_question.NIL;
                template = cdolist_list_var.first();
                while (definitional_question.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = corpora;
                    SubLObject corpus = (SubLObject)definitional_question.NIL;
                    corpus = cdolist_list_var_$1.first();
                    while (definitional_question.NIL != cdolist_list_var_$1) {
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(template, corpus), queries);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        corpus = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    template = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)definitional_question.$sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, Sequences.nreverse(queries));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_definitional_question_glimpse_thing_templates(self, glimpse_thing_templates);
                    set_definitional_question_glimpse_general_templates(self, glimpse_general_templates);
                    question.set_question_corpora(self, corpora);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 5102L)
    public static SubLObject definitional_question_answer_wordnet_method(final SubLObject self) {
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 5190L)
    public static SubLObject get_roots(final SubLObject parse) {
        SubLObject lemmatized = (SubLObject)definitional_question.NIL;
        if (parse.first() == definitional_question.$kw65$ROOT) {
            lemmatized = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(conses_high.second(parse), conses_high.third(parse)), lemmatized);
        }
        else if (conses_high.second(parse).isList()) {
            lemmatized = Functions.apply((SubLObject)definitional_question.$sym66$APPEND, Mapping.mapcar((SubLObject)definitional_question.$sym67$GET_ROOTS, parse.rest()));
        }
        SubLObject cdolist_list_var = lemmatized;
        SubLObject mapping = (SubLObject)definitional_question.NIL;
        mapping = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            if (definitional_question.NIL != Strings.stringE(mapping.first(), mapping.rest(), (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED)) {
                ConsesLow.rplacd(mapping, morphology.plural_noun_to_sg(mapping.rest(), (SubLObject)definitional_question.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        }
        return lemmatized;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 6844L)
    public static SubLObject definitional_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(definitional_question.$sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                assert definitional_question.NIL != search_engine.abstract_passage_p(passage) : passage;
                final SubLObject terms = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym73$GET_FOCUS), methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym74$GET_FOCUS_VARIANTS));
                final SubLObject passage_string = methods.funcall_instance_method_with_0_args(passage, (SubLObject)definitional_question.$sym75$GET_CONTENT);
                final SubLObject shallow_parses = (SubLObject)definitional_question.NIL;
                final SubLObject deep_parse = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)definitional_question.$sym34$PARSE, passage_string);
                final SubLObject answers0 = (SubLObject)definitional_question.NIL;
                SubLObject answers2 = (SubLObject)definitional_question.NIL;
                if (definitional_question.NIL == answers2) {
                    SubLObject csome_list_var;
                    SubLObject string_cmp;
                    for (csome_list_var = (SubLObject)definitional_question.$list77, string_cmp = (SubLObject)definitional_question.NIL, string_cmp = csome_list_var.first(); definitional_question.NIL == answers2 && definitional_question.NIL != csome_list_var; answers2 = methods.funcall_instance_method_with_3_args(self, (SubLObject)definitional_question.$sym76$EXTRACT_VIA_DEEP_PARSE, deep_parse, passage, string_cmp), csome_list_var = csome_list_var.rest(), string_cmp = csome_list_var.first()) {}
                }
                answers2 = ConsesLow.append(answers0, answers2);
                answers2 = conses_high.union(answers2, methods.funcall_instance_method_with_1_args(self, (SubLObject)definitional_question.$sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, passage), Symbols.symbol_function((SubLObject)definitional_question.EQUAL), (SubLObject)definitional_question.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)definitional_question.$sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, answers2);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_parser(self, v_parser);
                    question.set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 8174L)
    public static SubLObject definitional_question_extract_via_deep_parse_method(final SubLObject self, final SubLObject passage_parse, final SubLObject passage, final SubLObject string_cmp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        try {
            thread.throwStack.push(definitional_question.$sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject terms = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym73$GET_FOCUS), methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym74$GET_FOCUS_VARIANTS));
                final SubLObject extractors = (SubLObject)definitional_question.$list83;
                SubLObject foundP = (SubLObject)definitional_question.NIL;
                SubLObject answers = (SubLObject)definitional_question.NIL;
                if (definitional_question.NIL != parse_tree.parse_tree_p(passage_parse)) {
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject order_var = (SubLObject)definitional_question.$kw84$DFR2L;
                    final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)definitional_question.$kw85$DFL2R, (SubLObject)definitional_question.$kw84$DFR2L);
                    SubLObject subtree = (SubLObject)definitional_question.NIL;
                    if (definitional_question.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && definitional_question.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)definitional_question.EQ), (SubLObject)definitional_question.UNPROVIDED)) {
                        Errors.error((SubLObject)definitional_question.$str86$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                    stacks.stack_push(passage_parse, stack);
                    while (definitional_question.NIL == stacks.stack_empty_p(stack) && definitional_question.NIL == answers) {
                        subtree = stacks.stack_pop(stack);
                        if (definitional_question.NIL != parse_tree.phrase_tree_p(subtree)) {
                            foundP = (SubLObject)definitional_question.NIL;
                            if (definitional_question.NIL == foundP) {
                                SubLObject csome_list_var = extractors;
                                SubLObject extractor = (SubLObject)definitional_question.NIL;
                                extractor = csome_list_var.first();
                                while (definitional_question.NIL == foundP && definitional_question.NIL != csome_list_var) {
                                    if (definitional_question.NIL == foundP) {
                                        SubLObject csome_list_var_$2 = terms;
                                        SubLObject v_term = (SubLObject)definitional_question.NIL;
                                        v_term = csome_list_var_$2.first();
                                        while (definitional_question.NIL == foundP && definitional_question.NIL != csome_list_var_$2) {
                                            if (definitional_question.NIL != v_term) {
                                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_3_args(self, extractor, v_term, subtree, string_cmp);
                                                SubLObject description = (SubLObject)definitional_question.NIL;
                                                description = cdolist_list_var.first();
                                                while (definitional_question.NIL != cdolist_list_var) {
                                                    answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(description, (SubLObject)definitional_question.$sym46$GET_STRING), passage, max_confidence, description), answers);
                                                    foundP = (SubLObject)definitional_question.T;
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    description = cdolist_list_var.first();
                                                }
                                            }
                                            csome_list_var_$2 = csome_list_var_$2.rest();
                                            v_term = csome_list_var_$2.first();
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    extractor = csome_list_var.first();
                                }
                            }
                        }
                        if (definitional_question.NIL != parse_tree.phrase_tree_p(subtree)) {
                            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(subtree);
                            final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)definitional_question.$kw85$DFL2R);
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject daughter;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)definitional_question.NIL, v_iteration = (SubLObject)definitional_question.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)definitional_question.ONE_INTEGER)) {
                                element_num = ((definitional_question.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)definitional_question.ONE_INTEGER) : v_iteration);
                                daughter = Vectors.aref(vector_var, element_num);
                                stacks.stack_push(daughter, stack);
                            }
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)definitional_question.$sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 9106L)
    public static SubLObject definitional_question_get_focus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(definitional_question.$sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                SubLObject focus_tree = (SubLObject)((definitional_question.NIL != parse_tree.frag_tree_p(parse)) ? definitional_question.NIL : methods.funcall_instance_method_with_0_args(parse, (SubLObject)definitional_question.$sym43$GET_SUBJECT));
                if (definitional_question.NIL != parse_tree.whnp_tree_p(focus_tree) && methods.funcall_instance_method_with_0_args(focus_tree, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numE((SubLObject)definitional_question.ONE_INTEGER) && definitional_question.NIL != methods.funcall_instance_method_with_0_args(parse, (SubLObject)definitional_question.$sym54$GET_OBJECTS)) {
                    focus_tree = methods.funcall_instance_method_with_0_args(parse, (SubLObject)definitional_question.$sym54$GET_OBJECTS).first();
                }
                if (definitional_question.NIL != focus_tree) {
                    if (definitional_question.NIL != word_tree.determiner_word_tree_p(methods.funcall_instance_method_with_1_args(focus_tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER))) {
                        Dynamic.sublisp_throw((SubLObject)definitional_question.$sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, string_utilities.bunge(Mapping.mapcar((SubLObject)definitional_question.$sym92$GET_PARSE_TREE_STRING, methods.funcall_instance_method_with_0_args(focus_tree, (SubLObject)definitional_question.$sym45$YIELD).rest()), (SubLObject)definitional_question.UNPROVIDED));
                    }
                    else {
                        Dynamic.sublisp_throw((SubLObject)definitional_question.$sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, methods.funcall_instance_method_with_0_args(focus_tree, (SubLObject)definitional_question.$sym46$GET_STRING));
                    }
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)definitional_question.$sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, (SubLObject)definitional_question.NIL);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 9828L)
    public static SubLObject definitional_question_get_focus_variants_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(definitional_question.$sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject focus_tree = (SubLObject)((definitional_question.NIL != parse_tree.frag_tree_p(parse)) ? definitional_question.NIL : methods.funcall_instance_method_with_0_args(parse, (SubLObject)definitional_question.$sym43$GET_SUBJECT));
                final SubLObject focus_head = (SubLObject)((definitional_question.NIL != focus_tree) ? methods.funcall_instance_method_with_0_args(focus_tree, (SubLObject)definitional_question.$sym51$GET_HEAD) : definitional_question.NIL);
                final SubLObject focus_pos = (SubLObject)((definitional_question.NIL != focus_head) ? methods.funcall_instance_method_with_0_args(focus_head, (SubLObject)definitional_question.$sym52$GET_CATEGORY) : definitional_question.NIL);
                SubLObject variants = (SubLObject)definitional_question.NIL;
                final SubLObject pcase_var = focus_pos;
                if (pcase_var.eql((SubLObject)definitional_question.$kw96$NN)) {
                    variants = (SubLObject)ConsesLow.cons(morphology.pluralize_string(definitional_question_get_focus_method(self), (SubLObject)definitional_question.UNPROVIDED), variants);
                }
                else if (pcase_var.eql((SubLObject)definitional_question.$kw97$NNS)) {
                    variants = (SubLObject)ConsesLow.cons(morphology.plural_noun_to_sg(definitional_question_get_focus_method(self), (SubLObject)definitional_question.UNPROVIDED), variants);
                }
                Dynamic.sublisp_throw((SubLObject)definitional_question.$sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, variants);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 10384L)
    public static SubLObject definitional_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)definitional_question.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 10627L)
    public static SubLObject definitional_question_answer_cardinality_method(final SubLObject self) {
        return (SubLObject)definitional_question.TEN_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 10799L)
    public static SubLObject definitional_question_template_param_table_method(final SubLObject self, final SubLObject wh_word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject thing_template_parameters = get_definitional_question_thing_template_parameters(self);
        final SubLObject person_template_parameters = get_definitional_question_person_template_parameters(self);
        final SubLObject general_template_parameters = get_definitional_question_general_template_parameters(self);
        try {
            thread.throwStack.push(definitional_question.$sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                SubLObject res = (SubLObject)definitional_question.NIL;
                if (wh_word.equalp((SubLObject)definitional_question.$str50$who)) {
                    res = ConsesLow.append(general_template_parameters, person_template_parameters);
                }
                else if (wh_word.equalp((SubLObject)definitional_question.$str49$what)) {
                    res = ConsesLow.append(general_template_parameters, thing_template_parameters);
                }
                Dynamic.sublisp_throw((SubLObject)definitional_question.$sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, conses_high.acons((SubLObject)definitional_question.$str107$_FOCUS_, (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym73$GET_FOCUS), methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym74$GET_FOCUS_VARIANTS)), res));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_definitional_question_thing_template_parameters(self, thing_template_parameters);
                    set_definitional_question_person_template_parameters(self, person_template_parameters);
                    set_definitional_question_general_template_parameters(self, general_template_parameters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 11227L)
    public static SubLObject instantiate_templates(final SubLObject templates, final SubLObject param_table) {
        SubLObject res = (SubLObject)definitional_question.NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = (SubLObject)definitional_question.NIL;
        template = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            res = ConsesLow.append(res, template_instances_for_param_table(template, param_table));
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return res;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 11450L)
    public static SubLObject template_instances_for_param_table(final SubLObject template, final SubLObject param_table) {
        if (definitional_question.NIL == param_table) {
            return (SubLObject)ConsesLow.list(template);
        }
        final SubLObject v_bindings = param_table.first();
        final SubLObject param = v_bindings.first();
        final SubLObject args = v_bindings.rest();
        return instantiate_templates(template_instances_for_param(template, param, args), param_table.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 11792L)
    public static SubLObject template_instances_for_param(final SubLObject template, final SubLObject param, final SubLObject args) {
        SubLObject res = (SubLObject)definitional_question.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)definitional_question.NIL;
        arg = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            res = (SubLObject)ConsesLow.cons(string_utilities.string_substitute(arg, param, template, (SubLObject)definitional_question.UNPROVIDED), res);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.reverse(Sequences.remove_duplicates(res, Symbols.symbol_function((SubLObject)definitional_question.EQUALP), (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 12023L)
    public static SubLObject definitional_question_nrestr_appositive_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == definitional_question.UNPROVIDED) {
            string_compare = (SubLObject)definitional_question.EQUAL;
        }
        final SubLObject num_daughters = methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT);
        if (!num_daughters.numGE((SubLObject)definitional_question.TWO_INTEGER)) {
            return (SubLObject)definitional_question.NIL;
        }
        final SubLObject first_daughter = methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER);
        final SubLObject second_daughter = methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER);
        if (methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && methods.funcall_instance_method_with_0_args(first_daughter, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP) {
            if (definitional_question.NIL != question.np_term_match(first_daughter, v_term, string_compare)) {
                if (num_daughters.numGE((SubLObject)definitional_question.THREE_INTEGER) && num_daughters.numLE((SubLObject)definitional_question.FOUR_INTEGER) && definitional_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(second_daughter, (SubLObject)definitional_question.$sym52$GET_CATEGORY), (SubLObject)definitional_question.$list114, (SubLObject)definitional_question.EQ, (SubLObject)definitional_question.UNPROVIDED)) {
                    final SubLObject potential_nrestr_appositive = methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.TWO_INTEGER);
                    if (methods.funcall_instance_method_with_0_args(potential_nrestr_appositive, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP) {
                        return (SubLObject)ConsesLow.list(potential_nrestr_appositive);
                    }
                }
                if (num_daughters.numE((SubLObject)definitional_question.TWO_INTEGER) && methods.funcall_instance_method_with_0_args(second_daughter, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw115$PRN && methods.funcall_instance_method_with_0_args(second_daughter, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numE((SubLObject)definitional_question.THREE_INTEGER) && definitional_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(second_daughter, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY), (SubLObject)definitional_question.$list116, (SubLObject)definitional_question.EQ, (SubLObject)definitional_question.UNPROVIDED)) {
                    final SubLObject potential_nrestr_appositive = methods.funcall_instance_method_with_1_args(second_daughter, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER);
                    if (methods.funcall_instance_method_with_0_args(potential_nrestr_appositive, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP) {
                        return (SubLObject)ConsesLow.list(potential_nrestr_appositive);
                    }
                }
            }
            if (num_daughters.numE((SubLObject)definitional_question.FOUR_INTEGER)) {
                final SubLObject third_daughter = methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.TWO_INTEGER);
                final SubLObject fourth_daughter = methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.THREE_INTEGER);
                if (methods.funcall_instance_method_with_0_args(third_daughter, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && definitional_question.NIL != question.np_term_match(third_daughter, v_term, string_compare) && definitional_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(fourth_daughter, (SubLObject)definitional_question.$sym52$GET_CATEGORY), (SubLObject)definitional_question.$list114, (SubLObject)definitional_question.EQ, (SubLObject)definitional_question.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(first_daughter);
                }
            }
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 14209L)
    public static SubLObject definitional_question_equality_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == definitional_question.UNPROVIDED) {
            string_compare = (SubLObject)definitional_question.EQUAL;
        }
        if (methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw120$S && methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numGE((SubLObject)definitional_question.TWO_INTEGER) && methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numLE((SubLObject)definitional_question.THREE_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && definitional_question.NIL != question.np_term_match(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), v_term, string_compare) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw121$VP && definitional_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list123) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list123), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw124$AUX && definitional_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list123), (SubLObject)definitional_question.$sym46$GET_STRING), (SubLObject)definitional_question.$list47, (SubLObject)definitional_question.EQUALP, (SubLObject)definitional_question.UNPROVIDED) && definitional_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list125) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list125), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list125));
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 15128L)
    public static SubLObject definitional_question_called_x_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == definitional_question.UNPROVIDED) {
            string_compare = (SubLObject)definitional_question.EQUAL;
        }
        if (methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && definitional_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER) && definitional_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw121$VP && definitional_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym51$GET_HEAD) && definitional_question.NIL != Functions.funcall(string_compare, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym51$GET_HEAD), (SubLObject)definitional_question.$sym46$GET_STRING), (SubLObject)definitional_question.$str129$called) && definitional_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym51$GET_HEAD), (SubLObject)definitional_question.$sym54$GET_OBJECTS) && definitional_question.NIL != Functions.funcall(string_compare, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym51$GET_HEAD), (SubLObject)definitional_question.$sym54$GET_OBJECTS).first(), (SubLObject)definitional_question.$sym46$GET_STRING), v_term)) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER));
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 15918L)
    public static SubLObject definitional_question_restr_relative_clause_description_method(final SubLObject self, final SubLObject v_term, final SubLObject passage_tree, SubLObject string_compare) {
        if (string_compare == definitional_question.UNPROVIDED) {
            string_compare = (SubLObject)definitional_question.EQUAL;
        }
        if (methods.funcall_instance_method_with_0_args(passage_tree, (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && methods.funcall_instance_method_with_0_args(passage_tree, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numGE((SubLObject)definitional_question.THREE_INTEGER) && methods.funcall_instance_method_with_0_args(passage_tree, (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numLE((SubLObject)definitional_question.FOUR_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw113$NP && definitional_question.NIL != question.np_term_match(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), v_term, string_compare) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw134$_ && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.TWO_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw135$SBAR && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.TWO_INTEGER), (SubLObject)definitional_question.$sym91$DAUGHTER_COUNT).numGE((SubLObject)definitional_question.TWO_INTEGER) && definitional_question.NIL != methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list136) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list136), (SubLObject)definitional_question.$sym52$GET_CATEGORY) == definitional_question.$kw137$WHNP && definitional_question.NIL != methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list138)) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(passage_tree, (SubLObject)definitional_question.$sym122$GET_DESCENDANT, (SubLObject)definitional_question.$list138));
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 16922L)
    public static SubLObject definitional_question_restr_appositive_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == definitional_question.UNPROVIDED) {
            string_compare = (SubLObject)definitional_question.EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject leading_appositive_blacklist = get_definitional_question_leading_appositive_blacklist(self);
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject parse = question.get_question_parse(self);
        final SubLObject string = question.get_question_string(self);
        try {
            thread.throwStack.push(definitional_question.$sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject string_$3 = methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym46$GET_STRING);
                final SubLObject string_length = Sequences.length(string_$3);
                final SubLObject term_length = Sequences.length(v_term);
                final SubLObject category = methods.funcall_instance_method_with_0_args(tree, (SubLObject)definitional_question.$sym52$GET_CATEGORY);
                SubLObject description = (SubLObject)definitional_question.NIL;
                SubLObject parse_$4 = (SubLObject)definitional_question.NIL;
                if (definitional_question.NIL != subl_promotions.memberP(category, (SubLObject)definitional_question.$list143, (SubLObject)definitional_question.EQ, (SubLObject)definitional_question.UNPROVIDED) && definitional_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)definitional_question.$sym42$GET_DAUGHTER, (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)definitional_question.$sym52$GET_CATEGORY) != definitional_question.$kw144$DT && definitional_question.NIL != question.np_term_match(tree, v_term, string_compare) && Sequences.length(string_$3).numG(Sequences.length(v_term))) {
                    description = string_utilities.substring(string_$3, (SubLObject)definitional_question.ZERO_INTEGER, Numbers.subtract(string_length, number_utilities.f_1X(term_length)));
                    parse_$4 = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)definitional_question.$sym34$PARSE, description);
                    if (definitional_question.NIL != parse_tree.phrase_tree_p(parse_$4) && definitional_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(parse_$4, (SubLObject)definitional_question.$sym52$GET_CATEGORY), (SubLObject)definitional_question.$list143, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED) && definitional_question.NIL == subl_promotions.memberP(methods.funcall_instance_method_with_0_args(parse_$4, (SubLObject)definitional_question.$sym46$GET_STRING), leading_appositive_blacklist, (SubLObject)definitional_question.EQUALP, (SubLObject)definitional_question.UNPROVIDED) && definitional_question.NIL == lexicon_utilities.first_name_p(methods.funcall_instance_method_with_0_args(parse_$4, (SubLObject)definitional_question.$sym46$GET_STRING))) {
                        Dynamic.sublisp_throw((SubLObject)definitional_question.$sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, (SubLObject)ConsesLow.list(parse_$4));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_definitional_question_leading_appositive_blacklist(self, leading_appositive_blacklist);
                    question.set_question_parser(self, v_parser);
                    question.set_question_parse(self, parse);
                    question.set_question_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 18114L)
    public static SubLObject pre_nominal_title_via_link(final SubLObject link_word) {
        assert definitional_question.NIL != linkage.link_word_p(link_word) : link_word;
        SubLObject cdolist_list_var;
        final SubLObject title_link_words = cdolist_list_var = methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw148$G_PATTERN, (SubLObject)definitional_question.$kw149$LEFT);
        SubLObject title_link_word = (SubLObject)definitional_question.NIL;
        title_link_word = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            if (definitional_question.NIL != methods.funcall_instance_method_with_2_args(title_link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw150$X_I_PATTERN, (SubLObject)definitional_question.$kw151$RIGHT)) {
                return methods.funcall_instance_method_with_0_args(title_link_word, (SubLObject)definitional_question.$sym46$GET_STRING);
            }
            cdolist_list_var = cdolist_list_var.rest();
            title_link_word = cdolist_list_var.first();
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 18809L)
    public static SubLObject np_head_modified_by_appositive(final SubLObject link_word, final SubLObject v_term) {
        assert definitional_question.NIL != linkage.link_word_p(link_word) : link_word;
        assert definitional_question.NIL != Types.stringp(v_term) : v_term;
        if (definitional_question.NIL == methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw153$X_D_PATTERN, (SubLObject)definitional_question.$kw149$LEFT) || definitional_question.NIL == methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw154$X_C_PATTERN, (SubLObject)definitional_question.$kw151$RIGHT)) {
            return (SubLObject)definitional_question.NIL;
        }
        final SubLObject head = methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw155$MX_PATTERN, (SubLObject)definitional_question.$kw149$LEFT).first();
        if (definitional_question.NIL != head) {
            final SubLObject modifiers = methods.funcall_instance_method_with_0_args(head, (SubLObject)definitional_question.$sym156$GET_MODIFIERS);
            SubLObject result_words = (SubLObject)ConsesLow.list(head);
            SubLObject cdolist_list_var = modifiers;
            SubLObject modifier = (SubLObject)definitional_question.NIL;
            modifier = cdolist_list_var.first();
            while (definitional_question.NIL != cdolist_list_var) {
                if (definitional_question.NIL == string_utilities.substringP(methods.funcall_instance_method_with_0_args(modifier, (SubLObject)definitional_question.$sym46$GET_STRING), v_term, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED)) {
                    final SubLObject item_var = modifier;
                    if (definitional_question.NIL == conses_high.member(item_var, result_words, Symbols.symbol_function((SubLObject)definitional_question.EQUAL), Symbols.symbol_function((SubLObject)definitional_question.IDENTITY))) {
                        result_words = (SubLObject)ConsesLow.cons(item_var, result_words);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                modifier = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list(head, result_words);
        }
        return (SubLObject)definitional_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 19930L)
    public static SubLObject get_pre_nominal_description(final SubLObject passage_string, final SubLObject head_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_tokens = string_utilities.split_string(head_string, (SubLObject)definitional_question.UNPROVIDED);
        SubLObject v_linkage = (SubLObject)definitional_question.NIL;
        SubLObject result_words = (SubLObject)definitional_question.NIL;
        SubLObject result_strings = (SubLObject)definitional_question.NIL;
        SubLObject results = (SubLObject)definitional_question.NIL;
        SubLObject error_msg = (SubLObject)definitional_question.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)definitional_question.$sym157$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject lexicon = cyclifier_lexicon.new_cyclifier_lexicon();
                    SubLObject error = (SubLObject)definitional_question.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)definitional_question.$sym157$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                v_linkage = linkage.new_linkage(passage_string, (SubLObject)ConsesLow.list((SubLObject)definitional_question.$kw158$LEXICON, lexicon));
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)definitional_question.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (definitional_question.NIL != error) {
                        parser.ensure_link_server_running();
                        v_linkage = linkage.new_linkage(passage_string, (SubLObject)ConsesLow.list((SubLObject)definitional_question.$kw158$LEXICON, lexicon));
                    }
                }
                catch (Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, (SubLObject)definitional_question.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_msg = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (definitional_question.NIL != error_msg) {
            Errors.warn((SubLObject)definitional_question.$str159$Error_caught_in_GET_PRE_NOMINAL_D, error_msg);
        }
        if (definitional_question.NIL != v_linkage) {
            SubLObject cdolist_list_var = (SubLObject)ConsesLow.cons(head_string, head_tokens);
            SubLObject word = (SubLObject)definitional_question.NIL;
            word = cdolist_list_var.first();
            while (definitional_question.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$6;
                final SubLObject link_words = cdolist_list_var_$6 = linkage.search_atmost_n_link_words(v_linkage, word, (SubLObject)definitional_question.THREE_INTEGER);
                SubLObject link_word = (SubLObject)definitional_question.NIL;
                link_word = cdolist_list_var_$6.first();
                while (definitional_question.NIL != cdolist_list_var_$6) {
                    final SubLObject title = pre_nominal_title_via_link(link_word);
                    final SubLObject head = np_head_modified_by_appositive(link_word, head_string);
                    if (definitional_question.NIL != title) {
                        final SubLObject item_var = title;
                        if (definitional_question.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)definitional_question.EQUAL), Symbols.symbol_function((SubLObject)definitional_question.IDENTITY))) {
                            results = (SubLObject)ConsesLow.cons(item_var, results);
                        }
                    }
                    if (definitional_question.NIL != head) {
                        final SubLObject item_var = methods.funcall_instance_method_with_0_args(head.first(), (SubLObject)definitional_question.$sym46$GET_STRING);
                        if (definitional_question.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)definitional_question.EQL), Symbols.symbol_function((SubLObject)definitional_question.IDENTITY))) {
                            results = (SubLObject)ConsesLow.cons(item_var, results);
                        }
                        result_words = conses_high.second(head);
                    }
                    SubLObject cdolist_list_var_$7;
                    final SubLObject related_lws = cdolist_list_var_$7 = Sequences.cconcatenate(methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw160$GN_PATTERN, (SubLObject)definitional_question.$kw149$LEFT), new SubLObject[] { methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw148$G_PATTERN, (SubLObject)definitional_question.$kw149$LEFT), methods.funcall_instance_method_with_2_args(link_word, (SubLObject)definitional_question.$sym147$GET_DIRECTLY_RELATED, (SubLObject)definitional_question.$kw161$AN_PATTERN, (SubLObject)definitional_question.$kw149$LEFT) });
                    SubLObject related_lw = (SubLObject)definitional_question.NIL;
                    related_lw = cdolist_list_var_$7.first();
                    while (definitional_question.NIL != cdolist_list_var_$7) {
                        final SubLObject item_var2 = methods.funcall_instance_method_with_0_args(related_lw, (SubLObject)definitional_question.$sym46$GET_STRING);
                        if (definitional_question.NIL == conses_high.member(item_var2, results, Symbols.symbol_function((SubLObject)definitional_question.EQUAL), Symbols.symbol_function((SubLObject)definitional_question.IDENTITY))) {
                            results = (SubLObject)ConsesLow.cons(item_var2, results);
                        }
                        result_words = (SubLObject)ConsesLow.cons(related_lw, result_words);
                        result_words = Sequences.cconcatenate(result_words, methods.funcall_instance_method_with_0_args(related_lw, (SubLObject)definitional_question.$sym156$GET_MODIFIERS));
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        related_lw = cdolist_list_var_$7.first();
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    link_word = cdolist_list_var_$6.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var = Sort.sort(Sequences.remove_duplicates(result_words, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED), (SubLObject)definitional_question.$sym162$LINK_WORD_AFTER, (SubLObject)definitional_question.UNPROVIDED);
        SubLObject result_word = (SubLObject)definitional_question.NIL;
        result_word = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            result_strings = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(result_word, (SubLObject)definitional_question.$sym46$GET_STRING), result_strings);
            cdolist_list_var = cdolist_list_var.rest();
            result_word = cdolist_list_var.first();
        }
        if (definitional_question.NIL != result_strings) {
            final SubLObject bunged_result = string_utilities.bunge(result_strings, (SubLObject)definitional_question.UNPROVIDED);
            if (definitional_question.NIL != string_utilities.substringP(bunged_result, passage_string, Symbols.symbol_function((SubLObject)definitional_question.EQUALP), (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED)) {
                final SubLObject item_var3 = bunged_result;
                if (definitional_question.NIL == conses_high.member(item_var3, results, Symbols.symbol_function((SubLObject)definitional_question.EQL), Symbols.symbol_function((SubLObject)definitional_question.IDENTITY))) {
                    results = (SubLObject)ConsesLow.cons(item_var3, results);
                }
            }
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 23296L)
    public static SubLObject definitional_question_get_pre_nominal_description_via_link_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = (SubLObject)definitional_question.NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        try {
            thread.throwStack.push(definitional_question.$sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject terms = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym73$GET_FOCUS), methods.funcall_instance_method_with_0_args(self, (SubLObject)definitional_question.$sym74$GET_FOCUS_VARIANTS));
                final SubLObject passage_string = methods.funcall_instance_method_with_0_args(passage, (SubLObject)definitional_question.$sym75$GET_CONTENT);
                SubLObject result_strings = (SubLObject)definitional_question.NIL;
                SubLObject results = (SubLObject)definitional_question.NIL;
                if (definitional_question.NIL == result_strings) {
                    SubLObject csome_list_var = terms;
                    SubLObject v_term = (SubLObject)definitional_question.NIL;
                    v_term = csome_list_var.first();
                    while (definitional_question.NIL == result_strings && definitional_question.NIL != csome_list_var) {
                        if (definitional_question.NIL != v_term) {
                            result_strings = get_pre_nominal_description(passage_string, v_term);
                        }
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    }
                }
                SubLObject cdolist_list_var = result_strings;
                SubLObject result_string = (SubLObject)definitional_question.NIL;
                result_string = cdolist_list_var.first();
                while (definitional_question.NIL != cdolist_list_var) {
                    final SubLObject item_var = answer.new_text_answer(self, result_string, passage, max_confidence, (SubLObject)definitional_question.UNPROVIDED);
                    if (definitional_question.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)definitional_question.EQL), Symbols.symbol_function((SubLObject)definitional_question.IDENTITY))) {
                        results = (SubLObject)ConsesLow.cons(item_var, results);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    result_string = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)definitional_question.$sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, results);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)definitional_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)definitional_question.$sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 23855L)
    public static SubLObject entities_for_cns_topic(final SubLObject query_string) {
        assert definitional_question.NIL != Types.stringp(query_string) : query_string;
        final SubLObject entities_hash = Hashtables.make_hash_table((SubLObject)definitional_question.$int166$32, Symbols.symbol_function((SubLObject)definitional_question.EQUALP), (SubLObject)definitional_question.UNPROVIDED);
        SubLObject entities_list = (SubLObject)definitional_question.NIL;
        SubLObject cdolist_list_var;
        final SubLObject passages = cdolist_list_var = search_engine.ask_lemur(query_string, (SubLObject)definitional_question.TEN_INTEGER, (SubLObject)definitional_question.TEN_INTEGER, (SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.$str167$_cyc_projects_aquaint_lemur_indic, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED);
        SubLObject pass = (SubLObject)definitional_question.NIL;
        pass = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            final SubLObject text = conses_high.third(pass);
            final SubLObject entities = external_interfaces.resporatorXX(text);
            PrintLow.format((SubLObject)definitional_question.T, (SubLObject)definitional_question.$str168$___S__, text);
            SubLObject cdolist_list_var_$8 = entities;
            SubLObject ent = (SubLObject)definitional_question.NIL;
            ent = cdolist_list_var_$8.first();
            while (definitional_question.NIL != cdolist_list_var_$8) {
                hash_table_utilities.cinc_hash(ent, entities_hash, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                ent = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pass = cdolist_list_var.first();
        }
        SubLObject k = (SubLObject)definitional_question.NIL;
        SubLObject v = (SubLObject)definitional_question.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(entities_hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                if (definitional_question.NIL != subl_promotions.memberP(k.first(), (SubLObject)definitional_question.$list169, (SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED)) {
                    entities_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(k, v), entities_list);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(entities_list, (SubLObject)definitional_question.$sym170$_, (SubLObject)definitional_question.$sym171$SECOND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 24640L)
    public static SubLObject research(final SubLObject query_string) {
        SubLObject answers = (SubLObject)definitional_question.NIL;
        SubLObject cdolist_list_var = entities_for_cns_topic(query_string);
        SubLObject ent = (SubLObject)definitional_question.NIL;
        ent = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            final SubLObject type = conses_high.caar(ent);
            final SubLObject string = ent.first().rest();
            SubLObject v_question = (SubLObject)definitional_question.NIL;
            if (definitional_question.NIL != subl_promotions.memberP(type, (SubLObject)definitional_question.$list169, (SubLObject)definitional_question.EQUAL, (SubLObject)definitional_question.UNPROVIDED)) {
                v_question = question.new_question(PrintLow.format((SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$str172$_a_is__a_, (SubLObject)(type.equal((SubLObject)definitional_question.$sym173$PERSON) ? definitional_question.$str174$Who : definitional_question.$str175$What), string), (SubLObject)ConsesLow.list((SubLObject)definitional_question.$str176$CNSjan2004), (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION);
                print_high.princ((SubLObject)definitional_question.$str177$_________________________________, (SubLObject)definitional_question.UNPROVIDED);
                streams_high.terpri((SubLObject)definitional_question.UNPROVIDED);
                print_high.princ(v_question, (SubLObject)definitional_question.UNPROVIDED);
                streams_high.terpri((SubLObject)definitional_question.UNPROVIDED);
                streams_high.terpri((SubLObject)definitional_question.UNPROVIDED);
                SubLObject cdolist_list_var_$9 = methods.funcall_instance_method_with_0_args(v_question, (SubLObject)definitional_question.$sym178$ANSWER);
                SubLObject v_answer = (SubLObject)definitional_question.NIL;
                v_answer = cdolist_list_var_$9.first();
                while (definitional_question.NIL != cdolist_list_var_$9) {
                    print_high.princ(v_answer, (SubLObject)definitional_question.UNPROVIDED);
                    streams_high.terpri((SubLObject)definitional_question.UNPROVIDED);
                    answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    v_answer = cdolist_list_var_$9.first();
                }
                streams_high.terpri((SubLObject)definitional_question.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ent = cdolist_list_var.first();
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 25320L)
    public static SubLObject definitional_question_test_helper(final SubLObject passage_string, final SubLObject focus_string) {
        final SubLObject passage = search_engine.new_simple_passage(passage_string);
        final SubLObject v_parser = parser.new_stanford_parser((SubLObject)definitional_question.UNPROVIDED, (SubLObject)definitional_question.UNPROVIDED);
        final SubLObject question_string = Sequences.cconcatenate((SubLObject)definitional_question.$str179$Who_is_, new SubLObject[] { focus_string, definitional_question.$str180$_ });
        final SubLObject question_parse = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)definitional_question.$sym34$PARSE, question_string);
        final SubLObject v_question = object.new_class_instance((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION);
        SubLObject answers = (SubLObject)definitional_question.NIL;
        SubLObject definitions = (SubLObject)definitional_question.NIL;
        question.set_question_parser(v_question, v_parser);
        question.set_question_string(v_question, question_string);
        question.set_question_parse(v_question, question_parse);
        SubLObject cdolist_list_var;
        answers = (cdolist_list_var = methods.funcall_instance_method_with_1_args(v_question, (SubLObject)definitional_question.$sym68$EXTRACT, passage));
        SubLObject v_answer = (SubLObject)definitional_question.NIL;
        v_answer = cdolist_list_var.first();
        while (definitional_question.NIL != cdolist_list_var) {
            final SubLObject string_answer = methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)definitional_question.$sym75$GET_CONTENT);
            if (definitional_question.NIL != string_utilities.non_empty_stringP(string_answer)) {
                definitions = (SubLObject)ConsesLow.cons(string_answer, definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return definitions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 25320L)
    public static SubLObject this_equal(final SubLObject thing1, final SubLObject thing2) {
        return Equality.equalp(thing1, thing2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 25320L)
    public static SubLObject pre_nominal_test_func(final SubLObject thing1, final SubLObject thing2) {
        return conses_high.intersection(thing1, thing2, Symbols.symbol_function((SubLObject)definitional_question.EQUAL), (SubLObject)definitional_question.UNPROVIDED);
    }
    
    public static SubLObject declare_definitional_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_leading_appositive_blacklist", "GET-DEFINITIONAL-QUESTION-LEADING-APPOSITIVE-BLACKLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_leading_appositive_blacklist", "SET-DEFINITIONAL-QUESTION-LEADING-APPOSITIVE-BLACKLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_thing_template_parameters", "GET-DEFINITIONAL-QUESTION-THING-TEMPLATE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_thing_template_parameters", "SET-DEFINITIONAL-QUESTION-THING-TEMPLATE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_organization_template_parameters", "GET-DEFINITIONAL-QUESTION-ORGANIZATION-TEMPLATE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_organization_template_parameters", "SET-DEFINITIONAL-QUESTION-ORGANIZATION-TEMPLATE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_person_template_parameters", "GET-DEFINITIONAL-QUESTION-PERSON-TEMPLATE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_person_template_parameters", "SET-DEFINITIONAL-QUESTION-PERSON-TEMPLATE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_general_template_parameters", "GET-DEFINITIONAL-QUESTION-GENERAL-TEMPLATE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_general_template_parameters", "SET-DEFINITIONAL-QUESTION-GENERAL-TEMPLATE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_glimpse_thing_templates", "GET-DEFINITIONAL-QUESTION-GLIMPSE-THING-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_glimpse_thing_templates", "SET-DEFINITIONAL-QUESTION-GLIMPSE-THING-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_definitional_question_glimpse_general_templates", "GET-DEFINITIONAL-QUESTION-GLIMPSE-GENERAL-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "set_definitional_question_glimpse_general_templates", "SET-DEFINITIONAL-QUESTION-GLIMPSE-GENERAL-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "subloop_reserved_initialize_definitional_question_class", "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "subloop_reserved_initialize_definitional_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_p", "DEFINITIONAL-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_isaP_method", "DEFINITIONAL-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_querify_method", "DEFINITIONAL-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_answer_wordnet_method", "DEFINITIONAL-QUESTION-ANSWER-WORDNET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_roots", "GET-ROOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_extract_method", "DEFINITIONAL-QUESTION-EXTRACT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_extract_via_deep_parse_method", "DEFINITIONAL-QUESTION-EXTRACT-VIA-DEEP-PARSE-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_get_focus_method", "DEFINITIONAL-QUESTION-GET-FOCUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_get_focus_variants_method", "DEFINITIONAL-QUESTION-GET-FOCUS-VARIANTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_answer_types_method", "DEFINITIONAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_answer_cardinality_method", "DEFINITIONAL-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_template_param_table_method", "DEFINITIONAL-QUESTION-TEMPLATE-PARAM-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "instantiate_templates", "INSTANTIATE-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "template_instances_for_param_table", "TEMPLATE-INSTANCES-FOR-PARAM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "template_instances_for_param", "TEMPLATE-INSTANCES-FOR-PARAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_nrestr_appositive_description_method", "DEFINITIONAL-QUESTION-NRESTR-APPOSITIVE-DESCRIPTION-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_equality_description_method", "DEFINITIONAL-QUESTION-EQUALITY-DESCRIPTION-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_called_x_description_method", "DEFINITIONAL-QUESTION-CALLED-X-DESCRIPTION-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_restr_relative_clause_description_method", "DEFINITIONAL-QUESTION-RESTR-RELATIVE-CLAUSE-DESCRIPTION-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_restr_appositive_description_method", "DEFINITIONAL-QUESTION-RESTR-APPOSITIVE-DESCRIPTION-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "pre_nominal_title_via_link", "PRE-NOMINAL-TITLE-VIA-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "np_head_modified_by_appositive", "NP-HEAD-MODIFIED-BY-APPOSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "get_pre_nominal_description", "GET-PRE-NOMINAL-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_get_pre_nominal_description_via_link_method", "DEFINITIONAL-QUESTION-GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "entities_for_cns_topic", "ENTITIES-FOR-CNS-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "research", "RESEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "definitional_question_test_helper", "DEFINITIONAL-QUESTION-TEST-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "this_equal", "THIS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.definitional_question", "pre_nominal_test_func", "PRE-NOMINAL-TEST-FUNC", 2, 0, false);
        return (SubLObject)definitional_question.NIL;
    }
    
    public static SubLObject init_definitional_question_file() {
        return (SubLObject)definitional_question.NIL;
    }
    
    public static SubLObject setup_definitional_question_file() {
        classes.subloop_new_class((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym1$WH_QUESTION, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym27$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym37$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE);
        subloop_reserved_initialize_definitional_question_class((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)definitional_question.$sym38$ISA_, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.$list40, (SubLObject)definitional_question.$list41);
        methods.subloop_register_class_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym38$ISA_, (SubLObject)definitional_question.$sym55$DEFINITIONAL_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym56$QUERIFY, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list57);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym56$QUERIFY, (SubLObject)definitional_question.$sym61$DEFINITIONAL_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym62$ANSWER_WORDNET, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list63);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym62$ANSWER_WORDNET, (SubLObject)definitional_question.$sym64$DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym68$EXTRACT, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.$list69, (SubLObject)definitional_question.$list70);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym68$EXTRACT, (SubLObject)definitional_question.$sym79$DEFINITIONAL_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym76$EXTRACT_VIA_DEEP_PARSE, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.$list80, (SubLObject)definitional_question.$list81);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym76$EXTRACT_VIA_DEEP_PARSE, (SubLObject)definitional_question.$sym87$DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym73$GET_FOCUS, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list88, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list89);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym73$GET_FOCUS, (SubLObject)definitional_question.$sym93$DEFINITIONAL_QUESTION_GET_FOCUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym74$GET_FOCUS_VARIANTS, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list88, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list94);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym74$GET_FOCUS_VARIANTS, (SubLObject)definitional_question.$sym98$DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym35$ANSWER_TYPES, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list99);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym35$ANSWER_TYPES, (SubLObject)definitional_question.$sym100$DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym101$ANSWER_CARDINALITY, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.NIL, (SubLObject)definitional_question.$list102);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym101$ANSWER_CARDINALITY, (SubLObject)definitional_question.$sym103$DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym60$TEMPLATE_PARAM_TABLE, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.$list104, (SubLObject)definitional_question.$list105);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym60$TEMPLATE_PARAM_TABLE, (SubLObject)definitional_question.$sym108$DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym109$NRESTR_APPOSITIVE_DESCRIPTION, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list110, (SubLObject)definitional_question.$list111, (SubLObject)definitional_question.$list112);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym109$NRESTR_APPOSITIVE_DESCRIPTION, (SubLObject)definitional_question.$sym117$DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym118$EQUALITY_DESCRIPTION, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list110, (SubLObject)definitional_question.$list111, (SubLObject)definitional_question.$list119);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym118$EQUALITY_DESCRIPTION, (SubLObject)definitional_question.$sym126$DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym127$CALLED_X_DESCRIPTION, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list110, (SubLObject)definitional_question.$list111, (SubLObject)definitional_question.$list128);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym127$CALLED_X_DESCRIPTION, (SubLObject)definitional_question.$sym130$DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list110, (SubLObject)definitional_question.$list132, (SubLObject)definitional_question.$list133);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION, (SubLObject)definitional_question.$sym139$DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym140$RESTR_APPOSITIVE_DESCRIPTION, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list110, (SubLObject)definitional_question.$list111, (SubLObject)definitional_question.$list141);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym140$RESTR_APPOSITIVE_DESCRIPTION, (SubLObject)definitional_question.$sym145$DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)definitional_question.$sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, (SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$list39, (SubLObject)definitional_question.$list69, (SubLObject)definitional_question.$list163);
        methods.subloop_register_instance_method((SubLObject)definitional_question.$sym0$DEFINITIONAL_QUESTION, (SubLObject)definitional_question.$sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, (SubLObject)definitional_question.$sym165$DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD);
        generic_testing.define_test_case_table_int((SubLObject)definitional_question.$sym181$GET_PRE_NOMINAL_DESCRIPTION, (SubLObject)ConsesLow.list(new SubLObject[] { definitional_question.$kw182$TEST, Symbols.symbol_function((SubLObject)definitional_question.$sym183$PRE_NOMINAL_TEST_FUNC), definitional_question.$kw184$OWNER, definitional_question.NIL, definitional_question.$kw185$CLASSES, definitional_question.NIL, definitional_question.$kw186$KB, definitional_question.$kw187$FULL, definitional_question.$kw188$WORKING_, definitional_question.NIL }), (SubLObject)definitional_question.$list189);
        generic_testing.define_test_case_table_int((SubLObject)definitional_question.$sym190$DEFINITIONAL_QUESTION_TEST_HELPER, (SubLObject)ConsesLow.list(new SubLObject[] { definitional_question.$kw182$TEST, definitional_question.$sym191$THIS_EQUAL, definitional_question.$kw184$OWNER, definitional_question.NIL, definitional_question.$kw185$CLASSES, definitional_question.NIL, definitional_question.$kw186$KB, definitional_question.$kw187$FULL, definitional_question.$kw188$WORKING_, definitional_question.NIL }), (SubLObject)definitional_question.$list192);
        return (SubLObject)definitional_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_definitional_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_definitional_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_definitional_question_file();
    }
    
    static {
        me = (SubLFile)new definitional_question();
        $sym0$DEFINITIONAL_QUESTION = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLIMPSE-GENERAL-TEMPLATES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("<FOCUS><COMMA> <DET>"), SubLObjectFactory.makeString("such as <FOCUS>"), SubLObjectFactory.makeString("<FOCUS><COMMA> such as"), SubLObjectFactory.makeString("<FOCUS><COMMA> as <DET>"), SubLObjectFactory.makeString("<FOCUS><COMMA> <RELPN> <VERB> <DET>"), SubLObjectFactory.makeString("<FOCUS> <VERB> <DET>"), SubLObjectFactory.makeString("<VERB> <FOCUS>"), SubLObjectFactory.makeString("<FOCUS><COMMA> called <DET>"), SubLObjectFactory.makeString("<FOCUS><COMMA> <TYPE> of"), SubLObjectFactory.makeString("<FOCUS><COMMA> being <DET>"), SubLObjectFactory.makeString("<FOCUS>") }))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLIMPSE-THING-TEMPLATES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("called <FOCUS>"), (SubLObject)SubLObjectFactory.makeString("<FOCUS><COMMA> defined"), (SubLObject)SubLObjectFactory.makeString("<FOCUS><COMMA> or")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERAL-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<COMMA>"), (SubLObject)SubLObjectFactory.makeString("\\,")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<DET>"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("an")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<TYPE>"), (SubLObject)SubLObjectFactory.makeString("kind"), (SubLObject)SubLObjectFactory.makeString("type"), (SubLObject)SubLObjectFactory.makeString("sort"), (SubLObject)SubLObjectFactory.makeString("one")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<VERB>"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("were"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERSON-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<RELPN>"), (SubLObject)SubLObjectFactory.makeString("who"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORGANIZATION-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<RELPN>"), (SubLObject)SubLObjectFactory.makeString("that"), (SubLObject)SubLObjectFactory.makeString("which"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THING-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<RELPN>"), (SubLObject)SubLObjectFactory.makeString("that"), (SubLObject)SubLObjectFactory.makeString("which"), (SubLObject)SubLObjectFactory.makeString("who"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEADING-APPOSITIVE-BLACKLIST"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Central"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("West"), SubLObjectFactory.makeString("North"), SubLObjectFactory.makeString("South"), SubLObjectFactory.makeString("Mr"), SubLObjectFactory.makeString("Mr."), SubLObjectFactory.makeString("Mrs"), SubLObjectFactory.makeString("Mrs."), SubLObjectFactory.makeString("Ms") }))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)definitional_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"), (SubLObject)definitional_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS-VARIANTS"), (SubLObject)definitional_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)definitional_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY"), (SubLObject)definitional_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-WORDNET"), (SubLObject)definitional_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR-APPOSITIVE-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CALLED-X-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARAM-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-WORD")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")) });
        $sym3$LEADING_APPOSITIVE_BLACKLIST = SubLObjectFactory.makeSymbol("LEADING-APPOSITIVE-BLACKLIST");
        $sym4$THING_TEMPLATE_PARAMETERS = SubLObjectFactory.makeSymbol("THING-TEMPLATE-PARAMETERS");
        $sym5$ORGANIZATION_TEMPLATE_PARAMETERS = SubLObjectFactory.makeSymbol("ORGANIZATION-TEMPLATE-PARAMETERS");
        $sym6$PERSON_TEMPLATE_PARAMETERS = SubLObjectFactory.makeSymbol("PERSON-TEMPLATE-PARAMETERS");
        $sym7$GENERAL_TEMPLATE_PARAMETERS = SubLObjectFactory.makeSymbol("GENERAL-TEMPLATE-PARAMETERS");
        $sym8$GLIMPSE_THING_TEMPLATES = SubLObjectFactory.makeSymbol("GLIMPSE-THING-TEMPLATES");
        $sym9$GLIMPSE_GENERAL_TEMPLATES = SubLObjectFactory.makeSymbol("GLIMPSE-GENERAL-TEMPLATES");
        $sym10$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym11$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym12$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym13$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym14$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym15$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym16$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym17$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym18$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym19$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("<FOCUS><COMMA> <DET>"), SubLObjectFactory.makeString("such as <FOCUS>"), SubLObjectFactory.makeString("<FOCUS><COMMA> such as"), SubLObjectFactory.makeString("<FOCUS><COMMA> as <DET>"), SubLObjectFactory.makeString("<FOCUS><COMMA> <RELPN> <VERB> <DET>"), SubLObjectFactory.makeString("<FOCUS> <VERB> <DET>"), SubLObjectFactory.makeString("<VERB> <FOCUS>"), SubLObjectFactory.makeString("<FOCUS><COMMA> called <DET>"), SubLObjectFactory.makeString("<FOCUS><COMMA> <TYPE> of"), SubLObjectFactory.makeString("<FOCUS><COMMA> being <DET>"), SubLObjectFactory.makeString("<FOCUS>") });
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("called <FOCUS>"), (SubLObject)SubLObjectFactory.makeString("<FOCUS><COMMA> defined"), (SubLObject)SubLObjectFactory.makeString("<FOCUS><COMMA> or"));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<COMMA>"), (SubLObject)SubLObjectFactory.makeString("\\,")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<DET>"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("an")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<TYPE>"), (SubLObject)SubLObjectFactory.makeString("kind"), (SubLObject)SubLObjectFactory.makeString("type"), (SubLObject)SubLObjectFactory.makeString("sort"), (SubLObject)SubLObjectFactory.makeString("one")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<VERB>"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("were")));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<RELPN>"), (SubLObject)SubLObjectFactory.makeString("who")));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<RELPN>"), (SubLObject)SubLObjectFactory.makeString("that"), (SubLObject)SubLObjectFactory.makeString("which")));
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<RELPN>"), (SubLObject)SubLObjectFactory.makeString("that"), (SubLObject)SubLObjectFactory.makeString("which"), (SubLObject)SubLObjectFactory.makeString("who")));
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Central"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("West"), SubLObjectFactory.makeString("North"), SubLObjectFactory.makeString("South"), SubLObjectFactory.makeString("Mr"), SubLObjectFactory.makeString("Mr."), SubLObjectFactory.makeString("Mrs"), SubLObjectFactory.makeString("Mrs."), SubLObjectFactory.makeString("Ms") });
        $sym27$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-CLASS");
        $sym28$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym29$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym30$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym31$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym32$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym33$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym34$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym35$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym36$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym37$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-INSTANCE");
        $sym38$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE question-tree-p\n   @return boolean; t if PARSE-TREE is a definitional question parse tree,\n   nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("were"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("the name"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQUALP))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("what")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("who")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NNP")), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NNP"))))))));
        $sym42$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym43$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $sym44$GET_SEMANTIC_HEAD = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD");
        $sym45$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym46$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("were"));
        $str48$the_name = SubLObjectFactory.makeString("the name");
        $str49$what = SubLObjectFactory.makeString("what");
        $str50$who = SubLObjectFactory.makeString("who");
        $sym51$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym52$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw53$NNP = SubLObjectFactory.makeKeyword("NNP");
        $sym54$GET_OBJECTS = SubLObjectFactory.makeSymbol("GET-OBJECTS");
        $sym55$DEFINITIONAL_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-ISA?-METHOD");
        $sym56$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WH-PHRASE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("WH-WORD"), (SubLObject)SubLObjectFactory.makeString("what")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("GLIMPSE-GENERAL-TEMPLATES"), (SubLObject)SubLObjectFactory.makeSymbol("GLIMPSE-THING-TEMPLATES")), (SubLObject)SubLObjectFactory.makeSymbol("GLIMPSE-GENERAL-TEMPLATES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAM-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARAM-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("WH-WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)definitional_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-TEMPLATES"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATES"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))));
        $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $sym59$GET_WH_PHRASE = SubLObjectFactory.makeSymbol("GET-WH-PHRASE");
        $sym60$TEMPLATE_PARAM_TABLE = SubLObjectFactory.makeSymbol("TEMPLATE-PARAM-TABLE");
        $sym61$DEFINITIONAL_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-QUERIFY-METHOD");
        $sym62$ANSWER_WORDNET = SubLObjectFactory.makeSymbol("ANSWER-WORDNET");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)definitional_question.NIL));
        $sym64$DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-ANSWER-WORDNET-METHOD");
        $kw65$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $sym66$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym67$GET_ROOTS = SubLObjectFactory.makeSymbol("GET-ROOTS");
        $sym68$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS-VARIANTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHALLOW-PARSES"), (SubLObject)definitional_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEEP-PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS0"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-CMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQUAL, (SubLObject)definitional_question.EQUALP)), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-VIA-DEEP-PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("DEEP-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-CMP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS0"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)definitional_question.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $sym72$ABSTRACT_PASSAGE_P = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P");
        $sym73$GET_FOCUS = SubLObjectFactory.makeSymbol("GET-FOCUS");
        $sym74$GET_FOCUS_VARIANTS = SubLObjectFactory.makeSymbol("GET-FOCUS-VARIANTS");
        $sym75$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym76$EXTRACT_VIA_DEEP_PARSE = SubLObjectFactory.makeSymbol("EXTRACT-VIA-DEEP-PARSE");
        $list77 = ConsesLow.list((SubLObject)definitional_question.EQUAL, (SubLObject)definitional_question.EQUALP);
        $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK = SubLObjectFactory.makeSymbol("GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK");
        $sym79$DEFINITIONAL_QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-EXTRACT-METHOD");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-CMP"));
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS-VARIANTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACTORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR-APPOSITIVE-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("CALLED-X-DESCRIPTION")))), (SubLObject)SubLObjectFactory.makeSymbol("FOUND?"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND?"), (SubLObject)definitional_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACTORS"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-CMP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND?"), (SubLObject)definitional_question.T)))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR-APPOSITIVE-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("CALLED-X-DESCRIPTION"));
        $kw84$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $kw85$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $str86$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $sym87$DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-EXTRACT-VIA-DEEP-PARSE-METHOD");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the focus string of QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAG-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHNP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)definitional_question.NIL))));
        $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $sym91$DAUGHTER_COUNT = SubLObjectFactory.makeSymbol("DAUGHTER-COUNT");
        $sym92$GET_PARSE_TREE_STRING = SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING");
        $sym93$DEFINITIONAL_QUESTION_GET_FOCUS_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-GET-FOCUS-METHOD");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of string of variants of this question's focus"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAG-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))))), (SubLObject)SubLObjectFactory.makeSymbol("VARIANTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLURALIZE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("VARIANTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLURAL-NOUN-TO-SG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("VARIANTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VARIANTS"))));
        $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $kw96$NN = SubLObjectFactory.makeKeyword("NN");
        $kw97$NNS = SubLObjectFactory.makeKeyword("NNS");
        $sym98$DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-GET-FOCUS-VARIANTS-METHOD");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)definitional_question.NIL)));
        $sym100$DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-ANSWER-TYPES-METHOD");
        $sym101$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the number of answers expected for this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)definitional_question.TEN_INTEGER));
        $sym103$DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-ANSWER-CARDINALITY-METHOD");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-WORD"));
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RES"), (SubLObject)definitional_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)definitional_question.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("WH-WORD"), (SubLObject)SubLObjectFactory.makeString("who")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)SubLObjectFactory.makeSymbol("RES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("GENERAL-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("PERSON-TEMPLATE-PARAMETERS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)definitional_question.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("WH-WORD"), (SubLObject)SubLObjectFactory.makeString("what")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)SubLObjectFactory.makeSymbol("RES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("GENERAL-TEMPLATE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("THING-TEMPLATE-PARAMETERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACONS"), (SubLObject)SubLObjectFactory.makeString("<FOCUS>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS-VARIANTS")))), (SubLObject)SubLObjectFactory.makeSymbol("RES")))));
        $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $str107$_FOCUS_ = SubLObjectFactory.makeString("<FOCUS>");
        $sym108$DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-TEMPLATE-PARAM-TABLE-METHOD");
        $sym109$NRESTR_APPOSITIVE_DESCRIPTION = SubLObjectFactory.makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQUAL)));
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS"), (SubLObject)definitional_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)definitional_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TERM-MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS"), (SubLObject)definitional_question.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS"), (SubLObject)definitional_question.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(","), (SubLObject)SubLObjectFactory.makeKeyword(":"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQ))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-NRESTR-APPOSITIVE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS"), (SubLObject)definitional_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("PRN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(":"), (SubLObject)SubLObjectFactory.makeKeyword("("), (SubLObject)SubLObjectFactory.makeKeyword("-LRB-"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQ))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS"), (SubLObject)definitional_question.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOURTH-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TERM-MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOURTH-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(","), (SubLObject)SubLObjectFactory.makeKeyword(":"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQ))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)definitional_question.NIL));
        $kw113$NP = SubLObjectFactory.makeKeyword("NP");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(","), (SubLObject)SubLObjectFactory.makeKeyword(":"));
        $kw115$PRN = SubLObjectFactory.makeKeyword("PRN");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(":"), (SubLObject)SubLObjectFactory.makeKeyword("("), (SubLObject)SubLObjectFactory.makeKeyword("-LRB-"));
        $sym117$DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-NRESTR-APPOSITIVE-DESCRIPTION-METHOD");
        $sym118$EQUALITY_DESCRIPTION = SubLObjectFactory.makeSymbol("EQUALITY-DESCRIPTION");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("S")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.THREE_INTEGER), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TERM-MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE")), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("VP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER))), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("AUX")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("were"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQUALP)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ONE_INTEGER))), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ONE_INTEGER)))))));
        $kw120$S = SubLObjectFactory.makeKeyword("S");
        $kw121$VP = SubLObjectFactory.makeKeyword("VP");
        $sym122$GET_DESCENDANT = SubLObjectFactory.makeSymbol("GET-DESCENDANT");
        $list123 = ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER);
        $kw124$AUX = SubLObjectFactory.makeKeyword("AUX");
        $list125 = ConsesLow.list((SubLObject)definitional_question.ONE_INTEGER, (SubLObject)definitional_question.ONE_INTEGER);
        $sym126$DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-EQUALITY-DESCRIPTION-METHOD");
        $sym127$CALLED_X_DESCRIPTION = SubLObjectFactory.makeSymbol("CALLED-X-DESCRIPTION");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("VP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("called")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("TERM")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER)))));
        $str129$called = SubLObjectFactory.makeString("called");
        $sym130$DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-CALLED-X-DESCRIPTION-METHOD");
        $sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION = SubLObjectFactory.makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQUAL)));
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.THREE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.FOUR_INTEGER), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TERM-MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE")), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword(",")), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("SBAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)definitional_question.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.TWO_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER))), ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.TWO_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("WHNP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.TWO_INTEGER, (SubLObject)definitional_question.ONE_INTEGER))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.TWO_INTEGER, (SubLObject)definitional_question.ONE_INTEGER)))))));
        $kw134$_ = SubLObjectFactory.makeKeyword(",");
        $kw135$SBAR = SubLObjectFactory.makeKeyword("SBAR");
        $list136 = ConsesLow.list((SubLObject)definitional_question.TWO_INTEGER, (SubLObject)definitional_question.ZERO_INTEGER);
        $kw137$WHNP = SubLObjectFactory.makeKeyword("WHNP");
        $list138 = ConsesLow.list((SubLObject)definitional_question.TWO_INTEGER, (SubLObject)definitional_question.ONE_INTEGER);
        $sym139$DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-RESTR-RELATIVE-CLAUSE-DESCRIPTION-METHOD");
        $sym140$RESTR_APPOSITIVE_DESCRIPTION = SubLObjectFactory.makeSymbol("RESTR-APPOSITIVE-DESCRIPTION");
        $list141 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY")))), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("PNP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)definitional_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)definitional_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("DT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TERM-MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-COMPARE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)definitional_question.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LENGTH"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("PNP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("LEADING-APPOSITIVE-BLACKLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)definitional_question.EQUALP))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-NAME-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")))))));
        $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("PNP"));
        $kw144$DT = SubLObjectFactory.makeKeyword("DT");
        $sym145$DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-RESTR-APPOSITIVE-DESCRIPTION-METHOD");
        $sym146$LINK_WORD_P = SubLObjectFactory.makeSymbol("LINK-WORD-P");
        $sym147$GET_DIRECTLY_RELATED = SubLObjectFactory.makeSymbol("GET-DIRECTLY-RELATED");
        $kw148$G_PATTERN = SubLObjectFactory.makeKeyword("G-PATTERN");
        $kw149$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw150$X_I_PATTERN = SubLObjectFactory.makeKeyword("X-I-PATTERN");
        $kw151$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $sym152$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw153$X_D_PATTERN = SubLObjectFactory.makeKeyword("X-D-PATTERN");
        $kw154$X_C_PATTERN = SubLObjectFactory.makeKeyword("X-C-PATTERN");
        $kw155$MX_PATTERN = SubLObjectFactory.makeKeyword("MX-PATTERN");
        $sym156$GET_MODIFIERS = SubLObjectFactory.makeSymbol("GET-MODIFIERS");
        $sym157$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw158$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $str159$Error_caught_in_GET_PRE_NOMINAL_D = SubLObjectFactory.makeString("Error caught in GET-PRE-NOMINAL-DESCRIPTION ~s");
        $kw160$GN_PATTERN = SubLObjectFactory.makeKeyword("GN-PATTERN");
        $kw161$AN_PATTERN = SubLObjectFactory.makeKeyword("AN-PATTERN");
        $sym162$LINK_WORD_AFTER = SubLObjectFactory.makeSymbol("LINK-WORD-AFTER");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS-VARIANTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PRE-NOMINAL-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-CONFIDENCE")), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"))));
        $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");
        $sym165$DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK-METHOD");
        $int166$32 = SubLObjectFactory.makeInteger(32);
        $str167$_cyc_projects_aquaint_lemur_indic = SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param");
        $str168$___S__ = SubLObjectFactory.makeString("~%~S~%");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERSON"), (SubLObject)SubLObjectFactory.makeSymbol("ORG"));
        $sym170$_ = SubLObjectFactory.makeSymbol(">");
        $sym171$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str172$_a_is__a_ = SubLObjectFactory.makeString("~a is ~a?");
        $sym173$PERSON = SubLObjectFactory.makeSymbol("PERSON");
        $str174$Who = SubLObjectFactory.makeString("Who");
        $str175$What = SubLObjectFactory.makeString("What");
        $str176$CNSjan2004 = SubLObjectFactory.makeString("CNSjan2004");
        $str177$_________________________________ = SubLObjectFactory.makeString("----------------------------------------------------");
        $sym178$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $str179$Who_is_ = SubLObjectFactory.makeString("Who is ");
        $str180$_ = SubLObjectFactory.makeString("?");
        $sym181$GET_PRE_NOMINAL_DESCRIPTION = SubLObjectFactory.makeSymbol("GET-PRE-NOMINAL-DESCRIPTION");
        $kw182$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym183$PRE_NOMINAL_TEST_FUNC = SubLObjectFactory.makeSymbol("PRE-NOMINAL-TEST-FUNC");
        $kw184$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw185$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw186$KB = SubLObjectFactory.makeKeyword("KB");
        $kw187$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw188$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Canadian singer David Baxter lives in the woods"), (SubLObject)SubLObjectFactory.makeString("David Baxter")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Canadian singer"))));
        $sym190$DEFINITIONAL_QUESTION_TEST_HELPER = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-TEST-HELPER");
        $sym191$THIS_EQUAL = SubLObjectFactory.makeSymbol("THIS-EQUAL");
        $list192 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Vaclav Havel, who is the president of the Chech Republic, sleeps with monkeys"), (SubLObject)SubLObjectFactory.makeString("Vaclav Havel")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is the president of the Chech Republic"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrorism is a heinous crime against humanity"), (SubLObject)SubLObjectFactory.makeString("terrorism")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a heinous crime against humanity"))));
    }
}

/*

	Total time: 809 ms
	
*/