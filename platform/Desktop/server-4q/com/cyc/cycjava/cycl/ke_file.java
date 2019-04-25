package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_file
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ke_file";
  public static final String myFingerPrint = "b76359d913e21333624ec30daf4790e275c7a9fce50a380398279cc60a2ed9bb";
  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 634L)
  private static SubLSymbol $ke_action_dispatch_table$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 750L)
  private static SubLSymbol $ke_state_defaults$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1007L)
  private static SubLSymbol $ke_file_reserved_words$;
  private static final SubLSymbol $kw0$MT;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CAR;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REPLACE;
  private static final SubLString $str6$___s____s;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$ASSERTION_ID;
  private static final SubLSymbol $kw9$LOCAL;
  private static final SubLSymbol $kw10$REMOTE;
  private static final SubLString $str11$_____;
  private static final SubLSymbol $sym12$EXCEPT_KE_CHARS;
  private static final SubLList $list13;
  private static final SubLString $str14$_;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$EOF;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$CCONCATENATE;
  private static final SubLSymbol $sym21$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const22$EverythingPSC;
  private static final SubLObject $const23$UnaryPredicate;
  private static final SubLObject $const24$Predicate;
  private static final SubLString $str25$_;
  private static final SubLList $list26;
  private static final SubLString $str27$_;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLString $str32$__;
  private static final SubLSymbol $kw33$MALFORMED;
  private static final SubLSymbol $kw34$CONS;
  private static final SubLSymbol $kw35$OK_TOKEN_FORMS;
  private static final SubLString $str36$___s_token_strings_loaded_;
  private static final SubLString $str37$___s_token_strings_processed_;
  private static final SubLString $str38$_____s_is_not_a_stream_or_a_strin;
  private static final SubLSymbol $kw39$REVERSE;
  private static final SubLString $str40$____Processing_token_strings____;
  private static final SubLSymbol $sym41$STRING_LESSP;
  private static final SubLString $str42$__Malformed_token_list___s;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLString $str47$in;
  private static final SubLString $str48$mt;
  private static final SubLString $str49$default;
  private static final SubLList $list50;
  private static final SubLString $str51$truth;
  private static final SubLString $str52$value;
  private static final SubLList $list53;
  private static final SubLString $str54$tv;
  private static final SubLList $list55;
  private static final SubLString $str56$access;
  private static final SubLString $str57$level;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$DEFAULT_MT;
  private static final SubLSymbol $kw60$CONSTANT;
  private static final SubLSymbol $kw61$TV;
  private static final SubLSymbol $kw62$UNKNOWN;
  private static final SubLSymbol $kw63$DIRECTION;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$DEFAULT;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$MONOTONIC;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$FORWARD;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$BACKWARD;
  private static final SubLList $list73;
  private static final SubLSymbol $kw74$CODE;
  private static final SubLString $str75$enter;
  private static final SubLSymbol $kw76$MODE;
  private static final SubLSymbol $kw77$ENTER;
  private static final SubLString $str78$delete;
  private static final SubLSymbol $kw79$DELETE;
  private static final SubLObject $const80$equiv;
  private static final SubLObject $const81$implies;
  private static final SubLSymbol $sym82$QUOTE;
  private static final SubLSymbol $kw83$ALREADY_IN_KB;
  private static final SubLSymbol $kw84$APPEND;
  private static final SubLSymbol $kw85$FORMS_TO_EVAL;
  private static final SubLSymbol $sym86$KE_ASSERT;
  private static final SubLSymbol $sym87$KE_UNASSERT;
  private static final SubLSymbol $sym88$KE_BLAST;
  private static final SubLList $list89;
  private static final SubLSymbol $kw90$NOT_IN_KB;
  private static final SubLObject $const91$BinaryPredicate;
  private static final SubLSymbol $kw92$ALREADY_CONSTANTS;
  private static final SubLSymbol $kw93$ADJOIN;
  private static final SubLSymbol $sym94$KE_RENAME;
  private static final SubLSymbol $sym95$KE_KILL;
  private static final SubLSymbol $kw96$NOT_VALID_CONSTANTS;
  private static final SubLSymbol $kw97$SINGLE;
  private static final SubLString $str98$___a_s;
  private static final SubLString $str99$_____a_s;
  private static final SubLList $list100;
  private static final SubLString $str101$_________________________________;
  private static final SubLString $str102$____;
  private static final SubLString $str103$_______s_in__s;
  private static final SubLString $str104$_______s_is_not_in__s;
  private static final SubLString $str105$____New_forms_to_evaluate_;
  private static final SubLSymbol $kw106$DOUBLE;
  private static final SubLString $str107$__Evaluate_the_form_above_now__;
  private static final SubLString $str108$__Evaluate_the__s_forms_above_now;
  private static final SubLString $str109$__One_form_evaluated_;
  private static final SubLString $str110$___s_forms_evaluated_;
  private static final SubLString $str111$____Please_check_the_input_file__;
  private static final SubLString $str112$These_assertions_are_already_in_t;
  private static final SubLString $str113$These_assertions_are_not_in_the_K;
  private static final SubLString $str114$These_strings_are_not_names_of_va;
  private static final SubLString $str115$These_strings_are_already_the_nam;
  private static final SubLString $str116$____Returning_to_Lisp_Interactor_;
  private static final SubLSymbol $kw117$UNKNOWNS;
  private static final SubLString $str118$____Waiting_for_create_operations;
  private static final SubLString $str119$____Problem_loading_file__s_;
  private static final SubLString $str120$____The_file_contains_fatal_synta;
  private static final SubLString $str121$____Please_check_the_input_file_f;
  private static final SubLString $str122$____Unknown_constants__or_constan;
  private static final SubLString $str123$____Make_Cyc_constants_of_the_str;
  private static final SubLString $str124$__OK___Be_sure_to_give_new_consta;
  private static final SubLSymbol $kw125$INPUT;
  private static final SubLString $str126$Unable_to_open__S;
  private static final SubLString $str127$__Sorry___s_is_not_known_to_be_a_;

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1394L)
  public static SubLObject make_ke_state_vector()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return misc_utilities.make_indexed_vector( ke_utilities.$ke_state_keys$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1540L)
  public static SubLObject get_ke_state(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user = cyclist.isString() ? fi.fi_find_int( cyclist ) : cyclist;
    return misc_utilities.get_indexed_obj( user, ke_utilities.$ke_state$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1854L)
  public static SubLObject add_ke_vector(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject vec = get_ke_state( cyclist );
    if( vec.isVector() && NIL != Numbers.numNE( Sequences.length( ke_utilities.$ke_state_keys$.getDynamicValue( thread ) ), Sequences.length( vec ) ) )
    {
      ke_utilities.$ke_state$.setDynamicValue( Sequences.remove( cyclist, ke_utilities.$ke_state$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym3$CAR ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), thread );
      vec = make_ke_state_vector();
      ke_utilities.$ke_state$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( cyclist, vec ), ke_utilities.$ke_state$.getDynamicValue( thread ) ), thread );
    }
    else if( NIL == vec )
    {
      vec = make_ke_state_vector();
      ke_utilities.$ke_state$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( cyclist, vec ), ke_utilities.$ke_state$.getDynamicValue( thread ) ), thread );
    }
    return reset_ke_state( cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 2394L)
  public static SubLObject reset_ke_state(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = ke_utilities.$ke_state_keys$.getDynamicValue( thread );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key = pair.first();
      final SubLObject v_default = conses_high.assoc( key, $ke_state_defaults$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
      if( NIL == subl_promotions.memberP( key, $list4, UNPROVIDED, UNPROVIDED ) )
      {
        ke_utilities.change_ke_value( cyclist, key, $kw5$REPLACE, v_default );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return get_ke_state( cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 2719L)
  public static SubLObject return_ke_state(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = Mapping.mapcar( Symbols.symbol_function( $sym3$CAR ), ke_utilities.$ke_state_keys$.getDynamicValue( thread ) );
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( ConsesLow.list( key, ke_utilities.ke_value( cyclist, key ) ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 2903L)
  public static SubLObject print_ke_state(final SubLObject cyclist)
  {
    final SubLObject result = return_ke_state( cyclist );
    if( result.isCons() )
    {
      SubLObject cdolist_list_var = result;
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( T, $str6$___s____s, x.first(), conses_high.second( x ) );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
    }
    else
    {
      print_high.print( result, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 3116L)
  public static SubLObject clear_ke_state(final SubLObject cyclist, SubLObject key_list, SubLObject exception_list)
  {
    if( key_list == UNPROVIDED )
    {
      key_list = NIL;
    }
    if( exception_list == UNPROVIDED )
    {
      exception_list = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_keys = Mapping.mapcar( Symbols.symbol_function( $sym3$CAR ), ke_utilities.$ke_state_keys$.getDynamicValue( thread ) );
    SubLObject cdolist_list_var;
    final SubLObject keys_to_use = cdolist_list_var = ( ( NIL != key_list ) ? key_list : ( ( NIL != exception_list ) ? conses_high.set_difference( all_keys, exception_list, UNPROVIDED, UNPROVIDED ) : all_keys ) );
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke_utilities.change_ke_value( cyclist, key, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return get_ke_state( cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 3716L)
  public static SubLObject blast_ke_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    ke_set_dispatch_table();
    ke_utilities.$ke_state$.setDynamicValue( NIL, thread );
    return ke_utilities.$ke_state$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 3858L)
  public static SubLObject ke_init(final SubLObject cyclist)
  {
    add_ke_vector( cyclist );
    clear_ke_state( cyclist, NIL, $list4 );
    reset_ke_state( cyclist );
    ke_set_dispatch_table();
    return get_ke_state( cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 4091L)
  public static SubLObject ke_set_dispatch_table()
  {
    $ke_action_dispatch_table$.setDynamicValue( $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 5149L)
  public static SubLObject dispatch_on_test(final SubLObject token_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject table_pairs = NIL;
    SubLObject pair = NIL;
    SubLObject matchP = NIL;
    table_pairs = $ke_action_dispatch_table$.getDynamicValue( thread );
    for( pair = table_pairs.first(), matchP = Functions.funcall( pair.first(), token_list ); NIL == matchP; matchP = Functions.funcall( pair.first(), token_list ) )
    {
      table_pairs = table_pairs.rest();
      pair = table_pairs.first();
    }
    Functions.funcall( pair.rest(), token_list );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 5627L)
  public static SubLObject ids_from_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( NIL == forts.fort_p( mt ) && mt.isCons() )
    {
      mt = narts_high.find_nart( mt );
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym8$ASSERTION_ID ), fi.sentence_assertions( sentence, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 5897L)
  public static SubLObject source_type(final SubLObject sentence, SubLObject mt)
  {
    if( NIL == forts.fort_p( mt ) && mt.isCons() )
    {
      mt = narts_high.find_nart( mt );
    }
    final SubLObject assertions = fi.sentence_assertions( sentence, mt );
    SubLObject type = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( ass ) )
      {
        if( NIL != assertions_high.asserted_assertionP( ass ) )
        {
          type = $kw9$LOCAL;
        }
        else if( type != $kw9$LOCAL )
        {
          type = $kw10$REMOTE;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 6365L)
  public static SubLObject filter_out_ok_constants(final SubLObject list)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = list;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject constant = fi.fi_find_int( string );
      if( NIL == constant )
      {
        final SubLObject item_var = string;
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 6703L)
  public static SubLObject except_ke_chars(final SubLObject v_char)
  {
    return makeBoolean( NIL == Sequences.find( v_char, $str11$_____, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 6787L)
  public static SubLObject get_unknown_constants(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constants = NIL;
    SubLObject cdolist_list_var;
    final SubLObject words = cdolist_list_var = string_utilities.break_words( string, Symbols.symbol_function( $sym12$EXCEPT_KE_CHARS ), T );
    SubLObject w = NIL;
    w = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject first_char = Strings.sublisp_char( w, ZERO_INTEGER );
      if( NIL == Sequences.find( first_char, $list13, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == cycl_variables.el_var_nameP( w ) && NIL == number_utilities.number_string_p( w ) && NIL == Sequences.find(
          w, $ke_file_reserved_words$.getDynamicValue( thread ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = w;
        if( NIL == conses_high.member( item_var, constants, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          constants = ConsesLow.cons( item_var, constants );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      w = cdolist_list_var.first();
    }
    constants = filter_out_ok_constants( constants );
    return constants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 7395L)
  public static SubLObject frob_comments(final SubLObject string)
  {
    if( NIL != string_utilities.substringP( $str14$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject len = Sequences.length( string );
      SubLObject inside_dqP = NIL;
      SubLObject i;
      SubLObject ch;
      for( i = NIL, i = ZERO_INTEGER; i.numL( len ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        ch = Vectors.aref( string, i );
        if( NIL == Characters.charE( ch, Characters.CHAR_semicolon ) && i.numE( Numbers.subtract( len, ONE_INTEGER ) ) )
        {
          return string;
        }
        if( NIL != Characters.charE( ch, Characters.CHAR_semicolon ) && NIL == inside_dqP )
        {
          return Sequences.subseq( string, ZERO_INTEGER, i );
        }
        if( NIL != Characters.charE( ch, Characters.CHAR_quotation ) && NIL == inside_dqP )
        {
          inside_dqP = T;
        }
        else if( NIL != Characters.charE( ch, Characters.CHAR_quotation ) && NIL != inside_dqP )
        {
          inside_dqP = NIL;
        }
      }
      return NIL;
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8068L)
  public static SubLObject count_tokens(final SubLObject token, final SubLObject list)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = list;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( string.equalp( token ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8308L)
  public static SubLObject lpP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_lparen );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8395L)
  public static SubLObject rpP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_rparen );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8483L)
  public static SubLObject spaceP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_space );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8581L)
  public static SubLObject lbrP(final SubLObject ch)
  {
    return list_utilities.sublisp_boolean( Sequences.find( Characters.char_code( ch ), $list15, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8694L)
  public static SubLObject tabP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_tab );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8786L)
  public static SubLObject dquoteP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_quotation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8877L)
  public static SubLObject periodP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_period );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8968L)
  public static SubLObject semiP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_semicolon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9057L)
  public static SubLObject colonP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_colon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9147L)
  public static SubLObject dol_signP(final SubLObject ch)
  {
    return Characters.charE( ch, Characters.CHAR_dollar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9240L)
  public static SubLObject whitespace_char_p(final SubLObject ch)
  {
    return makeBoolean( NIL != Sequences.find( ch, $list16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL == ke_utilities.printable_ascii_charP( ch ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9361L)
  public static SubLObject ke_file_tokenize_string(SubLObject string)
  {
    if( NIL == string_utilities.non_empty_stringP( string ) )
    {
      return NIL;
    }
    string = Strings.string_trim( $list17, string );
    SubLObject token_list = NIL;
    SubLObject inside_dqP = NIL;
    SubLObject p1 = ZERO_INTEGER;
    final SubLObject len = Sequences.length( string );
    SubLObject lps = ZERO_INTEGER;
    SubLObject rps = ZERO_INTEGER;
    SubLObject p2;
    SubLObject ch1;
    SubLObject ch2;
    SubLObject p3;
    SubLObject ch3;
    for( p2 = NIL, p2 = ZERO_INTEGER; p2.numL( len ); p2 = Numbers.add( p2, ONE_INTEGER ) )
    {
      ch1 = Strings.sublisp_char( string, p1 );
      ch2 = Strings.sublisp_char( string, p2 );
      p3 = p2.numL( Numbers.subtract( len, ONE_INTEGER ) ) ? Numbers.add( p2, ONE_INTEGER ) : NIL;
      ch3 = ( NIL != p3 ) ? Strings.sublisp_char( string, p3 ) : NIL;
      if( NIL == inside_dqP )
      {
        if( NIL != lpP( ch2 ) )
        {
          lps = Numbers.add( lps, ONE_INTEGER );
        }
        else if( NIL != rpP( ch2 ) )
        {
          rps = Numbers.add( rps, ONE_INTEGER );
        }
      }
      if( p2.numE( Numbers.subtract( len, ONE_INTEGER ) ) && p2.numGE( p1 ) && NIL == spaceP( ch2 ) )
      {
        token_list = ConsesLow.cons( Sequences.subseq( string, p1, len ), token_list );
      }
      else if( NIL != spaceP( ch1 ) && NIL != spaceP( ch2 ) )
      {
        p1 = Numbers.add( p2, ONE_INTEGER );
      }
      else if( NIL != spaceP( ch2 ) && lps.numE( rps ) && NIL == inside_dqP )
      {
        token_list = ConsesLow.cons( Sequences.subseq( string, p1, p2 ), token_list );
        p1 = Numbers.add( p2, ONE_INTEGER );
      }
      else if( NIL != colonP( ch2 ) && NIL != whitespace_char_p( ch3 ) && p2.numG( p1 ) && NIL == inside_dqP )
      {
        token_list = ConsesLow.cons( Sequences.subseq( string, p1, p2 ), token_list );
        p1 = p2;
      }
      else if( NIL != colonP( ch1 ) && NIL != whitespace_char_p( ch3 ) && p2.numG( p1 ) && NIL == inside_dqP )
      {
        token_list = ConsesLow.cons( Sequences.subseq( string, p1, p2 ), token_list );
        p1 = p2;
      }
      else if( NIL != rpP( ch2 ) && NIL == inside_dqP )
      {
        if( lps.numE( rps ) )
        {
          token_list = ConsesLow.cons( Sequences.subseq( string, p1, Numbers.add( p2, ONE_INTEGER ) ), token_list );
          p1 = Numbers.add( p2, ONE_INTEGER );
        }
      }
      else if( NIL != dquoteP( ch2 ) && NIL != inside_dqP )
      {
        inside_dqP = NIL;
        if( lps.numE( rps ) )
        {
          token_list = ConsesLow.cons( Sequences.subseq( string, p1, Numbers.add( p2, ONE_INTEGER ) ), token_list );
          p1 = Numbers.add( p2, ONE_INTEGER );
        }
      }
      else if( NIL != dquoteP( ch2 ) )
      {
        inside_dqP = T;
        if( p2.numG( p1 ) && lps.numE( rps ) )
        {
          token_list = ConsesLow.cons( Sequences.subseq( string, p1, p2 ), token_list );
          p1 = p2;
        }
      }
    }
    return Sequences.nreverse( token_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 11214L)
  public static SubLObject ke_read_from_stream(final SubLObject stream)
  {
    SubLObject temp;
    SubLObject inside_dqP;
    SubLObject inside_commentP;
    SubLObject lps;
    SubLObject rps;
    SubLObject ch;
    for( temp = NIL, inside_dqP = NIL, inside_commentP = NIL, lps = ZERO_INTEGER, rps = ZERO_INTEGER, ch = NIL, ch = streams_high.read_char( stream, NIL, $kw18$EOF, UNPROVIDED ); ch != $kw18$EOF && NIL != ch
        && ( NIL == Characters.charE( ch, Characters.CHAR_period ) || NIL == conses_high.set_difference( temp, $list19, UNPROVIDED, UNPROVIDED ) || !lps.numE( rps ) || NIL != inside_dqP
            || NIL != inside_commentP ); ch = streams_high.read_char( stream, NIL, $kw18$EOF, UNPROVIDED ) )
    {
      if( NIL != semiP( ch ) && NIL == inside_dqP )
      {
        inside_commentP = T;
      }
      else if( NIL != inside_commentP && NIL != lbrP( ch ) )
      {
        inside_commentP = NIL;
      }
      else if( NIL == inside_commentP )
      {
        if( NIL != dquoteP( ch ) && NIL != inside_dqP )
        {
          inside_dqP = NIL;
        }
        else if( NIL != dquoteP( ch ) )
        {
          inside_dqP = T;
        }
        else if( NIL != lpP( ch ) && NIL == inside_dqP )
        {
          lps = Numbers.add( lps, ONE_INTEGER );
        }
        else if( NIL != rpP( ch ) && NIL == inside_dqP )
        {
          rps = Numbers.add( rps, ONE_INTEGER );
        }
        if( ( NIL != lbrP( ch ) || NIL != tabP( ch ) ) && NIL == inside_dqP )
        {
          temp = ConsesLow.cons( Characters.CHAR_space, temp );
        }
        else if( NIL == periodP( ch ) || NIL != inside_dqP || !lps.numE( rps ) )
        {
          temp = ConsesLow.cons( ch, temp );
        }
      }
    }
    if( NIL != conses_high.set_difference( temp, $list19, UNPROVIDED, UNPROVIDED ) )
    {
      return string_utilities.char_list_to_string( Sequences.nreverse( temp ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 12524L)
  public static SubLObject ke_input_from_string(final SubLObject string)
  {
    SubLObject ans = NIL;
    SubLObject temp = NIL;
    SubLObject inside_dqP = NIL;
    SubLObject inside_commentP = NIL;
    SubLObject lps = ZERO_INTEGER;
    SubLObject rps = ZERO_INTEGER;
    SubLObject p1 = ZERO_INTEGER;
    SubLObject len;
    SubLObject p2;
    SubLObject ch;
    SubLObject ss;
    SubLObject endP;
    SubLObject ss2;
    for( len = Sequences.length( string ), p2 = NIL, p2 = ZERO_INTEGER; p2.numL( len ); p2 = Numbers.add( p2, ONE_INTEGER ) )
    {
      ch = Strings.sublisp_char( string, p2 );
      if( NIL != semiP( ch ) && NIL == inside_dqP )
      {
        if( NIL == inside_commentP && p2.numG( p1 ) )
        {
          ss = Sequences.subseq( string, p1, p2 );
          if( NIL == string_utilities.all_chars_EP( Characters.CHAR_space, ss ) )
          {
            temp = ConsesLow.cons( ss, temp );
          }
          p1 = Numbers.add( p2, ONE_INTEGER );
        }
        inside_commentP = T;
      }
      else if( NIL != inside_commentP && NIL != lbrP( ch ) )
      {
        inside_commentP = NIL;
        p1 = Numbers.add( p2, ONE_INTEGER );
      }
      else if( NIL == inside_commentP )
      {
        endP = Numbers.numE( p2, Numbers.subtract( len, ONE_INTEGER ) );
        if( ( NIL != Characters.charE( ch, Characters.CHAR_period ) && lps.numE( rps ) && NIL == inside_dqP ) || NIL != endP )
        {
          if( p2.numG( p1 ) )
          {
            ss2 = Sequences.subseq( string, p1, ( NIL != endP ) ? Numbers.add( p2, ONE_INTEGER ) : p2 );
            if( NIL == string_utilities.all_chars_EP( Characters.CHAR_space, ss2 ) )
            {
              temp = ConsesLow.cons( ss2, temp );
              temp = Sequences.nreverse( temp );
              ans = ConsesLow.cons( Functions.apply( Symbols.symbol_function( $sym20$CCONCATENATE ), temp.first(), temp.rest() ), ans );
              temp = NIL;
            }
          }
          p1 = Numbers.add( p2, ONE_INTEGER );
        }
        else if( NIL != dquoteP( ch ) && NIL != inside_dqP )
        {
          inside_dqP = NIL;
        }
        else if( NIL != dquoteP( ch ) )
        {
          inside_dqP = T;
        }
        else if( NIL != lpP( ch ) && NIL == inside_dqP )
        {
          lps = Numbers.add( lps, ONE_INTEGER );
        }
        else if( NIL != rpP( ch ) && NIL == inside_dqP )
        {
          rps = Numbers.add( rps, ONE_INTEGER );
        }
        else if( NIL != lbrP( ch ) || NIL != tabP( ch ) )
        {
          Vectors.set_aref( string, p2, Characters.CHAR_space );
        }
      }
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 13971L)
  public static SubLObject nested_parens_in_stringP(final SubLObject string)
  {
    return makeBoolean( string.isString() && string_utilities.count_chars_in_string( string, Characters.CHAR_lparen ).numG( ONE_INTEGER ) && NIL != ke_utilities.parens_equalP( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 14133L)
  public static SubLObject unary_predicateP(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym21$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const22$EverythingPSC, thread );
      ans = makeBoolean( NIL != constant_handles.valid_constantP( obj, UNPROVIDED ) && NIL != isa.isaP( obj, $const23$UnaryPredicate, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 14307L)
  public static SubLObject non_unary_predicateP(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym21$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const22$EverythingPSC, thread );
      ans = makeBoolean( NIL != constant_handles.valid_constantP( obj, UNPROVIDED ) && NIL != isa.isaP( obj, $const24$Predicate, UNPROVIDED, UNPROVIDED ) && NIL == unary_predicateP( obj ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 14518L)
  public static SubLObject malformedP(final SubLObject token_list)
  {
    final SubLObject colon_tokens = count_tokens( $str25$_, token_list );
    final SubLObject len = Sequences.length( token_list );
    final SubLObject first_token = token_list.first();
    final SubLObject second_token = conses_high.second( token_list );
    final SubLObject third_token = conses_high.third( token_list );
    final SubLObject fourth_token = conses_high.fourth( token_list );
    final SubLObject c1 = fi.fi_find_int( first_token );
    return makeBoolean( ( NIL != Sequences.find( first_token, $list26, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( NIL != Numbers.numNE( len, FOUR_INTEGER ) || NIL == string_utilities
        .substringP( $str27$_, fourth_token, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) || ( ( NIL != subl_promotions.memberP( first_token, $list28, Symbols.symbol_function( EQUALP ), UNPROVIDED )
            || NIL != unary_predicateP( c1 ) ) && NIL != Numbers.numNE( len, ONE_INTEGER ) ) || ( colon_tokens.numE( ZERO_INTEGER ) && NIL == subl_promotions.memberP( first_token, $list28, Symbols.symbol_function(
                EQUALP ), UNPROVIDED ) ) || ( NIL != non_unary_predicateP( c1 ) && len.numL( THREE_INTEGER ) ) || ( len.numE( ONE_INTEGER ) && colon_tokens.numG( ZERO_INTEGER ) ) || colon_tokens.numG( ONE_INTEGER )
        || ( colon_tokens.numE( ONE_INTEGER ) && NIL == subl_promotions.memberP( $str25$_, ConsesLow.list( second_token, third_token ), Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) || ( NIL != subl_promotions
            .memberP( first_token, $list29, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && NIL != Numbers.numNE( len, THREE_INTEGER ) ) || ( NIL != nested_parens_in_stringP( third_token ) && NIL != string_utilities
                .some_are_substringsP( $list30, third_token, UNPROVIDED ) && NIL == subl_promotions.memberP( first_token, $list31, Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 15955L)
  public static SubLObject tokenize_read(SubLObject source, SubLObject noisy)
  {
    if( noisy == UNPROVIDED )
    {
      noisy = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != noisy )
    {
      PrintLow.format( T, $str32$__ );
    }
    SubLObject count = ZERO_INTEGER;
    SubLObject haltP = NIL;
    if( source.isStream() )
    {
      SubLObject token_expr;
      for( token_expr = NIL, token_expr = ke_file_tokenize_string( ke_utilities.strip_garbage_chars( ke_read_from_stream( source ), html_ke_file.$remove_non_printing_characters$.getDynamicValue(
          thread ) ) ); NIL != token_expr && NIL == haltP; token_expr = ke_file_tokenize_string( ke_utilities.strip_garbage_chars( ke_read_from_stream( source ), html_ke_file.$remove_non_printing_characters$
              .getDynamicValue( thread ) ) ) )
      {
        if( NIL != malformedP( token_expr ) )
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_expr );
          haltP = T;
        }
        else
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS, $kw34$CONS, token_expr );
        }
        count = Numbers.add( count, ONE_INTEGER );
        if( NIL != noisy && count.numG( ZERO_INTEGER ) && Numbers.mod( count, TEN_INTEGER ).numE( ZERO_INTEGER ) )
        {
          PrintLow.format( T, $str36$___s_token_strings_loaded_, count );
        }
      }
    }
    else if( source.isString() )
    {
      SubLObject cdolist_list_var = ke_input_from_string( source );
      SubLObject string = NIL;
      string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject token_expr2 = ke_file_tokenize_string( ke_utilities.strip_garbage_chars( string, html_ke_file.$remove_non_printing_characters$.getDynamicValue( thread ) ) );
        if( NIL != malformedP( token_expr2 ) )
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_expr2 );
        }
        else
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS, $kw34$CONS, token_expr2 );
        }
        count = Numbers.add( count, ONE_INTEGER );
        if( NIL != noisy && count.numG( ZERO_INTEGER ) && Numbers.mod( count, TEN_INTEGER ).numE( ZERO_INTEGER ) )
        {
          PrintLow.format( T, $str37$___s_token_strings_processed_, count );
        }
        cdolist_list_var = cdolist_list_var.rest();
        string = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( T, $str38$_____s_is_not_a_stream_or_a_strin, source );
    }
    if( NIL != ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw39$REVERSE, UNPROVIDED );
    }
    if( NIL != ke_utilities.ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS, $kw39$REVERSE, UNPROVIDED );
    }
    if( ( NIL != ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED ) || NIL != ke_utilities.ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS ) ) && NIL != noisy )
    {
      PrintLow.format( T, $str40$____Processing_token_strings____ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 17976L)
  public static SubLObject unknown_constants_among_tokens(final SubLObject token_forms)
  {
    SubLObject unknowns = NIL;
    SubLObject cdolist_list_var = token_forms;
    SubLObject token_list = NIL;
    token_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = token_list;
      SubLObject token = NIL;
      token = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        if( NIL == dquoteP( Strings.sublisp_char( token, ZERO_INTEGER ) ) )
        {
          unknowns = conses_high.union( unknowns, get_unknown_constants( token ), Symbols.symbol_function( EQUALP ), UNPROVIDED );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        token = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      token_list = cdolist_list_var.first();
    }
    return Sort.sort( unknowns, Symbols.symbol_function( $sym41$STRING_LESSP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 18484L)
  public static SubLObject give_upP(final SubLObject token_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke_utilities.$ke_debug$.getDynamicValue( thread ) )
    {
      PrintLow.format( T, $str42$__Malformed_token_list___s, token_list );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 18669L)
  public static SubLObject constant_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numE( THREE_INTEGER ) && NIL != conses_high.member( token_list.first(), $list43, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && conses_high.second( token_list )
        .equalp( $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 18932L)
  public static SubLObject rename_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numE( FOUR_INTEGER ) && NIL != conses_high.member( token_list.first(), $list44, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && conses_high.second( token_list )
        .equalp( $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19170L)
  public static SubLObject mode_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numE( ONE_INTEGER ) && NIL != conses_high.member( token_list.first(), $list45, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19373L)
  public static SubLObject probably_unaryP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numE( ONE_INTEGER ) && NIL == subl_promotions.memberP( token_list.first(), $list28, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19601L)
  public static SubLObject kill_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numGE( THREE_INTEGER ) && NIL != conses_high.member( token_list.first(), $list46, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && conses_high.second( token_list )
        .equalp( $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19834L)
  public static SubLObject mt_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numE( FOUR_INTEGER ) && token_list.first().equalp( $str47$in ) && conses_high.second( token_list ).equalp( $str48$mt ) && conses_high.third( token_list ).equalp(
        $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 20098L)
  public static SubLObject default_mt_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numE( FOUR_INTEGER ) && token_list.first().equalp( $str49$default ) && conses_high.second( token_list ).equalp( $str48$mt ) && conses_high.third( token_list )
        .equalp( $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 20383L)
  public static SubLObject el_dirP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numGE( THREE_INTEGER ) && NIL != conses_high.member( token_list.first(), $list50, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && conses_high.second( token_list )
        .equalp( $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 20614L)
  public static SubLObject tv_dirP(final SubLObject token_list)
  {
    return makeBoolean( ( Sequences.length( token_list ).numE( FOUR_INTEGER ) && token_list.first().equalp( $str51$truth ) && conses_high.second( token_list ).equalp( $str52$value ) && conses_high.third( token_list )
        .equalp( $str25$_ ) && NIL != conses_high.member( conses_high.fourth( token_list ), $list53, Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) || ( Sequences.length( token_list ).numE( THREE_INTEGER )
            && token_list.first().equalp( $str54$tv ) && conses_high.second( token_list ).equalp( $str25$_ ) && NIL != conses_high.member( conses_high.third( token_list ), $list53, Symbols.symbol_function( EQUALP ),
                UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 21269L)
  public static SubLObject direction_dirP(final SubLObject token_list)
  {
    return makeBoolean( ( Sequences.length( token_list ).numE( THREE_INTEGER ) && NIL != conses_high.member( token_list.first(), $list55, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && conses_high.second(
        token_list ).equalp( $str25$_ ) ) || ( Sequences.length( token_list ).numE( FOUR_INTEGER ) && token_list.first().equalp( $str56$access ) && conses_high.second( token_list ).equalp( $str57$level ) && conses_high
            .third( token_list ).equalp( $str25$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 21691L)
  public static SubLObject probably_non_unaryP(final SubLObject token_list)
  {
    return makeBoolean( Sequences.length( token_list ).numGE( THREE_INTEGER ) && NIL == conses_high.member( token_list.first(), $list58, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && conses_high.second( token_list )
        .equalp( $str25$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 22102L)
  public static SubLObject set_constant(final SubLObject token_list)
  {
    final SubLObject last_token = conses_high.last( token_list, UNPROVIDED ).first();
    final SubLObject constant = ke_utilities.cycl_from_string( last_token );
    final SubLObject default_mt = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw59$DEFAULT_MT );
    if( NIL != constant )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw60$CONSTANT, $kw5$REPLACE, constant );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw0$MT, $kw5$REPLACE, ( NIL != default_mt ) ? default_mt : mt_vars.$default_assert_mt$.getGlobalValue() );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw62$UNKNOWN );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw62$UNKNOWN );
      return constant;
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 22930L)
  public static SubLObject set_mt(final SubLObject token_list)
  {
    final SubLObject last_token = conses_high.last( token_list, UNPROVIDED ).first();
    final SubLObject mt = ke_utilities.cycl_from_string( last_token );
    if( NIL != mt )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw0$MT, $kw5$REPLACE, mt );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw59$DEFAULT_MT, $kw5$REPLACE, NIL );
      return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw0$MT );
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 23429L)
  public static SubLObject set_default_mt(final SubLObject token_list)
  {
    final SubLObject last_token = conses_high.last( token_list, UNPROVIDED ).first();
    final SubLObject mt = ke_utilities.cycl_from_string( last_token );
    if( NIL != mt )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw59$DEFAULT_MT, $kw5$REPLACE, mt );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw0$MT, $kw5$REPLACE, mt );
      return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw59$DEFAULT_MT );
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 23942L)
  public static SubLObject set_tv(final SubLObject token_list)
  {
    final SubLObject tv = conses_high.last( token_list, UNPROVIDED ).first();
    if( NIL != Sequences.find( tv, $list64, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw65$DEFAULT );
    }
    else if( NIL != Sequences.find( tv, $list66, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw67$MONOTONIC );
    }
    else if( NIL != Sequences.find( tv, $list68, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw62$UNKNOWN );
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw62$UNKNOWN );
    }
    return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw61$TV );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 24546L)
  public static SubLObject set_direction(final SubLObject token_list)
  {
    final SubLObject token = conses_high.last( token_list, UNPROVIDED ).first();
    if( NIL != Sequences.find( token, $list69, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw70$FORWARD );
    }
    else if( NIL != Sequences.find( token, $list71, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw72$BACKWARD );
    }
    else if( NIL != Sequences.find( token, $list73, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw74$CODE );
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw62$UNKNOWN );
    }
    return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 25208L)
  public static SubLObject set_mode(final SubLObject token_list)
  {
    final SubLObject token = token_list.first();
    if( token.equalp( $str75$enter ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw76$MODE, $kw5$REPLACE, $kw77$ENTER );
    }
    else if( token.equalp( $str78$delete ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw76$MODE, $kw5$REPLACE, $kw79$DELETE );
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw76$MODE, $kw5$REPLACE, $kw62$UNKNOWN );
    }
    return ke_utilities.ke_value( operation_communication.the_cyclist(), $kw76$MODE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 25574L)
  public static SubLObject set_direction_to_use(final SubLObject expr)
  {
    if( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION ).equal( $kw62$UNKNOWN ) && NIL == list_utilities.cons_tree_find( $const80$equiv, expr, Symbols.symbol_function( EQUAL ), UNPROVIDED )
        && NIL == list_utilities.cons_tree_find( $const81$implies, expr, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return $kw70$FORWARD;
    }
    if( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION ) == $kw70$FORWARD )
    {
      return $kw70$FORWARD;
    }
    if( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION ) == $kw74$CODE )
    {
      return $kw74$CODE;
    }
    return $kw72$BACKWARD;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 25967L)
  public static SubLObject already_in_kbP(final SubLObject expr, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != html_ke_file.$check_for_existing_assertions$.getDynamicValue( thread ) )
    {
      if( NIL == forts.fort_p( mt ) && mt.isCons() )
      {
        mt = narts_high.find_nart( mt );
      }
      if( NIL != forts.fort_p( mt ) )
      {
        thread.resetMultipleValues();
        final SubLObject assertions = fi.sentence_assertions( expr, mt );
        final SubLObject all_present = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean( NIL != assertions && NIL != all_present );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 26370L)
  public static SubLObject handle_el_expr(final SubLObject token_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw76$MODE );
    final SubLObject last_token = conses_high.last( token_list, UNPROVIDED ).first();
    final SubLObject expr = ke_utilities.cycl_from_string( last_token );
    final SubLObject quoted_expr = ConsesLow.list( $sym82$QUOTE, expr );
    final SubLObject default_mt = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw59$DEFAULT_MT );
    final SubLObject mt = ( NIL != default_mt ) ? default_mt : ke_utilities.ke_value( operation_communication.the_cyclist(), $kw0$MT );
    final SubLObject quoted_mt = ConsesLow.list( $sym82$QUOTE, mt );
    final SubLObject tv_to_use = ke_utilities.set_tv_to_use( expr.first() );
    final SubLObject direction_to_use = set_direction_to_use( expr );
    if( NIL != expr )
    {
      final SubLObject pcase_var = mode;
      if( pcase_var.eql( $kw77$ENTER ) )
      {
        if( NIL != already_in_kbP( expr, mt ) )
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw83$ALREADY_IN_KB, $kw84$APPEND, ids_from_sentence( expr, mt ) );
        }
        else
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, ConsesLow.list( $sym86$KE_ASSERT, quoted_expr, quoted_mt, tv_to_use, direction_to_use ) );
        }
      }
      else if( pcase_var.eql( $kw79$DELETE ) )
      {
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
        try
        {
          control_vars.$within_assert$.bind( NIL, thread );
          wff_utilities.$check_arg_typesP$.bind( NIL, thread );
          at_vars.$at_check_arg_typesP$.bind( NIL, thread );
          wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
          wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
          wff_utilities.$check_var_typesP$.bind( NIL, thread );
          czer_vars.$simplify_literalP$.bind( NIL, thread );
          at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
          at_vars.$at_check_arg_formatP$.bind( NIL, thread );
          wff_vars.$validate_constantsP$.bind( NIL, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
          final SubLObject type = source_type( expr, mt );
          final SubLObject form = ( type == $kw9$LOCAL ) ? ConsesLow.list( $sym87$KE_UNASSERT, quoted_expr, quoted_mt )
              : ( ( type == $kw10$REMOTE ) ? ConsesLow.list( $sym88$KE_BLAST, quoted_expr, quoted_mt ) : ConsesLow.list( expr, mt ) );
          if( NIL != subl_promotions.memberP( type, $list89, UNPROVIDED, UNPROVIDED ) )
          {
            ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, form );
          }
          else
          {
            ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw90$NOT_IN_KB, $kw34$CONS, form );
          }
        }
        finally
        {
          system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
          wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
          at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
          at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
          czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
          wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
          wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
          wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
          at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
          wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
          control_vars.$within_assert$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw62$UNKNOWN );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw62$UNKNOWN );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 27905L)
  public static SubLObject non_binary_predicateP(final SubLObject pred)
  {
    return makeBoolean( NIL != fort_types_interface.predicate_p( pred ) && NIL == isa.isa_in_any_mtP( pred, $const91$BinaryPredicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 28039L)
  public static SubLObject handle_probably_non_unary(final SubLObject token_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constant = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw60$CONSTANT );
    final SubLObject mode = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw76$MODE );
    final SubLObject first_token = token_list.first();
    final SubLObject pred = ke_utilities.cycl_from_string( first_token );
    final SubLObject mt = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw0$MT );
    final SubLObject tv_to_use = ke_utilities.set_tv_to_use( pred );
    final SubLObject direction_to_use = set_direction_to_use( pred );
    final SubLObject quoted_mt = ConsesLow.list( $sym82$QUOTE, mt );
    SubLObject cdolist_list_var = conses_high.cddr( token_list );
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_term = ke_utilities.cycl_from_string( string );
      final SubLObject literal = ConsesLow.list( pred, constant, v_term );
      final SubLObject alt_lit = ( NIL != non_binary_predicateP( pred ) ) ? ConsesLow.append( ConsesLow.list( pred, constant ), v_term ) : NIL;
      final SubLObject entry_form = ( NIL != alt_lit ) ? alt_lit : literal;
      final SubLObject quoted_entry_form = ConsesLow.list( $sym82$QUOTE, entry_form );
      if( NIL != pred && NIL != v_term )
      {
        final SubLObject pcase_var = mode;
        if( pcase_var.eql( $kw77$ENTER ) )
        {
          if( NIL != already_in_kbP( entry_form, mt ) )
          {
            ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw83$ALREADY_IN_KB, $kw84$APPEND, ids_from_sentence( entry_form, mt ) );
          }
          else
          {
            ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, ConsesLow.list( $sym86$KE_ASSERT, quoted_entry_form, quoted_mt, tv_to_use, direction_to_use ) );
          }
        }
        else if( pcase_var.eql( $kw79$DELETE ) )
        {
          final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
          final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
          final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
          final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
          final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
          final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
          final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
          final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
          final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
          final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
          try
          {
            control_vars.$within_assert$.bind( NIL, thread );
            wff_utilities.$check_arg_typesP$.bind( NIL, thread );
            at_vars.$at_check_arg_typesP$.bind( NIL, thread );
            wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
            wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
            wff_utilities.$check_var_typesP$.bind( NIL, thread );
            czer_vars.$simplify_literalP$.bind( NIL, thread );
            at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
            at_vars.$at_check_arg_formatP$.bind( NIL, thread );
            wff_vars.$validate_constantsP$.bind( NIL, thread );
            system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
            final SubLObject type = source_type( entry_form, mt );
            final SubLObject form = ( type == $kw9$LOCAL ) ? ConsesLow.list( $sym87$KE_UNASSERT, quoted_entry_form, quoted_mt )
                : ( ( type == $kw10$REMOTE ) ? ConsesLow.list( $sym88$KE_BLAST, quoted_entry_form, quoted_mt ) : ConsesLow.list( entry_form, mt ) );
            if( NIL != subl_promotions.memberP( type, $list89, UNPROVIDED, UNPROVIDED ) )
            {
              ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, form );
            }
            else
            {
              ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw90$NOT_IN_KB, $kw34$CONS, form );
            }
          }
          finally
          {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
            wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
            at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
            at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
            czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
            wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
            wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
            wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
            at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
            wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
            control_vars.$within_assert$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw62$UNKNOWN );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw62$UNKNOWN );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 29989L)
  public static SubLObject handle_probably_unary(final SubLObject token_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constant = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw60$CONSTANT );
    final SubLObject mode = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw76$MODE );
    final SubLObject first_token = token_list.first();
    final SubLObject pred = ke_utilities.cycl_from_string( first_token );
    final SubLObject mt = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw0$MT );
    final SubLObject tv_to_use = ke_utilities.set_tv_to_use( pred );
    final SubLObject direction_to_use = set_direction_to_use( pred );
    final SubLObject quoted_mt = ConsesLow.list( $sym82$QUOTE, mt );
    final SubLObject literal = ConsesLow.list( pred, constant );
    final SubLObject quoted_literal = ConsesLow.list( $sym82$QUOTE, literal );
    if( NIL != pred && NIL != constant )
    {
      final SubLObject pcase_var = mode;
      if( pcase_var.eql( $kw77$ENTER ) )
      {
        if( NIL != already_in_kbP( literal, mt ) )
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw83$ALREADY_IN_KB, $kw84$APPEND, ids_from_sentence( literal, mt ) );
        }
        else
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, ConsesLow.list( $sym86$KE_ASSERT, quoted_literal, quoted_mt, tv_to_use, direction_to_use ) );
        }
      }
      else if( pcase_var.eql( $kw79$DELETE ) )
      {
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
        try
        {
          control_vars.$within_assert$.bind( NIL, thread );
          wff_utilities.$check_arg_typesP$.bind( NIL, thread );
          at_vars.$at_check_arg_typesP$.bind( NIL, thread );
          wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
          wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
          wff_utilities.$check_var_typesP$.bind( NIL, thread );
          czer_vars.$simplify_literalP$.bind( NIL, thread );
          at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
          at_vars.$at_check_arg_formatP$.bind( NIL, thread );
          wff_vars.$validate_constantsP$.bind( NIL, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
          final SubLObject type = source_type( literal, mt );
          final SubLObject form = ( type == $kw9$LOCAL ) ? ConsesLow.list( $sym87$KE_UNASSERT, quoted_literal, quoted_mt )
              : ( ( type == $kw10$REMOTE ) ? ConsesLow.list( $sym88$KE_BLAST, quoted_literal, quoted_mt ) : ConsesLow.list( literal, mt ) );
          if( NIL != subl_promotions.memberP( type, $list89, UNPROVIDED, UNPROVIDED ) )
          {
            ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, form );
          }
          else
          {
            ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw90$NOT_IN_KB, $kw34$CONS, form );
          }
        }
        finally
        {
          system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
          wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
          at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
          at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
          czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
          wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
          wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
          wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
          at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
          wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
          control_vars.$within_assert$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw61$TV, $kw5$REPLACE, $kw62$UNKNOWN );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw63$DIRECTION, $kw5$REPLACE, $kw62$UNKNOWN );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 31626L)
  public static SubLObject handle_rename(final SubLObject token_list)
  {
    final SubLObject constant = ke_utilities.cycl_from_string( conses_high.third( token_list ) );
    final SubLObject new_name = ke_utilities.cycl_from_string( conses_high.fourth( token_list ) );
    if( NIL != constant && NIL != new_name )
    {
      if( NIL != fi.fi_find_int( new_name ) )
      {
        ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw92$ALREADY_CONSTANTS, $kw93$ADJOIN, new_name );
      }
      else
      {
        ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, ConsesLow.list( $sym94$KE_RENAME, constant, new_name ) );
      }
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 32132L)
  public static SubLObject handle_kill(final SubLObject token_list)
  {
    SubLObject cdolist_list_var;
    final SubLObject strings = cdolist_list_var = conses_high.cddr( token_list );
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject obj = ke_utilities.cycl_from_string( string );
      if( NIL != obj )
      {
        if( NIL != misc_kb_utilities.constant_or_natP( obj ) )
        {
          final SubLObject quoted_obj = ConsesLow.list( $sym82$QUOTE, obj );
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw34$CONS, ConsesLow.list( $sym95$KE_KILL, quoted_obj ) );
        }
        else
        {
          ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw96$NOT_VALID_CONSTANTS, $kw34$CONS, string );
        }
      }
      else
      {
        ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 32675L)
  public static SubLObject handle_problem(final SubLObject token_list)
  {
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw34$CONS, token_list );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 32986L)
  public static SubLObject print_list(final SubLObject list_of_objs, final SubLObject stream, SubLObject spacing, SubLObject indent)
  {
    if( spacing == UNPROVIDED )
    {
      spacing = $kw97$SINGLE;
    }
    if( indent == UNPROVIDED )
    {
      indent = ZERO_INTEGER;
    }
    final SubLObject ind_str = Strings.make_string( indent, UNPROVIDED );
    if( spacing == $kw97$SINGLE )
    {
      SubLObject cdolist_list_var = list_of_objs;
      SubLObject obj = NIL;
      obj = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str98$___a_s, ind_str, obj );
        cdolist_list_var = cdolist_list_var.rest();
        obj = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var = list_of_objs;
      SubLObject obj = NIL;
      obj = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str99$_____a_s, ind_str, obj );
        cdolist_list_var = cdolist_list_var.rest();
        obj = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 33358L)
  public static SubLObject build_eval_form_list()
  {
    final SubLObject token_lists = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS );
    clear_ke_state( operation_communication.the_cyclist(), $list100, UNPROVIDED );
    SubLObject cdolist_list_var = token_lists;
    SubLObject tl = NIL;
    tl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dispatch_on_test( tl );
      cdolist_list_var = cdolist_list_var.rest();
      tl = cdolist_list_var.first();
    }
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED, $kw39$REVERSE, UNPROVIDED );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw83$ALREADY_IN_KB, $kw39$REVERSE, UNPROVIDED );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL, $kw39$REVERSE, UNPROVIDED );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw90$NOT_IN_KB, $kw39$REVERSE, UNPROVIDED );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw96$NOT_VALID_CONSTANTS, $kw39$REVERSE, UNPROVIDED );
    ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw92$ALREADY_CONSTANTS, $kw39$REVERSE, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 34187L)
  public static SubLObject print_forms_2(final SubLObject forms, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( NIL != forms )
    {
      PrintLow.format( T, $str101$_________________________________ );
      if( message.isString() )
      {
        PrintLow.format( T, $str102$____ );
        PrintLow.format( T, message );
      }
      SubLObject cdolist_list_var = forms;
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject ass = assertion_handles.find_assertion_by_id( x );
        final SubLObject cycl = misc_kb_utilities.make_lispy_form( ass );
        final SubLObject mt = assertions_high.assertion_mt( ass );
        PrintLow.format( T, $str103$_______s_in__s, cycl, mt );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 34604L)
  public static SubLObject print_forms_3(final SubLObject forms, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( NIL != forms )
    {
      PrintLow.format( T, $str101$_________________________________ );
      if( message.isString() )
      {
        PrintLow.format( T, $str102$____ );
        PrintLow.format( T, message );
      }
      SubLObject cdolist_list_var = forms;
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( T, $str104$_______s_is_not_in__s, x.first(), conses_high.second( x ) );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 34939L)
  public static SubLObject print_forms_1(final SubLObject forms, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( NIL != forms )
    {
      PrintLow.format( T, $str101$_________________________________ );
      if( message.isString() )
      {
        PrintLow.format( T, $str102$____ );
        PrintLow.format( T, message );
      }
      PrintLow.format( T, $str32$__ );
      print_list( forms, T, $kw97$SINGLE, TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 35236L)
  public static SubLObject present_forms_to_eval(final SubLObject forms_to_eval)
  {
    if( NIL != forms_to_eval )
    {
      PrintLow.format( T, $str101$_________________________________ );
      final SubLObject len = Sequences.length( forms_to_eval );
      PrintLow.format( T, $str105$____New_forms_to_evaluate_ );
      print_list( forms_to_eval, T, $kw106$DOUBLE, TWO_INTEGER );
      if( NIL != ( len.numE( ONE_INTEGER ) ? UserIO.user_confirm( $str107$__Evaluate_the_form_above_now__ ) : UserIO.user_confirm( PrintLow.format( NIL, $str108$__Evaluate_the__s_forms_above_now, len ) ) ) )
      {
        SubLObject cdolist_list_var = forms_to_eval;
        SubLObject f = NIL;
        f = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Eval.eval( f );
          cdolist_list_var = cdolist_list_var.rest();
          f = cdolist_list_var.first();
        }
        if( len.numE( ONE_INTEGER ) )
        {
          PrintLow.format( T, $str109$__One_form_evaluated_ );
        }
        else
        {
          PrintLow.format( T, $str110$___s_forms_evaluated_, len );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 35839L)
  public static SubLObject maybe_eval_forms()
  {
    final SubLObject malformed = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED );
    final SubLObject forms_to_eval = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw85$FORMS_TO_EVAL );
    final SubLObject already_in_kb = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw83$ALREADY_IN_KB );
    final SubLObject not_in_kb = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw90$NOT_IN_KB );
    final SubLObject not_valid_constants = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw96$NOT_VALID_CONSTANTS );
    final SubLObject already_constants = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw92$ALREADY_CONSTANTS );
    if( NIL != malformed )
    {
      PrintLow.format( T, $str111$____Please_check_the_input_file__ );
      print_list( malformed, T, $kw106$DOUBLE, TWO_INTEGER );
    }
    else
    {
      print_forms_2( already_in_kb, $str112$These_assertions_are_already_in_t );
      print_forms_3( not_in_kb, $str113$These_assertions_are_not_in_the_K );
      print_forms_1( not_valid_constants, $str114$These_strings_are_not_names_of_va );
      print_forms_1( already_constants, $str115$These_strings_are_already_the_nam );
      present_forms_to_eval( forms_to_eval );
    }
    graceful_quit();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 36945L)
  public static SubLObject graceful_quit()
  {
    PrintLow.format( T, $str116$____Returning_to_Lisp_Interactor_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 37042L)
  public static SubLObject unknown_constants_in_listP(final SubLObject list)
  {
    if( NIL == list )
    {
      return NIL;
    }
    if( NIL == fi.fi_find_int( list.first() ) )
    {
      return T;
    }
    return unknown_constants_in_listP( list.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 37264L)
  public static SubLObject check_and_poll()
  {
    final SubLObject unknowns = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw117$UNKNOWNS );
    if( NIL == unknown_constants_in_listP( unknowns ) )
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw117$UNKNOWNS, UNPROVIDED, UNPROVIDED );
      return T;
    }
    if( NIL != UserIO.user_confirm( $str118$____Waiting_for_create_operations ) )
    {
      return check_and_poll();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 37637L)
  public static SubLObject check_and_maybe_eval(final SubLObject file)
  {
    final SubLObject malformed = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw33$MALFORMED );
    final SubLObject ok = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw35$OK_TOKEN_FORMS );
    if( NIL == malformed && NIL == ok )
    {
      PrintLow.format( T, $str119$____Problem_loading_file__s_, file );
      PrintLow.format( T, $str120$____The_file_contains_fatal_synta );
      graceful_quit();
    }
    else if( NIL != malformed )
    {
      PrintLow.format( T, $str121$____Please_check_the_input_file_f );
      print_list( malformed, T, $kw106$DOUBLE, TWO_INTEGER );
      graceful_quit();
    }
    else if( NIL != ok )
    {
      final SubLObject unknowns = unknown_constants_among_tokens( ok );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw117$UNKNOWNS, $kw5$REPLACE, unknowns );
      if( NIL != unknowns )
      {
        PrintLow.format( T, $str122$____Unknown_constants__or_constan );
        print_list( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw117$UNKNOWNS ), T, $kw97$SINGLE, TWO_INTEGER );
        if( NIL != UserIO.user_confirm( $str123$____Make_Cyc_constants_of_the_str ) )
        {
          PrintLow.format( T, $str124$__OK___Be_sure_to_give_new_consta );
          ke_utilities.constantify( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw117$UNKNOWNS ) );
          if( NIL != check_and_poll() )
          {
            build_eval_form_list();
            maybe_eval_forms();
          }
        }
        else
        {
          graceful_quit();
        }
      }
      else
      {
        build_eval_form_list();
        maybe_eval_forms();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 39058L)
  public static SubLObject ke_file(final SubLObject cyclist, final SubLObject file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_cyclist = operation_communication.the_cyclist();
    try
    {
      operation_communication.set_the_cyclist( cyclist.isString() ? fi.fi_find_int( cyclist ) : cyclist );
      SubLObject v_boolean = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym21$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const22$EverythingPSC, thread );
        v_boolean = kb_accessors.human_cyclistP( operation_communication.the_cyclist() );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != operation_communication.the_cyclist() && NIL != v_boolean )
      {
        ke_init( operation_communication.the_cyclist() );
        SubLObject stream = NIL;
        try
        {
          stream = compatibility.open_text( file, $kw125$INPUT );
          if( !stream.isStream() )
          {
            Errors.error( $str126$Unable_to_open__S, file );
          }
          final SubLObject str = stream;
          tokenize_read( str, T );
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream.isStream() )
            {
              streams_high.close( stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
        check_and_maybe_eval( file );
      }
      else
      {
        PrintLow.format( T, $str127$__Sorry___s_is_not_known_to_be_a_, cyclist );
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        operation_communication.set_the_cyclist( old_cyclist );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return NIL;
  }

  public static SubLObject declare_ke_file_file()
  {
    SubLFiles.declareFunction( me, "make_ke_state_vector", "MAKE-KE-STATE-VECTOR", 0, 0, false );
    SubLFiles.declareFunction( me, "get_ke_state", "GET-KE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_ke_vector", "ADD-KE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_ke_state", "RESET-KE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "return_ke_state", "RETURN-KE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "print_ke_state", "PRINT-KE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ke_state", "CLEAR-KE-STATE", 1, 2, false );
    SubLFiles.declareFunction( me, "blast_ke_state", "BLAST-KE-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "ke_init", "KE-INIT", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_set_dispatch_table", "KE-SET-DISPATCH-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "dispatch_on_test", "DISPATCH-ON-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "ids_from_sentence", "IDS-FROM-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "source_type", "SOURCE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_out_ok_constants", "FILTER-OUT-OK-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "except_ke_chars", "EXCEPT-KE-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_unknown_constants", "GET-UNKNOWN-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "frob_comments", "FROB-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "count_tokens", "COUNT-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "lpP", "LP?", 1, 0, false );
    SubLFiles.declareFunction( me, "rpP", "RP?", 1, 0, false );
    SubLFiles.declareFunction( me, "spaceP", "SPACE?", 1, 0, false );
    SubLFiles.declareFunction( me, "lbrP", "LBR?", 1, 0, false );
    SubLFiles.declareFunction( me, "tabP", "TAB?", 1, 0, false );
    SubLFiles.declareFunction( me, "dquoteP", "DQUOTE?", 1, 0, false );
    SubLFiles.declareFunction( me, "periodP", "PERIOD?", 1, 0, false );
    SubLFiles.declareFunction( me, "semiP", "SEMI?", 1, 0, false );
    SubLFiles.declareFunction( me, "colonP", "COLON?", 1, 0, false );
    SubLFiles.declareFunction( me, "dol_signP", "DOL-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "whitespace_char_p", "WHITESPACE-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_file_tokenize_string", "KE-FILE-TOKENIZE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_read_from_stream", "KE-READ-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_input_from_string", "KE-INPUT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nested_parens_in_stringP", "NESTED-PARENS-IN-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "unary_predicateP", "UNARY-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_unary_predicateP", "NON-UNARY-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "malformedP", "MALFORMED?", 1, 0, false );
    SubLFiles.declareFunction( me, "tokenize_read", "TOKENIZE-READ", 1, 1, false );
    SubLFiles.declareFunction( me, "unknown_constants_among_tokens", "UNKNOWN-CONSTANTS-AMONG-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "give_upP", "GIVE-UP?", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_dirP", "CONSTANT-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_dirP", "RENAME-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "mode_dirP", "MODE-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "probably_unaryP", "PROBABLY-UNARY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_dirP", "KILL-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_dirP", "MT-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "default_mt_dirP", "DEFAULT-MT-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_dirP", "EL-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "tv_dirP", "TV-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "direction_dirP", "DIRECTION-DIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "probably_non_unaryP", "PROBABLY-NON-UNARY?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_constant", "SET-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_mt", "SET-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_default_mt", "SET-DEFAULT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tv", "SET-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "set_direction", "SET-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_mode", "SET-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_direction_to_use", "SET-DIRECTION-TO-USE", 1, 0, false );
    SubLFiles.declareFunction( me, "already_in_kbP", "ALREADY-IN-KB?", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_el_expr", "HANDLE-EL-EXPR", 1, 0, false );
    SubLFiles.declareFunction( me, "non_binary_predicateP", "NON-BINARY-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_probably_non_unary", "HANDLE-PROBABLY-NON-UNARY", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_probably_unary", "HANDLE-PROBABLY-UNARY", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_rename", "HANDLE-RENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_kill", "HANDLE-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_problem", "HANDLE-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "print_list", "PRINT-LIST", 2, 2, false );
    SubLFiles.declareFunction( me, "build_eval_form_list", "BUILD-EVAL-FORM-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "print_forms_2", "PRINT-FORMS-2", 1, 1, false );
    SubLFiles.declareFunction( me, "print_forms_3", "PRINT-FORMS-3", 1, 1, false );
    SubLFiles.declareFunction( me, "print_forms_1", "PRINT-FORMS-1", 1, 1, false );
    SubLFiles.declareFunction( me, "present_forms_to_eval", "PRESENT-FORMS-TO-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_eval_forms", "MAYBE-EVAL-FORMS", 0, 0, false );
    SubLFiles.declareFunction( me, "graceful_quit", "GRACEFUL-QUIT", 0, 0, false );
    SubLFiles.declareFunction( me, "unknown_constants_in_listP", "UNKNOWN-CONSTANTS-IN-LIST?", 1, 0, false );
    SubLFiles.declareFunction( me, "check_and_poll", "CHECK-AND-POLL", 0, 0, false );
    SubLFiles.declareFunction( me, "check_and_maybe_eval", "CHECK-AND-MAYBE-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_file", "KE-FILE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_ke_file_file()
  {
    $ke_action_dispatch_table$ = SubLFiles.defparameter( "*KE-ACTION-DISPATCH-TABLE*", NIL );
    $ke_state_defaults$ = SubLFiles.defparameter( "*KE-STATE-DEFAULTS*", reader.bq_cons( reader.bq_cons( $kw0$MT, mt_vars.$default_assert_mt$.getGlobalValue() ), $list1 ) );
    $ke_file_reserved_words$ = SubLFiles.defparameter( "*KE-FILE-RESERVED-WORDS*", $list2 );
    return NIL;
  }

  public static SubLObject setup_ke_file_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ke_file_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ke_file_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ke_file_file();
  }
  static
  {
    me = new ke_file();
    $ke_action_dispatch_table$ = null;
    $ke_state_defaults$ = null;
    $ke_file_reserved_words$ = null;
    $kw0$MT = makeKeyword( "MT" );
    $list1 = ConsesLow.list( ConsesLow.cons( makeKeyword( "TV" ), makeKeyword( "UNKNOWN" ) ), ConsesLow.cons( makeKeyword( "DIRECTION" ), makeKeyword( "UNKNOWN" ) ), ConsesLow.cons( makeKeyword( "MODE" ), makeKeyword(
        "ENTER" ) ), ConsesLow.cons( makeKeyword( "APPLICATION" ), makeKeyword( "KE-FILE" ) ) );
    $list2 = ConsesLow.list( new SubLObject[] { makeString( "EL" ), makeString( "F" ), makeString( "nil" ), makeString( "t" ), makeString( "Unit" ), makeString( "Constant" ), makeString( "Access" ), makeString(
        "Level" ), makeString( "AL" ), makeString( "Direction" ), makeString( "D" ), makeString( "In" ), makeString( "Mt" ), makeString( "forward" ), makeString( ":forward" ), makeString( "backward" ), makeString(
            ":backward" ), makeString( "code" ), makeString( ":code" ), makeString( "default" ), makeString( ":default" ), makeString( "monotonic" ), makeString( ":monotonic" ), makeString( "unknown" ), makeString(
                ":unknown" ), makeString( "TV" ), makeString( "Truth" ), makeString( "Value" ), makeString( "enter" ), makeString( "delete" ), makeString( "rename" ), makeString( "kill" )
    } );
    $sym3$CAR = makeSymbol( "CAR" );
    $list4 = ConsesLow.list( makeKeyword( "COMPOSE-HISTORY" ) );
    $kw5$REPLACE = makeKeyword( "REPLACE" );
    $str6$___s____s = makeString( "~%~s : ~s" );
    $list7 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeSymbol( "CONSTANT-DIR?" ), makeSymbol( "SET-CONSTANT" ) ), ConsesLow.cons( makeSymbol( "MT-DIR?" ), makeSymbol( "SET-MT" ) ), ConsesLow.cons(
        makeSymbol( "DEFAULT-MT-DIR?" ), makeSymbol( "SET-DEFAULT-MT" ) ), ConsesLow.cons( makeSymbol( "EL-DIR?" ), makeSymbol( "HANDLE-EL-EXPR" ) ), ConsesLow.cons( makeSymbol( "TV-DIR?" ), makeSymbol( "SET-TV" ) ),
      ConsesLow.cons( makeSymbol( "DIRECTION-DIR?" ), makeSymbol( "SET-DIRECTION" ) ), ConsesLow.cons( makeSymbol( "MODE-DIR?" ), makeSymbol( "SET-MODE" ) ), ConsesLow.cons( makeSymbol( "RENAME-DIR?" ), makeSymbol(
          "HANDLE-RENAME" ) ), ConsesLow.cons( makeSymbol( "KILL-DIR?" ), makeSymbol( "HANDLE-KILL" ) ), ConsesLow.cons( makeSymbol( "PROBABLY-UNARY?" ), makeSymbol( "HANDLE-PROBABLY-UNARY" ) ), ConsesLow.cons(
              makeSymbol( "PROBABLY-NON-UNARY?" ), makeSymbol( "HANDLE-PROBABLY-NON-UNARY" ) ), ConsesLow.cons( makeSymbol( "GIVE-UP?" ), makeSymbol( "HANDLE-PROBLEM" ) )
    } );
    $sym8$ASSERTION_ID = makeSymbol( "ASSERTION-ID" );
    $kw9$LOCAL = makeKeyword( "LOCAL" );
    $kw10$REMOTE = makeKeyword( "REMOTE" );
    $str11$_____ = makeString( " #$()" );
    $sym12$EXCEPT_KE_CHARS = makeSymbol( "EXCEPT-KE-CHARS" );
    $list13 = ConsesLow.list( Characters.CHAR_colon, Characters.CHAR_quote, Characters.CHAR_quotation, Characters.CHAR_period );
    $str14$_ = makeString( ";" );
    $list15 = ConsesLow.list( TEN_INTEGER, THIRTEEN_INTEGER );
    $list16 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_tab );
    $list17 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_tab, Characters.CHAR_period );
    $kw18$EOF = makeKeyword( "EOF" );
    $list19 = ConsesLow.list( Characters.CHAR_space );
    $sym20$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym21$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const22$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const23$UnaryPredicate = constant_handles.reader_make_constant_shell( makeString( "UnaryPredicate" ) );
    $const24$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $str25$_ = makeString( ":" );
    $list26 = ConsesLow.list( makeString( "rename" ), makeString( ":rename" ) );
    $str27$_ = makeString( "\"" );
    $list28 = ConsesLow.list( makeString( "enter" ), makeString( "delete" ) );
    $list29 = ConsesLow.list( makeString( "EL" ), makeString( "F" ) );
    $list30 = ConsesLow.list( makeString( "(implies " ), makeString( "(and " ), makeString( "(thereExist" ), makeString( "(or " ) );
    $list31 = ConsesLow.list( makeString( "EL" ), makeString( "F" ), makeString( "english" ), makeString( "comment" ), makeString( "future" ), makeString( "cyclistNotes" ), makeString( "ist" ), makeString(
        "informStatement" ) );
    $str32$__ = makeString( "~%" );
    $kw33$MALFORMED = makeKeyword( "MALFORMED" );
    $kw34$CONS = makeKeyword( "CONS" );
    $kw35$OK_TOKEN_FORMS = makeKeyword( "OK-TOKEN-FORMS" );
    $str36$___s_token_strings_loaded_ = makeString( "~%~s token strings loaded." );
    $str37$___s_token_strings_processed_ = makeString( "~%~s token strings processed." );
    $str38$_____s_is_not_a_stream_or_a_strin = makeString( "~%~%~s is not a stream or a string." );
    $kw39$REVERSE = makeKeyword( "REVERSE" );
    $str40$____Processing_token_strings____ = makeString( "~%~%Processing token strings ..." );
    $sym41$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $str42$__Malformed_token_list___s = makeString( "~%Malformed token list: ~s" );
    $list43 = ConsesLow.list( makeString( "unit" ), makeString( "constant" ) );
    $list44 = ConsesLow.list( makeString( "rename" ) );
    $list45 = ConsesLow.list( makeString( "delete" ), makeString( "enter" ) );
    $list46 = ConsesLow.list( makeString( "kill" ) );
    $str47$in = makeString( "in" );
    $str48$mt = makeString( "mt" );
    $str49$default = makeString( "default" );
    $list50 = ConsesLow.list( makeString( "el" ), makeString( "f" ) );
    $str51$truth = makeString( "truth" );
    $str52$value = makeString( "value" );
    $list53 = ConsesLow.list( makeString( ":default" ), makeString( "default" ), makeString( ":monotonic" ), makeString( "monotonic" ), makeString( ":unknown" ), makeString( "unknown" ) );
    $str54$tv = makeString( "tv" );
    $list55 = ConsesLow.list( makeString( "al" ), makeString( "direction" ), makeString( "d" ) );
    $str56$access = makeString( "access" );
    $str57$level = makeString( "level" );
    $list58 = ConsesLow.list( new SubLObject[] { makeString( "unit" ), makeString( "in" ), makeString( "el" ), makeString( "f" ), makeString( "access" ), makeString( "al" ), makeString( "constant" ), makeString( "d" ),
      makeString( "direction" ), makeString( "tv" ), makeString( "truth" ), makeString( "enter" ), makeString( "delete" ), makeString( "kill" ), makeString( "rename" )
    } );
    $kw59$DEFAULT_MT = makeKeyword( "DEFAULT-MT" );
    $kw60$CONSTANT = makeKeyword( "CONSTANT" );
    $kw61$TV = makeKeyword( "TV" );
    $kw62$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw63$DIRECTION = makeKeyword( "DIRECTION" );
    $list64 = ConsesLow.list( makeString( ":default" ), makeString( "default" ) );
    $kw65$DEFAULT = makeKeyword( "DEFAULT" );
    $list66 = ConsesLow.list( makeString( ":monotonic" ), makeString( "monotonic" ) );
    $kw67$MONOTONIC = makeKeyword( "MONOTONIC" );
    $list68 = ConsesLow.list( makeString( ":unknown" ), makeString( "unknown" ) );
    $list69 = ConsesLow.list( makeString( ":forward" ), makeString( "forward" ), makeString( "0" ) );
    $kw70$FORWARD = makeKeyword( "FORWARD" );
    $list71 = ConsesLow.list( makeString( ":backward" ), makeString( "backward" ), makeString( "4" ) );
    $kw72$BACKWARD = makeKeyword( "BACKWARD" );
    $list73 = ConsesLow.list( makeString( ":code" ), makeString( "code" ) );
    $kw74$CODE = makeKeyword( "CODE" );
    $str75$enter = makeString( "enter" );
    $kw76$MODE = makeKeyword( "MODE" );
    $kw77$ENTER = makeKeyword( "ENTER" );
    $str78$delete = makeString( "delete" );
    $kw79$DELETE = makeKeyword( "DELETE" );
    $const80$equiv = constant_handles.reader_make_constant_shell( makeString( "equiv" ) );
    $const81$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $sym82$QUOTE = makeSymbol( "QUOTE" );
    $kw83$ALREADY_IN_KB = makeKeyword( "ALREADY-IN-KB" );
    $kw84$APPEND = makeKeyword( "APPEND" );
    $kw85$FORMS_TO_EVAL = makeKeyword( "FORMS-TO-EVAL" );
    $sym86$KE_ASSERT = makeSymbol( "KE-ASSERT" );
    $sym87$KE_UNASSERT = makeSymbol( "KE-UNASSERT" );
    $sym88$KE_BLAST = makeSymbol( "KE-BLAST" );
    $list89 = ConsesLow.list( makeKeyword( "LOCAL" ), makeKeyword( "REMOTE" ) );
    $kw90$NOT_IN_KB = makeKeyword( "NOT-IN-KB" );
    $const91$BinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) );
    $kw92$ALREADY_CONSTANTS = makeKeyword( "ALREADY-CONSTANTS" );
    $kw93$ADJOIN = makeKeyword( "ADJOIN" );
    $sym94$KE_RENAME = makeSymbol( "KE-RENAME" );
    $sym95$KE_KILL = makeSymbol( "KE-KILL" );
    $kw96$NOT_VALID_CONSTANTS = makeKeyword( "NOT-VALID-CONSTANTS" );
    $kw97$SINGLE = makeKeyword( "SINGLE" );
    $str98$___a_s = makeString( "~%~a~s" );
    $str99$_____a_s = makeString( "~%~%~a~s" );
    $list100 = ConsesLow.list( makeKeyword( "ALREADY-IN-KB" ), makeKeyword( "MALFORMED" ), makeKeyword( "FORMS-TO-EVAL" ), makeKeyword( "NOT-IN-KB" ), makeKeyword( "NOT-VALID-CONSTANTS" ), makeKeyword(
        "ALREADY-CONSTANTS" ) );
    $str101$_________________________________ = makeString( "~%~%-------------------------------------------------------" );
    $str102$____ = makeString( "~%~%" );
    $str103$_______s_in__s = makeString( "~%~%  ~s in ~s" );
    $str104$_______s_is_not_in__s = makeString( "~%~%  ~s is not in ~s" );
    $str105$____New_forms_to_evaluate_ = makeString( "~%~%New forms to evaluate:" );
    $kw106$DOUBLE = makeKeyword( "DOUBLE" );
    $str107$__Evaluate_the_form_above_now__ = makeString( "~%Evaluate the form above now? " );
    $str108$__Evaluate_the__s_forms_above_now = makeString( "~%Evaluate the ~s forms above now? " );
    $str109$__One_form_evaluated_ = makeString( "~%One form evaluated." );
    $str110$___s_forms_evaluated_ = makeString( "~%~s forms evaluated." );
    $str111$____Please_check_the_input_file__ = makeString( "~%~%Please check the input file.~%Some expressions cannot be coerced into CycL.~%Some of these token lists may be malformed:" );
    $str112$These_assertions_are_already_in_t = makeString( "These assertions are already in the KB:" );
    $str113$These_assertions_are_not_in_the_K = makeString( "These assertions are not in the KB.~%They cannot be deleted:" );
    $str114$These_strings_are_not_names_of_va = makeString( "These strings are not names of valid constants.~%They cannot be killed:" );
    $str115$These_strings_are_already_the_nam = makeString( "These strings are already the names of constants.~%They cannot be used for renaming:" );
    $str116$____Returning_to_Lisp_Interactor_ = makeString( "~%~%Returning to Lisp Interactor." );
    $kw117$UNKNOWNS = makeKeyword( "UNKNOWNS" );
    $str118$____Waiting_for_create_operations = makeString( "~%~%Waiting for create operations to be processed...~%Do you want to try to continue now? " );
    $str119$____Problem_loading_file__s_ = makeString( "~%~%Problem loading file ~s." );
    $str120$____The_file_contains_fatal_synta = makeString( "~%~%The file contains fatal syntax errors, or~%cannot be located by the pathname given." );
    $str121$____Please_check_the_input_file_f = makeString( "~%~%Please check the input file for missing parens or periods,~%wrong number of arguments, etc.~%~%These token lists are malformed:" );
    $str122$____Unknown_constants__or_constan = makeString( "~%~%Unknown constants, or constants missing ids:~%" );
    $str123$____Make_Cyc_constants_of_the_str = makeString( "~%~%Make Cyc constants of the strings listed above? " );
    $str124$__OK___Be_sure_to_give_new_consta = makeString( "~%OK.  Be sure to give new constants an #$isa.~%Be sure to give new collections a #$genls.~%Be sure to give new microtheories a #$genlMt." );
    $kw125$INPUT = makeKeyword( "INPUT" );
    $str126$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str127$__Sorry___s_is_not_known_to_be_a_ = makeString( "~%Sorry, ~s is not known to be a Cyclist." );
  }
}
/*
 * 
 * Total time: 525 ms
 * 
 */