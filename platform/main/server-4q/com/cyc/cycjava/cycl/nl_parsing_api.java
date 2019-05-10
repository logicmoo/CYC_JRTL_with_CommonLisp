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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_parsing_api
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_parsing_api";
  public static final String myFingerPrint = "ab447f5b890824145bb0a89307071b6e77df70c830d018bd38a2241a8a2ed456";
  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLSymbol $dtp_tag_relations_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5182L)
  private static SubLSymbol $sentence_cyclifiers$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLSymbol $dtp_sentence_cyclifier$;
  private static final SubLSymbol $sym0$TAG_RELATIONS;
  private static final SubLSymbol $kw1$OUTPUT_SPEC;
  private static final SubLSymbol $kw2$SIMPLE;
  private static final SubLSymbol $kw3$FILTER;
  private static final SubLSymbol $kw4$SENSE_TAGGER;
  private static final SubLSymbol $kw5$SENTENCE_CYCLIFIER;
  private static final SubLSymbol $sym6$LINK_CYCLIFIER;
  private static final SubLSymbol $kw7$DOMAIN_MT;
  private static final SubLSymbol $sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P;
  private static final SubLSymbol $sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT;
  private static final SubLSymbol $sym10$TAG_RELATIONS_OPTIONAL_ARGS_P;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$TAG_RELATIONS_ITERATOR_STATE;
  private static final SubLSymbol $sym13$TAG_RELATIONS_ITERATOR_STATE_P;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym19$TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR;
  private static final SubLSymbol $sym22$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR;
  private static final SubLSymbol $sym23$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER;
  private static final SubLSymbol $sym24$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER;
  private static final SubLSymbol $sym25$TAG_RELATIONS_ITERATOR_STATE_DOCUMENT;
  private static final SubLSymbol $sym26$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT;
  private static final SubLSymbol $sym27$TAG_RELATIONS_ITERATOR_STATE_LEXICON;
  private static final SubLSymbol $sym28$_CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON;
  private static final SubLSymbol $sym29$TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER;
  private static final SubLSymbol $sym30$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER;
  private static final SubLSymbol $sym31$TAG_RELATIONS_ITERATOR_STATE_TIMEOUT;
  private static final SubLSymbol $sym32$_CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT;
  private static final SubLSymbol $sym33$TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT;
  private static final SubLSymbol $sym34$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT;
  private static final SubLSymbol $sym35$TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC;
  private static final SubLSymbol $sym36$_CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC;
  private static final SubLSymbol $sym37$TAG_RELATIONS_ITERATOR_STATE_FILTER;
  private static final SubLSymbol $sym38$_CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER;
  private static final SubLSymbol $sym39$TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT;
  private static final SubLSymbol $sym40$_CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT;
  private static final SubLSymbol $kw41$SENTENCE_ITERATOR;
  private static final SubLSymbol $kw42$DOCUMENT;
  private static final SubLSymbol $kw43$LEXICON;
  private static final SubLSymbol $kw44$TIMEOUT;
  private static final SubLSymbol $kw45$PREPARED_SENTENCE_OUTPUT;
  private static final SubLString $str46$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw47$BEGIN;
  private static final SubLSymbol $sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE;
  private static final SubLSymbol $kw49$SLOT;
  private static final SubLSymbol $kw50$END;
  private static final SubLSymbol $sym51$VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD;
  private static final SubLSymbol $sym52$LEARN;
  private static final SubLSymbol $sym53$SENTENCE_CYCLIFIER;
  private static final SubLSymbol $sym54$SENTENCE_CYCLIFIER_P;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$PRINT_SENTENCE_CYCLIFIER;
  private static final SubLSymbol $sym60$SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$SENTENCE_CYCLIFIER_NAME;
  private static final SubLSymbol $sym63$_CSETF_SENTENCE_CYCLIFIER_NAME;
  private static final SubLSymbol $sym64$SENTENCE_CYCLIFIER_CYCLIFY_METHOD;
  private static final SubLSymbol $sym65$_CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD;
  private static final SubLSymbol $sym66$SENTENCE_CYCLIFIER_LEXICON_METHOD;
  private static final SubLSymbol $sym67$_CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD;
  private static final SubLSymbol $kw68$NAME;
  private static final SubLSymbol $kw69$CYCLIFY_METHOD;
  private static final SubLSymbol $kw70$LEXICON_METHOD;
  private static final SubLSymbol $sym71$MAKE_SENTENCE_CYCLIFIER;
  private static final SubLSymbol $sym72$VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD;
  private static final SubLString $str73$__Cyclifier___A_;
  private static final SubLString $str74$_S_is_not_a_registered_cyclifier_;
  private static final SubLString $str75$_;
  private static final SubLSymbol $kw76$CYCL;
  private static final SubLSymbol $kw77$WEIGHT;
  private static final SubLSymbol $kw78$JUSTIFICATION;
  private static final SubLSymbol $sym79$EBMT_CYCLIFIER;
  private static final SubLSymbol $sym80$NEW_SEMTRANS_LEXICON;
  private static final SubLSymbol $kw81$PARSER;
  private static final SubLSymbol $sym82$STANFORD_CYCLIFIER;
  private static final SubLSymbol $sym83$NEW_CYCLIFIER_LEXICON;
  private static final SubLSymbol $sym84$API_CYCLIFIER_DONE_;
  private static final SubLSymbol $sym85$API_CYCLIFIER_GET_NEXT;
  private static final SubLSymbol $kw86$CYCLIFIER;
  private static final SubLSymbol $sym87$HAS_NEXT_;
  private static final SubLSymbol $sym88$NEXT;
  private static final SubLSymbol $sym89$DIRECTORY_P;
  private static final SubLString $str90$cdolist;
  private static final SubLString $str91$table;
  private static final SubLList $list92;
  private static final SubLString $str93$CycL___S__;
  private static final SubLSymbol $sym94$STRING_PHRASAL_MEANINGS;
  private static final SubLSymbol $sym95$STRINGP;
  private static final SubLSymbol $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P;
  private static final SubLSymbol $sym97$STRING_PHRASAL_MEANINGS_ITERATOR;
  private static final SubLSymbol $kw98$STRING;
  private static final SubLSymbol $sym99$PHRASAL_MEANINGS;
  private static final SubLSymbol $sym100$PHRASE_P;
  private static final SubLSymbol $sym101$PHRASAL_MEANINGS_ITERATOR;
  private static final SubLSymbol $kw102$SUBL;
  private static final SubLSymbol $kw103$LEARNERS;
  private static final SubLList $list104;
  private static final SubLSymbol $kw105$SYNTACTIC_RESTRICTION;
  private static final SubLSymbol $kw106$PHRASE_CYCLIFIER;
  private static final SubLSymbol $sym107$LEXICAL_PHRASE_CYCLIFIER;
  private static final SubLList $list108;
  private static final SubLSymbol $kw109$DEFAULT;
  private static final SubLSymbol $sym110$NL_INTERP_TO_XML;
  private static final SubLSymbol $sym111$GET;
  private static final SubLSymbol $sym112$PREDICATE_P;
  private static final SubLSymbol $sym113$SPEECH_PART_;
  private static final SubLSymbol $kw114$PREDICATE;
  private static final SubLSymbol $kw115$INFLECTIONS;
  private static final SubLSymbol $kw116$CYC_POS;
  private static final SubLSymbol $sym117$GET_NL_INTERP_CYCL;
  private static final SubLSymbol $sym118$STRING_PHRASAL_MEANINGS_TEST;
  private static final SubLSymbol $kw119$TEST;
  private static final SubLSymbol $sym120$SETS_EQUAL_EQUAL_;
  private static final SubLSymbol $kw121$OWNER;
  private static final SubLSymbol $kw122$CLASSES;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$KB;
  private static final SubLSymbol $kw125$FULL;
  private static final SubLSymbol $kw126$WORKING_;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$STRING_PHRASAL_MEANINGS_WITH_ARGS;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES;
  private static final SubLList $list135;

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 927L)
  public static SubLObject tag_relations(final SubLObject v_document, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    optional_arg_plist = list_utilities.augment_plist_with_defaults( optional_arg_plist, ConsesLow.list( new SubLObject[] { $kw1$OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec( $kw2$SIMPLE, nl_api_datastructures
        .new_nl_interpretation_spec( UNPROVIDED ) ), $kw3$FILTER, NIL, $kw4$SENSE_TAGGER, NIL, $kw5$SENTENCE_CYCLIFIER, $sym6$LINK_CYCLIFIER, $kw7$DOMAIN_MT, default_relation_tagging_domain_mt()
    } ) );
    final SubLObject result_iter = iteration.new_iterator( new_tag_relations_iterator_state( v_document, optional_arg_plist ), $sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P, $sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT,
        UNPROVIDED );
    return result_iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 1627L)
  public static SubLObject tag_relations_optional_args_p(final SubLObject obj)
  {
    return list_utilities.plist_restricted_to_indicatorsP( obj, $list11 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $tag_relations_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_sentence_iterator(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_document(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_lexicon(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_sense_tagger(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_timeout(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_domain_mt(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_output_spec(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_filter(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_sentence_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_document(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_lexicon(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_timeout(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_domain_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_output_spec(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_filter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject _csetf_tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_relations_iterator_state_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject make_tag_relations_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $tag_relations_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw41$SENTENCE_ITERATOR ) )
      {
        _csetf_tag_relations_iterator_state_sentence_iterator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw5$SENTENCE_CYCLIFIER ) )
      {
        _csetf_tag_relations_iterator_state_sentence_cyclifier( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$DOCUMENT ) )
      {
        _csetf_tag_relations_iterator_state_document( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$LEXICON ) )
      {
        _csetf_tag_relations_iterator_state_lexicon( v_new, current_value );
      }
      else if( pcase_var.eql( $kw4$SENSE_TAGGER ) )
      {
        _csetf_tag_relations_iterator_state_sense_tagger( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$TIMEOUT ) )
      {
        _csetf_tag_relations_iterator_state_timeout( v_new, current_value );
      }
      else if( pcase_var.eql( $kw7$DOMAIN_MT ) )
      {
        _csetf_tag_relations_iterator_state_domain_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw1$OUTPUT_SPEC ) )
      {
        _csetf_tag_relations_iterator_state_output_spec( v_new, current_value );
      }
      else if( pcase_var.eql( $kw3$FILTER ) )
      {
        _csetf_tag_relations_iterator_state_filter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$PREPARED_SENTENCE_OUTPUT ) )
      {
        _csetf_tag_relations_iterator_state_prepared_sentence_output( v_new, current_value );
      }
      else
      {
        Errors.error( $str46$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject visit_defstruct_tag_relations_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw47$BEGIN, $sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE, TEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw41$SENTENCE_ITERATOR, tag_relations_iterator_state_sentence_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw5$SENTENCE_CYCLIFIER, tag_relations_iterator_state_sentence_cyclifier( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw42$DOCUMENT, tag_relations_iterator_state_document( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw43$LEXICON, tag_relations_iterator_state_lexicon( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw4$SENSE_TAGGER, tag_relations_iterator_state_sense_tagger( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw44$TIMEOUT, tag_relations_iterator_state_timeout( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw7$DOMAIN_MT, tag_relations_iterator_state_domain_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw1$OUTPUT_SPEC, tag_relations_iterator_state_output_spec( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw3$FILTER, tag_relations_iterator_state_filter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw45$PREPARED_SENTENCE_OUTPUT, tag_relations_iterator_state_prepared_sentence_output( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$END, $sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE, TEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
  public static SubLObject visit_defstruct_object_tag_relations_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_tag_relations_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2296L)
  public static SubLObject new_tag_relations_iterator_state(final SubLObject v_document, final SubLObject optional_arg_plist)
  {
    final SubLObject iter = make_tag_relations_iterator_state( UNPROVIDED );
    _csetf_tag_relations_iterator_state_sentence_iterator( iter, document.new_sentence_iterator( v_document ) );
    _csetf_tag_relations_iterator_state_document( iter, v_document );
    _csetf_tag_relations_iterator_state_sentence_cyclifier( iter, conses_high.getf( optional_arg_plist, $kw5$SENTENCE_CYCLIFIER, UNPROVIDED ) );
    _csetf_tag_relations_iterator_state_lexicon( iter, conses_high.getf( optional_arg_plist, $kw43$LEXICON, default_lexicon_for_sentence_cyclifier( conses_high.getf( optional_arg_plist, $kw5$SENTENCE_CYCLIFIER,
        UNPROVIDED ) ) ) );
    _csetf_tag_relations_iterator_state_sense_tagger( iter, conses_high.getf( optional_arg_plist, $kw4$SENSE_TAGGER, UNPROVIDED ) );
    _csetf_tag_relations_iterator_state_timeout( iter, conses_high.getf( optional_arg_plist, $kw44$TIMEOUT, UNPROVIDED ) );
    _csetf_tag_relations_iterator_state_domain_mt( iter, conses_high.getf( optional_arg_plist, $kw7$DOMAIN_MT, UNPROVIDED ) );
    _csetf_tag_relations_iterator_state_output_spec( iter, conses_high.getf( optional_arg_plist, $kw1$OUTPUT_SPEC, UNPROVIDED ) );
    _csetf_tag_relations_iterator_state_filter( iter, conses_high.getf( optional_arg_plist, $kw3$FILTER, UNPROVIDED ) );
    return iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 3377L)
  public static SubLObject tag_relations_iterator_state_done_p(final SubLObject state)
  {
    return makeBoolean( NIL != iteration.iteration_done( tag_relations_iterator_state_sentence_iterator( state ) ) && NIL == tag_relations_iterator_state_prepared_sentence_output( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 3609L)
  public static SubLObject tag_relations_iterator_state_next(final SubLObject state)
  {
    SubLObject result = NIL;
    if( NIL != tag_relations_iterator_state_prepared_sentence_output( state ) )
    {
      result = tag_relations_iterator_state_prepared_sentence_output( state ).first();
      _csetf_tag_relations_iterator_state_prepared_sentence_output( state, tag_relations_iterator_state_prepared_sentence_output( state ).rest() );
      return Values.values( result, state, NIL );
    }
    if( NIL != iteration.iteration_done( tag_relations_iterator_state_sentence_iterator( state ) ) )
    {
      return Values.values( NIL, state, T );
    }
    final SubLObject sentence = iteration.iteration_next( tag_relations_iterator_state_sentence_iterator( state ) );
    final SubLObject lexicon = tag_relations_iterator_state_lexicon( state );
    final SubLObject filter = tag_relations_iterator_state_filter( state );
    final SubLObject output_spec = tag_relations_iterator_state_output_spec( state );
    final SubLObject learned_entities = methods.funcall_instance_method_with_1_args( lexicon, $sym52$LEARN, document.sentence_string( sentence ) );
    final SubLObject v_cyclifier = tag_relations_iterator_state_sentence_cyclifier( state );
    final SubLObject discourse = NIL;
    final SubLObject domain_mt = tag_relations_iterator_state_domain_mt( state );
    final SubLObject timeout = tag_relations_iterator_state_timeout( state );
    final SubLObject sentence_result = Functions.funcall( v_cyclifier, sentence, lexicon, output_spec, domain_mt, timeout, discourse );
    _csetf_tag_relations_iterator_state_prepared_sentence_output( state, ConsesLow.cons( sentence_result, tag_relations_iterator_state_prepared_sentence_output( state ) ) );
    result = tag_relations_iterator_state_prepared_sentence_output( state ).first();
    _csetf_tag_relations_iterator_state_prepared_sentence_output( state, tag_relations_iterator_state_prepared_sentence_output( state ).rest() );
    return Values.values( result, state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject sentence_cyclifier_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_sentence_cyclifier( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject sentence_cyclifier_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sentence_cyclifier_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject sentence_cyclifier_name(final SubLObject v_object)
  {
    assert NIL != sentence_cyclifier_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject sentence_cyclifier_cyclify_method(final SubLObject v_object)
  {
    assert NIL != sentence_cyclifier_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject sentence_cyclifier_lexicon_method(final SubLObject v_object)
  {
    assert NIL != sentence_cyclifier_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject _csetf_sentence_cyclifier_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sentence_cyclifier_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject _csetf_sentence_cyclifier_cyclify_method(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sentence_cyclifier_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject _csetf_sentence_cyclifier_lexicon_method(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sentence_cyclifier_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject make_sentence_cyclifier(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sentence_cyclifier_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw68$NAME ) )
      {
        _csetf_sentence_cyclifier_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw69$CYCLIFY_METHOD ) )
      {
        _csetf_sentence_cyclifier_cyclify_method( v_new, current_value );
      }
      else if( pcase_var.eql( $kw70$LEXICON_METHOD ) )
      {
        _csetf_sentence_cyclifier_lexicon_method( v_new, current_value );
      }
      else
      {
        Errors.error( $str46$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject visit_defstruct_sentence_cyclifier(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw47$BEGIN, $sym71$MAKE_SENTENCE_CYCLIFIER, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw68$NAME, sentence_cyclifier_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw69$CYCLIFY_METHOD, sentence_cyclifier_cyclify_method( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$SLOT, $kw70$LEXICON_METHOD, sentence_cyclifier_lexicon_method( obj ) );
    Functions.funcall( visitor_fn, obj, $kw50$END, $sym71$MAKE_SENTENCE_CYCLIFIER, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
  public static SubLObject visit_defstruct_object_sentence_cyclifier_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sentence_cyclifier( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5364L)
  public static SubLObject print_sentence_cyclifier(final SubLObject v_cyclifier, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str73$__Cyclifier___A_, sentence_cyclifier_name( v_cyclifier ) );
    return v_cyclifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5554L)
  public static SubLObject declare_sentence_cyclifier(final SubLObject cyclifier_name, final SubLObject cyclify_method, SubLObject lexicon_method)
  {
    if( lexicon_method == UNPROVIDED )
    {
      lexicon_method = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_cyclifier = make_sentence_cyclifier( UNPROVIDED );
    _csetf_sentence_cyclifier_name( v_cyclifier, cyclifier_name );
    _csetf_sentence_cyclifier_cyclify_method( v_cyclifier, cyclify_method );
    _csetf_sentence_cyclifier_lexicon_method( v_cyclifier, lexicon_method );
    dictionary.dictionary_enter( $sentence_cyclifiers$.getDynamicValue( thread ), cyclifier_name, v_cyclifier );
    return v_cyclifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6006L)
  public static SubLObject sentence_cyclifier_get_cyclify_method(final SubLObject cyclifier_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_cyclifier = dictionary.dictionary_lookup( $sentence_cyclifiers$.getDynamicValue( thread ), cyclifier_name, UNPROVIDED );
    if( NIL == v_cyclifier )
    {
      Errors.error( $str74$_S_is_not_a_registered_cyclifier_, cyclifier_name );
    }
    return sentence_cyclifier_cyclify_method( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6300L)
  public static SubLObject sentence_cyclifier_get_lexicon_method(final SubLObject cyclifier_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_cyclifier = dictionary.dictionary_lookup( $sentence_cyclifiers$.getDynamicValue( thread ), cyclifier_name, UNPROVIDED );
    if( NIL == v_cyclifier )
    {
      Errors.error( $str74$_S_is_not_a_registered_cyclifier_, cyclifier_name );
    }
    return sentence_cyclifier_lexicon_method( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6594L)
  public static SubLObject default_lexicon_for_sentence_cyclifier(final SubLObject cyclifier_name)
  {
    return Functions.funcall( sentence_cyclifier_get_lexicon_method( cyclifier_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6743L)
  public static SubLObject default_relation_tagging_domain_mt()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6813L)
  public static SubLObject ebmt_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string = document.sentence_string( sentence );
    SubLObject nl_interps = NIL;
    if( NIL == string_utilities.substringP( $str75$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return iteration.new_list_iterator( nl_interps );
    }
    thread.resetMultipleValues();
    final SubLObject cycls = ebmt_template_parser.ebmt_parse( string, lexicon, domain_mt );
    final SubLObject justs = thread.secondMultipleValue();
    final SubLObject weights = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject cycl = NIL;
    SubLObject cycl_$1 = NIL;
    SubLObject just = NIL;
    SubLObject just_$2 = NIL;
    SubLObject weight = NIL;
    SubLObject weight_$3 = NIL;
    cycl = cycls;
    cycl_$1 = cycl.first();
    just = justs;
    just_$2 = just.first();
    weight = weights;
    weight_$3 = weight.first();
    while ( NIL != weight || NIL != just || NIL != cycl)
    {
      final SubLObject interp = nl_api_datastructures.new_nl_interpretation( ConsesLow.list( $kw76$CYCL, cycl_$1, $kw77$WEIGHT, weight_$3, $kw78$JUSTIFICATION, just_$2 ) );
      nl_interps = ConsesLow.cons( interp, nl_interps );
      cycl = cycl.rest();
      cycl_$1 = cycl.first();
      just = just.rest();
      just_$2 = just.first();
      weight = weight.rest();
      weight_$3 = weight.first();
    }
    return iteration.new_list_iterator( nl_interps );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 7512L)
  public static SubLObject stanford_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse)
  {
    final SubLObject string = document.sentence_string( sentence );
    final SubLObject v_parser = parser.new_stanford_parser( UNPROVIDED, UNPROVIDED );
    SubLObject v_properties = ConsesLow.list( $kw81$PARSER, v_parser );
    if( NIL != lexicon )
    {
      v_properties = conses_high.putf( v_properties, $kw43$LEXICON, lexicon );
    }
    return new_api_cyclifier( string, output_spec, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 7952L)
  public static SubLObject link_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse)
  {
    final SubLObject string = document.sentence_string( sentence );
    final SubLObject v_parser = parser.new_link_parser( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject v_properties = ConsesLow.list( $kw81$PARSER, v_parser );
    if( NIL != lexicon )
    {
      v_properties = conses_high.putf( v_properties, $kw43$LEXICON, lexicon );
    }
    return new_api_cyclifier( string, output_spec, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 8375L)
  public static SubLObject new_api_cyclifier(final SubLObject english, final SubLObject output_spec, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLObject cyclifier_iter = cyclifier.new_cyclifier( english, v_properties );
    return iteration.new_iterator( api_cyclifier_iterator_state( cyclifier_iter, output_spec ), $sym84$API_CYCLIFIER_DONE_, $sym85$API_CYCLIFIER_GET_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 8670L)
  public static SubLObject api_cyclifier_iterator_state(final SubLObject v_cyclifier, final SubLObject output_spec)
  {
    final SubLObject iter = ConsesLow.list( $kw86$CYCLIFIER, v_cyclifier, $kw1$OUTPUT_SPEC, output_spec );
    return iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 8825L)
  public static SubLObject api_cyclifier_doneP(final SubLObject iterator_state)
  {
    final SubLObject v_cyclifier = conses_high.getf( iterator_state, $kw86$CYCLIFIER, UNPROVIDED );
    return Values.values( makeBoolean( NIL == methods.funcall_instance_method_with_0_args( v_cyclifier, $sym87$HAS_NEXT_ ) ), iterator_state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9018L)
  public static SubLObject api_cyclifier_get_next(final SubLObject iterator_state)
  {
    final SubLObject v_cyclifier = conses_high.getf( iterator_state, $kw86$CYCLIFIER, UNPROVIDED );
    final SubLObject cycl = methods.funcall_instance_method_with_0_args( v_cyclifier, $sym88$NEXT );
    final SubLObject output_spec = conses_high.getf( iterator_state, $kw1$OUTPUT_SPEC, UNPROVIDED );
    return Values.values( nl_api_datastructures.new_nl_interpretation( ConsesLow.list( $kw76$CYCL, cycl ) ), iterator_state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9322L)
  public static SubLObject tag_directory_relations(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( directory ) : directory;
    SubLObject directory_contents_var = Filesys.directory( directory, T );
    final SubLObject progress_message_var = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$4 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str90$cdolist, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject file = NIL;
          file = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL == Filesys.directory_p( file ) )
            {
              tag_relations_from_file( file );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$4, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9607L)
  public static SubLObject tag_relations_from_files(final SubLObject file_list)
  {
    SubLObject cdolist_list_var = file_list;
    SubLObject file = NIL;
    file = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Filesys.directory_p( file ) || NIL == string_utilities.substringP( $str91$table, file, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        tag_relations_from_file( file );
      }
      cdolist_list_var = cdolist_list_var.rest();
      file = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9811L)
  public static SubLObject tag_relations_from_file(final SubLObject file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject doc = document.new_document_from_file( file, UNPROVIDED, UNPROVIDED );
    final SubLObject iter = tag_relations( doc, $list92 );
    SubLObject sentence_count = ZERO_INTEGER;
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject sentence = iteration.iteration_next( iter );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        if( sentence_count.numG( TEN_INTEGER ) )
        {
          return file;
        }
        sentence_count = Numbers.add( sentence_count, ONE_INTEGER );
        SubLObject valid_$7;
        for( SubLObject done_var_$6 = NIL; NIL == done_var_$6; done_var_$6 = makeBoolean( NIL == valid_$7 ) )
        {
          thread.resetMultipleValues();
          final SubLObject cycl = iteration.iteration_next( sentence );
          valid_$7 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid_$7 )
          {
            PrintLow.format( T, $str93$CycL___S__, cycl );
          }
        }
      }
    }
    return file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 10179L)
  public static SubLObject sentencifications_from_file(final SubLObject file, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject doc = document.new_document_from_file( file, UNPROVIDED, UNPROVIDED );
    final SubLObject sentences = document.new_sentence_iterator( doc );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject sentence = iteration.iteration_next( sentences );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        print_high.princ( document.sentence_string( sentence ), stream );
        streams_high.terpri( stream );
        streams_high.terpri( stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 10495L)
  public static SubLObject string_phrasal_meanings(final SubLObject string, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    enforceType( string, $sym95$STRINGP );
    enforceType( optional_arg_plist, $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P );
    return iteration.iterator_value_list( string_phrasal_meanings_iterator( string, optional_arg_plist ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 11016L)
  public static SubLObject string_phrasal_meanings_iterator(final SubLObject string, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    enforceType( string, $sym95$STRINGP );
    enforceType( optional_arg_plist, $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P );
    return phrasal_meanings_iterator( document.new_phrase( ConsesLow.list( $kw98$STRING, string ) ), optional_arg_plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 11526L)
  public static SubLObject phrasal_meanings(final SubLObject phrase, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    enforceType( phrase, $sym100$PHRASE_P );
    enforceType( optional_arg_plist, $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P );
    return iteration.iterator_value_list( phrasal_meanings_iterator( phrase, optional_arg_plist ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 12030L)
  public static SubLObject phrasal_meanings_iterator(final SubLObject phrase, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    enforceType( phrase, $sym100$PHRASE_P );
    enforceType( optional_arg_plist, $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P );
    optional_arg_plist = list_utilities.augment_plist_with_defaults( optional_arg_plist, ConsesLow.listS( $kw1$OUTPUT_SPEC, new SubLObject[] { nl_api_datastructures.new_nl_output_spec( $kw102$SUBL, nl_api_datastructures
        .new_nl_interpretation_spec( UNPROVIDED ) ), $kw103$LEARNERS, $list104, $kw3$FILTER, NIL, $kw105$SYNTACTIC_RESTRICTION, NIL, $kw106$PHRASE_CYCLIFIER, $sym107$LEXICAL_PHRASE_CYCLIFIER, $kw43$LEXICON, term_lexicon
            .new_case_sensitivity_preferred_term_lexicon(), $kw7$DOMAIN_MT, default_relation_tagging_domain_mt(), $list108
    } ) );
    return iteration.new_list_iterator( Functions.funcall( conses_high.getf( optional_arg_plist, $kw106$PHRASE_CYCLIFIER, UNPROVIDED ), phrase, optional_arg_plist ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 13101L)
  public static SubLObject phrasal_meanings_optional_args_p(final SubLObject obj)
  {
    return list_utilities.property_list_p( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 14225L)
  public static SubLObject lexical_phrase_cyclifier(final SubLObject phrase, final SubLObject optional_arg_plist)
  {
    final SubLObject string = document.phrase_string( phrase );
    final SubLObject lex = conses_high.getf( optional_arg_plist, $kw43$LEXICON, UNPROVIDED );
    final SubLObject domain_mt = conses_high.getf( optional_arg_plist, $kw7$DOMAIN_MT, UNPROVIDED );
    final SubLObject output_spec = conses_high.getf( optional_arg_plist, $kw1$OUTPUT_SPEC, UNPROVIDED );
    final SubLObject interp_spec = nl_api_datastructures.output_spec_interp_spec( output_spec );
    final SubLObject filter_spec = conses_high.getf( optional_arg_plist, $kw3$FILTER, $kw109$DEFAULT );
    final SubLObject learners = conses_high.getf( optional_arg_plist, $kw103$LEARNERS, UNPROVIDED );
    SubLObject result_interps = NIL;
    SubLObject final_result = NIL;
    if( NIL != learners )
    {
      methods.funcall_instance_method_with_2_args( lex, $sym52$LEARN, document.phrase_string( phrase ), learners );
    }
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( lex, $sym111$GET, string );
    SubLObject lex_entry = NIL;
    lex_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != lex_entry_passes_syntactic_restrictionP( lex_entry, conses_high.getf( optional_arg_plist, $kw105$SYNTACTIC_RESTRICTION, UNPROVIDED ) ) )
      {
        result_interps = Sequences.cconcatenate( concept_tagger.concept_tagger_extract_interpretations_from_lex_entry( ConsesLow.list( lex_entry ), interp_spec, filter_spec ), result_interps );
        if( NIL != nl_api_datastructures.xml_output_spec_p( output_spec ) )
        {
          final_result = Mapping.mapcar( $sym110$NL_INTERP_TO_XML, result_interps );
        }
        else
        {
          final_result = result_interps;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex_entry = cdolist_list_var.first();
    }
    return final_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15260L)
  public static SubLObject lex_entry_passes_syntactic_restrictionP(final SubLObject lex_entry, final SubLObject restriction)
  {
    final SubLObject allowed_preds = list_utilities.remove_if_not( $sym112$PREDICATE_P, restriction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject allowed_poses = list_utilities.remove_if_not( $sym113$SPEECH_PART_, restriction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == allowed_preds && NIL == allowed_poses )
    {
      return T;
    }
    if( NIL != allowed_preds )
    {
      SubLObject cdolist_list_var = allowed_preds;
      SubLObject allowed_pred = NIL;
      allowed_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$8 = ConsesLow.cons( methods.funcall_instance_method_with_1_args( lex_entry, $sym111$GET, $kw114$PREDICATE ), methods.funcall_instance_method_with_1_args( lex_entry, $sym111$GET,
            $kw115$INFLECTIONS ) );
        SubLObject known_pred = NIL;
        known_pred = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          if( NIL != lexicon_accessors.genl_pos_predP( known_pred, allowed_pred, UNPROVIDED ) )
          {
            return T;
          }
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          known_pred = cdolist_list_var_$8.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        allowed_pred = cdolist_list_var.first();
      }
    }
    if( NIL != allowed_poses )
    {
      SubLObject cdolist_list_var = allowed_poses;
      SubLObject allowed_pos = NIL;
      allowed_pos = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != lexicon_accessors.genl_posP( methods.funcall_instance_method_with_1_args( lex_entry, $sym111$GET, $kw116$CYC_POS ), allowed_pos, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        allowed_pos = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
  public static SubLObject string_phrasal_meanings_test(final SubLObject string, SubLObject optional_args)
  {
    if( optional_args == UNPROVIDED )
    {
      optional_args = NIL;
    }
    return Mapping.mapcar( $sym117$GET_NL_INTERP_CYCL, string_phrasal_meanings( string, optional_args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
  public static SubLObject string_phrasal_meanings_with_args(final SubLObject string, SubLObject optional_args)
  {
    if( optional_args == UNPROVIDED )
    {
      optional_args = NIL;
    }
    return string_phrasal_meanings( string, Eval.eval( optional_args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
  public static SubLObject string_phrasal_meanings_with_args_non_working_cases(final SubLObject string, SubLObject optional_args)
  {
    if( optional_args == UNPROVIDED )
    {
      optional_args = NIL;
    }
    return string_phrasal_meanings_with_args( string, optional_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
  public static SubLObject string_phrasal_meanings_with_adhoc_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args)
  {
    if( optional_args == UNPROVIDED )
    {
      optional_args = NIL;
    }
    optional_args = conses_high.putf( optional_args, $kw3$FILTER, concept_filter.new_adhoc_concept_filter_spec( filter_type, UNPROVIDED ) );
    return string_phrasal_meanings_test( string, optional_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
  public static SubLObject string_phrasal_meanings_with_adhoc_genls_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args)
  {
    if( optional_args == UNPROVIDED )
    {
      optional_args = NIL;
    }
    optional_args = conses_high.putf( optional_args, $kw3$FILTER, concept_filter.new_adhoc_genls_concept_filter_spec( filter_type, UNPROVIDED ) );
    return string_phrasal_meanings_test( string, optional_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
  public static SubLObject string_phrasal_meanings_with_adhoc_isa_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args)
  {
    if( optional_args == UNPROVIDED )
    {
      optional_args = NIL;
    }
    optional_args = conses_high.putf( optional_args, $kw3$FILTER, concept_filter.new_adhoc_isa_concept_filter_spec( filter_type, UNPROVIDED ) );
    return string_phrasal_meanings_test( string, optional_args );
  }

  public static SubLObject declare_nl_parsing_api_file()
  {
    SubLFiles.declareFunction( me, "tag_relations", "TAG-RELATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "tag_relations_optional_args_p", "TAG-RELATIONS-OPTIONAL-ARGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_print_function_trampoline", "TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_p", "TAG-RELATIONS-ITERATOR-STATE-P", 1, 0, false );
    new $tag_relations_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_sentence_iterator", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_sentence_cyclifier", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_document", "TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_lexicon", "TAG-RELATIONS-ITERATOR-STATE-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_sense_tagger", "TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_timeout", "TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_domain_mt", "TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_output_spec", "TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_filter", "TAG-RELATIONS-ITERATOR-STATE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_prepared_sentence_output", "TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_sentence_iterator", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_sentence_cyclifier", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_document", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_lexicon", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_sense_tagger", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_timeout", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_domain_mt", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_output_spec", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_filter", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_relations_iterator_state_prepared_sentence_output", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_tag_relations_iterator_state", "MAKE-TAG-RELATIONS-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_tag_relations_iterator_state", "VISIT-DEFSTRUCT-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_tag_relations_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_tag_relations_iterator_state", "NEW-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_done_p", "TAG-RELATIONS-ITERATOR-STATE-DONE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_iterator_state_next", "TAG-RELATIONS-ITERATOR-STATE-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_cyclifier_print_function_trampoline", "SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_cyclifier_p", "SENTENCE-CYCLIFIER-P", 1, 0, false );
    new $sentence_cyclifier_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sentence_cyclifier_name", "SENTENCE-CYCLIFIER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_cyclifier_cyclify_method", "SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_cyclifier_lexicon_method", "SENTENCE-CYCLIFIER-LEXICON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sentence_cyclifier_name", "_CSETF-SENTENCE-CYCLIFIER-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sentence_cyclifier_cyclify_method", "_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sentence_cyclifier_lexicon_method", "_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sentence_cyclifier", "MAKE-SENTENCE-CYCLIFIER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sentence_cyclifier", "VISIT-DEFSTRUCT-SENTENCE-CYCLIFIER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sentence_cyclifier_method", "VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_sentence_cyclifier", "PRINT-SENTENCE-CYCLIFIER", 1, 2, false );
    SubLFiles.declareFunction( me, "declare_sentence_cyclifier", "DECLARE-SENTENCE-CYCLIFIER", 2, 1, false );
    SubLFiles.declareFunction( me, "sentence_cyclifier_get_cyclify_method", "SENTENCE-CYCLIFIER-GET-CYCLIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_cyclifier_get_lexicon_method", "SENTENCE-CYCLIFIER-GET-LEXICON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "default_lexicon_for_sentence_cyclifier", "DEFAULT-LEXICON-FOR-SENTENCE-CYCLIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "default_relation_tagging_domain_mt", "DEFAULT-RELATION-TAGGING-DOMAIN-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cyclifier", "EBMT-CYCLIFIER", 6, 0, false );
    SubLFiles.declareFunction( me, "stanford_cyclifier", "STANFORD-CYCLIFIER", 6, 0, false );
    SubLFiles.declareFunction( me, "link_cyclifier", "LINK-CYCLIFIER", 6, 0, false );
    SubLFiles.declareFunction( me, "new_api_cyclifier", "NEW-API-CYCLIFIER", 2, 1, false );
    SubLFiles.declareFunction( me, "api_cyclifier_iterator_state", "API-CYCLIFIER-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "api_cyclifier_doneP", "API-CYCLIFIER-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "api_cyclifier_get_next", "API-CYCLIFIER-GET-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_directory_relations", "TAG-DIRECTORY-RELATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_from_files", "TAG-RELATIONS-FROM-FILES", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_relations_from_file", "TAG-RELATIONS-FROM-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "sentencifications_from_file", "SENTENCIFICATIONS-FROM-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings", "STRING-PHRASAL-MEANINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_iterator", "STRING-PHRASAL-MEANINGS-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "phrasal_meanings", "PHRASAL-MEANINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "phrasal_meanings_iterator", "PHRASAL-MEANINGS-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "phrasal_meanings_optional_args_p", "PHRASAL-MEANINGS-OPTIONAL-ARGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_phrase_cyclifier", "LEXICAL-PHRASE-CYCLIFIER", 2, 0, false );
    SubLFiles.declareFunction( me, "lex_entry_passes_syntactic_restrictionP", "LEX-ENTRY-PASSES-SYNTACTIC-RESTRICTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_test", "STRING-PHRASAL-MEANINGS-TEST", 1, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_with_args", "STRING-PHRASAL-MEANINGS-WITH-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_with_args_non_working_cases", "STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES", 1, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_with_adhoc_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-FILTER-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_with_adhoc_genls_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "string_phrasal_meanings_with_adhoc_isa_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_nl_parsing_api_file()
  {
    $dtp_tag_relations_iterator_state$ = SubLFiles.defconstant( "*DTP-TAG-RELATIONS-ITERATOR-STATE*", $sym12$TAG_RELATIONS_ITERATOR_STATE );
    $sentence_cyclifiers$ = SubLFiles.defparameter( "*SENTENCE-CYCLIFIERS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $dtp_sentence_cyclifier$ = SubLFiles.defconstant( "*DTP-SENTENCE-CYCLIFIER*", $sym53$SENTENCE_CYCLIFIER );
    return NIL;
  }

  public static SubLObject setup_nl_parsing_api_file()
  {
    access_macros.register_external_symbol( $sym0$TAG_RELATIONS );
    access_macros.register_external_symbol( $sym10$TAG_RELATIONS_OPTIONAL_ARGS_P );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_tag_relations_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym19$TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list20 );
    Structures.def_csetf( $sym21$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR, $sym22$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR );
    Structures.def_csetf( $sym23$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER, $sym24$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER );
    Structures.def_csetf( $sym25$TAG_RELATIONS_ITERATOR_STATE_DOCUMENT, $sym26$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT );
    Structures.def_csetf( $sym27$TAG_RELATIONS_ITERATOR_STATE_LEXICON, $sym28$_CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON );
    Structures.def_csetf( $sym29$TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER, $sym30$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER );
    Structures.def_csetf( $sym31$TAG_RELATIONS_ITERATOR_STATE_TIMEOUT, $sym32$_CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT );
    Structures.def_csetf( $sym33$TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT, $sym34$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT );
    Structures.def_csetf( $sym35$TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC, $sym36$_CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC );
    Structures.def_csetf( $sym37$TAG_RELATIONS_ITERATOR_STATE_FILTER, $sym38$_CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER );
    Structures.def_csetf( $sym39$TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, $sym40$_CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT );
    Equality.identity( $sym12$TAG_RELATIONS_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tag_relations_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym51$VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P );
    utilities_macros.note_funcall_helper_function( $sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sentence_cyclifier$.getGlobalValue(), Symbols.symbol_function( $sym60$SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list61 );
    Structures.def_csetf( $sym62$SENTENCE_CYCLIFIER_NAME, $sym63$_CSETF_SENTENCE_CYCLIFIER_NAME );
    Structures.def_csetf( $sym64$SENTENCE_CYCLIFIER_CYCLIFY_METHOD, $sym65$_CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD );
    Structures.def_csetf( $sym66$SENTENCE_CYCLIFIER_LEXICON_METHOD, $sym67$_CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD );
    Equality.identity( $sym53$SENTENCE_CYCLIFIER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sentence_cyclifier$.getGlobalValue(), Symbols.symbol_function(
        $sym72$VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD ) );
    declare_sentence_cyclifier( $sym79$EBMT_CYCLIFIER, $sym79$EBMT_CYCLIFIER, $sym80$NEW_SEMTRANS_LEXICON );
    declare_sentence_cyclifier( $sym82$STANFORD_CYCLIFIER, $sym82$STANFORD_CYCLIFIER, $sym83$NEW_CYCLIFIER_LEXICON );
    declare_sentence_cyclifier( $sym6$LINK_CYCLIFIER, $sym6$LINK_CYCLIFIER, $sym83$NEW_CYCLIFIER_LEXICON );
    access_macros.register_external_symbol( $sym94$STRING_PHRASAL_MEANINGS );
    access_macros.register_external_symbol( $sym97$STRING_PHRASAL_MEANINGS_ITERATOR );
    access_macros.register_external_symbol( $sym99$PHRASAL_MEANINGS );
    access_macros.register_external_symbol( $sym101$PHRASAL_MEANINGS_ITERATOR );
    access_macros.register_external_symbol( $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P );
    generic_testing.define_test_case_table_int( $sym118$STRING_PHRASAL_MEANINGS_TEST, ConsesLow.list( new SubLObject[] { $kw119$TEST, $sym120$SETS_EQUAL_EQUAL_, $kw121$OWNER, NIL, $kw122$CLASSES, $list123, $kw124$KB,
      $kw125$FULL, $kw126$WORKING_, T
    } ), $list127 );
    generic_testing.define_test_case_table_int( $sym128$STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE, ConsesLow.list( new SubLObject[] { $kw119$TEST, EQUAL, $kw121$OWNER, NIL, $kw122$CLASSES, $list123, $kw124$KB,
      $kw125$FULL, $kw126$WORKING_, NIL
    } ), $list129 );
    generic_testing.define_test_case_table_int( $sym130$STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE, ConsesLow.list( new SubLObject[] { $kw119$TEST, EQUAL, $kw121$OWNER, NIL, $kw122$CLASSES, $list123, $kw124$KB,
      $kw125$FULL, $kw126$WORKING_, T
    } ), $list131 );
    generic_testing.define_test_case_table_int( $sym132$STRING_PHRASAL_MEANINGS_WITH_ARGS, ConsesLow.list( new SubLObject[] { $kw119$TEST, $sym120$SETS_EQUAL_EQUAL_, $kw121$OWNER, NIL, $kw122$CLASSES, $list123,
      $kw124$KB, $kw125$FULL, $kw126$WORKING_, T
    } ), $list133 );
    generic_testing.define_test_case_table_int( $sym134$STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES, ConsesLow.list( new SubLObject[] { $kw119$TEST, $sym120$SETS_EQUAL_EQUAL_, $kw121$OWNER, NIL, $kw122$CLASSES,
      $list123, $kw124$KB, $kw125$FULL, $kw126$WORKING_, NIL
    } ), $list135 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_parsing_api_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_parsing_api_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_parsing_api_file();
  }
  static
  {
    me = new nl_parsing_api();
    $dtp_tag_relations_iterator_state$ = null;
    $sentence_cyclifiers$ = null;
    $dtp_sentence_cyclifier$ = null;
    $sym0$TAG_RELATIONS = makeSymbol( "TAG-RELATIONS" );
    $kw1$OUTPUT_SPEC = makeKeyword( "OUTPUT-SPEC" );
    $kw2$SIMPLE = makeKeyword( "SIMPLE" );
    $kw3$FILTER = makeKeyword( "FILTER" );
    $kw4$SENSE_TAGGER = makeKeyword( "SENSE-TAGGER" );
    $kw5$SENTENCE_CYCLIFIER = makeKeyword( "SENTENCE-CYCLIFIER" );
    $sym6$LINK_CYCLIFIER = makeSymbol( "LINK-CYCLIFIER" );
    $kw7$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-DONE-P" );
    $sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-NEXT" );
    $sym10$TAG_RELATIONS_OPTIONAL_ARGS_P = makeSymbol( "TAG-RELATIONS-OPTIONAL-ARGS-P" );
    $list11 = ConsesLow.list( makeKeyword( "LEXICON" ), makeKeyword( "SENTENCE-CYCLIFIER" ), makeKeyword( "DOMAIN-MT" ), makeKeyword( "OUTPUT-SPEC" ), makeKeyword( "FILTER" ), makeKeyword( "SENSE-TAGGER" ), makeKeyword(
        "TIMEOUT" ) );
    $sym12$TAG_RELATIONS_ITERATOR_STATE = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE" );
    $sym13$TAG_RELATIONS_ITERATOR_STATE_P = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-P" );
    $list14 = ConsesLow.list( new SubLObject[] { makeSymbol( "SENTENCE-ITERATOR" ), makeSymbol( "SENTENCE-CYCLIFIER" ), makeSymbol( "DOCUMENT" ), makeSymbol( "LEXICON" ), makeSymbol( "SENSE-TAGGER" ), makeSymbol(
        "TIMEOUT" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "OUTPUT-SPEC" ), makeSymbol( "FILTER" ), makeSymbol( "PREPARED-SENTENCE-OUTPUT" )
    } );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENTENCE-ITERATOR" ), makeKeyword( "SENTENCE-CYCLIFIER" ), makeKeyword( "DOCUMENT" ), makeKeyword( "LEXICON" ), makeKeyword( "SENSE-TAGGER" ), makeKeyword(
        "TIMEOUT" ), makeKeyword( "DOMAIN-MT" ), makeKeyword( "OUTPUT-SPEC" ), makeKeyword( "FILTER" ), makeKeyword( "PREPARED-SENTENCE-OUTPUT" )
    } );
    $list16 = ConsesLow.list( new SubLObject[] { makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER" ), makeSymbol(
        "TAG-RELATIONS-ITERATOR-STATE-DOCUMENT" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-LEXICON" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-TIMEOUT" ),
      makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-FILTER" ), makeSymbol(
          "TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" )
    } );
    $list17 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR" ), makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER" ), makeSymbol(
        "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT" ), makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON" ), makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER" ), makeSymbol(
            "_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT" ), makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT" ), makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC" ), makeSymbol(
                "_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER" ), makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" )
    } );
    $sym18$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym19$TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list20 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-P" ) );
    $sym21$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR" );
    $sym22$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR" );
    $sym23$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER" );
    $sym24$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER" );
    $sym25$TAG_RELATIONS_ITERATOR_STATE_DOCUMENT = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-DOCUMENT" );
    $sym26$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT" );
    $sym27$TAG_RELATIONS_ITERATOR_STATE_LEXICON = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-LEXICON" );
    $sym28$_CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON" );
    $sym29$TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER" );
    $sym30$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER" );
    $sym31$TAG_RELATIONS_ITERATOR_STATE_TIMEOUT = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-TIMEOUT" );
    $sym32$_CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT" );
    $sym33$TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT" );
    $sym34$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT" );
    $sym35$TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC" );
    $sym36$_CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC" );
    $sym37$TAG_RELATIONS_ITERATOR_STATE_FILTER = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-FILTER" );
    $sym38$_CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER" );
    $sym39$TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol( "TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" );
    $sym40$_CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol( "_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" );
    $kw41$SENTENCE_ITERATOR = makeKeyword( "SENTENCE-ITERATOR" );
    $kw42$DOCUMENT = makeKeyword( "DOCUMENT" );
    $kw43$LEXICON = makeKeyword( "LEXICON" );
    $kw44$TIMEOUT = makeKeyword( "TIMEOUT" );
    $kw45$PREPARED_SENTENCE_OUTPUT = makeKeyword( "PREPARED-SENTENCE-OUTPUT" );
    $str46$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw47$BEGIN = makeKeyword( "BEGIN" );
    $sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE = makeSymbol( "MAKE-TAG-RELATIONS-ITERATOR-STATE" );
    $kw49$SLOT = makeKeyword( "SLOT" );
    $kw50$END = makeKeyword( "END" );
    $sym51$VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD" );
    $sym52$LEARN = makeSymbol( "LEARN" );
    $sym53$SENTENCE_CYCLIFIER = makeSymbol( "SENTENCE-CYCLIFIER" );
    $sym54$SENTENCE_CYCLIFIER_P = makeSymbol( "SENTENCE-CYCLIFIER-P" );
    $list55 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "CYCLIFY-METHOD" ), makeSymbol( "LEXICON-METHOD" ) );
    $list56 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "CYCLIFY-METHOD" ), makeKeyword( "LEXICON-METHOD" ) );
    $list57 = ConsesLow.list( makeSymbol( "SENTENCE-CYCLIFIER-NAME" ), makeSymbol( "SENTENCE-CYCLIFIER-CYCLIFY-METHOD" ), makeSymbol( "SENTENCE-CYCLIFIER-LEXICON-METHOD" ) );
    $list58 = ConsesLow.list( makeSymbol( "_CSETF-SENTENCE-CYCLIFIER-NAME" ), makeSymbol( "_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD" ), makeSymbol( "_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD" ) );
    $sym59$PRINT_SENTENCE_CYCLIFIER = makeSymbol( "PRINT-SENTENCE-CYCLIFIER" );
    $sym60$SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE" );
    $list61 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SENTENCE-CYCLIFIER-P" ) );
    $sym62$SENTENCE_CYCLIFIER_NAME = makeSymbol( "SENTENCE-CYCLIFIER-NAME" );
    $sym63$_CSETF_SENTENCE_CYCLIFIER_NAME = makeSymbol( "_CSETF-SENTENCE-CYCLIFIER-NAME" );
    $sym64$SENTENCE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol( "SENTENCE-CYCLIFIER-CYCLIFY-METHOD" );
    $sym65$_CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol( "_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD" );
    $sym66$SENTENCE_CYCLIFIER_LEXICON_METHOD = makeSymbol( "SENTENCE-CYCLIFIER-LEXICON-METHOD" );
    $sym67$_CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD = makeSymbol( "_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD" );
    $kw68$NAME = makeKeyword( "NAME" );
    $kw69$CYCLIFY_METHOD = makeKeyword( "CYCLIFY-METHOD" );
    $kw70$LEXICON_METHOD = makeKeyword( "LEXICON-METHOD" );
    $sym71$MAKE_SENTENCE_CYCLIFIER = makeSymbol( "MAKE-SENTENCE-CYCLIFIER" );
    $sym72$VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD" );
    $str73$__Cyclifier___A_ = makeString( "#<Cyclifier: ~A>" );
    $str74$_S_is_not_a_registered_cyclifier_ = makeString( "~S is not a registered cyclifier." );
    $str75$_ = makeString( "$" );
    $kw76$CYCL = makeKeyword( "CYCL" );
    $kw77$WEIGHT = makeKeyword( "WEIGHT" );
    $kw78$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $sym79$EBMT_CYCLIFIER = makeSymbol( "EBMT-CYCLIFIER" );
    $sym80$NEW_SEMTRANS_LEXICON = makeSymbol( "NEW-SEMTRANS-LEXICON" );
    $kw81$PARSER = makeKeyword( "PARSER" );
    $sym82$STANFORD_CYCLIFIER = makeSymbol( "STANFORD-CYCLIFIER" );
    $sym83$NEW_CYCLIFIER_LEXICON = makeSymbol( "NEW-CYCLIFIER-LEXICON" );
    $sym84$API_CYCLIFIER_DONE_ = makeSymbol( "API-CYCLIFIER-DONE?" );
    $sym85$API_CYCLIFIER_GET_NEXT = makeSymbol( "API-CYCLIFIER-GET-NEXT" );
    $kw86$CYCLIFIER = makeKeyword( "CYCLIFIER" );
    $sym87$HAS_NEXT_ = makeSymbol( "HAS-NEXT?" );
    $sym88$NEXT = makeSymbol( "NEXT" );
    $sym89$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $str90$cdolist = makeString( "cdolist" );
    $str91$table = makeString( "table" );
    $list92 = ConsesLow.list( makeKeyword( "SENTENCE-CYCLIFIER" ), makeSymbol( "EBMT-CYCLIFIER" ) );
    $str93$CycL___S__ = makeString( "CycL: ~S~%" );
    $sym94$STRING_PHRASAL_MEANINGS = makeSymbol( "STRING-PHRASAL-MEANINGS" );
    $sym95$STRINGP = makeSymbol( "STRINGP" );
    $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P = makeSymbol( "PHRASAL-MEANINGS-OPTIONAL-ARGS-P" );
    $sym97$STRING_PHRASAL_MEANINGS_ITERATOR = makeSymbol( "STRING-PHRASAL-MEANINGS-ITERATOR" );
    $kw98$STRING = makeKeyword( "STRING" );
    $sym99$PHRASAL_MEANINGS = makeSymbol( "PHRASAL-MEANINGS" );
    $sym100$PHRASE_P = makeSymbol( "PHRASE-P" );
    $sym101$PHRASAL_MEANINGS_ITERATOR = makeSymbol( "PHRASAL-MEANINGS-ITERATOR" );
    $kw102$SUBL = makeKeyword( "SUBL" );
    $kw103$LEARNERS = makeKeyword( "LEARNERS" );
    $list104 = ConsesLow.list( makeSymbol( "SIMPLE-DATE-FROM-STRING-LEARN" ), makeSymbol( "NUMBER-LEARN" ) );
    $kw105$SYNTACTIC_RESTRICTION = makeKeyword( "SYNTACTIC-RESTRICTION" );
    $kw106$PHRASE_CYCLIFIER = makeKeyword( "PHRASE-CYCLIFIER" );
    $sym107$LEXICAL_PHRASE_CYCLIFIER = makeSymbol( "LEXICAL-PHRASE-CYCLIFIER" );
    $list108 = ConsesLow.list( makeKeyword( "TIMEOUT" ), NIL );
    $kw109$DEFAULT = makeKeyword( "DEFAULT" );
    $sym110$NL_INTERP_TO_XML = makeSymbol( "NL-INTERP-TO-XML" );
    $sym111$GET = makeSymbol( "GET" );
    $sym112$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $sym113$SPEECH_PART_ = makeSymbol( "SPEECH-PART?" );
    $kw114$PREDICATE = makeKeyword( "PREDICATE" );
    $kw115$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $kw116$CYC_POS = makeKeyword( "CYC-POS" );
    $sym117$GET_NL_INTERP_CYCL = makeSymbol( "GET-NL-INTERP-CYCL" );
    $sym118$STRING_PHRASAL_MEANINGS_TEST = makeSymbol( "STRING-PHRASAL-MEANINGS-TEST" );
    $kw119$TEST = makeKeyword( "TEST" );
    $sym120$SETS_EQUAL_EQUAL_ = makeSymbol( "SETS-EQUAL-EQUAL?" );
    $kw121$OWNER = makeKeyword( "OWNER" );
    $kw122$CLASSES = makeKeyword( "CLASSES" );
    $list123 = ConsesLow.list( makeSymbol( "NL-TEST-CASES" ), makeSymbol( "NL-PARSING-TEST-CASES" ) );
    $kw124$KB = makeKeyword( "KB" );
    $kw125$FULL = makeKeyword( "FULL" );
    $kw126$WORKING_ = makeKeyword( "WORKING?" );
    $list127 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "dog" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Dog" ) ), constant_handles.reader_make_constant_shell(
        makeString( "HotDog" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "January 20, 2000" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
            TWENTY_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ) ) ) ) );
    $sym128$STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE = makeSymbol( "STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE" );
    $list129 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "dog" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "dog" ),
        constant_handles.reader_make_constant_shell( makeString( "Animal" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Dog" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
            "dog" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), NIL ) );
    $sym130$STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE = makeSymbol( "STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE" );
    $list131 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "January 20, 2000" ), constant_handles.reader_make_constant_shell( makeString( "Date" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "DayFn" ) ), TWENTY_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
            makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                "January 20, 2000" ), constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                    TWENTY_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "January 21, 2000" ), constant_handles
                            .reader_make_constant_shell( makeString( "Date" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 21 ), ConsesLow.list(
                                constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "January 21, 2000" ), constant_handles
                                        .reader_make_constant_shell( makeString( "Thing" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 21 ),
                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ) ) ) ) );
    $sym132$STRING_PHRASAL_MEANINGS_WITH_ARGS = makeSymbol( "STRING-PHRASAL-MEANINGS-WITH-ARGS" );
    $list133 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "bank" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "OUTPUT-SPEC" ), ConsesLow.list( makeSymbol( "NEW-NL-OUTPUT-SPEC" ), makeKeyword(
        "SUBL" ), ConsesLow.list( makeSymbol( "NEW-NL-INTERPRETATION-SPEC" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "CYCL" ), T, makeKeyword( "INFLECTIONS" ), T, makeKeyword(
            "PHRASE-TYPES" ), T ) ) ) ), makeKeyword( "SYNTACTIC-RESTRICTION" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ) ) ), ConsesLow.list( ConsesLow
                .list( makeKeyword( "CYCL" ), constant_handles.reader_make_constant_shell( makeString( "BankOrganization" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( makeKeyword( "CYCL" ),
                        constant_handles.reader_make_constant_shell( makeString( "BankingTurn" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( makeKeyword( "CYCL" ),
                                constant_handles.reader_make_constant_shell( makeString( "Bank-Topographical" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                        makeString( "bank" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "OUTPUT-SPEC" ), ConsesLow.list( makeSymbol( "NEW-NL-OUTPUT-SPEC" ), makeKeyword( "SUBL" ), ConsesLow.list(
                                            makeSymbol( "NEW-NL-INTERPRETATION-SPEC" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "CYCL" ), T, makeKeyword( "INFLECTIONS" ), T, makeKeyword(
                                                "PHRASE-TYPES" ), T ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CYCL" ), constant_handles.reader_make_constant_shell( makeString( "MakingABankDeposit" ) ),
                                                    makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ), constant_handles.reader_make_constant_shell( makeString( "pluralVerb-Present" ) ),
                                                        constant_handles.reader_make_constant_shell( makeString( "firstPersonSg-Present" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                            "secondPersonSg-Present" ) ) ) ), ConsesLow.list( makeKeyword( "CYCL" ), constant_handles.reader_make_constant_shell( makeString( "BankingTurn" ) ),
                                                                makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) ), makeKeyword( "INFLECTIONS" ),
                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                    "pluralVerb-Present" ) ), constant_handles.reader_make_constant_shell( makeString( "firstPersonSg-Present" ) ), constant_handles
                                                                        .reader_make_constant_shell( makeString( "secondPersonSg-Present" ) ) ) ), ConsesLow.list( makeKeyword( "CYCL" ), constant_handles
                                                                            .reader_make_constant_shell( makeString( "BankOrganization" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles
                                                                                .reader_make_constant_shell( makeString( "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( constant_handles
                                                                                    .reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( makeKeyword( "CYCL" ), constant_handles
                                                                                        .reader_make_constant_shell( makeString( "BankingTurn" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles
                                                                                            .reader_make_constant_shell( makeString( "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( constant_handles
                                                                                                .reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( makeKeyword( "CYCL" ), constant_handles
                                                                                                    .reader_make_constant_shell( makeString( "Bank-Topographical" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list(
                                                                                                        constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow
                                                                                                            .list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ) ) );
    $sym134$STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES = makeSymbol( "STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES" );
    $list135 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "bank" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "OUTPUT-SPEC" ), ConsesLow.list( makeSymbol( "NEW-NL-OUTPUT-SPEC" ), makeKeyword(
        "SUBL" ), ConsesLow.list( makeSymbol( "NEW-NL-INTERPRETATION-SPEC" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "CYCL" ), T, makeKeyword( "INFLECTIONS" ), T, makeKeyword(
            "PHRASE-TYPES" ), T ) ) ) ), makeKeyword( "FILTER" ), ConsesLow.list( makeSymbol( "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC" ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ) ),
        ConsesLow.list( ConsesLow.list( makeKeyword( "CYCL" ), constant_handles.reader_make_constant_shell( makeString( "BankOrganization" ) ), makeKeyword( "PHRASE-TYPES" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "CountNoun" ) ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ) ), ConsesLow.list(
                ConsesLow.list( makeString( "bank" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "OUTPUT-SPEC" ), ConsesLow.list( makeSymbol( "NEW-NL-OUTPUT-SPEC" ), makeKeyword( "XML" ), ConsesLow.list(
                    makeSymbol( "NEW-NL-INTERPRETATION-SPEC" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "CYCL" ), T, makeKeyword( "INFLECTIONS" ), T, makeKeyword( "PHRASE-TYPES" ), T ) ) ) ),
                    makeKeyword( "FILTER" ), ConsesLow.list( makeSymbol( "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC" ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ) ), ConsesLow.list(
                        makeString(
                            "\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n <PhraseType>\n  <CycLConstant>\n    <name>CountNoun</name>\n    <namespace>cyc</namespace>\n    <guid>bd588078-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd588078-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </PhraseType>\n <HeadInflections>\n  <CycLConstant>\n    <name>singular</name>\n    <namespace>cyc</namespace>\n    <guid>bd6757b8-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd6757b8-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </HeadInflections>\n</NLInterpretation>" ) ) ),
        ConsesLow.list( ConsesLow.list( makeString( "bank" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "OUTPUT-SPEC" ), ConsesLow.list( makeSymbol( "NEW-NL-OUTPUT-SPEC" ), makeKeyword( "XML" ), ConsesLow.list(
            makeSymbol( "NEW-NL-INTERPRETATION-SPEC" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "CYCL" ), T ) ) ) ), makeKeyword( "FILTER" ), ConsesLow.list( makeSymbol(
                "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC" ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ) ), ConsesLow.list( makeString(
                    "\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n</NLInterpretation>" ) ) ) );
  }

  public static final class $tag_relations_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $sentence_iterator;
    public SubLObject $sentence_cyclifier;
    public SubLObject $document;
    public SubLObject $lexicon;
    public SubLObject $sense_tagger;
    public SubLObject $timeout;
    public SubLObject $domain_mt;
    public SubLObject $output_spec;
    public SubLObject $filter;
    public SubLObject $prepared_sentence_output;
    private static final SubLStructDeclNative structDecl;

    public $tag_relations_iterator_state_native()
    {
      this.$sentence_iterator = CommonSymbols.NIL;
      this.$sentence_cyclifier = CommonSymbols.NIL;
      this.$document = CommonSymbols.NIL;
      this.$lexicon = CommonSymbols.NIL;
      this.$sense_tagger = CommonSymbols.NIL;
      this.$timeout = CommonSymbols.NIL;
      this.$domain_mt = CommonSymbols.NIL;
      this.$output_spec = CommonSymbols.NIL;
      this.$filter = CommonSymbols.NIL;
      this.$prepared_sentence_output = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $tag_relations_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sentence_iterator;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$sentence_cyclifier;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$document;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$lexicon;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$sense_tagger;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$timeout;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$domain_mt;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$output_spec;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$filter;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$prepared_sentence_output;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sentence_iterator = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$sentence_cyclifier = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$document = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$lexicon = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$sense_tagger = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$timeout = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$domain_mt = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$output_spec = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$filter = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$prepared_sentence_output = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $tag_relations_iterator_state_native.class, $sym12$TAG_RELATIONS_ITERATOR_STATE, $sym13$TAG_RELATIONS_ITERATOR_STATE_P, $list14, $list15, new String[] {
        "$sentence_iterator", "$sentence_cyclifier", "$document", "$lexicon", "$sense_tagger", "$timeout", "$domain_mt", "$output_spec", "$filter", "$prepared_sentence_output"
      }, $list16, $list17, $sym18$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $tag_relations_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $tag_relations_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TAG-RELATIONS-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return tag_relations_iterator_state_p( arg1 );
    }
  }

  public static final class $sentence_cyclifier_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $cyclify_method;
    public SubLObject $lexicon_method;
    private static final SubLStructDeclNative structDecl;

    public $sentence_cyclifier_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$cyclify_method = CommonSymbols.NIL;
      this.$lexicon_method = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sentence_cyclifier_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$cyclify_method;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lexicon_method;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$cyclify_method = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lexicon_method = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sentence_cyclifier_native.class, $sym53$SENTENCE_CYCLIFIER, $sym54$SENTENCE_CYCLIFIER_P, $list55, $list56, new String[] { "$name", "$cyclify_method", "$lexicon_method"
      }, $list57, $list58, $sym59$PRINT_SENTENCE_CYCLIFIER );
    }
  }

  public static final class $sentence_cyclifier_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sentence_cyclifier_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SENTENCE-CYCLIFIER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sentence_cyclifier_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 349 ms
 * 
 */