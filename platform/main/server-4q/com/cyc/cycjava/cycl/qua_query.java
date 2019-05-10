package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class qua_query
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.qua_query";
  public static final String myFingerPrint = "3f1014c70afe76b8d008b859ff2fec318c313cf30585b53f365543c736645e0f";
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 2099L)
  public static SubLSymbol $qua_default_search_engine$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 2964L)
  private static SubLSymbol $google_string_count_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 3020L)
  private static SubLSymbol $qua_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 3141L)
  private static SubLSymbol $augmented_query_id_generator$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 3229L)
  private static SubLSymbol $augmented_query_dict$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 3293L)
  private static SubLSymbol $augmented_query_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLSymbol $dtp_augmented_query$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 7000L)
  private static SubLSymbol $qua_url_templates$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15516L)
  private static SubLSymbol $aq_term_id_generator$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLSymbol $dtp_aq_term$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 21929L)
  private static SubLSymbol $qua_filter_termP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22486L)
  private static SubLSymbol $qua_expansion_cycls_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 24400L)
  private static SubLSymbol $web_conceptually_related_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26006L)
  private static SubLSymbol $qua_speech_part_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26969L)
  private static SubLSymbol $qua_generate_phrase_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 27336L)
  private static SubLSymbol $qua_all_phrases_for_term_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 34035L)
  private static SubLSymbol $qua_ignore_predsP$;
  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 34083L)
  private static SubLSymbol $qua_generality_cutoff$;
  private static final SubLSymbol $kw0$ALTAVISTA;
  private static final SubLInteger $int1$32;
  private static final SubLSymbol $sym2$TERM_LEXICON;
  private static final SubLSymbol $sym3$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw4$OFF;
  private static final SubLSymbol $sym5$ALLOW_MT;
  private static final SubLObject $const6$RelationParaphraseMt;
  private static final SubLObject $const7$MedicalLexicalMt;
  private static final SubLObject $const8$CCFLexicalMt;
  private static final SubLSymbol $sym9$ADD_LEARNER;
  private static final SubLSymbol $sym10$NUMBER_LEARN;
  private static final SubLSymbol $sym11$SIMPLE_DATE_LEARN;
  private static final SubLSymbol $sym12$AUGMENTED_QUERY;
  private static final SubLSymbol $sym13$AUGMENTED_QUERY_P;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$PRINT_AUGMENTED_QUERY;
  private static final SubLSymbol $sym19$AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$AQ_ORIGINAL_PHRASE;
  private static final SubLSymbol $sym22$_CSETF_AQ_ORIGINAL_PHRASE;
  private static final SubLSymbol $sym23$AQ_ID;
  private static final SubLSymbol $sym24$_CSETF_AQ_ID;
  private static final SubLSymbol $sym25$AQ_TOKENIZATIONS;
  private static final SubLSymbol $sym26$_CSETF_AQ_TOKENIZATIONS;
  private static final SubLSymbol $sym27$AQ_QUERY_STRING;
  private static final SubLSymbol $sym28$_CSETF_AQ_QUERY_STRING;
  private static final SubLSymbol $sym29$AQ_QUERY_STRING_STALE_;
  private static final SubLSymbol $sym30$_CSETF_AQ_QUERY_STRING_STALE_;
  private static final SubLSymbol $sym31$AQ_SEARCH_ENGINE;
  private static final SubLSymbol $sym32$_CSETF_AQ_SEARCH_ENGINE;
  private static final SubLSymbol $kw33$ORIGINAL_PHRASE;
  private static final SubLSymbol $kw34$ID;
  private static final SubLSymbol $kw35$TOKENIZATIONS;
  private static final SubLSymbol $kw36$QUERY_STRING;
  private static final SubLSymbol $kw37$QUERY_STRING_STALE_;
  private static final SubLSymbol $kw38$SEARCH_ENGINE;
  private static final SubLString $str39$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw40$BEGIN;
  private static final SubLSymbol $sym41$MAKE_AUGMENTED_QUERY;
  private static final SubLSymbol $kw42$SLOT;
  private static final SubLSymbol $kw43$END;
  private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_AUGMENTED_QUERY_METHOD;
  private static final SubLString $str45$_augmented_query__A__S__S_;
  private static final SubLSymbol $kw46$GOOGLE;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLString $str50$;
  private static final SubLString $str51$ANSWER_COUNT;
  private static final SubLString $str52$SEARCH_STRING;
  private static final SubLString $str53$_A;
  private static final SubLSymbol $kw54$OR;
  private static final SubLSymbol $kw55$AND;
  private static final SubLSymbol $sym56$NULL;
  private static final SubLString $str57$_;
  private static final SubLObject $const58$InferencePSC;
  private static final SubLSymbol $sym59$QUA_GENERATE_PHRASE;
  private static final SubLSymbol $kw60$NONE;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$AQ_TERM;
  private static final SubLSymbol $sym63$AQ_TERM_P;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$PRINT_AQ_TERM;
  private static final SubLSymbol $sym69$AQ_TERM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$AQ_TERM_ID;
  private static final SubLSymbol $sym72$_CSETF_AQ_TERM_ID;
  private static final SubLSymbol $sym73$AQ_TERM_ORIGINAL_STRING;
  private static final SubLSymbol $sym74$_CSETF_AQ_TERM_ORIGINAL_STRING;
  private static final SubLSymbol $sym75$AQ_TERM_RAW_MEANINGS;
  private static final SubLSymbol $sym76$_CSETF_AQ_TERM_RAW_MEANINGS;
  private static final SubLSymbol $sym77$AQ_TERM_POSSIBLE_MEANINGS;
  private static final SubLSymbol $sym78$_CSETF_AQ_TERM_POSSIBLE_MEANINGS;
  private static final SubLSymbol $sym79$AQ_TERM_DISFAVORED_MEANINGS;
  private static final SubLSymbol $sym80$_CSETF_AQ_TERM_DISFAVORED_MEANINGS;
  private static final SubLSymbol $sym81$AQ_TERM_POSITIVE_STRINGS;
  private static final SubLSymbol $sym82$_CSETF_AQ_TERM_POSITIVE_STRINGS;
  private static final SubLSymbol $sym83$AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE;
  private static final SubLSymbol $sym84$_CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE;
  private static final SubLSymbol $sym85$AQ_TERM_POSITIVE_STRINGS_STALE_;
  private static final SubLSymbol $sym86$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_;
  private static final SubLSymbol $sym87$AQ_TERM_NEGATIVE_STRINGS;
  private static final SubLSymbol $sym88$_CSETF_AQ_TERM_NEGATIVE_STRINGS;
  private static final SubLSymbol $sym89$AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE;
  private static final SubLSymbol $sym90$_CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE;
  private static final SubLSymbol $sym91$AQ_TERM_NEGATIVE_STRINGS_STALE_;
  private static final SubLSymbol $sym92$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_;
  private static final SubLSymbol $kw93$ORIGINAL_STRING;
  private static final SubLSymbol $kw94$RAW_MEANINGS;
  private static final SubLSymbol $kw95$POSSIBLE_MEANINGS;
  private static final SubLSymbol $kw96$DISFAVORED_MEANINGS;
  private static final SubLSymbol $kw97$POSITIVE_STRINGS;
  private static final SubLSymbol $kw98$POSITIVE_TERMS_IN_UPWARD_CLOSURE;
  private static final SubLSymbol $kw99$POSITIVE_STRINGS_STALE_;
  private static final SubLSymbol $kw100$NEGATIVE_STRINGS;
  private static final SubLSymbol $kw101$NEGATIVE_TERMS_IN_UPWARD_CLOSURE;
  private static final SubLSymbol $kw102$NEGATIVE_STRINGS_STALE_;
  private static final SubLSymbol $sym103$MAKE_AQ_TERM;
  private static final SubLSymbol $sym104$VISIT_DEFSTRUCT_OBJECT_AQ_TERM_METHOD;
  private static final SubLString $str105$_aq_token___S__S__S_;
  private static final SubLSymbol $sym106$LEARN;
  private static final SubLSymbol $sym107$LEXIFY_SENTENCE;
  private static final SubLSymbol $sym108$GET;
  private static final SubLSymbol $kw109$CYC_POS;
  private static final SubLObject $const110$ClosedClassWord;
  private static final SubLObject $const111$Noun;
  private static final SubLSymbol $kw112$DENOT;
  private static final SubLObject $const113$parsingConflateTo;
  private static final SubLObject $const114$qaConflateTo;
  private static final SubLObject $const115$qaConflateToCompletely;
  private static final SubLSymbol $sym116$_PREFERRED;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const119$EverythingPSC;
  private static final SubLSymbol $sym120$QUA_FILTER_TERM_;
  private static final SubLSymbol $sym121$_QUA_FILTER_TERM__CACHING_STATE_;
  private static final SubLInteger $int122$5000;
  private static final SubLObject $const123$qaIrrelevantTerm;
  private static final SubLSymbol $sym124$RELEVANT_MT_IS_ANY_MT;
  private static final SubLSymbol $sym125$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym126$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym127$QUA_EXPANSION_CYCLS;
  private static final SubLSymbol $sym128$_QUA_EXPANSION_CYCLS_CACHING_STATE_;
  private static final SubLInteger $int129$100;
  private static final SubLInteger $int130$30;
  private static final SubLSymbol $sym131$GENERATE_PHRASE;
  private static final SubLSymbol $sym132$WEB_CONCEPTUALLY_RELATED;
  private static final SubLSymbol $kw133$RELATED;
  private static final SubLObject $const134$and;
  private static final SubLObject $const135$webConceptuallyRelated;
  private static final SubLList $list136;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$_WEB_CONCEPTUALLY_RELATED_CACHING_STATE_;
  private static final SubLSymbol $sym139$_INST;
  private static final SubLObject $const140$isa;
  private static final SubLObject $const141$EnglishLexiconMt;
  private static final SubLObject $const142$verbFormWithAuxiliary;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$_QUA_GENERATE_PHRASE_CACHING_STATE_;
  private static final SubLInteger $int145$500;
  private static final SubLSymbol $sym146$QUA_ALL_PHRASES_FOR_TERM;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$_QUA_ALL_PHRASES_FOR_TERM_CACHING_STATE_;
  private static final SubLString $str149$__;
  private static final SubLSymbol $sym150$STRINGP;
  private static final SubLObject $const151$QAClarifyingCollectionType;
  private static final SubLInteger $int152$400000;
  private static final SubLSymbol $sym153$QUA_TERM_FROM_SENTENCE_;
  private static final SubLObject $const154$Collection;
  private static final SubLString $str155$Pushing__S_because_it_is_not_a_ge;
  private static final SubLString $str156$This_term_is_a_naut___A__;
  private static final SubLObject $const157$SearchStringInappropriateFunction;
  private static final SubLString $str158$Either_the_term_is_not_lexified_o;
  private static final SubLString $str159$Recursing_on__A__;
  private static final SubLObject $const160$or;
  private static final SubLObject $const161$termPhrases;
  private static final SubLList $list162;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE;
  private static final SubLSymbol $kw165$TEST;
  private static final SubLSymbol $sym166$SETS_EQUALP;
  private static final SubLSymbol $kw167$OWNER;
  private static final SubLSymbol $kw168$CLASSES;
  private static final SubLSymbol $kw169$KB;
  private static final SubLSymbol $kw170$FULL;
  private static final SubLSymbol $kw171$WORKING_;
  private static final SubLList $list172;
  private static final SubLSymbol $kw173$STRING;
  private static final SubLSymbol $kw174$INTERP;
  private static final SubLSymbol $kw175$INTERP_CFASL;
  private static final SubLSymbol $kw176$INTERP_GENERATION;

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 2164L)
  public static SubLObject augmented_query_string_for_query_string(final SubLObject search_string, SubLObject v_search_engine)
  {
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    final SubLObject query = get_augmented_query_for_id( new_augmented_query( search_string, v_search_engine ) );
    return get_search_string_for_query( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 2717L)
  public static SubLObject augmented_query_string_for_cycl_terms(final SubLObject term_list, SubLObject v_search_engine)
  {
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    final SubLObject query = get_augmented_query_for_cycl_terms( term_list, v_search_engine );
    return get_search_string_for_query( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 3471L)
  public static SubLObject get_aq_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $augmented_query_lexicon$.getDynamicValue( thread ) )
    {
      $augmented_query_lexicon$.setDynamicValue( object.new_class_instance( $sym2$TERM_LEXICON ), thread );
      methods.funcall_instance_method_with_1_args( $augmented_query_lexicon$.getDynamicValue( thread ), $sym3$SET_CASE_SENSITIVITY, $kw4$OFF );
      methods.funcall_instance_method_with_1_args( $augmented_query_lexicon$.getDynamicValue( thread ), $sym5$ALLOW_MT, $const6$RelationParaphraseMt );
      methods.funcall_instance_method_with_1_args( $augmented_query_lexicon$.getDynamicValue( thread ), $sym5$ALLOW_MT, $const7$MedicalLexicalMt );
      methods.funcall_instance_method_with_1_args( $augmented_query_lexicon$.getDynamicValue( thread ), $sym5$ALLOW_MT, $const8$CCFLexicalMt );
      methods.funcall_instance_method_with_1_args( $augmented_query_lexicon$.getDynamicValue( thread ), $sym9$ADD_LEARNER, $sym10$NUMBER_LEARN );
      methods.funcall_instance_method_with_1_args( $augmented_query_lexicon$.getDynamicValue( thread ), $sym9$ADD_LEARNER, $sym11$SIMPLE_DATE_LEARN );
    }
    return $augmented_query_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject augmented_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_augmented_query( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject augmented_query_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $augmented_query_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject aq_original_phrase(final SubLObject v_object)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject aq_id(final SubLObject v_object)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject aq_tokenizations(final SubLObject v_object)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject aq_query_string(final SubLObject v_object)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject aq_query_string_staleP(final SubLObject v_object)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject aq_search_engine(final SubLObject v_object)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject _csetf_aq_original_phrase(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject _csetf_aq_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject _csetf_aq_tokenizations(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject _csetf_aq_query_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject _csetf_aq_query_string_staleP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject _csetf_aq_search_engine(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != augmented_query_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject make_augmented_query(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $augmented_query_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw33$ORIGINAL_PHRASE ) )
      {
        _csetf_aq_original_phrase( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_aq_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$TOKENIZATIONS ) )
      {
        _csetf_aq_tokenizations( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$QUERY_STRING ) )
      {
        _csetf_aq_query_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$QUERY_STRING_STALE_ ) )
      {
        _csetf_aq_query_string_staleP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$SEARCH_ENGINE ) )
      {
        _csetf_aq_search_engine( v_new, current_value );
      }
      else
      {
        Errors.error( $str39$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject visit_defstruct_augmented_query(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw40$BEGIN, $sym41$MAKE_AUGMENTED_QUERY, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw33$ORIGINAL_PHRASE, aq_original_phrase( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw34$ID, aq_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw35$TOKENIZATIONS, aq_tokenizations( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw36$QUERY_STRING, aq_query_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw37$QUERY_STRING_STALE_, aq_query_string_staleP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw38$SEARCH_ENGINE, aq_search_engine( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$END, $sym41$MAKE_AUGMENTED_QUERY, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4222L)
  public static SubLObject visit_defstruct_object_augmented_query_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_augmented_query( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 4560L)
  public static SubLObject new_augmented_query(SubLObject string, SubLObject v_search_engine)
  {
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query = make_augmented_query( UNPROVIDED );
    final SubLObject query_id = integer_sequence_generator.integer_sequence_generator_next( $augmented_query_id_generator$.getDynamicValue( thread ) );
    _csetf_aq_original_phrase( query, string );
    _csetf_aq_id( query, query_id );
    _csetf_aq_tokenizations( query, ( NIL != string ) ? get_tokenizations_for_aq_string( string, UNPROVIDED ) : NIL );
    _csetf_aq_search_engine( query, v_search_engine );
    dictionary.dictionary_enter( $augmented_query_dict$.getDynamicValue( thread ), query_id, query );
    return query_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 5085L)
  public static SubLObject print_augmented_query(final SubLObject item, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str45$_augmented_query__A__S__S_, new SubLObject[] { aq_id( item ), aq_original_phrase( item ), aq_search_engine( item )
    } );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 5285L)
  public static SubLObject get_aq_tokenizations(final SubLObject query)
  {
    return aq_tokenizations( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 5367L)
  public static SubLObject get_aq_search_engine(final SubLObject query)
  {
    return aq_search_engine( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 5449L)
  public static SubLObject set_aq_search_engine(final SubLObject query, final SubLObject v_search_engine)
  {
    _csetf_aq_search_engine( query, v_search_engine );
    return aq_search_engine( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 5594L)
  public static SubLObject aq_max_strings_for_search(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = get_aq_search_engine( query );
    if( pcase_var.eql( $kw46$GOOGLE ) )
    {
      return $google_string_count_limit$.getDynamicValue( thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 5759L)
  public static SubLObject get_aq_max_strings_per_term(final SubLObject query)
  {
    final SubLObject max_length = aq_max_strings_for_search( query );
    final SubLObject token_count = Sequences.length( get_aq_tokenizations( query ).first() );
    if( NIL == max_length )
    {
      return NIL;
    }
    if( token_count.eql( ZERO_INTEGER ) )
    {
      return NIL;
    }
    return number_utilities.div( max_length, Sequences.length( get_aq_tokenizations( query ).first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 6095L)
  public static SubLObject get_qua_operator_strings_for_search(final SubLObject query)
  {
    final SubLObject pcase_var = get_aq_search_engine( query );
    if( pcase_var.eql( $kw46$GOOGLE ) )
    {
      return $list47;
    }
    if( pcase_var.eql( $kw0$ALTAVISTA ) )
    {
      return $list48;
    }
    return $list48;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 6319L)
  public static SubLObject get_aq_term_by_id(final SubLObject query, final SubLObject id)
  {
    SubLObject cdolist_list_var = get_aq_tokenizations( query );
    SubLObject tokenization = NIL;
    tokenization = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = tokenization;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        if( id.eql( aq_term_id( v_term ) ) )
        {
          return v_term;
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        v_term = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      tokenization = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 6524L)
  public static SubLObject get_augmented_query_for_id(final SubLObject query_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != augmented_query_p( query_id ) )
    {
      return query_id;
    }
    return dictionary.dictionary_lookup( $augmented_query_dict$.getDynamicValue( thread ), query_id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 6697L)
  public static SubLObject get_augmented_query_for_cycl_terms(final SubLObject query_terms, SubLObject v_search_engine)
  {
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    final SubLObject query = get_augmented_query_for_id( new_augmented_query( NIL, v_search_engine ) );
    _csetf_aq_tokenizations( query, get_tokenizations_for_terms( query_terms ) );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 7251L)
  public static SubLObject get_raw_query_url(final SubLObject query_id, SubLObject answer_count)
  {
    if( answer_count == UNPROVIDED )
    {
      answer_count = TEN_INTEGER;
    }
    final SubLObject query = get_augmented_query_for_id( query_id );
    final SubLObject search_string = ( NIL != aq_original_phrase( query ) ) ? aq_original_phrase( query ) : $str50$;
    return get_query_url( query, search_string, answer_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 7562L)
  public static SubLObject get_augmented_query_url(final SubLObject query_id, SubLObject answer_count)
  {
    if( answer_count == UNPROVIDED )
    {
      answer_count = TEN_INTEGER;
    }
    final SubLObject query = get_augmented_query_for_id( query_id );
    final SubLObject search_string = web_utilities.html_url_encode( get_search_string_for_query( query ), UNPROVIDED );
    return get_query_url( query, search_string, answer_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 7893L)
  public static SubLObject get_query_url(final SubLObject query, final SubLObject search_string, SubLObject answer_count)
  {
    if( answer_count == UNPROVIDED )
    {
      answer_count = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_search_engine = get_aq_search_engine( query );
    final SubLObject url_template = conses_high.getf( $qua_url_templates$.getDynamicValue( thread ), v_search_engine, UNPROVIDED );
    final SubLObject answer_count_string = print_high.princ_to_string( answer_count );
    final SubLObject url = string_utilities.string_subst( answer_count_string, $str51$ANSWER_COUNT, string_utilities.string_subst( search_string, $str52$SEARCH_STRING, url_template, UNPROVIDED ), UNPROVIDED );
    return url;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 8422L)
  public static SubLObject get_search_string_for_query(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tokenization = get_aq_tokenizations( query ).first();
    SubLObject top_level_items = NIL;
    SubLObject search_string = NIL;
    final SubLObject max_strings_per_term = get_aq_max_strings_per_term( query );
    final SubLObject _prev_bind_0 = $qua_operators$.currentBinding( thread );
    try
    {
      $qua_operators$.bind( get_qua_operator_strings_for_search( query ), thread );
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        SubLObject cdolist_list_var = tokenization;
        SubLObject aq_term = NIL;
        aq_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject possible_for_term = NIL;
          SubLObject cdolist_list_var_$2 = get_aq_term_possible_meanings( aq_term );
          SubLObject possible = NIL;
          possible = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            final SubLObject original_string = aq_term_original_string( aq_term );
            final SubLObject qua_expansion_strings = NIL;
            final SubLObject clarifying_genls_strings = NIL;
            final SubLObject spec_strings = NIL;
            final SubLObject synset_strings = qua_strings_for_term_via_synsets( possible );
            final SubLObject cyc_strings = qua_all_phrases_for_term( possible );
            final SubLObject alt_strings = Sequences.remove_duplicates( Sequences.cconcatenate( cyc_strings, new SubLObject[] { synset_strings, spec_strings
            } ), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            final SubLObject good_string_for_this_term = qua_and_clause( ConsesLow.list( qua_or_clause( n_best_qua_strings( max_strings_per_term, alt_strings ) ), qua_or_clause( n_best_qua_strings(
                ( NIL != max_strings_per_term ) ? Numbers.subtract( max_strings_per_term, Sequences.length( alt_strings ) ) : NIL, Sequences.cconcatenate( clarifying_genls_strings, qua_expansion_strings ) ) ) ) );
            possible_for_term = ConsesLow.cons( good_string_for_this_term, possible_for_term );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            possible = cdolist_list_var_$2.first();
          }
          possible_for_term = qua_or_clause( possible_for_term );
          top_level_items = ConsesLow.cons( possible_for_term, top_level_items );
          cdolist_list_var = cdolist_list_var.rest();
          aq_term = cdolist_list_var.first();
        }
        final SubLObject top_level_result = qua_and_clause( Sequences.nreverse( top_level_items ) );
        if( NIL != top_level_result )
        {
          PrintLow.format( stream, $str53$_A, top_level_result );
        }
        else
        {
          print_high.princ( $str50$, stream );
        }
        search_string = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      $qua_operators$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != search_string ) ? search_string : $str50$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 10646L)
  public static SubLObject n_best_qua_strings(final SubLObject n, final SubLObject strings)
  {
    if( NIL == n )
    {
      return strings;
    }
    if( ONE_INTEGER.numG( n ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject string_count = ZERO_INTEGER;
    SubLObject done = NIL;
    if( NIL == done )
    {
      SubLObject csome_list_var = strings;
      SubLObject string = NIL;
      string = csome_list_var.first();
      while ( NIL == done && NIL != csome_list_var)
      {
        if( n.numG( Numbers.add( Sequences.length( string_utilities.split_string( string, UNPROVIDED ) ), string_count ) ) )
        {
          result = ConsesLow.cons( string, result );
          string_count = Numbers.add( string_count, Sequences.length( string_utilities.split_string( string, UNPROVIDED ) ) );
        }
        else
        {
          done = T;
        }
        csome_list_var = csome_list_var.rest();
        string = csome_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 11060L)
  public static SubLObject qua_or_clause(final SubLObject strings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return qua_connected_clause( strings, conses_high.getf( $qua_operators$.getDynamicValue( thread ), $kw54$OR, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 11168L)
  public static SubLObject qua_and_clause(final SubLObject strings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return qua_connected_clause( strings, conses_high.getf( $qua_operators$.getDynamicValue( thread ), $kw55$AND, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 11278L)
  public static SubLObject qua_connected_clause(final SubLObject strings, final SubLObject connective)
  {
    if( NIL == strings )
    {
      return NIL;
    }
    final SubLObject useful_strings = Sequences.remove_if( $sym56$NULL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( useful_strings ) )
    {
      return useful_strings.first();
    }
    return qua_add_connective( useful_strings, connective );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 11555L)
  public static SubLObject maybe_add_quotes(final SubLObject input)
  {
    return ( input.isString() && NIL == string_utilities.starts_with( input, $str57$_ ) ) ? Sequences.cconcatenate( $str57$_, new SubLObject[] { input, $str57$_
    } ) : input;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 11715L)
  public static SubLObject qua_add_connective(final SubLObject terms, final SubLObject connective)
  {
    if( NIL == terms )
    {
      return NIL;
    }
    final SubLObject first_term = terms.first();
    final SubLObject other_terms = terms.rest();
    SubLObject join_result = ConsesLow.list( maybe_add_quotes( first_term ) );
    SubLObject cdolist_list_var = other_terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != connective )
      {
        join_result = ConsesLow.cons( connective, join_result );
      }
      join_result = ConsesLow.cons( maybe_add_quotes( v_term ), join_result );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( join_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 12092L)
  public static SubLObject nearest_spec_strings(final SubLObject v_term)
  {
    if( NIL == forts.fort_p( v_term ) )
    {
      return NIL;
    }
    final SubLObject specs = genls.max_specs( v_term, $const58$InferencePSC, UNPROVIDED );
    final SubLObject strings = Mapping.mapcar( $sym59$QUA_GENERATE_PHRASE, specs );
    return strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 12514L)
  public static SubLObject get_disambiguation_options(final SubLObject query_id)
  {
    final SubLObject query = get_augmented_query_for_id( query_id );
    final SubLObject tokenizations = get_aq_tokenizations( query );
    final SubLObject tokenization = tokenizations.first();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = tokenization;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject id = aq_term_id( v_term );
      final SubLObject possible_meanings = get_aq_term_disambig_options( v_term );
      final SubLObject meanings_and_strings = generate_unambiguous_aq_term_meanings( possible_meanings );
      result = ConsesLow.cons( ConsesLow.list( id, meanings_and_strings ), result );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 13791L)
  public static SubLObject get_all_disambiguation_options(final SubLObject query_id)
  {
    final SubLObject query = get_augmented_query_for_id( query_id );
    final SubLObject tokenizations = get_aq_tokenizations( query );
    final SubLObject tokenization = tokenizations.first();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = tokenization;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject id = aq_term_id( v_term );
      final SubLObject available_options = get_aq_term_disambig_options( v_term );
      final SubLObject raw_meanings = aq_term_raw_meanings( v_term );
      final SubLObject current_choice = available_options.first();
      final SubLObject possible_meanings = ConsesLow.cons( current_choice, Sequences.remove( current_choice, raw_meanings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      final SubLObject meanings_and_strings = generate_unambiguous_aq_term_meanings( possible_meanings );
      result = ConsesLow.cons( ConsesLow.list( id, meanings_and_strings ), result );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 14873L)
  public static SubLObject generate_unambiguous_aq_term_meanings(final SubLObject meanings)
  {
    return pph_main.generate_disambiguation_phrases( meanings, $kw60$NONE, pph_utilities.pph_convert_required_nl_preds_to_preferred( $list61 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15074L)
  public static SubLObject reset_ambiguity(final SubLObject query_id, final SubLObject term_id)
  {
    final SubLObject query = get_augmented_query_for_id( query_id );
    final SubLObject v_term = get_aq_term_by_id( query, term_id );
    return reset_aq_term_ambiguity( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15267L)
  public static SubLObject accept_disambiguation_option(final SubLObject query_id, final SubLObject term_id, final SubLObject disambig_id)
  {
    final SubLObject query = get_augmented_query_for_id( query_id );
    final SubLObject aq_term = get_aq_term_by_id( query, term_id );
    final SubLObject changedP = accept_meaning( aq_term, disambig_id );
    return changedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_aq_term( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $aq_term_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_id(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_original_string(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_raw_meanings(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_possible_meanings(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_disfavored_meanings(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_positive_strings(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_positive_terms_in_upward_closure(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_positive_strings_staleP(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_negative_strings(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_negative_terms_in_upward_closure(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject aq_term_negative_strings_staleP(final SubLObject v_object)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_original_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_raw_meanings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_possible_meanings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_disfavored_meanings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_positive_strings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_positive_terms_in_upward_closure(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_positive_strings_staleP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_negative_strings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_negative_terms_in_upward_closure(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject _csetf_aq_term_negative_strings_staleP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != aq_term_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject make_aq_term(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $aq_term_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_aq_term_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw93$ORIGINAL_STRING ) )
      {
        _csetf_aq_term_original_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$RAW_MEANINGS ) )
      {
        _csetf_aq_term_raw_meanings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw95$POSSIBLE_MEANINGS ) )
      {
        _csetf_aq_term_possible_meanings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw96$DISFAVORED_MEANINGS ) )
      {
        _csetf_aq_term_disfavored_meanings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw97$POSITIVE_STRINGS ) )
      {
        _csetf_aq_term_positive_strings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw98$POSITIVE_TERMS_IN_UPWARD_CLOSURE ) )
      {
        _csetf_aq_term_positive_terms_in_upward_closure( v_new, current_value );
      }
      else if( pcase_var.eql( $kw99$POSITIVE_STRINGS_STALE_ ) )
      {
        _csetf_aq_term_positive_strings_staleP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw100$NEGATIVE_STRINGS ) )
      {
        _csetf_aq_term_negative_strings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw101$NEGATIVE_TERMS_IN_UPWARD_CLOSURE ) )
      {
        _csetf_aq_term_negative_terms_in_upward_closure( v_new, current_value );
      }
      else if( pcase_var.eql( $kw102$NEGATIVE_STRINGS_STALE_ ) )
      {
        _csetf_aq_term_negative_strings_staleP( v_new, current_value );
      }
      else
      {
        Errors.error( $str39$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject visit_defstruct_aq_term(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw40$BEGIN, $sym103$MAKE_AQ_TERM, ELEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw34$ID, aq_term_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw93$ORIGINAL_STRING, aq_term_original_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw94$RAW_MEANINGS, aq_term_raw_meanings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw95$POSSIBLE_MEANINGS, aq_term_possible_meanings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw96$DISFAVORED_MEANINGS, aq_term_disfavored_meanings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw97$POSITIVE_STRINGS, aq_term_positive_strings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw98$POSITIVE_TERMS_IN_UPWARD_CLOSURE, aq_term_positive_terms_in_upward_closure( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw99$POSITIVE_STRINGS_STALE_, aq_term_positive_strings_staleP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw100$NEGATIVE_STRINGS, aq_term_negative_strings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw101$NEGATIVE_TERMS_IN_UPWARD_CLOSURE, aq_term_negative_terms_in_upward_closure( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw102$NEGATIVE_STRINGS_STALE_, aq_term_negative_strings_staleP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$END, $sym103$MAKE_AQ_TERM, ELEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 15701L)
  public static SubLObject visit_defstruct_object_aq_term_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_aq_term( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 16192L)
  public static SubLObject print_aq_term(final SubLObject item, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str105$_aq_token___S__S__S_, new SubLObject[] { aq_term_id( item ), aq_term_original_string( item ), aq_term_possible_meanings( item )
    } );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 16400L)
  public static SubLObject new_aq_term(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject result = make_aq_term( UNPROVIDED );
    if( string.isString() )
    {
      _csetf_aq_term_original_string( result, string );
    }
    else
    {
      _csetf_aq_term_original_string( result, $str50$ );
    }
    _csetf_aq_term_id( result, integer_sequence_generator.integer_sequence_generator_next( $aq_term_id_generator$.getDynamicValue( thread ) ) );
    _csetf_aq_term_positive_strings_staleP( result, T );
    _csetf_aq_term_negative_strings_staleP( result, T );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 16814L)
  public static SubLObject aq_term_preferred_meaning(final SubLObject aq_term)
  {
    return narts_high.nart_substitute( aq_term_possible_meanings( aq_term ).first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 16940L)
  public static SubLObject undisambiguated_termP(final SubLObject aq_term)
  {
    return makeBoolean( get_aq_term_possible_meanings( aq_term ).equalp( aq_term_raw_meanings( aq_term ) ) && NIL == list_utilities.singletonP( get_aq_term_possible_meanings( aq_term ) )
        && NIL == aq_term_disfavored_meanings( aq_term ) && NIL != aq_term_raw_meanings( aq_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 17254L)
  public static SubLObject get_tokenizations_for_aq_string(final SubLObject string, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    SubLObject result = NIL;
    final SubLObject sentence = document.new_sentence( string, UNPROVIDED );
    final SubLObject lex = ( NIL != lexicon ) ? lexicon : get_aq_lexicon();
    final SubLObject learned_results = methods.funcall_instance_method_with_1_args( lex, $sym106$LEARN, string );
    final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args( lex, $sym107$LEXIFY_SENTENCE, sentence );
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( lexified_sentence );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject word_string = document.word_string( word );
      final SubLObject v_term = new_aq_term( word_string );
      final SubLObject lex_entries = document.word_info( word );
      SubLObject denots = NIL;
      SubLObject other_denots = NIL;
      if( NIL == lexicon_utilities.denots_of_string_stop_word( word_string ) )
      {
        SubLObject cdolist_list_var_$4 = lex_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL == lexicon_accessors.genl_posP( methods.funcall_instance_method_with_1_args( entry, $sym108$GET, $kw109$CYC_POS ), $const110$ClosedClassWord, UNPROVIDED ) )
          {
            if( NIL != lexicon_accessors.genl_posP( methods.funcall_instance_method_with_1_args( entry, $sym108$GET, $kw109$CYC_POS ), $const111$Noun, UNPROVIDED ) )
            {
              final SubLObject item_var = conflated_term_from( methods.funcall_instance_method_with_1_args( entry, $sym108$GET, $kw112$DENOT ) );
              if( NIL == conses_high.member( item_var, denots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                denots = ConsesLow.cons( item_var, denots );
              }
            }
            else
            {
              final SubLObject item_var = conflated_term_from( methods.funcall_instance_method_with_1_args( entry, $sym108$GET, $kw112$DENOT ) );
              if( NIL == conses_high.member( item_var, other_denots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                other_denots = ConsesLow.cons( item_var, other_denots );
              }
            }
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          entry = cdolist_list_var_$4.first();
        }
      }
      if( NIL == denots )
      {
        denots = other_denots;
      }
      if( NIL != list_utilities.singletonP( denots ) )
      {
        denots = list_utilities.snoc( Sequences.cconcatenate( $str57$_, new SubLObject[] { word_string, $str57$_
        } ), denots );
      }
      else
      {
        denots = ConsesLow.cons( Sequences.cconcatenate( $str57$_, new SubLObject[] { word_string, $str57$_
        } ), denots );
      }
      set_aq_term_possible_meanings( v_term, ConsesLow.list( denots.first() ) );
      set_aq_term_raw_meanings( v_term, denots );
      _csetf_aq_term_disfavored_meanings( v_term, denots.rest() );
      result = ConsesLow.cons( v_term, result );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return ConsesLow.list( Sequences.nreverse( result ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 18931L)
  public static SubLObject conflated_term_from(SubLObject cycl)
  {
    cycl = czer_main.canonicalize_term( cycl, UNPROVIDED );
    if( NIL == narts_high.naut_p( cycl ) && NIL == somewhere_cache.some_pred_assertion_somewhereP( $const113$parsingConflateTo, cycl, ONE_INTEGER, UNPROVIDED ) && NIL == somewhere_cache.some_pred_assertion_somewhereP(
        $const114$qaConflateTo, cycl, ONE_INTEGER, UNPROVIDED ) && NIL == somewhere_cache.some_pred_assertion_somewhereP( $const115$qaConflateToCompletely, cycl, ONE_INTEGER, UNPROVIDED ) )
    {
      return cycl;
    }
    return ask_utilities.query_variable( $sym116$_PREFERRED, ConsesLow.listS( $const113$parsingConflateTo, cycl, $list117 ), $const58$InferencePSC, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 19761L)
  public static SubLObject get_tokenizations_for_terms(final SubLObject cycl_terms)
  {
    SubLObject tokenizations = NIL;
    SubLObject cdolist_list_var = cycl_terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject aq_term = new_aq_term( v_term );
      set_aq_term_possible_meanings( aq_term, ConsesLow.list( v_term ) );
      set_aq_term_raw_meanings( aq_term, ConsesLow.list( v_term ) );
      _csetf_aq_term_disfavored_meanings( aq_term, NIL );
      tokenizations = ConsesLow.cons( aq_term, tokenizations );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return ConsesLow.list( Sequences.nreverse( tokenizations ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 20187L)
  public static SubLObject positive_strings_for_term(final SubLObject aq_term)
  {
    if( NIL != aq_term_positive_strings_staleP( aq_term ) )
    {
      if( NIL != undisambiguated_termP( aq_term ) )
      {
        _csetf_aq_term_positive_strings( aq_term, ConsesLow.list( aq_term_original_string( aq_term ) ) );
      }
      else
      {
        _csetf_aq_term_positive_strings( aq_term, NIL );
        SubLObject cdolist_list_var = get_aq_term_possible_meanings( aq_term );
        SubLObject possible = NIL;
        possible = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject synset_strings = qua_strings_for_term_via_synsets( possible );
          final SubLObject cyc_strings = qua_all_phrases_for_term( possible );
          final SubLObject clarifying_genls_strings = clarifying_genls_strings( possible, aq_term_disfavored_meanings( aq_term ), UNPROVIDED );
          final SubLObject mys_expansion_strings = qua_expansion_strings( possible );
          _csetf_aq_term_positive_strings( aq_term, Sequences.cconcatenate( aq_term_positive_strings( aq_term ), new SubLObject[] { cyc_strings, synset_strings, clarifying_genls_strings, mys_expansion_strings
          } ) );
          cdolist_list_var = cdolist_list_var.rest();
          possible = cdolist_list_var.first();
        }
      }
      _csetf_aq_term_positive_strings_staleP( aq_term, NIL );
    }
    _csetf_aq_term_positive_strings( aq_term, Sequences.remove_duplicates( aq_term_positive_strings( aq_term ), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return aq_term_positive_strings( aq_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 21587L)
  public static SubLObject qua_filter_terms(final SubLObject term_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject filtered = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym118$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const119$EverythingPSC, thread );
      filtered = list_utilities.remove_if_not( $sym120$QUA_FILTER_TERM_, rkf_relevance_utilities.rkf_filter_irrelevant_terms( term_list, $const58$InferencePSC ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return filtered;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 21929L)
  public static SubLObject clear_qua_filter_termP()
  {
    final SubLObject cs = $qua_filter_termP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 21929L)
  public static SubLObject remove_qua_filter_termP(final SubLObject v_term, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $qua_filter_termP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt_info ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 21929L)
  public static SubLObject qua_filter_termP_internal(final SubLObject v_term, final SubLObject mt_info)
  {
    return makeBoolean( NIL == qua_irrelevant_termP( v_term, mt_info ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 21929L)
  public static SubLObject qua_filter_termP(final SubLObject v_term, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    SubLObject caching_state = $qua_filter_termP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym120$QUA_FILTER_TERM_, $sym121$_QUA_FILTER_TERM__CACHING_STATE_, $int122$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( qua_filter_termP_internal( v_term, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22105L)
  public static SubLObject qua_irrelevant_termP(final SubLObject v_term, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym118$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym118$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const119$EverythingPSC, thread );
        ans = cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( ConsesLow.list( $const123$qaIrrelevantTerm, v_term ), UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym124$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym124$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const58$InferencePSC, thread );
        ans = cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( ConsesLow.list( $const123$qaIrrelevantTerm, v_term ), UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym125$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        ans = cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( ConsesLow.list( $const123$qaIrrelevantTerm, v_term ), UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym126$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        ans = cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( ConsesLow.list( $const123$qaIrrelevantTerm, v_term ), UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22320L)
  public static SubLObject qua_lexifiedP(final SubLObject v_term)
  {
    final SubLObject fort_term = narts_high.nart_substitute( v_term );
    return makeBoolean( NIL == forts.fort_p( fort_term ) || NIL != lexification_utilities.lexifiedP( fort_term, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22486L)
  public static SubLObject clear_qua_expansion_cycls()
  {
    final SubLObject cs = $qua_expansion_cycls_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22486L)
  public static SubLObject remove_qua_expansion_cycls(final SubLObject cyc_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $qua_expansion_cycls_caching_state$.getGlobalValue(), ConsesLow.list( cyc_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22486L)
  public static SubLObject qua_expansion_cycls_internal(final SubLObject cyc_term)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 22486L)
  public static SubLObject qua_expansion_cycls(final SubLObject cyc_term)
  {
    SubLObject caching_state = $qua_expansion_cycls_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym127$QUA_EXPANSION_CYCLS, $sym128$_QUA_EXPANSION_CYCLS_CACHING_STATE_, $int129$100, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cyc_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( qua_expansion_cycls_internal( cyc_term ) ) );
      memoization_state.caching_state_put( caching_state, cyc_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 23233L)
  public static SubLObject qua_expansion_strings(final SubLObject cyc_term)
  {
    return Mapping.mapcar( $sym59$QUA_GENERATE_PHRASE, qua_expansion_cycls( cyc_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 23392L)
  public static SubLObject aq_term_related_terms(final SubLObject aq_term)
  {
    final SubLObject cycl = aq_term_possible_meanings( aq_term ).first();
    final SubLObject related_cycls = qua_filter_terms( aq_term_siblings( aq_term ) );
    final SubLObject web_related = qua_filter_terms( web_conceptually_related( cycl, $int130$30 ) );
    return Sequences.cconcatenate( related_cycls, web_related );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 23735L)
  public static SubLObject aq_term_related_strings(final SubLObject aq_term)
  {
    return Mapping.mapcar( $sym131$GENERATE_PHRASE, aq_term_related_terms( aq_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 23855L)
  public static SubLObject aq_term_siblings(final SubLObject aq_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cycl = aq_term_preferred_meaning( aq_term );
    SubLObject result = NIL;
    final SubLObject doneP = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const58$InferencePSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate( genls.genls( cycl, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = v_genls;
        SubLObject genl = NIL;
        genl = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          if( NIL == qua_filter_termP( genl, UNPROVIDED ) )
          {
            result = ConsesLow.cons( genl, result );
          }
          SubLObject cdolist_list_var = genls.max_specs( genl, UNPROVIDED, UNPROVIDED );
          SubLObject spec = NIL;
          spec = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL == list_utilities.lengthG( result, $int130$30, UNPROVIDED ) && NIL == qua_filter_termP( spec, UNPROVIDED ) )
            {
              final SubLObject item_var = spec;
              if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                result = ConsesLow.cons( item_var, result );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
          }
          csome_list_var = csome_list_var.rest();
          genl = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 24400L)
  public static SubLObject clear_web_conceptually_related()
  {
    final SubLObject cs = $web_conceptually_related_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 24400L)
  public static SubLObject remove_web_conceptually_related(final SubLObject cyc_term, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $web_conceptually_related_caching_state$.getGlobalValue(), ConsesLow.list( cyc_term, count ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 24400L)
  public static SubLObject web_conceptually_related_internal(final SubLObject cyc_term, final SubLObject count)
  {
    if( NIL != forts.fort_p( cyc_term ) )
    {
      return ask_utilities.query_variable( $kw133$RELATED, ConsesLow.list( $const134$and, ConsesLow.listS( $const135$webConceptuallyRelated, cyc_term, $list136 ) ), $const58$InferencePSC, $list137 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 24400L)
  public static SubLObject web_conceptually_related(final SubLObject cyc_term, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = NIL;
    }
    SubLObject caching_state = $web_conceptually_related_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym132$WEB_CONCEPTUALLY_RELATED, $sym138$_WEB_CONCEPTUALLY_RELATED_CACHING_STATE_, $int129$100, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( cyc_term, count );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( cyc_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && count.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( web_conceptually_related_internal( cyc_term, count ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( cyc_term, count ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 24907L)
  public static SubLObject aq_term_specs(final SubLObject aq_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const58$InferencePSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject cycl = aq_term_preferred_meaning( aq_term );
      final SubLObject specs = cardinality_estimates.sort_by_generality_estimate( list_utilities.first_n( $int130$30, qua_filter_terms( genls.specs( cycl, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
      final SubLObject v_instances = cardinality_estimates.sort_by_generality_estimate( qua_filter_terms( ask_utilities.query_variable( $sym139$_INST, ConsesLow.list( $const140$isa, $sym139$_INST, cycl ),
          $const58$InferencePSC, UNPROVIDED ) ), UNPROVIDED );
      result = list_utilities.first_n( $int130$30, Sequences.cconcatenate( specs, v_instances ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 25372L)
  public static SubLObject aq_term_spec_strings(final SubLObject aq_term)
  {
    return Mapping.mapcar( $sym59$QUA_GENERATE_PHRASE, aq_term_specs( aq_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 25485L)
  public static SubLObject aq_term_genls(final SubLObject aq_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const58$InferencePSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject cycl = aq_term_preferred_meaning( aq_term );
      final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate( list_utilities.first_n( $int130$30, qua_filter_terms( genls.genls( cycl, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
      final SubLObject isas = cardinality_estimates.sort_by_generality_estimate( qua_filter_terms( isa.isa( cycl, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
      result = list_utilities.first_n( $int130$30, Sequences.cconcatenate( v_genls, isas ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 25893L)
  public static SubLObject aq_term_genl_strings(final SubLObject aq_term)
  {
    return Mapping.mapcar( $sym59$QUA_GENERATE_PHRASE, aq_term_genls( aq_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26648L)
  public static SubLObject qua_speech_part_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const141$EnglishLexiconMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $qua_speech_part_preds$.getDynamicValue( thread ) )
    {
      $qua_speech_part_preds$.setDynamicValue( conses_high.set_difference( Sequences.cconcatenate( lexicon_accessors.all_speech_part_preds( UNPROVIDED ), pph_methods.pph_name_string_preds( UNPROVIDED ) ), genl_predicates
          .all_spec_preds( $const142$verbFormWithAuxiliary, mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), thread );
    }
    return $qua_speech_part_preds$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26969L)
  public static SubLObject clear_qua_generate_phrase()
  {
    final SubLObject cs = $qua_generate_phrase_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26969L)
  public static SubLObject remove_qua_generate_phrase(final SubLObject v_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $qua_generate_phrase_caching_state$.getGlobalValue(), ConsesLow.list( v_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26969L)
  public static SubLObject qua_generate_phrase_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    try
    {
      pph_vars.$select_string_methods_to_omit$.bind( $list143, thread );
      pph_vars.$pph_demerit_cutoff$.bind( TWO_INTEGER, thread );
      result = pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2, thread );
      pph_vars.$select_string_methods_to_omit$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 26969L)
  public static SubLObject qua_generate_phrase(final SubLObject v_term)
  {
    SubLObject caching_state = $qua_generate_phrase_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym59$QUA_GENERATE_PHRASE, $sym144$_QUA_GENERATE_PHRASE_CACHING_STATE_, $int145$500, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( qua_generate_phrase_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 27336L)
  public static SubLObject clear_qua_all_phrases_for_term()
  {
    final SubLObject cs = $qua_all_phrases_for_term_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 27336L)
  public static SubLObject remove_qua_all_phrases_for_term(final SubLObject cyc_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $qua_all_phrases_for_term_caching_state$.getGlobalValue(), ConsesLow.list( cyc_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 27336L)
  public static SubLObject qua_all_phrases_for_term_internal(final SubLObject cyc_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    try
    {
      pph_vars.$select_string_methods_to_omit$.bind( $list143, thread );
      pph_vars.$pph_demerit_cutoff$.bind( TWO_INTEGER, thread );
      result = pph_methods_lexicon.all_phrases_for_term( cyc_term, qua_speech_part_preds( UNPROVIDED ), $list147, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2, thread );
      pph_vars.$select_string_methods_to_omit$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 27336L)
  public static SubLObject qua_all_phrases_for_term(final SubLObject cyc_term)
  {
    SubLObject caching_state = $qua_all_phrases_for_term_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym146$QUA_ALL_PHRASES_FOR_TERM, $sym148$_QUA_ALL_PHRASES_FOR_TERM_CACHING_STATE_, $int129$100, EQUALP, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cyc_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( qua_all_phrases_for_term_internal( cyc_term ) ) );
      memoization_state.caching_state_put( caching_state, cyc_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 27759L)
  public static SubLObject qua_all_phrases_for_term_as_string_list(final SubLObject cyc_term)
  {
    SubLObject all_strings = qua_all_phrases_for_term( cyc_term );
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      print_high.princ( all_strings.first(), stream );
      SubLObject cdolist_list_var;
      all_strings = ( cdolist_list_var = all_strings.rest() );
      SubLObject string = NIL;
      string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        print_high.princ( $str149$__, stream );
        print_high.princ( string, stream );
        cdolist_list_var = cdolist_list_var.rest();
        string = cdolist_list_var.first();
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 28110L)
  public static SubLObject clarifying_genls_strings(final SubLObject good_term, final SubLObject bad_terms, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const58$InferencePSC;
    }
    final SubLObject v_genls = clarifying_differentiating_genls( good_term, bad_terms, mt );
    final SubLObject strings = Mapping.mapcar( $sym59$QUA_GENERATE_PHRASE, v_genls );
    return strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 28352L)
  public static SubLObject clarifying_differentiating_genls(final SubLObject good_term, final SubLObject bad_terms, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const58$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( good_term.isString() )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject usable_bad_terms = Sequences.remove_if( $sym150$STRINGP, bad_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject ceilings = cdolist_list_var = genls.nearest_common_genls( ConsesLow.cons( good_term, usable_bad_terms ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject ceiling = NIL;
      ceiling = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$5;
        final SubLObject middle_terms = cdolist_list_var_$5 = genls.all_genls_wrt( good_term, ceiling, UNPROVIDED, UNPROVIDED );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          if( NIL != isa.isaP( v_term, $const151$QAClarifyingCollectionType, UNPROVIDED, UNPROVIDED ) && !v_term.equalp( good_term ) && !v_term.equalp( ceiling ) )
          {
            result = ConsesLow.cons( v_term, result );
          }
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          v_term = cdolist_list_var_$5.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        ceiling = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove_duplicates( list_utilities.flatten( result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 29320L)
  public static SubLObject remove_stop_words_from_strings(final SubLObject string_list)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = string_list;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject non_stop_word_tokens = NIL;
      SubLObject cdolist_list_var_$6 = string_utilities.split_string( string, UNPROVIDED );
      SubLObject token = NIL;
      token = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        if( NIL == lexicon_accessors.closed_lexical_class_stringP( token, UNPROVIDED ) )
        {
          non_stop_word_tokens = ConsesLow.cons( token, non_stop_word_tokens );
        }
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        token = cdolist_list_var_$6.first();
      }
      result = ConsesLow.cons( string_utilities.bunge( Sequences.nreverse( non_stop_word_tokens ), UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 29693L)
  public static SubLObject negative_strings_for_term(final SubLObject aq_term)
  {
    if( NIL != aq_term_negative_strings_staleP( aq_term ) )
    {
      if( NIL != undisambiguated_termP( aq_term ) )
      {
        _csetf_aq_term_negative_strings( aq_term, NIL );
      }
      else
      {
        _csetf_aq_term_negative_strings( aq_term, NIL );
        SubLObject cdolist_list_var = aq_term_disfavored_meanings( aq_term );
        SubLObject possible = NIL;
        possible = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject synset_strings = qua_strings_for_term_via_synsets( possible );
          final SubLObject cyc_strings = remove_stop_words_from_strings( pph_methods_lexicon.all_phrases_for_term( possible, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          final SubLObject clarifying_genls_strings = clarifying_genls_strings( possible, get_aq_term_possible_meanings( aq_term ), UNPROVIDED );
          _csetf_aq_term_negative_strings( aq_term, Sequences.cconcatenate( aq_term_negative_strings( aq_term ), new SubLObject[] { cyc_strings, synset_strings, clarifying_genls_strings
          } ) );
          cdolist_list_var = cdolist_list_var.rest();
          possible = cdolist_list_var.first();
        }
      }
      SubLObject cdolist_list_var = aq_term_positive_strings( aq_term );
      SubLObject good_string = NIL;
      good_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        _csetf_aq_term_negative_strings( aq_term, Sequences.remove( good_string, aq_term_negative_strings( aq_term ), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        good_string = cdolist_list_var.first();
      }
      _csetf_aq_term_negative_strings_staleP( aq_term, NIL );
    }
    return aq_term_negative_strings( aq_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 30983L)
  public static SubLObject qua_strings_for_term_via_synsets(final SubLObject cyc_term)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 31116L)
  public static SubLObject get_aq_term_disambig_options(final SubLObject aq_term)
  {
    return aq_term_possible_meanings( aq_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 31223L)
  public static SubLObject reset_aq_term_ambiguity(final SubLObject aq_term)
  {
    set_aq_term_possible_meanings( aq_term, ConsesLow.list( aq_term_raw_meanings( aq_term ).first() ) );
    set_aq_term_disfavored_meanings( aq_term, aq_term_raw_meanings( aq_term ).rest() );
    return aq_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 31461L)
  public static SubLObject set_aq_term_possible_meanings(final SubLObject aq_term, final SubLObject new_value)
  {
    _csetf_aq_term_possible_meanings( aq_term, new_value );
    _csetf_aq_term_positive_strings_staleP( aq_term, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 31651L)
  public static SubLObject set_aq_term_raw_meanings(final SubLObject aq_term, final SubLObject new_value)
  {
    _csetf_aq_term_raw_meanings( aq_term, new_value );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 31777L)
  public static SubLObject get_aq_term_possible_meanings(final SubLObject aq_term)
  {
    return aq_term_possible_meanings( aq_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 31879L)
  public static SubLObject set_aq_term_disfavored_meanings(final SubLObject aq_term, final SubLObject new_value)
  {
    _csetf_aq_term_disfavored_meanings( aq_term, new_value );
    _csetf_aq_term_negative_strings_staleP( aq_term, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 32073L)
  public static SubLObject accept_meaning(final SubLObject aq_term, final SubLObject meaning)
  {
    if( !ConsesLow.list( meaning ).equalp( aq_term_possible_meanings( aq_term ) ) )
    {
      set_aq_term_possible_meanings( aq_term, ConsesLow.list( meaning ) );
      set_aq_term_disfavored_meanings( aq_term, Sequences.remove_if( $sym150$STRINGP, Sequences.remove( meaning, aq_term_raw_meanings( aq_term ), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      return aq_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 32552L)
  public static SubLObject reject_meaning(final SubLObject aq_term, final SubLObject meaning)
  {
    set_aq_term_disfavored_meanings( aq_term, ConsesLow.cons( meaning, aq_term_disfavored_meanings( aq_term ) ) );
    set_aq_term_possible_meanings( aq_term, Sequences.remove( meaning, aq_term_possible_meanings( aq_term ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return aq_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 32811L)
  public static SubLObject clear_qua_caches()
  {
    clear_qua_all_phrases_for_term();
    clear_qua_generate_phrase();
    clear_web_conceptually_related();
    clear_qua_filter_termP();
    clear_qua_expansion_cycls();
    $qua_speech_part_preds$.setDynamicValue( NIL );
    pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 33089L)
  public static SubLObject get_query_url_for_sentence(final SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds)
  {
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    if( ignore_all_preds == UNPROVIDED )
    {
      ignore_all_preds = T;
    }
    final SubLObject query = qua_query_for_cycl_sentence( cycl, v_search_engine, ignore_all_preds );
    return get_augmented_query_url( aq_id( query ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 33474L)
  public static SubLObject qua_query_string_for_cycl_sentence(final SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds)
  {
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    if( ignore_all_preds == UNPROVIDED )
    {
      ignore_all_preds = T;
    }
    final SubLObject query = qua_query_for_cycl_sentence( cycl, v_search_engine, ignore_all_preds );
    return get_search_string_for_query( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 33739L)
  public static SubLObject qua_query_for_cycl_sentence(final SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds)
  {
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = $qua_default_search_engine$.getDynamicValue();
    }
    if( ignore_all_preds == UNPROVIDED )
    {
      ignore_all_preds = NIL;
    }
    final SubLObject searchable_items = qua_searchable_terms_from_cycl_sentence( cycl, ignore_all_preds, UNPROVIDED, UNPROVIDED );
    return get_augmented_query_for_cycl_terms( searchable_items, v_search_engine );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 34276L)
  public static SubLObject qua_searchable_terms_from_cycl_sentence(final SubLObject cycl, SubLObject ignore_all_preds, SubLObject generality_cutoff, SubLObject debug)
  {
    if( ignore_all_preds == UNPROVIDED )
    {
      ignore_all_preds = NIL;
    }
    if( generality_cutoff == UNPROVIDED )
    {
      generality_cutoff = $qua_generality_cutoff$.getDynamicValue();
    }
    if( debug == UNPROVIDED )
    {
      debug = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject searchable_terms = NIL;
    final SubLObject _prev_bind_0 = $qua_ignore_predsP$.currentBinding( thread );
    try
    {
      $qua_ignore_predsP$.bind( ignore_all_preds, thread );
      SubLObject cdolist_list_var;
      final SubLObject all_terms = cdolist_list_var = cycl_utilities.expression_gather( cycl, $sym153$QUA_TERM_FROM_SENTENCE_, NIL, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), NIL );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( NIL == isa.isaP( v_term, $const154$Collection, UNPROVIDED, UNPROVIDED ) || !cardinality_estimates.generality_estimate( v_term ).numG( generality_cutoff ) ) && NIL == pred_with_no_nominal_lexesP( v_term,
            UNPROVIDED ) )
        {
          if( NIL != debug )
          {
            PrintLow.format( T, $str155$Pushing__S_because_it_is_not_a_ge, new SubLObject[] { v_term, makeBoolean( NIL != isa.isaP( v_term, $const154$Collection, UNPROVIDED, UNPROVIDED ) && cardinality_estimates
                .generality_estimate( v_term ).numG( generality_cutoff ) ), pred_with_no_nominal_lexesP( v_term, UNPROVIDED )
            } );
          }
          searchable_terms = ConsesLow.cons( v_term, searchable_terms );
        }
        if( NIL != narts_high.naut_p( v_term ) )
        {
          if( NIL != debug )
          {
            PrintLow.format( T, $str156$This_term_is_a_naut___A__, v_term );
          }
          final SubLObject functor = v_term.first();
          if( NIL != isa.isaP( functor, $const157$SearchStringInappropriateFunction, UNPROVIDED, UNPROVIDED ) || NIL != cycl_variables.cyc_varP( functor ) || NIL == qua_lexifiedP( v_term ) )
          {
            if( NIL != debug )
            {
              PrintLow.format( T, $str158$Either_the_term_is_not_lexified_o, v_term );
            }
            if( searchable_terms.first().eql( v_term ) )
            {
              searchable_terms = searchable_terms.rest();
            }
            SubLObject cdolist_list_var_$7 = v_term.rest();
            SubLObject arg = NIL;
            arg = cdolist_list_var_$7.first();
            while ( NIL != cdolist_list_var_$7)
            {
              if( NIL != debug )
              {
                PrintLow.format( T, $str159$Recursing_on__A__, arg );
              }
              searchable_terms = ConsesLow.append( qua_searchable_terms_from_cycl_sentence( arg, ignore_all_preds, generality_cutoff, UNPROVIDED ), searchable_terms );
              cdolist_list_var_$7 = cdolist_list_var_$7.rest();
              arg = cdolist_list_var_$7.first();
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    finally
    {
      $qua_ignore_predsP$.rebind( _prev_bind_0, thread );
    }
    return qua_filter_terms( Sequences.remove_duplicates( searchable_terms, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 35886L)
  public static SubLObject qua_term_from_sentenceP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( NIL != misc_kb_utilities.constant_or_natP( v_term ) || NIL != narts_high.naut_p( v_term ) ) && ( NIL == $qua_ignore_predsP$.getDynamicValue( thread ) || NIL == fort_types_interface.predicate_p(
        v_term ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 36061L)
  public static SubLObject pred_with_no_nominal_lexesP(final SubLObject v_term, SubLObject lex_mt)
  {
    if( lex_mt == UNPROVIDED )
    {
      lex_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return makeBoolean( NIL != fort_types_interface.predicateP( v_term ) && NIL == ask_utilities.query_boolean( ConsesLow.list( $const160$or, ConsesLow.listS( $const161$termPhrases, v_term, $list162 ), ConsesLow.listS(
        $const161$termPhrases, v_term, $list163 ) ), lex_mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/qua-query.lisp", position = 38573L)
  public static SubLObject terms_from_web_query(final SubLObject query_string)
  {
    final SubLObject tokenizations = get_tokenizations_for_aq_string( query_string, UNPROVIDED );
    SubLObject words = NIL;
    SubLObject cdolist_list_var = tokenizations;
    SubLObject tokenization = NIL;
    tokenization = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$8 = tokenization;
      SubLObject token = NIL;
      token = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        final SubLObject string = aq_term_original_string( token );
        SubLObject cdolist_list_var_$9 = aq_term_raw_meanings( token ).rest();
        SubLObject interp_cycl = NIL;
        interp_cycl = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          final SubLObject word = ConsesLow.list( $kw173$STRING, string, $kw174$INTERP, interp_cycl, $kw175$INTERP_CFASL, kb_utilities.hl_external_id_string( interp_cycl ), $kw176$INTERP_GENERATION, pph_main
              .generate_phrase( interp_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          words = ConsesLow.cons( word, words );
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          interp_cycl = cdolist_list_var_$9.first();
        }
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        token = cdolist_list_var_$8.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      tokenization = cdolist_list_var.first();
    }
    return words;
  }

  public static SubLObject declare_qua_query_file()
  {
    SubLFiles.declareFunction( me, "augmented_query_string_for_query_string", "AUGMENTED-QUERY-STRING-FOR-QUERY-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "augmented_query_string_for_cycl_terms", "AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_aq_lexicon", "GET-AQ-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "augmented_query_print_function_trampoline", "AUGMENTED-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "augmented_query_p", "AUGMENTED-QUERY-P", 1, 0, false );
    new $augmented_query_p$UnaryFunction();
    SubLFiles.declareFunction( me, "aq_original_phrase", "AQ-ORIGINAL-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_id", "AQ-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_tokenizations", "AQ-TOKENIZATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_query_string", "AQ-QUERY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_query_string_staleP", "AQ-QUERY-STRING-STALE?", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_search_engine", "AQ-SEARCH-ENGINE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_original_phrase", "_CSETF-AQ-ORIGINAL-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_id", "_CSETF-AQ-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_tokenizations", "_CSETF-AQ-TOKENIZATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_query_string", "_CSETF-AQ-QUERY-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_query_string_staleP", "_CSETF-AQ-QUERY-STRING-STALE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_search_engine", "_CSETF-AQ-SEARCH-ENGINE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_augmented_query", "MAKE-AUGMENTED-QUERY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_augmented_query", "VISIT-DEFSTRUCT-AUGMENTED-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_augmented_query_method", "VISIT-DEFSTRUCT-OBJECT-AUGMENTED-QUERY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_augmented_query", "NEW-AUGMENTED-QUERY", 0, 2, false );
    SubLFiles.declareFunction( me, "print_augmented_query", "PRINT-AUGMENTED-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "get_aq_tokenizations", "GET-AQ-TOKENIZATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_aq_search_engine", "GET-AQ-SEARCH-ENGINE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_aq_search_engine", "SET-AQ-SEARCH-ENGINE", 2, 0, false );
    SubLFiles.declareFunction( me, "aq_max_strings_for_search", "AQ-MAX-STRINGS-FOR-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_aq_max_strings_per_term", "GET-AQ-MAX-STRINGS-PER-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "get_qua_operator_strings_for_search", "GET-QUA-OPERATOR-STRINGS-FOR-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_aq_term_by_id", "GET-AQ-TERM-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_augmented_query_for_id", "GET-AUGMENTED-QUERY-FOR-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_augmented_query_for_cycl_terms", "GET-AUGMENTED-QUERY-FOR-CYCL-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_raw_query_url", "GET-RAW-QUERY-URL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_augmented_query_url", "GET-AUGMENTED-QUERY-URL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_query_url", "GET-QUERY-URL", 2, 1, false );
    SubLFiles.declareFunction( me, "get_search_string_for_query", "GET-SEARCH-STRING-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "n_best_qua_strings", "N-BEST-QUA-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "qua_or_clause", "QUA-OR-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_and_clause", "QUA-AND-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_connected_clause", "QUA-CONNECTED-CLAUSE", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_quotes", "MAYBE-ADD-QUOTES", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_add_connective", "QUA-ADD-CONNECTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "nearest_spec_strings", "NEAREST-SPEC-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_disambiguation_options", "GET-DISAMBIGUATION-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_disambiguation_options", "GET-ALL-DISAMBIGUATION-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_unambiguous_aq_term_meanings", "GENERATE-UNAMBIGUOUS-AQ-TERM-MEANINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_ambiguity", "RESET-AMBIGUITY", 2, 0, false );
    SubLFiles.declareFunction( me, "accept_disambiguation_option", "ACCEPT-DISAMBIGUATION-OPTION", 3, 0, false );
    SubLFiles.declareFunction( me, "aq_term_print_function_trampoline", "AQ-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "aq_term_p", "AQ-TERM-P", 1, 0, false );
    new $aq_term_p$UnaryFunction();
    SubLFiles.declareFunction( me, "aq_term_id", "AQ-TERM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_original_string", "AQ-TERM-ORIGINAL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_raw_meanings", "AQ-TERM-RAW-MEANINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_possible_meanings", "AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_disfavored_meanings", "AQ-TERM-DISFAVORED-MEANINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_positive_strings", "AQ-TERM-POSITIVE-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_positive_terms_in_upward_closure", "AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_positive_strings_staleP", "AQ-TERM-POSITIVE-STRINGS-STALE?", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_negative_strings", "AQ-TERM-NEGATIVE-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_negative_terms_in_upward_closure", "AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_negative_strings_staleP", "AQ-TERM-NEGATIVE-STRINGS-STALE?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_id", "_CSETF-AQ-TERM-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_original_string", "_CSETF-AQ-TERM-ORIGINAL-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_raw_meanings", "_CSETF-AQ-TERM-RAW-MEANINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_possible_meanings", "_CSETF-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_disfavored_meanings", "_CSETF-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_positive_strings", "_CSETF-AQ-TERM-POSITIVE-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_positive_terms_in_upward_closure", "_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_positive_strings_staleP", "_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_negative_strings", "_CSETF-AQ-TERM-NEGATIVE-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_negative_terms_in_upward_closure", "_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_aq_term_negative_strings_staleP", "_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_aq_term", "MAKE-AQ-TERM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_aq_term", "VISIT-DEFSTRUCT-AQ-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_aq_term_method", "VISIT-DEFSTRUCT-OBJECT-AQ-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_aq_term", "PRINT-AQ-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "new_aq_term", "NEW-AQ-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_preferred_meaning", "AQ-TERM-PREFERRED-MEANING", 1, 0, false );
    SubLFiles.declareFunction( me, "undisambiguated_termP", "UNDISAMBIGUATED-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tokenizations_for_aq_string", "GET-TOKENIZATIONS-FOR-AQ-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "conflated_term_from", "CONFLATED-TERM-FROM", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tokenizations_for_terms", "GET-TOKENIZATIONS-FOR-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_strings_for_term", "POSITIVE-STRINGS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_filter_terms", "QUA-FILTER-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_qua_filter_termP", "CLEAR-QUA-FILTER-TERM?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_qua_filter_termP", "REMOVE-QUA-FILTER-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "qua_filter_termP_internal", "QUA-FILTER-TERM?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "qua_filter_termP", "QUA-FILTER-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "qua_irrelevant_termP", "QUA-IRRELEVANT-TERM?", 2, 0, false );
    SubLFiles.declareFunction( me, "qua_lexifiedP", "QUA-LEXIFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_qua_expansion_cycls", "CLEAR-QUA-EXPANSION-CYCLS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_qua_expansion_cycls", "REMOVE-QUA-EXPANSION-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_expansion_cycls_internal", "QUA-EXPANSION-CYCLS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_expansion_cycls", "QUA-EXPANSION-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_expansion_strings", "QUA-EXPANSION-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_related_terms", "AQ-TERM-RELATED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_related_strings", "AQ-TERM-RELATED-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_siblings", "AQ-TERM-SIBLINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_web_conceptually_related", "CLEAR-WEB-CONCEPTUALLY-RELATED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_web_conceptually_related", "REMOVE-WEB-CONCEPTUALLY-RELATED", 1, 1, false );
    SubLFiles.declareFunction( me, "web_conceptually_related_internal", "WEB-CONCEPTUALLY-RELATED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "web_conceptually_related", "WEB-CONCEPTUALLY-RELATED", 1, 1, false );
    SubLFiles.declareFunction( me, "aq_term_specs", "AQ-TERM-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_spec_strings", "AQ-TERM-SPEC-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_genls", "AQ-TERM-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "aq_term_genl_strings", "AQ-TERM-GENL-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_speech_part_preds", "QUA-SPEECH-PART-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_qua_generate_phrase", "CLEAR-QUA-GENERATE-PHRASE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_qua_generate_phrase", "REMOVE-QUA-GENERATE-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_generate_phrase_internal", "QUA-GENERATE-PHRASE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_generate_phrase", "QUA-GENERATE-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_qua_all_phrases_for_term", "CLEAR-QUA-ALL-PHRASES-FOR-TERM", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_qua_all_phrases_for_term", "REMOVE-QUA-ALL-PHRASES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_all_phrases_for_term_internal", "QUA-ALL-PHRASES-FOR-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_all_phrases_for_term", "QUA-ALL-PHRASES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_all_phrases_for_term_as_string_list", "QUA-ALL-PHRASES-FOR-TERM-AS-STRING-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "clarifying_genls_strings", "CLARIFYING-GENLS-STRINGS", 2, 1, false );
    SubLFiles.declareFunction( me, "clarifying_differentiating_genls", "CLARIFYING-DIFFERENTIATING-GENLS", 2, 1, false );
    SubLFiles.declareFunction( me, "remove_stop_words_from_strings", "REMOVE-STOP-WORDS-FROM-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_strings_for_term", "NEGATIVE-STRINGS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "qua_strings_for_term_via_synsets", "QUA-STRINGS-FOR-TERM-VIA-SYNSETS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_aq_term_disambig_options", "GET-AQ-TERM-DISAMBIG-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_aq_term_ambiguity", "RESET-AQ-TERM-AMBIGUITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_aq_term_possible_meanings", "SET-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_aq_term_raw_meanings", "SET-AQ-TERM-RAW-MEANINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_aq_term_possible_meanings", "GET-AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_aq_term_disfavored_meanings", "SET-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "accept_meaning", "ACCEPT-MEANING", 2, 0, false );
    SubLFiles.declareFunction( me, "reject_meaning", "REJECT-MEANING", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_qua_caches", "CLEAR-QUA-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_query_url_for_sentence", "GET-QUERY-URL-FOR-SENTENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "qua_query_string_for_cycl_sentence", "QUA-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "qua_query_for_cycl_sentence", "QUA-QUERY-FOR-CYCL-SENTENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "qua_searchable_terms_from_cycl_sentence", "QUA-SEARCHABLE-TERMS-FROM-CYCL-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "qua_term_from_sentenceP", "QUA-TERM-FROM-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_with_no_nominal_lexesP", "PRED-WITH-NO-NOMINAL-LEXES?", 1, 1, false );
    SubLFiles.declareFunction( me, "terms_from_web_query", "TERMS-FROM-WEB-QUERY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_qua_query_file()
  {
    $qua_default_search_engine$ = SubLFiles.defparameter( "*QUA-DEFAULT-SEARCH-ENGINE*", $kw0$ALTAVISTA );
    $google_string_count_limit$ = SubLFiles.defparameter( "*GOOGLE-STRING-COUNT-LIMIT*", $int1$32 );
    $qua_operators$ = SubLFiles.defparameter( "*QUA-OPERATORS*", NIL );
    $augmented_query_id_generator$ = SubLFiles.defparameter( "*AUGMENTED-QUERY-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $augmented_query_dict$ = SubLFiles.defparameter( "*AUGMENTED-QUERY-DICT*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $augmented_query_lexicon$ = SubLFiles.defparameter( "*AUGMENTED-QUERY-LEXICON*", NIL );
    $dtp_augmented_query$ = SubLFiles.defconstant( "*DTP-AUGMENTED-QUERY*", $sym12$AUGMENTED_QUERY );
    $qua_url_templates$ = SubLFiles.defparameter( "*QUA-URL-TEMPLATES*", $list49 );
    $aq_term_id_generator$ = SubLFiles.defparameter( "*AQ-TERM-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $dtp_aq_term$ = SubLFiles.defconstant( "*DTP-AQ-TERM*", $sym62$AQ_TERM );
    $qua_filter_termP_caching_state$ = SubLFiles.deflexical( "*QUA-FILTER-TERM?-CACHING-STATE*", NIL );
    $qua_expansion_cycls_caching_state$ = SubLFiles.deflexical( "*QUA-EXPANSION-CYCLS-CACHING-STATE*", NIL );
    $web_conceptually_related_caching_state$ = SubLFiles.deflexical( "*WEB-CONCEPTUALLY-RELATED-CACHING-STATE*", NIL );
    $qua_speech_part_preds$ = SubLFiles.defparameter( "*QUA-SPEECH-PART-PREDS*", NIL );
    $qua_generate_phrase_caching_state$ = SubLFiles.deflexical( "*QUA-GENERATE-PHRASE-CACHING-STATE*", NIL );
    $qua_all_phrases_for_term_caching_state$ = SubLFiles.deflexical( "*QUA-ALL-PHRASES-FOR-TERM-CACHING-STATE*", NIL );
    $qua_ignore_predsP$ = SubLFiles.defparameter( "*QUA-IGNORE-PREDS?*", NIL );
    $qua_generality_cutoff$ = SubLFiles.defparameter( "*QUA-GENERALITY-CUTOFF*", $int152$400000 );
    return NIL;
  }

  public static SubLObject setup_qua_query_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), Symbols.symbol_function( $sym19$AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list20 );
    Structures.def_csetf( $sym21$AQ_ORIGINAL_PHRASE, $sym22$_CSETF_AQ_ORIGINAL_PHRASE );
    Structures.def_csetf( $sym23$AQ_ID, $sym24$_CSETF_AQ_ID );
    Structures.def_csetf( $sym25$AQ_TOKENIZATIONS, $sym26$_CSETF_AQ_TOKENIZATIONS );
    Structures.def_csetf( $sym27$AQ_QUERY_STRING, $sym28$_CSETF_AQ_QUERY_STRING );
    Structures.def_csetf( $sym29$AQ_QUERY_STRING_STALE_, $sym30$_CSETF_AQ_QUERY_STRING_STALE_ );
    Structures.def_csetf( $sym31$AQ_SEARCH_ENGINE, $sym32$_CSETF_AQ_SEARCH_ENGINE );
    Equality.identity( $sym12$AUGMENTED_QUERY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), Symbols.symbol_function(
        $sym44$VISIT_DEFSTRUCT_OBJECT_AUGMENTED_QUERY_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), Symbols.symbol_function( $sym69$AQ_TERM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list70 );
    Structures.def_csetf( $sym71$AQ_TERM_ID, $sym72$_CSETF_AQ_TERM_ID );
    Structures.def_csetf( $sym73$AQ_TERM_ORIGINAL_STRING, $sym74$_CSETF_AQ_TERM_ORIGINAL_STRING );
    Structures.def_csetf( $sym75$AQ_TERM_RAW_MEANINGS, $sym76$_CSETF_AQ_TERM_RAW_MEANINGS );
    Structures.def_csetf( $sym77$AQ_TERM_POSSIBLE_MEANINGS, $sym78$_CSETF_AQ_TERM_POSSIBLE_MEANINGS );
    Structures.def_csetf( $sym79$AQ_TERM_DISFAVORED_MEANINGS, $sym80$_CSETF_AQ_TERM_DISFAVORED_MEANINGS );
    Structures.def_csetf( $sym81$AQ_TERM_POSITIVE_STRINGS, $sym82$_CSETF_AQ_TERM_POSITIVE_STRINGS );
    Structures.def_csetf( $sym83$AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE, $sym84$_CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE );
    Structures.def_csetf( $sym85$AQ_TERM_POSITIVE_STRINGS_STALE_, $sym86$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_ );
    Structures.def_csetf( $sym87$AQ_TERM_NEGATIVE_STRINGS, $sym88$_CSETF_AQ_TERM_NEGATIVE_STRINGS );
    Structures.def_csetf( $sym89$AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE, $sym90$_CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE );
    Structures.def_csetf( $sym91$AQ_TERM_NEGATIVE_STRINGS_STALE_, $sym92$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_ );
    Equality.identity( $sym62$AQ_TERM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), Symbols.symbol_function( $sym104$VISIT_DEFSTRUCT_OBJECT_AQ_TERM_METHOD ) );
    memoization_state.note_globally_cached_function( $sym120$QUA_FILTER_TERM_ );
    memoization_state.note_globally_cached_function( $sym127$QUA_EXPANSION_CYCLS );
    memoization_state.note_globally_cached_function( $sym132$WEB_CONCEPTUALLY_RELATED );
    memoization_state.note_globally_cached_function( $sym59$QUA_GENERATE_PHRASE );
    memoization_state.note_globally_cached_function( $sym146$QUA_ALL_PHRASES_FOR_TERM );
    generic_testing.define_test_case_table_int( $sym164$QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE, ConsesLow.list( new SubLObject[] { $kw165$TEST, Symbols.symbol_function( $sym166$SETS_EQUALP ), $kw167$OWNER, NIL,
      $kw168$CLASSES, NIL, $kw169$KB, $kw170$FULL, $kw171$WORKING_, T
    } ), $list172 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_qua_query_file();
  }

  @Override
  public void initializeVariables()
  {
    init_qua_query_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_qua_query_file();
  }
  static
  {
    me = new qua_query();
    $qua_default_search_engine$ = null;
    $google_string_count_limit$ = null;
    $qua_operators$ = null;
    $augmented_query_id_generator$ = null;
    $augmented_query_dict$ = null;
    $augmented_query_lexicon$ = null;
    $dtp_augmented_query$ = null;
    $qua_url_templates$ = null;
    $aq_term_id_generator$ = null;
    $dtp_aq_term$ = null;
    $qua_filter_termP_caching_state$ = null;
    $qua_expansion_cycls_caching_state$ = null;
    $web_conceptually_related_caching_state$ = null;
    $qua_speech_part_preds$ = null;
    $qua_generate_phrase_caching_state$ = null;
    $qua_all_phrases_for_term_caching_state$ = null;
    $qua_ignore_predsP$ = null;
    $qua_generality_cutoff$ = null;
    $kw0$ALTAVISTA = makeKeyword( "ALTAVISTA" );
    $int1$32 = makeInteger( 32 );
    $sym2$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $sym3$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw4$OFF = makeKeyword( "OFF" );
    $sym5$ALLOW_MT = makeSymbol( "ALLOW-MT" );
    $const6$RelationParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "RelationParaphraseMt" ) );
    $const7$MedicalLexicalMt = constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) );
    $const8$CCFLexicalMt = constant_handles.reader_make_constant_shell( makeString( "CCFLexicalMt" ) );
    $sym9$ADD_LEARNER = makeSymbol( "ADD-LEARNER" );
    $sym10$NUMBER_LEARN = makeSymbol( "NUMBER-LEARN" );
    $sym11$SIMPLE_DATE_LEARN = makeSymbol( "SIMPLE-DATE-LEARN" );
    $sym12$AUGMENTED_QUERY = makeSymbol( "AUGMENTED-QUERY" );
    $sym13$AUGMENTED_QUERY_P = makeSymbol( "AUGMENTED-QUERY-P" );
    $list14 = ConsesLow.list( makeSymbol( "ORIGINAL-PHRASE" ), makeSymbol( "ID" ), makeSymbol( "TOKENIZATIONS" ), makeSymbol( "QUERY-STRING" ), makeSymbol( "QUERY-STRING-STALE?" ), makeSymbol( "SEARCH-ENGINE" ) );
    $list15 = ConsesLow.list( makeKeyword( "ORIGINAL-PHRASE" ), makeKeyword( "ID" ), makeKeyword( "TOKENIZATIONS" ), makeKeyword( "QUERY-STRING" ), makeKeyword( "QUERY-STRING-STALE?" ), makeKeyword( "SEARCH-ENGINE" ) );
    $list16 = ConsesLow.list( makeSymbol( "AQ-ORIGINAL-PHRASE" ), makeSymbol( "AQ-ID" ), makeSymbol( "AQ-TOKENIZATIONS" ), makeSymbol( "AQ-QUERY-STRING" ), makeSymbol( "AQ-QUERY-STRING-STALE?" ), makeSymbol(
        "AQ-SEARCH-ENGINE" ) );
    $list17 = ConsesLow.list( makeSymbol( "_CSETF-AQ-ORIGINAL-PHRASE" ), makeSymbol( "_CSETF-AQ-ID" ), makeSymbol( "_CSETF-AQ-TOKENIZATIONS" ), makeSymbol( "_CSETF-AQ-QUERY-STRING" ), makeSymbol(
        "_CSETF-AQ-QUERY-STRING-STALE?" ), makeSymbol( "_CSETF-AQ-SEARCH-ENGINE" ) );
    $sym18$PRINT_AUGMENTED_QUERY = makeSymbol( "PRINT-AUGMENTED-QUERY" );
    $sym19$AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "AUGMENTED-QUERY-PRINT-FUNCTION-TRAMPOLINE" );
    $list20 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "AUGMENTED-QUERY-P" ) );
    $sym21$AQ_ORIGINAL_PHRASE = makeSymbol( "AQ-ORIGINAL-PHRASE" );
    $sym22$_CSETF_AQ_ORIGINAL_PHRASE = makeSymbol( "_CSETF-AQ-ORIGINAL-PHRASE" );
    $sym23$AQ_ID = makeSymbol( "AQ-ID" );
    $sym24$_CSETF_AQ_ID = makeSymbol( "_CSETF-AQ-ID" );
    $sym25$AQ_TOKENIZATIONS = makeSymbol( "AQ-TOKENIZATIONS" );
    $sym26$_CSETF_AQ_TOKENIZATIONS = makeSymbol( "_CSETF-AQ-TOKENIZATIONS" );
    $sym27$AQ_QUERY_STRING = makeSymbol( "AQ-QUERY-STRING" );
    $sym28$_CSETF_AQ_QUERY_STRING = makeSymbol( "_CSETF-AQ-QUERY-STRING" );
    $sym29$AQ_QUERY_STRING_STALE_ = makeSymbol( "AQ-QUERY-STRING-STALE?" );
    $sym30$_CSETF_AQ_QUERY_STRING_STALE_ = makeSymbol( "_CSETF-AQ-QUERY-STRING-STALE?" );
    $sym31$AQ_SEARCH_ENGINE = makeSymbol( "AQ-SEARCH-ENGINE" );
    $sym32$_CSETF_AQ_SEARCH_ENGINE = makeSymbol( "_CSETF-AQ-SEARCH-ENGINE" );
    $kw33$ORIGINAL_PHRASE = makeKeyword( "ORIGINAL-PHRASE" );
    $kw34$ID = makeKeyword( "ID" );
    $kw35$TOKENIZATIONS = makeKeyword( "TOKENIZATIONS" );
    $kw36$QUERY_STRING = makeKeyword( "QUERY-STRING" );
    $kw37$QUERY_STRING_STALE_ = makeKeyword( "QUERY-STRING-STALE?" );
    $kw38$SEARCH_ENGINE = makeKeyword( "SEARCH-ENGINE" );
    $str39$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw40$BEGIN = makeKeyword( "BEGIN" );
    $sym41$MAKE_AUGMENTED_QUERY = makeSymbol( "MAKE-AUGMENTED-QUERY" );
    $kw42$SLOT = makeKeyword( "SLOT" );
    $kw43$END = makeKeyword( "END" );
    $sym44$VISIT_DEFSTRUCT_OBJECT_AUGMENTED_QUERY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-AUGMENTED-QUERY-METHOD" );
    $str45$_augmented_query__A__S__S_ = makeString( "<augmented-query-~A:~S:~S>" );
    $kw46$GOOGLE = makeKeyword( "GOOGLE" );
    $list47 = ConsesLow.list( makeKeyword( "OR" ), makeSymbol( "OR" ), makeKeyword( "AND" ), NIL );
    $list48 = ConsesLow.list( makeKeyword( "OR" ), makeSymbol( "OR" ), makeKeyword( "AND" ), makeSymbol( "AND" ) );
    $list49 = ConsesLow.list( makeKeyword( "ALTAVISTA" ), makeString( "http://www.altavista.com/web/results?q=SEARCH-STRING&kgs=1&kls=0&nbq=ANSWER-COUNT" ), makeKeyword( "GOOGLE" ), makeString(
        "http://www.google.com/search?hl=en&q=SEARCH-STRING&btnG=Google+Search&num=ANSWER-COUNT" ) );
    $str50$ = makeString( "" );
    $str51$ANSWER_COUNT = makeString( "ANSWER-COUNT" );
    $str52$SEARCH_STRING = makeString( "SEARCH-STRING" );
    $str53$_A = makeString( "~A" );
    $kw54$OR = makeKeyword( "OR" );
    $kw55$AND = makeKeyword( "AND" );
    $sym56$NULL = makeSymbol( "NULL" );
    $str57$_ = makeString( "\"" );
    $const58$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym59$QUA_GENERATE_PHRASE = makeSymbol( "QUA-GENERATE-PHRASE" );
    $kw60$NONE = makeKeyword( "NONE" );
    $list61 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) );
    $sym62$AQ_TERM = makeSymbol( "AQ-TERM" );
    $sym63$AQ_TERM_P = makeSymbol( "AQ-TERM-P" );
    $list64 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "ORIGINAL-STRING" ), makeSymbol( "RAW-MEANINGS" ), makeSymbol( "POSSIBLE-MEANINGS" ), makeSymbol( "DISFAVORED-MEANINGS" ), makeSymbol(
        "POSITIVE-STRINGS" ), makeSymbol( "POSITIVE-TERMS-IN-UPWARD-CLOSURE" ), makeSymbol( "POSITIVE-STRINGS-STALE?" ), makeSymbol( "NEGATIVE-STRINGS" ), makeSymbol( "NEGATIVE-TERMS-IN-UPWARD-CLOSURE" ), makeSymbol(
            "NEGATIVE-STRINGS-STALE?" )
    } );
    $list65 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "ORIGINAL-STRING" ), makeKeyword( "RAW-MEANINGS" ), makeKeyword( "POSSIBLE-MEANINGS" ), makeKeyword( "DISFAVORED-MEANINGS" ),
      makeKeyword( "POSITIVE-STRINGS" ), makeKeyword( "POSITIVE-TERMS-IN-UPWARD-CLOSURE" ), makeKeyword( "POSITIVE-STRINGS-STALE?" ), makeKeyword( "NEGATIVE-STRINGS" ), makeKeyword( "NEGATIVE-TERMS-IN-UPWARD-CLOSURE" ),
      makeKeyword( "NEGATIVE-STRINGS-STALE?" )
    } );
    $list66 = ConsesLow.list( new SubLObject[] { makeSymbol( "AQ-TERM-ID" ), makeSymbol( "AQ-TERM-ORIGINAL-STRING" ), makeSymbol( "AQ-TERM-RAW-MEANINGS" ), makeSymbol( "AQ-TERM-POSSIBLE-MEANINGS" ), makeSymbol(
        "AQ-TERM-DISFAVORED-MEANINGS" ), makeSymbol( "AQ-TERM-POSITIVE-STRINGS" ), makeSymbol( "AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE" ), makeSymbol( "AQ-TERM-POSITIVE-STRINGS-STALE?" ), makeSymbol(
            "AQ-TERM-NEGATIVE-STRINGS" ), makeSymbol( "AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE" ), makeSymbol( "AQ-TERM-NEGATIVE-STRINGS-STALE?" )
    } );
    $list67 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-AQ-TERM-ID" ), makeSymbol( "_CSETF-AQ-TERM-ORIGINAL-STRING" ), makeSymbol( "_CSETF-AQ-TERM-RAW-MEANINGS" ), makeSymbol(
        "_CSETF-AQ-TERM-POSSIBLE-MEANINGS" ), makeSymbol( "_CSETF-AQ-TERM-DISFAVORED-MEANINGS" ), makeSymbol( "_CSETF-AQ-TERM-POSITIVE-STRINGS" ), makeSymbol( "_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE" ),
      makeSymbol( "_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?" ), makeSymbol( "_CSETF-AQ-TERM-NEGATIVE-STRINGS" ), makeSymbol( "_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE" ), makeSymbol(
          "_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?" )
    } );
    $sym68$PRINT_AQ_TERM = makeSymbol( "PRINT-AQ-TERM" );
    $sym69$AQ_TERM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "AQ-TERM-PRINT-FUNCTION-TRAMPOLINE" );
    $list70 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "AQ-TERM-P" ) );
    $sym71$AQ_TERM_ID = makeSymbol( "AQ-TERM-ID" );
    $sym72$_CSETF_AQ_TERM_ID = makeSymbol( "_CSETF-AQ-TERM-ID" );
    $sym73$AQ_TERM_ORIGINAL_STRING = makeSymbol( "AQ-TERM-ORIGINAL-STRING" );
    $sym74$_CSETF_AQ_TERM_ORIGINAL_STRING = makeSymbol( "_CSETF-AQ-TERM-ORIGINAL-STRING" );
    $sym75$AQ_TERM_RAW_MEANINGS = makeSymbol( "AQ-TERM-RAW-MEANINGS" );
    $sym76$_CSETF_AQ_TERM_RAW_MEANINGS = makeSymbol( "_CSETF-AQ-TERM-RAW-MEANINGS" );
    $sym77$AQ_TERM_POSSIBLE_MEANINGS = makeSymbol( "AQ-TERM-POSSIBLE-MEANINGS" );
    $sym78$_CSETF_AQ_TERM_POSSIBLE_MEANINGS = makeSymbol( "_CSETF-AQ-TERM-POSSIBLE-MEANINGS" );
    $sym79$AQ_TERM_DISFAVORED_MEANINGS = makeSymbol( "AQ-TERM-DISFAVORED-MEANINGS" );
    $sym80$_CSETF_AQ_TERM_DISFAVORED_MEANINGS = makeSymbol( "_CSETF-AQ-TERM-DISFAVORED-MEANINGS" );
    $sym81$AQ_TERM_POSITIVE_STRINGS = makeSymbol( "AQ-TERM-POSITIVE-STRINGS" );
    $sym82$_CSETF_AQ_TERM_POSITIVE_STRINGS = makeSymbol( "_CSETF-AQ-TERM-POSITIVE-STRINGS" );
    $sym83$AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol( "AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE" );
    $sym84$_CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol( "_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE" );
    $sym85$AQ_TERM_POSITIVE_STRINGS_STALE_ = makeSymbol( "AQ-TERM-POSITIVE-STRINGS-STALE?" );
    $sym86$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_ = makeSymbol( "_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?" );
    $sym87$AQ_TERM_NEGATIVE_STRINGS = makeSymbol( "AQ-TERM-NEGATIVE-STRINGS" );
    $sym88$_CSETF_AQ_TERM_NEGATIVE_STRINGS = makeSymbol( "_CSETF-AQ-TERM-NEGATIVE-STRINGS" );
    $sym89$AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol( "AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE" );
    $sym90$_CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol( "_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE" );
    $sym91$AQ_TERM_NEGATIVE_STRINGS_STALE_ = makeSymbol( "AQ-TERM-NEGATIVE-STRINGS-STALE?" );
    $sym92$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_ = makeSymbol( "_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?" );
    $kw93$ORIGINAL_STRING = makeKeyword( "ORIGINAL-STRING" );
    $kw94$RAW_MEANINGS = makeKeyword( "RAW-MEANINGS" );
    $kw95$POSSIBLE_MEANINGS = makeKeyword( "POSSIBLE-MEANINGS" );
    $kw96$DISFAVORED_MEANINGS = makeKeyword( "DISFAVORED-MEANINGS" );
    $kw97$POSITIVE_STRINGS = makeKeyword( "POSITIVE-STRINGS" );
    $kw98$POSITIVE_TERMS_IN_UPWARD_CLOSURE = makeKeyword( "POSITIVE-TERMS-IN-UPWARD-CLOSURE" );
    $kw99$POSITIVE_STRINGS_STALE_ = makeKeyword( "POSITIVE-STRINGS-STALE?" );
    $kw100$NEGATIVE_STRINGS = makeKeyword( "NEGATIVE-STRINGS" );
    $kw101$NEGATIVE_TERMS_IN_UPWARD_CLOSURE = makeKeyword( "NEGATIVE-TERMS-IN-UPWARD-CLOSURE" );
    $kw102$NEGATIVE_STRINGS_STALE_ = makeKeyword( "NEGATIVE-STRINGS-STALE?" );
    $sym103$MAKE_AQ_TERM = makeSymbol( "MAKE-AQ-TERM" );
    $sym104$VISIT_DEFSTRUCT_OBJECT_AQ_TERM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-AQ-TERM-METHOD" );
    $str105$_aq_token___S__S__S_ = makeString( "<aq-token: ~S ~S ~S>" );
    $sym106$LEARN = makeSymbol( "LEARN" );
    $sym107$LEXIFY_SENTENCE = makeSymbol( "LEXIFY-SENTENCE" );
    $sym108$GET = makeSymbol( "GET" );
    $kw109$CYC_POS = makeKeyword( "CYC-POS" );
    $const110$ClosedClassWord = constant_handles.reader_make_constant_shell( makeString( "ClosedClassWord" ) );
    $const111$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $kw112$DENOT = makeKeyword( "DENOT" );
    $const113$parsingConflateTo = constant_handles.reader_make_constant_shell( makeString( "parsingConflateTo" ) );
    $const114$qaConflateTo = constant_handles.reader_make_constant_shell( makeString( "qaConflateTo" ) );
    $const115$qaConflateToCompletely = constant_handles.reader_make_constant_shell( makeString( "qaConflateToCompletely" ) );
    $sym116$_PREFERRED = makeSymbol( "?PREFERRED" );
    $list117 = ConsesLow.list( makeSymbol( "?PREFERRED" ) );
    $sym118$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const119$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym120$QUA_FILTER_TERM_ = makeSymbol( "QUA-FILTER-TERM?" );
    $sym121$_QUA_FILTER_TERM__CACHING_STATE_ = makeSymbol( "*QUA-FILTER-TERM?-CACHING-STATE*" );
    $int122$5000 = makeInteger( 5000 );
    $const123$qaIrrelevantTerm = constant_handles.reader_make_constant_shell( makeString( "qaIrrelevantTerm" ) );
    $sym124$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $sym125$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym126$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym127$QUA_EXPANSION_CYCLS = makeSymbol( "QUA-EXPANSION-CYCLS" );
    $sym128$_QUA_EXPANSION_CYCLS_CACHING_STATE_ = makeSymbol( "*QUA-EXPANSION-CYCLS-CACHING-STATE*" );
    $int129$100 = makeInteger( 100 );
    $int130$30 = makeInteger( 30 );
    $sym131$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $sym132$WEB_CONCEPTUALLY_RELATED = makeSymbol( "WEB-CONCEPTUALLY-RELATED" );
    $kw133$RELATED = makeKeyword( "RELATED" );
    $const134$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const135$webConceptuallyRelated = constant_handles.reader_make_constant_shell( makeString( "webConceptuallyRelated" ) );
    $list136 = ConsesLow.list( makeKeyword( "RELATED" ) );
    $list137 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), makeInteger( 30 ), makeKeyword( "MAX-TIME" ), makeInteger( 30 ) );
    $sym138$_WEB_CONCEPTUALLY_RELATED_CACHING_STATE_ = makeSymbol( "*WEB-CONCEPTUALLY-RELATED-CACHING-STATE*" );
    $sym139$_INST = makeSymbol( "?INST" );
    $const140$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const141$EnglishLexiconMt = constant_handles.reader_make_constant_shell( makeString( "EnglishLexiconMt" ) );
    $const142$verbFormWithAuxiliary = constant_handles.reader_make_constant_shell( makeString( "verbFormWithAuxiliary" ) );
    $list143 = ConsesLow.list( makeSymbol( "NL-GENERATION-CACHE-METHOD" ) );
    $sym144$_QUA_GENERATE_PHRASE_CACHING_STATE_ = makeSymbol( "*QUA-GENERATE-PHRASE-CACHING-STATE*" );
    $int145$500 = makeInteger( 500 );
    $sym146$QUA_ALL_PHRASES_FOR_TERM = makeSymbol( "QUA-ALL-PHRASES-FOR-TERM" );
    $list147 = ConsesLow.list( makeKeyword( "ACRONYMS" ) );
    $sym148$_QUA_ALL_PHRASES_FOR_TERM_CACHING_STATE_ = makeSymbol( "*QUA-ALL-PHRASES-FOR-TERM-CACHING-STATE*" );
    $str149$__ = makeString( ", " );
    $sym150$STRINGP = makeSymbol( "STRINGP" );
    $const151$QAClarifyingCollectionType = constant_handles.reader_make_constant_shell( makeString( "QAClarifyingCollectionType" ) );
    $int152$400000 = makeInteger( 400000 );
    $sym153$QUA_TERM_FROM_SENTENCE_ = makeSymbol( "QUA-TERM-FROM-SENTENCE?" );
    $const154$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $str155$Pushing__S_because_it_is_not_a_ge = makeString( "Pushing ~S because it is not a general term (~A) or pred with no nominal lexes (~A).~%" );
    $str156$This_term_is_a_naut___A__ = makeString( "This term is a naut: ~A~%" );
    $const157$SearchStringInappropriateFunction = constant_handles.reader_make_constant_shell( makeString( "SearchStringInappropriateFunction" ) );
    $str158$Either_the_term_is_not_lexified_o = makeString( "Either the term is not lexified or the functor is inappropriate for a search string: ~A~%" );
    $str159$Recursing_on__A__ = makeString( "Recursing on ~A~%" );
    $const160$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const161$termPhrases = constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) );
    $list162 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) ), makeSymbol( "?X" ) );
    $list163 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeSymbol( "?X" ) );
    $sym164$QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE = makeSymbol( "QUA-SEARCHABLE-TERMS-FROM-CYCL-SENTENCE" );
    $kw165$TEST = makeKeyword( "TEST" );
    $sym166$SETS_EQUALP = makeSymbol( "SETS-EQUALP" );
    $kw167$OWNER = makeKeyword( "OWNER" );
    $kw168$CLASSES = makeKeyword( "CLASSES" );
    $kw169$KB = makeKeyword( "KB" );
    $kw170$FULL = makeKeyword( "FULL" );
    $kw171$WORKING_ = makeKeyword( "WORKING?" );
    $list172 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "GeorgeWBush" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "Person" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                makeString( "Dog" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Dog" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "MotherFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ChelseaClinton" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "ChelseaClinton" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2006 ) ) ), ConsesLow
                            .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2006 ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "Cat" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "Dog" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Cat" ) ), constant_handles.reader_make_constant_shell( makeString( "Dog" ) ) ) ), ConsesLow
                                        .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Dog" ) ) ) ) ), ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "Dog" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                    makeString( "TheSetOf" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Cat" ) ) ), ConsesLow.list(
                                                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                "Dog" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Cat" ) ), constant_handles.reader_make_constant_shell(
                                                                    makeString( "Dog" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                        "CollectionSubsetFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CriminalOrganization" ) ), ConsesLow.list( constant_handles
                                                                            .reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                makeString( "residenceOfOrganization" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                    "Russia" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CriminalOrganization" ) ),
                                                                                        constant_handles.reader_make_constant_shell( makeString( "Russia" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                            constant_handles.reader_make_constant_shell( makeString( "PlusAll" ) ), ConsesLow.list( constant_handles
                                                                                                .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                    makeString( "Kilogram" ) ), FOUR_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                        "Kilogram" ) ), NINE_INTEGER ) ), constant_handles.reader_make_constant_shell( makeString( "SquareRootFn" ) ) ) ),
                                                                                            ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Kilogram" ) ), FOUR_INTEGER ),
                                                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Kilogram" ) ), NINE_INTEGER ) ) ), ConsesLow.list(
                                                                                                    ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) ),
                                                                                                        constant_handles.reader_make_constant_shell( makeString( "CarBombing" ) ), ConsesLow.list( constant_handles
                                                                                                            .reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "eventOccursAt" ) ), makeSymbol( "?X" ), constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "Iraq" ) ) ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "CarBombing" ) ), constant_handles
                                                                                                                            .reader_make_constant_shell( makeString( "eventOccursAt" ) ), constant_handles
                                                                                                                                .reader_make_constant_shell( makeString( "Iraq" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                        "FunctionToArg" ) ), TWO_INTEGER, constant_handles.reader_make_constant_shell(
                                                                                                                                            makeString( "eventOccursAt" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                .reader_make_constant_shell( makeString( "eventOccursAt" ) ) ) )
    } );
    $kw173$STRING = makeKeyword( "STRING" );
    $kw174$INTERP = makeKeyword( "INTERP" );
    $kw175$INTERP_CFASL = makeKeyword( "INTERP-CFASL" );
    $kw176$INTERP_GENERATION = makeKeyword( "INTERP-GENERATION" );
  }

  public static final class $augmented_query_native
      extends
        SubLStructNative
  {
    public SubLObject $original_phrase;
    public SubLObject $id;
    public SubLObject $tokenizations;
    public SubLObject $query_string;
    public SubLObject $query_string_staleP;
    public SubLObject $search_engine;
    private static final SubLStructDeclNative structDecl;

    public $augmented_query_native()
    {
      this.$original_phrase = NIL;
      this.$id = NIL;
      this.$tokenizations = NIL;
      this.$query_string = NIL;
      this.$query_string_staleP = NIL;
      this.$search_engine = NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $augmented_query_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$original_phrase;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$tokenizations;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$query_string;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$query_string_staleP;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$search_engine;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$original_phrase = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$tokenizations = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$query_string = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$query_string_staleP = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$search_engine = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $augmented_query_native.class, $sym12$AUGMENTED_QUERY, $sym13$AUGMENTED_QUERY_P, $list14, $list15, new String[] { "$original_phrase", "$id", "$tokenizations",
        "$query_string", "$query_string_staleP", "$search_engine"
      }, $list16, $list17, $sym18$PRINT_AUGMENTED_QUERY );
    }
  }

  public static final class $augmented_query_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $augmented_query_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AUGMENTED-QUERY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return augmented_query_p( arg1 );
    }
  }

  public static final class $aq_term_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $original_string;
    public SubLObject $raw_meanings;
    public SubLObject $possible_meanings;
    public SubLObject $disfavored_meanings;
    public SubLObject $positive_strings;
    public SubLObject $positive_terms_in_upward_closure;
    public SubLObject $positive_strings_staleP;
    public SubLObject $negative_strings;
    public SubLObject $negative_terms_in_upward_closure;
    public SubLObject $negative_strings_staleP;
    private static final SubLStructDeclNative structDecl;

    public $aq_term_native()
    {
      this.$id = NIL;
      this.$original_string = NIL;
      this.$raw_meanings = NIL;
      this.$possible_meanings = NIL;
      this.$disfavored_meanings = NIL;
      this.$positive_strings = NIL;
      this.$positive_terms_in_upward_closure = NIL;
      this.$positive_strings_staleP = NIL;
      this.$negative_strings = NIL;
      this.$negative_terms_in_upward_closure = NIL;
      this.$negative_strings_staleP = NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $aq_term_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$original_string;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$raw_meanings;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$possible_meanings;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$disfavored_meanings;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$positive_strings;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$positive_terms_in_upward_closure;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$positive_strings_staleP;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$negative_strings;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$negative_terms_in_upward_closure;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$negative_strings_staleP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$original_string = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$raw_meanings = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$possible_meanings = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$disfavored_meanings = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$positive_strings = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$positive_terms_in_upward_closure = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$positive_strings_staleP = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$negative_strings = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$negative_terms_in_upward_closure = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$negative_strings_staleP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $aq_term_native.class, $sym62$AQ_TERM, $sym63$AQ_TERM_P, $list64, $list65, new String[] { "$id", "$original_string", "$raw_meanings", "$possible_meanings",
        "$disfavored_meanings", "$positive_strings", "$positive_terms_in_upward_closure", "$positive_strings_staleP", "$negative_strings", "$negative_terms_in_upward_closure", "$negative_strings_staleP"
      }, $list66, $list67, $sym68$PRINT_AQ_TERM );
    }
  }

  public static final class $aq_term_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $aq_term_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AQ-TERM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return aq_term_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 608 ms
 * 
 */