package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class external_interfaces
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.external_interfaces";
  public static final String myFingerPrint = "00cd743ddf8c0943c2d1a2490aaf24ab6513953dac482ce18937974e4b9e732f";
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 764L)
  public static SubLSymbol $quirk_host$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 818L)
  public static SubLSymbol $quirk_port$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 858L)
  public static SubLSymbol $talent_path$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 923L)
  public static SubLSymbol $npp_default$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 961L)
  public static SubLSymbol $shallow_parse_path$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1036L)
  public static SubLSymbol $dependency_parse_path$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1112L)
  public static SubLSymbol $guruqa_retrieve_passage_path$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1198L)
  public static SubLSymbol $guruqa_answer_indexes_path$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1277L)
  public static SubLSymbol $resporator_path$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1351L)
  private static SubLSymbol $guruqa_wizard$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9681L)
  public static SubLSymbol $dict_db_user$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9721L)
  public static SubLSymbol $dict_db_passwd$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9756L)
  public static SubLSymbol $dict_db$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9789L)
  public static SubLSymbol $dict_host$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9825L)
  public static SubLSymbol $dict_conn$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9856L)
  public static SubLSymbol $dict_stmt$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 15945L)
  public static SubLSymbol $all_external_services$;
  private static final SubLString $str0$mongo_cyc_com;
  private static final SubLInteger $int1$8080;
  private static final SubLString $str2$_users_textract_showtalent;
  private static final SubLString $str3$_users_textract_sexpr_shallow;
  private static final SubLString $str4$_users_supertagger_sexprlda;
  private static final SubLString $str5$_users_textract_documentWindow;
  private static final SubLString $str6$_users_textract_guruqaIds;
  private static final SubLString $str7$_users_textract_sexprresporator;
  private static final SubLSymbol $sym8$CYCL_GURUQA_QUERY_WIZARD;
  private static final SubLSymbol $sym9$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const10$EverythingPSC;
  private static final SubLString $str11$__mt___A;
  private static final SubLString $str12$__wiz___A;
  private static final SubLString $str13$__cyc_expr___S_of_type__S;
  private static final SubLSymbol $sym14$HOLISTIC_GURUQA_QUERY;
  private static final SubLString $str15$__guruqa_query_expr___A;
  private static final SubLSymbol $sym16$TO_STRING;
  private static final SubLString $str17$__guruqa_query_str___A;
  private static final SubLString $str18$_________________________________;
  private static final SubLString $str19$___A;
  private static final SubLString $str20$_____S;
  private static final SubLSymbol $sym21$ASK;
  private static final SubLSymbol $sym22$EL_FORMULA_P;
  private static final SubLString $str23$___S;
  private static final SubLSymbol $sym24$STRINGP;
  private static final SubLSymbol $kw25$DOC;
  private static final SubLSymbol $kw26$SENT;
  private static final SubLSymbol $kw27$POST;
  private static final SubLString $str28$query;
  private static final SubLString $str29$text;
  private static final SubLSymbol $sym30$QUIRK_LEXICON;
  private static final SubLSymbol $sym31$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw32$OFF;
  private static final SubLSymbol $sym33$PERSON;
  private static final SubLSymbol $sym34$GET;
  private static final SubLSymbol $kw35$DENOT;
  private static final SubLObject $const36$PersonTypeByOccupation;
  private static final SubLString $str37$doc;
  private static final SubLString $str38$start;
  private static final SubLString $str39$length;
  private static final SubLString $str40$_P_;
  private static final SubLString $str41$__P_;
  private static final SubLSymbol $kw42$LEN;
  private static final SubLString $str43$npp;
  private static final SubLString $str44$_users_supertagger_old_sexprlda;
  private static final SubLSymbol $sym45$STRIP_STEMS;
  private static final SubLSymbol $kw46$ROOT;
  private static final SubLList $list47;
  private static final SubLString $str48$ini;
  private static final SubLString $str49$mahler;
  private static final SubLString $str50$;
  private static final SubLString $str51$dict2;
  private static final SubLString $str52$elmore;
  private static final SubLSymbol $kw53$DBMS_SERVER;
  private static final SubLSymbol $kw54$PORT;
  private static final SubLInteger $int55$9999;
  private static final SubLSymbol $kw56$SUBPROTOCOL;
  private static final SubLString $str57$postgresql;
  private static final SubLString $str58$select_occurrences__documents__te;
  private static final SubLString $str59$__;
  private static final SubLString $str60$_;
  private static final SubLSymbol $sym61$LEMUR_QUERY;
  private static final SubLSymbol $sym62$GET_CORPUS_PATH_MAPPING;
  private static final SubLString $str63$Unsupported_corpus__a;
  private static final SubLString $str64$_inesgraph_cgi;
  private static final SubLSymbol $sym65$LISTP;
  private static final SubLString $str66$___A_____;
  private static final SubLString $str67$_qaga_cgi;
  private static final SubLString $str68$_applepie_cgi;
  private static final SubLString $str69$_minipar_cgi;
  private static final SubLString $str70$_bash_cgi;
  private static final SubLString $str71$command;
  private static final SubLString $str72$_parse_date_cgi;
  private static final SubLString $str73$datestring;
  private static final SubLString $str74$year;
  private static final SubLString $str75$month;
  private static final SubLString $str76$day;
  private static final SubLString $str77$hour;
  private static final SubLString $str78$minute;
  private static final SubLString $str79$second;
  private static final SubLString $str80$_qack_cgi;
  private static final SubLString $str81$_wordnet_cgi;
  private static final SubLSymbol $kw82$TEXT;
  private static final SubLList $list83;
  private static final SubLString $str84$_questions_cgi;
  private static final SubLList $list85;
  private static final SubLString $str86$Guest;
  private static final SubLString $str87$_cgi_bin_users_mahler_check_cyc_s;
  private static final SubLString $str88$servers;
  private static final SubLSymbol $sym89$USER;
  private static final SubLString $str90$_corpus_frequency_cgi;
  private static final SubLString $str91$dbfile;
  private static final SubLString $str92$word;
  private static final SubLString $str93$pos;
  private static final SubLObject $list94;
  private static final SubLInteger $int95$30;
  private static final SubLSymbol $sym96$CATCH_ERROR_MESSAGE_HANDLER;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1484L)
  public static SubLObject get_guruqa_wizard()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $guruqa_wizard$.getDynamicValue( thread ) )
    {
      $guruqa_wizard$.setDynamicValue( object.new_class_instance( $sym8$CYCL_GURUQA_QUERY_WIZARD ), thread );
    }
    return $guruqa_wizard$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1653L)
  public static SubLObject compute_guruqa_query(final SubLObject cyc_expr)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject expr = NIL;
    SubLObject str = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym9$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const10$EverythingPSC, thread );
      PrintLow.format( T, $str11$__mt___A, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      PrintLow.format( T, $str12$__wiz___A, get_guruqa_wizard() );
      PrintLow.format( T, $str13$__cyc_expr___S_of_type__S, cyc_expr, Types.type_of( cyc_expr ) );
      expr = methods.funcall_instance_method_with_1_args( get_guruqa_wizard(), $sym14$HOLISTIC_GURUQA_QUERY, cyc_expr );
      PrintLow.format( T, $str15$__guruqa_query_expr___A, expr );
      str = methods.funcall_instance_method_with_0_args( expr, $sym16$TO_STRING );
      PrintLow.format( T, $str17$__guruqa_query_str___A, str );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return expr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 2193L)
  public static SubLObject secretarize_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, final SubLObject secretary, SubLObject method)
  {
    if( method == UNPROVIDED )
    {
      method = $sym14$HOLISTIC_GURUQA_QUERY;
    }
    SubLObject cdolist_list_var;
    final SubLObject passages = cdolist_list_var = guruqa_passages_for_cycl( cycl, guruqa_wizard, method );
    SubLObject passage = NIL;
    passage = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str18$_________________________________ );
      PrintLow.format( T, $str19$___A, passage );
      PrintLow.format( T, $str20$_____S, methods.funcall_instance_method_with_2_args( secretary, $sym21$ASK, cycl, passage ) );
      cdolist_list_var = cdolist_list_var.rest();
      passage = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 2622L)
  public static SubLObject guruqa_passages_for_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, SubLObject method)
  {
    if( method == UNPROVIDED )
    {
      method = $sym14$HOLISTIC_GURUQA_QUERY;
    }
    assert NIL != el_utilities.el_formula_p( cycl ) : cycl;
    final SubLObject query = methods.funcall_instance_method_with_1_args( guruqa_wizard, method, cycl );
    final SubLObject query_string = methods.funcall_instance_method_with_0_args( query, $sym16$TO_STRING );
    PrintLow.format( T, $str23$___S, query_string );
    return guruqa_passages_for_query( query_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 3345L)
  public static SubLObject guruqa_passages_for_query(final SubLObject query)
  {
    assert NIL != Types.stringp( query ) : query;
    final SubLObject indices = guruqa_answer_indexes( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject passages = NIL;
    SubLObject cdolist_list_var = indices;
    SubLObject index = NIL;
    index = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject doc = conses_high.getf( index, $kw25$DOC, UNPROVIDED );
      final SubLObject sent = conses_high.getf( index, $kw26$SENT, UNPROVIDED );
      final SubLObject passage = guruqa_retrieve_passage( doc, sent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      passages = ConsesLow.cons( passage, passages );
      cdolist_list_var = cdolist_list_var.rest();
      index = cdolist_list_var.first();
    }
    return strip_tags( passages );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 4015L)
  public static SubLObject guruqa_answer_indexes(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = $guruqa_answer_indexes_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str28$query, query ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 4458L)
  public static SubLObject resporator(final SubLObject text, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = $resporator_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str29$text, text ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 4770L)
  public static SubLObject resporatorXX(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject lexicon = object.new_class_instance( $sym30$QUIRK_LEXICON );
    SubLObject typings = NIL;
    methods.funcall_instance_method_with_1_args( lexicon, $sym31$SET_CASE_SENSITIVITY, $kw32$OFF );
    SubLObject cdolist_list_var = resporator( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject typing = NIL;
    typing = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( typing.first().eql( $sym33$PERSON ) )
      {
        final SubLObject entity = typing.rest();
        final SubLObject tokens = string_utilities.split_string( entity, UNPROVIDED );
        SubLObject new_tokens = NIL;
        SubLObject titleP = NIL;
        if( NIL == titleP )
        {
          SubLObject csome_list_var = Sequences.reverse( tokens );
          SubLObject token = NIL;
          token = csome_list_var.first();
          while ( NIL == titleP && NIL != csome_list_var)
          {
            final SubLObject lexes = methods.funcall_instance_method_with_1_args( lexicon, $sym34$GET, token );
            if( NIL != lexes && NIL == titleP )
            {
              SubLObject csome_list_var_$1 = lexes;
              SubLObject lex = NIL;
              lex = csome_list_var_$1.first();
              while ( NIL == titleP && NIL != csome_list_var_$1)
              {
                if( NIL != isa.isa_in_any_mtP( methods.funcall_instance_method_with_1_args( lex, $sym34$GET, $kw35$DENOT ), $const36$PersonTypeByOccupation ) )
                {
                  titleP = T;
                }
                csome_list_var_$1 = csome_list_var_$1.rest();
                lex = csome_list_var_$1.first();
              }
            }
            if( NIL == titleP )
            {
              new_tokens = ConsesLow.cons( token, new_tokens );
            }
            csome_list_var = csome_list_var.rest();
            token = csome_list_var.first();
          }
        }
        typings = ConsesLow.cons( ConsesLow.cons( $sym33$PERSON, string_utilities.bunge( new_tokens, UNPROVIDED ) ), typings );
      }
      else
      {
        typings = ConsesLow.cons( typing, typings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      typing = cdolist_list_var.first();
    }
    return typings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 5626L)
  public static SubLObject guruqa_retrieve_passage(final SubLObject doc, final SubLObject sent, SubLObject len, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( len == UNPROVIDED )
    {
      len = ONE_INTEGER;
    }
    if( path == UNPROVIDED )
    {
      path = $guruqa_retrieve_passage_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return strip_tags( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str37$doc, doc ), ConsesLow.list( $str38$start, sent ), ConsesLow.list( $str39$length, len ) ), path, host, port, method, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 7679L)
  public static SubLObject strip_tags(final SubLObject string)
  {
    return string_utilities.trim_whitespace( string_utilities.remove_substring( string_utilities.remove_substring( string, $str40$_P_ ), $str41$__P_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 7801L)
  public static SubLObject guruqa_answer_coordinates(final SubLObject v_answer)
  {
    final SubLObject doc_tail = cdestructuring_bind.property_list_member( $kw25$DOC, v_answer );
    final SubLObject doc = ( NIL != doc_tail ) ? conses_high.cadr( doc_tail ) : NIL;
    final SubLObject sent_tail = cdestructuring_bind.property_list_member( $kw26$SENT, v_answer );
    final SubLObject sent = ( NIL != sent_tail ) ? conses_high.cadr( sent_tail ) : NIL;
    final SubLObject len_tail = cdestructuring_bind.property_list_member( $kw42$LEN, v_answer );
    final SubLObject len = ( NIL != len_tail ) ? conses_high.cadr( len_tail ) : NIL;
    return ConsesLow.list( doc, sent, len );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 7945L)
  public static SubLObject dependency_parse(final SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( npp == UNPROVIDED )
    {
      npp = $npp_default$.getDynamicValue();
    }
    if( path == UNPROVIDED )
    {
      path = $dependency_parse_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str29$text, Sequences.substitute( Characters.CHAR_space, Characters.CHAR_newline, Sequences.remove(
        Characters.CHAR_return, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), ConsesLow.list( $str43$npp, npp ) ), path, host, port,
        method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 8341L)
  public static SubLObject dependency_parse_old(final SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( npp == UNPROVIDED )
    {
      npp = $npp_default$.getDynamicValue();
    }
    if( path == UNPROVIDED )
    {
      path = $str44$_users_supertagger_old_sexprlda;
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str29$text, Sequences.substitute( Characters.CHAR_space, Characters.CHAR_newline, Sequences.remove(
        Characters.CHAR_return, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), ConsesLow.list( $str43$npp, npp ) ), path, host, port,
        method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 8751L)
  public static SubLObject shallow_parse(final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = $shallow_parse_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym45$STRIP_STEMS ), stem_parse( str, path, host, port, method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 8980L)
  public static SubLObject strip_stems(final SubLObject parse)
  {
    return parse.isCons() ? ( ( parse.first() == $kw46$ROOT ) ? conses_high.cadr( parse ) : Mapping.mapcar( Symbols.symbol_function( $sym45$STRIP_STEMS ), parse ) ) : parse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9144L)
  public static SubLObject stem_parse(final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = $shallow_parse_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return Sequences.remove( $list47, reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str29$text, str ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9438L)
  public static SubLObject run_talent(final SubLObject ini, final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = $talent_path$.getDynamicValue();
    }
    if( host == UNPROVIDED )
    {
      host = $quirk_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $quirk_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str48$ini, ini ), ConsesLow.list( $str29$text, str ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9887L)
  public static SubLObject dict_connection()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sdbc.sql_open_connection_p( $dict_conn$.getDynamicValue( thread ) ) )
    {
      final SubLObject connection = sdbc.new_sql_connection( $dict_db$.getDynamicValue( thread ), $dict_db_user$.getDynamicValue( thread ), $dict_db_passwd$.getDynamicValue( thread ), ConsesLow.list( $kw53$DBMS_SERVER,
          $dict_host$.getDynamicValue( thread ), $kw54$PORT, $int55$9999, $kw56$SUBPROTOCOL, $str57$postgresql ) );
      if( NIL != sdbc.sdbc_error_p( connection ) )
      {
        sdbc.sdbc_error_throw( connection );
      }
      $dict_conn$.setDynamicValue( connection, thread );
    }
    return $dict_conn$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 10283L)
  public static SubLObject dict_statement()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sdbc.sql_open_statement_p( $dict_stmt$.getDynamicValue( thread ) ) )
    {
      final SubLObject statement = sdbc.sqlc_create_statement( dict_connection() );
      if( NIL != sdbc.sdbc_error_p( statement ) )
      {
        sdbc.sdbc_error_throw( statement );
      }
      $dict_stmt$.setDynamicValue( statement, thread );
    }
    return $dict_stmt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 10549L)
  public static SubLObject guruqa_indexed_string_entry(final SubLObject str)
  {
    return sdbc.sqls_execute_query( dict_statement(), PrintLow.format( NIL, $str58$select_occurrences__documents__te, string_utilities.string_substitute( $str59$__, $str60$_, str, UNPROVIDED ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 10802L)
  public static SubLObject get_word_graph_path(final SubLObject corpus)
  {
    final SubLObject path = conses_high.assoc( corpus, methods.funcall_class_method_with_0_args( $sym61$LEMUR_QUERY, $sym62$GET_CORPUS_PATH_MAPPING ), EQUALP, UNPROVIDED ).rest();
    if( NIL == path )
    {
      Errors.error( $str63$Unsupported_corpus__a, corpus );
    }
    return path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 11162L)
  public static SubLObject get_word_graph(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str64$_inesgraph_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    assert NIL != Types.listp( query ) : query;
    return reader.read_from_string( web_utilities.http_retrieve( reader.bq_cons( ConsesLow.list( $str28$query, PrintLow.format( NIL, $str66$___A_____, query ) ), ConsesLow.append( options, NIL ) ), path, host, port,
        method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 11509L)
  public static SubLObject ask_qaga(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str67$_qaga_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    assert NIL != Types.listp( query ) : query;
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str28$query, PrintLow.format( NIL, $str66$___A_____, query ) ) ), path, host, port, method, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12123L)
  public static SubLObject applepie_parse(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str68$_applepie_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str29$text, query ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12387L)
  public static SubLObject minipar_parse(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str69$_minipar_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str29$text, query ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12658L)
  public static SubLObject ask_bash(final SubLObject command, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str70$_bash_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str71$command, command ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12898L)
  public static SubLObject parse_date(final SubLObject datestring, SubLObject year, SubLObject month, SubLObject day, SubLObject hour, SubLObject minute, SubLObject second, SubLObject path, SubLObject host,
      SubLObject port, SubLObject cgi_method, SubLObject options)
  {
    if( year == UNPROVIDED )
    {
      year = $str50$;
    }
    if( month == UNPROVIDED )
    {
      month = $str50$;
    }
    if( day == UNPROVIDED )
    {
      day = $str50$;
    }
    if( hour == UNPROVIDED )
    {
      hour = $str50$;
    }
    if( minute == UNPROVIDED )
    {
      minute = $str50$;
    }
    if( second == UNPROVIDED )
    {
      second = $str50$;
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str72$_parse_date_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( cgi_method == UNPROVIDED )
    {
      cgi_method = $kw27$POST;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.listS( ConsesLow.list( $str73$datestring, datestring ), new SubLObject[] { ConsesLow.list( $str74$year, year ), ConsesLow.list( $str75$month,
        month ), ConsesLow.list( $str76$day, day ), ConsesLow.list( $str77$hour, hour ), ConsesLow.list( $str78$minute, minute ), ConsesLow.list( $str79$second, second ), ConsesLow.append( options, NIL )
    } ), path, host, port, cgi_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 13713L)
  public static SubLObject ask_qack(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject options)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str80$_qack_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    return reader.read_from_string( web_utilities.http_retrieve( reader.bq_cons( ConsesLow.list( $str28$query, query ), ConsesLow.append( options, NIL ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14002L)
  public static SubLObject invoke_wordnet(final SubLObject params, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str81$_wordnet_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( cgi_method == UNPROVIDED )
    {
      cgi_method = $kw27$POST;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    return reader.read_from_string( web_utilities.http_retrieve( params, path, host, port, cgi_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14316L)
  public static SubLObject glimpse_passages_for_query(final SubLObject query)
  {
    SubLObject res = NIL;
    SubLObject cdolist_list_var = search_engine.ask_glimpse( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject ans = NIL;
    ans = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current;
      final SubLObject datum = current = ans;
      final SubLObject text_tail = cdestructuring_bind.property_list_member( $kw82$TEXT, current );
      final SubLObject text = ( NIL != text_tail ) ? conses_high.cadr( text_tail ) : NIL;
      res = ConsesLow.cons( text, res );
      cdolist_list_var = cdolist_list_var.rest();
      ans = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14516L)
  public static SubLObject web_mine_questions(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( options == UNPROVIDED )
    {
      options = $list83;
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str84$_questions_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( reader.bq_cons( ConsesLow.list( $str28$query, query ), ConsesLow.append( options, NIL ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14893L)
  public static SubLObject get_cyc_images(SubLObject servers, SubLObject user, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( servers == UNPROVIDED )
    {
      servers = $list85;
    }
    if( user == UNPROVIDED )
    {
      user = $str86$Guest;
    }
    if( path == UNPROVIDED )
    {
      path = $str87$_cgi_bin_users_mahler_check_cyc_s;
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( $str88$servers, PrintLow.format( NIL, $str66$___A_____, servers ) ), ConsesLow.list( $sym89$USER, user ) ), path, host,
        port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 15224L)
  public static SubLObject get_corpus_count_probability(final SubLObject corpus_db_path, final SubLObject word, final SubLObject part_of_speech, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str90$_corpus_frequency_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw27$POST;
    }
    assert NIL != Types.stringp( corpus_db_path ) : corpus_db_path;
    assert NIL != Types.stringp( word ) : word;
    assert NIL != Types.stringp( part_of_speech ) : part_of_speech;
    final SubLObject query = ConsesLow.list( ConsesLow.list( $str91$dbfile, corpus_db_path ), ConsesLow.list( $str92$word, word ), ConsesLow.list( $str93$pos, part_of_speech ) );
    return web_utilities.http_retrieve( query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 24829L)
  public static SubLObject services_report(SubLObject services)
  {
    if( services == UNPROVIDED )
    {
      services = $all_external_services$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( services ) : services;
    SubLObject services_up = NIL;
    SubLObject services_down = NIL;
    SubLObject services_timed_out = NIL;
    SubLObject timed_outP = NIL;
    SubLObject error = NIL;
    SubLObject cdolist_list_var = services;
    SubLObject service = NIL;
    service = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject call = service.first();
      final SubLObject result = service.rest();
      timed_outP = NIL;
      final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
      try
      {
        thread.throwStack.push( tag );
        final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
        try
        {
          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
          SubLObject timer = NIL;
          try
          {
            final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
              timer = subl_macro_promotions.with_timeout_start_timer( $int95$30, tag );
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym96$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    if( Eval.eval( call ).equal( result ) )
                    {
                      services_up = ConsesLow.cons( service.first().first(), services_up );
                    }
                    else
                    {
                      services_down = ConsesLow.cons( service.first().first(), services_down );
                    }
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( NIL != error )
              {
                services_down = ConsesLow.cons( service.first().first(), services_down );
                Errors.warn( error );
              }
            }
            finally
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              subl_macro_promotions.with_timeout_stop_timer( timer );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
            }
          }
        }
        finally
        {
          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        timed_outP = Errors.handleThrowable( ccatch_env_var2, tag );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != timed_outP )
      {
        services_timed_out = ConsesLow.cons( service.first().first(), services_timed_out );
      }
      cdolist_list_var = cdolist_list_var.rest();
      service = cdolist_list_var.first();
    }
    return Values.values( services_up, services_down, services_timed_out );
  }

  public static SubLObject declare_external_interfaces_file()
  {
    SubLFiles.declareFunction( me, "get_guruqa_wizard", "GET-GURUQA-WIZARD", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_guruqa_query", "COMPUTE-GURUQA-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "secretarize_cycl", "SECRETARIZE-CYCL", 3, 1, false );
    SubLFiles.declareFunction( me, "guruqa_passages_for_cycl", "GURUQA-PASSAGES-FOR-CYCL", 2, 1, false );
    SubLFiles.declareFunction( me, "guruqa_passages_for_query", "GURUQA-PASSAGES-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_answer_indexes", "GURUQA-ANSWER-INDEXES", 1, 4, false );
    SubLFiles.declareFunction( me, "resporator", "RESPORATOR", 1, 4, false );
    SubLFiles.declareFunction( me, "resporatorXX", "RESPORATOR++", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_retrieve_passage", "GURUQA-RETRIEVE-PASSAGE", 2, 5, false );
    SubLFiles.declareFunction( me, "strip_tags", "STRIP-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_answer_coordinates", "GURUQA-ANSWER-COORDINATES", 1, 0, false );
    SubLFiles.declareFunction( me, "dependency_parse", "DEPENDENCY-PARSE", 1, 5, false );
    SubLFiles.declareFunction( me, "dependency_parse_old", "DEPENDENCY-PARSE-OLD", 1, 5, false );
    SubLFiles.declareFunction( me, "shallow_parse", "SHALLOW-PARSE", 1, 4, false );
    SubLFiles.declareFunction( me, "strip_stems", "STRIP-STEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "stem_parse", "STEM-PARSE", 1, 4, false );
    SubLFiles.declareFunction( me, "run_talent", "RUN-TALENT", 2, 4, false );
    SubLFiles.declareFunction( me, "dict_connection", "DICT-CONNECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "dict_statement", "DICT-STATEMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "guruqa_indexed_string_entry", "GURUQA-INDEXED-STRING-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_word_graph_path", "GET-WORD-GRAPH-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_word_graph", "GET-WORD-GRAPH", 1, 5, false );
    SubLFiles.declareFunction( me, "ask_qaga", "ASK-QAGA", 1, 4, false );
    SubLFiles.declareFunction( me, "applepie_parse", "APPLEPIE-PARSE", 1, 4, false );
    SubLFiles.declareFunction( me, "minipar_parse", "MINIPAR-PARSE", 1, 4, false );
    SubLFiles.declareFunction( me, "ask_bash", "ASK-BASH", 1, 4, false );
    SubLFiles.declareFunction( me, "parse_date", "PARSE-DATE", 1, 11, false );
    SubLFiles.declareFunction( me, "ask_qack", "ASK-QACK", 1, 5, false );
    SubLFiles.declareFunction( me, "invoke_wordnet", "INVOKE-WORDNET", 1, 5, false );
    SubLFiles.declareFunction( me, "glimpse_passages_for_query", "GLIMPSE-PASSAGES-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "web_mine_questions", "WEB-MINE-QUESTIONS", 1, 5, false );
    SubLFiles.declareFunction( me, "get_cyc_images", "GET-CYC-IMAGES", 0, 6, false );
    SubLFiles.declareFunction( me, "get_corpus_count_probability", "GET-CORPUS-COUNT-PROBABILITY", 3, 4, false );
    SubLFiles.declareFunction( me, "services_report", "SERVICES-REPORT", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_external_interfaces_file()
  {
    $quirk_host$ = SubLFiles.defparameter( "*QUIRK-HOST*", $str0$mongo_cyc_com );
    $quirk_port$ = SubLFiles.defparameter( "*QUIRK-PORT*", $int1$8080 );
    $talent_path$ = SubLFiles.defparameter( "*TALENT-PATH*", $str2$_users_textract_showtalent );
    $npp_default$ = SubLFiles.defparameter( "*NPP-DEFAULT*", ZERO_INTEGER );
    $shallow_parse_path$ = SubLFiles.defparameter( "*SHALLOW-PARSE-PATH*", $str3$_users_textract_sexpr_shallow );
    $dependency_parse_path$ = SubLFiles.defparameter( "*DEPENDENCY-PARSE-PATH*", $str4$_users_supertagger_sexprlda );
    $guruqa_retrieve_passage_path$ = SubLFiles.defparameter( "*GURUQA-RETRIEVE-PASSAGE-PATH*", $str5$_users_textract_documentWindow );
    $guruqa_answer_indexes_path$ = SubLFiles.defparameter( "*GURUQA-ANSWER-INDEXES-PATH*", $str6$_users_textract_guruqaIds );
    $resporator_path$ = SubLFiles.defparameter( "*RESPORATOR-PATH*", $str7$_users_textract_sexprresporator );
    $guruqa_wizard$ = SubLFiles.defparameter( "*GURUQA-WIZARD*", NIL );
    $dict_db_user$ = SubLFiles.defparameter( "*DICT-DB-USER*", $str49$mahler );
    $dict_db_passwd$ = SubLFiles.defparameter( "*DICT-DB-PASSWD*", $str50$ );
    $dict_db$ = SubLFiles.defparameter( "*DICT-DB*", $str51$dict2 );
    $dict_host$ = SubLFiles.defparameter( "*DICT-HOST*", $str52$elmore );
    $dict_conn$ = SubLFiles.defparameter( "*DICT-CONN*", NIL );
    $dict_stmt$ = SubLFiles.defparameter( "*DICT-STMT*", NIL );
    $all_external_services$ = SubLFiles.defparameter( "*ALL-EXTERNAL-SERVICES*", $list94 );
    return NIL;
  }

  public static SubLObject setup_external_interfaces_file()
  {
    return NIL;
  }

  private static SubLObject _constant_94_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeSymbol( "CHARNIAK-PARSE" ), makeString( "The cat sat on the mat." ) ), ConsesLow.list( makeKeyword( "S1" ), ConsesLow.list( makeKeyword(
        "S" ), ConsesLow.list( makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "DT" ), makeString( "The" ) ), ConsesLow.list( makeKeyword( "NN" ), makeString( "cat" ) ) ), ConsesLow.list( makeKeyword( "VP" ), ConsesLow
            .list( makeKeyword( "VBD" ), makeString( "sat" ) ), ConsesLow.list( makeKeyword( "PP" ), ConsesLow.list( makeKeyword( "IN" ), makeString( "on" ) ), ConsesLow.list( makeKeyword( "NP" ), ConsesLow.list(
                makeKeyword( "DT" ), makeString( "the" ) ), ConsesLow.list( makeKeyword( "NN" ), makeString( "mat" ) ) ) ) ), ConsesLow.list( makeKeyword( "." ), makeString( "." ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "STANFORD-PARSE" ), makeString( "The cat sat on the mat." ) ), makeKeyword( "S" ), ConsesLow.list( makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "DT" ), makeString( "The" ) ),
                        ConsesLow.list( makeKeyword( "NN" ), makeString( "cat" ) ) ), ConsesLow.list( makeKeyword( "VP" ), ConsesLow.list( makeKeyword( "VBD" ), makeString( "sat" ) ), ConsesLow.list( makeKeyword( "PP" ),
                            ConsesLow.list( makeKeyword( "IN" ), makeString( "on" ) ), ConsesLow.list( makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "DT" ), makeString( "the" ) ), ConsesLow.list( makeKeyword( "NN" ),
                                makeString( "mat" ) ) ) ) ), ConsesLow.list( makeKeyword( "." ), makeString( "." ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "DEPENDENCY-PARSE" ), makeString(
                                    "The cat sat on the mat." ) ), ConsesLow.list( new SubLObject[]
                                    { makeKeyword( "WORD" ), makeString( "sat" ), makeKeyword( "TAG" ), makeString( "A_nx0Vpx1" ), makeKeyword( "INDEX" ), TWO_INTEGER, makeKeyword( "ARGS" ), ConsesLow.list( ConsesLow
                                        .list( new SubLObject[]
                                        { makeKeyword( "WORD" ), makeString( "cat" ), makeKeyword( "TAG" ), makeString( "A_NXN" ), makeKeyword( "INDEX" ), ONE_INTEGER, makeKeyword( "ARGS" ), NIL, makeKeyword(
                                            "MODIFIERS" ), ConsesLow.list( ConsesLow.list( new SubLObject[]
                                            { makeKeyword( "WORD" ), makeString( "The" ), makeKeyword( "TAG" ), makeString( "B_Dnx" ), makeKeyword( "INDEX" ), ZERO_INTEGER, makeKeyword( "ARGS" ), NIL, makeKeyword(
                                                "MODIFIERS" ), NIL
                } ) )
            } ), ConsesLow.list( new SubLObject[] { makeKeyword( "WORD" ), makeString( "on" ), makeKeyword( "TAG" ), makeString( "A_PXPnx" ), makeKeyword( "INDEX" ), THREE_INTEGER, makeKeyword( "ARGS" ), ConsesLow.list(
                ConsesLow.list( new SubLObject[]
                { makeKeyword( "WORD" ), makeString( "mat." ), makeKeyword( "TAG" ), makeString( "A_NXN" ), makeKeyword( "INDEX" ), FIVE_INTEGER, makeKeyword( "ARGS" ), NIL, makeKeyword( "MODIFIERS" ), ConsesLow.list(
                    ConsesLow.list( new SubLObject[]
                    { makeKeyword( "WORD" ), makeString( "the" ), makeKeyword( "TAG" ), makeString( "B_Dnx" ), makeKeyword( "INDEX" ), FOUR_INTEGER, makeKeyword( "ARGS" ), NIL, makeKeyword( "MODIFIERS" ), NIL
                    } ) )
                } ) ), makeKeyword( "MODIFIERS" ), NIL
            } ) ), makeKeyword( "MODIFIERS" ), NIL
        } ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "STEM-PARSE" ), makeString( "The cat sat on the mat." ) ), ConsesLow.list( makeKeyword( "S1" ), ConsesLow.list( makeKeyword( "SUB" ), ConsesLow.list(
            makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "DT" ), ConsesLow.list( makeKeyword( "ROOT" ), makeString( "The" ), makeString( "the" ) ) ), ConsesLow.list( makeKeyword( "NN" ), ConsesLow.list( makeKeyword(
                "ROOT" ), makeString( "cat" ), makeString( "cat" ) ) ) ) ), ConsesLow.list( makeKeyword( "VG" ), ConsesLow.list( makeKeyword( "VBD" ), ConsesLow.list( makeKeyword( "ROOT" ), makeString( "sat" ),
                    makeString( "sit" ) ) ) ), ConsesLow.list( makeKeyword( "PP" ), ConsesLow.list( makeKeyword( "IN" ), ConsesLow.list( makeKeyword( "ROOT" ), makeString( "on" ), makeString( "on" ) ) ), ConsesLow.list(
                        makeKeyword( "NP" ), ConsesLow.list( makeKeyword( "DT" ), ConsesLow.list( makeKeyword( "ROOT" ), makeString( "the" ), makeString( "the" ) ) ), ConsesLow.list( makeKeyword( "NN" ), ConsesLow.list(
                            makeKeyword( "ROOT" ), makeString( "mat" ), makeString( "mat" ) ) ) ) ), ConsesLow.list( makeKeyword( "." ), makeString( "." ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                "GURUQA-ANSWER-INDEXES" ), makeString( "Udine" ) ), ConsesLow.list( new SubLObject[]
                                { makeKeyword( "RANK" ), ONE_INTEGER, makeKeyword( "LEN" ), ONE_INTEGER, makeKeyword( "DOCID" ), makeString( "NA.18541" ), makeKeyword( "DOC" ), makeInteger( 33671 ), makeKeyword(
                                    "WEIGHT" ), makeDouble( 0.155536824074 ), makeKeyword( "SENT" ), makeInteger( 21 ), makeKeyword( "SIZE" ), makeInteger( 227 ), makeKeyword( "SCORE" ), makeDouble( 1.0 )
        } ) ), ConsesLow.cons( ConsesLow.list( makeSymbol( "GURUQA-RETRIEVE-PASSAGE" ), makeInteger( 33671 ), makeInteger( 21 ) ), makeString(
            "A prior Italian Senate\ninvestigation report states that in 1989 a steel company in Udine that had\n$70 million worth of contracts with Iraq was referred by BNL Rome to seek\nfinancing from BNL Atlanta, where it obtained credit. \n" ) ),
      ConsesLow.list( new SubLObject[]
      { ConsesLow.list( makeSymbol( "ASK-LEMUR" ), makeString( "Jawien" ) ), ConsesLow.list( makeString( "NYT19990128.0498.29" ), makeDouble( 19.979052515738 ), makeString(
          "Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication." ) ), ConsesLow.list( makeString( "NYT19990128.0498.1" ),
              ZERO_INTEGER, makeString(
                  "Jerzy Turowicz, who skirmished with communist censors for nearly four decades to produce a Polish Catholic weekly that became widely known as ``the only free newspaper from Berlin to Vladivostok,'' died on Wednesday in Krakow, Poland." ) ),
        ConsesLow.list( makeString( "NYT19990128.0498.2" ), ZERO_INTEGER, makeString( "He was 86 and had suffered a heart attack." ) ), ConsesLow.list( makeString( "NYT19990128.0498.3" ), ZERO_INTEGER, makeString(
            "News of Turowicz's death was brought to Pope John Paul II while he was about to celebrate Mass in St. Louis." ) ), ConsesLow.list( makeString( "NYT19990128.0498.4" ), ZERO_INTEGER, makeString(
                "He then prayed for the soul of the man who had been described as his closest friend at the time of his election to the papacy in 1978." ) ), ConsesLow.list( makeString( "NYT19990128.0498.5" ),
                    ZERO_INTEGER, makeString(
                        "In the years after communism fell in their native Poland in 1989, they differed over issues like abortion, but their friendship went back to a time when Turowicz published the pope's poems and essays while he was still Karol Wojtyla, a priest from Krakow." ) ),
        ConsesLow.list( makeString( "NYT19990128.0498.6" ), ZERO_INTEGER, makeString(
            "The death was front-page news all over Poland, and Thursday's issues of Gazeta Wyborcza, a Warsaw daily, devoted eight pages to Turowicz, including a poem about him by Czeslaw Milosz, the 1980 Nobel laureate in literature." ) ),
        ConsesLow.list( makeString( "NYT19990128.0498.7" ), ZERO_INTEGER, makeString(
            "In an editorial, the paper said Turowicz ``was the moral authority of several generations of Polish intellectuals; a wonderful essayist and a rational commentator on everything.''" ) ), ConsesLow.list(
                makeString( "NYT19990128.0498.8" ), ZERO_INTEGER, makeString(
                    "Referring to his Krakow-based publication, whose name means The Universal Weekly, the editorial added, ``For more than a half century he established Tygodnik Powszechny as an achievement without precedent in the annals of Polish culture, an achievement that for many years provided the only light in the dark Polish tunnel.``" ) ),
        ConsesLow.list( makeString( "NYT19990128.0498.9" ), ZERO_INTEGER, makeString( "The magazine was founded in 1945, sponsored by Adam Sapieha, who was then Archbishop of Krakow." ) )
      } ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESPORATOR" ), makeString( "The cat sat on the mat." ) ), ConsesLow.cons( makeSymbol( "THING" ), makeString( "cat" ) ), ConsesLow.cons( makeSymbol( "VEHICLE" ),
          makeString( "cat" ) ), ConsesLow.cons( makeSymbol( "THING" ), makeString( "mat" ) ) ), ConsesLow.list( new SubLObject[]
          { ConsesLow.list( makeSymbol( "GET-WORD-GRAPH" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "Jawien" ) ) ) ), ConsesLow.list( makeString( "forced" ), makeString( "write" ) ), ConsesLow
              .list( makeString( "gazeta" ), makeString( "eight" ) ), ConsesLow.list( makeString( "heart" ), makeString( "86" ) ), ConsesLow.list( makeString( "never" ), makeString( "forced" ), makeString( "think" ) ),
            ConsesLow.list( makeString( "decades" ), makeString( "died" ), makeString( "skirmished" ), makeString( "four" ) ), ConsesLow.list( makeString( "featured" ), makeString( "stringent" ) ), ConsesLow.list(
                makeString( "enraging" ), makeString( "direct" ), makeString( "independence" ) ), ConsesLow.list( makeString( "aroused" ), makeString( "trouble" ) ), ConsesLow.list( makeString( "issues" ), makeString(
                    "including" ), makeString( "1989" ), makeString( "nobel" ) ), ConsesLow.list( makeString( "differed" ), makeString( "went" ), makeString( "wojtyla" ), makeString( "poems" ), makeString( "priest" ),
                        makeString( "abortion" ) ), ConsesLow.list( makeString( "including" ), makeString( "news" ), makeString( "word" ) ), ConsesLow.list( makeString( "stalin" ), makeString( "three" ), makeString(
                            "soviet" ), makeString( "perhaps" ) ), ConsesLow.list( makeString( "sapieha" ), makeString( "archbishop" ) ), ConsesLow.list( makeString( "perhaps" ), makeString( "ordered" ), makeString(
                                "1953" ), makeString( "despot" ), makeString( "boldest" ), makeString( "act" ) ), ConsesLow.list( makeString( "news" ), makeString( "death" ), makeString( "paul" ) ), ConsesLow.list(
                                    makeString( "poet" ), makeString( "origins" ) ), ConsesLow.list( makeString( "everything" ), makeString( "free" ), makeString( "1986" ) ), ConsesLow.list( makeString( "polish" ),
                                        makeString( "weekly" ) ), ConsesLow.list( new SubLObject[]
                                        { makeString( "elsewhere" ), makeString( "1951" ), makeString( "semitic" ), makeString( "1968" ), makeString( "antoni" ), makeString( "jewish" ), makeString( "editor" ),
                                          makeString( "mounted" ), makeString( "government" )
            } ), ConsesLow.list( makeString( "perspective" ), makeString( "believe" ), makeString( "reader" ), makeString( "newspaper" ) ), ConsesLow.list( makeString( "abortion" ), makeString( "native" ), makeString(
                "karol" ) ), ConsesLow.list( makeString( "years" ), makeString( "1945" ), makeString( "krakow" ) ), ConsesLow.list( makeString( "control" ), makeString( "took" ), makeString( "moved" ), makeString(
                    "enraging" ) ), ConsesLow.list( makeString( "intellectuals" ), makeString( "wonderful" ), makeString( "generations" ) ), ConsesLow.list( makeString( "editorial" ), makeString( "polish" ), makeString(
                        "annals" ), makeString( "weekly" ), makeString( "culture" ) ), ConsesLow.list( makeString( "stringent" ), makeString( "less" ) ), ConsesLow.list( makeString( "east" ), makeString( "great" ) ),
            ConsesLow.list( makeString( "word" ), makeString( "removed" ), makeString( "dashes" ), makeString( "something" ), makeString( "instituted" ), makeString( "show" ) ), ConsesLow.list( makeString( "soviet" ),
                makeString( "three" ) ), ConsesLow.list( makeString( "antoni" ), makeString( "figure" ) ), ConsesLow.list( makeString( "collaborating" ), makeString( "turned" ) ), ConsesLow.list( makeString( "leaders" ),
                    makeString( "elsewhere" ), makeString( "deal" ), makeString( "bloc" ), makeString( "articles" ), makeString( "publishing" ) ), ConsesLow.list( makeString( "publication" ), makeString( "use" ) ),
            ConsesLow.list( makeString( "publish" ), makeString( "party" ), makeString( "occurred" ) ), ConsesLow.list( makeString( "figure" ), makeString( "poet" ), makeString( "contributing" ), makeString(
                "instance" ), makeString( "anti" ), makeString( "invited" ), makeString( "number" ) ), ConsesLow.list( makeString( "established" ), makeString( "light" ) ), ConsesLow.list( makeString( "periods" ),
                    makeString( "censorship" ) ), ConsesLow.list( makeString( "tell" ), makeString( "same" ) ), ConsesLow.list( makeString( "paper" ), makeString( "taken" ), makeString( "catholic" ) ), ConsesLow.list(
                        makeString( "ways" ), makeString( "aroused" ), makeString( "found" ), makeString( "sensitized" ), makeString( "conspiratorially" ) ), ConsesLow.list( makeString( "1945" ), makeString( "adam" ),
                            makeString( "founded" ) ), ConsesLow.list( makeString( "despot" ), makeString( "publish" ) ), ConsesLow.list( makeString( "pax" ), makeString( "refused" ) ), ConsesLow.list( makeString(
                                "daily" ), makeString( "warsaw" ), makeString( "laureate" ), makeString( "pages" ), makeString( "literature" ), makeString( "wyborcza" ) ), ConsesLow.list( makeString( "publishing" ),
                                    makeString( "religion" ), makeString( "politics" ) ), ConsesLow.list( makeString( "skirmished" ), makeString( "jerzy" ) ), ConsesLow.list( makeString( "pages" ), makeString(
                                        "1980" ) ), ConsesLow.list( makeString( "editor" ), makeString( "1951" ), makeString( "church" ) ), ConsesLow.list( makeString( "literature" ), makeString( "poem" ), makeString(
                                            "devoted" ), makeString( "thursday" ) ), ConsesLow.list( makeString( "newspaper" ), makeString( "known" ) ), ConsesLow.list( makeString( "essayist" ), makeString(
                                                "everything" ), makeString( "moral" ), makeString( "editorial" ) ), ConsesLow.list( makeString( "poems" ), makeString( "election" ), makeString( "time" ) ), ConsesLow.list(
                                                    makeString( "election" ), makeString( "closest" ) ), ConsesLow.list( makeString( "jerzy" ), makeString( "nearly" ), makeString( "became" ), makeString(
                                                        "vladivostok" ) ), ConsesLow.list( makeString( "1986" ), makeString( "never" ), makeString( "free" ) ), ConsesLow.list( makeString( "mass" ), makeString( "ii" ),
                                                            makeString( "celebrate" ) ), ConsesLow.list( makeString( "times" ), makeString( "censors" ), makeString( "articles" ), makeString( "leaders" ), makeString(
                                                                "poles" ) ), ConsesLow.list( makeString( "turowicz" ), makeString( "suffered" ), makeString( "pope" ) ), ConsesLow.list( makeString( "added" ), makeString(
                                                                    "powszechny" ) ), ConsesLow.list( makeString( "1989" ), makeString( "differed" ), makeString( "nobel" ) ), ConsesLow.list( makeString( "troops" ),
                                                                        makeString( "led" ), makeString( "suppressed" ) ), ConsesLow.list( makeString( "practice" ), makeString( "readers" ) ), ConsesLow.list( makeString(
                                                                            "church" ), makeString( "communist" ), makeString( "officials" ) ), ConsesLow.list( makeString( "invited" ), makeString( "scale" ) ), ConsesLow
                                                                                .list( makeString( "communists" ), makeString( "collaborating" ) ), ConsesLow.list( makeString( "eight" ), makeString( "front" ) ),
            ConsesLow.list( makeString( "paul" ), makeString( "john" ) ), ConsesLow.list( makeString( "leadership" ), makeString( "krakow" ), makeString( "years" ) ), ConsesLow.list( makeString( "known" ), makeString(
                "issues" ), makeString( "poland" ) ), ConsesLow.list( makeString( "krakow" ), makeString( "1945" ) ), ConsesLow.list( makeString( "rational" ), makeString( "intellectuals" ) ), ConsesLow.list( makeString(
                    "prayed" ), makeString( "man" ) ), ConsesLow.list( makeString( "adam" ), makeString( "sponsored" ), makeString( "sapieha" ) ), ConsesLow.list( makeString( "catholic" ), makeString( "wednesday" ) ),
            ConsesLow.list( makeString( "semitic" ), makeString( "shunned" ) ), ConsesLow.list( makeString( "1951" ), makeString( "stalin" ), makeString( "control" ), makeString( "officials" ), makeString( "church" ) ),
            ConsesLow.list( makeString( "wednesday" ), makeString( "decades" ) ), ConsesLow.list( makeString( "taken" ), makeString( "wednesday" ), makeString( "called" ), makeString( "catholic" ) ), ConsesLow.list(
                makeString( "moral" ), makeString( "everything" ), makeString( "1986" ), makeString( "authority" ), makeString( "annals" ), makeString( "editorial" ) ), ConsesLow.list( makeString( "poland" ), makeString(
                    "issues" ), makeString( "turowicz" ), makeString( "pope" ) ), ConsesLow.list( makeString( "trouble" ), makeString( "things" ) ), ConsesLow.list( makeString( "little" ), makeString( "perspective" ),
                        makeString( "ways" ), makeString( "leaders" ), makeString( "times" ), makeString( "poles" ) ), ConsesLow.list( makeString( "front" ), makeString( "page" ) ), ConsesLow.list( makeString(
                            "instituted" ), makeString( "practice" ) ), ConsesLow.list( makeString( "time" ), makeString( "election" ) ), ConsesLow.list( makeString( "three" ), makeString( "worker" ) ), ConsesLow.list(
                                makeString( "shown" ), makeString( "slawomir" ) ), ConsesLow.list( makeString( "adding" ), makeString( "view" ), makeString( "shown" ), makeString( "us" ), makeString( "lies" ),
                                    makeString( "playwright" ) ), ConsesLow.list( makeString( "say" ), makeString( "article" ), makeString( "essayist" ) ), ConsesLow.list( makeString( "poles" ), makeString(
                                        "perspective" ), makeString( "newspaper" ) ), ConsesLow.list( makeString( "provided" ), makeString( "use" ), makeString( "publication" ) ), ConsesLow.list( makeString(
                                            "suffered" ), makeString( "attack" ) ), ConsesLow.list( makeString( "wyborcza" ), makeString( "gazeta" ) ), ConsesLow.list( makeString( "john" ), makeString( "brought" ),
                                                makeString( "mass" ) ), ConsesLow.list( makeString( "attack" ), makeString( "heart" ) ), ConsesLow.list( makeString( "believe" ), makeString( "tell" ), makeString(
                                                    "adding" ) ), ConsesLow.list( makeString( "things" ), makeString( "say" ) ), ConsesLow.list( makeString( "annals" ), makeString( "tunnel" ), makeString( "culture" ) ),
            ConsesLow.list( makeString( "called" ), makeString( "result" ), makeString( "group" ), makeString( "pax" ), makeString( "communists" ) ), ConsesLow.list( new SubLObject[]
            { makeString( "tunnel" ), makeString( "achievement" ), makeString( "based" ), makeString( "universal" ), makeString( "tygodnik" ), makeString( "name" ), makeString( "means" ), makeString( "precedent" ),
              makeString( "established" ), makeString( "provided" ), makeString( "added" )
            } ), ConsesLow.list( makeString( "nobel" ), makeString( "including" ), makeString( "daily" ), makeString( "news" ), makeString( "word" ), makeString( "paul" ) ), ConsesLow.list( new SubLObject[] { makeString(
                "worker" ), makeString( "poznan" ), makeString( "hungarian" ), makeString( "troops" ), makeString( "new" ), makeString( "rebellion" ), makeString( "leadership" ), makeString( "credibility" ), makeString(
                    "uprisings" ), makeString( "sought" ), makeString( "returned" )
            } ), ConsesLow.list( makeString( "andrzej" ), makeString( "pseudonym" ) ), ConsesLow.list( makeString( "generations" ), makeString( "paper" ), makeString( "taken" ), makeString( "commentator" ) ), ConsesLow
                .list( makeString( "articles" ), makeString( "elsewhere" ), makeString( "bloc" ), makeString( "editor" ) ), ConsesLow.list( makeString( "use" ), makeString( "andrzej" ), makeString( "pieces" ),
                    makeString( "continued" ) ), ConsesLow.list( makeString( "closest" ), makeString( "described" ), makeString( "papacy" ), makeString( "1978" ), makeString( "prayed" ), makeString( "friend" ),
                        makeString( "soul" ) ), ConsesLow.list( makeString( "officials" ), makeString( "stalin" ), makeString( "soviet" ) ), ConsesLow.list( makeString( "article" ), makeString( "essayist" ), makeString(
                            "moral" ), makeString( "periods" ), makeString( "idiotism" ) ), ConsesLow.list( makeString( "deal" ), makeString( "east" ) ), ConsesLow.list( makeString( "1968" ), makeString( "published" ) ),
            ConsesLow.list( makeString( "pieces" ), makeString( "ran" ), makeString( "jawien" ) ), ConsesLow.list( makeString( "bloc" ), makeString( "deal" ) ), ConsesLow.list( makeString( "authority" ), makeString(
                "rational" ) ), ConsesLow.list( makeString( "idiotism" ), makeString( "kisielewski" ), makeString( "featured" ) )
      } ), ConsesLow.list( ConsesLow.list( makeSymbol( "ASK-QAGA" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "Jawien" ) ) ) ), makeString(
          "*TUROWICZ* ran it on the *FRONT* *PAGE* under a pseudonym Andrzej *JAWIEN* which the future pope continued to use on his pieces in the publication " ), makeString(
              "He alone and nobody else lives in our hearts and symbolizes our dignity and pride said Al Musawir al Arabi *WEEKLY* in a *FRONT* *PAGE* editorial " ), makeString(
                  "He ordered it done and was given the metal *FRONT* *PAGE* press plate as a souvenir " ), makeString(
                      "A *FRONT* *PAGE* story of the first issue said that the exposition is profoundly and positively influencing the society and the economy in Yunnan " ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                          "ASK-GLIMPSE" ), makeString( "Jawien" ) ), ConsesLow.list( makeKeyword( "FILE" ), makeString( "19990128_NYT.dir" ), makeKeyword( "ARTICLE" ), makeInteger( 467 ), makeKeyword( "LINE" ),
                              makeInteger( 69 ), makeKeyword( "TEXT" ), makeString(
                                  "Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication." ) ) ), ConsesLow.cons( ConsesLow.list(
                                      makeSymbol( "PARSE-DATE" ), makeString( "August 3, 1966" ) ), makeInteger( "19660803000000" ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "INVOKE-WORDNET" ), ConsesLow.list(
                                          makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeString( "class" ), makeString( "word" ) ), ConsesLow.list( makeString( "pos" ), makeString( "noun" ) ), ConsesLow.list(
                                              makeString( "form" ), makeString( "sky" ) ), ConsesLow.list( makeString( "method" ), makeString( "getSenses" ) ) ) ) ), makeSymbol( "LIST" ), ConsesLow.list( makeSymbol(
                                                  "NEW-SENSE-PROXY" ), ConsesLow.list( makeSymbol( "NEW-SYNSET-PROXY" ), makeString( "noun" ), makeInteger( 7748403 ), makeString(
                                                      "outer space as viewed from the earth" ) ), makeString( "sky" ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_external_interfaces_file();
  }

  @Override
  public void initializeVariables()
  {
    init_external_interfaces_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_external_interfaces_file();
  }
  static
  {
    me = new external_interfaces();
    $quirk_host$ = null;
    $quirk_port$ = null;
    $talent_path$ = null;
    $npp_default$ = null;
    $shallow_parse_path$ = null;
    $dependency_parse_path$ = null;
    $guruqa_retrieve_passage_path$ = null;
    $guruqa_answer_indexes_path$ = null;
    $resporator_path$ = null;
    $guruqa_wizard$ = null;
    $dict_db_user$ = null;
    $dict_db_passwd$ = null;
    $dict_db$ = null;
    $dict_host$ = null;
    $dict_conn$ = null;
    $dict_stmt$ = null;
    $all_external_services$ = null;
    $str0$mongo_cyc_com = makeString( "mongo.cyc.com" );
    $int1$8080 = makeInteger( 8080 );
    $str2$_users_textract_showtalent = makeString( "/users/textract/showtalent" );
    $str3$_users_textract_sexpr_shallow = makeString( "/users/textract/sexpr-shallow" );
    $str4$_users_supertagger_sexprlda = makeString( "/users/supertagger/sexprlda" );
    $str5$_users_textract_documentWindow = makeString( "/users/textract/documentWindow" );
    $str6$_users_textract_guruqaIds = makeString( "/users/textract/guruqaIds" );
    $str7$_users_textract_sexprresporator = makeString( "/users/textract/sexprresporator" );
    $sym8$CYCL_GURUQA_QUERY_WIZARD = makeSymbol( "CYCL-GURUQA-QUERY-WIZARD" );
    $sym9$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const10$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str11$__mt___A = makeString( "~&mt: ~A" );
    $str12$__wiz___A = makeString( "~&wiz: ~A" );
    $str13$__cyc_expr___S_of_type__S = makeString( "~&cyc-expr: ~S of type ~S" );
    $sym14$HOLISTIC_GURUQA_QUERY = makeSymbol( "HOLISTIC-GURUQA-QUERY" );
    $str15$__guruqa_query_expr___A = makeString( "~&guruqa query expr: ~A" );
    $sym16$TO_STRING = makeSymbol( "TO-STRING" );
    $str17$__guruqa_query_str___A = makeString( "~&guruqa query str: ~A" );
    $str18$_________________________________ = makeString( "~%====================================================================" );
    $str19$___A = makeString( "~%~A" );
    $str20$_____S = makeString( "~%~%~S" );
    $sym21$ASK = makeSymbol( "ASK" );
    $sym22$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $str23$___S = makeString( "~%~S" );
    $sym24$STRINGP = makeSymbol( "STRINGP" );
    $kw25$DOC = makeKeyword( "DOC" );
    $kw26$SENT = makeKeyword( "SENT" );
    $kw27$POST = makeKeyword( "POST" );
    $str28$query = makeString( "query" );
    $str29$text = makeString( "text" );
    $sym30$QUIRK_LEXICON = makeSymbol( "QUIRK-LEXICON" );
    $sym31$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw32$OFF = makeKeyword( "OFF" );
    $sym33$PERSON = makeSymbol( "PERSON" );
    $sym34$GET = makeSymbol( "GET" );
    $kw35$DENOT = makeKeyword( "DENOT" );
    $const36$PersonTypeByOccupation = constant_handles.reader_make_constant_shell( makeString( "PersonTypeByOccupation" ) );
    $str37$doc = makeString( "doc" );
    $str38$start = makeString( "start" );
    $str39$length = makeString( "length" );
    $str40$_P_ = makeString( "<P>" );
    $str41$__P_ = makeString( "</P>" );
    $kw42$LEN = makeKeyword( "LEN" );
    $str43$npp = makeString( "npp" );
    $str44$_users_supertagger_old_sexprlda = makeString( "/users/supertagger_old/sexprlda" );
    $sym45$STRIP_STEMS = makeSymbol( "STRIP-STEMS" );
    $kw46$ROOT = makeKeyword( "ROOT" );
    $list47 = ConsesLow.list( makeKeyword( "S1" ) );
    $str48$ini = makeString( "ini" );
    $str49$mahler = makeString( "mahler" );
    $str50$ = makeString( "" );
    $str51$dict2 = makeString( "dict2" );
    $str52$elmore = makeString( "elmore" );
    $kw53$DBMS_SERVER = makeKeyword( "DBMS-SERVER" );
    $kw54$PORT = makeKeyword( "PORT" );
    $int55$9999 = makeInteger( 9999 );
    $kw56$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
    $str57$postgresql = makeString( "postgresql" );
    $str58$select_occurrences__documents__te = makeString( "select occurrences, documents, term from dict where term = '~A' and corpus = 'AQUAINT-Corpus';" );
    $str59$__ = makeString( "''" );
    $str60$_ = makeString( "'" );
    $sym61$LEMUR_QUERY = makeSymbol( "LEMUR-QUERY" );
    $sym62$GET_CORPUS_PATH_MAPPING = makeSymbol( "GET-CORPUS-PATH-MAPPING" );
    $str63$Unsupported_corpus__a = makeString( "Unsupported corpus ~a" );
    $str64$_inesgraph_cgi = makeString( "/inesgraph.cgi" );
    $sym65$LISTP = makeSymbol( "LISTP" );
    $str66$___A_____ = makeString( "~{~A~^ ~}" );
    $str67$_qaga_cgi = makeString( "/qaga.cgi" );
    $str68$_applepie_cgi = makeString( "/applepie.cgi" );
    $str69$_minipar_cgi = makeString( "/minipar.cgi" );
    $str70$_bash_cgi = makeString( "/bash.cgi" );
    $str71$command = makeString( "command" );
    $str72$_parse_date_cgi = makeString( "/parse-date.cgi" );
    $str73$datestring = makeString( "datestring" );
    $str74$year = makeString( "year" );
    $str75$month = makeString( "month" );
    $str76$day = makeString( "day" );
    $str77$hour = makeString( "hour" );
    $str78$minute = makeString( "minute" );
    $str79$second = makeString( "second" );
    $str80$_qack_cgi = makeString( "/qack.cgi" );
    $str81$_wordnet_cgi = makeString( "/wordnet.cgi" );
    $kw82$TEXT = makeKeyword( "TEXT" );
    $list83 = ConsesLow.list( ConsesLow.list( makeString( "type" ), makeString( "q" ) ) );
    $str84$_questions_cgi = makeString( "/questions.cgi" );
    $list85 = ConsesLow.list( makeString( "localhost" ) );
    $str86$Guest = makeString( "Guest" );
    $str87$_cgi_bin_users_mahler_check_cyc_s = makeString( "/cgi-bin/users/mahler/check_cyc_servers.perl" );
    $str88$servers = makeString( "servers" );
    $sym89$USER = makeSymbol( "USER" );
    $str90$_corpus_frequency_cgi = makeString( "/corpus-frequency.cgi" );
    $str91$dbfile = makeString( "dbfile" );
    $str92$word = makeString( "word" );
    $str93$pos = makeString( "pos" );
    $list94 = _constant_94_initializer();
    $int95$30 = makeInteger( 30 );
    $sym96$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
  }
}
/*
 * 
 * Total time: 424 ms
 * 
 */