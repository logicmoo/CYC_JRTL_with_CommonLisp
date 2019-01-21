package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class semtrans_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.semtrans_lexicon";
    public static final String myFingerPrint = "aeced5f5007023c463cc25fe7ceaffef698bf74eea4f337b84f8830544c4e096";
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1420L)
    public static SubLSymbol $manufacture_semtrans_assertionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1542L)
    private static SubLSymbol $semtrans_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 9916L)
    private static SubLSymbol $default_verbal_lex_entry_literals$;
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 20118L)
    public static SubLSymbol $semtrans_lexicon_learners$;
    private static final SubLSymbol $sym0$SEMTRANS_LEXICON;
    private static final SubLSymbol $sym1$ABSTRACT_LEXICON;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$MY_TERM_LEXICON;
    private static final SubLSymbol $sym4$OBJECT;
    private static final SubLSymbol $sym5$INSTANCE_COUNT;
    private static final SubLSymbol $sym6$DEFAULT_EXCLUDE_MTS;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFAULT_EXCLUDE_PREDICATES;
    private static final SubLSymbol $sym9$DEFAULT_BASE_MT;
    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical;
    private static final SubLSymbol $sym11$DEFAULT_KB_SPEC;
    private static final SubLObject $const12$AbstractLexiconSpecification;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$ALLOWED_MTS;
    private static final SubLSymbol $kw17$UNINITIALIZED;
    private static final SubLSymbol $sym18$EXCLUDED_MTS;
    private static final SubLSymbol $sym19$BASE_MT;
    private static final SubLSymbol $sym20$ROOT_MT;
    private static final SubLSymbol $sym21$EXCLUDED_PREDS;
    private static final SubLSymbol $sym22$EXCLUDED_POS_LIST;
    private static final SubLSymbol $sym23$TRIE;
    private static final SubLSymbol $sym24$CACHE;
    private static final SubLSymbol $sym25$IGNORE_CACHE_;
    private static final SubLSymbol $sym26$CASE_SENSITIVITY;
    private static final SubLSymbol $sym27$ALLOW_FABRICATION_;
    private static final SubLSymbol $sym28$LEARNED;
    private static final SubLSymbol $sym29$ACTIVE_LEARNERS;
    private static final SubLSymbol $sym30$ALLOW_STEMMING;
    private static final SubLSymbol $sym31$STOP_WORDS;
    private static final SubLSymbol $sym32$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE;
    private static final SubLSymbol $sym33$INITIALIZE;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$EXCLUDE_PREDICATE;
    private static final SubLObject $const37$preferredNameString;
    private static final SubLObject $const38$denotationPlaceholder;
    private static final SubLObject $const39$denotationRelatedTo;
    private static final SubLSymbol $sym40$SEMTRANS_LEXICON_INITIALIZE_METHOD;
    private static final SubLSymbol $sym41$GET_TERM_LEXICON;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
    private static final SubLSymbol $sym44$SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym45$SEMTRANS_LEXICON_P;
    private static final SubLSymbol $sym46$COPY;
    private static final SubLSymbol $sym47$SET_TERM_LEXICON;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
    private static final SubLSymbol $sym51$SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym52$FABRICATE;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
    private static final SubLSymbol $sym57$STRINGP;
    private static final SubLSymbol $sym58$LISTP;
    private static final SubLSymbol $sym59$KEYWORDP;
    private static final SubLSymbol $sym60$FABRICATE_NOMINAL;
    private static final SubLSymbol $sym61$FABRICATE_VERBAL;
    private static final SubLSymbol $sym62$FABRICATE_ADJECTIVAL;
    private static final SubLSymbol $sym63$FABRICATE_ADVERBIAL;
    private static final SubLSymbol $sym64$SEMTRANS_LEXICON_FABRICATE_METHOD;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$LEX_ENTRY;
    private static final SubLSymbol $sym67$SET;
    private static final SubLSymbol $kw68$STRING;
    private static final SubLSymbol $kw69$PENN_TAGS;
    private static final SubLSymbol $kw70$SEMTRANS;
    private static final SubLSymbol $sym71$FABRICATE_NOMINAL_SEMTRANS;
    private static final SubLSymbol $sym72$SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLSymbol $kw75$NOUN;
    private static final SubLObject $const76$isa;
    private static final SubLObject $const77$ThingDescribableAsFn;
    private static final SubLObject $const78$WordFn;
    private static final SubLList $list79;
    private static final SubLSymbol $kw80$POSSESSOR;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$FABRICATE_VERBAL_SEMTRANS;
    private static final SubLSymbol $sym85$SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
    private static final SubLSymbol $kw88$ACTION;
    private static final SubLSymbol $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD;
    private static final SubLList $list95;
    private static final SubLObject $const96$equals;
    private static final SubLSymbol $kw97$SUBJECT;
    private static final SubLSymbol $kw98$OBJECT;
    private static final SubLSymbol $kw99$OBLIQUE_OBJECT;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD;
    private static final SubLList $list104;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD;
    private static final SubLSymbol $sym107$CREATE_LEX_ENTRIES;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD;
    private static final SubLSymbol $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME;
    private static final SubLSymbol $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY;
    private static final SubLSymbol $sym113$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD;
    private static final SubLSymbol $sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLSymbol $kw117$PERSON;
    private static final SubLObject $const118$and;
    private static final SubLList $list119;
    private static final SubLObject $const120$nameString;
    private static final SubLSymbol $kw121$PERSON_;
    private static final SubLSymbol $kw122$PLACE;
    private static final SubLList $list123;
    private static final SubLSymbol $kw124$PLACE_;
    private static final SubLSymbol $kw125$ORG;
    private static final SubLList $list126;
    private static final SubLSymbol $kw127$UNAME;
    private static final SubLSymbol $kw128$CYC_POS;
    private static final SubLObject $const129$ProperNoun;
    private static final SubLSymbol $kw130$FRAME;
    private static final SubLObject $const131$RegularNounFrame;
    private static final SubLSymbol $sym132$SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD;
    private static final SubLSymbol $sym133$RESPORATOR_TO_LEX_ENTRIES;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLSymbol $kw136$INFLECTIONS;
    private static final SubLSymbol $sym137$RESPORATOR_TO_INFLECTIONS;
    private static final SubLSymbol $sym138$RESPORATOR_TO_CYCL;
    private static final SubLSymbol $sym139$SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD;
    private static final SubLSymbol $sym140$RESPORATOR_LEARN;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym144$SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD;
    private static final SubLSymbol $sym145$RESPORATOR___LEARN;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD;
    private static final SubLSymbol $sym148$STANFORD_NER_LEARN;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$STANFORD_NER_LEARN_INT;
    private static final SubLSymbol $sym151$SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD;
    private static final SubLSymbol $sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD;
    private static final SubLList $list155;
    private static final SubLObject $list156;
    private static final SubLSymbol $sym157$STANFORD_NER;
    private static final SubLSymbol $sym158$RUN;
    private static final SubLSymbol $sym159$SET_LEXICON;
    private static final SubLSymbol $sym160$O;
    private static final SubLSymbol $sym161$GET_TYPE;
    private static final SubLSymbol $sym162$GET_CYC;
    private static final SubLSymbol $sym163$TIGHTEN_TYPE;
    private static final SubLSymbol $sym164$GET_STRING;
    private static final SubLSymbol $sym165$GET;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$ADD;
    private static final SubLString $str168$___S;
    private static final SubLSymbol $sym169$SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD;
    private static final SubLSymbol $sym170$NUMBER_LEARN;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$LEX_ENTRY_SEMTRANS;
    private static final SubLSymbol $sym174$SEMTRANS_LEXICON_NUMBER_LEARN_METHOD;
    private static final SubLList $list175;
    private static final SubLObject $const176$Number_SP;
    private static final SubLList $list177;
    private static final SubLList $list178;
    private static final SubLList $list179;
    private static final SubLSymbol $kw180$WORD_UNIT;
    private static final SubLSymbol $kw181$TRIE_ENTRY;
    private static final SubLList $list182;
    private static final SubLObject $const183$Noun;
    private static final SubLSymbol $sym184$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const185$EverythingPSC;
    private static final SubLObject $const186$Collection;
    private static final SubLSymbol $sym187$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLSymbol $kw192$PRAGMATICS;
    private static final SubLSymbol $kw193$PREDICATE;
    private static final SubLSymbol $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME;
    private static final SubLSymbol $sym195$CREATE_LEX_ENTRIES_NUMBER;
    private static final SubLList $list196;
    private static final SubLList $list197;
    private static final SubLSymbol $sym198$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD;
    private static final SubLSymbol $sym199$NOUN_COMPOUND_LEARN;
    private static final SubLList $list200;
    private static final SubLSymbol $sym201$SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD;
    private static final SubLObject $const202$genlPreds;
    private static final SubLList $list203;
    private static final SubLList $list204;
    private static final SubLList $list205;
    private static final SubLSymbol $sym206$COOCCURRENCE_STATISTICS_LEARN;
    private static final SubLList $list207;
    private static final SubLSymbol $sym208$PARSE;
    private static final SubLSymbol $sym209$YIELD;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$GET_CATEGORY;
    private static final SubLSymbol $kw212$ISA;
    private static final SubLSymbol $kw213$GENLS;
    private static final SubLObject $const214$SubCollectionNamedFn;
    private static final SubLSymbol $sym215$SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD;
    private static final SubLSymbol $sym216$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $sym217$LEX_ENTRY_P;
    private static final SubLObject $const218$InstanceFn;
    private static final SubLSymbol $sym219$INSTANCEFN_CLAUSE;
    private static final SubLList $list220;
    private static final SubLSymbol $kw221$IGNORE;
    private static final SubLSymbol $sym222$DELETE;
    private static final SubLObject $const223$InstanceNamedFn_Ternary;
    private static final SubLObject $const224$CollectionIntersection2Fn;
    private static final SubLObject $const225$BaseKB;
    private static final SubLSymbol $sym226$FORT_P;
    private static final SubLObject $const227$termOfUnit;
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1622L)
    public static SubLObject new_semtrans_lexicon() {
        return object.new_class_instance((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1710L)
    public static SubLObject get_semtrans_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (semtrans_lexicon.NIL == semtrans_lexicon_p(semtrans_lexicon.$semtrans_lexicon$.getDynamicValue(thread))) {
            semtrans_lexicon.$semtrans_lexicon$.setDynamicValue(new_semtrans_lexicon(), thread);
        }
        return semtrans_lexicon.$semtrans_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
    public static SubLObject get_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_semtrans_lexicon, (SubLObject)semtrans_lexicon.SIXTEEN_INTEGER, (SubLObject)semtrans_lexicon.$sym3$MY_TERM_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
    public static SubLObject set_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_semtrans_lexicon, value, (SubLObject)semtrans_lexicon.SIXTEEN_INTEGER, (SubLObject)semtrans_lexicon.$sym3$MY_TERM_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
    public static SubLObject subloop_reserved_initialize_semtrans_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym4$OBJECT, (SubLObject)semtrans_lexicon.$sym5$INSTANCE_COUNT, (SubLObject)semtrans_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym6$DEFAULT_EXCLUDE_MTS, (SubLObject)semtrans_lexicon.$list7);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym9$DEFAULT_BASE_MT, semtrans_lexicon.$const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym11$DEFAULT_KB_SPEC, semtrans_lexicon.$const12$AbstractLexiconSpecification);
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
    public static SubLObject subloop_reserved_initialize_semtrans_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym4$OBJECT, (SubLObject)semtrans_lexicon.$sym14$ISOLATED_P, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym4$OBJECT, (SubLObject)semtrans_lexicon.$sym15$INSTANCE_NUMBER, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym16$ALLOWED_MTS, (SubLObject)semtrans_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym18$EXCLUDED_MTS, (SubLObject)semtrans_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym19$BASE_MT, (SubLObject)semtrans_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym20$ROOT_MT, (SubLObject)semtrans_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym21$EXCLUDED_PREDS, (SubLObject)semtrans_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym22$EXCLUDED_POS_LIST, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym23$TRIE, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym24$CACHE, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym25$IGNORE_CACHE_, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym26$CASE_SENSITIVITY, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym27$ALLOW_FABRICATION_, (SubLObject)semtrans_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym28$LEARNED, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym29$ACTIVE_LEARNERS, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym30$ALLOW_STEMMING, (SubLObject)semtrans_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym31$STOP_WORDS, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym3$MY_TERM_LEXICON, (SubLObject)semtrans_lexicon.NIL);
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
    public static SubLObject semtrans_lexicon_p(final SubLObject v_semtrans_lexicon) {
        return classes.subloop_instanceof_class(v_semtrans_lexicon, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 3418L)
    public static SubLObject semtrans_lexicon_initialize_method(final SubLObject self) {
        abstract_lexicon.abstract_lexicon_initialize_method(self);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym36$EXCLUDE_PREDICATE, semtrans_lexicon.$const37$preferredNameString);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym36$EXCLUDE_PREDICATE, semtrans_lexicon.$const38$denotationPlaceholder);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym36$EXCLUDE_PREDICATE, semtrans_lexicon.$const39$denotationRelatedTo);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 3721L)
    public static SubLObject semtrans_lexicon_get_term_lexicon_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = (SubLObject)semtrans_lexicon.NIL;
        SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon(self);
        try {
            thread.throwStack.push(semtrans_lexicon.$sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                if (semtrans_lexicon.NIL == my_term_lexicon) {
                    my_term_lexicon = new_term_lexicon_from_semtrans_lexicon(self);
                }
                Dynamic.sublisp_throw((SubLObject)semtrans_lexicon.$sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, my_term_lexicon);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)semtrans_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)semtrans_lexicon.$sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 4015L)
    public static SubLObject new_term_lexicon_from_semtrans_lexicon(final SubLObject lexicon) {
        assert semtrans_lexicon.NIL != semtrans_lexicon_p(lexicon) : lexicon;
        final SubLObject v_term_lexicon = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)semtrans_lexicon.$sym46$COPY, term_lexicon.new_term_lexicon());
        return v_term_lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 4268L)
    public static SubLObject semtrans_lexicon_set_term_lexicon_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = (SubLObject)semtrans_lexicon.NIL;
        SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon(self);
        try {
            thread.throwStack.push(semtrans_lexicon.$sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                my_term_lexicon = lexicon;
                Dynamic.sublisp_throw((SubLObject)semtrans_lexicon.$sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)semtrans_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)semtrans_lexicon.$sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 4395L)
    public static SubLObject semtrans_lexicon_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push(semtrans_lexicon.$sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                assert semtrans_lexicon.NIL != Types.stringp(string) : string;
                assert semtrans_lexicon.NIL != Types.listp(keywords) : keywords;
                assert semtrans_lexicon.NIL != Types.keywordp(penn) : penn;
                Dynamic.sublisp_throw((SubLObject)semtrans_lexicon.$sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, (SubLObject)((semtrans_lexicon.NIL == allow_fabricationP) ? semtrans_lexicon.NIL : ((semtrans_lexicon.NIL != nominal_penn_tag(penn)) ? methods.funcall_instance_method_with_3_args(self, (SubLObject)semtrans_lexicon.$sym60$FABRICATE_NOMINAL, string, keywords, penn) : ((semtrans_lexicon.NIL != verbal_penn_tag(penn)) ? methods.funcall_instance_method_with_3_args(self, (SubLObject)semtrans_lexicon.$sym61$FABRICATE_VERBAL, string, keywords, penn) : ((semtrans_lexicon.NIL != adjectival_penn_tag(penn)) ? methods.funcall_instance_method_with_3_args(self, (SubLObject)semtrans_lexicon.$sym62$FABRICATE_ADJECTIVAL, string, keywords, penn) : ((semtrans_lexicon.NIL != adverbial_penn_tag(penn)) ? methods.funcall_instance_method_with_3_args(self, (SubLObject)semtrans_lexicon.$sym63$FABRICATE_ADVERBIAL, string, keywords, penn) : semtrans_lexicon.NIL))))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)semtrans_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)semtrans_lexicon.$sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5295L)
    public static SubLObject nominal_penn_tag(final SubLObject tag) {
        return conses_high.member(tag, abstract_lexicon.$nominal_tags$.getGlobalValue(), (SubLObject)semtrans_lexicon.EQ, (SubLObject)semtrans_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5376L)
    public static SubLObject verbal_penn_tag(final SubLObject tag) {
        return conses_high.member(tag, abstract_lexicon.$verbal_tags$.getGlobalValue(), (SubLObject)semtrans_lexicon.EQ, (SubLObject)semtrans_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5455L)
    public static SubLObject adjectival_penn_tag(final SubLObject tag) {
        return conses_high.member(tag, abstract_lexicon.$adjectival_tags$.getGlobalValue(), (SubLObject)semtrans_lexicon.EQ, (SubLObject)semtrans_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5542L)
    public static SubLObject adverbial_penn_tag(final SubLObject tag) {
        return conses_high.member(tag, abstract_lexicon.$adverbial_tags$.getGlobalValue(), (SubLObject)semtrans_lexicon.EQ, (SubLObject)semtrans_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5627L)
    public static SubLObject semtrans_lexicon_fabricate_nominal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert semtrans_lexicon.NIL != Types.stringp(string) : string;
        assert semtrans_lexicon.NIL != Types.listp(keywords) : keywords;
        final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, (SubLObject)ConsesLow.list(penn));
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym71$FABRICATE_NOMINAL_SEMTRANS, string, keywords));
        return (SubLObject)ConsesLow.list(lex);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 6226L)
    public static SubLObject semtrans_lexicon_fabricate_nominal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
        SubLObject literals = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = keywords;
        SubLObject keyword = (SubLObject)semtrans_lexicon.NIL;
        keyword = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            final SubLObject pcase_var = keyword;
            if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw75$NOUN)) {
                literals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, (SubLObject)ConsesLow.listS(semtrans_lexicon.$const77$ThingDescribableAsFn, (SubLObject)ConsesLow.list(semtrans_lexicon.$const78$WordFn, string), (SubLObject)semtrans_lexicon.$list79)), literals);
            }
            else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw80$POSSESSOR)) {
                literals = (SubLObject)ConsesLow.cons((SubLObject)semtrans_lexicon.$list81, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        }
        return simplifier.conjoin(literals, (SubLObject)semtrans_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 6594L)
    public static SubLObject semtrans_lexicon_fabricate_verbal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert semtrans_lexicon.NIL != Types.stringp(string) : string;
        assert semtrans_lexicon.NIL != Types.listp(keywords) : keywords;
        SubLObject lexes = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym84$FABRICATE_VERBAL_SEMTRANS, string, keywords);
        SubLObject semtrans = (SubLObject)semtrans_lexicon.NIL;
        semtrans = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
            methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, (SubLObject)ConsesLow.list(penn));
            methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, semtrans);
            lexes = (SubLObject)ConsesLow.cons(lex, lexes);
            cdolist_list_var = cdolist_list_var.rest();
            semtrans = cdolist_list_var.first();
        }
        return lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 7257L)
    public static SubLObject semtrans_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject case_sensitivity = abstract_lexicon.get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(semtrans_lexicon.$sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                if (semtrans_lexicon.NIL != subl_promotions.memberP((SubLObject)semtrans_lexicon.$kw88$ACTION, keywords, (SubLObject)semtrans_lexicon.EQ, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
                    SubLObject semtranses = (SubLObject)semtrans_lexicon.NIL;
                    SubLObject cdolist_list_var = nl_trie.nl_trie_search(string, trie, case_sensitivity);
                    SubLObject entry = (SubLObject)semtrans_lexicon.NIL;
                    entry = cdolist_list_var.first();
                    while (semtrans_lexicon.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, entry, keywords);
                        SubLObject semtrans = (SubLObject)semtrans_lexicon.NIL;
                        semtrans = cdolist_list_var_$1.first();
                        while (semtrans_lexicon.NIL != cdolist_list_var_$1) {
                            semtranses = (SubLObject)ConsesLow.cons(semtrans, semtranses);
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            semtrans = cdolist_list_var_$1.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        entry = cdolist_list_var.first();
                    }
                    if (semtrans_lexicon.NIL == semtranses) {
                        SubLObject keyword_literal = (SubLObject)semtrans_lexicon.NIL;
                        SubLObject literals = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw88$ACTION, (SubLObject)ConsesLow.listS(semtrans_lexicon.$const77$ThingDescribableAsFn, (SubLObject)ConsesLow.list(semtrans_lexicon.$const78$WordFn, string), (SubLObject)semtrans_lexicon.$list90)));
                        SubLObject cdolist_list_var2 = keywords;
                        SubLObject keyword = (SubLObject)semtrans_lexicon.NIL;
                        keyword = cdolist_list_var2.first();
                        while (semtrans_lexicon.NIL != cdolist_list_var2) {
                            keyword_literal = keyword_to_semtrans_literal(keyword, (SubLObject)semtrans_lexicon.UNPROVIDED);
                            if (semtrans_lexicon.NIL != keyword_literal) {
                                literals = (SubLObject)ConsesLow.cons(keyword_literal, literals);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            keyword = cdolist_list_var2.first();
                        }
                        if (semtrans_lexicon.NIL != literals) {
                            semtranses = (SubLObject)ConsesLow.cons(simplifier.conjoin(literals, (SubLObject)semtrans_lexicon.UNPROVIDED), semtranses);
                        }
                    }
                    Dynamic.sublisp_throw((SubLObject)semtrans_lexicon.$sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, semtranses);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)semtrans_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    abstract_lexicon.set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)semtrans_lexicon.$sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 8262L)
    public static SubLObject semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method(final SubLObject self, final SubLObject entry, final SubLObject keywords) {
        SubLObject semtranses = (SubLObject)semtrans_lexicon.NIL;
        if (semtrans_lexicon.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)semtrans_lexicon.UNPROVIDED) && semtrans_lexicon.NIL != conses_high.member((SubLObject)semtrans_lexicon.$kw88$ACTION, keywords, (SubLObject)semtrans_lexicon.EQ, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
            SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(entry);
            SubLObject denot = (SubLObject)semtrans_lexicon.NIL;
            denot = cdolist_list_var.first();
            while (semtrans_lexicon.NIL != cdolist_list_var) {
                semtranses = (SubLObject)ConsesLow.cons(denot_to_verbal_semtrans(denot, keywords), semtranses);
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            }
        }
        return semtranses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 8749L)
    public static SubLObject denot_to_verbal_semtrans(final SubLObject denot, final SubLObject keywords) {
        SubLObject literals = (SubLObject)semtrans_lexicon.NIL;
        SubLObject literal = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = keywords;
        SubLObject keyword = (SubLObject)semtrans_lexicon.NIL;
        keyword = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            literal = keyword_to_semtrans_literal(keyword, denot);
            if (semtrans_lexicon.NIL != literal) {
                literals = (SubLObject)ConsesLow.cons(literal, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        }
        return simplifier.conjoin(literals, (SubLObject)semtrans_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 9116L)
    public static SubLObject keyword_to_semtrans_literal(final SubLObject keyword, SubLObject denot) {
        if (denot == semtrans_lexicon.UNPROVIDED) {
            denot = (SubLObject)semtrans_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (semtrans_lexicon.NIL == denot) {
            return conses_high.assoc(keyword, semtrans_lexicon.$default_verbal_lex_entry_literals$.getDynamicValue(thread), (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED).rest();
        }
        final SubLObject mt = (SubLObject)semtrans_lexicon.$list95;
        if (keyword.eql((SubLObject)semtrans_lexicon.$kw88$ACTION)) {
            if (semtrans_lexicon.NIL != fort_types_interface.collectionP(denot)) {
                return (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw88$ACTION, denot);
            }
            return (SubLObject)ConsesLow.list(semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw88$ACTION, denot);
        }
        else {
            if (keyword.eql((SubLObject)semtrans_lexicon.$kw97$SUBJECT)) {
                return (SubLObject)ConsesLow.list(parsing_utilities.known_subject_roles_for_denot(denot, mt, (SubLObject)semtrans_lexicon.T), (SubLObject)semtrans_lexicon.$kw88$ACTION, (SubLObject)semtrans_lexicon.$kw97$SUBJECT);
            }
            if (keyword.eql((SubLObject)semtrans_lexicon.$kw98$OBJECT)) {
                return (SubLObject)ConsesLow.list(parsing_utilities.known_direct_object_roles_for_denot(denot, mt, (SubLObject)semtrans_lexicon.T), (SubLObject)semtrans_lexicon.$kw88$ACTION, (SubLObject)semtrans_lexicon.$kw98$OBJECT);
            }
            if (keyword.eql((SubLObject)semtrans_lexicon.$kw99$OBLIQUE_OBJECT)) {
                return (SubLObject)ConsesLow.list(parsing_utilities.known_indirect_object_roles_for_denot(denot, mt, (SubLObject)semtrans_lexicon.T), (SubLObject)semtrans_lexicon.$kw88$ACTION, (SubLObject)semtrans_lexicon.$kw99$OBLIQUE_OBJECT);
            }
            return (SubLObject)semtrans_lexicon.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 10249L)
    public static SubLObject semtrans_lexicon_fabricate_adjectival_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert semtrans_lexicon.NIL != Types.stringp(string) : string;
        assert semtrans_lexicon.NIL != Types.listp(keywords) : keywords;
        final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, (SubLObject)ConsesLow.list(penn));
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, (SubLObject)ConsesLow.listS(semtrans_lexicon.$const77$ThingDescribableAsFn, (SubLObject)ConsesLow.list(semtrans_lexicon.$const78$WordFn, string), (SubLObject)semtrans_lexicon.$list102)));
        return (SubLObject)ConsesLow.list(lex);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 10669L)
    public static SubLObject semtrans_lexicon_fabricate_adverbial_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert semtrans_lexicon.NIL != Types.stringp(string) : string;
        assert semtrans_lexicon.NIL != Types.listp(keywords) : keywords;
        final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, (SubLObject)ConsesLow.list(penn));
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw88$ACTION, (SubLObject)ConsesLow.listS(semtrans_lexicon.$const77$ThingDescribableAsFn, (SubLObject)ConsesLow.list(semtrans_lexicon.$const78$WordFn, string), (SubLObject)semtrans_lexicon.$list105)));
        return (SubLObject)ConsesLow.list(lex);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 11126L)
    public static SubLObject semtrans_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        if (semtrans_lexicon.NIL != nl_trie.nl_trie_word_p(nl_trie_entry, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD, string, nl_trie_entry);
        }
        if (semtrans_lexicon.NIL != nl_trie.nl_trie_name_p(nl_trie_entry, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME, string, nl_trie_entry);
        }
        if (semtrans_lexicon.NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, string, nl_trie_entry);
        }
        if (semtrans_lexicon.NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(nl_trie_entry, (SubLObject)semtrans_lexicon.$sym46$COPY));
        }
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 12087L)
    public static SubLObject semtrans_lexicon_textract_lemma_to_lex_entry_method(final SubLObject self, final SubLObject lemma) {
        SubLObject cycl = (SubLObject)semtrans_lexicon.NIL;
        SubLObject lex_entry = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject pcase_var = abstract_lexicon.textract_lemma_type(lemma);
        if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw117$PERSON)) {
            cycl = (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)semtrans_lexicon.$list119, (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, abstract_lexicon.textract_lemma_string(lemma)));
        }
        else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw121$PERSON_)) {
            cycl = (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)semtrans_lexicon.$list119, (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, abstract_lexicon.textract_lemma_string(lemma)));
        }
        else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw122$PLACE)) {
            cycl = (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)semtrans_lexicon.$list123, (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, abstract_lexicon.textract_lemma_string(lemma)));
        }
        else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw124$PLACE_)) {
            cycl = (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)semtrans_lexicon.$list123, (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, abstract_lexicon.textract_lemma_string(lemma)));
        }
        else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw125$ORG)) {
            cycl = (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)semtrans_lexicon.$list126, (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, abstract_lexicon.textract_lemma_string(lemma)));
        }
        else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw127$UNAME)) {
            cycl = (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, abstract_lexicon.textract_lemma_string(lemma));
        }
        else {
            cycl = (SubLObject)semtrans_lexicon.NIL;
        }
        if (semtrans_lexicon.NIL != cycl) {
            lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, semtrans_lexicon.$const129$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(cycl));
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, abstract_lexicon.textract_lemma_string(lemma));
        }
        return lex_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 13527L)
    public static SubLObject semtrans_lexicon_resporator_to_lex_entries_method(final SubLObject self, final SubLObject typeXstring) {
        SubLObject lex_entries = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym138$RESPORATOR_TO_CYCL, typeXstring);
        SubLObject parse = (SubLObject)semtrans_lexicon.NIL;
        parse = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, typeXstring.rest());
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, semtrans_lexicon.$const129$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, parse), (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, typeXstring.rest())));
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, methods.funcall_class_method_with_1_args((SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.$sym137$RESPORATOR_TO_INFLECTIONS, typeXstring));
            lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return lex_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 14179L)
    public static SubLObject semtrans_lexicon_resporator_learn_method(final SubLObject self, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert semtrans_lexicon.NIL != Types.stringp(text) : text;
        SubLObject lexes = (SubLObject)semtrans_lexicon.NIL;
        SubLObject typings = (SubLObject)semtrans_lexicon.NIL;
        SubLObject errorP = (SubLObject)semtrans_lexicon.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)semtrans_lexicon.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    typings = external_interfaces.resporator(text, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)semtrans_lexicon.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            errorP = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (semtrans_lexicon.NIL != errorP) {
            Errors.warn(errorP);
            return (SubLObject)semtrans_lexicon.NIL;
        }
        SubLObject cdolist_list_var = typings;
        SubLObject typeXstring = (SubLObject)semtrans_lexicon.NIL;
        typeXstring = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym133$RESPORATOR_TO_LEX_ENTRIES, typeXstring);
            SubLObject lex = (SubLObject)semtrans_lexicon.NIL;
            lex = cdolist_list_var_$2.first();
            while (semtrans_lexicon.NIL != cdolist_list_var_$2) {
                lexes = (SubLObject)ConsesLow.cons(lex, lexes);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                lex = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        }
        return lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 14912L)
    public static SubLObject semtrans_lexicon_resporatorXX_learn_method(final SubLObject self, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert semtrans_lexicon.NIL != Types.stringp(text) : text;
        SubLObject lexes = (SubLObject)semtrans_lexicon.NIL;
        SubLObject typings = (SubLObject)semtrans_lexicon.NIL;
        SubLObject errorP = (SubLObject)semtrans_lexicon.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)semtrans_lexicon.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    typings = external_interfaces.resporatorXX(text);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)semtrans_lexicon.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            errorP = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (semtrans_lexicon.NIL != errorP) {
            Errors.warn(errorP);
            return (SubLObject)semtrans_lexicon.NIL;
        }
        SubLObject cdolist_list_var = typings;
        SubLObject typeXstring = (SubLObject)semtrans_lexicon.NIL;
        typeXstring = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym133$RESPORATOR_TO_LEX_ENTRIES, typeXstring);
            SubLObject lex = (SubLObject)semtrans_lexicon.NIL;
            lex = cdolist_list_var_$3.first();
            while (semtrans_lexicon.NIL != cdolist_list_var_$3) {
                lexes = (SubLObject)ConsesLow.cons(lex, lexes);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                lex = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        }
        return lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 15859L)
    public static SubLObject semtrans_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text) {
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym150$STANFORD_NER_LEARN_INT, text, (SubLObject)semtrans_lexicon.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 15990L)
    public static SubLObject semtrans_lexicon_stanford_ner_learn_tightened_types_method(final SubLObject self, final SubLObject text) {
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)semtrans_lexicon.$sym150$STANFORD_NER_LEARN_INT, text, (SubLObject)semtrans_lexicon.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 16135L)
    public static SubLObject semtrans_lexicon_stanford_ner_learn_int_method(final SubLObject self, final SubLObject text, final SubLObject tighten_typesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert semtrans_lexicon.NIL != Types.stringp(text) : text;
        SubLObject new_lexes = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject sner = object.new_class_instance((SubLObject)semtrans_lexicon.$sym157$STANFORD_NER);
        final SubLObject entity_clusters = methods.funcall_instance_method_with_1_args(sner, (SubLObject)semtrans_lexicon.$sym158$RUN, text);
        final SubLObject v_term_lexicon = methods.funcall_instance_method_with_0_args(self, (SubLObject)semtrans_lexicon.$sym41$GET_TERM_LEXICON);
        SubLObject error = (SubLObject)semtrans_lexicon.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)semtrans_lexicon.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject cdolist_list_var = entity_clusters;
                    SubLObject ec = (SubLObject)semtrans_lexicon.NIL;
                    ec = cdolist_list_var.first();
                    while (semtrans_lexicon.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$4 = ec;
                        SubLObject nament = (SubLObject)semtrans_lexicon.NIL;
                        nament = cdolist_list_var_$4.first();
                        while (semtrans_lexicon.NIL != cdolist_list_var_$4) {
                            methods.funcall_instance_method_with_1_args(nament, (SubLObject)semtrans_lexicon.$sym159$SET_LEXICON, v_term_lexicon);
                            if (!semtrans_lexicon.$sym160$O.eql(methods.funcall_instance_method_with_0_args(nament, (SubLObject)semtrans_lexicon.$sym161$GET_TYPE))) {
                                final SubLObject type = methods.funcall_instance_method_with_0_args(nament, (SubLObject)semtrans_lexicon.$sym162$GET_CYC);
                                final SubLObject subtypes = (SubLObject)((semtrans_lexicon.NIL != tighten_typesP && semtrans_lexicon.NIL != type) ? methods.funcall_instance_method_with_0_args(nament, (SubLObject)semtrans_lexicon.$sym163$TIGHTEN_TYPE).first() : semtrans_lexicon.NIL);
                                final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning(nament);
                                final SubLObject string = methods.funcall_instance_method_with_0_args(nament, (SubLObject)semtrans_lexicon.$sym164$GET_STRING);
                                final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(v_term_lexicon, (SubLObject)semtrans_lexicon.$sym165$GET, string);
                                SubLObject entity_lexes = (SubLObject)semtrans_lexicon.NIL;
                                if (semtrans_lexicon.NIL != instance_meanings) {
                                    SubLObject cdolist_list_var_$5 = instance_meanings;
                                    SubLObject instance_meaning = (SubLObject)semtrans_lexicon.NIL;
                                    instance_meaning = cdolist_list_var_$5.first();
                                    while (semtrans_lexicon.NIL != cdolist_list_var_$5) {
                                        final SubLObject lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw75$NOUN, instance_meaning));
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, (SubLObject)semtrans_lexicon.$list166);
                                        if (semtrans_lexicon.NIL == contains_semtrans_lexicon_usable_entryP(existing_entries)) {
                                            methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym167$ADD, lex_entry);
                                            entity_lexes = (SubLObject)ConsesLow.cons(lex_entry, entity_lexes);
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        instance_meaning = cdolist_list_var_$5.first();
                                    }
                                }
                                else {
                                    SubLObject cdolist_list_var_$6 = subtypes;
                                    SubLObject subtype = (SubLObject)semtrans_lexicon.NIL;
                                    subtype = cdolist_list_var_$6.first();
                                    while (semtrans_lexicon.NIL != cdolist_list_var_$6) {
                                        final SubLObject lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, subtype), (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, string)));
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
                                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, (SubLObject)semtrans_lexicon.$list166);
                                        if (semtrans_lexicon.NIL == contains_semtrans_lexicon_usable_entryP(existing_entries)) {
                                            methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym167$ADD, lex_entry);
                                            entity_lexes = (SubLObject)ConsesLow.cons(lex_entry, entity_lexes);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        subtype = cdolist_list_var_$6.first();
                                    }
                                }
                                if (semtrans_lexicon.NIL == entity_lexes && semtrans_lexicon.NIL != type) {
                                    final SubLObject lex_entry2 = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
                                    final SubLObject existing_entries_$7 = methods.funcall_instance_method_with_1_args(v_term_lexicon, (SubLObject)semtrans_lexicon.$sym165$GET, string);
                                    methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
                                    methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const118$and, (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, type), (SubLObject)ConsesLow.list(semtrans_lexicon.$const120$nameString, (SubLObject)semtrans_lexicon.$kw75$NOUN, string)));
                                    methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
                                    methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, (SubLObject)semtrans_lexicon.$list166);
                                    if (semtrans_lexicon.NIL == contains_semtrans_lexicon_usable_entryP(existing_entries_$7)) {
                                        methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym167$ADD, lex_entry2);
                                        entity_lexes = (SubLObject)ConsesLow.cons(lex_entry2, entity_lexes);
                                    }
                                }
                                final SubLObject items_var = entity_lexes;
                                if (items_var.isVector()) {
                                    final SubLObject vector_var = items_var;
                                    final SubLObject backwardP_var = (SubLObject)semtrans_lexicon.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject element_num;
                                    SubLObject item;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)semtrans_lexicon.NIL, v_iteration = (SubLObject)semtrans_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)semtrans_lexicon.ONE_INTEGER)) {
                                        element_num = ((semtrans_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)semtrans_lexicon.ONE_INTEGER) : v_iteration);
                                        item = Vectors.aref(vector_var, element_num);
                                        new_lexes = (SubLObject)ConsesLow.cons(item, new_lexes);
                                    }
                                }
                                else {
                                    SubLObject cdolist_list_var_$7 = items_var;
                                    SubLObject item2 = (SubLObject)semtrans_lexicon.NIL;
                                    item2 = cdolist_list_var_$7.first();
                                    while (semtrans_lexicon.NIL != cdolist_list_var_$7) {
                                        new_lexes = (SubLObject)ConsesLow.cons(item2, new_lexes);
                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                        item2 = cdolist_list_var_$7.first();
                                    }
                                }
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            nament = cdolist_list_var_$4.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ec = cdolist_list_var.first();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)semtrans_lexicon.NIL);
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
        if (semtrans_lexicon.NIL != error) {
            Errors.warn((SubLObject)semtrans_lexicon.$str168$___S, error);
        }
        return new_lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 18911L)
    public static SubLObject contains_semtrans_lexicon_usable_entryP(final SubLObject lex_entries) {
        SubLObject usableP = (SubLObject)semtrans_lexicon.NIL;
        if (semtrans_lexicon.NIL == usableP) {
            SubLObject csome_list_var = lex_entries;
            SubLObject entry = (SubLObject)semtrans_lexicon.NIL;
            entry = csome_list_var.first();
            while (semtrans_lexicon.NIL == usableP && semtrans_lexicon.NIL != csome_list_var) {
                if (semtrans_lexicon.NIL == abstract_lexicon.lex_entry_p(abstract_lexicon.lex_entry_trie_entry(entry))) {
                    usableP = (SubLObject)semtrans_lexicon.T;
                }
                else if (semtrans_lexicon.NIL != abstract_lexicon.lex_entry_p(entry) && semtrans_lexicon.NIL != abstract_lexicon.lex_entry_semtrans(entry)) {
                    usableP = (SubLObject)semtrans_lexicon.T;
                }
                else {
                    usableP = (SubLObject)semtrans_lexicon.NIL;
                }
                csome_list_var = csome_list_var.rest();
                entry = csome_list_var.first();
            }
        }
        return usableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 19281L)
    public static SubLObject semtrans_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject numbers = abstract_lexicon.number_meanings(text);
        SubLObject result = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = numbers;
        SubLObject number = (SubLObject)semtrans_lexicon.NIL;
        number = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = number;
            SubLObject number_string = (SubLObject)semtrans_lexicon.NIL;
            SubLObject meaning = (SubLObject)semtrans_lexicon.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semtrans_lexicon.$list172);
            number_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semtrans_lexicon.$list172);
            meaning = current.first();
            current = current.rest();
            if (semtrans_lexicon.NIL == current) {
                final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym165$GET, number_string);
                final SubLObject already_known = subl_promotions.memberP(meaning, known_entries, (SubLObject)semtrans_lexicon.EQUAL, (SubLObject)semtrans_lexicon.$sym173$LEX_ENTRY_SEMTRANS);
                if (semtrans_lexicon.NIL == already_known) {
                    final SubLObject lex_entry = number_semtrans_lex_entry(number_string, meaning);
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)semtrans_lexicon.$sym167$ADD, lex_entry);
                    result = (SubLObject)ConsesLow.cons(lex_entry, result);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semtrans_lexicon.$list172);
            }
            cdolist_list_var = cdolist_list_var.rest();
            number = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 19829L)
    public static SubLObject number_semtrans_lex_entry(final SubLObject string, final SubLObject number) {
        final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, (SubLObject)semtrans_lexicon.$list175);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, semtrans_lexicon.$const176$Number_SP);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list(semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw75$NOUN, number));
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 20301L)
    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lex_entries = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, (SubLObject)semtrans_lexicon.NIL);
        if (semtrans_lexicon.NIL != lexicon_vars.semtrans_predP(pred)) {
            SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
            SubLObject semtrans = (SubLObject)semtrans_lexicon.NIL;
            semtrans = cdolist_list_var.first();
            while (semtrans_lexicon.NIL != cdolist_list_var) {
                final SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, (SubLObject)semtrans_lexicon.UNPROVIDED);
                final SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
                final SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
                final SubLObject inflections = (SubLObject)((semtrans_lexicon.NIL != wu) ? pph_utilities.pph_filter_preds(lexicon_accessors.preds_of_stringXword(string, wu, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED), lexicon_utilities.preds_of_pos(pos, (SubLObject)semtrans_lexicon.UNPROVIDED), (SubLObject)semtrans_lexicon.UNPROVIDED) : semtrans_lexicon.$list179);
                final SubLObject lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, pos);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, semtrans);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, frame);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw180$WORD_UNIT, wu);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, inflections);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw181$TRIE_ENTRY, nl_trie_entry);
                lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
                cdolist_list_var = cdolist_list_var.rest();
                semtrans = cdolist_list_var.first();
            }
        }
        else if (semtrans_lexicon.NIL != semtrans_lexicon.$manufacture_semtrans_assertionsP$.getDynamicValue(thread) && semtrans_lexicon.NIL != subl_promotions.memberP(pred, (SubLObject)semtrans_lexicon.$list182, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED) && semtrans_lexicon.NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), semtrans_lexicon.$const183$Noun, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)semtrans_lexicon.$sym184$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(semtrans_lexicon.$const185$EverythingPSC, thread);
                SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots(nl_trie_entry);
                SubLObject denot = (SubLObject)semtrans_lexicon.NIL;
                denot = cdolist_list_var2.first();
                while (semtrans_lexicon.NIL != cdolist_list_var2) {
                    if (semtrans_lexicon.NIL == fort_types_interface.predicate_p(denot)) {
                        final SubLObject lex_entry2 = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list((semtrans_lexicon.NIL != isa.isa_in_any_mtP(denot, semtrans_lexicon.$const186$Collection)) ? semtrans_lexicon.$const76$isa : semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw75$NOUN, cycl_utilities.hl_to_el(denot)));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw180$WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, (SubLObject)semtrans_lexicon.NIL));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw181$TRIE_ENTRY, nl_trie_entry);
                        lex_entries = (SubLObject)ConsesLow.cons(lex_entry2, lex_entries);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    denot = cdolist_list_var2.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return lex_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 22460L)
    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_name_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        SubLObject lex_entries = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_entry);
        SubLObject denot = (SubLObject)semtrans_lexicon.NIL;
        denot = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
            final SubLObject collectionP = fort_types_interface.collection_p(denot);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list((semtrans_lexicon.NIL != collectionP) ? semtrans_lexicon.$const76$isa : semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw75$NOUN, cycl_utilities.hl_to_el(denot)));
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, semtrans_lexicon.$const129$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, (SubLObject)semtrans_lexicon.$list166);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw181$TRIE_ENTRY, nl_trie_entry);
            lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        return lex_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 23397L)
    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry) {
        SubLObject lex_entries = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject pos = nl_trie.nl_trie_entry_pos(tp_entry);
        final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds(tp_entry);
        final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(tp_entry, (SubLObject)semtrans_lexicon.NIL);
        final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(tp_entry);
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(tp_entry);
        SubLObject denot = (SubLObject)semtrans_lexicon.NIL;
        denot = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
            final SubLObject collectionP = fort_types_interface.collection_p(denot);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw192$PRAGMATICS, pragmatics);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, (SubLObject)ConsesLow.list((semtrans_lexicon.NIL != collectionP) ? semtrans_lexicon.$const76$isa : semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw75$NOUN, cycl_utilities.hl_to_el(denot)));
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw193$PREDICATE, predicate);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, pos);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, inflections);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw181$TRIE_ENTRY, tp_entry);
            lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        return lex_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 24304L)
    public static SubLObject semtrans_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string) {
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 24436L)
    public static SubLObject semtrans_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
        return text_noun_compound_semtrans_lex_entries(text);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 24784L)
    public static SubLObject noun_compound_semtrans_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number) {
        final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
        final SubLObject penn_tags = (SubLObject)((semtrans_lexicon.NIL != backward.removal_ask((SubLObject)ConsesLow.listS(semtrans_lexicon.$const202$genlPreds, number, (SubLObject)semtrans_lexicon.$list203), (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED)) ? semtrans_lexicon.$list204 : semtrans_lexicon.$list205);
        final SubLObject base_sem_trans = (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, denotation);
        final SubLObject reformulated_sem_trans = reformulator_hub.reformulate_cycl(base_sem_trans, semtrans_lexicon.$const185$EverythingPSC, (SubLObject)semtrans_lexicon.UNPROVIDED);
        final SubLObject final_sem_trans = (semtrans_lexicon.NIL != reformulated_sem_trans) ? reformulated_sem_trans : base_sem_trans;
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, penn_tags);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw128$CYC_POS, semtrans_lexicon.$const183$Noun);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, final_sem_trans);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw136$INFLECTIONS, (SubLObject)ConsesLow.list(number));
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 25479L)
    public static SubLObject text_noun_compound_semtrans_lex_entries(final SubLObject str) {
        final SubLObject compounds = abstract_lexicon.noun_compound_meanings(str);
        SubLObject res = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var = compounds;
        SubLObject compound = (SubLObject)semtrans_lexicon.NIL;
        compound = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = compound.rest();
            SubLObject meaning = (SubLObject)semtrans_lexicon.NIL;
            meaning = cdolist_list_var_$9.first();
            while (semtrans_lexicon.NIL != cdolist_list_var_$9) {
                res = (SubLObject)ConsesLow.cons(noun_compound_semtrans_lex_entry(compound.first(), meaning.first(), conses_high.second(meaning)), res);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                meaning = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            compound = cdolist_list_var.first();
        }
        return res;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 25816L)
    public static SubLObject semtrans_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject parse = methods.funcall_instance_method_with_1_args(parser.new_stanford_parser((SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED), (SubLObject)semtrans_lexicon.$sym208$PARSE, text);
        final SubLObject words = (SubLObject)((semtrans_lexicon.NIL != parse) ? methods.funcall_instance_method_with_0_args(parse, (SubLObject)semtrans_lexicon.$sym209$YIELD) : semtrans_lexicon.NIL);
        SubLObject lexes = (SubLObject)semtrans_lexicon.NIL;
        SubLObject cdolist_list_var;
        final SubLObject learned_nouns = cdolist_list_var = (SubLObject)semtrans_lexicon.NIL;
        SubLObject learned_noun = (SubLObject)semtrans_lexicon.NIL;
        learned_noun = cdolist_list_var.first();
        while (semtrans_lexicon.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = learned_noun;
            SubLObject learned_string = (SubLObject)semtrans_lexicon.NIL;
            SubLObject type = (SubLObject)semtrans_lexicon.NIL;
            SubLObject relationship = (SubLObject)semtrans_lexicon.NIL;
            SubLObject confidence = (SubLObject)semtrans_lexicon.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semtrans_lexicon.$list210);
            learned_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semtrans_lexicon.$list210);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semtrans_lexicon.$list210);
            relationship = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semtrans_lexicon.$list210);
            confidence = current.first();
            current = current.rest();
            if (semtrans_lexicon.NIL == current) {
                SubLObject penn_tags = (SubLObject)semtrans_lexicon.NIL;
                SubLObject parsed_string = (SubLObject)semtrans_lexicon.NIL;
                SubLObject singularized_string = (SubLObject)semtrans_lexicon.NIL;
                SubLObject semtrans = (SubLObject)semtrans_lexicon.NIL;
                if (semtrans_lexicon.NIL == penn_tags) {
                    SubLObject csome_list_var = words;
                    SubLObject word = (SubLObject)semtrans_lexicon.NIL;
                    word = csome_list_var.first();
                    while (semtrans_lexicon.NIL == penn_tags && semtrans_lexicon.NIL != csome_list_var) {
                        parsed_string = methods.funcall_instance_method_with_0_args(word, (SubLObject)semtrans_lexicon.$sym164$GET_STRING);
                        if (semtrans_lexicon.NIL != parsed_string) {
                            singularized_string = lexification_utilities.singularize_word(parsed_string, (SubLObject)semtrans_lexicon.UNPROVIDED);
                        }
                        if (singularized_string.equalp(learned_string)) {
                            penn_tags = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(word, (SubLObject)semtrans_lexicon.$sym211$GET_CATEGORY), penn_tags);
                        }
                        csome_list_var = csome_list_var.rest();
                        word = csome_list_var.first();
                    }
                }
                final SubLObject pcase_var = relationship;
                if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw212$ISA)) {
                    semtrans = (SubLObject)ConsesLow.list(semtrans_lexicon.$const96$equals, (SubLObject)semtrans_lexicon.$kw75$NOUN, type);
                }
                else if (pcase_var.eql((SubLObject)semtrans_lexicon.$kw213$GENLS)) {
                    semtrans = (SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, (SubLObject)semtrans_lexicon.$kw75$NOUN, (SubLObject)ConsesLow.list(semtrans_lexicon.$const214$SubCollectionNamedFn, singularized_string, type));
                }
                if (semtrans_lexicon.NIL != penn_tags && semtrans_lexicon.NIL != semtrans) {
                    final SubLObject lex = object.new_class_instance((SubLObject)semtrans_lexicon.$sym66$LEX_ENTRY);
                    methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw68$STRING, parsed_string);
                    methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw69$PENN_TAGS, penn_tags);
                    methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw130$FRAME, semtrans_lexicon.$const131$RegularNounFrame);
                    methods.funcall_instance_method_with_2_args(lex, (SubLObject)semtrans_lexicon.$sym67$SET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS, semtrans);
                    lexes = (SubLObject)ConsesLow.cons(lex, lexes);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semtrans_lexicon.$list210);
            }
            cdolist_list_var = cdolist_list_var.rest();
            learned_noun = cdolist_list_var.first();
        }
        return lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 27246L)
    public static SubLObject semtrans_lexicon_from_term_lexicon(final SubLObject v_term_lexicon) {
        final SubLObject v_semtrans_lexicon = new_semtrans_lexicon();
        instances.set_slot(v_semtrans_lexicon, (SubLObject)semtrans_lexicon.$sym11$DEFAULT_KB_SPEC, instances.get_slot(v_term_lexicon, (SubLObject)semtrans_lexicon.$sym11$DEFAULT_KB_SPEC));
        methods.funcall_instance_method_with_1_args(v_semtrans_lexicon, (SubLObject)semtrans_lexicon.$sym216$SET_CASE_SENSITIVITY, instances.get_slot(v_term_lexicon, (SubLObject)semtrans_lexicon.$sym26$CASE_SENSITIVITY));
        return v_semtrans_lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 27588L)
    public static SubLObject extract_cycl_from_semtrans_lex_entry(final SubLObject lex_entry, SubLObject lexicon) {
        if (lexicon == semtrans_lexicon.UNPROVIDED) {
            lexicon = (SubLObject)semtrans_lexicon.NIL;
        }
        assert semtrans_lexicon.NIL != abstract_lexicon.lex_entry_p(lex_entry) : lex_entry;
        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)semtrans_lexicon.$sym165$GET, (SubLObject)semtrans_lexicon.$kw70$SEMTRANS);
        return extract_cycl_from_semtrans_sentence(semtrans, lexicon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 28204L)
    public static SubLObject extract_cycl_from_semtrans_sentence(SubLObject semtrans, SubLObject lexicon) {
        if (lexicon == semtrans_lexicon.UNPROVIDED) {
            lexicon = (SubLObject)semtrans_lexicon.NIL;
        }
        SubLObject concise_cycl = (SubLObject)semtrans_lexicon.NIL;
        if (semtrans_lexicon.NIL != likely_ner_result_semtransP(semtrans, lexicon)) {
            concise_cycl = extract_concise_cycl_from_ner_semtrans(semtrans, lexicon);
        }
        else if (cycl_utilities.formula_arg0(semtrans).eql(semtrans_lexicon.$const76$isa)) {
            concise_cycl = cycl_utilities.formula_arg2(semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED);
        }
        else if (cycl_utilities.formula_arg0(semtrans).eql(semtrans_lexicon.$const96$equals)) {
            concise_cycl = cycl_utilities.formula_arg2(semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED);
        }
        else if (semtrans_lexicon.NIL != cycl_grammar.cycl_formula_p(cycl_utilities.formula_arg1(semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED))) {
            if (semtrans_lexicon.NIL != cycl_utilities.expression_find(semtrans_lexicon.$const218$InstanceFn, semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED)) {
                semtrans = simplifier.simplify_cycl_sentence_syntax(semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED);
                semtrans = Sequences.remove_if((SubLObject)semtrans_lexicon.$sym219$INSTANCEFN_CLAUSE, semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED);
            }
            if (semtrans_lexicon.NIL == concise_cycl) {
                SubLObject csome_list_var = semtrans;
                SubLObject clause = (SubLObject)semtrans_lexicon.NIL;
                clause = csome_list_var.first();
                while (semtrans_lexicon.NIL == concise_cycl && semtrans_lexicon.NIL != csome_list_var) {
                    final SubLObject pred = cycl_utilities.formula_arg0(clause);
                    if (pred.eql(semtrans_lexicon.$const76$isa)) {
                        concise_cycl = cycl_utilities.formula_arg2(clause, (SubLObject)semtrans_lexicon.UNPROVIDED);
                    }
                    else if (pred.eql(semtrans_lexicon.$const96$equals) && (semtrans_lexicon.NIL == narts_high.naut_p(cycl_utilities.formula_arg2(clause, (SubLObject)semtrans_lexicon.UNPROVIDED)) || !cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(clause, (SubLObject)semtrans_lexicon.UNPROVIDED)).eql(semtrans_lexicon.$const218$InstanceFn))) {
                        concise_cycl = cycl_utilities.formula_arg2(clause, (SubLObject)semtrans_lexicon.UNPROVIDED);
                    }
                    csome_list_var = csome_list_var.rest();
                    clause = csome_list_var.first();
                }
            }
        }
        if (concise_cycl.isKeyword() || semtrans_lexicon.NIL == concise_cycl) {
            concise_cycl = semtrans;
        }
        if (concise_cycl.isKeyword()) {
            concise_cycl = (SubLObject)semtrans_lexicon.NIL;
        }
        return narts_high.nart_substitute(concise_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 29451L)
    public static SubLObject instancefn_clause(final SubLObject clause) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.formula_arg0(clause).eql(semtrans_lexicon.$const96$equals) && cycl_utilities.formula_arg_position(clause, (SubLObject)semtrans_lexicon.$list220, (SubLObject)semtrans_lexicon.UNPROVIDED).eql(semtrans_lexicon.$const218$InstanceFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 29608L)
    public static SubLObject likely_ner_result_semtransP(final SubLObject semtrans, SubLObject lexicon) {
        if (lexicon == semtrans_lexicon.UNPROVIDED) {
            lexicon = (SubLObject)semtrans_lexicon.NIL;
        }
        SubLObject isa_restriction = (SubLObject)semtrans_lexicon.NIL;
        SubLObject name = (SubLObject)semtrans_lexicon.NIL;
        final SubLObject instancefnP = (SubLObject)semtrans_lexicon.NIL;
        SubLObject other_stuffP = (SubLObject)semtrans_lexicon.NIL;
        if (semtrans.isList()) {
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(simplifier.simplify_cycl_sentence_syntax(semtrans, (SubLObject)semtrans_lexicon.UNPROVIDED), (SubLObject)semtrans_lexicon.$kw221$IGNORE);
            SubLObject clause = (SubLObject)semtrans_lexicon.NIL;
            clause = cdolist_list_var.first();
            while (semtrans_lexicon.NIL != cdolist_list_var) {
                if (semtrans_lexicon.NIL != el_utilities.el_formula_p(clause)) {
                    if (cycl_utilities.formula_arg0(clause).eql(semtrans_lexicon.$const76$isa) && semtrans_lexicon.NIL == isa_restriction) {
                        isa_restriction = cycl_utilities.formula_arg2(clause, (SubLObject)semtrans_lexicon.UNPROVIDED);
                    }
                    else if (cycl_utilities.formula_arg0(clause).eql(semtrans_lexicon.$const120$nameString)) {
                        name = cycl_utilities.formula_arg2(clause, (SubLObject)semtrans_lexicon.UNPROVIDED);
                    }
                    else {
                        other_stuffP = (SubLObject)semtrans_lexicon.T;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            if (semtrans_lexicon.NIL != isa_restriction && semtrans_lexicon.NIL != name) {
                return get_infnt_nart_with_specification(name, isa_restriction, lexicon);
            }
        }
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 30467L)
    public static SubLObject extract_concise_cycl_from_ner_semtrans(final SubLObject semtrans, SubLObject lexicon) {
        if (lexicon == semtrans_lexicon.UNPROVIDED) {
            lexicon = (SubLObject)semtrans_lexicon.NIL;
        }
        return likely_ner_result_semtransP(semtrans, lexicon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 30608L)
    public static SubLObject get_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction, SubLObject lexicon) {
        if (lexicon == semtrans_lexicon.UNPROVIDED) {
            lexicon = (SubLObject)semtrans_lexicon.NIL;
        }
        SubLObject result = (SubLObject)semtrans_lexicon.NIL;
        result = find_infnt_nart_with_specification(name, isa_restriction);
        if (semtrans_lexicon.NIL == result) {
            if (semtrans_lexicon.NIL != lexicon) {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)semtrans_lexicon.$sym222$DELETE, name);
            }
            result = czer_main.cyc_find_or_create_nart((SubLObject)ConsesLow.list(semtrans_lexicon.$const223$InstanceNamedFn_Ternary, name, isa_restriction, Guids.guid_to_string(Guids.new_guid())), (SubLObject)semtrans_lexicon.UNPROVIDED);
            if (cycl_utilities.formula_arg0(isa_restriction).equal(semtrans_lexicon.$const224$CollectionIntersection2Fn)) {
                SubLObject cdolist_list_var = cycl_utilities.formula_args(isa_restriction, (SubLObject)semtrans_lexicon.UNPROVIDED);
                SubLObject v_isa = (SubLObject)semtrans_lexicon.NIL;
                v_isa = cdolist_list_var.first();
                while (semtrans_lexicon.NIL != cdolist_list_var) {
                    ke.ke_assert_now((SubLObject)ConsesLow.list(semtrans_lexicon.$const76$isa, result, v_isa), semtrans_lexicon.$const225$BaseKB, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 31317L)
    public static SubLObject find_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction) {
        final SubLObject isa_forts = cycl_utilities.expression_gather(isa_restriction, (SubLObject)semtrans_lexicon.$sym226$FORT_P, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED, (SubLObject)semtrans_lexicon.UNPROVIDED);
        final SubLObject tou_asserts = virtual_indexing.assertions_mentioning_terms((SubLObject)ConsesLow.cons(semtrans_lexicon.$const227$termOfUnit, isa_forts), (SubLObject)semtrans_lexicon.UNPROVIDED);
        SubLObject result = (SubLObject)semtrans_lexicon.NIL;
        if (semtrans_lexicon.NIL == result) {
            SubLObject csome_list_var = tou_asserts;
            SubLObject v_assert = (SubLObject)semtrans_lexicon.NIL;
            v_assert = csome_list_var.first();
            while (semtrans_lexicon.NIL == result && semtrans_lexicon.NIL != csome_list_var) {
                final SubLObject nart = (SubLObject)(cycl_utilities.formula_arg0(v_assert).eql(semtrans_lexicon.$const227$termOfUnit) ? cycl_utilities.formula_arg1(v_assert, (SubLObject)semtrans_lexicon.UNPROVIDED) : semtrans_lexicon.NIL);
                if (cycl_utilities.formula_arg0(nart).eql(semtrans_lexicon.$const223$InstanceNamedFn_Ternary) && cycl_utilities.formula_arg1(nart, (SubLObject)semtrans_lexicon.UNPROVIDED).equal(name) && cycl_utilities.formula_arg2(nart, (SubLObject)semtrans_lexicon.UNPROVIDED).equal(isa_restriction)) {
                    result = nart;
                }
                csome_list_var = csome_list_var.rest();
                v_assert = csome_list_var.first();
            }
        }
        return result;
    }
    
    public static SubLObject declare_semtrans_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "new_semtrans_lexicon", "NEW-SEMTRANS-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "get_semtrans_lexicon", "GET-SEMTRANS-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "get_semtrans_lexicon_my_term_lexicon", "GET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "set_semtrans_lexicon_my_term_lexicon", "SET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "subloop_reserved_initialize_semtrans_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "subloop_reserved_initialize_semtrans_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_p", "SEMTRANS-LEXICON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_initialize_method", "SEMTRANS-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_get_term_lexicon_method", "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "new_term_lexicon_from_semtrans_lexicon", "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_set_term_lexicon_method", "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_method", "SEMTRANS-LEXICON-FABRICATE-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "nominal_penn_tag", "NOMINAL-PENN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "verbal_penn_tag", "VERBAL-PENN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "adjectival_penn_tag", "ADJECTIVAL-PENN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "adverbial_penn_tag", "ADVERBIAL-PENN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_nominal_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_nominal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_verbal_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_verbal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method", "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "denot_to_verbal_semtrans", "DENOT-TO-VERBAL-SEMTRANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "keyword_to_semtrans_literal", "KEYWORD-TO-SEMTRANS-LITERAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_adjectival_method", "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_fabricate_adverbial_method", "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_create_lex_entries_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_textract_lemma_to_lex_entry_method", "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_resporator_to_lex_entries_method", "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_resporator_learn_method", "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_resporatorXX_learn_method", "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_stanford_ner_learn_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_stanford_ner_learn_tightened_types_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_stanford_ner_learn_int_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "contains_semtrans_lexicon_usable_entryP", "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_number_learn_method", "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "number_semtrans_lex_entry", "NUMBER-SEMTRANS-LEX-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_create_lex_entries_nl_trie_word_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_create_lex_entries_nl_trie_name_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_create_lex_entries_number_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_noun_compound_learn_method", "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "noun_compound_semtrans_lex_entry", "NOUN-COMPOUND-SEMTRANS-LEX-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "text_noun_compound_semtrans_lex_entries", "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_cooccurrence_statistics_learn_method", "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "semtrans_lexicon_from_term_lexicon", "SEMTRANS-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "extract_cycl_from_semtrans_lex_entry", "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "extract_cycl_from_semtrans_sentence", "EXTRACT-CYCL-FROM-SEMTRANS-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "instancefn_clause", "INSTANCEFN-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "likely_ner_result_semtransP", "LIKELY-NER-RESULT-SEMTRANS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "extract_concise_cycl_from_ner_semtrans", "EXTRACT-CONCISE-CYCL-FROM-NER-SEMTRANS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "get_infnt_nart_with_specification", "GET-INFNT-NART-WITH-SPECIFICATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semtrans_lexicon", "find_infnt_nart_with_specification", "FIND-INFNT-NART-WITH-SPECIFICATION", 2, 0, false);
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    public static SubLObject init_semtrans_lexicon_file() {
        semtrans_lexicon.$manufacture_semtrans_assertionsP$ = SubLFiles.defparameter("*MANUFACTURE-SEMTRANS-ASSERTIONS?*", (SubLObject)semtrans_lexicon.T);
        semtrans_lexicon.$semtrans_lexicon$ = SubLFiles.defparameter("*SEMTRANS-LEXICON*", (SubLObject)semtrans_lexicon.NIL);
        semtrans_lexicon.$default_verbal_lex_entry_literals$ = SubLFiles.defvar("*DEFAULT-VERBAL-LEX-ENTRY-LITERALS*", (SubLObject)semtrans_lexicon.$list100);
        semtrans_lexicon.$semtrans_lexicon_learners$ = SubLFiles.defparameter("*SEMTRANS-LEXICON-LEARNERS*", (SubLObject)semtrans_lexicon.$list177);
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    public static SubLObject setup_semtrans_lexicon_file() {
        classes.subloop_new_class((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym1$ABSTRACT_LEXICON, (SubLObject)semtrans_lexicon.NIL, (SubLObject)semtrans_lexicon.NIL, (SubLObject)semtrans_lexicon.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym13$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym32$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE);
        subloop_reserved_initialize_semtrans_lexicon_class((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym33$INITIALIZE, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.NIL, (SubLObject)semtrans_lexicon.$list35);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym33$INITIALIZE, (SubLObject)semtrans_lexicon.$sym40$SEMTRANS_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym41$GET_TERM_LEXICON, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.NIL, (SubLObject)semtrans_lexicon.$list42);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym41$GET_TERM_LEXICON, (SubLObject)semtrans_lexicon.$sym44$SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym47$SET_TERM_LEXICON, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list48, (SubLObject)semtrans_lexicon.$list49);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym47$SET_TERM_LEXICON, (SubLObject)semtrans_lexicon.$sym51$SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym52$FABRICATE, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list53, (SubLObject)semtrans_lexicon.$list54, (SubLObject)semtrans_lexicon.$list55);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym52$FABRICATE, (SubLObject)semtrans_lexicon.$sym64$SEMTRANS_LEXICON_FABRICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym60$FABRICATE_NOMINAL, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list53, (SubLObject)semtrans_lexicon.$list54, (SubLObject)semtrans_lexicon.$list65);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym60$FABRICATE_NOMINAL, (SubLObject)semtrans_lexicon.$sym72$SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym71$FABRICATE_NOMINAL_SEMTRANS, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list73, (SubLObject)semtrans_lexicon.$list74);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym71$FABRICATE_NOMINAL_SEMTRANS, (SubLObject)semtrans_lexicon.$sym82$SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym61$FABRICATE_VERBAL, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list53, (SubLObject)semtrans_lexicon.$list54, (SubLObject)semtrans_lexicon.$list83);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym61$FABRICATE_VERBAL, (SubLObject)semtrans_lexicon.$sym85$SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym84$FABRICATE_VERBAL_SEMTRANS, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list73, (SubLObject)semtrans_lexicon.$list86);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym84$FABRICATE_VERBAL_SEMTRANS, (SubLObject)semtrans_lexicon.$sym91$SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list92, (SubLObject)semtrans_lexicon.$list93);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, (SubLObject)semtrans_lexicon.$sym94$SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym62$FABRICATE_ADJECTIVAL, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list53, (SubLObject)semtrans_lexicon.$list54, (SubLObject)semtrans_lexicon.$list101);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym62$FABRICATE_ADJECTIVAL, (SubLObject)semtrans_lexicon.$sym103$SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym63$FABRICATE_ADVERBIAL, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list53, (SubLObject)semtrans_lexicon.$list54, (SubLObject)semtrans_lexicon.$list104);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym63$FABRICATE_ADVERBIAL, (SubLObject)semtrans_lexicon.$sym106$SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym107$CREATE_LEX_ENTRIES, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list108, (SubLObject)semtrans_lexicon.$list109);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym107$CREATE_LEX_ENTRIES, (SubLObject)semtrans_lexicon.$sym113$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_class_method((SubLObject)semtrans_lexicon.$sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list115, (SubLObject)semtrans_lexicon.$list116);
        methods.subloop_register_class_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY, (SubLObject)semtrans_lexicon.$sym132$SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym133$RESPORATOR_TO_LEX_ENTRIES, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list134, (SubLObject)semtrans_lexicon.$list135);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym133$RESPORATOR_TO_LEX_ENTRIES, (SubLObject)semtrans_lexicon.$sym139$SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym140$RESPORATOR_LEARN, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list142);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym140$RESPORATOR_LEARN, (SubLObject)semtrans_lexicon.$sym144$SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym145$RESPORATOR___LEARN, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list146);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym145$RESPORATOR___LEARN, (SubLObject)semtrans_lexicon.$sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym148$STANFORD_NER_LEARN, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list149);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym148$STANFORD_NER_LEARN, (SubLObject)semtrans_lexicon.$sym151$SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list153);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES, (SubLObject)semtrans_lexicon.$sym154$SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym150$STANFORD_NER_LEARN_INT, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list155, semtrans_lexicon.$list156);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym150$STANFORD_NER_LEARN_INT, (SubLObject)semtrans_lexicon.$sym169$SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym170$NUMBER_LEARN, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list171);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym170$NUMBER_LEARN, (SubLObject)semtrans_lexicon.$sym174$SEMTRANS_LEXICON_NUMBER_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list108, (SubLObject)semtrans_lexicon.$list178);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD, (SubLObject)semtrans_lexicon.$sym187$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list108, (SubLObject)semtrans_lexicon.$list188);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME, (SubLObject)semtrans_lexicon.$sym189$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list190, (SubLObject)semtrans_lexicon.$list191);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, (SubLObject)semtrans_lexicon.$sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym195$CREATE_LEX_ENTRIES_NUMBER, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list196, (SubLObject)semtrans_lexicon.$list197);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym195$CREATE_LEX_ENTRIES_NUMBER, (SubLObject)semtrans_lexicon.$sym198$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym199$NOUN_COMPOUND_LEARN, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list200);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym199$NOUN_COMPOUND_LEARN, (SubLObject)semtrans_lexicon.$sym201$SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)semtrans_lexicon.$sym206$COOCCURRENCE_STATISTICS_LEARN, (SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$list34, (SubLObject)semtrans_lexicon.$list141, (SubLObject)semtrans_lexicon.$list207);
        methods.subloop_register_instance_method((SubLObject)semtrans_lexicon.$sym0$SEMTRANS_LEXICON, (SubLObject)semtrans_lexicon.$sym206$COOCCURRENCE_STATISTICS_LEARN, (SubLObject)semtrans_lexicon.$sym215$SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
        return (SubLObject)semtrans_lexicon.NIL;
    }
    
    private static SubLObject _constant_156_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of semtrans lexical entries learned from TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"), (SubLObject)semtrans_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY-CLUSTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RUN")), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TERM-LEXICON")))), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EC"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-CLUSTERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)SubLObjectFactory.makeSymbol("EC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LEXICON")), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)semtrans_lexicon.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("O")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTEN-TYPES?"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTEN-TYPE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NAMENT-INSTANCE-MEANING"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY-LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANING"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-LEXES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-LEXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH-ALL"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))));
    }
    
    @Override
	public void declareFunctions() {
        declare_semtrans_lexicon_file();
    }
    
    @Override
	public void initializeVariables() {
        init_semtrans_lexicon_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_semtrans_lexicon_file();
    }
    
    static {
        me = (SubLFile)new semtrans_lexicon();
        semtrans_lexicon.$manufacture_semtrans_assertionsP$ = null;
        semtrans_lexicon.$semtrans_lexicon$ = null;
        semtrans_lexicon.$default_verbal_lex_entry_literals$ = null;
        semtrans_lexicon.$semtrans_lexicon_learners$ = null;
        $sym0$SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON");
        $sym1$ABSTRACT_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SemTransLexiconSpecification"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-TERM-LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)semtrans_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-VERBAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-NOMINAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-ADJECTIVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-ADVERBIAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-VERBAL-SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-NOMINAL-SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)semtrans_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TERM-LEXICON"), (SubLObject)semtrans_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TERM-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEMMA")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym3$MY_TERM_LEXICON = SubLObjectFactory.makeSymbol("MY-TERM-LEXICON");
        $sym4$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym5$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym6$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $list7 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
        $sym8$DEFAULT_EXCLUDE_PREDICATES = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES");
        $sym9$DEFAULT_BASE_MT = SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT");
        $const10$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
        $sym11$DEFAULT_KB_SPEC = SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC");
        $const12$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"));
        $sym13$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$ALLOWED_MTS = SubLObjectFactory.makeSymbol("ALLOWED-MTS");
        $kw17$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym18$EXCLUDED_MTS = SubLObjectFactory.makeSymbol("EXCLUDED-MTS");
        $sym19$BASE_MT = SubLObjectFactory.makeSymbol("BASE-MT");
        $sym20$ROOT_MT = SubLObjectFactory.makeSymbol("ROOT-MT");
        $sym21$EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("EXCLUDED-PREDS");
        $sym22$EXCLUDED_POS_LIST = SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST");
        $sym23$TRIE = SubLObjectFactory.makeSymbol("TRIE");
        $sym24$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym25$IGNORE_CACHE_ = SubLObjectFactory.makeSymbol("IGNORE-CACHE?");
        $sym26$CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("CASE-SENSITIVITY");
        $sym27$ALLOW_FABRICATION_ = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?");
        $sym28$LEARNED = SubLObjectFactory.makeSymbol("LEARNED");
        $sym29$ACTIVE_LEARNERS = SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS");
        $sym30$ALLOW_STEMMING = SubLObjectFactory.makeSymbol("ALLOW-STEMMING");
        $sym31$STOP_WORDS = SubLObjectFactory.makeSymbol("STOP-WORDS");
        $sym32$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE");
        $sym33$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Initializes this semtrans lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym36$EXCLUDE_PREDICATE = SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE");
        $const37$preferredNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $const38$denotationPlaceholder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder"));
        $const39$denotationRelatedTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo"));
        $sym40$SEMTRANS_LEXICON_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-INITIALIZE-METHOD");
        $sym41$GET_TERM_LEXICON = SubLObjectFactory.makeSymbol("GET-TERM-LEXICON");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("MY-TERM-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MY-TERM-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-TERM-LEXICON")));
        $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");
        $sym44$SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD");
        $sym45$SEMTRANS_LEXICON_P = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-P");
        $sym46$COPY = SubLObjectFactory.makeSymbol("COPY");
        $sym47$SET_TERM_LEXICON = SubLObjectFactory.makeSymbol("SET-TERM-LEXICON");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MY-TERM-LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");
        $sym51$SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD");
        $sym52$FABRICATE = SubLObjectFactory.makeSymbol("FABRICATE");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; the string for which to fabricate some lex entries\n   @param KEYWORDS listp; the syntactic dependents of STRING\n   @param PENN keywordp; the part-of-speech tag of STRING\n   @return listp; a list of lexical entries for word STRING with dependents KEYWORDS \n   and part-of-speech tag PENN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?")), (SubLObject)semtrans_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PENN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-NOMINAL")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PENN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-VERBAL")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-PENN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-ADJECTIVAL")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-PENN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-ADVERBIAL")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)semtrans_lexicon.T, (SubLObject)semtrans_lexicon.NIL))));
        $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");
        $sym57$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym58$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym59$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym60$FABRICATE_NOMINAL = SubLObjectFactory.makeSymbol("FABRICATE-NOMINAL");
        $sym61$FABRICATE_VERBAL = SubLObjectFactory.makeSymbol("FABRICATE-VERBAL");
        $sym62$FABRICATE_ADJECTIVAL = SubLObjectFactory.makeSymbol("FABRICATE-ADJECTIVAL");
        $sym63$FABRICATE_ADVERBIAL = SubLObjectFactory.makeSymbol("FABRICATE-ADVERBIAL");
        $sym64$SEMTRANS_LEXICON_FABRICATE_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-METHOD");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the noun frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-NOMINAL-SEMTRANS")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LEX")))));
        $sym66$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
        $sym67$SET = SubLObjectFactory.makeSymbol("SET");
        $kw68$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw69$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $kw70$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $sym71$FABRICATE_NOMINAL_SEMTRANS = SubLObjectFactory.makeSymbol("FABRICATE-NOMINAL-SEMTRANS");
        $sym72$SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"));
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThingDescribableAsFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordFn")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")))))), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possessiveRelation")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"))), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJOIN"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")))));
        $kw75$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $const76$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const77$ThingDescribableAsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThingDescribableAsFn"));
        $const78$WordFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordFn"));
        $list79 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $kw80$POSSESSOR = SubLObjectFactory.makeKeyword("POSSESSOR");
        $list81 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possessiveRelation")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"));
        $sym82$SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the verb frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-VERBAL-SEMTRANS")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym84$FABRICATE_VERBAL_SEMTRANS = SubLObjectFactory.makeSymbol("FABRICATE-VERBAL-SEMTRANS");
        $sym85$SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)semtrans_lexicon.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES")), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThingDescribableAsFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordFn")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-TO-SEMTRANS-LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJOIN"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES")))));
        $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");
        $kw88$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES");
        $list90 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")));
        $sym91$SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots \n   for each syntactic relation keyword in KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)semtrans_lexicon.EQ))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-TO-VERBAL-SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"))));
        $sym94$SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD");
        $list95 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllEnglishValidatedLexicalMicrotheoryPSC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $const96$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw97$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw98$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
        $kw99$OBLIQUE_OBJECT = SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patient-Generic")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("to-UnderspecifiedLocation")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("awareOfProp")), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE")));
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThingDescribableAsFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordFn")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LEX")))));
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")));
        $sym103$SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThingDescribableAsFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordFn")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LEX")))));
        $list105 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")));
        $sym106$SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD");
        $sym107$CREATE_LEX_ENTRIES = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"))))))));
        $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD");
        $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME");
        $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY");
        $sym113$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD");
        $sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEMMA"));
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LEMMA textract-lemma-p\n   @return lex-entry-p or nil; the lex entry equivalent of LEMMA,\n   or nil if one can't be obtained"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PCASE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PERSON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PERSON?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLACE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)semtrans_lexicon.NIL)) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEMMA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))));
        $kw117$PERSON = SubLObjectFactory.makeKeyword("PERSON");
        $const118$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list119 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")));
        $const120$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $kw121$PERSON_ = SubLObjectFactory.makeKeyword("PERSON?");
        $kw122$PLACE = SubLObjectFactory.makeKeyword("PLACE");
        $list123 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")));
        $kw124$PLACE_ = SubLObjectFactory.makeKeyword("PLACE?");
        $kw125$ORG = SubLObjectFactory.makeKeyword("ORG");
        $list126 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")));
        $kw127$UNAME = SubLObjectFactory.makeKeyword("UNAME");
        $kw128$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $const129$ProperNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $kw130$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $const131$RegularNounFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"));
        $sym132$SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD");
        $sym133$RESPORATOR_TO_LEX_ENTRIES = SubLObjectFactory.makeSymbol("RESPORATOR-TO-LEX-ENTRIES");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"));
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-INFLECTIONS")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $kw136$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $sym137$RESPORATOR_TO_INFLECTIONS = SubLObjectFactory.makeSymbol("RESPORATOR-TO-INFLECTIONS");
        $sym138$RESPORATOR_TO_CYCL = SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL");
        $sym139$SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD");
        $sym140$RESPORATOR_LEARN = SubLObjectFactory.makeSymbol("RESPORATOR-LEARN");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-QUIRK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym143$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym144$SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD");
        $sym145$RESPORATOR___LEARN = SubLObjectFactory.makeSymbol("RESPORATOR++-LEARN");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   @note this is a 'lazy' variation of resporator that attempts to discover\n   shorter strings of type PERSON that exclude additional information like \n   'French Prime Minister' from the string 'French Prime Minister Jacques Chirac'\n   and just returns 'Jacques Chirac'."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-QUIRK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR++"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD");
        $sym148$STANFORD_NER_LEARN = SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN-INT")), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)semtrans_lexicon.NIL)));
        $sym150$STANFORD_NER_LEARN_INT = SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN-INT");
        $sym151$SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD");
        $sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES = SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN-TIGHTENED-TYPES");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN-INT")), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)semtrans_lexicon.T)));
        $sym154$SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTEN-TYPES?"));
        $list156 = _constant_156_initializer();
        $sym157$STANFORD_NER = SubLObjectFactory.makeSymbol("STANFORD-NER");
        $sym158$RUN = SubLObjectFactory.makeSymbol("RUN");
        $sym159$SET_LEXICON = SubLObjectFactory.makeSymbol("SET-LEXICON");
        $sym160$O = SubLObjectFactory.makeSymbol("O");
        $sym161$GET_TYPE = SubLObjectFactory.makeSymbol("GET-TYPE");
        $sym162$GET_CYC = SubLObjectFactory.makeSymbol("GET-CYC");
        $sym163$TIGHTEN_TYPE = SubLObjectFactory.makeSymbol("TIGHTEN-TYPE");
        $sym164$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym165$GET = SubLObjectFactory.makeSymbol("GET");
        $list166 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic")));
        $sym167$ADD = SubLObjectFactory.makeSymbol("ADD");
        $str168$___S = SubLObjectFactory.makeString("~%~S");
        $sym169$SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD");
        $sym170$NUMBER_LEARN = SubLObjectFactory.makeSymbol("NUMBER-LEARN");
        $list171 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-MEANINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING")), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALREADY-KNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)semtrans_lexicon.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-SEMTRANS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("ALREADY-KNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-SEMTRANS-LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING"));
        $sym173$LEX_ENTRY_SEMTRANS = SubLObjectFactory.makeSymbol("LEX-ENTRY-SEMTRANS");
        $sym174$SEMTRANS_LEXICON_NUMBER_LEARN_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-NUMBER-LEARN-METHOD");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CD"));
        $const176$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR++-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-LEARN"));
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)semtrans_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)semtrans_lexicon.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-PRED?"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-FILTER-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS-OF-STRING&WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("WU")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS-OF-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("WU")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) }))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("*MANUFACTURE-SEMTRANS-ASSERTIONS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-POS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"))), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)semtrans_lexicon.NIL)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) })))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $list179 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")));
        $kw180$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $kw181$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
        $list182 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")));
        $const183$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $sym184$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const185$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const186$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym187$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; the string of the lex entries to be constructed\n   @param NL-TRIE-ENTRY; the nl trie entry out of which to construct a list of lex entries\n   @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION?"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"))), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $sym189$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"));
        $list191 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)semtrans_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION?"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"))), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $kw192$PRAGMATICS = SubLObjectFactory.makeKeyword("PRAGMATICS");
        $kw193$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD");
        $sym195$CREATE_LEX_ENTRIES_NUMBER = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NUMBER");
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"));
        $list197 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)semtrans_lexicon.NIL));
        $sym198$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD");
        $sym199$NOUN_COMPOUND_LEARN = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN");
        $list200 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))));
        $sym201$SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD");
        $const202$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list203 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"));
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"));
        $sym206$COOCCURRENCE_STATISTICS_LEARN = SubLObjectFactory.makeSymbol("COOCCURRENCE-STATISTICS-LEARN");
        $list207 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STANFORD-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)semtrans_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-NOUNS"), (SubLObject)semtrans_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-NOUNLEARNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-NOUNS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARN-UNKNOWN-NOUNS-FROM-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-NOUNS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIONSHIP"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE")), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"), (SubLObject)semtrans_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("PARSED-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULARIZED-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSED-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSED-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULARIZED-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINGULARIZE-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("PARSED-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)semtrans_lexicon.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("SINGULARIZED-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIONSHIP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubCollectionNamedFn")), (SubLObject)SubLObjectFactory.makeSymbol("SINGULARIZED-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PARSED-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym208$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym209$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIONSHIP"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"));
        $sym211$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw212$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw213$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const214$SubCollectionNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubCollectionNamedFn"));
        $sym215$SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD");
        $sym216$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $sym217$LEX_ENTRY_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-P");
        $const218$InstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn"));
        $sym219$INSTANCEFN_CLAUSE = SubLObjectFactory.makeSymbol("INSTANCEFN-CLAUSE");
        $list220 = ConsesLow.list((SubLObject)semtrans_lexicon.TWO_INTEGER, (SubLObject)semtrans_lexicon.ZERO_INTEGER);
        $kw221$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym222$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $const223$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $const224$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const225$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym226$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const227$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
    }
}

/*

	Total time: 1195 ms
	
*/