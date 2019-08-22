package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class textual_inference_lexicon extends SubLTranslatedFile {
    public static final SubLFile me = new textual_inference_lexicon();

    public static final String myName = "com.cyc.cycjava.cycl.textual_inference_lexicon";

    public static final String myFingerPrint = "df0da013402d6c9cd4815f1e4b39d447681a32b9bdf52715daa194d01a07c862";

    // Internal Constants
    public static final SubLSymbol TEXTUAL_INFERENCE_LEXICON = makeSymbol("TEXTUAL-INFERENCE-LEXICON");



    public static final SubLList $list2 = list(list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell(makeString("TextualInferenceLexiconSpecification"))));





    public static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");



    public static final SubLList $list7 = list(new SubLObject[]{ reader_make_constant_shell(makeString("WebSearchDataMt")), reader_make_constant_shell(makeString("CyclistsMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("WordNetMappingMt")), reader_make_constant_shell(makeString("PornographyJargonMt")), reader_make_constant_shell(makeString("CommonEnglishMisspellingsMt")), reader_make_constant_shell(makeString("ComputereseLexicalMt")), reader_make_constant_shell(makeString("CyclishMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertionsMt")), reader_make_constant_shell(makeString("EnglishWordSenseAssertions-HoldingMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertions-WordNetImportMt")), reader_make_constant_shell(makeString("RedundantLexicalMt")), reader_make_constant_shell(makeString("PDATemplateTestMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("SupplementalDeterminerSemTransLexicalMt")) });





    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical = reader_make_constant_shell(makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));



    private static final SubLObject $$AbstractLexiconSpecification = reader_make_constant_shell(makeString("AbstractLexiconSpecification"));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-CLASS");























    public static final SubLSymbol $sym25$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");



    public static final SubLSymbol $sym27$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");













    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-INSTANCE");

    public static SubLObject subloop_reserved_initialize_textual_inference_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list7);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_textual_inference_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
        return NIL;
    }

    public static SubLObject textual_inference_lexicon_p(final SubLObject v_textual_inference_lexicon) {
        return classes.subloop_instanceof_class(v_textual_inference_lexicon, TEXTUAL_INFERENCE_LEXICON);
    }

    public static SubLObject declare_textual_inference_lexicon_file() {
        declareFunction(me, "subloop_reserved_initialize_textual_inference_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_textual_inference_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-INSTANCE", 1, 0, false);
        declareFunction(me, "textual_inference_lexicon_p", "TEXTUAL-INFERENCE-LEXICON-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_textual_inference_lexicon_file() {
        return NIL;
    }

    public static SubLObject setup_textual_inference_lexicon_file() {
        classes.subloop_new_class(TEXTUAL_INFERENCE_LEXICON, CYCLIFIER_LEXICON, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(TEXTUAL_INFERENCE_LEXICON, NIL);
        classes.subloop_note_class_initialization_function(TEXTUAL_INFERENCE_LEXICON, SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function(TEXTUAL_INFERENCE_LEXICON, SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE);
        subloop_reserved_initialize_textual_inference_lexicon_class(TEXTUAL_INFERENCE_LEXICON);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_textual_inference_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_textual_inference_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_textual_inference_lexicon_file();
    }

    
}

/**
 * Total time: 25 ms
 */
