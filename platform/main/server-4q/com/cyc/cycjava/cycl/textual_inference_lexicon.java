package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class textual_inference_lexicon
    extends
      SubLTranslatedFile
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
  public static SubLObject subloop_reserved_initialize_textual_inference_lexicon_class(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym6$DEFAULT_EXCLUDE_MTS, $list7 );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list( lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(
        thread ) ) );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym9$DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym11$DEFAULT_KB_SPEC, $const12$AbstractLexiconSpecification );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/textual-inference-lexicon.lisp", position = 1432L)
  public static SubLObject subloop_reserved_initialize_textual_inference_lexicon_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym16$ALLOWED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym18$EXCLUDED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym19$BASE_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym20$ROOT_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym21$EXCLUDED_PREDS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym22$EXCLUDED_POS_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym23$TRIE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym24$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym26$CASE_SENSITIVITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym28$LEARNED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym29$ACTIVE_LEARNERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym30$ALLOW_STEMMING, T );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym31$STOP_WORDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym32$SEMTRANS_LEXICON, $sym33$MY_TERM_LEXICON, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/textual-inference-lexicon.lisp", position = 1432L)
  public static SubLObject textual_inference_lexicon_p(final SubLObject v_textual_inference_lexicon)
  {
    return classes.subloop_instanceof_class( v_textual_inference_lexicon, $sym0$TEXTUAL_INFERENCE_LEXICON );
  }

  public static SubLObject declare_textual_inference_lexicon_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_textual_inference_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_textual_inference_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "textual_inference_lexicon_p", "TEXTUAL-INFERENCE-LEXICON-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_textual_inference_lexicon_file()
  {
    return NIL;
  }

  public static SubLObject setup_textual_inference_lexicon_file()
  {
    classes.subloop_new_class( $sym0$TEXTUAL_INFERENCE_LEXICON, $sym1$CYCLIFIER_LEXICON, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$TEXTUAL_INFERENCE_LEXICON, NIL );
    classes.subloop_note_class_initialization_function( $sym0$TEXTUAL_INFERENCE_LEXICON, $sym13$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$TEXTUAL_INFERENCE_LEXICON, $sym34$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE );
    subloop_reserved_initialize_textual_inference_lexicon_class( $sym0$TEXTUAL_INFERENCE_LEXICON );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_textual_inference_lexicon_file();
  }

  @Override
  public void initializeVariables()
  {
    init_textual_inference_lexicon_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_textual_inference_lexicon_file();
  }
  static
  {
    me = new textual_inference_lexicon();
    $sym0$TEXTUAL_INFERENCE_LEXICON = makeSymbol( "TEXTUAL-INFERENCE-LEXICON" );
    $sym1$CYCLIFIER_LEXICON = makeSymbol( "CYCLIFIER-LEXICON" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEFAULT-KB-SPEC" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), constant_handles.reader_make_constant_shell( makeString(
        "TextualInferenceLexiconSpecification" ) ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$ABSTRACT_LEXICON = makeSymbol( "ABSTRACT-LEXICON" );
    $sym6$DEFAULT_EXCLUDE_MTS = makeSymbol( "DEFAULT-EXCLUDE-MTS" );
    $list7 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "WebSearchDataMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "RelationParaphraseMt" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNetMappingMt" ) ), constant_handles.reader_make_constant_shell( makeString(
            "PornographyJargonMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CommonEnglishMisspellingsMt" ) ), constant_handles.reader_make_constant_shell( makeString( "ComputereseLexicalMt" ) ),
      constant_handles.reader_make_constant_shell( makeString( "CyclishMt" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertionsMt" ) ), constant_handles.reader_make_constant_shell(
          makeString( "EnglishWordSenseAssertions-HoldingMt" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertions-WordNetImportMt" ) ), constant_handles.reader_make_constant_shell(
              makeString( "RedundantLexicalMt" ) ), constant_handles.reader_make_constant_shell( makeString( "PDATemplateTestMt" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SupplementalDeterminerSemTransLexicalMt" ) )
    } );
    $sym8$DEFAULT_EXCLUDE_PREDICATES = makeSymbol( "DEFAULT-EXCLUDE-PREDICATES" );
    $sym9$DEFAULT_BASE_MT = makeSymbol( "DEFAULT-BASE-MT" );
    $const10$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell( makeString( "AllGeneralEnglishValidatedLexicalMicrotheoryPSC" ) );
    $sym11$DEFAULT_KB_SPEC = makeSymbol( "DEFAULT-KB-SPEC" );
    $const12$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell( makeString( "AbstractLexiconSpecification" ) );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$ALLOWED_MTS = makeSymbol( "ALLOWED-MTS" );
    $kw17$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym18$EXCLUDED_MTS = makeSymbol( "EXCLUDED-MTS" );
    $sym19$BASE_MT = makeSymbol( "BASE-MT" );
    $sym20$ROOT_MT = makeSymbol( "ROOT-MT" );
    $sym21$EXCLUDED_PREDS = makeSymbol( "EXCLUDED-PREDS" );
    $sym22$EXCLUDED_POS_LIST = makeSymbol( "EXCLUDED-POS-LIST" );
    $sym23$TRIE = makeSymbol( "TRIE" );
    $sym24$CACHE = makeSymbol( "CACHE" );
    $sym25$IGNORE_CACHE_ = makeSymbol( "IGNORE-CACHE?" );
    $sym26$CASE_SENSITIVITY = makeSymbol( "CASE-SENSITIVITY" );
    $sym27$ALLOW_FABRICATION_ = makeSymbol( "ALLOW-FABRICATION?" );
    $sym28$LEARNED = makeSymbol( "LEARNED" );
    $sym29$ACTIVE_LEARNERS = makeSymbol( "ACTIVE-LEARNERS" );
    $sym30$ALLOW_STEMMING = makeSymbol( "ALLOW-STEMMING" );
    $sym31$STOP_WORDS = makeSymbol( "STOP-WORDS" );
    $sym32$SEMTRANS_LEXICON = makeSymbol( "SEMTRANS-LEXICON" );
    $sym33$MY_TERM_LEXICON = makeSymbol( "MY-TERM-LEXICON" );
    $sym34$SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_INFERENCE_LEXICON_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-INFERENCE-LEXICON-INSTANCE" );
  }
}
/*
 * 
 * Total time: 25 ms
 * 
 */