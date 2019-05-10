package com.cyc.cycjava.cycl.rtp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.lexicon_cache;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.string_utilities_lexical;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.rkf_string_weeders;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_constituent_weeders
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders";
  public static final String myFingerPrint = "63db07a3ca69690769326756ea2710a3f389c99b41158af658bf13f1e73e463f";
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1228L)
  private static SubLSymbol $invalid_tp_vp_end_punctuation$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1402L)
  private static SubLSymbol $valid_tp_non_starting_sentential_markers$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1479L)
  private static SubLSymbol $rtp_ranking_data_dir$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1597L)
  private static SubLSymbol $cat_prior_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1647L)
  private static SubLSymbol $tag1_cond_cat_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1705L)
  private static SubLSymbol $tag2_cond_cat_tag1_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1773L)
  private static SubLSymbol $tag3_cond_cat_tag12_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1843L)
  private static SubLSymbol $tag_cond_tag_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1899L)
  private static SubLSymbol $cat_cond_last_tag_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 1965L)
  private static SubLSymbol $cat_prior$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2049L)
  private static SubLSymbol $tag1_cond_cat$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2085L)
  private static SubLSymbol $tag2_cond_cat_tag1$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2126L)
  private static SubLSymbol $tag3_cond_cat_tag12$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2168L)
  private static SubLSymbol $tag_cond_tag$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2203L)
  private static SubLSymbol $cat_cond_last_tag$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2243L)
  private static SubLSymbol $tagger$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLSymbol $dtp_itp_semantics$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4546L)
  private static SubLSymbol $rtp_vbar_templates_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 5697L)
  public static SubLSymbol $use_new_tp_possible_constitP$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 13965L)
  private static SubLSymbol $rtp_contraction_elements$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 16843L)
  private static SubLSymbol $confusing_np_start_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17161L)
  private static SubLSymbol $confusing_nbar_start_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17465L)
  private static SubLSymbol $quantity_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 18515L)
  private static SubLSymbol $prepositional_category_templates$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 20459L)
  private static SubLSymbol $template_to_om_category_mappings$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLString $str2$data_rkf_parse_ranking_;
  private static final SubLString $str3$cat_prior;
  private static final SubLString $str4$tag1_cond_cat;
  private static final SubLString $str5$tag2_cond_cat_tag1;
  private static final SubLString $str6$tag3_cond_cat_tag12;
  private static final SubLString $str7$tag_cond_tag;
  private static final SubLString $str8$cat_cond_last_tag;
  private static final SubLSymbol $sym9$_CAT_PRIOR_;
  private static final SubLSymbol $sym10$_TAG1_COND_CAT_;
  private static final SubLSymbol $sym11$_TAG2_COND_CAT_TAG1_;
  private static final SubLSymbol $sym12$_TAG3_COND_CAT_TAG12_;
  private static final SubLSymbol $sym13$_TAG_COND_TAG_;
  private static final SubLSymbol $sym14$_CAT_COND_LAST_TAG_;
  private static final SubLSymbol $sym15$_TAGGER_;
  private static final SubLSymbol $sym16$ITP_SEMANTICS;
  private static final SubLSymbol $sym17$ITP_SEMANTICS_P;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$PRINT_ITP_SEMANTICS;
  private static final SubLSymbol $sym23$ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$ITP_SEMANTICS_CYCL;
  private static final SubLSymbol $sym26$_CSETF_ITP_SEMANTICS_CYCL;
  private static final SubLSymbol $sym27$ITP_SEMANTICS_CATEGORY;
  private static final SubLSymbol $sym28$_CSETF_ITP_SEMANTICS_CATEGORY;
  private static final SubLSymbol $sym29$ITP_SEMANTICS_FORCE;
  private static final SubLSymbol $sym30$_CSETF_ITP_SEMANTICS_FORCE;
  private static final SubLSymbol $sym31$ITP_SEMANTICS_SUPPORTS;
  private static final SubLSymbol $sym32$_CSETF_ITP_SEMANTICS_SUPPORTS;
  private static final SubLSymbol $sym33$ITP_SEMANTICS_CONFIDENCE;
  private static final SubLSymbol $sym34$_CSETF_ITP_SEMANTICS_CONFIDENCE;
  private static final SubLSymbol $kw35$CYCL;
  private static final SubLSymbol $kw36$CATEGORY;
  private static final SubLSymbol $kw37$FORCE;
  private static final SubLSymbol $kw38$SUPPORTS;
  private static final SubLSymbol $kw39$CONFIDENCE;
  private static final SubLString $str40$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw41$BEGIN;
  private static final SubLSymbol $sym42$MAKE_ITP_SEMANTICS;
  private static final SubLSymbol $kw43$SLOT;
  private static final SubLSymbol $kw44$END;
  private static final SubLSymbol $sym45$VISIT_DEFSTRUCT_OBJECT_ITP_SEMANTICS_METHOD;
  private static final SubLString $str46$__ITP_SEMANTICS__CYCL_;
  private static final SubLString $str47$_;
  private static final SubLSymbol $kw48$UNAVAILABLE;
  private static final SubLString $str49$CAT_;
  private static final SubLString $str50$FORCE_;
  private static final SubLString $str51$SUPPORTS_;
  private static final SubLString $str52$CONFIDENCE_;
  private static final SubLString $str53$_;
  private static final SubLFloat $float54$0_5;
  private static final SubLSymbol $sym55$RTP_VBAR_TEMPLATES_CACHED;
  private static final SubLSymbol $sym56$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const57$EverythingPSC;
  private static final SubLObject $const58$VBarTemplate;
  private static final SubLSymbol $sym59$_RTP_VBAR_TEMPLATES_CACHED_CACHING_STATE_;
  private static final SubLObject $const60$NPTemplate;
  private static final SubLObject $const61$VPTemplate;
  private static final SubLObject $const62$NumberTemplate;
  private static final SubLObject $const63$OrdinalTemplate;
  private static final SubLObject $const64$QuantityTemplate;
  private static final SubLObject $const65$AdjPTemplate;
  private static final SubLObject $const66$AdjPTemplate_Predicative;
  private static final SubLObject $const67$STemplate;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLObject $const70$NBarTemplate;
  private static final SubLString $str71$_S__S__S___new___S_old___S__;
  private static final SubLString $str72$not;
  private static final SubLString $str73$_;
  private static final SubLSymbol $sym74$STRING_EQUAL;
  private static final SubLSymbol $sym75$VERBAL_CATEGORY_;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$STRING_;
  private static final SubLSymbol $sym78$STRINGP;
  private static final SubLString $str79$how;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$_QUANTITY_STRINGS_;
  private static final SubLSymbol $kw82$CLEARED;
  private static final SubLSymbol $kw83$RESET;
  private static final SubLObject $const84$PhysicalPartOfObject;
  private static final SubLSymbol $kw85$X;
  private static final SubLList $list86;
  private static final SubLObject $const87$InferencePSC;
  private static final SubLObject $const88$LogicalField;
  private static final SubLList $list89;
  private static final SubLObject $const90$gerund;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLString $str93$fht;
  private static final SubLSymbol $sym94$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str95$_a__parse_ranking_will_not_be_ava;
  private static final SubLString $str96$Couldn_t_finalize_file_hashtable_;
  private static final SubLList $list97;
  private static final SubLSymbol $kw98$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym99$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw100$CONSTITUENTS;
  private static final SubLSymbol $sym101$VECTOR;
  private static final SubLSymbol $sym102$_;
  private static final SubLSymbol $sym103$RESULT_OF_PARSING_START;
  private static final SubLSymbol $kw104$S;
  private static final SubLSymbol $sym105$PHRASE_P;
  private static final SubLSymbol $sym106$WORD_CATEGORY;
  private static final SubLSymbol $sym107$SENTENCE_P;
  private static final SubLString $str108$RTP_RANK_PARSES_triggered_an_erro;

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_itp_semantics( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $itp_semantics_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_cycl(final SubLObject v_object)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_category(final SubLObject v_object)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_force(final SubLObject v_object)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_supports(final SubLObject v_object)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject itp_semantics_confidence(final SubLObject v_object)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject _csetf_itp_semantics_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject _csetf_itp_semantics_category(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject _csetf_itp_semantics_force(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject _csetf_itp_semantics_supports(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject _csetf_itp_semantics_confidence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_semantics_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject make_itp_semantics(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $itp_semantics_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw35$CYCL ) )
      {
        _csetf_itp_semantics_cycl( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$CATEGORY ) )
      {
        _csetf_itp_semantics_category( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$FORCE ) )
      {
        _csetf_itp_semantics_force( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$SUPPORTS ) )
      {
        _csetf_itp_semantics_supports( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$CONFIDENCE ) )
      {
        _csetf_itp_semantics_confidence( v_new, current_value );
      }
      else
      {
        Errors.error( $str40$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject visit_defstruct_itp_semantics(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw41$BEGIN, $sym42$MAKE_ITP_SEMANTICS, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw35$CYCL, itp_semantics_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw36$CATEGORY, itp_semantics_category( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw37$FORCE, itp_semantics_force( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw38$SUPPORTS, itp_semantics_supports( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw39$CONFIDENCE, itp_semantics_confidence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$END, $sym42$MAKE_ITP_SEMANTICS, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2273L)
  public static SubLObject visit_defstruct_object_itp_semantics_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_itp_semantics( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 2425L)
  public static SubLObject print_itp_semantics(final SubLObject itp, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject cycl = itp_semantics_cycl( itp );
    final SubLObject category = itp_semantics_category( itp );
    final SubLObject force = itp_semantics_force( itp );
    final SubLObject supports = itp_semantics_supports( itp );
    final SubLObject confidence = itp_semantics_confidence( itp );
    streams_high.write_string( $str46$__ITP_SEMANTICS__CYCL_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( cycl, stream );
    streams_high.write_string( $str47$_, stream, UNPROVIDED, UNPROVIDED );
    if( category != $kw48$UNAVAILABLE )
    {
      streams_high.write_string( $str49$CAT_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( category, stream );
      streams_high.write_string( $str47$_, stream, UNPROVIDED, UNPROVIDED );
    }
    if( force != $kw48$UNAVAILABLE )
    {
      streams_high.write_string( $str50$FORCE_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( force, stream );
      streams_high.write_string( $str47$_, stream, UNPROVIDED, UNPROVIDED );
    }
    if( supports != $kw48$UNAVAILABLE )
    {
      streams_high.write_string( $str51$SUPPORTS_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( supports, stream );
      streams_high.write_string( $str47$_, stream, UNPROVIDED, UNPROVIDED );
    }
    if( confidence != $kw48$UNAVAILABLE )
    {
      streams_high.write_string( $str52$CONFIDENCE_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( confidence, stream );
      streams_high.write_string( $str47$_, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str53$_, stream, UNPROVIDED, UNPROVIDED );
    return itp;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 3403L)
  public static SubLObject new_itp_semantics(final SubLObject cycl, SubLObject category, SubLObject force, SubLObject supports, SubLObject confidence)
  {
    if( category == UNPROVIDED )
    {
      category = $kw48$UNAVAILABLE;
    }
    if( force == UNPROVIDED )
    {
      force = $kw48$UNAVAILABLE;
    }
    if( supports == UNPROVIDED )
    {
      supports = $kw48$UNAVAILABLE;
    }
    if( confidence == UNPROVIDED )
    {
      confidence = $kw48$UNAVAILABLE;
    }
    final SubLObject semantics = make_itp_semantics( UNPROVIDED );
    _csetf_itp_semantics_cycl( semantics, cycl );
    _csetf_itp_semantics_category( semantics, category );
    _csetf_itp_semantics_force( semantics, force );
    _csetf_itp_semantics_supports( semantics, supports );
    _csetf_itp_semantics_confidence( semantics, confidence );
    return semantics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 3896L)
  public static SubLObject new_itp_semantics_conf_1(final SubLObject cycl)
  {
    final SubLObject result = new_itp_semantics( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    _csetf_itp_semantics_confidence( result, ONE_INTEGER );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4059L)
  public static SubLObject new_itp_semantics_conf_half(final SubLObject cycl)
  {
    final SubLObject result = new_itp_semantics( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    _csetf_itp_semantics_confidence( result, $float54$0_5 );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4227L)
  public static SubLObject rtp_parse_exp_ranked(final SubLObject string, final SubLObject template, final SubLObject mt)
  {
    return rtp_rank_parses( string, iterative_template_parser.rtp_parse_exp( string, template, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4448L)
  public static SubLObject rtp_vbar_templates()
  {
    return ( NIL != control_vars.kb_loaded() ) ? rtp_vbar_templates_cached() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4546L)
  public static SubLObject clear_rtp_vbar_templates_cached()
  {
    final SubLObject cs = $rtp_vbar_templates_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4546L)
  public static SubLObject remove_rtp_vbar_templates_cached()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rtp_vbar_templates_cached_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4546L)
  public static SubLObject rtp_vbar_templates_cached_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym56$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const57$EverythingPSC, thread );
      ans = genls.all_specs( $const58$VBarTemplate, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4546L)
  public static SubLObject rtp_vbar_templates_cached()
  {
    SubLObject caching_state = $rtp_vbar_templates_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym55$RTP_VBAR_TEMPLATES_CACHED, $sym59$_RTP_VBAR_TEMPLATES_CACHED_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rtp_vbar_templates_cached_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 4704L)
  public static SubLObject tp_possible_constitP_old(final SubLObject template_item, final SubLObject words, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( NIL == rtp_type_checkers.rtp_recursive_itemP( template_item ) )
    {
      return T;
    }
    final SubLObject pcase_var;
    final SubLObject category = pcase_var = template_item.first();
    if( pcase_var.eql( $const60$NPTemplate ) )
    {
      if( NIL == tp_valid_np( category, words, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const61$VPTemplate ) )
    {
      if( NIL == tp_valid_vp( category, words ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const62$NumberTemplate ) )
    {
      if( NIL == tp_valid_number_p( words ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const63$OrdinalTemplate ) )
    {
      if( NIL == tp_valid_number_p( words ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const64$QuantityTemplate ) )
    {
      if( NIL == tp_valid_quantity_p( words ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const65$AdjPTemplate ) )
    {
      if( NIL == tp_valid_adjpP( words ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const66$AdjPTemplate_Predicative ) )
    {
      if( NIL == tp_valid_adjp_predP( words ) )
      {
        return NIL;
      }
    }
    else if( pcase_var.eql( $const67$STemplate ) && NIL == tp_valid_sP( words ) )
    {
      return NIL;
    }
    if( NIL != prepositional_categoryP( category ) && NIL == tp_valid_pp( category, words, mt ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 5753L)
  public static SubLObject tp_possible_constitP(final SubLObject template_item, final SubLObject words, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject category = template_item.first();
    SubLObject possibleP = T;
    if( NIL == $use_new_tp_possible_constitP$.getDynamicValue( thread ) )
    {
      possibleP = tp_possible_constitP_old( template_item, words, mt );
    }
    else if( NIL == rtp_type_checkers.rtp_recursive_itemP( template_item ) )
    {
      possibleP = T;
    }
    else if( NIL == subl_promotions.memberP( category, $list68, UNPROVIDED, UNPROVIDED ) && NIL != list_utilities.lengthG( words, ONE_INTEGER, UNPROVIDED ) && NIL != lexicon_utilities.wh_wordP( words.first() ) )
    {
      possibleP = makeBoolean( category.eql( $const60$NPTemplate ) && NIL != tp_valid_nbar_wordsP( words.rest(), UNPROVIDED ) );
    }
    else if( category.eql( $const60$NPTemplate ) )
    {
      possibleP = tp_valid_np( category, words, UNPROVIDED );
    }
    else if( NIL != subl_promotions.memberP( category, $list69, UNPROVIDED, UNPROVIDED ) && NIL == tp_valid_np( category, words, UNPROVIDED ) )
    {
      possibleP = NIL;
    }
    else if( category.eql( $const70$NBarTemplate ) )
    {
      possibleP = tp_valid_nbar( category, words, UNPROVIDED );
    }
    else if( category.eql( $const61$VPTemplate ) )
    {
      possibleP = tp_valid_vp( category, words );
    }
    else if( NIL != conses_high.member( category, rtp_vbar_templates(), UNPROVIDED, UNPROVIDED ) )
    {
      possibleP = tp_valid_vbar( category, words );
    }
    else if( category.eql( $const62$NumberTemplate ) )
    {
      possibleP = tp_valid_number_p( words );
    }
    else if( category.eql( $const63$OrdinalTemplate ) )
    {
      possibleP = tp_valid_number_p( words );
    }
    else if( category.eql( $const64$QuantityTemplate ) )
    {
      possibleP = tp_valid_quantity_p( words );
    }
    else if( category.eql( $const65$AdjPTemplate ) )
    {
      possibleP = tp_valid_adjpP( words );
    }
    else if( category.eql( $const66$AdjPTemplate_Predicative ) )
    {
      possibleP = tp_valid_adjp_predP( words );
    }
    else if( category.eql( $const67$STemplate ) )
    {
      possibleP = tp_valid_sP( words );
    }
    else if( NIL != prepositional_categoryP( category ) )
    {
      possibleP = tp_valid_pp( category, words, mt );
    }
    if( NIL != $use_new_tp_possible_constitP$.getDynamicValue( thread ) && rtp_vars.$rtp_trace_level$.getDynamicValue( thread ).isPositive() && !possibleP.eql( tp_possible_constitP_old( template_item, words, mt ) )
        && rtp_vars.$rtp_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      recognition.rtp_tracer_output( ONE_INTEGER, ConsesLow.list( $str71$_S__S__S___new___S_old___S__, template_item, words, mt, possibleP, tp_possible_constitP_old( template_item, words, mt ) ) );
    }
    return possibleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 7876L)
  public static SubLObject tp_valid_nbar(final SubLObject category, final SubLObject words, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    return tp_valid_nbar_wordsP( words, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 8024L)
  public static SubLObject tp_valid_nbar_wordsP(final SubLObject words, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( NIL == words )
    {
      return T;
    }
    final SubLObject front_word = words.first();
    final SubLObject back_word = conses_high.last( words, UNPROVIDED ).first();
    if( NIL == valid_tp_nbar_end_stringP( back_word, mt ) || NIL == valid_tp_nbar_start_stringP( front_word ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 8555L)
  public static SubLObject valid_tp_nbar_end_stringP(final SubLObject word, final SubLObject mt)
  {
    if( NIL != subl_promotions.memberP( word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != subl_promotions.memberP( word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != Functions.funcall( rtp_vars.$tp_equal$.getGlobalValue(), word, $str72$not ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 8862L)
  public static SubLObject valid_tp_nbar_start_stringP(final SubLObject word)
  {
    if( NIL != subl_promotions.memberP( word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED ) )
    {
      return NIL;
    }
    return possible_tp_nbar_start_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 9101L)
  public static SubLObject tp_valid_np(final SubLObject category, final SubLObject words, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    return tp_valid_np_wordsP( words, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 9243L)
  public static SubLObject tp_valid_np_wordsP(final SubLObject words, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
    }
    if( NIL == words )
    {
      return T;
    }
    if( NIL != list_utilities.lengthE( words, ONE_INTEGER, UNPROVIDED ) )
    {
      return tp_valid_single_word_npP( words, mt );
    }
    if( NIL != rkf_string_weeders.rkf_unambiguous_non_possessive_pronoun_stringP( words.first() ) )
    {
      return list_utilities.lengthE( words, ONE_INTEGER, UNPROVIDED );
    }
    final SubLObject front_word = words.first();
    final SubLObject back_word = conses_high.last( words, UNPROVIDED ).first();
    if( NIL == valid_tp_np_end_stringP( back_word, mt ) || NIL == valid_tp_np_start_stringP( front_word ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 9742L)
  public static SubLObject tp_valid_single_word_npP(final SubLObject words, final SubLObject mt)
  {
    return makeBoolean( NIL != rkf_string_weeders.rkf_pronoun_stringP( words.first() ) || NIL != rkf_string_weeders.rkf_noun_stringP( words.first(), mt ) || NIL != rkf_string_weeders.rkf_name_stringP( words.first(), mt )
        || NIL != rkf_string_weeders.rkf_unknown_stringP( words.first(), mt ) || NIL != rkf_string_weeders.rkf_number_stringP( words.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 10035L)
  public static SubLObject valid_tp_np_end_stringP(final SubLObject word, final SubLObject mt)
  {
    if( NIL != subl_promotions.memberP( word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != subl_promotions.memberP( word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != Functions.funcall( rtp_vars.$tp_equal$.getGlobalValue(), word, $str72$not ) )
    {
      return NIL;
    }
    return possible_tp_np_end_stringP( word, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 10362L)
  public static SubLObject valid_tp_np_start_stringP(final SubLObject word)
  {
    if( NIL != subl_promotions.memberP( word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED ) )
    {
      return NIL;
    }
    return possible_tp_np_start_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 10551L)
  public static SubLObject tp_valid_sP(final SubLObject words)
  {
    SubLObject found_a_verbP = NIL;
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject i = NIL;
    list_var = words;
    word = list_var.first();
    for( i = ZERO_INTEGER; NIL == found_a_verbP && NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != rkf_string_weeders.rkf_verb_stringP( word ) )
      {
        found_a_verbP = T;
      }
      else if( word.equal( $str73$_ ) )
      {
        final SubLObject next_word = ConsesLow.nth( number_utilities.f_1X( i ), words );
        found_a_verbP = rkf_string_weeders.rkf_verb_stringP( Sequences.cconcatenate( word, next_word ) );
      }
    }
    return found_a_verbP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 10974L)
  public static SubLObject tp_valid_vbar(final SubLObject category, final SubLObject words)
  {
    if( NIL == words )
    {
      return T;
    }
    final SubLObject front_word = words.first();
    final SubLObject back_word = list_utilities.last_one( words );
    if( NIL == valid_tp_vp_end_stringP( back_word ) || NIL == valid_tp_vp_start_stringP( front_word ) )
    {
      return NIL;
    }
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject i = NIL;
    list_var = words;
    word = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != rkf_string_weeders.rkf_verb_stringP( word ) )
      {
        return T;
      }
      if( word.equal( $str73$_ ) )
      {
        final SubLObject next_word = ConsesLow.nth( number_utilities.f_1X( i ), words );
        if( NIL != rkf_string_weeders.rkf_verb_stringP( Sequences.cconcatenate( word, next_word ) ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 11581L)
  public static SubLObject valid_tp_vbar_start_stringP(final SubLObject word)
  {
    return valid_tp_vp_start_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 11733L)
  public static SubLObject valid_tp_vbar_end_stringP(final SubLObject word)
  {
    return valid_tp_vp_end_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 11823L)
  public static SubLObject tp_valid_vp(final SubLObject category, final SubLObject words)
  {
    if( NIL == words )
    {
      return T;
    }
    final SubLObject front_word = words.first();
    final SubLObject back_word = conses_high.last( words, UNPROVIDED ).first();
    if( NIL == valid_tp_vp_end_stringP( back_word ) || NIL == valid_tp_vp_start_stringP( front_word ) )
    {
      return NIL;
    }
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject i = NIL;
    list_var = words;
    word = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != rkf_string_weeders.rkf_verb_stringP( word ) )
      {
        return T;
      }
      if( word.equal( $str73$_ ) )
      {
        final SubLObject next_word = ConsesLow.nth( number_utilities.f_1X( i ), words );
        if( NIL != rkf_string_weeders.rkf_verb_stringP( Sequences.cconcatenate( word, next_word ) ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 12431L)
  public static SubLObject valid_tp_vp_start_stringP(final SubLObject word)
  {
    if( NIL != rtp_contraction_elementP( word ) )
    {
      return T;
    }
    if( word.equalp( $str72$not ) || ( NIL != rkf_string_weeders.rkf_preposition_stringP( word ) && NIL == rkf_string_weeders.rkf_verb_stringP( word ) ) )
    {
      return NIL;
    }
    return possible_tp_vp_start_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 12762L)
  public static SubLObject valid_tp_vp_end_stringP(final SubLObject word)
  {
    if( NIL != subl_promotions.memberP( word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), Symbols.symbol_function( $sym74$STRING_EQUAL ), UNPROVIDED ) )
    {
      return NIL;
    }
    return possible_tp_vp_end_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 12940L)
  public static SubLObject tp_unambiguous_verbP(final SubLObject word, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != rkf_string_weeders.rkf_verb_stringP( word ) && NIL == lexicon_accessors.denots_of_name_string( word, lexicon_vars.$misspellingsP$.getDynamicValue( thread ), mt, UNPROVIDED )
        && NIL == list_utilities.sublisp_boolean( list_utilities.find_if_not( $sym75$VERBAL_CATEGORY_, lexicon_accessors.pos_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 13198L)
  public static SubLObject tp_valid_number_p(final SubLObject words)
  {
    if( ( NIL == number_prefix_p( words.first() ) && NIL == string_utilities_lexical.denots_english_number_p( words.first() ) ) || NIL == string_utilities_lexical.denots_english_number_p( conses_high.last( words,
        UNPROVIDED ).first() ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 13488L)
  public static SubLObject number_prefix_p(final SubLObject string)
  {
    return conses_high.member( string, $list76, $sym77$STRING_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 13579L)
  public static SubLObject possible_tp_vp_start_stringP(final SubLObject string)
  {
    return makeBoolean( NIL != rtp_contraction_elementP( string ) || NIL != rkf_string_weeders.rkf_verb_stringP( string ) || NIL != rkf_string_weeders.rkf_adverb_stringP( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 13854L)
  public static SubLObject rtp_contraction_elementP(final SubLObject string)
  {
    return conses_high.member( string, get_contraction_elements(), EQUALP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 14101L)
  public static SubLObject get_contraction_elements()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $rtp_contraction_elements$.getDynamicValue( thread ) )
    {
      rtp_datastructures.maybe_initialize_rtp_contractions_table( UNPROVIDED );
      SubLObject cdolist_list_var = rtp_datastructures.$rtp_contractions_table$.getDynamicValue( thread );
      SubLObject alist_elt = NIL;
      alist_elt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$1 = alist_elt.rest().first();
        SubLObject contraction = NIL;
        contraction = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          SubLObject cdolist_list_var_$2 = list_utilities.find_all_if( $sym78$STRINGP, contraction, UNPROVIDED );
          SubLObject contraction_elt = NIL;
          contraction_elt = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            final SubLObject item_var = contraction_elt;
            if( NIL == conses_high.member( item_var, $rtp_contraction_elements$.getDynamicValue( thread ), EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              $rtp_contraction_elements$.setDynamicValue( ConsesLow.cons( item_var, $rtp_contraction_elements$.getDynamicValue( thread ) ), thread );
            }
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            contraction_elt = cdolist_list_var_$2.first();
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          contraction = cdolist_list_var_$1.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        alist_elt = cdolist_list_var.first();
      }
    }
    return $rtp_contraction_elements$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 14506L)
  public static SubLObject possible_tp_vp_end_stringP(final SubLObject string)
  {
    return makeBoolean( NIL == impossible_tp_phrase_end_stringP( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 14731L)
  public static SubLObject possible_tp_np_start_stringP(final SubLObject string)
  {
    if( string.equalp( $str79$how ) )
    {
      return T;
    }
    return makeBoolean( NIL == lexicon_accessors.verb_only_stringP( string ) && ( NIL != confusing_np_start_stringP( string ) || ( NIL == rkf_string_weeders.rkf_preposition_stringP( string ) && NIL == rkf_string_weeders
        .rkf_conjunction_stringP( string ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 15316L)
  public static SubLObject possible_tp_nbar_start_stringP(final SubLObject string)
  {
    return makeBoolean( NIL == lexicon_accessors.verb_only_stringP( string ) && ( NIL != confusing_nbar_start_stringP( string ) || ( NIL == rkf_string_weeders.rkf_preposition_stringP( string )
        && NIL == rkf_string_weeders.rkf_determiner_stringP( string ) && NIL == rkf_string_weeders.rkf_conjunction_stringP( string ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 15740L)
  public static SubLObject possible_tp_pp_start_stringP(final SubLObject string)
  {
    return rkf_string_weeders.rkf_preposition_stringP( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 15837L)
  public static SubLObject possible_tp_pp_end_stringP(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return possible_tp_np_end_stringP( string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 15973L)
  public static SubLObject possible_tp_np_end_stringP(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return makeBoolean( NIL != rkf_string_weeders.rkf_pronoun_stringP( string ) || NIL != rkf_string_weeders.rkf_preposition_stringP( string ) || NIL != rkf_string_weeders.rkf_noun_stringP( string, mt )
        || NIL != rkf_string_weeders.rkf_number_stringP( string ) || NIL == lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 16397L)
  public static SubLObject impossible_tp_phrase_end_stringP(final SubLObject string)
  {
    return makeBoolean( NIL == rkf_string_weeders.rkf_noun_stringP( string, UNPROVIDED ) && NIL == rkf_string_weeders.rkf_pronoun_stringP( string ) && NIL == rkf_string_weeders.rkf_verb_stringP( string )
        && NIL == rkf_string_weeders.rkf_adverb_stringP( string ) && NIL == rkf_string_weeders.rkf_preposition_stringP( string ) && NIL == rkf_string_weeders.rkf_adjective_stringP( string ) && ( NIL != rkf_string_weeders
            .rkf_conjunction_stringP( string ) || NIL != rkf_string_weeders.rkf_determiner_stringP( string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17044L)
  public static SubLObject confusing_np_start_stringP(final SubLObject string)
  {
    return conses_high.member( string, $confusing_np_start_strings$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17344L)
  public static SubLObject confusing_nbar_start_stringP(final SubLObject string)
  {
    return conses_high.member( string, $confusing_nbar_start_strings$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17510L)
  public static SubLObject tp_valid_quantity_p(final SubLObject words)
  {
    if( NIL == $quantity_strings$.getGlobalValue() )
    {
      $quantity_strings$.setGlobalValue( get_quantity_strings() );
    }
    return set.set_memberP( string_utilities.bunge( words, UNPROVIDED ), $quantity_strings$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17853L)
  public static SubLObject clear_tp_valid_quantity_p()
  {
    $quantity_strings$.setGlobalValue( NIL );
    return $kw82$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 17952L)
  public static SubLObject reset_tp_valid_quantity_p()
  {
    $quantity_strings$.setGlobalValue( get_quantity_strings() );
    return $kw83$RESET;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 18068L)
  public static SubLObject get_quantity_strings()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject result_set = set.new_set( EQUALP, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject term_list = cdolist_list_var = ConsesLow.cons( $const84$PhysicalPartOfObject, backward.removal_ask_variable( $kw85$X, $list86, ( NIL != rtp_vars.$rtp_semantic_mt$.getDynamicValue( thread ) )
        ? rtp_vars.$rtp_semantic_mt$.getDynamicValue( thread )
        : $const87$InferencePSC, UNPROVIDED, UNPROVIDED ) );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == nart_handles.nart_p( v_term ) || NIL == isa.isaP( v_term, $const88$LogicalField, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$3 = pph_methods_lexicon.all_phrases_for_term( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject item = NIL;
        item = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          set.set_add( item, result_set );
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          item = cdolist_list_var_$3.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return result_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 18702L)
  public static SubLObject prepositional_categoryP(final SubLObject category)
  {
    return subl_promotions.memberP( category, $prepositional_category_templates$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 18877L)
  public static SubLObject tp_valid_pp(final SubLObject category, final SubLObject words, final SubLObject mt)
  {
    if( NIL == words )
    {
      return T;
    }
    if( Sequences.length( words ).numL( TWO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject front_word = words.first();
    final SubLObject back_word = conses_high.last( words, UNPROVIDED ).first();
    if( NIL == valid_tp_pp_end_stringP( back_word, mt ) || NIL == valid_tp_pp_start_stringP( front_word ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != tp_unambiguous_verbP( word, UNPROVIDED ) && NIL == rkf_string_weeders.rkf_adjective_stringP( word ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 19453L)
  public static SubLObject valid_tp_pp_end_stringP(final SubLObject word, final SubLObject mt)
  {
    if( NIL != subl_promotions.memberP( word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), Symbols.symbol_function( $sym74$STRING_EQUAL ), UNPROVIDED ) )
    {
      return NIL;
    }
    return possible_tp_pp_end_stringP( word, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 19637L)
  public static SubLObject valid_tp_pp_start_stringP(final SubLObject word)
  {
    return possible_tp_pp_start_stringP( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 19732L)
  public static SubLObject tp_valid_adjpP(final SubLObject words)
  {
    final SubLObject first_word = words.first();
    final SubLObject last_word = conses_high.last( words, UNPROVIDED ).first();
    return makeBoolean( ( NIL != rkf_string_weeders.rkf_adjective_stringP( first_word ) || ( NIL == rkf_string_weeders.rkf_determiner_stringP( first_word ) && NIL == rkf_string_weeders.rkf_conjunction_stringP(
        first_word ) ) ) && NIL != rkf_string_weeders.rkf_adjective_stringP( last_word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 20061L)
  public static SubLObject tp_valid_adjp_predP(final SubLObject words)
  {
    final SubLObject last_word = conses_high.last( words, UNPROVIDED ).first();
    final SubLObject words_of_last_word = lexicon_cache.words_of_string( last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject gerund_freeP = NIL;
    if( NIL == tp_valid_adjpP( words ) )
    {
      return NIL;
    }
    if( NIL == gerund_freeP )
    {
      SubLObject csome_list_var = words_of_last_word;
      SubLObject word = NIL;
      word = csome_list_var.first();
      while ( NIL == gerund_freeP && NIL != csome_list_var)
      {
        if( NIL == subl_promotions.memberP( $const90$gerund, lexicon_accessors.preds_of_stringXword( last_word, word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          gerund_freeP = T;
        }
        csome_list_var = csome_list_var.rest();
        word = csome_list_var.first();
      }
    }
    if( NIL != gerund_freeP )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 21759L)
  public static SubLObject template_to_om_categories(final SubLObject template_category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject categories = conses_high.assoc( template_category, $template_to_om_category_mappings$.getDynamicValue( thread ), EQ, UNPROVIDED ).rest();
    return ( NIL != categories ) ? categories : $list92;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 22134L)
  public static SubLObject rtp_ranking_filename(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return file_utilities.relative_filename( $rtp_ranking_data_dir$.getDynamicValue( thread ), filename, $str93$fht );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 22293L)
  public static SubLObject rtp_parse_ranking_init()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject problem = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym94$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == file_hash_table.file_hash_table_p( $cat_prior$.getGlobalValue() ) )
          {
            $cat_prior$.setGlobalValue( file_hash_table.open_file_hash_table( rtp_ranking_filename( $cat_prior_file$.getGlobalValue() ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( NIL == file_hash_table.file_hash_table_p( $tag1_cond_cat$.getGlobalValue() ) )
          {
            $tag1_cond_cat$.setGlobalValue( file_hash_table.open_file_hash_table( rtp_ranking_filename( $tag1_cond_cat_file$.getGlobalValue() ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( NIL == file_hash_table.file_hash_table_p( $tag2_cond_cat_tag1$.getGlobalValue() ) )
          {
            $tag2_cond_cat_tag1$.setGlobalValue( file_hash_table.open_file_hash_table( rtp_ranking_filename( $tag2_cond_cat_tag1_file$.getGlobalValue() ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( NIL == file_hash_table.file_hash_table_p( $tag3_cond_cat_tag12$.getGlobalValue() ) )
          {
            $tag3_cond_cat_tag12$.setGlobalValue( file_hash_table.open_file_hash_table( rtp_ranking_filename( $tag3_cond_cat_tag12_file$.getGlobalValue() ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( NIL == file_hash_table.file_hash_table_p( $tag_cond_tag$.getGlobalValue() ) )
          {
            $tag_cond_tag$.setGlobalValue( file_hash_table.open_file_hash_table( rtp_ranking_filename( $tag_cond_tag_file$.getGlobalValue() ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( NIL == file_hash_table.file_hash_table_p( $cat_cond_last_tag$.getGlobalValue() ) )
          {
            $cat_cond_last_tag$.setGlobalValue( file_hash_table.open_file_hash_table( rtp_ranking_filename( $cat_cond_last_tag_file$.getGlobalValue() ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( NIL == pos_tagger.tagger_p( $tagger$.getGlobalValue() ) )
          {
            $tagger$.setGlobalValue( pos_tagger.new_tagger( UNPROVIDED ) );
          }
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
      problem = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != problem )
    {
      Errors.warn( $str95$_a__parse_ranking_will_not_be_ava, problem );
      rtp_parse_ranking_finalize();
    }
    return makeBoolean( NIL == problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 23576L)
  public static SubLObject rtp_parse_ranking_finalize()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject problem = NIL;
    SubLObject cdolist_list_var = $list97;
    SubLObject fht_symbol = NIL;
    fht_symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject fht = Symbols.symbol_value( fht_symbol );
      if( NIL != file_hash_table.file_hash_table_p( fht ) )
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym94$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              file_hash_table.finalize_file_hash_table( fht );
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
          problem = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != problem )
        {
          Errors.warn( $str96$Couldn_t_finalize_file_hashtable_, fht );
        }
      }
      Symbols.set( fht_symbol, NIL );
      cdolist_list_var = cdolist_list_var.rest();
      fht_symbol = cdolist_list_var.first();
    }
    if( NIL != pos_tagger.tagger_p( $tagger$.getGlobalValue() ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw98$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym99$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            pos_tagger.finalize_tagger( $tagger$.getGlobalValue() );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw98$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    $tagger$.setGlobalValue( NIL );
    return makeBoolean( NIL == problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 24181L)
  public static SubLObject rtp_parse_ranking_initializedP()
  {
    return makeBoolean( NIL != tagger_initializedP() && NIL != file_hash_table.file_hash_table_p( $cat_prior$.getGlobalValue() ) && NIL != file_hash_table.file_hash_table_p( $tag1_cond_cat$.getGlobalValue() )
        && NIL != file_hash_table.file_hash_table_p( $tag2_cond_cat_tag1$.getGlobalValue() ) && NIL != file_hash_table.file_hash_table_p( $tag3_cond_cat_tag12$.getGlobalValue() ) && NIL != file_hash_table
            .file_hash_table_p( $tag_cond_tag$.getGlobalValue() ) && NIL != file_hash_table.file_hash_table_p( $cat_cond_last_tag$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 24534L)
  public static SubLObject tagger_initializedP()
  {
    return pos_tagger.tagger_p( $tagger$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 24605L)
  public static SubLObject rop2phrase(final SubLObject sentence, final SubLObject rop)
  {
    SubLObject words = NIL;
    SubLObject cdolist_list_var = parsing_utilities.result_of_parsing_span_wXo_thelist( rop );
    SubLObject index = NIL;
    index = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      words = ConsesLow.cons( document.sentence_get( sentence, index ), words );
      cdolist_list_var = cdolist_list_var.rest();
      index = cdolist_list_var.first();
    }
    return document.new_phrase( ConsesLow.list( $kw100$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym101$VECTOR ), Sequences.nreverse( words ) ), $kw36$CATEGORY, parsing_utilities
        .result_of_parsing_category( rop ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 25040L)
  public static SubLObject parse2sentence(final SubLObject sentence, final SubLObject cycl)
  {
    SubLObject constituents = NIL;
    SubLObject index = ZERO_INTEGER;
    SubLObject words = NIL;
    SubLObject rops = NIL;
    if( cycl.isList() )
    {
      SubLObject cdolist_list_var = cycl;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != parsing_utilities.result_of_parsing_formulaP( element ) )
        {
          rops = ConsesLow.cons( element, rops );
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
    }
    SubLObject cdolist_list_var = Sort.sort( rops, Symbols.symbol_function( $sym102$_ ), Symbols.symbol_function( $sym103$RESULT_OF_PARSING_START ) );
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      words = NIL;
      if( !parsing_utilities.result_of_parsing_start( element ).eql( index ) )
      {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for( cdotimes_end_var = Numbers.subtract( parsing_utilities.result_of_parsing_start( element ), index ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          words = ConsesLow.cons( document.sentence_get( sentence, Numbers.add( i, index ) ), words );
        }
        constituents = ConsesLow.cons( document.new_phrase( ConsesLow.list( $kw36$CATEGORY, $kw85$X, $kw100$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym101$VECTOR ), Sequences.nreverse( words ) ) ) ),
            constituents );
      }
      constituents = ConsesLow.cons( rop2phrase( sentence, element ), constituents );
      index = number_utilities.f_1X( parsing_utilities.result_of_parsing_end( element ) );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return document.new_phrase( ConsesLow.list( $kw100$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym101$VECTOR ), Sequences.nreverse( constituents ) ), $kw36$CATEGORY, $kw104$S ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 26452L)
  public static SubLObject cat_prior(final SubLObject template)
  {
    SubLObject p = ZERO_INTEGER;
    SubLObject cdolist_list_var = template_to_om_categories( template );
    SubLObject cat = NIL;
    cat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      p = Numbers.add( p, Numbers.exp( file_hash_table.get_file_hash_table( cat, $cat_prior$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue() ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      cat = cdolist_list_var.first();
    }
    return Numbers.log( p, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 26773L)
  public static SubLObject tag1_cond_cat(final SubLObject tag1, final SubLObject template)
  {
    SubLObject p = ZERO_INTEGER;
    SubLObject cdolist_list_var = template_to_om_categories( template );
    SubLObject cat = NIL;
    cat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      p = Numbers.add( p, Numbers.exp( file_hash_table.get_file_hash_table( ConsesLow.list( tag1, cat ), $tag1_cond_cat$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue() ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      cat = cdolist_list_var.first();
    }
    return Numbers.log( p, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 27096L)
  public static SubLObject tag2_cond_cat_tag1(final SubLObject tag2, final SubLObject template, final SubLObject tag1)
  {
    SubLObject p = ZERO_INTEGER;
    SubLObject cdolist_list_var = template_to_om_categories( template );
    SubLObject cat = NIL;
    cat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      p = Numbers.add( p, Numbers.exp( file_hash_table.get_file_hash_table( ConsesLow.list( tag2, cat, tag1 ), $tag2_cond_cat_tag1$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue() ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      cat = cdolist_list_var.first();
    }
    return Numbers.log( p, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 27485L)
  public static SubLObject tag3_cond_cat_tag12(final SubLObject tag3, final SubLObject template, final SubLObject tag1, final SubLObject tag2)
  {
    SubLObject p = ZERO_INTEGER;
    SubLObject cdolist_list_var = template_to_om_categories( template );
    SubLObject cat = NIL;
    cat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      p = Numbers.add( p, Numbers.exp( file_hash_table.get_file_hash_table( ConsesLow.list( tag3, cat, tag1, tag2 ), $tag3_cond_cat_tag12$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue() ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      cat = cdolist_list_var.first();
    }
    return Numbers.log( p, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 27904L)
  public static SubLObject cat_cond_last_tag(final SubLObject template, final SubLObject tagx)
  {
    SubLObject p = ZERO_INTEGER;
    SubLObject cdolist_list_var = template_to_om_categories( template );
    SubLObject cat = NIL;
    cat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      p = Numbers.add( p, Numbers.exp( file_hash_table.get_file_hash_table( ConsesLow.list( cat, tagx ), $cat_cond_last_tag$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue() ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      cat = cdolist_list_var.first();
    }
    return Numbers.log( p, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 28240L)
  public static SubLObject tag_cond_tag(final SubLObject tag2, final SubLObject tag1)
  {
    return file_hash_table.get_file_hash_table( ConsesLow.list( tag2, tag1 ), $tag_cond_tag$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 28450L)
  public static SubLObject rtp_phrase_probability(final SubLObject phrase)
  {
    assert NIL != document.phrase_p( phrase ) : phrase;
    if( document.phrase_category( phrase ) == $kw85$X )
    {
      return ZERO_INTEGER;
    }
    final SubLObject category = document.phrase_category( phrase );
    final SubLObject tags = Mapping.mapcar( Symbols.symbol_function( $sym106$WORD_CATEGORY ), document.sign_yield( phrase ) );
    SubLObject probability = NIL;
    probability = Numbers.add( new SubLObject[] { cat_prior( category ), tag1_cond_cat( tags.first(), category ), ( NIL != conses_high.second( tags ) ) ? tag2_cond_cat_tag1( conses_high.second( tags ), category, tags
        .first() ) : ZERO_INTEGER, ( NIL != conses_high.third( tags ) ) ? tag3_cond_cat_tag12( conses_high.third( tags ), category, tags.first(), conses_high.second( tags ) ) : ZERO_INTEGER, cat_cond_last_tag( category,
            conses_high.last( tags, UNPROVIDED ).first() )
    } );
    SubLObject remaining = NIL;
    SubLObject tag1 = NIL;
    SubLObject tag2 = NIL;
    remaining = conses_high.nthcdr( TWO_INTEGER, tags );
    tag1 = remaining.first();
    for( tag2 = conses_high.second( remaining ); NIL != tag2; tag2 = conses_high.second( remaining ) )
    {
      probability = Numbers.add( probability, tag_cond_tag( tag2, tag1 ) );
      remaining = remaining.rest();
      tag1 = remaining.first();
    }
    return probability;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 29762L)
  public static SubLObject rtp_sentence_probability(final SubLObject sentence)
  {
    assert NIL != document.sentence_p( sentence ) : sentence;
    SubLObject probability = pos_tagger.$certainty$.getGlobalValue();
    final SubLObject vector_var = document.sign_constituents( sentence );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      probability = Numbers.add( probability, rtp_phrase_probability( daughter ) );
    }
    return probability;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-constituent-weeders.lisp", position = 30264L)
  public static SubLObject rtp_rank_parses(final SubLObject string, final SubLObject parses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == rtp_parse_ranking_initializedP() )
    {
      rtp_parse_ranking_init();
    }
    if( NIL == rtp_parse_ranking_initializedP() )
    {
      return parses;
    }
    SubLObject problem = NIL;
    final SubLObject new_parses = conses_high.copy_tree( parses );
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym94$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject sections = rtp_iterators.new_itp_result_iterator( new_parses, UNPROVIDED, UNPROVIDED );
          final SubLObject words = pos_tagger.tagger_tag_sentence( $tagger$.getGlobalValue(), document.new_sentence( string, UNPROVIDED ) );
          SubLObject sentence = NIL;
          SubLObject parse = NIL;
          while ( NIL == rtp_iterators.itp_result_iterator_doneP( sections ))
          {
            final SubLObject cycls = rtp_iterators.itp_result_iterator_curr( sections );
            while ( NIL == rtp_iterators.itp_section_iterator_doneP( cycls ))
            {
              parse = rtp_iterators.itp_section_iterator_curr( cycls );
              sentence = parse2sentence( words, parse );
              rtp_iterators.itp_section_iterator_set_curr( cycls, new_itp_semantics( parse, $kw48$UNAVAILABLE, $kw48$UNAVAILABLE, $kw48$UNAVAILABLE, rtp_sentence_probability( sentence ) ) );
              rtp_iterators.itp_section_iterator_next( cycls );
            }
            rtp_iterators.itp_result_iterator_next( sections );
          }
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
      problem = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != problem )
    {
      rtp_parse_ranking_finalize();
      Errors.warn( $str108$RTP_RANK_PARSES_triggered_an_erro );
      return parses;
    }
    return new_parses;
  }

  public static SubLObject declare_rtp_constituent_weeders_file()
  {
    SubLFiles.declareFunction( me, "itp_semantics_print_function_trampoline", "ITP-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_semantics_p", "ITP-SEMANTICS-P", 1, 0, false );
    new $itp_semantics_p$UnaryFunction();
    SubLFiles.declareFunction( me, "itp_semantics_cycl", "ITP-SEMANTICS-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_semantics_category", "ITP-SEMANTICS-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_semantics_force", "ITP-SEMANTICS-FORCE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_semantics_supports", "ITP-SEMANTICS-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_semantics_confidence", "ITP-SEMANTICS-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_semantics_cycl", "_CSETF-ITP-SEMANTICS-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_semantics_category", "_CSETF-ITP-SEMANTICS-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_semantics_force", "_CSETF-ITP-SEMANTICS-FORCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_semantics_supports", "_CSETF-ITP-SEMANTICS-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_semantics_confidence", "_CSETF-ITP-SEMANTICS-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_itp_semantics", "MAKE-ITP-SEMANTICS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_itp_semantics", "VISIT-DEFSTRUCT-ITP-SEMANTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_itp_semantics_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SEMANTICS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_itp_semantics", "PRINT-ITP-SEMANTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "new_itp_semantics", "NEW-ITP-SEMANTICS", 1, 4, false );
    SubLFiles.declareFunction( me, "new_itp_semantics_conf_1", "NEW-ITP-SEMANTICS-CONF-1", 1, 0, false );
    SubLFiles.declareFunction( me, "new_itp_semantics_conf_half", "NEW-ITP-SEMANTICS-CONF-HALF", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_parse_exp_ranked", "RTP-PARSE-EXP-RANKED", 3, 0, false );
    SubLFiles.declareFunction( me, "rtp_vbar_templates", "RTP-VBAR-TEMPLATES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_rtp_vbar_templates_cached", "CLEAR-RTP-VBAR-TEMPLATES-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rtp_vbar_templates_cached", "REMOVE-RTP-VBAR-TEMPLATES-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "rtp_vbar_templates_cached_internal", "RTP-VBAR-TEMPLATES-CACHED-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "rtp_vbar_templates_cached", "RTP-VBAR-TEMPLATES-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "tp_possible_constitP_old", "TP-POSSIBLE-CONSTIT?-OLD", 2, 1, false );
    SubLFiles.declareFunction( me, "tp_possible_constitP", "TP-POSSIBLE-CONSTIT?", 2, 1, false );
    SubLFiles.declareFunction( me, "tp_valid_nbar", "TP-VALID-NBAR", 2, 1, false );
    SubLFiles.declareFunction( me, "tp_valid_nbar_wordsP", "TP-VALID-NBAR-WORDS?", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_tp_nbar_end_stringP", "VALID-TP-NBAR-END-STRING?", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_nbar_start_stringP", "VALID-TP-NBAR-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_np", "TP-VALID-NP", 2, 1, false );
    SubLFiles.declareFunction( me, "tp_valid_np_wordsP", "TP-VALID-NP-WORDS?", 1, 1, false );
    SubLFiles.declareFunction( me, "tp_valid_single_word_npP", "TP-VALID-SINGLE-WORD-NP?", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_np_end_stringP", "VALID-TP-NP-END-STRING?", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_np_start_stringP", "VALID-TP-NP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_sP", "TP-VALID-S?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_vbar", "TP-VALID-VBAR", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_vbar_start_stringP", "VALID-TP-VBAR-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_vbar_end_stringP", "VALID-TP-VBAR-END-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_vp", "TP-VALID-VP", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_vp_start_stringP", "VALID-TP-VP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_vp_end_stringP", "VALID-TP-VP-END-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_unambiguous_verbP", "TP-UNAMBIGUOUS-VERB?", 1, 1, false );
    SubLFiles.declareFunction( me, "tp_valid_number_p", "TP-VALID-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "number_prefix_p", "NUMBER-PREFIX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_tp_vp_start_stringP", "POSSIBLE-TP-VP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_contraction_elementP", "RTP-CONTRACTION-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_contraction_elements", "GET-CONTRACTION-ELEMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "possible_tp_vp_end_stringP", "POSSIBLE-TP-VP-END-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_tp_np_start_stringP", "POSSIBLE-TP-NP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_tp_nbar_start_stringP", "POSSIBLE-TP-NBAR-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_tp_pp_start_stringP", "POSSIBLE-TP-PP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_tp_pp_end_stringP", "POSSIBLE-TP-PP-END-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "possible_tp_np_end_stringP", "POSSIBLE-TP-NP-END-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "impossible_tp_phrase_end_stringP", "IMPOSSIBLE-TP-PHRASE-END-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "confusing_np_start_stringP", "CONFUSING-NP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "confusing_nbar_start_stringP", "CONFUSING-NBAR-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_quantity_p", "TP-VALID-QUANTITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_tp_valid_quantity_p", "CLEAR-TP-VALID-QUANTITY-P", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_tp_valid_quantity_p", "RESET-TP-VALID-QUANTITY-P", 0, 0, false );
    SubLFiles.declareFunction( me, "get_quantity_strings", "GET-QUANTITY-STRINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "prepositional_categoryP", "PREPOSITIONAL-CATEGORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_pp", "TP-VALID-PP", 3, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_pp_end_stringP", "VALID-TP-PP-END-STRING?", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_tp_pp_start_stringP", "VALID-TP-PP-START-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_adjpP", "TP-VALID-ADJP?", 1, 0, false );
    SubLFiles.declareFunction( me, "tp_valid_adjp_predP", "TP-VALID-ADJP-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "template_to_om_categories", "TEMPLATE-TO-OM-CATEGORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_ranking_filename", "RTP-RANKING-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_parse_ranking_init", "RTP-PARSE-RANKING-INIT", 0, 0, false );
    SubLFiles.declareFunction( me, "rtp_parse_ranking_finalize", "RTP-PARSE-RANKING-FINALIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "rtp_parse_ranking_initializedP", "RTP-PARSE-RANKING-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "tagger_initializedP", "TAGGER-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "rop2phrase", "ROP2PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "parse2sentence", "PARSE2SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cat_prior", "CAT-PRIOR", 1, 0, false );
    SubLFiles.declareFunction( me, "tag1_cond_cat", "TAG1-COND-CAT", 2, 0, false );
    SubLFiles.declareFunction( me, "tag2_cond_cat_tag1", "TAG2-COND-CAT-TAG1", 3, 0, false );
    SubLFiles.declareFunction( me, "tag3_cond_cat_tag12", "TAG3-COND-CAT-TAG12", 4, 0, false );
    SubLFiles.declareFunction( me, "cat_cond_last_tag", "CAT-COND-LAST-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "tag_cond_tag", "TAG-COND-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_phrase_probability", "RTP-PHRASE-PROBABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_sentence_probability", "RTP-SENTENCE-PROBABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_rank_parses", "RTP-RANK-PARSES", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rtp_constituent_weeders_file()
  {
    $invalid_tp_vp_end_punctuation$ = SubLFiles.deflexical( "*INVALID-TP-VP-END-PUNCTUATION*", $list0 );
    $valid_tp_non_starting_sentential_markers$ = SubLFiles.deflexical( "*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*", $list1 );
    $rtp_ranking_data_dir$ = SubLFiles.defparameter( "*RTP-RANKING-DATA-DIR*", $str2$data_rkf_parse_ranking_ );
    $cat_prior_file$ = SubLFiles.deflexical( "*CAT-PRIOR-FILE*", $str3$cat_prior );
    $tag1_cond_cat_file$ = SubLFiles.deflexical( "*TAG1-COND-CAT-FILE*", $str4$tag1_cond_cat );
    $tag2_cond_cat_tag1_file$ = SubLFiles.deflexical( "*TAG2-COND-CAT-TAG1-FILE*", $str5$tag2_cond_cat_tag1 );
    $tag3_cond_cat_tag12_file$ = SubLFiles.deflexical( "*TAG3-COND-CAT-TAG12-FILE*", $str6$tag3_cond_cat_tag12 );
    $tag_cond_tag_file$ = SubLFiles.deflexical( "*TAG-COND-TAG-FILE*", $str7$tag_cond_tag );
    $cat_cond_last_tag_file$ = SubLFiles.deflexical( "*CAT-COND-LAST-TAG-FILE*", $str8$cat_cond_last_tag );
    $cat_prior$ = SubLFiles.deflexical( "*CAT-PRIOR*", ( maybeDefault( $sym9$_CAT_PRIOR_, $cat_prior$, NIL ) ) );
    $tag1_cond_cat$ = SubLFiles.deflexical( "*TAG1-COND-CAT*", ( maybeDefault( $sym10$_TAG1_COND_CAT_, $tag1_cond_cat$, NIL ) ) );
    $tag2_cond_cat_tag1$ = SubLFiles.deflexical( "*TAG2-COND-CAT-TAG1*", ( maybeDefault( $sym11$_TAG2_COND_CAT_TAG1_, $tag2_cond_cat_tag1$, NIL ) ) );
    $tag3_cond_cat_tag12$ = SubLFiles.deflexical( "*TAG3-COND-CAT-TAG12*", ( maybeDefault( $sym12$_TAG3_COND_CAT_TAG12_, $tag3_cond_cat_tag12$, NIL ) ) );
    $tag_cond_tag$ = SubLFiles.deflexical( "*TAG-COND-TAG*", ( maybeDefault( $sym13$_TAG_COND_TAG_, $tag_cond_tag$, NIL ) ) );
    $cat_cond_last_tag$ = SubLFiles.deflexical( "*CAT-COND-LAST-TAG*", ( maybeDefault( $sym14$_CAT_COND_LAST_TAG_, $cat_cond_last_tag$, NIL ) ) );
    $tagger$ = SubLFiles.deflexical( "*TAGGER*", ( maybeDefault( $sym15$_TAGGER_, $tagger$, NIL ) ) );
    $dtp_itp_semantics$ = SubLFiles.defconstant( "*DTP-ITP-SEMANTICS*", $sym16$ITP_SEMANTICS );
    $rtp_vbar_templates_cached_caching_state$ = SubLFiles.deflexical( "*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*", NIL );
    $use_new_tp_possible_constitP$ = SubLFiles.defparameter( "*USE-NEW-TP-POSSIBLE-CONSTIT?*", T );
    $rtp_contraction_elements$ = SubLFiles.defparameter( "*RTP-CONTRACTION-ELEMENTS*", NIL );
    $confusing_np_start_strings$ = SubLFiles.deflexical( "*CONFUSING-NP-START-STRINGS*", $list80 );
    $confusing_nbar_start_strings$ = SubLFiles.deflexical( "*CONFUSING-NBAR-START-STRINGS*", NIL );
    $quantity_strings$ = SubLFiles.deflexical( "*QUANTITY-STRINGS*", ( maybeDefault( $sym81$_QUANTITY_STRINGS_, $quantity_strings$, NIL ) ) );
    $prepositional_category_templates$ = SubLFiles.deflexical( "*PREPOSITIONAL-CATEGORY-TEMPLATES*", $list89 );
    $template_to_om_category_mappings$ = SubLFiles.defparameter( "*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*", $list91 );
    return NIL;
  }

  public static SubLObject setup_rtp_constituent_weeders_file()
  {
    subl_macro_promotions.declare_defglobal( $sym9$_CAT_PRIOR_ );
    subl_macro_promotions.declare_defglobal( $sym10$_TAG1_COND_CAT_ );
    subl_macro_promotions.declare_defglobal( $sym11$_TAG2_COND_CAT_TAG1_ );
    subl_macro_promotions.declare_defglobal( $sym12$_TAG3_COND_CAT_TAG12_ );
    subl_macro_promotions.declare_defglobal( $sym13$_TAG_COND_TAG_ );
    subl_macro_promotions.declare_defglobal( $sym14$_CAT_COND_LAST_TAG_ );
    subl_macro_promotions.declare_defglobal( $sym15$_TAGGER_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_itp_semantics$.getGlobalValue(), Symbols.symbol_function( $sym23$ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list24 );
    Structures.def_csetf( $sym25$ITP_SEMANTICS_CYCL, $sym26$_CSETF_ITP_SEMANTICS_CYCL );
    Structures.def_csetf( $sym27$ITP_SEMANTICS_CATEGORY, $sym28$_CSETF_ITP_SEMANTICS_CATEGORY );
    Structures.def_csetf( $sym29$ITP_SEMANTICS_FORCE, $sym30$_CSETF_ITP_SEMANTICS_FORCE );
    Structures.def_csetf( $sym31$ITP_SEMANTICS_SUPPORTS, $sym32$_CSETF_ITP_SEMANTICS_SUPPORTS );
    Structures.def_csetf( $sym33$ITP_SEMANTICS_CONFIDENCE, $sym34$_CSETF_ITP_SEMANTICS_CONFIDENCE );
    Equality.identity( $sym16$ITP_SEMANTICS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_semantics$.getGlobalValue(), Symbols.symbol_function( $sym45$VISIT_DEFSTRUCT_OBJECT_ITP_SEMANTICS_METHOD ) );
    memoization_state.note_globally_cached_function( $sym55$RTP_VBAR_TEMPLATES_CACHED );
    subl_macro_promotions.declare_defglobal( $sym81$_QUANTITY_STRINGS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rtp_constituent_weeders_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rtp_constituent_weeders_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rtp_constituent_weeders_file();
  }
  static
  {
    me = new rtp_constituent_weeders();
    $invalid_tp_vp_end_punctuation$ = null;
    $valid_tp_non_starting_sentential_markers$ = null;
    $rtp_ranking_data_dir$ = null;
    $cat_prior_file$ = null;
    $tag1_cond_cat_file$ = null;
    $tag2_cond_cat_tag1_file$ = null;
    $tag3_cond_cat_tag12_file$ = null;
    $tag_cond_tag_file$ = null;
    $cat_cond_last_tag_file$ = null;
    $cat_prior$ = null;
    $tag1_cond_cat$ = null;
    $tag2_cond_cat_tag1$ = null;
    $tag3_cond_cat_tag12$ = null;
    $tag_cond_tag$ = null;
    $cat_cond_last_tag$ = null;
    $tagger$ = null;
    $dtp_itp_semantics$ = null;
    $rtp_vbar_templates_cached_caching_state$ = null;
    $use_new_tp_possible_constitP$ = null;
    $rtp_contraction_elements$ = null;
    $confusing_np_start_strings$ = null;
    $confusing_nbar_start_strings$ = null;
    $quantity_strings$ = null;
    $prepositional_category_templates$ = null;
    $template_to_om_category_mappings$ = null;
    $list0 = ConsesLow.list( makeString( "(" ) );
    $list1 = ConsesLow.list( makeString( "%" ) );
    $str2$data_rkf_parse_ranking_ = makeString( "data/rkf/parse-ranking/" );
    $str3$cat_prior = makeString( "cat_prior" );
    $str4$tag1_cond_cat = makeString( "tag1_cond_cat" );
    $str5$tag2_cond_cat_tag1 = makeString( "tag2_cond_cat_tag1" );
    $str6$tag3_cond_cat_tag12 = makeString( "tag3_cond_cat_tag12" );
    $str7$tag_cond_tag = makeString( "tag_cond_tag" );
    $str8$cat_cond_last_tag = makeString( "cat_cond_last_tag" );
    $sym9$_CAT_PRIOR_ = makeSymbol( "*CAT-PRIOR*" );
    $sym10$_TAG1_COND_CAT_ = makeSymbol( "*TAG1-COND-CAT*" );
    $sym11$_TAG2_COND_CAT_TAG1_ = makeSymbol( "*TAG2-COND-CAT-TAG1*" );
    $sym12$_TAG3_COND_CAT_TAG12_ = makeSymbol( "*TAG3-COND-CAT-TAG12*" );
    $sym13$_TAG_COND_TAG_ = makeSymbol( "*TAG-COND-TAG*" );
    $sym14$_CAT_COND_LAST_TAG_ = makeSymbol( "*CAT-COND-LAST-TAG*" );
    $sym15$_TAGGER_ = makeSymbol( "*TAGGER*" );
    $sym16$ITP_SEMANTICS = makeSymbol( "ITP-SEMANTICS" );
    $sym17$ITP_SEMANTICS_P = makeSymbol( "ITP-SEMANTICS-P" );
    $list18 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "CATEGORY" ), makeSymbol( "FORCE" ), makeSymbol( "SUPPORTS" ), makeSymbol( "CONFIDENCE" ) );
    $list19 = ConsesLow.list( makeKeyword( "CYCL" ), makeKeyword( "CATEGORY" ), makeKeyword( "FORCE" ), makeKeyword( "SUPPORTS" ), makeKeyword( "CONFIDENCE" ) );
    $list20 = ConsesLow.list( makeSymbol( "ITP-SEMANTICS-CYCL" ), makeSymbol( "ITP-SEMANTICS-CATEGORY" ), makeSymbol( "ITP-SEMANTICS-FORCE" ), makeSymbol( "ITP-SEMANTICS-SUPPORTS" ), makeSymbol(
        "ITP-SEMANTICS-CONFIDENCE" ) );
    $list21 = ConsesLow.list( makeSymbol( "_CSETF-ITP-SEMANTICS-CYCL" ), makeSymbol( "_CSETF-ITP-SEMANTICS-CATEGORY" ), makeSymbol( "_CSETF-ITP-SEMANTICS-FORCE" ), makeSymbol( "_CSETF-ITP-SEMANTICS-SUPPORTS" ),
        makeSymbol( "_CSETF-ITP-SEMANTICS-CONFIDENCE" ) );
    $sym22$PRINT_ITP_SEMANTICS = makeSymbol( "PRINT-ITP-SEMANTICS" );
    $sym23$ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITP-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE" );
    $list24 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITP-SEMANTICS-P" ) );
    $sym25$ITP_SEMANTICS_CYCL = makeSymbol( "ITP-SEMANTICS-CYCL" );
    $sym26$_CSETF_ITP_SEMANTICS_CYCL = makeSymbol( "_CSETF-ITP-SEMANTICS-CYCL" );
    $sym27$ITP_SEMANTICS_CATEGORY = makeSymbol( "ITP-SEMANTICS-CATEGORY" );
    $sym28$_CSETF_ITP_SEMANTICS_CATEGORY = makeSymbol( "_CSETF-ITP-SEMANTICS-CATEGORY" );
    $sym29$ITP_SEMANTICS_FORCE = makeSymbol( "ITP-SEMANTICS-FORCE" );
    $sym30$_CSETF_ITP_SEMANTICS_FORCE = makeSymbol( "_CSETF-ITP-SEMANTICS-FORCE" );
    $sym31$ITP_SEMANTICS_SUPPORTS = makeSymbol( "ITP-SEMANTICS-SUPPORTS" );
    $sym32$_CSETF_ITP_SEMANTICS_SUPPORTS = makeSymbol( "_CSETF-ITP-SEMANTICS-SUPPORTS" );
    $sym33$ITP_SEMANTICS_CONFIDENCE = makeSymbol( "ITP-SEMANTICS-CONFIDENCE" );
    $sym34$_CSETF_ITP_SEMANTICS_CONFIDENCE = makeSymbol( "_CSETF-ITP-SEMANTICS-CONFIDENCE" );
    $kw35$CYCL = makeKeyword( "CYCL" );
    $kw36$CATEGORY = makeKeyword( "CATEGORY" );
    $kw37$FORCE = makeKeyword( "FORCE" );
    $kw38$SUPPORTS = makeKeyword( "SUPPORTS" );
    $kw39$CONFIDENCE = makeKeyword( "CONFIDENCE" );
    $str40$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw41$BEGIN = makeKeyword( "BEGIN" );
    $sym42$MAKE_ITP_SEMANTICS = makeSymbol( "MAKE-ITP-SEMANTICS" );
    $kw43$SLOT = makeKeyword( "SLOT" );
    $kw44$END = makeKeyword( "END" );
    $sym45$VISIT_DEFSTRUCT_OBJECT_ITP_SEMANTICS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITP-SEMANTICS-METHOD" );
    $str46$__ITP_SEMANTICS__CYCL_ = makeString( "#<ITP-SEMANTICS: CYCL:" );
    $str47$_ = makeString( " " );
    $kw48$UNAVAILABLE = makeKeyword( "UNAVAILABLE" );
    $str49$CAT_ = makeString( "CAT:" );
    $str50$FORCE_ = makeString( "FORCE:" );
    $str51$SUPPORTS_ = makeString( "SUPPORTS:" );
    $str52$CONFIDENCE_ = makeString( "CONFIDENCE:" );
    $str53$_ = makeString( ">" );
    $float54$0_5 = makeDouble( 0.5 );
    $sym55$RTP_VBAR_TEMPLATES_CACHED = makeSymbol( "RTP-VBAR-TEMPLATES-CACHED" );
    $sym56$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const57$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const58$VBarTemplate = constant_handles.reader_make_constant_shell( makeString( "VBarTemplate" ) );
    $sym59$_RTP_VBAR_TEMPLATES_CACHED_CACHING_STATE_ = makeSymbol( "*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*" );
    $const60$NPTemplate = constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) );
    $const61$VPTemplate = constant_handles.reader_make_constant_shell( makeString( "VPTemplate" ) );
    $const62$NumberTemplate = constant_handles.reader_make_constant_shell( makeString( "NumberTemplate" ) );
    $const63$OrdinalTemplate = constant_handles.reader_make_constant_shell( makeString( "OrdinalTemplate" ) );
    $const64$QuantityTemplate = constant_handles.reader_make_constant_shell( makeString( "QuantityTemplate" ) );
    $const65$AdjPTemplate = constant_handles.reader_make_constant_shell( makeString( "AdjPTemplate" ) );
    $const66$AdjPTemplate_Predicative = constant_handles.reader_make_constant_shell( makeString( "AdjPTemplate-Predicative" ) );
    $const67$STemplate = constant_handles.reader_make_constant_shell( makeString( "STemplate" ) );
    $list68 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuestionTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "STemplate" ) ) );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NumberTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "RatioTemplate" ) ) );
    $const70$NBarTemplate = constant_handles.reader_make_constant_shell( makeString( "NBarTemplate" ) );
    $str71$_S__S__S___new___S_old___S__ = makeString( "~S ~S ~S~% new: ~S old: ~S~%" );
    $str72$not = makeString( "not" );
    $str73$_ = makeString( "'" );
    $sym74$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $sym75$VERBAL_CATEGORY_ = makeSymbol( "VERBAL-CATEGORY?" );
    $list76 = ConsesLow.list( makeString( "-" ), makeString( "+" ), makeString( "~" ) );
    $sym77$STRING_ = makeSymbol( "STRING=" );
    $sym78$STRINGP = makeSymbol( "STRINGP" );
    $str79$how = makeString( "how" );
    $list80 = ConsesLow.list( makeString( "as" ), makeString( "between" ) );
    $sym81$_QUANTITY_STRINGS_ = makeSymbol( "*QUANTITY-STRINGS*" );
    $kw82$CLEARED = makeKeyword( "CLEARED" );
    $kw83$RESET = makeKeyword( "RESET" );
    $const84$PhysicalPartOfObject = constant_handles.reader_make_constant_shell( makeString( "PhysicalPartOfObject" ) );
    $kw85$X = makeKeyword( "X" );
    $list86 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "X" ), constant_handles.reader_make_constant_shell( makeString( "IntervalOnNumberLine" ) ) );
    $const87$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const88$LogicalField = constant_handles.reader_make_constant_shell( makeString( "LogicalField" ) );
    $list89 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PPByTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "PPTemplate" ) ), constant_handles
        .reader_make_constant_shell( makeString( "PPForTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "PPTemporalTemplate" ) ), constant_handles.reader_make_constant_shell( makeString(
            "PPTemporalDurationTemplate" ) ) );
    $const90$gerund = constant_handles.reader_make_constant_shell( makeString( "gerund" ) );
    $list91 = ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) ), makeKeyword( "WHNP" ), makeKeyword( "NNP" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "PPTempate" ) ), makeKeyword( "PP" ), makeKeyword( "WHPP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PPTempate" ) ), makeKeyword(
            "PP" ), makeKeyword( "WHPP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "STemplate" ) ), makeKeyword( "S" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "VPTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProgressiveVPTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "PerfectiveVPTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AdvPTemplate" ) ),
                        makeKeyword( "ADVP" ), makeKeyword( "WHADVP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AdjPTemplate" ) ), makeKeyword( "ADJP" ), makeKeyword( "WHADJP" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AdjPTemplate-Predicative" ) ), makeKeyword( "ADJP" ), makeKeyword( "WHADJP" ) ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "ImperativeTemplate" ) ), makeKeyword( "S" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfinitivalVBarTemplate" ) ), makeKeyword(
              "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfinitivalVPTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "PassiveVBarTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PastTenseTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "PastTenseVBarTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "PerfectiveVBarTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PerfectiveVPTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list(
                              constant_handles.reader_make_constant_shell( makeString( "NPTemporalTemplate" ) ), makeKeyword( "NNP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "PossessiveTemplate" ) ), makeKeyword( "NNP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PresentTenseVBarTemplate" ) ), makeKeyword( "VP" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProgressiveVBarTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "ProgressiveVPTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PPByTemplate" ) ), makeKeyword( "PP" ), makeKeyword( "WHPP" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "PPForTemplate" ) ), makeKeyword( "PP" ), makeKeyword( "WHPP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "PPTemporalDurationTemplate" ) ), makeKeyword( "PP" ), makeKeyword( "WHPP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuantityTemplate" ) ), makeKeyword( "NNP" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuestionTemplate" ) ), makeKeyword( "S" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "RTPTensedVBarTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RTPUntensedVBarTemplate" ) ), makeKeyword( "VP" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "PPTemporalTemplate" ) ), makeKeyword( "PP" ), makeKeyword( "WHPP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "TemporalTemplate" ) ), makeKeyword( "NNP" ), makeKeyword( "PP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "VBarTemplate" ) ), makeKeyword( "VP" ) )
    } );
    $list92 = ConsesLow.list( makeString( "X" ) );
    $str93$fht = makeString( "fht" );
    $sym94$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str95$_a__parse_ranking_will_not_be_ava = makeString( "~a, parse ranking will not be available" );
    $str96$Couldn_t_finalize_file_hashtable_ = makeString( "Couldn't finalize file hashtable ~a" );
    $list97 = ConsesLow.list( makeSymbol( "*CAT-PRIOR*" ), makeSymbol( "*TAG1-COND-CAT*" ), makeSymbol( "*TAG2-COND-CAT-TAG1*" ), makeSymbol( "*TAG3-COND-CAT-TAG12*" ), makeSymbol( "*TAG-COND-TAG*" ), makeSymbol(
        "*CAT-COND-LAST-TAG*" ) );
    $kw98$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym99$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw100$CONSTITUENTS = makeKeyword( "CONSTITUENTS" );
    $sym101$VECTOR = makeSymbol( "VECTOR" );
    $sym102$_ = makeSymbol( "<" );
    $sym103$RESULT_OF_PARSING_START = makeSymbol( "RESULT-OF-PARSING-START" );
    $kw104$S = makeKeyword( "S" );
    $sym105$PHRASE_P = makeSymbol( "PHRASE-P" );
    $sym106$WORD_CATEGORY = makeSymbol( "WORD-CATEGORY" );
    $sym107$SENTENCE_P = makeSymbol( "SENTENCE-P" );
    $str108$RTP_RANK_PARSES_triggered_an_erro = makeString( "RTP-RANK-PARSES triggered an error." );
  }

  public static final class $itp_semantics_native
      extends
        SubLStructNative
  {
    public SubLObject $cycl;
    public SubLObject $category;
    public SubLObject $force;
    public SubLObject $supports;
    public SubLObject $confidence;
    private static final SubLStructDeclNative structDecl;

    public $itp_semantics_native()
    {
      this.$cycl = CommonSymbols.NIL;
      this.$category = CommonSymbols.NIL;
      this.$force = CommonSymbols.NIL;
      this.$supports = CommonSymbols.NIL;
      this.$confidence = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $itp_semantics_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$category;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$force;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$supports;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$confidence;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cycl = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$category = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$force = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$supports = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$confidence = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $itp_semantics_native.class, $sym16$ITP_SEMANTICS, $sym17$ITP_SEMANTICS_P, $list18, $list19, new String[] { "$cycl", "$category", "$force", "$supports", "$confidence"
      }, $list20, $list21, $sym22$PRINT_ITP_SEMANTICS );
    }
  }

  public static final class $itp_semantics_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $itp_semantics_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITP-SEMANTICS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return itp_semantics_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 397 ms
 * 
 */