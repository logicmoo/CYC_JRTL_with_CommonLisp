package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class textual_inference_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.textual_inference_lexicon";
    public static final String myFingerPrint = "df0da013402d6c9cd4815f1e4b39d447681a32b9bdf52715daa194d01a07c862";
    private static final SubLSymbol $sym0$TEXTUAL_INFERENCE_LEXICON;
    private static final SubLSymbol $sym1$CYCLIFIER_LEXICON;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$ABSTRACT_LEXICON;
    private static final SubLSymbol $sym6$DEFAULT_EXCLUDE_MTS;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFAULT_EXCLUDE_PREDICATES;
    private static final SubLSymbol $sym9$DEFAULT_BASE_MT;
    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical;
    private static final SubLSymbol $sym11$DEFAULT_KB_SPEC;
    private static final SubLObject $const12$AbstractLexiconSpecification;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS;
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
    private static final SubLSymbol $sym32$SEMTRANS_LEXICON;
    private static final SubLSymbol $sym33$MY_TERM_LEXICON;
    private static final SubLSymbol $sym34$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/textual-inference-lexicon.lisp", position = 1432L)
    public static SubLObject subloop_reserved_initialize_textual_inference_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym3$OBJECT, (SubLObject)textual_inference_lexicon.$sym4$INSTANCE_COUNT, (SubLObject)textual_inference_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym6$DEFAULT_EXCLUDE_MTS, (SubLObject)textual_inference_lexicon.$list7);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym9$DEFAULT_BASE_MT, textual_inference_lexicon.$const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym11$DEFAULT_KB_SPEC, textual_inference_lexicon.$const12$AbstractLexiconSpecification);
        return (SubLObject)textual_inference_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/textual-inference-lexicon.lisp", position = 1432L)
    public static SubLObject subloop_reserved_initialize_textual_inference_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym3$OBJECT, (SubLObject)textual_inference_lexicon.$sym14$ISOLATED_P, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym3$OBJECT, (SubLObject)textual_inference_lexicon.$sym15$INSTANCE_NUMBER, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym16$ALLOWED_MTS, (SubLObject)textual_inference_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym18$EXCLUDED_MTS, (SubLObject)textual_inference_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym19$BASE_MT, (SubLObject)textual_inference_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym20$ROOT_MT, (SubLObject)textual_inference_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym21$EXCLUDED_PREDS, (SubLObject)textual_inference_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym22$EXCLUDED_POS_LIST, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym23$TRIE, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym24$CACHE, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym25$IGNORE_CACHE_, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym26$CASE_SENSITIVITY, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym27$ALLOW_FABRICATION_, (SubLObject)textual_inference_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym28$LEARNED, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym29$ACTIVE_LEARNERS, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym30$ALLOW_STEMMING, (SubLObject)textual_inference_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)textual_inference_lexicon.$sym31$STOP_WORDS, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)textual_inference_lexicon.$sym32$SEMTRANS_LEXICON, (SubLObject)textual_inference_lexicon.$sym33$MY_TERM_LEXICON, (SubLObject)textual_inference_lexicon.NIL);
        return (SubLObject)textual_inference_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/textual-inference-lexicon.lisp", position = 1432L)
    public static SubLObject textual_inference_lexicon_p(final SubLObject v_textual_inference_lexicon) {
        return classes.subloop_instanceof_class(v_textual_inference_lexicon, (SubLObject)textual_inference_lexicon.$sym0$TEXTUAL_INFERENCE_LEXICON);
    }
    
    public static SubLObject declare_textual_inference_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.textual_inference_lexicon", "subloop_reserved_initialize_textual_inference_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.textual_inference_lexicon", "subloop_reserved_initialize_textual_inference_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.textual_inference_lexicon", "textual_inference_lexicon_p", "TEXTUAL-INFERENCE-LEXICON-P", 1, 0, false);
        return (SubLObject)textual_inference_lexicon.NIL;
    }
    
    public static SubLObject init_textual_inference_lexicon_file() {
        return (SubLObject)textual_inference_lexicon.NIL;
    }
    
    public static SubLObject setup_textual_inference_lexicon_file() {
        classes.subloop_new_class((SubLObject)textual_inference_lexicon.$sym0$TEXTUAL_INFERENCE_LEXICON, (SubLObject)textual_inference_lexicon.$sym1$CYCLIFIER_LEXICON, (SubLObject)textual_inference_lexicon.NIL, (SubLObject)textual_inference_lexicon.NIL, (SubLObject)textual_inference_lexicon.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)textual_inference_lexicon.$sym0$TEXTUAL_INFERENCE_LEXICON, (SubLObject)textual_inference_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)textual_inference_lexicon.$sym0$TEXTUAL_INFERENCE_LEXICON, (SubLObject)textual_inference_lexicon.$sym13$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)textual_inference_lexicon.$sym0$TEXTUAL_INFERENCE_LEXICON, (SubLObject)textual_inference_lexicon.$sym34$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE);
        subloop_reserved_initialize_textual_inference_lexicon_class((SubLObject)textual_inference_lexicon.$sym0$TEXTUAL_INFERENCE_LEXICON);
        return (SubLObject)textual_inference_lexicon.NIL;
    }
    
    public void declareFunctions() {
        declare_textual_inference_lexicon_file();
    }
    
    public void initializeVariables() {
        init_textual_inference_lexicon_file();
    }
    
    public void runTopLevelForms() {
        setup_textual_inference_lexicon_file();
    }
    
    static {
        me = (SubLFile)new textual_inference_lexicon();
        $sym0$TEXTUAL_INFERENCE_LEXICON = SubLObjectFactory.makeSymbol("TEXTUAL-INFERENCE-LEXICON");
        $sym1$CYCLIFIER_LEXICON = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextualInferenceLexiconSpecification"))));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$ABSTRACT_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON");
        $sym6$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $list7 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
        $sym8$DEFAULT_EXCLUDE_PREDICATES = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES");
        $sym9$DEFAULT_BASE_MT = SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT");
        $const10$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
        $sym11$DEFAULT_KB_SPEC = SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC");
        $const12$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"));
        $sym13$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-CLASS");
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
        $sym32$SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON");
        $sym33$MY_TERM_LEXICON = SubLObjectFactory.makeSymbol("MY-TERM-LEXICON");
        $sym34$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-INSTANCE");
    }
}

/*

	Total time: 25 ms
	
*/