package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_web_services
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_web_services";
  public static final String myFingerPrint = "88dcc4d675c94f7a0801793c64857832772785ab2bcd5a70ad60706f7bc6f426";
  private static final SubLString $str0$createType;
  private static final SubLString $str1$name;
  private static final SubLString $str2$;
  private static final SubLString $str3$spec_pred;
  private static final SubLSymbol $kw4$DOWNCASE;
  private static final SubLSymbol $kw5$UPCASE;
  private static final SubLString $str6$baseType;
  private static final SubLObject $const7$EnglishMt;
  private static final SubLString $str8$instance;
  private static final SubLObject $const9$isa;
  private static final SubLString $str10$spec;
  private static final SubLList $list11;
  private static final SubLObject $const12$genls;
  private static final SubLString $str13$spec_mt;
  private static final SubLList $list14;
  private static final SubLObject $const15$UniversalVocabularyMt;
  private static final SubLObject $const16$genlMt;
  private static final SubLString $str17$concept;
  private static final SubLString $str18$externalId;
  private static final SubLString $str19$url;
  private static final SubLSymbol $kw20$UNINITIALIZED;
  private static final SubLSymbol $sym21$XML_TERM_CREATE;
  private static final SubLSymbol $kw22$XML_HANDLER;
  private static final SubLList $list23;
  private static final SubLObject $const24$genlPreds;
  private static final SubLObject $const25$argIsa;
  private static final SubLSymbol $kw26$GAF;
  private static final SubLSymbol $sym27$_X;
  private static final SubLObject $const28$and;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLObject $const31$AtemporalNecessarilyEssentialColl;
  private static final SubLSymbol $sym32$_MT;
  private static final SubLObject $const33$defaultDefiningMtForInstances;
  private static final SubLList $list34;
  private static final SubLObject $const35$BaseKB;
  private static final SubLObject $const36$defaultDefiningMtForSpecs;
  private static final SubLString $str37$assert;
  private static final SubLString $str38$add;
  private static final SubLString $str39$action;
  private static final SubLObject $const40$genStringAssertion;
  private static final SubLSymbol $sym41$XML_SET_GENSTRING_ASSERTION;
  private static final SubLString $str42$strength;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$DEFAULT;
  private static final SubLObject $const45$strengthOfLexicalMapping;
  private static final SubLSymbol $sym46$XML_SET_LEXICAL_MAPPING_STRENGTH;
  private static final SubLSymbol $sym47$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const48$EverythingPSC;
  private static final SubLString $str49$term;
  private static final SubLString $str50$bookmarked;
  private static final SubLString $str51$result;
  private static final SubLString $str52$newClass;
  private static final SubLString $str53$title;
  private static final SubLSymbol $sym54$XML_SET_BOOKMARK;
  private static final SubLObject $const55$cyclistReadilyAvailableTerms;
  private static final SubLObject $const56$MtSpace;
  private static final SubLObject $const57$CyclistsMt;
  private static final SubLObject $const58$MtTimeWithGranularityDimFn;
  private static final SubLObject $const59$TimeIntervalInclusiveFn;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$_ASSERT;
  private static final SubLObject $const63$assertionSentence;
  private static final SubLList $list64;
  private static final SubLObject $const65$InferencePSC;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$_INT;
  private static final SubLObject $const68$thereExists;
  private static final SubLSymbol $sym69$_WHEN;
  private static final SubLList $list70;
  private static final SubLObject $const71$equals;
  private static final SubLObject $const72$TemporalIntersectionFn;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$_EXIT;
  private static final SubLList $list76;

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 926L)
  public static SubLObject xml_term_create(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject create_type = html_utilities.html_extract_input( $str0$createType, args );
    final SubLObject user_sugg_name = html_utilities.html_extract_input( $str1$name, args );
    final SubLObject const_name = constants_high.suggest_constant_name( user_sugg_name, $str2$, $str2$, create_type.equalp( $str3$spec_pred ) ? $kw4$DOWNCASE : $kw5$UPCASE, UNPROVIDED, UNPROVIDED );
    final SubLObject new_term = ke.ke_create_now( const_name, UNPROVIDED );
    final SubLObject base_type = kb_utilities.find_object_by_compact_hl_external_id_string( html_utilities.html_extract_input( $str6$baseType, args ) );
    final SubLObject mt = get_defining_mt_for_type( create_type, base_type );
    final SubLObject lexical_mt = $const7$EnglishMt;
    if( create_type.equalp( $str8$instance ) )
    {
      ke.ke_assert( ConsesLow.list( $const9$isa, new_term, base_type ), mt, UNPROVIDED, UNPROVIDED );
    }
    else if( create_type.equalp( $str10$spec ) )
    {
      ke.ke_assert( ConsesLow.listS( $const9$isa, new_term, $list11 ), mt, UNPROVIDED, UNPROVIDED );
      rkf_assertion_utilities.rkf_assert_with_implicature( ConsesLow.list( $const12$genls, new_term, base_type ), mt, T );
    }
    else if( create_type.equalp( $str13$spec_mt ) )
    {
      ke.ke_assert( ConsesLow.listS( $const9$isa, new_term, $list14 ), $const15$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
      ke.ke_assert( ConsesLow.list( $const16$genlMt, new_term, base_type ), $const15$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
    }
    else if( create_type.equalp( $str3$spec_pred ) )
    {
      create_spec_pred( base_type, new_term );
    }
    SubLObject cdolist_list_var = auto_lexifier.auto_lexify( user_sugg_name, new_term, lexical_mt, mt );
    SubLObject lexical_formula = NIL;
    lexical_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_assert( lexical_formula, lexical_mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      lexical_formula = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str17$concept, ConsesLow.list( $str18$externalId, kb_utilities.compact_hl_external_id_string( new_term ), $str19$url, url_encoded_cb_form( new_term ) ), NIL, NIL,
              $kw20$UNINITIALIZED );
          final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw20$UNINITIALIZED, thread );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str17$concept );
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
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    cb_tools.cb_add_to_constant_history( new_term );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 2529L)
  public static SubLObject create_spec_pred(final SubLObject genl_pred, final SubLObject spec_pred)
  {
    ke.ke_assert( ConsesLow.listS( $const9$isa, spec_pred, $list23 ), $const15$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
    rkf_assertion_utilities.rkf_assert_with_implicature( ConsesLow.list( $const24$genlPreds, spec_pred, genl_pred ), $const15$UniversalVocabularyMt, UNPROVIDED );
    final SubLObject pred_var = $const25$argIsa;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( genl_pred, NIL, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( genl_pred, NIL, pred_var );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
            SubLObject done_var_$4 = NIL;
            final SubLObject token_var_$5 = NIL;
            while ( NIL == done_var_$4)
            {
              final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
              final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( v_assert ) );
              if( NIL != valid_$6 )
              {
                ke.ke_assert( cycl_utilities.formula_subst( spec_pred, genl_pred, uncanonicalizer.assertion_el_formula( v_assert ), UNPROVIDED, UNPROVIDED ), assertions_high.assertion_mt( v_assert ), UNPROVIDED,
                    UNPROVIDED );
              }
              done_var_$4 = makeBoolean( NIL == valid_$6 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    final SubLObject v_arity = ask_utilities.query_variable( $sym27$_X, ConsesLow.listS( $const28$and, ConsesLow.listS( $const9$isa, genl_pred, $list29 ), $list30 ), $const15$UniversalVocabularyMt, UNPROVIDED ).first();
    ke.ke_assert( ConsesLow.list( $const9$isa, spec_pred, v_arity ), $const15$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 3139L)
  public static SubLObject url_encoded_cb_form(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject s = NIL;
    final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
    try
    {
      html_macros.$html_stream$.bind( NIL, thread );
      try
      {
        html_macros.$html_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        cb_utilities.cb_form( v_term, UNPROVIDED, UNPROVIDED );
        s = streams_high.get_output_stream_string( html_macros.$html_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      html_macros.$html_stream$.rebind( _prev_bind_0, thread );
    }
    return web_utilities.html_url_encode( s, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 3295L)
  public static SubLObject get_defining_mt_for_type(final SubLObject create_type, final SubLObject cycl_type)
  {
    SubLObject mt = NIL;
    if( create_type.equal( $str8$instance ) && NIL != isa.isaP( create_type, $const31$AtemporalNecessarilyEssentialColl, UNPROVIDED, UNPROVIDED ) )
    {
      mt = $const15$UniversalVocabularyMt;
    }
    else if( create_type.equal( $str8$instance ) )
    {
      mt = ask_utilities.query_variable( $sym32$_MT, ConsesLow.listS( $const33$defaultDefiningMtForInstances, cycl_type, $list34 ), $const35$BaseKB, UNPROVIDED ).first();
    }
    else if( create_type.equal( $str8$instance ) )
    {
      mt = ask_utilities.query_variable( $sym32$_MT, ConsesLow.listS( $const36$defaultDefiningMtForSpecs, cycl_type, $list34 ), $const35$BaseKB, UNPROVIDED ).first();
    }
    if( NIL == mt )
    {
      mt = $const15$UniversalVocabularyMt;
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 3891L)
  public static SubLObject xml_set_genstring_assertion(final SubLObject args)
  {
    final SubLObject assertion = cb_utilities.cb_guess_assertion( html_utilities.html_extract_input( $str37$assert, args ) );
    final SubLObject base_formula = uncanonicalizer.assertion_el_ist_formula( assertion );
    final SubLObject mt = ( NIL != assertion ) ? assertions_high.assertion_mt( assertion ) : NIL;
    final SubLObject denot = ( NIL != assertion ) ? lexicon_accessors.assertion_denotation( assertion ) : NIL;
    final SubLObject addP = Equality.equal( $str38$add, html_utilities.html_extract_input( $str39$action, args ) );
    if( NIL != mt )
    {
      if( NIL != addP )
      {
        ke.ke_assert_now( ConsesLow.list( $const40$genStringAssertion, denot, base_formula ), mt, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        unassert_all( ConsesLow.list( $const40$genStringAssertion, denot, base_formula ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 4720L)
  public static SubLObject xml_set_lexical_mapping_strength(final SubLObject args)
  {
    final SubLObject assertion = cb_utilities.cb_guess_assertion( html_utilities.html_extract_input( $str37$assert, args ) );
    final SubLObject base_formula = uncanonicalizer.assertion_el_ist_formula( assertion );
    final SubLObject current_strength = cb_lexical_info.lexical_assertion_strength( assertion );
    final SubLObject mt = ( NIL != assertion ) ? assertions_high.assertion_mt( assertion ) : NIL;
    final SubLObject strength_str = html_utilities.html_extract_input( $str42$strength, args );
    final SubLObject str = list_utilities.alist_lookup( $list43, strength_str, EQUAL, UNPROVIDED );
    if( NIL != mt && NIL != str )
    {
      if( current_strength != $kw44$DEFAULT )
      {
        unassert_all( ConsesLow.list( $const45$strengthOfLexicalMapping, base_formula, current_strength ) );
      }
      if( str != $kw44$DEFAULT )
      {
        ke.ke_assert_now( ConsesLow.list( $const45$strengthOfLexicalMapping, base_formula, str ), mt, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 5951L)
  public static SubLObject unassert_all(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject unassert_count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym47$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const48$EverythingPSC, thread );
      SubLObject cdolist_list_var = czer_meta.find_assertions_cycl( sentence, UNPROVIDED );
      SubLObject v_assert = NIL;
      v_assert = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        unassert_count = Numbers.add( unassert_count, ONE_INTEGER );
        ke.ke_unassert_now( sentence, assertions_high.assertion_mt( v_assert ) );
        cdolist_list_var = cdolist_list_var.rest();
        v_assert = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return unassert_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 6197L)
  public static SubLObject xml_set_bookmark(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = cb_utilities.cb_guess_term( html_utilities.html_extract_input( $str49$term, args ), UNPROVIDED );
    final SubLObject addP = Equality.equal( $str38$add, html_utilities.html_extract_input( $str39$action, args ) );
    final SubLObject new_class = ( NIL != addP ) ? $str50$bookmarked : $str2$;
    final SubLObject title = ( NIL != addP ) ? cb_browser.$bookmarked_term_caption$.getDynamicValue( thread ) : cb_browser.$unbookmarked_term_caption$.getDynamicValue( thread );
    if( NIL != addP )
    {
      make_term_readily_available( v_term, api_control_vars.$the_cyclist$.getDynamicValue( thread ) );
    }
    else
    {
      make_term_unavailable( v_term, api_control_vars.$the_cyclist$.getDynamicValue( thread ) );
    }
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      try
      {
        final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str51$result, ConsesLow.list( $str52$newClass, new_class, $str53$title, title ), NIL, NIL, $kw20$UNINITIALIZED );
          final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw20$UNINITIALIZED, thread );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$8, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str51$result );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return addP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 6966L)
  public static SubLObject make_term_readily_available(final SubLObject v_term, final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym47$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const48$EverythingPSC, thread );
      final SubLObject old_asserts = czer_meta.find_assertions_cycl( ConsesLow.list( $const55$cyclistReadilyAvailableTerms, cyclist, v_term ), UNPROVIDED );
      ke.ke_assert( ConsesLow.list( $const55$cyclistReadilyAvailableTerms, api_control_vars.$the_cyclist$.getDynamicValue( thread ), v_term ), ConsesLow.list( $const56$MtSpace, $const57$CyclistsMt, ConsesLow.listS(
          $const58$MtTimeWithGranularityDimFn, ConsesLow.listS( $const59$TimeIntervalInclusiveFn, date_utilities.indexical_now(), $list60 ), $list61 ) ), UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = old_asserts;
      SubLObject old_assert = NIL;
      old_assert = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_unassert_assertion( old_assert );
        cdolist_list_var = cdolist_list_var.rest();
        old_assert = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 7435L)
  public static SubLObject make_term_unavailable(final SubLObject v_term, final SubLObject cyclist)
  {
    SubLObject cdolist_list_var;
    final SubLObject old_assertions = cdolist_list_var = ask_utilities.query_variable( $sym62$_ASSERT, ConsesLow.listS( $const28$and, ConsesLow.list( $const63$assertionSentence, $sym62$_ASSERT, ConsesLow.list(
        $const55$cyclistReadilyAvailableTerms, cyclist, v_term ) ), $list64 ), $const65$InferencePSC, $list66 );
    SubLObject old_assert = NIL;
    old_assert = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject old_assert_sentence = assertions_high.assertion_formula( old_assert );
      final SubLObject old_assert_mt = assertions_high.assertion_mt( old_assert );
      final SubLObject assertion_time = formula_template_utilities.mt_time_index( assertions_high.assertion_mt( old_assert ) );
      final SubLObject ended_time = ask_utilities.query_variable( $sym67$_INT, ConsesLow.list( $const68$thereExists, $sym69$_WHEN, ConsesLow.list( $const28$and, $list70, ConsesLow.listS( $const71$equals, ConsesLow.listS(
          $const72$TemporalIntersectionFn, assertion_time, $list73 ), $list74 ) ) ), $const65$InferencePSC, UNPROVIDED ).first();
      ke.ke_edit( old_assert_sentence, old_assert_sentence, old_assert_mt, ConsesLow.list( $const56$MtSpace, $const57$CyclistsMt, ConsesLow.listS( $const58$MtTimeWithGranularityDimFn, ConsesLow.list(
          $const59$TimeIntervalInclusiveFn, ended_time, date_utilities.indexical_now() ), $list61 ) ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      old_assert = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-web-services.lisp", position = 8539L)
  public static SubLObject currently_bookmarkedP(final SubLObject v_term, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding( thread );
    try
    {
      czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind( T, thread );
      return ask_utilities.query_boolean( ConsesLow.list( $const55$cyclistReadilyAvailableTerms, cyclist, narts_high.nart_substitute( v_term ) ), $list76, UNPROVIDED );
    }
    finally
    {
      czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind( _prev_bind_0, thread );
    }
  }

  public static SubLObject declare_cb_web_services_file()
  {
    SubLFiles.declareFunction( me, "xml_term_create", "XML-TERM-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "create_spec_pred", "CREATE-SPEC-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "url_encoded_cb_form", "URL-ENCODED-CB-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "get_defining_mt_for_type", "GET-DEFINING-MT-FOR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_set_genstring_assertion", "XML-SET-GENSTRING-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_set_lexical_mapping_strength", "XML-SET-LEXICAL-MAPPING-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "unassert_all", "UNASSERT-ALL", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_set_bookmark", "XML-SET-BOOKMARK", 1, 0, false );
    SubLFiles.declareFunction( me, "make_term_readily_available", "MAKE-TERM-READILY-AVAILABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_term_unavailable", "MAKE-TERM-UNAVAILABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "currently_bookmarkedP", "CURRENTLY-BOOKMARKED?", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_cb_web_services_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_web_services_file()
  {
    html_macros.note_cgi_handler_function( $sym21$XML_TERM_CREATE, $kw22$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym41$XML_SET_GENSTRING_ASSERTION, $kw22$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym46$XML_SET_LEXICAL_MAPPING_STRENGTH, $kw22$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym54$XML_SET_BOOKMARK, $kw22$XML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_web_services_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_web_services_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_web_services_file();
  }
  static
  {
    me = new cb_web_services();
    $str0$createType = makeString( "createType" );
    $str1$name = makeString( "name" );
    $str2$ = makeString( "" );
    $str3$spec_pred = makeString( "spec-pred" );
    $kw4$DOWNCASE = makeKeyword( "DOWNCASE" );
    $kw5$UPCASE = makeKeyword( "UPCASE" );
    $str6$baseType = makeString( "baseType" );
    $const7$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $str8$instance = makeString( "instance" );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str10$spec = makeString( "spec" );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) );
    $const12$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str13$spec_mt = makeString( "spec-mt" );
    $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $const15$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const16$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $str17$concept = makeString( "concept" );
    $str18$externalId = makeString( "externalId" );
    $str19$url = makeString( "url" );
    $kw20$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym21$XML_TERM_CREATE = makeSymbol( "XML-TERM-CREATE" );
    $kw22$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $list23 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) );
    $const24$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const25$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $kw26$GAF = makeKeyword( "GAF" );
    $sym27$_X = makeSymbol( "?X" );
    $const28$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list29 = ConsesLow.list( makeSymbol( "?X" ) );
    $list30 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
        "PredicateTypeByArity" ) ) ) );
    $const31$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell( makeString( "AtemporalNecessarilyEssentialCollectionType" ) );
    $sym32$_MT = makeSymbol( "?MT" );
    $const33$defaultDefiningMtForInstances = constant_handles.reader_make_constant_shell( makeString( "defaultDefiningMtForInstances" ) );
    $list34 = ConsesLow.list( makeSymbol( "?MT" ) );
    $const35$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const36$defaultDefiningMtForSpecs = constant_handles.reader_make_constant_shell( makeString( "defaultDefiningMtForSpecs" ) );
    $str37$assert = makeString( "assert" );
    $str38$add = makeString( "add" );
    $str39$action = makeString( "action" );
    $const40$genStringAssertion = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) );
    $sym41$XML_SET_GENSTRING_ASSERTION = makeSymbol( "XML-SET-GENSTRING-ASSERTION" );
    $str42$strength = makeString( "strength" );
    $list43 = ConsesLow.list( ConsesLow.cons( makeString( "context" ), constant_handles.reader_make_constant_shell( makeString( "ContextuallyDependentLexicalMapping" ) ) ), ConsesLow.cons( makeString( "primary" ),
        constant_handles.reader_make_constant_shell( makeString( "PrimaryLexicalMapping" ) ) ), ConsesLow.cons( makeString( "default" ), makeKeyword( "DEFAULT" ) ), ConsesLow.cons( makeString( "vanishing" ),
            constant_handles.reader_make_constant_shell( makeString( "VanishinglyRareLexicalMapping" ) ) ) );
    $kw44$DEFAULT = makeKeyword( "DEFAULT" );
    $const45$strengthOfLexicalMapping = constant_handles.reader_make_constant_shell( makeString( "strengthOfLexicalMapping" ) );
    $sym46$XML_SET_LEXICAL_MAPPING_STRENGTH = makeSymbol( "XML-SET-LEXICAL-MAPPING-STRENGTH" );
    $sym47$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const48$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str49$term = makeString( "term" );
    $str50$bookmarked = makeString( "bookmarked" );
    $str51$result = makeString( "result" );
    $str52$newClass = makeString( "newClass" );
    $str53$title = makeString( "title" );
    $sym54$XML_SET_BOOKMARK = makeSymbol( "XML-SET-BOOKMARK" );
    $const55$cyclistReadilyAvailableTerms = constant_handles.reader_make_constant_shell( makeString( "cyclistReadilyAvailableTerms" ) );
    $const56$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const57$CyclistsMt = constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) );
    $const58$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) );
    $const59$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $list60 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Now" ) ) );
    $list61 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
    $sym62$_ASSERT = makeSymbol( "?ASSERT" );
    $const63$assertionSentence = constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) );
    $list64 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeSymbol( "?ASSERT" ), makeSymbol( "?MT" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "mtTimeIndex" ) ), makeSymbol( "?MT" ), makeSymbol( "?INTERVAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ),
            makeSymbol( "?INTERVAL" ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ) );
    $const65$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list66 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $sym67$_INT = makeSymbol( "?INT" );
    $const68$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym69$_WHEN = makeSymbol( "?WHEN" );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "indexicalReferent" ) ), constant_handles.reader_make_constant_shell( makeString( "Now-Indexical" ) ), makeSymbol( "?WHEN" ) );
    $const71$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const72$TemporalIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "TemporalIntersectionFn" ) );
    $list73 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) ), makeSymbol( "?WHEN" ) ) );
    $list74 = ConsesLow.list( makeSymbol( "?INT" ) );
    $sym75$_EXIT = makeSymbol( "%EXIT" );
    $list76 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TimePoint" ) ) ) );
  }
}
/*
 * 
 * Total time: 183 ms
 * 
 */