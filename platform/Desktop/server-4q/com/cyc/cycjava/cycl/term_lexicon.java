package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class term_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.term_lexicon";
    public static final String myFingerPrint = "b6a439a9ca434fef846926e578751284fff4ef5922fcf49e5ba2839a9cc0bba1";
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1556L)
    private static SubLSymbol $term_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 7146L)
    private static SubLSymbol $numeric_date_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 7479L)
    private static SubLSymbol $compiled_numeric_date_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
    private static SubLSymbol $ner_clusters_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13530L)
    public static SubLSymbol $term_lexicon_learners$;
    private static final SubLSymbol $sym0$TERM_LEXICON;
    private static final SubLSymbol $sym1$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $kw2$PREFERRED;
    private static final SubLSymbol $sym3$ABSTRACT_LEXICON;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$DEPENDENT_LEXICONS;
    private static final SubLSymbol $sym6$CONCEPT_FILTER_SPECS;
    private static final SubLSymbol $sym7$CONVERT_TO_EL_;
    private static final SubLSymbol $sym8$OBJECT;
    private static final SubLSymbol $sym9$INSTANCE_COUNT;
    private static final SubLSymbol $sym10$DEFAULT_EXCLUDE_MTS;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$DEFAULT_EXCLUDE_PREDICATES;
    private static final SubLSymbol $sym13$DEFAULT_BASE_MT;
    private static final SubLObject $const14$AllGeneralEnglishValidatedLexical;
    private static final SubLSymbol $sym15$DEFAULT_KB_SPEC;
    private static final SubLObject $const16$AbstractLexiconSpecification;
    private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS;
    private static final SubLSymbol $sym18$ISOLATED_P;
    private static final SubLSymbol $sym19$INSTANCE_NUMBER;
    private static final SubLSymbol $sym20$ALLOWED_MTS;
    private static final SubLSymbol $kw21$UNINITIALIZED;
    private static final SubLSymbol $sym22$EXCLUDED_MTS;
    private static final SubLSymbol $sym23$BASE_MT;
    private static final SubLSymbol $sym24$ROOT_MT;
    private static final SubLSymbol $sym25$EXCLUDED_PREDS;
    private static final SubLSymbol $sym26$EXCLUDED_POS_LIST;
    private static final SubLSymbol $sym27$TRIE;
    private static final SubLSymbol $sym28$CACHE;
    private static final SubLSymbol $sym29$IGNORE_CACHE_;
    private static final SubLSymbol $sym30$CASE_SENSITIVITY;
    private static final SubLSymbol $sym31$ALLOW_FABRICATION_;
    private static final SubLSymbol $sym32$LEARNED;
    private static final SubLSymbol $sym33$ACTIVE_LEARNERS;
    private static final SubLSymbol $sym34$ALLOW_STEMMING;
    private static final SubLSymbol $sym35$STOP_WORDS;
    private static final SubLSymbol $sym36$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE;
    private static final SubLSymbol $sym37$INITIALIZE;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym41$TERM_LEXICON_INITIALIZE_METHOD;
    private static final SubLSymbol $sym42$NOTE_DEPENDENT_LEXICON;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym46$TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD;
    private static final SubLSymbol $sym47$REMOVE_DEPENDENT_LEXICON;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym50$TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD;
    private static final SubLSymbol $sym51$SET_CONVERT_TO_EL;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym56$TERM_LEXICON_SET_CONVERT_TO_EL_METHOD;
    private static final SubLSymbol $sym57$GET_CONVERT_TO_EL;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym60$TERM_LEXICON_GET_CONVERT_TO_EL_METHOD;
    private static final SubLSymbol $sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym64$TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD;
    private static final SubLSymbol $sym65$ADD_CONCEPT_FILTER_SPEC;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym69$CONCEPT_FILTER_SPECIFICATION_P;
    private static final SubLSymbol $sym70$TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD;
    private static final SubLSymbol $sym71$GET_CONCEPT_FILTER_SPECS;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym74$TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD;
    private static final SubLSymbol $sym75$CREATE_LEX_ENTRIES;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$GET;
    private static final SubLSymbol $kw79$DENOT;
    private static final SubLSymbol $sym80$NL_TRIE_WORD2LEX_ENTRIES;
    private static final SubLSymbol $sym81$NL_TRIE_TP2LEX_ENTRIES;
    private static final SubLSymbol $sym82$NL_TRIE_NAME2LEX_ENTRIES;
    private static final SubLSymbol $sym83$TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD;
    private static final SubLSymbol $sym84$RESPORATOR_TO_LEX_ENTRY;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$LEX_ENTRY;
    private static final SubLSymbol $sym88$SET;
    private static final SubLSymbol $kw89$STRING;
    private static final SubLSymbol $kw90$CYC_POS;
    private static final SubLObject $const91$ProperNoun;
    private static final SubLSymbol $kw92$INFLECTIONS;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$PREDICATE;
    private static final SubLObject $const95$denotation;
    private static final SubLSymbol $sym96$RESPORATOR_TO_CYCL;
    private static final SubLSymbol $sym97$TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD;
    private static final SubLSymbol $sym98$COPY;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym102$TERM_LEXICON_P;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$TERM_LEXICON_COPY_METHOD;
    private static final SubLSymbol $sym105$ISOLATE;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym108$TERM_LEXICON_ISOLATE_METHOD;
    private static final SubLSymbol $sym109$DELETE_STRING_WITH_TERM;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym113$STRINGP;
    private static final SubLSymbol $sym114$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLSymbol $sym115$GET_CASE_SENSITIVITY;
    private static final SubLSymbol $sym116$DELETE_ENTRY_FROM_STRING;
    private static final SubLSymbol $sym117$TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD;
    private static final SubLString $str118$_0_9__1_2______0_9__1_2______0_9_;
    private static final SubLString $str119$_0_9__4_4_______0_9__1_2_______0_;
    private static final SubLString $str120$_0_9__1_2______0_9__2_4_;
    private static final SubLString $str121$_0_9__4_;
    private static final SubLSymbol $sym122$SIMPLE_DATE_LEARN;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLSymbol $kw125$FRAME;
    private static final SubLObject $const126$RegularNounFrame;
    private static final SubLSymbol $sym127$LEX_ENTRY_EQUAL_P;
    private static final SubLSymbol $sym128$ADD;
    private static final SubLSymbol $sym129$TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD;
    private static final SubLSymbol $sym130$DATE_LEARN;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$TERM_LEXICON_DATE_LEARN_METHOD;
    private static final SubLSymbol $sym133$STANFORD_NER_DATE_LEARN;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$STANFORD_NER_LEARN;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD;
    private static final SubLList $list138;
    private static final SubLObject $list139;
    private static final SubLSymbol $kw140$ANY;
    private static final SubLSymbol $sym141$STANFORD_NER;
    private static final SubLSymbol $sym142$KNOWN_CYC_TYPES;
    private static final SubLSymbol $sym143$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym144$MERGE_CLUSTERS;
    private static final SubLSymbol $sym145$GET_STRING;
    private static final SubLSymbol $sym146$GET_CYC;
    private static final SubLObject $const147$InstanceNamedFn_Ternary;
    private static final SubLString $str148$___S;
    private static final SubLSymbol $sym149$TERM_LEXICON_STANFORD_NER_LEARN_METHOD;
    private static final SubLSymbol $sym150$NER_CLUSTERS;
    private static final SubLSymbol $sym151$RUN;
    private static final SubLSymbol $sym152$_NER_CLUSTERS_CACHING_STATE_;
    private static final SubLInteger $int153$4096;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$SCALAR_INTERVAL_LEARN;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$LEX_ENTRY_DENOT;
    private static final SubLSymbol $sym159$TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD;
    private static final SubLSymbol $sym160$NUMBER_LEARN;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$TERM_LEXICON_NUMBER_LEARN_METHOD;
    private static final SubLSymbol $kw164$PENN_TAGS;
    private static final SubLList $list165;
    private static final SubLObject $const166$Number_SP;
    private static final SubLSymbol $sym167$SIMPLE_DATE_FROM_STRING_LEARN;
    private static final SubLList $list168;
    private static final SubLSymbol $sym169$TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD;
    private static final SubLList $list170;
    private static final SubLObject $const171$YearFn;
    private static final SubLSymbol $sym172$NOUN_COMPOUND_LEARN;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLObject $const177$genlPreds;
    private static final SubLList $list178;
    private static final SubLList $list179;
    private static final SubLList $list180;
    private static final SubLObject $const181$EverythingPSC;
    private static final SubLObject $const182$Noun;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $kw186$PRAGMATICS;
    private static final SubLSymbol $kw187$WORD_UNIT;
    private static final SubLSymbol $kw188$TRIE_ENTRY;
    private static final SubLSymbol $sym189$TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLList $list193;
    private static final SubLSymbol $sym194$TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLSymbol $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
    private static final SubLSymbol $sym198$TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD;
    private static final SubLSymbol $sym199$DENOTS_FOR_TERM_LEXICON_ENTRIES;
    private static final SubLSymbol $sym200$ADD_LEARNER;
    private static final SubLSymbol $sym201$LEARN;
    private static final SubLSymbol $sym202$TEST_SIMPLE_DATE_LEARN;
    private static final SubLSymbol $kw203$TEST;
    private static final SubLSymbol $sym204$HAS_MEMBER_EQUAL_;
    private static final SubLSymbol $kw205$OWNER;
    private static final SubLSymbol $kw206$CLASSES;
    private static final SubLSymbol $kw207$KB;
    private static final SubLSymbol $kw208$FULL;
    private static final SubLSymbol $kw209$WORKING_;
    private static final SubLList $list210;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1681L)
    public static SubLObject new_term_lexicon() {
        return object.new_class_instance((SubLObject)term_lexicon.$sym0$TERM_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1761L)
    public static SubLObject get_term_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term_lexicon.NIL == term_lexicon_p(term_lexicon.$term_lexicon$.getDynamicValue(thread))) {
            term_lexicon.$term_lexicon$.setDynamicValue(new_term_lexicon(), thread);
        }
        return term_lexicon.$term_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1966L)
    public static SubLObject new_case_sensitivity_preferred_term_lexicon() {
        final SubLObject lex = object.new_class_instance((SubLObject)term_lexicon.$sym0$TERM_LEXICON);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)term_lexicon.$sym1$SET_CASE_SENSITIVITY, (SubLObject)term_lexicon.$kw2$PREFERRED);
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject get_term_lexicon_dependent_lexicons(final SubLObject v_term_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_term_lexicon, (SubLObject)term_lexicon.EIGHTEEN_INTEGER, (SubLObject)term_lexicon.$sym5$DEPENDENT_LEXICONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject set_term_lexicon_dependent_lexicons(final SubLObject v_term_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_term_lexicon, value, (SubLObject)term_lexicon.EIGHTEEN_INTEGER, (SubLObject)term_lexicon.$sym5$DEPENDENT_LEXICONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject get_term_lexicon_concept_filter_specs(final SubLObject v_term_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_term_lexicon, (SubLObject)term_lexicon.SEVENTEEN_INTEGER, (SubLObject)term_lexicon.$sym6$CONCEPT_FILTER_SPECS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject set_term_lexicon_concept_filter_specs(final SubLObject v_term_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_term_lexicon, value, (SubLObject)term_lexicon.SEVENTEEN_INTEGER, (SubLObject)term_lexicon.$sym6$CONCEPT_FILTER_SPECS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject get_term_lexicon_convert_to_elP(final SubLObject v_term_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_term_lexicon, (SubLObject)term_lexicon.SIXTEEN_INTEGER, (SubLObject)term_lexicon.$sym7$CONVERT_TO_EL_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject set_term_lexicon_convert_to_elP(final SubLObject v_term_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_term_lexicon, value, (SubLObject)term_lexicon.SIXTEEN_INTEGER, (SubLObject)term_lexicon.$sym7$CONVERT_TO_EL_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject subloop_reserved_initialize_term_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym8$OBJECT, (SubLObject)term_lexicon.$sym9$INSTANCE_COUNT, (SubLObject)term_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym10$DEFAULT_EXCLUDE_MTS, (SubLObject)term_lexicon.$list11);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym12$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym13$DEFAULT_BASE_MT, term_lexicon.$const14$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym15$DEFAULT_KB_SPEC, term_lexicon.$const16$AbstractLexiconSpecification);
        return (SubLObject)term_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject subloop_reserved_initialize_term_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym8$OBJECT, (SubLObject)term_lexicon.$sym18$ISOLATED_P, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym8$OBJECT, (SubLObject)term_lexicon.$sym19$INSTANCE_NUMBER, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym20$ALLOWED_MTS, (SubLObject)term_lexicon.$kw21$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym22$EXCLUDED_MTS, (SubLObject)term_lexicon.$kw21$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym23$BASE_MT, (SubLObject)term_lexicon.$kw21$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym24$ROOT_MT, (SubLObject)term_lexicon.$kw21$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym25$EXCLUDED_PREDS, (SubLObject)term_lexicon.$kw21$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym26$EXCLUDED_POS_LIST, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym27$TRIE, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym28$CACHE, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym29$IGNORE_CACHE_, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym30$CASE_SENSITIVITY, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym31$ALLOW_FABRICATION_, (SubLObject)term_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym32$LEARNED, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym33$ACTIVE_LEARNERS, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym34$ALLOW_STEMMING, (SubLObject)term_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.$sym35$STOP_WORDS, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym7$CONVERT_TO_EL_, (SubLObject)term_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym6$CONCEPT_FILTER_SPECS, (SubLObject)term_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym5$DEPENDENT_LEXICONS, (SubLObject)term_lexicon.NIL);
        return (SubLObject)term_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
    public static SubLObject term_lexicon_p(final SubLObject v_term_lexicon) {
        return classes.subloop_instanceof_class(v_term_lexicon, (SubLObject)term_lexicon.$sym0$TERM_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3267L)
    public static SubLObject term_lexicon_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                abstract_lexicon.abstract_lexicon_initialize_method(self);
                allow_fabricationP = (SubLObject)term_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
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
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3483L)
    public static SubLObject term_lexicon_note_dependent_lexicon_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons(self);
        try {
            thread.throwStack.push(term_lexicon.$sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                dependent_lexicons = (SubLObject)ConsesLow.cons(lexicon, dependent_lexicons);
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_dependent_lexicons(self, dependent_lexicons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3615L)
    public static SubLObject term_lexicon_remove_dependent_lexicon_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons(self);
        try {
            thread.throwStack.push(term_lexicon.$sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                dependent_lexicons = Sequences.delete(lexicon, dependent_lexicons, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_dependent_lexicons(self, dependent_lexicons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3777L)
    public static SubLObject term_lexicon_set_convert_to_el_method(final SubLObject self, final SubLObject v_boolean) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                convert_to_elP = list_utilities.sublisp_boolean(v_boolean);
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3958L)
    public static SubLObject term_lexicon_get_convert_to_el_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, convert_to_elP);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4090L)
    public static SubLObject term_lexicon_remove_all_concept_filter_specs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        try {
            thread.throwStack.push(term_lexicon.$sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                concept_filter_specs = (SubLObject)term_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4219L)
    public static SubLObject term_lexicon_add_concept_filter_spec_method(final SubLObject self, final SubLObject spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        try {
            thread.throwStack.push(term_lexicon.$sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                assert term_lexicon.NIL != concept_filter.concept_filter_specification_p(spec) : spec;
                if (term_lexicon.NIL == conses_high.member(spec, concept_filter_specs, (SubLObject)term_lexicon.EQUAL, Symbols.symbol_function((SubLObject)term_lexicon.IDENTITY))) {
                    concept_filter_specs = (SubLObject)ConsesLow.cons(spec, concept_filter_specs);
                }
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4452L)
    public static SubLObject term_lexicon_get_concept_filter_specs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        try {
            thread.throwStack.push(term_lexicon.$sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, concept_filter_specs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4597L)
    public static SubLObject term_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        if (term_lexicon.NIL != abstract_lexicon.lex_entry_p(nl_trie_entry) && term_lexicon.NIL != methods.funcall_instance_method_with_1_args(nl_trie_entry, (SubLObject)term_lexicon.$sym78$GET, (SubLObject)term_lexicon.$kw79$DENOT)) {
            return (SubLObject)ConsesLow.list(nl_trie_entry);
        }
        if (term_lexicon.NIL != nl_trie.nl_trie_word_p(nl_trie_entry, (SubLObject)term_lexicon.UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, (SubLObject)term_lexicon.$sym80$NL_TRIE_WORD2LEX_ENTRIES, string, nl_trie_entry);
        }
        if (term_lexicon.NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, (SubLObject)term_lexicon.UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, (SubLObject)term_lexicon.$sym81$NL_TRIE_TP2LEX_ENTRIES, string, nl_trie_entry);
        }
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)term_lexicon.$sym82$NL_TRIE_NAME2LEX_ENTRIES, string, nl_trie_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 5399L)
    public static SubLObject term_lexicon_resporator_to_lex_entry_method(final SubLObject self, final SubLObject typeXstring) {
        final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, typeXstring.rest());
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw94$PREDICATE, term_lexicon.$const95$denotation);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, methods.funcall_class_method_with_1_args(self, (SubLObject)term_lexicon.$sym96$RESPORATOR_TO_CYCL, typeXstring.first()));
        return lex_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 5838L)
    public static SubLObject term_lexicon_copy_method(final SubLObject self, SubLObject target) {
        if (target == term_lexicon.UNPROVIDED) {
            target = (SubLObject)term_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject default_kb_spec = abstract_lexicon.get_abstract_lexicon_default_kb_spec(self);
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                if (term_lexicon.NIL != target && !term_lexicon.assertionsDisabledInClass && term_lexicon.NIL == term_lexicon_p(target)) {
                    throw new AssertionError(target);
                }
                target = abstract_lexicon.abstract_lexicon_copy_method(self, target);
                SubLObject cdolist_list_var = (SubLObject)term_lexicon.$list103;
                SubLObject slot = (SubLObject)term_lexicon.NIL;
                slot = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    final SubLObject value = instances.get_slot(self, slot);
                    if (value.isList()) {
                        instances.set_slot(target, slot, conses_high.copy_list(value));
                    }
                    else {
                        instances.set_slot(target, slot, value);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    slot = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, target);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_default_kb_spec(self, default_kb_spec);
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 6394L)
    public static SubLObject term_lexicon_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons(self);
        try {
            thread.throwStack.push(term_lexicon.$sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject cdolist_list_var = dependent_lexicons;
                SubLObject lexicon = (SubLObject)term_lexicon.NIL;
                lexicon = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)term_lexicon.$sym105$ISOLATE);
                    cdolist_list_var = cdolist_list_var.rest();
                    lexicon = cdolist_list_var.first();
                }
                abstract_lexicon.abstract_lexicon_isolate_method(self);
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_dependent_lexicons(self, dependent_lexicons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 6580L)
    public static SubLObject term_lexicon_delete_string_with_term_method(final SubLObject self, final SubLObject string, final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(term_lexicon.$sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                assert term_lexicon.NIL != Types.stringp(string) : string;
                assert term_lexicon.NIL != cycl_grammar.cycl_denotational_term_p(cycl) : cycl;
                final SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
                SubLObject cdolist_list_var;
                final SubLObject trie_entries = cdolist_list_var = nl_trie.nl_trie_lookup(trie, trie_key, methods.funcall_instance_method_with_0_args(self, (SubLObject)term_lexicon.$sym115$GET_CASE_SENSITIVITY));
                SubLObject trie_entry = (SubLObject)term_lexicon.NIL;
                trie_entry = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    if (term_lexicon.NIL != abstract_lexicon.lex_entry_p(trie_entry) && cycl.equal(methods.funcall_instance_method_with_1_args(trie_entry, (SubLObject)term_lexicon.$sym78$GET, (SubLObject)term_lexicon.$kw79$DENOT))) {
                        methods.funcall_instance_method_with_2_args(self, (SubLObject)term_lexicon.$sym116$DELETE_ENTRY_FROM_STRING, trie_entry, string);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    trie_entry = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 7585L)
    public static SubLObject get_numeric_date_patterns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (term_lexicon.NIL != regular_expressions.is_regular_expressions_support_availableP()) {
            if (term_lexicon.NIL == term_lexicon.$compiled_numeric_date_patterns$.getGlobalValue()) {
                SubLObject compiled_patterns = (SubLObject)term_lexicon.NIL;
                SubLObject cdolist_list_var = term_lexicon.$numeric_date_patterns$.getDynamicValue(thread);
                SubLObject pattern_string = (SubLObject)term_lexicon.NIL;
                pattern_string = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    compiled_patterns = (SubLObject)ConsesLow.cons(regular_expressions.compile_regular_expression(pattern_string, (SubLObject)term_lexicon.UNPROVIDED), compiled_patterns);
                    cdolist_list_var = cdolist_list_var.rest();
                    pattern_string = cdolist_list_var.first();
                }
                term_lexicon.$compiled_numeric_date_patterns$.setGlobalValue(Sequences.nreverse(compiled_patterns));
            }
            return term_lexicon.$compiled_numeric_date_patterns$.getGlobalValue();
        }
        return (SubLObject)term_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 8060L)
    public static SubLObject term_lexicon_simple_date_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject new_lexes = (SubLObject)term_lexicon.NIL;
        if (term_lexicon.NIL == new_lexes) {
            SubLObject csome_list_var = get_numeric_date_patterns();
            SubLObject pattern = (SubLObject)term_lexicon.NIL;
            pattern = csome_list_var.first();
            while (term_lexicon.NIL == new_lexes && term_lexicon.NIL != csome_list_var) {
                SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_pattern(pattern, text, (SubLObject)term_lexicon.UNPROVIDED);
                SubLObject possible_date_string = (SubLObject)term_lexicon.NIL;
                possible_date_string = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = date_utilities.parse_date_from_string_fast(possible_date_string, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED);
                    SubLObject date_cycl = (SubLObject)term_lexicon.NIL;
                    date_cycl = cdolist_list_var_$1.first();
                    while (term_lexicon.NIL != cdolist_list_var_$1) {
                        final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym78$GET, possible_date_string);
                        final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, possible_date_string);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, date_cycl);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
                        if (term_lexicon.NIL == subl_promotions.memberP(lex_entry, existing_entries, (SubLObject)term_lexicon.$sym127$LEX_ENTRY_EQUAL_P, (SubLObject)term_lexicon.UNPROVIDED)) {
                            methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
                            new_lexes = (SubLObject)ConsesLow.cons(lex_entry, new_lexes);
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        date_cycl = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    possible_date_string = cdolist_list_var.first();
                }
                csome_list_var = csome_list_var.rest();
                pattern = csome_list_var.first();
            }
        }
        return new_lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 9012L)
    public static SubLObject term_lexicon_date_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject new_lexes = (SubLObject)term_lexicon.NIL;
        SubLObject cdolist_list_var = date_utilities.parse_date_from_string_fast(text, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED);
        SubLObject date_cycl = (SubLObject)term_lexicon.NIL;
        date_cycl = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym78$GET, text);
            final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, text);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, date_cycl);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
            if (term_lexicon.NIL == subl_promotions.memberP(lex_entry, existing_entries, (SubLObject)term_lexicon.$sym127$LEX_ENTRY_EQUAL_P, (SubLObject)term_lexicon.UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
                new_lexes = (SubLObject)ConsesLow.cons(lex_entry, new_lexes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            date_cycl = cdolist_list_var.first();
        }
        return new_lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 9718L)
    public static SubLObject term_lexicon_stanford_ner_date_learn_method(final SubLObject self, final SubLObject text) {
        return methods.funcall_instance_method_with_3_args(self, (SubLObject)term_lexicon.$sym135$STANFORD_NER_LEARN, text, (SubLObject)term_lexicon.$list136, (SubLObject)term_lexicon.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 10191L)
    public static SubLObject term_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text, SubLObject allowed_types, SubLObject fabricate_meaningP) {
        if (allowed_types == term_lexicon.UNPROVIDED) {
            allowed_types = (SubLObject)term_lexicon.$kw140$ANY;
        }
        if (fabricate_meaningP == term_lexicon.UNPROVIDED) {
            fabricate_meaningP = (SubLObject)term_lexicon.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert term_lexicon.NIL != Types.stringp(text) : text;
        SubLObject new_lexes = (SubLObject)term_lexicon.NIL;
        SubLObject error = (SubLObject)term_lexicon.NIL;
        if (allowed_types == term_lexicon.$kw140$ANY) {
            allowed_types = instances.get_slot((SubLObject)term_lexicon.$sym141$STANFORD_NER, (SubLObject)term_lexicon.$sym142$KNOWN_CYC_TYPES);
        }
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)term_lexicon.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject sner = object.new_class_instance((SubLObject)term_lexicon.$sym141$STANFORD_NER);
                    final SubLObject entity_clusters = ner_clusters(sner, text);
                    SubLObject cdolist_list_var;
                    final SubLObject merged_clusters = cdolist_list_var = methods.funcall_instance_method_with_2_args(sner, (SubLObject)term_lexicon.$sym144$MERGE_CLUSTERS, entity_clusters, self);
                    SubLObject ec = (SubLObject)term_lexicon.NIL;
                    ec = cdolist_list_var.first();
                    while (term_lexicon.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$2 = ec;
                        SubLObject nament = (SubLObject)term_lexicon.NIL;
                        nament = cdolist_list_var_$2.first();
                        while (term_lexicon.NIL != cdolist_list_var_$2) {
                            if (term_lexicon.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym78$GET, methods.funcall_instance_method_with_0_args(nament, (SubLObject)term_lexicon.$sym145$GET_STRING)) && term_lexicon.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(nament, (SubLObject)term_lexicon.$sym146$GET_CYC), allowed_types, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED)) {
                                final SubLObject type = methods.funcall_instance_method_with_0_args(nament, (SubLObject)term_lexicon.$sym146$GET_CYC);
                                final SubLObject subtypes = (SubLObject)term_lexicon.NIL;
                                final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning(nament);
                                final SubLObject string = methods.funcall_instance_method_with_0_args(nament, (SubLObject)term_lexicon.$sym145$GET_STRING);
                                final SubLObject current_entries = methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym78$GET, string);
                                SubLObject cdolist_list_var_$3 = instance_meanings;
                                SubLObject instance = (SubLObject)term_lexicon.NIL;
                                instance = cdolist_list_var_$3.first();
                                while (term_lexicon.NIL != cdolist_list_var_$3) {
                                    final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                                    methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
                                    methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
                                    methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, instance);
                                    methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
                                    methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
                                    methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
                                    new_lexes = (SubLObject)ConsesLow.cons(lex_entry, new_lexes);
                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                    instance = cdolist_list_var_$3.first();
                                }
                                if (term_lexicon.NIL != fabricate_meaningP) {
                                    SubLObject cdolist_list_var_$4 = subtypes;
                                    SubLObject subtype = (SubLObject)term_lexicon.NIL;
                                    subtype = cdolist_list_var_$4.first();
                                    while (term_lexicon.NIL != cdolist_list_var_$4) {
                                        if (term_lexicon.NIL == lexes_contain_entry_of_type(current_entries, subtype)) {
                                            final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                                            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
                                            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
                                            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, (SubLObject)ConsesLow.list(term_lexicon.$const147$InstanceNamedFn_Ternary, string, subtype, Guids.guid_to_string(Guids.new_guid())));
                                            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
                                            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
                                            methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
                                            new_lexes = (SubLObject)ConsesLow.cons(lex_entry, new_lexes);
                                        }
                                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                        subtype = cdolist_list_var_$4.first();
                                    }
                                    if (term_lexicon.NIL == new_lexes && term_lexicon.NIL != type && term_lexicon.NIL == lexes_contain_entry_of_type(current_entries, type)) {
                                        final SubLObject lex_entry2 = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, (SubLObject)ConsesLow.list(term_lexicon.$const147$InstanceNamedFn_Ternary, string, type, Guids.guid_to_string(Guids.new_guid())));
                                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
                                        methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry2);
                                        new_lexes = (SubLObject)ConsesLow.cons(lex_entry2, new_lexes);
                                    }
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            nament = cdolist_list_var_$2.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ec = cdolist_list_var.first();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)term_lexicon.NIL);
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
        if (term_lexicon.NIL != error) {
            Errors.warn((SubLObject)term_lexicon.$str148$___S, error);
        }
        return new_lexes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
    public static SubLObject clear_ner_clusters() {
        final SubLObject cs = term_lexicon.$ner_clusters_caching_state$.getGlobalValue();
        if (term_lexicon.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)term_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
    public static SubLObject remove_ner_clusters(final SubLObject ner, final SubLObject text) {
        return memoization_state.caching_state_remove_function_results_with_args(term_lexicon.$ner_clusters_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(ner, text), (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
    public static SubLObject ner_clusters_internal(final SubLObject ner, final SubLObject text) {
        return methods.funcall_instance_method_with_1_args(ner, (SubLObject)term_lexicon.$sym151$RUN, text);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
    public static SubLObject ner_clusters(final SubLObject ner, final SubLObject text) {
        SubLObject caching_state = term_lexicon.$ner_clusters_caching_state$.getGlobalValue();
        if (term_lexicon.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)term_lexicon.$sym150$NER_CLUSTERS, (SubLObject)term_lexicon.$sym152$_NER_CLUSTERS_CACHING_STATE_, (SubLObject)term_lexicon.$int153$4096, (SubLObject)term_lexicon.EQUAL, (SubLObject)term_lexicon.TWO_INTEGER, (SubLObject)term_lexicon.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ner, text);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)term_lexicon.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)term_lexicon.NIL;
            collision = cdolist_list_var.first();
            while (term_lexicon.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (ner.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (term_lexicon.NIL != cached_args && term_lexicon.NIL == cached_args.rest() && text.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ner_clusters_internal(ner, text)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(ner, text));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13231L)
    public static SubLObject lexes_contain_entry_of_type(final SubLObject entries, final SubLObject type) {
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)term_lexicon.NIL;
        entry = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            final SubLObject denot = methods.funcall_instance_method_with_1_args(entry, (SubLObject)term_lexicon.$sym78$GET, (SubLObject)term_lexicon.$kw79$DENOT);
            if ((cycl_utilities.nat_functor(denot).eql(term_lexicon.$const147$InstanceNamedFn_Ternary) && cycl_utilities.nat_arg2(denot, (SubLObject)term_lexicon.UNPROVIDED).equal(type)) || term_lexicon.NIL != isa.isa_in_any_mtP(denot, type)) {
                return (SubLObject)term_lexicon.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)term_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13740L)
    public static SubLObject term_lexicon_scalar_interval_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject scalar_entries = (SubLObject)term_lexicon.NIL;
        SubLObject cdolist_list_var = abstract_lexicon.scalar_interval_meanings(text);
        SubLObject scalar_string_cycl = (SubLObject)term_lexicon.NIL;
        scalar_string_cycl = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = scalar_string_cycl;
            SubLObject scalar_string = (SubLObject)term_lexicon.NIL;
            SubLObject scalar_cycl = (SubLObject)term_lexicon.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)term_lexicon.$list157);
            scalar_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)term_lexicon.$list157);
            scalar_cycl = current.first();
            current = current.rest();
            if (term_lexicon.NIL == current) {
                final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym78$GET, scalar_string);
                final SubLObject already_known = subl_promotions.memberP(scalar_cycl, known_entries, (SubLObject)term_lexicon.EQUAL, (SubLObject)term_lexicon.$sym158$LEX_ENTRY_DENOT);
                if (term_lexicon.NIL == already_known) {
                    final SubLObject lex_entry = number_term_lex_entry(scalar_string, scalar_cycl);
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
                    scalar_entries = (SubLObject)ConsesLow.cons(lex_entry, scalar_entries);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)term_lexicon.$list157);
            }
            cdolist_list_var = cdolist_list_var.rest();
            scalar_string_cycl = cdolist_list_var.first();
        }
        return scalar_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 14329L)
    public static SubLObject term_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject numbers = abstract_lexicon.number_meanings(text);
        SubLObject result = (SubLObject)term_lexicon.NIL;
        SubLObject cdolist_list_var = numbers;
        SubLObject number = (SubLObject)term_lexicon.NIL;
        number = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = number;
            SubLObject number_string = (SubLObject)term_lexicon.NIL;
            SubLObject meaning = (SubLObject)term_lexicon.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)term_lexicon.$list162);
            number_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)term_lexicon.$list162);
            meaning = current.first();
            current = current.rest();
            if (term_lexicon.NIL == current) {
                final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym78$GET, number_string);
                final SubLObject already_known = subl_promotions.memberP(meaning, known_entries, (SubLObject)term_lexicon.EQUAL, (SubLObject)term_lexicon.$sym158$LEX_ENTRY_DENOT);
                if (term_lexicon.NIL == already_known) {
                    final SubLObject lex_entry = number_term_lex_entry(number_string, meaning);
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
                    result = (SubLObject)ConsesLow.cons(lex_entry, result);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)term_lexicon.$list162);
            }
            cdolist_list_var = cdolist_list_var.rest();
            number = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 14876L)
    public static SubLObject number_term_lex_entry(final SubLObject string, final SubLObject number) {
        final SubLObject lex = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw164$PENN_TAGS, (SubLObject)term_lexicon.$list165);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const166$Number_SP);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, number);
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 15139L)
    public static SubLObject term_lexicon_simple_date_from_string_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject dates = date_utilities.parse_date_from_string_fast(text, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED);
        SubLObject result = (SubLObject)term_lexicon.NIL;
        SubLObject cdolist_list_var = dates;
        SubLObject date = (SubLObject)term_lexicon.NIL;
        date = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, text);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, date);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list93);
            methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, lex_entry);
            result = (SubLObject)ConsesLow.cons(lex_entry, result);
            cdolist_list_var = cdolist_list_var.rest();
            date = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 15710L)
    public static SubLObject date_term_from_number_lex_entry(final SubLObject string, final SubLObject number) {
        final SubLObject lex = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw164$PENN_TAGS, (SubLObject)term_lexicon.$list170);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const91$ProperNoun);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, (SubLObject)ConsesLow.list(term_lexicon.$const171$YearFn, number));
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 15998L)
    public static SubLObject term_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = text_noun_compound_term_lex_entries(text);
        SubLObject entry = (SubLObject)term_lexicon.NIL;
        entry = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(self, (SubLObject)term_lexicon.$sym128$ADD, entry);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 16215L)
    public static SubLObject text_noun_compound_term_lex_entries(final SubLObject str) {
        final SubLObject compounds = abstract_lexicon.noun_compound_meanings(str);
        SubLObject res = (SubLObject)term_lexicon.NIL;
        SubLObject cdolist_list_var = compounds;
        SubLObject compound = (SubLObject)term_lexicon.NIL;
        compound = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = compound;
            SubLObject string = (SubLObject)term_lexicon.NIL;
            SubLObject meanings = (SubLObject)term_lexicon.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)term_lexicon.$list175);
            string = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$5;
            meanings = (cdolist_list_var_$5 = current);
            SubLObject meaning = (SubLObject)term_lexicon.NIL;
            meaning = cdolist_list_var_$5.first();
            while (term_lexicon.NIL != cdolist_list_var_$5) {
                SubLObject current_$7;
                final SubLObject datum_$6 = current_$7 = meaning;
                SubLObject cycl = (SubLObject)term_lexicon.NIL;
                SubLObject agr_pred = (SubLObject)term_lexicon.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)term_lexicon.$list176);
                cycl = current_$7.first();
                current_$7 = current_$7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)term_lexicon.$list176);
                agr_pred = current_$7.first();
                current_$7 = current_$7.rest();
                if (term_lexicon.NIL == current_$7) {
                    res = (SubLObject)ConsesLow.cons(noun_compound_term_lex_entry(string, cycl, agr_pred), res);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)term_lexicon.$list176);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                meaning = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            compound = cdolist_list_var.first();
        }
        return res;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 16593L)
    public static SubLObject noun_compound_term_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number) {
        final SubLObject lex = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
        final SubLObject penn_tags = (SubLObject)((term_lexicon.NIL != backward.removal_ask((SubLObject)ConsesLow.listS(term_lexicon.$const177$genlPreds, number, (SubLObject)term_lexicon.$list178), (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED, (SubLObject)term_lexicon.UNPROVIDED)) ? term_lexicon.$list179 : term_lexicon.$list180);
        final SubLObject reformulated_denotation = reformulator_hub.reformulate_cycl(denotation, term_lexicon.$const181$EverythingPSC, (SubLObject)term_lexicon.UNPROVIDED);
        final SubLObject final_denotation = (term_lexicon.NIL != reformulated_denotation) ? reformulated_denotation : denotation;
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw164$PENN_TAGS, penn_tags);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, term_lexicon.$const182$Noun);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw125$FRAME, term_lexicon.$const126$RegularNounFrame);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, final_denotation);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)ConsesLow.list(number));
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 17228L)
    public static SubLObject term_lexicon_nl_trie_word2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject lex_entries = (SubLObject)term_lexicon.NIL;
                final SubLObject word_unit = nl_trie.nl_trie_word_word_unit(nl_trie_word, (SubLObject)term_lexicon.UNPROVIDED);
                final SubLObject pos_preds = nl_trie.nl_trie_word_pos_preds(nl_trie_word);
                final SubLObject lex_pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_word, (SubLObject)term_lexicon.UNPROVIDED);
                final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(nl_trie_word);
                SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_word);
                SubLObject denot = (SubLObject)term_lexicon.NIL;
                denot = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    if (term_lexicon.NIL == concept_filter_specs || term_lexicon.NIL != denot_passes_filter_specsP(denot, concept_filter_specs)) {
                        final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw186$PRAGMATICS, pragmatics);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, (term_lexicon.NIL != convert_to_elP) ? cycl_utilities.hl_to_el(denot) : denot);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw94$PREDICATE, lex_pred);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, pos_preds);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw187$WORD_UNIT, word_unit);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw188$TRIE_ENTRY, nl_trie_word);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
                        lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 18564L)
    public static SubLObject term_lexicon_nl_trie_name2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject lex_entries = (SubLObject)term_lexicon.NIL;
                final SubLObject pos = term_lexicon.$const91$ProperNoun;
                final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(nl_trie_name, (SubLObject)term_lexicon.UNPROVIDED);
                final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(nl_trie_name);
                SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_name);
                SubLObject denot = (SubLObject)term_lexicon.NIL;
                denot = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    if (term_lexicon.NIL == concept_filter_specs || term_lexicon.NIL != denot_passes_filter_specsP(denot, concept_filter_specs)) {
                        final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw186$PRAGMATICS, pragmatics);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, (term_lexicon.NIL != convert_to_elP) ? cycl_utilities.hl_to_el(denot) : denot);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw94$PREDICATE, predicate);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, pos);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, (SubLObject)term_lexicon.$list193);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw188$TRIE_ENTRY, nl_trie_name);
                        lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 19446L)
    public static SubLObject term_lexicon_nl_trie_tp2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = (SubLObject)term_lexicon.NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push(term_lexicon.$sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject lex_entries = (SubLObject)term_lexicon.NIL;
                final SubLObject pos = nl_trie.nl_trie_entry_pos(tp_entry);
                final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds(tp_entry);
                final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(tp_entry, (SubLObject)term_lexicon.UNPROVIDED);
                final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(tp_entry);
                SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(tp_entry);
                SubLObject denot = (SubLObject)term_lexicon.NIL;
                denot = cdolist_list_var.first();
                while (term_lexicon.NIL != cdolist_list_var) {
                    if (term_lexicon.NIL == concept_filter_specs || term_lexicon.NIL != denot_passes_filter_specsP(denot, concept_filter_specs)) {
                        final SubLObject lex_entry = object.new_class_instance((SubLObject)term_lexicon.$sym87$LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw186$PRAGMATICS, pragmatics);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw79$DENOT, (term_lexicon.NIL != convert_to_elP) ? cycl_utilities.hl_to_el(denot) : denot);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw94$PREDICATE, predicate);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw90$CYC_POS, pos);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw89$STRING, string);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw92$INFLECTIONS, inflections);
                        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)term_lexicon.$sym88$SET, (SubLObject)term_lexicon.$kw188$TRIE_ENTRY, tp_entry);
                        lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)term_lexicon.$sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)term_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)term_lexicon.$sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20360L)
    public static SubLObject denot_passes_filter_specsP(final SubLObject denot, final SubLObject filter_specs) {
        SubLObject cdolist_list_var = filter_specs;
        SubLObject filter_spec = (SubLObject)term_lexicon.NIL;
        filter_spec = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            if (term_lexicon.NIL == denot_passes_filter_specP(denot, filter_spec)) {
                return (SubLObject)term_lexicon.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            filter_spec = cdolist_list_var.first();
        }
        return (SubLObject)term_lexicon.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20553L)
    public static SubLObject denot_passes_filter_specP(final SubLObject denot, final SubLObject filter_spec) {
        return list_utilities.non_empty_list_p(concept_filter.valid_concept_filter_nodes(denot, filter_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20691L)
    public static SubLObject denots_for_term_lexicon_entries(final SubLObject entries) {
        SubLObject result = (SubLObject)term_lexicon.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)term_lexicon.NIL;
        entry = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            final SubLObject item_var = narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, (SubLObject)term_lexicon.$sym78$GET, (SubLObject)term_lexicon.$kw79$DENOT));
            if (term_lexicon.NIL == conses_high.member(item_var, result, (SubLObject)term_lexicon.EQUAL, Symbols.symbol_function((SubLObject)term_lexicon.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20892L)
    public static SubLObject test_simple_date_learn(final SubLObject sentence) {
        final SubLObject lex = new_term_lexicon();
        SubLObject dates = (SubLObject)term_lexicon.NIL;
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)term_lexicon.$sym200$ADD_LEARNER, (SubLObject)term_lexicon.$sym122$SIMPLE_DATE_LEARN);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)term_lexicon.$sym201$LEARN, sentence);
        SubLObject cdolist_list_var;
        final SubLObject lexes = cdolist_list_var = methods.funcall_instance_method_with_1_args(lex, (SubLObject)term_lexicon.$sym78$GET, sentence);
        SubLObject lex_item = (SubLObject)term_lexicon.NIL;
        lex_item = cdolist_list_var.first();
        while (term_lexicon.NIL != cdolist_list_var) {
            dates = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(lex_item, (SubLObject)term_lexicon.$sym78$GET, (SubLObject)term_lexicon.$kw79$DENOT), dates);
            cdolist_list_var = cdolist_list_var.rest();
            lex_item = cdolist_list_var.first();
        }
        return dates;
    }
    
    public static SubLObject declare_term_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "new_term_lexicon", "NEW-TERM-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "get_term_lexicon", "GET-TERM-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "new_case_sensitivity_preferred_term_lexicon", "NEW-CASE-SENSITIVITY-PREFERRED-TERM-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "get_term_lexicon_dependent_lexicons", "GET-TERM-LEXICON-DEPENDENT-LEXICONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "set_term_lexicon_dependent_lexicons", "SET-TERM-LEXICON-DEPENDENT-LEXICONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "get_term_lexicon_concept_filter_specs", "GET-TERM-LEXICON-CONCEPT-FILTER-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "set_term_lexicon_concept_filter_specs", "SET-TERM-LEXICON-CONCEPT-FILTER-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "get_term_lexicon_convert_to_elP", "GET-TERM-LEXICON-CONVERT-TO-EL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "set_term_lexicon_convert_to_elP", "SET-TERM-LEXICON-CONVERT-TO-EL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "subloop_reserved_initialize_term_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "subloop_reserved_initialize_term_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_p", "TERM-LEXICON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_initialize_method", "TERM-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_note_dependent_lexicon_method", "TERM-LEXICON-NOTE-DEPENDENT-LEXICON-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_remove_dependent_lexicon_method", "TERM-LEXICON-REMOVE-DEPENDENT-LEXICON-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_set_convert_to_el_method", "TERM-LEXICON-SET-CONVERT-TO-EL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_get_convert_to_el_method", "TERM-LEXICON-GET-CONVERT-TO-EL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_remove_all_concept_filter_specs_method", "TERM-LEXICON-REMOVE-ALL-CONCEPT-FILTER-SPECS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_add_concept_filter_spec_method", "TERM-LEXICON-ADD-CONCEPT-FILTER-SPEC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_get_concept_filter_specs_method", "TERM-LEXICON-GET-CONCEPT-FILTER-SPECS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_create_lex_entries_method", "TERM-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_resporator_to_lex_entry_method", "TERM-LEXICON-RESPORATOR-TO-LEX-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_copy_method", "TERM-LEXICON-COPY-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_isolate_method", "TERM-LEXICON-ISOLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_delete_string_with_term_method", "TERM-LEXICON-DELETE-STRING-WITH-TERM-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "get_numeric_date_patterns", "GET-NUMERIC-DATE-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_simple_date_learn_method", "TERM-LEXICON-SIMPLE-DATE-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_date_learn_method", "TERM-LEXICON-DATE-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_stanford_ner_date_learn_method", "TERM-LEXICON-STANFORD-NER-DATE-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_stanford_ner_learn_method", "TERM-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "clear_ner_clusters", "CLEAR-NER-CLUSTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "remove_ner_clusters", "REMOVE-NER-CLUSTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "ner_clusters_internal", "NER-CLUSTERS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "ner_clusters", "NER-CLUSTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "lexes_contain_entry_of_type", "LEXES-CONTAIN-ENTRY-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_scalar_interval_learn_method", "TERM-LEXICON-SCALAR-INTERVAL-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_number_learn_method", "TERM-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "number_term_lex_entry", "NUMBER-TERM-LEX-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_simple_date_from_string_learn_method", "TERM-LEXICON-SIMPLE-DATE-FROM-STRING-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "date_term_from_number_lex_entry", "DATE-TERM-FROM-NUMBER-LEX-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_noun_compound_learn_method", "TERM-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "text_noun_compound_term_lex_entries", "TEXT-NOUN-COMPOUND-TERM-LEX-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "noun_compound_term_lex_entry", "NOUN-COMPOUND-TERM-LEX-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_nl_trie_word2lex_entries_method", "TERM-LEXICON-NL-TRIE-WORD2LEX-ENTRIES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_nl_trie_name2lex_entries_method", "TERM-LEXICON-NL-TRIE-NAME2LEX-ENTRIES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "term_lexicon_nl_trie_tp2lex_entries_method", "TERM-LEXICON-NL-TRIE-TP2LEX-ENTRIES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "denot_passes_filter_specsP", "DENOT-PASSES-FILTER-SPECS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "denot_passes_filter_specP", "DENOT-PASSES-FILTER-SPEC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "denots_for_term_lexicon_entries", "DENOTS-FOR-TERM-LEXICON-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.term_lexicon", "test_simple_date_learn", "TEST-SIMPLE-DATE-LEARN", 1, 0, false);
        return (SubLObject)term_lexicon.NIL;
    }
    
    public static SubLObject init_term_lexicon_file() {
        term_lexicon.$term_lexicon$ = SubLFiles.defparameter("*TERM-LEXICON*", (SubLObject)term_lexicon.NIL);
        term_lexicon.$numeric_date_patterns$ = SubLFiles.defparameter("*NUMERIC-DATE-PATTERNS*", (SubLObject)ConsesLow.list((SubLObject)term_lexicon.$str118$_0_9__1_2______0_9__1_2______0_9_, (SubLObject)term_lexicon.$str119$_0_9__4_4_______0_9__1_2_______0_, (SubLObject)term_lexicon.$str120$_0_9__1_2______0_9__2_4_, (SubLObject)term_lexicon.$str121$_0_9__4_));
        term_lexicon.$compiled_numeric_date_patterns$ = SubLFiles.deflexical("*COMPILED-NUMERIC-DATE-PATTERNS*", (SubLObject)term_lexicon.NIL);
        term_lexicon.$ner_clusters_caching_state$ = SubLFiles.deflexical("*NER-CLUSTERS-CACHING-STATE*", (SubLObject)term_lexicon.NIL);
        term_lexicon.$term_lexicon_learners$ = SubLFiles.defparameter("*TERM-LEXICON-LEARNERS*", (SubLObject)term_lexicon.$list154);
        return (SubLObject)term_lexicon.NIL;
    }
    
    public static SubLObject setup_term_lexicon_file() {
        classes.subloop_new_class((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym3$ABSTRACT_LEXICON, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.$list4);
        classes.class_set_implements_slot_listeners((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym17$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym36$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE);
        subloop_reserved_initialize_term_lexicon_class((SubLObject)term_lexicon.$sym0$TERM_LEXICON);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym37$INITIALIZE, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.$list39);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym37$INITIALIZE, (SubLObject)term_lexicon.$sym41$TERM_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym42$NOTE_DEPENDENT_LEXICON, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list43, (SubLObject)term_lexicon.$list44);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym42$NOTE_DEPENDENT_LEXICON, (SubLObject)term_lexicon.$sym46$TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym47$REMOVE_DEPENDENT_LEXICON, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list43, (SubLObject)term_lexicon.$list48);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym47$REMOVE_DEPENDENT_LEXICON, (SubLObject)term_lexicon.$sym50$TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym51$SET_CONVERT_TO_EL, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.$list53, (SubLObject)term_lexicon.$list54);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym51$SET_CONVERT_TO_EL, (SubLObject)term_lexicon.$sym56$TERM_LEXICON_SET_CONVERT_TO_EL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym57$GET_CONVERT_TO_EL, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.$list58);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym57$GET_CONVERT_TO_EL, (SubLObject)term_lexicon.$sym60$TERM_LEXICON_GET_CONVERT_TO_EL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.$list62);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS, (SubLObject)term_lexicon.$sym64$TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym65$ADD_CONCEPT_FILTER_SPEC, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.$list66, (SubLObject)term_lexicon.$list67);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym65$ADD_CONCEPT_FILTER_SPEC, (SubLObject)term_lexicon.$sym70$TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym71$GET_CONCEPT_FILTER_SPECS, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.$list72);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym71$GET_CONCEPT_FILTER_SPECS, (SubLObject)term_lexicon.$sym74$TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym75$CREATE_LEX_ENTRIES, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list76, (SubLObject)term_lexicon.$list77);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym75$CREATE_LEX_ENTRIES, (SubLObject)term_lexicon.$sym83$TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_class_method((SubLObject)term_lexicon.$sym84$RESPORATOR_TO_LEX_ENTRY, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list85, (SubLObject)term_lexicon.$list86);
        methods.subloop_register_class_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym84$RESPORATOR_TO_LEX_ENTRY, (SubLObject)term_lexicon.$sym97$TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym98$COPY, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.$list99, (SubLObject)term_lexicon.$list100);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym98$COPY, (SubLObject)term_lexicon.$sym104$TERM_LEXICON_COPY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym105$ISOLATE, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.NIL, (SubLObject)term_lexicon.$list106);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym105$ISOLATE, (SubLObject)term_lexicon.$sym108$TERM_LEXICON_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym109$DELETE_STRING_WITH_TERM, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list52, (SubLObject)term_lexicon.$list110, (SubLObject)term_lexicon.$list111);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym109$DELETE_STRING_WITH_TERM, (SubLObject)term_lexicon.$sym117$TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym122$SIMPLE_DATE_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list124);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym122$SIMPLE_DATE_LEARN, (SubLObject)term_lexicon.$sym129$TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym130$DATE_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list131);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym130$DATE_LEARN, (SubLObject)term_lexicon.$sym132$TERM_LEXICON_DATE_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym133$STANFORD_NER_DATE_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list134);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym133$STANFORD_NER_DATE_LEARN, (SubLObject)term_lexicon.$sym137$TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym135$STANFORD_NER_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list138, term_lexicon.$list139);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym135$STANFORD_NER_LEARN, (SubLObject)term_lexicon.$sym149$TERM_LEXICON_STANFORD_NER_LEARN_METHOD);
        memoization_state.note_globally_cached_function((SubLObject)term_lexicon.$sym150$NER_CLUSTERS);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym155$SCALAR_INTERVAL_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list156);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym155$SCALAR_INTERVAL_LEARN, (SubLObject)term_lexicon.$sym159$TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym160$NUMBER_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list161);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym160$NUMBER_LEARN, (SubLObject)term_lexicon.$sym163$TERM_LEXICON_NUMBER_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym167$SIMPLE_DATE_FROM_STRING_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list168);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym167$SIMPLE_DATE_FROM_STRING_LEARN, (SubLObject)term_lexicon.$sym169$TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym172$NOUN_COMPOUND_LEARN, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list123, (SubLObject)term_lexicon.$list173);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym172$NOUN_COMPOUND_LEARN, (SubLObject)term_lexicon.$sym174$TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym80$NL_TRIE_WORD2LEX_ENTRIES, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list183, (SubLObject)term_lexicon.$list184);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym80$NL_TRIE_WORD2LEX_ENTRIES, (SubLObject)term_lexicon.$sym189$TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym82$NL_TRIE_NAME2LEX_ENTRIES, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list190, (SubLObject)term_lexicon.$list191);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym82$NL_TRIE_NAME2LEX_ENTRIES, (SubLObject)term_lexicon.$sym194$TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)term_lexicon.$sym81$NL_TRIE_TP2LEX_ENTRIES, (SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$list38, (SubLObject)term_lexicon.$list195, (SubLObject)term_lexicon.$list196);
        methods.subloop_register_instance_method((SubLObject)term_lexicon.$sym0$TERM_LEXICON, (SubLObject)term_lexicon.$sym81$NL_TRIE_TP2LEX_ENTRIES, (SubLObject)term_lexicon.$sym198$TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD);
        access_macros.register_external_symbol((SubLObject)term_lexicon.$sym199$DENOTS_FOR_TERM_LEXICON_ENTRIES);
        generic_testing.define_test_case_table_int((SubLObject)term_lexicon.$sym202$TEST_SIMPLE_DATE_LEARN, (SubLObject)ConsesLow.list(new SubLObject[] { term_lexicon.$kw203$TEST, term_lexicon.$sym204$HAS_MEMBER_EQUAL_, term_lexicon.$kw205$OWNER, term_lexicon.NIL, term_lexicon.$kw206$CLASSES, term_lexicon.NIL, term_lexicon.$kw207$KB, term_lexicon.$kw208$FULL, term_lexicon.$kw209$WORKING_, term_lexicon.T }), (SubLObject)term_lexicon.$list210);
        return (SubLObject)term_lexicon.NIL;
    }
    
    private static SubLObject _constant_139_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @param FABRICATE-MEANINGS boolean; if true, some meaning will be returned even if the found date is not understood\n   @return listp; a list of term-lexicon lexical entries learned from TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"), (SubLObject)term_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)term_lexicon.EQ, (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-CYC-TYPES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY-CLUSTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NER-CLUSTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MERGED-CLUSTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE-CLUSTERS")), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-CLUSTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EC"), (SubLObject)SubLObjectFactory.makeSymbol("MERGED-CLUSTERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)SubLObjectFactory.makeSymbol("EC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-TYPES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTYPES"), (SubLObject)term_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NAMENT-INSTANCE-MEANING"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NAMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-MEANINGS")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-MEANING?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES-CONTAIN-ENTRY-OF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTYPE")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GUID"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES")) }))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES-CONTAIN-ENTRY-OF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GUID"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES")) }))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))));
    }
    
    @Override
	public void declareFunctions() {
        declare_term_lexicon_file();
    }
    
    @Override
	public void initializeVariables() {
        init_term_lexicon_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_term_lexicon_file();
    }
    
    static {
        me = (SubLFile)new term_lexicon();
        term_lexicon.$term_lexicon$ = null;
        term_lexicon.$numeric_date_patterns$ = null;
        term_lexicon.$compiled_numeric_date_patterns$ = null;
        term_lexicon.$ner_clusters_caching_state$ = null;
        term_lexicon.$term_lexicon_learners$ = null;
        $sym0$TERM_LEXICON = SubLObjectFactory.makeSymbol("TERM-LEXICON");
        $sym1$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $kw2$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym3$ABSTRACT_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON");
        $list4 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermLexiconSpecification"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)term_lexicon.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD2LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-TP2LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME2LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-DATE-LEARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-TYPES")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOTE-DEPENDENT-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DEPENDENT-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONVERT-TO-EL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONVERT-TO-EL"), (SubLObject)term_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-CONCEPT-FILTER-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONCEPT-FILTER-SPECS"), (SubLObject)term_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym5$DEPENDENT_LEXICONS = SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS");
        $sym6$CONCEPT_FILTER_SPECS = SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS");
        $sym7$CONVERT_TO_EL_ = SubLObjectFactory.makeSymbol("CONVERT-TO-EL?");
        $sym8$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym9$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym10$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $list11 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
        $sym12$DEFAULT_EXCLUDE_PREDICATES = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES");
        $sym13$DEFAULT_BASE_MT = SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT");
        $const14$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
        $sym15$DEFAULT_KB_SPEC = SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC");
        $const16$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"));
        $sym17$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-CLASS");
        $sym18$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym19$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym20$ALLOWED_MTS = SubLObjectFactory.makeSymbol("ALLOWED-MTS");
        $kw21$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym22$EXCLUDED_MTS = SubLObjectFactory.makeSymbol("EXCLUDED-MTS");
        $sym23$BASE_MT = SubLObjectFactory.makeSymbol("BASE-MT");
        $sym24$ROOT_MT = SubLObjectFactory.makeSymbol("ROOT-MT");
        $sym25$EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("EXCLUDED-PREDS");
        $sym26$EXCLUDED_POS_LIST = SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST");
        $sym27$TRIE = SubLObjectFactory.makeSymbol("TRIE");
        $sym28$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym29$IGNORE_CACHE_ = SubLObjectFactory.makeSymbol("IGNORE-CACHE?");
        $sym30$CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("CASE-SENSITIVITY");
        $sym31$ALLOW_FABRICATION_ = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?");
        $sym32$LEARNED = SubLObjectFactory.makeSymbol("LEARNED");
        $sym33$ACTIVE_LEARNERS = SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS");
        $sym34$ALLOW_STEMMING = SubLObjectFactory.makeSymbol("ALLOW-STEMMING");
        $sym35$STOP_WORDS = SubLObjectFactory.makeSymbol("STOP-WORDS");
        $sym36$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-INSTANCE");
        $sym37$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Initializes this term lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), (SubLObject)term_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym41$TERM_LEXICON_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-INITIALIZE-METHOD");
        $sym42$NOTE_DEPENDENT_LEXICON = SubLObjectFactory.makeSymbol("NOTE-DEPENDENT-LEXICON");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym46$TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-NOTE-DEPENDENT-LEXICON-METHOD");
        $sym47$REMOVE_DEPENDENT_LEXICON = SubLObjectFactory.makeSymbol("REMOVE-DEPENDENT-LEXICON");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym50$TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-REMOVE-DEPENDENT-LEXICON-METHOD");
        $sym51$SET_CONVERT_TO_EL = SubLObjectFactory.makeSymbol("SET-CONVERT-TO-EL");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Set lexicon's convert-to-el? value to BOOLEAN."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym56$TERM_LEXICON_SET_CONVERT_TO_EL_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-SET-CONVERT-TO-EL-METHOD");
        $sym57$GET_CONVERT_TO_EL = SubLObjectFactory.makeSymbol("GET-CONVERT-TO-EL");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Return lexicon's convert-to-el? value"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?")));
        $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym60$TERM_LEXICON_GET_CONVERT_TO_EL_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-GET-CONVERT-TO-EL-METHOD");
        $sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS = SubLObjectFactory.makeSymbol("REMOVE-ALL-CONCEPT-FILTER-SPECS");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"), (SubLObject)term_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym64$TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-REMOVE-ALL-CONCEPT-FILTER-SPECS-METHOD");
        $sym65$ADD_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("ADD-CONCEPT-FILTER-SPEC");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Set lexicon's concept filter spec to SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECIFICATION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)term_lexicon.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym69$CONCEPT_FILTER_SPECIFICATION_P = SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECIFICATION-P");
        $sym70$TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-ADD-CONCEPT-FILTER-SPEC-METHOD");
        $sym71$GET_CONCEPT_FILTER_SPECS = SubLObjectFactory.makeSymbol("GET-CONCEPT-FILTER-SPECS");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Return lexicon's concept filter specs"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS")));
        $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym74$TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-GET-CONCEPT-FILTER-SPECS-METHOD");
        $sym75$CREATE_LEX_ENTRIES = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD2LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-TP2LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)term_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME2LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))))));
        $sym78$GET = SubLObjectFactory.makeSymbol("GET");
        $kw79$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym80$NL_TRIE_WORD2LEX_ENTRIES = SubLObjectFactory.makeSymbol("NL-TRIE-WORD2LEX-ENTRIES");
        $sym81$NL_TRIE_TP2LEX_ENTRIES = SubLObjectFactory.makeSymbol("NL-TRIE-TP2LEX-ENTRIES");
        $sym82$NL_TRIE_NAME2LEX_ENTRIES = SubLObjectFactory.makeSymbol("NL-TRIE-NAME2LEX-ENTRIES");
        $sym83$TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-CREATE-LEX-ENTRIES-METHOD");
        $sym84$RESPORATOR_TO_LEX_ENTRY = SubLObjectFactory.makeSymbol("RESPORATOR-TO-LEX-ENTRY");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"));
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))));
        $sym87$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
        $sym88$SET = SubLObjectFactory.makeSymbol("SET");
        $kw89$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw90$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $const91$ProperNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $kw92$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $list93 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")));
        $kw94$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $const95$denotation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"));
        $sym96$RESPORATOR_TO_CYCL = SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL");
        $sym97$TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-RESPORATOR-TO-LEX-ENTRY-METHOD");
        $sym98$COPY = SubLObjectFactory.makeSymbol("COPY");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return TERM-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))), (SubLObject)ConsesLow.list((SubLObject)term_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")));
        $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym102$TERM_LEXICON_P = SubLObjectFactory.makeSymbol("TERM-LEXICON-P");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"));
        $sym104$TERM_LEXICON_COPY_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-COPY-METHOD");
        $sym105$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Finalizes this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym108$TERM_LEXICON_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-ISOLATE-METHOD");
        $sym109$DELETE_STRING_WITH_TERM = SubLObjectFactory.makeSymbol("DELETE-STRING-WITH-TERM");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Deletes the entry associating STRING with CYCL from this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)term_lexicon.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-ENTRY-FROM-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym113$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym114$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $sym115$GET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY");
        $sym116$DELETE_ENTRY_FROM_STRING = SubLObjectFactory.makeSymbol("DELETE-ENTRY-FROM-STRING");
        $sym117$TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-DELETE-STRING-WITH-TERM-METHOD");
        $str118$_0_9__1_2______0_9__1_2______0_9_ = SubLObjectFactory.makeString("[0-9]{1,2}[/-][0-9]{1,2}[/-][0-9]{2,4}");
        $str119$_0_9__4_4_______0_9__1_2_______0_ = SubLObjectFactory.makeString("[0-9]{4,4}[./-][0-9]{1,2}[./-][0-9]{1,2}");
        $str120$_0_9__1_2______0_9__2_4_ = SubLObjectFactory.makeString("[0-9]{1,2}[/-][0-9]{2,4}");
        $str121$_0_9__4_ = SubLObjectFactory.makeString("[0-9]{4}");
        $sym122$SIMPLE_DATE_LEARN = SubLObjectFactory.makeSymbol("SIMPLE-DATE-LEARN");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NUMERIC-DATE-PATTERNS")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-DATE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-ALL-MATCHES-FOR-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATE-FROM-STRING-FAST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-DATE-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-DATE-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-DATE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-CYCL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))));
        $kw125$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $const126$RegularNounFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"));
        $sym127$LEX_ENTRY_EQUAL_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P");
        $sym128$ADD = SubLObjectFactory.makeSymbol("ADD");
        $sym129$TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-SIMPLE-DATE-LEARN-METHOD");
        $sym130$DATE_LEARN = SubLObjectFactory.makeSymbol("DATE-LEARN");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATE-FROM-STRING-FAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-CYCL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXES"))));
        $sym132$TERM_LEXICON_DATE_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-DATE-LEARN-METHOD");
        $sym133$STANFORD_NER_DATE_LEARN = SubLObjectFactory.makeSymbol("STANFORD-NER-DATE-LEARN");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries for dates\n   @return listp; a list of term-lexicon lexical entries learned from TEXT.\n   This is intended to work over large strings, finding the dates embedded within them, using the \n   Stanford Named Entity Recognizer as a test to see what might be a date."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN")), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date")))), (SubLObject)term_lexicon.NIL)));
        $sym135$STANFORD_NER_LEARN = SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN");
        $list136 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date")));
        $sym137$TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-STANFORD-NER-DATE-LEARN-METHOD");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-MEANING?"), (SubLObject)term_lexicon.T));
        $list139 = _constant_139_initializer();
        $kw140$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym141$STANFORD_NER = SubLObjectFactory.makeSymbol("STANFORD-NER");
        $sym142$KNOWN_CYC_TYPES = SubLObjectFactory.makeSymbol("KNOWN-CYC-TYPES");
        $sym143$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym144$MERGE_CLUSTERS = SubLObjectFactory.makeSymbol("MERGE-CLUSTERS");
        $sym145$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym146$GET_CYC = SubLObjectFactory.makeSymbol("GET-CYC");
        $const147$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $str148$___S = SubLObjectFactory.makeString("~%~S");
        $sym149$TERM_LEXICON_STANFORD_NER_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-STANFORD-NER-LEARN-METHOD");
        $sym150$NER_CLUSTERS = SubLObjectFactory.makeSymbol("NER-CLUSTERS");
        $sym151$RUN = SubLObjectFactory.makeSymbol("RUN");
        $sym152$_NER_CLUSTERS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NER-CLUSTERS-CACHING-STATE*");
        $int153$4096 = SubLObjectFactory.makeInteger(4096);
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-INTERVAL-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-DATE-LEARN"));
        $sym155$SCALAR_INTERVAL_LEARN = SubLObjectFactory.makeSymbol("SCALAR-INTERVAL-LEARN");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCALAR-ENTRIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCALAR-STRING-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCALAR-INTERVAL-MEANINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCALAR-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-CYCL")), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-STRING-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALREADY-KNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)term_lexicon.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-DENOT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("ALREADY-KNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-TERM-LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-CYCL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-ENTRIES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-ENTRIES"))));
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCALAR-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-CYCL"));
        $sym158$LEX_ENTRY_DENOT = SubLObjectFactory.makeSymbol("LEX-ENTRY-DENOT");
        $sym159$TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-SCALAR-INTERVAL-LEARN-METHOD");
        $sym160$NUMBER_LEARN = SubLObjectFactory.makeSymbol("NUMBER-LEARN");
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-MEANINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)term_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING")), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALREADY-KNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)term_lexicon.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-DENOT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("ALREADY-KNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-TERM-LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING"));
        $sym163$TERM_LEXICON_NUMBER_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-NUMBER-LEARN-METHOD");
        $kw164$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CD"));
        $const166$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $sym167$SIMPLE_DATE_FROM_STRING_LEARN = SubLObjectFactory.makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("learn a date using the entire string in TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATE-FROM-STRING-FAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)term_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("DATES")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym169$TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-SIMPLE-DATE-FROM-STRING-LEARN-METHOD");
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"));
        $const171$YearFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $sym172$NOUN_COMPOUND_LEARN = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN");
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT-NOUN-COMPOUND-TERM-LEX-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"))));
        $sym174$TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-NOUN-COMPOUND-LEARN-METHOD");
        $list175 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MEANINGS"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("AGR-PRED"));
        $const177$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list178 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"));
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"));
        $const181$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const182$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD"));
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; a lexical string\n   @param NL-TRIE-WORD nl-trie-word-p; an nl-trie-word associated with STRING\n   @return lex-entry-p; a lexical entry with properties STRING and NL-TRIE-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)term_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-PASSES-FILTER-SPECS?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-PRED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PREDS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) }))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $kw186$PRAGMATICS = SubLObjectFactory.makeKeyword("PRAGMATICS");
        $kw187$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $kw188$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
        $sym189$TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-NL-TRIE-WORD2LEX-ENTRIES-METHOD");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME"));
        $list191 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)term_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-PASSES-FILTER-SPECS?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) }))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $list193 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic")));
        $sym194$TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-NL-TRIE-NAME2LEX-ENTRIES-METHOD");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"));
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)term_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-PASSES-FILTER-SPECS?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATICS"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMATICS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-EL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TP-ENTRY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) }))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");
        $sym198$TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("TERM-LEXICON-NL-TRIE-TP2LEX-ENTRIES-METHOD");
        $sym199$DENOTS_FOR_TERM_LEXICON_ENTRIES = SubLObjectFactory.makeSymbol("DENOTS-FOR-TERM-LEXICON-ENTRIES");
        $sym200$ADD_LEARNER = SubLObjectFactory.makeSymbol("ADD-LEARNER");
        $sym201$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym202$TEST_SIMPLE_DATE_LEARN = SubLObjectFactory.makeSymbol("TEST-SIMPLE-DATE-LEARN");
        $kw203$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym204$HAS_MEMBER_EQUAL_ = SubLObjectFactory.makeSymbol("HAS-MEMBER-EQUAL?");
        $kw205$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw206$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw207$KB = SubLObjectFactory.makeKeyword("KB");
        $kw208$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw209$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list210 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("12/31/2006")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("31/12/2006")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2/12/2006")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)term_lexicon.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2/12/2006")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)term_lexicon.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("12-31-2006")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2006.12.31")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("12/2006")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006)))));
    }
}

/*

	Total time: 747 ms
	 synthetic 
*/