package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities";
  public static final String myFingerPrint = "c8a120ceba52b78ab069c6f4fb4e4dbdb3c7ca7c51ff83fad71e4694fd423286";
  private static final SubLSymbol $sym0$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$WN_SKS_REGISTERED;
  private static final SubLSymbol $sym3$WNI_HTML_TERM_COMMENT;
  private static final SubLSymbol $sym4$FORT_P;
  private static final SubLSymbol $sym5$BOOLEANP;
  private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const7$EverythingPSC;
  private static final SubLSymbol $kw8$CONSTANT;
  private static final SubLString $str9$__;
  private static final SubLSymbol $sym10$WNI_HTML_UP_ARROW;
  private static final SubLSymbol $sym11$SYMBOLP;
  private static final SubLList $list12;
  private static final SubLString $str13$_A_is_an_invalid_arrow_type;
  private static final SubLString $str14$_cycdoc_img_cyc_arrow_up_big_gif;
  private static final SubLString $str15$_Indicates_the_more_general_conce;
  private static final SubLString $str16$top;
  private static final SubLString $str17$0;
  private static final SubLSymbol $kw18$GENLS;
  private static final SubLString $str19$genls;
  private static final SubLSymbol $kw20$ISA;
  private static final SubLString $str21$isa;
  private static final SubLString $str22$hypernym;
  private static final SubLSymbol $sym23$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES;
  private static final SubLSymbol $sym24$NAUT_P;
  private static final SubLString $str25$___;
  private static final SubLString $str26$_;
  private static final SubLSymbol $sym27$WNI_SYNSET_LINKS;
  private static final SubLString $str28$_;
  private static final SubLString $str29$___;
  private static final SubLString $str30$http___www_cogsci_princeton_edu_c;
  private static final SubLString $str31$_;
  private static final SubLString $str32$_;
  private static final SubLString $str33$main;
  private static final SubLString $str34$_;
  private static final SubLSymbol $sym35$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER;
  private static final SubLString $str36$____;
  private static final SubLString $str37$hypernym_linked_to_;
  private static final SubLString $str38$Add;
  private static final SubLString $str39$not_linked_;
  private static final SubLSymbol $sym40$WNI_SYNSET_LINKS_FOR_CB_BROWSER;
  private static final SubLString $str41$_cycdoc_img_cb_wordnet_browser_gi;
  private static final SubLString $str42$_WordNet_;
  private static final SubLString $str43$__;
  private static final SubLString $str44$cg_cb_handle_specify_query_;
  private static final SubLSymbol $sym45$WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT;
  private static final SubLSymbol $sym46$NON_DOTTED_LIST_P;
  private static final SubLString $str47$;
  private static final SubLSymbol $sym48$STRINGP;
  private static final SubLSymbol $sym49$WNI_DECODE_TERMS_FROM_HIDDEN_INPUT;
  private static final SubLSymbol $sym50$NOT_TEST_CHAR;
  private static final SubLSymbol $kw51$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym52$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym53$LISTP;
  private static final SubLSymbol $sym54$WNI_IDENTIFIER_TO_FORT;
  private static final SubLSymbol $sym55$WNI_STRING_SYNSET_TERM_MATCHES;
  private static final SubLSymbol $sym56$SET_OR_COLLECTION_;
  private static final SubLSymbol $sym57$INDIVIDUAL_;
  private static final SubLSymbol $sym58$ALIST_P;
  private static final SubLString $str59$retrying_sdbc_connection_timeout_;
  private static final SubLObject $const60$WordNetSynsetImportStatus_ReadyFo;
  private static final SubLString $str61$unmapped_hypernym_chain;
  private static final SubLObject $const62$WordNetSynsetImportStatus_ReadyFo;
  private static final SubLObject $const63$ResearchCycConstant;
  private static final SubLString $str64$retrying_sdbc_connection_timeout_;
  private static final SubLString $str65$cannot_create_new_term_for_;
  private static final SubLObject $const66$ExistingObjectType;
  private static final SubLObject $const67$Individual;
  private static final SubLObject $const68$FirstOrderCollection;
  private static final SubLObject $const69$Collection;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 867L)
  public static SubLObject ensure_wn_sks_registered()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject err_msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          wordnet_utilities.wn_check_sks_registered();
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err_msg )
    {
      sksi_sks_manager.register_sksi_removal_modules_for_skses( $list1 );
    }
    return $kw2$WN_SKS_REGISTERED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 1150L)
  public static SubLObject wni_html_termXcomment(final SubLObject fort, final SubLObject bigP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != Types.booleanp( bigP ) : bigP;
    SubLObject comment = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      comment = kb_accessors.comment( fort, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != bigP )
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      if( NIL != constant_handles.constant_p( fort ) )
      {
        cb_utilities.cb_link( $kw8$CONSTANT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_form( fort, ZERO_INTEGER, NIL );
      }
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      if( NIL != constant_handles.constant_p( fort ) )
      {
        cb_utilities.cb_link( $kw8$CONSTANT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_form( fort, ZERO_INTEGER, NIL );
      }
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str9$__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_princ_cycl_string( comment, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 1940L)
  public static SubLObject wni_html_up_arrow(final SubLObject arrow_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.symbolp( arrow_type ) : arrow_type;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( arrow_type, $list12, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str13$_A_is_an_invalid_arrow_type, arrow_type );
    }
    html_utilities.html_indent( FIVE_INTEGER );
    html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str14$_cycdoc_img_cyc_arrow_up_big_gif );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str15$_Indicates_the_more_general_conce );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $str16$top ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str17$0 );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_subscript_head$.getGlobalValue() );
    if( arrow_type == $kw18$GENLS )
    {
      html_utilities.html_princ( $str19$genls );
    }
    else if( arrow_type == $kw20$ISA )
    {
      html_utilities.html_princ( $str21$isa );
    }
    else
    {
      html_utilities.html_princ( $str22$hypernym );
    }
    html_utilities.html_markup( html_macros.$html_subscript_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 2598L)
  public static SubLObject wni_html_synset_words_gloss_examples(final SubLObject synset, SubLObject highlightP, SubLObject speech_part_offsetP)
  {
    if( highlightP == UNPROVIDED )
    {
      highlightP = T;
    }
    if( speech_part_offsetP == UNPROVIDED )
    {
      speech_part_offsetP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( highlightP ) : highlightP;
    assert NIL != Types.booleanp( speech_part_offsetP ) : speech_part_offsetP;
    final SubLObject html_color = ( NIL != highlightP ) ? html_macros.$html_color_light_cyan$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( FIVE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_color )
    {
      html_utilities.html_markup( html_macros.$html_table_bgcolor$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_color );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          wni_synset_links( synset, highlightP );
          if( NIL != speech_part_offsetP )
          {
            html_utilities.html_indent( FOUR_INTEGER );
            html_utilities.html_princ( wordnet_import.wni_synset_speech_part_offset( synset ) );
          }
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( wordnet_import.wni_synset_gloss( synset ) );
          SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases( synset );
          SubLObject example_phrase = NIL;
          example_phrase = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_princ( $str25$___ );
            html_utilities.html_princ( example_phrase );
            html_utilities.html_princ( $str26$_ );
            cdolist_list_var = cdolist_list_var.rest();
            example_phrase = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 3569L)
  public static SubLObject wni_synset_links(final SubLObject synset, SubLObject strongP)
  {
    if( strongP == UNPROVIDED )
    {
      strongP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( strongP ) : strongP;
    final SubLObject words = wordnet_import.wni_synset_words( synset );
    SubLObject first_wordP = T;
    html_utilities.html_princ( $str28$_ );
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != first_wordP )
      {
        first_wordP = NIL;
      }
      else
      {
        html_utilities.html_princ( $str29$___ );
      }
      final SubLObject wordnet_url = Sequences.cconcatenate( $str30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute( $str31$_, $str32$_, word, UNPROVIDED ) );
      if( NIL != strongP )
      {
        html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( wordnet_url );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str33$main );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( word );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( wordnet_url );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str33$main );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( word );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    html_utilities.html_princ( $str34$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 4440L)
  public static SubLObject wni_html_synset_words_gloss_examples_for_cb_browser(final SubLObject synset)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( FIVE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          wni_synset_links_for_cb_browser( synset );
          html_utilities.html_indent( TWO_INTEGER );
          final SubLObject v_term = wordnet_import.wni_synset_term( synset );
          SubLObject mapped_hypernym = NIL;
          if( NIL == forts.fort_p( v_term ) )
          {
            mapped_hypernym = wordnet_import.wni_hypernym_terms( synset ).first();
          }
          if( NIL != constant_handles.constant_p( v_term ) )
          {
            html_utilities.html_princ( $str36$____ );
            html_utilities.html_indent( TWO_INTEGER );
            cb_utilities.cb_link( $kw8$CONSTANT, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( NIL != forts.fort_p( v_term ) )
          {
            html_utilities.html_princ( $str36$____ );
            html_utilities.html_indent( TWO_INTEGER );
            cb_utilities.cb_form( v_term, ZERO_INTEGER, NIL );
          }
          else if( NIL != constant_handles.constant_p( mapped_hypernym ) )
          {
            html_utilities.html_princ( $str37$hypernym_linked_to_ );
            cb_utilities.cb_link( $kw8$CONSTANT, mapped_hypernym, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( ONE_INTEGER );
            html_utilities.html_submit_input( $str38$Add, UNPROVIDED, UNPROVIDED );
          }
          else if( NIL != forts.fort_p( mapped_hypernym ) )
          {
            html_utilities.html_princ( $str37$hypernym_linked_to_ );
            cb_utilities.cb_form( mapped_hypernym, ZERO_INTEGER, NIL );
            html_utilities.html_indent( ONE_INTEGER );
            html_utilities.html_submit_input( $str38$Add, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            html_utilities.html_princ( $str39$not_linked_ );
            html_utilities.html_submit_input( $str38$Add, UNPROVIDED, UNPROVIDED );
          }
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( wordnet_import.wni_synset_gloss( synset ) );
          SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases( synset );
          SubLObject example_phrase = NIL;
          example_phrase = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_princ( $str25$___ );
            html_utilities.html_princ( example_phrase );
            html_utilities.html_princ( $str26$_ );
            cdolist_list_var = cdolist_list_var.rest();
            example_phrase = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 5802L)
  public static SubLObject wni_synset_links_for_cb_browser(final SubLObject synset)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject words = wordnet_import.wni_synset_words( synset );
    SubLObject first_wordP = T;
    final SubLObject wordnet_url = Sequences.cconcatenate( $str30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute( $str31$_, $str32$_, words.first(), UNPROVIDED ) );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( wordnet_url );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str41$_cycdoc_img_cb_wordnet_browser_gi );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str42$_WordNet_ );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
      }
      html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_princ( $str43$__ );
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != first_wordP )
      {
        first_wordP = NIL;
      }
      else
      {
        html_utilities.html_princ( $str29$___ );
      }
      final SubLObject search_url = Sequences.cconcatenate( $str44$cg_cb_handle_specify_query_, string_utilities.string_substitute( $str31$_, $str32$_, word, UNPROVIDED ) );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( search_url );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str33$main );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( word );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    html_utilities.html_princ( $str34$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 6675L)
  public static SubLObject wni_encode_terms_for_hidden_input(final SubLObject terms)
  {
    assert NIL != list_utilities.non_dotted_list_p( terms ) : terms;
    SubLObject cdolist_list_var = terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject string = $str47$;
    SubLObject first_termP = T;
    SubLObject cdolist_list_var2 = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != first_termP )
      {
        first_termP = NIL;
      }
      else
      {
        string = Sequences.cconcatenate( string, $str32$_ );
      }
      string = Sequences.cconcatenate( string, cb_utilities.cb_fort_identifier( v_term ) );
      cdolist_list_var2 = cdolist_list_var2.rest();
      v_term = cdolist_list_var2.first();
    }
    assert NIL != Types.stringp( string ) : string;
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 7357L)
  public static SubLObject wni_decode_terms_from_hidden_input(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    SubLObject terms = NIL;
    final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding( thread );
    try
    {
      string_utilities.$test_char$.bind( string_utilities.$space_char$.getGlobalValue(), thread );
      SubLObject cdolist_list_var;
      final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words( string, $sym50$NOT_TEST_CHAR, UNPROVIDED );
      SubLObject id_string = NIL;
      id_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw51$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$6 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym52$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              terms = ConsesLow.cons( wni_identifier_to_fort( id_string ), terms );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$6, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw51$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        cdolist_list_var = cdolist_list_var.rest();
        id_string = cdolist_list_var.first();
      }
    }
    finally
    {
      string_utilities.$test_char$.rebind( _prev_bind_0, thread );
    }
    terms = Sequences.nreverse( terms );
    assert NIL != Types.listp( terms ) : terms;
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 7807L)
  public static SubLObject wni_identifier_to_fort(final SubLObject id_string)
  {
    final SubLObject fort = ( NIL != string_utilities.starts_with( id_string, cb_utilities.$cb_constant_id_prefix$.getGlobalValue() ) ) ? constants_high.find_constant_by_internal_id( reader.read_from_string(
        string_utilities.pre_remove( id_string, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        : nart_handles.find_nart_by_id( reader.read_from_string( string_utilities.pre_remove( id_string, cb_utilities.$cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) );
    assert NIL != forts.fort_p( fort ) : fort;
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 8374L)
  public static SubLObject wni_string_synset_term_matches(final SubLObject synset, final SubLObject collectionP)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( collectionP ) : collectionP;
    final SubLObject synset_words = wordnet_import.wni_synset_words( synset );
    SubLObject terms = NIL;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = synset_words;
    SubLObject synset_word = NIL;
    synset_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$7;
      terms = ( cdolist_list_var_$7 = cb_frames.terms_for_browsing( synset_word, T, NIL ) );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$7.first();
      while ( NIL != cdolist_list_var_$7)
      {
        if( NIL != forts.fort_p( v_term ) )
        {
          final SubLObject item_var = v_term;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
        v_term = cdolist_list_var_$7.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset_word = cdolist_list_var.first();
    }
    final SubLObject list_var;
    ans = ( list_var = ( ( NIL != collectionP ) ? list_utilities.find_all_if( Symbols.symbol_function( $sym56$SET_OR_COLLECTION_ ), ans, UNPROVIDED )
        : list_utilities.find_all_if( Symbols.symbol_function( $sym57$INDIVIDUAL_ ), ans, UNPROVIDED ) ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 9391L)
  public static SubLObject wni_complete_after_concept_match(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term, final SubLObject workflow_alist, final SubLObject nowP)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( matched_term ) : matched_term;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    wni_complete_after_comment_existing_term( synset, genl_terms, matched_term, workflow_alist, NIL, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 10084L)
  public static SubLObject wni_complete_after_comment_existing_term(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment,
      final SubLObject nowP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    agenda.halt_agenda( UNPROVIDED );
    SubLObject error_message = NIL;
    SubLObject doneP = NIL;
    SubLObject retry_count = TEN_INTEGER;
    while ( NIL == doneP)
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            wni_complete_after_comment_existing_term_helper( synset, genl_terms, v_term, workflow_alist, comment, nowP );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message && retry_count.numG( ZERO_INTEGER ) )
      {
        retry_count = Numbers.subtract( retry_count, ONE_INTEGER );
        PrintLow.format( T, $str59$retrying_sdbc_connection_timeout_, error_message );
        Threads.sleep( ONE_INTEGER );
      }
      else
      {
        doneP = T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 11117L)
  public static SubLObject wni_complete_after_comment_existing_term_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment,
      final SubLObject nowP)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    wordnet_import.wni_unassert_import_status( $const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP );
    if( NIL != list_utilities.alist_lookup( workflow_alist, $str61$unmapped_hypernym_chain, EQUAL, UNPROVIDED ) )
    {
      if( NIL != comment )
      {
        wordnet_import.wni_assert_comment( v_term, comment, T );
      }
      if( NIL != genl_terms )
      {
        if( NIL != fort_types_interface.collectionP( v_term ) )
        {
          wordnet_import.wni_assert_genls( v_term, genl_terms, T );
        }
        else
        {
          wordnet_import.wni_assert_isa( v_term, genl_terms, T );
        }
      }
      wordnet_import.wni_assert_synset_mapping( v_term, synset, T );
    }
    else
    {
      if( NIL != comment )
      {
        wordnet_import.wni_assert_comment( v_term, comment, nowP );
      }
      if( NIL != genl_terms )
      {
        if( NIL != fort_types_interface.collectionP( v_term ) )
        {
          wordnet_import.wni_assert_genls( v_term, genl_terms, nowP );
        }
        else
        {
          wordnet_import.wni_assert_isa( v_term, genl_terms, nowP );
        }
      }
      wordnet_import.wni_assert_synset_mapping( v_term, synset, nowP );
    }
    wordnet_import.wni_update_synset_with_term( synset, v_term );
    wordnet_import.wni_assert_heuristic_lexicon( synset, workflow_alist, v_term, nowP );
    wordnet_import.wni_assert_import_status( $const62$WordNetSynsetImportStatus_ReadyFo, synset, nowP );
    if( NIL == isa.isaP( v_term, $const63$ResearchCycConstant, UNPROVIDED, UNPROVIDED ) && NIL == nart_handles.nart_p( v_term ) )
    {
      wordnet_import.wni_assert_quoted_isa_workflow_constant( v_term, UNPROVIDED );
    }
    wordnet_import.wni_unlock_synset( synset, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 12767L)
  public static SubLObject wni_complete_after_comment(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.stringp( comment ) : comment;
    assert NIL != Types.booleanp( nowP ) : nowP;
    agenda.halt_agenda( UNPROVIDED );
    SubLObject new_term = NIL;
    SubLObject error_message = NIL;
    SubLObject doneP = NIL;
    SubLObject retry_count = TEN_INTEGER;
    while ( NIL == doneP)
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            new_term = wni_complete_after_comment_helper( synset, genl_terms, name, workflow_alist, comment, nowP );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message && retry_count.numG( ZERO_INTEGER ) )
      {
        retry_count = Numbers.subtract( retry_count, ONE_INTEGER );
        PrintLow.format( T, $str64$retrying_sdbc_connection_timeout_, error_message );
        Threads.sleep( ONE_INTEGER );
      }
      else
      {
        doneP = T;
      }
    }
    assert NIL != forts.fort_p( new_term ) : new_term;
    return new_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 13867L)
  public static SubLObject wni_complete_after_comment_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.stringp( comment ) : comment;
    assert NIL != Types.booleanp( nowP ) : nowP;
    final SubLObject new_term = wordnet_import.wni_create_now( name );
    final SubLObject essential_assertions_nowP = makeBoolean( NIL != nowP || NIL != list_utilities.alist_lookup( workflow_alist, $str61$unmapped_hypernym_chain, EQUAL, UNPROVIDED ) );
    if( NIL == constant_handles.valid_constantP( new_term, UNPROVIDED ) )
    {
      cb_utilities.cb_error( Sequences.cconcatenate( $str65$cannot_create_new_term_for_, name ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    wordnet_import.wni_unassert_import_status( $const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP );
    if( NIL != wordnet_import.wni_synset_collectionP( synset ) )
    {
      wordnet_import.wni_assert_isa( new_term, ConsesLow.list( wni_best_collection_isa( genl_terms ) ), essential_assertions_nowP );
      wordnet_import.wni_assert_genls( new_term, genl_terms, essential_assertions_nowP );
    }
    else
    {
      wordnet_import.wni_assert_isa_individual( new_term, essential_assertions_nowP );
      wordnet_import.wni_assert_isa( new_term, genl_terms, essential_assertions_nowP );
    }
    if( NIL != comment )
    {
      wordnet_import.wni_assert_comment( new_term, comment, essential_assertions_nowP );
    }
    wordnet_import.wni_assert_synset_mapping( new_term, synset, essential_assertions_nowP );
    wordnet_import.wni_update_synset_with_term( synset, new_term );
    wordnet_import.wni_assert_heuristic_lexicon( synset, workflow_alist, new_term, nowP );
    wordnet_import.wni_assert_import_status( $const62$WordNetSynsetImportStatus_ReadyFo, synset, nowP );
    if( NIL != constant_handles.constant_p( new_term ) )
    {
      wordnet_import.wni_assert_quoted_isa_workflow_constant( new_term, UNPROVIDED );
    }
    wordnet_import.wni_assert_reified_using( new_term, nowP );
    wordnet_import.wni_unlock_synset( synset, nowP );
    assert NIL != forts.fort_p( new_term ) : new_term;
    return new_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 15956L)
  public static SubLObject wni_best_collection_isa(final SubLObject genl_terms)
  {
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = genl_terms;
    SubLObject genl_term = NIL;
    genl_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != isa.isaP( genl_term, $const66$ExistingObjectType, UNPROVIDED, UNPROVIDED ) )
      {
        return $const66$ExistingObjectType;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      genl_term = cdolist_list_var2.first();
    }
    cdolist_list_var2 = genl_terms;
    genl_term = NIL;
    genl_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != genls.genlsP( genl_term, $const67$Individual, UNPROVIDED, UNPROVIDED ) )
      {
        return $const68$FirstOrderCollection;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      genl_term = cdolist_list_var2.first();
    }
    return $const69$Collection;
  }

  public static SubLObject declare_cb_wordnet_utilities_file()
  {
    SubLFiles.declareFunction( me, "ensure_wn_sks_registered", "ENSURE-WN-SKS-REGISTERED", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_html_termXcomment", "WNI-HTML-TERM&COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_html_up_arrow", "WNI-HTML-UP-ARROW", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_html_synset_words_gloss_examples", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES", 1, 2, false );
    SubLFiles.declareFunction( me, "wni_synset_links", "WNI-SYNSET-LINKS", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_html_synset_words_gloss_examples_for_cb_browser", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_links_for_cb_browser", "WNI-SYNSET-LINKS-FOR-CB-BROWSER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_encode_terms_for_hidden_input", "WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_decode_terms_from_hidden_input", "WNI-DECODE-TERMS-FROM-HIDDEN-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_identifier_to_fort", "WNI-IDENTIFIER-TO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_string_synset_term_matches", "WNI-STRING-SYNSET-TERM-MATCHES", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_complete_after_concept_match", "WNI-COMPLETE-AFTER-CONCEPT-MATCH", 5, 0, false );
    SubLFiles.declareFunction( me, "wni_complete_after_comment_existing_term", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM", 6, 0, false );
    SubLFiles.declareFunction( me, "wni_complete_after_comment_existing_term_helper", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM-HELPER", 6, 0, false );
    SubLFiles.declareFunction( me, "wni_complete_after_comment", "WNI-COMPLETE-AFTER-COMMENT", 6, 0, false );
    SubLFiles.declareFunction( me, "wni_complete_after_comment_helper", "WNI-COMPLETE-AFTER-COMMENT-HELPER", 6, 0, false );
    SubLFiles.declareFunction( me, "wni_best_collection_isa", "WNI-BEST-COLLECTION-ISA", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_wordnet_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_wordnet_utilities_file()
  {
    access_macros.register_external_symbol( $sym3$WNI_HTML_TERM_COMMENT );
    access_macros.register_external_symbol( $sym10$WNI_HTML_UP_ARROW );
    access_macros.register_external_symbol( $sym23$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES );
    access_macros.register_external_symbol( $sym27$WNI_SYNSET_LINKS );
    access_macros.register_external_symbol( $sym35$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER );
    access_macros.register_external_symbol( $sym40$WNI_SYNSET_LINKS_FOR_CB_BROWSER );
    access_macros.register_external_symbol( $sym45$WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT );
    access_macros.register_external_symbol( $sym49$WNI_DECODE_TERMS_FROM_HIDDEN_INPUT );
    access_macros.register_external_symbol( $sym54$WNI_IDENTIFIER_TO_FORT );
    access_macros.register_external_symbol( $sym55$WNI_STRING_SYNSET_TERM_MATCHES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_wordnet_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_wordnet_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_wordnet_utilities_file();
  }
  static
  {
    me = new cb_wordnet_utilities();
    $sym0$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNet2_0-KS" ) ) );
    $kw2$WN_SKS_REGISTERED = makeKeyword( "WN-SKS-REGISTERED" );
    $sym3$WNI_HTML_TERM_COMMENT = makeSymbol( "WNI-HTML-TERM&COMMENT" );
    $sym4$FORT_P = makeSymbol( "FORT-P" );
    $sym5$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym6$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const7$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw8$CONSTANT = makeKeyword( "CONSTANT" );
    $str9$__ = makeString( ": " );
    $sym10$WNI_HTML_UP_ARROW = makeSymbol( "WNI-HTML-UP-ARROW" );
    $sym11$SYMBOLP = makeSymbol( "SYMBOLP" );
    $list12 = ConsesLow.list( makeKeyword( "GENLS" ), makeKeyword( "ISA" ), makeKeyword( "HYPERNYM" ) );
    $str13$_A_is_an_invalid_arrow_type = makeString( "~A is an invalid arrow-type" );
    $str14$_cycdoc_img_cyc_arrow_up_big_gif = makeString( "/cycdoc/img/cyc-arrow-up-big.gif" );
    $str15$_Indicates_the_more_general_conce = makeString( "[Indicates the more general concept]" );
    $str16$top = makeString( "top" );
    $str17$0 = makeString( "0" );
    $kw18$GENLS = makeKeyword( "GENLS" );
    $str19$genls = makeString( "genls" );
    $kw20$ISA = makeKeyword( "ISA" );
    $str21$isa = makeString( "isa" );
    $str22$hypernym = makeString( "hypernym" );
    $sym23$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES = makeSymbol( "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES" );
    $sym24$NAUT_P = makeSymbol( "NAUT-P" );
    $str25$___ = makeString( "; \"" );
    $str26$_ = makeString( "\"" );
    $sym27$WNI_SYNSET_LINKS = makeSymbol( "WNI-SYNSET-LINKS" );
    $str28$_ = makeString( "(" );
    $str29$___ = makeString( " | " );
    $str30$http___www_cogsci_princeton_edu_c = makeString( "http://www.cogsci.princeton.edu/cgi-bin/webwn2.0?stage=1&amp;word=" );
    $str31$_ = makeString( "+" );
    $str32$_ = makeString( " " );
    $str33$main = makeString( "main" );
    $str34$_ = makeString( ")" );
    $sym35$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER = makeSymbol( "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER" );
    $str36$____ = makeString( "--->" );
    $str37$hypernym_linked_to_ = makeString( "hypernym linked to " );
    $str38$Add = makeString( "Add" );
    $str39$not_linked_ = makeString( "not linked " );
    $sym40$WNI_SYNSET_LINKS_FOR_CB_BROWSER = makeSymbol( "WNI-SYNSET-LINKS-FOR-CB-BROWSER" );
    $str41$_cycdoc_img_cb_wordnet_browser_gi = makeString( "/cycdoc/img/cb/wordnet-browser.gif" );
    $str42$_WordNet_ = makeString( "[WordNet]" );
    $str43$__ = makeString( " (" );
    $str44$cg_cb_handle_specify_query_ = makeString( "cg?cb-handle-specify&query=" );
    $sym45$WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT = makeSymbol( "WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT" );
    $sym46$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $str47$ = makeString( "" );
    $sym48$STRINGP = makeSymbol( "STRINGP" );
    $sym49$WNI_DECODE_TERMS_FROM_HIDDEN_INPUT = makeSymbol( "WNI-DECODE-TERMS-FROM-HIDDEN-INPUT" );
    $sym50$NOT_TEST_CHAR = makeSymbol( "NOT-TEST-CHAR" );
    $kw51$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym52$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym53$LISTP = makeSymbol( "LISTP" );
    $sym54$WNI_IDENTIFIER_TO_FORT = makeSymbol( "WNI-IDENTIFIER-TO-FORT" );
    $sym55$WNI_STRING_SYNSET_TERM_MATCHES = makeSymbol( "WNI-STRING-SYNSET-TERM-MATCHES" );
    $sym56$SET_OR_COLLECTION_ = makeSymbol( "SET-OR-COLLECTION?" );
    $sym57$INDIVIDUAL_ = makeSymbol( "INDIVIDUAL?" );
    $sym58$ALIST_P = makeSymbol( "ALIST-P" );
    $str59$retrying_sdbc_connection_timeout_ = makeString( "retrying sdbc connection timeout: ~A~%" );
    $const60$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetImportStatus-ReadyForPossibleMatching" ) );
    $str61$unmapped_hypernym_chain = makeString( "unmapped-hypernym-chain" );
    $const62$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetImportStatus-ReadyForLexification" ) );
    $const63$ResearchCycConstant = constant_handles.reader_make_constant_shell( makeString( "ResearchCycConstant" ) );
    $str64$retrying_sdbc_connection_timeout_ = makeString( "retrying sdbc connection timeout: ~a~%" );
    $str65$cannot_create_new_term_for_ = makeString( "cannot create new term for " );
    $const66$ExistingObjectType = constant_handles.reader_make_constant_shell( makeString( "ExistingObjectType" ) );
    $const67$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const68$FirstOrderCollection = constant_handles.reader_make_constant_shell( makeString( "FirstOrderCollection" ) );
    $const69$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
  }
}
/*
 * 
 * Total time: 276 ms synthetic
 */